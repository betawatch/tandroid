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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class om extends org.telegram.ui.Components.mk0 {
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
    public final /* synthetic */ co Q;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public om(co coVar, Context context) {
        this.Q = coVar;
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
        TLRPC.User user = coVar.f;
        this.n = user != null && user.bot;
        C(true);
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void K(boolean z10) {
        co coVar = this.Q;
        if (UserObject.isBotForum(coVar.f)) {
            if (z10) {
                coVar.nc = true;
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
        co coVar = this.Q;
        int childCount = coVar.x0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = coVar.x0.getChildAt(i10);
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
        co coVar = this.Q;
        return UserObject.isBotForumWithEditableTopics(coVar.f) && coVar.d() == 0 && !coVar.nc && coVar.R3 == 0;
    }

    public final void O(boolean z10) {
        boolean z11;
        co coVar = this.Q;
        ArrayList arrayList = coVar.u6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + coVar.O5);
        }
        if (z10 && coVar.O5) {
            s4.m0 itemAnimator = coVar.x0.getItemAnimator();
            wj wjVar = coVar.y0;
            if (itemAnimator != wjVar) {
                coVar.x0.setItemAnimator(wjVar);
            }
        } else {
            coVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.l();
        } catch (Exception e7) {
            FileLog.e(e7);
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
        boolean[] zArr = coVar.C6;
        if ((zArr[0] && (coVar.L6 == 0 || zArr[1])) || z11) {
            coVar.L6(((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow);
        }
    }

    public final void P(int i10, boolean z10) {
        MessageObject messageObject;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i10);
            com.google.android.gms.internal.vision.e2.t(z10 ? " with thanos effect" : "", sb2);
        }
        co coVar = this.Q;
        if (((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = coVar.x0.getItemAnimator();
            wj wjVar = coVar.y0;
            if (itemAnimator != wjVar) {
                coVar.x0.setItemAnimator(wjVar);
            }
        } else {
            coVar.x0.setItemAnimator(null);
        }
        if (z10 && coVar.y0 != null) {
            s4.m0 itemAnimator2 = coVar.x0.getItemAnimator();
            wj wjVar2 = coVar.y0;
            if (itemAnimator2 == wjVar2) {
                s4.c1 K = coVar.x0.K(i10);
                if (K == null) {
                    wjVar2.getClass();
                } else {
                    wjVar2.S.add(K);
                    View view = K.a;
                    if ((view instanceof org.telegram.ui.Cells.t1) && (messageObject = ((org.telegram.ui.Cells.t1) view).getMessageObject()) != null) {
                        messageObject.deletedByThanos = true;
                    }
                }
            }
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void Q(int i10) {
        int i11;
        co coVar = this.Q;
        ArrayList arrayList = coVar.u6;
        if (coVar.z0 == null || this.L || this.N) {
            return;
        }
        int i12 = 0;
        if (!coVar.D4 && coVar.J7 != null) {
            int childCount = coVar.x0.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                View childAt = coVar.x0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                    MessageObject messageObject2 = coVar.J7;
                    if (messageObject == messageObject2) {
                        if (arrayList.indexOf(messageObject2) >= 0) {
                            i11 = arrayList.indexOf(coVar.J7) + this.J;
                            i12 = coVar.L8(childAt);
                        }
                    }
                }
                i13++;
            }
        }
        i11 = -1;
        m(i10);
        if (i11 != -1) {
            coVar.z0.h1(i11, i12);
        }
    }

    public final org.telegram.ui.Cells.t1 R(MessageObject messageObject, boolean z10, boolean z11) {
        co coVar = this.Q;
        if (z10) {
            int childCount = coVar.x0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = coVar.x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject() == messageObject && TextUtils.equals(t1Var.f7, t1Var.y7.messageOwner.post_author)) {
                        t1Var.X3(messageObject, t1Var.getCurrentMessagesGroup(), t1Var.m3(), t1Var.n3(), t1Var.h3(), t1Var.j3());
                        return t1Var;
                    }
                }
                i10++;
                messageObject = messageObject;
            }
        }
        MessageObject messageObject2 = messageObject;
        int indexOf = (this.L ? this.M : this.N ? this.P : coVar.u6).indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (!z11) {
            Q(this.J + indexOf);
            return null;
        }
        int i11 = co.Jc;
        co.Jc = i11 + 1;
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
        co coVar = this.Q;
        boolean[] zArr = coVar.C6;
        this.r = 0;
        ArrayList arrayList = this.L ? this.M : this.N ? this.P : coVar.u6;
        if (coVar.R3 == 3 && coVar.Oa) {
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
            TLRPC.User user4 = coVar.f;
            if (user4 != null && !UserObject.isBot(user4) && !UserObject.isReplyUser(coVar.f)) {
                TLRPC.PeerSettings peerSettings3 = coVar.getMessagesController().getPeerSettings(coVar.f.id);
                int i14 = org.telegram.ui.Cells.bb.O;
                if (peerSettings3 != null && ((peerSettings3.phone_country != null || peerSettings3.registration_month != null) && !MessagesController.isSupportUser(coVar.f) && coVar.R3 == 0)) {
                    int i15 = this.r;
                    this.r = i15 + 1;
                    this.y = i15;
                    return;
                }
            }
            if (UserObject.isReplyUser(coVar.f) || ((user = coVar.f) != null && user.bot && !MessagesController.isSupportUser(user) && coVar.R3 == 0)) {
                int i16 = this.r;
                this.r = i16 + 1;
                this.w = i16;
                return;
            }
            return;
        }
        if (!this.N) {
            boolean[] zArr2 = coVar.E6;
            if ((!zArr2[0] || (coVar.L6 != 0 && !zArr2[1])) && !coVar.F6) {
                int i17 = this.r;
                this.r = i17 + 1;
                this.F = i17;
                int i18 = this.r;
                this.J = i18;
                int size = arrayList.size() + i18;
                this.r = size;
                this.K = size;
                user2 = coVar.f;
                if (user2 != null && !UserObject.isBot(user2) && !UserObject.isReplyUser(coVar.f)) {
                    peerSettings = coVar.getMessagesController().getPeerSettings(coVar.f.id);
                    int i19 = org.telegram.ui.Cells.bb.O;
                    if (peerSettings != null && ((peerSettings.phone_country != null || peerSettings.registration_month != null) && !MessagesController.isSupportUser(coVar.f) && coVar.R3 == 0 && zArr[0])) {
                        peerSettings2 = coVar.getMessagesController().getPeerSettings(coVar.f.id);
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
                        i10 = coVar.R3;
                        if (i10 == 9) {
                            int i25 = this.r;
                            this.s = i25;
                            this.r = i25 + 2;
                            this.v = i25 + 1;
                        }
                        if (i10 == 5 && !ig.b2.g(coVar.Q3)) {
                            int i26 = this.r;
                            this.r = i26 + 1;
                            this.s = i26;
                        }
                        if (this.N ? !(!(zArr[0] && (coVar.L6 == 0 || zArr[1])) && (AndroidUtilities.isTablet() || coVar.g4 || coVar.f != null)) : this.O) {
                            this.E = -5;
                            return;
                        }
                        int i27 = this.r;
                        this.r = i27 + 1;
                        this.E = i27;
                        return;
                    }
                }
                if ((!UserObject.isReplyUser(coVar.f) || ((user3 = coVar.f) != null && user3.bot && !MessagesController.isSupportUser(user3) && coVar.R3 == 0)) && zArr[0]) {
                    int i28 = this.r;
                    this.r = i28 + 1;
                    this.w = i28;
                }
                i10 = coVar.R3;
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
        user2 = coVar.f;
        if (user2 != null) {
            peerSettings = coVar.getMessagesController().getPeerSettings(coVar.f.id);
            int i192 = org.telegram.ui.Cells.bb.O;
            if (peerSettings != null) {
                peerSettings2 = coVar.getMessagesController().getPeerSettings(coVar.f.id);
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
                i10 = coVar.R3;
                if (i10 == 9) {
                }
                if (i10 == 5) {
                }
                if (this.N) {
                }
            }
        }
        if (!UserObject.isReplyUser(coVar.f)) {
        }
        int i282 = this.r;
        this.r = i282 + 1;
        this.w = i282;
        i10 = coVar.R3;
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

    @Override // s4.h0
    public final int h() {
        this.x = -5;
        co coVar = this.Q;
        a0.i iVar = coVar.d8;
        if (coVar.M5.get(coVar.d4, 0) == 0) {
            return this.r;
        }
        TLRPC.User user = coVar.f;
        if (user == null || !user.bot || coVar.R3 != 0 || ((iVar.m() <= 0 || (((TL_bots.BotInfo) iVar.f(coVar.f.id)).description == null && ((TL_bots.BotInfo) iVar.f(coVar.f.id)).description_photo == null && ((TL_bots.BotInfo) iVar.f(coVar.f.id)).description_document == null)) && !UserObject.isReplyUser(coVar.f) && !UserObject.isBotForum(coVar.f))) {
            return 0;
        }
        this.x = 0;
        return 1;
    }

    @Override // s4.h0
    public final long i(int i10) {
        co coVar = this.Q;
        if (coVar.M5.get(coVar.d4, 0) != 0 && i10 == this.x) {
            return 1L;
        }
        ArrayList arrayList = this.L ? this.M : this.N ? this.P : coVar.u6;
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

    @Override // s4.h0
    public final int j(int i10) {
        co coVar = this.Q;
        if (coVar.M5.get(coVar.d4, 0) != 0 && i10 == this.x) {
            return 3;
        }
        if (i10 == this.s || i10 == this.v) {
            return 1;
        }
        int i11 = this.J;
        if (i10 >= i11 && i10 < this.K) {
            return ((MessageObject) (this.L ? this.M : this.N ? this.P : coVar.u6).get(i10 - i11)).contentType;
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

    @Override // org.telegram.ui.Components.mk0, s4.h0
    public final void l() {
        O(false);
    }

    @Override // org.telegram.ui.Components.mk0, s4.h0
    public final void m(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item changed " + i10);
        }
        co coVar = this.Q;
        if (!((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow || coVar.N0) {
            coVar.x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = coVar.x0.getItemAnimator();
            wj wjVar = coVar.y0;
            if (itemAnimator != wjVar) {
                coVar.x0.setItemAnimator(wjVar);
            }
        }
        S();
        try {
            super.m(i10);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.mk0, s4.h0
    public final void o(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item inserted " + i10);
        }
        co coVar = this.Q;
        if (((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = coVar.x0.getItemAnimator();
            wj wjVar = coVar.y0;
            if (itemAnimator != wjVar) {
                coVar.x0.setItemAnimator(wjVar);
            }
        } else {
            coVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.o(i10);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // s4.h0
    public final void p(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item moved" + i10 + ":" + i11);
        }
        co coVar = this.Q;
        if (((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = coVar.x0.getItemAnimator();
            wj wjVar = coVar.y0;
            if (itemAnimator != wjVar) {
                coVar.x0.setItemAnimator(wjVar);
            }
        } else {
            coVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.p(i10, i11);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.mk0, s4.h0
    public final void q(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range changed " + i10 + ":" + i11);
        }
        co coVar = this.Q;
        if (((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = coVar.x0.getItemAnimator();
            wj wjVar = coVar.y0;
            if (itemAnimator != wjVar) {
                coVar.x0.setItemAnimator(wjVar);
            }
        } else {
            coVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.q(i10, i11);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.mk0, s4.h0
    public final void s(int i10, int i11) {
        int i12;
        int i13;
        co coVar = this.Q;
        ArrayList arrayList = coVar.u6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        if (((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = coVar.x0.getItemAnimator();
            wj wjVar = coVar.y0;
            if (itemAnimator != wjVar) {
                coVar.x0.setItemAnimator(wjVar);
            }
        } else {
            coVar.x0.setItemAnimator(null);
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.J) && i12 < this.K) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.J) - 1);
            if ((coVar.e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (coVar.f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
                m(i10);
            }
        }
        try {
            super.s(i10, i11);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.mk0, s4.h0
    public final void t(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range removed" + i10 + ":" + i11);
        }
        co coVar = this.Q;
        if (((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = coVar.x0.getItemAnimator();
            wj wjVar = coVar.y0;
            if (itemAnimator != wjVar) {
                coVar.x0.setItemAnimator(wjVar);
            }
        } else {
            coVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.t(i10, i11);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.mk0, s4.h0
    public final void u(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item removed " + i10);
        }
        co coVar = this.Q;
        if (((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = coVar.x0.getItemAnimator();
            wj wjVar = coVar.y0;
            if (itemAnimator != wjVar) {
                coVar.x0.setItemAnimator(wjVar);
            }
        } else {
            coVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x05d0, code lost:
    
        if (r19 != r9) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0943, code lost:
    
        if (r4.y0 == null) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0603, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.peer_id) == org.telegram.messenger.MessageObject.getPeerId(r8.messageOwner.peer_id)) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0678, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0621, code lost:
    
        if (r8.getSenderId() == r5.getSenderId()) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0676, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r2) == org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.fwd_from.from_id)) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x03f5, code lost:
    
        if (r4.R3 != 9) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0421, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.peer_id) == org.telegram.messenger.MessageObject.getPeerId(r11.messageOwner.peer_id)) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0493, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x043c, code lost:
    
        if (r11.getSenderId() == r5.getSenderId()) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0491, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r10) == org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.fwd_from.from_id)) goto L267;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0a25  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0a3e  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0a27  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v16 */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.UserFull userFull;
        TLObject tLObject;
        org.telegram.ui.Cells.h0 h0Var;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        ArrayList arrayList;
        long j3;
        int i14;
        int i15;
        boolean z12;
        boolean z13;
        boolean z14;
        int j10;
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
        wj wjVar;
        MessageObject.SendAnimationData sendAnimationData;
        mk mkVar;
        int i19;
        int i20;
        boolean z27;
        gl glVar;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str2;
        boolean z28;
        long j11;
        long j12;
        long j13;
        MessageObject messageObject;
        String str3;
        int i21;
        boolean z29;
        TLRPC.ChatFull chatFull;
        View view = c1Var.a;
        co coVar = this.Q;
        a0.i iVar = coVar.d8;
        ArrayList arrayList3 = coVar.u4;
        HashMap hashMap = coVar.v4;
        boolean z30 = false;
        if (i10 == this.w || i10 == this.x) {
            org.telegram.ui.Cells.h0 h0Var2 = (org.telegram.ui.Cells.h0) view;
            if (UserObject.isReplyUser(coVar.f)) {
                h0Var = h0Var2;
                h0Var.b(false, 0L, LocaleController.getString(R.string.RepliesChatInfo), null, null, null);
            } else {
                TLRPC.User user = coVar.f;
                if (user == null || user.id != UserObject.VERIFY) {
                    TL_bots.BotInfo botInfo = iVar.m() != 0 ? (TL_bots.BotInfo) iVar.f(coVar.f.id) : null;
                    boolean z31 = (botInfo == null || (TextUtils.isEmpty(botInfo.description) && botInfo.description_photo == null && botInfo.description_document == null)) && UserObject.isBot(coVar.f) && (userFull = coVar.a8) != null && userFull.bot_manager_id != 0 && coVar.f.bot_can_edit;
                    TLRPC.User user2 = coVar.f;
                    long j14 = user2 == null ? 0L : user2.id;
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
                    h0Var.b(true, j14, str4, tLObject, botInfo, z31 ? DialogObject.getName(((org.telegram.ui.ActionBar.n2) coVar).currentAccount, coVar.a8.bot_manager_id) : null);
                } else {
                    h0Var = h0Var2;
                    h0Var.b(false, 0L, LocaleController.getString(R.string.VerifyChatInfo), null, null, null);
                }
            }
            co.b4(coVar, h0Var);
            return;
        }
        if (i10 == this.I) {
            ((org.telegram.ui.Cells.b0) view).setDialogId(coVar.a());
            return;
        }
        if (i10 == this.y) {
            org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) view;
            TLRPC.EncryptedChat encryptedChat = coVar.h;
            long a2 = encryptedChat != null ? encryptedChat.user_id : coVar.a();
            bbVar.b(a2, coVar.getMessagesController().getPeerSettings(a2));
            return;
        }
        if (i10 == this.F || i10 == this.E) {
            ((org.telegram.ui.Cells.z0) view).setProgressVisible(coVar.J6 > 1);
            return;
        }
        if (i10 == this.H) {
            if (coVar.getMessagesController().getPeerSettings(coVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.w0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedName, LocaleController.formatRelativeDate(coVar.getConnectionsManager().getCurrentTime() - r1.name_change_date)));
            return;
        }
        if (i10 == this.G) {
            if (coVar.getMessagesController().getPeerSettings(coVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.w0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedPhoto, LocaleController.formatRelativeDate(coVar.getConnectionsManager().getCurrentTime() - r1.photo_change_date)));
            return;
        }
        if (i10 == this.s) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            co.d4(coVar);
            w0Var.setMessageObject(coVar.I3);
            int i22 = coVar.R3;
            if (i22 == 3) {
                w0Var.setCustomText(LocaleController.getString(R.string.SavedMessagesProfileHint));
            } else if (i22 == 5) {
                w0Var.setCustomText(LocaleController.getString(R.string.BusinessRepliesHint));
            } else if (i22 == 9) {
                w0Var.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint2));
            }
            w0Var.setAlpha(1.0f);
            w0Var.setSpoilersSuppressed(coVar.x0.getScrollState() != 0);
            return;
        }
        if (i10 == this.v) {
            org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) view;
            co.e4(coVar);
            w0Var2.setMessageObject(coVar.J3);
            w0Var2.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint));
            w0Var2.setAlpha(1.0f);
            w0Var2.setSpoilersSuppressed(coVar.x0.getScrollState() != 0);
            return;
        }
        int i23 = this.J;
        if (i10 < i23 || i10 >= this.K) {
            return;
        }
        ArrayList arrayList4 = this.L ? this.M : this.N ? this.P : coVar.u6;
        MessageObject messageObject2 = (MessageObject) arrayList4.get(i10 - i23);
        if (!(view instanceof org.telegram.ui.Cells.t1)) {
            ArrayList arrayList5 = arrayList4;
            MessageObject messageObject3 = null;
            if (!(view instanceof org.telegram.ui.Cells.w0)) {
                if (view instanceof org.telegram.ui.Cells.v1) {
                    org.telegram.ui.Cells.v1 v1Var = (org.telegram.ui.Cells.v1) view;
                    v1Var.setText(LocaleController.getString(R.string.UnreadMessages));
                    v1Var.getTextView().setTranslationX(coVar.R8() / 2.0f);
                    if (coVar.D7 != 0) {
                        coVar.D7 = 0;
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
                    int i24 = i10 + 2;
                    int i25 = i24 - this.J;
                    if (i25 >= 0 && i25 < arrayList5.size()) {
                        messageObject3 = (MessageObject) arrayList5.get(i24 - this.J);
                    }
                }
                if (messageObject3 == null || (messageObject2 != null && messageObject3.getTopicId() != messageObject2.getTopicId())) {
                    z10 = true;
                    org.telegram.ui.Cells.w0 w0Var3 = (org.telegram.ui.Cells.w0) view;
                    w0Var3.e0 = coVar.t9();
                    w0Var3.i0 = coVar.C9();
                    coVar.B9();
                    coVar.Q8();
                    w0Var3.j0 = coVar.R8();
                    w0Var3.f0 = ChatObject.isForum(coVar.e);
                    w0Var3.g0 = ChatObject.isMonoForum(coVar.e);
                    w0Var3.h0 = UserObject.isBotForum(coVar.f);
                    boolean z32 = w0Var3.k0 == z10;
                    w0Var3.k0 = z10;
                    w0Var3.U(messageObject2, z32);
                    w0Var3.setAlpha(1.0f);
                    w0Var3.setShowTopic(true);
                    w0Var3.setSpoilersSuppressed(coVar.x0.getScrollState() == 0);
                    return;
                }
            }
            z10 = false;
            org.telegram.ui.Cells.w0 w0Var32 = (org.telegram.ui.Cells.w0) view;
            w0Var32.e0 = coVar.t9();
            w0Var32.i0 = coVar.C9();
            coVar.B9();
            coVar.Q8();
            w0Var32.j0 = coVar.R8();
            w0Var32.f0 = ChatObject.isForum(coVar.e);
            w0Var32.g0 = ChatObject.isMonoForum(coVar.e);
            w0Var32.h0 = UserObject.isBotForum(coVar.f);
            if (w0Var32.k0 == z10) {
            }
            w0Var32.k0 = z10;
            w0Var32.U(messageObject2, z32);
            w0Var32.setAlpha(1.0f);
            w0Var32.setShowTopic(true);
            w0Var32.setSpoilersSuppressed(coVar.x0.getScrollState() == 0);
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
        MessageObject.GroupedMessages X8 = coVar.X8(messageObject2);
        t1Var.N7 = coVar.e != null || UserObject.isUserSelf(coVar.f) || UserObject.isReplyUser(coVar.f) || coVar.R3 == 7;
        t1Var.y.a(false, false);
        t1Var.O7 = UserObject.isBotForum(coVar.f);
        t1Var.a8 = coVar.A9();
        int i26 = coVar.R3;
        t1Var.P7 = i26 == 3;
        t1Var.Q7 = i26 == 3 && coVar.Oa;
        TLRPC.User user3 = coVar.f;
        t1Var.R7 = user3 != null && user3.bot;
        t1Var.S7 = ChatObject.isChannel(coVar.e) && coVar.e.megagroup;
        t1Var.T7 = ChatObject.isForum(coVar.e);
        t1Var.U7 = ChatObject.isMonoForum(coVar.e);
        t1Var.V7 = ChatObject.isForum(coVar.e) && coVar.h4 && coVar.d() == 1;
        t1Var.W7 = (coVar.d4 != 0 || (t1Var.T7 && coVar.h4)) && !t1Var.U7;
        int i27 = coVar.R3;
        if (i27 != 1 && i27 != 9 && ChatObject.isChannel(coVar.e)) {
            TLRPC.Chat chat = coVar.e;
            if (chat.has_link && !chat.megagroup) {
                z11 = true;
                t1Var.X7 = z11;
                t1Var.Y7 = coVar.R3 != 0 && (coVar.J4.containsKey(Integer.valueOf(messageObject2.getId())) || !(X8 == null || X8.messages.isEmpty() || !coVar.J4.containsKey(Integer.valueOf(X8.messages.get(0).getId()))));
                i13 = coVar.R3;
                if (i13 != 1 || i13 == 9 || (chatFull = coVar.Z7) == null) {
                    arrayList = arrayList4;
                    j3 = 0;
                } else {
                    arrayList = arrayList4;
                    j3 = chatFull.linked_chat_id;
                }
                t1Var.b8 = j3;
                if (i13 == 7 || coVar.O3 != 1) {
                    t1Var.c8 = UserObject.isReplyUser(coVar.f);
                } else {
                    t1Var.c8 = UserObject.isReplyUser(messageObject2.getDialogId());
                }
                t1Var.d8 = coVar.R3 != 2;
                t1Var.E8 = coVar.t9();
                t1Var.F8 = coVar.C9();
                t1Var.G8 = coVar.B9();
                t1Var.H8 = coVar.Q8();
                t1Var.I8 = coVar.R8();
                if (messageObject2.isSponsored()) {
                    AndroidUtilities.doOnPreDraw(t1Var, new ah.j(19));
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
                        int j15 = j(i14);
                        boolean z33 = z12;
                        j10 = j(i15);
                        j(i28);
                        if ((messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && j15 == c1Var.f) {
                            arrayList2 = arrayList;
                            MessageObject messageObject5 = (MessageObject) arrayList2.get(i14 - this.J);
                            i16 = i15;
                            boolean z34 = messageObject5.isOutOwner() == messageObject2.isOutOwner() && (Math.abs(messageObject5.messageOwner.date - messageObject2.messageOwner.date) <= 300 || coVar.R3 == 9);
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
                                    } else if (coVar.e != null) {
                                        long fromChatId = messageObject5.getFromChatId();
                                        z34 = fromChatId == messageObject2.getFromChatId();
                                        if (!z15) {
                                            if (z34) {
                                                if (fromChatId < 0) {
                                                    if (coVar.e.megagroup) {
                                                    }
                                                }
                                            }
                                        }
                                        if (DialogObject.getPeerDialogId(messageObject5.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    } else {
                                        if (UserObject.isUserSelf(coVar.f) || UserObject.isReplyUser(coVar.f)) {
                                            if (!messageObject2.isPrivateForward()) {
                                                if (!messageObject5.isPrivateForward()) {
                                                }
                                            }
                                        } else if (coVar.R3 == 7) {
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
                        i17 = i16 - this.J;
                        if (i17 >= 0 && i17 < arrayList2.size()) {
                            messageObject = (MessageObject) arrayList2.get(i16 - this.J);
                            if (messageObject != null && messageObject.isDateObject) {
                                int i30 = i16 + 1;
                                int i31 = i30 - this.J;
                                messageObject = (i31 >= 0 || i31 >= arrayList2.size()) ? null : (MessageObject) arrayList2.get(i30 - this.J);
                            }
                            if (messageObject != null && messageObject.getTopicId() == messageObject2.getTopicId()) {
                                z17 = z16;
                                z18 = false;
                                i18 = this.J;
                                if (i10 == i18) {
                                    z19 = z15;
                                    z20 = true;
                                } else {
                                    z19 = z15;
                                    z20 = false;
                                }
                                if (j10 == c1Var.f) {
                                    MessageObject messageObject6 = (MessageObject) arrayList2.get(i16 - i18);
                                    boolean z35 = !(messageObject6.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && messageObject6.isOutOwner() == messageObject2.isOutOwner() && (Math.abs(messageObject6.messageOwner.date - messageObject2.messageOwner.date) <= 300 || coVar.R3 == 9);
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
                                    } else if (coVar.e != null) {
                                        long fromChatId2 = messageObject6.getFromChatId();
                                        boolean z36 = (fromChatId2 != messageObject2.getFromChatId() || messageObject2.isImportedForward() || messageObject6.isImportedForward()) ? false : true;
                                        if (!z17 && z36 && fromChatId2 < 0 && coVar.e.megagroup && coVar.R3 != 9) {
                                            z36 = false;
                                        }
                                        if (z36 && coVar.v9()) {
                                            TLRPC.TL_forumTopic tL_forumTopic = messageObject2.replyToForumTopic;
                                            if (tL_forumTopic == null) {
                                                z28 = true;
                                                j11 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.n2) coVar).currentAccount, messageObject2.messageOwner, true);
                                            } else {
                                                z28 = true;
                                                j11 = tL_forumTopic.id;
                                            }
                                            TLRPC.TL_forumTopic tL_forumTopic2 = messageObject6.replyToForumTopic;
                                            if (tL_forumTopic2 == null) {
                                                z21 = z19;
                                                j12 = j11;
                                                j13 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.n2) coVar).currentAccount, messageObject6.messageOwner, z28);
                                            } else {
                                                z21 = z19;
                                                j12 = j11;
                                                j13 = tL_forumTopic2.id;
                                            }
                                        } else {
                                            z21 = z19;
                                        }
                                        z22 = z36;
                                        if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    } else {
                                        z21 = z19;
                                        if (UserObject.isUserSelf(coVar.f) || UserObject.isReplyUser(coVar.f)) {
                                            if (!messageObject2.isPrivateForward()) {
                                                if (!messageObject6.isPrivateForward()) {
                                                }
                                            }
                                            z22 = false;
                                        } else if (coVar.R3 != 7) {
                                            z22 = z35;
                                        }
                                        if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    }
                                } else {
                                    z21 = z19;
                                    z22 = z33;
                                }
                                if (ChatObject.isChannel(coVar.e) && coVar.e.megagroup && messageObject2.getFromChatId() <= 0 && (messageFwdHeader = messageObject2.messageOwner.fwd_from) != null && (messageFwdHeader.saved_from_peer instanceof TLRPC.TL_peerChannel)) {
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
                                if (!coVar.Pa) {
                                    z23 = z22;
                                    z24 = z14;
                                } else {
                                    if (X8 != null) {
                                        z25 = true;
                                        z24 = false;
                                        z23 = false;
                                        t1Var.setShowTopic(z25);
                                        t1Var.X3(messageObject2, X8, z24, z23, z18, z20);
                                        t1Var.setSpoilersSuppressed(coVar.x0.getScrollState() == 0);
                                        t1Var.setHighlighted(coVar.L7 == Integer.MAX_VALUE && messageObject2.getId() == coVar.L7);
                                        z26 = t1Var.f8;
                                        if (!z26 && coVar.P7 != null) {
                                            long currentTimeMillis = System.currentTimeMillis();
                                            t1Var.T3(coVar.P7, true, coVar.N7 || currentTimeMillis - coVar.O7 < 200, coVar.S7);
                                            if (coVar.N7) {
                                                coVar.O7 = currentTimeMillis;
                                            }
                                            coVar.N7 = false;
                                        } else if (!z26 && (num = coVar.Q7) != null) {
                                            t1Var.R3(num.intValue());
                                        } else if (!z26 && (bArr = coVar.R7) != null) {
                                            t1Var.P3(bArr);
                                        } else if (coVar.R3 == 7 && coVar.u3 != null && (str = coVar.t3) != null) {
                                            t1Var.S3(str);
                                        }
                                        if (coVar.L7 != Integer.MAX_VALUE) {
                                            coVar.Zb();
                                        }
                                        indexOf = arrayList3.indexOf(messageObject2);
                                        if (indexOf != -1) {
                                            if (messageObject2.type == 5 && (glVar = coVar.b3) != null && glVar.getTextureView() != null) {
                                                me meVar = coVar.q7;
                                                if (meVar != null) {
                                                    AndroidUtilities.cancelRunOnUIThread(meVar);
                                                    coVar.q7 = null;
                                                }
                                                t1Var.getViewTreeObserver().addOnPreDrawListener(new im(0, this, t1Var));
                                            } else if ((messageObject2.isAnyKindOfSticker() && !messageObject2.isAnimatedEmojiStickers()) || ((sendAnimationData = messageObject2.sendAnimationData) != null && sendAnimationData.fromPreview)) {
                                                if (!messageObject2.sendAnimationData.fromPreview || (mkVar = coVar.Y) == null || mkVar.L0 == null) {
                                                    t1Var.getViewTreeObserver().addOnPreDrawListener(new nm(this, t1Var));
                                                } else {
                                                    if (((org.telegram.ui.ActionBar.n2) coVar).actionBar.getVisibility() == 0) {
                                                        int measuredHeight = ((org.telegram.ui.ActionBar.n2) coVar).actionBar.getMeasuredHeight() + ((int) ((org.telegram.ui.ActionBar.n2) coVar).actionBar.getTranslationY());
                                                        yk ykVar = coVar.o1;
                                                        int currentHeight = measuredHeight + (ykVar != null ? ykVar.getCurrentHeight() : 0);
                                                        kk kkVar = coVar.p1;
                                                        i19 = (((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode ? AndroidUtilities.statusBarHeight : 0) + currentHeight + (kkVar != null ? kkVar.getCurrentHeight() : 0);
                                                    } else {
                                                        i19 = 0;
                                                    }
                                                    float f7 = i19 + coVar.t9;
                                                    float height = coVar.fragmentView == null ? 0.0f : r9.getHeight();
                                                    org.telegram.ui.Components.nf nfVar = coVar.Y.L0;
                                                    Rect rect = nfVar.u0;
                                                    if (!nfVar.q0) {
                                                        nfVar.s = true;
                                                        nfVar.q0 = true;
                                                        pi0 pi0Var = nfVar.X;
                                                        if (pi0Var != null) {
                                                            pi0Var.invalidate();
                                                        }
                                                        org.telegram.ui.Components.vg vgVar = nfVar.W;
                                                        if (vgVar != null) {
                                                            vgVar.invalidate();
                                                        }
                                                        if (nfVar.Q != null) {
                                                            nfVar.r0 = t1Var;
                                                            t1Var.setVisibility(4);
                                                            nfVar.s0 = f7;
                                                            nfVar.t0 = height;
                                                            org.telegram.ui.Cells.t1 t1Var2 = nfVar.Q;
                                                            org.telegram.ui.Cells.t1 t1Var3 = nfVar.r0;
                                                            t1Var2.N7 = t1Var3.N7;
                                                            t1Var2.W7 = t1Var3.W7;
                                                            t1Var2.P7 = t1Var3.P7;
                                                            t1Var2.R7 = t1Var3.R7;
                                                            t1Var2.T7 = t1Var3.T7;
                                                            t1Var2.V7 = t1Var3.V7;
                                                            t1Var2.X3(t1Var.getMessageObject(), null, t1Var.m3(), t1Var.n3(), t1Var.h3(), false);
                                                            org.telegram.ui.Cells.s1 transitionParams = nfVar.Q.getTransitionParams();
                                                            transitionParams.g = nfVar.Q.getTransitionParams().f();
                                                            Rect rect2 = transitionParams.D0;
                                                            transitionParams.K1 = 0.0f;
                                                            if (nfVar.Q.getTransitionParams().D0.left == nfVar.Q.getBackgroundDrawableLeft() && rect2.top == nfVar.Q.getBackgroundDrawableTop() && rect2.bottom == nfVar.Q.getBackgroundDrawableBottom()) {
                                                                i20 = 1;
                                                            } else {
                                                                rect.bottom = -(nfVar.Q.getBackgroundDrawableBottom() - rect2.bottom);
                                                                rect.top = -(nfVar.Q.getBackgroundDrawableTop() - rect2.top);
                                                                if (t1Var.getMessageObject().isOutOwner()) {
                                                                    rect.left = -(nfVar.Q.getBackgroundDrawableLeft() - rect2.left);
                                                                    rect.right = 0;
                                                                } else {
                                                                    rect.left = 0;
                                                                    rect.right = nfVar.Q.getBackgroundDrawableRight() - rect2.right;
                                                                }
                                                                i20 = 1;
                                                                transitionParams.w0 = true;
                                                            }
                                                            int i33 = nfVar.Q.Yd;
                                                        } else {
                                                            i20 = 1;
                                                        }
                                                        nfVar.e(new hi0(nfVar, i20), false);
                                                        nfVar.F.invalidate();
                                                        nfVar.c();
                                                    }
                                                    coVar.Y.L0 = null;
                                                }
                                            }
                                            arrayList3.remove(indexOf);
                                            mk mkVar2 = coVar.Y;
                                            Runnable runnable = mkVar2.f0;
                                            if (runnable != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable);
                                                z27 = true;
                                                mkVar2.g0 = true;
                                                mkVar2.f0.run();
                                                mkVar2.f0 = null;
                                            } else {
                                                z27 = true;
                                            }
                                            coVar.Y.q0(z27);
                                        }
                                        if (!hashMap.isEmpty() && hashMap.containsKey(messageObject2.getDocument())) {
                                            hashMap.remove(messageObject2.getDocument());
                                            wjVar = coVar.y0;
                                            if (wjVar != null) {
                                                org.telegram.ui.Components.io ioVar = coVar.S0;
                                                wjVar.O = c1Var;
                                                wjVar.P = ioVar;
                                                r10 = 0;
                                                wjVar.N = false;
                                                if (t1Var.fd) {
                                                    t1Var.fd = r10;
                                                    t1Var.setVisibility(r10);
                                                }
                                                coVar.ub(t1Var);
                                            }
                                        }
                                        r10 = 0;
                                        if (t1Var.fd) {
                                        }
                                        coVar.ub(t1Var);
                                    }
                                    z24 = z22;
                                    z23 = z14;
                                }
                                z25 = true;
                                t1Var.setShowTopic(z25);
                                t1Var.X3(messageObject2, X8, z24, z23, z18, z20);
                                t1Var.setSpoilersSuppressed(coVar.x0.getScrollState() == 0);
                                t1Var.setHighlighted(coVar.L7 == Integer.MAX_VALUE && messageObject2.getId() == coVar.L7);
                                z26 = t1Var.f8;
                                if (!z26) {
                                }
                                if (!z26) {
                                }
                                if (!z26) {
                                }
                                if (coVar.R3 == 7) {
                                    t1Var.S3(str);
                                }
                                if (coVar.L7 != Integer.MAX_VALUE) {
                                }
                                indexOf = arrayList3.indexOf(messageObject2);
                                if (indexOf != -1) {
                                }
                                if (!hashMap.isEmpty()) {
                                    hashMap.remove(messageObject2.getDocument());
                                    wjVar = coVar.y0;
                                    if (wjVar != null) {
                                    }
                                }
                                r10 = 0;
                                if (t1Var.fd) {
                                }
                                coVar.ub(t1Var);
                            }
                        }
                        z17 = z16;
                        z18 = true;
                        i18 = this.J;
                        if (i10 == i18) {
                        }
                        if (j10 == c1Var.f) {
                        }
                        if (ChatObject.isChannel(coVar.e)) {
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
                        if (!coVar.Pa) {
                        }
                        z25 = true;
                        t1Var.setShowTopic(z25);
                        t1Var.X3(messageObject2, X8, z24, z23, z18, z20);
                        t1Var.setSpoilersSuppressed(coVar.x0.getScrollState() == 0);
                        t1Var.setHighlighted(coVar.L7 == Integer.MAX_VALUE && messageObject2.getId() == coVar.L7);
                        z26 = t1Var.f8;
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (coVar.R3 == 7) {
                        }
                        if (coVar.L7 != Integer.MAX_VALUE) {
                        }
                        indexOf = arrayList3.indexOf(messageObject2);
                        if (indexOf != -1) {
                        }
                        if (!hashMap.isEmpty()) {
                        }
                        r10 = 0;
                        if (t1Var.fd) {
                        }
                        coVar.ub(t1Var);
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
                int j152 = j(i14);
                boolean z332 = z12;
                j10 = j(i15);
                j(i28);
                if (messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                }
                z15 = z13;
                z16 = z30;
                arrayList2 = arrayList;
                i16 = i15;
                i17 = i16 - this.J;
                if (i17 >= 0) {
                    messageObject = (MessageObject) arrayList2.get(i16 - this.J);
                    if (messageObject != null) {
                        int i302 = i16 + 1;
                        int i312 = i302 - this.J;
                        if (i312 >= 0) {
                        }
                    }
                    if (messageObject != null) {
                        z17 = z16;
                        z18 = false;
                        i18 = this.J;
                        if (i10 == i18) {
                        }
                        if (j10 == c1Var.f) {
                        }
                        if (ChatObject.isChannel(coVar.e)) {
                        }
                        if (!z17) {
                        }
                        boolean z3722 = false;
                        messageObject2.updateTranslation(false);
                        if (X8 != null) {
                        }
                        if (!coVar.Pa) {
                        }
                        z25 = true;
                        t1Var.setShowTopic(z25);
                        t1Var.X3(messageObject2, X8, z24, z23, z18, z20);
                        t1Var.setSpoilersSuppressed(coVar.x0.getScrollState() == 0);
                        t1Var.setHighlighted(coVar.L7 == Integer.MAX_VALUE && messageObject2.getId() == coVar.L7);
                        z26 = t1Var.f8;
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (coVar.R3 == 7) {
                        }
                        if (coVar.L7 != Integer.MAX_VALUE) {
                        }
                        indexOf = arrayList3.indexOf(messageObject2);
                        if (indexOf != -1) {
                        }
                        if (!hashMap.isEmpty()) {
                        }
                        r10 = 0;
                        if (t1Var.fd) {
                        }
                        coVar.ub(t1Var);
                    }
                }
                z17 = z16;
                z18 = true;
                i18 = this.J;
                if (i10 == i18) {
                }
                if (j10 == c1Var.f) {
                }
                if (ChatObject.isChannel(coVar.e)) {
                }
                if (!z17) {
                }
                boolean z37222 = false;
                messageObject2.updateTranslation(false);
                if (X8 != null) {
                }
                if (!coVar.Pa) {
                }
                z25 = true;
                t1Var.setShowTopic(z25);
                t1Var.X3(messageObject2, X8, z24, z23, z18, z20);
                t1Var.setSpoilersSuppressed(coVar.x0.getScrollState() == 0);
                t1Var.setHighlighted(coVar.L7 == Integer.MAX_VALUE && messageObject2.getId() == coVar.L7);
                z26 = t1Var.f8;
                if (!z26) {
                }
                if (!z26) {
                }
                if (!z26) {
                }
                if (coVar.R3 == 7) {
                }
                if (coVar.L7 != Integer.MAX_VALUE) {
                }
                indexOf = arrayList3.indexOf(messageObject2);
                if (indexOf != -1) {
                }
                if (!hashMap.isEmpty()) {
                }
                r10 = 0;
                if (t1Var.fd) {
                }
                coVar.ub(t1Var);
            }
        }
        z11 = false;
        t1Var.X7 = z11;
        t1Var.Y7 = coVar.R3 != 0 && (coVar.J4.containsKey(Integer.valueOf(messageObject2.getId())) || !(X8 == null || X8.messages.isEmpty() || !coVar.J4.containsKey(Integer.valueOf(X8.messages.get(0).getId()))));
        i13 = coVar.R3;
        if (i13 != 1) {
        }
        arrayList = arrayList4;
        j3 = 0;
        t1Var.b8 = j3;
        if (i13 == 7) {
        }
        t1Var.c8 = UserObject.isReplyUser(coVar.f);
        t1Var.d8 = coVar.R3 != 2;
        t1Var.E8 = coVar.t9();
        t1Var.F8 = coVar.C9();
        t1Var.G8 = coVar.B9();
        t1Var.H8 = coVar.Q8();
        t1Var.I8 = coVar.R8();
        if (messageObject2.isSponsored()) {
        }
        int i282 = i10 + 2;
        if (X8 == null) {
        }
        z13 = false;
        z30 = false;
        z14 = false;
        int j1522 = j(i14);
        boolean z3322 = z12;
        j10 = j(i15);
        j(i282);
        if (messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
        }
        z15 = z13;
        z16 = z30;
        arrayList2 = arrayList;
        i16 = i15;
        i17 = i16 - this.J;
        if (i17 >= 0) {
        }
        z17 = z16;
        z18 = true;
        i18 = this.J;
        if (i10 == i18) {
        }
        if (j10 == c1Var.f) {
        }
        if (ChatObject.isChannel(coVar.e)) {
        }
        if (!z17) {
        }
        boolean z372222 = false;
        messageObject2.updateTranslation(false);
        if (X8 != null) {
        }
        if (!coVar.Pa) {
        }
        z25 = true;
        t1Var.setShowTopic(z25);
        t1Var.X3(messageObject2, X8, z24, z23, z18, z20);
        t1Var.setSpoilersSuppressed(coVar.x0.getScrollState() == 0);
        t1Var.setHighlighted(coVar.L7 == Integer.MAX_VALUE && messageObject2.getId() == coVar.L7);
        z26 = t1Var.f8;
        if (!z26) {
        }
        if (!z26) {
        }
        if (!z26) {
        }
        if (coVar.R3 == 7) {
        }
        if (coVar.L7 != Integer.MAX_VALUE) {
        }
        indexOf = arrayList3.indexOf(messageObject2);
        if (indexOf != -1) {
        }
        if (!hashMap.isEmpty()) {
        }
        r10 = 0;
        if (t1Var.fd) {
        }
        coVar.ub(t1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [org.telegram.ui.hm] */
    /* JADX WARN: Type inference failed for: r8v11, types: [org.telegram.ui.Cells.w0] */
    /* JADX WARN: Type inference failed for: r8v12, types: [org.telegram.ui.Cells.bb] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Cells.z0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [org.telegram.ui.Cells.h0, org.telegram.ui.gm] */
    /* JADX WARN: Type inference failed for: r8v16, types: [org.telegram.ui.Cells.v1] */
    /* JADX WARN: Type inference failed for: r8v9, types: [org.telegram.ui.Cells.u1] */
    /* JADX WARN: Type inference failed for: r9v12, types: [org.telegram.ui.Cells.w0] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Cells.t1 t1Var2;
        co coVar = this.Q;
        if (i10 == 0) {
            t1Var = new org.telegram.ui.Cells.t1(this.h, ((org.telegram.ui.ActionBar.n2) coVar).currentAccount, true, coVar.Ba, coVar.ea);
            t1Var.setResourcesProvider(coVar.ea);
            if (coVar.pc == null) {
                coVar.pc = new on(coVar);
            }
            t1Var.setDelegate(coVar.pc);
            t1Var.Pd = coVar.Pb;
            if (coVar.h == null) {
                t1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? cmVar = new cm(context, coVar.ea, true);
                cmVar.setInvalidateColors(true);
                cmVar.setDelegate(new fm(this));
                t1Var = cmVar;
            } else {
                if (i10 == 2) {
                    t1Var2 = new org.telegram.ui.Cells.v1(context, coVar.ea);
                } else if (i10 == 3) {
                    ?? gmVar = new gm(this, context, ((org.telegram.ui.ActionBar.n2) coVar).currentAccount, coVar.ea);
                    gmVar.setDelegate(new z0(this, 20));
                    t1Var2 = gmVar;
                } else if (i10 == 4) {
                    t1Var2 = new org.telegram.ui.Cells.z0(context, coVar.ea);
                } else if (i10 == 6) {
                    t1Var2 = new org.telegram.ui.Cells.bb(context, ((org.telegram.ui.ActionBar.n2) coVar).currentAccount, coVar.ea);
                } else if (i10 == 7) {
                    t1Var2 = new org.telegram.ui.Cells.w0(context, coVar.ea, false);
                } else if (i10 == 8) {
                    t1Var2 = new hm(this, context, ((org.telegram.ui.ActionBar.n2) coVar).currentAccount, coVar.ea);
                } else if (i10 == 10) {
                    ?? u1Var = new org.telegram.ui.Cells.u1(context, coVar.ea);
                    if (coVar.pc == null) {
                        coVar.pc = new on(coVar);
                    }
                    u1Var.setDelegate(coVar.pc);
                    t1Var2 = u1Var;
                } else {
                    t1Var = null;
                }
                t1Var = t1Var2;
            }
        }
        return com.google.android.gms.internal.vision.e2.l(t1Var, t1Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        TLRPC.Message message;
        boolean z10;
        boolean z11;
        byte[] bArr;
        Integer num;
        String str;
        String stickerEmoji;
        MessagesController.EmojiSound emojiSound;
        View view = c1Var.a;
        boolean z12 = view instanceof org.telegram.ui.Cells.t1;
        co coVar = this.Q;
        if (z12 || (view instanceof org.telegram.ui.Cells.w0)) {
            coVar.r9();
        }
        boolean z13 = view instanceof org.telegram.ui.Cells.t1;
        if (z13) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            MessageObject messageObject = t1Var.getMessageObject();
            t1Var.E8 = coVar.t9();
            t1Var.F8 = coVar.C9();
            t1Var.G8 = coVar.B9();
            t1Var.H8 = coVar.Q8();
            t1Var.I8 = coVar.R8();
            t1Var.g4(-1, true, false);
            MessageObject messageObject2 = coVar.G3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                t1Var.g4(coVar.H3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = coVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                coVar.getMediaController().playEmojiSound(coVar.getAccountInstance(), stickerEmoji, emojiSound, true);
            }
            if (messageObject.updateTranslation(false)) {
                t1Var.X3(messageObject, t1Var.getCurrentMessagesGroup(), t1Var.m3(), t1Var.n3(), t1Var.h3(), t1Var.j3());
            } else {
                MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    for (int i10 = 0; i10 < currentMessagesGroup.messages.size(); i10++) {
                        currentMessagesGroup.messages.get(i10).updateTranslation();
                    }
                }
            }
            if (((org.telegram.ui.ActionBar.n2) coVar).actionBar.s() || coVar.A9()) {
                coVar.N7 = false;
                coVar.O7 = 0L;
                coVar.P7 = null;
                ArrayList arrayList = coVar.a4;
                t1Var.J3(arrayList == null || !arrayList.contains(messageObject), false);
                int i11 = messageObject.getDialogId() == coVar.T5 ? 0 : 1;
                if (coVar.W5[i11].indexOfKey(messageObject.getId()) >= 0) {
                    coVar.hb(messageObject, t1Var, i11, false);
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
            if (coVar.R3 != 7 || coVar.u3 == null || (str = coVar.t3) == null) {
                qk qkVar = coVar.R2;
                if (qkVar != null && qkVar.getVisibility() == 0) {
                    if (coVar.getMediaDataController().isMessageFound(messageObject.getId(), messageObject.getDialogId() == coVar.L6) && coVar.getMediaDataController().getLastSearchQuery() != null) {
                        t1Var.S3(coVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                t1Var.S3(null);
            } else {
                t1Var.S3(str);
            }
            if (!((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode || !t1Var.f8) {
                t1Var.setHighlighted(coVar.L7 != Integer.MAX_VALUE && ((t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == coVar.L7) || (t1Var.getCurrentMessagesGroup() != null && t1Var.getCurrentMessagesGroup().contains(coVar.L7))));
                boolean z14 = t1Var.f8;
                if (z14 && coVar.P7 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!t1Var.T3(coVar.P7, true, coVar.N7 || currentTimeMillis - coVar.O7 < 200, coVar.S7) && coVar.M7) {
                        org.telegram.ui.Components.yc.a0(coVar).Q(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    coVar.M7 = false;
                    if (coVar.N7) {
                        coVar.O7 = currentTimeMillis;
                    }
                    coVar.N7 = false;
                } else if (z14 && (num = coVar.Q7) != null) {
                    t1Var.R3(num.intValue());
                } else if (z14 && (bArr = coVar.R7) != null) {
                    t1Var.P3(bArr);
                }
                if (coVar.L7 != Integer.MAX_VALUE) {
                    coVar.Zb();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            w0Var.e0 = coVar.t9();
            w0Var.i0 = coVar.C9();
            coVar.B9();
            coVar.Q8();
            w0Var.j0 = coVar.R8();
        } else if (view instanceof org.telegram.ui.Cells.v1) {
            ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(coVar.R8() / 2.0f);
        }
        int b10 = c1Var.b();
        int i12 = this.J;
        if (b10 < i12 || b10 >= this.K) {
            return;
        }
        MessageObject messageObject3 = (MessageObject) (this.L ? this.M : this.N ? this.P : coVar.u6).get(b10 - i12);
        if (messageObject3 == null || (message = messageObject3.messageOwner) == null || !message.media_unread || !message.mentioned) {
            return;
        }
        if (!((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode && coVar.R3 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
            int i13 = coVar.l6 - 1;
            coVar.l6 = i13;
            if (i13 <= 0) {
                coVar.l6 = 0;
                coVar.m6 = true;
                coVar.Kb(false);
            } else {
                coVar.j1.c(2, i13, true);
            }
            coVar.getMessagesController().markMentionMessageAsRead(messageObject3.getId(), ChatObject.isChannel(coVar.e) ? coVar.e.id : 0L, coVar.T5);
            messageObject3.setContentIsRead();
        }
        if (z13) {
            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
            if (((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode) {
                t1Var2.setHighlighted(true);
            } else {
                t1Var2.O3();
            }
        }
    }
}
