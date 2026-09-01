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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class jm extends org.telegram.ui.Components.yk0 {
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public final ArrayList J;
    public boolean K;
    public boolean L;
    public final ArrayList M;
    public final /* synthetic */ xn N;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public jm(xn xnVar, Context context) {
        this.N = xnVar;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.s = -5;
        this.v = -5;
        this.w = -5;
        this.x = -5;
        this.y = -5;
        this.B = -5;
        this.C = -5;
        this.D = -5;
        this.E = -5;
        this.F = -5;
        this.J = new ArrayList();
        this.M = new ArrayList();
        this.h = context;
        TLRPC.User user = xnVar.f;
        this.n = user != null && user.bot;
        C(true);
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    public final void K(boolean z4) {
        xn xnVar = this.N;
        if (UserObject.isBotForum(xnVar.f)) {
            if (z4) {
                xnVar.kc = true;
            }
            if (this.F < 0 || N()) {
                return;
            }
            super.u(this.F);
            S();
        }
    }

    public final ArrayList L() {
        return this.I ? this.J : this.K ? this.M : this.N.r6;
    }

    public final void M(MessageObject messageObject) {
        xn xnVar = this.N;
        int childCount = xnVar.u0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = xnVar.u0.getChildAt(i10);
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
        xn xnVar = this.N;
        return UserObject.isBotForumWithEditableTopics(xnVar.f) && xnVar.b() == 0 && !xnVar.kc && xnVar.O3 == 0;
    }

    public final void O(boolean z4) {
        boolean z10;
        xn xnVar = this.N;
        ArrayList arrayList = xnVar.r6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + xnVar.L5);
        }
        if (z4 && xnVar.L5) {
            f2.u0 itemAnimator = xnVar.u0.getItemAnimator();
            sj sjVar = xnVar.v0;
            if (itemAnimator != sjVar) {
                xnVar.u0.setItemAnimator(sjVar);
            }
        } else {
            xnVar.u0.setItemAnimator(null);
        }
        S();
        try {
            super.l();
        } catch (Exception e6) {
            FileLog.e(e6);
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
                        z10 = true;
                    }
                }
            }
        }
        z10 = false;
        boolean[] zArr = xnVar.z6;
        if ((zArr[0] && (xnVar.I6 == 0 || zArr[1])) || z10) {
            xnVar.L6(((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow);
        }
    }

    public final void P(int i10, boolean z4) {
        MessageObject messageObject;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder("notify item removed ");
            sb.append(i10);
            yh.v(z4 ? " with thanos effect" : "", sb);
        }
        xn xnVar = this.N;
        if (((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow) {
            f2.u0 itemAnimator = xnVar.u0.getItemAnimator();
            sj sjVar = xnVar.v0;
            if (itemAnimator != sjVar) {
                xnVar.u0.setItemAnimator(sjVar);
            }
        } else {
            xnVar.u0.setItemAnimator(null);
        }
        if (z4 && xnVar.v0 != null) {
            f2.u0 itemAnimator2 = xnVar.u0.getItemAnimator();
            sj sjVar2 = xnVar.v0;
            if (itemAnimator2 == sjVar2) {
                f2.m1 K = xnVar.u0.K(i10);
                if (K == null) {
                    sjVar2.getClass();
                } else {
                    sjVar2.S.add(K);
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
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void Q(int i10) {
        int i11;
        xn xnVar = this.N;
        ArrayList arrayList = xnVar.r6;
        if (xnVar.w0 == null || this.I || this.K) {
            return;
        }
        int i12 = 0;
        if (!xnVar.A4 && xnVar.G7 != null) {
            int childCount = xnVar.u0.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                View childAt = xnVar.u0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                    MessageObject messageObject2 = xnVar.G7;
                    if (messageObject == messageObject2) {
                        if (arrayList.indexOf(messageObject2) >= 0) {
                            i11 = arrayList.indexOf(xnVar.G7) + this.G;
                            i12 = xnVar.L8(childAt);
                        }
                    }
                }
                i13++;
            }
        }
        i11 = -1;
        m(i10);
        if (i11 != -1) {
            xnVar.w0.h1(i11, i12);
        }
    }

    public final org.telegram.ui.Cells.t1 R(MessageObject messageObject, boolean z4, boolean z10) {
        xn xnVar = this.N;
        if (z4) {
            int childCount = xnVar.u0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = xnVar.u0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject() == messageObject && TextUtils.equals(t1Var.c7, t1Var.v7.messageOwner.post_author)) {
                        t1Var.X3(messageObject, t1Var.getCurrentMessagesGroup(), t1Var.m3(), t1Var.n3(), t1Var.h3(), t1Var.j3());
                        return t1Var;
                    }
                }
                i10++;
                messageObject = messageObject;
            }
        }
        MessageObject messageObject2 = messageObject;
        int indexOf = (this.I ? this.J : this.K ? this.M : xnVar.r6).indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (!z10) {
            Q(this.G + indexOf);
            return null;
        }
        int i11 = xn.Gc;
        xn.Gc = i11 + 1;
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
        xn xnVar = this.N;
        boolean[] zArr = xnVar.z6;
        this.r = 0;
        ArrayList arrayList = this.I ? this.J : this.K ? this.M : xnVar.r6;
        if (xnVar.O3 == 3 && xnVar.La) {
            this.r = 1;
            this.s = 0;
        } else {
            this.s = -5;
        }
        this.v = -5;
        this.w = -5;
        this.y = -5;
        this.D = -5;
        this.E = -5;
        this.F = -5;
        if (N()) {
            int i13 = this.r;
            this.r = i13 + 1;
            this.F = i13;
        }
        if (arrayList.isEmpty()) {
            this.B = -5;
            this.C = -5;
            this.G = 0;
            this.H = 0;
            TLRPC.User user4 = xnVar.f;
            if (user4 != null && !UserObject.isBot(user4) && !UserObject.isReplyUser(xnVar.f)) {
                TLRPC.PeerSettings peerSettings3 = xnVar.getMessagesController().getPeerSettings(xnVar.f.id);
                int i14 = org.telegram.ui.Cells.xa.L;
                if (peerSettings3 != null && ((peerSettings3.phone_country != null || peerSettings3.registration_month != null) && !MessagesController.isSupportUser(xnVar.f) && xnVar.O3 == 0)) {
                    int i15 = this.r;
                    this.r = i15 + 1;
                    this.y = i15;
                    return;
                }
            }
            if (UserObject.isReplyUser(xnVar.f) || ((user = xnVar.f) != null && user.bot && !MessagesController.isSupportUser(user) && xnVar.O3 == 0)) {
                int i16 = this.r;
                this.r = i16 + 1;
                this.w = i16;
                return;
            }
            return;
        }
        if (!this.K) {
            boolean[] zArr2 = xnVar.B6;
            if ((!zArr2[0] || (xnVar.I6 != 0 && !zArr2[1])) && !xnVar.C6) {
                int i17 = this.r;
                this.r = i17 + 1;
                this.C = i17;
                int i18 = this.r;
                this.G = i18;
                int size = arrayList.size() + i18;
                this.r = size;
                this.H = size;
                user2 = xnVar.f;
                if (user2 != null && !UserObject.isBot(user2) && !UserObject.isReplyUser(xnVar.f)) {
                    peerSettings = xnVar.getMessagesController().getPeerSettings(xnVar.f.id);
                    int i19 = org.telegram.ui.Cells.xa.L;
                    if (peerSettings != null && ((peerSettings.phone_country != null || peerSettings.registration_month != null) && !MessagesController.isSupportUser(xnVar.f) && xnVar.O3 == 0 && zArr[0])) {
                        peerSettings2 = xnVar.getMessagesController().getPeerSettings(xnVar.f.id);
                        i11 = peerSettings2.name_change_date;
                        if (i11 != 0 || (i12 = peerSettings2.photo_change_date) == 0) {
                            if (i11 != 0) {
                                int i20 = this.r;
                                this.r = i20 + 1;
                                this.E = i20;
                            }
                            if (peerSettings2.photo_change_date != 0) {
                                int i21 = this.r;
                                this.r = i21 + 1;
                                this.D = i21;
                            }
                        } else if (i11 < i12) {
                            int i22 = this.r;
                            this.E = i22;
                            this.r = i22 + 2;
                            this.D = i22 + 1;
                        } else {
                            int i23 = this.r;
                            this.D = i23;
                            this.r = i23 + 2;
                            this.E = i23 + 1;
                        }
                        int i24 = this.r;
                        this.r = i24 + 1;
                        this.y = i24;
                        i10 = xnVar.O3;
                        if (i10 == 9) {
                            int i25 = this.r;
                            this.s = i25;
                            this.r = i25 + 2;
                            this.v = i25 + 1;
                        }
                        if (i10 == 5 && !vf.p1.g(xnVar.N3)) {
                            int i26 = this.r;
                            this.r = i26 + 1;
                            this.s = i26;
                        }
                        if (this.K ? !(!(zArr[0] && (xnVar.I6 == 0 || zArr[1])) && (AndroidUtilities.isTablet() || xnVar.d4 || xnVar.f != null)) : this.L) {
                            this.B = -5;
                            return;
                        }
                        int i27 = this.r;
                        this.r = i27 + 1;
                        this.B = i27;
                        return;
                    }
                }
                if ((!UserObject.isReplyUser(xnVar.f) || ((user3 = xnVar.f) != null && user3.bot && !MessagesController.isSupportUser(user3) && xnVar.O3 == 0)) && zArr[0]) {
                    int i28 = this.r;
                    this.r = i28 + 1;
                    this.w = i28;
                }
                i10 = xnVar.O3;
                if (i10 == 9) {
                }
                if (i10 == 5) {
                    int i262 = this.r;
                    this.r = i262 + 1;
                    this.s = i262;
                }
                if (this.K) {
                    int i272 = this.r;
                    this.r = i272 + 1;
                    this.B = i272;
                    return;
                } else {
                    int i2722 = this.r;
                    this.r = i2722 + 1;
                    this.B = i2722;
                    return;
                }
            }
        }
        this.C = -5;
        int i182 = this.r;
        this.G = i182;
        int size2 = arrayList.size() + i182;
        this.r = size2;
        this.H = size2;
        user2 = xnVar.f;
        if (user2 != null) {
            peerSettings = xnVar.getMessagesController().getPeerSettings(xnVar.f.id);
            int i192 = org.telegram.ui.Cells.xa.L;
            if (peerSettings != null) {
                peerSettings2 = xnVar.getMessagesController().getPeerSettings(xnVar.f.id);
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
                i10 = xnVar.O3;
                if (i10 == 9) {
                }
                if (i10 == 5) {
                }
                if (this.K) {
                }
            }
        }
        if (!UserObject.isReplyUser(xnVar.f)) {
        }
        int i282 = this.r;
        this.r = i282 + 1;
        this.w = i282;
        i10 = xnVar.O3;
        if (i10 == 9) {
        }
        if (i10 == 5) {
        }
        if (this.K) {
        }
    }

    public final void T() {
        int i10 = this.r;
        int i11 = this.w;
        int i12 = this.y;
        int i13 = this.s;
        int i14 = this.v;
        int i15 = this.B;
        int i16 = this.C;
        int i17 = this.G;
        int i18 = this.H;
        int i19 = this.D;
        int i20 = this.E;
        int i21 = this.F;
        S();
        if (i10 == this.r && i11 == this.w && i15 == this.B && i16 == this.C && i17 == this.G && i18 == this.H && i13 == this.s && i14 == this.v && i12 == this.y && i19 == this.D && i20 == this.E && i21 == this.F) {
            return;
        }
        O(false);
    }

    @Override // f2.p0
    public final int h() {
        this.x = -5;
        xn xnVar = this.N;
        a0.h hVar = xnVar.a8;
        if (xnVar.J5.get(xnVar.a4, 0) == 0) {
            return this.r;
        }
        TLRPC.User user = xnVar.f;
        if (user == null || !user.bot || xnVar.O3 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(xnVar.f.id)).description == null && ((TL_bots.BotInfo) hVar.f(xnVar.f.id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(xnVar.f.id)).description_document == null)) && !UserObject.isReplyUser(xnVar.f) && !UserObject.isBotForum(xnVar.f))) {
            return 0;
        }
        this.x = 0;
        return 1;
    }

    @Override // f2.p0
    public final long i(int i10) {
        xn xnVar = this.N;
        if (xnVar.J5.get(xnVar.a4, 0) != 0 && i10 == this.x) {
            return 1L;
        }
        ArrayList arrayList = this.I ? this.J : this.K ? this.M : xnVar.r6;
        if (i10 >= this.G && i10 < this.H) {
            return ((MessageObject) arrayList.get(i10 - r1)).stableId;
        }
        if (i10 == this.w || i10 == this.x) {
            return 1L;
        }
        if (i10 == this.B) {
            return 2L;
        }
        if (i10 == this.C) {
            return 3L;
        }
        if (i10 == this.s) {
            return 4L;
        }
        if (i10 == this.y) {
            return 6L;
        }
        if (i10 == this.D) {
            return 7L;
        }
        if (i10 == this.E) {
            return 8L;
        }
        if (i10 == this.F) {
            return 9L;
        }
        return i10 == this.v ? 10L : 5L;
    }

    @Override // f2.p0
    public final int j(int i10) {
        xn xnVar = this.N;
        if (xnVar.J5.get(xnVar.a4, 0) != 0 && i10 == this.x) {
            return 3;
        }
        if (i10 == this.s || i10 == this.v) {
            return 1;
        }
        int i11 = this.G;
        if (i10 >= i11 && i10 < this.H) {
            return ((MessageObject) (this.I ? this.J : this.K ? this.M : xnVar.r6).get(i10 - i11)).contentType;
        }
        if (i10 == this.w) {
            return 3;
        }
        if (i10 == this.y) {
            return 6;
        }
        if (i10 == this.E || i10 == this.D) {
            return 7;
        }
        return i10 == this.F ? 8 : 4;
    }

    @Override // org.telegram.ui.Components.yk0, f2.p0
    public final void l() {
        O(false);
    }

    @Override // org.telegram.ui.Components.yk0, f2.p0
    public final void m(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item changed " + i10);
        }
        xn xnVar = this.N;
        if (!((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow || xnVar.K0) {
            xnVar.u0.setItemAnimator(null);
        } else {
            f2.u0 itemAnimator = xnVar.u0.getItemAnimator();
            sj sjVar = xnVar.v0;
            if (itemAnimator != sjVar) {
                xnVar.u0.setItemAnimator(sjVar);
            }
        }
        S();
        try {
            super.m(i10);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.ui.Components.yk0, f2.p0
    public final void o(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item inserted " + i10);
        }
        xn xnVar = this.N;
        if (((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow) {
            f2.u0 itemAnimator = xnVar.u0.getItemAnimator();
            sj sjVar = xnVar.v0;
            if (itemAnimator != sjVar) {
                xnVar.u0.setItemAnimator(sjVar);
            }
        } else {
            xnVar.u0.setItemAnimator(null);
        }
        S();
        try {
            super.o(i10);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // f2.p0
    public final void p(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item moved" + i10 + ":" + i11);
        }
        xn xnVar = this.N;
        if (((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow) {
            f2.u0 itemAnimator = xnVar.u0.getItemAnimator();
            sj sjVar = xnVar.v0;
            if (itemAnimator != sjVar) {
                xnVar.u0.setItemAnimator(sjVar);
            }
        } else {
            xnVar.u0.setItemAnimator(null);
        }
        S();
        try {
            super.p(i10, i11);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.ui.Components.yk0, f2.p0
    public final void q(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range changed " + i10 + ":" + i11);
        }
        xn xnVar = this.N;
        if (((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow) {
            f2.u0 itemAnimator = xnVar.u0.getItemAnimator();
            sj sjVar = xnVar.v0;
            if (itemAnimator != sjVar) {
                xnVar.u0.setItemAnimator(sjVar);
            }
        } else {
            xnVar.u0.setItemAnimator(null);
        }
        S();
        try {
            super.q(i10, i11);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.ui.Components.yk0, f2.p0
    public final void s(int i10, int i11) {
        int i12;
        int i13;
        xn xnVar = this.N;
        ArrayList arrayList = xnVar.r6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        if (((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow) {
            f2.u0 itemAnimator = xnVar.u0.getItemAnimator();
            sj sjVar = xnVar.v0;
            if (itemAnimator != sjVar) {
                xnVar.u0.setItemAnimator(sjVar);
            }
        } else {
            xnVar.u0.setItemAnimator(null);
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.G) && i12 < this.H) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.G) - 1);
            if ((xnVar.e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (xnVar.f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
                m(i10);
            }
        }
        try {
            super.s(i10, i11);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.ui.Components.yk0, f2.p0
    public final void t(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range removed" + i10 + ":" + i11);
        }
        xn xnVar = this.N;
        if (((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow) {
            f2.u0 itemAnimator = xnVar.u0.getItemAnimator();
            sj sjVar = xnVar.v0;
            if (itemAnimator != sjVar) {
                xnVar.u0.setItemAnimator(sjVar);
            }
        } else {
            xnVar.u0.setItemAnimator(null);
        }
        S();
        try {
            super.t(i10, i11);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.ui.Components.yk0, f2.p0
    public final void u(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item removed " + i10);
        }
        xn xnVar = this.N;
        if (((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow) {
            f2.u0 itemAnimator = xnVar.u0.getItemAnimator();
            sj sjVar = xnVar.v0;
            if (itemAnimator != sjVar) {
                xnVar.u0.setItemAnimator(sjVar);
            }
        } else {
            xnVar.u0.setItemAnimator(null);
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x05cf, code lost:
    
        if (r19 != r9) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0942, code lost:
    
        if (r4.v0 == null) goto L551;
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
    
        if (r4.O3 != 9) goto L268;
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
    public final void v(f2.m1 m1Var, int i10) {
        TLRPC.UserFull userFull;
        TLObject tLObject;
        int i11;
        int i12;
        boolean z4;
        boolean z10;
        int i13;
        ArrayList arrayList;
        long j10;
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        boolean z13;
        int j11;
        boolean z14;
        boolean z15;
        ArrayList arrayList2;
        int i16;
        int i17;
        boolean z16;
        boolean z17;
        int i18;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        String str;
        byte[] bArr;
        Integer num;
        int indexOf;
        ?? r10;
        sj sjVar;
        MessageObject.SendAnimationData sendAnimationData;
        jk jkVar;
        int i19;
        int i20;
        boolean z26;
        dl dlVar;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str2;
        boolean z27;
        long j12;
        long j13;
        long j14;
        MessageObject messageObject;
        String str3;
        int i21;
        boolean z28;
        TLRPC.ChatFull chatFull;
        View view = m1Var.a;
        xn xnVar = this.N;
        a0.h hVar = xnVar.a8;
        ArrayList arrayList3 = xnVar.r4;
        HashMap hashMap = xnVar.s4;
        boolean z29 = false;
        if (i10 == this.w || i10 == this.x) {
            org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) view;
            if (UserObject.isReplyUser(xnVar.f)) {
                h0Var.b(false, 0L, LocaleController.getString(R.string.RepliesChatInfo), null, null, null);
            } else {
                TLRPC.User user = xnVar.f;
                if (user == null || user.id != UserObject.VERIFY) {
                    TL_bots.BotInfo botInfo = hVar.m() != 0 ? (TL_bots.BotInfo) hVar.f(xnVar.f.id) : null;
                    boolean z30 = (botInfo == null || (TextUtils.isEmpty(botInfo.description) && botInfo.description_photo == null && botInfo.description_document == null)) && UserObject.isBot(xnVar.f) && (userFull = xnVar.X7) != null && userFull.bot_manager_id != 0 && xnVar.f.bot_can_edit;
                    TLRPC.User user2 = xnVar.f;
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
                    h0Var.b(true, j15, str4, tLObject, botInfo, z30 ? DialogObject.getName(((org.telegram.ui.ActionBar.p2) xnVar).currentAccount, xnVar.X7.bot_manager_id) : null);
                } else {
                    h0Var.b(false, 0L, LocaleController.getString(R.string.VerifyChatInfo), null, null, null);
                }
            }
            xn.b4(xnVar, h0Var);
            return;
        }
        if (i10 == this.F) {
            ((org.telegram.ui.Cells.b0) view).setDialogId(xnVar.a());
            return;
        }
        if (i10 == this.y) {
            org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
            TLRPC.EncryptedChat encryptedChat = xnVar.h;
            long a2 = encryptedChat != null ? encryptedChat.user_id : xnVar.a();
            xaVar.b(a2, xnVar.getMessagesController().getPeerSettings(a2));
            return;
        }
        if (i10 == this.C || i10 == this.B) {
            ((org.telegram.ui.Cells.y0) view).setProgressVisible(xnVar.G6 > 1);
            return;
        }
        if (i10 == this.E) {
            if (xnVar.getMessagesController().getPeerSettings(xnVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.v0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedName, LocaleController.formatRelativeDate(xnVar.getConnectionsManager().getCurrentTime() - r1.name_change_date)));
            return;
        }
        if (i10 == this.D) {
            if (xnVar.getMessagesController().getPeerSettings(xnVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.v0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedPhoto, LocaleController.formatRelativeDate(xnVar.getConnectionsManager().getCurrentTime() - r1.photo_change_date)));
            return;
        }
        if (i10 == this.s) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            xn.d4(xnVar);
            v0Var.setMessageObject(xnVar.F3);
            int i22 = xnVar.O3;
            if (i22 == 3) {
                v0Var.setCustomText(LocaleController.getString(R.string.SavedMessagesProfileHint));
            } else if (i22 == 5) {
                v0Var.setCustomText(LocaleController.getString(R.string.BusinessRepliesHint));
            } else if (i22 == 9) {
                v0Var.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint2));
            }
            v0Var.setAlpha(1.0f);
            v0Var.setSpoilersSuppressed(xnVar.u0.getScrollState() != 0);
            return;
        }
        if (i10 == this.v) {
            org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) view;
            xn.e4(xnVar);
            v0Var2.setMessageObject(xnVar.G3);
            v0Var2.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint));
            v0Var2.setAlpha(1.0f);
            v0Var2.setSpoilersSuppressed(xnVar.u0.getScrollState() != 0);
            return;
        }
        int i23 = this.G;
        if (i10 < i23 || i10 >= this.H) {
            return;
        }
        ArrayList arrayList4 = this.I ? this.J : this.K ? this.M : xnVar.r6;
        MessageObject messageObject2 = (MessageObject) arrayList4.get(i10 - i23);
        if (!(view instanceof org.telegram.ui.Cells.t1)) {
            ArrayList arrayList5 = arrayList4;
            MessageObject messageObject3 = null;
            if (!(view instanceof org.telegram.ui.Cells.v0)) {
                if (view instanceof org.telegram.ui.Cells.v1) {
                    org.telegram.ui.Cells.v1 v1Var = (org.telegram.ui.Cells.v1) view;
                    v1Var.setText(LocaleController.getString(R.string.UnreadMessages));
                    v1Var.getTextView().setTranslationX(xnVar.R8() / 2.0f);
                    if (xnVar.A7 != 0) {
                        xnVar.A7 = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            if ((messageObject2 == null || !messageObject2.isDateObject) && (i12 = (i11 = i10 + 1) - this.G) >= 0 && i12 < arrayList5.size()) {
                MessageObject messageObject4 = (MessageObject) arrayList5.get(i11 - this.G);
                if (messageObject4 == null || !messageObject4.isDateObject) {
                    messageObject3 = messageObject4;
                } else {
                    int i24 = i10 + 2;
                    int i25 = i24 - this.G;
                    if (i25 >= 0 && i25 < arrayList5.size()) {
                        messageObject3 = (MessageObject) arrayList5.get(i24 - this.G);
                    }
                }
                if (messageObject3 == null || (messageObject2 != null && messageObject3.getTopicId() != messageObject2.getTopicId())) {
                    z4 = true;
                    org.telegram.ui.Cells.v0 v0Var3 = (org.telegram.ui.Cells.v0) view;
                    v0Var3.b0 = xnVar.t9();
                    v0Var3.f0 = xnVar.C9();
                    xnVar.B9();
                    xnVar.Q8();
                    v0Var3.g0 = xnVar.R8();
                    v0Var3.c0 = ChatObject.isForum(xnVar.e);
                    v0Var3.d0 = ChatObject.isMonoForum(xnVar.e);
                    v0Var3.e0 = UserObject.isBotForum(xnVar.f);
                    boolean z31 = v0Var3.h0 == z4;
                    v0Var3.h0 = z4;
                    v0Var3.U(messageObject2, z31);
                    v0Var3.setAlpha(1.0f);
                    v0Var3.setShowTopic(true);
                    v0Var3.setSpoilersSuppressed(xnVar.u0.getScrollState() == 0);
                    return;
                }
            }
            z4 = false;
            org.telegram.ui.Cells.v0 v0Var32 = (org.telegram.ui.Cells.v0) view;
            v0Var32.b0 = xnVar.t9();
            v0Var32.f0 = xnVar.C9();
            xnVar.B9();
            xnVar.Q8();
            v0Var32.g0 = xnVar.R8();
            v0Var32.c0 = ChatObject.isForum(xnVar.e);
            v0Var32.d0 = ChatObject.isMonoForum(xnVar.e);
            v0Var32.e0 = UserObject.isBotForum(xnVar.f);
            if (v0Var32.h0 == z4) {
            }
            v0Var32.h0 = z4;
            v0Var32.U(messageObject2, z31);
            v0Var32.setAlpha(1.0f);
            v0Var32.setShowTopic(true);
            v0Var32.setSpoilersSuppressed(xnVar.u0.getScrollState() == 0);
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
        MessageObject.GroupedMessages X8 = xnVar.X8(messageObject2);
        t1Var.K7 = xnVar.e != null || UserObject.isUserSelf(xnVar.f) || UserObject.isReplyUser(xnVar.f) || xnVar.O3 == 7;
        t1Var.y.a(false, false);
        t1Var.L7 = UserObject.isBotForum(xnVar.f);
        t1Var.X7 = xnVar.A9();
        int i26 = xnVar.O3;
        t1Var.M7 = i26 == 3;
        t1Var.N7 = i26 == 3 && xnVar.La;
        TLRPC.User user3 = xnVar.f;
        t1Var.O7 = user3 != null && user3.bot;
        t1Var.P7 = ChatObject.isChannel(xnVar.e) && xnVar.e.megagroup;
        t1Var.Q7 = ChatObject.isForum(xnVar.e);
        t1Var.R7 = ChatObject.isMonoForum(xnVar.e);
        t1Var.S7 = ChatObject.isForum(xnVar.e) && xnVar.e4 && xnVar.b() == 1;
        t1Var.T7 = (xnVar.a4 != 0 || (t1Var.Q7 && xnVar.e4)) && !t1Var.R7;
        int i27 = xnVar.O3;
        if (i27 != 1 && i27 != 9 && ChatObject.isChannel(xnVar.e)) {
            TLRPC.Chat chat = xnVar.e;
            if (chat.has_link && !chat.megagroup) {
                z10 = true;
                t1Var.U7 = z10;
                t1Var.V7 = xnVar.O3 != 0 && (xnVar.G4.containsKey(Integer.valueOf(messageObject2.getId())) || !(X8 == null || X8.messages.isEmpty() || !xnVar.G4.containsKey(Integer.valueOf(X8.messages.get(0).getId()))));
                i13 = xnVar.O3;
                if (i13 != 1 || i13 == 9 || (chatFull = xnVar.W7) == null) {
                    arrayList = arrayList4;
                    j10 = 0;
                } else {
                    arrayList = arrayList4;
                    j10 = chatFull.linked_chat_id;
                }
                t1Var.Y7 = j10;
                if (i13 == 7 || xnVar.L3 != 1) {
                    t1Var.Z7 = UserObject.isReplyUser(xnVar.f);
                } else {
                    t1Var.Z7 = UserObject.isReplyUser(messageObject2.getDialogId());
                }
                t1Var.a8 = xnVar.O3 != 2;
                t1Var.B8 = xnVar.t9();
                t1Var.C8 = xnVar.C9();
                t1Var.D8 = xnVar.B9();
                t1Var.E8 = xnVar.Q8();
                t1Var.F8 = xnVar.R8();
                if (messageObject2.isSponsored()) {
                    AndroidUtilities.doOnPreDraw(t1Var, new ag.f(23));
                }
                int i28 = i10 + 2;
                if (X8 == null) {
                    MessageObject.GroupedMessagePosition position = X8.getPosition(messageObject2);
                    if (position != null) {
                        if (X8.isDocuments) {
                            int indexOf2 = X8.posArray.indexOf(position) + i10 + 1;
                            int indexOf3 = X8.posArray.indexOf(position) + (i10 - X8.posArray.size());
                            i15 = indexOf2;
                            z12 = false;
                            z13 = false;
                            i14 = indexOf3;
                            z11 = false;
                        } else {
                            if ((position.flags & 4) != 0) {
                                i21 = X8.reversed ? X8.posArray.indexOf(position) + (i10 - X8.posArray.size()) : X8.posArray.indexOf(position) + i10 + 1;
                                z11 = false;
                                z28 = false;
                            } else {
                                z11 = true;
                                i21 = -100;
                                z28 = true;
                            }
                            if ((position.flags & 8) != 0) {
                                int i29 = i21;
                                i14 = X8.reversed ? X8.posArray.indexOf(position) + i10 + 1 : X8.posArray.indexOf(position) + (i10 - X8.posArray.size());
                                i15 = i29;
                                z29 = z28;
                                z12 = false;
                                z13 = false;
                            } else {
                                i15 = i21;
                                z29 = z28;
                                i14 = -100;
                                z12 = true;
                                z13 = true;
                            }
                        }
                        int j16 = j(i14);
                        boolean z32 = z11;
                        j11 = j(i15);
                        j(i28);
                        if ((messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && j16 == m1Var.f) {
                            arrayList2 = arrayList;
                            MessageObject messageObject5 = (MessageObject) arrayList2.get(i14 - this.G);
                            i16 = i15;
                            boolean z33 = messageObject5.isOutOwner() == messageObject2.isOutOwner() && (Math.abs(messageObject5.messageOwner.date - messageObject2.messageOwner.date) <= 300 || xnVar.O3 == 9);
                            if (z33) {
                                TLRPC.Message message2 = messageObject5.messageOwner;
                                z14 = z12;
                                z15 = z29;
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
                                                z33 = str5.equals(str3);
                                                if (DialogObject.getPeerDialogId(messageObject5.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                                    z13 = false;
                                                }
                                            }
                                        }
                                    } else if (xnVar.e != null) {
                                        long fromChatId = messageObject5.getFromChatId();
                                        z33 = fromChatId == messageObject2.getFromChatId();
                                        if (!z14) {
                                            if (z33) {
                                                if (fromChatId < 0) {
                                                    if (xnVar.e.megagroup) {
                                                    }
                                                }
                                            }
                                        }
                                        if (DialogObject.getPeerDialogId(messageObject5.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    } else {
                                        if (UserObject.isUserSelf(xnVar.f) || UserObject.isReplyUser(xnVar.f)) {
                                            if (!messageObject2.isPrivateForward()) {
                                                if (!messageObject5.isPrivateForward()) {
                                                }
                                            }
                                        } else if (xnVar.O3 == 7) {
                                        }
                                        if (DialogObject.getPeerDialogId(messageObject5.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    }
                                }
                                z33 = false;
                                if (DialogObject.getPeerDialogId(messageObject5.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                }
                            } else {
                                z14 = z12;
                                z15 = z29;
                            }
                            z13 = z33;
                        } else {
                            z14 = z12;
                            z15 = z29;
                            arrayList2 = arrayList;
                            i16 = i15;
                        }
                        i17 = i16 - this.G;
                        if (i17 >= 0 && i17 < arrayList2.size()) {
                            messageObject = (MessageObject) arrayList2.get(i16 - this.G);
                            if (messageObject != null && messageObject.isDateObject) {
                                int i30 = i16 + 1;
                                int i31 = i30 - this.G;
                                messageObject = (i31 >= 0 || i31 >= arrayList2.size()) ? null : (MessageObject) arrayList2.get(i30 - this.G);
                            }
                            if (messageObject != null && messageObject.getTopicId() == messageObject2.getTopicId()) {
                                z16 = z15;
                                z17 = false;
                                i18 = this.G;
                                if (i10 == i18) {
                                    z18 = z14;
                                    z19 = true;
                                } else {
                                    z18 = z14;
                                    z19 = false;
                                }
                                if (j11 == m1Var.f) {
                                    MessageObject messageObject6 = (MessageObject) arrayList2.get(i16 - i18);
                                    boolean z34 = !(messageObject6.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && messageObject6.isOutOwner() == messageObject2.isOutOwner() && (Math.abs(messageObject6.messageOwner.date - messageObject2.messageOwner.date) <= 300 || xnVar.O3 == 9);
                                    if (!z34) {
                                        z20 = z18;
                                        z21 = z34;
                                    } else if (messageObject2.isImportedForward() || messageObject6.isImportedForward()) {
                                        z20 = z18;
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
                                                z21 = str6.equals(str2);
                                                if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                                    z21 = false;
                                                }
                                            }
                                        }
                                        z21 = false;
                                        if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    } else if (xnVar.e != null) {
                                        long fromChatId2 = messageObject6.getFromChatId();
                                        boolean z35 = (fromChatId2 != messageObject2.getFromChatId() || messageObject2.isImportedForward() || messageObject6.isImportedForward()) ? false : true;
                                        if (!z16 && z35 && fromChatId2 < 0 && xnVar.e.megagroup && xnVar.O3 != 9) {
                                            z35 = false;
                                        }
                                        if (z35 && xnVar.v9()) {
                                            TLRPC.TL_forumTopic tL_forumTopic = messageObject2.replyToForumTopic;
                                            if (tL_forumTopic == null) {
                                                z27 = true;
                                                j12 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.p2) xnVar).currentAccount, messageObject2.messageOwner, true);
                                            } else {
                                                z27 = true;
                                                j12 = tL_forumTopic.id;
                                            }
                                            TLRPC.TL_forumTopic tL_forumTopic2 = messageObject6.replyToForumTopic;
                                            if (tL_forumTopic2 == null) {
                                                z20 = z18;
                                                j13 = j12;
                                                j14 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.p2) xnVar).currentAccount, messageObject6.messageOwner, z27);
                                            } else {
                                                z20 = z18;
                                                j13 = j12;
                                                j14 = tL_forumTopic2.id;
                                            }
                                        } else {
                                            z20 = z18;
                                        }
                                        z21 = z35;
                                        if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    } else {
                                        z20 = z18;
                                        if (UserObject.isUserSelf(xnVar.f) || UserObject.isReplyUser(xnVar.f)) {
                                            if (!messageObject2.isPrivateForward()) {
                                                if (!messageObject6.isPrivateForward()) {
                                                }
                                            }
                                            z21 = false;
                                        } else if (xnVar.O3 != 7) {
                                            z21 = z34;
                                        }
                                        if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    }
                                } else {
                                    z20 = z18;
                                    z21 = z32;
                                }
                                if (ChatObject.isChannel(xnVar.e) && xnVar.e.megagroup && messageObject2.getFromChatId() <= 0 && (messageFwdHeader = messageObject2.messageOwner.fwd_from) != null && (messageFwdHeader.saved_from_peer instanceof TLRPC.TL_peerChannel)) {
                                    if (!z16) {
                                        z21 = false;
                                    }
                                    if (!z20) {
                                        z13 = false;
                                    }
                                }
                                if (!z16 && (message = messageObject2.messageOwner) != null && message.paid_message_stars > 0) {
                                    z21 = false;
                                }
                                boolean z36 = false;
                                messageObject2.updateTranslation(false);
                                if (X8 != null) {
                                    int i32 = 0;
                                    while (i32 < X8.messages.size()) {
                                        X8.messages.get(i32).updateTranslation(z36);
                                        i32++;
                                        z36 = false;
                                    }
                                }
                                if (!xnVar.Ma) {
                                    z22 = z21;
                                    z23 = z13;
                                } else {
                                    if (X8 != null) {
                                        z24 = true;
                                        z23 = false;
                                        z22 = false;
                                        t1Var.setShowTopic(z24);
                                        t1Var.X3(messageObject2, X8, z23, z22, z17, z19);
                                        t1Var.setSpoilersSuppressed(xnVar.u0.getScrollState() == 0);
                                        t1Var.setHighlighted(xnVar.I7 == Integer.MAX_VALUE && messageObject2.getId() == xnVar.I7);
                                        z25 = t1Var.c8;
                                        if (!z25 && xnVar.M7 != null) {
                                            long currentTimeMillis = System.currentTimeMillis();
                                            t1Var.T3(xnVar.M7, true, xnVar.K7 || currentTimeMillis - xnVar.L7 < 200, xnVar.P7);
                                            if (xnVar.K7) {
                                                xnVar.L7 = currentTimeMillis;
                                            }
                                            xnVar.K7 = false;
                                        } else if (!z25 && (num = xnVar.N7) != null) {
                                            t1Var.R3(num.intValue());
                                        } else if (!z25 && (bArr = xnVar.O7) != null) {
                                            t1Var.P3(bArr);
                                        } else if (xnVar.O3 == 7 && xnVar.r3 != null && (str = xnVar.q3) != null) {
                                            t1Var.S3(str);
                                        }
                                        if (xnVar.I7 != Integer.MAX_VALUE) {
                                            xnVar.Zb();
                                        }
                                        indexOf = arrayList3.indexOf(messageObject2);
                                        if (indexOf != -1) {
                                            if (messageObject2.type == 5 && (dlVar = xnVar.Y2) != null && dlVar.getTextureView() != null) {
                                                le leVar = xnVar.n7;
                                                if (leVar != null) {
                                                    AndroidUtilities.cancelRunOnUIThread(leVar);
                                                    xnVar.n7 = null;
                                                }
                                                t1Var.getViewTreeObserver().addOnPreDrawListener(new ih.f(1, this, t1Var));
                                            } else if ((messageObject2.isAnyKindOfSticker() && !messageObject2.isAnimatedEmojiStickers()) || ((sendAnimationData = messageObject2.sendAnimationData) != null && sendAnimationData.fromPreview)) {
                                                if (!messageObject2.sendAnimationData.fromPreview || (jkVar = xnVar.V) == null || jkVar.I0 == null) {
                                                    t1Var.getViewTreeObserver().addOnPreDrawListener(new im(this, t1Var));
                                                } else {
                                                    if (((org.telegram.ui.ActionBar.p2) xnVar).actionBar.getVisibility() == 0) {
                                                        int measuredHeight = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar.getMeasuredHeight() + ((int) ((org.telegram.ui.ActionBar.p2) xnVar).actionBar.getTranslationY());
                                                        vk vkVar = xnVar.l1;
                                                        int currentHeight = measuredHeight + (vkVar != null ? vkVar.getCurrentHeight() : 0);
                                                        hk hkVar = xnVar.m1;
                                                        i19 = (((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode ? AndroidUtilities.statusBarHeight : 0) + currentHeight + (hkVar != null ? hkVar.getCurrentHeight() : 0);
                                                    } else {
                                                        i19 = 0;
                                                    }
                                                    float f10 = i19 + xnVar.q9;
                                                    float height = xnVar.fragmentView == null ? 0.0f : r9.getHeight();
                                                    org.telegram.ui.Components.cf cfVar = xnVar.V.I0;
                                                    Rect rect = cfVar.r0;
                                                    if (!cfVar.n0) {
                                                        cfVar.s = true;
                                                        cfVar.n0 = true;
                                                        gi0 gi0Var = cfVar.U;
                                                        if (gi0Var != null) {
                                                            gi0Var.invalidate();
                                                        }
                                                        org.telegram.ui.Components.lg lgVar = cfVar.T;
                                                        if (lgVar != null) {
                                                            lgVar.invalidate();
                                                        }
                                                        if (cfVar.N != null) {
                                                            cfVar.o0 = t1Var;
                                                            t1Var.setVisibility(4);
                                                            cfVar.p0 = f10;
                                                            cfVar.q0 = height;
                                                            org.telegram.ui.Cells.t1 t1Var2 = cfVar.N;
                                                            org.telegram.ui.Cells.t1 t1Var3 = cfVar.o0;
                                                            t1Var2.K7 = t1Var3.K7;
                                                            t1Var2.T7 = t1Var3.T7;
                                                            t1Var2.M7 = t1Var3.M7;
                                                            t1Var2.O7 = t1Var3.O7;
                                                            t1Var2.Q7 = t1Var3.Q7;
                                                            t1Var2.S7 = t1Var3.S7;
                                                            t1Var2.X3(t1Var.getMessageObject(), null, t1Var.m3(), t1Var.n3(), t1Var.h3(), false);
                                                            org.telegram.ui.Cells.s1 transitionParams = cfVar.N.getTransitionParams();
                                                            transitionParams.g = cfVar.N.getTransitionParams().f();
                                                            Rect rect2 = transitionParams.D0;
                                                            transitionParams.K1 = 0.0f;
                                                            if (cfVar.N.getTransitionParams().D0.left == cfVar.N.getBackgroundDrawableLeft() && rect2.top == cfVar.N.getBackgroundDrawableTop() && rect2.bottom == cfVar.N.getBackgroundDrawableBottom()) {
                                                                i20 = 1;
                                                            } else {
                                                                rect.bottom = -(cfVar.N.getBackgroundDrawableBottom() - rect2.bottom);
                                                                rect.top = -(cfVar.N.getBackgroundDrawableTop() - rect2.top);
                                                                if (t1Var.getMessageObject().isOutOwner()) {
                                                                    rect.left = -(cfVar.N.getBackgroundDrawableLeft() - rect2.left);
                                                                    rect.right = 0;
                                                                } else {
                                                                    rect.left = 0;
                                                                    rect.right = cfVar.N.getBackgroundDrawableRight() - rect2.right;
                                                                }
                                                                i20 = 1;
                                                                transitionParams.w0 = true;
                                                            }
                                                            int i33 = cfVar.N.Vd;
                                                        } else {
                                                            i20 = 1;
                                                        }
                                                        cfVar.e(new yh0(cfVar, i20), false);
                                                        cfVar.C.invalidate();
                                                        cfVar.c();
                                                    }
                                                    xnVar.V.I0 = null;
                                                }
                                            }
                                            arrayList3.remove(indexOf);
                                            jk jkVar2 = xnVar.V;
                                            Runnable runnable = jkVar2.c0;
                                            if (runnable != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable);
                                                z26 = true;
                                                jkVar2.d0 = true;
                                                jkVar2.c0.run();
                                                jkVar2.c0 = null;
                                            } else {
                                                z26 = true;
                                            }
                                            xnVar.V.q0(z26);
                                        }
                                        if (!hashMap.isEmpty() && hashMap.containsKey(messageObject2.getDocument())) {
                                            hashMap.remove(messageObject2.getDocument());
                                            sjVar = xnVar.v0;
                                            if (sjVar != null) {
                                                org.telegram.ui.Components.ho hoVar = xnVar.P0;
                                                sjVar.O = m1Var;
                                                sjVar.P = hoVar;
                                                r10 = 0;
                                                sjVar.N = false;
                                                if (t1Var.cd) {
                                                    t1Var.cd = r10;
                                                    t1Var.setVisibility(r10);
                                                }
                                                xnVar.ub(t1Var);
                                            }
                                        }
                                        r10 = 0;
                                        if (t1Var.cd) {
                                        }
                                        xnVar.ub(t1Var);
                                    }
                                    z23 = z21;
                                    z22 = z13;
                                }
                                z24 = true;
                                t1Var.setShowTopic(z24);
                                t1Var.X3(messageObject2, X8, z23, z22, z17, z19);
                                t1Var.setSpoilersSuppressed(xnVar.u0.getScrollState() == 0);
                                t1Var.setHighlighted(xnVar.I7 == Integer.MAX_VALUE && messageObject2.getId() == xnVar.I7);
                                z25 = t1Var.c8;
                                if (!z25) {
                                }
                                if (!z25) {
                                }
                                if (!z25) {
                                }
                                if (xnVar.O3 == 7) {
                                    t1Var.S3(str);
                                }
                                if (xnVar.I7 != Integer.MAX_VALUE) {
                                }
                                indexOf = arrayList3.indexOf(messageObject2);
                                if (indexOf != -1) {
                                }
                                if (!hashMap.isEmpty()) {
                                    hashMap.remove(messageObject2.getDocument());
                                    sjVar = xnVar.v0;
                                    if (sjVar != null) {
                                    }
                                }
                                r10 = 0;
                                if (t1Var.cd) {
                                }
                                xnVar.ub(t1Var);
                            }
                        }
                        z16 = z15;
                        z17 = true;
                        i18 = this.G;
                        if (i10 == i18) {
                        }
                        if (j11 == m1Var.f) {
                        }
                        if (ChatObject.isChannel(xnVar.e)) {
                            if (!z16) {
                            }
                            if (!z20) {
                            }
                        }
                        if (!z16) {
                            z21 = false;
                        }
                        boolean z362 = false;
                        messageObject2.updateTranslation(false);
                        if (X8 != null) {
                        }
                        if (!xnVar.Ma) {
                        }
                        z24 = true;
                        t1Var.setShowTopic(z24);
                        t1Var.X3(messageObject2, X8, z23, z22, z17, z19);
                        t1Var.setSpoilersSuppressed(xnVar.u0.getScrollState() == 0);
                        t1Var.setHighlighted(xnVar.I7 == Integer.MAX_VALUE && messageObject2.getId() == xnVar.I7);
                        z25 = t1Var.c8;
                        if (!z25) {
                        }
                        if (!z25) {
                        }
                        if (!z25) {
                        }
                        if (xnVar.O3 == 7) {
                        }
                        if (xnVar.I7 != Integer.MAX_VALUE) {
                        }
                        indexOf = arrayList3.indexOf(messageObject2);
                        if (indexOf != -1) {
                        }
                        if (!hashMap.isEmpty()) {
                        }
                        r10 = 0;
                        if (t1Var.cd) {
                        }
                        xnVar.ub(t1Var);
                    }
                    z11 = false;
                    i15 = -100;
                    i14 = -100;
                } else {
                    i14 = i10 - 1;
                    i15 = i10 + 1;
                    z11 = false;
                }
                z12 = false;
                z29 = false;
                z13 = false;
                int j162 = j(i14);
                boolean z322 = z11;
                j11 = j(i15);
                j(i28);
                if (messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                }
                z14 = z12;
                z15 = z29;
                arrayList2 = arrayList;
                i16 = i15;
                i17 = i16 - this.G;
                if (i17 >= 0) {
                    messageObject = (MessageObject) arrayList2.get(i16 - this.G);
                    if (messageObject != null) {
                        int i302 = i16 + 1;
                        int i312 = i302 - this.G;
                        if (i312 >= 0) {
                        }
                    }
                    if (messageObject != null) {
                        z16 = z15;
                        z17 = false;
                        i18 = this.G;
                        if (i10 == i18) {
                        }
                        if (j11 == m1Var.f) {
                        }
                        if (ChatObject.isChannel(xnVar.e)) {
                        }
                        if (!z16) {
                        }
                        boolean z3622 = false;
                        messageObject2.updateTranslation(false);
                        if (X8 != null) {
                        }
                        if (!xnVar.Ma) {
                        }
                        z24 = true;
                        t1Var.setShowTopic(z24);
                        t1Var.X3(messageObject2, X8, z23, z22, z17, z19);
                        t1Var.setSpoilersSuppressed(xnVar.u0.getScrollState() == 0);
                        t1Var.setHighlighted(xnVar.I7 == Integer.MAX_VALUE && messageObject2.getId() == xnVar.I7);
                        z25 = t1Var.c8;
                        if (!z25) {
                        }
                        if (!z25) {
                        }
                        if (!z25) {
                        }
                        if (xnVar.O3 == 7) {
                        }
                        if (xnVar.I7 != Integer.MAX_VALUE) {
                        }
                        indexOf = arrayList3.indexOf(messageObject2);
                        if (indexOf != -1) {
                        }
                        if (!hashMap.isEmpty()) {
                        }
                        r10 = 0;
                        if (t1Var.cd) {
                        }
                        xnVar.ub(t1Var);
                    }
                }
                z16 = z15;
                z17 = true;
                i18 = this.G;
                if (i10 == i18) {
                }
                if (j11 == m1Var.f) {
                }
                if (ChatObject.isChannel(xnVar.e)) {
                }
                if (!z16) {
                }
                boolean z36222 = false;
                messageObject2.updateTranslation(false);
                if (X8 != null) {
                }
                if (!xnVar.Ma) {
                }
                z24 = true;
                t1Var.setShowTopic(z24);
                t1Var.X3(messageObject2, X8, z23, z22, z17, z19);
                t1Var.setSpoilersSuppressed(xnVar.u0.getScrollState() == 0);
                t1Var.setHighlighted(xnVar.I7 == Integer.MAX_VALUE && messageObject2.getId() == xnVar.I7);
                z25 = t1Var.c8;
                if (!z25) {
                }
                if (!z25) {
                }
                if (!z25) {
                }
                if (xnVar.O3 == 7) {
                }
                if (xnVar.I7 != Integer.MAX_VALUE) {
                }
                indexOf = arrayList3.indexOf(messageObject2);
                if (indexOf != -1) {
                }
                if (!hashMap.isEmpty()) {
                }
                r10 = 0;
                if (t1Var.cd) {
                }
                xnVar.ub(t1Var);
            }
        }
        z10 = false;
        t1Var.U7 = z10;
        t1Var.V7 = xnVar.O3 != 0 && (xnVar.G4.containsKey(Integer.valueOf(messageObject2.getId())) || !(X8 == null || X8.messages.isEmpty() || !xnVar.G4.containsKey(Integer.valueOf(X8.messages.get(0).getId()))));
        i13 = xnVar.O3;
        if (i13 != 1) {
        }
        arrayList = arrayList4;
        j10 = 0;
        t1Var.Y7 = j10;
        if (i13 == 7) {
        }
        t1Var.Z7 = UserObject.isReplyUser(xnVar.f);
        t1Var.a8 = xnVar.O3 != 2;
        t1Var.B8 = xnVar.t9();
        t1Var.C8 = xnVar.C9();
        t1Var.D8 = xnVar.B9();
        t1Var.E8 = xnVar.Q8();
        t1Var.F8 = xnVar.R8();
        if (messageObject2.isSponsored()) {
        }
        int i282 = i10 + 2;
        if (X8 == null) {
        }
        z12 = false;
        z29 = false;
        z13 = false;
        int j1622 = j(i14);
        boolean z3222 = z11;
        j11 = j(i15);
        j(i282);
        if (messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
        }
        z14 = z12;
        z15 = z29;
        arrayList2 = arrayList;
        i16 = i15;
        i17 = i16 - this.G;
        if (i17 >= 0) {
        }
        z16 = z15;
        z17 = true;
        i18 = this.G;
        if (i10 == i18) {
        }
        if (j11 == m1Var.f) {
        }
        if (ChatObject.isChannel(xnVar.e)) {
        }
        if (!z16) {
        }
        boolean z362222 = false;
        messageObject2.updateTranslation(false);
        if (X8 != null) {
        }
        if (!xnVar.Ma) {
        }
        z24 = true;
        t1Var.setShowTopic(z24);
        t1Var.X3(messageObject2, X8, z23, z22, z17, z19);
        t1Var.setSpoilersSuppressed(xnVar.u0.getScrollState() == 0);
        t1Var.setHighlighted(xnVar.I7 == Integer.MAX_VALUE && messageObject2.getId() == xnVar.I7);
        z25 = t1Var.c8;
        if (!z25) {
        }
        if (!z25) {
        }
        if (!z25) {
        }
        if (xnVar.O3 == 7) {
        }
        if (xnVar.I7 != Integer.MAX_VALUE) {
        }
        indexOf = arrayList3.indexOf(messageObject2);
        if (indexOf != -1) {
        }
        if (!hashMap.isEmpty()) {
        }
        r10 = 0;
        if (t1Var.cd) {
        }
        xnVar.ub(t1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [org.telegram.ui.dm] */
    /* JADX WARN: Type inference failed for: r8v11, types: [org.telegram.ui.Cells.v0] */
    /* JADX WARN: Type inference failed for: r8v12, types: [org.telegram.ui.Cells.xa] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Cells.y0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [org.telegram.ui.Cells.h0, org.telegram.ui.cm] */
    /* JADX WARN: Type inference failed for: r8v16, types: [org.telegram.ui.Cells.v1] */
    /* JADX WARN: Type inference failed for: r8v9, types: [org.telegram.ui.Cells.u1] */
    /* JADX WARN: Type inference failed for: r9v12, types: [org.telegram.ui.Cells.v0] */
    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Cells.t1 t1Var2;
        xn xnVar = this.N;
        if (i10 == 0) {
            t1Var = new org.telegram.ui.Cells.t1(this.h, ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount, true, xnVar.ya, xnVar.ba);
            t1Var.setResourcesProvider(xnVar.ba);
            if (xnVar.mc == null) {
                xnVar.mc = new jn(xnVar);
            }
            t1Var.setDelegate(xnVar.mc);
            t1Var.Md = xnVar.Mb;
            if (xnVar.h == null) {
                t1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? zlVar = new zl(context, xnVar.ba, true);
                zlVar.setInvalidateColors(true);
                zlVar.setDelegate(new bm(this));
                t1Var = zlVar;
            } else {
                if (i10 == 2) {
                    t1Var2 = new org.telegram.ui.Cells.v1(context, xnVar.ba);
                } else if (i10 == 3) {
                    ?? cmVar = new cm(this, context, ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount, xnVar.ba);
                    cmVar.setDelegate(new a1(this, 20));
                    t1Var2 = cmVar;
                } else if (i10 == 4) {
                    t1Var2 = new org.telegram.ui.Cells.y0(context, xnVar.ba);
                } else if (i10 == 6) {
                    t1Var2 = new org.telegram.ui.Cells.xa(context, ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount, xnVar.ba);
                } else if (i10 == 7) {
                    t1Var2 = new org.telegram.ui.Cells.v0(context, xnVar.ba, false);
                } else if (i10 == 8) {
                    t1Var2 = new dm(this, context, ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount, xnVar.ba);
                } else if (i10 == 10) {
                    ?? u1Var = new org.telegram.ui.Cells.u1(context, xnVar.ba);
                    if (xnVar.mc == null) {
                        xnVar.mc = new jn(xnVar);
                    }
                    u1Var.setDelegate(xnVar.mc);
                    t1Var2 = u1Var;
                } else {
                    t1Var = null;
                }
                t1Var = t1Var2;
            }
        }
        return yh.o(t1Var, t1Var, -1, -2);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        TLRPC.Message message;
        boolean z4;
        boolean z10;
        byte[] bArr;
        Integer num;
        String str;
        String stickerEmoji;
        MessagesController.EmojiSound emojiSound;
        View view = m1Var.a;
        boolean z11 = view instanceof org.telegram.ui.Cells.t1;
        xn xnVar = this.N;
        if (z11 || (view instanceof org.telegram.ui.Cells.v0)) {
            xnVar.r9();
        }
        boolean z12 = view instanceof org.telegram.ui.Cells.t1;
        if (z12) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            MessageObject messageObject = t1Var.getMessageObject();
            t1Var.B8 = xnVar.t9();
            t1Var.C8 = xnVar.C9();
            t1Var.D8 = xnVar.B9();
            t1Var.E8 = xnVar.Q8();
            t1Var.F8 = xnVar.R8();
            t1Var.g4(-1, true, false);
            MessageObject messageObject2 = xnVar.D3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                t1Var.g4(xnVar.E3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = xnVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                xnVar.getMediaController().playEmojiSound(xnVar.getAccountInstance(), stickerEmoji, emojiSound, true);
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
            if (((org.telegram.ui.ActionBar.p2) xnVar).actionBar.s() || xnVar.A9()) {
                xnVar.K7 = false;
                xnVar.L7 = 0L;
                xnVar.M7 = null;
                ArrayList arrayList = xnVar.X3;
                t1Var.J3(arrayList == null || !arrayList.contains(messageObject), false);
                int i11 = messageObject.getDialogId() == xnVar.Q5 ? 0 : 1;
                if (xnVar.T5[i11].indexOfKey(messageObject.getId()) >= 0) {
                    xnVar.hb(messageObject, t1Var, i11, false);
                    z4 = true;
                } else {
                    t1Var.setDrawSelectionBackground(false);
                    t1Var.L3(false, false, false);
                    z4 = false;
                }
                z10 = true;
            } else {
                t1Var.setDrawSelectionBackground(false);
                t1Var.L3(false, false, false);
                t1Var.J3(false, false);
                z4 = false;
                z10 = false;
            }
            t1Var.K3(!z10, z10 && z4);
            if (xnVar.O3 != 7 || xnVar.r3 == null || (str = xnVar.q3) == null) {
                nk nkVar = xnVar.O2;
                if (nkVar != null && nkVar.getVisibility() == 0) {
                    if (xnVar.getMediaDataController().isMessageFound(messageObject.getId(), messageObject.getDialogId() == xnVar.I6) && xnVar.getMediaDataController().getLastSearchQuery() != null) {
                        t1Var.S3(xnVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                t1Var.S3(null);
            } else {
                t1Var.S3(str);
            }
            if (!((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode || !t1Var.c8) {
                t1Var.setHighlighted(xnVar.I7 != Integer.MAX_VALUE && ((t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == xnVar.I7) || (t1Var.getCurrentMessagesGroup() != null && t1Var.getCurrentMessagesGroup().contains(xnVar.I7))));
                boolean z13 = t1Var.c8;
                if (z13 && xnVar.M7 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!t1Var.T3(xnVar.M7, true, xnVar.K7 || currentTimeMillis - xnVar.L7 < 200, xnVar.P7) && xnVar.J7) {
                        org.telegram.ui.Components.qc.a0(xnVar).Q(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    xnVar.J7 = false;
                    if (xnVar.K7) {
                        xnVar.L7 = currentTimeMillis;
                    }
                    xnVar.K7 = false;
                } else if (z13 && (num = xnVar.N7) != null) {
                    t1Var.R3(num.intValue());
                } else if (z13 && (bArr = xnVar.O7) != null) {
                    t1Var.P3(bArr);
                }
                if (xnVar.I7 != Integer.MAX_VALUE) {
                    xnVar.Zb();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            v0Var.b0 = xnVar.t9();
            v0Var.f0 = xnVar.C9();
            xnVar.B9();
            xnVar.Q8();
            v0Var.g0 = xnVar.R8();
        } else if (view instanceof org.telegram.ui.Cells.v1) {
            ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(xnVar.R8() / 2.0f);
        }
        int b10 = m1Var.b();
        int i12 = this.G;
        if (b10 < i12 || b10 >= this.H) {
            return;
        }
        MessageObject messageObject3 = (MessageObject) (this.I ? this.J : this.K ? this.M : xnVar.r6).get(b10 - i12);
        if (messageObject3 == null || (message = messageObject3.messageOwner) == null || !message.media_unread || !message.mentioned) {
            return;
        }
        if (!((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode && xnVar.O3 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
            int i13 = xnVar.i6 - 1;
            xnVar.i6 = i13;
            if (i13 <= 0) {
                xnVar.i6 = 0;
                xnVar.j6 = true;
                xnVar.Kb(false);
            } else {
                xnVar.g1.c(2, i13, true);
            }
            xnVar.getMessagesController().markMentionMessageAsRead(messageObject3.getId(), ChatObject.isChannel(xnVar.e) ? xnVar.e.id : 0L, xnVar.Q5);
            messageObject3.setContentIsRead();
        }
        if (z12) {
            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
            if (((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode) {
                t1Var2.setHighlighted(true);
            } else {
                t1Var2.O3();
            }
        }
    }
}
