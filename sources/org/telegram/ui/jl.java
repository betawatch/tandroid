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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class jl extends org.telegram.ui.Components.ui0 {
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
    public final /* synthetic */ an R;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public jl(an anVar, Context context) {
        this.R = anVar;
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
        TLRPC.User user = anVar.f;
        this.n = user != null && user.bot;
        C(true);
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    public final void K(boolean z10) {
        an anVar = this.R;
        if (org.telegram.messenger.q10.u(anVar.f)) {
            if (z10) {
                anVar.Tc = true;
            }
            if (this.J < 0 || N()) {
                return;
            }
            super.s(this.J);
            S();
        }
    }

    public final ArrayList L() {
        return this.M ? this.N : this.O ? this.Q : this.R.L6;
    }

    public final void M(org.telegram.messenger.gj gjVar) {
        an anVar = this.R;
        int childCount = anVar.A0.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = anVar.A0.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var.getMessageObject() == gjVar) {
                    q1Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean N() {
        an anVar = this.R;
        return org.telegram.messenger.q10.v(anVar.f) && anVar.b() == 0 && !anVar.Tc && anVar.g4 == 0;
    }

    public final void O(boolean z10) {
        boolean z11;
        an anVar = this.R;
        ArrayList arrayList = anVar.L6;
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify data set changed fragmentOpened=" + anVar.f6);
        }
        if (z10 && anVar.f6) {
            v4.m0 itemAnimator = anVar.A0.getItemAnimator();
            cj cjVar = anVar.B0;
            if (itemAnimator != cjVar) {
                anVar.A0.setItemAnimator(cjVar);
            }
        } else {
            anVar.A0.setItemAnimator(null);
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
        boolean[] zArr = anVar.T6;
        if ((zArr[0] && (anVar.c7 == 0 || zArr[1])) || z11) {
            anVar.a7(((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow);
        }
    }

    public final void P(int i7, boolean z10) {
        org.telegram.messenger.gj messageObject;
        if (org.telegram.messenger.r2.a) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i7);
            org.telegram.ui.Cells.y0.t(z10 ? " with thanos effect" : "", sb2);
        }
        an anVar = this.R;
        if (((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow) {
            v4.m0 itemAnimator = anVar.A0.getItemAnimator();
            cj cjVar = anVar.B0;
            if (itemAnimator != cjVar) {
                anVar.A0.setItemAnimator(cjVar);
            }
        } else {
            anVar.A0.setItemAnimator(null);
        }
        if (z10 && anVar.B0 != null) {
            v4.m0 itemAnimator2 = anVar.A0.getItemAnimator();
            cj cjVar2 = anVar.B0;
            if (itemAnimator2 == cjVar2) {
                v4.e1 K = anVar.A0.K(i7);
                if (K == null) {
                    cjVar2.getClass();
                } else {
                    cjVar2.S.add(K);
                    View view = K.a;
                    if ((view instanceof org.telegram.ui.Cells.q1) && (messageObject = ((org.telegram.ui.Cells.q1) view).getMessageObject()) != null) {
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
        an anVar = this.R;
        ArrayList arrayList = anVar.L6;
        if (anVar.C0 == null || this.M || this.O) {
            return;
        }
        int i11 = 0;
        if (!anVar.Q4 && anVar.a8 != null) {
            int childCount = anVar.A0.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = anVar.A0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.messenger.gj messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                    org.telegram.messenger.gj gjVar = anVar.a8;
                    if (messageObject == gjVar) {
                        if (arrayList.indexOf(gjVar) >= 0) {
                            i10 = arrayList.indexOf(anVar.a8) + this.K;
                            i11 = anVar.h9(childAt);
                        }
                    }
                }
                i12++;
            }
        }
        i10 = -1;
        g(i7);
        if (i10 != -1) {
            anVar.C0.h1(i10, i11);
        }
    }

    public final org.telegram.ui.Cells.q1 R(org.telegram.messenger.gj gjVar, boolean z10, boolean z11) {
        an anVar = this.R;
        if (z10) {
            int childCount = anVar.A0.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = anVar.A0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject() == gjVar && TextUtils.equals(q1Var.z5, q1Var.Q5.k.post_author)) {
                        q1Var.x3(gjVar, q1Var.getCurrentMessagesGroup(), q1Var.I2(), q1Var.J2(), q1Var.A2(), q1Var.E2());
                        return q1Var;
                    }
                }
                i7++;
                gjVar = gjVar;
            }
        }
        org.telegram.messenger.gj gjVar2 = gjVar;
        int indexOf = (this.M ? this.N : this.O ? this.Q : anVar.L6).indexOf(gjVar2);
        if (indexOf == -1) {
            return null;
        }
        if (!z11) {
            Q(this.K + indexOf);
            return null;
        }
        int i10 = an.nd;
        an.nd = i10 + 1;
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
        TLRPC.PeerSettings C1;
        TLRPC.PeerSettings C12;
        int i10;
        int i11;
        an anVar = this.R;
        boolean[] zArr = anVar.T6;
        this.r = 0;
        ArrayList arrayList = this.M ? this.N : this.O ? this.Q : anVar.L6;
        if (anVar.g4 == 3 && anVar.lb) {
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
            TLRPC.User user4 = anVar.f;
            if (user4 != null && !org.telegram.messenger.q10.t(user4) && !org.telegram.messenger.q10.z(anVar.f)) {
                TLRPC.PeerSettings C13 = anVar.getMessagesController().C1(anVar.f.id);
                int i13 = org.telegram.ui.Cells.ra.Q;
                if (C13 != null && ((C13.phone_country != null || C13.registration_month != null) && !org.telegram.messenger.np.F2(anVar.f) && anVar.g4 == 0)) {
                    int i14 = this.r;
                    this.r = i14 + 1;
                    this.E = i14;
                    return;
                }
            }
            if (org.telegram.messenger.q10.z(anVar.f) || ((user = anVar.f) != null && user.bot && !org.telegram.messenger.np.F2(user) && anVar.g4 == 0)) {
                int i15 = this.r;
                this.r = i15 + 1;
                this.x = i15;
                return;
            }
            return;
        }
        if (!this.O) {
            boolean[] zArr2 = anVar.V6;
            if ((!zArr2[0] || (anVar.c7 != 0 && !zArr2[1])) && !anVar.W6) {
                int i16 = this.r;
                this.r = i16 + 1;
                this.G = i16;
                int i17 = this.r;
                this.K = i17;
                int size = arrayList.size() + i17;
                this.r = size;
                this.L = size;
                user2 = anVar.f;
                if (user2 != null && !org.telegram.messenger.q10.t(user2) && !org.telegram.messenger.q10.z(anVar.f)) {
                    C1 = anVar.getMessagesController().C1(anVar.f.id);
                    int i18 = org.telegram.ui.Cells.ra.Q;
                    if (C1 != null && ((C1.phone_country != null || C1.registration_month != null) && !org.telegram.messenger.np.F2(anVar.f) && anVar.g4 == 0 && zArr[0])) {
                        C12 = anVar.getMessagesController().C1(anVar.f.id);
                        i10 = C12.name_change_date;
                        if (i10 != 0 || (i11 = C12.photo_change_date) == 0) {
                            if (i10 != 0) {
                                int i19 = this.r;
                                this.r = i19 + 1;
                                this.I = i19;
                            }
                            if (C12.photo_change_date != 0) {
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
                        i7 = anVar.g4;
                        if (i7 == 9) {
                            int i24 = this.r;
                            this.s = i24;
                            this.r = i24 + 2;
                            this.w = i24 + 1;
                        }
                        if (i7 == 5 && !kg.v1.g(anVar.f4)) {
                            int i25 = this.r;
                            this.r = i25 + 1;
                            this.s = i25;
                        }
                        if (this.O ? !(!(zArr[0] && (anVar.c7 == 0 || zArr[1])) && (org.telegram.messenger.g0.Q1() || anVar.v4 || anVar.f != null)) : this.P) {
                            this.F = -5;
                            return;
                        }
                        int i26 = this.r;
                        this.r = i26 + 1;
                        this.F = i26;
                        return;
                    }
                }
                if ((!org.telegram.messenger.q10.z(anVar.f) || ((user3 = anVar.f) != null && user3.bot && !org.telegram.messenger.np.F2(user3) && anVar.g4 == 0)) && zArr[0]) {
                    int i27 = this.r;
                    this.r = i27 + 1;
                    this.x = i27;
                }
                i7 = anVar.g4;
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
        user2 = anVar.f;
        if (user2 != null) {
            C1 = anVar.getMessagesController().C1(anVar.f.id);
            int i182 = org.telegram.ui.Cells.ra.Q;
            if (C1 != null) {
                C12 = anVar.getMessagesController().C1(anVar.f.id);
                i10 = C12.name_change_date;
                if (i10 != 0) {
                }
                if (i10 != 0) {
                }
                if (C12.photo_change_date != 0) {
                }
                int i232 = this.r;
                this.r = i232 + 1;
                this.E = i232;
                i7 = anVar.g4;
                if (i7 == 9) {
                }
                if (i7 == 5) {
                }
                if (this.O) {
                }
            }
        }
        if (!org.telegram.messenger.q10.z(anVar.f)) {
        }
        int i272 = this.r;
        this.r = i272 + 1;
        this.x = i272;
        i7 = anVar.g4;
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

    @Override // v4.h0
    public final int b() {
        this.y = -5;
        an anVar = this.R;
        a0.h hVar = anVar.u8;
        if (anVar.d6.get(anVar.s4, 0) == 0) {
            return this.r;
        }
        TLRPC.User user = anVar.f;
        if (user == null || !user.bot || anVar.g4 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(anVar.f.id)).description == null && ((TL_bots.BotInfo) hVar.f(anVar.f.id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(anVar.f.id)).description_document == null)) && !org.telegram.messenger.q10.z(anVar.f) && !org.telegram.messenger.q10.u(anVar.f))) {
            return 0;
        }
        this.y = 0;
        return 1;
    }

    @Override // v4.h0
    public final long c(int i7) {
        an anVar = this.R;
        if (anVar.d6.get(anVar.s4, 0) != 0 && i7 == this.y) {
            return 1L;
        }
        ArrayList arrayList = this.M ? this.N : this.O ? this.Q : anVar.L6;
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

    @Override // v4.h0
    public final int d(int i7) {
        an anVar = this.R;
        if (anVar.d6.get(anVar.s4, 0) != 0 && i7 == this.y) {
            return 3;
        }
        if (i7 == this.s || i7 == this.w) {
            return 1;
        }
        int i10 = this.K;
        if (i7 >= i10 && i7 < this.L) {
            return ((org.telegram.messenger.gj) (this.M ? this.N : this.O ? this.Q : anVar.L6).get(i7 - i10)).U;
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

    @Override // org.telegram.ui.Components.ui0, v4.h0
    public final void f() {
        O(false);
    }

    @Override // org.telegram.ui.Components.ui0, v4.h0
    public final void g(int i7) {
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item changed " + i7);
        }
        an anVar = this.R;
        if (!((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow || anVar.c1) {
            anVar.A0.setItemAnimator(null);
        } else {
            v4.m0 itemAnimator = anVar.A0.getItemAnimator();
            cj cjVar = anVar.B0;
            if (itemAnimator != cjVar) {
                anVar.A0.setItemAnimator(cjVar);
            }
        }
        S();
        try {
            super.g(i7);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ui0, v4.h0
    public final void i(int i7) {
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item inserted " + i7);
        }
        an anVar = this.R;
        if (((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow) {
            v4.m0 itemAnimator = anVar.A0.getItemAnimator();
            cj cjVar = anVar.B0;
            if (itemAnimator != cjVar) {
                anVar.A0.setItemAnimator(cjVar);
            }
        } else {
            anVar.A0.setItemAnimator(null);
        }
        S();
        try {
            super.i(i7);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // v4.h0
    public final void j(int i7, int i10) {
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item moved" + i7 + ":" + i10);
        }
        an anVar = this.R;
        if (((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow) {
            v4.m0 itemAnimator = anVar.A0.getItemAnimator();
            cj cjVar = anVar.B0;
            if (itemAnimator != cjVar) {
                anVar.A0.setItemAnimator(cjVar);
            }
        } else {
            anVar.A0.setItemAnimator(null);
        }
        S();
        try {
            super.j(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ui0, v4.h0
    public final void k(int i7, int i10) {
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item range changed " + i7 + ":" + i10);
        }
        an anVar = this.R;
        if (((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow) {
            v4.m0 itemAnimator = anVar.A0.getItemAnimator();
            cj cjVar = anVar.B0;
            if (itemAnimator != cjVar) {
                anVar.A0.setItemAnimator(cjVar);
            }
        } else {
            anVar.A0.setItemAnimator(null);
        }
        S();
        try {
            super.k(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ui0, v4.h0
    public final void o(int i7, int i10) {
        int i11;
        int i12;
        an anVar = this.R;
        ArrayList arrayList = anVar.L6;
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item range inserted " + i7 + ":" + i10);
        }
        if (((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow) {
            v4.m0 itemAnimator = anVar.A0.getItemAnimator();
            cj cjVar = anVar.B0;
            if (itemAnimator != cjVar) {
                anVar.A0.setItemAnimator(cjVar);
            }
        } else {
            anVar.A0.setItemAnimator(null);
        }
        S();
        if (i7 == 1 && i10 > 0 && (i11 = i7 + i10) >= (i12 = this.K) && i11 < this.L) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i11 - i12);
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get((i11 - this.K) - 1);
            if ((anVar.e != null && gjVar.Z0() == gjVar2.Z0()) || (anVar.f != null && gjVar.P3() == gjVar2.P3())) {
                g(i7);
            }
        }
        try {
            super.o(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ui0, v4.h0
    public final void p(int i7, int i10) {
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item range removed" + i7 + ":" + i10);
        }
        an anVar = this.R;
        if (((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow) {
            v4.m0 itemAnimator = anVar.A0.getItemAnimator();
            cj cjVar = anVar.B0;
            if (itemAnimator != cjVar) {
                anVar.A0.setItemAnimator(cjVar);
            }
        } else {
            anVar.A0.setItemAnimator(null);
        }
        S();
        try {
            super.p(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ui0, v4.h0
    public final void s(int i7) {
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item removed " + i7);
        }
        an anVar = this.R;
        if (((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow) {
            v4.m0 itemAnimator = anVar.A0.getItemAnimator();
            cj cjVar = anVar.B0;
            if (itemAnimator != cjVar) {
                anVar.A0.setItemAnimator(cjVar);
            }
        } else {
            anVar.A0.setItemAnimator(null);
        }
        S();
        try {
            super.s(i7);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x025a, code lost:
    
        if (r4.W4.containsKey(java.lang.Integer.valueOf(((org.telegram.messenger.gj) r8.get(0)).e1())) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x05b7, code lost:
    
        if (r6 != (r2.j1 == null ? org.telegram.messenger.gj.b2(((org.telegram.ui.ActionBar.e2) r4).currentAccount, r2.k, r9, r10) : r11.id)) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x05e6, code lost:
    
        if (org.telegram.messenger.gj.B1(r5.k.peer_id) == org.telegram.messenger.gj.B1(r2.k.peer_id)) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0659, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0601, code lost:
    
        if (r2.R1() == r5.R1()) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0657, code lost:
    
        if (org.telegram.messenger.gj.B1(r6) == org.telegram.messenger.gj.B1(r5.k.fwd_from.from_id)) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0921, code lost:
    
        if (r4.B0 == null) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x03f1, code lost:
    
        if (r4.g4 != 9) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x041d, code lost:
    
        if (org.telegram.messenger.gj.B1(r5.k.peer_id) == org.telegram.messenger.gj.B1(r10.k.peer_id)) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0490, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0438, code lost:
    
        if (r10.R1() == r5.R1()) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x048e, code lost:
    
        if (org.telegram.messenger.gj.B1(r6) == org.telegram.messenger.gj.B1(r5.k.fwd_from.from_id)) goto L267;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0265 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0a08  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v12 */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
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
        qj qjVar;
        int i16;
        int i17;
        boolean z21;
        org.telegram.ui.Components.w40 w40Var;
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
        View view = e1Var.a;
        an anVar = this.R;
        a0.h hVar = anVar.u8;
        ArrayList arrayList4 = anVar.J4;
        HashMap hashMap2 = anVar.K4;
        if (i7 == this.x || i7 == this.y) {
            org.telegram.ui.Cells.f0 f0Var = (org.telegram.ui.Cells.f0) view;
            if (org.telegram.messenger.q10.z(anVar.f)) {
                f0Var.b(false, 0L, org.telegram.messenger.hd.M0(2131746267, null), null, null, null);
            } else {
                TLRPC.User user = anVar.f;
                if (user == null || user.id != 489000) {
                    TL_bots.BotInfo botInfo = hVar.m() != 0 ? (TL_bots.BotInfo) hVar.f(anVar.f.id) : null;
                    boolean z25 = (botInfo == null || (TextUtils.isEmpty(botInfo.description) && botInfo.description_photo == null && botInfo.description_document == null)) && org.telegram.messenger.q10.t(anVar.f) && (userFull = anVar.r8) != null && userFull.bot_manager_id != 0 && anVar.f.bot_can_edit;
                    TLRPC.User user2 = anVar.f;
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
                    f0Var.b(true, j11, str4, tLObject, botInfo, z25 ? org.telegram.messenger.m5.l(((org.telegram.ui.ActionBar.e2) anVar).currentAccount, anVar.r8.bot_manager_id) : null);
                } else {
                    f0Var.b(false, 0L, org.telegram.messenger.hd.L0(2131743617), null, null, null);
                }
            }
            an.p4(anVar, f0Var);
            return;
        }
        if (i7 == this.J) {
            ((org.telegram.ui.Cells.a0) view).setDialogId(anVar.a());
            return;
        }
        if (i7 == this.E) {
            org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
            TLRPC.EncryptedChat encryptedChat = anVar.h;
            long a10 = encryptedChat != null ? encryptedChat.user_id : anVar.a();
            raVar.b(a10, anVar.getMessagesController().C1(a10));
            return;
        }
        if (i7 == this.G || i7 == this.F) {
            ((org.telegram.ui.Cells.w0) view).setProgressVisible(anVar.a7 > 1);
            return;
        }
        if (i7 == this.I) {
            if (anVar.getMessagesController().C1(anVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.t0) view).setCustomText(org.telegram.messenger.hd.a0(null, null, 2131751794, org.telegram.messenger.hd.N(anVar.getConnectionsManager().getCurrentTime() - r1.name_change_date)));
            return;
        }
        if (i7 == this.H) {
            if (anVar.getMessagesController().C1(anVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.t0) view).setCustomText(org.telegram.messenger.hd.a0(null, null, 2131751793, org.telegram.messenger.hd.N(anVar.getConnectionsManager().getCurrentTime() - r1.photo_change_date)));
            return;
        }
        if (i7 == this.s) {
            org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
            an.q4(anVar);
            t0Var.setMessageObject(anVar.X3);
            int i19 = anVar.g4;
            if (i19 == 3) {
                t0Var.setCustomText(org.telegram.messenger.hd.M0(2131745894, null));
            } else if (i19 == 5) {
                t0Var.setCustomText(org.telegram.messenger.hd.M0(2131752671, null));
            } else if (i19 == 9) {
                t0Var.setCustomText(org.telegram.messenger.hd.M0(2131742893, null));
            }
            t0Var.setAlpha(1.0f);
            t0Var.setSpoilersSuppressed(anVar.A0.getScrollState() != 0);
            return;
        }
        if (i7 == this.w) {
            org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) view;
            an.r4(anVar);
            t0Var2.setMessageObject(anVar.Y3);
            t0Var2.setCustomText(org.telegram.messenger.hd.M0(2131742894, null));
            t0Var2.setAlpha(1.0f);
            t0Var2.setSpoilersSuppressed(anVar.A0.getScrollState() != 0);
            return;
        }
        int i20 = this.K;
        if (i7 < i20 || i7 >= this.L) {
            return;
        }
        ArrayList arrayList5 = this.M ? this.N : this.O ? this.Q : anVar.L6;
        org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) arrayList5.get(i7 - i20);
        if (!(view instanceof org.telegram.ui.Cells.q1)) {
            ArrayList arrayList6 = arrayList5;
            if (!(view instanceof org.telegram.ui.Cells.t0)) {
                if (view instanceof org.telegram.ui.Cells.z1) {
                    org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                    z1Var.setText(org.telegram.messenger.hd.M0(2131743838, null));
                    z1Var.getTextView().setTranslationX(anVar.n9() / 2.0f);
                    if (anVar.U7 != 0) {
                        anVar.U7 = 0;
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
                    int i21 = i7 + 2;
                    int i22 = i21 - this.K;
                    gjVar = (i22 < 0 || i22 >= arrayList6.size()) ? null : (org.telegram.messenger.gj) arrayList6.get(i21 - this.K);
                }
                if (gjVar == null || (gjVar3 != null && gjVar.Y1() != gjVar3.Y1())) {
                    z10 = true;
                    org.telegram.ui.Cells.t0 t0Var3 = (org.telegram.ui.Cells.t0) view;
                    t0Var3.f0 = anVar.Q9();
                    t0Var3.j0 = anVar.ba();
                    anVar.aa();
                    anVar.m9();
                    t0Var3.k0 = anVar.n9();
                    t0Var3.g0 = org.telegram.messenger.t3.c0(anVar.e);
                    t0Var3.h0 = org.telegram.messenger.t3.p0(anVar.e);
                    t0Var3.i0 = org.telegram.messenger.q10.u(anVar.f);
                    boolean z26 = t0Var3.l0 == z10;
                    t0Var3.l0 = z10;
                    t0Var3.h0(gjVar3, z26);
                    t0Var3.setAlpha(1.0f);
                    t0Var3.setShowTopic(true);
                    t0Var3.setSpoilersSuppressed(anVar.A0.getScrollState() == 0);
                    return;
                }
            }
            z10 = false;
            org.telegram.ui.Cells.t0 t0Var32 = (org.telegram.ui.Cells.t0) view;
            t0Var32.f0 = anVar.Q9();
            t0Var32.j0 = anVar.ba();
            anVar.aa();
            anVar.m9();
            t0Var32.k0 = anVar.n9();
            t0Var32.g0 = org.telegram.messenger.t3.c0(anVar.e);
            t0Var32.h0 = org.telegram.messenger.t3.p0(anVar.e);
            t0Var32.i0 = org.telegram.messenger.q10.u(anVar.f);
            if (t0Var32.l0 == z10) {
            }
            t0Var32.l0 = z10;
            t0Var32.h0(gjVar3, z26);
            t0Var32.setAlpha(1.0f);
            t0Var32.setShowTopic(true);
            t0Var32.setSpoilersSuppressed(anVar.A0.getScrollState() == 0);
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
        org.telegram.messenger.bj u92 = anVar.u9(gjVar3);
        q1Var.f6 = anVar.e != null || org.telegram.messenger.q10.B(anVar.f) || org.telegram.messenger.q10.z(anVar.f) || anVar.g4 == 7;
        q1Var.E.a(false, false);
        q1Var.g6 = org.telegram.messenger.q10.u(anVar.f);
        q1Var.s6 = anVar.Y9();
        int i23 = anVar.g4;
        q1Var.h6 = i23 == 3;
        q1Var.i6 = i23 == 3 && anVar.lb;
        TLRPC.User user3 = anVar.f;
        q1Var.j6 = user3 != null && user3.bot;
        q1Var.k6 = org.telegram.messenger.t3.T(anVar.e) && anVar.e.megagroup;
        q1Var.l6 = org.telegram.messenger.t3.c0(anVar.e);
        q1Var.m6 = org.telegram.messenger.t3.p0(anVar.e);
        q1Var.n6 = org.telegram.messenger.t3.c0(anVar.e) && anVar.w4 && anVar.b() == 1;
        q1Var.o6 = (anVar.s4 != 0 || (q1Var.l6 && anVar.w4)) && !q1Var.m6;
        int i24 = anVar.g4;
        if (i24 != 1 && i24 != 9 && org.telegram.messenger.t3.T(anVar.e)) {
            TLRPC.Chat chat = anVar.e;
            if (chat.has_link && !chat.megagroup) {
                z11 = true;
                q1Var.p6 = z11;
                if (anVar.g4 == 0) {
                    if (!anVar.W4.containsKey(Integer.valueOf(gjVar3.e1()))) {
                        if (u92 != null) {
                            ArrayList arrayList7 = u92.d;
                            if (!arrayList7.isEmpty()) {
                            }
                        }
                    }
                    z12 = true;
                    q1Var.q6 = z12;
                    i12 = anVar.g4;
                    if (i12 != 1 || i12 == 9 || (chatFull = anVar.q8) == null) {
                        arrayList = arrayList5;
                        j3 = 0;
                    } else {
                        arrayList = arrayList5;
                        j3 = chatFull.linked_chat_id;
                    }
                    q1Var.t6 = j3;
                    if (i12 == 7 || anVar.d4 != 1) {
                        q1Var.u6 = org.telegram.messenger.q10.z(anVar.f);
                    } else {
                        q1Var.u6 = org.telegram.messenger.q10.y(org.telegram.messenger.gj.B0(gjVar3.k));
                    }
                    q1Var.v6 = anVar.g4 == 2;
                    q1Var.W6 = anVar.Q9();
                    q1Var.X6 = anVar.ba();
                    q1Var.Y6 = anVar.aa();
                    q1Var.Z6 = anVar.m9();
                    q1Var.a7 = anVar.n9();
                    if (gjVar3.r4()) {
                        org.telegram.messenger.g0.K(q1Var, new ai.o(28));
                    }
                    int i25 = i7 + 2;
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
                                d(i25);
                                if ((gjVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d10 == e1Var.f) {
                                    arrayList3 = arrayList;
                                    org.telegram.messenger.gj gjVar5 = (org.telegram.messenger.gj) arrayList3.get(i14 - this.K);
                                    boolean z27 = gjVar5.P3() == gjVar3.P3() && (Math.abs(gjVar5.k.date - gjVar3.k.date) <= 300 || anVar.g4 == 9);
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
                                                        if (org.telegram.messenger.m5.o(gjVar5.k.guestchat_via_from) != org.telegram.messenger.m5.o(gjVar3.k.guestchat_via_from)) {
                                                            z14 = false;
                                                        }
                                                    }
                                                }
                                            } else if (anVar.e != null) {
                                                long Z0 = gjVar5.Z0();
                                                z27 = Z0 == gjVar3.Z0();
                                                if (!z16) {
                                                    if (z27) {
                                                        if (Z0 < 0) {
                                                            if (anVar.e.megagroup) {
                                                            }
                                                        }
                                                    }
                                                }
                                                if (org.telegram.messenger.m5.o(gjVar5.k.guestchat_via_from) != org.telegram.messenger.m5.o(gjVar3.k.guestchat_via_from)) {
                                                }
                                            } else {
                                                if (org.telegram.messenger.q10.B(anVar.f) || org.telegram.messenger.q10.z(anVar.f)) {
                                                    if (!gjVar3.Y3()) {
                                                        if (!gjVar5.Y3()) {
                                                        }
                                                    }
                                                } else if (anVar.g4 == 7) {
                                                }
                                                if (org.telegram.messenger.m5.o(gjVar5.k.guestchat_via_from) != org.telegram.messenger.m5.o(gjVar3.k.guestchat_via_from)) {
                                                }
                                            }
                                        }
                                        z27 = false;
                                        if (org.telegram.messenger.m5.o(gjVar5.k.guestchat_via_from) != org.telegram.messenger.m5.o(gjVar3.k.guestchat_via_from)) {
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
                                        int i26 = i13 + 1;
                                        int i27 = i26 - this.K;
                                        gjVar2 = (i27 >= 0 || i27 >= arrayList3.size()) ? null : (org.telegram.messenger.gj) arrayList3.get(i26 - this.K);
                                    }
                                    if (gjVar2 != null && gjVar2.Y1() == gjVar3.Y1()) {
                                        z17 = false;
                                        int i28 = this.K;
                                        boolean z28 = i7 != i28;
                                        if (d == e1Var.f) {
                                            org.telegram.messenger.gj gjVar6 = (org.telegram.messenger.gj) arrayList3.get(i13 - i28);
                                            z13 = !(gjVar6.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && gjVar6.P3() == gjVar3.P3() && (Math.abs(gjVar6.k.date - gjVar3.k.date) <= 300 || anVar.g4 == 9);
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
                                                            if (org.telegram.messenger.m5.o(gjVar6.k.guestchat_via_from) != org.telegram.messenger.m5.o(gjVar3.k.guestchat_via_from)) {
                                                                z13 = false;
                                                            }
                                                        }
                                                    }
                                                    z13 = false;
                                                    if (org.telegram.messenger.m5.o(gjVar6.k.guestchat_via_from) != org.telegram.messenger.m5.o(gjVar3.k.guestchat_via_from)) {
                                                    }
                                                } else if (anVar.e != null) {
                                                    long Z02 = gjVar6.Z0();
                                                    boolean z29 = (Z02 != gjVar3.Z0() || gjVar3.y3() || gjVar6.y3()) ? false : true;
                                                    if (!z15 && z29 && Z02 < 0 && anVar.e.megagroup && anVar.g4 != 9) {
                                                        z29 = false;
                                                    }
                                                    if (z29 && anVar.T9()) {
                                                        TLRPC.TL_forumTopic tL_forumTopic = gjVar3.j1;
                                                        if (tL_forumTopic == null) {
                                                            z22 = true;
                                                            z23 = false;
                                                            j10 = org.telegram.messenger.gj.b2(((org.telegram.ui.ActionBar.e2) anVar).currentAccount, gjVar3.k, true, false);
                                                        } else {
                                                            z22 = true;
                                                            z23 = false;
                                                            j10 = tL_forumTopic.id;
                                                        }
                                                    }
                                                    z13 = z29;
                                                    if (org.telegram.messenger.m5.o(gjVar6.k.guestchat_via_from) != org.telegram.messenger.m5.o(gjVar3.k.guestchat_via_from)) {
                                                    }
                                                } else {
                                                    if (org.telegram.messenger.q10.B(anVar.f) || org.telegram.messenger.q10.z(anVar.f)) {
                                                        if (!gjVar3.Y3()) {
                                                            if (!gjVar6.Y3()) {
                                                            }
                                                        }
                                                        z13 = false;
                                                    } else if (anVar.g4 == 7) {
                                                    }
                                                    if (org.telegram.messenger.m5.o(gjVar6.k.guestchat_via_from) != org.telegram.messenger.m5.o(gjVar3.k.guestchat_via_from)) {
                                                    }
                                                }
                                            }
                                        }
                                        if (org.telegram.messenger.t3.T(anVar.e) && anVar.e.megagroup && gjVar3.Z0() <= 0 && (messageFwdHeader = gjVar3.k.fwd_from) != null && (messageFwdHeader.saved_from_peer instanceof TLRPC.TL_peerChannel)) {
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
                                            int i29 = 0;
                                            while (i29 < arrayList9.size()) {
                                                ((org.telegram.messenger.gj) arrayList9.get(i29)).g6(z30);
                                                i29++;
                                                z30 = false;
                                            }
                                        }
                                        if (anVar.mb) {
                                            z18 = z13;
                                        } else {
                                            if (u92 != null) {
                                                z19 = true;
                                                z14 = false;
                                                z18 = false;
                                                q1Var.setShowTopic(z19);
                                                q1Var.x3(gjVar3, u92, z14, z18, z17, z28);
                                                q1Var.setSpoilersSuppressed(anVar.A0.getScrollState() != 0);
                                                q1Var.setHighlighted(anVar.c8 == Integer.MAX_VALUE && gjVar3.e1() == anVar.c8);
                                                z20 = q1Var.x6;
                                                if (!z20 && anVar.g8 != null) {
                                                    long currentTimeMillis = System.currentTimeMillis();
                                                    q1Var.u3(true, anVar.j8, anVar.g8, anVar.e8 || currentTimeMillis - anVar.f8 < 200);
                                                    if (anVar.e8) {
                                                        anVar.f8 = currentTimeMillis;
                                                    }
                                                    anVar.e8 = false;
                                                } else if (!z20 && (num = anVar.h8) != null) {
                                                    q1Var.s3(num.intValue());
                                                } else if (!z20 && (bArr = anVar.i8) != null) {
                                                    q1Var.q3(bArr);
                                                } else if (anVar.g4 == 7 && anVar.J3 != null && (str = anVar.I3) != null) {
                                                    q1Var.t3(str);
                                                }
                                                if (anVar.c8 != Integer.MAX_VALUE) {
                                                    anVar.Gc();
                                                }
                                                ArrayList arrayList10 = arrayList2;
                                                indexOf = arrayList10.indexOf(gjVar3);
                                                if (indexOf != -1) {
                                                    if (gjVar3.D == 5 && (w40Var = anVar.q3) != null && w40Var.getTextureView() != null) {
                                                        ye yeVar = anVar.H7;
                                                        if (yeVar != null) {
                                                            org.telegram.messenger.g0.r(yeVar);
                                                            anVar.H7 = null;
                                                        }
                                                        q1Var.getViewTreeObserver().addOnPreDrawListener(new hl(this, q1Var, 0));
                                                    } else if ((gjVar3.M2() && !gjVar3.I2()) || ((cjVar = gjVar3.N1) != null && cjVar.h)) {
                                                        if (!gjVar3.N1.h || (qjVar = anVar.a0) == null || qjVar.M0 == null) {
                                                            q1Var.getViewTreeObserver().addOnPreDrawListener(new hl(this, q1Var, 1));
                                                        } else {
                                                            if (((org.telegram.ui.ActionBar.e2) anVar).actionBar.getVisibility() == 0) {
                                                                int measuredHeight = ((org.telegram.ui.ActionBar.e2) anVar).actionBar.getMeasuredHeight() + ((int) ((org.telegram.ui.ActionBar.e2) anVar).actionBar.getTranslationY());
                                                                ak akVar = anVar.D1;
                                                                int currentHeight = measuredHeight + (akVar != null ? akVar.getCurrentHeight() : 0);
                                                                nj njVar = anVar.E1;
                                                                i16 = (((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode ? org.telegram.messenger.g0.m : 0) + currentHeight + (njVar != null ? njVar.getCurrentHeight() : 0);
                                                            } else {
                                                                i16 = 0;
                                                            }
                                                            float f10 = i16 + anVar.P9;
                                                            float height = anVar.fragmentView == null ? 0.0f : r8.getHeight();
                                                            bg0 bg0Var = anVar.a0.M0;
                                                            Rect rect = bg0Var.y0;
                                                            if (!bg0Var.u0) {
                                                                bg0Var.r = true;
                                                                bg0Var.u0 = true;
                                                                rf0 rf0Var = bg0Var.X;
                                                                if (rf0Var != null) {
                                                                    rf0Var.invalidate();
                                                                }
                                                                org.telegram.ui.Components.jg jgVar = bg0Var.W;
                                                                if (jgVar != null) {
                                                                    jgVar.invalidate();
                                                                }
                                                                if (bg0Var.Q != null) {
                                                                    bg0Var.v0 = q1Var;
                                                                    q1Var.setVisibility(4);
                                                                    bg0Var.w0 = f10;
                                                                    bg0Var.x0 = height;
                                                                    org.telegram.ui.Cells.q1 q1Var2 = bg0Var.Q;
                                                                    org.telegram.ui.Cells.q1 q1Var3 = bg0Var.v0;
                                                                    q1Var2.f6 = q1Var3.f6;
                                                                    q1Var2.o6 = q1Var3.o6;
                                                                    q1Var2.h6 = q1Var3.h6;
                                                                    q1Var2.j6 = q1Var3.j6;
                                                                    q1Var2.l6 = q1Var3.l6;
                                                                    q1Var2.n6 = q1Var3.n6;
                                                                    q1Var2.x3(q1Var.getMessageObject(), null, q1Var.I2(), q1Var.J2(), q1Var.A2(), false);
                                                                    org.telegram.ui.Cells.x1 transitionParams = bg0Var.Q.getTransitionParams();
                                                                    transitionParams.h = bg0Var.Q.getTransitionParams().a();
                                                                    Rect rect2 = transitionParams.E0;
                                                                    transitionParams.L1 = 0.0f;
                                                                    if (bg0Var.Q.getTransitionParams().E0.left == bg0Var.Q.getBackgroundDrawableLeft() && rect2.top == bg0Var.Q.getBackgroundDrawableTop() && rect2.bottom == bg0Var.Q.getBackgroundDrawableBottom()) {
                                                                        i17 = 1;
                                                                    } else {
                                                                        rect.bottom = -(bg0Var.Q.getBackgroundDrawableBottom() - rect2.bottom);
                                                                        rect.top = -(bg0Var.Q.getBackgroundDrawableTop() - rect2.top);
                                                                        if (q1Var.getMessageObject().P3()) {
                                                                            rect.left = -(bg0Var.Q.getBackgroundDrawableLeft() - rect2.left);
                                                                            rect.right = 0;
                                                                        } else {
                                                                            rect.left = 0;
                                                                            rect.right = bg0Var.Q.getBackgroundDrawableRight() - rect2.right;
                                                                        }
                                                                        i17 = 1;
                                                                        transitionParams.x0 = true;
                                                                    }
                                                                    int i30 = bg0Var.Q.qc;
                                                                } else {
                                                                    i17 = 1;
                                                                }
                                                                bg0Var.e(new kf0(bg0Var, i17), false);
                                                                bg0Var.F.invalidate();
                                                                org.telegram.messenger.ns.f(bg0Var.c).n(bg0Var, org.telegram.messenger.ns.u3);
                                                            }
                                                            anVar.a0.M0 = null;
                                                        }
                                                    }
                                                    arrayList10.remove(indexOf);
                                                    qj qjVar2 = anVar.a0;
                                                    Runnable runnable = qjVar2.g0;
                                                    if (runnable != null) {
                                                        org.telegram.messenger.g0.r(runnable);
                                                        z21 = true;
                                                        qjVar2.h0 = true;
                                                        qjVar2.g0.run();
                                                        qjVar2.g0 = null;
                                                    } else {
                                                        z21 = true;
                                                    }
                                                    anVar.a0.C0(z21);
                                                }
                                                if (!hashMap.isEmpty()) {
                                                    HashMap hashMap3 = hashMap;
                                                    if (hashMap3.containsKey(gjVar3.F0())) {
                                                        hashMap3.remove(gjVar3.F0());
                                                        cj cjVar2 = anVar.B0;
                                                        if (cjVar2 != null) {
                                                            org.telegram.ui.Components.xn xnVar = anVar.h1;
                                                            cjVar2.O = e1Var;
                                                            cjVar2.P = xnVar;
                                                            r10 = 0;
                                                            cjVar2.N = false;
                                                            if (q1Var.ob) {
                                                                q1Var.ob = r10;
                                                                q1Var.setVisibility(r10);
                                                            }
                                                            anVar.bc(q1Var);
                                                        }
                                                    }
                                                }
                                                r10 = 0;
                                                if (q1Var.ob) {
                                                }
                                                anVar.bc(q1Var);
                                            }
                                            z18 = z14;
                                            z14 = z13;
                                        }
                                        z19 = true;
                                        q1Var.setShowTopic(z19);
                                        q1Var.x3(gjVar3, u92, z14, z18, z17, z28);
                                        q1Var.setSpoilersSuppressed(anVar.A0.getScrollState() != 0);
                                        q1Var.setHighlighted(anVar.c8 == Integer.MAX_VALUE && gjVar3.e1() == anVar.c8);
                                        z20 = q1Var.x6;
                                        if (!z20) {
                                        }
                                        if (!z20) {
                                        }
                                        if (!z20) {
                                        }
                                        if (anVar.g4 == 7) {
                                            q1Var.t3(str);
                                        }
                                        if (anVar.c8 != Integer.MAX_VALUE) {
                                        }
                                        ArrayList arrayList102 = arrayList2;
                                        indexOf = arrayList102.indexOf(gjVar3);
                                        if (indexOf != -1) {
                                        }
                                        if (!hashMap.isEmpty()) {
                                        }
                                        r10 = 0;
                                        if (q1Var.ob) {
                                        }
                                        anVar.bc(q1Var);
                                    }
                                }
                                z17 = true;
                                int i282 = this.K;
                                if (i7 != i282) {
                                }
                                if (d == e1Var.f) {
                                }
                                if (org.telegram.messenger.t3.T(anVar.e)) {
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
                                if (anVar.mb) {
                                }
                                z19 = true;
                                q1Var.setShowTopic(z19);
                                q1Var.x3(gjVar3, u92, z14, z18, z17, z28);
                                q1Var.setSpoilersSuppressed(anVar.A0.getScrollState() != 0);
                                q1Var.setHighlighted(anVar.c8 == Integer.MAX_VALUE && gjVar3.e1() == anVar.c8);
                                z20 = q1Var.x6;
                                if (!z20) {
                                }
                                if (!z20) {
                                }
                                if (!z20) {
                                }
                                if (anVar.g4 == 7) {
                                }
                                if (anVar.c8 != Integer.MAX_VALUE) {
                                }
                                ArrayList arrayList1022 = arrayList2;
                                indexOf = arrayList1022.indexOf(gjVar3);
                                if (indexOf != -1) {
                                }
                                if (!hashMap.isEmpty()) {
                                }
                                r10 = 0;
                                if (q1Var.ob) {
                                }
                                anVar.bc(q1Var);
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
                    d(i25);
                    if (gjVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                    }
                    arrayList2 = arrayList4;
                    hashMap = hashMap2;
                    arrayList3 = arrayList;
                    i15 = i13 - this.K;
                    if (i15 >= 0) {
                        gjVar2 = (org.telegram.messenger.gj) arrayList3.get(i13 - this.K);
                        if (gjVar2 != null) {
                            int i262 = i13 + 1;
                            int i272 = i262 - this.K;
                            if (i272 >= 0) {
                            }
                        }
                        if (gjVar2 != null) {
                            z17 = false;
                            int i2822 = this.K;
                            if (i7 != i2822) {
                            }
                            if (d == e1Var.f) {
                            }
                            if (org.telegram.messenger.t3.T(anVar.e)) {
                            }
                            if (!z15) {
                            }
                            boolean z3022 = false;
                            gjVar3.g6(false);
                            if (u92 != null) {
                            }
                            if (anVar.mb) {
                            }
                            z19 = true;
                            q1Var.setShowTopic(z19);
                            q1Var.x3(gjVar3, u92, z14, z18, z17, z28);
                            q1Var.setSpoilersSuppressed(anVar.A0.getScrollState() != 0);
                            q1Var.setHighlighted(anVar.c8 == Integer.MAX_VALUE && gjVar3.e1() == anVar.c8);
                            z20 = q1Var.x6;
                            if (!z20) {
                            }
                            if (!z20) {
                            }
                            if (!z20) {
                            }
                            if (anVar.g4 == 7) {
                            }
                            if (anVar.c8 != Integer.MAX_VALUE) {
                            }
                            ArrayList arrayList10222 = arrayList2;
                            indexOf = arrayList10222.indexOf(gjVar3);
                            if (indexOf != -1) {
                            }
                            if (!hashMap.isEmpty()) {
                            }
                            r10 = 0;
                            if (q1Var.ob) {
                            }
                            anVar.bc(q1Var);
                        }
                    }
                    z17 = true;
                    int i28222 = this.K;
                    if (i7 != i28222) {
                    }
                    if (d == e1Var.f) {
                    }
                    if (org.telegram.messenger.t3.T(anVar.e)) {
                    }
                    if (!z15) {
                    }
                    boolean z30222 = false;
                    gjVar3.g6(false);
                    if (u92 != null) {
                    }
                    if (anVar.mb) {
                    }
                    z19 = true;
                    q1Var.setShowTopic(z19);
                    q1Var.x3(gjVar3, u92, z14, z18, z17, z28);
                    q1Var.setSpoilersSuppressed(anVar.A0.getScrollState() != 0);
                    q1Var.setHighlighted(anVar.c8 == Integer.MAX_VALUE && gjVar3.e1() == anVar.c8);
                    z20 = q1Var.x6;
                    if (!z20) {
                    }
                    if (!z20) {
                    }
                    if (!z20) {
                    }
                    if (anVar.g4 == 7) {
                    }
                    if (anVar.c8 != Integer.MAX_VALUE) {
                    }
                    ArrayList arrayList102222 = arrayList2;
                    indexOf = arrayList102222.indexOf(gjVar3);
                    if (indexOf != -1) {
                    }
                    if (!hashMap.isEmpty()) {
                    }
                    r10 = 0;
                    if (q1Var.ob) {
                    }
                    anVar.bc(q1Var);
                }
                z12 = false;
                q1Var.q6 = z12;
                i12 = anVar.g4;
                if (i12 != 1) {
                }
                arrayList = arrayList5;
                j3 = 0;
                q1Var.t6 = j3;
                if (i12 == 7) {
                }
                q1Var.u6 = org.telegram.messenger.q10.z(anVar.f);
                q1Var.v6 = anVar.g4 == 2;
                q1Var.W6 = anVar.Q9();
                q1Var.X6 = anVar.ba();
                q1Var.Y6 = anVar.aa();
                q1Var.Z6 = anVar.m9();
                q1Var.a7 = anVar.n9();
                if (gjVar3.r4()) {
                }
                int i252 = i7 + 2;
                if (u92 != null) {
                }
                z16 = z15;
                int d1022 = d(i14);
                d = d(i13);
                d(i252);
                if (gjVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                }
                arrayList2 = arrayList4;
                hashMap = hashMap2;
                arrayList3 = arrayList;
                i15 = i13 - this.K;
                if (i15 >= 0) {
                }
                z17 = true;
                int i282222 = this.K;
                if (i7 != i282222) {
                }
                if (d == e1Var.f) {
                }
                if (org.telegram.messenger.t3.T(anVar.e)) {
                }
                if (!z15) {
                }
                boolean z302222 = false;
                gjVar3.g6(false);
                if (u92 != null) {
                }
                if (anVar.mb) {
                }
                z19 = true;
                q1Var.setShowTopic(z19);
                q1Var.x3(gjVar3, u92, z14, z18, z17, z28);
                q1Var.setSpoilersSuppressed(anVar.A0.getScrollState() != 0);
                q1Var.setHighlighted(anVar.c8 == Integer.MAX_VALUE && gjVar3.e1() == anVar.c8);
                z20 = q1Var.x6;
                if (!z20) {
                }
                if (!z20) {
                }
                if (!z20) {
                }
                if (anVar.g4 == 7) {
                }
                if (anVar.c8 != Integer.MAX_VALUE) {
                }
                ArrayList arrayList1022222 = arrayList2;
                indexOf = arrayList1022222.indexOf(gjVar3);
                if (indexOf != -1) {
                }
                if (!hashMap.isEmpty()) {
                }
                r10 = 0;
                if (q1Var.ob) {
                }
                anVar.bc(q1Var);
            }
        }
        z11 = false;
        q1Var.p6 = z11;
        if (anVar.g4 == 0) {
        }
        z12 = false;
        q1Var.q6 = z12;
        i12 = anVar.g4;
        if (i12 != 1) {
        }
        arrayList = arrayList5;
        j3 = 0;
        q1Var.t6 = j3;
        if (i12 == 7) {
        }
        q1Var.u6 = org.telegram.messenger.q10.z(anVar.f);
        q1Var.v6 = anVar.g4 == 2;
        q1Var.W6 = anVar.Q9();
        q1Var.X6 = anVar.ba();
        q1Var.Y6 = anVar.aa();
        q1Var.Z6 = anVar.m9();
        q1Var.a7 = anVar.n9();
        if (gjVar3.r4()) {
        }
        int i2522 = i7 + 2;
        if (u92 != null) {
        }
        z16 = z15;
        int d10222 = d(i14);
        d = d(i13);
        d(i2522);
        if (gjVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
        }
        arrayList2 = arrayList4;
        hashMap = hashMap2;
        arrayList3 = arrayList;
        i15 = i13 - this.K;
        if (i15 >= 0) {
        }
        z17 = true;
        int i2822222 = this.K;
        if (i7 != i2822222) {
        }
        if (d == e1Var.f) {
        }
        if (org.telegram.messenger.t3.T(anVar.e)) {
        }
        if (!z15) {
        }
        boolean z3022222 = false;
        gjVar3.g6(false);
        if (u92 != null) {
        }
        if (anVar.mb) {
        }
        z19 = true;
        q1Var.setShowTopic(z19);
        q1Var.x3(gjVar3, u92, z14, z18, z17, z28);
        q1Var.setSpoilersSuppressed(anVar.A0.getScrollState() != 0);
        q1Var.setHighlighted(anVar.c8 == Integer.MAX_VALUE && gjVar3.e1() == anVar.c8);
        z20 = q1Var.x6;
        if (!z20) {
        }
        if (!z20) {
        }
        if (!z20) {
        }
        if (anVar.g4 == 7) {
        }
        if (anVar.c8 != Integer.MAX_VALUE) {
        }
        ArrayList arrayList10222222 = arrayList2;
        indexOf = arrayList10222222.indexOf(gjVar3);
        if (indexOf != -1) {
        }
        if (!hashMap.isEmpty()) {
        }
        r10 = 0;
        if (q1Var.ob) {
        }
        anVar.bc(q1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [org.telegram.ui.gl] */
    /* JADX WARN: Type inference failed for: r8v11, types: [org.telegram.ui.Cells.t0] */
    /* JADX WARN: Type inference failed for: r8v12, types: [org.telegram.ui.Cells.ra] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Cells.w0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [org.telegram.ui.Cells.f0, org.telegram.ui.fl] */
    /* JADX WARN: Type inference failed for: r8v16, types: [org.telegram.ui.Cells.z1] */
    /* JADX WARN: Type inference failed for: r8v9, types: [org.telegram.ui.Cells.y1] */
    /* JADX WARN: Type inference failed for: r9v15, types: [org.telegram.ui.Cells.t0] */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.q1 q1Var2;
        an anVar = this.R;
        if (i7 == 0) {
            q1Var = new org.telegram.ui.Cells.q1(this.h, ((org.telegram.ui.ActionBar.e2) anVar).currentAccount, true, anVar.Ya, anVar.Aa);
            q1Var.setResourcesProvider(anVar.Aa);
            if (anVar.Vc == null) {
                anVar.Vc = new lm(anVar);
            }
            q1Var.setDelegate(anVar.Vc);
            q1Var.Xb = anVar.sc;
            if (anVar.h == null) {
                q1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i7 == 1) {
                ?? clVar = new cl(context, anVar.Aa, true);
                clVar.setInvalidateColors(true);
                clVar.setDelegate(new el(this));
                q1Var = clVar;
            } else {
                if (i7 == 2) {
                    ?? z1Var = new org.telegram.ui.Cells.z1(context, anVar.Aa);
                    q1Var2 = z1Var;
                    if (!anVar.S9()) {
                        org.telegram.ui.ActionBar.q6.U(z1Var.getTextView(), org.telegram.ui.ActionBar.j6.wf, anVar.Aa);
                        org.telegram.ui.ActionBar.q6.x(z1Var.getBackgroundLayout(), z1Var.getBackgroundLayout().getBackground(), org.telegram.ui.ActionBar.j6.xf, anVar.Aa, PorterDuff.Mode.MULTIPLY);
                        q1Var2 = z1Var;
                    }
                } else if (i7 == 3) {
                    ?? flVar = new fl(this, context, ((org.telegram.ui.ActionBar.e2) anVar).currentAccount, anVar.Aa);
                    flVar.setDelegate(new w0(this, 22));
                    q1Var2 = flVar;
                } else if (i7 == 4) {
                    q1Var2 = new org.telegram.ui.Cells.w0(context, anVar.Aa);
                } else if (i7 == 6) {
                    q1Var2 = new org.telegram.ui.Cells.ra(((org.telegram.ui.ActionBar.e2) anVar).currentAccount, context, anVar.Aa);
                } else if (i7 == 7) {
                    q1Var2 = new org.telegram.ui.Cells.t0(context, anVar.Aa, false);
                } else if (i7 == 8) {
                    q1Var2 = new gl(this, context, ((org.telegram.ui.ActionBar.e2) anVar).currentAccount, anVar.Aa);
                } else if (i7 == 10) {
                    ?? y1Var = new org.telegram.ui.Cells.y1(context, anVar.Aa);
                    if (anVar.Vc == null) {
                        anVar.Vc = new lm(anVar);
                    }
                    y1Var.setDelegate(anVar.Vc);
                    q1Var2 = y1Var;
                } else {
                    q1Var = null;
                }
                q1Var = q1Var2;
            }
        }
        return i5.c.q(q1Var, q1Var, -1, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0249  */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(v4.e1 e1Var) {
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
        an anVar = this.R;
        View view = e1Var.a;
        if ((view instanceof org.telegram.ui.Cells.q1) || (view instanceof org.telegram.ui.Cells.t0)) {
            anVar.O9();
        }
        boolean z14 = view instanceof org.telegram.ui.Cells.q1;
        boolean z15 = true;
        if (z14) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
            q1Var.W6 = anVar.Q9();
            q1Var.X6 = anVar.ba();
            q1Var.Y6 = anVar.aa();
            q1Var.Z6 = anVar.m9();
            q1Var.a7 = anVar.n9();
            q1Var.H3(-1, true, false);
            org.telegram.messenger.gj gjVar = anVar.V3;
            if (gjVar != null && gjVar.T(messageObject)) {
                q1Var.H3(anVar.W3, false, false);
            }
            if (messageObject.G2() && (V1 = messageObject.V1()) != null && (xoVar = (org.telegram.messenger.xo) anVar.getMessagesController().i4.get(V1.replace("️", ""))) != null) {
                MediaController mediaController = anVar.getMediaController();
                org.telegram.messenger.c accountInstance = anVar.getAccountInstance();
                mediaController.getClass();
                Utilities.d.c(new aa.c0(mediaController, xoVar, accountInstance, z15, 12));
            }
            if (messageObject.g6(false)) {
                q1Var.x3(messageObject, q1Var.getCurrentMessagesGroup(), q1Var.I2(), q1Var.J2(), q1Var.A2(), q1Var.E2());
            } else {
                org.telegram.messenger.bj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    ArrayList arrayList = currentMessagesGroup.d;
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        ((org.telegram.messenger.gj) arrayList.get(i7)).g6(false);
                    }
                }
            }
            if (((org.telegram.ui.ActionBar.e2) anVar).actionBar.x() || anVar.Y9()) {
                anVar.e8 = false;
                anVar.f8 = 0L;
                anVar.g8 = null;
                ArrayList arrayList2 = anVar.p4;
                q1Var.k3(arrayList2 == null || !arrayList2.contains(messageObject), false);
                int i10 = org.telegram.messenger.gj.B0(messageObject.k) == anVar.k6 ? 0 : 1;
                if (anVar.n6[i10].indexOfKey(messageObject.e1()) >= 0) {
                    anVar.Nb(messageObject, q1Var, i10, false);
                    z10 = true;
                } else {
                    q1Var.setDrawSelectionBackground(false);
                    q1Var.m3(false, false, false);
                    z10 = false;
                }
                z11 = true;
            } else {
                q1Var.setDrawSelectionBackground(false);
                q1Var.m3(false, false, false);
                q1Var.k3(false, false);
                z10 = false;
                z11 = false;
            }
            q1Var.l3(!z11, z11 && z10);
            if (anVar.g4 != 7 || anVar.J3 == null || (str = anVar.I3) == null) {
                tj tjVar = anVar.g3;
                if (tjVar != null && tjVar.getVisibility() == 0) {
                    if (anVar.getMediaDataController().c1[org.telegram.messenger.gj.B0(messageObject.k) == anVar.c7 ? (char) 1 : (char) 0].indexOfKey(messageObject.e1()) >= 0 && anVar.getMediaDataController().e1 != null) {
                        q1Var.t3(anVar.getMediaDataController().e1);
                    }
                }
                q1Var.t3(null);
            } else {
                q1Var.t3(str);
            }
            if (!((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode || !q1Var.x6) {
                if (anVar.c8 != Integer.MAX_VALUE) {
                    if (q1Var.getMessageObject() == null || q1Var.getMessageObject().e1() != anVar.c8) {
                        if (q1Var.getCurrentMessagesGroup() != null) {
                            org.telegram.messenger.bj currentMessagesGroup2 = q1Var.getCurrentMessagesGroup();
                            int i11 = anVar.c8;
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
                    q1Var.setHighlighted(z12);
                    z13 = q1Var.x6;
                    if (!z13 && anVar.g8 != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!q1Var.u3(true, anVar.j8, anVar.g8, anVar.e8 || currentTimeMillis - anVar.f8 < 200) && anVar.d8) {
                            org.telegram.ui.Components.cc.a0(anVar).Q(R.raw.error, 36, org.telegram.messenger.hd.M0(2131746435, null)).k(true);
                        }
                        anVar.d8 = false;
                        if (anVar.e8) {
                            anVar.f8 = currentTimeMillis;
                        }
                        anVar.e8 = false;
                    } else if (!z13 && (num = anVar.h8) != null) {
                        q1Var.s3(num.intValue());
                    } else if (z13 && (bArr = anVar.i8) != null) {
                        q1Var.q3(bArr);
                    }
                    if (anVar.c8 != Integer.MAX_VALUE) {
                        anVar.Gc();
                    }
                }
                z12 = false;
                q1Var.setHighlighted(z12);
                z13 = q1Var.x6;
                if (!z13) {
                }
                if (!z13) {
                }
                if (z13) {
                    q1Var.q3(bArr);
                }
                if (anVar.c8 != Integer.MAX_VALUE) {
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.t0) {
            org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
            t0Var.f0 = anVar.Q9();
            t0Var.j0 = anVar.ba();
            anVar.aa();
            anVar.m9();
            t0Var.k0 = anVar.n9();
        } else if (view instanceof org.telegram.ui.Cells.z1) {
            ((org.telegram.ui.Cells.z1) view).getTextView().setTranslationX(anVar.n9() / 2.0f);
        }
        int b10 = e1Var.b();
        int i13 = this.K;
        if (b10 < i13 || b10 >= this.L) {
            return;
        }
        org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) (this.M ? this.N : this.O ? this.Q : anVar.L6).get(b10 - i13);
        if (gjVar3 == null || (message = gjVar3.k) == null || !message.media_unread || !message.mentioned) {
            return;
        }
        if (!((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode && anVar.g4 == 0 && !org.telegram.messenger.gj.R4(gjVar3.k) && !gjVar3.h4()) {
            int i14 = anVar.C6 - 1;
            anVar.C6 = i14;
            if (i14 <= 0) {
                anVar.C6 = 0;
                anVar.D6 = true;
                anVar.rc(false);
            } else {
                anVar.y1.c(2, i14, true);
            }
            anVar.getMessagesController().n3(org.telegram.messenger.t3.T(anVar.e) ? anVar.e.id : 0L, gjVar3.e1(), anVar.k6);
            gjVar3.k.media_unread = false;
        }
        if (z14) {
            org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
            if (((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode) {
                q1Var2.setHighlighted(true);
            } else {
                q1Var2.p3();
            }
        }
    }
}
