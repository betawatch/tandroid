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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dm extends org.telegram.ui.Components.dk0 {
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
    public final /* synthetic */ rn M;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public dm(rn rnVar, Context context) {
        this.M = rnVar;
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
        TLRPC.User user = rnVar.f;
        this.n = user != null && user.bot;
        C(true);
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    public final void K(boolean z10) {
        rn rnVar = this.M;
        if (UserObject.isBotForum(rnVar.f)) {
            if (z10) {
                rnVar.jc = true;
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
        rn rnVar = this.M;
        int childCount = rnVar.t0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = rnVar.t0.getChildAt(i10);
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
        rn rnVar = this.M;
        return UserObject.isBotForumWithEditableTopics(rnVar.f) && rnVar.b() == 0 && !rnVar.jc && rnVar.N3 == 0;
    }

    public final void O(boolean z10) {
        boolean z11;
        rn rnVar = this.M;
        ArrayList arrayList = rnVar.q6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + rnVar.K5);
        }
        if (z10 && rnVar.K5) {
            f2.v0 itemAnimator = rnVar.t0.getItemAnimator();
            mj mjVar = rnVar.u0;
            if (itemAnimator != mjVar) {
                rnVar.t0.setItemAnimator(mjVar);
            }
        } else {
            rnVar.t0.setItemAnimator(null);
        }
        S();
        try {
            super.l();
        } catch (Exception e9) {
            FileLog.e(e9);
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
        boolean[] zArr = rnVar.y6;
        if ((zArr[0] && (rnVar.H6 == 0 || zArr[1])) || z11) {
            rnVar.L6(((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow);
        }
    }

    public final void P(int i10, boolean z10) {
        MessageObject messageObject;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i10);
            org.telegram.ui.Cells.pa.v(z10 ? " with thanos effect" : "", sb2);
        }
        rn rnVar = this.M;
        if (((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow) {
            f2.v0 itemAnimator = rnVar.t0.getItemAnimator();
            mj mjVar = rnVar.u0;
            if (itemAnimator != mjVar) {
                rnVar.t0.setItemAnimator(mjVar);
            }
        } else {
            rnVar.t0.setItemAnimator(null);
        }
        if (z10 && rnVar.u0 != null) {
            f2.v0 itemAnimator2 = rnVar.t0.getItemAnimator();
            mj mjVar2 = rnVar.u0;
            if (itemAnimator2 == mjVar2) {
                f2.o1 K = rnVar.t0.K(i10);
                if (K == null) {
                    mjVar2.getClass();
                } else {
                    mjVar2.S.add(K);
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void Q(int i10) {
        int i11;
        rn rnVar = this.M;
        ArrayList arrayList = rnVar.q6;
        if (rnVar.v0 == null || this.H || this.J) {
            return;
        }
        int i12 = 0;
        if (!rnVar.z4 && rnVar.F7 != null) {
            int childCount = rnVar.t0.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                View childAt = rnVar.t0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                    MessageObject messageObject2 = rnVar.F7;
                    if (messageObject == messageObject2) {
                        if (arrayList.indexOf(messageObject2) >= 0) {
                            i11 = arrayList.indexOf(rnVar.F7) + this.F;
                            i12 = rnVar.L8(childAt);
                        }
                    }
                }
                i13++;
            }
        }
        i11 = -1;
        m(i10);
        if (i11 != -1) {
            rnVar.v0.h1(i11, i12);
        }
    }

    public final org.telegram.ui.Cells.s1 R(MessageObject messageObject, boolean z10, boolean z11) {
        rn rnVar = this.M;
        if (z10) {
            int childCount = rnVar.t0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = rnVar.t0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.getMessageObject() == messageObject && TextUtils.equals(s1Var.b7, s1Var.u7.messageOwner.post_author)) {
                        s1Var.W3(messageObject, s1Var.getCurrentMessagesGroup(), s1Var.l3(), s1Var.m3(), s1Var.g3(), s1Var.i3());
                        return s1Var;
                    }
                }
                i10++;
                messageObject = messageObject;
            }
        }
        MessageObject messageObject2 = messageObject;
        int indexOf = (this.H ? this.I : this.J ? this.L : rnVar.q6).indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (!z11) {
            Q(this.F + indexOf);
            return null;
        }
        int i11 = rn.Fc;
        rn.Fc = i11 + 1;
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
        rn rnVar = this.M;
        boolean[] zArr = rnVar.y6;
        this.r = 0;
        ArrayList arrayList = this.H ? this.I : this.J ? this.L : rnVar.q6;
        if (rnVar.N3 == 3 && rnVar.Ka) {
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
            TLRPC.User user4 = rnVar.f;
            if (user4 != null && !UserObject.isBot(user4) && !UserObject.isReplyUser(rnVar.f)) {
                TLRPC.PeerSettings peerSettings3 = rnVar.getMessagesController().getPeerSettings(rnVar.f.id);
                int i14 = org.telegram.ui.Cells.ua.K;
                if (peerSettings3 != null && ((peerSettings3.phone_country != null || peerSettings3.registration_month != null) && !MessagesController.isSupportUser(rnVar.f) && rnVar.N3 == 0)) {
                    int i15 = this.r;
                    this.r = i15 + 1;
                    this.y = i15;
                    return;
                }
            }
            if (UserObject.isReplyUser(rnVar.f) || ((user = rnVar.f) != null && user.bot && !MessagesController.isSupportUser(user) && rnVar.N3 == 0)) {
                int i16 = this.r;
                this.r = i16 + 1;
                this.w = i16;
                return;
            }
            return;
        }
        if (!this.J) {
            boolean[] zArr2 = rnVar.A6;
            if ((!zArr2[0] || (rnVar.H6 != 0 && !zArr2[1])) && !rnVar.B6) {
                int i17 = this.r;
                this.r = i17 + 1;
                this.B = i17;
                int i18 = this.r;
                this.F = i18;
                int size = arrayList.size() + i18;
                this.r = size;
                this.G = size;
                user2 = rnVar.f;
                if (user2 != null && !UserObject.isBot(user2) && !UserObject.isReplyUser(rnVar.f)) {
                    peerSettings = rnVar.getMessagesController().getPeerSettings(rnVar.f.id);
                    int i19 = org.telegram.ui.Cells.ua.K;
                    if (peerSettings != null && ((peerSettings.phone_country != null || peerSettings.registration_month != null) && !MessagesController.isSupportUser(rnVar.f) && rnVar.N3 == 0 && zArr[0])) {
                        peerSettings2 = rnVar.getMessagesController().getPeerSettings(rnVar.f.id);
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
                        i10 = rnVar.N3;
                        if (i10 == 9) {
                            int i25 = this.r;
                            this.s = i25;
                            this.r = i25 + 2;
                            this.v = i25 + 1;
                        }
                        if (i10 == 5 && !qf.q1.g(rnVar.M3)) {
                            int i26 = this.r;
                            this.r = i26 + 1;
                            this.s = i26;
                        }
                        if (this.J ? !(!(zArr[0] && (rnVar.H6 == 0 || zArr[1])) && (AndroidUtilities.isTablet() || rnVar.c4 || rnVar.f != null)) : this.K) {
                            this.A = -5;
                            return;
                        }
                        int i27 = this.r;
                        this.r = i27 + 1;
                        this.A = i27;
                        return;
                    }
                }
                if ((!UserObject.isReplyUser(rnVar.f) || ((user3 = rnVar.f) != null && user3.bot && !MessagesController.isSupportUser(user3) && rnVar.N3 == 0)) && zArr[0]) {
                    int i28 = this.r;
                    this.r = i28 + 1;
                    this.w = i28;
                }
                i10 = rnVar.N3;
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
        user2 = rnVar.f;
        if (user2 != null) {
            peerSettings = rnVar.getMessagesController().getPeerSettings(rnVar.f.id);
            int i192 = org.telegram.ui.Cells.ua.K;
            if (peerSettings != null) {
                peerSettings2 = rnVar.getMessagesController().getPeerSettings(rnVar.f.id);
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
                i10 = rnVar.N3;
                if (i10 == 9) {
                }
                if (i10 == 5) {
                }
                if (this.J) {
                }
            }
        }
        if (!UserObject.isReplyUser(rnVar.f)) {
        }
        int i282 = this.r;
        this.r = i282 + 1;
        this.w = i282;
        i10 = rnVar.N3;
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

    @Override // f2.q0
    public final int h() {
        this.x = -5;
        rn rnVar = this.M;
        a0.h hVar = rnVar.Z7;
        if (rnVar.I5.get(rnVar.Z3, 0) == 0) {
            return this.r;
        }
        TLRPC.User user = rnVar.f;
        if (user == null || !user.bot || rnVar.N3 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(rnVar.f.id)).description == null && ((TL_bots.BotInfo) hVar.f(rnVar.f.id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(rnVar.f.id)).description_document == null)) && !UserObject.isReplyUser(rnVar.f) && !UserObject.isBotForum(rnVar.f))) {
            return 0;
        }
        this.x = 0;
        return 1;
    }

    @Override // f2.q0
    public final long i(int i10) {
        rn rnVar = this.M;
        if (rnVar.I5.get(rnVar.Z3, 0) != 0 && i10 == this.x) {
            return 1L;
        }
        ArrayList arrayList = this.H ? this.I : this.J ? this.L : rnVar.q6;
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

    @Override // f2.q0
    public final int j(int i10) {
        rn rnVar = this.M;
        if (rnVar.I5.get(rnVar.Z3, 0) != 0 && i10 == this.x) {
            return 3;
        }
        if (i10 == this.s || i10 == this.v) {
            return 1;
        }
        int i11 = this.F;
        if (i10 >= i11 && i10 < this.G) {
            return ((MessageObject) (this.H ? this.I : this.J ? this.L : rnVar.q6).get(i10 - i11)).contentType;
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

    @Override // org.telegram.ui.Components.dk0, f2.q0
    public final void l() {
        O(false);
    }

    @Override // org.telegram.ui.Components.dk0, f2.q0
    public final void m(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item changed " + i10);
        }
        rn rnVar = this.M;
        if (!((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow || rnVar.J0) {
            rnVar.t0.setItemAnimator(null);
        } else {
            f2.v0 itemAnimator = rnVar.t0.getItemAnimator();
            mj mjVar = rnVar.u0;
            if (itemAnimator != mjVar) {
                rnVar.t0.setItemAnimator(mjVar);
            }
        }
        S();
        try {
            super.m(i10);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override // org.telegram.ui.Components.dk0, f2.q0
    public final void o(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item inserted " + i10);
        }
        rn rnVar = this.M;
        if (((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow) {
            f2.v0 itemAnimator = rnVar.t0.getItemAnimator();
            mj mjVar = rnVar.u0;
            if (itemAnimator != mjVar) {
                rnVar.t0.setItemAnimator(mjVar);
            }
        } else {
            rnVar.t0.setItemAnimator(null);
        }
        S();
        try {
            super.o(i10);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override // f2.q0
    public final void p(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item moved" + i10 + ":" + i11);
        }
        rn rnVar = this.M;
        if (((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow) {
            f2.v0 itemAnimator = rnVar.t0.getItemAnimator();
            mj mjVar = rnVar.u0;
            if (itemAnimator != mjVar) {
                rnVar.t0.setItemAnimator(mjVar);
            }
        } else {
            rnVar.t0.setItemAnimator(null);
        }
        S();
        try {
            super.p(i10, i11);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override // org.telegram.ui.Components.dk0, f2.q0
    public final void q(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range changed " + i10 + ":" + i11);
        }
        rn rnVar = this.M;
        if (((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow) {
            f2.v0 itemAnimator = rnVar.t0.getItemAnimator();
            mj mjVar = rnVar.u0;
            if (itemAnimator != mjVar) {
                rnVar.t0.setItemAnimator(mjVar);
            }
        } else {
            rnVar.t0.setItemAnimator(null);
        }
        S();
        try {
            super.q(i10, i11);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override // org.telegram.ui.Components.dk0, f2.q0
    public final void s(int i10, int i11) {
        int i12;
        int i13;
        rn rnVar = this.M;
        ArrayList arrayList = rnVar.q6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        if (((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow) {
            f2.v0 itemAnimator = rnVar.t0.getItemAnimator();
            mj mjVar = rnVar.u0;
            if (itemAnimator != mjVar) {
                rnVar.t0.setItemAnimator(mjVar);
            }
        } else {
            rnVar.t0.setItemAnimator(null);
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.F) && i12 < this.G) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.F) - 1);
            if ((rnVar.e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (rnVar.f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
                m(i10);
            }
        }
        try {
            super.s(i10, i11);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override // org.telegram.ui.Components.dk0, f2.q0
    public final void t(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range removed" + i10 + ":" + i11);
        }
        rn rnVar = this.M;
        if (((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow) {
            f2.v0 itemAnimator = rnVar.t0.getItemAnimator();
            mj mjVar = rnVar.u0;
            if (itemAnimator != mjVar) {
                rnVar.t0.setItemAnimator(mjVar);
            }
        } else {
            rnVar.t0.setItemAnimator(null);
        }
        S();
        try {
            super.t(i10, i11);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override // org.telegram.ui.Components.dk0, f2.q0
    public final void u(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item removed " + i10);
        }
        rn rnVar = this.M;
        if (((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow) {
            f2.v0 itemAnimator = rnVar.t0.getItemAnimator();
            mj mjVar = rnVar.u0;
            if (itemAnimator != mjVar) {
                rnVar.t0.setItemAnimator(mjVar);
            }
        } else {
            rnVar.t0.setItemAnimator(null);
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:254:0x05ef, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.peer_id) == org.telegram.messenger.MessageObject.getPeerId(r2.messageOwner.peer_id)) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x05f1, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x060b, code lost:
    
        if (r2.getSenderId() == r5.getSenderId()) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0662, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r8) == org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.fwd_from.from_id)) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0925, code lost:
    
        if (r4.u0 == null) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0427, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.peer_id) == org.telegram.messenger.MessageObject.getPeerId(r8.messageOwner.peer_id)) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0429, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0443, code lost:
    
        if (r8.getSenderId() == r5.getSenderId()) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0498, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r10) == org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.fwd_from.from_id)) goto L242;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x096f  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0292  */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v14 */
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.UserFull userFull;
        TLObject tLObject;
        int i11;
        int i12;
        MessageObject messageObject;
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
        int i16;
        int j11;
        int i17;
        ArrayList arrayList2;
        int i18;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        String str;
        byte[] bArr;
        Integer num;
        int indexOf;
        ?? r10;
        mj mjVar;
        MessageObject.SendAnimationData sendAnimationData;
        ck ckVar;
        int i19;
        int i20;
        boolean z21;
        wk wkVar;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str2;
        boolean z22;
        long j12;
        long j13;
        long j14;
        String str3;
        boolean z23;
        boolean z24;
        int i21;
        TLRPC.ChatFull chatFull;
        View view = o1Var.a;
        rn rnVar = this.M;
        a0.h hVar = rnVar.Z7;
        ArrayList arrayList3 = rnVar.q4;
        HashMap hashMap = rnVar.r4;
        boolean z25 = false;
        if (i10 == this.w || i10 == this.x) {
            org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) view;
            if (UserObject.isReplyUser(rnVar.f)) {
                h0Var.b(false, 0L, LocaleController.getString(R.string.RepliesChatInfo), null, null, null);
            } else {
                TLRPC.User user = rnVar.f;
                if (user == null || user.id != UserObject.VERIFY) {
                    TL_bots.BotInfo botInfo = hVar.m() != 0 ? (TL_bots.BotInfo) hVar.f(rnVar.f.id) : null;
                    boolean z26 = (botInfo == null || (TextUtils.isEmpty(botInfo.description) && botInfo.description_photo == null && botInfo.description_document == null)) && UserObject.isBot(rnVar.f) && (userFull = rnVar.W7) != null && userFull.bot_manager_id != 0 && rnVar.f.bot_can_edit;
                    TLRPC.User user2 = rnVar.f;
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
                    h0Var.b(true, j15, str4, tLObject, botInfo, z26 ? DialogObject.getName(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, rnVar.W7.bot_manager_id) : null);
                } else {
                    h0Var.b(false, 0L, LocaleController.getString(R.string.VerifyChatInfo), null, null, null);
                }
            }
            rn.b4(rnVar, h0Var);
            return;
        }
        if (i10 == this.E) {
            ((org.telegram.ui.Cells.b0) view).setDialogId(rnVar.a());
            return;
        }
        if (i10 == this.y) {
            org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
            TLRPC.EncryptedChat encryptedChat = rnVar.h;
            long a2 = encryptedChat != null ? encryptedChat.user_id : rnVar.a();
            uaVar.b(a2, rnVar.getMessagesController().getPeerSettings(a2));
            return;
        }
        if (i10 == this.B || i10 == this.A) {
            ((org.telegram.ui.Cells.y0) view).setProgressVisible(rnVar.F6 > 1);
            return;
        }
        if (i10 == this.D) {
            if (rnVar.getMessagesController().getPeerSettings(rnVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.v0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedName, LocaleController.formatRelativeDate(rnVar.getConnectionsManager().getCurrentTime() - r1.name_change_date)));
            return;
        }
        if (i10 == this.C) {
            if (rnVar.getMessagesController().getPeerSettings(rnVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.v0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedPhoto, LocaleController.formatRelativeDate(rnVar.getConnectionsManager().getCurrentTime() - r1.photo_change_date)));
            return;
        }
        if (i10 == this.s) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            rn.d4(rnVar);
            v0Var.setMessageObject(rnVar.E3);
            int i22 = rnVar.N3;
            if (i22 == 3) {
                v0Var.setCustomText(LocaleController.getString(R.string.SavedMessagesProfileHint));
            } else if (i22 == 5) {
                v0Var.setCustomText(LocaleController.getString(R.string.BusinessRepliesHint));
            } else if (i22 == 9) {
                v0Var.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint2));
            }
            v0Var.setAlpha(1.0f);
            v0Var.setSpoilersSuppressed(rnVar.t0.getScrollState() != 0);
            return;
        }
        if (i10 == this.v) {
            org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) view;
            rn.e4(rnVar);
            v0Var2.setMessageObject(rnVar.F3);
            v0Var2.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint));
            v0Var2.setAlpha(1.0f);
            v0Var2.setSpoilersSuppressed(rnVar.t0.getScrollState() != 0);
            return;
        }
        int i23 = this.F;
        if (i10 < i23 || i10 >= this.G) {
            return;
        }
        ArrayList arrayList4 = this.H ? this.I : this.J ? this.L : rnVar.q6;
        MessageObject messageObject2 = (MessageObject) arrayList4.get(i10 - i23);
        if (!(view instanceof org.telegram.ui.Cells.s1)) {
            if (!(view instanceof org.telegram.ui.Cells.v0)) {
                if (view instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.setText(LocaleController.getString(R.string.UnreadMessages));
                    u1Var.getTextView().setTranslationX(rnVar.R8() / 2.0f);
                    if (rnVar.z7 != 0) {
                        rnVar.z7 = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            if ((messageObject2 == null || !messageObject2.isDateObject) && (i12 = (i11 = i10 + 1) - this.F) >= 0 && i12 < arrayList4.size()) {
                MessageObject messageObject3 = (MessageObject) arrayList4.get(i11 - this.F);
                if (messageObject3 == null || !messageObject3.isDateObject) {
                    messageObject = messageObject3;
                } else {
                    int i24 = i10 + 2;
                    int i25 = i24 - this.F;
                    messageObject = (i25 < 0 || i25 >= arrayList4.size()) ? null : (MessageObject) arrayList4.get(i24 - this.F);
                }
                z10 = messageObject == null || !(messageObject2 == null || messageObject.getTopicId() == messageObject2.getTopicId());
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.v0 v0Var3 = (org.telegram.ui.Cells.v0) view;
            v0Var3.a0 = rnVar.t9();
            v0Var3.e0 = rnVar.C9();
            rnVar.B9();
            rnVar.Q8();
            v0Var3.f0 = rnVar.R8();
            v0Var3.b0 = ChatObject.isForum(rnVar.e);
            v0Var3.c0 = ChatObject.isMonoForum(rnVar.e);
            v0Var3.d0 = UserObject.isBotForum(rnVar.f);
            boolean z27 = v0Var3.g0 != z10;
            v0Var3.g0 = z10;
            v0Var3.U(messageObject2, z27);
            v0Var3.setAlpha(1.0f);
            v0Var3.setShowTopic(true);
            v0Var3.setSpoilersSuppressed(rnVar.t0.getScrollState() != 0);
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
        MessageObject.GroupedMessages X8 = rnVar.X8(messageObject2);
        s1Var.J7 = rnVar.e != null || UserObject.isUserSelf(rnVar.f) || UserObject.isReplyUser(rnVar.f) || rnVar.N3 == 7;
        s1Var.y.a(false, false);
        s1Var.K7 = UserObject.isBotForum(rnVar.f);
        s1Var.W7 = rnVar.A9();
        int i26 = rnVar.N3;
        s1Var.L7 = i26 == 3;
        s1Var.M7 = i26 == 3 && rnVar.Ka;
        TLRPC.User user3 = rnVar.f;
        s1Var.N7 = user3 != null && user3.bot;
        s1Var.O7 = ChatObject.isChannel(rnVar.e) && rnVar.e.megagroup;
        s1Var.P7 = ChatObject.isForum(rnVar.e);
        s1Var.Q7 = ChatObject.isMonoForum(rnVar.e);
        s1Var.R7 = ChatObject.isForum(rnVar.e) && rnVar.d4 && rnVar.b() == 1;
        s1Var.S7 = (rnVar.Z3 != 0 || (s1Var.P7 && rnVar.d4)) && !s1Var.Q7;
        int i27 = rnVar.N3;
        if (i27 != 1 && i27 != 9 && ChatObject.isChannel(rnVar.e)) {
            TLRPC.Chat chat = rnVar.e;
            if (chat.has_link && !chat.megagroup) {
                z11 = true;
                s1Var.T7 = z11;
                s1Var.U7 = rnVar.N3 != 0 && (rnVar.F4.containsKey(Integer.valueOf(messageObject2.getId())) || !(X8 == null || X8.messages.isEmpty() || !rnVar.F4.containsKey(Integer.valueOf(X8.messages.get(0).getId()))));
                i13 = rnVar.N3;
                if (i13 != 1 || i13 == 9 || (chatFull = rnVar.V7) == null) {
                    arrayList = arrayList4;
                    j10 = 0;
                } else {
                    arrayList = arrayList4;
                    j10 = chatFull.linked_chat_id;
                }
                s1Var.X7 = j10;
                if (i13 == 7 || rnVar.K3 != 1) {
                    s1Var.Y7 = UserObject.isReplyUser(rnVar.f);
                } else {
                    s1Var.Y7 = UserObject.isReplyUser(messageObject2.getDialogId());
                }
                s1Var.Z7 = rnVar.N3 != 2;
                s1Var.A8 = rnVar.t9();
                s1Var.B8 = rnVar.C9();
                s1Var.C8 = rnVar.B9();
                s1Var.D8 = rnVar.Q8();
                s1Var.E8 = rnVar.R8();
                if (messageObject2.isSponsored()) {
                    AndroidUtilities.doOnPreDraw(s1Var, new ag.l3(22));
                }
                int i28 = i10 + 2;
                if (X8 == null) {
                    MessageObject.GroupedMessagePosition position = X8.getPosition(messageObject2);
                    if (position != null) {
                        if (X8.isDocuments) {
                            i14 = X8.posArray.indexOf(position) + i10 + 1;
                            i21 = X8.posArray.indexOf(position) + (i10 - X8.posArray.size());
                            z23 = false;
                            z12 = false;
                            z24 = false;
                        } else {
                            if ((position.flags & 4) != 0) {
                                i14 = X8.reversed ? X8.posArray.indexOf(position) + (i10 - X8.posArray.size()) : X8.posArray.indexOf(position) + i10 + 1;
                                z23 = false;
                                z24 = false;
                            } else {
                                z23 = true;
                                i14 = -100;
                                z24 = true;
                            }
                            if ((position.flags & 8) != 0) {
                                i21 = X8.reversed ? X8.posArray.indexOf(position) + i10 + 1 : X8.posArray.indexOf(position) + (i10 - X8.posArray.size());
                                z12 = false;
                                z25 = false;
                            } else {
                                z12 = true;
                                z25 = true;
                            }
                        }
                        z13 = z23;
                        i15 = i21;
                        z14 = z24;
                    } else {
                        z23 = false;
                        z12 = false;
                        i14 = -100;
                        z25 = false;
                        z24 = false;
                    }
                    i21 = -100;
                    z13 = z23;
                    i15 = i21;
                    z14 = z24;
                } else {
                    i14 = i10 + 1;
                    i15 = i10 - 1;
                    z12 = false;
                    z13 = false;
                    z25 = false;
                    z14 = false;
                }
                int j16 = j(i15);
                i16 = i15;
                j11 = j(i14);
                j(i28);
                if (!(messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && j16 == o1Var.f) {
                    MessageObject messageObject4 = (MessageObject) arrayList.get(i16 - this.F);
                    z12 = messageObject4.isOutOwner() != messageObject2.isOutOwner() && (Math.abs(messageObject4.messageOwner.date - messageObject2.messageOwner.date) <= 300 || rnVar.N3 == 9);
                    if (!z12) {
                        TLRPC.Message message2 = messageObject4.messageOwner;
                        boolean z28 = z12;
                        i17 = i14;
                        if (message2 == null || message2.paid_message_stars <= 0) {
                            if (!messageObject2.isImportedForward() && !messageObject4.isImportedForward()) {
                                if (rnVar.e == null) {
                                    if (UserObject.isUserSelf(rnVar.f) || UserObject.isReplyUser(rnVar.f)) {
                                        if (!messageObject2.isPrivateForward()) {
                                            if (!messageObject4.isPrivateForward()) {
                                            }
                                        }
                                    } else if (rnVar.N3 == 7) {
                                    }
                                    arrayList2 = arrayList;
                                    if (DialogObject.getPeerDialogId(messageObject4.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                    }
                                    i18 = i17 - this.F;
                                    if (i18 >= 0) {
                                    }
                                    z15 = true;
                                    int i29 = this.F;
                                    if (i10 != i29) {
                                    }
                                    if (j11 != o1Var.f) {
                                    }
                                    if (ChatObject.isChannel(rnVar.e)) {
                                        if (!z14) {
                                        }
                                        if (!z25) {
                                        }
                                    }
                                    if (!z14) {
                                        z16 = false;
                                    }
                                    boolean z29 = false;
                                    messageObject2.updateTranslation(false);
                                    if (X8 != null) {
                                    }
                                    if (rnVar.La) {
                                    }
                                    z19 = true;
                                    s1Var.setShowTopic(z19);
                                    s1Var.W3(messageObject2, X8, z18, z17, z15, r24);
                                    s1Var.setSpoilersSuppressed(rnVar.t0.getScrollState() != 0);
                                    s1Var.setHighlighted(rnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == rnVar.H7);
                                    z20 = s1Var.b8;
                                    if (!z20) {
                                    }
                                    if (!z20) {
                                    }
                                    if (!z20) {
                                    }
                                    if (rnVar.N3 == 7) {
                                    }
                                    if (rnVar.H7 != Integer.MAX_VALUE) {
                                    }
                                    indexOf = arrayList3.indexOf(messageObject2);
                                    if (indexOf != -1) {
                                    }
                                    if (!hashMap.isEmpty()) {
                                    }
                                    r10 = 0;
                                    if (s1Var.bd) {
                                    }
                                    rnVar.ub(s1Var);
                                }
                                long fromChatId = messageObject4.getFromChatId();
                                z28 = fromChatId == messageObject2.getFromChatId();
                                if (!z25 && z28 && fromChatId < 0 && rnVar.e.megagroup && rnVar.N3 != 9) {
                                    z28 = false;
                                }
                                z12 = z28;
                                arrayList2 = arrayList;
                                if (DialogObject.getPeerDialogId(messageObject4.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                }
                                i18 = i17 - this.F;
                                if (i18 >= 0) {
                                }
                                z15 = true;
                                int i292 = this.F;
                                if (i10 != i292) {
                                }
                                if (j11 != o1Var.f) {
                                }
                                if (ChatObject.isChannel(rnVar.e)) {
                                }
                                if (!z14) {
                                }
                                boolean z292 = false;
                                messageObject2.updateTranslation(false);
                                if (X8 != null) {
                                }
                                if (rnVar.La) {
                                }
                                z19 = true;
                                s1Var.setShowTopic(z19);
                                s1Var.W3(messageObject2, X8, z18, z17, z15, r24);
                                s1Var.setSpoilersSuppressed(rnVar.t0.getScrollState() != 0);
                                s1Var.setHighlighted(rnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == rnVar.H7);
                                z20 = s1Var.b8;
                                if (!z20) {
                                }
                                if (!z20) {
                                }
                                if (!z20) {
                                }
                                if (rnVar.N3 == 7) {
                                }
                                if (rnVar.H7 != Integer.MAX_VALUE) {
                                }
                                indexOf = arrayList3.indexOf(messageObject2);
                                if (indexOf != -1) {
                                }
                                if (!hashMap.isEmpty()) {
                                }
                                r10 = 0;
                                if (s1Var.bd) {
                                }
                                rnVar.ub(s1Var);
                            }
                            if (messageObject2.isImportedForward() && messageObject4.isImportedForward() && Math.abs(messageObject4.messageOwner.fwd_from.date - messageObject2.messageOwner.fwd_from.date) <= 300) {
                                TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject4.messageOwner.fwd_from;
                                String str5 = messageFwdHeader2.from_name;
                                if (str5 != null && (str3 = messageObject2.messageOwner.fwd_from.from_name) != null) {
                                    z12 = str5.equals(str3);
                                    arrayList2 = arrayList;
                                    if (DialogObject.getPeerDialogId(messageObject4.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        z12 = false;
                                    }
                                    i18 = i17 - this.F;
                                    if (i18 >= 0 || i18 >= arrayList2.size()) {
                                        z15 = true;
                                    } else {
                                        MessageObject messageObject5 = (MessageObject) arrayList2.get(i17 - this.F);
                                        if (messageObject5 != null && messageObject5.isDateObject) {
                                            int i30 = i17 + 1;
                                            int i31 = i30 - this.F;
                                            messageObject5 = (i31 < 0 || i31 >= arrayList2.size()) ? null : (MessageObject) arrayList2.get(i30 - this.F);
                                        }
                                        z15 = messageObject5 == null || messageObject5.getTopicId() != messageObject2.getTopicId();
                                    }
                                    int i2922 = this.F;
                                    boolean z30 = i10 != i2922;
                                    if (j11 != o1Var.f) {
                                        MessageObject messageObject6 = (MessageObject) arrayList2.get(i17 - i2922);
                                        z16 = !(messageObject6.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && messageObject6.isOutOwner() == messageObject2.isOutOwner() && (Math.abs(messageObject6.messageOwner.date - messageObject2.messageOwner.date) <= 300 || rnVar.N3 == 9);
                                        if (z16) {
                                            if (messageObject2.isImportedForward() || messageObject6.isImportedForward()) {
                                                if (messageObject2.isImportedForward() && messageObject6.isImportedForward() && Math.abs(messageObject2.messageOwner.fwd_from.date - messageObject6.messageOwner.fwd_from.date) <= 300) {
                                                    TLRPC.MessageFwdHeader messageFwdHeader3 = messageObject6.messageOwner.fwd_from;
                                                    String str6 = messageFwdHeader3.from_name;
                                                    if (str6 == null || (str2 = messageObject2.messageOwner.fwd_from.from_name) == null) {
                                                        TLRPC.Peer peer = messageFwdHeader3.from_id;
                                                        if (peer != null) {
                                                            if (messageObject2.messageOwner.fwd_from.from_id != null) {
                                                            }
                                                        }
                                                    } else {
                                                        z16 = str6.equals(str2);
                                                        if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                                            z16 = false;
                                                        }
                                                    }
                                                }
                                                z16 = false;
                                                if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                                }
                                            } else {
                                                if (rnVar.e != null) {
                                                    long fromChatId2 = messageObject6.getFromChatId();
                                                    boolean z31 = (fromChatId2 != messageObject2.getFromChatId() || messageObject2.isImportedForward() || messageObject6.isImportedForward()) ? false : true;
                                                    if (!z14 && z31 && fromChatId2 < 0 && rnVar.e.megagroup && rnVar.N3 != 9) {
                                                        z31 = false;
                                                    }
                                                    if (z31 && rnVar.v9()) {
                                                        TLRPC.TL_forumTopic tL_forumTopic = messageObject2.replyToForumTopic;
                                                        if (tL_forumTopic == null) {
                                                            z22 = true;
                                                            j12 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, messageObject2.messageOwner, true);
                                                        } else {
                                                            z22 = true;
                                                            j12 = tL_forumTopic.id;
                                                        }
                                                        TLRPC.TL_forumTopic tL_forumTopic2 = messageObject6.replyToForumTopic;
                                                        if (tL_forumTopic2 == null) {
                                                            j13 = j12;
                                                            j14 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, messageObject6.messageOwner, z22);
                                                        } else {
                                                            j13 = j12;
                                                            j14 = tL_forumTopic2.id;
                                                        }
                                                        if (j13 != j14) {
                                                            z31 = false;
                                                        }
                                                    }
                                                    z16 = z31;
                                                } else if (UserObject.isUserSelf(rnVar.f) || UserObject.isReplyUser(rnVar.f)) {
                                                    if (!messageObject2.isPrivateForward()) {
                                                        if (!messageObject6.isPrivateForward()) {
                                                        }
                                                    }
                                                    z16 = false;
                                                } else if (rnVar.N3 == 7) {
                                                }
                                                if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                                }
                                            }
                                        }
                                    } else {
                                        z16 = z13;
                                    }
                                    if (ChatObject.isChannel(rnVar.e) && rnVar.e.megagroup && messageObject2.getFromChatId() <= 0 && (messageFwdHeader = messageObject2.messageOwner.fwd_from) != null && (messageFwdHeader.saved_from_peer instanceof TLRPC.TL_peerChannel)) {
                                        if (!z14) {
                                            z16 = false;
                                        }
                                        if (!z25) {
                                            z12 = false;
                                        }
                                    }
                                    if (!z14 && (message = messageObject2.messageOwner) != null && message.paid_message_stars > 0) {
                                        z16 = false;
                                    }
                                    boolean z2922 = false;
                                    messageObject2.updateTranslation(false);
                                    if (X8 != null) {
                                        int i32 = 0;
                                        while (i32 < X8.messages.size()) {
                                            X8.messages.get(i32).updateTranslation(z2922);
                                            i32++;
                                            z2922 = false;
                                        }
                                    }
                                    if (rnVar.La) {
                                        z17 = z16;
                                        z18 = z12;
                                    } else {
                                        if (X8 != null) {
                                            z19 = true;
                                            z18 = false;
                                            z17 = false;
                                            s1Var.setShowTopic(z19);
                                            s1Var.W3(messageObject2, X8, z18, z17, z15, z30);
                                            s1Var.setSpoilersSuppressed(rnVar.t0.getScrollState() != 0);
                                            s1Var.setHighlighted(rnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == rnVar.H7);
                                            z20 = s1Var.b8;
                                            if (!z20 && rnVar.L7 != null) {
                                                long currentTimeMillis = System.currentTimeMillis();
                                                s1Var.S3(rnVar.L7, true, rnVar.J7 || currentTimeMillis - rnVar.K7 < 200, rnVar.O7);
                                                if (rnVar.J7) {
                                                    rnVar.K7 = currentTimeMillis;
                                                }
                                                rnVar.J7 = false;
                                            } else if (!z20 && (num = rnVar.M7) != null) {
                                                s1Var.Q3(num.intValue());
                                            } else if (!z20 && (bArr = rnVar.N7) != null) {
                                                s1Var.O3(bArr);
                                            } else if (rnVar.N3 == 7 && rnVar.q3 != null && (str = rnVar.p3) != null) {
                                                s1Var.R3(str);
                                            }
                                            if (rnVar.H7 != Integer.MAX_VALUE) {
                                                rnVar.Zb();
                                            }
                                            indexOf = arrayList3.indexOf(messageObject2);
                                            if (indexOf != -1) {
                                                if (messageObject2.type == 5 && (wkVar = rnVar.X2) != null && wkVar.getTextureView() != null) {
                                                    ge geVar = rnVar.m7;
                                                    if (geVar != null) {
                                                        AndroidUtilities.cancelRunOnUIThread(geVar);
                                                        rnVar.m7 = null;
                                                    }
                                                    s1Var.getViewTreeObserver().addOnPreDrawListener(new dh.f(1, this, s1Var));
                                                } else if ((messageObject2.isAnyKindOfSticker() && !messageObject2.isAnimatedEmojiStickers()) || ((sendAnimationData = messageObject2.sendAnimationData) != null && sendAnimationData.fromPreview)) {
                                                    if (!messageObject2.sendAnimationData.fromPreview || (ckVar = rnVar.U) == null || ckVar.H0 == null) {
                                                        s1Var.getViewTreeObserver().addOnPreDrawListener(new cm(this, s1Var));
                                                    } else {
                                                        if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getVisibility() == 0) {
                                                            int measuredHeight = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getMeasuredHeight() + ((int) ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getTranslationY());
                                                            ok okVar = rnVar.k1;
                                                            int currentHeight = measuredHeight + (okVar != null ? okVar.getCurrentHeight() : 0);
                                                            ak akVar = rnVar.l1;
                                                            i19 = (((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode ? AndroidUtilities.statusBarHeight : 0) + currentHeight + (akVar != null ? akVar.getCurrentHeight() : 0);
                                                        } else {
                                                            i19 = 0;
                                                        }
                                                        float f10 = i19 + rnVar.p9;
                                                        float height = rnVar.fragmentView == null ? 0.0f : r9.getHeight();
                                                        org.telegram.ui.Components.ye yeVar = rnVar.U.H0;
                                                        Rect rect = yeVar.q0;
                                                        if (!yeVar.m0) {
                                                            yeVar.s = true;
                                                            yeVar.m0 = true;
                                                            ai0 ai0Var = yeVar.T;
                                                            if (ai0Var != null) {
                                                                ai0Var.invalidate();
                                                            }
                                                            org.telegram.ui.Components.hg hgVar = yeVar.S;
                                                            if (hgVar != null) {
                                                                hgVar.invalidate();
                                                            }
                                                            if (yeVar.M != null) {
                                                                yeVar.n0 = s1Var;
                                                                s1Var.setVisibility(4);
                                                                yeVar.o0 = f10;
                                                                yeVar.p0 = height;
                                                                org.telegram.ui.Cells.s1 s1Var2 = yeVar.M;
                                                                org.telegram.ui.Cells.s1 s1Var3 = yeVar.n0;
                                                                s1Var2.J7 = s1Var3.J7;
                                                                s1Var2.S7 = s1Var3.S7;
                                                                s1Var2.L7 = s1Var3.L7;
                                                                s1Var2.N7 = s1Var3.N7;
                                                                s1Var2.P7 = s1Var3.P7;
                                                                s1Var2.R7 = s1Var3.R7;
                                                                s1Var2.W3(s1Var.getMessageObject(), null, s1Var.l3(), s1Var.m3(), s1Var.g3(), false);
                                                                org.telegram.ui.Cells.r1 transitionParams = yeVar.M.getTransitionParams();
                                                                transitionParams.g = yeVar.M.getTransitionParams().f();
                                                                Rect rect2 = transitionParams.D0;
                                                                transitionParams.K1 = 0.0f;
                                                                if (yeVar.M.getTransitionParams().D0.left == yeVar.M.getBackgroundDrawableLeft() && rect2.top == yeVar.M.getBackgroundDrawableTop() && rect2.bottom == yeVar.M.getBackgroundDrawableBottom()) {
                                                                    i20 = 1;
                                                                } else {
                                                                    rect.bottom = -(yeVar.M.getBackgroundDrawableBottom() - rect2.bottom);
                                                                    rect.top = -(yeVar.M.getBackgroundDrawableTop() - rect2.top);
                                                                    if (s1Var.getMessageObject().isOutOwner()) {
                                                                        rect.left = -(yeVar.M.getBackgroundDrawableLeft() - rect2.left);
                                                                        rect.right = 0;
                                                                    } else {
                                                                        rect.left = 0;
                                                                        rect.right = yeVar.M.getBackgroundDrawableRight() - rect2.right;
                                                                    }
                                                                    i20 = 1;
                                                                    transitionParams.w0 = true;
                                                                }
                                                                int i33 = yeVar.M.Ud;
                                                            } else {
                                                                i20 = 1;
                                                            }
                                                            yeVar.e(new sh0(yeVar, i20), false);
                                                            yeVar.B.invalidate();
                                                            yeVar.c();
                                                        }
                                                        rnVar.U.H0 = null;
                                                    }
                                                }
                                                arrayList3.remove(indexOf);
                                                ck ckVar2 = rnVar.U;
                                                Runnable runnable = ckVar2.b0;
                                                if (runnable != null) {
                                                    AndroidUtilities.cancelRunOnUIThread(runnable);
                                                    z21 = true;
                                                    ckVar2.c0 = true;
                                                    ckVar2.b0.run();
                                                    ckVar2.b0 = null;
                                                } else {
                                                    z21 = true;
                                                }
                                                rnVar.U.q0(z21);
                                            }
                                            if (!hashMap.isEmpty() && hashMap.containsKey(messageObject2.getDocument())) {
                                                hashMap.remove(messageObject2.getDocument());
                                                mjVar = rnVar.u0;
                                                if (mjVar != null) {
                                                    org.telegram.ui.Components.wn wnVar = rnVar.O0;
                                                    mjVar.O = o1Var;
                                                    mjVar.P = wnVar;
                                                    r10 = 0;
                                                    mjVar.N = false;
                                                    if (s1Var.bd) {
                                                        s1Var.bd = r10;
                                                        s1Var.setVisibility(r10);
                                                    }
                                                    rnVar.ub(s1Var);
                                                }
                                            }
                                            r10 = 0;
                                            if (s1Var.bd) {
                                            }
                                            rnVar.ub(s1Var);
                                        }
                                        z18 = z16;
                                        z17 = z12;
                                    }
                                    z19 = true;
                                    s1Var.setShowTopic(z19);
                                    s1Var.W3(messageObject2, X8, z18, z17, z15, z30);
                                    s1Var.setSpoilersSuppressed(rnVar.t0.getScrollState() != 0);
                                    s1Var.setHighlighted(rnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == rnVar.H7);
                                    z20 = s1Var.b8;
                                    if (!z20) {
                                    }
                                    if (!z20) {
                                    }
                                    if (!z20) {
                                    }
                                    if (rnVar.N3 == 7) {
                                        s1Var.R3(str);
                                    }
                                    if (rnVar.H7 != Integer.MAX_VALUE) {
                                    }
                                    indexOf = arrayList3.indexOf(messageObject2);
                                    if (indexOf != -1) {
                                    }
                                    if (!hashMap.isEmpty()) {
                                        hashMap.remove(messageObject2.getDocument());
                                        mjVar = rnVar.u0;
                                        if (mjVar != null) {
                                        }
                                    }
                                    r10 = 0;
                                    if (s1Var.bd) {
                                    }
                                    rnVar.ub(s1Var);
                                }
                                TLRPC.Peer peer2 = messageFwdHeader2.from_id;
                                if (peer2 != null) {
                                    if (messageObject2.messageOwner.fwd_from.from_id != null) {
                                    }
                                }
                            }
                        }
                        z12 = false;
                        arrayList2 = arrayList;
                        if (DialogObject.getPeerDialogId(messageObject4.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                        }
                        i18 = i17 - this.F;
                        if (i18 >= 0) {
                        }
                        z15 = true;
                        int i29222 = this.F;
                        if (i10 != i29222) {
                        }
                        if (j11 != o1Var.f) {
                        }
                        if (ChatObject.isChannel(rnVar.e)) {
                        }
                        if (!z14) {
                        }
                        boolean z29222 = false;
                        messageObject2.updateTranslation(false);
                        if (X8 != null) {
                        }
                        if (rnVar.La) {
                        }
                        z19 = true;
                        s1Var.setShowTopic(z19);
                        s1Var.W3(messageObject2, X8, z18, z17, z15, z30);
                        s1Var.setSpoilersSuppressed(rnVar.t0.getScrollState() != 0);
                        s1Var.setHighlighted(rnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == rnVar.H7);
                        z20 = s1Var.b8;
                        if (!z20) {
                        }
                        if (!z20) {
                        }
                        if (!z20) {
                        }
                        if (rnVar.N3 == 7) {
                        }
                        if (rnVar.H7 != Integer.MAX_VALUE) {
                        }
                        indexOf = arrayList3.indexOf(messageObject2);
                        if (indexOf != -1) {
                        }
                        if (!hashMap.isEmpty()) {
                        }
                        r10 = 0;
                        if (s1Var.bd) {
                        }
                        rnVar.ub(s1Var);
                    }
                }
                i17 = i14;
                arrayList2 = arrayList;
                i18 = i17 - this.F;
                if (i18 >= 0) {
                }
                z15 = true;
                int i292222 = this.F;
                if (i10 != i292222) {
                }
                if (j11 != o1Var.f) {
                }
                if (ChatObject.isChannel(rnVar.e)) {
                }
                if (!z14) {
                }
                boolean z292222 = false;
                messageObject2.updateTranslation(false);
                if (X8 != null) {
                }
                if (rnVar.La) {
                }
                z19 = true;
                s1Var.setShowTopic(z19);
                s1Var.W3(messageObject2, X8, z18, z17, z15, z30);
                s1Var.setSpoilersSuppressed(rnVar.t0.getScrollState() != 0);
                s1Var.setHighlighted(rnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == rnVar.H7);
                z20 = s1Var.b8;
                if (!z20) {
                }
                if (!z20) {
                }
                if (!z20) {
                }
                if (rnVar.N3 == 7) {
                }
                if (rnVar.H7 != Integer.MAX_VALUE) {
                }
                indexOf = arrayList3.indexOf(messageObject2);
                if (indexOf != -1) {
                }
                if (!hashMap.isEmpty()) {
                }
                r10 = 0;
                if (s1Var.bd) {
                }
                rnVar.ub(s1Var);
            }
        }
        z11 = false;
        s1Var.T7 = z11;
        s1Var.U7 = rnVar.N3 != 0 && (rnVar.F4.containsKey(Integer.valueOf(messageObject2.getId())) || !(X8 == null || X8.messages.isEmpty() || !rnVar.F4.containsKey(Integer.valueOf(X8.messages.get(0).getId()))));
        i13 = rnVar.N3;
        if (i13 != 1) {
        }
        arrayList = arrayList4;
        j10 = 0;
        s1Var.X7 = j10;
        if (i13 == 7) {
        }
        s1Var.Y7 = UserObject.isReplyUser(rnVar.f);
        s1Var.Z7 = rnVar.N3 != 2;
        s1Var.A8 = rnVar.t9();
        s1Var.B8 = rnVar.C9();
        s1Var.C8 = rnVar.B9();
        s1Var.D8 = rnVar.Q8();
        s1Var.E8 = rnVar.R8();
        if (messageObject2.isSponsored()) {
        }
        int i282 = i10 + 2;
        if (X8 == null) {
        }
        int j162 = j(i15);
        i16 = i15;
        j11 = j(i14);
        j(i282);
        if (!(messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup)) {
            MessageObject messageObject42 = (MessageObject) arrayList.get(i16 - this.F);
            if (messageObject42.isOutOwner() != messageObject2.isOutOwner()) {
            }
            if (!z12) {
            }
        }
        i17 = i14;
        arrayList2 = arrayList;
        i18 = i17 - this.F;
        if (i18 >= 0) {
        }
        z15 = true;
        int i2922222 = this.F;
        if (i10 != i2922222) {
        }
        if (j11 != o1Var.f) {
        }
        if (ChatObject.isChannel(rnVar.e)) {
        }
        if (!z14) {
        }
        boolean z2922222 = false;
        messageObject2.updateTranslation(false);
        if (X8 != null) {
        }
        if (rnVar.La) {
        }
        z19 = true;
        s1Var.setShowTopic(z19);
        s1Var.W3(messageObject2, X8, z18, z17, z15, z30);
        s1Var.setSpoilersSuppressed(rnVar.t0.getScrollState() != 0);
        s1Var.setHighlighted(rnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == rnVar.H7);
        z20 = s1Var.b8;
        if (!z20) {
        }
        if (!z20) {
        }
        if (!z20) {
        }
        if (rnVar.N3 == 7) {
        }
        if (rnVar.H7 != Integer.MAX_VALUE) {
        }
        indexOf = arrayList3.indexOf(messageObject2);
        if (indexOf != -1) {
        }
        if (!hashMap.isEmpty()) {
        }
        r10 = 0;
        if (s1Var.bd) {
        }
        rnVar.ub(s1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [org.telegram.ui.wl] */
    /* JADX WARN: Type inference failed for: r8v11, types: [org.telegram.ui.Cells.v0] */
    /* JADX WARN: Type inference failed for: r8v12, types: [org.telegram.ui.Cells.ua] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Cells.y0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [org.telegram.ui.Cells.h0, org.telegram.ui.vl] */
    /* JADX WARN: Type inference failed for: r8v16, types: [org.telegram.ui.Cells.u1] */
    /* JADX WARN: Type inference failed for: r8v9, types: [org.telegram.ui.Cells.t1] */
    /* JADX WARN: Type inference failed for: r9v12, types: [org.telegram.ui.Cells.v0] */
    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.Cells.s1 s1Var2;
        rn rnVar = this.M;
        if (i10 == 0) {
            s1Var = new org.telegram.ui.Cells.s1(this.h, ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, true, rnVar.xa, rnVar.aa);
            s1Var.setResourcesProvider(rnVar.aa);
            if (rnVar.lc == null) {
                rnVar.lc = new dn(rnVar);
            }
            s1Var.setDelegate(rnVar.lc);
            s1Var.Ld = rnVar.Lb;
            if (rnVar.h == null) {
                s1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? slVar = new sl(context, rnVar.aa, true);
                slVar.setInvalidateColors(true);
                slVar.setDelegate(new ul(this));
                s1Var = slVar;
            } else {
                if (i10 == 2) {
                    s1Var2 = new org.telegram.ui.Cells.u1(context, rnVar.aa);
                } else if (i10 == 3) {
                    ?? vlVar = new vl(this, context, ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, rnVar.aa);
                    vlVar.setDelegate(new c1(this, 20));
                    s1Var2 = vlVar;
                } else if (i10 == 4) {
                    s1Var2 = new org.telegram.ui.Cells.y0(context, rnVar.aa);
                } else if (i10 == 6) {
                    s1Var2 = new org.telegram.ui.Cells.ua(context, ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, rnVar.aa);
                } else if (i10 == 7) {
                    s1Var2 = new org.telegram.ui.Cells.v0(context, rnVar.aa, false);
                } else if (i10 == 8) {
                    s1Var2 = new wl(this, context, ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, rnVar.aa);
                } else if (i10 == 10) {
                    ?? t1Var = new org.telegram.ui.Cells.t1(context, rnVar.aa);
                    if (rnVar.lc == null) {
                        rnVar.lc = new dn(rnVar);
                    }
                    t1Var.setDelegate(rnVar.lc);
                    s1Var2 = t1Var;
                } else {
                    s1Var = null;
                }
                s1Var = s1Var2;
            }
        }
        return org.telegram.ui.Cells.pa.l(s1Var, s1Var, -1, -2);
    }

    @Override // f2.q0
    public final void y(f2.o1 o1Var) {
        TLRPC.Message message;
        boolean z10;
        boolean z11;
        byte[] bArr;
        Integer num;
        String str;
        String stickerEmoji;
        MessagesController.EmojiSound emojiSound;
        View view = o1Var.a;
        boolean z12 = view instanceof org.telegram.ui.Cells.s1;
        rn rnVar = this.M;
        if (z12 || (view instanceof org.telegram.ui.Cells.v0)) {
            rnVar.r9();
        }
        boolean z13 = view instanceof org.telegram.ui.Cells.s1;
        if (z13) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            MessageObject messageObject = s1Var.getMessageObject();
            s1Var.A8 = rnVar.t9();
            s1Var.B8 = rnVar.C9();
            s1Var.C8 = rnVar.B9();
            s1Var.D8 = rnVar.Q8();
            s1Var.E8 = rnVar.R8();
            s1Var.f4(-1, true, false);
            MessageObject messageObject2 = rnVar.C3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                s1Var.f4(rnVar.D3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = rnVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                rnVar.getMediaController().playEmojiSound(rnVar.getAccountInstance(), stickerEmoji, emojiSound, true);
            }
            if (messageObject.updateTranslation(false)) {
                s1Var.W3(messageObject, s1Var.getCurrentMessagesGroup(), s1Var.l3(), s1Var.m3(), s1Var.g3(), s1Var.i3());
            } else {
                MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    for (int i10 = 0; i10 < currentMessagesGroup.messages.size(); i10++) {
                        currentMessagesGroup.messages.get(i10).updateTranslation();
                    }
                }
            }
            if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar.t() || rnVar.A9()) {
                rnVar.J7 = false;
                rnVar.K7 = 0L;
                rnVar.L7 = null;
                ArrayList arrayList = rnVar.W3;
                s1Var.I3(arrayList == null || !arrayList.contains(messageObject), false);
                int i11 = messageObject.getDialogId() == rnVar.P5 ? 0 : 1;
                if (rnVar.S5[i11].indexOfKey(messageObject.getId()) >= 0) {
                    rnVar.hb(messageObject, s1Var, i11, false);
                    z10 = true;
                } else {
                    s1Var.setDrawSelectionBackground(false);
                    s1Var.K3(false, false, false);
                    z10 = false;
                }
                z11 = true;
            } else {
                s1Var.setDrawSelectionBackground(false);
                s1Var.K3(false, false, false);
                s1Var.I3(false, false);
                z10 = false;
                z11 = false;
            }
            s1Var.J3(!z11, z11 && z10);
            if (rnVar.N3 != 7 || rnVar.q3 == null || (str = rnVar.p3) == null) {
                gk gkVar = rnVar.N2;
                if (gkVar != null && gkVar.getVisibility() == 0) {
                    if (rnVar.getMediaDataController().isMessageFound(messageObject.getId(), messageObject.getDialogId() == rnVar.H6) && rnVar.getMediaDataController().getLastSearchQuery() != null) {
                        s1Var.R3(rnVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                s1Var.R3(null);
            } else {
                s1Var.R3(str);
            }
            if (!((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode || !s1Var.b8) {
                s1Var.setHighlighted(rnVar.H7 != Integer.MAX_VALUE && ((s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == rnVar.H7) || (s1Var.getCurrentMessagesGroup() != null && s1Var.getCurrentMessagesGroup().contains(rnVar.H7))));
                boolean z14 = s1Var.b8;
                if (z14 && rnVar.L7 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!s1Var.S3(rnVar.L7, true, rnVar.J7 || currentTimeMillis - rnVar.K7 < 200, rnVar.O7) && rnVar.I7) {
                        org.telegram.ui.Components.mc.a0(rnVar).Q(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    rnVar.I7 = false;
                    if (rnVar.J7) {
                        rnVar.K7 = currentTimeMillis;
                    }
                    rnVar.J7 = false;
                } else if (z14 && (num = rnVar.M7) != null) {
                    s1Var.Q3(num.intValue());
                } else if (z14 && (bArr = rnVar.N7) != null) {
                    s1Var.O3(bArr);
                }
                if (rnVar.H7 != Integer.MAX_VALUE) {
                    rnVar.Zb();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            v0Var.a0 = rnVar.t9();
            v0Var.e0 = rnVar.C9();
            rnVar.B9();
            rnVar.Q8();
            v0Var.f0 = rnVar.R8();
        } else if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(rnVar.R8() / 2.0f);
        }
        int b10 = o1Var.b();
        int i12 = this.F;
        if (b10 < i12 || b10 >= this.G) {
            return;
        }
        MessageObject messageObject3 = (MessageObject) (this.H ? this.I : this.J ? this.L : rnVar.q6).get(b10 - i12);
        if (messageObject3 == null || (message = messageObject3.messageOwner) == null || !message.media_unread || !message.mentioned) {
            return;
        }
        if (!((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode && rnVar.N3 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
            int i13 = rnVar.h6 - 1;
            rnVar.h6 = i13;
            if (i13 <= 0) {
                rnVar.h6 = 0;
                rnVar.i6 = true;
                rnVar.Kb(false);
            } else {
                rnVar.f1.c(2, i13, true);
            }
            rnVar.getMessagesController().markMentionMessageAsRead(messageObject3.getId(), ChatObject.isChannel(rnVar.e) ? rnVar.e.id : 0L, rnVar.P5);
            messageObject3.setContentIsRead();
        }
        if (z13) {
            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
            if (((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode) {
                s1Var2.setHighlighted(true);
            } else {
                s1Var2.N3();
            }
        }
    }
}
