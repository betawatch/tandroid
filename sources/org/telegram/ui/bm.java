package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bm extends org.telegram.ui.Components.bk0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final ArrayList I;
    public boolean J;
    public boolean K;
    public final ArrayList L;
    public final /* synthetic */ qn M;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public bm(qn qnVar, Context context) {
        this.M = qnVar;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.s = -5;
        this.v = -5;
        this.w = -5;
        this.x = -5;
        this.y = -5;
        this.A = -5;
        this.B = -5;
        this.C = -5;
        this.D = -5;
        this.E = -5;
        this.I = new ArrayList();
        this.L = new ArrayList();
        this.h = context;
        TLRPC.User user = qnVar.f;
        this.n = user != null && user.bot;
        C(true);
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    public final void K(boolean z10) {
        qn qnVar = this.M;
        if (UserObject.isBotForum(qnVar.f)) {
            if (z10) {
                qnVar.jc = true;
            }
            if (this.E < 0 || N()) {
                return;
            }
            super.u(this.E);
            S();
        }
    }

    public final ArrayList L() {
        return this.H ? this.I : this.J ? this.L : this.M.q6;
    }

    public final void M(MessageObject messageObject) {
        qn qnVar = this.M;
        int childCount = qnVar.t0.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = qnVar.t0.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                if (t1Var.getMessageObject() == messageObject) {
                    t1Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean N() {
        qn qnVar = this.M;
        return UserObject.isBotForumWithEditableTopics(qnVar.f) && qnVar.b() == 0 && !qnVar.jc && qnVar.N3 == 0;
    }

    public final void O(boolean z10) {
        boolean z11;
        qn qnVar = this.M;
        ArrayList arrayList = qnVar.q6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + qnVar.K5);
        }
        if (z10 && qnVar.K5) {
            f2.w0 itemAnimator = qnVar.t0.getItemAnimator();
            kj kjVar = qnVar.u0;
            if (itemAnimator != kjVar) {
                qnVar.t0.setItemAnimator(kjVar);
            }
        } else {
            qnVar.t0.setItemAnimator(null);
        }
        S();
        try {
            super.l();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(size);
            if (messageObject.isDateObject) {
                size--;
            } else {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                        z11 = true;
                    }
                }
            }
        }
        z11 = false;
        boolean[] zArr = qnVar.y6;
        if ((zArr[0] && (qnVar.H6 == 0 || zArr[1])) || z11) {
            qnVar.L6(((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow);
        }
    }

    public final void P(int i9, boolean z10) {
        MessageObject messageObject;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i9);
            j3.r0.x(z10 ? " with thanos effect" : "", sb2);
        }
        qn qnVar = this.M;
        if (((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow) {
            f2.w0 itemAnimator = qnVar.t0.getItemAnimator();
            kj kjVar = qnVar.u0;
            if (itemAnimator != kjVar) {
                qnVar.t0.setItemAnimator(kjVar);
            }
        } else {
            qnVar.t0.setItemAnimator(null);
        }
        if (z10 && qnVar.u0 != null) {
            f2.w0 itemAnimator2 = qnVar.t0.getItemAnimator();
            kj kjVar2 = qnVar.u0;
            if (itemAnimator2 == kjVar2) {
                f2.q1 K = qnVar.t0.K(i9);
                if (K == null) {
                    kjVar2.getClass();
                } else {
                    kjVar2.S.add(K);
                    View view = K.a;
                    if ((view instanceof org.telegram.ui.Cells.t1) && (messageObject = ((org.telegram.ui.Cells.t1) view).getMessageObject()) != null) {
                        messageObject.deletedByThanos = true;
                    }
                }
            }
        }
        S();
        try {
            super.u(i9);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void Q(int i9) {
        int i10;
        qn qnVar = this.M;
        ArrayList arrayList = qnVar.q6;
        if (qnVar.v0 == null || this.H || this.J) {
            return;
        }
        int i11 = 0;
        if (!qnVar.z4 && qnVar.F7 != null) {
            int childCount = qnVar.t0.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = qnVar.t0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                    MessageObject messageObject2 = qnVar.F7;
                    if (messageObject == messageObject2) {
                        if (arrayList.indexOf(messageObject2) >= 0) {
                            i10 = arrayList.indexOf(qnVar.F7) + this.F;
                            i11 = qnVar.L8(childAt);
                        }
                    }
                }
                i12++;
            }
        }
        i10 = -1;
        m(i9);
        if (i10 != -1) {
            qnVar.v0.h1(i10, i11);
        }
    }

    public final org.telegram.ui.Cells.t1 R(MessageObject messageObject, boolean z10, boolean z11) {
        qn qnVar = this.M;
        if (z10) {
            int childCount = qnVar.t0.getChildCount();
            int i9 = 0;
            while (i9 < childCount) {
                View childAt = qnVar.t0.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject() == messageObject && TextUtils.equals(t1Var.b7, t1Var.u7.messageOwner.post_author)) {
                        t1Var.X3(messageObject, t1Var.getCurrentMessagesGroup(), t1Var.m3(), t1Var.n3(), t1Var.h3(), t1Var.j3());
                        return t1Var;
                    }
                }
                i9++;
                messageObject = messageObject;
            }
        }
        MessageObject messageObject2 = messageObject;
        int indexOf = (this.H ? this.I : this.J ? this.L : qnVar.q6).indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (!z11) {
            Q(this.F + indexOf);
            return null;
        }
        int i10 = qn.Fc;
        qn.Fc = i10 + 1;
        messageObject2.stableId = i10;
        O(true);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S() {
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.User user3;
        int i9;
        TLRPC.PeerSettings peerSettings;
        TLRPC.PeerSettings peerSettings2;
        int i10;
        int i11;
        qn qnVar = this.M;
        boolean[] zArr = qnVar.y6;
        this.r = 0;
        ArrayList arrayList = this.H ? this.I : this.J ? this.L : qnVar.q6;
        if (qnVar.N3 == 3 && qnVar.Ka) {
            this.r = 1;
            this.s = 0;
        } else {
            this.s = -5;
        }
        this.v = -5;
        this.w = -5;
        this.y = -5;
        this.C = -5;
        this.D = -5;
        this.E = -5;
        if (N()) {
            int i12 = this.r;
            this.r = i12 + 1;
            this.E = i12;
        }
        if (arrayList.isEmpty()) {
            this.A = -5;
            this.B = -5;
            this.F = 0;
            this.G = 0;
            TLRPC.User user4 = qnVar.f;
            if (user4 != null && !UserObject.isBot(user4) && !UserObject.isReplyUser(qnVar.f)) {
                TLRPC.PeerSettings peerSettings3 = qnVar.getMessagesController().getPeerSettings(qnVar.f.id);
                int i13 = org.telegram.ui.Cells.xa.K;
                if (peerSettings3 != null && ((peerSettings3.phone_country != null || peerSettings3.registration_month != null) && !MessagesController.isSupportUser(qnVar.f) && qnVar.N3 == 0)) {
                    int i14 = this.r;
                    this.r = i14 + 1;
                    this.y = i14;
                    return;
                }
            }
            if (UserObject.isReplyUser(qnVar.f) || ((user = qnVar.f) != null && user.bot && !MessagesController.isSupportUser(user) && qnVar.N3 == 0)) {
                int i15 = this.r;
                this.r = i15 + 1;
                this.w = i15;
                return;
            }
            return;
        }
        if (!this.J) {
            boolean[] zArr2 = qnVar.A6;
            if ((!zArr2[0] || (qnVar.H6 != 0 && !zArr2[1])) && !qnVar.B6) {
                int i16 = this.r;
                this.r = i16 + 1;
                this.B = i16;
                int i17 = this.r;
                this.F = i17;
                int size = arrayList.size() + i17;
                this.r = size;
                this.G = size;
                user2 = qnVar.f;
                if (user2 != null && !UserObject.isBot(user2) && !UserObject.isReplyUser(qnVar.f)) {
                    peerSettings = qnVar.getMessagesController().getPeerSettings(qnVar.f.id);
                    int i18 = org.telegram.ui.Cells.xa.K;
                    if (peerSettings != null && ((peerSettings.phone_country != null || peerSettings.registration_month != null) && !MessagesController.isSupportUser(qnVar.f) && qnVar.N3 == 0 && zArr[0])) {
                        peerSettings2 = qnVar.getMessagesController().getPeerSettings(qnVar.f.id);
                        i10 = peerSettings2.name_change_date;
                        if (i10 != 0 || (i11 = peerSettings2.photo_change_date) == 0) {
                            if (i10 != 0) {
                                int i19 = this.r;
                                this.r = i19 + 1;
                                this.D = i19;
                            }
                            if (peerSettings2.photo_change_date != 0) {
                                int i20 = this.r;
                                this.r = i20 + 1;
                                this.C = i20;
                            }
                        } else if (i10 < i11) {
                            int i21 = this.r;
                            this.D = i21;
                            this.r = i21 + 2;
                            this.C = i21 + 1;
                        } else {
                            int i22 = this.r;
                            this.C = i22;
                            this.r = i22 + 2;
                            this.D = i22 + 1;
                        }
                        int i23 = this.r;
                        this.r = i23 + 1;
                        this.y = i23;
                        i9 = qnVar.N3;
                        if (i9 == 9) {
                            int i24 = this.r;
                            this.s = i24;
                            this.r = i24 + 2;
                            this.v = i24 + 1;
                        }
                        if (i9 == 5 && !pf.r1.g(qnVar.M3)) {
                            int i25 = this.r;
                            this.r = i25 + 1;
                            this.s = i25;
                        }
                        if (this.J ? !(!(zArr[0] && (qnVar.H6 == 0 || zArr[1])) && (AndroidUtilities.isTablet() || qnVar.c4 || qnVar.f != null)) : this.K) {
                            this.A = -5;
                            return;
                        }
                        int i26 = this.r;
                        this.r = i26 + 1;
                        this.A = i26;
                        return;
                    }
                }
                if ((!UserObject.isReplyUser(qnVar.f) || ((user3 = qnVar.f) != null && user3.bot && !MessagesController.isSupportUser(user3) && qnVar.N3 == 0)) && zArr[0]) {
                    int i27 = this.r;
                    this.r = i27 + 1;
                    this.w = i27;
                }
                i9 = qnVar.N3;
                if (i9 == 9) {
                }
                if (i9 == 5) {
                    int i252 = this.r;
                    this.r = i252 + 1;
                    this.s = i252;
                }
                if (this.J) {
                    int i262 = this.r;
                    this.r = i262 + 1;
                    this.A = i262;
                    return;
                } else {
                    int i2622 = this.r;
                    this.r = i2622 + 1;
                    this.A = i2622;
                    return;
                }
            }
        }
        this.B = -5;
        int i172 = this.r;
        this.F = i172;
        int size2 = arrayList.size() + i172;
        this.r = size2;
        this.G = size2;
        user2 = qnVar.f;
        if (user2 != null) {
            peerSettings = qnVar.getMessagesController().getPeerSettings(qnVar.f.id);
            int i182 = org.telegram.ui.Cells.xa.K;
            if (peerSettings != null) {
                peerSettings2 = qnVar.getMessagesController().getPeerSettings(qnVar.f.id);
                i10 = peerSettings2.name_change_date;
                if (i10 != 0) {
                }
                if (i10 != 0) {
                }
                if (peerSettings2.photo_change_date != 0) {
                }
                int i232 = this.r;
                this.r = i232 + 1;
                this.y = i232;
                i9 = qnVar.N3;
                if (i9 == 9) {
                }
                if (i9 == 5) {
                }
                if (this.J) {
                }
            }
        }
        if (!UserObject.isReplyUser(qnVar.f)) {
        }
        int i272 = this.r;
        this.r = i272 + 1;
        this.w = i272;
        i9 = qnVar.N3;
        if (i9 == 9) {
        }
        if (i9 == 5) {
        }
        if (this.J) {
        }
    }

    public final void T() {
        int i9 = this.r;
        int i10 = this.w;
        int i11 = this.y;
        int i12 = this.s;
        int i13 = this.v;
        int i14 = this.A;
        int i15 = this.B;
        int i16 = this.F;
        int i17 = this.G;
        int i18 = this.C;
        int i19 = this.D;
        int i20 = this.E;
        S();
        if (i9 == this.r && i10 == this.w && i14 == this.A && i15 == this.B && i16 == this.F && i17 == this.G && i12 == this.s && i13 == this.v && i11 == this.y && i18 == this.C && i19 == this.D && i20 == this.E) {
            return;
        }
        O(false);
    }

    @Override // f2.r0
    public final int h() {
        this.x = -5;
        qn qnVar = this.M;
        a0.h hVar = qnVar.Z7;
        if (qnVar.I5.get(qnVar.Z3, 0) == 0) {
            return this.r;
        }
        TLRPC.User user = qnVar.f;
        if (user == null || !user.bot || qnVar.N3 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(qnVar.f.id)).description == null && ((TL_bots.BotInfo) hVar.f(qnVar.f.id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(qnVar.f.id)).description_document == null)) && !UserObject.isReplyUser(qnVar.f) && !UserObject.isBotForum(qnVar.f))) {
            return 0;
        }
        this.x = 0;
        return 1;
    }

    @Override // f2.r0
    public final long i(int i9) {
        qn qnVar = this.M;
        if (qnVar.I5.get(qnVar.Z3, 0) != 0 && i9 == this.x) {
            return 1L;
        }
        ArrayList arrayList = this.H ? this.I : this.J ? this.L : qnVar.q6;
        if (i9 >= this.F && i9 < this.G) {
            return ((MessageObject) arrayList.get(i9 - r1)).stableId;
        }
        if (i9 == this.w || i9 == this.x) {
            return 1L;
        }
        if (i9 == this.A) {
            return 2L;
        }
        if (i9 == this.B) {
            return 3L;
        }
        if (i9 == this.s) {
            return 4L;
        }
        if (i9 == this.y) {
            return 6L;
        }
        if (i9 == this.C) {
            return 7L;
        }
        if (i9 == this.D) {
            return 8L;
        }
        if (i9 == this.E) {
            return 9L;
        }
        return i9 == this.v ? 10L : 5L;
    }

    @Override // f2.r0
    public final int j(int i9) {
        qn qnVar = this.M;
        if (qnVar.I5.get(qnVar.Z3, 0) != 0 && i9 == this.x) {
            return 3;
        }
        if (i9 == this.s || i9 == this.v) {
            return 1;
        }
        int i10 = this.F;
        if (i9 >= i10 && i9 < this.G) {
            return ((MessageObject) (this.H ? this.I : this.J ? this.L : qnVar.q6).get(i9 - i10)).contentType;
        }
        if (i9 == this.w) {
            return 3;
        }
        if (i9 == this.y) {
            return 6;
        }
        if (i9 == this.D || i9 == this.C) {
            return 7;
        }
        return i9 == this.E ? 8 : 4;
    }

    @Override // org.telegram.ui.Components.bk0, f2.r0
    public final void l() {
        O(false);
    }

    @Override // org.telegram.ui.Components.bk0, f2.r0
    public final void m(int i9) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item changed " + i9);
        }
        qn qnVar = this.M;
        if (!((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow || qnVar.J0) {
            qnVar.t0.setItemAnimator(null);
        } else {
            f2.w0 itemAnimator = qnVar.t0.getItemAnimator();
            kj kjVar = qnVar.u0;
            if (itemAnimator != kjVar) {
                qnVar.t0.setItemAnimator(kjVar);
            }
        }
        S();
        try {
            super.m(i9);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.bk0, f2.r0
    public final void o(int i9) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item inserted " + i9);
        }
        qn qnVar = this.M;
        if (((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow) {
            f2.w0 itemAnimator = qnVar.t0.getItemAnimator();
            kj kjVar = qnVar.u0;
            if (itemAnimator != kjVar) {
                qnVar.t0.setItemAnimator(kjVar);
            }
        } else {
            qnVar.t0.setItemAnimator(null);
        }
        S();
        try {
            super.o(i9);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // f2.r0
    public final void p(int i9, int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item moved" + i9 + ":" + i10);
        }
        qn qnVar = this.M;
        if (((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow) {
            f2.w0 itemAnimator = qnVar.t0.getItemAnimator();
            kj kjVar = qnVar.u0;
            if (itemAnimator != kjVar) {
                qnVar.t0.setItemAnimator(kjVar);
            }
        } else {
            qnVar.t0.setItemAnimator(null);
        }
        S();
        try {
            super.p(i9, i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.bk0, f2.r0
    public final void q(int i9, int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range changed " + i9 + ":" + i10);
        }
        qn qnVar = this.M;
        if (((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow) {
            f2.w0 itemAnimator = qnVar.t0.getItemAnimator();
            kj kjVar = qnVar.u0;
            if (itemAnimator != kjVar) {
                qnVar.t0.setItemAnimator(kjVar);
            }
        } else {
            qnVar.t0.setItemAnimator(null);
        }
        S();
        try {
            super.q(i9, i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.bk0, f2.r0
    public final void s(int i9, int i10) {
        int i11;
        int i12;
        qn qnVar = this.M;
        ArrayList arrayList = qnVar.q6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i9 + ":" + i10);
        }
        if (((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow) {
            f2.w0 itemAnimator = qnVar.t0.getItemAnimator();
            kj kjVar = qnVar.u0;
            if (itemAnimator != kjVar) {
                qnVar.t0.setItemAnimator(kjVar);
            }
        } else {
            qnVar.t0.setItemAnimator(null);
        }
        S();
        if (i9 == 1 && i10 > 0 && (i11 = i9 + i10) >= (i12 = this.F) && i11 < this.G) {
            MessageObject messageObject = (MessageObject) arrayList.get(i11 - i12);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i11 - this.F) - 1);
            if ((qnVar.e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (qnVar.f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
                m(i9);
            }
        }
        try {
            super.s(i9, i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.bk0, f2.r0
    public final void t(int i9, int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range removed" + i9 + ":" + i10);
        }
        qn qnVar = this.M;
        if (((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow) {
            f2.w0 itemAnimator = qnVar.t0.getItemAnimator();
            kj kjVar = qnVar.u0;
            if (itemAnimator != kjVar) {
                qnVar.t0.setItemAnimator(kjVar);
            }
        } else {
            qnVar.t0.setItemAnimator(null);
        }
        S();
        try {
            super.t(i9, i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.bk0, f2.r0
    public final void u(int i9) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item removed " + i9);
        }
        qn qnVar = this.M;
        if (((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow) {
            f2.w0 itemAnimator = qnVar.t0.getItemAnimator();
            kj kjVar = qnVar.u0;
            if (itemAnimator != kjVar) {
                qnVar.t0.setItemAnimator(kjVar);
            }
        } else {
            qnVar.t0.setItemAnimator(null);
        }
        S();
        try {
            super.u(i9);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x05cf, code lost:
    
        if (r19 != r9) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0942, code lost:
    
        if (r4.u0 == null) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0602, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.peer_id) == org.telegram.messenger.MessageObject.getPeerId(r8.messageOwner.peer_id)) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0677, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0620, code lost:
    
        if (r8.getSenderId() == r5.getSenderId()) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0675, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r2) == org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.fwd_from.from_id)) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x03f4, code lost:
    
        if (r4.N3 != 9) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0420, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.peer_id) == org.telegram.messenger.MessageObject.getPeerId(r11.messageOwner.peer_id)) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0492, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x043b, code lost:
    
        if (r11.getSenderId() == r5.getSenderId()) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0490, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r10) == org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.fwd_from.from_id)) goto L267;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0a3d  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0a26  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v16 */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.UserFull userFull;
        TLObject tLObject;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        ArrayList arrayList;
        long j10;
        int i13;
        int i14;
        boolean z12;
        boolean z13;
        boolean z14;
        int j11;
        boolean z15;
        boolean z16;
        ArrayList arrayList2;
        int i15;
        int i16;
        boolean z17;
        boolean z18;
        int i17;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        String str;
        byte[] bArr;
        Integer num;
        int indexOf;
        ?? r10;
        kj kjVar;
        MessageObject.SendAnimationData sendAnimationData;
        ak akVar;
        int i18;
        int i19;
        boolean z27;
        uk ukVar;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str2;
        boolean z28;
        long j12;
        long j13;
        long j14;
        MessageObject messageObject;
        String str3;
        int i20;
        boolean z29;
        TLRPC.ChatFull chatFull;
        View view = q1Var.a;
        qn qnVar = this.M;
        a0.h hVar = qnVar.Z7;
        ArrayList arrayList3 = qnVar.q4;
        HashMap hashMap = qnVar.r4;
        boolean z30 = false;
        if (i9 == this.w || i9 == this.x) {
            org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) view;
            if (UserObject.isReplyUser(qnVar.f)) {
                h0Var.b(false, 0L, LocaleController.getString(R.string.RepliesChatInfo), null, null, null);
            } else {
                TLRPC.User user = qnVar.f;
                if (user == null || user.id != UserObject.VERIFY) {
                    TL_bots.BotInfo botInfo = hVar.m() != 0 ? (TL_bots.BotInfo) hVar.f(qnVar.f.id) : null;
                    boolean z31 = (botInfo == null || (TextUtils.isEmpty(botInfo.description) && botInfo.description_photo == null && botInfo.description_document == null)) && UserObject.isBot(qnVar.f) && (userFull = qnVar.W7) != null && userFull.bot_manager_id != 0 && qnVar.f.bot_can_edit;
                    TLRPC.User user2 = qnVar.f;
                    long j15 = user2 == null ? 0L : user2.id;
                    String str4 = botInfo != null ? botInfo.description : null;
                    if (botInfo != null) {
                        TLObject tLObject2 = botInfo.description_document;
                        if (tLObject2 == null) {
                            tLObject2 = botInfo.description_photo;
                        }
                        tLObject = tLObject2;
                    } else {
                        tLObject = null;
                    }
                    h0Var.b(true, j15, str4, tLObject, botInfo, z31 ? DialogObject.getName(((org.telegram.ui.ActionBar.o2) qnVar).currentAccount, qnVar.W7.bot_manager_id) : null);
                } else {
                    h0Var.b(false, 0L, LocaleController.getString(R.string.VerifyChatInfo), null, null, null);
                }
            }
            qn.b4(qnVar, h0Var);
            return;
        }
        if (i9 == this.E) {
            ((org.telegram.ui.Cells.b0) view).setDialogId(qnVar.a());
            return;
        }
        if (i9 == this.y) {
            org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
            TLRPC.EncryptedChat encryptedChat = qnVar.h;
            long a2 = encryptedChat != null ? encryptedChat.user_id : qnVar.a();
            xaVar.b(a2, qnVar.getMessagesController().getPeerSettings(a2));
            return;
        }
        if (i9 == this.B || i9 == this.A) {
            ((org.telegram.ui.Cells.z0) view).setProgressVisible(qnVar.F6 > 1);
            return;
        }
        if (i9 == this.D) {
            if (qnVar.getMessagesController().getPeerSettings(qnVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.w0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedName, LocaleController.formatRelativeDate(qnVar.getConnectionsManager().getCurrentTime() - r1.name_change_date)));
            return;
        }
        if (i9 == this.C) {
            if (qnVar.getMessagesController().getPeerSettings(qnVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.w0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedPhoto, LocaleController.formatRelativeDate(qnVar.getConnectionsManager().getCurrentTime() - r1.photo_change_date)));
            return;
        }
        if (i9 == this.s) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            qn.d4(qnVar);
            w0Var.setMessageObject(qnVar.E3);
            int i21 = qnVar.N3;
            if (i21 == 3) {
                w0Var.setCustomText(LocaleController.getString(R.string.SavedMessagesProfileHint));
            } else if (i21 == 5) {
                w0Var.setCustomText(LocaleController.getString(R.string.BusinessRepliesHint));
            } else if (i21 == 9) {
                w0Var.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint2));
            }
            w0Var.setAlpha(1.0f);
            w0Var.setSpoilersSuppressed(qnVar.t0.getScrollState() != 0);
            return;
        }
        if (i9 == this.v) {
            org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) view;
            qn.e4(qnVar);
            w0Var2.setMessageObject(qnVar.F3);
            w0Var2.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint));
            w0Var2.setAlpha(1.0f);
            w0Var2.setSpoilersSuppressed(qnVar.t0.getScrollState() != 0);
            return;
        }
        int i22 = this.F;
        if (i9 < i22 || i9 >= this.G) {
            return;
        }
        ArrayList arrayList4 = this.H ? this.I : this.J ? this.L : qnVar.q6;
        MessageObject messageObject2 = (MessageObject) arrayList4.get(i9 - i22);
        if (!(view instanceof org.telegram.ui.Cells.t1)) {
            ArrayList arrayList5 = arrayList4;
            MessageObject messageObject3 = null;
            if (!(view instanceof org.telegram.ui.Cells.w0)) {
                if (view instanceof org.telegram.ui.Cells.v1) {
                    org.telegram.ui.Cells.v1 v1Var = (org.telegram.ui.Cells.v1) view;
                    v1Var.setText(LocaleController.getString(R.string.UnreadMessages));
                    v1Var.getTextView().setTranslationX(qnVar.R8() / 2.0f);
                    if (qnVar.z7 != 0) {
                        qnVar.z7 = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            if ((messageObject2 == null || !messageObject2.isDateObject) && (i11 = (i10 = i9 + 1) - this.F) >= 0 && i11 < arrayList5.size()) {
                MessageObject messageObject4 = (MessageObject) arrayList5.get(i10 - this.F);
                if (messageObject4 == null || !messageObject4.isDateObject) {
                    messageObject3 = messageObject4;
                } else {
                    int i23 = i9 + 2;
                    int i24 = i23 - this.F;
                    if (i24 >= 0 && i24 < arrayList5.size()) {
                        messageObject3 = (MessageObject) arrayList5.get(i23 - this.F);
                    }
                }
                if (messageObject3 == null || (messageObject2 != null && messageObject3.getTopicId() != messageObject2.getTopicId())) {
                    z10 = true;
                    org.telegram.ui.Cells.w0 w0Var3 = (org.telegram.ui.Cells.w0) view;
                    w0Var3.a0 = qnVar.t9();
                    w0Var3.e0 = qnVar.C9();
                    qnVar.B9();
                    qnVar.Q8();
                    w0Var3.f0 = qnVar.R8();
                    w0Var3.b0 = ChatObject.isForum(qnVar.e);
                    w0Var3.c0 = ChatObject.isMonoForum(qnVar.e);
                    w0Var3.d0 = UserObject.isBotForum(qnVar.f);
                    boolean z32 = w0Var3.g0 == z10;
                    w0Var3.g0 = z10;
                    w0Var3.T(messageObject2, z32);
                    w0Var3.setAlpha(1.0f);
                    w0Var3.setShowTopic(true);
                    w0Var3.setSpoilersSuppressed(qnVar.t0.getScrollState() == 0);
                    return;
                }
            }
            z10 = false;
            org.telegram.ui.Cells.w0 w0Var32 = (org.telegram.ui.Cells.w0) view;
            w0Var32.a0 = qnVar.t9();
            w0Var32.e0 = qnVar.C9();
            qnVar.B9();
            qnVar.Q8();
            w0Var32.f0 = qnVar.R8();
            w0Var32.b0 = ChatObject.isForum(qnVar.e);
            w0Var32.c0 = ChatObject.isMonoForum(qnVar.e);
            w0Var32.d0 = UserObject.isBotForum(qnVar.f);
            if (w0Var32.g0 == z10) {
            }
            w0Var32.g0 = z10;
            w0Var32.T(messageObject2, z32);
            w0Var32.setAlpha(1.0f);
            w0Var32.setShowTopic(true);
            w0Var32.setSpoilersSuppressed(qnVar.t0.getScrollState() == 0);
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
        MessageObject.GroupedMessages X8 = qnVar.X8(messageObject2);
        t1Var.J7 = qnVar.e != null || UserObject.isUserSelf(qnVar.f) || UserObject.isReplyUser(qnVar.f) || qnVar.N3 == 7;
        t1Var.y.a(false, false);
        t1Var.K7 = UserObject.isBotForum(qnVar.f);
        t1Var.W7 = qnVar.A9();
        int i25 = qnVar.N3;
        t1Var.L7 = i25 == 3;
        t1Var.M7 = i25 == 3 && qnVar.Ka;
        TLRPC.User user3 = qnVar.f;
        t1Var.N7 = user3 != null && user3.bot;
        t1Var.O7 = ChatObject.isChannel(qnVar.e) && qnVar.e.megagroup;
        t1Var.P7 = ChatObject.isForum(qnVar.e);
        t1Var.Q7 = ChatObject.isMonoForum(qnVar.e);
        t1Var.R7 = ChatObject.isForum(qnVar.e) && qnVar.d4 && qnVar.b() == 1;
        t1Var.S7 = (qnVar.Z3 != 0 || (t1Var.P7 && qnVar.d4)) && !t1Var.Q7;
        int i26 = qnVar.N3;
        if (i26 != 1 && i26 != 9 && ChatObject.isChannel(qnVar.e)) {
            TLRPC.Chat chat = qnVar.e;
            if (chat.has_link && !chat.megagroup) {
                z11 = true;
                t1Var.T7 = z11;
                t1Var.U7 = qnVar.N3 != 0 && (qnVar.F4.containsKey(Integer.valueOf(messageObject2.getId())) || !(X8 == null || X8.messages.isEmpty() || !qnVar.F4.containsKey(Integer.valueOf(X8.messages.get(0).getId()))));
                i12 = qnVar.N3;
                if (i12 != 1 || i12 == 9 || (chatFull = qnVar.V7) == null) {
                    arrayList = arrayList4;
                    j10 = 0;
                } else {
                    arrayList = arrayList4;
                    j10 = chatFull.linked_chat_id;
                }
                t1Var.X7 = j10;
                if (i12 == 7 || qnVar.K3 != 1) {
                    t1Var.Y7 = UserObject.isReplyUser(qnVar.f);
                } else {
                    t1Var.Y7 = UserObject.isReplyUser(messageObject2.getDialogId());
                }
                t1Var.Z7 = qnVar.N3 != 2;
                t1Var.A8 = qnVar.t9();
                t1Var.B8 = qnVar.C9();
                t1Var.C8 = qnVar.B9();
                t1Var.D8 = qnVar.Q8();
                t1Var.E8 = qnVar.R8();
                if (messageObject2.isSponsored()) {
                    AndroidUtilities.doOnPreDraw(t1Var, new bg.d2(23));
                }
                int i27 = i9 + 2;
                if (X8 == null) {
                    MessageObject.GroupedMessagePosition position = X8.getPosition(messageObject2);
                    if (position != null) {
                        if (X8.isDocuments) {
                            int indexOf2 = X8.posArray.indexOf(position) + i9 + 1;
                            int indexOf3 = X8.posArray.indexOf(position) + (i9 - X8.posArray.size());
                            i14 = indexOf2;
                            z13 = false;
                            z14 = false;
                            i13 = indexOf3;
                            z12 = false;
                        } else {
                            if ((position.flags & 4) != 0) {
                                i20 = X8.reversed ? X8.posArray.indexOf(position) + (i9 - X8.posArray.size()) : X8.posArray.indexOf(position) + i9 + 1;
                                z12 = false;
                                z29 = false;
                            } else {
                                z12 = true;
                                i20 = -100;
                                z29 = true;
                            }
                            if ((position.flags & 8) != 0) {
                                int i28 = i20;
                                i13 = X8.reversed ? X8.posArray.indexOf(position) + i9 + 1 : X8.posArray.indexOf(position) + (i9 - X8.posArray.size());
                                i14 = i28;
                                z30 = z29;
                                z13 = false;
                                z14 = false;
                            } else {
                                i14 = i20;
                                z30 = z29;
                                i13 = -100;
                                z13 = true;
                                z14 = true;
                            }
                        }
                        int j16 = j(i13);
                        boolean z33 = z12;
                        j11 = j(i14);
                        j(i27);
                        if ((messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && j16 == q1Var.f) {
                            arrayList2 = arrayList;
                            MessageObject messageObject5 = (MessageObject) arrayList2.get(i13 - this.F);
                            i15 = i14;
                            boolean z34 = messageObject5.isOutOwner() == messageObject2.isOutOwner() && (Math.abs(messageObject5.messageOwner.date - messageObject2.messageOwner.date) <= 300 || qnVar.N3 == 9);
                            if (z34) {
                                TLRPC.Message message2 = messageObject5.messageOwner;
                                z15 = z13;
                                z16 = z30;
                                if (message2 == null || message2.paid_message_stars <= 0) {
                                    if (messageObject2.isImportedForward() || messageObject5.isImportedForward()) {
                                        if (messageObject2.isImportedForward() && messageObject5.isImportedForward() && Math.abs(messageObject5.messageOwner.fwd_from.date - messageObject2.messageOwner.fwd_from.date) <= 300) {
                                            TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject5.messageOwner.fwd_from;
                                            String str5 = messageFwdHeader2.from_name;
                                            if (str5 == null || (str3 = messageObject2.messageOwner.fwd_from.from_name) == null) {
                                                TLRPC.Peer peer = messageFwdHeader2.from_id;
                                                if (peer != null) {
                                                    if (messageObject2.messageOwner.fwd_from.from_id != null) {
                                                    }
                                                }
                                            } else {
                                                z34 = str5.equals(str3);
                                                if (DialogObject.getPeerDialogId(messageObject5.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                                    z14 = false;
                                                }
                                            }
                                        }
                                    } else if (qnVar.e != null) {
                                        long fromChatId = messageObject5.getFromChatId();
                                        z34 = fromChatId == messageObject2.getFromChatId();
                                        if (!z15) {
                                            if (z34) {
                                                if (fromChatId < 0) {
                                                    if (qnVar.e.megagroup) {
                                                    }
                                                }
                                            }
                                        }
                                        if (DialogObject.getPeerDialogId(messageObject5.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    } else {
                                        if (UserObject.isUserSelf(qnVar.f) || UserObject.isReplyUser(qnVar.f)) {
                                            if (!messageObject2.isPrivateForward()) {
                                                if (!messageObject5.isPrivateForward()) {
                                                }
                                            }
                                        } else if (qnVar.N3 == 7) {
                                        }
                                        if (DialogObject.getPeerDialogId(messageObject5.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    }
                                }
                                z34 = false;
                                if (DialogObject.getPeerDialogId(messageObject5.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                }
                            } else {
                                z15 = z13;
                                z16 = z30;
                            }
                            z14 = z34;
                        } else {
                            z15 = z13;
                            z16 = z30;
                            arrayList2 = arrayList;
                            i15 = i14;
                        }
                        i16 = i15 - this.F;
                        if (i16 >= 0 && i16 < arrayList2.size()) {
                            messageObject = (MessageObject) arrayList2.get(i15 - this.F);
                            if (messageObject != null && messageObject.isDateObject) {
                                int i29 = i15 + 1;
                                int i30 = i29 - this.F;
                                messageObject = (i30 >= 0 || i30 >= arrayList2.size()) ? null : (MessageObject) arrayList2.get(i29 - this.F);
                            }
                            if (messageObject != null && messageObject.getTopicId() == messageObject2.getTopicId()) {
                                z17 = z16;
                                z18 = false;
                                i17 = this.F;
                                if (i9 == i17) {
                                    z19 = z15;
                                    z20 = true;
                                } else {
                                    z19 = z15;
                                    z20 = false;
                                }
                                if (j11 == q1Var.f) {
                                    MessageObject messageObject6 = (MessageObject) arrayList2.get(i15 - i17);
                                    boolean z35 = !(messageObject6.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && messageObject6.isOutOwner() == messageObject2.isOutOwner() && (Math.abs(messageObject6.messageOwner.date - messageObject2.messageOwner.date) <= 300 || qnVar.N3 == 9);
                                    if (!z35) {
                                        z21 = z19;
                                        z22 = z35;
                                    } else if (messageObject2.isImportedForward() || messageObject6.isImportedForward()) {
                                        z21 = z19;
                                        if (messageObject2.isImportedForward() && messageObject6.isImportedForward() && Math.abs(messageObject2.messageOwner.fwd_from.date - messageObject6.messageOwner.fwd_from.date) <= 300) {
                                            TLRPC.MessageFwdHeader messageFwdHeader3 = messageObject6.messageOwner.fwd_from;
                                            String str6 = messageFwdHeader3.from_name;
                                            if (str6 == null || (str2 = messageObject2.messageOwner.fwd_from.from_name) == null) {
                                                TLRPC.Peer peer2 = messageFwdHeader3.from_id;
                                                if (peer2 != null) {
                                                    if (messageObject2.messageOwner.fwd_from.from_id != null) {
                                                    }
                                                }
                                            } else {
                                                z22 = str6.equals(str2);
                                                if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                                    z22 = false;
                                                }
                                            }
                                        }
                                        z22 = false;
                                        if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    } else if (qnVar.e != null) {
                                        long fromChatId2 = messageObject6.getFromChatId();
                                        boolean z36 = (fromChatId2 != messageObject2.getFromChatId() || messageObject2.isImportedForward() || messageObject6.isImportedForward()) ? false : true;
                                        if (!z17 && z36 && fromChatId2 < 0 && qnVar.e.megagroup && qnVar.N3 != 9) {
                                            z36 = false;
                                        }
                                        if (z36 && qnVar.v9()) {
                                            TLRPC.TL_forumTopic tL_forumTopic = messageObject2.replyToForumTopic;
                                            if (tL_forumTopic == null) {
                                                z28 = true;
                                                j12 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.o2) qnVar).currentAccount, messageObject2.messageOwner, true);
                                            } else {
                                                z28 = true;
                                                j12 = tL_forumTopic.id;
                                            }
                                            TLRPC.TL_forumTopic tL_forumTopic2 = messageObject6.replyToForumTopic;
                                            if (tL_forumTopic2 == null) {
                                                z21 = z19;
                                                j13 = j12;
                                                j14 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.o2) qnVar).currentAccount, messageObject6.messageOwner, z28);
                                            } else {
                                                z21 = z19;
                                                j13 = j12;
                                                j14 = tL_forumTopic2.id;
                                            }
                                        } else {
                                            z21 = z19;
                                        }
                                        z22 = z36;
                                        if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    } else {
                                        z21 = z19;
                                        if (UserObject.isUserSelf(qnVar.f) || UserObject.isReplyUser(qnVar.f)) {
                                            if (!messageObject2.isPrivateForward()) {
                                                if (!messageObject6.isPrivateForward()) {
                                                }
                                            }
                                            z22 = false;
                                        } else if (qnVar.N3 != 7) {
                                            z22 = z35;
                                        }
                                        if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    }
                                } else {
                                    z21 = z19;
                                    z22 = z33;
                                }
                                if (ChatObject.isChannel(qnVar.e) && qnVar.e.megagroup && messageObject2.getFromChatId() <= 0 && (messageFwdHeader = messageObject2.messageOwner.fwd_from) != null && (messageFwdHeader.saved_from_peer instanceof TLRPC.TL_peerChannel)) {
                                    if (!z17) {
                                        z22 = false;
                                    }
                                    if (!z21) {
                                        z14 = false;
                                    }
                                }
                                if (!z17 && (message = messageObject2.messageOwner) != null && message.paid_message_stars > 0) {
                                    z22 = false;
                                }
                                boolean z37 = false;
                                messageObject2.updateTranslation(false);
                                if (X8 != null) {
                                    int i31 = 0;
                                    while (i31 < X8.messages.size()) {
                                        X8.messages.get(i31).updateTranslation(z37);
                                        i31++;
                                        z37 = false;
                                    }
                                }
                                if (!qnVar.La) {
                                    z23 = z22;
                                    z24 = z14;
                                } else {
                                    if (X8 != null) {
                                        z25 = true;
                                        z24 = false;
                                        z23 = false;
                                        t1Var.setShowTopic(z25);
                                        t1Var.X3(messageObject2, X8, z24, z23, z18, z20);
                                        t1Var.setSpoilersSuppressed(qnVar.t0.getScrollState() == 0);
                                        t1Var.setHighlighted(qnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == qnVar.H7);
                                        z26 = t1Var.b8;
                                        if (!z26 && qnVar.L7 != null) {
                                            long currentTimeMillis = System.currentTimeMillis();
                                            t1Var.T3(qnVar.L7, true, qnVar.J7 || currentTimeMillis - qnVar.K7 < 200, qnVar.O7);
                                            if (qnVar.J7) {
                                                qnVar.K7 = currentTimeMillis;
                                            }
                                            qnVar.J7 = false;
                                        } else if (!z26 && (num = qnVar.M7) != null) {
                                            t1Var.R3(num.intValue());
                                        } else if (!z26 && (bArr = qnVar.N7) != null) {
                                            t1Var.P3(bArr);
                                        } else if (qnVar.N3 == 7 && qnVar.q3 != null && (str = qnVar.p3) != null) {
                                            t1Var.S3(str);
                                        }
                                        if (qnVar.H7 != Integer.MAX_VALUE) {
                                            qnVar.Zb();
                                        }
                                        indexOf = arrayList3.indexOf(messageObject2);
                                        if (indexOf != -1) {
                                            if (messageObject2.type == 5 && (ukVar = qnVar.X2) != null && ukVar.getTextureView() != null) {
                                                ge geVar = qnVar.m7;
                                                if (geVar != null) {
                                                    AndroidUtilities.cancelRunOnUIThread(geVar);
                                                    qnVar.m7 = null;
                                                }
                                                t1Var.getViewTreeObserver().addOnPreDrawListener(new ch.f(1, this, t1Var));
                                            } else if ((messageObject2.isAnyKindOfSticker() && !messageObject2.isAnimatedEmojiStickers()) || ((sendAnimationData = messageObject2.sendAnimationData) != null && sendAnimationData.fromPreview)) {
                                                if (!messageObject2.sendAnimationData.fromPreview || (akVar = qnVar.U) == null || akVar.H0 == null) {
                                                    t1Var.getViewTreeObserver().addOnPreDrawListener(new am(this, t1Var));
                                                } else {
                                                    if (((org.telegram.ui.ActionBar.o2) qnVar).actionBar.getVisibility() == 0) {
                                                        int measuredHeight = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar.getMeasuredHeight() + ((int) ((org.telegram.ui.ActionBar.o2) qnVar).actionBar.getTranslationY());
                                                        mk mkVar = qnVar.k1;
                                                        int currentHeight = measuredHeight + (mkVar != null ? mkVar.getCurrentHeight() : 0);
                                                        yj yjVar = qnVar.l1;
                                                        i18 = (((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode ? AndroidUtilities.statusBarHeight : 0) + currentHeight + (yjVar != null ? yjVar.getCurrentHeight() : 0);
                                                    } else {
                                                        i18 = 0;
                                                    }
                                                    float f10 = i18 + qnVar.p9;
                                                    float height = qnVar.fragmentView == null ? 0.0f : r9.getHeight();
                                                    org.telegram.ui.Components.cf cfVar = qnVar.U.H0;
                                                    Rect rect = cfVar.q0;
                                                    if (!cfVar.m0) {
                                                        cfVar.s = true;
                                                        cfVar.m0 = true;
                                                        yh0 yh0Var = cfVar.T;
                                                        if (yh0Var != null) {
                                                            yh0Var.invalidate();
                                                        }
                                                        org.telegram.ui.Components.lg lgVar = cfVar.S;
                                                        if (lgVar != null) {
                                                            lgVar.invalidate();
                                                        }
                                                        if (cfVar.M != null) {
                                                            cfVar.n0 = t1Var;
                                                            t1Var.setVisibility(4);
                                                            cfVar.o0 = f10;
                                                            cfVar.p0 = height;
                                                            org.telegram.ui.Cells.t1 t1Var2 = cfVar.M;
                                                            org.telegram.ui.Cells.t1 t1Var3 = cfVar.n0;
                                                            t1Var2.J7 = t1Var3.J7;
                                                            t1Var2.S7 = t1Var3.S7;
                                                            t1Var2.L7 = t1Var3.L7;
                                                            t1Var2.N7 = t1Var3.N7;
                                                            t1Var2.P7 = t1Var3.P7;
                                                            t1Var2.R7 = t1Var3.R7;
                                                            t1Var2.X3(t1Var.getMessageObject(), null, t1Var.m3(), t1Var.n3(), t1Var.h3(), false);
                                                            org.telegram.ui.Cells.s1 transitionParams = cfVar.M.getTransitionParams();
                                                            transitionParams.g = cfVar.M.getTransitionParams().f();
                                                            Rect rect2 = transitionParams.D0;
                                                            transitionParams.K1 = 0.0f;
                                                            if (cfVar.M.getTransitionParams().D0.left == cfVar.M.getBackgroundDrawableLeft() && rect2.top == cfVar.M.getBackgroundDrawableTop() && rect2.bottom == cfVar.M.getBackgroundDrawableBottom()) {
                                                                i19 = 1;
                                                            } else {
                                                                rect.bottom = -(cfVar.M.getBackgroundDrawableBottom() - rect2.bottom);
                                                                rect.top = -(cfVar.M.getBackgroundDrawableTop() - rect2.top);
                                                                if (t1Var.getMessageObject().isOutOwner()) {
                                                                    rect.left = -(cfVar.M.getBackgroundDrawableLeft() - rect2.left);
                                                                    rect.right = 0;
                                                                } else {
                                                                    rect.left = 0;
                                                                    rect.right = cfVar.M.getBackgroundDrawableRight() - rect2.right;
                                                                }
                                                                i19 = 1;
                                                                transitionParams.w0 = true;
                                                            }
                                                            int i32 = cfVar.M.Ud;
                                                        } else {
                                                            i19 = 1;
                                                        }
                                                        cfVar.e(new qh0(cfVar, i19), false);
                                                        cfVar.B.invalidate();
                                                        cfVar.c();
                                                    }
                                                    qnVar.U.H0 = null;
                                                }
                                            }
                                            arrayList3.remove(indexOf);
                                            ak akVar2 = qnVar.U;
                                            Runnable runnable = akVar2.b0;
                                            if (runnable != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable);
                                                z27 = true;
                                                akVar2.c0 = true;
                                                akVar2.b0.run();
                                                akVar2.b0 = null;
                                            } else {
                                                z27 = true;
                                            }
                                            qnVar.U.p0(z27);
                                        }
                                        if (!hashMap.isEmpty() && hashMap.containsKey(messageObject2.getDocument())) {
                                            hashMap.remove(messageObject2.getDocument());
                                            kjVar = qnVar.u0;
                                            if (kjVar != null) {
                                                org.telegram.ui.Components.yn ynVar = qnVar.O0;
                                                kjVar.O = q1Var;
                                                kjVar.P = ynVar;
                                                r10 = 0;
                                                kjVar.N = false;
                                                if (t1Var.bd) {
                                                    t1Var.bd = r10;
                                                    t1Var.setVisibility(r10);
                                                }
                                                qnVar.ub(t1Var);
                                            }
                                        }
                                        r10 = 0;
                                        if (t1Var.bd) {
                                        }
                                        qnVar.ub(t1Var);
                                    }
                                    z24 = z22;
                                    z23 = z14;
                                }
                                z25 = true;
                                t1Var.setShowTopic(z25);
                                t1Var.X3(messageObject2, X8, z24, z23, z18, z20);
                                t1Var.setSpoilersSuppressed(qnVar.t0.getScrollState() == 0);
                                t1Var.setHighlighted(qnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == qnVar.H7);
                                z26 = t1Var.b8;
                                if (!z26) {
                                }
                                if (!z26) {
                                }
                                if (!z26) {
                                }
                                if (qnVar.N3 == 7) {
                                    t1Var.S3(str);
                                }
                                if (qnVar.H7 != Integer.MAX_VALUE) {
                                }
                                indexOf = arrayList3.indexOf(messageObject2);
                                if (indexOf != -1) {
                                }
                                if (!hashMap.isEmpty()) {
                                    hashMap.remove(messageObject2.getDocument());
                                    kjVar = qnVar.u0;
                                    if (kjVar != null) {
                                    }
                                }
                                r10 = 0;
                                if (t1Var.bd) {
                                }
                                qnVar.ub(t1Var);
                            }
                        }
                        z17 = z16;
                        z18 = true;
                        i17 = this.F;
                        if (i9 == i17) {
                        }
                        if (j11 == q1Var.f) {
                        }
                        if (ChatObject.isChannel(qnVar.e)) {
                            if (!z17) {
                            }
                            if (!z21) {
                            }
                        }
                        if (!z17) {
                            z22 = false;
                        }
                        boolean z372 = false;
                        messageObject2.updateTranslation(false);
                        if (X8 != null) {
                        }
                        if (!qnVar.La) {
                        }
                        z25 = true;
                        t1Var.setShowTopic(z25);
                        t1Var.X3(messageObject2, X8, z24, z23, z18, z20);
                        t1Var.setSpoilersSuppressed(qnVar.t0.getScrollState() == 0);
                        t1Var.setHighlighted(qnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == qnVar.H7);
                        z26 = t1Var.b8;
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (qnVar.N3 == 7) {
                        }
                        if (qnVar.H7 != Integer.MAX_VALUE) {
                        }
                        indexOf = arrayList3.indexOf(messageObject2);
                        if (indexOf != -1) {
                        }
                        if (!hashMap.isEmpty()) {
                        }
                        r10 = 0;
                        if (t1Var.bd) {
                        }
                        qnVar.ub(t1Var);
                    }
                    z12 = false;
                    i14 = -100;
                    i13 = -100;
                } else {
                    i13 = i9 - 1;
                    i14 = i9 + 1;
                    z12 = false;
                }
                z13 = false;
                z30 = false;
                z14 = false;
                int j162 = j(i13);
                boolean z332 = z12;
                j11 = j(i14);
                j(i27);
                if (messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                }
                z15 = z13;
                z16 = z30;
                arrayList2 = arrayList;
                i15 = i14;
                i16 = i15 - this.F;
                if (i16 >= 0) {
                    messageObject = (MessageObject) arrayList2.get(i15 - this.F);
                    if (messageObject != null) {
                        int i292 = i15 + 1;
                        int i302 = i292 - this.F;
                        if (i302 >= 0) {
                        }
                    }
                    if (messageObject != null) {
                        z17 = z16;
                        z18 = false;
                        i17 = this.F;
                        if (i9 == i17) {
                        }
                        if (j11 == q1Var.f) {
                        }
                        if (ChatObject.isChannel(qnVar.e)) {
                        }
                        if (!z17) {
                        }
                        boolean z3722 = false;
                        messageObject2.updateTranslation(false);
                        if (X8 != null) {
                        }
                        if (!qnVar.La) {
                        }
                        z25 = true;
                        t1Var.setShowTopic(z25);
                        t1Var.X3(messageObject2, X8, z24, z23, z18, z20);
                        t1Var.setSpoilersSuppressed(qnVar.t0.getScrollState() == 0);
                        t1Var.setHighlighted(qnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == qnVar.H7);
                        z26 = t1Var.b8;
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (qnVar.N3 == 7) {
                        }
                        if (qnVar.H7 != Integer.MAX_VALUE) {
                        }
                        indexOf = arrayList3.indexOf(messageObject2);
                        if (indexOf != -1) {
                        }
                        if (!hashMap.isEmpty()) {
                        }
                        r10 = 0;
                        if (t1Var.bd) {
                        }
                        qnVar.ub(t1Var);
                    }
                }
                z17 = z16;
                z18 = true;
                i17 = this.F;
                if (i9 == i17) {
                }
                if (j11 == q1Var.f) {
                }
                if (ChatObject.isChannel(qnVar.e)) {
                }
                if (!z17) {
                }
                boolean z37222 = false;
                messageObject2.updateTranslation(false);
                if (X8 != null) {
                }
                if (!qnVar.La) {
                }
                z25 = true;
                t1Var.setShowTopic(z25);
                t1Var.X3(messageObject2, X8, z24, z23, z18, z20);
                t1Var.setSpoilersSuppressed(qnVar.t0.getScrollState() == 0);
                t1Var.setHighlighted(qnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == qnVar.H7);
                z26 = t1Var.b8;
                if (!z26) {
                }
                if (!z26) {
                }
                if (!z26) {
                }
                if (qnVar.N3 == 7) {
                }
                if (qnVar.H7 != Integer.MAX_VALUE) {
                }
                indexOf = arrayList3.indexOf(messageObject2);
                if (indexOf != -1) {
                }
                if (!hashMap.isEmpty()) {
                }
                r10 = 0;
                if (t1Var.bd) {
                }
                qnVar.ub(t1Var);
            }
        }
        z11 = false;
        t1Var.T7 = z11;
        t1Var.U7 = qnVar.N3 != 0 && (qnVar.F4.containsKey(Integer.valueOf(messageObject2.getId())) || !(X8 == null || X8.messages.isEmpty() || !qnVar.F4.containsKey(Integer.valueOf(X8.messages.get(0).getId()))));
        i12 = qnVar.N3;
        if (i12 != 1) {
        }
        arrayList = arrayList4;
        j10 = 0;
        t1Var.X7 = j10;
        if (i12 == 7) {
        }
        t1Var.Y7 = UserObject.isReplyUser(qnVar.f);
        t1Var.Z7 = qnVar.N3 != 2;
        t1Var.A8 = qnVar.t9();
        t1Var.B8 = qnVar.C9();
        t1Var.C8 = qnVar.B9();
        t1Var.D8 = qnVar.Q8();
        t1Var.E8 = qnVar.R8();
        if (messageObject2.isSponsored()) {
        }
        int i272 = i9 + 2;
        if (X8 == null) {
        }
        z13 = false;
        z30 = false;
        z14 = false;
        int j1622 = j(i13);
        boolean z3322 = z12;
        j11 = j(i14);
        j(i272);
        if (messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
        }
        z15 = z13;
        z16 = z30;
        arrayList2 = arrayList;
        i15 = i14;
        i16 = i15 - this.F;
        if (i16 >= 0) {
        }
        z17 = z16;
        z18 = true;
        i17 = this.F;
        if (i9 == i17) {
        }
        if (j11 == q1Var.f) {
        }
        if (ChatObject.isChannel(qnVar.e)) {
        }
        if (!z17) {
        }
        boolean z372222 = false;
        messageObject2.updateTranslation(false);
        if (X8 != null) {
        }
        if (!qnVar.La) {
        }
        z25 = true;
        t1Var.setShowTopic(z25);
        t1Var.X3(messageObject2, X8, z24, z23, z18, z20);
        t1Var.setSpoilersSuppressed(qnVar.t0.getScrollState() == 0);
        t1Var.setHighlighted(qnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == qnVar.H7);
        z26 = t1Var.b8;
        if (!z26) {
        }
        if (!z26) {
        }
        if (!z26) {
        }
        if (qnVar.N3 == 7) {
        }
        if (qnVar.H7 != Integer.MAX_VALUE) {
        }
        indexOf = arrayList3.indexOf(messageObject2);
        if (indexOf != -1) {
        }
        if (!hashMap.isEmpty()) {
        }
        r10 = 0;
        if (t1Var.bd) {
        }
        qnVar.ub(t1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [org.telegram.ui.vl] */
    /* JADX WARN: Type inference failed for: r8v11, types: [org.telegram.ui.Cells.w0] */
    /* JADX WARN: Type inference failed for: r8v12, types: [org.telegram.ui.Cells.xa] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Cells.z0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [org.telegram.ui.Cells.h0, org.telegram.ui.ul] */
    /* JADX WARN: Type inference failed for: r8v16, types: [org.telegram.ui.Cells.v1] */
    /* JADX WARN: Type inference failed for: r8v9, types: [org.telegram.ui.Cells.u1] */
    /* JADX WARN: Type inference failed for: r9v12, types: [org.telegram.ui.Cells.w0] */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Cells.t1 t1Var2;
        qn qnVar = this.M;
        if (i9 == 0) {
            t1Var = new org.telegram.ui.Cells.t1(this.h, ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount, true, qnVar.xa, qnVar.aa);
            t1Var.setResourcesProvider(qnVar.aa);
            if (qnVar.lc == null) {
                qnVar.lc = new cn(qnVar);
            }
            t1Var.setDelegate(qnVar.lc);
            t1Var.Ld = qnVar.Lb;
            if (qnVar.h == null) {
                t1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i9 == 1) {
                ?? qlVar = new ql(context, qnVar.aa, true);
                qlVar.setInvalidateColors(true);
                qlVar.setDelegate(new tl(this));
                t1Var = qlVar;
            } else {
                if (i9 == 2) {
                    t1Var2 = new org.telegram.ui.Cells.v1(context, qnVar.aa);
                } else if (i9 == 3) {
                    ?? ulVar = new ul(this, context, ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount, qnVar.aa);
                    ulVar.setDelegate(new b1(this, 20));
                    t1Var2 = ulVar;
                } else if (i9 == 4) {
                    t1Var2 = new org.telegram.ui.Cells.z0(context, qnVar.aa);
                } else if (i9 == 6) {
                    t1Var2 = new org.telegram.ui.Cells.xa(context, ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount, qnVar.aa);
                } else if (i9 == 7) {
                    t1Var2 = new org.telegram.ui.Cells.w0(context, qnVar.aa, false);
                } else if (i9 == 8) {
                    t1Var2 = new vl(this, context, ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount, qnVar.aa);
                } else if (i9 == 10) {
                    ?? u1Var = new org.telegram.ui.Cells.u1(context, qnVar.aa);
                    if (qnVar.lc == null) {
                        qnVar.lc = new cn(qnVar);
                    }
                    u1Var.setDelegate(qnVar.lc);
                    t1Var2 = u1Var;
                } else {
                    t1Var = null;
                }
                t1Var = t1Var2;
            }
        }
        return j3.r0.s(t1Var, t1Var, -1, -2);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        TLRPC.Message message;
        boolean z10;
        boolean z11;
        byte[] bArr;
        Integer num;
        String str;
        String stickerEmoji;
        MessagesController.EmojiSound emojiSound;
        View view = q1Var.a;
        boolean z12 = view instanceof org.telegram.ui.Cells.t1;
        qn qnVar = this.M;
        if (z12 || (view instanceof org.telegram.ui.Cells.w0)) {
            qnVar.r9();
        }
        boolean z13 = view instanceof org.telegram.ui.Cells.t1;
        if (z13) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            MessageObject messageObject = t1Var.getMessageObject();
            t1Var.A8 = qnVar.t9();
            t1Var.B8 = qnVar.C9();
            t1Var.C8 = qnVar.B9();
            t1Var.D8 = qnVar.Q8();
            t1Var.E8 = qnVar.R8();
            t1Var.g4(-1, true, false);
            MessageObject messageObject2 = qnVar.C3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                t1Var.g4(qnVar.D3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = qnVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                qnVar.getMediaController().playEmojiSound(qnVar.getAccountInstance(), stickerEmoji, emojiSound, true);
            }
            if (messageObject.updateTranslation(false)) {
                t1Var.X3(messageObject, t1Var.getCurrentMessagesGroup(), t1Var.m3(), t1Var.n3(), t1Var.h3(), t1Var.j3());
            } else {
                MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    for (int i9 = 0; i9 < currentMessagesGroup.messages.size(); i9++) {
                        currentMessagesGroup.messages.get(i9).updateTranslation();
                    }
                }
            }
            if (((org.telegram.ui.ActionBar.o2) qnVar).actionBar.s() || qnVar.A9()) {
                qnVar.J7 = false;
                qnVar.K7 = 0L;
                qnVar.L7 = null;
                ArrayList arrayList = qnVar.W3;
                t1Var.J3(arrayList == null || !arrayList.contains(messageObject), false);
                int i10 = messageObject.getDialogId() == qnVar.P5 ? 0 : 1;
                if (qnVar.S5[i10].indexOfKey(messageObject.getId()) >= 0) {
                    qnVar.hb(messageObject, t1Var, i10, false);
                    z10 = true;
                } else {
                    t1Var.setDrawSelectionBackground(false);
                    t1Var.L3(false, false, false);
                    z10 = false;
                }
                z11 = true;
            } else {
                t1Var.setDrawSelectionBackground(false);
                t1Var.L3(false, false, false);
                t1Var.J3(false, false);
                z10 = false;
                z11 = false;
            }
            t1Var.K3(!z11, z11 && z10);
            if (qnVar.N3 != 7 || qnVar.q3 == null || (str = qnVar.p3) == null) {
                ek ekVar = qnVar.N2;
                if (ekVar != null && ekVar.getVisibility() == 0) {
                    if (qnVar.getMediaDataController().isMessageFound(messageObject.getId(), messageObject.getDialogId() == qnVar.H6) && qnVar.getMediaDataController().getLastSearchQuery() != null) {
                        t1Var.S3(qnVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                t1Var.S3(null);
            } else {
                t1Var.S3(str);
            }
            if (!((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode || !t1Var.b8) {
                t1Var.setHighlighted(qnVar.H7 != Integer.MAX_VALUE && ((t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == qnVar.H7) || (t1Var.getCurrentMessagesGroup() != null && t1Var.getCurrentMessagesGroup().contains(qnVar.H7))));
                boolean z14 = t1Var.b8;
                if (z14 && qnVar.L7 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!t1Var.T3(qnVar.L7, true, qnVar.J7 || currentTimeMillis - qnVar.K7 < 200, qnVar.O7) && qnVar.I7) {
                        org.telegram.ui.Components.oc.a0(qnVar).Q(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    qnVar.I7 = false;
                    if (qnVar.J7) {
                        qnVar.K7 = currentTimeMillis;
                    }
                    qnVar.J7 = false;
                } else if (z14 && (num = qnVar.M7) != null) {
                    t1Var.R3(num.intValue());
                } else if (z14 && (bArr = qnVar.N7) != null) {
                    t1Var.P3(bArr);
                }
                if (qnVar.H7 != Integer.MAX_VALUE) {
                    qnVar.Zb();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            w0Var.a0 = qnVar.t9();
            w0Var.e0 = qnVar.C9();
            qnVar.B9();
            qnVar.Q8();
            w0Var.f0 = qnVar.R8();
        } else if (view instanceof org.telegram.ui.Cells.v1) {
            ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(qnVar.R8() / 2.0f);
        }
        int b10 = q1Var.b();
        int i11 = this.F;
        if (b10 < i11 || b10 >= this.G) {
            return;
        }
        MessageObject messageObject3 = (MessageObject) (this.H ? this.I : this.J ? this.L : qnVar.q6).get(b10 - i11);
        if (messageObject3 == null || (message = messageObject3.messageOwner) == null || !message.media_unread || !message.mentioned) {
            return;
        }
        if (!((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode && qnVar.N3 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
            int i12 = qnVar.h6 - 1;
            qnVar.h6 = i12;
            if (i12 <= 0) {
                qnVar.h6 = 0;
                qnVar.i6 = true;
                qnVar.Kb(false);
            } else {
                qnVar.f1.c(2, i12, true);
            }
            qnVar.getMessagesController().markMentionMessageAsRead(messageObject3.getId(), ChatObject.isChannel(qnVar.e) ? qnVar.e.id : 0L, qnVar.P5);
            messageObject3.setContentIsRead();
        }
        if (z13) {
            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
            if (((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode) {
                t1Var2.setHighlighted(true);
            } else {
                t1Var2.O3();
            }
        }
    }
}
