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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class em extends org.telegram.ui.Components.mk0 {
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
    public final /* synthetic */ tn M;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public em(tn tnVar, Context context) {
        this.M = tnVar;
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
        TLRPC.User user = tnVar.f;
        this.n = user != null && user.bot;
        C(true);
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    public final void K(boolean z10) {
        tn tnVar = this.M;
        if (UserObject.isBotForum(tnVar.f)) {
            if (z10) {
                tnVar.jc = true;
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
        tn tnVar = this.M;
        int childCount = tnVar.t0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = tnVar.t0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                if (s1Var.getMessageObject() == messageObject) {
                    s1Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean N() {
        tn tnVar = this.M;
        return UserObject.isBotForumWithEditableTopics(tnVar.f) && tnVar.b() == 0 && !tnVar.jc && tnVar.N3 == 0;
    }

    public final void O(boolean z10) {
        boolean z11;
        tn tnVar = this.M;
        ArrayList arrayList = tnVar.q6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + tnVar.K5);
        }
        if (z10 && tnVar.K5) {
            f2.u0 itemAnimator = tnVar.t0.getItemAnimator();
            nj njVar = tnVar.u0;
            if (itemAnimator != njVar) {
                tnVar.t0.setItemAnimator(njVar);
            }
        } else {
            tnVar.t0.setItemAnimator(null);
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
        boolean[] zArr = tnVar.y6;
        if ((zArr[0] && (tnVar.H6 == 0 || zArr[1])) || z11) {
            tnVar.L6(((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow);
        }
    }

    public final void P(int i10, boolean z10) {
        MessageObject messageObject;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i10);
            th.v(z10 ? " with thanos effect" : "", sb2);
        }
        tn tnVar = this.M;
        if (((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow) {
            f2.u0 itemAnimator = tnVar.t0.getItemAnimator();
            nj njVar = tnVar.u0;
            if (itemAnimator != njVar) {
                tnVar.t0.setItemAnimator(njVar);
            }
        } else {
            tnVar.t0.setItemAnimator(null);
        }
        if (z10 && tnVar.u0 != null) {
            f2.u0 itemAnimator2 = tnVar.t0.getItemAnimator();
            nj njVar2 = tnVar.u0;
            if (itemAnimator2 == njVar2) {
                f2.n1 K = tnVar.t0.K(i10);
                if (K == null) {
                    njVar2.getClass();
                } else {
                    njVar2.S.add(K);
                    View view = K.a;
                    if ((view instanceof org.telegram.ui.Cells.s1) && (messageObject = ((org.telegram.ui.Cells.s1) view).getMessageObject()) != null) {
                        messageObject.deletedByThanos = true;
                    }
                }
            }
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void Q(int i10) {
        int i11;
        tn tnVar = this.M;
        ArrayList arrayList = tnVar.q6;
        if (tnVar.v0 == null || this.H || this.J) {
            return;
        }
        int i12 = 0;
        if (!tnVar.z4 && tnVar.F7 != null) {
            int childCount = tnVar.t0.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                View childAt = tnVar.t0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                    MessageObject messageObject2 = tnVar.F7;
                    if (messageObject == messageObject2) {
                        if (arrayList.indexOf(messageObject2) >= 0) {
                            i11 = arrayList.indexOf(tnVar.F7) + this.F;
                            i12 = tnVar.L8(childAt);
                        }
                    }
                }
                i13++;
            }
        }
        i11 = -1;
        m(i10);
        if (i11 != -1) {
            tnVar.v0.h1(i11, i12);
        }
    }

    public final org.telegram.ui.Cells.s1 R(MessageObject messageObject, boolean z10, boolean z11) {
        tn tnVar = this.M;
        if (z10) {
            int childCount = tnVar.t0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = tnVar.t0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.getMessageObject() == messageObject && TextUtils.equals(s1Var.b7, s1Var.u7.messageOwner.post_author)) {
                        s1Var.X3(messageObject, s1Var.getCurrentMessagesGroup(), s1Var.m3(), s1Var.n3(), s1Var.h3(), s1Var.j3());
                        return s1Var;
                    }
                }
                i10++;
                messageObject = messageObject;
            }
        }
        MessageObject messageObject2 = messageObject;
        int indexOf = (this.H ? this.I : this.J ? this.L : tnVar.q6).indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (!z11) {
            Q(this.F + indexOf);
            return null;
        }
        int i11 = tn.Fc;
        tn.Fc = i11 + 1;
        messageObject2.stableId = i11;
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
        int i10;
        TLRPC.PeerSettings peerSettings;
        TLRPC.PeerSettings peerSettings2;
        int i11;
        int i12;
        tn tnVar = this.M;
        boolean[] zArr = tnVar.y6;
        this.r = 0;
        ArrayList arrayList = this.H ? this.I : this.J ? this.L : tnVar.q6;
        if (tnVar.N3 == 3 && tnVar.Ka) {
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
            int i13 = this.r;
            this.r = i13 + 1;
            this.E = i13;
        }
        if (arrayList.isEmpty()) {
            this.A = -5;
            this.B = -5;
            this.F = 0;
            this.G = 0;
            TLRPC.User user4 = tnVar.f;
            if (user4 != null && !UserObject.isBot(user4) && !UserObject.isReplyUser(tnVar.f)) {
                TLRPC.PeerSettings peerSettings3 = tnVar.getMessagesController().getPeerSettings(tnVar.f.id);
                int i14 = org.telegram.ui.Cells.ua.K;
                if (peerSettings3 != null && ((peerSettings3.phone_country != null || peerSettings3.registration_month != null) && !MessagesController.isSupportUser(tnVar.f) && tnVar.N3 == 0)) {
                    int i15 = this.r;
                    this.r = i15 + 1;
                    this.y = i15;
                    return;
                }
            }
            if (UserObject.isReplyUser(tnVar.f) || ((user = tnVar.f) != null && user.bot && !MessagesController.isSupportUser(user) && tnVar.N3 == 0)) {
                int i16 = this.r;
                this.r = i16 + 1;
                this.w = i16;
                return;
            }
            return;
        }
        if (!this.J) {
            boolean[] zArr2 = tnVar.A6;
            if ((!zArr2[0] || (tnVar.H6 != 0 && !zArr2[1])) && !tnVar.B6) {
                int i17 = this.r;
                this.r = i17 + 1;
                this.B = i17;
                int i18 = this.r;
                this.F = i18;
                int size = arrayList.size() + i18;
                this.r = size;
                this.G = size;
                user2 = tnVar.f;
                if (user2 != null && !UserObject.isBot(user2) && !UserObject.isReplyUser(tnVar.f)) {
                    peerSettings = tnVar.getMessagesController().getPeerSettings(tnVar.f.id);
                    int i19 = org.telegram.ui.Cells.ua.K;
                    if (peerSettings != null && ((peerSettings.phone_country != null || peerSettings.registration_month != null) && !MessagesController.isSupportUser(tnVar.f) && tnVar.N3 == 0 && zArr[0])) {
                        peerSettings2 = tnVar.getMessagesController().getPeerSettings(tnVar.f.id);
                        i11 = peerSettings2.name_change_date;
                        if (i11 != 0 || (i12 = peerSettings2.photo_change_date) == 0) {
                            if (i11 != 0) {
                                int i20 = this.r;
                                this.r = i20 + 1;
                                this.D = i20;
                            }
                            if (peerSettings2.photo_change_date != 0) {
                                int i21 = this.r;
                                this.r = i21 + 1;
                                this.C = i21;
                            }
                        } else if (i11 < i12) {
                            int i22 = this.r;
                            this.D = i22;
                            this.r = i22 + 2;
                            this.C = i22 + 1;
                        } else {
                            int i23 = this.r;
                            this.C = i23;
                            this.r = i23 + 2;
                            this.D = i23 + 1;
                        }
                        int i24 = this.r;
                        this.r = i24 + 1;
                        this.y = i24;
                        i10 = tnVar.N3;
                        if (i10 == 9) {
                            int i25 = this.r;
                            this.s = i25;
                            this.r = i25 + 2;
                            this.v = i25 + 1;
                        }
                        if (i10 == 5 && !sf.s1.g(tnVar.M3)) {
                            int i26 = this.r;
                            this.r = i26 + 1;
                            this.s = i26;
                        }
                        if (this.J ? !(!(zArr[0] && (tnVar.H6 == 0 || zArr[1])) && (AndroidUtilities.isTablet() || tnVar.c4 || tnVar.f != null)) : this.K) {
                            this.A = -5;
                            return;
                        }
                        int i27 = this.r;
                        this.r = i27 + 1;
                        this.A = i27;
                        return;
                    }
                }
                if ((!UserObject.isReplyUser(tnVar.f) || ((user3 = tnVar.f) != null && user3.bot && !MessagesController.isSupportUser(user3) && tnVar.N3 == 0)) && zArr[0]) {
                    int i28 = this.r;
                    this.r = i28 + 1;
                    this.w = i28;
                }
                i10 = tnVar.N3;
                if (i10 == 9) {
                }
                if (i10 == 5) {
                    int i262 = this.r;
                    this.r = i262 + 1;
                    this.s = i262;
                }
                if (this.J) {
                    int i272 = this.r;
                    this.r = i272 + 1;
                    this.A = i272;
                    return;
                } else {
                    int i2722 = this.r;
                    this.r = i2722 + 1;
                    this.A = i2722;
                    return;
                }
            }
        }
        this.B = -5;
        int i182 = this.r;
        this.F = i182;
        int size2 = arrayList.size() + i182;
        this.r = size2;
        this.G = size2;
        user2 = tnVar.f;
        if (user2 != null) {
            peerSettings = tnVar.getMessagesController().getPeerSettings(tnVar.f.id);
            int i192 = org.telegram.ui.Cells.ua.K;
            if (peerSettings != null) {
                peerSettings2 = tnVar.getMessagesController().getPeerSettings(tnVar.f.id);
                i11 = peerSettings2.name_change_date;
                if (i11 != 0) {
                }
                if (i11 != 0) {
                }
                if (peerSettings2.photo_change_date != 0) {
                }
                int i242 = this.r;
                this.r = i242 + 1;
                this.y = i242;
                i10 = tnVar.N3;
                if (i10 == 9) {
                }
                if (i10 == 5) {
                }
                if (this.J) {
                }
            }
        }
        if (!UserObject.isReplyUser(tnVar.f)) {
        }
        int i282 = this.r;
        this.r = i282 + 1;
        this.w = i282;
        i10 = tnVar.N3;
        if (i10 == 9) {
        }
        if (i10 == 5) {
        }
        if (this.J) {
        }
    }

    public final void T() {
        int i10 = this.r;
        int i11 = this.w;
        int i12 = this.y;
        int i13 = this.s;
        int i14 = this.v;
        int i15 = this.A;
        int i16 = this.B;
        int i17 = this.F;
        int i18 = this.G;
        int i19 = this.C;
        int i20 = this.D;
        int i21 = this.E;
        S();
        if (i10 == this.r && i11 == this.w && i15 == this.A && i16 == this.B && i17 == this.F && i18 == this.G && i13 == this.s && i14 == this.v && i12 == this.y && i19 == this.C && i20 == this.D && i21 == this.E) {
            return;
        }
        O(false);
    }

    @Override // f2.p0
    public final int h() {
        this.x = -5;
        tn tnVar = this.M;
        a0.h hVar = tnVar.Z7;
        if (tnVar.I5.get(tnVar.Z3, 0) == 0) {
            return this.r;
        }
        TLRPC.User user = tnVar.f;
        if (user == null || !user.bot || tnVar.N3 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(tnVar.f.id)).description == null && ((TL_bots.BotInfo) hVar.f(tnVar.f.id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(tnVar.f.id)).description_document == null)) && !UserObject.isReplyUser(tnVar.f) && !UserObject.isBotForum(tnVar.f))) {
            return 0;
        }
        this.x = 0;
        return 1;
    }

    @Override // f2.p0
    public final long i(int i10) {
        tn tnVar = this.M;
        if (tnVar.I5.get(tnVar.Z3, 0) != 0 && i10 == this.x) {
            return 1L;
        }
        ArrayList arrayList = this.H ? this.I : this.J ? this.L : tnVar.q6;
        if (i10 >= this.F && i10 < this.G) {
            return ((MessageObject) arrayList.get(i10 - r1)).stableId;
        }
        if (i10 == this.w || i10 == this.x) {
            return 1L;
        }
        if (i10 == this.A) {
            return 2L;
        }
        if (i10 == this.B) {
            return 3L;
        }
        if (i10 == this.s) {
            return 4L;
        }
        if (i10 == this.y) {
            return 6L;
        }
        if (i10 == this.C) {
            return 7L;
        }
        if (i10 == this.D) {
            return 8L;
        }
        if (i10 == this.E) {
            return 9L;
        }
        return i10 == this.v ? 10L : 5L;
    }

    @Override // f2.p0
    public final int j(int i10) {
        tn tnVar = this.M;
        if (tnVar.I5.get(tnVar.Z3, 0) != 0 && i10 == this.x) {
            return 3;
        }
        if (i10 == this.s || i10 == this.v) {
            return 1;
        }
        int i11 = this.F;
        if (i10 >= i11 && i10 < this.G) {
            return ((MessageObject) (this.H ? this.I : this.J ? this.L : tnVar.q6).get(i10 - i11)).contentType;
        }
        if (i10 == this.w) {
            return 3;
        }
        if (i10 == this.y) {
            return 6;
        }
        if (i10 == this.D || i10 == this.C) {
            return 7;
        }
        return i10 == this.E ? 8 : 4;
    }

    @Override // org.telegram.ui.Components.mk0, f2.p0
    public final void l() {
        O(false);
    }

    @Override // org.telegram.ui.Components.mk0, f2.p0
    public final void m(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item changed " + i10);
        }
        tn tnVar = this.M;
        if (!((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow || tnVar.J0) {
            tnVar.t0.setItemAnimator(null);
        } else {
            f2.u0 itemAnimator = tnVar.t0.getItemAnimator();
            nj njVar = tnVar.u0;
            if (itemAnimator != njVar) {
                tnVar.t0.setItemAnimator(njVar);
            }
        }
        S();
        try {
            super.m(i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.mk0, f2.p0
    public final void o(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item inserted " + i10);
        }
        tn tnVar = this.M;
        if (((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow) {
            f2.u0 itemAnimator = tnVar.t0.getItemAnimator();
            nj njVar = tnVar.u0;
            if (itemAnimator != njVar) {
                tnVar.t0.setItemAnimator(njVar);
            }
        } else {
            tnVar.t0.setItemAnimator(null);
        }
        S();
        try {
            super.o(i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // f2.p0
    public final void p(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item moved" + i10 + ":" + i11);
        }
        tn tnVar = this.M;
        if (((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow) {
            f2.u0 itemAnimator = tnVar.t0.getItemAnimator();
            nj njVar = tnVar.u0;
            if (itemAnimator != njVar) {
                tnVar.t0.setItemAnimator(njVar);
            }
        } else {
            tnVar.t0.setItemAnimator(null);
        }
        S();
        try {
            super.p(i10, i11);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.mk0, f2.p0
    public final void q(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range changed " + i10 + ":" + i11);
        }
        tn tnVar = this.M;
        if (((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow) {
            f2.u0 itemAnimator = tnVar.t0.getItemAnimator();
            nj njVar = tnVar.u0;
            if (itemAnimator != njVar) {
                tnVar.t0.setItemAnimator(njVar);
            }
        } else {
            tnVar.t0.setItemAnimator(null);
        }
        S();
        try {
            super.q(i10, i11);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.mk0, f2.p0
    public final void s(int i10, int i11) {
        int i12;
        int i13;
        tn tnVar = this.M;
        ArrayList arrayList = tnVar.q6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        if (((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow) {
            f2.u0 itemAnimator = tnVar.t0.getItemAnimator();
            nj njVar = tnVar.u0;
            if (itemAnimator != njVar) {
                tnVar.t0.setItemAnimator(njVar);
            }
        } else {
            tnVar.t0.setItemAnimator(null);
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.F) && i12 < this.G) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.F) - 1);
            if ((tnVar.e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (tnVar.f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
                m(i10);
            }
        }
        try {
            super.s(i10, i11);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.mk0, f2.p0
    public final void t(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range removed" + i10 + ":" + i11);
        }
        tn tnVar = this.M;
        if (((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow) {
            f2.u0 itemAnimator = tnVar.t0.getItemAnimator();
            nj njVar = tnVar.u0;
            if (itemAnimator != njVar) {
                tnVar.t0.setItemAnimator(njVar);
            }
        } else {
            tnVar.t0.setItemAnimator(null);
        }
        S();
        try {
            super.t(i10, i11);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.mk0, f2.p0
    public final void u(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item removed " + i10);
        }
        tn tnVar = this.M;
        if (((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow) {
            f2.u0 itemAnimator = tnVar.t0.getItemAnimator();
            nj njVar = tnVar.u0;
            if (itemAnimator != njVar) {
                tnVar.t0.setItemAnimator(njVar);
            }
        } else {
            tnVar.t0.setItemAnimator(null);
        }
        S();
        try {
            super.u(i10);
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
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.n1 n1Var, int i10) {
        TLRPC.UserFull userFull;
        TLObject tLObject;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        ArrayList arrayList;
        long j10;
        int i14;
        int i15;
        boolean z12;
        boolean z13;
        boolean z14;
        int j11;
        boolean z15;
        boolean z16;
        ArrayList arrayList2;
        int i16;
        int i17;
        boolean z17;
        boolean z18;
        int i18;
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
        nj njVar;
        MessageObject.SendAnimationData sendAnimationData;
        dk dkVar;
        int i19;
        int i20;
        boolean z27;
        xk xkVar;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str2;
        boolean z28;
        long j12;
        long j13;
        long j14;
        MessageObject messageObject;
        String str3;
        int i21;
        boolean z29;
        TLRPC.ChatFull chatFull;
        View view = n1Var.a;
        tn tnVar = this.M;
        a0.h hVar = tnVar.Z7;
        ArrayList arrayList3 = tnVar.q4;
        HashMap hashMap = tnVar.r4;
        boolean z30 = false;
        if (i10 == this.w || i10 == this.x) {
            org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) view;
            if (UserObject.isReplyUser(tnVar.f)) {
                h0Var.b(false, 0L, LocaleController.getString(R.string.RepliesChatInfo), null, null, null);
            } else {
                TLRPC.User user = tnVar.f;
                if (user == null || user.id != UserObject.VERIFY) {
                    TL_bots.BotInfo botInfo = hVar.m() != 0 ? (TL_bots.BotInfo) hVar.f(tnVar.f.id) : null;
                    boolean z31 = (botInfo == null || (TextUtils.isEmpty(botInfo.description) && botInfo.description_photo == null && botInfo.description_document == null)) && UserObject.isBot(tnVar.f) && (userFull = tnVar.W7) != null && userFull.bot_manager_id != 0 && tnVar.f.bot_can_edit;
                    TLRPC.User user2 = tnVar.f;
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
                    h0Var.b(true, j15, str4, tLObject, botInfo, z31 ? DialogObject.getName(((org.telegram.ui.ActionBar.o2) tnVar).currentAccount, tnVar.W7.bot_manager_id) : null);
                } else {
                    h0Var.b(false, 0L, LocaleController.getString(R.string.VerifyChatInfo), null, null, null);
                }
            }
            tn.b4(tnVar, h0Var);
            return;
        }
        if (i10 == this.E) {
            ((org.telegram.ui.Cells.b0) view).setDialogId(tnVar.a());
            return;
        }
        if (i10 == this.y) {
            org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
            TLRPC.EncryptedChat encryptedChat = tnVar.h;
            long a2 = encryptedChat != null ? encryptedChat.user_id : tnVar.a();
            uaVar.b(a2, tnVar.getMessagesController().getPeerSettings(a2));
            return;
        }
        if (i10 == this.B || i10 == this.A) {
            ((org.telegram.ui.Cells.y0) view).setProgressVisible(tnVar.F6 > 1);
            return;
        }
        if (i10 == this.D) {
            if (tnVar.getMessagesController().getPeerSettings(tnVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.v0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedName, LocaleController.formatRelativeDate(tnVar.getConnectionsManager().getCurrentTime() - r1.name_change_date)));
            return;
        }
        if (i10 == this.C) {
            if (tnVar.getMessagesController().getPeerSettings(tnVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.v0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedPhoto, LocaleController.formatRelativeDate(tnVar.getConnectionsManager().getCurrentTime() - r1.photo_change_date)));
            return;
        }
        if (i10 == this.s) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            tn.d4(tnVar);
            v0Var.setMessageObject(tnVar.E3);
            int i22 = tnVar.N3;
            if (i22 == 3) {
                v0Var.setCustomText(LocaleController.getString(R.string.SavedMessagesProfileHint));
            } else if (i22 == 5) {
                v0Var.setCustomText(LocaleController.getString(R.string.BusinessRepliesHint));
            } else if (i22 == 9) {
                v0Var.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint2));
            }
            v0Var.setAlpha(1.0f);
            v0Var.setSpoilersSuppressed(tnVar.t0.getScrollState() != 0);
            return;
        }
        if (i10 == this.v) {
            org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) view;
            tn.e4(tnVar);
            v0Var2.setMessageObject(tnVar.F3);
            v0Var2.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint));
            v0Var2.setAlpha(1.0f);
            v0Var2.setSpoilersSuppressed(tnVar.t0.getScrollState() != 0);
            return;
        }
        int i23 = this.F;
        if (i10 < i23 || i10 >= this.G) {
            return;
        }
        ArrayList arrayList4 = this.H ? this.I : this.J ? this.L : tnVar.q6;
        MessageObject messageObject2 = (MessageObject) arrayList4.get(i10 - i23);
        if (!(view instanceof org.telegram.ui.Cells.s1)) {
            ArrayList arrayList5 = arrayList4;
            MessageObject messageObject3 = null;
            if (!(view instanceof org.telegram.ui.Cells.v0)) {
                if (view instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.setText(LocaleController.getString(R.string.UnreadMessages));
                    u1Var.getTextView().setTranslationX(tnVar.R8() / 2.0f);
                    if (tnVar.z7 != 0) {
                        tnVar.z7 = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            if ((messageObject2 == null || !messageObject2.isDateObject) && (i12 = (i11 = i10 + 1) - this.F) >= 0 && i12 < arrayList5.size()) {
                MessageObject messageObject4 = (MessageObject) arrayList5.get(i11 - this.F);
                if (messageObject4 == null || !messageObject4.isDateObject) {
                    messageObject3 = messageObject4;
                } else {
                    int i24 = i10 + 2;
                    int i25 = i24 - this.F;
                    if (i25 >= 0 && i25 < arrayList5.size()) {
                        messageObject3 = (MessageObject) arrayList5.get(i24 - this.F);
                    }
                }
                if (messageObject3 == null || (messageObject2 != null && messageObject3.getTopicId() != messageObject2.getTopicId())) {
                    z10 = true;
                    org.telegram.ui.Cells.v0 v0Var3 = (org.telegram.ui.Cells.v0) view;
                    v0Var3.a0 = tnVar.t9();
                    v0Var3.e0 = tnVar.C9();
                    tnVar.B9();
                    tnVar.Q8();
                    v0Var3.f0 = tnVar.R8();
                    v0Var3.b0 = ChatObject.isForum(tnVar.e);
                    v0Var3.c0 = ChatObject.isMonoForum(tnVar.e);
                    v0Var3.d0 = UserObject.isBotForum(tnVar.f);
                    boolean z32 = v0Var3.g0 == z10;
                    v0Var3.g0 = z10;
                    v0Var3.U(messageObject2, z32);
                    v0Var3.setAlpha(1.0f);
                    v0Var3.setShowTopic(true);
                    v0Var3.setSpoilersSuppressed(tnVar.t0.getScrollState() == 0);
                    return;
                }
            }
            z10 = false;
            org.telegram.ui.Cells.v0 v0Var32 = (org.telegram.ui.Cells.v0) view;
            v0Var32.a0 = tnVar.t9();
            v0Var32.e0 = tnVar.C9();
            tnVar.B9();
            tnVar.Q8();
            v0Var32.f0 = tnVar.R8();
            v0Var32.b0 = ChatObject.isForum(tnVar.e);
            v0Var32.c0 = ChatObject.isMonoForum(tnVar.e);
            v0Var32.d0 = UserObject.isBotForum(tnVar.f);
            if (v0Var32.g0 == z10) {
            }
            v0Var32.g0 = z10;
            v0Var32.U(messageObject2, z32);
            v0Var32.setAlpha(1.0f);
            v0Var32.setShowTopic(true);
            v0Var32.setSpoilersSuppressed(tnVar.t0.getScrollState() == 0);
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
        MessageObject.GroupedMessages X8 = tnVar.X8(messageObject2);
        s1Var.J7 = tnVar.e != null || UserObject.isUserSelf(tnVar.f) || UserObject.isReplyUser(tnVar.f) || tnVar.N3 == 7;
        s1Var.y.a(false, false);
        s1Var.K7 = UserObject.isBotForum(tnVar.f);
        s1Var.W7 = tnVar.A9();
        int i26 = tnVar.N3;
        s1Var.L7 = i26 == 3;
        s1Var.M7 = i26 == 3 && tnVar.Ka;
        TLRPC.User user3 = tnVar.f;
        s1Var.N7 = user3 != null && user3.bot;
        s1Var.O7 = ChatObject.isChannel(tnVar.e) && tnVar.e.megagroup;
        s1Var.P7 = ChatObject.isForum(tnVar.e);
        s1Var.Q7 = ChatObject.isMonoForum(tnVar.e);
        s1Var.R7 = ChatObject.isForum(tnVar.e) && tnVar.d4 && tnVar.b() == 1;
        s1Var.S7 = (tnVar.Z3 != 0 || (s1Var.P7 && tnVar.d4)) && !s1Var.Q7;
        int i27 = tnVar.N3;
        if (i27 != 1 && i27 != 9 && ChatObject.isChannel(tnVar.e)) {
            TLRPC.Chat chat = tnVar.e;
            if (chat.has_link && !chat.megagroup) {
                z11 = true;
                s1Var.T7 = z11;
                s1Var.U7 = tnVar.N3 != 0 && (tnVar.F4.containsKey(Integer.valueOf(messageObject2.getId())) || !(X8 == null || X8.messages.isEmpty() || !tnVar.F4.containsKey(Integer.valueOf(X8.messages.get(0).getId()))));
                i13 = tnVar.N3;
                if (i13 != 1 || i13 == 9 || (chatFull = tnVar.V7) == null) {
                    arrayList = arrayList4;
                    j10 = 0;
                } else {
                    arrayList = arrayList4;
                    j10 = chatFull.linked_chat_id;
                }
                s1Var.X7 = j10;
                if (i13 == 7 || tnVar.K3 != 1) {
                    s1Var.Y7 = UserObject.isReplyUser(tnVar.f);
                } else {
                    s1Var.Y7 = UserObject.isReplyUser(messageObject2.getDialogId());
                }
                s1Var.Z7 = tnVar.N3 != 2;
                s1Var.A8 = tnVar.t9();
                s1Var.B8 = tnVar.C9();
                s1Var.C8 = tnVar.B9();
                s1Var.D8 = tnVar.Q8();
                s1Var.E8 = tnVar.R8();
                if (messageObject2.isSponsored()) {
                    AndroidUtilities.doOnPreDraw(s1Var, new ag.o0(25));
                }
                int i28 = i10 + 2;
                if (X8 == null) {
                    MessageObject.GroupedMessagePosition position = X8.getPosition(messageObject2);
                    if (position != null) {
                        if (X8.isDocuments) {
                            int indexOf2 = X8.posArray.indexOf(position) + i10 + 1;
                            int indexOf3 = X8.posArray.indexOf(position) + (i10 - X8.posArray.size());
                            i15 = indexOf2;
                            z13 = false;
                            z14 = false;
                            i14 = indexOf3;
                            z12 = false;
                        } else {
                            if ((position.flags & 4) != 0) {
                                i21 = X8.reversed ? X8.posArray.indexOf(position) + (i10 - X8.posArray.size()) : X8.posArray.indexOf(position) + i10 + 1;
                                z12 = false;
                                z29 = false;
                            } else {
                                z12 = true;
                                i21 = -100;
                                z29 = true;
                            }
                            if ((position.flags & 8) != 0) {
                                int i29 = i21;
                                i14 = X8.reversed ? X8.posArray.indexOf(position) + i10 + 1 : X8.posArray.indexOf(position) + (i10 - X8.posArray.size());
                                i15 = i29;
                                z30 = z29;
                                z13 = false;
                                z14 = false;
                            } else {
                                i15 = i21;
                                z30 = z29;
                                i14 = -100;
                                z13 = true;
                                z14 = true;
                            }
                        }
                        int j16 = j(i14);
                        boolean z33 = z12;
                        j11 = j(i15);
                        j(i28);
                        if ((messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && j16 == n1Var.f) {
                            arrayList2 = arrayList;
                            MessageObject messageObject5 = (MessageObject) arrayList2.get(i14 - this.F);
                            i16 = i15;
                            boolean z34 = messageObject5.isOutOwner() == messageObject2.isOutOwner() && (Math.abs(messageObject5.messageOwner.date - messageObject2.messageOwner.date) <= 300 || tnVar.N3 == 9);
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
                                    } else if (tnVar.e != null) {
                                        long fromChatId = messageObject5.getFromChatId();
                                        z34 = fromChatId == messageObject2.getFromChatId();
                                        if (!z15) {
                                            if (z34) {
                                                if (fromChatId < 0) {
                                                    if (tnVar.e.megagroup) {
                                                    }
                                                }
                                            }
                                        }
                                        if (DialogObject.getPeerDialogId(messageObject5.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    } else {
                                        if (UserObject.isUserSelf(tnVar.f) || UserObject.isReplyUser(tnVar.f)) {
                                            if (!messageObject2.isPrivateForward()) {
                                                if (!messageObject5.isPrivateForward()) {
                                                }
                                            }
                                        } else if (tnVar.N3 == 7) {
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
                            i16 = i15;
                        }
                        i17 = i16 - this.F;
                        if (i17 >= 0 && i17 < arrayList2.size()) {
                            messageObject = (MessageObject) arrayList2.get(i16 - this.F);
                            if (messageObject != null && messageObject.isDateObject) {
                                int i30 = i16 + 1;
                                int i31 = i30 - this.F;
                                messageObject = (i31 >= 0 || i31 >= arrayList2.size()) ? null : (MessageObject) arrayList2.get(i30 - this.F);
                            }
                            if (messageObject != null && messageObject.getTopicId() == messageObject2.getTopicId()) {
                                z17 = z16;
                                z18 = false;
                                i18 = this.F;
                                if (i10 == i18) {
                                    z19 = z15;
                                    z20 = true;
                                } else {
                                    z19 = z15;
                                    z20 = false;
                                }
                                if (j11 == n1Var.f) {
                                    MessageObject messageObject6 = (MessageObject) arrayList2.get(i16 - i18);
                                    boolean z35 = !(messageObject6.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && messageObject6.isOutOwner() == messageObject2.isOutOwner() && (Math.abs(messageObject6.messageOwner.date - messageObject2.messageOwner.date) <= 300 || tnVar.N3 == 9);
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
                                    } else if (tnVar.e != null) {
                                        long fromChatId2 = messageObject6.getFromChatId();
                                        boolean z36 = (fromChatId2 != messageObject2.getFromChatId() || messageObject2.isImportedForward() || messageObject6.isImportedForward()) ? false : true;
                                        if (!z17 && z36 && fromChatId2 < 0 && tnVar.e.megagroup && tnVar.N3 != 9) {
                                            z36 = false;
                                        }
                                        if (z36 && tnVar.v9()) {
                                            TLRPC.TL_forumTopic tL_forumTopic = messageObject2.replyToForumTopic;
                                            if (tL_forumTopic == null) {
                                                z28 = true;
                                                j12 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.o2) tnVar).currentAccount, messageObject2.messageOwner, true);
                                            } else {
                                                z28 = true;
                                                j12 = tL_forumTopic.id;
                                            }
                                            TLRPC.TL_forumTopic tL_forumTopic2 = messageObject6.replyToForumTopic;
                                            if (tL_forumTopic2 == null) {
                                                z21 = z19;
                                                j13 = j12;
                                                j14 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.o2) tnVar).currentAccount, messageObject6.messageOwner, z28);
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
                                        if (UserObject.isUserSelf(tnVar.f) || UserObject.isReplyUser(tnVar.f)) {
                                            if (!messageObject2.isPrivateForward()) {
                                                if (!messageObject6.isPrivateForward()) {
                                                }
                                            }
                                            z22 = false;
                                        } else if (tnVar.N3 != 7) {
                                            z22 = z35;
                                        }
                                        if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    }
                                } else {
                                    z21 = z19;
                                    z22 = z33;
                                }
                                if (ChatObject.isChannel(tnVar.e) && tnVar.e.megagroup && messageObject2.getFromChatId() <= 0 && (messageFwdHeader = messageObject2.messageOwner.fwd_from) != null && (messageFwdHeader.saved_from_peer instanceof TLRPC.TL_peerChannel)) {
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
                                    int i32 = 0;
                                    while (i32 < X8.messages.size()) {
                                        X8.messages.get(i32).updateTranslation(z37);
                                        i32++;
                                        z37 = false;
                                    }
                                }
                                if (!tnVar.La) {
                                    z23 = z22;
                                    z24 = z14;
                                } else {
                                    if (X8 != null) {
                                        z25 = true;
                                        z24 = false;
                                        z23 = false;
                                        s1Var.setShowTopic(z25);
                                        s1Var.X3(messageObject2, X8, z24, z23, z18, z20);
                                        s1Var.setSpoilersSuppressed(tnVar.t0.getScrollState() == 0);
                                        s1Var.setHighlighted(tnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == tnVar.H7);
                                        z26 = s1Var.b8;
                                        if (!z26 && tnVar.L7 != null) {
                                            long currentTimeMillis = System.currentTimeMillis();
                                            s1Var.T3(tnVar.L7, true, tnVar.J7 || currentTimeMillis - tnVar.K7 < 200, tnVar.O7);
                                            if (tnVar.J7) {
                                                tnVar.K7 = currentTimeMillis;
                                            }
                                            tnVar.J7 = false;
                                        } else if (!z26 && (num = tnVar.M7) != null) {
                                            s1Var.R3(num.intValue());
                                        } else if (!z26 && (bArr = tnVar.N7) != null) {
                                            s1Var.P3(bArr);
                                        } else if (tnVar.N3 == 7 && tnVar.q3 != null && (str = tnVar.p3) != null) {
                                            s1Var.S3(str);
                                        }
                                        if (tnVar.H7 != Integer.MAX_VALUE) {
                                            tnVar.Zb();
                                        }
                                        indexOf = arrayList3.indexOf(messageObject2);
                                        if (indexOf != -1) {
                                            if (messageObject2.type == 5 && (xkVar = tnVar.X2) != null && xkVar.getTextureView() != null) {
                                                ee eeVar = tnVar.m7;
                                                if (eeVar != null) {
                                                    AndroidUtilities.cancelRunOnUIThread(eeVar);
                                                    tnVar.m7 = null;
                                                }
                                                s1Var.getViewTreeObserver().addOnPreDrawListener(new fh.f(1, this, s1Var));
                                            } else if ((messageObject2.isAnyKindOfSticker() && !messageObject2.isAnimatedEmojiStickers()) || ((sendAnimationData = messageObject2.sendAnimationData) != null && sendAnimationData.fromPreview)) {
                                                if (!messageObject2.sendAnimationData.fromPreview || (dkVar = tnVar.U) == null || dkVar.H0 == null) {
                                                    s1Var.getViewTreeObserver().addOnPreDrawListener(new dm(this, s1Var));
                                                } else {
                                                    if (((org.telegram.ui.ActionBar.o2) tnVar).actionBar.getVisibility() == 0) {
                                                        int measuredHeight = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar.getMeasuredHeight() + ((int) ((org.telegram.ui.ActionBar.o2) tnVar).actionBar.getTranslationY());
                                                        pk pkVar = tnVar.k1;
                                                        int currentHeight = measuredHeight + (pkVar != null ? pkVar.getCurrentHeight() : 0);
                                                        bk bkVar = tnVar.l1;
                                                        i19 = (((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode ? AndroidUtilities.statusBarHeight : 0) + currentHeight + (bkVar != null ? bkVar.getCurrentHeight() : 0);
                                                    } else {
                                                        i19 = 0;
                                                    }
                                                    float f9 = i19 + tnVar.p9;
                                                    float height = tnVar.fragmentView == null ? 0.0f : r9.getHeight();
                                                    org.telegram.ui.Components.ff ffVar = tnVar.U.H0;
                                                    Rect rect = ffVar.q0;
                                                    if (!ffVar.m0) {
                                                        ffVar.s = true;
                                                        ffVar.m0 = true;
                                                        xh0 xh0Var = ffVar.T;
                                                        if (xh0Var != null) {
                                                            xh0Var.invalidate();
                                                        }
                                                        org.telegram.ui.Components.og ogVar = ffVar.S;
                                                        if (ogVar != null) {
                                                            ogVar.invalidate();
                                                        }
                                                        if (ffVar.M != null) {
                                                            ffVar.n0 = s1Var;
                                                            s1Var.setVisibility(4);
                                                            ffVar.o0 = f9;
                                                            ffVar.p0 = height;
                                                            org.telegram.ui.Cells.s1 s1Var2 = ffVar.M;
                                                            org.telegram.ui.Cells.s1 s1Var3 = ffVar.n0;
                                                            s1Var2.J7 = s1Var3.J7;
                                                            s1Var2.S7 = s1Var3.S7;
                                                            s1Var2.L7 = s1Var3.L7;
                                                            s1Var2.N7 = s1Var3.N7;
                                                            s1Var2.P7 = s1Var3.P7;
                                                            s1Var2.R7 = s1Var3.R7;
                                                            s1Var2.X3(s1Var.getMessageObject(), null, s1Var.m3(), s1Var.n3(), s1Var.h3(), false);
                                                            org.telegram.ui.Cells.r1 transitionParams = ffVar.M.getTransitionParams();
                                                            transitionParams.g = ffVar.M.getTransitionParams().f();
                                                            Rect rect2 = transitionParams.D0;
                                                            transitionParams.K1 = 0.0f;
                                                            if (ffVar.M.getTransitionParams().D0.left == ffVar.M.getBackgroundDrawableLeft() && rect2.top == ffVar.M.getBackgroundDrawableTop() && rect2.bottom == ffVar.M.getBackgroundDrawableBottom()) {
                                                                i20 = 1;
                                                            } else {
                                                                rect.bottom = -(ffVar.M.getBackgroundDrawableBottom() - rect2.bottom);
                                                                rect.top = -(ffVar.M.getBackgroundDrawableTop() - rect2.top);
                                                                if (s1Var.getMessageObject().isOutOwner()) {
                                                                    rect.left = -(ffVar.M.getBackgroundDrawableLeft() - rect2.left);
                                                                    rect.right = 0;
                                                                } else {
                                                                    rect.left = 0;
                                                                    rect.right = ffVar.M.getBackgroundDrawableRight() - rect2.right;
                                                                }
                                                                i20 = 1;
                                                                transitionParams.w0 = true;
                                                            }
                                                            int i33 = ffVar.M.Ud;
                                                        } else {
                                                            i20 = 1;
                                                        }
                                                        ffVar.e(new ph0(ffVar, i20), false);
                                                        ffVar.B.invalidate();
                                                        ffVar.c();
                                                    }
                                                    tnVar.U.H0 = null;
                                                }
                                            }
                                            arrayList3.remove(indexOf);
                                            dk dkVar2 = tnVar.U;
                                            Runnable runnable = dkVar2.b0;
                                            if (runnable != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable);
                                                z27 = true;
                                                dkVar2.c0 = true;
                                                dkVar2.b0.run();
                                                dkVar2.b0 = null;
                                            } else {
                                                z27 = true;
                                            }
                                            tnVar.U.q0(z27);
                                        }
                                        if (!hashMap.isEmpty() && hashMap.containsKey(messageObject2.getDocument())) {
                                            hashMap.remove(messageObject2.getDocument());
                                            njVar = tnVar.u0;
                                            if (njVar != null) {
                                                org.telegram.ui.Components.co coVar = tnVar.O0;
                                                njVar.O = n1Var;
                                                njVar.P = coVar;
                                                r10 = 0;
                                                njVar.N = false;
                                                if (s1Var.bd) {
                                                    s1Var.bd = r10;
                                                    s1Var.setVisibility(r10);
                                                }
                                                tnVar.ub(s1Var);
                                            }
                                        }
                                        r10 = 0;
                                        if (s1Var.bd) {
                                        }
                                        tnVar.ub(s1Var);
                                    }
                                    z24 = z22;
                                    z23 = z14;
                                }
                                z25 = true;
                                s1Var.setShowTopic(z25);
                                s1Var.X3(messageObject2, X8, z24, z23, z18, z20);
                                s1Var.setSpoilersSuppressed(tnVar.t0.getScrollState() == 0);
                                s1Var.setHighlighted(tnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == tnVar.H7);
                                z26 = s1Var.b8;
                                if (!z26) {
                                }
                                if (!z26) {
                                }
                                if (!z26) {
                                }
                                if (tnVar.N3 == 7) {
                                    s1Var.S3(str);
                                }
                                if (tnVar.H7 != Integer.MAX_VALUE) {
                                }
                                indexOf = arrayList3.indexOf(messageObject2);
                                if (indexOf != -1) {
                                }
                                if (!hashMap.isEmpty()) {
                                    hashMap.remove(messageObject2.getDocument());
                                    njVar = tnVar.u0;
                                    if (njVar != null) {
                                    }
                                }
                                r10 = 0;
                                if (s1Var.bd) {
                                }
                                tnVar.ub(s1Var);
                            }
                        }
                        z17 = z16;
                        z18 = true;
                        i18 = this.F;
                        if (i10 == i18) {
                        }
                        if (j11 == n1Var.f) {
                        }
                        if (ChatObject.isChannel(tnVar.e)) {
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
                        if (!tnVar.La) {
                        }
                        z25 = true;
                        s1Var.setShowTopic(z25);
                        s1Var.X3(messageObject2, X8, z24, z23, z18, z20);
                        s1Var.setSpoilersSuppressed(tnVar.t0.getScrollState() == 0);
                        s1Var.setHighlighted(tnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == tnVar.H7);
                        z26 = s1Var.b8;
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (tnVar.N3 == 7) {
                        }
                        if (tnVar.H7 != Integer.MAX_VALUE) {
                        }
                        indexOf = arrayList3.indexOf(messageObject2);
                        if (indexOf != -1) {
                        }
                        if (!hashMap.isEmpty()) {
                        }
                        r10 = 0;
                        if (s1Var.bd) {
                        }
                        tnVar.ub(s1Var);
                    }
                    z12 = false;
                    i15 = -100;
                    i14 = -100;
                } else {
                    i14 = i10 - 1;
                    i15 = i10 + 1;
                    z12 = false;
                }
                z13 = false;
                z30 = false;
                z14 = false;
                int j162 = j(i14);
                boolean z332 = z12;
                j11 = j(i15);
                j(i28);
                if (messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                }
                z15 = z13;
                z16 = z30;
                arrayList2 = arrayList;
                i16 = i15;
                i17 = i16 - this.F;
                if (i17 >= 0) {
                    messageObject = (MessageObject) arrayList2.get(i16 - this.F);
                    if (messageObject != null) {
                        int i302 = i16 + 1;
                        int i312 = i302 - this.F;
                        if (i312 >= 0) {
                        }
                    }
                    if (messageObject != null) {
                        z17 = z16;
                        z18 = false;
                        i18 = this.F;
                        if (i10 == i18) {
                        }
                        if (j11 == n1Var.f) {
                        }
                        if (ChatObject.isChannel(tnVar.e)) {
                        }
                        if (!z17) {
                        }
                        boolean z3722 = false;
                        messageObject2.updateTranslation(false);
                        if (X8 != null) {
                        }
                        if (!tnVar.La) {
                        }
                        z25 = true;
                        s1Var.setShowTopic(z25);
                        s1Var.X3(messageObject2, X8, z24, z23, z18, z20);
                        s1Var.setSpoilersSuppressed(tnVar.t0.getScrollState() == 0);
                        s1Var.setHighlighted(tnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == tnVar.H7);
                        z26 = s1Var.b8;
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (tnVar.N3 == 7) {
                        }
                        if (tnVar.H7 != Integer.MAX_VALUE) {
                        }
                        indexOf = arrayList3.indexOf(messageObject2);
                        if (indexOf != -1) {
                        }
                        if (!hashMap.isEmpty()) {
                        }
                        r10 = 0;
                        if (s1Var.bd) {
                        }
                        tnVar.ub(s1Var);
                    }
                }
                z17 = z16;
                z18 = true;
                i18 = this.F;
                if (i10 == i18) {
                }
                if (j11 == n1Var.f) {
                }
                if (ChatObject.isChannel(tnVar.e)) {
                }
                if (!z17) {
                }
                boolean z37222 = false;
                messageObject2.updateTranslation(false);
                if (X8 != null) {
                }
                if (!tnVar.La) {
                }
                z25 = true;
                s1Var.setShowTopic(z25);
                s1Var.X3(messageObject2, X8, z24, z23, z18, z20);
                s1Var.setSpoilersSuppressed(tnVar.t0.getScrollState() == 0);
                s1Var.setHighlighted(tnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == tnVar.H7);
                z26 = s1Var.b8;
                if (!z26) {
                }
                if (!z26) {
                }
                if (!z26) {
                }
                if (tnVar.N3 == 7) {
                }
                if (tnVar.H7 != Integer.MAX_VALUE) {
                }
                indexOf = arrayList3.indexOf(messageObject2);
                if (indexOf != -1) {
                }
                if (!hashMap.isEmpty()) {
                }
                r10 = 0;
                if (s1Var.bd) {
                }
                tnVar.ub(s1Var);
            }
        }
        z11 = false;
        s1Var.T7 = z11;
        s1Var.U7 = tnVar.N3 != 0 && (tnVar.F4.containsKey(Integer.valueOf(messageObject2.getId())) || !(X8 == null || X8.messages.isEmpty() || !tnVar.F4.containsKey(Integer.valueOf(X8.messages.get(0).getId()))));
        i13 = tnVar.N3;
        if (i13 != 1) {
        }
        arrayList = arrayList4;
        j10 = 0;
        s1Var.X7 = j10;
        if (i13 == 7) {
        }
        s1Var.Y7 = UserObject.isReplyUser(tnVar.f);
        s1Var.Z7 = tnVar.N3 != 2;
        s1Var.A8 = tnVar.t9();
        s1Var.B8 = tnVar.C9();
        s1Var.C8 = tnVar.B9();
        s1Var.D8 = tnVar.Q8();
        s1Var.E8 = tnVar.R8();
        if (messageObject2.isSponsored()) {
        }
        int i282 = i10 + 2;
        if (X8 == null) {
        }
        z13 = false;
        z30 = false;
        z14 = false;
        int j1622 = j(i14);
        boolean z3322 = z12;
        j11 = j(i15);
        j(i282);
        if (messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
        }
        z15 = z13;
        z16 = z30;
        arrayList2 = arrayList;
        i16 = i15;
        i17 = i16 - this.F;
        if (i17 >= 0) {
        }
        z17 = z16;
        z18 = true;
        i18 = this.F;
        if (i10 == i18) {
        }
        if (j11 == n1Var.f) {
        }
        if (ChatObject.isChannel(tnVar.e)) {
        }
        if (!z17) {
        }
        boolean z372222 = false;
        messageObject2.updateTranslation(false);
        if (X8 != null) {
        }
        if (!tnVar.La) {
        }
        z25 = true;
        s1Var.setShowTopic(z25);
        s1Var.X3(messageObject2, X8, z24, z23, z18, z20);
        s1Var.setSpoilersSuppressed(tnVar.t0.getScrollState() == 0);
        s1Var.setHighlighted(tnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == tnVar.H7);
        z26 = s1Var.b8;
        if (!z26) {
        }
        if (!z26) {
        }
        if (!z26) {
        }
        if (tnVar.N3 == 7) {
        }
        if (tnVar.H7 != Integer.MAX_VALUE) {
        }
        indexOf = arrayList3.indexOf(messageObject2);
        if (indexOf != -1) {
        }
        if (!hashMap.isEmpty()) {
        }
        r10 = 0;
        if (s1Var.bd) {
        }
        tnVar.ub(s1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [org.telegram.ui.xl] */
    /* JADX WARN: Type inference failed for: r8v11, types: [org.telegram.ui.Cells.v0] */
    /* JADX WARN: Type inference failed for: r8v12, types: [org.telegram.ui.Cells.ua] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Cells.y0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [org.telegram.ui.Cells.h0, org.telegram.ui.wl] */
    /* JADX WARN: Type inference failed for: r8v16, types: [org.telegram.ui.Cells.u1] */
    /* JADX WARN: Type inference failed for: r8v9, types: [org.telegram.ui.Cells.t1] */
    /* JADX WARN: Type inference failed for: r9v12, types: [org.telegram.ui.Cells.v0] */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.Cells.s1 s1Var2;
        tn tnVar = this.M;
        if (i10 == 0) {
            s1Var = new org.telegram.ui.Cells.s1(this.h, ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount, true, tnVar.xa, tnVar.aa);
            s1Var.setResourcesProvider(tnVar.aa);
            if (tnVar.lc == null) {
                tnVar.lc = new fn(tnVar);
            }
            s1Var.setDelegate(tnVar.lc);
            s1Var.Ld = tnVar.Lb;
            if (tnVar.h == null) {
                s1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? tlVar = new tl(context, tnVar.aa, true);
                tlVar.setInvalidateColors(true);
                tlVar.setDelegate(new vl(this));
                s1Var = tlVar;
            } else {
                if (i10 == 2) {
                    s1Var2 = new org.telegram.ui.Cells.u1(context, tnVar.aa);
                } else if (i10 == 3) {
                    ?? wlVar = new wl(this, context, ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount, tnVar.aa);
                    wlVar.setDelegate(new c1(this, 20));
                    s1Var2 = wlVar;
                } else if (i10 == 4) {
                    s1Var2 = new org.telegram.ui.Cells.y0(context, tnVar.aa);
                } else if (i10 == 6) {
                    s1Var2 = new org.telegram.ui.Cells.ua(context, ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount, tnVar.aa);
                } else if (i10 == 7) {
                    s1Var2 = new org.telegram.ui.Cells.v0(context, tnVar.aa, false);
                } else if (i10 == 8) {
                    s1Var2 = new xl(this, context, ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount, tnVar.aa);
                } else if (i10 == 10) {
                    ?? t1Var = new org.telegram.ui.Cells.t1(context, tnVar.aa);
                    if (tnVar.lc == null) {
                        tnVar.lc = new fn(tnVar);
                    }
                    t1Var.setDelegate(tnVar.lc);
                    s1Var2 = t1Var;
                } else {
                    s1Var = null;
                }
                s1Var = s1Var2;
            }
        }
        return th.m(s1Var, s1Var, -1, -2);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        TLRPC.Message message;
        boolean z10;
        boolean z11;
        byte[] bArr;
        Integer num;
        String str;
        String stickerEmoji;
        MessagesController.EmojiSound emojiSound;
        View view = n1Var.a;
        boolean z12 = view instanceof org.telegram.ui.Cells.s1;
        tn tnVar = this.M;
        if (z12 || (view instanceof org.telegram.ui.Cells.v0)) {
            tnVar.r9();
        }
        boolean z13 = view instanceof org.telegram.ui.Cells.s1;
        if (z13) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            MessageObject messageObject = s1Var.getMessageObject();
            s1Var.A8 = tnVar.t9();
            s1Var.B8 = tnVar.C9();
            s1Var.C8 = tnVar.B9();
            s1Var.D8 = tnVar.Q8();
            s1Var.E8 = tnVar.R8();
            s1Var.g4(-1, true, false);
            MessageObject messageObject2 = tnVar.C3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                s1Var.g4(tnVar.D3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = tnVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                tnVar.getMediaController().playEmojiSound(tnVar.getAccountInstance(), stickerEmoji, emojiSound, true);
            }
            if (messageObject.updateTranslation(false)) {
                s1Var.X3(messageObject, s1Var.getCurrentMessagesGroup(), s1Var.m3(), s1Var.n3(), s1Var.h3(), s1Var.j3());
            } else {
                MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    for (int i10 = 0; i10 < currentMessagesGroup.messages.size(); i10++) {
                        currentMessagesGroup.messages.get(i10).updateTranslation();
                    }
                }
            }
            if (((org.telegram.ui.ActionBar.o2) tnVar).actionBar.s() || tnVar.A9()) {
                tnVar.J7 = false;
                tnVar.K7 = 0L;
                tnVar.L7 = null;
                ArrayList arrayList = tnVar.W3;
                s1Var.J3(arrayList == null || !arrayList.contains(messageObject), false);
                int i11 = messageObject.getDialogId() == tnVar.P5 ? 0 : 1;
                if (tnVar.S5[i11].indexOfKey(messageObject.getId()) >= 0) {
                    tnVar.hb(messageObject, s1Var, i11, false);
                    z10 = true;
                } else {
                    s1Var.setDrawSelectionBackground(false);
                    s1Var.L3(false, false, false);
                    z10 = false;
                }
                z11 = true;
            } else {
                s1Var.setDrawSelectionBackground(false);
                s1Var.L3(false, false, false);
                s1Var.J3(false, false);
                z10 = false;
                z11 = false;
            }
            s1Var.K3(!z11, z11 && z10);
            if (tnVar.N3 != 7 || tnVar.q3 == null || (str = tnVar.p3) == null) {
                hk hkVar = tnVar.N2;
                if (hkVar != null && hkVar.getVisibility() == 0) {
                    if (tnVar.getMediaDataController().isMessageFound(messageObject.getId(), messageObject.getDialogId() == tnVar.H6) && tnVar.getMediaDataController().getLastSearchQuery() != null) {
                        s1Var.S3(tnVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                s1Var.S3(null);
            } else {
                s1Var.S3(str);
            }
            if (!((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode || !s1Var.b8) {
                s1Var.setHighlighted(tnVar.H7 != Integer.MAX_VALUE && ((s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == tnVar.H7) || (s1Var.getCurrentMessagesGroup() != null && s1Var.getCurrentMessagesGroup().contains(tnVar.H7))));
                boolean z14 = s1Var.b8;
                if (z14 && tnVar.L7 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!s1Var.T3(tnVar.L7, true, tnVar.J7 || currentTimeMillis - tnVar.K7 < 200, tnVar.O7) && tnVar.I7) {
                        org.telegram.ui.Components.tc.a0(tnVar).Q(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    tnVar.I7 = false;
                    if (tnVar.J7) {
                        tnVar.K7 = currentTimeMillis;
                    }
                    tnVar.J7 = false;
                } else if (z14 && (num = tnVar.M7) != null) {
                    s1Var.R3(num.intValue());
                } else if (z14 && (bArr = tnVar.N7) != null) {
                    s1Var.P3(bArr);
                }
                if (tnVar.H7 != Integer.MAX_VALUE) {
                    tnVar.Zb();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            v0Var.a0 = tnVar.t9();
            v0Var.e0 = tnVar.C9();
            tnVar.B9();
            tnVar.Q8();
            v0Var.f0 = tnVar.R8();
        } else if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(tnVar.R8() / 2.0f);
        }
        int b10 = n1Var.b();
        int i12 = this.F;
        if (b10 < i12 || b10 >= this.G) {
            return;
        }
        MessageObject messageObject3 = (MessageObject) (this.H ? this.I : this.J ? this.L : tnVar.q6).get(b10 - i12);
        if (messageObject3 == null || (message = messageObject3.messageOwner) == null || !message.media_unread || !message.mentioned) {
            return;
        }
        if (!((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode && tnVar.N3 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
            int i13 = tnVar.h6 - 1;
            tnVar.h6 = i13;
            if (i13 <= 0) {
                tnVar.h6 = 0;
                tnVar.i6 = true;
                tnVar.Kb(false);
            } else {
                tnVar.f1.c(2, i13, true);
            }
            tnVar.getMessagesController().markMentionMessageAsRead(messageObject3.getId(), ChatObject.isChannel(tnVar.e) ? tnVar.e.id : 0L, tnVar.P5);
            messageObject3.setContentIsRead();
        }
        if (z13) {
            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
            if (((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode) {
                s1Var2.setHighlighted(true);
            } else {
                s1Var2.O3();
            }
        }
    }
}
