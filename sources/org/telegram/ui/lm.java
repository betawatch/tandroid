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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class lm extends org.telegram.ui.Components.wk0 {
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
    public final /* synthetic */ zn N;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public lm(zn znVar, Context context) {
        this.N = znVar;
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
        TLRPC.User user = znVar.f;
        this.n = user != null && user.bot;
        C(true);
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    public final void K(boolean z4) {
        zn znVar = this.N;
        if (UserObject.isBotForum(znVar.f)) {
            if (z4) {
                znVar.kc = true;
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
        zn znVar = this.N;
        int childCount = znVar.u0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = znVar.u0.getChildAt(i10);
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
        zn znVar = this.N;
        return UserObject.isBotForumWithEditableTopics(znVar.f) && znVar.d() == 0 && !znVar.kc && znVar.O3 == 0;
    }

    public final void O(boolean z4) {
        boolean z10;
        zn znVar = this.N;
        ArrayList arrayList = znVar.r6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + znVar.L5);
        }
        if (z4 && znVar.L5) {
            f2.t0 itemAnimator = znVar.u0.getItemAnimator();
            uj ujVar = znVar.v0;
            if (itemAnimator != ujVar) {
                znVar.u0.setItemAnimator(ujVar);
            }
        } else {
            znVar.u0.setItemAnimator(null);
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
                        z10 = true;
                    }
                }
            }
        }
        z10 = false;
        boolean[] zArr = znVar.z6;
        if ((zArr[0] && (znVar.I6 == 0 || zArr[1])) || z10) {
            znVar.L6(((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow);
        }
    }

    public final void P(int i10, boolean z4) {
        MessageObject messageObject;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder("notify item removed ");
            sb.append(i10);
            ai.v(z4 ? " with thanos effect" : "", sb);
        }
        zn znVar = this.N;
        if (((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow) {
            f2.t0 itemAnimator = znVar.u0.getItemAnimator();
            uj ujVar = znVar.v0;
            if (itemAnimator != ujVar) {
                znVar.u0.setItemAnimator(ujVar);
            }
        } else {
            znVar.u0.setItemAnimator(null);
        }
        if (z4 && znVar.v0 != null) {
            f2.t0 itemAnimator2 = znVar.u0.getItemAnimator();
            uj ujVar2 = znVar.v0;
            if (itemAnimator2 == ujVar2) {
                f2.l1 K = znVar.u0.K(i10);
                if (K == null) {
                    ujVar2.getClass();
                } else {
                    ujVar2.S.add(K);
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void Q(int i10) {
        int i11;
        zn znVar = this.N;
        ArrayList arrayList = znVar.r6;
        if (znVar.w0 == null || this.I || this.K) {
            return;
        }
        int i12 = 0;
        if (!znVar.A4 && znVar.G7 != null) {
            int childCount = znVar.u0.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                View childAt = znVar.u0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                    MessageObject messageObject2 = znVar.G7;
                    if (messageObject == messageObject2) {
                        if (arrayList.indexOf(messageObject2) >= 0) {
                            i11 = arrayList.indexOf(znVar.G7) + this.G;
                            i12 = znVar.L8(childAt);
                        }
                    }
                }
                i13++;
            }
        }
        i11 = -1;
        m(i10);
        if (i11 != -1) {
            znVar.w0.h1(i11, i12);
        }
    }

    public final org.telegram.ui.Cells.s1 R(MessageObject messageObject, boolean z4, boolean z10) {
        zn znVar = this.N;
        if (z4) {
            int childCount = znVar.u0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = znVar.u0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.getMessageObject() == messageObject && TextUtils.equals(s1Var.c7, s1Var.v7.messageOwner.post_author)) {
                        s1Var.X3(messageObject, s1Var.getCurrentMessagesGroup(), s1Var.m3(), s1Var.n3(), s1Var.h3(), s1Var.j3());
                        return s1Var;
                    }
                }
                i10++;
                messageObject = messageObject;
            }
        }
        MessageObject messageObject2 = messageObject;
        int indexOf = (this.I ? this.J : this.K ? this.M : znVar.r6).indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (!z10) {
            Q(this.G + indexOf);
            return null;
        }
        int i11 = zn.Gc;
        zn.Gc = i11 + 1;
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
        zn znVar = this.N;
        boolean[] zArr = znVar.z6;
        this.r = 0;
        ArrayList arrayList = this.I ? this.J : this.K ? this.M : znVar.r6;
        if (znVar.O3 == 3 && znVar.La) {
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
            TLRPC.User user4 = znVar.f;
            if (user4 != null && !UserObject.isBot(user4) && !UserObject.isReplyUser(znVar.f)) {
                TLRPC.PeerSettings peerSettings3 = znVar.getMessagesController().getPeerSettings(znVar.f.id);
                int i14 = org.telegram.ui.Cells.wa.L;
                if (peerSettings3 != null && ((peerSettings3.phone_country != null || peerSettings3.registration_month != null) && !MessagesController.isSupportUser(znVar.f) && znVar.O3 == 0)) {
                    int i15 = this.r;
                    this.r = i15 + 1;
                    this.y = i15;
                    return;
                }
            }
            if (UserObject.isReplyUser(znVar.f) || ((user = znVar.f) != null && user.bot && !MessagesController.isSupportUser(user) && znVar.O3 == 0)) {
                int i16 = this.r;
                this.r = i16 + 1;
                this.w = i16;
                return;
            }
            return;
        }
        if (!this.K) {
            boolean[] zArr2 = znVar.B6;
            if ((!zArr2[0] || (znVar.I6 != 0 && !zArr2[1])) && !znVar.C6) {
                int i17 = this.r;
                this.r = i17 + 1;
                this.C = i17;
                int i18 = this.r;
                this.G = i18;
                int size = arrayList.size() + i18;
                this.r = size;
                this.H = size;
                user2 = znVar.f;
                if (user2 != null && !UserObject.isBot(user2) && !UserObject.isReplyUser(znVar.f)) {
                    peerSettings = znVar.getMessagesController().getPeerSettings(znVar.f.id);
                    int i19 = org.telegram.ui.Cells.wa.L;
                    if (peerSettings != null && ((peerSettings.phone_country != null || peerSettings.registration_month != null) && !MessagesController.isSupportUser(znVar.f) && znVar.O3 == 0 && zArr[0])) {
                        peerSettings2 = znVar.getMessagesController().getPeerSettings(znVar.f.id);
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
                        i10 = znVar.O3;
                        if (i10 == 9) {
                            int i25 = this.r;
                            this.s = i25;
                            this.r = i25 + 2;
                            this.v = i25 + 1;
                        }
                        if (i10 == 5 && !uf.p1.g(znVar.N3)) {
                            int i26 = this.r;
                            this.r = i26 + 1;
                            this.s = i26;
                        }
                        if (this.K ? !(!(zArr[0] && (znVar.I6 == 0 || zArr[1])) && (AndroidUtilities.isTablet() || znVar.d4 || znVar.f != null)) : this.L) {
                            this.B = -5;
                            return;
                        }
                        int i27 = this.r;
                        this.r = i27 + 1;
                        this.B = i27;
                        return;
                    }
                }
                if ((!UserObject.isReplyUser(znVar.f) || ((user3 = znVar.f) != null && user3.bot && !MessagesController.isSupportUser(user3) && znVar.O3 == 0)) && zArr[0]) {
                    int i28 = this.r;
                    this.r = i28 + 1;
                    this.w = i28;
                }
                i10 = znVar.O3;
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
        user2 = znVar.f;
        if (user2 != null) {
            peerSettings = znVar.getMessagesController().getPeerSettings(znVar.f.id);
            int i192 = org.telegram.ui.Cells.wa.L;
            if (peerSettings != null) {
                peerSettings2 = znVar.getMessagesController().getPeerSettings(znVar.f.id);
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
                i10 = znVar.O3;
                if (i10 == 9) {
                }
                if (i10 == 5) {
                }
                if (this.K) {
                }
            }
        }
        if (!UserObject.isReplyUser(znVar.f)) {
        }
        int i282 = this.r;
        this.r = i282 + 1;
        this.w = i282;
        i10 = znVar.O3;
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

    @Override // f2.o0
    public final int h() {
        this.x = -5;
        zn znVar = this.N;
        a0.h hVar = znVar.a8;
        if (znVar.J5.get(znVar.a4, 0) == 0) {
            return this.r;
        }
        TLRPC.User user = znVar.f;
        if (user == null || !user.bot || znVar.O3 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(znVar.f.id)).description == null && ((TL_bots.BotInfo) hVar.f(znVar.f.id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(znVar.f.id)).description_document == null)) && !UserObject.isReplyUser(znVar.f) && !UserObject.isBotForum(znVar.f))) {
            return 0;
        }
        this.x = 0;
        return 1;
    }

    @Override // f2.o0
    public final long i(int i10) {
        zn znVar = this.N;
        if (znVar.J5.get(znVar.a4, 0) != 0 && i10 == this.x) {
            return 1L;
        }
        ArrayList arrayList = this.I ? this.J : this.K ? this.M : znVar.r6;
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

    @Override // f2.o0
    public final int j(int i10) {
        zn znVar = this.N;
        if (znVar.J5.get(znVar.a4, 0) != 0 && i10 == this.x) {
            return 3;
        }
        if (i10 == this.s || i10 == this.v) {
            return 1;
        }
        int i11 = this.G;
        if (i10 >= i11 && i10 < this.H) {
            return ((MessageObject) (this.I ? this.J : this.K ? this.M : znVar.r6).get(i10 - i11)).contentType;
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

    @Override // org.telegram.ui.Components.wk0, f2.o0
    public final void l() {
        O(false);
    }

    @Override // org.telegram.ui.Components.wk0, f2.o0
    public final void m(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item changed " + i10);
        }
        zn znVar = this.N;
        if (!((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow || znVar.K0) {
            znVar.u0.setItemAnimator(null);
        } else {
            f2.t0 itemAnimator = znVar.u0.getItemAnimator();
            uj ujVar = znVar.v0;
            if (itemAnimator != ujVar) {
                znVar.u0.setItemAnimator(ujVar);
            }
        }
        S();
        try {
            super.m(i10);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.wk0, f2.o0
    public final void o(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item inserted " + i10);
        }
        zn znVar = this.N;
        if (((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow) {
            f2.t0 itemAnimator = znVar.u0.getItemAnimator();
            uj ujVar = znVar.v0;
            if (itemAnimator != ujVar) {
                znVar.u0.setItemAnimator(ujVar);
            }
        } else {
            znVar.u0.setItemAnimator(null);
        }
        S();
        try {
            super.o(i10);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // f2.o0
    public final void p(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item moved" + i10 + ":" + i11);
        }
        zn znVar = this.N;
        if (((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow) {
            f2.t0 itemAnimator = znVar.u0.getItemAnimator();
            uj ujVar = znVar.v0;
            if (itemAnimator != ujVar) {
                znVar.u0.setItemAnimator(ujVar);
            }
        } else {
            znVar.u0.setItemAnimator(null);
        }
        S();
        try {
            super.p(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.wk0, f2.o0
    public final void q(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range changed " + i10 + ":" + i11);
        }
        zn znVar = this.N;
        if (((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow) {
            f2.t0 itemAnimator = znVar.u0.getItemAnimator();
            uj ujVar = znVar.v0;
            if (itemAnimator != ujVar) {
                znVar.u0.setItemAnimator(ujVar);
            }
        } else {
            znVar.u0.setItemAnimator(null);
        }
        S();
        try {
            super.q(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.wk0, f2.o0
    public final void s(int i10, int i11) {
        int i12;
        int i13;
        zn znVar = this.N;
        ArrayList arrayList = znVar.r6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        if (((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow) {
            f2.t0 itemAnimator = znVar.u0.getItemAnimator();
            uj ujVar = znVar.v0;
            if (itemAnimator != ujVar) {
                znVar.u0.setItemAnimator(ujVar);
            }
        } else {
            znVar.u0.setItemAnimator(null);
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.G) && i12 < this.H) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.G) - 1);
            if ((znVar.e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (znVar.f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
                m(i10);
            }
        }
        try {
            super.s(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.wk0, f2.o0
    public final void t(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range removed" + i10 + ":" + i11);
        }
        zn znVar = this.N;
        if (((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow) {
            f2.t0 itemAnimator = znVar.u0.getItemAnimator();
            uj ujVar = znVar.v0;
            if (itemAnimator != ujVar) {
                znVar.u0.setItemAnimator(ujVar);
            }
        } else {
            znVar.u0.setItemAnimator(null);
        }
        S();
        try {
            super.t(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.wk0, f2.o0
    public final void u(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item removed " + i10);
        }
        zn znVar = this.N;
        if (((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow) {
            f2.t0 itemAnimator = znVar.u0.getItemAnimator();
            uj ujVar = znVar.v0;
            if (itemAnimator != ujVar) {
                znVar.u0.setItemAnimator(ujVar);
            }
        } else {
            znVar.u0.setItemAnimator(null);
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e) {
            FileLog.e(e);
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
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
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
        uj ujVar;
        MessageObject.SendAnimationData sendAnimationData;
        lk lkVar;
        int i19;
        int i20;
        boolean z26;
        fl flVar;
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
        View view = l1Var.a;
        zn znVar = this.N;
        a0.h hVar = znVar.a8;
        ArrayList arrayList3 = znVar.r4;
        HashMap hashMap = znVar.s4;
        boolean z29 = false;
        if (i10 == this.w || i10 == this.x) {
            org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) view;
            if (UserObject.isReplyUser(znVar.f)) {
                h0Var.b(false, 0L, LocaleController.getString(R.string.RepliesChatInfo), null, null, null);
            } else {
                TLRPC.User user = znVar.f;
                if (user == null || user.id != UserObject.VERIFY) {
                    TL_bots.BotInfo botInfo = hVar.m() != 0 ? (TL_bots.BotInfo) hVar.f(znVar.f.id) : null;
                    boolean z30 = (botInfo == null || (TextUtils.isEmpty(botInfo.description) && botInfo.description_photo == null && botInfo.description_document == null)) && UserObject.isBot(znVar.f) && (userFull = znVar.X7) != null && userFull.bot_manager_id != 0 && znVar.f.bot_can_edit;
                    TLRPC.User user2 = znVar.f;
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
                    h0Var.b(true, j15, str4, tLObject, botInfo, z30 ? DialogObject.getName(((org.telegram.ui.ActionBar.p2) znVar).currentAccount, znVar.X7.bot_manager_id) : null);
                } else {
                    h0Var.b(false, 0L, LocaleController.getString(R.string.VerifyChatInfo), null, null, null);
                }
            }
            zn.b4(znVar, h0Var);
            return;
        }
        if (i10 == this.F) {
            ((org.telegram.ui.Cells.b0) view).setDialogId(znVar.a());
            return;
        }
        if (i10 == this.y) {
            org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
            TLRPC.EncryptedChat encryptedChat = znVar.h;
            long a2 = encryptedChat != null ? encryptedChat.user_id : znVar.a();
            waVar.b(a2, znVar.getMessagesController().getPeerSettings(a2));
            return;
        }
        if (i10 == this.C || i10 == this.B) {
            ((org.telegram.ui.Cells.y0) view).setProgressVisible(znVar.G6 > 1);
            return;
        }
        if (i10 == this.E) {
            if (znVar.getMessagesController().getPeerSettings(znVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.v0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedName, LocaleController.formatRelativeDate(znVar.getConnectionsManager().getCurrentTime() - r1.name_change_date)));
            return;
        }
        if (i10 == this.D) {
            if (znVar.getMessagesController().getPeerSettings(znVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.v0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedPhoto, LocaleController.formatRelativeDate(znVar.getConnectionsManager().getCurrentTime() - r1.photo_change_date)));
            return;
        }
        if (i10 == this.s) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            zn.d4(znVar);
            v0Var.setMessageObject(znVar.F3);
            int i22 = znVar.O3;
            if (i22 == 3) {
                v0Var.setCustomText(LocaleController.getString(R.string.SavedMessagesProfileHint));
            } else if (i22 == 5) {
                v0Var.setCustomText(LocaleController.getString(R.string.BusinessRepliesHint));
            } else if (i22 == 9) {
                v0Var.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint2));
            }
            v0Var.setAlpha(1.0f);
            v0Var.setSpoilersSuppressed(znVar.u0.getScrollState() != 0);
            return;
        }
        if (i10 == this.v) {
            org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) view;
            zn.e4(znVar);
            v0Var2.setMessageObject(znVar.G3);
            v0Var2.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint));
            v0Var2.setAlpha(1.0f);
            v0Var2.setSpoilersSuppressed(znVar.u0.getScrollState() != 0);
            return;
        }
        int i23 = this.G;
        if (i10 < i23 || i10 >= this.H) {
            return;
        }
        ArrayList arrayList4 = this.I ? this.J : this.K ? this.M : znVar.r6;
        MessageObject messageObject2 = (MessageObject) arrayList4.get(i10 - i23);
        if (!(view instanceof org.telegram.ui.Cells.s1)) {
            ArrayList arrayList5 = arrayList4;
            MessageObject messageObject3 = null;
            if (!(view instanceof org.telegram.ui.Cells.v0)) {
                if (view instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.setText(LocaleController.getString(R.string.UnreadMessages));
                    u1Var.getTextView().setTranslationX(znVar.R8() / 2.0f);
                    if (znVar.A7 != 0) {
                        znVar.A7 = 0;
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
                    v0Var3.b0 = znVar.t9();
                    v0Var3.f0 = znVar.C9();
                    znVar.B9();
                    znVar.Q8();
                    v0Var3.g0 = znVar.R8();
                    v0Var3.c0 = ChatObject.isForum(znVar.e);
                    v0Var3.d0 = ChatObject.isMonoForum(znVar.e);
                    v0Var3.e0 = UserObject.isBotForum(znVar.f);
                    boolean z31 = v0Var3.h0 == z4;
                    v0Var3.h0 = z4;
                    v0Var3.U(messageObject2, z31);
                    v0Var3.setAlpha(1.0f);
                    v0Var3.setShowTopic(true);
                    v0Var3.setSpoilersSuppressed(znVar.u0.getScrollState() == 0);
                    return;
                }
            }
            z4 = false;
            org.telegram.ui.Cells.v0 v0Var32 = (org.telegram.ui.Cells.v0) view;
            v0Var32.b0 = znVar.t9();
            v0Var32.f0 = znVar.C9();
            znVar.B9();
            znVar.Q8();
            v0Var32.g0 = znVar.R8();
            v0Var32.c0 = ChatObject.isForum(znVar.e);
            v0Var32.d0 = ChatObject.isMonoForum(znVar.e);
            v0Var32.e0 = UserObject.isBotForum(znVar.f);
            if (v0Var32.h0 == z4) {
            }
            v0Var32.h0 = z4;
            v0Var32.U(messageObject2, z31);
            v0Var32.setAlpha(1.0f);
            v0Var32.setShowTopic(true);
            v0Var32.setSpoilersSuppressed(znVar.u0.getScrollState() == 0);
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
        MessageObject.GroupedMessages X8 = znVar.X8(messageObject2);
        s1Var.K7 = znVar.e != null || UserObject.isUserSelf(znVar.f) || UserObject.isReplyUser(znVar.f) || znVar.O3 == 7;
        s1Var.y.a(false, false);
        s1Var.L7 = UserObject.isBotForum(znVar.f);
        s1Var.X7 = znVar.A9();
        int i26 = znVar.O3;
        s1Var.M7 = i26 == 3;
        s1Var.N7 = i26 == 3 && znVar.La;
        TLRPC.User user3 = znVar.f;
        s1Var.O7 = user3 != null && user3.bot;
        s1Var.P7 = ChatObject.isChannel(znVar.e) && znVar.e.megagroup;
        s1Var.Q7 = ChatObject.isForum(znVar.e);
        s1Var.R7 = ChatObject.isMonoForum(znVar.e);
        s1Var.S7 = ChatObject.isForum(znVar.e) && znVar.e4 && znVar.d() == 1;
        s1Var.T7 = (znVar.a4 != 0 || (s1Var.Q7 && znVar.e4)) && !s1Var.R7;
        int i27 = znVar.O3;
        if (i27 != 1 && i27 != 9 && ChatObject.isChannel(znVar.e)) {
            TLRPC.Chat chat = znVar.e;
            if (chat.has_link && !chat.megagroup) {
                z10 = true;
                s1Var.U7 = z10;
                s1Var.V7 = znVar.O3 != 0 && (znVar.G4.containsKey(Integer.valueOf(messageObject2.getId())) || !(X8 == null || X8.messages.isEmpty() || !znVar.G4.containsKey(Integer.valueOf(X8.messages.get(0).getId()))));
                i13 = znVar.O3;
                if (i13 != 1 || i13 == 9 || (chatFull = znVar.W7) == null) {
                    arrayList = arrayList4;
                    j10 = 0;
                } else {
                    arrayList = arrayList4;
                    j10 = chatFull.linked_chat_id;
                }
                s1Var.Y7 = j10;
                if (i13 == 7 || znVar.L3 != 1) {
                    s1Var.Z7 = UserObject.isReplyUser(znVar.f);
                } else {
                    s1Var.Z7 = UserObject.isReplyUser(messageObject2.getDialogId());
                }
                s1Var.a8 = znVar.O3 != 2;
                s1Var.B8 = znVar.t9();
                s1Var.C8 = znVar.C9();
                s1Var.D8 = znVar.B9();
                s1Var.E8 = znVar.Q8();
                s1Var.F8 = znVar.R8();
                if (messageObject2.isSponsored()) {
                    AndroidUtilities.doOnPreDraw(s1Var, new cg.n0(21));
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
                        if ((messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && j16 == l1Var.f) {
                            arrayList2 = arrayList;
                            MessageObject messageObject5 = (MessageObject) arrayList2.get(i14 - this.G);
                            i16 = i15;
                            boolean z33 = messageObject5.isOutOwner() == messageObject2.isOutOwner() && (Math.abs(messageObject5.messageOwner.date - messageObject2.messageOwner.date) <= 300 || znVar.O3 == 9);
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
                                    } else if (znVar.e != null) {
                                        long fromChatId = messageObject5.getFromChatId();
                                        z33 = fromChatId == messageObject2.getFromChatId();
                                        if (!z14) {
                                            if (z33) {
                                                if (fromChatId < 0) {
                                                    if (znVar.e.megagroup) {
                                                    }
                                                }
                                            }
                                        }
                                        if (DialogObject.getPeerDialogId(messageObject5.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    } else {
                                        if (UserObject.isUserSelf(znVar.f) || UserObject.isReplyUser(znVar.f)) {
                                            if (!messageObject2.isPrivateForward()) {
                                                if (!messageObject5.isPrivateForward()) {
                                                }
                                            }
                                        } else if (znVar.O3 == 7) {
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
                                if (j11 == l1Var.f) {
                                    MessageObject messageObject6 = (MessageObject) arrayList2.get(i16 - i18);
                                    boolean z34 = !(messageObject6.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && messageObject6.isOutOwner() == messageObject2.isOutOwner() && (Math.abs(messageObject6.messageOwner.date - messageObject2.messageOwner.date) <= 300 || znVar.O3 == 9);
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
                                    } else if (znVar.e != null) {
                                        long fromChatId2 = messageObject6.getFromChatId();
                                        boolean z35 = (fromChatId2 != messageObject2.getFromChatId() || messageObject2.isImportedForward() || messageObject6.isImportedForward()) ? false : true;
                                        if (!z16 && z35 && fromChatId2 < 0 && znVar.e.megagroup && znVar.O3 != 9) {
                                            z35 = false;
                                        }
                                        if (z35 && znVar.v9()) {
                                            TLRPC.TL_forumTopic tL_forumTopic = messageObject2.replyToForumTopic;
                                            if (tL_forumTopic == null) {
                                                z27 = true;
                                                j12 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.p2) znVar).currentAccount, messageObject2.messageOwner, true);
                                            } else {
                                                z27 = true;
                                                j12 = tL_forumTopic.id;
                                            }
                                            TLRPC.TL_forumTopic tL_forumTopic2 = messageObject6.replyToForumTopic;
                                            if (tL_forumTopic2 == null) {
                                                z20 = z18;
                                                j13 = j12;
                                                j14 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.p2) znVar).currentAccount, messageObject6.messageOwner, z27);
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
                                        if (UserObject.isUserSelf(znVar.f) || UserObject.isReplyUser(znVar.f)) {
                                            if (!messageObject2.isPrivateForward()) {
                                                if (!messageObject6.isPrivateForward()) {
                                                }
                                            }
                                            z21 = false;
                                        } else if (znVar.O3 != 7) {
                                            z21 = z34;
                                        }
                                        if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    }
                                } else {
                                    z20 = z18;
                                    z21 = z32;
                                }
                                if (ChatObject.isChannel(znVar.e) && znVar.e.megagroup && messageObject2.getFromChatId() <= 0 && (messageFwdHeader = messageObject2.messageOwner.fwd_from) != null && (messageFwdHeader.saved_from_peer instanceof TLRPC.TL_peerChannel)) {
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
                                if (!znVar.Ma) {
                                    z22 = z21;
                                    z23 = z13;
                                } else {
                                    if (X8 != null) {
                                        z24 = true;
                                        z23 = false;
                                        z22 = false;
                                        s1Var.setShowTopic(z24);
                                        s1Var.X3(messageObject2, X8, z23, z22, z17, z19);
                                        s1Var.setSpoilersSuppressed(znVar.u0.getScrollState() == 0);
                                        s1Var.setHighlighted(znVar.I7 == Integer.MAX_VALUE && messageObject2.getId() == znVar.I7);
                                        z25 = s1Var.c8;
                                        if (!z25 && znVar.M7 != null) {
                                            long currentTimeMillis = System.currentTimeMillis();
                                            s1Var.T3(znVar.M7, true, znVar.K7 || currentTimeMillis - znVar.L7 < 200, znVar.P7);
                                            if (znVar.K7) {
                                                znVar.L7 = currentTimeMillis;
                                            }
                                            znVar.K7 = false;
                                        } else if (!z25 && (num = znVar.N7) != null) {
                                            s1Var.R3(num.intValue());
                                        } else if (!z25 && (bArr = znVar.O7) != null) {
                                            s1Var.P3(bArr);
                                        } else if (znVar.O3 == 7 && znVar.r3 != null && (str = znVar.q3) != null) {
                                            s1Var.S3(str);
                                        }
                                        if (znVar.I7 != Integer.MAX_VALUE) {
                                            znVar.Zb();
                                        }
                                        indexOf = arrayList3.indexOf(messageObject2);
                                        if (indexOf != -1) {
                                            if (messageObject2.type == 5 && (flVar = znVar.Y2) != null && flVar.getTextureView() != null) {
                                                ne neVar = znVar.n7;
                                                if (neVar != null) {
                                                    AndroidUtilities.cancelRunOnUIThread(neVar);
                                                    znVar.n7 = null;
                                                }
                                                s1Var.getViewTreeObserver().addOnPreDrawListener(new hh.f(1, this, s1Var));
                                            } else if ((messageObject2.isAnyKindOfSticker() && !messageObject2.isAnimatedEmojiStickers()) || ((sendAnimationData = messageObject2.sendAnimationData) != null && sendAnimationData.fromPreview)) {
                                                if (!messageObject2.sendAnimationData.fromPreview || (lkVar = znVar.V) == null || lkVar.I0 == null) {
                                                    s1Var.getViewTreeObserver().addOnPreDrawListener(new km(this, s1Var));
                                                } else {
                                                    if (((org.telegram.ui.ActionBar.p2) znVar).actionBar.getVisibility() == 0) {
                                                        int measuredHeight = ((org.telegram.ui.ActionBar.p2) znVar).actionBar.getMeasuredHeight() + ((int) ((org.telegram.ui.ActionBar.p2) znVar).actionBar.getTranslationY());
                                                        xk xkVar = znVar.l1;
                                                        int currentHeight = measuredHeight + (xkVar != null ? xkVar.getCurrentHeight() : 0);
                                                        jk jkVar = znVar.m1;
                                                        i19 = (((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode ? AndroidUtilities.statusBarHeight : 0) + currentHeight + (jkVar != null ? jkVar.getCurrentHeight() : 0);
                                                    } else {
                                                        i19 = 0;
                                                    }
                                                    float f10 = i19 + znVar.q9;
                                                    float height = znVar.fragmentView == null ? 0.0f : r9.getHeight();
                                                    org.telegram.ui.Components.cf cfVar = znVar.V.I0;
                                                    Rect rect = cfVar.r0;
                                                    if (!cfVar.n0) {
                                                        cfVar.s = true;
                                                        cfVar.n0 = true;
                                                        hi0 hi0Var = cfVar.U;
                                                        if (hi0Var != null) {
                                                            hi0Var.invalidate();
                                                        }
                                                        org.telegram.ui.Components.lg lgVar = cfVar.T;
                                                        if (lgVar != null) {
                                                            lgVar.invalidate();
                                                        }
                                                        if (cfVar.N != null) {
                                                            cfVar.o0 = s1Var;
                                                            s1Var.setVisibility(4);
                                                            cfVar.p0 = f10;
                                                            cfVar.q0 = height;
                                                            org.telegram.ui.Cells.s1 s1Var2 = cfVar.N;
                                                            org.telegram.ui.Cells.s1 s1Var3 = cfVar.o0;
                                                            s1Var2.K7 = s1Var3.K7;
                                                            s1Var2.T7 = s1Var3.T7;
                                                            s1Var2.M7 = s1Var3.M7;
                                                            s1Var2.O7 = s1Var3.O7;
                                                            s1Var2.Q7 = s1Var3.Q7;
                                                            s1Var2.S7 = s1Var3.S7;
                                                            s1Var2.X3(s1Var.getMessageObject(), null, s1Var.m3(), s1Var.n3(), s1Var.h3(), false);
                                                            org.telegram.ui.Cells.r1 transitionParams = cfVar.N.getTransitionParams();
                                                            transitionParams.g = cfVar.N.getTransitionParams().f();
                                                            Rect rect2 = transitionParams.D0;
                                                            transitionParams.K1 = 0.0f;
                                                            if (cfVar.N.getTransitionParams().D0.left == cfVar.N.getBackgroundDrawableLeft() && rect2.top == cfVar.N.getBackgroundDrawableTop() && rect2.bottom == cfVar.N.getBackgroundDrawableBottom()) {
                                                                i20 = 1;
                                                            } else {
                                                                rect.bottom = -(cfVar.N.getBackgroundDrawableBottom() - rect2.bottom);
                                                                rect.top = -(cfVar.N.getBackgroundDrawableTop() - rect2.top);
                                                                if (s1Var.getMessageObject().isOutOwner()) {
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
                                                        cfVar.e(new zh0(cfVar, i20), false);
                                                        cfVar.C.invalidate();
                                                        cfVar.c();
                                                    }
                                                    znVar.V.I0 = null;
                                                }
                                            }
                                            arrayList3.remove(indexOf);
                                            lk lkVar2 = znVar.V;
                                            Runnable runnable = lkVar2.c0;
                                            if (runnable != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable);
                                                z26 = true;
                                                lkVar2.d0 = true;
                                                lkVar2.c0.run();
                                                lkVar2.c0 = null;
                                            } else {
                                                z26 = true;
                                            }
                                            znVar.V.q0(z26);
                                        }
                                        if (!hashMap.isEmpty() && hashMap.containsKey(messageObject2.getDocument())) {
                                            hashMap.remove(messageObject2.getDocument());
                                            ujVar = znVar.v0;
                                            if (ujVar != null) {
                                                org.telegram.ui.Components.eo eoVar = znVar.P0;
                                                ujVar.O = l1Var;
                                                ujVar.P = eoVar;
                                                r10 = 0;
                                                ujVar.N = false;
                                                if (s1Var.cd) {
                                                    s1Var.cd = r10;
                                                    s1Var.setVisibility(r10);
                                                }
                                                znVar.ub(s1Var);
                                            }
                                        }
                                        r10 = 0;
                                        if (s1Var.cd) {
                                        }
                                        znVar.ub(s1Var);
                                    }
                                    z23 = z21;
                                    z22 = z13;
                                }
                                z24 = true;
                                s1Var.setShowTopic(z24);
                                s1Var.X3(messageObject2, X8, z23, z22, z17, z19);
                                s1Var.setSpoilersSuppressed(znVar.u0.getScrollState() == 0);
                                s1Var.setHighlighted(znVar.I7 == Integer.MAX_VALUE && messageObject2.getId() == znVar.I7);
                                z25 = s1Var.c8;
                                if (!z25) {
                                }
                                if (!z25) {
                                }
                                if (!z25) {
                                }
                                if (znVar.O3 == 7) {
                                    s1Var.S3(str);
                                }
                                if (znVar.I7 != Integer.MAX_VALUE) {
                                }
                                indexOf = arrayList3.indexOf(messageObject2);
                                if (indexOf != -1) {
                                }
                                if (!hashMap.isEmpty()) {
                                    hashMap.remove(messageObject2.getDocument());
                                    ujVar = znVar.v0;
                                    if (ujVar != null) {
                                    }
                                }
                                r10 = 0;
                                if (s1Var.cd) {
                                }
                                znVar.ub(s1Var);
                            }
                        }
                        z16 = z15;
                        z17 = true;
                        i18 = this.G;
                        if (i10 == i18) {
                        }
                        if (j11 == l1Var.f) {
                        }
                        if (ChatObject.isChannel(znVar.e)) {
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
                        if (!znVar.Ma) {
                        }
                        z24 = true;
                        s1Var.setShowTopic(z24);
                        s1Var.X3(messageObject2, X8, z23, z22, z17, z19);
                        s1Var.setSpoilersSuppressed(znVar.u0.getScrollState() == 0);
                        s1Var.setHighlighted(znVar.I7 == Integer.MAX_VALUE && messageObject2.getId() == znVar.I7);
                        z25 = s1Var.c8;
                        if (!z25) {
                        }
                        if (!z25) {
                        }
                        if (!z25) {
                        }
                        if (znVar.O3 == 7) {
                        }
                        if (znVar.I7 != Integer.MAX_VALUE) {
                        }
                        indexOf = arrayList3.indexOf(messageObject2);
                        if (indexOf != -1) {
                        }
                        if (!hashMap.isEmpty()) {
                        }
                        r10 = 0;
                        if (s1Var.cd) {
                        }
                        znVar.ub(s1Var);
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
                        if (j11 == l1Var.f) {
                        }
                        if (ChatObject.isChannel(znVar.e)) {
                        }
                        if (!z16) {
                        }
                        boolean z3622 = false;
                        messageObject2.updateTranslation(false);
                        if (X8 != null) {
                        }
                        if (!znVar.Ma) {
                        }
                        z24 = true;
                        s1Var.setShowTopic(z24);
                        s1Var.X3(messageObject2, X8, z23, z22, z17, z19);
                        s1Var.setSpoilersSuppressed(znVar.u0.getScrollState() == 0);
                        s1Var.setHighlighted(znVar.I7 == Integer.MAX_VALUE && messageObject2.getId() == znVar.I7);
                        z25 = s1Var.c8;
                        if (!z25) {
                        }
                        if (!z25) {
                        }
                        if (!z25) {
                        }
                        if (znVar.O3 == 7) {
                        }
                        if (znVar.I7 != Integer.MAX_VALUE) {
                        }
                        indexOf = arrayList3.indexOf(messageObject2);
                        if (indexOf != -1) {
                        }
                        if (!hashMap.isEmpty()) {
                        }
                        r10 = 0;
                        if (s1Var.cd) {
                        }
                        znVar.ub(s1Var);
                    }
                }
                z16 = z15;
                z17 = true;
                i18 = this.G;
                if (i10 == i18) {
                }
                if (j11 == l1Var.f) {
                }
                if (ChatObject.isChannel(znVar.e)) {
                }
                if (!z16) {
                }
                boolean z36222 = false;
                messageObject2.updateTranslation(false);
                if (X8 != null) {
                }
                if (!znVar.Ma) {
                }
                z24 = true;
                s1Var.setShowTopic(z24);
                s1Var.X3(messageObject2, X8, z23, z22, z17, z19);
                s1Var.setSpoilersSuppressed(znVar.u0.getScrollState() == 0);
                s1Var.setHighlighted(znVar.I7 == Integer.MAX_VALUE && messageObject2.getId() == znVar.I7);
                z25 = s1Var.c8;
                if (!z25) {
                }
                if (!z25) {
                }
                if (!z25) {
                }
                if (znVar.O3 == 7) {
                }
                if (znVar.I7 != Integer.MAX_VALUE) {
                }
                indexOf = arrayList3.indexOf(messageObject2);
                if (indexOf != -1) {
                }
                if (!hashMap.isEmpty()) {
                }
                r10 = 0;
                if (s1Var.cd) {
                }
                znVar.ub(s1Var);
            }
        }
        z10 = false;
        s1Var.U7 = z10;
        s1Var.V7 = znVar.O3 != 0 && (znVar.G4.containsKey(Integer.valueOf(messageObject2.getId())) || !(X8 == null || X8.messages.isEmpty() || !znVar.G4.containsKey(Integer.valueOf(X8.messages.get(0).getId()))));
        i13 = znVar.O3;
        if (i13 != 1) {
        }
        arrayList = arrayList4;
        j10 = 0;
        s1Var.Y7 = j10;
        if (i13 == 7) {
        }
        s1Var.Z7 = UserObject.isReplyUser(znVar.f);
        s1Var.a8 = znVar.O3 != 2;
        s1Var.B8 = znVar.t9();
        s1Var.C8 = znVar.C9();
        s1Var.D8 = znVar.B9();
        s1Var.E8 = znVar.Q8();
        s1Var.F8 = znVar.R8();
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
        if (j11 == l1Var.f) {
        }
        if (ChatObject.isChannel(znVar.e)) {
        }
        if (!z16) {
        }
        boolean z362222 = false;
        messageObject2.updateTranslation(false);
        if (X8 != null) {
        }
        if (!znVar.Ma) {
        }
        z24 = true;
        s1Var.setShowTopic(z24);
        s1Var.X3(messageObject2, X8, z23, z22, z17, z19);
        s1Var.setSpoilersSuppressed(znVar.u0.getScrollState() == 0);
        s1Var.setHighlighted(znVar.I7 == Integer.MAX_VALUE && messageObject2.getId() == znVar.I7);
        z25 = s1Var.c8;
        if (!z25) {
        }
        if (!z25) {
        }
        if (!z25) {
        }
        if (znVar.O3 == 7) {
        }
        if (znVar.I7 != Integer.MAX_VALUE) {
        }
        indexOf = arrayList3.indexOf(messageObject2);
        if (indexOf != -1) {
        }
        if (!hashMap.isEmpty()) {
        }
        r10 = 0;
        if (s1Var.cd) {
        }
        znVar.ub(s1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [org.telegram.ui.fm] */
    /* JADX WARN: Type inference failed for: r8v11, types: [org.telegram.ui.Cells.v0] */
    /* JADX WARN: Type inference failed for: r8v12, types: [org.telegram.ui.Cells.wa] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Cells.y0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [org.telegram.ui.Cells.h0, org.telegram.ui.em] */
    /* JADX WARN: Type inference failed for: r8v16, types: [org.telegram.ui.Cells.u1] */
    /* JADX WARN: Type inference failed for: r8v9, types: [org.telegram.ui.Cells.t1] */
    /* JADX WARN: Type inference failed for: r9v12, types: [org.telegram.ui.Cells.v0] */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.Cells.s1 s1Var2;
        zn znVar = this.N;
        if (i10 == 0) {
            s1Var = new org.telegram.ui.Cells.s1(this.h, ((org.telegram.ui.ActionBar.p2) znVar).currentAccount, true, znVar.ya, znVar.ba);
            s1Var.setResourcesProvider(znVar.ba);
            if (znVar.mc == null) {
                znVar.mc = new ln(znVar);
            }
            s1Var.setDelegate(znVar.mc);
            s1Var.Md = znVar.Mb;
            if (znVar.h == null) {
                s1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? bmVar = new bm(context, znVar.ba, true);
                bmVar.setInvalidateColors(true);
                bmVar.setDelegate(new dm(this));
                s1Var = bmVar;
            } else {
                if (i10 == 2) {
                    s1Var2 = new org.telegram.ui.Cells.u1(context, znVar.ba);
                } else if (i10 == 3) {
                    ?? emVar = new em(this, context, ((org.telegram.ui.ActionBar.p2) znVar).currentAccount, znVar.ba);
                    emVar.setDelegate(new c1(this, 20));
                    s1Var2 = emVar;
                } else if (i10 == 4) {
                    s1Var2 = new org.telegram.ui.Cells.y0(context, znVar.ba);
                } else if (i10 == 6) {
                    s1Var2 = new org.telegram.ui.Cells.wa(context, ((org.telegram.ui.ActionBar.p2) znVar).currentAccount, znVar.ba);
                } else if (i10 == 7) {
                    s1Var2 = new org.telegram.ui.Cells.v0(context, znVar.ba, false);
                } else if (i10 == 8) {
                    s1Var2 = new fm(this, context, ((org.telegram.ui.ActionBar.p2) znVar).currentAccount, znVar.ba);
                } else if (i10 == 10) {
                    ?? t1Var = new org.telegram.ui.Cells.t1(context, znVar.ba);
                    if (znVar.mc == null) {
                        znVar.mc = new ln(znVar);
                    }
                    t1Var.setDelegate(znVar.mc);
                    s1Var2 = t1Var;
                } else {
                    s1Var = null;
                }
                s1Var = s1Var2;
            }
        }
        return ai.n(s1Var, s1Var, -1, -2);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        TLRPC.Message message;
        boolean z4;
        boolean z10;
        byte[] bArr;
        Integer num;
        String str;
        String stickerEmoji;
        MessagesController.EmojiSound emojiSound;
        View view = l1Var.a;
        boolean z11 = view instanceof org.telegram.ui.Cells.s1;
        zn znVar = this.N;
        if (z11 || (view instanceof org.telegram.ui.Cells.v0)) {
            znVar.r9();
        }
        boolean z12 = view instanceof org.telegram.ui.Cells.s1;
        if (z12) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            MessageObject messageObject = s1Var.getMessageObject();
            s1Var.B8 = znVar.t9();
            s1Var.C8 = znVar.C9();
            s1Var.D8 = znVar.B9();
            s1Var.E8 = znVar.Q8();
            s1Var.F8 = znVar.R8();
            s1Var.g4(-1, true, false);
            MessageObject messageObject2 = znVar.D3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                s1Var.g4(znVar.E3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = znVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                znVar.getMediaController().playEmojiSound(znVar.getAccountInstance(), stickerEmoji, emojiSound, true);
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
            if (((org.telegram.ui.ActionBar.p2) znVar).actionBar.s() || znVar.A9()) {
                znVar.K7 = false;
                znVar.L7 = 0L;
                znVar.M7 = null;
                ArrayList arrayList = znVar.X3;
                s1Var.J3(arrayList == null || !arrayList.contains(messageObject), false);
                int i11 = messageObject.getDialogId() == znVar.Q5 ? 0 : 1;
                if (znVar.T5[i11].indexOfKey(messageObject.getId()) >= 0) {
                    znVar.hb(messageObject, s1Var, i11, false);
                    z4 = true;
                } else {
                    s1Var.setDrawSelectionBackground(false);
                    s1Var.L3(false, false, false);
                    z4 = false;
                }
                z10 = true;
            } else {
                s1Var.setDrawSelectionBackground(false);
                s1Var.L3(false, false, false);
                s1Var.J3(false, false);
                z4 = false;
                z10 = false;
            }
            s1Var.K3(!z10, z10 && z4);
            if (znVar.O3 != 7 || znVar.r3 == null || (str = znVar.q3) == null) {
                pk pkVar = znVar.O2;
                if (pkVar != null && pkVar.getVisibility() == 0) {
                    if (znVar.getMediaDataController().isMessageFound(messageObject.getId(), messageObject.getDialogId() == znVar.I6) && znVar.getMediaDataController().getLastSearchQuery() != null) {
                        s1Var.S3(znVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                s1Var.S3(null);
            } else {
                s1Var.S3(str);
            }
            if (!((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode || !s1Var.c8) {
                s1Var.setHighlighted(znVar.I7 != Integer.MAX_VALUE && ((s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == znVar.I7) || (s1Var.getCurrentMessagesGroup() != null && s1Var.getCurrentMessagesGroup().contains(znVar.I7))));
                boolean z13 = s1Var.c8;
                if (z13 && znVar.M7 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!s1Var.T3(znVar.M7, true, znVar.K7 || currentTimeMillis - znVar.L7 < 200, znVar.P7) && znVar.J7) {
                        org.telegram.ui.Components.qc.a0(znVar).Q(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    znVar.J7 = false;
                    if (znVar.K7) {
                        znVar.L7 = currentTimeMillis;
                    }
                    znVar.K7 = false;
                } else if (z13 && (num = znVar.N7) != null) {
                    s1Var.R3(num.intValue());
                } else if (z13 && (bArr = znVar.O7) != null) {
                    s1Var.P3(bArr);
                }
                if (znVar.I7 != Integer.MAX_VALUE) {
                    znVar.Zb();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            v0Var.b0 = znVar.t9();
            v0Var.f0 = znVar.C9();
            znVar.B9();
            znVar.Q8();
            v0Var.g0 = znVar.R8();
        } else if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(znVar.R8() / 2.0f);
        }
        int b10 = l1Var.b();
        int i12 = this.G;
        if (b10 < i12 || b10 >= this.H) {
            return;
        }
        MessageObject messageObject3 = (MessageObject) (this.I ? this.J : this.K ? this.M : znVar.r6).get(b10 - i12);
        if (messageObject3 == null || (message = messageObject3.messageOwner) == null || !message.media_unread || !message.mentioned) {
            return;
        }
        if (!((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode && znVar.O3 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
            int i13 = znVar.i6 - 1;
            znVar.i6 = i13;
            if (i13 <= 0) {
                znVar.i6 = 0;
                znVar.j6 = true;
                znVar.Kb(false);
            } else {
                znVar.g1.c(2, i13, true);
            }
            znVar.getMessagesController().markMentionMessageAsRead(messageObject3.getId(), ChatObject.isChannel(znVar.e) ? znVar.e.id : 0L, znVar.Q5);
            messageObject3.setContentIsRead();
        }
        if (z12) {
            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
            if (((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode) {
                s1Var2.setHighlighted(true);
            } else {
                s1Var2.O3();
            }
        }
    }
}
