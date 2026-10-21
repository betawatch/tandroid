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
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class dm extends org.telegram.ui.Components.kl0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final ArrayList M;
    public boolean N;
    public boolean O;
    public final ArrayList P;
    public final /* synthetic */ qn Q;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public dm(qn qnVar, Context context) {
        this.Q = qnVar;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.s = -5;
        this.v = -5;
        this.w = -5;
        this.x = -5;
        this.y = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.h = context;
        TLRPC.User user = qnVar.f;
        this.n = user != null && user.bot;
        C(true);
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    public final void K(boolean z10) {
        qn qnVar = this.Q;
        if (UserObject.isBotForum(qnVar.f)) {
            if (z10) {
                qnVar.nc = true;
            }
            if (this.I < 0 || N()) {
                return;
            }
            super.u(this.I);
            S();
        }
    }

    public final ArrayList L() {
        return this.L ? this.M : this.N ? this.P : this.Q.u6;
    }

    public final void M(MessageObject messageObject) {
        qn qnVar = this.Q;
        int childCount = qnVar.x0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = qnVar.x0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                if (u1Var.getMessageObject() == messageObject) {
                    u1Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean N() {
        qn qnVar = this.Q;
        return UserObject.isBotForumWithEditableTopics(qnVar.f) && qnVar.d() == 0 && !qnVar.nc && qnVar.R3 == 0;
    }

    public final void O(boolean z10) {
        boolean z11;
        qn qnVar = this.Q;
        ArrayList arrayList = qnVar.u6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + qnVar.O5);
        }
        if (z10 && qnVar.O5) {
            s4.l0 itemAnimator = qnVar.x0.getItemAnimator();
            pj pjVar = qnVar.y0;
            if (itemAnimator != pjVar) {
                qnVar.x0.setItemAnimator(pjVar);
            }
        } else {
            qnVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
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
        boolean[] zArr = qnVar.C6;
        if ((zArr[0] && (qnVar.L6 == 0 || zArr[1])) || z11) {
            qnVar.O6(((org.telegram.ui.ActionBar.n2) qnVar).fragmentBeginToShow);
        }
    }

    public final void P(int i10, boolean z10) {
        MessageObject messageObject;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i10);
            i2.e.v(z10 ? " with thanos effect" : "", sb2);
        }
        qn qnVar = this.Q;
        if (((org.telegram.ui.ActionBar.n2) qnVar).fragmentBeginToShow) {
            s4.l0 itemAnimator = qnVar.x0.getItemAnimator();
            pj pjVar = qnVar.y0;
            if (itemAnimator != pjVar) {
                qnVar.x0.setItemAnimator(pjVar);
            }
        } else {
            qnVar.x0.setItemAnimator(null);
        }
        if (z10 && qnVar.y0 != null) {
            s4.l0 itemAnimator2 = qnVar.x0.getItemAnimator();
            pj pjVar2 = qnVar.y0;
            if (itemAnimator2 == pjVar2) {
                s4.b1 K = qnVar.x0.K(i10);
                if (K == null) {
                    pjVar2.getClass();
                } else {
                    pjVar2.S.add(K);
                    View view = K.a;
                    if ((view instanceof org.telegram.ui.Cells.u1) && (messageObject = ((org.telegram.ui.Cells.u1) view).getMessageObject()) != null) {
                        messageObject.deletedByThanos = true;
                    }
                }
            }
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void Q(int i10) {
        int i11;
        qn qnVar = this.Q;
        ArrayList arrayList = qnVar.u6;
        if (qnVar.z0 == null || this.L || this.N) {
            return;
        }
        int i12 = 0;
        if (!qnVar.D4 && qnVar.J7 != null) {
            int childCount = qnVar.x0.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                View childAt = qnVar.x0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                    MessageObject messageObject2 = qnVar.J7;
                    if (messageObject == messageObject2) {
                        if (arrayList.indexOf(messageObject2) >= 0) {
                            i11 = arrayList.indexOf(qnVar.J7) + this.J;
                            i12 = qnVar.Q8(childAt);
                        }
                    }
                }
                i13++;
            }
        }
        i11 = -1;
        m(i10);
        if (i11 != -1) {
            qnVar.z0.h1(i11, i12);
        }
    }

    public final org.telegram.ui.Cells.u1 R(MessageObject messageObject, boolean z10, boolean z11) {
        qn qnVar = this.Q;
        if (z10) {
            int childCount = qnVar.x0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = qnVar.x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject() == messageObject && TextUtils.equals(u1Var.f7, u1Var.y7.messageOwner.post_author)) {
                        u1Var.X3(messageObject, u1Var.getCurrentMessagesGroup(), u1Var.m3(), u1Var.n3(), u1Var.h3(), u1Var.j3());
                        return u1Var;
                    }
                }
                i10++;
                messageObject = messageObject;
            }
        }
        MessageObject messageObject2 = messageObject;
        int indexOf = (this.L ? this.M : this.N ? this.P : qnVar.u6).indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (!z11) {
            Q(this.J + indexOf);
            return null;
        }
        int i11 = qn.Kc;
        qn.Kc = i11 + 1;
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
        qn qnVar = this.Q;
        boolean[] zArr = qnVar.C6;
        this.r = 0;
        ArrayList arrayList = this.L ? this.M : this.N ? this.P : qnVar.u6;
        if (qnVar.R3 == 3 && qnVar.Pa) {
            this.r = 1;
            this.s = 0;
        } else {
            this.s = -5;
        }
        this.v = -5;
        this.w = -5;
        this.y = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        if (N()) {
            int i13 = this.r;
            this.r = i13 + 1;
            this.I = i13;
        }
        if (arrayList.isEmpty()) {
            this.E = -5;
            this.F = -5;
            this.J = 0;
            this.K = 0;
            TLRPC.User user4 = qnVar.f;
            if (user4 != null && !UserObject.isBot(user4) && !UserObject.isReplyUser(qnVar.f)) {
                TLRPC.PeerSettings peerSettings3 = qnVar.getMessagesController().getPeerSettings(qnVar.f.id);
                int i14 = org.telegram.ui.Cells.xa.O;
                if (peerSettings3 != null && ((peerSettings3.phone_country != null || peerSettings3.registration_month != null) && !MessagesController.isSupportUser(qnVar.f) && qnVar.R3 == 0)) {
                    int i15 = this.r;
                    this.r = i15 + 1;
                    this.y = i15;
                    return;
                }
            }
            if (UserObject.isReplyUser(qnVar.f) || ((user = qnVar.f) != null && user.bot && !MessagesController.isSupportUser(user) && qnVar.R3 == 0)) {
                int i16 = this.r;
                this.r = i16 + 1;
                this.w = i16;
                return;
            }
            return;
        }
        if (!this.N) {
            boolean[] zArr2 = qnVar.E6;
            if ((!zArr2[0] || (qnVar.L6 != 0 && !zArr2[1])) && !qnVar.F6) {
                int i17 = this.r;
                this.r = i17 + 1;
                this.F = i17;
                int i18 = this.r;
                this.J = i18;
                int size = arrayList.size() + i18;
                this.r = size;
                this.K = size;
                user2 = qnVar.f;
                if (user2 != null && !UserObject.isBot(user2) && !UserObject.isReplyUser(qnVar.f)) {
                    peerSettings = qnVar.getMessagesController().getPeerSettings(qnVar.f.id);
                    int i19 = org.telegram.ui.Cells.xa.O;
                    if (peerSettings != null && ((peerSettings.phone_country != null || peerSettings.registration_month != null) && !MessagesController.isSupportUser(qnVar.f) && qnVar.R3 == 0 && zArr[0])) {
                        peerSettings2 = qnVar.getMessagesController().getPeerSettings(qnVar.f.id);
                        i11 = peerSettings2.name_change_date;
                        if (i11 != 0 || (i12 = peerSettings2.photo_change_date) == 0) {
                            if (i11 != 0) {
                                int i20 = this.r;
                                this.r = i20 + 1;
                                this.H = i20;
                            }
                            if (peerSettings2.photo_change_date != 0) {
                                int i21 = this.r;
                                this.r = i21 + 1;
                                this.G = i21;
                            }
                        } else if (i11 < i12) {
                            int i22 = this.r;
                            this.H = i22;
                            this.r = i22 + 2;
                            this.G = i22 + 1;
                        } else {
                            int i23 = this.r;
                            this.G = i23;
                            this.r = i23 + 2;
                            this.H = i23 + 1;
                        }
                        int i24 = this.r;
                        this.r = i24 + 1;
                        this.y = i24;
                        i10 = qnVar.R3;
                        if (i10 == 9) {
                            int i25 = this.r;
                            this.s = i25;
                            this.r = i25 + 2;
                            this.v = i25 + 1;
                        }
                        if (i10 == 5 && !ig.a2.g(qnVar.Q3)) {
                            int i26 = this.r;
                            this.r = i26 + 1;
                            this.s = i26;
                        }
                        if (this.N ? !(!(zArr[0] && (qnVar.L6 == 0 || zArr[1])) && (AndroidUtilities.isTablet() || qnVar.g4 || qnVar.f != null)) : this.O) {
                            this.E = -5;
                            return;
                        }
                        int i27 = this.r;
                        this.r = i27 + 1;
                        this.E = i27;
                        return;
                    }
                }
                if ((!UserObject.isReplyUser(qnVar.f) || ((user3 = qnVar.f) != null && user3.bot && !MessagesController.isSupportUser(user3) && qnVar.R3 == 0)) && zArr[0]) {
                    int i28 = this.r;
                    this.r = i28 + 1;
                    this.w = i28;
                }
                i10 = qnVar.R3;
                if (i10 == 9) {
                }
                if (i10 == 5) {
                    int i262 = this.r;
                    this.r = i262 + 1;
                    this.s = i262;
                }
                if (this.N) {
                    int i272 = this.r;
                    this.r = i272 + 1;
                    this.E = i272;
                    return;
                } else {
                    int i2722 = this.r;
                    this.r = i2722 + 1;
                    this.E = i2722;
                    return;
                }
            }
        }
        this.F = -5;
        int i182 = this.r;
        this.J = i182;
        int size2 = arrayList.size() + i182;
        this.r = size2;
        this.K = size2;
        user2 = qnVar.f;
        if (user2 != null) {
            peerSettings = qnVar.getMessagesController().getPeerSettings(qnVar.f.id);
            int i192 = org.telegram.ui.Cells.xa.O;
            if (peerSettings != null) {
                peerSettings2 = qnVar.getMessagesController().getPeerSettings(qnVar.f.id);
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
                i10 = qnVar.R3;
                if (i10 == 9) {
                }
                if (i10 == 5) {
                }
                if (this.N) {
                }
            }
        }
        if (!UserObject.isReplyUser(qnVar.f)) {
        }
        int i282 = this.r;
        this.r = i282 + 1;
        this.w = i282;
        i10 = qnVar.R3;
        if (i10 == 9) {
        }
        if (i10 == 5) {
        }
        if (this.N) {
        }
    }

    public final void T() {
        int i10 = this.r;
        int i11 = this.w;
        int i12 = this.y;
        int i13 = this.s;
        int i14 = this.v;
        int i15 = this.E;
        int i16 = this.F;
        int i17 = this.J;
        int i18 = this.K;
        int i19 = this.G;
        int i20 = this.H;
        int i21 = this.I;
        S();
        if (i10 == this.r && i11 == this.w && i15 == this.E && i16 == this.F && i17 == this.J && i18 == this.K && i13 == this.s && i14 == this.v && i12 == this.y && i19 == this.G && i20 == this.H && i21 == this.I) {
            return;
        }
        O(false);
    }

    @Override // s4.g0
    public final int h() {
        this.x = -5;
        qn qnVar = this.Q;
        a0.h hVar = qnVar.d8;
        if (qnVar.M5.get(qnVar.d4, 0) == 0) {
            return this.r;
        }
        TLRPC.User user = qnVar.f;
        if (user == null || !user.bot || qnVar.R3 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(qnVar.f.id)).description == null && ((TL_bots.BotInfo) hVar.f(qnVar.f.id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(qnVar.f.id)).description_document == null)) && !UserObject.isReplyUser(qnVar.f) && !UserObject.isBotForum(qnVar.f))) {
            return 0;
        }
        this.x = 0;
        return 1;
    }

    @Override // s4.g0
    public final long i(int i10) {
        qn qnVar = this.Q;
        if (qnVar.M5.get(qnVar.d4, 0) != 0 && i10 == this.x) {
            return 1L;
        }
        ArrayList arrayList = this.L ? this.M : this.N ? this.P : qnVar.u6;
        if (i10 >= this.J && i10 < this.K) {
            return ((MessageObject) arrayList.get(i10 - r1)).stableId;
        }
        if (i10 == this.w || i10 == this.x) {
            return 1L;
        }
        if (i10 == this.E) {
            return 2L;
        }
        if (i10 == this.F) {
            return 3L;
        }
        if (i10 == this.s) {
            return 4L;
        }
        if (i10 == this.y) {
            return 6L;
        }
        if (i10 == this.G) {
            return 7L;
        }
        if (i10 == this.H) {
            return 8L;
        }
        if (i10 == this.I) {
            return 9L;
        }
        return i10 == this.v ? 10L : 5L;
    }

    @Override // s4.g0
    public final int j(int i10) {
        qn qnVar = this.Q;
        if (qnVar.M5.get(qnVar.d4, 0) != 0 && i10 == this.x) {
            return 3;
        }
        if (i10 == this.s || i10 == this.v) {
            return 1;
        }
        int i11 = this.J;
        if (i10 >= i11 && i10 < this.K) {
            return ((MessageObject) (this.L ? this.M : this.N ? this.P : qnVar.u6).get(i10 - i11)).contentType;
        }
        if (i10 == this.w) {
            return 3;
        }
        if (i10 == this.y) {
            return 6;
        }
        if (i10 == this.H || i10 == this.G) {
            return 7;
        }
        return i10 == this.I ? 8 : 4;
    }

    @Override // org.telegram.ui.Components.kl0, s4.g0
    public final void l() {
        O(false);
    }

    @Override // org.telegram.ui.Components.kl0, s4.g0
    public final void m(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item changed " + i10);
        }
        qn qnVar = this.Q;
        if (!((org.telegram.ui.ActionBar.n2) qnVar).fragmentBeginToShow || qnVar.N0) {
            qnVar.x0.setItemAnimator(null);
        } else {
            s4.l0 itemAnimator = qnVar.x0.getItemAnimator();
            pj pjVar = qnVar.y0;
            if (itemAnimator != pjVar) {
                qnVar.x0.setItemAnimator(pjVar);
            }
        }
        S();
        try {
            super.m(i10);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.kl0, s4.g0
    public final void o(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item inserted " + i10);
        }
        qn qnVar = this.Q;
        if (((org.telegram.ui.ActionBar.n2) qnVar).fragmentBeginToShow) {
            s4.l0 itemAnimator = qnVar.x0.getItemAnimator();
            pj pjVar = qnVar.y0;
            if (itemAnimator != pjVar) {
                qnVar.x0.setItemAnimator(pjVar);
            }
        } else {
            qnVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.o(i10);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // s4.g0
    public final void p(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item moved" + i10 + ":" + i11);
        }
        qn qnVar = this.Q;
        if (((org.telegram.ui.ActionBar.n2) qnVar).fragmentBeginToShow) {
            s4.l0 itemAnimator = qnVar.x0.getItemAnimator();
            pj pjVar = qnVar.y0;
            if (itemAnimator != pjVar) {
                qnVar.x0.setItemAnimator(pjVar);
            }
        } else {
            qnVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.p(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.kl0, s4.g0
    public final void q(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range changed " + i10 + ":" + i11);
        }
        qn qnVar = this.Q;
        if (((org.telegram.ui.ActionBar.n2) qnVar).fragmentBeginToShow) {
            s4.l0 itemAnimator = qnVar.x0.getItemAnimator();
            pj pjVar = qnVar.y0;
            if (itemAnimator != pjVar) {
                qnVar.x0.setItemAnimator(pjVar);
            }
        } else {
            qnVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.q(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.kl0, s4.g0
    public final void s(int i10, int i11) {
        int i12;
        int i13;
        qn qnVar = this.Q;
        ArrayList arrayList = qnVar.u6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        if (((org.telegram.ui.ActionBar.n2) qnVar).fragmentBeginToShow) {
            s4.l0 itemAnimator = qnVar.x0.getItemAnimator();
            pj pjVar = qnVar.y0;
            if (itemAnimator != pjVar) {
                qnVar.x0.setItemAnimator(pjVar);
            }
        } else {
            qnVar.x0.setItemAnimator(null);
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.J) && i12 < this.K) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.J) - 1);
            if ((qnVar.e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (qnVar.f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
                m(i10);
            }
        }
        try {
            super.s(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.kl0, s4.g0
    public final void t(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range removed" + i10 + ":" + i11);
        }
        qn qnVar = this.Q;
        if (((org.telegram.ui.ActionBar.n2) qnVar).fragmentBeginToShow) {
            s4.l0 itemAnimator = qnVar.x0.getItemAnimator();
            pj pjVar = qnVar.y0;
            if (itemAnimator != pjVar) {
                qnVar.x0.setItemAnimator(pjVar);
            }
        } else {
            qnVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.t(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.kl0, s4.g0
    public final void u(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item removed " + i10);
        }
        qn qnVar = this.Q;
        if (((org.telegram.ui.ActionBar.n2) qnVar).fragmentBeginToShow) {
            s4.l0 itemAnimator = qnVar.x0.getItemAnimator();
            pj pjVar = qnVar.y0;
            if (itemAnimator != pjVar) {
                qnVar.x0.setItemAnimator(pjVar);
            }
        } else {
            qnVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x05d1, code lost:
    
        if (r19 != r9) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x094d, code lost:
    
        if (r4.y0 == null) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0604, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.peer_id) == org.telegram.messenger.MessageObject.getPeerId(r8.messageOwner.peer_id)) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0679, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0622, code lost:
    
        if (r8.getSenderId() == r5.getSenderId()) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0677, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r2) == org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.fwd_from.from_id)) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x03f6, code lost:
    
        if (r4.R3 != 9) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0422, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.peer_id) == org.telegram.messenger.MessageObject.getPeerId(r11.messageOwner.peer_id)) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0494, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x043d, code lost:
    
        if (r11.getSenderId() == r5.getSenderId()) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0492, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r10) == org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.fwd_from.from_id)) goto L267;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0997  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0a2f  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0a31  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v16 */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.UserFull userFull;
        TLObject tLObject;
        org.telegram.ui.Cells.h0 h0Var;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        ArrayList arrayList;
        long j10;
        int i14;
        int i15;
        int i16;
        boolean z12;
        boolean z13;
        boolean z14;
        int j11;
        boolean z15;
        boolean z16;
        ArrayList arrayList2;
        int i17;
        int i18;
        boolean z17;
        boolean z18;
        int i19;
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
        pj pjVar;
        MessageObject.SendAnimationData sendAnimationData;
        fk fkVar;
        int i20;
        int i21;
        boolean z27;
        org.telegram.ui.Components.r60 r60Var;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str2;
        boolean z28;
        long j12;
        long j13;
        long j14;
        MessageObject messageObject;
        String str3;
        boolean z29;
        int i22;
        TLRPC.ChatFull chatFull;
        View view = b1Var.a;
        qn qnVar = this.Q;
        a0.h hVar = qnVar.d8;
        ArrayList arrayList3 = qnVar.u4;
        HashMap hashMap = qnVar.v4;
        boolean z30 = false;
        if (i10 == this.w || i10 == this.x) {
            org.telegram.ui.Cells.h0 h0Var2 = (org.telegram.ui.Cells.h0) view;
            if (UserObject.isReplyUser(qnVar.f)) {
                h0Var = h0Var2;
                h0Var.b(false, 0L, LocaleController.getString(R.string.RepliesChatInfo), null, null, null);
            } else {
                TLRPC.User user = qnVar.f;
                if (user == null || user.id != UserObject.VERIFY) {
                    TL_bots.BotInfo botInfo = hVar.m() != 0 ? (TL_bots.BotInfo) hVar.f(qnVar.f.id) : null;
                    boolean z31 = (botInfo == null || (TextUtils.isEmpty(botInfo.description) && botInfo.description_photo == null && botInfo.description_document == null)) && UserObject.isBot(qnVar.f) && (userFull = qnVar.a8) != null && userFull.bot_manager_id != 0 && qnVar.f.bot_can_edit;
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
                    h0Var = h0Var2;
                    h0Var.b(true, j15, str4, tLObject, botInfo, z31 ? DialogObject.getName(((org.telegram.ui.ActionBar.n2) qnVar).currentAccount, qnVar.a8.bot_manager_id) : null);
                } else {
                    h0Var = h0Var2;
                    h0Var.b(false, 0L, LocaleController.getString(R.string.VerifyChatInfo), null, null, null);
                }
            }
            qn.d4(qnVar, h0Var);
            return;
        }
        if (i10 == this.I) {
            ((org.telegram.ui.Cells.b0) view).setDialogId(qnVar.a());
            return;
        }
        if (i10 == this.y) {
            org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
            TLRPC.EncryptedChat encryptedChat = qnVar.h;
            long a2 = encryptedChat != null ? encryptedChat.user_id : qnVar.a();
            xaVar.b(a2, qnVar.getMessagesController().getPeerSettings(a2));
            return;
        }
        if (i10 == this.F || i10 == this.E) {
            ((org.telegram.ui.Cells.z0) view).setProgressVisible(qnVar.J6 > 1);
            return;
        }
        if (i10 == this.H) {
            if (qnVar.getMessagesController().getPeerSettings(qnVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.w0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedName, LocaleController.formatRelativeDate(qnVar.getConnectionsManager().getCurrentTime() - r1.name_change_date)));
            return;
        }
        if (i10 == this.G) {
            if (qnVar.getMessagesController().getPeerSettings(qnVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.w0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedPhoto, LocaleController.formatRelativeDate(qnVar.getConnectionsManager().getCurrentTime() - r1.photo_change_date)));
            return;
        }
        if (i10 == this.s) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            qn.f4(qnVar);
            w0Var.setMessageObject(qnVar.I3);
            int i23 = qnVar.R3;
            if (i23 == 3) {
                w0Var.setCustomText(LocaleController.getString(R.string.SavedMessagesProfileHint));
            } else if (i23 == 5) {
                w0Var.setCustomText(LocaleController.getString(R.string.BusinessRepliesHint));
            } else if (i23 == 9) {
                w0Var.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint2));
            }
            w0Var.setAlpha(1.0f);
            w0Var.setSpoilersSuppressed(qnVar.x0.getScrollState() != 0);
            return;
        }
        if (i10 == this.v) {
            org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) view;
            qn.g4(qnVar);
            w0Var2.setMessageObject(qnVar.J3);
            w0Var2.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint));
            w0Var2.setAlpha(1.0f);
            w0Var2.setSpoilersSuppressed(qnVar.x0.getScrollState() != 0);
            return;
        }
        int i24 = this.J;
        if (i10 < i24 || i10 >= this.K) {
            return;
        }
        ArrayList arrayList4 = this.L ? this.M : this.N ? this.P : qnVar.u6;
        MessageObject messageObject2 = (MessageObject) arrayList4.get(i10 - i24);
        if (!(view instanceof org.telegram.ui.Cells.u1)) {
            ArrayList arrayList5 = arrayList4;
            MessageObject messageObject3 = null;
            if (!(view instanceof org.telegram.ui.Cells.w0)) {
                if (view instanceof org.telegram.ui.Cells.w1) {
                    org.telegram.ui.Cells.w1 w1Var = (org.telegram.ui.Cells.w1) view;
                    w1Var.setText(LocaleController.getString(R.string.UnreadMessages));
                    w1Var.getTextView().setTranslationX(qnVar.W8() / 2.0f);
                    if (qnVar.D7 != 0) {
                        qnVar.D7 = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            if ((messageObject2 == null || !messageObject2.isDateObject) && (i12 = (i11 = i10 + 1) - this.J) >= 0 && i12 < arrayList5.size()) {
                MessageObject messageObject4 = (MessageObject) arrayList5.get(i11 - this.J);
                if (messageObject4 == null || !messageObject4.isDateObject) {
                    messageObject3 = messageObject4;
                } else {
                    int i25 = i10 + 2;
                    int i26 = i25 - this.J;
                    if (i26 >= 0 && i26 < arrayList5.size()) {
                        messageObject3 = (MessageObject) arrayList5.get(i25 - this.J);
                    }
                }
                if (messageObject3 == null || (messageObject2 != null && messageObject3.getTopicId() != messageObject2.getTopicId())) {
                    z10 = true;
                    org.telegram.ui.Cells.w0 w0Var3 = (org.telegram.ui.Cells.w0) view;
                    w0Var3.e0 = qnVar.y9();
                    w0Var3.i0 = qnVar.H9();
                    qnVar.G9();
                    qnVar.V8();
                    w0Var3.j0 = qnVar.W8();
                    w0Var3.f0 = ChatObject.isForum(qnVar.e);
                    w0Var3.g0 = ChatObject.isMonoForum(qnVar.e);
                    w0Var3.h0 = UserObject.isBotForum(qnVar.f);
                    boolean z32 = w0Var3.k0 == z10;
                    w0Var3.k0 = z10;
                    w0Var3.Y(messageObject2, z32);
                    w0Var3.setAlpha(1.0f);
                    w0Var3.setShowTopic(true);
                    w0Var3.setSpoilersSuppressed(qnVar.x0.getScrollState() == 0);
                    return;
                }
            }
            z10 = false;
            org.telegram.ui.Cells.w0 w0Var32 = (org.telegram.ui.Cells.w0) view;
            w0Var32.e0 = qnVar.y9();
            w0Var32.i0 = qnVar.H9();
            qnVar.G9();
            qnVar.V8();
            w0Var32.j0 = qnVar.W8();
            w0Var32.f0 = ChatObject.isForum(qnVar.e);
            w0Var32.g0 = ChatObject.isMonoForum(qnVar.e);
            w0Var32.h0 = UserObject.isBotForum(qnVar.f);
            if (w0Var32.k0 == z10) {
            }
            w0Var32.k0 = z10;
            w0Var32.Y(messageObject2, z32);
            w0Var32.setAlpha(1.0f);
            w0Var32.setShowTopic(true);
            w0Var32.setSpoilersSuppressed(qnVar.x0.getScrollState() == 0);
            return;
        }
        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
        MessageObject.GroupedMessages c92 = qnVar.c9(messageObject2);
        u1Var.N7 = qnVar.e != null || UserObject.isUserSelf(qnVar.f) || UserObject.isReplyUser(qnVar.f) || qnVar.R3 == 7;
        u1Var.y.a(false, false);
        u1Var.O7 = UserObject.isBotForum(qnVar.f);
        u1Var.a8 = qnVar.F9();
        int i27 = qnVar.R3;
        u1Var.P7 = i27 == 3;
        u1Var.Q7 = i27 == 3 && qnVar.Pa;
        TLRPC.User user3 = qnVar.f;
        u1Var.R7 = user3 != null && user3.bot;
        u1Var.S7 = ChatObject.isChannel(qnVar.e) && qnVar.e.megagroup;
        u1Var.T7 = ChatObject.isForum(qnVar.e);
        u1Var.U7 = ChatObject.isMonoForum(qnVar.e);
        u1Var.V7 = ChatObject.isForum(qnVar.e) && qnVar.h4 && qnVar.d() == 1;
        u1Var.W7 = (qnVar.d4 != 0 || (u1Var.T7 && qnVar.h4)) && !u1Var.U7;
        int i28 = qnVar.R3;
        if (i28 != 1 && i28 != 9 && ChatObject.isChannel(qnVar.e)) {
            TLRPC.Chat chat = qnVar.e;
            if (chat.has_link && !chat.megagroup) {
                z11 = true;
                u1Var.X7 = z11;
                u1Var.Y7 = qnVar.R3 != 0 && (qnVar.J4.containsKey(Integer.valueOf(messageObject2.getId())) || !(c92 == null || c92.messages.isEmpty() || !qnVar.J4.containsKey(Integer.valueOf(c92.messages.get(0).getId()))));
                i13 = qnVar.R3;
                if (i13 != 1 || i13 == 9 || (chatFull = qnVar.Z7) == null) {
                    arrayList = arrayList4;
                    j10 = 0;
                } else {
                    arrayList = arrayList4;
                    j10 = chatFull.linked_chat_id;
                }
                u1Var.b8 = j10;
                if (i13 == 7 || qnVar.O3 != 1) {
                    u1Var.c8 = UserObject.isReplyUser(qnVar.f);
                } else {
                    u1Var.c8 = UserObject.isReplyUser(messageObject2.getDialogId());
                }
                u1Var.d8 = qnVar.R3 != 2;
                u1Var.E8 = qnVar.y9();
                u1Var.F8 = qnVar.H9();
                u1Var.G8 = qnVar.G9();
                u1Var.H8 = qnVar.V8();
                u1Var.I8 = qnVar.W8();
                if (messageObject2.isSponsored()) {
                    AndroidUtilities.doOnPreDraw(u1Var, new ah.j(23));
                }
                int i29 = i10 + 2;
                if (c92 == null) {
                    MessageObject.GroupedMessagePosition position = c92.getPosition(messageObject2);
                    if (position != null) {
                        if (c92.isDocuments) {
                            int indexOf2 = c92.posArray.indexOf(position) + i10 + 1;
                            i14 = 4;
                            int indexOf3 = c92.posArray.indexOf(position) + (i10 - c92.posArray.size());
                            i16 = indexOf2;
                            z13 = false;
                            z14 = false;
                            i15 = indexOf3;
                            z12 = false;
                        } else {
                            i14 = 4;
                            if ((position.flags & 4) != 0) {
                                i22 = c92.reversed ? c92.posArray.indexOf(position) + (i10 - c92.posArray.size()) : c92.posArray.indexOf(position) + i10 + 1;
                                z12 = false;
                                z29 = false;
                            } else {
                                z12 = true;
                                z29 = true;
                                i22 = -100;
                            }
                            if ((position.flags & 8) != 0) {
                                int i30 = i22;
                                i15 = c92.reversed ? c92.posArray.indexOf(position) + i10 + 1 : c92.posArray.indexOf(position) + (i10 - c92.posArray.size());
                                i16 = i30;
                                z30 = z29;
                                z13 = false;
                                z14 = false;
                            } else {
                                i16 = i22;
                                z30 = z29;
                                i15 = -100;
                                z13 = true;
                                z14 = true;
                            }
                        }
                        int j16 = j(i15);
                        boolean z33 = z12;
                        j11 = j(i16);
                        j(i29);
                        if ((messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && j16 == b1Var.f) {
                            arrayList2 = arrayList;
                            MessageObject messageObject5 = (MessageObject) arrayList2.get(i15 - this.J);
                            i17 = i16;
                            boolean z34 = messageObject5.isOutOwner() == messageObject2.isOutOwner() && (Math.abs(messageObject5.messageOwner.date - messageObject2.messageOwner.date) <= 300 || qnVar.R3 == 9);
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
                                        } else if (qnVar.R3 == 7) {
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
                            i17 = i16;
                        }
                        i18 = i17 - this.J;
                        if (i18 >= 0 && i18 < arrayList2.size()) {
                            messageObject = (MessageObject) arrayList2.get(i17 - this.J);
                            if (messageObject != null && messageObject.isDateObject) {
                                int i31 = i17 + 1;
                                int i32 = i31 - this.J;
                                messageObject = (i32 >= 0 || i32 >= arrayList2.size()) ? null : (MessageObject) arrayList2.get(i31 - this.J);
                            }
                            if (messageObject != null && messageObject.getTopicId() == messageObject2.getTopicId()) {
                                z17 = z16;
                                z18 = false;
                                i19 = this.J;
                                if (i10 == i19) {
                                    z19 = z15;
                                    z20 = true;
                                } else {
                                    z19 = z15;
                                    z20 = false;
                                }
                                if (j11 == b1Var.f) {
                                    MessageObject messageObject6 = (MessageObject) arrayList2.get(i17 - i19);
                                    boolean z35 = !(messageObject6.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && messageObject6.isOutOwner() == messageObject2.isOutOwner() && (Math.abs(messageObject6.messageOwner.date - messageObject2.messageOwner.date) <= 300 || qnVar.R3 == 9);
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
                                        if (!z17 && z36 && fromChatId2 < 0 && qnVar.e.megagroup && qnVar.R3 != 9) {
                                            z36 = false;
                                        }
                                        if (z36 && qnVar.A9()) {
                                            TLRPC.TL_forumTopic tL_forumTopic = messageObject2.replyToForumTopic;
                                            if (tL_forumTopic == null) {
                                                z28 = true;
                                                j12 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.n2) qnVar).currentAccount, messageObject2.messageOwner, true);
                                            } else {
                                                z28 = true;
                                                j12 = tL_forumTopic.id;
                                            }
                                            TLRPC.TL_forumTopic tL_forumTopic2 = messageObject6.replyToForumTopic;
                                            if (tL_forumTopic2 == null) {
                                                z21 = z19;
                                                j13 = j12;
                                                j14 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.n2) qnVar).currentAccount, messageObject6.messageOwner, z28);
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
                                        } else if (qnVar.R3 != 7) {
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
                                if (c92 != null) {
                                    int i33 = 0;
                                    while (i33 < c92.messages.size()) {
                                        c92.messages.get(i33).updateTranslation(z37);
                                        i33++;
                                        z37 = false;
                                    }
                                }
                                if (!qnVar.Qa) {
                                    z23 = z22;
                                    z24 = z14;
                                } else {
                                    if (c92 != null) {
                                        z25 = true;
                                        z24 = false;
                                        z23 = false;
                                        u1Var.setShowTopic(z25);
                                        u1Var.X3(messageObject2, c92, z24, z23, z18, z20);
                                        u1Var.setSpoilersSuppressed(qnVar.x0.getScrollState() == 0);
                                        u1Var.setHighlighted(qnVar.L7 == Integer.MAX_VALUE && messageObject2.getId() == qnVar.L7);
                                        z26 = u1Var.f8;
                                        if (!z26 && qnVar.P7 != null) {
                                            long currentTimeMillis = System.currentTimeMillis();
                                            u1Var.T3(qnVar.P7, true, qnVar.N7 || currentTimeMillis - qnVar.O7 < 200, qnVar.S7);
                                            if (qnVar.N7) {
                                                qnVar.O7 = currentTimeMillis;
                                            }
                                            qnVar.N7 = false;
                                        } else if (!z26 && (num = qnVar.Q7) != null) {
                                            u1Var.R3(num.intValue());
                                        } else if (!z26 && (bArr = qnVar.R7) != null) {
                                            u1Var.P3(bArr);
                                        } else if (qnVar.R3 == 7 && qnVar.u3 != null && (str = qnVar.t3) != null) {
                                            u1Var.S3(str);
                                        }
                                        if (qnVar.L7 != Integer.MAX_VALUE) {
                                            qnVar.ec();
                                        }
                                        indexOf = arrayList3.indexOf(messageObject2);
                                        if (indexOf != -1) {
                                            if (messageObject2.type == 5 && (r60Var = qnVar.b3) != null && r60Var.getTextureView() != null) {
                                                kf kfVar = qnVar.q7;
                                                if (kfVar != null) {
                                                    AndroidUtilities.cancelRunOnUIThread(kfVar);
                                                    qnVar.q7 = null;
                                                }
                                                u1Var.getViewTreeObserver().addOnPreDrawListener(new xl(0, this, u1Var));
                                            } else if ((messageObject2.isAnyKindOfSticker() && !messageObject2.isAnimatedEmojiStickers()) || ((sendAnimationData = messageObject2.sendAnimationData) != null && sendAnimationData.fromPreview)) {
                                                if (!messageObject2.sendAnimationData.fromPreview || (fkVar = qnVar.Y) == null || fkVar.L0 == null) {
                                                    u1Var.getViewTreeObserver().addOnPreDrawListener(new cm(this, u1Var));
                                                } else {
                                                    if (((org.telegram.ui.ActionBar.n2) qnVar).actionBar.getVisibility() == 0) {
                                                        int measuredHeight = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar.getMeasuredHeight() + ((int) ((org.telegram.ui.ActionBar.n2) qnVar).actionBar.getTranslationY());
                                                        qk qkVar = qnVar.o1;
                                                        int currentHeight = measuredHeight + (qkVar != null ? qkVar.getCurrentHeight() : 0);
                                                        ck ckVar = qnVar.p1;
                                                        i20 = (((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode ? AndroidUtilities.statusBarHeight : 0) + currentHeight + (ckVar != null ? ckVar.getCurrentHeight() : 0);
                                                    } else {
                                                        i20 = 0;
                                                    }
                                                    float f7 = i20 + qnVar.t9;
                                                    float height = qnVar.fragmentView == null ? 0.0f : r9.getHeight();
                                                    org.telegram.ui.Components.mf mfVar = qnVar.Y.L0;
                                                    Rect rect = mfVar.t0;
                                                    if (!mfVar.p0) {
                                                        mfVar.r = true;
                                                        mfVar.p0 = true;
                                                        zh0 zh0Var = mfVar.W;
                                                        if (zh0Var != null) {
                                                            zh0Var.invalidate();
                                                        }
                                                        org.telegram.ui.Components.vg vgVar = mfVar.V;
                                                        if (vgVar != null) {
                                                            vgVar.invalidate();
                                                        }
                                                        if (mfVar.P != null) {
                                                            mfVar.q0 = u1Var;
                                                            u1Var.setVisibility(i14);
                                                            mfVar.r0 = f7;
                                                            mfVar.s0 = height;
                                                            org.telegram.ui.Cells.u1 u1Var2 = mfVar.P;
                                                            org.telegram.ui.Cells.u1 u1Var3 = mfVar.q0;
                                                            u1Var2.N7 = u1Var3.N7;
                                                            u1Var2.W7 = u1Var3.W7;
                                                            u1Var2.P7 = u1Var3.P7;
                                                            u1Var2.R7 = u1Var3.R7;
                                                            u1Var2.T7 = u1Var3.T7;
                                                            u1Var2.V7 = u1Var3.V7;
                                                            u1Var2.X3(u1Var.getMessageObject(), null, u1Var.m3(), u1Var.n3(), u1Var.h3(), false);
                                                            org.telegram.ui.Cells.t1 transitionParams = mfVar.P.getTransitionParams();
                                                            transitionParams.g = mfVar.P.getTransitionParams().f();
                                                            Rect rect2 = transitionParams.D0;
                                                            transitionParams.K1 = 0.0f;
                                                            if (mfVar.P.getTransitionParams().D0.left == mfVar.P.getBackgroundDrawableLeft() && rect2.top == mfVar.P.getBackgroundDrawableTop() && rect2.bottom == mfVar.P.getBackgroundDrawableBottom()) {
                                                                i21 = 1;
                                                            } else {
                                                                rect.bottom = -(mfVar.P.getBackgroundDrawableBottom() - rect2.bottom);
                                                                rect.top = -(mfVar.P.getBackgroundDrawableTop() - rect2.top);
                                                                if (u1Var.getMessageObject().isOutOwner()) {
                                                                    rect.left = -(mfVar.P.getBackgroundDrawableLeft() - rect2.left);
                                                                    rect.right = 0;
                                                                } else {
                                                                    rect.left = 0;
                                                                    rect.right = mfVar.P.getBackgroundDrawableRight() - rect2.right;
                                                                }
                                                                i21 = 1;
                                                                transitionParams.w0 = true;
                                                            }
                                                            int i34 = mfVar.P.Yd;
                                                        } else {
                                                            i21 = 1;
                                                        }
                                                        mfVar.d(new rh0(mfVar, i21), false);
                                                        mfVar.E.invalidate();
                                                        NotificationCenter.getInstance(mfVar.c).removeObserver(mfVar, NotificationCenter.availableEffectsUpdate);
                                                    }
                                                    qnVar.Y.L0 = null;
                                                }
                                            }
                                            arrayList3.remove(indexOf);
                                            fk fkVar2 = qnVar.Y;
                                            Runnable runnable = fkVar2.f0;
                                            if (runnable != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable);
                                                z27 = true;
                                                fkVar2.g0 = true;
                                                fkVar2.f0.run();
                                                fkVar2.f0 = null;
                                            } else {
                                                z27 = true;
                                            }
                                            qnVar.Y.o0(z27);
                                        }
                                        if (!hashMap.isEmpty() && hashMap.containsKey(messageObject2.getDocument())) {
                                            hashMap.remove(messageObject2.getDocument());
                                            pjVar = qnVar.y0;
                                            if (pjVar != null) {
                                                org.telegram.ui.Components.to toVar = qnVar.S0;
                                                pjVar.O = b1Var;
                                                pjVar.P = toVar;
                                                r10 = 0;
                                                pjVar.N = false;
                                                if (u1Var.fd) {
                                                    u1Var.fd = r10;
                                                    u1Var.setVisibility(r10);
                                                }
                                                qnVar.zb(u1Var);
                                            }
                                        }
                                        r10 = 0;
                                        if (u1Var.fd) {
                                        }
                                        qnVar.zb(u1Var);
                                    }
                                    z24 = z22;
                                    z23 = z14;
                                }
                                z25 = true;
                                u1Var.setShowTopic(z25);
                                u1Var.X3(messageObject2, c92, z24, z23, z18, z20);
                                u1Var.setSpoilersSuppressed(qnVar.x0.getScrollState() == 0);
                                u1Var.setHighlighted(qnVar.L7 == Integer.MAX_VALUE && messageObject2.getId() == qnVar.L7);
                                z26 = u1Var.f8;
                                if (!z26) {
                                }
                                if (!z26) {
                                }
                                if (!z26) {
                                }
                                if (qnVar.R3 == 7) {
                                    u1Var.S3(str);
                                }
                                if (qnVar.L7 != Integer.MAX_VALUE) {
                                }
                                indexOf = arrayList3.indexOf(messageObject2);
                                if (indexOf != -1) {
                                }
                                if (!hashMap.isEmpty()) {
                                    hashMap.remove(messageObject2.getDocument());
                                    pjVar = qnVar.y0;
                                    if (pjVar != null) {
                                    }
                                }
                                r10 = 0;
                                if (u1Var.fd) {
                                }
                                qnVar.zb(u1Var);
                            }
                        }
                        z17 = z16;
                        z18 = true;
                        i19 = this.J;
                        if (i10 == i19) {
                        }
                        if (j11 == b1Var.f) {
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
                        if (c92 != null) {
                        }
                        if (!qnVar.Qa) {
                        }
                        z25 = true;
                        u1Var.setShowTopic(z25);
                        u1Var.X3(messageObject2, c92, z24, z23, z18, z20);
                        u1Var.setSpoilersSuppressed(qnVar.x0.getScrollState() == 0);
                        u1Var.setHighlighted(qnVar.L7 == Integer.MAX_VALUE && messageObject2.getId() == qnVar.L7);
                        z26 = u1Var.f8;
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (qnVar.R3 == 7) {
                        }
                        if (qnVar.L7 != Integer.MAX_VALUE) {
                        }
                        indexOf = arrayList3.indexOf(messageObject2);
                        if (indexOf != -1) {
                        }
                        if (!hashMap.isEmpty()) {
                        }
                        r10 = 0;
                        if (u1Var.fd) {
                        }
                        qnVar.zb(u1Var);
                    }
                    i14 = 4;
                    z12 = false;
                    i16 = -100;
                    i15 = -100;
                } else {
                    i14 = 4;
                    i15 = i10 - 1;
                    i16 = i10 + 1;
                    z12 = false;
                }
                z13 = false;
                z30 = false;
                z14 = false;
                int j162 = j(i15);
                boolean z332 = z12;
                j11 = j(i16);
                j(i29);
                if (messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                }
                z15 = z13;
                z16 = z30;
                arrayList2 = arrayList;
                i17 = i16;
                i18 = i17 - this.J;
                if (i18 >= 0) {
                    messageObject = (MessageObject) arrayList2.get(i17 - this.J);
                    if (messageObject != null) {
                        int i312 = i17 + 1;
                        int i322 = i312 - this.J;
                        if (i322 >= 0) {
                        }
                    }
                    if (messageObject != null) {
                        z17 = z16;
                        z18 = false;
                        i19 = this.J;
                        if (i10 == i19) {
                        }
                        if (j11 == b1Var.f) {
                        }
                        if (ChatObject.isChannel(qnVar.e)) {
                        }
                        if (!z17) {
                        }
                        boolean z3722 = false;
                        messageObject2.updateTranslation(false);
                        if (c92 != null) {
                        }
                        if (!qnVar.Qa) {
                        }
                        z25 = true;
                        u1Var.setShowTopic(z25);
                        u1Var.X3(messageObject2, c92, z24, z23, z18, z20);
                        u1Var.setSpoilersSuppressed(qnVar.x0.getScrollState() == 0);
                        u1Var.setHighlighted(qnVar.L7 == Integer.MAX_VALUE && messageObject2.getId() == qnVar.L7);
                        z26 = u1Var.f8;
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (qnVar.R3 == 7) {
                        }
                        if (qnVar.L7 != Integer.MAX_VALUE) {
                        }
                        indexOf = arrayList3.indexOf(messageObject2);
                        if (indexOf != -1) {
                        }
                        if (!hashMap.isEmpty()) {
                        }
                        r10 = 0;
                        if (u1Var.fd) {
                        }
                        qnVar.zb(u1Var);
                    }
                }
                z17 = z16;
                z18 = true;
                i19 = this.J;
                if (i10 == i19) {
                }
                if (j11 == b1Var.f) {
                }
                if (ChatObject.isChannel(qnVar.e)) {
                }
                if (!z17) {
                }
                boolean z37222 = false;
                messageObject2.updateTranslation(false);
                if (c92 != null) {
                }
                if (!qnVar.Qa) {
                }
                z25 = true;
                u1Var.setShowTopic(z25);
                u1Var.X3(messageObject2, c92, z24, z23, z18, z20);
                u1Var.setSpoilersSuppressed(qnVar.x0.getScrollState() == 0);
                u1Var.setHighlighted(qnVar.L7 == Integer.MAX_VALUE && messageObject2.getId() == qnVar.L7);
                z26 = u1Var.f8;
                if (!z26) {
                }
                if (!z26) {
                }
                if (!z26) {
                }
                if (qnVar.R3 == 7) {
                }
                if (qnVar.L7 != Integer.MAX_VALUE) {
                }
                indexOf = arrayList3.indexOf(messageObject2);
                if (indexOf != -1) {
                }
                if (!hashMap.isEmpty()) {
                }
                r10 = 0;
                if (u1Var.fd) {
                }
                qnVar.zb(u1Var);
            }
        }
        z11 = false;
        u1Var.X7 = z11;
        u1Var.Y7 = qnVar.R3 != 0 && (qnVar.J4.containsKey(Integer.valueOf(messageObject2.getId())) || !(c92 == null || c92.messages.isEmpty() || !qnVar.J4.containsKey(Integer.valueOf(c92.messages.get(0).getId()))));
        i13 = qnVar.R3;
        if (i13 != 1) {
        }
        arrayList = arrayList4;
        j10 = 0;
        u1Var.b8 = j10;
        if (i13 == 7) {
        }
        u1Var.c8 = UserObject.isReplyUser(qnVar.f);
        u1Var.d8 = qnVar.R3 != 2;
        u1Var.E8 = qnVar.y9();
        u1Var.F8 = qnVar.H9();
        u1Var.G8 = qnVar.G9();
        u1Var.H8 = qnVar.V8();
        u1Var.I8 = qnVar.W8();
        if (messageObject2.isSponsored()) {
        }
        int i292 = i10 + 2;
        if (c92 == null) {
        }
        z13 = false;
        z30 = false;
        z14 = false;
        int j1622 = j(i15);
        boolean z3322 = z12;
        j11 = j(i16);
        j(i292);
        if (messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
        }
        z15 = z13;
        z16 = z30;
        arrayList2 = arrayList;
        i17 = i16;
        i18 = i17 - this.J;
        if (i18 >= 0) {
        }
        z17 = z16;
        z18 = true;
        i19 = this.J;
        if (i10 == i19) {
        }
        if (j11 == b1Var.f) {
        }
        if (ChatObject.isChannel(qnVar.e)) {
        }
        if (!z17) {
        }
        boolean z372222 = false;
        messageObject2.updateTranslation(false);
        if (c92 != null) {
        }
        if (!qnVar.Qa) {
        }
        z25 = true;
        u1Var.setShowTopic(z25);
        u1Var.X3(messageObject2, c92, z24, z23, z18, z20);
        u1Var.setSpoilersSuppressed(qnVar.x0.getScrollState() == 0);
        u1Var.setHighlighted(qnVar.L7 == Integer.MAX_VALUE && messageObject2.getId() == qnVar.L7);
        z26 = u1Var.f8;
        if (!z26) {
        }
        if (!z26) {
        }
        if (!z26) {
        }
        if (qnVar.R3 == 7) {
        }
        if (qnVar.L7 != Integer.MAX_VALUE) {
        }
        indexOf = arrayList3.indexOf(messageObject2);
        if (indexOf != -1) {
        }
        if (!hashMap.isEmpty()) {
        }
        r10 = 0;
        if (u1Var.fd) {
        }
        qnVar.zb(u1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [org.telegram.ui.wl] */
    /* JADX WARN: Type inference failed for: r8v11, types: [org.telegram.ui.Cells.w0] */
    /* JADX WARN: Type inference failed for: r8v12, types: [org.telegram.ui.Cells.xa] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Cells.z0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [org.telegram.ui.Cells.h0, org.telegram.ui.vl] */
    /* JADX WARN: Type inference failed for: r8v16, types: [org.telegram.ui.Cells.w1] */
    /* JADX WARN: Type inference failed for: r8v9, types: [org.telegram.ui.Cells.v1] */
    /* JADX WARN: Type inference failed for: r9v12, types: [org.telegram.ui.Cells.w0] */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.Cells.u1 u1Var2;
        qn qnVar = this.Q;
        if (i10 == 0) {
            u1Var = new org.telegram.ui.Cells.u1(this.h, ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount, true, qnVar.Ca, qnVar.ea);
            u1Var.setResourcesProvider(qnVar.ea);
            if (qnVar.pc == null) {
                qnVar.pc = new cn(qnVar);
            }
            u1Var.setDelegate(qnVar.pc);
            u1Var.Pd = qnVar.Pb;
            if (qnVar.h == null) {
                u1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? slVar = new sl(context, qnVar.ea, true);
                slVar.setInvalidateColors(true);
                slVar.setDelegate(new ul(this));
                u1Var = slVar;
            } else {
                if (i10 == 2) {
                    u1Var2 = new org.telegram.ui.Cells.w1(context, qnVar.ea);
                } else if (i10 == 3) {
                    ?? vlVar = new vl(this, context, ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount, qnVar.ea);
                    vlVar.setDelegate(new b1(this, 20));
                    u1Var2 = vlVar;
                } else if (i10 == 4) {
                    u1Var2 = new org.telegram.ui.Cells.z0(context, qnVar.ea);
                } else if (i10 == 6) {
                    u1Var2 = new org.telegram.ui.Cells.xa(context, ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount, qnVar.ea);
                } else if (i10 == 7) {
                    u1Var2 = new org.telegram.ui.Cells.w0(context, qnVar.ea, false);
                } else if (i10 == 8) {
                    u1Var2 = new wl(this, context, ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount, qnVar.ea);
                } else if (i10 == 10) {
                    ?? v1Var = new org.telegram.ui.Cells.v1(context, qnVar.ea);
                    if (qnVar.pc == null) {
                        qnVar.pc = new cn(qnVar);
                    }
                    v1Var.setDelegate(qnVar.pc);
                    u1Var2 = v1Var;
                } else {
                    u1Var = null;
                }
                u1Var = u1Var2;
            }
        }
        return com.google.android.gms.internal.play_billing.k3.l(u1Var, u1Var, -1, -2);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        TLRPC.Message message;
        boolean z10;
        boolean z11;
        byte[] bArr;
        Integer num;
        String str;
        String stickerEmoji;
        MessagesController.EmojiSound emojiSound;
        View view = b1Var.a;
        boolean z12 = view instanceof org.telegram.ui.Cells.u1;
        qn qnVar = this.Q;
        if (z12 || (view instanceof org.telegram.ui.Cells.w0)) {
            qnVar.w9();
        }
        boolean z13 = view instanceof org.telegram.ui.Cells.u1;
        if (z13) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            MessageObject messageObject = u1Var.getMessageObject();
            u1Var.E8 = qnVar.y9();
            u1Var.F8 = qnVar.H9();
            u1Var.G8 = qnVar.G9();
            u1Var.H8 = qnVar.V8();
            u1Var.I8 = qnVar.W8();
            u1Var.g4(-1, true, false);
            MessageObject messageObject2 = qnVar.G3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                u1Var.g4(qnVar.H3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = qnVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                qnVar.getMediaController().playEmojiSound(qnVar.getAccountInstance(), stickerEmoji, emojiSound, true);
            }
            if (messageObject.updateTranslation(false)) {
                u1Var.X3(messageObject, u1Var.getCurrentMessagesGroup(), u1Var.m3(), u1Var.n3(), u1Var.h3(), u1Var.j3());
            } else {
                MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    for (int i10 = 0; i10 < currentMessagesGroup.messages.size(); i10++) {
                        currentMessagesGroup.messages.get(i10).updateTranslation();
                    }
                }
            }
            if (((org.telegram.ui.ActionBar.n2) qnVar).actionBar.t() || qnVar.F9()) {
                qnVar.N7 = false;
                qnVar.O7 = 0L;
                qnVar.P7 = null;
                ArrayList arrayList = qnVar.a4;
                u1Var.J3(arrayList == null || !arrayList.contains(messageObject), false);
                int i11 = messageObject.getDialogId() == qnVar.T5 ? 0 : 1;
                if (qnVar.W5[i11].indexOfKey(messageObject.getId()) >= 0) {
                    qnVar.mb(messageObject, u1Var, i11, false);
                    z10 = true;
                } else {
                    u1Var.setDrawSelectionBackground(false);
                    u1Var.L3(false, false, false);
                    z10 = false;
                }
                z11 = true;
            } else {
                u1Var.setDrawSelectionBackground(false);
                u1Var.L3(false, false, false);
                u1Var.J3(false, false);
                z10 = false;
                z11 = false;
            }
            u1Var.K3(!z11, z11 && z10);
            if (qnVar.R3 != 7 || qnVar.u3 == null || (str = qnVar.t3) == null) {
                ik ikVar = qnVar.R2;
                if (ikVar != null && ikVar.getVisibility() == 0) {
                    if (qnVar.getMediaDataController().isMessageFound(messageObject.getId(), messageObject.getDialogId() == qnVar.L6) && qnVar.getMediaDataController().getLastSearchQuery() != null) {
                        u1Var.S3(qnVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                u1Var.S3(null);
            } else {
                u1Var.S3(str);
            }
            if (!((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode || !u1Var.f8) {
                u1Var.setHighlighted(qnVar.L7 != Integer.MAX_VALUE && ((u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == qnVar.L7) || (u1Var.getCurrentMessagesGroup() != null && u1Var.getCurrentMessagesGroup().contains(qnVar.L7))));
                boolean z14 = u1Var.f8;
                if (z14 && qnVar.P7 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!u1Var.T3(qnVar.P7, true, qnVar.N7 || currentTimeMillis - qnVar.O7 < 200, qnVar.S7) && qnVar.M7) {
                        org.telegram.ui.Components.xc.a0(qnVar).Q(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    qnVar.M7 = false;
                    if (qnVar.N7) {
                        qnVar.O7 = currentTimeMillis;
                    }
                    qnVar.N7 = false;
                } else if (z14 && (num = qnVar.Q7) != null) {
                    u1Var.R3(num.intValue());
                } else if (z14 && (bArr = qnVar.R7) != null) {
                    u1Var.P3(bArr);
                }
                if (qnVar.L7 != Integer.MAX_VALUE) {
                    qnVar.ec();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            w0Var.e0 = qnVar.y9();
            w0Var.i0 = qnVar.H9();
            qnVar.G9();
            qnVar.V8();
            w0Var.j0 = qnVar.W8();
        } else if (view instanceof org.telegram.ui.Cells.w1) {
            ((org.telegram.ui.Cells.w1) view).getTextView().setTranslationX(qnVar.W8() / 2.0f);
        }
        int b10 = b1Var.b();
        int i12 = this.J;
        if (b10 < i12 || b10 >= this.K) {
            return;
        }
        MessageObject messageObject3 = (MessageObject) (this.L ? this.M : this.N ? this.P : qnVar.u6).get(b10 - i12);
        if (messageObject3 == null || (message = messageObject3.messageOwner) == null || !message.media_unread || !message.mentioned) {
            return;
        }
        if (!((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode && qnVar.R3 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
            int i13 = qnVar.l6 - 1;
            qnVar.l6 = i13;
            if (i13 <= 0) {
                qnVar.l6 = 0;
                qnVar.m6 = true;
                qnVar.Pb(false);
            } else {
                qnVar.j1.c(2, i13, true);
            }
            qnVar.getMessagesController().markMentionMessageAsRead(messageObject3.getId(), ChatObject.isChannel(qnVar.e) ? qnVar.e.id : 0L, qnVar.T5);
            messageObject3.setContentIsRead();
        }
        if (z13) {
            org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) view;
            if (((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode) {
                u1Var2.setHighlighted(true);
            } else {
                u1Var2.O3();
            }
        }
    }
}
