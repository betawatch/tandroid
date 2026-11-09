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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ll extends org.telegram.ui.Components.qi0 {
    public int D;
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
    public final /* synthetic */ cn Q;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public ll(cn cnVar, Context context) {
        this.Q = cnVar;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.s = -5;
        this.w = -5;
        this.x = -5;
        this.y = -5;
        this.D = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.h = context;
        TLRPC.User user = cnVar.f;
        this.n = user != null && user.bot;
        C(true);
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void K(boolean z9) {
        cn cnVar = this.Q;
        if (org.telegram.messenger.t10.u(cnVar.f)) {
            if (z9) {
                cnVar.Sc = true;
            }
            if (this.I < 0 || N()) {
                return;
            }
            super.s(this.I);
            S();
        }
    }

    public final ArrayList L() {
        return this.L ? this.M : this.N ? this.P : this.Q.K6;
    }

    public final void M(org.telegram.messenger.ij ijVar) {
        cn cnVar = this.Q;
        int childCount = cnVar.z0.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = cnVar.z0.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var.getMessageObject() == ijVar) {
                    q1Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean N() {
        cn cnVar = this.Q;
        return org.telegram.messenger.t10.v(cnVar.f) && cnVar.b() == 0 && !cnVar.Sc && cnVar.f4 == 0;
    }

    public final void O(boolean z9) {
        boolean z10;
        cn cnVar = this.Q;
        ArrayList arrayList = cnVar.K6;
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify data set changed fragmentOpened=" + cnVar.e6);
        }
        if (z9 && cnVar.e6) {
            v4.l0 itemAnimator = cnVar.z0.getItemAnimator();
            ej ejVar = cnVar.A0;
            if (itemAnimator != ejVar) {
                cnVar.z0.setItemAnimator(ejVar);
            }
        } else {
            cnVar.z0.setItemAnimator(null);
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
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(size);
            if (ijVar.j0) {
                size--;
            } else {
                TLRPC.Message message = ijVar.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                        z10 = true;
                    }
                }
            }
        }
        z10 = false;
        boolean[] zArr = cnVar.S6;
        if ((zArr[0] && (cnVar.b7 == 0 || zArr[1])) || z10) {
            cnVar.a7(((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow);
        }
    }

    public final void P(int i7, boolean z9) {
        org.telegram.messenger.ij messageObject;
        if (org.telegram.messenger.r2.a) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i7);
            org.telegram.ui.Cells.f1.u(z9 ? " with thanos effect" : "", sb2);
        }
        cn cnVar = this.Q;
        if (((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow) {
            v4.l0 itemAnimator = cnVar.z0.getItemAnimator();
            ej ejVar = cnVar.A0;
            if (itemAnimator != ejVar) {
                cnVar.z0.setItemAnimator(ejVar);
            }
        } else {
            cnVar.z0.setItemAnimator(null);
        }
        if (z9 && cnVar.A0 != null) {
            v4.l0 itemAnimator2 = cnVar.z0.getItemAnimator();
            ej ejVar2 = cnVar.A0;
            if (itemAnimator2 == ejVar2) {
                v4.d1 K = cnVar.z0.K(i7);
                if (K == null) {
                    ejVar2.getClass();
                } else {
                    ejVar2.S.add(K);
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
        cn cnVar = this.Q;
        ArrayList arrayList = cnVar.K6;
        if (cnVar.B0 == null || this.L || this.N) {
            return;
        }
        int i11 = 0;
        if (!cnVar.P4 && cnVar.Z7 != null) {
            int childCount = cnVar.z0.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = cnVar.z0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.messenger.ij messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                    org.telegram.messenger.ij ijVar = cnVar.Z7;
                    if (messageObject == ijVar) {
                        if (arrayList.indexOf(ijVar) >= 0) {
                            i10 = arrayList.indexOf(cnVar.Z7) + this.J;
                            i11 = cnVar.g9(childAt);
                        }
                    }
                }
                i12++;
            }
        }
        i10 = -1;
        g(i7);
        if (i10 != -1) {
            cnVar.B0.h1(i10, i11);
        }
    }

    public final org.telegram.ui.Cells.q1 R(org.telegram.messenger.ij ijVar, boolean z9, boolean z10) {
        cn cnVar = this.Q;
        if (z9) {
            int childCount = cnVar.z0.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = cnVar.z0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject() == ijVar && TextUtils.equals(q1Var.y5, q1Var.P5.k.post_author)) {
                        q1Var.w3(ijVar, q1Var.getCurrentMessagesGroup(), q1Var.H2(), q1Var.I2(), q1Var.z2(), q1Var.D2());
                        return q1Var;
                    }
                }
                i7++;
                ijVar = ijVar;
            }
        }
        org.telegram.messenger.ij ijVar2 = ijVar;
        int indexOf = (this.L ? this.M : this.N ? this.P : cnVar.K6).indexOf(ijVar2);
        if (indexOf == -1) {
            return null;
        }
        if (!z10) {
            Q(this.J + indexOf);
            return null;
        }
        int i10 = cn.md;
        cn.md = i10 + 1;
        ijVar2.k1 = i10;
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
        cn cnVar = this.Q;
        boolean[] zArr = cnVar.S6;
        this.r = 0;
        ArrayList arrayList = this.L ? this.M : this.N ? this.P : cnVar.K6;
        if (cnVar.f4 == 3 && cnVar.kb) {
            this.r = 1;
            this.s = 0;
        } else {
            this.s = -5;
        }
        this.w = -5;
        this.x = -5;
        this.D = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        if (N()) {
            int i12 = this.r;
            this.r = i12 + 1;
            this.I = i12;
        }
        if (arrayList.isEmpty()) {
            this.E = -5;
            this.F = -5;
            this.J = 0;
            this.K = 0;
            TLRPC.User user4 = cnVar.f;
            if (user4 != null && !org.telegram.messenger.t10.t(user4) && !org.telegram.messenger.t10.z(cnVar.f)) {
                TLRPC.PeerSettings C13 = cnVar.getMessagesController().C1(cnVar.f.id);
                int i13 = org.telegram.ui.Cells.ra.P;
                if (C13 != null && ((C13.phone_country != null || C13.registration_month != null) && !org.telegram.messenger.qp.F2(cnVar.f) && cnVar.f4 == 0)) {
                    int i14 = this.r;
                    this.r = i14 + 1;
                    this.D = i14;
                    return;
                }
            }
            if (org.telegram.messenger.t10.z(cnVar.f) || ((user = cnVar.f) != null && user.bot && !org.telegram.messenger.qp.F2(user) && cnVar.f4 == 0)) {
                int i15 = this.r;
                this.r = i15 + 1;
                this.x = i15;
                return;
            }
            return;
        }
        if (!this.N) {
            boolean[] zArr2 = cnVar.U6;
            if ((!zArr2[0] || (cnVar.b7 != 0 && !zArr2[1])) && !cnVar.V6) {
                int i16 = this.r;
                this.r = i16 + 1;
                this.F = i16;
                int i17 = this.r;
                this.J = i17;
                int size = arrayList.size() + i17;
                this.r = size;
                this.K = size;
                user2 = cnVar.f;
                if (user2 != null && !org.telegram.messenger.t10.t(user2) && !org.telegram.messenger.t10.z(cnVar.f)) {
                    C1 = cnVar.getMessagesController().C1(cnVar.f.id);
                    int i18 = org.telegram.ui.Cells.ra.P;
                    if (C1 != null && ((C1.phone_country != null || C1.registration_month != null) && !org.telegram.messenger.qp.F2(cnVar.f) && cnVar.f4 == 0 && zArr[0])) {
                        C12 = cnVar.getMessagesController().C1(cnVar.f.id);
                        i10 = C12.name_change_date;
                        if (i10 != 0 || (i11 = C12.photo_change_date) == 0) {
                            if (i10 != 0) {
                                int i19 = this.r;
                                this.r = i19 + 1;
                                this.H = i19;
                            }
                            if (C12.photo_change_date != 0) {
                                int i20 = this.r;
                                this.r = i20 + 1;
                                this.G = i20;
                            }
                        } else if (i10 < i11) {
                            int i21 = this.r;
                            this.H = i21;
                            this.r = i21 + 2;
                            this.G = i21 + 1;
                        } else {
                            int i22 = this.r;
                            this.G = i22;
                            this.r = i22 + 2;
                            this.H = i22 + 1;
                        }
                        int i23 = this.r;
                        this.r = i23 + 1;
                        this.D = i23;
                        i7 = cnVar.f4;
                        if (i7 == 9) {
                            int i24 = this.r;
                            this.s = i24;
                            this.r = i24 + 2;
                            this.w = i24 + 1;
                        }
                        if (i7 == 5 && !kg.t1.g(cnVar.e4)) {
                            int i25 = this.r;
                            this.r = i25 + 1;
                            this.s = i25;
                        }
                        if (this.N ? !(!(zArr[0] && (cnVar.b7 == 0 || zArr[1])) && (org.telegram.messenger.g0.Q1() || cnVar.u4 || cnVar.f != null)) : this.O) {
                            this.E = -5;
                            return;
                        }
                        int i26 = this.r;
                        this.r = i26 + 1;
                        this.E = i26;
                        return;
                    }
                }
                if ((!org.telegram.messenger.t10.z(cnVar.f) || ((user3 = cnVar.f) != null && user3.bot && !org.telegram.messenger.qp.F2(user3) && cnVar.f4 == 0)) && zArr[0]) {
                    int i27 = this.r;
                    this.r = i27 + 1;
                    this.x = i27;
                }
                i7 = cnVar.f4;
                if (i7 == 9) {
                }
                if (i7 == 5) {
                    int i252 = this.r;
                    this.r = i252 + 1;
                    this.s = i252;
                }
                if (this.N) {
                    int i262 = this.r;
                    this.r = i262 + 1;
                    this.E = i262;
                    return;
                } else {
                    int i2622 = this.r;
                    this.r = i2622 + 1;
                    this.E = i2622;
                    return;
                }
            }
        }
        this.F = -5;
        int i172 = this.r;
        this.J = i172;
        int size2 = arrayList.size() + i172;
        this.r = size2;
        this.K = size2;
        user2 = cnVar.f;
        if (user2 != null) {
            C1 = cnVar.getMessagesController().C1(cnVar.f.id);
            int i182 = org.telegram.ui.Cells.ra.P;
            if (C1 != null) {
                C12 = cnVar.getMessagesController().C1(cnVar.f.id);
                i10 = C12.name_change_date;
                if (i10 != 0) {
                }
                if (i10 != 0) {
                }
                if (C12.photo_change_date != 0) {
                }
                int i232 = this.r;
                this.r = i232 + 1;
                this.D = i232;
                i7 = cnVar.f4;
                if (i7 == 9) {
                }
                if (i7 == 5) {
                }
                if (this.N) {
                }
            }
        }
        if (!org.telegram.messenger.t10.z(cnVar.f)) {
        }
        int i272 = this.r;
        this.r = i272 + 1;
        this.x = i272;
        i7 = cnVar.f4;
        if (i7 == 9) {
        }
        if (i7 == 5) {
        }
        if (this.N) {
        }
    }

    public final void T() {
        int i7 = this.r;
        int i10 = this.x;
        int i11 = this.D;
        int i12 = this.s;
        int i13 = this.w;
        int i14 = this.E;
        int i15 = this.F;
        int i16 = this.J;
        int i17 = this.K;
        int i18 = this.G;
        int i19 = this.H;
        int i20 = this.I;
        S();
        if (i7 == this.r && i10 == this.x && i14 == this.E && i15 == this.F && i16 == this.J && i17 == this.K && i12 == this.s && i13 == this.w && i11 == this.D && i18 == this.G && i19 == this.H && i20 == this.I) {
            return;
        }
        O(false);
    }

    @Override // v4.g0
    public final int b() {
        this.y = -5;
        cn cnVar = this.Q;
        a0.h hVar = cnVar.t8;
        if (cnVar.c6.get(cnVar.r4, 0) == 0) {
            return this.r;
        }
        TLRPC.User user = cnVar.f;
        if (user == null || !user.bot || cnVar.f4 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(cnVar.f.id)).description == null && ((TL_bots.BotInfo) hVar.f(cnVar.f.id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(cnVar.f.id)).description_document == null)) && !org.telegram.messenger.t10.z(cnVar.f) && !org.telegram.messenger.t10.u(cnVar.f))) {
            return 0;
        }
        this.y = 0;
        return 1;
    }

    @Override // v4.g0
    public final long c(int i7) {
        cn cnVar = this.Q;
        if (cnVar.c6.get(cnVar.r4, 0) != 0 && i7 == this.y) {
            return 1L;
        }
        ArrayList arrayList = this.L ? this.M : this.N ? this.P : cnVar.K6;
        if (i7 >= this.J && i7 < this.K) {
            return ((org.telegram.messenger.ij) arrayList.get(i7 - r1)).k1;
        }
        if (i7 == this.x || i7 == this.y) {
            return 1L;
        }
        if (i7 == this.E) {
            return 2L;
        }
        if (i7 == this.F) {
            return 3L;
        }
        if (i7 == this.s) {
            return 4L;
        }
        if (i7 == this.D) {
            return 6L;
        }
        if (i7 == this.G) {
            return 7L;
        }
        if (i7 == this.H) {
            return 8L;
        }
        if (i7 == this.I) {
            return 9L;
        }
        return i7 == this.w ? 10L : 5L;
    }

    @Override // v4.g0
    public final int d(int i7) {
        cn cnVar = this.Q;
        if (cnVar.c6.get(cnVar.r4, 0) != 0 && i7 == this.y) {
            return 3;
        }
        if (i7 == this.s || i7 == this.w) {
            return 1;
        }
        int i10 = this.J;
        if (i7 >= i10 && i7 < this.K) {
            return ((org.telegram.messenger.ij) (this.L ? this.M : this.N ? this.P : cnVar.K6).get(i7 - i10)).U;
        }
        if (i7 == this.x) {
            return 3;
        }
        if (i7 == this.D) {
            return 6;
        }
        if (i7 == this.H || i7 == this.G) {
            return 7;
        }
        return i7 == this.I ? 8 : 4;
    }

    @Override // org.telegram.ui.Components.qi0, v4.g0
    public final void f() {
        O(false);
    }

    @Override // org.telegram.ui.Components.qi0, v4.g0
    public final void g(int i7) {
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item changed " + i7);
        }
        cn cnVar = this.Q;
        if (!((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow || cnVar.b1) {
            cnVar.z0.setItemAnimator(null);
        } else {
            v4.l0 itemAnimator = cnVar.z0.getItemAnimator();
            ej ejVar = cnVar.A0;
            if (itemAnimator != ejVar) {
                cnVar.z0.setItemAnimator(ejVar);
            }
        }
        S();
        try {
            super.g(i7);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.qi0, v4.g0
    public final void i(int i7) {
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item inserted " + i7);
        }
        cn cnVar = this.Q;
        if (((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow) {
            v4.l0 itemAnimator = cnVar.z0.getItemAnimator();
            ej ejVar = cnVar.A0;
            if (itemAnimator != ejVar) {
                cnVar.z0.setItemAnimator(ejVar);
            }
        } else {
            cnVar.z0.setItemAnimator(null);
        }
        S();
        try {
            super.i(i7);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // v4.g0
    public final void j(int i7, int i10) {
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item moved" + i7 + ":" + i10);
        }
        cn cnVar = this.Q;
        if (((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow) {
            v4.l0 itemAnimator = cnVar.z0.getItemAnimator();
            ej ejVar = cnVar.A0;
            if (itemAnimator != ejVar) {
                cnVar.z0.setItemAnimator(ejVar);
            }
        } else {
            cnVar.z0.setItemAnimator(null);
        }
        S();
        try {
            super.j(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.qi0, v4.g0
    public final void k(int i7, int i10) {
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item range changed " + i7 + ":" + i10);
        }
        cn cnVar = this.Q;
        if (((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow) {
            v4.l0 itemAnimator = cnVar.z0.getItemAnimator();
            ej ejVar = cnVar.A0;
            if (itemAnimator != ejVar) {
                cnVar.z0.setItemAnimator(ejVar);
            }
        } else {
            cnVar.z0.setItemAnimator(null);
        }
        S();
        try {
            super.k(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.qi0, v4.g0
    public final void o(int i7, int i10) {
        int i11;
        int i12;
        cn cnVar = this.Q;
        ArrayList arrayList = cnVar.K6;
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item range inserted " + i7 + ":" + i10);
        }
        if (((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow) {
            v4.l0 itemAnimator = cnVar.z0.getItemAnimator();
            ej ejVar = cnVar.A0;
            if (itemAnimator != ejVar) {
                cnVar.z0.setItemAnimator(ejVar);
            }
        } else {
            cnVar.z0.setItemAnimator(null);
        }
        S();
        if (i7 == 1 && i10 > 0 && (i11 = i7 + i10) >= (i12 = this.J) && i11 < this.K) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i11 - i12);
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get((i11 - this.J) - 1);
            if ((cnVar.e != null && ijVar.Z0() == ijVar2.Z0()) || (cnVar.f != null && ijVar.P3() == ijVar2.P3())) {
                g(i7);
            }
        }
        try {
            super.o(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.qi0, v4.g0
    public final void p(int i7, int i10) {
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item range removed" + i7 + ":" + i10);
        }
        cn cnVar = this.Q;
        if (((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow) {
            v4.l0 itemAnimator = cnVar.z0.getItemAnimator();
            ej ejVar = cnVar.A0;
            if (itemAnimator != ejVar) {
                cnVar.z0.setItemAnimator(ejVar);
            }
        } else {
            cnVar.z0.setItemAnimator(null);
        }
        S();
        try {
            super.p(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.qi0, v4.g0
    public final void s(int i7) {
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item removed " + i7);
        }
        cn cnVar = this.Q;
        if (((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow) {
            v4.l0 itemAnimator = cnVar.z0.getItemAnimator();
            ej ejVar = cnVar.A0;
            if (itemAnimator != ejVar) {
                cnVar.z0.setItemAnimator(ejVar);
            }
        } else {
            cnVar.z0.setItemAnimator(null);
        }
        S();
        try {
            super.s(i7);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x025b, code lost:
    
        if (r4.V4.containsKey(java.lang.Integer.valueOf(((org.telegram.messenger.ij) r8.get(0)).e1())) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x05b8, code lost:
    
        if (r6 != (r2.h1 == null ? org.telegram.messenger.ij.b2(((org.telegram.ui.ActionBar.f2) r4).currentAccount, r2.k, r9, r10) : r11.id)) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x05e7, code lost:
    
        if (org.telegram.messenger.ij.B1(r5.k.peer_id) == org.telegram.messenger.ij.B1(r2.k.peer_id)) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x065a, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0602, code lost:
    
        if (r2.R1() == r5.R1()) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0658, code lost:
    
        if (org.telegram.messenger.ij.B1(r6) == org.telegram.messenger.ij.B1(r5.k.fwd_from.from_id)) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0922, code lost:
    
        if (r4.A0 == null) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x03f2, code lost:
    
        if (r4.f4 != 9) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x041e, code lost:
    
        if (org.telegram.messenger.ij.B1(r5.k.peer_id) == org.telegram.messenger.ij.B1(r10.k.peer_id)) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0491, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0439, code lost:
    
        if (r10.R1() == r5.R1()) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x048f, code lost:
    
        if (org.telegram.messenger.ij.B1(r6) == org.telegram.messenger.ij.B1(r5.k.fwd_from.from_id)) goto L267;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0266 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0a20  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0a09  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v12 */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.UserFull userFull;
        TLObject tLObject;
        int i10;
        int i11;
        org.telegram.messenger.ij ijVar;
        boolean z9;
        boolean z10;
        boolean z11;
        int i12;
        ArrayList arrayList;
        long j3;
        int i13;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14;
        boolean z15;
        int d;
        ArrayList arrayList2;
        HashMap hashMap;
        ArrayList arrayList3;
        int i15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        String str;
        byte[] bArr;
        Integer num;
        int indexOf;
        ?? r10;
        org.telegram.messenger.ej ejVar;
        sj sjVar;
        int i16;
        int i17;
        boolean z20;
        org.telegram.ui.Components.u40 u40Var;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str2;
        boolean z21;
        boolean z22;
        long j10;
        org.telegram.messenger.ij ijVar2;
        String str3;
        boolean z23;
        int i18;
        TLRPC.ChatFull chatFull;
        View view = d1Var.a;
        cn cnVar = this.Q;
        a0.h hVar = cnVar.t8;
        ArrayList arrayList4 = cnVar.I4;
        HashMap hashMap2 = cnVar.J4;
        if (i7 == this.x || i7 == this.y) {
            org.telegram.ui.Cells.f0 f0Var = (org.telegram.ui.Cells.f0) view;
            if (org.telegram.messenger.t10.z(cnVar.f)) {
                f0Var.b(false, 0L, org.telegram.messenger.id.L0(2131746267), null, null, null);
            } else {
                TLRPC.User user = cnVar.f;
                if (user == null || user.id != 489000) {
                    TL_bots.BotInfo botInfo = hVar.m() != 0 ? (TL_bots.BotInfo) hVar.f(cnVar.f.id) : null;
                    boolean z24 = (botInfo == null || (TextUtils.isEmpty(botInfo.description) && botInfo.description_photo == null && botInfo.description_document == null)) && org.telegram.messenger.t10.t(cnVar.f) && (userFull = cnVar.q8) != null && userFull.bot_manager_id != 0 && cnVar.f.bot_can_edit;
                    TLRPC.User user2 = cnVar.f;
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
                    f0Var.b(true, j11, str4, tLObject, botInfo, z24 ? org.telegram.messenger.m5.l(((org.telegram.ui.ActionBar.f2) cnVar).currentAccount, cnVar.q8.bot_manager_id) : null);
                } else {
                    f0Var.b(false, 0L, org.telegram.messenger.id.L0(2131743617), null, null, null);
                }
            }
            cn.p4(cnVar, f0Var);
            return;
        }
        if (i7 == this.I) {
            ((org.telegram.ui.Cells.a0) view).setDialogId(cnVar.a());
            return;
        }
        if (i7 == this.D) {
            org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
            TLRPC.EncryptedChat encryptedChat = cnVar.h;
            long a10 = encryptedChat != null ? encryptedChat.user_id : cnVar.a();
            raVar.b(a10, cnVar.getMessagesController().C1(a10));
            return;
        }
        if (i7 == this.F || i7 == this.E) {
            ((org.telegram.ui.Cells.w0) view).setProgressVisible(cnVar.Z6 > 1);
            return;
        }
        if (i7 == this.H) {
            if (cnVar.getMessagesController().C1(cnVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.t0) view).setCustomText(org.telegram.messenger.id.a0(null, null, 2131751794, org.telegram.messenger.id.N(cnVar.getConnectionsManager().getCurrentTime() - r1.name_change_date)));
            return;
        }
        if (i7 == this.G) {
            if (cnVar.getMessagesController().C1(cnVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.t0) view).setCustomText(org.telegram.messenger.id.a0(null, null, 2131751793, org.telegram.messenger.id.N(cnVar.getConnectionsManager().getCurrentTime() - r1.photo_change_date)));
            return;
        }
        if (i7 == this.s) {
            org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
            cn.q4(cnVar);
            t0Var.setMessageObject(cnVar.W3);
            int i19 = cnVar.f4;
            if (i19 == 3) {
                t0Var.setCustomText(org.telegram.messenger.id.M0(2131745894, null));
            } else if (i19 == 5) {
                t0Var.setCustomText(org.telegram.messenger.id.M0(2131752671, null));
            } else if (i19 == 9) {
                t0Var.setCustomText(org.telegram.messenger.id.M0(2131742893, null));
            }
            t0Var.setAlpha(1.0f);
            t0Var.setSpoilersSuppressed(cnVar.z0.getScrollState() != 0);
            return;
        }
        if (i7 == this.w) {
            org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) view;
            cn.r4(cnVar);
            t0Var2.setMessageObject(cnVar.X3);
            t0Var2.setCustomText(org.telegram.messenger.id.M0(2131742894, null));
            t0Var2.setAlpha(1.0f);
            t0Var2.setSpoilersSuppressed(cnVar.z0.getScrollState() != 0);
            return;
        }
        int i20 = this.J;
        if (i7 < i20 || i7 >= this.K) {
            return;
        }
        ArrayList arrayList5 = this.L ? this.M : this.N ? this.P : cnVar.K6;
        org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList5.get(i7 - i20);
        if (!(view instanceof org.telegram.ui.Cells.q1)) {
            ArrayList arrayList6 = arrayList5;
            if (!(view instanceof org.telegram.ui.Cells.t0)) {
                if (view instanceof org.telegram.ui.Cells.z1) {
                    org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                    z1Var.setText(org.telegram.messenger.id.M0(2131743838, null));
                    z1Var.getTextView().setTranslationX(cnVar.m9() / 2.0f);
                    if (cnVar.T7 != 0) {
                        cnVar.T7 = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            if ((ijVar3 == null || !ijVar3.j0) && (i11 = (i10 = i7 + 1) - this.J) >= 0 && i11 < arrayList6.size()) {
                org.telegram.messenger.ij ijVar4 = (org.telegram.messenger.ij) arrayList6.get(i10 - this.J);
                if (ijVar4 == null || !ijVar4.j0) {
                    ijVar = ijVar4;
                } else {
                    int i21 = i7 + 2;
                    int i22 = i21 - this.J;
                    ijVar = (i22 < 0 || i22 >= arrayList6.size()) ? null : (org.telegram.messenger.ij) arrayList6.get(i21 - this.J);
                }
                if (ijVar == null || (ijVar3 != null && ijVar.Y1() != ijVar3.Y1())) {
                    z9 = true;
                    org.telegram.ui.Cells.t0 t0Var3 = (org.telegram.ui.Cells.t0) view;
                    t0Var3.e0 = cnVar.P9();
                    t0Var3.i0 = cnVar.aa();
                    cnVar.Z9();
                    cnVar.l9();
                    t0Var3.j0 = cnVar.m9();
                    t0Var3.f0 = org.telegram.messenger.t3.c0(cnVar.e);
                    t0Var3.g0 = org.telegram.messenger.t3.p0(cnVar.e);
                    t0Var3.h0 = org.telegram.messenger.t10.u(cnVar.f);
                    boolean z25 = t0Var3.k0 == z9;
                    t0Var3.k0 = z9;
                    t0Var3.g0(ijVar3, z25);
                    t0Var3.setAlpha(1.0f);
                    t0Var3.setShowTopic(true);
                    t0Var3.setSpoilersSuppressed(cnVar.z0.getScrollState() == 0);
                    return;
                }
            }
            z9 = false;
            org.telegram.ui.Cells.t0 t0Var32 = (org.telegram.ui.Cells.t0) view;
            t0Var32.e0 = cnVar.P9();
            t0Var32.i0 = cnVar.aa();
            cnVar.Z9();
            cnVar.l9();
            t0Var32.j0 = cnVar.m9();
            t0Var32.f0 = org.telegram.messenger.t3.c0(cnVar.e);
            t0Var32.g0 = org.telegram.messenger.t3.p0(cnVar.e);
            t0Var32.h0 = org.telegram.messenger.t10.u(cnVar.f);
            if (t0Var32.k0 == z9) {
            }
            t0Var32.k0 = z9;
            t0Var32.g0(ijVar3, z25);
            t0Var32.setAlpha(1.0f);
            t0Var32.setShowTopic(true);
            t0Var32.setSpoilersSuppressed(cnVar.z0.getScrollState() == 0);
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
        org.telegram.messenger.dj t92 = cnVar.t9(ijVar3);
        q1Var.e6 = cnVar.e != null || org.telegram.messenger.t10.B(cnVar.f) || org.telegram.messenger.t10.z(cnVar.f) || cnVar.f4 == 7;
        q1Var.D.a(false, false);
        q1Var.f6 = org.telegram.messenger.t10.u(cnVar.f);
        q1Var.r6 = cnVar.X9();
        int i23 = cnVar.f4;
        q1Var.g6 = i23 == 3;
        q1Var.h6 = i23 == 3 && cnVar.kb;
        TLRPC.User user3 = cnVar.f;
        q1Var.i6 = user3 != null && user3.bot;
        q1Var.j6 = org.telegram.messenger.t3.T(cnVar.e) && cnVar.e.megagroup;
        q1Var.k6 = org.telegram.messenger.t3.c0(cnVar.e);
        q1Var.l6 = org.telegram.messenger.t3.p0(cnVar.e);
        q1Var.m6 = org.telegram.messenger.t3.c0(cnVar.e) && cnVar.v4 && cnVar.b() == 1;
        q1Var.n6 = (cnVar.r4 != 0 || (q1Var.k6 && cnVar.v4)) && !q1Var.l6;
        int i24 = cnVar.f4;
        if (i24 != 1 && i24 != 9 && org.telegram.messenger.t3.T(cnVar.e)) {
            TLRPC.Chat chat = cnVar.e;
            if (chat.has_link && !chat.megagroup) {
                z10 = true;
                q1Var.o6 = z10;
                if (cnVar.f4 == 0) {
                    if (!cnVar.V4.containsKey(Integer.valueOf(ijVar3.e1()))) {
                        if (t92 != null) {
                            ArrayList arrayList7 = t92.d;
                            if (!arrayList7.isEmpty()) {
                            }
                        }
                    }
                    z11 = true;
                    q1Var.p6 = z11;
                    i12 = cnVar.f4;
                    if (i12 != 1 || i12 == 9 || (chatFull = cnVar.p8) == null) {
                        arrayList = arrayList5;
                        j3 = 0;
                    } else {
                        arrayList = arrayList5;
                        j3 = chatFull.linked_chat_id;
                    }
                    q1Var.s6 = j3;
                    if (i12 == 7 || cnVar.c4 != 1) {
                        q1Var.t6 = org.telegram.messenger.t10.z(cnVar.f);
                    } else {
                        q1Var.t6 = org.telegram.messenger.t10.y(org.telegram.messenger.ij.B0(ijVar3.k));
                    }
                    q1Var.u6 = cnVar.f4 == 2;
                    q1Var.V6 = cnVar.P9();
                    q1Var.W6 = cnVar.aa();
                    q1Var.X6 = cnVar.Z9();
                    q1Var.Y6 = cnVar.l9();
                    q1Var.Z6 = cnVar.m9();
                    if (ijVar3.r4()) {
                        org.telegram.messenger.g0.K(q1Var, new ai.m0(24));
                    }
                    int i25 = i7 + 2;
                    if (t92 != null) {
                        ArrayList arrayList8 = t92.e;
                        org.telegram.messenger.aj d2 = t92.d(ijVar3);
                        if (d2 == null) {
                            z12 = false;
                            z13 = false;
                            z14 = false;
                            i14 = -100;
                            i13 = -100;
                        } else {
                            if (!t92.i) {
                                if ((d2.l & 4) != 0) {
                                    i18 = t92.n ? arrayList8.indexOf(d2) + (i7 - arrayList8.size()) : arrayList8.indexOf(d2) + i7 + 1;
                                    z23 = false;
                                    z14 = false;
                                } else {
                                    z23 = true;
                                    z14 = true;
                                    i18 = -100;
                                }
                                if ((d2.l & 8) != 0) {
                                    z12 = z23;
                                    i14 = t92.n ? arrayList8.indexOf(d2) + i7 + 1 : arrayList8.indexOf(d2) + (i7 - arrayList8.size());
                                    i13 = i18;
                                    z15 = false;
                                } else {
                                    z12 = z23;
                                    i14 = -100;
                                    i13 = i18;
                                    z15 = true;
                                }
                                z13 = z15;
                                int d10 = d(i14);
                                d = d(i13);
                                d(i25);
                                if ((ijVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d10 == d1Var.f) {
                                    arrayList3 = arrayList;
                                    org.telegram.messenger.ij ijVar5 = (org.telegram.messenger.ij) arrayList3.get(i14 - this.J);
                                    boolean z26 = ijVar5.P3() == ijVar3.P3() && (Math.abs(ijVar5.k.date - ijVar3.k.date) <= 300 || cnVar.f4 == 9);
                                    if (z26) {
                                        TLRPC.Message message2 = ijVar5.k;
                                        arrayList2 = arrayList4;
                                        hashMap = hashMap2;
                                        if (message2 == null || message2.paid_message_stars <= 0) {
                                            if (ijVar3.y3() || ijVar5.y3()) {
                                                if (ijVar3.y3() && ijVar5.y3() && Math.abs(ijVar5.k.fwd_from.date - ijVar3.k.fwd_from.date) <= 300) {
                                                    TLRPC.MessageFwdHeader messageFwdHeader2 = ijVar5.k.fwd_from;
                                                    String str5 = messageFwdHeader2.from_name;
                                                    if (str5 == null || (str3 = ijVar3.k.fwd_from.from_name) == null) {
                                                        TLRPC.Peer peer = messageFwdHeader2.from_id;
                                                        if (peer != null) {
                                                            if (ijVar3.k.fwd_from.from_id != null) {
                                                            }
                                                        }
                                                    } else {
                                                        z26 = str5.equals(str3);
                                                        if (org.telegram.messenger.m5.o(ijVar5.k.guestchat_via_from) != org.telegram.messenger.m5.o(ijVar3.k.guestchat_via_from)) {
                                                            z13 = false;
                                                        }
                                                    }
                                                }
                                            } else if (cnVar.e != null) {
                                                long Z0 = ijVar5.Z0();
                                                z26 = Z0 == ijVar3.Z0();
                                                if (!z15) {
                                                    if (z26) {
                                                        if (Z0 < 0) {
                                                            if (cnVar.e.megagroup) {
                                                            }
                                                        }
                                                    }
                                                }
                                                if (org.telegram.messenger.m5.o(ijVar5.k.guestchat_via_from) != org.telegram.messenger.m5.o(ijVar3.k.guestchat_via_from)) {
                                                }
                                            } else {
                                                if (org.telegram.messenger.t10.B(cnVar.f) || org.telegram.messenger.t10.z(cnVar.f)) {
                                                    if (!ijVar3.Y3()) {
                                                        if (!ijVar5.Y3()) {
                                                        }
                                                    }
                                                } else if (cnVar.f4 == 7) {
                                                }
                                                if (org.telegram.messenger.m5.o(ijVar5.k.guestchat_via_from) != org.telegram.messenger.m5.o(ijVar3.k.guestchat_via_from)) {
                                                }
                                            }
                                        }
                                        z26 = false;
                                        if (org.telegram.messenger.m5.o(ijVar5.k.guestchat_via_from) != org.telegram.messenger.m5.o(ijVar3.k.guestchat_via_from)) {
                                        }
                                    } else {
                                        arrayList2 = arrayList4;
                                        hashMap = hashMap2;
                                    }
                                    z13 = z26;
                                } else {
                                    arrayList2 = arrayList4;
                                    hashMap = hashMap2;
                                    arrayList3 = arrayList;
                                }
                                i15 = i13 - this.J;
                                if (i15 >= 0 && i15 < arrayList3.size()) {
                                    ijVar2 = (org.telegram.messenger.ij) arrayList3.get(i13 - this.J);
                                    if (ijVar2 != null && ijVar2.j0) {
                                        int i26 = i13 + 1;
                                        int i27 = i26 - this.J;
                                        ijVar2 = (i27 >= 0 || i27 >= arrayList3.size()) ? null : (org.telegram.messenger.ij) arrayList3.get(i26 - this.J);
                                    }
                                    if (ijVar2 != null && ijVar2.Y1() == ijVar3.Y1()) {
                                        z16 = false;
                                        int i28 = this.J;
                                        boolean z27 = i7 != i28;
                                        if (d == d1Var.f) {
                                            org.telegram.messenger.ij ijVar6 = (org.telegram.messenger.ij) arrayList3.get(i13 - i28);
                                            z12 = !(ijVar6.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && ijVar6.P3() == ijVar3.P3() && (Math.abs(ijVar6.k.date - ijVar3.k.date) <= 300 || cnVar.f4 == 9);
                                            if (z12) {
                                                if (ijVar3.y3() || ijVar6.y3()) {
                                                    if (ijVar3.y3() && ijVar6.y3() && Math.abs(ijVar3.k.fwd_from.date - ijVar6.k.fwd_from.date) <= 300) {
                                                        TLRPC.MessageFwdHeader messageFwdHeader3 = ijVar6.k.fwd_from;
                                                        String str6 = messageFwdHeader3.from_name;
                                                        if (str6 == null || (str2 = ijVar3.k.fwd_from.from_name) == null) {
                                                            TLRPC.Peer peer2 = messageFwdHeader3.from_id;
                                                            if (peer2 != null) {
                                                                if (ijVar3.k.fwd_from.from_id != null) {
                                                                }
                                                            }
                                                        } else {
                                                            z12 = str6.equals(str2);
                                                            if (org.telegram.messenger.m5.o(ijVar6.k.guestchat_via_from) != org.telegram.messenger.m5.o(ijVar3.k.guestchat_via_from)) {
                                                                z12 = false;
                                                            }
                                                        }
                                                    }
                                                    z12 = false;
                                                    if (org.telegram.messenger.m5.o(ijVar6.k.guestchat_via_from) != org.telegram.messenger.m5.o(ijVar3.k.guestchat_via_from)) {
                                                    }
                                                } else if (cnVar.e != null) {
                                                    long Z02 = ijVar6.Z0();
                                                    boolean z28 = (Z02 != ijVar3.Z0() || ijVar3.y3() || ijVar6.y3()) ? false : true;
                                                    if (!z14 && z28 && Z02 < 0 && cnVar.e.megagroup && cnVar.f4 != 9) {
                                                        z28 = false;
                                                    }
                                                    if (z28 && cnVar.S9()) {
                                                        TLRPC.TL_forumTopic tL_forumTopic = ijVar3.h1;
                                                        if (tL_forumTopic == null) {
                                                            z21 = true;
                                                            z22 = false;
                                                            j10 = org.telegram.messenger.ij.b2(((org.telegram.ui.ActionBar.f2) cnVar).currentAccount, ijVar3.k, true, false);
                                                        } else {
                                                            z21 = true;
                                                            z22 = false;
                                                            j10 = tL_forumTopic.id;
                                                        }
                                                    }
                                                    z12 = z28;
                                                    if (org.telegram.messenger.m5.o(ijVar6.k.guestchat_via_from) != org.telegram.messenger.m5.o(ijVar3.k.guestchat_via_from)) {
                                                    }
                                                } else {
                                                    if (org.telegram.messenger.t10.B(cnVar.f) || org.telegram.messenger.t10.z(cnVar.f)) {
                                                        if (!ijVar3.Y3()) {
                                                            if (!ijVar6.Y3()) {
                                                            }
                                                        }
                                                        z12 = false;
                                                    } else if (cnVar.f4 == 7) {
                                                    }
                                                    if (org.telegram.messenger.m5.o(ijVar6.k.guestchat_via_from) != org.telegram.messenger.m5.o(ijVar3.k.guestchat_via_from)) {
                                                    }
                                                }
                                            }
                                        }
                                        if (org.telegram.messenger.t3.T(cnVar.e) && cnVar.e.megagroup && ijVar3.Z0() <= 0 && (messageFwdHeader = ijVar3.k.fwd_from) != null && (messageFwdHeader.saved_from_peer instanceof TLRPC.TL_peerChannel)) {
                                            if (!z14) {
                                                z12 = false;
                                            }
                                            if (!z15) {
                                                z13 = false;
                                            }
                                        }
                                        if (!z14 && (message = ijVar3.k) != null && message.paid_message_stars > 0) {
                                            z12 = false;
                                        }
                                        boolean z29 = false;
                                        ijVar3.g6(false);
                                        if (t92 != null) {
                                            ArrayList arrayList9 = t92.d;
                                            int i29 = 0;
                                            while (i29 < arrayList9.size()) {
                                                ((org.telegram.messenger.ij) arrayList9.get(i29)).g6(z29);
                                                i29++;
                                                z29 = false;
                                            }
                                        }
                                        if (cnVar.lb) {
                                            z17 = z12;
                                        } else {
                                            if (t92 != null) {
                                                z18 = true;
                                                z13 = false;
                                                z17 = false;
                                                q1Var.setShowTopic(z18);
                                                q1Var.w3(ijVar3, t92, z13, z17, z16, z27);
                                                q1Var.setSpoilersSuppressed(cnVar.z0.getScrollState() != 0);
                                                q1Var.setHighlighted(cnVar.b8 == Integer.MAX_VALUE && ijVar3.e1() == cnVar.b8);
                                                z19 = q1Var.w6;
                                                if (!z19 && cnVar.f8 != null) {
                                                    long currentTimeMillis = System.currentTimeMillis();
                                                    q1Var.t3(true, cnVar.i8, cnVar.f8, cnVar.d8 || currentTimeMillis - cnVar.e8 < 200);
                                                    if (cnVar.d8) {
                                                        cnVar.e8 = currentTimeMillis;
                                                    }
                                                    cnVar.d8 = false;
                                                } else if (!z19 && (num = cnVar.g8) != null) {
                                                    q1Var.r3(num.intValue());
                                                } else if (!z19 && (bArr = cnVar.h8) != null) {
                                                    q1Var.p3(bArr);
                                                } else if (cnVar.f4 == 7 && cnVar.I3 != null && (str = cnVar.H3) != null) {
                                                    q1Var.s3(str);
                                                }
                                                if (cnVar.b8 != Integer.MAX_VALUE) {
                                                    cnVar.Fc();
                                                }
                                                ArrayList arrayList10 = arrayList2;
                                                indexOf = arrayList10.indexOf(ijVar3);
                                                if (indexOf != -1) {
                                                    if (ijVar3.D == 5 && (u40Var = cnVar.p3) != null && u40Var.getTextureView() != null) {
                                                        af afVar = cnVar.G7;
                                                        if (afVar != null) {
                                                            org.telegram.messenger.g0.r(afVar);
                                                            cnVar.G7 = null;
                                                        }
                                                        q1Var.getViewTreeObserver().addOnPreDrawListener(new jl(this, q1Var, 0));
                                                    } else if ((ijVar3.M2() && !ijVar3.I2()) || ((ejVar = ijVar3.L1) != null && ejVar.h)) {
                                                        if (!ijVar3.L1.h || (sjVar = cnVar.Z) == null || sjVar.L0 == null) {
                                                            q1Var.getViewTreeObserver().addOnPreDrawListener(new jl(this, q1Var, 1));
                                                        } else {
                                                            if (((org.telegram.ui.ActionBar.f2) cnVar).actionBar.getVisibility() == 0) {
                                                                int measuredHeight = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar.getMeasuredHeight() + ((int) ((org.telegram.ui.ActionBar.f2) cnVar).actionBar.getTranslationY());
                                                                ck ckVar = cnVar.C1;
                                                                int currentHeight = measuredHeight + (ckVar != null ? ckVar.getCurrentHeight() : 0);
                                                                pj pjVar = cnVar.D1;
                                                                i16 = (((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode ? org.telegram.messenger.g0.m : 0) + currentHeight + (pjVar != null ? pjVar.getCurrentHeight() : 0);
                                                            } else {
                                                                i16 = 0;
                                                            }
                                                            float f10 = i16 + cnVar.O9;
                                                            float height = cnVar.fragmentView == null ? 0.0f : r8.getHeight();
                                                            org.telegram.ui.Components.ue ueVar = cnVar.Z.L0;
                                                            Rect rect = ueVar.t0;
                                                            if (!ueVar.p0) {
                                                                ueVar.r = true;
                                                                ueVar.p0 = true;
                                                                tf0 tf0Var = ueVar.W;
                                                                if (tf0Var != null) {
                                                                    tf0Var.invalidate();
                                                                }
                                                                org.telegram.ui.Components.dg dgVar = ueVar.V;
                                                                if (dgVar != null) {
                                                                    dgVar.invalidate();
                                                                }
                                                                if (ueVar.P != null) {
                                                                    ueVar.q0 = q1Var;
                                                                    q1Var.setVisibility(4);
                                                                    ueVar.r0 = f10;
                                                                    ueVar.s0 = height;
                                                                    org.telegram.ui.Cells.q1 q1Var2 = ueVar.P;
                                                                    org.telegram.ui.Cells.q1 q1Var3 = ueVar.q0;
                                                                    q1Var2.e6 = q1Var3.e6;
                                                                    q1Var2.n6 = q1Var3.n6;
                                                                    q1Var2.g6 = q1Var3.g6;
                                                                    q1Var2.i6 = q1Var3.i6;
                                                                    q1Var2.k6 = q1Var3.k6;
                                                                    q1Var2.m6 = q1Var3.m6;
                                                                    q1Var2.w3(q1Var.getMessageObject(), null, q1Var.H2(), q1Var.I2(), q1Var.z2(), false);
                                                                    org.telegram.ui.Cells.x1 transitionParams = ueVar.P.getTransitionParams();
                                                                    transitionParams.h = ueVar.P.getTransitionParams().a();
                                                                    Rect rect2 = transitionParams.E0;
                                                                    transitionParams.L1 = 0.0f;
                                                                    if (ueVar.P.getTransitionParams().E0.left == ueVar.P.getBackgroundDrawableLeft() && rect2.top == ueVar.P.getBackgroundDrawableTop() && rect2.bottom == ueVar.P.getBackgroundDrawableBottom()) {
                                                                        i17 = 1;
                                                                    } else {
                                                                        rect.bottom = -(ueVar.P.getBackgroundDrawableBottom() - rect2.bottom);
                                                                        rect.top = -(ueVar.P.getBackgroundDrawableTop() - rect2.top);
                                                                        if (q1Var.getMessageObject().P3()) {
                                                                            rect.left = -(ueVar.P.getBackgroundDrawableLeft() - rect2.left);
                                                                            rect.right = 0;
                                                                        } else {
                                                                            rect.left = 0;
                                                                            rect.right = ueVar.P.getBackgroundDrawableRight() - rect2.right;
                                                                        }
                                                                        i17 = 1;
                                                                        transitionParams.x0 = true;
                                                                    }
                                                                    int i30 = ueVar.P.pc;
                                                                } else {
                                                                    i17 = 1;
                                                                }
                                                                ueVar.d(new mf0(ueVar, i17), false);
                                                                ueVar.E.invalidate();
                                                                org.telegram.messenger.qs.f(ueVar.c).n(ueVar, org.telegram.messenger.qs.u3);
                                                            }
                                                            cnVar.Z.L0 = null;
                                                        }
                                                    }
                                                    arrayList10.remove(indexOf);
                                                    sj sjVar2 = cnVar.Z;
                                                    Runnable runnable = sjVar2.f0;
                                                    if (runnable != null) {
                                                        org.telegram.messenger.g0.r(runnable);
                                                        z20 = true;
                                                        sjVar2.g0 = true;
                                                        sjVar2.f0.run();
                                                        sjVar2.f0 = null;
                                                    } else {
                                                        z20 = true;
                                                    }
                                                    cnVar.Z.o0(z20);
                                                }
                                                if (!hashMap.isEmpty()) {
                                                    HashMap hashMap3 = hashMap;
                                                    if (hashMap3.containsKey(ijVar3.F0())) {
                                                        hashMap3.remove(ijVar3.F0());
                                                        ej ejVar2 = cnVar.A0;
                                                        if (ejVar2 != null) {
                                                            org.telegram.ui.Components.pn pnVar = cnVar.g1;
                                                            ejVar2.O = d1Var;
                                                            ejVar2.P = pnVar;
                                                            r10 = 0;
                                                            ejVar2.N = false;
                                                            if (q1Var.nb) {
                                                                q1Var.nb = r10;
                                                                q1Var.setVisibility(r10);
                                                            }
                                                            cnVar.ac(q1Var);
                                                        }
                                                    }
                                                }
                                                r10 = 0;
                                                if (q1Var.nb) {
                                                }
                                                cnVar.ac(q1Var);
                                            }
                                            z17 = z13;
                                            z13 = z12;
                                        }
                                        z18 = true;
                                        q1Var.setShowTopic(z18);
                                        q1Var.w3(ijVar3, t92, z13, z17, z16, z27);
                                        q1Var.setSpoilersSuppressed(cnVar.z0.getScrollState() != 0);
                                        q1Var.setHighlighted(cnVar.b8 == Integer.MAX_VALUE && ijVar3.e1() == cnVar.b8);
                                        z19 = q1Var.w6;
                                        if (!z19) {
                                        }
                                        if (!z19) {
                                        }
                                        if (!z19) {
                                        }
                                        if (cnVar.f4 == 7) {
                                            q1Var.s3(str);
                                        }
                                        if (cnVar.b8 != Integer.MAX_VALUE) {
                                        }
                                        ArrayList arrayList102 = arrayList2;
                                        indexOf = arrayList102.indexOf(ijVar3);
                                        if (indexOf != -1) {
                                        }
                                        if (!hashMap.isEmpty()) {
                                        }
                                        r10 = 0;
                                        if (q1Var.nb) {
                                        }
                                        cnVar.ac(q1Var);
                                    }
                                }
                                z16 = true;
                                int i282 = this.J;
                                if (i7 != i282) {
                                }
                                if (d == d1Var.f) {
                                }
                                if (org.telegram.messenger.t3.T(cnVar.e)) {
                                    if (!z14) {
                                    }
                                    if (!z15) {
                                    }
                                }
                                if (!z14) {
                                    z12 = false;
                                }
                                boolean z292 = false;
                                ijVar3.g6(false);
                                if (t92 != null) {
                                }
                                if (cnVar.lb) {
                                }
                                z18 = true;
                                q1Var.setShowTopic(z18);
                                q1Var.w3(ijVar3, t92, z13, z17, z16, z27);
                                q1Var.setSpoilersSuppressed(cnVar.z0.getScrollState() != 0);
                                q1Var.setHighlighted(cnVar.b8 == Integer.MAX_VALUE && ijVar3.e1() == cnVar.b8);
                                z19 = q1Var.w6;
                                if (!z19) {
                                }
                                if (!z19) {
                                }
                                if (!z19) {
                                }
                                if (cnVar.f4 == 7) {
                                }
                                if (cnVar.b8 != Integer.MAX_VALUE) {
                                }
                                ArrayList arrayList1022 = arrayList2;
                                indexOf = arrayList1022.indexOf(ijVar3);
                                if (indexOf != -1) {
                                }
                                if (!hashMap.isEmpty()) {
                                }
                                r10 = 0;
                                if (q1Var.nb) {
                                }
                                cnVar.ac(q1Var);
                            }
                            int indexOf2 = arrayList8.indexOf(d2) + i7 + 1;
                            i14 = arrayList8.indexOf(d2) + (i7 - arrayList8.size());
                            z12 = false;
                            z13 = false;
                            z14 = false;
                            i13 = indexOf2;
                        }
                    } else {
                        i13 = i7 + 1;
                        z12 = false;
                        z13 = false;
                        z14 = false;
                        i14 = i7 - 1;
                    }
                    z15 = z14;
                    int d102 = d(i14);
                    d = d(i13);
                    d(i25);
                    if (ijVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                    }
                    arrayList2 = arrayList4;
                    hashMap = hashMap2;
                    arrayList3 = arrayList;
                    i15 = i13 - this.J;
                    if (i15 >= 0) {
                        ijVar2 = (org.telegram.messenger.ij) arrayList3.get(i13 - this.J);
                        if (ijVar2 != null) {
                            int i262 = i13 + 1;
                            int i272 = i262 - this.J;
                            if (i272 >= 0) {
                            }
                        }
                        if (ijVar2 != null) {
                            z16 = false;
                            int i2822 = this.J;
                            if (i7 != i2822) {
                            }
                            if (d == d1Var.f) {
                            }
                            if (org.telegram.messenger.t3.T(cnVar.e)) {
                            }
                            if (!z14) {
                            }
                            boolean z2922 = false;
                            ijVar3.g6(false);
                            if (t92 != null) {
                            }
                            if (cnVar.lb) {
                            }
                            z18 = true;
                            q1Var.setShowTopic(z18);
                            q1Var.w3(ijVar3, t92, z13, z17, z16, z27);
                            q1Var.setSpoilersSuppressed(cnVar.z0.getScrollState() != 0);
                            q1Var.setHighlighted(cnVar.b8 == Integer.MAX_VALUE && ijVar3.e1() == cnVar.b8);
                            z19 = q1Var.w6;
                            if (!z19) {
                            }
                            if (!z19) {
                            }
                            if (!z19) {
                            }
                            if (cnVar.f4 == 7) {
                            }
                            if (cnVar.b8 != Integer.MAX_VALUE) {
                            }
                            ArrayList arrayList10222 = arrayList2;
                            indexOf = arrayList10222.indexOf(ijVar3);
                            if (indexOf != -1) {
                            }
                            if (!hashMap.isEmpty()) {
                            }
                            r10 = 0;
                            if (q1Var.nb) {
                            }
                            cnVar.ac(q1Var);
                        }
                    }
                    z16 = true;
                    int i28222 = this.J;
                    if (i7 != i28222) {
                    }
                    if (d == d1Var.f) {
                    }
                    if (org.telegram.messenger.t3.T(cnVar.e)) {
                    }
                    if (!z14) {
                    }
                    boolean z29222 = false;
                    ijVar3.g6(false);
                    if (t92 != null) {
                    }
                    if (cnVar.lb) {
                    }
                    z18 = true;
                    q1Var.setShowTopic(z18);
                    q1Var.w3(ijVar3, t92, z13, z17, z16, z27);
                    q1Var.setSpoilersSuppressed(cnVar.z0.getScrollState() != 0);
                    q1Var.setHighlighted(cnVar.b8 == Integer.MAX_VALUE && ijVar3.e1() == cnVar.b8);
                    z19 = q1Var.w6;
                    if (!z19) {
                    }
                    if (!z19) {
                    }
                    if (!z19) {
                    }
                    if (cnVar.f4 == 7) {
                    }
                    if (cnVar.b8 != Integer.MAX_VALUE) {
                    }
                    ArrayList arrayList102222 = arrayList2;
                    indexOf = arrayList102222.indexOf(ijVar3);
                    if (indexOf != -1) {
                    }
                    if (!hashMap.isEmpty()) {
                    }
                    r10 = 0;
                    if (q1Var.nb) {
                    }
                    cnVar.ac(q1Var);
                }
                z11 = false;
                q1Var.p6 = z11;
                i12 = cnVar.f4;
                if (i12 != 1) {
                }
                arrayList = arrayList5;
                j3 = 0;
                q1Var.s6 = j3;
                if (i12 == 7) {
                }
                q1Var.t6 = org.telegram.messenger.t10.z(cnVar.f);
                q1Var.u6 = cnVar.f4 == 2;
                q1Var.V6 = cnVar.P9();
                q1Var.W6 = cnVar.aa();
                q1Var.X6 = cnVar.Z9();
                q1Var.Y6 = cnVar.l9();
                q1Var.Z6 = cnVar.m9();
                if (ijVar3.r4()) {
                }
                int i252 = i7 + 2;
                if (t92 != null) {
                }
                z15 = z14;
                int d1022 = d(i14);
                d = d(i13);
                d(i252);
                if (ijVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                }
                arrayList2 = arrayList4;
                hashMap = hashMap2;
                arrayList3 = arrayList;
                i15 = i13 - this.J;
                if (i15 >= 0) {
                }
                z16 = true;
                int i282222 = this.J;
                if (i7 != i282222) {
                }
                if (d == d1Var.f) {
                }
                if (org.telegram.messenger.t3.T(cnVar.e)) {
                }
                if (!z14) {
                }
                boolean z292222 = false;
                ijVar3.g6(false);
                if (t92 != null) {
                }
                if (cnVar.lb) {
                }
                z18 = true;
                q1Var.setShowTopic(z18);
                q1Var.w3(ijVar3, t92, z13, z17, z16, z27);
                q1Var.setSpoilersSuppressed(cnVar.z0.getScrollState() != 0);
                q1Var.setHighlighted(cnVar.b8 == Integer.MAX_VALUE && ijVar3.e1() == cnVar.b8);
                z19 = q1Var.w6;
                if (!z19) {
                }
                if (!z19) {
                }
                if (!z19) {
                }
                if (cnVar.f4 == 7) {
                }
                if (cnVar.b8 != Integer.MAX_VALUE) {
                }
                ArrayList arrayList1022222 = arrayList2;
                indexOf = arrayList1022222.indexOf(ijVar3);
                if (indexOf != -1) {
                }
                if (!hashMap.isEmpty()) {
                }
                r10 = 0;
                if (q1Var.nb) {
                }
                cnVar.ac(q1Var);
            }
        }
        z10 = false;
        q1Var.o6 = z10;
        if (cnVar.f4 == 0) {
        }
        z11 = false;
        q1Var.p6 = z11;
        i12 = cnVar.f4;
        if (i12 != 1) {
        }
        arrayList = arrayList5;
        j3 = 0;
        q1Var.s6 = j3;
        if (i12 == 7) {
        }
        q1Var.t6 = org.telegram.messenger.t10.z(cnVar.f);
        q1Var.u6 = cnVar.f4 == 2;
        q1Var.V6 = cnVar.P9();
        q1Var.W6 = cnVar.aa();
        q1Var.X6 = cnVar.Z9();
        q1Var.Y6 = cnVar.l9();
        q1Var.Z6 = cnVar.m9();
        if (ijVar3.r4()) {
        }
        int i2522 = i7 + 2;
        if (t92 != null) {
        }
        z15 = z14;
        int d10222 = d(i14);
        d = d(i13);
        d(i2522);
        if (ijVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
        }
        arrayList2 = arrayList4;
        hashMap = hashMap2;
        arrayList3 = arrayList;
        i15 = i13 - this.J;
        if (i15 >= 0) {
        }
        z16 = true;
        int i2822222 = this.J;
        if (i7 != i2822222) {
        }
        if (d == d1Var.f) {
        }
        if (org.telegram.messenger.t3.T(cnVar.e)) {
        }
        if (!z14) {
        }
        boolean z2922222 = false;
        ijVar3.g6(false);
        if (t92 != null) {
        }
        if (cnVar.lb) {
        }
        z18 = true;
        q1Var.setShowTopic(z18);
        q1Var.w3(ijVar3, t92, z13, z17, z16, z27);
        q1Var.setSpoilersSuppressed(cnVar.z0.getScrollState() != 0);
        q1Var.setHighlighted(cnVar.b8 == Integer.MAX_VALUE && ijVar3.e1() == cnVar.b8);
        z19 = q1Var.w6;
        if (!z19) {
        }
        if (!z19) {
        }
        if (!z19) {
        }
        if (cnVar.f4 == 7) {
        }
        if (cnVar.b8 != Integer.MAX_VALUE) {
        }
        ArrayList arrayList10222222 = arrayList2;
        indexOf = arrayList10222222.indexOf(ijVar3);
        if (indexOf != -1) {
        }
        if (!hashMap.isEmpty()) {
        }
        r10 = 0;
        if (q1Var.nb) {
        }
        cnVar.ac(q1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [org.telegram.ui.il] */
    /* JADX WARN: Type inference failed for: r8v11, types: [org.telegram.ui.Cells.t0] */
    /* JADX WARN: Type inference failed for: r8v12, types: [org.telegram.ui.Cells.ra] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Cells.w0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [org.telegram.ui.Cells.f0, org.telegram.ui.hl] */
    /* JADX WARN: Type inference failed for: r8v16, types: [org.telegram.ui.Cells.z1] */
    /* JADX WARN: Type inference failed for: r8v9, types: [org.telegram.ui.Cells.y1] */
    /* JADX WARN: Type inference failed for: r9v15, types: [org.telegram.ui.Cells.t0] */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.q1 q1Var2;
        cn cnVar = this.Q;
        if (i7 == 0) {
            q1Var = new org.telegram.ui.Cells.q1(this.h, ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount, true, cnVar.Xa, cnVar.za);
            q1Var.setResourcesProvider(cnVar.za);
            if (cnVar.Uc == null) {
                cnVar.Uc = new nm(cnVar);
            }
            q1Var.setDelegate(cnVar.Uc);
            q1Var.Wb = cnVar.rc;
            if (cnVar.h == null) {
                q1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i7 == 1) {
                ?? elVar = new el(context, cnVar.za, true);
                elVar.setInvalidateColors(true);
                elVar.setDelegate(new gl(this));
                q1Var = elVar;
            } else {
                if (i7 == 2) {
                    ?? z1Var = new org.telegram.ui.Cells.z1(context, cnVar.za);
                    q1Var2 = z1Var;
                    if (!cnVar.R9()) {
                        org.telegram.ui.ActionBar.s6.U(z1Var.getTextView(), org.telegram.ui.ActionBar.l6.tf, cnVar.za);
                        org.telegram.ui.ActionBar.s6.x(z1Var.getBackgroundLayout(), z1Var.getBackgroundLayout().getBackground(), org.telegram.ui.ActionBar.l6.uf, cnVar.za, PorterDuff.Mode.MULTIPLY);
                        q1Var2 = z1Var;
                    }
                } else if (i7 == 3) {
                    ?? hlVar = new hl(this, context, ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount, cnVar.za);
                    hlVar.setDelegate(new w0(this, 22));
                    q1Var2 = hlVar;
                } else if (i7 == 4) {
                    q1Var2 = new org.telegram.ui.Cells.w0(context, cnVar.za);
                } else if (i7 == 6) {
                    q1Var2 = new org.telegram.ui.Cells.ra(((org.telegram.ui.ActionBar.f2) cnVar).currentAccount, context, cnVar.za);
                } else if (i7 == 7) {
                    q1Var2 = new org.telegram.ui.Cells.t0(context, cnVar.za, false);
                } else if (i7 == 8) {
                    q1Var2 = new il(this, context, ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount, cnVar.za);
                } else if (i7 == 10) {
                    ?? y1Var = new org.telegram.ui.Cells.y1(context, cnVar.za);
                    if (cnVar.Uc == null) {
                        cnVar.Uc = new nm(cnVar);
                    }
                    y1Var.setDelegate(cnVar.Uc);
                    q1Var2 = y1Var;
                } else {
                    q1Var = null;
                }
                q1Var = q1Var2;
            }
        }
        return jg.g.r(q1Var, q1Var, -1, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0249  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(v4.d1 d1Var) {
        TLRPC.Message message;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        byte[] bArr;
        Integer num;
        String str;
        String V1;
        org.telegram.messenger.ap apVar;
        cn cnVar = this.Q;
        View view = d1Var.a;
        if ((view instanceof org.telegram.ui.Cells.q1) || (view instanceof org.telegram.ui.Cells.t0)) {
            cnVar.N9();
        }
        boolean z13 = view instanceof org.telegram.ui.Cells.q1;
        boolean z14 = true;
        if (z13) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
            q1Var.V6 = cnVar.P9();
            q1Var.W6 = cnVar.aa();
            q1Var.X6 = cnVar.Z9();
            q1Var.Y6 = cnVar.l9();
            q1Var.Z6 = cnVar.m9();
            q1Var.G3(-1, true, false);
            org.telegram.messenger.ij ijVar = cnVar.U3;
            if (ijVar != null && ijVar.T(messageObject)) {
                q1Var.G3(cnVar.V3, false, false);
            }
            if (messageObject.G2() && (V1 = messageObject.V1()) != null && (apVar = (org.telegram.messenger.ap) cnVar.getMessagesController().h4.get(V1.replace("️", ""))) != null) {
                MediaController mediaController = cnVar.getMediaController();
                org.telegram.messenger.c accountInstance = cnVar.getAccountInstance();
                mediaController.getClass();
                Utilities.d.c(new aa.d0(mediaController, apVar, accountInstance, z14, 12));
            }
            if (messageObject.g6(false)) {
                q1Var.w3(messageObject, q1Var.getCurrentMessagesGroup(), q1Var.H2(), q1Var.I2(), q1Var.z2(), q1Var.D2());
            } else {
                org.telegram.messenger.dj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    ArrayList arrayList = currentMessagesGroup.d;
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        ((org.telegram.messenger.ij) arrayList.get(i7)).g6(false);
                    }
                }
            }
            if (((org.telegram.ui.ActionBar.f2) cnVar).actionBar.w() || cnVar.X9()) {
                cnVar.d8 = false;
                cnVar.e8 = 0L;
                cnVar.f8 = null;
                ArrayList arrayList2 = cnVar.o4;
                q1Var.j3(arrayList2 == null || !arrayList2.contains(messageObject), false);
                int i10 = org.telegram.messenger.ij.B0(messageObject.k) == cnVar.j6 ? 0 : 1;
                if (cnVar.m6[i10].indexOfKey(messageObject.e1()) >= 0) {
                    cnVar.Mb(messageObject, q1Var, i10, false);
                    z9 = true;
                } else {
                    q1Var.setDrawSelectionBackground(false);
                    q1Var.l3(false, false, false);
                    z9 = false;
                }
                z10 = true;
            } else {
                q1Var.setDrawSelectionBackground(false);
                q1Var.l3(false, false, false);
                q1Var.j3(false, false);
                z9 = false;
                z10 = false;
            }
            q1Var.k3(!z10, z10 && z9);
            if (cnVar.f4 != 7 || cnVar.I3 == null || (str = cnVar.H3) == null) {
                vj vjVar = cnVar.f3;
                if (vjVar != null && vjVar.getVisibility() == 0) {
                    if (cnVar.getMediaDataController().b1[org.telegram.messenger.ij.B0(messageObject.k) == cnVar.b7 ? (char) 1 : (char) 0].indexOfKey(messageObject.e1()) >= 0 && cnVar.getMediaDataController().d1 != null) {
                        q1Var.s3(cnVar.getMediaDataController().d1);
                    }
                }
                q1Var.s3(null);
            } else {
                q1Var.s3(str);
            }
            if (!((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode || !q1Var.w6) {
                if (cnVar.b8 != Integer.MAX_VALUE) {
                    if (q1Var.getMessageObject() == null || q1Var.getMessageObject().e1() != cnVar.b8) {
                        if (q1Var.getCurrentMessagesGroup() != null) {
                            org.telegram.messenger.dj currentMessagesGroup2 = q1Var.getCurrentMessagesGroup();
                            int i11 = cnVar.b8;
                            ArrayList arrayList3 = currentMessagesGroup2.d;
                            if (arrayList3 != null) {
                                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                    org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList3.get(i12);
                                    if (ijVar2 == null || ijVar2.e1() != i11) {
                                    }
                                }
                            }
                        }
                    }
                    z11 = true;
                    q1Var.setHighlighted(z11);
                    z12 = q1Var.w6;
                    if (!z12 && cnVar.f8 != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!q1Var.t3(true, cnVar.i8, cnVar.f8, cnVar.d8 || currentTimeMillis - cnVar.e8 < 200) && cnVar.c8) {
                            org.telegram.ui.Components.hc.a0(cnVar).Q(R.raw.error, 36, org.telegram.messenger.id.M0(2131746435, null)).k(true);
                        }
                        cnVar.c8 = false;
                        if (cnVar.d8) {
                            cnVar.e8 = currentTimeMillis;
                        }
                        cnVar.d8 = false;
                    } else if (!z12 && (num = cnVar.g8) != null) {
                        q1Var.r3(num.intValue());
                    } else if (z12 && (bArr = cnVar.h8) != null) {
                        q1Var.p3(bArr);
                    }
                    if (cnVar.b8 != Integer.MAX_VALUE) {
                        cnVar.Fc();
                    }
                }
                z11 = false;
                q1Var.setHighlighted(z11);
                z12 = q1Var.w6;
                if (!z12) {
                }
                if (!z12) {
                }
                if (z12) {
                    q1Var.p3(bArr);
                }
                if (cnVar.b8 != Integer.MAX_VALUE) {
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.t0) {
            org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
            t0Var.e0 = cnVar.P9();
            t0Var.i0 = cnVar.aa();
            cnVar.Z9();
            cnVar.l9();
            t0Var.j0 = cnVar.m9();
        } else if (view instanceof org.telegram.ui.Cells.z1) {
            ((org.telegram.ui.Cells.z1) view).getTextView().setTranslationX(cnVar.m9() / 2.0f);
        }
        int b10 = d1Var.b();
        int i13 = this.J;
        if (b10 < i13 || b10 >= this.K) {
            return;
        }
        org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) (this.L ? this.M : this.N ? this.P : cnVar.K6).get(b10 - i13);
        if (ijVar3 == null || (message = ijVar3.k) == null || !message.media_unread || !message.mentioned) {
            return;
        }
        if (!((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode && cnVar.f4 == 0 && !org.telegram.messenger.ij.R4(ijVar3.k) && !ijVar3.h4()) {
            int i14 = cnVar.B6 - 1;
            cnVar.B6 = i14;
            if (i14 <= 0) {
                cnVar.B6 = 0;
                cnVar.C6 = true;
                cnVar.qc(false);
            } else {
                cnVar.x1.c(2, i14, true);
            }
            cnVar.getMessagesController().n3(org.telegram.messenger.t3.T(cnVar.e) ? cnVar.e.id : 0L, ijVar3.e1(), cnVar.j6);
            ijVar3.k.media_unread = false;
        }
        if (z13) {
            org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
            if (((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode) {
                q1Var2.setHighlighted(true);
            } else {
                q1Var2.o3();
            }
        }
    }
}
