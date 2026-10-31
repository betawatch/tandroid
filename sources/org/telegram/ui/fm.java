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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fm extends org.telegram.ui.Components.tj0 {
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
    public final /* synthetic */ un Q;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public fm(un unVar, Context context) {
        this.Q = unVar;
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
        TLRPC.User user = unVar.f;
        this.n = user != null && user.bot;
        C(true);
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void K(boolean z10) {
        un unVar = this.Q;
        if (org.telegram.messenger.h20.u(unVar.f)) {
            if (z10) {
                unVar.Ic = true;
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

    public final void M(org.telegram.messenger.jj jjVar) {
        un unVar = this.Q;
        int childCount = unVar.z0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = unVar.z0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var.getMessageObject() == jjVar) {
                    q1Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean N() {
        un unVar = this.Q;
        return org.telegram.messenger.h20.v(unVar.f) && unVar.b() == 0 && !unVar.Ic && unVar.f4 == 0;
    }

    public final void O(boolean z10) {
        boolean z11;
        un unVar = this.Q;
        ArrayList arrayList = unVar.K6;
        if (org.telegram.messenger.v2.a) {
            org.telegram.messenger.f8.b("notify data set changed fragmentOpened=" + unVar.e6);
        }
        if (z10 && unVar.e6) {
            s4.l0 itemAnimator = unVar.z0.getItemAnimator();
            xj xjVar = unVar.A0;
            if (itemAnimator != xjVar) {
                unVar.z0.setItemAnimator(xjVar);
            }
        } else {
            unVar.z0.setItemAnimator(null);
        }
        S();
        try {
            super.f();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(size);
            if (jjVar.j0) {
                size--;
            } else {
                TLRPC.Message message = jjVar.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                        z11 = true;
                    }
                }
            }
        }
        z11 = false;
        boolean[] zArr = unVar.S6;
        if ((zArr[0] && (unVar.b7 == 0 || zArr[1])) || z11) {
            unVar.T6(((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow);
        }
    }

    public final void P(int i10, boolean z10) {
        org.telegram.messenger.jj messageObject;
        if (org.telegram.messenger.v2.a) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i10);
            a1.g.z(z10 ? " with thanos effect" : "", sb2);
        }
        un unVar = this.Q;
        if (((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow) {
            s4.l0 itemAnimator = unVar.z0.getItemAnimator();
            xj xjVar = unVar.A0;
            if (itemAnimator != xjVar) {
                unVar.z0.setItemAnimator(xjVar);
            }
        } else {
            unVar.z0.setItemAnimator(null);
        }
        if (z10 && unVar.A0 != null) {
            s4.l0 itemAnimator2 = unVar.z0.getItemAnimator();
            xj xjVar2 = unVar.A0;
            if (itemAnimator2 == xjVar2) {
                s4.c1 K = unVar.z0.K(i10);
                if (K == null) {
                    xjVar2.getClass();
                } else {
                    xjVar2.S.add(K);
                    View view = K.a;
                    if ((view instanceof org.telegram.ui.Cells.q1) && (messageObject = ((org.telegram.ui.Cells.q1) view).getMessageObject()) != null) {
                        messageObject.a0 = true;
                    }
                }
            }
        }
        S();
        try {
            super.s(i10);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void Q(int i10) {
        int i11;
        un unVar = this.Q;
        ArrayList arrayList = unVar.K6;
        if (unVar.B0 == null || this.L || this.N) {
            return;
        }
        int i12 = 0;
        if (!unVar.P4 && unVar.Z7 != null) {
            int childCount = unVar.z0.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                View childAt = unVar.z0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.messenger.jj messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                    org.telegram.messenger.jj jjVar = unVar.Z7;
                    if (messageObject == jjVar) {
                        if (arrayList.indexOf(jjVar) >= 0) {
                            i11 = arrayList.indexOf(unVar.Z7) + this.J;
                            i12 = unVar.Y8(childAt);
                        }
                    }
                }
                i13++;
            }
        }
        i11 = -1;
        g(i10);
        if (i11 != -1) {
            unVar.B0.h1(i11, i12);
        }
    }

    public final org.telegram.ui.Cells.q1 R(org.telegram.messenger.jj jjVar, boolean z10, boolean z11) {
        un unVar = this.Q;
        if (z10) {
            int childCount = unVar.z0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = unVar.z0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject() == jjVar && TextUtils.equals(q1Var.x5, q1Var.O5.k.post_author)) {
                        q1Var.s3(jjVar, q1Var.getCurrentMessagesGroup(), q1Var.E2(), q1Var.F2(), q1Var.x2(), q1Var.A2());
                        return q1Var;
                    }
                }
                i10++;
                jjVar = jjVar;
            }
        }
        org.telegram.messenger.jj jjVar2 = jjVar;
        int indexOf = (this.L ? this.M : this.N ? this.P : unVar.K6).indexOf(jjVar2);
        if (indexOf == -1) {
            return null;
        }
        if (!z11) {
            Q(this.J + indexOf);
            return null;
        }
        int i11 = un.cd;
        un.cd = i11 + 1;
        jjVar2.k1 = i11;
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
        TLRPC.PeerSettings B1;
        TLRPC.PeerSettings B12;
        int i11;
        int i12;
        un unVar = this.Q;
        boolean[] zArr = unVar.S6;
        this.r = 0;
        ArrayList arrayList = this.L ? this.M : this.N ? this.P : unVar.K6;
        if (unVar.f4 == 3 && unVar.ib) {
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
            int i13 = this.r;
            this.r = i13 + 1;
            this.I = i13;
        }
        if (arrayList.isEmpty()) {
            this.E = -5;
            this.F = -5;
            this.J = 0;
            this.K = 0;
            TLRPC.User user4 = unVar.f;
            if (user4 != null && !org.telegram.messenger.h20.t(user4) && !org.telegram.messenger.h20.z(unVar.f)) {
                TLRPC.PeerSettings B13 = unVar.getMessagesController().B1(unVar.f.id);
                int i14 = org.telegram.ui.Cells.ra.P;
                if (B13 != null && ((B13.phone_country != null || B13.registration_month != null) && !org.telegram.messenger.vp.E2(unVar.f) && unVar.f4 == 0)) {
                    int i15 = this.r;
                    this.r = i15 + 1;
                    this.D = i15;
                    return;
                }
            }
            if (org.telegram.messenger.h20.z(unVar.f) || ((user = unVar.f) != null && user.bot && !org.telegram.messenger.vp.E2(user) && unVar.f4 == 0)) {
                int i16 = this.r;
                this.r = i16 + 1;
                this.x = i16;
                return;
            }
            return;
        }
        if (!this.N) {
            boolean[] zArr2 = unVar.U6;
            if ((!zArr2[0] || (unVar.b7 != 0 && !zArr2[1])) && !unVar.V6) {
                int i17 = this.r;
                this.r = i17 + 1;
                this.F = i17;
                int i18 = this.r;
                this.J = i18;
                int size = arrayList.size() + i18;
                this.r = size;
                this.K = size;
                user2 = unVar.f;
                if (user2 != null && !org.telegram.messenger.h20.t(user2) && !org.telegram.messenger.h20.z(unVar.f)) {
                    B1 = unVar.getMessagesController().B1(unVar.f.id);
                    int i19 = org.telegram.ui.Cells.ra.P;
                    if (B1 != null && ((B1.phone_country != null || B1.registration_month != null) && !org.telegram.messenger.vp.E2(unVar.f) && unVar.f4 == 0 && zArr[0])) {
                        B12 = unVar.getMessagesController().B1(unVar.f.id);
                        i11 = B12.name_change_date;
                        if (i11 != 0 || (i12 = B12.photo_change_date) == 0) {
                            if (i11 != 0) {
                                int i20 = this.r;
                                this.r = i20 + 1;
                                this.H = i20;
                            }
                            if (B12.photo_change_date != 0) {
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
                        this.D = i24;
                        i10 = unVar.f4;
                        if (i10 == 9) {
                            int i25 = this.r;
                            this.s = i25;
                            this.r = i25 + 2;
                            this.w = i25 + 1;
                        }
                        if (i10 == 5 && !ag.i3.g(unVar.e4)) {
                            int i26 = this.r;
                            this.r = i26 + 1;
                            this.s = i26;
                        }
                        if (this.N ? !(!(zArr[0] && (unVar.b7 == 0 || zArr[1])) && (org.telegram.messenger.i0.Q1() || unVar.u4 || unVar.f != null)) : this.O) {
                            this.E = -5;
                            return;
                        }
                        int i27 = this.r;
                        this.r = i27 + 1;
                        this.E = i27;
                        return;
                    }
                }
                if ((!org.telegram.messenger.h20.z(unVar.f) || ((user3 = unVar.f) != null && user3.bot && !org.telegram.messenger.vp.E2(user3) && unVar.f4 == 0)) && zArr[0]) {
                    int i28 = this.r;
                    this.r = i28 + 1;
                    this.x = i28;
                }
                i10 = unVar.f4;
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
        user2 = unVar.f;
        if (user2 != null) {
            B1 = unVar.getMessagesController().B1(unVar.f.id);
            int i192 = org.telegram.ui.Cells.ra.P;
            if (B1 != null) {
                B12 = unVar.getMessagesController().B1(unVar.f.id);
                i11 = B12.name_change_date;
                if (i11 != 0) {
                }
                if (i11 != 0) {
                }
                if (B12.photo_change_date != 0) {
                }
                int i242 = this.r;
                this.r = i242 + 1;
                this.D = i242;
                i10 = unVar.f4;
                if (i10 == 9) {
                }
                if (i10 == 5) {
                }
                if (this.N) {
                }
            }
        }
        if (!org.telegram.messenger.h20.z(unVar.f)) {
        }
        int i282 = this.r;
        this.r = i282 + 1;
        this.x = i282;
        i10 = unVar.f4;
        if (i10 == 9) {
        }
        if (i10 == 5) {
        }
        if (this.N) {
        }
    }

    public final void T() {
        int i10 = this.r;
        int i11 = this.x;
        int i12 = this.D;
        int i13 = this.s;
        int i14 = this.w;
        int i15 = this.E;
        int i16 = this.F;
        int i17 = this.J;
        int i18 = this.K;
        int i19 = this.G;
        int i20 = this.H;
        int i21 = this.I;
        S();
        if (i10 == this.r && i11 == this.x && i15 == this.E && i16 == this.F && i17 == this.J && i18 == this.K && i13 == this.s && i14 == this.w && i12 == this.D && i19 == this.G && i20 == this.H && i21 == this.I) {
            return;
        }
        O(false);
    }

    @Override // s4.g0
    public final int b() {
        this.y = -5;
        un unVar = this.Q;
        a0.h hVar = unVar.t8;
        if (unVar.c6.get(unVar.r4, 0) == 0) {
            return this.r;
        }
        TLRPC.User user = unVar.f;
        if (user == null || !user.bot || unVar.f4 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(unVar.f.id)).description == null && ((TL_bots.BotInfo) hVar.f(unVar.f.id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(unVar.f.id)).description_document == null)) && !org.telegram.messenger.h20.z(unVar.f) && !org.telegram.messenger.h20.u(unVar.f))) {
            return 0;
        }
        this.y = 0;
        return 1;
    }

    @Override // s4.g0
    public final long c(int i10) {
        un unVar = this.Q;
        if (unVar.c6.get(unVar.r4, 0) != 0 && i10 == this.y) {
            return 1L;
        }
        ArrayList arrayList = this.L ? this.M : this.N ? this.P : unVar.K6;
        if (i10 >= this.J && i10 < this.K) {
            return ((org.telegram.messenger.jj) arrayList.get(i10 - r1)).k1;
        }
        if (i10 == this.x || i10 == this.y) {
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
        if (i10 == this.D) {
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
        return i10 == this.w ? 10L : 5L;
    }

    @Override // s4.g0
    public final int d(int i10) {
        un unVar = this.Q;
        if (unVar.c6.get(unVar.r4, 0) != 0 && i10 == this.y) {
            return 3;
        }
        if (i10 == this.s || i10 == this.w) {
            return 1;
        }
        int i11 = this.J;
        if (i10 >= i11 && i10 < this.K) {
            return ((org.telegram.messenger.jj) (this.L ? this.M : this.N ? this.P : unVar.K6).get(i10 - i11)).U;
        }
        if (i10 == this.x) {
            return 3;
        }
        if (i10 == this.D) {
            return 6;
        }
        if (i10 == this.H || i10 == this.G) {
            return 7;
        }
        return i10 == this.I ? 8 : 4;
    }

    @Override // org.telegram.ui.Components.tj0, s4.g0
    public final void f() {
        O(false);
    }

    @Override // org.telegram.ui.Components.tj0, s4.g0
    public final void g(int i10) {
        if (org.telegram.messenger.v2.a) {
            org.telegram.messenger.f8.b("notify item changed " + i10);
        }
        un unVar = this.Q;
        if (!((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow || unVar.b1) {
            unVar.z0.setItemAnimator(null);
        } else {
            s4.l0 itemAnimator = unVar.z0.getItemAnimator();
            xj xjVar = unVar.A0;
            if (itemAnimator != xjVar) {
                unVar.z0.setItemAnimator(xjVar);
            }
        }
        S();
        try {
            super.g(i10);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Components.tj0, s4.g0
    public final void i(int i10) {
        if (org.telegram.messenger.v2.a) {
            org.telegram.messenger.f8.b("notify item inserted " + i10);
        }
        un unVar = this.Q;
        if (((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow) {
            s4.l0 itemAnimator = unVar.z0.getItemAnimator();
            xj xjVar = unVar.A0;
            if (itemAnimator != xjVar) {
                unVar.z0.setItemAnimator(xjVar);
            }
        } else {
            unVar.z0.setItemAnimator(null);
        }
        S();
        try {
            super.i(i10);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // s4.g0
    public final void j(int i10, int i11) {
        if (org.telegram.messenger.v2.a) {
            org.telegram.messenger.f8.b("notify item moved" + i10 + ":" + i11);
        }
        un unVar = this.Q;
        if (((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow) {
            s4.l0 itemAnimator = unVar.z0.getItemAnimator();
            xj xjVar = unVar.A0;
            if (itemAnimator != xjVar) {
                unVar.z0.setItemAnimator(xjVar);
            }
        } else {
            unVar.z0.setItemAnimator(null);
        }
        S();
        try {
            super.j(i10, i11);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Components.tj0, s4.g0
    public final void k(int i10, int i11) {
        if (org.telegram.messenger.v2.a) {
            org.telegram.messenger.f8.b("notify item range changed " + i10 + ":" + i11);
        }
        un unVar = this.Q;
        if (((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow) {
            s4.l0 itemAnimator = unVar.z0.getItemAnimator();
            xj xjVar = unVar.A0;
            if (itemAnimator != xjVar) {
                unVar.z0.setItemAnimator(xjVar);
            }
        } else {
            unVar.z0.setItemAnimator(null);
        }
        S();
        try {
            super.k(i10, i11);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Components.tj0, s4.g0
    public final void o(int i10, int i11) {
        int i12;
        int i13;
        un unVar = this.Q;
        ArrayList arrayList = unVar.K6;
        if (org.telegram.messenger.v2.a) {
            org.telegram.messenger.f8.b("notify item range inserted " + i10 + ":" + i11);
        }
        if (((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow) {
            s4.l0 itemAnimator = unVar.z0.getItemAnimator();
            xj xjVar = unVar.A0;
            if (itemAnimator != xjVar) {
                unVar.z0.setItemAnimator(xjVar);
            }
        } else {
            unVar.z0.setItemAnimator(null);
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.J) && i12 < this.K) {
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i12 - i13);
            org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList.get((i12 - this.J) - 1);
            if ((unVar.e != null && jjVar.Z0() == jjVar2.Z0()) || (unVar.f != null && jjVar.P3() == jjVar2.P3())) {
                g(i10);
            }
        }
        try {
            super.o(i10, i11);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Components.tj0, s4.g0
    public final void p(int i10, int i11) {
        if (org.telegram.messenger.v2.a) {
            org.telegram.messenger.f8.b("notify item range removed" + i10 + ":" + i11);
        }
        un unVar = this.Q;
        if (((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow) {
            s4.l0 itemAnimator = unVar.z0.getItemAnimator();
            xj xjVar = unVar.A0;
            if (itemAnimator != xjVar) {
                unVar.z0.setItemAnimator(xjVar);
            }
        } else {
            unVar.z0.setItemAnimator(null);
        }
        S();
        try {
            super.p(i10, i11);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Components.tj0, s4.g0
    public final void s(int i10) {
        if (org.telegram.messenger.v2.a) {
            org.telegram.messenger.f8.b("notify item removed " + i10);
        }
        un unVar = this.Q;
        if (((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow) {
            s4.l0 itemAnimator = unVar.z0.getItemAnimator();
            xj xjVar = unVar.A0;
            if (itemAnimator != xjVar) {
                unVar.z0.setItemAnimator(xjVar);
            }
        } else {
            unVar.z0.setItemAnimator(null);
        }
        S();
        try {
            super.s(i10);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x025b, code lost:
    
        if (r4.V4.containsKey(java.lang.Integer.valueOf(((org.telegram.messenger.jj) r8.get(0)).f1())) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x05b8, code lost:
    
        if (r6 != (r2.h1 == null ? org.telegram.messenger.jj.c2(((org.telegram.ui.ActionBar.k2) r4).currentAccount, r2.k, r9, r10) : r11.id)) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x05e7, code lost:
    
        if (org.telegram.messenger.jj.C1(r5.k.peer_id) == org.telegram.messenger.jj.C1(r2.k.peer_id)) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x065a, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0602, code lost:
    
        if (r2.S1() == r5.S1()) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0658, code lost:
    
        if (org.telegram.messenger.jj.C1(r6) == org.telegram.messenger.jj.C1(r5.k.fwd_from.from_id)) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0922, code lost:
    
        if (r4.A0 == null) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x03f2, code lost:
    
        if (r4.f4 != 9) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x041e, code lost:
    
        if (org.telegram.messenger.jj.C1(r5.k.peer_id) == org.telegram.messenger.jj.C1(r10.k.peer_id)) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0491, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0439, code lost:
    
        if (r10.S1() == r5.S1()) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x048f, code lost:
    
        if (org.telegram.messenger.jj.C1(r6) == org.telegram.messenger.jj.C1(r5.k.fwd_from.from_id)) goto L267;
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
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.UserFull userFull;
        TLObject tLObject;
        int i11;
        int i12;
        org.telegram.messenger.jj jjVar;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13;
        ArrayList arrayList;
        long j10;
        int i14;
        boolean z13;
        boolean z14;
        boolean z15;
        int i15;
        boolean z16;
        int d;
        ArrayList arrayList2;
        HashMap hashMap;
        ArrayList arrayList3;
        int i16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        String str;
        byte[] bArr;
        Integer num;
        int indexOf;
        ?? r10;
        org.telegram.messenger.fj fjVar;
        mk mkVar;
        int i17;
        int i18;
        boolean z21;
        org.telegram.ui.Components.j50 j50Var;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str2;
        boolean z22;
        boolean z23;
        long j11;
        org.telegram.messenger.jj jjVar2;
        String str3;
        boolean z24;
        int i19;
        TLRPC.ChatFull chatFull;
        View view = c1Var.a;
        un unVar = this.Q;
        a0.h hVar = unVar.t8;
        ArrayList arrayList4 = unVar.I4;
        HashMap hashMap2 = unVar.J4;
        if (i10 == this.x || i10 == this.y) {
            org.telegram.ui.Cells.f0 f0Var = (org.telegram.ui.Cells.f0) view;
            if (org.telegram.messenger.h20.z(unVar.f)) {
                f0Var.b(false, 0L, org.telegram.messenger.cd.K0(2131746282), null, null, null);
            } else {
                TLRPC.User user = unVar.f;
                if (user == null || user.id != 489000) {
                    TL_bots.BotInfo botInfo = hVar.m() != 0 ? (TL_bots.BotInfo) hVar.f(unVar.f.id) : null;
                    boolean z25 = (botInfo == null || (TextUtils.isEmpty(botInfo.description) && botInfo.description_photo == null && botInfo.description_document == null)) && org.telegram.messenger.h20.t(unVar.f) && (userFull = unVar.q8) != null && userFull.bot_manager_id != 0 && unVar.f.bot_can_edit;
                    TLRPC.User user2 = unVar.f;
                    long j12 = user2 == null ? 0L : user2.id;
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
                    f0Var.b(true, j12, str4, tLObject, botInfo, z25 ? org.telegram.messenger.o5.l(((org.telegram.ui.ActionBar.k2) unVar).currentAccount, unVar.q8.bot_manager_id) : null);
                } else {
                    f0Var.b(false, 0L, org.telegram.messenger.cd.K0(2131743643), null, null, null);
                }
            }
            un.k4(unVar, f0Var);
            return;
        }
        if (i10 == this.I) {
            ((org.telegram.ui.Cells.a0) view).setDialogId(unVar.a());
            return;
        }
        if (i10 == this.D) {
            org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
            TLRPC.EncryptedChat encryptedChat = unVar.h;
            long a2 = encryptedChat != null ? encryptedChat.user_id : unVar.a();
            raVar.b(a2, unVar.getMessagesController().B1(a2));
            return;
        }
        if (i10 == this.F || i10 == this.E) {
            ((org.telegram.ui.Cells.v0) view).setProgressVisible(unVar.Z6 > 1);
            return;
        }
        if (i10 == this.H) {
            if (unVar.getMessagesController().B1(unVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.s0) view).setCustomText(org.telegram.messenger.cd.a0(null, null, 2131751794, org.telegram.messenger.cd.N(unVar.getConnectionsManager().getCurrentTime() - r1.name_change_date)));
            return;
        }
        if (i10 == this.G) {
            if (unVar.getMessagesController().B1(unVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.s0) view).setCustomText(org.telegram.messenger.cd.a0(null, null, 2131751793, org.telegram.messenger.cd.N(unVar.getConnectionsManager().getCurrentTime() - r1.photo_change_date)));
            return;
        }
        if (i10 == this.s) {
            org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) view;
            un.l4(unVar);
            s0Var.setMessageObject(unVar.W3);
            int i20 = unVar.f4;
            if (i20 == 3) {
                s0Var.setCustomText(org.telegram.messenger.cd.L0(2131745911, null));
            } else if (i20 == 5) {
                s0Var.setCustomText(org.telegram.messenger.cd.L0(2131752671, null));
            } else if (i20 == 9) {
                s0Var.setCustomText(org.telegram.messenger.cd.L0(2131742919, null));
            }
            s0Var.setAlpha(1.0f);
            s0Var.setSpoilersSuppressed(unVar.z0.getScrollState() != 0);
            return;
        }
        if (i10 == this.w) {
            org.telegram.ui.Cells.s0 s0Var2 = (org.telegram.ui.Cells.s0) view;
            un.m4(unVar);
            s0Var2.setMessageObject(unVar.X3);
            s0Var2.setCustomText(org.telegram.messenger.cd.L0(2131742920, null));
            s0Var2.setAlpha(1.0f);
            s0Var2.setSpoilersSuppressed(unVar.z0.getScrollState() != 0);
            return;
        }
        int i21 = this.J;
        if (i10 < i21 || i10 >= this.K) {
            return;
        }
        ArrayList arrayList5 = this.L ? this.M : this.N ? this.P : unVar.K6;
        org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) arrayList5.get(i10 - i21);
        if (!(view instanceof org.telegram.ui.Cells.q1)) {
            ArrayList arrayList6 = arrayList5;
            if (!(view instanceof org.telegram.ui.Cells.s0)) {
                if (view instanceof org.telegram.ui.Cells.z1) {
                    org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                    z1Var.setText(org.telegram.messenger.cd.L0(2131743863, null));
                    z1Var.getTextView().setTranslationX(unVar.e9() / 2.0f);
                    if (unVar.T7 != 0) {
                        unVar.T7 = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            if ((jjVar3 == null || !jjVar3.j0) && (i12 = (i11 = i10 + 1) - this.J) >= 0 && i12 < arrayList6.size()) {
                org.telegram.messenger.jj jjVar4 = (org.telegram.messenger.jj) arrayList6.get(i11 - this.J);
                if (jjVar4 == null || !jjVar4.j0) {
                    jjVar = jjVar4;
                } else {
                    int i22 = i10 + 2;
                    int i23 = i22 - this.J;
                    jjVar = (i23 < 0 || i23 >= arrayList6.size()) ? null : (org.telegram.messenger.jj) arrayList6.get(i22 - this.J);
                }
                if (jjVar == null || (jjVar3 != null && jjVar.Z1() != jjVar3.Z1())) {
                    z10 = true;
                    org.telegram.ui.Cells.s0 s0Var3 = (org.telegram.ui.Cells.s0) view;
                    s0Var3.e0 = unVar.E9();
                    s0Var3.i0 = unVar.P9();
                    unVar.O9();
                    unVar.d9();
                    s0Var3.j0 = unVar.e9();
                    s0Var3.f0 = org.telegram.messenger.w3.c0(unVar.e);
                    s0Var3.g0 = org.telegram.messenger.w3.p0(unVar.e);
                    s0Var3.h0 = org.telegram.messenger.h20.u(unVar.f);
                    boolean z26 = s0Var3.k0 == z10;
                    s0Var3.k0 = z10;
                    s0Var3.f0(jjVar3, z26);
                    s0Var3.setAlpha(1.0f);
                    s0Var3.setShowTopic(true);
                    s0Var3.setSpoilersSuppressed(unVar.z0.getScrollState() == 0);
                    return;
                }
            }
            z10 = false;
            org.telegram.ui.Cells.s0 s0Var32 = (org.telegram.ui.Cells.s0) view;
            s0Var32.e0 = unVar.E9();
            s0Var32.i0 = unVar.P9();
            unVar.O9();
            unVar.d9();
            s0Var32.j0 = unVar.e9();
            s0Var32.f0 = org.telegram.messenger.w3.c0(unVar.e);
            s0Var32.g0 = org.telegram.messenger.w3.p0(unVar.e);
            s0Var32.h0 = org.telegram.messenger.h20.u(unVar.f);
            if (s0Var32.k0 == z10) {
            }
            s0Var32.k0 = z10;
            s0Var32.f0(jjVar3, z26);
            s0Var32.setAlpha(1.0f);
            s0Var32.setShowTopic(true);
            s0Var32.setSpoilersSuppressed(unVar.z0.getScrollState() == 0);
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
        org.telegram.messenger.ej k92 = unVar.k9(jjVar3);
        q1Var.d6 = unVar.e != null || org.telegram.messenger.h20.B(unVar.f) || org.telegram.messenger.h20.z(unVar.f) || unVar.f4 == 7;
        q1Var.D.a(false, false);
        q1Var.e6 = org.telegram.messenger.h20.u(unVar.f);
        q1Var.q6 = unVar.M9();
        int i24 = unVar.f4;
        q1Var.f6 = i24 == 3;
        q1Var.g6 = i24 == 3 && unVar.ib;
        TLRPC.User user3 = unVar.f;
        q1Var.h6 = user3 != null && user3.bot;
        q1Var.i6 = org.telegram.messenger.w3.T(unVar.e) && unVar.e.megagroup;
        q1Var.j6 = org.telegram.messenger.w3.c0(unVar.e);
        q1Var.k6 = org.telegram.messenger.w3.p0(unVar.e);
        q1Var.l6 = org.telegram.messenger.w3.c0(unVar.e) && unVar.v4 && unVar.b() == 1;
        q1Var.m6 = (unVar.r4 != 0 || (q1Var.j6 && unVar.v4)) && !q1Var.k6;
        int i25 = unVar.f4;
        if (i25 != 1 && i25 != 9 && org.telegram.messenger.w3.T(unVar.e)) {
            TLRPC.Chat chat = unVar.e;
            if (chat.has_link && !chat.megagroup) {
                z11 = true;
                q1Var.n6 = z11;
                if (unVar.f4 == 0) {
                    if (!unVar.V4.containsKey(Integer.valueOf(jjVar3.f1()))) {
                        if (k92 != null) {
                            ArrayList arrayList7 = k92.d;
                            if (!arrayList7.isEmpty()) {
                            }
                        }
                    }
                    z12 = true;
                    q1Var.o6 = z12;
                    i13 = unVar.f4;
                    if (i13 != 1 || i13 == 9 || (chatFull = unVar.p8) == null) {
                        arrayList = arrayList5;
                        j10 = 0;
                    } else {
                        arrayList = arrayList5;
                        j10 = chatFull.linked_chat_id;
                    }
                    q1Var.r6 = j10;
                    if (i13 == 7 || unVar.c4 != 1) {
                        q1Var.s6 = org.telegram.messenger.h20.z(unVar.f);
                    } else {
                        q1Var.s6 = org.telegram.messenger.h20.y(org.telegram.messenger.jj.B0(jjVar3.k));
                    }
                    q1Var.t6 = unVar.f4 == 2;
                    q1Var.U6 = unVar.E9();
                    q1Var.V6 = unVar.P9();
                    q1Var.W6 = unVar.O9();
                    q1Var.X6 = unVar.d9();
                    q1Var.Y6 = unVar.e9();
                    if (jjVar3.r4()) {
                        org.telegram.messenger.i0.K(q1Var, new ag.f3(13));
                    }
                    int i26 = i10 + 2;
                    if (k92 != null) {
                        ArrayList arrayList8 = k92.e;
                        org.telegram.messenger.bj d10 = k92.d(jjVar3);
                        if (d10 == null) {
                            z13 = false;
                            z14 = false;
                            z15 = false;
                            i15 = -100;
                            i14 = -100;
                        } else {
                            if (!k92.i) {
                                if ((d10.l & 4) != 0) {
                                    i19 = k92.n ? arrayList8.indexOf(d10) + (i10 - arrayList8.size()) : arrayList8.indexOf(d10) + i10 + 1;
                                    z24 = false;
                                    z15 = false;
                                } else {
                                    z24 = true;
                                    z15 = true;
                                    i19 = -100;
                                }
                                if ((d10.l & 8) != 0) {
                                    z13 = z24;
                                    i15 = k92.n ? arrayList8.indexOf(d10) + i10 + 1 : arrayList8.indexOf(d10) + (i10 - arrayList8.size());
                                    i14 = i19;
                                    z16 = false;
                                } else {
                                    z13 = z24;
                                    i15 = -100;
                                    i14 = i19;
                                    z16 = true;
                                }
                                z14 = z16;
                                int d11 = d(i15);
                                d = d(i14);
                                d(i26);
                                if ((jjVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d11 == c1Var.f) {
                                    arrayList3 = arrayList;
                                    org.telegram.messenger.jj jjVar5 = (org.telegram.messenger.jj) arrayList3.get(i15 - this.J);
                                    boolean z27 = jjVar5.P3() == jjVar3.P3() && (Math.abs(jjVar5.k.date - jjVar3.k.date) <= 300 || unVar.f4 == 9);
                                    if (z27) {
                                        TLRPC.Message message2 = jjVar5.k;
                                        arrayList2 = arrayList4;
                                        hashMap = hashMap2;
                                        if (message2 == null || message2.paid_message_stars <= 0) {
                                            if (jjVar3.y3() || jjVar5.y3()) {
                                                if (jjVar3.y3() && jjVar5.y3() && Math.abs(jjVar5.k.fwd_from.date - jjVar3.k.fwd_from.date) <= 300) {
                                                    TLRPC.MessageFwdHeader messageFwdHeader2 = jjVar5.k.fwd_from;
                                                    String str5 = messageFwdHeader2.from_name;
                                                    if (str5 == null || (str3 = jjVar3.k.fwd_from.from_name) == null) {
                                                        TLRPC.Peer peer = messageFwdHeader2.from_id;
                                                        if (peer != null) {
                                                            if (jjVar3.k.fwd_from.from_id != null) {
                                                            }
                                                        }
                                                    } else {
                                                        z27 = str5.equals(str3);
                                                        if (org.telegram.messenger.o5.o(jjVar5.k.guestchat_via_from) != org.telegram.messenger.o5.o(jjVar3.k.guestchat_via_from)) {
                                                            z14 = false;
                                                        }
                                                    }
                                                }
                                            } else if (unVar.e != null) {
                                                long Z0 = jjVar5.Z0();
                                                z27 = Z0 == jjVar3.Z0();
                                                if (!z16) {
                                                    if (z27) {
                                                        if (Z0 < 0) {
                                                            if (unVar.e.megagroup) {
                                                            }
                                                        }
                                                    }
                                                }
                                                if (org.telegram.messenger.o5.o(jjVar5.k.guestchat_via_from) != org.telegram.messenger.o5.o(jjVar3.k.guestchat_via_from)) {
                                                }
                                            } else {
                                                if (org.telegram.messenger.h20.B(unVar.f) || org.telegram.messenger.h20.z(unVar.f)) {
                                                    if (!jjVar3.Y3()) {
                                                        if (!jjVar5.Y3()) {
                                                        }
                                                    }
                                                } else if (unVar.f4 == 7) {
                                                }
                                                if (org.telegram.messenger.o5.o(jjVar5.k.guestchat_via_from) != org.telegram.messenger.o5.o(jjVar3.k.guestchat_via_from)) {
                                                }
                                            }
                                        }
                                        z27 = false;
                                        if (org.telegram.messenger.o5.o(jjVar5.k.guestchat_via_from) != org.telegram.messenger.o5.o(jjVar3.k.guestchat_via_from)) {
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
                                i16 = i14 - this.J;
                                if (i16 >= 0 && i16 < arrayList3.size()) {
                                    jjVar2 = (org.telegram.messenger.jj) arrayList3.get(i14 - this.J);
                                    if (jjVar2 != null && jjVar2.j0) {
                                        int i27 = i14 + 1;
                                        int i28 = i27 - this.J;
                                        jjVar2 = (i28 >= 0 || i28 >= arrayList3.size()) ? null : (org.telegram.messenger.jj) arrayList3.get(i27 - this.J);
                                    }
                                    if (jjVar2 != null && jjVar2.Z1() == jjVar3.Z1()) {
                                        z17 = false;
                                        int i29 = this.J;
                                        boolean z28 = i10 != i29;
                                        if (d == c1Var.f) {
                                            org.telegram.messenger.jj jjVar6 = (org.telegram.messenger.jj) arrayList3.get(i14 - i29);
                                            z13 = !(jjVar6.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && jjVar6.P3() == jjVar3.P3() && (Math.abs(jjVar6.k.date - jjVar3.k.date) <= 300 || unVar.f4 == 9);
                                            if (z13) {
                                                if (jjVar3.y3() || jjVar6.y3()) {
                                                    if (jjVar3.y3() && jjVar6.y3() && Math.abs(jjVar3.k.fwd_from.date - jjVar6.k.fwd_from.date) <= 300) {
                                                        TLRPC.MessageFwdHeader messageFwdHeader3 = jjVar6.k.fwd_from;
                                                        String str6 = messageFwdHeader3.from_name;
                                                        if (str6 == null || (str2 = jjVar3.k.fwd_from.from_name) == null) {
                                                            TLRPC.Peer peer2 = messageFwdHeader3.from_id;
                                                            if (peer2 != null) {
                                                                if (jjVar3.k.fwd_from.from_id != null) {
                                                                }
                                                            }
                                                        } else {
                                                            z13 = str6.equals(str2);
                                                            if (org.telegram.messenger.o5.o(jjVar6.k.guestchat_via_from) != org.telegram.messenger.o5.o(jjVar3.k.guestchat_via_from)) {
                                                                z13 = false;
                                                            }
                                                        }
                                                    }
                                                    z13 = false;
                                                    if (org.telegram.messenger.o5.o(jjVar6.k.guestchat_via_from) != org.telegram.messenger.o5.o(jjVar3.k.guestchat_via_from)) {
                                                    }
                                                } else if (unVar.e != null) {
                                                    long Z02 = jjVar6.Z0();
                                                    boolean z29 = (Z02 != jjVar3.Z0() || jjVar3.y3() || jjVar6.y3()) ? false : true;
                                                    if (!z15 && z29 && Z02 < 0 && unVar.e.megagroup && unVar.f4 != 9) {
                                                        z29 = false;
                                                    }
                                                    if (z29 && unVar.H9()) {
                                                        TLRPC.TL_forumTopic tL_forumTopic = jjVar3.h1;
                                                        if (tL_forumTopic == null) {
                                                            z22 = true;
                                                            z23 = false;
                                                            j11 = org.telegram.messenger.jj.c2(((org.telegram.ui.ActionBar.k2) unVar).currentAccount, jjVar3.k, true, false);
                                                        } else {
                                                            z22 = true;
                                                            z23 = false;
                                                            j11 = tL_forumTopic.id;
                                                        }
                                                    }
                                                    z13 = z29;
                                                    if (org.telegram.messenger.o5.o(jjVar6.k.guestchat_via_from) != org.telegram.messenger.o5.o(jjVar3.k.guestchat_via_from)) {
                                                    }
                                                } else {
                                                    if (org.telegram.messenger.h20.B(unVar.f) || org.telegram.messenger.h20.z(unVar.f)) {
                                                        if (!jjVar3.Y3()) {
                                                            if (!jjVar6.Y3()) {
                                                            }
                                                        }
                                                        z13 = false;
                                                    } else if (unVar.f4 == 7) {
                                                    }
                                                    if (org.telegram.messenger.o5.o(jjVar6.k.guestchat_via_from) != org.telegram.messenger.o5.o(jjVar3.k.guestchat_via_from)) {
                                                    }
                                                }
                                            }
                                        }
                                        if (org.telegram.messenger.w3.T(unVar.e) && unVar.e.megagroup && jjVar3.Z0() <= 0 && (messageFwdHeader = jjVar3.k.fwd_from) != null && (messageFwdHeader.saved_from_peer instanceof TLRPC.TL_peerChannel)) {
                                            if (!z15) {
                                                z13 = false;
                                            }
                                            if (!z16) {
                                                z14 = false;
                                            }
                                        }
                                        if (!z15 && (message = jjVar3.k) != null && message.paid_message_stars > 0) {
                                            z13 = false;
                                        }
                                        boolean z30 = false;
                                        jjVar3.e6(false);
                                        if (k92 != null) {
                                            ArrayList arrayList9 = k92.d;
                                            int i30 = 0;
                                            while (i30 < arrayList9.size()) {
                                                ((org.telegram.messenger.jj) arrayList9.get(i30)).e6(z30);
                                                i30++;
                                                z30 = false;
                                            }
                                        }
                                        if (unVar.jb) {
                                            z18 = z13;
                                        } else {
                                            if (k92 != null) {
                                                z19 = true;
                                                z14 = false;
                                                z18 = false;
                                                q1Var.setShowTopic(z19);
                                                q1Var.s3(jjVar3, k92, z14, z18, z17, z28);
                                                q1Var.setSpoilersSuppressed(unVar.z0.getScrollState() != 0);
                                                q1Var.setHighlighted(unVar.b8 == Integer.MAX_VALUE && jjVar3.f1() == unVar.b8);
                                                z20 = q1Var.v6;
                                                if (!z20 && unVar.f8 != null) {
                                                    long currentTimeMillis = System.currentTimeMillis();
                                                    q1Var.p3(true, unVar.i8, unVar.f8, unVar.d8 || currentTimeMillis - unVar.e8 < 200);
                                                    if (unVar.d8) {
                                                        unVar.e8 = currentTimeMillis;
                                                    }
                                                    unVar.d8 = false;
                                                } else if (!z20 && (num = unVar.g8) != null) {
                                                    q1Var.n3(num.intValue());
                                                } else if (!z20 && (bArr = unVar.h8) != null) {
                                                    q1Var.l3(bArr);
                                                } else if (unVar.f4 == 7 && unVar.I3 != null && (str = unVar.H3) != null) {
                                                    q1Var.o3(str);
                                                }
                                                if (unVar.b8 != Integer.MAX_VALUE) {
                                                    unVar.sc();
                                                }
                                                ArrayList arrayList10 = arrayList2;
                                                indexOf = arrayList10.indexOf(jjVar3);
                                                if (indexOf != -1) {
                                                    if (jjVar3.D == 5 && (j50Var = unVar.p3) != null && j50Var.getTextureView() != null) {
                                                        mf mfVar = unVar.G7;
                                                        if (mfVar != null) {
                                                            org.telegram.messenger.i0.r(mfVar);
                                                            unVar.G7 = null;
                                                        }
                                                        q1Var.getViewTreeObserver().addOnPreDrawListener(new dm(this, q1Var, 0));
                                                    } else if ((jjVar3.M2() && !jjVar3.I2()) || ((fjVar = jjVar3.L1) != null && fjVar.h)) {
                                                        if (!jjVar3.L1.h || (mkVar = unVar.Z) == null || mkVar.L0 == null) {
                                                            q1Var.getViewTreeObserver().addOnPreDrawListener(new dm(this, q1Var, 1));
                                                        } else {
                                                            if (((org.telegram.ui.ActionBar.k2) unVar).actionBar.getVisibility() == 0) {
                                                                int measuredHeight = ((org.telegram.ui.ActionBar.k2) unVar).actionBar.getMeasuredHeight() + ((int) ((org.telegram.ui.ActionBar.k2) unVar).actionBar.getTranslationY());
                                                                wk wkVar = unVar.C1;
                                                                int currentHeight = measuredHeight + (wkVar != null ? wkVar.getCurrentHeight() : 0);
                                                                kk kkVar = unVar.D1;
                                                                i17 = (((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode ? org.telegram.messenger.i0.m : 0) + currentHeight + (kkVar != null ? kkVar.getCurrentHeight() : 0);
                                                            } else {
                                                                i17 = 0;
                                                            }
                                                            float f7 = i17 + unVar.M9;
                                                            float height = unVar.fragmentView == null ? 0.0f : r8.getHeight();
                                                            org.telegram.ui.Components.pe peVar = unVar.Z.L0;
                                                            Rect rect = peVar.t0;
                                                            if (!peVar.p0) {
                                                                peVar.r = true;
                                                                peVar.p0 = true;
                                                                ah0 ah0Var = peVar.W;
                                                                if (ah0Var != null) {
                                                                    ah0Var.invalidate();
                                                                }
                                                                org.telegram.ui.Components.zf zfVar = peVar.V;
                                                                if (zfVar != null) {
                                                                    zfVar.invalidate();
                                                                }
                                                                if (peVar.P != null) {
                                                                    peVar.q0 = q1Var;
                                                                    q1Var.setVisibility(4);
                                                                    peVar.r0 = f7;
                                                                    peVar.s0 = height;
                                                                    org.telegram.ui.Cells.q1 q1Var2 = peVar.P;
                                                                    org.telegram.ui.Cells.q1 q1Var3 = peVar.q0;
                                                                    q1Var2.d6 = q1Var3.d6;
                                                                    q1Var2.m6 = q1Var3.m6;
                                                                    q1Var2.f6 = q1Var3.f6;
                                                                    q1Var2.h6 = q1Var3.h6;
                                                                    q1Var2.j6 = q1Var3.j6;
                                                                    q1Var2.l6 = q1Var3.l6;
                                                                    q1Var2.s3(q1Var.getMessageObject(), null, q1Var.E2(), q1Var.F2(), q1Var.x2(), false);
                                                                    org.telegram.ui.Cells.x1 transitionParams = peVar.P.getTransitionParams();
                                                                    transitionParams.h = peVar.P.getTransitionParams().a();
                                                                    Rect rect2 = transitionParams.E0;
                                                                    transitionParams.L1 = 0.0f;
                                                                    if (peVar.P.getTransitionParams().E0.left == peVar.P.getBackgroundDrawableLeft() && rect2.top == peVar.P.getBackgroundDrawableTop() && rect2.bottom == peVar.P.getBackgroundDrawableBottom()) {
                                                                        i18 = 1;
                                                                    } else {
                                                                        rect.bottom = -(peVar.P.getBackgroundDrawableBottom() - rect2.bottom);
                                                                        rect.top = -(peVar.P.getBackgroundDrawableTop() - rect2.top);
                                                                        if (q1Var.getMessageObject().P3()) {
                                                                            rect.left = -(peVar.P.getBackgroundDrawableLeft() - rect2.left);
                                                                            rect.right = 0;
                                                                        } else {
                                                                            rect.left = 0;
                                                                            rect.right = peVar.P.getBackgroundDrawableRight() - rect2.right;
                                                                        }
                                                                        i18 = 1;
                                                                        transitionParams.x0 = true;
                                                                    }
                                                                    int i31 = peVar.P.nc;
                                                                } else {
                                                                    i18 = 1;
                                                                }
                                                                peVar.d(new sg0(peVar, i18), false);
                                                                peVar.E.invalidate();
                                                                org.telegram.messenger.zs.f(peVar.c).n(peVar, org.telegram.messenger.zs.u3);
                                                            }
                                                            unVar.Z.L0 = null;
                                                        }
                                                    }
                                                    arrayList10.remove(indexOf);
                                                    mk mkVar2 = unVar.Z;
                                                    Runnable runnable = mkVar2.f0;
                                                    if (runnable != null) {
                                                        org.telegram.messenger.i0.r(runnable);
                                                        z21 = true;
                                                        mkVar2.g0 = true;
                                                        mkVar2.f0.run();
                                                        mkVar2.f0 = null;
                                                    } else {
                                                        z21 = true;
                                                    }
                                                    unVar.Z.m0(z21);
                                                }
                                                if (!hashMap.isEmpty()) {
                                                    HashMap hashMap3 = hashMap;
                                                    if (hashMap3.containsKey(jjVar3.F0())) {
                                                        hashMap3.remove(jjVar3.F0());
                                                        xj xjVar = unVar.A0;
                                                        if (xjVar != null) {
                                                            org.telegram.ui.Components.xn xnVar = unVar.g1;
                                                            xjVar.O = c1Var;
                                                            xjVar.P = xnVar;
                                                            r10 = 0;
                                                            xjVar.N = false;
                                                            if (q1Var.mb) {
                                                                q1Var.mb = r10;
                                                                q1Var.setVisibility(r10);
                                                            }
                                                            unVar.Nb(q1Var);
                                                        }
                                                    }
                                                }
                                                r10 = 0;
                                                if (q1Var.mb) {
                                                }
                                                unVar.Nb(q1Var);
                                            }
                                            z18 = z14;
                                            z14 = z13;
                                        }
                                        z19 = true;
                                        q1Var.setShowTopic(z19);
                                        q1Var.s3(jjVar3, k92, z14, z18, z17, z28);
                                        q1Var.setSpoilersSuppressed(unVar.z0.getScrollState() != 0);
                                        q1Var.setHighlighted(unVar.b8 == Integer.MAX_VALUE && jjVar3.f1() == unVar.b8);
                                        z20 = q1Var.v6;
                                        if (!z20) {
                                        }
                                        if (!z20) {
                                        }
                                        if (!z20) {
                                        }
                                        if (unVar.f4 == 7) {
                                            q1Var.o3(str);
                                        }
                                        if (unVar.b8 != Integer.MAX_VALUE) {
                                        }
                                        ArrayList arrayList102 = arrayList2;
                                        indexOf = arrayList102.indexOf(jjVar3);
                                        if (indexOf != -1) {
                                        }
                                        if (!hashMap.isEmpty()) {
                                        }
                                        r10 = 0;
                                        if (q1Var.mb) {
                                        }
                                        unVar.Nb(q1Var);
                                    }
                                }
                                z17 = true;
                                int i292 = this.J;
                                if (i10 != i292) {
                                }
                                if (d == c1Var.f) {
                                }
                                if (org.telegram.messenger.w3.T(unVar.e)) {
                                    if (!z15) {
                                    }
                                    if (!z16) {
                                    }
                                }
                                if (!z15) {
                                    z13 = false;
                                }
                                boolean z302 = false;
                                jjVar3.e6(false);
                                if (k92 != null) {
                                }
                                if (unVar.jb) {
                                }
                                z19 = true;
                                q1Var.setShowTopic(z19);
                                q1Var.s3(jjVar3, k92, z14, z18, z17, z28);
                                q1Var.setSpoilersSuppressed(unVar.z0.getScrollState() != 0);
                                q1Var.setHighlighted(unVar.b8 == Integer.MAX_VALUE && jjVar3.f1() == unVar.b8);
                                z20 = q1Var.v6;
                                if (!z20) {
                                }
                                if (!z20) {
                                }
                                if (!z20) {
                                }
                                if (unVar.f4 == 7) {
                                }
                                if (unVar.b8 != Integer.MAX_VALUE) {
                                }
                                ArrayList arrayList1022 = arrayList2;
                                indexOf = arrayList1022.indexOf(jjVar3);
                                if (indexOf != -1) {
                                }
                                if (!hashMap.isEmpty()) {
                                }
                                r10 = 0;
                                if (q1Var.mb) {
                                }
                                unVar.Nb(q1Var);
                            }
                            int indexOf2 = arrayList8.indexOf(d10) + i10 + 1;
                            i15 = arrayList8.indexOf(d10) + (i10 - arrayList8.size());
                            z13 = false;
                            z14 = false;
                            z15 = false;
                            i14 = indexOf2;
                        }
                    } else {
                        i14 = i10 + 1;
                        z13 = false;
                        z14 = false;
                        z15 = false;
                        i15 = i10 - 1;
                    }
                    z16 = z15;
                    int d112 = d(i15);
                    d = d(i14);
                    d(i26);
                    if (jjVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                    }
                    arrayList2 = arrayList4;
                    hashMap = hashMap2;
                    arrayList3 = arrayList;
                    i16 = i14 - this.J;
                    if (i16 >= 0) {
                        jjVar2 = (org.telegram.messenger.jj) arrayList3.get(i14 - this.J);
                        if (jjVar2 != null) {
                            int i272 = i14 + 1;
                            int i282 = i272 - this.J;
                            if (i282 >= 0) {
                            }
                        }
                        if (jjVar2 != null) {
                            z17 = false;
                            int i2922 = this.J;
                            if (i10 != i2922) {
                            }
                            if (d == c1Var.f) {
                            }
                            if (org.telegram.messenger.w3.T(unVar.e)) {
                            }
                            if (!z15) {
                            }
                            boolean z3022 = false;
                            jjVar3.e6(false);
                            if (k92 != null) {
                            }
                            if (unVar.jb) {
                            }
                            z19 = true;
                            q1Var.setShowTopic(z19);
                            q1Var.s3(jjVar3, k92, z14, z18, z17, z28);
                            q1Var.setSpoilersSuppressed(unVar.z0.getScrollState() != 0);
                            q1Var.setHighlighted(unVar.b8 == Integer.MAX_VALUE && jjVar3.f1() == unVar.b8);
                            z20 = q1Var.v6;
                            if (!z20) {
                            }
                            if (!z20) {
                            }
                            if (!z20) {
                            }
                            if (unVar.f4 == 7) {
                            }
                            if (unVar.b8 != Integer.MAX_VALUE) {
                            }
                            ArrayList arrayList10222 = arrayList2;
                            indexOf = arrayList10222.indexOf(jjVar3);
                            if (indexOf != -1) {
                            }
                            if (!hashMap.isEmpty()) {
                            }
                            r10 = 0;
                            if (q1Var.mb) {
                            }
                            unVar.Nb(q1Var);
                        }
                    }
                    z17 = true;
                    int i29222 = this.J;
                    if (i10 != i29222) {
                    }
                    if (d == c1Var.f) {
                    }
                    if (org.telegram.messenger.w3.T(unVar.e)) {
                    }
                    if (!z15) {
                    }
                    boolean z30222 = false;
                    jjVar3.e6(false);
                    if (k92 != null) {
                    }
                    if (unVar.jb) {
                    }
                    z19 = true;
                    q1Var.setShowTopic(z19);
                    q1Var.s3(jjVar3, k92, z14, z18, z17, z28);
                    q1Var.setSpoilersSuppressed(unVar.z0.getScrollState() != 0);
                    q1Var.setHighlighted(unVar.b8 == Integer.MAX_VALUE && jjVar3.f1() == unVar.b8);
                    z20 = q1Var.v6;
                    if (!z20) {
                    }
                    if (!z20) {
                    }
                    if (!z20) {
                    }
                    if (unVar.f4 == 7) {
                    }
                    if (unVar.b8 != Integer.MAX_VALUE) {
                    }
                    ArrayList arrayList102222 = arrayList2;
                    indexOf = arrayList102222.indexOf(jjVar3);
                    if (indexOf != -1) {
                    }
                    if (!hashMap.isEmpty()) {
                    }
                    r10 = 0;
                    if (q1Var.mb) {
                    }
                    unVar.Nb(q1Var);
                }
                z12 = false;
                q1Var.o6 = z12;
                i13 = unVar.f4;
                if (i13 != 1) {
                }
                arrayList = arrayList5;
                j10 = 0;
                q1Var.r6 = j10;
                if (i13 == 7) {
                }
                q1Var.s6 = org.telegram.messenger.h20.z(unVar.f);
                q1Var.t6 = unVar.f4 == 2;
                q1Var.U6 = unVar.E9();
                q1Var.V6 = unVar.P9();
                q1Var.W6 = unVar.O9();
                q1Var.X6 = unVar.d9();
                q1Var.Y6 = unVar.e9();
                if (jjVar3.r4()) {
                }
                int i262 = i10 + 2;
                if (k92 != null) {
                }
                z16 = z15;
                int d1122 = d(i15);
                d = d(i14);
                d(i262);
                if (jjVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                }
                arrayList2 = arrayList4;
                hashMap = hashMap2;
                arrayList3 = arrayList;
                i16 = i14 - this.J;
                if (i16 >= 0) {
                }
                z17 = true;
                int i292222 = this.J;
                if (i10 != i292222) {
                }
                if (d == c1Var.f) {
                }
                if (org.telegram.messenger.w3.T(unVar.e)) {
                }
                if (!z15) {
                }
                boolean z302222 = false;
                jjVar3.e6(false);
                if (k92 != null) {
                }
                if (unVar.jb) {
                }
                z19 = true;
                q1Var.setShowTopic(z19);
                q1Var.s3(jjVar3, k92, z14, z18, z17, z28);
                q1Var.setSpoilersSuppressed(unVar.z0.getScrollState() != 0);
                q1Var.setHighlighted(unVar.b8 == Integer.MAX_VALUE && jjVar3.f1() == unVar.b8);
                z20 = q1Var.v6;
                if (!z20) {
                }
                if (!z20) {
                }
                if (!z20) {
                }
                if (unVar.f4 == 7) {
                }
                if (unVar.b8 != Integer.MAX_VALUE) {
                }
                ArrayList arrayList1022222 = arrayList2;
                indexOf = arrayList1022222.indexOf(jjVar3);
                if (indexOf != -1) {
                }
                if (!hashMap.isEmpty()) {
                }
                r10 = 0;
                if (q1Var.mb) {
                }
                unVar.Nb(q1Var);
            }
        }
        z11 = false;
        q1Var.n6 = z11;
        if (unVar.f4 == 0) {
        }
        z12 = false;
        q1Var.o6 = z12;
        i13 = unVar.f4;
        if (i13 != 1) {
        }
        arrayList = arrayList5;
        j10 = 0;
        q1Var.r6 = j10;
        if (i13 == 7) {
        }
        q1Var.s6 = org.telegram.messenger.h20.z(unVar.f);
        q1Var.t6 = unVar.f4 == 2;
        q1Var.U6 = unVar.E9();
        q1Var.V6 = unVar.P9();
        q1Var.W6 = unVar.O9();
        q1Var.X6 = unVar.d9();
        q1Var.Y6 = unVar.e9();
        if (jjVar3.r4()) {
        }
        int i2622 = i10 + 2;
        if (k92 != null) {
        }
        z16 = z15;
        int d11222 = d(i15);
        d = d(i14);
        d(i2622);
        if (jjVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
        }
        arrayList2 = arrayList4;
        hashMap = hashMap2;
        arrayList3 = arrayList;
        i16 = i14 - this.J;
        if (i16 >= 0) {
        }
        z17 = true;
        int i2922222 = this.J;
        if (i10 != i2922222) {
        }
        if (d == c1Var.f) {
        }
        if (org.telegram.messenger.w3.T(unVar.e)) {
        }
        if (!z15) {
        }
        boolean z3022222 = false;
        jjVar3.e6(false);
        if (k92 != null) {
        }
        if (unVar.jb) {
        }
        z19 = true;
        q1Var.setShowTopic(z19);
        q1Var.s3(jjVar3, k92, z14, z18, z17, z28);
        q1Var.setSpoilersSuppressed(unVar.z0.getScrollState() != 0);
        q1Var.setHighlighted(unVar.b8 == Integer.MAX_VALUE && jjVar3.f1() == unVar.b8);
        z20 = q1Var.v6;
        if (!z20) {
        }
        if (!z20) {
        }
        if (!z20) {
        }
        if (unVar.f4 == 7) {
        }
        if (unVar.b8 != Integer.MAX_VALUE) {
        }
        ArrayList arrayList10222222 = arrayList2;
        indexOf = arrayList10222222.indexOf(jjVar3);
        if (indexOf != -1) {
        }
        if (!hashMap.isEmpty()) {
        }
        r10 = 0;
        if (q1Var.mb) {
        }
        unVar.Nb(q1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [org.telegram.ui.cm] */
    /* JADX WARN: Type inference failed for: r8v11, types: [org.telegram.ui.Cells.s0] */
    /* JADX WARN: Type inference failed for: r8v12, types: [org.telegram.ui.Cells.ra] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Cells.v0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [org.telegram.ui.Cells.f0, org.telegram.ui.bm] */
    /* JADX WARN: Type inference failed for: r8v16, types: [org.telegram.ui.Cells.z1] */
    /* JADX WARN: Type inference failed for: r8v9, types: [org.telegram.ui.Cells.y1] */
    /* JADX WARN: Type inference failed for: r9v15, types: [org.telegram.ui.Cells.s0] */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.q1 q1Var2;
        un unVar = this.Q;
        if (i10 == 0) {
            q1Var = new org.telegram.ui.Cells.q1(this.h, ((org.telegram.ui.ActionBar.k2) unVar).currentAccount, true, unVar.Va, unVar.xa);
            q1Var.setResourcesProvider(unVar.xa);
            if (unVar.Kc == null) {
                unVar.Kc = new fn(unVar);
            }
            q1Var.setDelegate(unVar.Kc);
            q1Var.Vb = unVar.kc;
            if (unVar.h == null) {
                q1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? ylVar = new yl(context, unVar.xa, true);
                ylVar.setInvalidateColors(true);
                ylVar.setDelegate(new am(this));
                q1Var = ylVar;
            } else {
                if (i10 == 2) {
                    ?? z1Var = new org.telegram.ui.Cells.z1(context, unVar.xa);
                    q1Var2 = z1Var;
                    if (!unVar.G9()) {
                        org.telegram.ui.ActionBar.a7.V(z1Var.getTextView(), org.telegram.ui.ActionBar.t6.tf, unVar.xa);
                        org.telegram.ui.ActionBar.a7.y(z1Var.getBackgroundLayout(), z1Var.getBackgroundLayout().getBackground(), org.telegram.ui.ActionBar.t6.uf, unVar.xa, PorterDuff.Mode.MULTIPLY);
                        q1Var2 = z1Var;
                    }
                } else if (i10 == 3) {
                    ?? bmVar = new bm(this, context, ((org.telegram.ui.ActionBar.k2) unVar).currentAccount, unVar.xa);
                    bmVar.setDelegate(new y0(this, 22));
                    q1Var2 = bmVar;
                } else if (i10 == 4) {
                    q1Var2 = new org.telegram.ui.Cells.v0(context, unVar.xa);
                } else if (i10 == 6) {
                    q1Var2 = new org.telegram.ui.Cells.ra(((org.telegram.ui.ActionBar.k2) unVar).currentAccount, context, unVar.xa);
                } else if (i10 == 7) {
                    q1Var2 = new org.telegram.ui.Cells.s0(context, unVar.xa, false);
                } else if (i10 == 8) {
                    q1Var2 = new cm(this, context, ((org.telegram.ui.ActionBar.k2) unVar).currentAccount, unVar.xa);
                } else if (i10 == 10) {
                    ?? y1Var = new org.telegram.ui.Cells.y1(context, unVar.xa);
                    if (unVar.Kc == null) {
                        unVar.Kc = new fn(unVar);
                    }
                    y1Var.setDelegate(unVar.Kc);
                    q1Var2 = y1Var;
                } else {
                    q1Var = null;
                }
                q1Var = q1Var2;
            }
        }
        return sc.e.o(q1Var, q1Var, -1, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0249  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(s4.c1 c1Var) {
        TLRPC.Message message;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        byte[] bArr;
        Integer num;
        String str;
        String W1;
        org.telegram.messenger.fp fpVar;
        un unVar = this.Q;
        View view = c1Var.a;
        if ((view instanceof org.telegram.ui.Cells.q1) || (view instanceof org.telegram.ui.Cells.s0)) {
            unVar.C9();
        }
        boolean z14 = view instanceof org.telegram.ui.Cells.q1;
        boolean z15 = true;
        if (z14) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
            q1Var.U6 = unVar.E9();
            q1Var.V6 = unVar.P9();
            q1Var.W6 = unVar.O9();
            q1Var.X6 = unVar.d9();
            q1Var.Y6 = unVar.e9();
            q1Var.C3(-1, true, false);
            org.telegram.messenger.jj jjVar = unVar.U3;
            if (jjVar != null && jjVar.T(messageObject)) {
                q1Var.C3(unVar.V3, false, false);
            }
            if (messageObject.G2() && (W1 = messageObject.W1()) != null && (fpVar = (org.telegram.messenger.fp) unVar.getMessagesController().j4.get(W1.replace("️", ""))) != null) {
                MediaController mediaController = unVar.getMediaController();
                org.telegram.messenger.c accountInstance = unVar.getAccountInstance();
                mediaController.getClass();
                Utilities.d.c(new bi.n4(mediaController, fpVar, accountInstance, z15, 10));
            }
            if (messageObject.e6(false)) {
                q1Var.s3(messageObject, q1Var.getCurrentMessagesGroup(), q1Var.E2(), q1Var.F2(), q1Var.x2(), q1Var.A2());
            } else {
                org.telegram.messenger.ej currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    ArrayList arrayList = currentMessagesGroup.d;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((org.telegram.messenger.jj) arrayList.get(i10)).e6(false);
                    }
                }
            }
            if (((org.telegram.ui.ActionBar.k2) unVar).actionBar.u() || unVar.M9()) {
                unVar.d8 = false;
                unVar.e8 = 0L;
                unVar.f8 = null;
                ArrayList arrayList2 = unVar.o4;
                q1Var.f3(arrayList2 == null || !arrayList2.contains(messageObject), false);
                int i11 = org.telegram.messenger.jj.B0(messageObject.k) == unVar.j6 ? 0 : 1;
                if (unVar.m6[i11].indexOfKey(messageObject.f1()) >= 0) {
                    unVar.zb(messageObject, q1Var, i11, false);
                    z10 = true;
                } else {
                    q1Var.setDrawSelectionBackground(false);
                    q1Var.h3(false, false, false);
                    z10 = false;
                }
                z11 = true;
            } else {
                q1Var.setDrawSelectionBackground(false);
                q1Var.h3(false, false, false);
                q1Var.f3(false, false);
                z10 = false;
                z11 = false;
            }
            q1Var.g3(!z11, z11 && z10);
            if (unVar.f4 != 7 || unVar.I3 == null || (str = unVar.H3) == null) {
                pk pkVar = unVar.f3;
                if (pkVar != null && pkVar.getVisibility() == 0) {
                    if (unVar.getMediaDataController().b1[org.telegram.messenger.jj.B0(messageObject.k) == unVar.b7 ? (char) 1 : (char) 0].indexOfKey(messageObject.f1()) >= 0 && unVar.getMediaDataController().d1 != null) {
                        q1Var.o3(unVar.getMediaDataController().d1);
                    }
                }
                q1Var.o3(null);
            } else {
                q1Var.o3(str);
            }
            if (!((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode || !q1Var.v6) {
                if (unVar.b8 != Integer.MAX_VALUE) {
                    if (q1Var.getMessageObject() == null || q1Var.getMessageObject().f1() != unVar.b8) {
                        if (q1Var.getCurrentMessagesGroup() != null) {
                            org.telegram.messenger.ej currentMessagesGroup2 = q1Var.getCurrentMessagesGroup();
                            int i12 = unVar.b8;
                            ArrayList arrayList3 = currentMessagesGroup2.d;
                            if (arrayList3 != null) {
                                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                    org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList3.get(i13);
                                    if (jjVar2 == null || jjVar2.f1() != i12) {
                                    }
                                }
                            }
                        }
                    }
                    z12 = true;
                    q1Var.setHighlighted(z12);
                    z13 = q1Var.v6;
                    if (!z13 && unVar.f8 != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!q1Var.p3(true, unVar.i8, unVar.f8, unVar.d8 || currentTimeMillis - unVar.e8 < 200) && unVar.c8) {
                            org.telegram.ui.Components.cc.a0(unVar).Q(R.raw.error, 36, org.telegram.messenger.cd.L0(2131746450, null)).k(true);
                        }
                        unVar.c8 = false;
                        if (unVar.d8) {
                            unVar.e8 = currentTimeMillis;
                        }
                        unVar.d8 = false;
                    } else if (!z13 && (num = unVar.g8) != null) {
                        q1Var.n3(num.intValue());
                    } else if (z13 && (bArr = unVar.h8) != null) {
                        q1Var.l3(bArr);
                    }
                    if (unVar.b8 != Integer.MAX_VALUE) {
                        unVar.sc();
                    }
                }
                z12 = false;
                q1Var.setHighlighted(z12);
                z13 = q1Var.v6;
                if (!z13) {
                }
                if (!z13) {
                }
                if (z13) {
                    q1Var.l3(bArr);
                }
                if (unVar.b8 != Integer.MAX_VALUE) {
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.s0) {
            org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) view;
            s0Var.e0 = unVar.E9();
            s0Var.i0 = unVar.P9();
            unVar.O9();
            unVar.d9();
            s0Var.j0 = unVar.e9();
        } else if (view instanceof org.telegram.ui.Cells.z1) {
            ((org.telegram.ui.Cells.z1) view).getTextView().setTranslationX(unVar.e9() / 2.0f);
        }
        int b10 = c1Var.b();
        int i14 = this.J;
        if (b10 < i14 || b10 >= this.K) {
            return;
        }
        org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) (this.L ? this.M : this.N ? this.P : unVar.K6).get(b10 - i14);
        if (jjVar3 == null || (message = jjVar3.k) == null || !message.media_unread || !message.mentioned) {
            return;
        }
        if (!((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode && unVar.f4 == 0 && !org.telegram.messenger.jj.R4(jjVar3.k) && !jjVar3.h4()) {
            int i15 = unVar.B6 - 1;
            unVar.B6 = i15;
            if (i15 <= 0) {
                unVar.B6 = 0;
                unVar.C6 = true;
                unVar.dc(false);
            } else {
                unVar.x1.c(2, i15, true);
            }
            unVar.getMessagesController().k3(org.telegram.messenger.w3.T(unVar.e) ? unVar.e.id : 0L, jjVar3.f1(), unVar.j6);
            jjVar3.k.media_unread = false;
        }
        if (z14) {
            org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
            if (((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode) {
                q1Var2.setHighlighted(true);
            } else {
                q1Var2.k3();
            }
        }
    }
}
