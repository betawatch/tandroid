package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class kl extends org.telegram.ui.Components.fj0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final ArrayList N;
    public boolean O;
    public boolean P;
    public final ArrayList Q;
    public final /* synthetic */ bn R;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public kl(bn bnVar, Context context) {
        this.R = bnVar;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.s = -5;
        this.w = -5;
        this.x = -5;
        this.y = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.J = -5;
        this.N = new ArrayList();
        this.Q = new ArrayList();
        this.h = context;
        TLRPC.User user = bnVar.f;
        this.n = user != null && user.bot;
        C(true);
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void K(boolean z10) {
        bn bnVar = this.R;
        if (org.telegram.messenger.p10.v(bnVar.f)) {
            if (z10) {
                bnVar.Uc = true;
            }
            if (this.J < 0 || N()) {
                return;
            }
            super.s(this.J);
            S();
        }
    }

    public final ArrayList L() {
        return this.M ? this.N : this.O ? this.Q : this.R.M6;
    }

    public final void M(org.telegram.messenger.gj gjVar) {
        bn bnVar = this.R;
        int childCount = bnVar.A0.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = bnVar.A0.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.r1) {
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                if (r1Var.getMessageObject() == gjVar) {
                    r1Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean N() {
        bn bnVar = this.R;
        return org.telegram.messenger.p10.w(bnVar.f) && bnVar.d() == 0 && !bnVar.Uc && bnVar.g4 == 0;
    }

    public final void O(boolean z10) {
        boolean z11;
        bn bnVar = this.R;
        ArrayList arrayList = bnVar.M6;
        if (org.telegram.messenger.s2.a) {
            org.telegram.messenger.a8.b("notify data set changed fragmentOpened=" + bnVar.g6);
        }
        if (z10 && bnVar.g6) {
            v4.n0 itemAnimator = bnVar.A0.getItemAnimator();
            dj djVar = bnVar.B0;
            if (itemAnimator != djVar) {
                bnVar.A0.setItemAnimator(djVar);
            }
        } else {
            bnVar.A0.setItemAnimator(null);
        }
        S();
        try {
            super.f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(size);
            if (gjVar.l0) {
                size--;
            } else {
                TLRPC.Message message = gjVar.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                        z11 = true;
                    }
                }
            }
        }
        z11 = false;
        boolean[] zArr = bnVar.U6;
        if ((zArr[0] && (bnVar.d7 == 0 || zArr[1])) || z11) {
            bnVar.a7(((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow);
        }
    }

    public final void P(int i7, boolean z10) {
        org.telegram.messenger.gj messageObject;
        if (org.telegram.messenger.s2.a) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i7);
            p5.c.s(z10 ? " with thanos effect" : "", sb2);
        }
        bn bnVar = this.R;
        if (((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow) {
            v4.n0 itemAnimator = bnVar.A0.getItemAnimator();
            dj djVar = bnVar.B0;
            if (itemAnimator != djVar) {
                bnVar.A0.setItemAnimator(djVar);
            }
        } else {
            bnVar.A0.setItemAnimator(null);
        }
        if (z10 && bnVar.B0 != null) {
            v4.n0 itemAnimator2 = bnVar.A0.getItemAnimator();
            dj djVar2 = bnVar.B0;
            if (itemAnimator2 == djVar2) {
                v4.f1 K = bnVar.A0.K(i7);
                if (K == null) {
                    djVar2.getClass();
                } else {
                    djVar2.S.add(K);
                    View view = K.a;
                    if ((view instanceof org.telegram.ui.Cells.r1) && (messageObject = ((org.telegram.ui.Cells.r1) view).getMessageObject()) != null) {
                        messageObject.a0 = true;
                    }
                }
            }
        }
        S();
        try {
            super.s(i7);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void Q(int i7) {
        int i10;
        bn bnVar = this.R;
        ArrayList arrayList = bnVar.M6;
        if (bnVar.C0 == null || this.M || this.O) {
            return;
        }
        int i11 = 0;
        if (!bnVar.R4 && bnVar.b8 != null) {
            int childCount = bnVar.A0.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = bnVar.A0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.r1) {
                    org.telegram.messenger.gj messageObject = ((org.telegram.ui.Cells.r1) childAt).getMessageObject();
                    org.telegram.messenger.gj gjVar = bnVar.b8;
                    if (messageObject == gjVar) {
                        if (arrayList.indexOf(gjVar) >= 0) {
                            i10 = arrayList.indexOf(bnVar.b8) + this.K;
                            i11 = bnVar.h9(childAt);
                        }
                    }
                }
                i12++;
            }
        }
        i10 = -1;
        g(i7);
        if (i10 != -1) {
            bnVar.C0.h1(i10, i11);
        }
    }

    public final org.telegram.ui.Cells.r1 R(org.telegram.messenger.gj gjVar, boolean z10, boolean z11) {
        bn bnVar = this.R;
        if (z10) {
            int childCount = bnVar.A0.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = bnVar.A0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.r1) {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                    if (r1Var.getMessageObject() == gjVar && TextUtils.equals(r1Var.z5, r1Var.Q5.k.post_author)) {
                        r1Var.y3(gjVar, r1Var.getCurrentMessagesGroup(), r1Var.K2(), r1Var.L2(), r1Var.C2(), r1Var.G2());
                        return r1Var;
                    }
                }
                i7++;
                gjVar = gjVar;
            }
        }
        org.telegram.messenger.gj gjVar2 = gjVar;
        int indexOf = (this.M ? this.N : this.O ? this.Q : bnVar.M6).indexOf(gjVar2);
        if (indexOf == -1) {
            return null;
        }
        if (!z11) {
            Q(this.K + indexOf);
            return null;
        }
        int i10 = bn.od;
        bn.od = i10 + 1;
        gjVar2.m1 = i10;
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
        int i7;
        TLRPC.PeerSettings E1;
        TLRPC.PeerSettings E12;
        int i10;
        int i11;
        bn bnVar = this.R;
        boolean[] zArr = bnVar.U6;
        this.r = 0;
        ArrayList arrayList = this.M ? this.N : this.O ? this.Q : bnVar.M6;
        if (bnVar.g4 == 3 && bnVar.mb) {
            this.r = 1;
            this.s = 0;
        } else {
            this.s = -5;
        }
        this.w = -5;
        this.x = -5;
        this.E = -5;
        this.H = -5;
        this.I = -5;
        this.J = -5;
        if (N()) {
            int i12 = this.r;
            this.r = i12 + 1;
            this.J = i12;
        }
        if (arrayList.isEmpty()) {
            this.F = -5;
            this.G = -5;
            this.K = 0;
            this.L = 0;
            TLRPC.User user4 = bnVar.f;
            if (user4 != null && !org.telegram.messenger.p10.u(user4) && !org.telegram.messenger.p10.A(bnVar.f)) {
                TLRPC.PeerSettings E13 = bnVar.getMessagesController().E1(bnVar.f.id);
                int i13 = org.telegram.ui.Cells.ta.Q;
                if (E13 != null && ((E13.phone_country != null || E13.registration_month != null) && !org.telegram.messenger.np.L2(bnVar.f) && bnVar.g4 == 0)) {
                    int i14 = this.r;
                    this.r = i14 + 1;
                    this.E = i14;
                    return;
                }
            }
            if (org.telegram.messenger.p10.A(bnVar.f) || ((user = bnVar.f) != null && user.bot && !org.telegram.messenger.np.L2(user) && bnVar.g4 == 0)) {
                int i15 = this.r;
                this.r = i15 + 1;
                this.x = i15;
                return;
            }
            return;
        }
        if (!this.O) {
            boolean[] zArr2 = bnVar.W6;
            if ((!zArr2[0] || (bnVar.d7 != 0 && !zArr2[1])) && !bnVar.X6) {
                int i16 = this.r;
                this.r = i16 + 1;
                this.G = i16;
                int i17 = this.r;
                this.K = i17;
                int size = arrayList.size() + i17;
                this.r = size;
                this.L = size;
                user2 = bnVar.f;
                if (user2 != null && !org.telegram.messenger.p10.u(user2) && !org.telegram.messenger.p10.A(bnVar.f)) {
                    E1 = bnVar.getMessagesController().E1(bnVar.f.id);
                    int i18 = org.telegram.ui.Cells.ta.Q;
                    if (E1 != null && ((E1.phone_country != null || E1.registration_month != null) && !org.telegram.messenger.np.L2(bnVar.f) && bnVar.g4 == 0 && zArr[0])) {
                        E12 = bnVar.getMessagesController().E1(bnVar.f.id);
                        i10 = E12.name_change_date;
                        if (i10 != 0 || (i11 = E12.photo_change_date) == 0) {
                            if (i10 != 0) {
                                int i19 = this.r;
                                this.r = i19 + 1;
                                this.I = i19;
                            }
                            if (E12.photo_change_date != 0) {
                                int i20 = this.r;
                                this.r = i20 + 1;
                                this.H = i20;
                            }
                        } else if (i10 < i11) {
                            int i21 = this.r;
                            this.I = i21;
                            this.r = i21 + 2;
                            this.H = i21 + 1;
                        } else {
                            int i22 = this.r;
                            this.H = i22;
                            this.r = i22 + 2;
                            this.I = i22 + 1;
                        }
                        int i23 = this.r;
                        this.r = i23 + 1;
                        this.E = i23;
                        i7 = bnVar.g4;
                        if (i7 == 9) {
                            int i24 = this.r;
                            this.s = i24;
                            this.r = i24 + 2;
                            this.w = i24 + 1;
                        }
                        if (i7 == 5 && !kg.v1.g(bnVar.f4)) {
                            int i25 = this.r;
                            this.r = i25 + 1;
                            this.s = i25;
                        }
                        if (this.O ? !(!(zArr[0] && (bnVar.d7 == 0 || zArr[1])) && (org.telegram.messenger.g0.Q1() || bnVar.v4 || bnVar.f != null)) : this.P) {
                            this.F = -5;
                            return;
                        }
                        int i26 = this.r;
                        this.r = i26 + 1;
                        this.F = i26;
                        return;
                    }
                }
                if ((!org.telegram.messenger.p10.A(bnVar.f) || ((user3 = bnVar.f) != null && user3.bot && !org.telegram.messenger.np.L2(user3) && bnVar.g4 == 0)) && zArr[0]) {
                    int i27 = this.r;
                    this.r = i27 + 1;
                    this.x = i27;
                }
                i7 = bnVar.g4;
                if (i7 == 9) {
                }
                if (i7 == 5) {
                    int i252 = this.r;
                    this.r = i252 + 1;
                    this.s = i252;
                }
                if (this.O) {
                    int i262 = this.r;
                    this.r = i262 + 1;
                    this.F = i262;
                    return;
                } else {
                    int i2622 = this.r;
                    this.r = i2622 + 1;
                    this.F = i2622;
                    return;
                }
            }
        }
        this.G = -5;
        int i172 = this.r;
        this.K = i172;
        int size2 = arrayList.size() + i172;
        this.r = size2;
        this.L = size2;
        user2 = bnVar.f;
        if (user2 != null) {
            E1 = bnVar.getMessagesController().E1(bnVar.f.id);
            int i182 = org.telegram.ui.Cells.ta.Q;
            if (E1 != null) {
                E12 = bnVar.getMessagesController().E1(bnVar.f.id);
                i10 = E12.name_change_date;
                if (i10 != 0) {
                }
                if (i10 != 0) {
                }
                if (E12.photo_change_date != 0) {
                }
                int i232 = this.r;
                this.r = i232 + 1;
                this.E = i232;
                i7 = bnVar.g4;
                if (i7 == 9) {
                }
                if (i7 == 5) {
                }
                if (this.O) {
                }
            }
        }
        if (!org.telegram.messenger.p10.A(bnVar.f)) {
        }
        int i272 = this.r;
        this.r = i272 + 1;
        this.x = i272;
        i7 = bnVar.g4;
        if (i7 == 9) {
        }
        if (i7 == 5) {
        }
        if (this.O) {
        }
    }

    public final void T() {
        int i7 = this.r;
        int i10 = this.x;
        int i11 = this.E;
        int i12 = this.s;
        int i13 = this.w;
        int i14 = this.F;
        int i15 = this.G;
        int i16 = this.K;
        int i17 = this.L;
        int i18 = this.H;
        int i19 = this.I;
        int i20 = this.J;
        S();
        if (i7 == this.r && i10 == this.x && i14 == this.F && i15 == this.G && i16 == this.K && i17 == this.L && i12 == this.s && i13 == this.w && i11 == this.E && i18 == this.H && i19 == this.I && i20 == this.J) {
            return;
        }
        O(false);
    }

    @Override // v4.i0
    public final int b() {
        this.y = -5;
        bn bnVar = this.R;
        a0.h hVar = bnVar.v8;
        if (bnVar.e6.get(bnVar.s4, 0) == 0) {
            return this.r;
        }
        TLRPC.User user = bnVar.f;
        if (user == null || !user.bot || bnVar.g4 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(bnVar.f.id)).description == null && ((TL_bots.BotInfo) hVar.f(bnVar.f.id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(bnVar.f.id)).description_document == null)) && !org.telegram.messenger.p10.A(bnVar.f) && !org.telegram.messenger.p10.v(bnVar.f))) {
            return 0;
        }
        this.y = 0;
        return 1;
    }

    @Override // v4.i0
    public final long c(int i7) {
        bn bnVar = this.R;
        if (bnVar.e6.get(bnVar.s4, 0) != 0 && i7 == this.y) {
            return 1L;
        }
        ArrayList arrayList = this.M ? this.N : this.O ? this.Q : bnVar.M6;
        if (i7 >= this.K && i7 < this.L) {
            return ((org.telegram.messenger.gj) arrayList.get(i7 - r1)).m1;
        }
        if (i7 == this.x || i7 == this.y) {
            return 1L;
        }
        if (i7 == this.F) {
            return 2L;
        }
        if (i7 == this.G) {
            return 3L;
        }
        if (i7 == this.s) {
            return 4L;
        }
        if (i7 == this.E) {
            return 6L;
        }
        if (i7 == this.H) {
            return 7L;
        }
        if (i7 == this.I) {
            return 8L;
        }
        if (i7 == this.J) {
            return 9L;
        }
        return i7 == this.w ? 10L : 5L;
    }

    @Override // v4.i0
    public final int d(int i7) {
        bn bnVar = this.R;
        if (bnVar.e6.get(bnVar.s4, 0) != 0 && i7 == this.y) {
            return 3;
        }
        if (i7 == this.s || i7 == this.w) {
            return 1;
        }
        int i10 = this.K;
        if (i7 >= i10 && i7 < this.L) {
            return ((org.telegram.messenger.gj) (this.M ? this.N : this.O ? this.Q : bnVar.M6).get(i7 - i10)).U;
        }
        if (i7 == this.x) {
            return 3;
        }
        if (i7 == this.E) {
            return 6;
        }
        if (i7 == this.I || i7 == this.H) {
            return 7;
        }
        return i7 == this.J ? 8 : 4;
    }

    @Override // org.telegram.ui.Components.fj0, v4.i0
    public final void f() {
        O(false);
    }

    @Override // org.telegram.ui.Components.fj0, v4.i0
    public final void g(int i7) {
        if (org.telegram.messenger.s2.a) {
            org.telegram.messenger.a8.b("notify item changed " + i7);
        }
        bn bnVar = this.R;
        if (!((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow || bnVar.c1) {
            bnVar.A0.setItemAnimator(null);
        } else {
            v4.n0 itemAnimator = bnVar.A0.getItemAnimator();
            dj djVar = bnVar.B0;
            if (itemAnimator != djVar) {
                bnVar.A0.setItemAnimator(djVar);
            }
        }
        S();
        try {
            super.g(i7);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.fj0, v4.i0
    public final void i(int i7) {
        if (org.telegram.messenger.s2.a) {
            org.telegram.messenger.a8.b("notify item inserted " + i7);
        }
        bn bnVar = this.R;
        if (((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow) {
            v4.n0 itemAnimator = bnVar.A0.getItemAnimator();
            dj djVar = bnVar.B0;
            if (itemAnimator != djVar) {
                bnVar.A0.setItemAnimator(djVar);
            }
        } else {
            bnVar.A0.setItemAnimator(null);
        }
        S();
        try {
            super.i(i7);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // v4.i0
    public final void j(int i7, int i10) {
        if (org.telegram.messenger.s2.a) {
            org.telegram.messenger.a8.b("notify item moved" + i7 + ":" + i10);
        }
        bn bnVar = this.R;
        if (((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow) {
            v4.n0 itemAnimator = bnVar.A0.getItemAnimator();
            dj djVar = bnVar.B0;
            if (itemAnimator != djVar) {
                bnVar.A0.setItemAnimator(djVar);
            }
        } else {
            bnVar.A0.setItemAnimator(null);
        }
        S();
        try {
            super.j(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.fj0, v4.i0
    public final void k(int i7, int i10) {
        if (org.telegram.messenger.s2.a) {
            org.telegram.messenger.a8.b("notify item range changed " + i7 + ":" + i10);
        }
        bn bnVar = this.R;
        if (((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow) {
            v4.n0 itemAnimator = bnVar.A0.getItemAnimator();
            dj djVar = bnVar.B0;
            if (itemAnimator != djVar) {
                bnVar.A0.setItemAnimator(djVar);
            }
        } else {
            bnVar.A0.setItemAnimator(null);
        }
        S();
        try {
            super.k(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.fj0, v4.i0
    public final void o(int i7, int i10) {
        int i11;
        int i12;
        bn bnVar = this.R;
        ArrayList arrayList = bnVar.M6;
        if (org.telegram.messenger.s2.a) {
            org.telegram.messenger.a8.b("notify item range inserted " + i7 + ":" + i10);
        }
        if (((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow) {
            v4.n0 itemAnimator = bnVar.A0.getItemAnimator();
            dj djVar = bnVar.B0;
            if (itemAnimator != djVar) {
                bnVar.A0.setItemAnimator(djVar);
            }
        } else {
            bnVar.A0.setItemAnimator(null);
        }
        S();
        if (i7 == 1 && i10 > 0 && (i11 = i7 + i10) >= (i12 = this.K) && i11 < this.L) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i11 - i12);
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get((i11 - this.K) - 1);
            if ((bnVar.e != null && gjVar.Z0() == gjVar2.Z0()) || (bnVar.f != null && gjVar.P3() == gjVar2.P3())) {
                g(i7);
            }
        }
        try {
            super.o(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.fj0, v4.i0
    public final void p(int i7, int i10) {
        if (org.telegram.messenger.s2.a) {
            org.telegram.messenger.a8.b("notify item range removed" + i7 + ":" + i10);
        }
        bn bnVar = this.R;
        if (((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow) {
            v4.n0 itemAnimator = bnVar.A0.getItemAnimator();
            dj djVar = bnVar.B0;
            if (itemAnimator != djVar) {
                bnVar.A0.setItemAnimator(djVar);
            }
        } else {
            bnVar.A0.setItemAnimator(null);
        }
        S();
        try {
            super.p(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.fj0, v4.i0
    public final void s(int i7) {
        if (org.telegram.messenger.s2.a) {
            org.telegram.messenger.a8.b("notify item removed " + i7);
        }
        bn bnVar = this.R;
        if (((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow) {
            v4.n0 itemAnimator = bnVar.A0.getItemAnimator();
            dj djVar = bnVar.B0;
            if (itemAnimator != djVar) {
                bnVar.A0.setItemAnimator(djVar);
            }
        } else {
            bnVar.A0.setItemAnimator(null);
        }
        S();
        try {
            super.s(i7);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x025a, code lost:
    
        if (r4.X4.containsKey(java.lang.Integer.valueOf(((org.telegram.messenger.gj) r8.get(0)).e1())) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x05b5, code lost:
    
        if (r6 != (r2.j1 == null ? org.telegram.messenger.gj.b2(((org.telegram.ui.ActionBar.g2) r4).currentAccount, r2.k, r9, r10) : r11.id)) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x05e4, code lost:
    
        if (org.telegram.messenger.gj.B1(r5.k.peer_id) == org.telegram.messenger.gj.B1(r2.k.peer_id)) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0657, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x05ff, code lost:
    
        if (r2.R1() == r5.R1()) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0655, code lost:
    
        if (org.telegram.messenger.gj.B1(r6) == org.telegram.messenger.gj.B1(r5.k.fwd_from.from_id)) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x091f, code lost:
    
        if (r4.B0 == null) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x03ef, code lost:
    
        if (r4.g4 != 9) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x041b, code lost:
    
        if (org.telegram.messenger.gj.B1(r5.k.peer_id) == org.telegram.messenger.gj.B1(r10.k.peer_id)) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x048e, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0436, code lost:
    
        if (r10.R1() == r5.R1()) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x048c, code lost:
    
        if (org.telegram.messenger.gj.B1(r6) == org.telegram.messenger.gj.B1(r5.k.fwd_from.from_id)) goto L267;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0265 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0a1d  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0a06  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v12 */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.UserFull userFull;
        TLObject tLObject;
        int i10;
        int i11;
        org.telegram.messenger.gj gjVar;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        ArrayList arrayList;
        long j3;
        int i13;
        boolean z13;
        boolean z14;
        boolean z15;
        int i14;
        boolean z16;
        int d;
        ArrayList arrayList2;
        HashMap hashMap;
        ArrayList arrayList3;
        int i15;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        String str;
        byte[] bArr;
        Integer num;
        int indexOf;
        ?? r10;
        org.telegram.messenger.cj cjVar;
        rj rjVar;
        int i16;
        int i17;
        boolean z21;
        org.telegram.ui.Components.h50 h50Var;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str2;
        boolean z22;
        boolean z23;
        long j10;
        org.telegram.messenger.gj gjVar2;
        String str3;
        boolean z24;
        int i18;
        TLRPC.ChatFull chatFull;
        View view = f1Var.a;
        bn bnVar = this.R;
        a0.h hVar = bnVar.v8;
        ArrayList arrayList4 = bnVar.K4;
        HashMap hashMap2 = bnVar.L4;
        int i19 = 0;
        if (i7 == this.x || i7 == this.y) {
            org.telegram.ui.Cells.g0 g0Var = (org.telegram.ui.Cells.g0) view;
            if (org.telegram.messenger.p10.A(bnVar.f)) {
                g0Var.b(false, 0L, org.telegram.messenger.hd.N0(2131746071, null), null, null, null);
            } else {
                TLRPC.User user = bnVar.f;
                if (user == null || user.id != 489000) {
                    TL_bots.BotInfo botInfo = hVar.m() != 0 ? (TL_bots.BotInfo) hVar.f(bnVar.f.id) : null;
                    boolean z25 = (botInfo == null || (TextUtils.isEmpty(botInfo.description) && botInfo.description_photo == null && botInfo.description_document == null)) && org.telegram.messenger.p10.u(bnVar.f) && (userFull = bnVar.s8) != null && userFull.bot_manager_id != 0 && bnVar.f.bot_can_edit;
                    TLRPC.User user2 = bnVar.f;
                    long j11 = user2 == null ? 0L : user2.id;
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
                    g0Var.b(true, j11, str4, tLObject, botInfo, z25 ? org.telegram.messenger.n5.l(((org.telegram.ui.ActionBar.g2) bnVar).currentAccount, bnVar.s8.bot_manager_id) : null);
                } else {
                    g0Var.b(false, 0L, org.telegram.messenger.hd.M0(2131743372), null, null, null);
                }
            }
            bn.p4(bnVar, g0Var);
            return;
        }
        if (i7 == this.J) {
            ((org.telegram.ui.Cells.a0) view).setDialogId(bnVar.a());
            return;
        }
        if (i7 == this.E) {
            org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) view;
            TLRPC.EncryptedChat encryptedChat = bnVar.h;
            long a10 = encryptedChat != null ? encryptedChat.user_id : bnVar.a();
            taVar.b(a10, bnVar.getMessagesController().E1(a10));
            return;
        }
        if (i7 == this.G || i7 == this.F) {
            ((org.telegram.ui.Cells.y0) view).setProgressVisible(bnVar.b7 > 1);
            return;
        }
        if (i7 == this.I) {
            if (bnVar.getMessagesController().E1(bnVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.v0) view).setCustomText(org.telegram.messenger.hd.a0(null, null, 2131751782, org.telegram.messenger.hd.N(bnVar.getConnectionsManager().getCurrentTime() - r1.name_change_date)));
            return;
        }
        if (i7 == this.H) {
            if (bnVar.getMessagesController().E1(bnVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.v0) view).setCustomText(org.telegram.messenger.hd.a0(null, null, 2131751781, org.telegram.messenger.hd.N(bnVar.getConnectionsManager().getCurrentTime() - r1.photo_change_date)));
            return;
        }
        if (i7 == this.s) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            bn.q4(bnVar);
            v0Var.setMessageObject(bnVar.X3);
            int i20 = bnVar.g4;
            if (i20 == 3) {
                v0Var.setCustomText(org.telegram.messenger.hd.N0(2131745698, null));
            } else if (i20 == 5) {
                v0Var.setCustomText(org.telegram.messenger.hd.N0(2131752659, null));
            } else if (i20 == 9) {
                v0Var.setCustomText(org.telegram.messenger.hd.N0(2131742627, null));
            }
            v0Var.setAlpha(1.0f);
            v0Var.setSpoilersSuppressed(bnVar.A0.getScrollState() != 0);
            return;
        }
        if (i7 == this.w) {
            org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) view;
            bn.r4(bnVar);
            v0Var2.setMessageObject(bnVar.Y3);
            v0Var2.setCustomText(org.telegram.messenger.hd.N0(2131742628, null));
            v0Var2.setAlpha(1.0f);
            v0Var2.setSpoilersSuppressed(bnVar.A0.getScrollState() != 0);
            return;
        }
        int i21 = this.K;
        if (i7 < i21 || i7 >= this.L) {
            return;
        }
        ArrayList arrayList5 = this.M ? this.N : this.O ? this.Q : bnVar.M6;
        org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) arrayList5.get(i7 - i21);
        if (!(view instanceof org.telegram.ui.Cells.r1)) {
            ArrayList arrayList6 = arrayList5;
            if (!(view instanceof org.telegram.ui.Cells.v0)) {
                if (view instanceof org.telegram.ui.Cells.a2) {
                    org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                    a2Var.setText(org.telegram.messenger.hd.N0(2131743593, null));
                    a2Var.getTextView().setTranslationX(bnVar.n9() / 2.0f);
                    if (bnVar.V7 != 0) {
                        bnVar.V7 = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            if ((gjVar3 == null || !gjVar3.l0) && (i11 = (i10 = i7 + 1) - this.K) >= 0 && i11 < arrayList6.size()) {
                org.telegram.messenger.gj gjVar4 = (org.telegram.messenger.gj) arrayList6.get(i10 - this.K);
                if (gjVar4 == null || !gjVar4.l0) {
                    gjVar = gjVar4;
                } else {
                    int i22 = i7 + 2;
                    int i23 = i22 - this.K;
                    gjVar = (i23 < 0 || i23 >= arrayList6.size()) ? null : (org.telegram.messenger.gj) arrayList6.get(i22 - this.K);
                }
                if (gjVar == null || (gjVar3 != null && gjVar.Y1() != gjVar3.Y1())) {
                    z10 = true;
                    org.telegram.ui.Cells.v0 v0Var3 = (org.telegram.ui.Cells.v0) view;
                    v0Var3.f0 = bnVar.Q9();
                    v0Var3.j0 = bnVar.ba();
                    bnVar.aa();
                    bnVar.m9();
                    v0Var3.k0 = bnVar.n9();
                    v0Var3.g0 = org.telegram.messenger.v3.c0(bnVar.e);
                    v0Var3.h0 = org.telegram.messenger.v3.p0(bnVar.e);
                    v0Var3.i0 = org.telegram.messenger.p10.v(bnVar.f);
                    boolean z26 = v0Var3.l0 == z10;
                    v0Var3.l0 = z10;
                    v0Var3.i0(gjVar3, z26);
                    v0Var3.setAlpha(1.0f);
                    v0Var3.setShowTopic(true);
                    v0Var3.setSpoilersSuppressed(bnVar.A0.getScrollState() == 0);
                    return;
                }
            }
            z10 = false;
            org.telegram.ui.Cells.v0 v0Var32 = (org.telegram.ui.Cells.v0) view;
            v0Var32.f0 = bnVar.Q9();
            v0Var32.j0 = bnVar.ba();
            bnVar.aa();
            bnVar.m9();
            v0Var32.k0 = bnVar.n9();
            v0Var32.g0 = org.telegram.messenger.v3.c0(bnVar.e);
            v0Var32.h0 = org.telegram.messenger.v3.p0(bnVar.e);
            v0Var32.i0 = org.telegram.messenger.p10.v(bnVar.f);
            if (v0Var32.l0 == z10) {
            }
            v0Var32.l0 = z10;
            v0Var32.i0(gjVar3, z26);
            v0Var32.setAlpha(1.0f);
            v0Var32.setShowTopic(true);
            v0Var32.setSpoilersSuppressed(bnVar.A0.getScrollState() == 0);
            return;
        }
        org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
        org.telegram.messenger.bj u92 = bnVar.u9(gjVar3);
        r1Var.f6 = bnVar.e != null || org.telegram.messenger.p10.C(bnVar.f) || org.telegram.messenger.p10.A(bnVar.f) || bnVar.g4 == 7;
        r1Var.E.a(false, false);
        r1Var.g6 = org.telegram.messenger.p10.v(bnVar.f);
        r1Var.s6 = bnVar.Y9();
        int i24 = bnVar.g4;
        r1Var.h6 = i24 == 3;
        r1Var.i6 = i24 == 3 && bnVar.mb;
        TLRPC.User user3 = bnVar.f;
        r1Var.j6 = user3 != null && user3.bot;
        r1Var.k6 = org.telegram.messenger.v3.T(bnVar.e) && bnVar.e.megagroup;
        r1Var.l6 = org.telegram.messenger.v3.c0(bnVar.e);
        r1Var.m6 = org.telegram.messenger.v3.p0(bnVar.e);
        r1Var.n6 = org.telegram.messenger.v3.c0(bnVar.e) && bnVar.x4 && bnVar.d() == 1;
        r1Var.o6 = (bnVar.s4 != 0 || (r1Var.l6 && bnVar.x4)) && !r1Var.m6;
        int i25 = bnVar.g4;
        if (i25 != 1 && i25 != 9 && org.telegram.messenger.v3.T(bnVar.e)) {
            TLRPC.Chat chat = bnVar.e;
            if (chat.has_link && !chat.megagroup) {
                z11 = true;
                r1Var.p6 = z11;
                if (bnVar.g4 == 0) {
                    if (!bnVar.X4.containsKey(Integer.valueOf(gjVar3.e1()))) {
                        if (u92 != null) {
                            ArrayList arrayList7 = u92.d;
                            if (!arrayList7.isEmpty()) {
                            }
                        }
                    }
                    z12 = true;
                    r1Var.q6 = z12;
                    i12 = bnVar.g4;
                    if (i12 != 1 || i12 == 9 || (chatFull = bnVar.r8) == null) {
                        arrayList = arrayList5;
                        j3 = 0;
                    } else {
                        arrayList = arrayList5;
                        j3 = chatFull.linked_chat_id;
                    }
                    r1Var.t6 = j3;
                    if (i12 == 7 || bnVar.d4 != 1) {
                        r1Var.u6 = org.telegram.messenger.p10.A(bnVar.f);
                    } else {
                        r1Var.u6 = org.telegram.messenger.p10.z(org.telegram.messenger.gj.B0(gjVar3.k));
                    }
                    r1Var.v6 = bnVar.g4 == 2;
                    r1Var.W6 = bnVar.Q9();
                    r1Var.X6 = bnVar.ba();
                    r1Var.Y6 = bnVar.aa();
                    r1Var.Z6 = bnVar.m9();
                    r1Var.a7 = bnVar.n9();
                    if (gjVar3.r4()) {
                        org.telegram.messenger.g0.K(r1Var, new org.telegram.messenger.j2(i19));
                    }
                    int i26 = i7 + 2;
                    if (u92 != null) {
                        ArrayList arrayList8 = u92.e;
                        org.telegram.messenger.yi d2 = u92.d(gjVar3);
                        if (d2 == null) {
                            z13 = false;
                            z14 = false;
                            z15 = false;
                            i14 = -100;
                            i13 = -100;
                        } else {
                            if (!u92.i) {
                                if ((d2.l & 4) != 0) {
                                    i18 = u92.n ? arrayList8.indexOf(d2) + (i7 - arrayList8.size()) : arrayList8.indexOf(d2) + i7 + 1;
                                    z24 = false;
                                    z15 = false;
                                } else {
                                    z24 = true;
                                    z15 = true;
                                    i18 = -100;
                                }
                                if ((d2.l & 8) != 0) {
                                    z13 = z24;
                                    i14 = u92.n ? arrayList8.indexOf(d2) + i7 + 1 : arrayList8.indexOf(d2) + (i7 - arrayList8.size());
                                    i13 = i18;
                                    z16 = false;
                                } else {
                                    z13 = z24;
                                    i14 = -100;
                                    i13 = i18;
                                    z16 = true;
                                }
                                z14 = z16;
                                int d10 = d(i14);
                                d = d(i13);
                                d(i26);
                                if ((gjVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d10 == f1Var.f) {
                                    arrayList3 = arrayList;
                                    org.telegram.messenger.gj gjVar5 = (org.telegram.messenger.gj) arrayList3.get(i14 - this.K);
                                    boolean z27 = gjVar5.P3() == gjVar3.P3() && (Math.abs(gjVar5.k.date - gjVar3.k.date) <= 300 || bnVar.g4 == 9);
                                    if (z27) {
                                        TLRPC.Message message2 = gjVar5.k;
                                        arrayList2 = arrayList4;
                                        hashMap = hashMap2;
                                        if (message2 == null || message2.paid_message_stars <= 0) {
                                            if (gjVar3.y3() || gjVar5.y3()) {
                                                if (gjVar3.y3() && gjVar5.y3() && Math.abs(gjVar5.k.fwd_from.date - gjVar3.k.fwd_from.date) <= 300) {
                                                    TLRPC.MessageFwdHeader messageFwdHeader2 = gjVar5.k.fwd_from;
                                                    String str5 = messageFwdHeader2.from_name;
                                                    if (str5 == null || (str3 = gjVar3.k.fwd_from.from_name) == null) {
                                                        TLRPC.Peer peer = messageFwdHeader2.from_id;
                                                        if (peer != null) {
                                                            if (gjVar3.k.fwd_from.from_id != null) {
                                                            }
                                                        }
                                                    } else {
                                                        z27 = str5.equals(str3);
                                                        if (org.telegram.messenger.n5.o(gjVar5.k.guestchat_via_from) != org.telegram.messenger.n5.o(gjVar3.k.guestchat_via_from)) {
                                                            z14 = false;
                                                        }
                                                    }
                                                }
                                            } else if (bnVar.e != null) {
                                                long Z0 = gjVar5.Z0();
                                                z27 = Z0 == gjVar3.Z0();
                                                if (!z16) {
                                                    if (z27) {
                                                        if (Z0 < 0) {
                                                            if (bnVar.e.megagroup) {
                                                            }
                                                        }
                                                    }
                                                }
                                                if (org.telegram.messenger.n5.o(gjVar5.k.guestchat_via_from) != org.telegram.messenger.n5.o(gjVar3.k.guestchat_via_from)) {
                                                }
                                            } else {
                                                if (org.telegram.messenger.p10.C(bnVar.f) || org.telegram.messenger.p10.A(bnVar.f)) {
                                                    if (!gjVar3.Y3()) {
                                                        if (!gjVar5.Y3()) {
                                                        }
                                                    }
                                                } else if (bnVar.g4 == 7) {
                                                }
                                                if (org.telegram.messenger.n5.o(gjVar5.k.guestchat_via_from) != org.telegram.messenger.n5.o(gjVar3.k.guestchat_via_from)) {
                                                }
                                            }
                                        }
                                        z27 = false;
                                        if (org.telegram.messenger.n5.o(gjVar5.k.guestchat_via_from) != org.telegram.messenger.n5.o(gjVar3.k.guestchat_via_from)) {
                                        }
                                    } else {
                                        arrayList2 = arrayList4;
                                        hashMap = hashMap2;
                                    }
                                    z14 = z27;
                                } else {
                                    arrayList2 = arrayList4;
                                    hashMap = hashMap2;
                                    arrayList3 = arrayList;
                                }
                                i15 = i13 - this.K;
                                if (i15 >= 0 && i15 < arrayList3.size()) {
                                    gjVar2 = (org.telegram.messenger.gj) arrayList3.get(i13 - this.K);
                                    if (gjVar2 != null && gjVar2.l0) {
                                        int i27 = i13 + 1;
                                        int i28 = i27 - this.K;
                                        gjVar2 = (i28 >= 0 || i28 >= arrayList3.size()) ? null : (org.telegram.messenger.gj) arrayList3.get(i27 - this.K);
                                    }
                                    if (gjVar2 != null && gjVar2.Y1() == gjVar3.Y1()) {
                                        z17 = false;
                                        int i29 = this.K;
                                        boolean z28 = i7 != i29;
                                        if (d == f1Var.f) {
                                            org.telegram.messenger.gj gjVar6 = (org.telegram.messenger.gj) arrayList3.get(i13 - i29);
                                            z13 = !(gjVar6.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && gjVar6.P3() == gjVar3.P3() && (Math.abs(gjVar6.k.date - gjVar3.k.date) <= 300 || bnVar.g4 == 9);
                                            if (z13) {
                                                if (gjVar3.y3() || gjVar6.y3()) {
                                                    if (gjVar3.y3() && gjVar6.y3() && Math.abs(gjVar3.k.fwd_from.date - gjVar6.k.fwd_from.date) <= 300) {
                                                        TLRPC.MessageFwdHeader messageFwdHeader3 = gjVar6.k.fwd_from;
                                                        String str6 = messageFwdHeader3.from_name;
                                                        if (str6 == null || (str2 = gjVar3.k.fwd_from.from_name) == null) {
                                                            TLRPC.Peer peer2 = messageFwdHeader3.from_id;
                                                            if (peer2 != null) {
                                                                if (gjVar3.k.fwd_from.from_id != null) {
                                                                }
                                                            }
                                                        } else {
                                                            z13 = str6.equals(str2);
                                                            if (org.telegram.messenger.n5.o(gjVar6.k.guestchat_via_from) != org.telegram.messenger.n5.o(gjVar3.k.guestchat_via_from)) {
                                                                z13 = false;
                                                            }
                                                        }
                                                    }
                                                    z13 = false;
                                                    if (org.telegram.messenger.n5.o(gjVar6.k.guestchat_via_from) != org.telegram.messenger.n5.o(gjVar3.k.guestchat_via_from)) {
                                                    }
                                                } else if (bnVar.e != null) {
                                                    long Z02 = gjVar6.Z0();
                                                    boolean z29 = (Z02 != gjVar3.Z0() || gjVar3.y3() || gjVar6.y3()) ? false : true;
                                                    if (!z15 && z29 && Z02 < 0 && bnVar.e.megagroup && bnVar.g4 != 9) {
                                                        z29 = false;
                                                    }
                                                    if (z29 && bnVar.T9()) {
                                                        TLRPC.TL_forumTopic tL_forumTopic = gjVar3.j1;
                                                        if (tL_forumTopic == null) {
                                                            z22 = true;
                                                            z23 = false;
                                                            j10 = org.telegram.messenger.gj.b2(((org.telegram.ui.ActionBar.g2) bnVar).currentAccount, gjVar3.k, true, false);
                                                        } else {
                                                            z22 = true;
                                                            z23 = false;
                                                            j10 = tL_forumTopic.id;
                                                        }
                                                    }
                                                    z13 = z29;
                                                    if (org.telegram.messenger.n5.o(gjVar6.k.guestchat_via_from) != org.telegram.messenger.n5.o(gjVar3.k.guestchat_via_from)) {
                                                    }
                                                } else {
                                                    if (org.telegram.messenger.p10.C(bnVar.f) || org.telegram.messenger.p10.A(bnVar.f)) {
                                                        if (!gjVar3.Y3()) {
                                                            if (!gjVar6.Y3()) {
                                                            }
                                                        }
                                                        z13 = false;
                                                    } else if (bnVar.g4 == 7) {
                                                    }
                                                    if (org.telegram.messenger.n5.o(gjVar6.k.guestchat_via_from) != org.telegram.messenger.n5.o(gjVar3.k.guestchat_via_from)) {
                                                    }
                                                }
                                            }
                                        }
                                        if (org.telegram.messenger.v3.T(bnVar.e) && bnVar.e.megagroup && gjVar3.Z0() <= 0 && (messageFwdHeader = gjVar3.k.fwd_from) != null && (messageFwdHeader.saved_from_peer instanceof TLRPC.TL_peerChannel)) {
                                            if (!z15) {
                                                z13 = false;
                                            }
                                            if (!z16) {
                                                z14 = false;
                                            }
                                        }
                                        if (!z15 && (message = gjVar3.k) != null && message.paid_message_stars > 0) {
                                            z13 = false;
                                        }
                                        boolean z30 = false;
                                        gjVar3.g6(false);
                                        if (u92 != null) {
                                            ArrayList arrayList9 = u92.d;
                                            int i30 = 0;
                                            while (i30 < arrayList9.size()) {
                                                ((org.telegram.messenger.gj) arrayList9.get(i30)).g6(z30);
                                                i30++;
                                                z30 = false;
                                            }
                                        }
                                        if (bnVar.nb) {
                                            z18 = z13;
                                        } else {
                                            if (u92 != null) {
                                                z19 = true;
                                                z14 = false;
                                                z18 = false;
                                                r1Var.setShowTopic(z19);
                                                r1Var.y3(gjVar3, u92, z14, z18, z17, z28);
                                                r1Var.setSpoilersSuppressed(bnVar.A0.getScrollState() != 0);
                                                r1Var.setHighlighted(bnVar.d8 == Integer.MAX_VALUE && gjVar3.e1() == bnVar.d8);
                                                z20 = r1Var.x6;
                                                if (!z20 && bnVar.h8 != null) {
                                                    long currentTimeMillis = System.currentTimeMillis();
                                                    r1Var.v3(true, bnVar.k8, bnVar.h8, bnVar.f8 || currentTimeMillis - bnVar.g8 < 200);
                                                    if (bnVar.f8) {
                                                        bnVar.g8 = currentTimeMillis;
                                                    }
                                                    bnVar.f8 = false;
                                                } else if (!z20 && (num = bnVar.i8) != null) {
                                                    r1Var.t3(num.intValue());
                                                } else if (!z20 && (bArr = bnVar.j8) != null) {
                                                    r1Var.r3(bArr);
                                                } else if (bnVar.g4 == 7 && bnVar.J3 != null && (str = bnVar.I3) != null) {
                                                    r1Var.u3(str);
                                                }
                                                if (bnVar.d8 != Integer.MAX_VALUE) {
                                                    bnVar.Gc();
                                                }
                                                ArrayList arrayList10 = arrayList2;
                                                indexOf = arrayList10.indexOf(gjVar3);
                                                if (indexOf != -1) {
                                                    if (gjVar3.D == 5 && (h50Var = bnVar.q3) != null && h50Var.getTextureView() != null) {
                                                        af afVar = bnVar.I7;
                                                        if (afVar != null) {
                                                            org.telegram.messenger.g0.r(afVar);
                                                            bnVar.I7 = null;
                                                        }
                                                        r1Var.getViewTreeObserver().addOnPreDrawListener(new il(this, r1Var, 0));
                                                    } else if ((gjVar3.M2() && !gjVar3.I2()) || ((cjVar = gjVar3.N1) != null && cjVar.h)) {
                                                        if (!gjVar3.N1.h || (rjVar = bnVar.a0) == null || rjVar.M0 == null) {
                                                            r1Var.getViewTreeObserver().addOnPreDrawListener(new il(this, r1Var, 1));
                                                        } else {
                                                            if (((org.telegram.ui.ActionBar.g2) bnVar).actionBar.getVisibility() == 0) {
                                                                int measuredHeight = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar.getMeasuredHeight() + ((int) ((org.telegram.ui.ActionBar.g2) bnVar).actionBar.getTranslationY());
                                                                bk bkVar = bnVar.D1;
                                                                int currentHeight = measuredHeight + (bkVar != null ? bkVar.getCurrentHeight() : 0);
                                                                oj ojVar = bnVar.E1;
                                                                i16 = (((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode ? org.telegram.messenger.g0.m : 0) + currentHeight + (ojVar != null ? ojVar.getCurrentHeight() : 0);
                                                            } else {
                                                                i16 = 0;
                                                            }
                                                            float f10 = i16 + bnVar.Q9;
                                                            float height = bnVar.fragmentView == null ? 0.0f : r8.getHeight();
                                                            eg0 eg0Var = bnVar.a0.M0;
                                                            Rect rect = eg0Var.y0;
                                                            if (!eg0Var.u0) {
                                                                eg0Var.r = true;
                                                                eg0Var.u0 = true;
                                                                uf0 uf0Var = eg0Var.X;
                                                                if (uf0Var != null) {
                                                                    uf0Var.invalidate();
                                                                }
                                                                org.telegram.ui.Components.ug ugVar = eg0Var.W;
                                                                if (ugVar != null) {
                                                                    ugVar.invalidate();
                                                                }
                                                                if (eg0Var.Q != null) {
                                                                    eg0Var.v0 = r1Var;
                                                                    r1Var.setVisibility(4);
                                                                    eg0Var.w0 = f10;
                                                                    eg0Var.x0 = height;
                                                                    org.telegram.ui.Cells.r1 r1Var2 = eg0Var.Q;
                                                                    org.telegram.ui.Cells.r1 r1Var3 = eg0Var.v0;
                                                                    r1Var2.f6 = r1Var3.f6;
                                                                    r1Var2.o6 = r1Var3.o6;
                                                                    r1Var2.h6 = r1Var3.h6;
                                                                    r1Var2.j6 = r1Var3.j6;
                                                                    r1Var2.l6 = r1Var3.l6;
                                                                    r1Var2.n6 = r1Var3.n6;
                                                                    r1Var2.y3(r1Var.getMessageObject(), null, r1Var.K2(), r1Var.L2(), r1Var.C2(), false);
                                                                    org.telegram.ui.Cells.y1 transitionParams = eg0Var.Q.getTransitionParams();
                                                                    transitionParams.h = eg0Var.Q.getTransitionParams().a();
                                                                    Rect rect2 = transitionParams.E0;
                                                                    transitionParams.L1 = 0.0f;
                                                                    if (eg0Var.Q.getTransitionParams().E0.left == eg0Var.Q.getBackgroundDrawableLeft() && rect2.top == eg0Var.Q.getBackgroundDrawableTop() && rect2.bottom == eg0Var.Q.getBackgroundDrawableBottom()) {
                                                                        i17 = 1;
                                                                    } else {
                                                                        rect.bottom = -(eg0Var.Q.getBackgroundDrawableBottom() - rect2.bottom);
                                                                        rect.top = -(eg0Var.Q.getBackgroundDrawableTop() - rect2.top);
                                                                        if (r1Var.getMessageObject().P3()) {
                                                                            rect.left = -(eg0Var.Q.getBackgroundDrawableLeft() - rect2.left);
                                                                            rect.right = 0;
                                                                        } else {
                                                                            rect.left = 0;
                                                                            rect.right = eg0Var.Q.getBackgroundDrawableRight() - rect2.right;
                                                                        }
                                                                        i17 = 1;
                                                                        transitionParams.x0 = true;
                                                                    }
                                                                    int i31 = eg0Var.Q.qc;
                                                                } else {
                                                                    i17 = 1;
                                                                }
                                                                eg0Var.e(new nf0(eg0Var, i17), false);
                                                                eg0Var.F.invalidate();
                                                                org.telegram.messenger.ls.f(eg0Var.c).n(eg0Var, org.telegram.messenger.ls.w3);
                                                            }
                                                            bnVar.a0.M0 = null;
                                                        }
                                                    }
                                                    arrayList10.remove(indexOf);
                                                    rj rjVar2 = bnVar.a0;
                                                    Runnable runnable = rjVar2.g0;
                                                    if (runnable != null) {
                                                        org.telegram.messenger.g0.r(runnable);
                                                        z21 = true;
                                                        rjVar2.h0 = true;
                                                        rjVar2.g0.run();
                                                        rjVar2.g0 = null;
                                                    } else {
                                                        z21 = true;
                                                    }
                                                    bnVar.a0.O0(z21);
                                                }
                                                if (!hashMap.isEmpty()) {
                                                    HashMap hashMap3 = hashMap;
                                                    if (hashMap3.containsKey(gjVar3.F0())) {
                                                        hashMap3.remove(gjVar3.F0());
                                                        dj djVar = bnVar.B0;
                                                        if (djVar != null) {
                                                            org.telegram.ui.Components.io ioVar = bnVar.h1;
                                                            djVar.O = f1Var;
                                                            djVar.P = ioVar;
                                                            r10 = 0;
                                                            djVar.N = false;
                                                            if (r1Var.ob) {
                                                                r1Var.ob = r10;
                                                                r1Var.setVisibility(r10);
                                                            }
                                                            bnVar.bc(r1Var);
                                                        }
                                                    }
                                                }
                                                r10 = 0;
                                                if (r1Var.ob) {
                                                }
                                                bnVar.bc(r1Var);
                                            }
                                            z18 = z14;
                                            z14 = z13;
                                        }
                                        z19 = true;
                                        r1Var.setShowTopic(z19);
                                        r1Var.y3(gjVar3, u92, z14, z18, z17, z28);
                                        r1Var.setSpoilersSuppressed(bnVar.A0.getScrollState() != 0);
                                        r1Var.setHighlighted(bnVar.d8 == Integer.MAX_VALUE && gjVar3.e1() == bnVar.d8);
                                        z20 = r1Var.x6;
                                        if (!z20) {
                                        }
                                        if (!z20) {
                                        }
                                        if (!z20) {
                                        }
                                        if (bnVar.g4 == 7) {
                                            r1Var.u3(str);
                                        }
                                        if (bnVar.d8 != Integer.MAX_VALUE) {
                                        }
                                        ArrayList arrayList102 = arrayList2;
                                        indexOf = arrayList102.indexOf(gjVar3);
                                        if (indexOf != -1) {
                                        }
                                        if (!hashMap.isEmpty()) {
                                        }
                                        r10 = 0;
                                        if (r1Var.ob) {
                                        }
                                        bnVar.bc(r1Var);
                                    }
                                }
                                z17 = true;
                                int i292 = this.K;
                                if (i7 != i292) {
                                }
                                if (d == f1Var.f) {
                                }
                                if (org.telegram.messenger.v3.T(bnVar.e)) {
                                    if (!z15) {
                                    }
                                    if (!z16) {
                                    }
                                }
                                if (!z15) {
                                    z13 = false;
                                }
                                boolean z302 = false;
                                gjVar3.g6(false);
                                if (u92 != null) {
                                }
                                if (bnVar.nb) {
                                }
                                z19 = true;
                                r1Var.setShowTopic(z19);
                                r1Var.y3(gjVar3, u92, z14, z18, z17, z28);
                                r1Var.setSpoilersSuppressed(bnVar.A0.getScrollState() != 0);
                                r1Var.setHighlighted(bnVar.d8 == Integer.MAX_VALUE && gjVar3.e1() == bnVar.d8);
                                z20 = r1Var.x6;
                                if (!z20) {
                                }
                                if (!z20) {
                                }
                                if (!z20) {
                                }
                                if (bnVar.g4 == 7) {
                                }
                                if (bnVar.d8 != Integer.MAX_VALUE) {
                                }
                                ArrayList arrayList1022 = arrayList2;
                                indexOf = arrayList1022.indexOf(gjVar3);
                                if (indexOf != -1) {
                                }
                                if (!hashMap.isEmpty()) {
                                }
                                r10 = 0;
                                if (r1Var.ob) {
                                }
                                bnVar.bc(r1Var);
                            }
                            int indexOf2 = arrayList8.indexOf(d2) + i7 + 1;
                            i14 = arrayList8.indexOf(d2) + (i7 - arrayList8.size());
                            z13 = false;
                            z14 = false;
                            z15 = false;
                            i13 = indexOf2;
                        }
                    } else {
                        i13 = i7 + 1;
                        z13 = false;
                        z14 = false;
                        z15 = false;
                        i14 = i7 - 1;
                    }
                    z16 = z15;
                    int d102 = d(i14);
                    d = d(i13);
                    d(i26);
                    if (gjVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                    }
                    arrayList2 = arrayList4;
                    hashMap = hashMap2;
                    arrayList3 = arrayList;
                    i15 = i13 - this.K;
                    if (i15 >= 0) {
                        gjVar2 = (org.telegram.messenger.gj) arrayList3.get(i13 - this.K);
                        if (gjVar2 != null) {
                            int i272 = i13 + 1;
                            int i282 = i272 - this.K;
                            if (i282 >= 0) {
                            }
                        }
                        if (gjVar2 != null) {
                            z17 = false;
                            int i2922 = this.K;
                            if (i7 != i2922) {
                            }
                            if (d == f1Var.f) {
                            }
                            if (org.telegram.messenger.v3.T(bnVar.e)) {
                            }
                            if (!z15) {
                            }
                            boolean z3022 = false;
                            gjVar3.g6(false);
                            if (u92 != null) {
                            }
                            if (bnVar.nb) {
                            }
                            z19 = true;
                            r1Var.setShowTopic(z19);
                            r1Var.y3(gjVar3, u92, z14, z18, z17, z28);
                            r1Var.setSpoilersSuppressed(bnVar.A0.getScrollState() != 0);
                            r1Var.setHighlighted(bnVar.d8 == Integer.MAX_VALUE && gjVar3.e1() == bnVar.d8);
                            z20 = r1Var.x6;
                            if (!z20) {
                            }
                            if (!z20) {
                            }
                            if (!z20) {
                            }
                            if (bnVar.g4 == 7) {
                            }
                            if (bnVar.d8 != Integer.MAX_VALUE) {
                            }
                            ArrayList arrayList10222 = arrayList2;
                            indexOf = arrayList10222.indexOf(gjVar3);
                            if (indexOf != -1) {
                            }
                            if (!hashMap.isEmpty()) {
                            }
                            r10 = 0;
                            if (r1Var.ob) {
                            }
                            bnVar.bc(r1Var);
                        }
                    }
                    z17 = true;
                    int i29222 = this.K;
                    if (i7 != i29222) {
                    }
                    if (d == f1Var.f) {
                    }
                    if (org.telegram.messenger.v3.T(bnVar.e)) {
                    }
                    if (!z15) {
                    }
                    boolean z30222 = false;
                    gjVar3.g6(false);
                    if (u92 != null) {
                    }
                    if (bnVar.nb) {
                    }
                    z19 = true;
                    r1Var.setShowTopic(z19);
                    r1Var.y3(gjVar3, u92, z14, z18, z17, z28);
                    r1Var.setSpoilersSuppressed(bnVar.A0.getScrollState() != 0);
                    r1Var.setHighlighted(bnVar.d8 == Integer.MAX_VALUE && gjVar3.e1() == bnVar.d8);
                    z20 = r1Var.x6;
                    if (!z20) {
                    }
                    if (!z20) {
                    }
                    if (!z20) {
                    }
                    if (bnVar.g4 == 7) {
                    }
                    if (bnVar.d8 != Integer.MAX_VALUE) {
                    }
                    ArrayList arrayList102222 = arrayList2;
                    indexOf = arrayList102222.indexOf(gjVar3);
                    if (indexOf != -1) {
                    }
                    if (!hashMap.isEmpty()) {
                    }
                    r10 = 0;
                    if (r1Var.ob) {
                    }
                    bnVar.bc(r1Var);
                }
                z12 = false;
                r1Var.q6 = z12;
                i12 = bnVar.g4;
                if (i12 != 1) {
                }
                arrayList = arrayList5;
                j3 = 0;
                r1Var.t6 = j3;
                if (i12 == 7) {
                }
                r1Var.u6 = org.telegram.messenger.p10.A(bnVar.f);
                r1Var.v6 = bnVar.g4 == 2;
                r1Var.W6 = bnVar.Q9();
                r1Var.X6 = bnVar.ba();
                r1Var.Y6 = bnVar.aa();
                r1Var.Z6 = bnVar.m9();
                r1Var.a7 = bnVar.n9();
                if (gjVar3.r4()) {
                }
                int i262 = i7 + 2;
                if (u92 != null) {
                }
                z16 = z15;
                int d1022 = d(i14);
                d = d(i13);
                d(i262);
                if (gjVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                }
                arrayList2 = arrayList4;
                hashMap = hashMap2;
                arrayList3 = arrayList;
                i15 = i13 - this.K;
                if (i15 >= 0) {
                }
                z17 = true;
                int i292222 = this.K;
                if (i7 != i292222) {
                }
                if (d == f1Var.f) {
                }
                if (org.telegram.messenger.v3.T(bnVar.e)) {
                }
                if (!z15) {
                }
                boolean z302222 = false;
                gjVar3.g6(false);
                if (u92 != null) {
                }
                if (bnVar.nb) {
                }
                z19 = true;
                r1Var.setShowTopic(z19);
                r1Var.y3(gjVar3, u92, z14, z18, z17, z28);
                r1Var.setSpoilersSuppressed(bnVar.A0.getScrollState() != 0);
                r1Var.setHighlighted(bnVar.d8 == Integer.MAX_VALUE && gjVar3.e1() == bnVar.d8);
                z20 = r1Var.x6;
                if (!z20) {
                }
                if (!z20) {
                }
                if (!z20) {
                }
                if (bnVar.g4 == 7) {
                }
                if (bnVar.d8 != Integer.MAX_VALUE) {
                }
                ArrayList arrayList1022222 = arrayList2;
                indexOf = arrayList1022222.indexOf(gjVar3);
                if (indexOf != -1) {
                }
                if (!hashMap.isEmpty()) {
                }
                r10 = 0;
                if (r1Var.ob) {
                }
                bnVar.bc(r1Var);
            }
        }
        z11 = false;
        r1Var.p6 = z11;
        if (bnVar.g4 == 0) {
        }
        z12 = false;
        r1Var.q6 = z12;
        i12 = bnVar.g4;
        if (i12 != 1) {
        }
        arrayList = arrayList5;
        j3 = 0;
        r1Var.t6 = j3;
        if (i12 == 7) {
        }
        r1Var.u6 = org.telegram.messenger.p10.A(bnVar.f);
        r1Var.v6 = bnVar.g4 == 2;
        r1Var.W6 = bnVar.Q9();
        r1Var.X6 = bnVar.ba();
        r1Var.Y6 = bnVar.aa();
        r1Var.Z6 = bnVar.m9();
        r1Var.a7 = bnVar.n9();
        if (gjVar3.r4()) {
        }
        int i2622 = i7 + 2;
        if (u92 != null) {
        }
        z16 = z15;
        int d10222 = d(i14);
        d = d(i13);
        d(i2622);
        if (gjVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
        }
        arrayList2 = arrayList4;
        hashMap = hashMap2;
        arrayList3 = arrayList;
        i15 = i13 - this.K;
        if (i15 >= 0) {
        }
        z17 = true;
        int i2922222 = this.K;
        if (i7 != i2922222) {
        }
        if (d == f1Var.f) {
        }
        if (org.telegram.messenger.v3.T(bnVar.e)) {
        }
        if (!z15) {
        }
        boolean z3022222 = false;
        gjVar3.g6(false);
        if (u92 != null) {
        }
        if (bnVar.nb) {
        }
        z19 = true;
        r1Var.setShowTopic(z19);
        r1Var.y3(gjVar3, u92, z14, z18, z17, z28);
        r1Var.setSpoilersSuppressed(bnVar.A0.getScrollState() != 0);
        r1Var.setHighlighted(bnVar.d8 == Integer.MAX_VALUE && gjVar3.e1() == bnVar.d8);
        z20 = r1Var.x6;
        if (!z20) {
        }
        if (!z20) {
        }
        if (!z20) {
        }
        if (bnVar.g4 == 7) {
        }
        if (bnVar.d8 != Integer.MAX_VALUE) {
        }
        ArrayList arrayList10222222 = arrayList2;
        indexOf = arrayList10222222.indexOf(gjVar3);
        if (indexOf != -1) {
        }
        if (!hashMap.isEmpty()) {
        }
        r10 = 0;
        if (r1Var.ob) {
        }
        bnVar.bc(r1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [org.telegram.ui.hl] */
    /* JADX WARN: Type inference failed for: r8v11, types: [org.telegram.ui.Cells.v0] */
    /* JADX WARN: Type inference failed for: r8v12, types: [org.telegram.ui.Cells.ta] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Cells.y0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [org.telegram.ui.Cells.g0, org.telegram.ui.gl] */
    /* JADX WARN: Type inference failed for: r8v16, types: [org.telegram.ui.Cells.a2] */
    /* JADX WARN: Type inference failed for: r8v9, types: [org.telegram.ui.Cells.z1] */
    /* JADX WARN: Type inference failed for: r9v15, types: [org.telegram.ui.Cells.v0] */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.ui.Cells.r1 r1Var2;
        bn bnVar = this.R;
        if (i7 == 0) {
            r1Var = new org.telegram.ui.Cells.r1(this.h, ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount, true, bnVar.Za, bnVar.Ba);
            r1Var.setResourcesProvider(bnVar.Ba);
            if (bnVar.Wc == null) {
                bnVar.Wc = new mm(bnVar);
            }
            r1Var.setDelegate(bnVar.Wc);
            r1Var.Xb = bnVar.tc;
            if (bnVar.h == null) {
                r1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i7 == 1) {
                ?? dlVar = new dl(context, bnVar.Ba, true);
                dlVar.setInvalidateColors(true);
                dlVar.setDelegate(new fl(this));
                r1Var = dlVar;
            } else {
                if (i7 == 2) {
                    ?? a2Var = new org.telegram.ui.Cells.a2(context, bnVar.Ba);
                    r1Var2 = a2Var;
                    if (!bnVar.S9()) {
                        org.telegram.ui.ActionBar.t6.U(a2Var.getTextView(), org.telegram.ui.ActionBar.m6.wf, bnVar.Ba);
                        org.telegram.ui.ActionBar.t6.x(a2Var.getBackgroundLayout(), a2Var.getBackgroundLayout().getBackground(), org.telegram.ui.ActionBar.m6.xf, bnVar.Ba, PorterDuff.Mode.MULTIPLY);
                        r1Var2 = a2Var;
                    }
                } else if (i7 == 3) {
                    ?? glVar = new gl(this, context, ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount, bnVar.Ba);
                    glVar.setDelegate(new w0(this, 22));
                    r1Var2 = glVar;
                } else if (i7 == 4) {
                    r1Var2 = new org.telegram.ui.Cells.y0(context, bnVar.Ba);
                } else if (i7 == 6) {
                    r1Var2 = new org.telegram.ui.Cells.ta(((org.telegram.ui.ActionBar.g2) bnVar).currentAccount, context, bnVar.Ba);
                } else if (i7 == 7) {
                    r1Var2 = new org.telegram.ui.Cells.v0(context, bnVar.Ba, false);
                } else if (i7 == 8) {
                    r1Var2 = new hl(this, context, ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount, bnVar.Ba);
                } else if (i7 == 10) {
                    ?? z1Var = new org.telegram.ui.Cells.z1(context, bnVar.Ba);
                    if (bnVar.Wc == null) {
                        bnVar.Wc = new mm(bnVar);
                    }
                    z1Var.setDelegate(bnVar.Wc);
                    r1Var2 = z1Var;
                } else {
                    r1Var = null;
                }
                r1Var = r1Var2;
            }
        }
        return i5.c.q(r1Var, r1Var, -1, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0249  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(v4.f1 f1Var) {
        TLRPC.Message message;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        byte[] bArr;
        Integer num;
        String str;
        String V1;
        org.telegram.messenger.xo xoVar;
        bn bnVar = this.R;
        View view = f1Var.a;
        if ((view instanceof org.telegram.ui.Cells.r1) || (view instanceof org.telegram.ui.Cells.v0)) {
            bnVar.O9();
        }
        boolean z14 = view instanceof org.telegram.ui.Cells.r1;
        boolean z15 = true;
        if (z14) {
            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
            org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
            r1Var.W6 = bnVar.Q9();
            r1Var.X6 = bnVar.ba();
            r1Var.Y6 = bnVar.aa();
            r1Var.Z6 = bnVar.m9();
            r1Var.a7 = bnVar.n9();
            r1Var.I3(-1, true, false);
            org.telegram.messenger.gj gjVar = bnVar.V3;
            if (gjVar != null && gjVar.T(messageObject)) {
                r1Var.I3(bnVar.W3, false, false);
            }
            if (messageObject.G2() && (V1 = messageObject.V1()) != null && (xoVar = (org.telegram.messenger.xo) bnVar.getMessagesController().k4.get(V1.replace("️", ""))) != null) {
                MediaController mediaController = bnVar.getMediaController();
                org.telegram.messenger.c accountInstance = bnVar.getAccountInstance();
                mediaController.getClass();
                Utilities.d.c(new aa.c0(mediaController, xoVar, accountInstance, z15, 12));
            }
            if (messageObject.g6(false)) {
                r1Var.y3(messageObject, r1Var.getCurrentMessagesGroup(), r1Var.K2(), r1Var.L2(), r1Var.C2(), r1Var.G2());
            } else {
                org.telegram.messenger.bj currentMessagesGroup = r1Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    ArrayList arrayList = currentMessagesGroup.d;
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        ((org.telegram.messenger.gj) arrayList.get(i7)).g6(false);
                    }
                }
            }
            if (((org.telegram.ui.ActionBar.g2) bnVar).actionBar.x() || bnVar.Y9()) {
                bnVar.f8 = false;
                bnVar.g8 = 0L;
                bnVar.h8 = null;
                ArrayList arrayList2 = bnVar.p4;
                r1Var.l3(arrayList2 == null || !arrayList2.contains(messageObject), false);
                int i10 = org.telegram.messenger.gj.B0(messageObject.k) == bnVar.l6 ? 0 : 1;
                if (bnVar.o6[i10].indexOfKey(messageObject.e1()) >= 0) {
                    bnVar.Nb(messageObject, r1Var, i10, false);
                    z10 = true;
                } else {
                    r1Var.setDrawSelectionBackground(false);
                    r1Var.n3(false, false, false);
                    z10 = false;
                }
                z11 = true;
            } else {
                r1Var.setDrawSelectionBackground(false);
                r1Var.n3(false, false, false);
                r1Var.l3(false, false);
                z10 = false;
                z11 = false;
            }
            r1Var.m3(!z11, z11 && z10);
            if (bnVar.g4 != 7 || bnVar.J3 == null || (str = bnVar.I3) == null) {
                uj ujVar = bnVar.g3;
                if (ujVar != null && ujVar.getVisibility() == 0) {
                    if (bnVar.getMediaDataController().c1[org.telegram.messenger.gj.B0(messageObject.k) == bnVar.d7 ? (char) 1 : (char) 0].indexOfKey(messageObject.e1()) >= 0 && bnVar.getMediaDataController().e1 != null) {
                        r1Var.u3(bnVar.getMediaDataController().e1);
                    }
                }
                r1Var.u3(null);
            } else {
                r1Var.u3(str);
            }
            if (!((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode || !r1Var.x6) {
                if (bnVar.d8 != Integer.MAX_VALUE) {
                    if (r1Var.getMessageObject() == null || r1Var.getMessageObject().e1() != bnVar.d8) {
                        if (r1Var.getCurrentMessagesGroup() != null) {
                            org.telegram.messenger.bj currentMessagesGroup2 = r1Var.getCurrentMessagesGroup();
                            int i11 = bnVar.d8;
                            ArrayList arrayList3 = currentMessagesGroup2.d;
                            if (arrayList3 != null) {
                                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                    org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList3.get(i12);
                                    if (gjVar2 == null || gjVar2.e1() != i11) {
                                    }
                                }
                            }
                        }
                    }
                    z12 = true;
                    r1Var.setHighlighted(z12);
                    z13 = r1Var.x6;
                    if (!z13 && bnVar.h8 != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!r1Var.v3(true, bnVar.k8, bnVar.h8, bnVar.f8 || currentTimeMillis - bnVar.g8 < 200) && bnVar.e8) {
                            org.telegram.ui.Components.lc.b0(bnVar).Q(R.raw.error, 36, org.telegram.messenger.hd.N0(2131746239, null)).k(true);
                        }
                        bnVar.e8 = false;
                        if (bnVar.f8) {
                            bnVar.g8 = currentTimeMillis;
                        }
                        bnVar.f8 = false;
                    } else if (!z13 && (num = bnVar.i8) != null) {
                        r1Var.t3(num.intValue());
                    } else if (z13 && (bArr = bnVar.j8) != null) {
                        r1Var.r3(bArr);
                    }
                    if (bnVar.d8 != Integer.MAX_VALUE) {
                        bnVar.Gc();
                    }
                }
                z12 = false;
                r1Var.setHighlighted(z12);
                z13 = r1Var.x6;
                if (!z13) {
                }
                if (!z13) {
                }
                if (z13) {
                    r1Var.r3(bArr);
                }
                if (bnVar.d8 != Integer.MAX_VALUE) {
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            v0Var.f0 = bnVar.Q9();
            v0Var.j0 = bnVar.ba();
            bnVar.aa();
            bnVar.m9();
            v0Var.k0 = bnVar.n9();
        } else if (view instanceof org.telegram.ui.Cells.a2) {
            ((org.telegram.ui.Cells.a2) view).getTextView().setTranslationX(bnVar.n9() / 2.0f);
        }
        int b10 = f1Var.b();
        int i13 = this.K;
        if (b10 < i13 || b10 >= this.L) {
            return;
        }
        org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) (this.M ? this.N : this.O ? this.Q : bnVar.M6).get(b10 - i13);
        if (gjVar3 == null || (message = gjVar3.k) == null || !message.media_unread || !message.mentioned) {
            return;
        }
        if (!((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode && bnVar.g4 == 0 && !org.telegram.messenger.gj.R4(gjVar3.k) && !gjVar3.h4()) {
            int i14 = bnVar.D6 - 1;
            bnVar.D6 = i14;
            if (i14 <= 0) {
                bnVar.D6 = 0;
                bnVar.E6 = true;
                bnVar.rc(false);
            } else {
                bnVar.y1.c(2, i14, true);
            }
            bnVar.getMessagesController().u3(org.telegram.messenger.v3.T(bnVar.e) ? bnVar.e.id : 0L, gjVar3.e1(), bnVar.l6);
            gjVar3.k.media_unread = false;
        }
        if (z14) {
            org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) view;
            if (((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode) {
                r1Var2.setHighlighted(true);
            } else {
                r1Var2.q3();
            }
        }
    }
}
