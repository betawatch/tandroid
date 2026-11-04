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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fl extends org.telegram.ui.Components.ti0 {
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
    public final /* synthetic */ wm R;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public fl(wm wmVar, Context context) {
        this.R = wmVar;
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
        TLRPC.User user = wmVar.f;
        this.n = user != null && user.bot;
        C(true);
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    public final void K(boolean z10) {
        wm wmVar = this.R;
        if (org.telegram.messenger.l10.u(wmVar.f)) {
            if (z10) {
                wmVar.Rc = true;
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

    public final void M(org.telegram.messenger.zi ziVar) {
        wm wmVar = this.R;
        int childCount = wmVar.A0.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = wmVar.A0.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var.getMessageObject() == ziVar) {
                    q1Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean N() {
        wm wmVar = this.R;
        return org.telegram.messenger.l10.v(wmVar.f) && wmVar.b() == 0 && !wmVar.Rc && wmVar.g4 == 0;
    }

    public final void O(boolean z10) {
        boolean z11;
        wm wmVar = this.R;
        ArrayList arrayList = wmVar.L6;
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify data set changed fragmentOpened=" + wmVar.f6);
        }
        if (z10 && wmVar.f6) {
            u4.m0 itemAnimator = wmVar.A0.getItemAnimator();
            yi yiVar = wmVar.B0;
            if (itemAnimator != yiVar) {
                wmVar.A0.setItemAnimator(yiVar);
            }
        } else {
            wmVar.A0.setItemAnimator(null);
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
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(size);
            if (ziVar.j0) {
                size--;
            } else {
                TLRPC.Message message = ziVar.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                        z11 = true;
                    }
                }
            }
        }
        z11 = false;
        boolean[] zArr = wmVar.T6;
        if ((zArr[0] && (wmVar.c7 == 0 || zArr[1])) || z11) {
            wmVar.Z6(((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow);
        }
    }

    public final void P(int i3, boolean z10) {
        org.telegram.messenger.zi messageObject;
        if (org.telegram.messenger.r2.a) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i3);
            k2.p1.w(z10 ? " with thanos effect" : "", sb2);
        }
        wm wmVar = this.R;
        if (((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow) {
            u4.m0 itemAnimator = wmVar.A0.getItemAnimator();
            yi yiVar = wmVar.B0;
            if (itemAnimator != yiVar) {
                wmVar.A0.setItemAnimator(yiVar);
            }
        } else {
            wmVar.A0.setItemAnimator(null);
        }
        if (z10 && wmVar.B0 != null) {
            u4.m0 itemAnimator2 = wmVar.A0.getItemAnimator();
            yi yiVar2 = wmVar.B0;
            if (itemAnimator2 == yiVar2) {
                u4.d1 K = wmVar.A0.K(i3);
                if (K == null) {
                    yiVar2.getClass();
                } else {
                    yiVar2.S.add(K);
                    View view = K.a;
                    if ((view instanceof org.telegram.ui.Cells.q1) && (messageObject = ((org.telegram.ui.Cells.q1) view).getMessageObject()) != null) {
                        messageObject.a0 = true;
                    }
                }
            }
        }
        S();
        try {
            super.s(i3);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void Q(int i3) {
        int i10;
        wm wmVar = this.R;
        ArrayList arrayList = wmVar.L6;
        if (wmVar.C0 == null || this.M || this.O) {
            return;
        }
        int i11 = 0;
        if (!wmVar.Q4 && wmVar.a8 != null) {
            int childCount = wmVar.A0.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = wmVar.A0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.messenger.zi messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                    org.telegram.messenger.zi ziVar = wmVar.a8;
                    if (messageObject == ziVar) {
                        if (arrayList.indexOf(ziVar) >= 0) {
                            i10 = arrayList.indexOf(wmVar.a8) + this.K;
                            i11 = wmVar.f9(childAt);
                        }
                    }
                }
                i12++;
            }
        }
        i10 = -1;
        g(i3);
        if (i10 != -1) {
            wmVar.C0.h1(i10, i11);
        }
    }

    public final org.telegram.ui.Cells.q1 R(org.telegram.messenger.zi ziVar, boolean z10, boolean z11) {
        wm wmVar = this.R;
        if (z10) {
            int childCount = wmVar.A0.getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = wmVar.A0.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject() == ziVar && TextUtils.equals(q1Var.y5, q1Var.P5.k.post_author)) {
                        q1Var.u3(ziVar, q1Var.getCurrentMessagesGroup(), q1Var.G2(), q1Var.H2(), q1Var.z2(), q1Var.C2());
                        return q1Var;
                    }
                }
                i3++;
                ziVar = ziVar;
            }
        }
        org.telegram.messenger.zi ziVar2 = ziVar;
        int indexOf = (this.M ? this.N : this.O ? this.Q : wmVar.L6).indexOf(ziVar2);
        if (indexOf == -1) {
            return null;
        }
        if (!z11) {
            Q(this.K + indexOf);
            return null;
        }
        int i10 = wm.ld;
        wm.ld = i10 + 1;
        ziVar2.k1 = i10;
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
        int i3;
        TLRPC.PeerSettings C1;
        TLRPC.PeerSettings C12;
        int i10;
        int i11;
        wm wmVar = this.R;
        boolean[] zArr = wmVar.T6;
        this.r = 0;
        ArrayList arrayList = this.M ? this.N : this.O ? this.Q : wmVar.L6;
        if (wmVar.g4 == 3 && wmVar.jb) {
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
            TLRPC.User user4 = wmVar.f;
            if (user4 != null && !org.telegram.messenger.l10.t(user4) && !org.telegram.messenger.l10.z(wmVar.f)) {
                TLRPC.PeerSettings C13 = wmVar.getMessagesController().C1(wmVar.f.id);
                int i13 = org.telegram.ui.Cells.ra.Q;
                if (C13 != null && ((C13.phone_country != null || C13.registration_month != null) && !org.telegram.messenger.hp.F2(wmVar.f) && wmVar.g4 == 0)) {
                    int i14 = this.r;
                    this.r = i14 + 1;
                    this.E = i14;
                    return;
                }
            }
            if (org.telegram.messenger.l10.z(wmVar.f) || ((user = wmVar.f) != null && user.bot && !org.telegram.messenger.hp.F2(user) && wmVar.g4 == 0)) {
                int i15 = this.r;
                this.r = i15 + 1;
                this.x = i15;
                return;
            }
            return;
        }
        if (!this.O) {
            boolean[] zArr2 = wmVar.V6;
            if ((!zArr2[0] || (wmVar.c7 != 0 && !zArr2[1])) && !wmVar.W6) {
                int i16 = this.r;
                this.r = i16 + 1;
                this.G = i16;
                int i17 = this.r;
                this.K = i17;
                int size = arrayList.size() + i17;
                this.r = size;
                this.L = size;
                user2 = wmVar.f;
                if (user2 != null && !org.telegram.messenger.l10.t(user2) && !org.telegram.messenger.l10.z(wmVar.f)) {
                    C1 = wmVar.getMessagesController().C1(wmVar.f.id);
                    int i18 = org.telegram.ui.Cells.ra.Q;
                    if (C1 != null && ((C1.phone_country != null || C1.registration_month != null) && !org.telegram.messenger.hp.F2(wmVar.f) && wmVar.g4 == 0 && zArr[0])) {
                        C12 = wmVar.getMessagesController().C1(wmVar.f.id);
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
                        i3 = wmVar.g4;
                        if (i3 == 9) {
                            int i24 = this.r;
                            this.s = i24;
                            this.r = i24 + 2;
                            this.w = i24 + 1;
                        }
                        if (i3 == 5 && !lg.u1.g(wmVar.f4)) {
                            int i25 = this.r;
                            this.r = i25 + 1;
                            this.s = i25;
                        }
                        if (this.O ? !(!(zArr[0] && (wmVar.c7 == 0 || zArr[1])) && (org.telegram.messenger.g0.Q1() || wmVar.v4 || wmVar.f != null)) : this.P) {
                            this.F = -5;
                            return;
                        }
                        int i26 = this.r;
                        this.r = i26 + 1;
                        this.F = i26;
                        return;
                    }
                }
                if ((!org.telegram.messenger.l10.z(wmVar.f) || ((user3 = wmVar.f) != null && user3.bot && !org.telegram.messenger.hp.F2(user3) && wmVar.g4 == 0)) && zArr[0]) {
                    int i27 = this.r;
                    this.r = i27 + 1;
                    this.x = i27;
                }
                i3 = wmVar.g4;
                if (i3 == 9) {
                }
                if (i3 == 5) {
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
        user2 = wmVar.f;
        if (user2 != null) {
            C1 = wmVar.getMessagesController().C1(wmVar.f.id);
            int i182 = org.telegram.ui.Cells.ra.Q;
            if (C1 != null) {
                C12 = wmVar.getMessagesController().C1(wmVar.f.id);
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
                i3 = wmVar.g4;
                if (i3 == 9) {
                }
                if (i3 == 5) {
                }
                if (this.O) {
                }
            }
        }
        if (!org.telegram.messenger.l10.z(wmVar.f)) {
        }
        int i272 = this.r;
        this.r = i272 + 1;
        this.x = i272;
        i3 = wmVar.g4;
        if (i3 == 9) {
        }
        if (i3 == 5) {
        }
        if (this.O) {
        }
    }

    public final void T() {
        int i3 = this.r;
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
        if (i3 == this.r && i10 == this.x && i14 == this.F && i15 == this.G && i16 == this.K && i17 == this.L && i12 == this.s && i13 == this.w && i11 == this.E && i18 == this.H && i19 == this.I && i20 == this.J) {
            return;
        }
        O(false);
    }

    @Override // u4.h0
    public final int b() {
        this.y = -5;
        wm wmVar = this.R;
        a0.h hVar = wmVar.u8;
        if (wmVar.d6.get(wmVar.s4, 0) == 0) {
            return this.r;
        }
        TLRPC.User user = wmVar.f;
        if (user == null || !user.bot || wmVar.g4 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(wmVar.f.id)).description == null && ((TL_bots.BotInfo) hVar.f(wmVar.f.id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(wmVar.f.id)).description_document == null)) && !org.telegram.messenger.l10.z(wmVar.f) && !org.telegram.messenger.l10.u(wmVar.f))) {
            return 0;
        }
        this.y = 0;
        return 1;
    }

    @Override // u4.h0
    public final long c(int i3) {
        wm wmVar = this.R;
        if (wmVar.d6.get(wmVar.s4, 0) != 0 && i3 == this.y) {
            return 1L;
        }
        ArrayList arrayList = this.M ? this.N : this.O ? this.Q : wmVar.L6;
        if (i3 >= this.K && i3 < this.L) {
            return ((org.telegram.messenger.zi) arrayList.get(i3 - r1)).k1;
        }
        if (i3 == this.x || i3 == this.y) {
            return 1L;
        }
        if (i3 == this.F) {
            return 2L;
        }
        if (i3 == this.G) {
            return 3L;
        }
        if (i3 == this.s) {
            return 4L;
        }
        if (i3 == this.E) {
            return 6L;
        }
        if (i3 == this.H) {
            return 7L;
        }
        if (i3 == this.I) {
            return 8L;
        }
        if (i3 == this.J) {
            return 9L;
        }
        return i3 == this.w ? 10L : 5L;
    }

    @Override // u4.h0
    public final int d(int i3) {
        wm wmVar = this.R;
        if (wmVar.d6.get(wmVar.s4, 0) != 0 && i3 == this.y) {
            return 3;
        }
        if (i3 == this.s || i3 == this.w) {
            return 1;
        }
        int i10 = this.K;
        if (i3 >= i10 && i3 < this.L) {
            return ((org.telegram.messenger.zi) (this.M ? this.N : this.O ? this.Q : wmVar.L6).get(i3 - i10)).U;
        }
        if (i3 == this.x) {
            return 3;
        }
        if (i3 == this.E) {
            return 6;
        }
        if (i3 == this.I || i3 == this.H) {
            return 7;
        }
        return i3 == this.J ? 8 : 4;
    }

    @Override // org.telegram.ui.Components.ti0, u4.h0
    public final void f() {
        O(false);
    }

    @Override // org.telegram.ui.Components.ti0, u4.h0
    public final void g(int i3) {
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item changed " + i3);
        }
        wm wmVar = this.R;
        if (!((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow || wmVar.c1) {
            wmVar.A0.setItemAnimator(null);
        } else {
            u4.m0 itemAnimator = wmVar.A0.getItemAnimator();
            yi yiVar = wmVar.B0;
            if (itemAnimator != yiVar) {
                wmVar.A0.setItemAnimator(yiVar);
            }
        }
        S();
        try {
            super.g(i3);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ti0, u4.h0
    public final void i(int i3) {
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item inserted " + i3);
        }
        wm wmVar = this.R;
        if (((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow) {
            u4.m0 itemAnimator = wmVar.A0.getItemAnimator();
            yi yiVar = wmVar.B0;
            if (itemAnimator != yiVar) {
                wmVar.A0.setItemAnimator(yiVar);
            }
        } else {
            wmVar.A0.setItemAnimator(null);
        }
        S();
        try {
            super.i(i3);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // u4.h0
    public final void j(int i3, int i10) {
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item moved" + i3 + ":" + i10);
        }
        wm wmVar = this.R;
        if (((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow) {
            u4.m0 itemAnimator = wmVar.A0.getItemAnimator();
            yi yiVar = wmVar.B0;
            if (itemAnimator != yiVar) {
                wmVar.A0.setItemAnimator(yiVar);
            }
        } else {
            wmVar.A0.setItemAnimator(null);
        }
        S();
        try {
            super.j(i3, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ti0, u4.h0
    public final void k(int i3, int i10) {
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item range changed " + i3 + ":" + i10);
        }
        wm wmVar = this.R;
        if (((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow) {
            u4.m0 itemAnimator = wmVar.A0.getItemAnimator();
            yi yiVar = wmVar.B0;
            if (itemAnimator != yiVar) {
                wmVar.A0.setItemAnimator(yiVar);
            }
        } else {
            wmVar.A0.setItemAnimator(null);
        }
        S();
        try {
            super.k(i3, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ti0, u4.h0
    public final void o(int i3, int i10) {
        int i11;
        int i12;
        wm wmVar = this.R;
        ArrayList arrayList = wmVar.L6;
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item range inserted " + i3 + ":" + i10);
        }
        if (((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow) {
            u4.m0 itemAnimator = wmVar.A0.getItemAnimator();
            yi yiVar = wmVar.B0;
            if (itemAnimator != yiVar) {
                wmVar.A0.setItemAnimator(yiVar);
            }
        } else {
            wmVar.A0.setItemAnimator(null);
        }
        S();
        if (i3 == 1 && i10 > 0 && (i11 = i3 + i10) >= (i12 = this.K) && i11 < this.L) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i11 - i12);
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get((i11 - this.K) - 1);
            if ((wmVar.e != null && ziVar.Z0() == ziVar2.Z0()) || (wmVar.f != null && ziVar.Q3() == ziVar2.Q3())) {
                g(i3);
            }
        }
        try {
            super.o(i3, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ti0, u4.h0
    public final void p(int i3, int i10) {
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item range removed" + i3 + ":" + i10);
        }
        wm wmVar = this.R;
        if (((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow) {
            u4.m0 itemAnimator = wmVar.A0.getItemAnimator();
            yi yiVar = wmVar.B0;
            if (itemAnimator != yiVar) {
                wmVar.A0.setItemAnimator(yiVar);
            }
        } else {
            wmVar.A0.setItemAnimator(null);
        }
        S();
        try {
            super.p(i3, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ti0, u4.h0
    public final void s(int i3) {
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("notify item removed " + i3);
        }
        wm wmVar = this.R;
        if (((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow) {
            u4.m0 itemAnimator = wmVar.A0.getItemAnimator();
            yi yiVar = wmVar.B0;
            if (itemAnimator != yiVar) {
                wmVar.A0.setItemAnimator(yiVar);
            }
        } else {
            wmVar.A0.setItemAnimator(null);
        }
        S();
        try {
            super.s(i3);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x025b, code lost:
    
        if (r4.W4.containsKey(java.lang.Integer.valueOf(((org.telegram.messenger.zi) r8.get(0)).f1())) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x05b8, code lost:
    
        if (r6 != (r2.h1 == null ? org.telegram.messenger.zi.c2(((org.telegram.ui.ActionBar.d2) r4).currentAccount, r2.k, r9, r10) : r11.id)) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x05e7, code lost:
    
        if (org.telegram.messenger.zi.C1(r5.k.peer_id) == org.telegram.messenger.zi.C1(r2.k.peer_id)) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x065a, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0602, code lost:
    
        if (r2.S1() == r5.S1()) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0658, code lost:
    
        if (org.telegram.messenger.zi.C1(r6) == org.telegram.messenger.zi.C1(r5.k.fwd_from.from_id)) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0922, code lost:
    
        if (r4.B0 == null) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x03f2, code lost:
    
        if (r4.g4 != 9) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x041e, code lost:
    
        if (org.telegram.messenger.zi.C1(r5.k.peer_id) == org.telegram.messenger.zi.C1(r10.k.peer_id)) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0491, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0439, code lost:
    
        if (r10.S1() == r5.S1()) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x048f, code lost:
    
        if (org.telegram.messenger.zi.C1(r6) == org.telegram.messenger.zi.C1(r5.k.fwd_from.from_id)) goto L267;
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
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.UserFull userFull;
        TLObject tLObject;
        int i10;
        int i11;
        org.telegram.messenger.zi ziVar;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        ArrayList arrayList;
        long j10;
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
        org.telegram.messenger.vi viVar;
        mj mjVar;
        int i16;
        int i17;
        boolean z21;
        org.telegram.ui.Components.p40 p40Var;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str2;
        boolean z22;
        boolean z23;
        long j11;
        org.telegram.messenger.zi ziVar2;
        String str3;
        boolean z24;
        int i18;
        TLRPC.ChatFull chatFull;
        View view = d1Var.a;
        wm wmVar = this.R;
        a0.h hVar = wmVar.u8;
        ArrayList arrayList4 = wmVar.J4;
        HashMap hashMap2 = wmVar.K4;
        if (i3 == this.x || i3 == this.y) {
            org.telegram.ui.Cells.f0 f0Var = (org.telegram.ui.Cells.f0) view;
            if (org.telegram.messenger.l10.z(wmVar.f)) {
                f0Var.b(false, 0L, org.telegram.messenger.bd.L0(2131746275), null, null, null);
            } else {
                TLRPC.User user = wmVar.f;
                if (user == null || user.id != 489000) {
                    TL_bots.BotInfo botInfo = hVar.m() != 0 ? (TL_bots.BotInfo) hVar.f(wmVar.f.id) : null;
                    boolean z25 = (botInfo == null || (TextUtils.isEmpty(botInfo.description) && botInfo.description_photo == null && botInfo.description_document == null)) && org.telegram.messenger.l10.t(wmVar.f) && (userFull = wmVar.r8) != null && userFull.bot_manager_id != 0 && wmVar.f.bot_can_edit;
                    TLRPC.User user2 = wmVar.f;
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
                    f0Var.b(true, j12, str4, tLObject, botInfo, z25 ? org.telegram.messenger.m5.l(((org.telegram.ui.ActionBar.d2) wmVar).currentAccount, wmVar.r8.bot_manager_id) : null);
                } else {
                    f0Var.b(false, 0L, org.telegram.messenger.bd.L0(2131743627), null, null, null);
                }
            }
            wm.o4(wmVar, f0Var);
            return;
        }
        if (i3 == this.J) {
            ((org.telegram.ui.Cells.a0) view).setDialogId(wmVar.a());
            return;
        }
        if (i3 == this.E) {
            org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
            TLRPC.EncryptedChat encryptedChat = wmVar.h;
            long a10 = encryptedChat != null ? encryptedChat.user_id : wmVar.a();
            raVar.b(a10, wmVar.getMessagesController().C1(a10));
            return;
        }
        if (i3 == this.G || i3 == this.F) {
            ((org.telegram.ui.Cells.w0) view).setProgressVisible(wmVar.a7 > 1);
            return;
        }
        if (i3 == this.I) {
            if (wmVar.getMessagesController().C1(wmVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.t0) view).setCustomText(org.telegram.messenger.bd.a0(null, null, 2131751794, org.telegram.messenger.bd.N(wmVar.getConnectionsManager().getCurrentTime() - r1.name_change_date)));
            return;
        }
        if (i3 == this.H) {
            if (wmVar.getMessagesController().C1(wmVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.t0) view).setCustomText(org.telegram.messenger.bd.a0(null, null, 2131751793, org.telegram.messenger.bd.N(wmVar.getConnectionsManager().getCurrentTime() - r1.photo_change_date)));
            return;
        }
        if (i3 == this.s) {
            org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
            wm.p4(wmVar);
            t0Var.setMessageObject(wmVar.X3);
            int i19 = wmVar.g4;
            if (i19 == 3) {
                t0Var.setCustomText(org.telegram.messenger.bd.M0(2131745904, null));
            } else if (i19 == 5) {
                t0Var.setCustomText(org.telegram.messenger.bd.M0(2131752671, null));
            } else if (i19 == 9) {
                t0Var.setCustomText(org.telegram.messenger.bd.M0(2131742903, null));
            }
            t0Var.setAlpha(1.0f);
            t0Var.setSpoilersSuppressed(wmVar.A0.getScrollState() != 0);
            return;
        }
        if (i3 == this.w) {
            org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) view;
            wm.q4(wmVar);
            t0Var2.setMessageObject(wmVar.Y3);
            t0Var2.setCustomText(org.telegram.messenger.bd.M0(2131742904, null));
            t0Var2.setAlpha(1.0f);
            t0Var2.setSpoilersSuppressed(wmVar.A0.getScrollState() != 0);
            return;
        }
        int i20 = this.K;
        if (i3 < i20 || i3 >= this.L) {
            return;
        }
        ArrayList arrayList5 = this.M ? this.N : this.O ? this.Q : wmVar.L6;
        org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) arrayList5.get(i3 - i20);
        if (!(view instanceof org.telegram.ui.Cells.q1)) {
            ArrayList arrayList6 = arrayList5;
            if (!(view instanceof org.telegram.ui.Cells.t0)) {
                if (view instanceof org.telegram.ui.Cells.z1) {
                    org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                    z1Var.setText(org.telegram.messenger.bd.M0(2131743848, null));
                    z1Var.getTextView().setTranslationX(wmVar.l9() / 2.0f);
                    if (wmVar.U7 != 0) {
                        wmVar.U7 = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            if ((ziVar3 == null || !ziVar3.j0) && (i11 = (i10 = i3 + 1) - this.K) >= 0 && i11 < arrayList6.size()) {
                org.telegram.messenger.zi ziVar4 = (org.telegram.messenger.zi) arrayList6.get(i10 - this.K);
                if (ziVar4 == null || !ziVar4.j0) {
                    ziVar = ziVar4;
                } else {
                    int i21 = i3 + 2;
                    int i22 = i21 - this.K;
                    ziVar = (i22 < 0 || i22 >= arrayList6.size()) ? null : (org.telegram.messenger.zi) arrayList6.get(i21 - this.K);
                }
                if (ziVar == null || (ziVar3 != null && ziVar.Z1() != ziVar3.Z1())) {
                    z10 = true;
                    org.telegram.ui.Cells.t0 t0Var3 = (org.telegram.ui.Cells.t0) view;
                    t0Var3.f0 = wmVar.O9();
                    t0Var3.j0 = wmVar.Z9();
                    wmVar.Y9();
                    wmVar.k9();
                    t0Var3.k0 = wmVar.l9();
                    t0Var3.g0 = org.telegram.messenger.t3.c0(wmVar.e);
                    t0Var3.h0 = org.telegram.messenger.t3.p0(wmVar.e);
                    t0Var3.i0 = org.telegram.messenger.l10.u(wmVar.f);
                    boolean z26 = t0Var3.l0 == z10;
                    t0Var3.l0 = z10;
                    t0Var3.f0(ziVar3, z26);
                    t0Var3.setAlpha(1.0f);
                    t0Var3.setShowTopic(true);
                    t0Var3.setSpoilersSuppressed(wmVar.A0.getScrollState() == 0);
                    return;
                }
            }
            z10 = false;
            org.telegram.ui.Cells.t0 t0Var32 = (org.telegram.ui.Cells.t0) view;
            t0Var32.f0 = wmVar.O9();
            t0Var32.j0 = wmVar.Z9();
            wmVar.Y9();
            wmVar.k9();
            t0Var32.k0 = wmVar.l9();
            t0Var32.g0 = org.telegram.messenger.t3.c0(wmVar.e);
            t0Var32.h0 = org.telegram.messenger.t3.p0(wmVar.e);
            t0Var32.i0 = org.telegram.messenger.l10.u(wmVar.f);
            if (t0Var32.l0 == z10) {
            }
            t0Var32.l0 = z10;
            t0Var32.f0(ziVar3, z26);
            t0Var32.setAlpha(1.0f);
            t0Var32.setShowTopic(true);
            t0Var32.setSpoilersSuppressed(wmVar.A0.getScrollState() == 0);
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
        org.telegram.messenger.ui s92 = wmVar.s9(ziVar3);
        q1Var.e6 = wmVar.e != null || org.telegram.messenger.l10.B(wmVar.f) || org.telegram.messenger.l10.z(wmVar.f) || wmVar.g4 == 7;
        q1Var.E.a(false, false);
        q1Var.f6 = org.telegram.messenger.l10.u(wmVar.f);
        q1Var.r6 = wmVar.W9();
        int i23 = wmVar.g4;
        q1Var.g6 = i23 == 3;
        q1Var.h6 = i23 == 3 && wmVar.jb;
        TLRPC.User user3 = wmVar.f;
        q1Var.i6 = user3 != null && user3.bot;
        q1Var.j6 = org.telegram.messenger.t3.T(wmVar.e) && wmVar.e.megagroup;
        q1Var.k6 = org.telegram.messenger.t3.c0(wmVar.e);
        q1Var.l6 = org.telegram.messenger.t3.p0(wmVar.e);
        q1Var.m6 = org.telegram.messenger.t3.c0(wmVar.e) && wmVar.w4 && wmVar.b() == 1;
        q1Var.n6 = (wmVar.s4 != 0 || (q1Var.k6 && wmVar.w4)) && !q1Var.l6;
        int i24 = wmVar.g4;
        if (i24 != 1 && i24 != 9 && org.telegram.messenger.t3.T(wmVar.e)) {
            TLRPC.Chat chat = wmVar.e;
            if (chat.has_link && !chat.megagroup) {
                z11 = true;
                q1Var.o6 = z11;
                if (wmVar.g4 == 0) {
                    if (!wmVar.W4.containsKey(Integer.valueOf(ziVar3.f1()))) {
                        if (s92 != null) {
                            ArrayList arrayList7 = s92.d;
                            if (!arrayList7.isEmpty()) {
                            }
                        }
                    }
                    z12 = true;
                    q1Var.p6 = z12;
                    i12 = wmVar.g4;
                    if (i12 != 1 || i12 == 9 || (chatFull = wmVar.q8) == null) {
                        arrayList = arrayList5;
                        j10 = 0;
                    } else {
                        arrayList = arrayList5;
                        j10 = chatFull.linked_chat_id;
                    }
                    q1Var.s6 = j10;
                    if (i12 == 7 || wmVar.d4 != 1) {
                        q1Var.t6 = org.telegram.messenger.l10.z(wmVar.f);
                    } else {
                        q1Var.t6 = org.telegram.messenger.l10.y(org.telegram.messenger.zi.B0(ziVar3.k));
                    }
                    q1Var.u6 = wmVar.g4 == 2;
                    q1Var.V6 = wmVar.O9();
                    q1Var.W6 = wmVar.Z9();
                    q1Var.X6 = wmVar.Y9();
                    q1Var.Y6 = wmVar.k9();
                    q1Var.Z6 = wmVar.l9();
                    if (ziVar3.s4()) {
                        org.telegram.messenger.g0.K(q1Var, new ai.y1(26));
                    }
                    int i25 = i3 + 2;
                    if (s92 != null) {
                        ArrayList arrayList8 = s92.e;
                        org.telegram.messenger.ri d10 = s92.d(ziVar3);
                        if (d10 == null) {
                            z13 = false;
                            z14 = false;
                            z15 = false;
                            i14 = -100;
                            i13 = -100;
                        } else {
                            if (!s92.i) {
                                if ((d10.l & 4) != 0) {
                                    i18 = s92.n ? arrayList8.indexOf(d10) + (i3 - arrayList8.size()) : arrayList8.indexOf(d10) + i3 + 1;
                                    z24 = false;
                                    z15 = false;
                                } else {
                                    z24 = true;
                                    z15 = true;
                                    i18 = -100;
                                }
                                if ((d10.l & 8) != 0) {
                                    z13 = z24;
                                    i14 = s92.n ? arrayList8.indexOf(d10) + i3 + 1 : arrayList8.indexOf(d10) + (i3 - arrayList8.size());
                                    i13 = i18;
                                    z16 = false;
                                } else {
                                    z13 = z24;
                                    i14 = -100;
                                    i13 = i18;
                                    z16 = true;
                                }
                                z14 = z16;
                                int d11 = d(i14);
                                d = d(i13);
                                d(i25);
                                if ((ziVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d11 == d1Var.f) {
                                    arrayList3 = arrayList;
                                    org.telegram.messenger.zi ziVar5 = (org.telegram.messenger.zi) arrayList3.get(i14 - this.K);
                                    boolean z27 = ziVar5.Q3() == ziVar3.Q3() && (Math.abs(ziVar5.k.date - ziVar3.k.date) <= 300 || wmVar.g4 == 9);
                                    if (z27) {
                                        TLRPC.Message message2 = ziVar5.k;
                                        arrayList2 = arrayList4;
                                        hashMap = hashMap2;
                                        if (message2 == null || message2.paid_message_stars <= 0) {
                                            if (ziVar3.z3() || ziVar5.z3()) {
                                                if (ziVar3.z3() && ziVar5.z3() && Math.abs(ziVar5.k.fwd_from.date - ziVar3.k.fwd_from.date) <= 300) {
                                                    TLRPC.MessageFwdHeader messageFwdHeader2 = ziVar5.k.fwd_from;
                                                    String str5 = messageFwdHeader2.from_name;
                                                    if (str5 == null || (str3 = ziVar3.k.fwd_from.from_name) == null) {
                                                        TLRPC.Peer peer = messageFwdHeader2.from_id;
                                                        if (peer != null) {
                                                            if (ziVar3.k.fwd_from.from_id != null) {
                                                            }
                                                        }
                                                    } else {
                                                        z27 = str5.equals(str3);
                                                        if (org.telegram.messenger.m5.o(ziVar5.k.guestchat_via_from) != org.telegram.messenger.m5.o(ziVar3.k.guestchat_via_from)) {
                                                            z14 = false;
                                                        }
                                                    }
                                                }
                                            } else if (wmVar.e != null) {
                                                long Z0 = ziVar5.Z0();
                                                z27 = Z0 == ziVar3.Z0();
                                                if (!z16) {
                                                    if (z27) {
                                                        if (Z0 < 0) {
                                                            if (wmVar.e.megagroup) {
                                                            }
                                                        }
                                                    }
                                                }
                                                if (org.telegram.messenger.m5.o(ziVar5.k.guestchat_via_from) != org.telegram.messenger.m5.o(ziVar3.k.guestchat_via_from)) {
                                                }
                                            } else {
                                                if (org.telegram.messenger.l10.B(wmVar.f) || org.telegram.messenger.l10.z(wmVar.f)) {
                                                    if (!ziVar3.Z3()) {
                                                        if (!ziVar5.Z3()) {
                                                        }
                                                    }
                                                } else if (wmVar.g4 == 7) {
                                                }
                                                if (org.telegram.messenger.m5.o(ziVar5.k.guestchat_via_from) != org.telegram.messenger.m5.o(ziVar3.k.guestchat_via_from)) {
                                                }
                                            }
                                        }
                                        z27 = false;
                                        if (org.telegram.messenger.m5.o(ziVar5.k.guestchat_via_from) != org.telegram.messenger.m5.o(ziVar3.k.guestchat_via_from)) {
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
                                    ziVar2 = (org.telegram.messenger.zi) arrayList3.get(i13 - this.K);
                                    if (ziVar2 != null && ziVar2.j0) {
                                        int i26 = i13 + 1;
                                        int i27 = i26 - this.K;
                                        ziVar2 = (i27 >= 0 || i27 >= arrayList3.size()) ? null : (org.telegram.messenger.zi) arrayList3.get(i26 - this.K);
                                    }
                                    if (ziVar2 != null && ziVar2.Z1() == ziVar3.Z1()) {
                                        z17 = false;
                                        int i28 = this.K;
                                        boolean z28 = i3 != i28;
                                        if (d == d1Var.f) {
                                            org.telegram.messenger.zi ziVar6 = (org.telegram.messenger.zi) arrayList3.get(i13 - i28);
                                            z13 = !(ziVar6.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && ziVar6.Q3() == ziVar3.Q3() && (Math.abs(ziVar6.k.date - ziVar3.k.date) <= 300 || wmVar.g4 == 9);
                                            if (z13) {
                                                if (ziVar3.z3() || ziVar6.z3()) {
                                                    if (ziVar3.z3() && ziVar6.z3() && Math.abs(ziVar3.k.fwd_from.date - ziVar6.k.fwd_from.date) <= 300) {
                                                        TLRPC.MessageFwdHeader messageFwdHeader3 = ziVar6.k.fwd_from;
                                                        String str6 = messageFwdHeader3.from_name;
                                                        if (str6 == null || (str2 = ziVar3.k.fwd_from.from_name) == null) {
                                                            TLRPC.Peer peer2 = messageFwdHeader3.from_id;
                                                            if (peer2 != null) {
                                                                if (ziVar3.k.fwd_from.from_id != null) {
                                                                }
                                                            }
                                                        } else {
                                                            z13 = str6.equals(str2);
                                                            if (org.telegram.messenger.m5.o(ziVar6.k.guestchat_via_from) != org.telegram.messenger.m5.o(ziVar3.k.guestchat_via_from)) {
                                                                z13 = false;
                                                            }
                                                        }
                                                    }
                                                    z13 = false;
                                                    if (org.telegram.messenger.m5.o(ziVar6.k.guestchat_via_from) != org.telegram.messenger.m5.o(ziVar3.k.guestchat_via_from)) {
                                                    }
                                                } else if (wmVar.e != null) {
                                                    long Z02 = ziVar6.Z0();
                                                    boolean z29 = (Z02 != ziVar3.Z0() || ziVar3.z3() || ziVar6.z3()) ? false : true;
                                                    if (!z15 && z29 && Z02 < 0 && wmVar.e.megagroup && wmVar.g4 != 9) {
                                                        z29 = false;
                                                    }
                                                    if (z29 && wmVar.R9()) {
                                                        TLRPC.TL_forumTopic tL_forumTopic = ziVar3.h1;
                                                        if (tL_forumTopic == null) {
                                                            z22 = true;
                                                            z23 = false;
                                                            j11 = org.telegram.messenger.zi.c2(((org.telegram.ui.ActionBar.d2) wmVar).currentAccount, ziVar3.k, true, false);
                                                        } else {
                                                            z22 = true;
                                                            z23 = false;
                                                            j11 = tL_forumTopic.id;
                                                        }
                                                    }
                                                    z13 = z29;
                                                    if (org.telegram.messenger.m5.o(ziVar6.k.guestchat_via_from) != org.telegram.messenger.m5.o(ziVar3.k.guestchat_via_from)) {
                                                    }
                                                } else {
                                                    if (org.telegram.messenger.l10.B(wmVar.f) || org.telegram.messenger.l10.z(wmVar.f)) {
                                                        if (!ziVar3.Z3()) {
                                                            if (!ziVar6.Z3()) {
                                                            }
                                                        }
                                                        z13 = false;
                                                    } else if (wmVar.g4 == 7) {
                                                    }
                                                    if (org.telegram.messenger.m5.o(ziVar6.k.guestchat_via_from) != org.telegram.messenger.m5.o(ziVar3.k.guestchat_via_from)) {
                                                    }
                                                }
                                            }
                                        }
                                        if (org.telegram.messenger.t3.T(wmVar.e) && wmVar.e.megagroup && ziVar3.Z0() <= 0 && (messageFwdHeader = ziVar3.k.fwd_from) != null && (messageFwdHeader.saved_from_peer instanceof TLRPC.TL_peerChannel)) {
                                            if (!z15) {
                                                z13 = false;
                                            }
                                            if (!z16) {
                                                z14 = false;
                                            }
                                        }
                                        if (!z15 && (message = ziVar3.k) != null && message.paid_message_stars > 0) {
                                            z13 = false;
                                        }
                                        boolean z30 = false;
                                        ziVar3.h6(false);
                                        if (s92 != null) {
                                            ArrayList arrayList9 = s92.d;
                                            int i29 = 0;
                                            while (i29 < arrayList9.size()) {
                                                ((org.telegram.messenger.zi) arrayList9.get(i29)).h6(z30);
                                                i29++;
                                                z30 = false;
                                            }
                                        }
                                        if (wmVar.kb) {
                                            z18 = z13;
                                        } else {
                                            if (s92 != null) {
                                                z19 = true;
                                                z14 = false;
                                                z18 = false;
                                                q1Var.setShowTopic(z19);
                                                q1Var.u3(ziVar3, s92, z14, z18, z17, z28);
                                                q1Var.setSpoilersSuppressed(wmVar.A0.getScrollState() != 0);
                                                q1Var.setHighlighted(wmVar.c8 == Integer.MAX_VALUE && ziVar3.f1() == wmVar.c8);
                                                z20 = q1Var.w6;
                                                if (!z20 && wmVar.g8 != null) {
                                                    long currentTimeMillis = System.currentTimeMillis();
                                                    q1Var.r3(true, wmVar.j8, wmVar.g8, wmVar.e8 || currentTimeMillis - wmVar.f8 < 200);
                                                    if (wmVar.e8) {
                                                        wmVar.f8 = currentTimeMillis;
                                                    }
                                                    wmVar.e8 = false;
                                                } else if (!z20 && (num = wmVar.h8) != null) {
                                                    q1Var.p3(num.intValue());
                                                } else if (!z20 && (bArr = wmVar.i8) != null) {
                                                    q1Var.n3(bArr);
                                                } else if (wmVar.g4 == 7 && wmVar.J3 != null && (str = wmVar.I3) != null) {
                                                    q1Var.q3(str);
                                                }
                                                if (wmVar.c8 != Integer.MAX_VALUE) {
                                                    wmVar.Cc();
                                                }
                                                ArrayList arrayList10 = arrayList2;
                                                indexOf = arrayList10.indexOf(ziVar3);
                                                if (indexOf != -1) {
                                                    if (ziVar3.D == 5 && (p40Var = wmVar.q3) != null && p40Var.getTextureView() != null) {
                                                        xe xeVar = wmVar.H7;
                                                        if (xeVar != null) {
                                                            org.telegram.messenger.g0.r(xeVar);
                                                            wmVar.H7 = null;
                                                        }
                                                        q1Var.getViewTreeObserver().addOnPreDrawListener(new dl(this, q1Var, 0));
                                                    } else if ((ziVar3.N2() && !ziVar3.J2()) || ((viVar = ziVar3.L1) != null && viVar.h)) {
                                                        if (!ziVar3.L1.h || (mjVar = wmVar.a0) == null || mjVar.M0 == null) {
                                                            q1Var.getViewTreeObserver().addOnPreDrawListener(new dl(this, q1Var, 1));
                                                        } else {
                                                            if (((org.telegram.ui.ActionBar.d2) wmVar).actionBar.getVisibility() == 0) {
                                                                int measuredHeight = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar.getMeasuredHeight() + ((int) ((org.telegram.ui.ActionBar.d2) wmVar).actionBar.getTranslationY());
                                                                wj wjVar = wmVar.D1;
                                                                int currentHeight = measuredHeight + (wjVar != null ? wjVar.getCurrentHeight() : 0);
                                                                jj jjVar = wmVar.E1;
                                                                i16 = (((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode ? org.telegram.messenger.g0.m : 0) + currentHeight + (jjVar != null ? jjVar.getCurrentHeight() : 0);
                                                            } else {
                                                                i16 = 0;
                                                            }
                                                            float f10 = i16 + wmVar.N9;
                                                            float height = wmVar.fragmentView == null ? 0.0f : r8.getHeight();
                                                            org.telegram.ui.Components.se seVar = wmVar.a0.M0;
                                                            Rect rect = seVar.u0;
                                                            if (!seVar.q0) {
                                                                seVar.r = true;
                                                                seVar.q0 = true;
                                                                lf0 lf0Var = seVar.X;
                                                                if (lf0Var != null) {
                                                                    lf0Var.invalidate();
                                                                }
                                                                org.telegram.ui.Components.bg bgVar = seVar.W;
                                                                if (bgVar != null) {
                                                                    bgVar.invalidate();
                                                                }
                                                                if (seVar.Q != null) {
                                                                    seVar.r0 = q1Var;
                                                                    q1Var.setVisibility(4);
                                                                    seVar.s0 = f10;
                                                                    seVar.t0 = height;
                                                                    org.telegram.ui.Cells.q1 q1Var2 = seVar.Q;
                                                                    org.telegram.ui.Cells.q1 q1Var3 = seVar.r0;
                                                                    q1Var2.e6 = q1Var3.e6;
                                                                    q1Var2.n6 = q1Var3.n6;
                                                                    q1Var2.g6 = q1Var3.g6;
                                                                    q1Var2.i6 = q1Var3.i6;
                                                                    q1Var2.k6 = q1Var3.k6;
                                                                    q1Var2.m6 = q1Var3.m6;
                                                                    q1Var2.u3(q1Var.getMessageObject(), null, q1Var.G2(), q1Var.H2(), q1Var.z2(), false);
                                                                    org.telegram.ui.Cells.x1 transitionParams = seVar.Q.getTransitionParams();
                                                                    transitionParams.h = seVar.Q.getTransitionParams().a();
                                                                    Rect rect2 = transitionParams.E0;
                                                                    transitionParams.L1 = 0.0f;
                                                                    if (seVar.Q.getTransitionParams().E0.left == seVar.Q.getBackgroundDrawableLeft() && rect2.top == seVar.Q.getBackgroundDrawableTop() && rect2.bottom == seVar.Q.getBackgroundDrawableBottom()) {
                                                                        i17 = 1;
                                                                    } else {
                                                                        rect.bottom = -(seVar.Q.getBackgroundDrawableBottom() - rect2.bottom);
                                                                        rect.top = -(seVar.Q.getBackgroundDrawableTop() - rect2.top);
                                                                        if (q1Var.getMessageObject().Q3()) {
                                                                            rect.left = -(seVar.Q.getBackgroundDrawableLeft() - rect2.left);
                                                                            rect.right = 0;
                                                                        } else {
                                                                            rect.left = 0;
                                                                            rect.right = seVar.Q.getBackgroundDrawableRight() - rect2.right;
                                                                        }
                                                                        i17 = 1;
                                                                        transitionParams.x0 = true;
                                                                    }
                                                                    int i30 = seVar.Q.oc;
                                                                } else {
                                                                    i17 = 1;
                                                                }
                                                                seVar.d(new ef0(seVar, i17), false);
                                                                seVar.F.invalidate();
                                                                org.telegram.messenger.hs.f(seVar.c).n(seVar, org.telegram.messenger.hs.u3);
                                                            }
                                                            wmVar.a0.M0 = null;
                                                        }
                                                    }
                                                    arrayList10.remove(indexOf);
                                                    mj mjVar2 = wmVar.a0;
                                                    Runnable runnable = mjVar2.g0;
                                                    if (runnable != null) {
                                                        org.telegram.messenger.g0.r(runnable);
                                                        z21 = true;
                                                        mjVar2.h0 = true;
                                                        mjVar2.g0.run();
                                                        mjVar2.g0 = null;
                                                    } else {
                                                        z21 = true;
                                                    }
                                                    wmVar.a0.n0(z21);
                                                }
                                                if (!hashMap.isEmpty()) {
                                                    HashMap hashMap3 = hashMap;
                                                    if (hashMap3.containsKey(ziVar3.F0())) {
                                                        hashMap3.remove(ziVar3.F0());
                                                        yi yiVar = wmVar.B0;
                                                        if (yiVar != null) {
                                                            org.telegram.ui.Components.on onVar = wmVar.h1;
                                                            yiVar.O = d1Var;
                                                            yiVar.P = onVar;
                                                            r10 = 0;
                                                            yiVar.N = false;
                                                            if (q1Var.nb) {
                                                                q1Var.nb = r10;
                                                                q1Var.setVisibility(r10);
                                                            }
                                                            wmVar.Xb(q1Var);
                                                        }
                                                    }
                                                }
                                                r10 = 0;
                                                if (q1Var.nb) {
                                                }
                                                wmVar.Xb(q1Var);
                                            }
                                            z18 = z14;
                                            z14 = z13;
                                        }
                                        z19 = true;
                                        q1Var.setShowTopic(z19);
                                        q1Var.u3(ziVar3, s92, z14, z18, z17, z28);
                                        q1Var.setSpoilersSuppressed(wmVar.A0.getScrollState() != 0);
                                        q1Var.setHighlighted(wmVar.c8 == Integer.MAX_VALUE && ziVar3.f1() == wmVar.c8);
                                        z20 = q1Var.w6;
                                        if (!z20) {
                                        }
                                        if (!z20) {
                                        }
                                        if (!z20) {
                                        }
                                        if (wmVar.g4 == 7) {
                                            q1Var.q3(str);
                                        }
                                        if (wmVar.c8 != Integer.MAX_VALUE) {
                                        }
                                        ArrayList arrayList102 = arrayList2;
                                        indexOf = arrayList102.indexOf(ziVar3);
                                        if (indexOf != -1) {
                                        }
                                        if (!hashMap.isEmpty()) {
                                        }
                                        r10 = 0;
                                        if (q1Var.nb) {
                                        }
                                        wmVar.Xb(q1Var);
                                    }
                                }
                                z17 = true;
                                int i282 = this.K;
                                if (i3 != i282) {
                                }
                                if (d == d1Var.f) {
                                }
                                if (org.telegram.messenger.t3.T(wmVar.e)) {
                                    if (!z15) {
                                    }
                                    if (!z16) {
                                    }
                                }
                                if (!z15) {
                                    z13 = false;
                                }
                                boolean z302 = false;
                                ziVar3.h6(false);
                                if (s92 != null) {
                                }
                                if (wmVar.kb) {
                                }
                                z19 = true;
                                q1Var.setShowTopic(z19);
                                q1Var.u3(ziVar3, s92, z14, z18, z17, z28);
                                q1Var.setSpoilersSuppressed(wmVar.A0.getScrollState() != 0);
                                q1Var.setHighlighted(wmVar.c8 == Integer.MAX_VALUE && ziVar3.f1() == wmVar.c8);
                                z20 = q1Var.w6;
                                if (!z20) {
                                }
                                if (!z20) {
                                }
                                if (!z20) {
                                }
                                if (wmVar.g4 == 7) {
                                }
                                if (wmVar.c8 != Integer.MAX_VALUE) {
                                }
                                ArrayList arrayList1022 = arrayList2;
                                indexOf = arrayList1022.indexOf(ziVar3);
                                if (indexOf != -1) {
                                }
                                if (!hashMap.isEmpty()) {
                                }
                                r10 = 0;
                                if (q1Var.nb) {
                                }
                                wmVar.Xb(q1Var);
                            }
                            int indexOf2 = arrayList8.indexOf(d10) + i3 + 1;
                            i14 = arrayList8.indexOf(d10) + (i3 - arrayList8.size());
                            z13 = false;
                            z14 = false;
                            z15 = false;
                            i13 = indexOf2;
                        }
                    } else {
                        i13 = i3 + 1;
                        z13 = false;
                        z14 = false;
                        z15 = false;
                        i14 = i3 - 1;
                    }
                    z16 = z15;
                    int d112 = d(i14);
                    d = d(i13);
                    d(i25);
                    if (ziVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                    }
                    arrayList2 = arrayList4;
                    hashMap = hashMap2;
                    arrayList3 = arrayList;
                    i15 = i13 - this.K;
                    if (i15 >= 0) {
                        ziVar2 = (org.telegram.messenger.zi) arrayList3.get(i13 - this.K);
                        if (ziVar2 != null) {
                            int i262 = i13 + 1;
                            int i272 = i262 - this.K;
                            if (i272 >= 0) {
                            }
                        }
                        if (ziVar2 != null) {
                            z17 = false;
                            int i2822 = this.K;
                            if (i3 != i2822) {
                            }
                            if (d == d1Var.f) {
                            }
                            if (org.telegram.messenger.t3.T(wmVar.e)) {
                            }
                            if (!z15) {
                            }
                            boolean z3022 = false;
                            ziVar3.h6(false);
                            if (s92 != null) {
                            }
                            if (wmVar.kb) {
                            }
                            z19 = true;
                            q1Var.setShowTopic(z19);
                            q1Var.u3(ziVar3, s92, z14, z18, z17, z28);
                            q1Var.setSpoilersSuppressed(wmVar.A0.getScrollState() != 0);
                            q1Var.setHighlighted(wmVar.c8 == Integer.MAX_VALUE && ziVar3.f1() == wmVar.c8);
                            z20 = q1Var.w6;
                            if (!z20) {
                            }
                            if (!z20) {
                            }
                            if (!z20) {
                            }
                            if (wmVar.g4 == 7) {
                            }
                            if (wmVar.c8 != Integer.MAX_VALUE) {
                            }
                            ArrayList arrayList10222 = arrayList2;
                            indexOf = arrayList10222.indexOf(ziVar3);
                            if (indexOf != -1) {
                            }
                            if (!hashMap.isEmpty()) {
                            }
                            r10 = 0;
                            if (q1Var.nb) {
                            }
                            wmVar.Xb(q1Var);
                        }
                    }
                    z17 = true;
                    int i28222 = this.K;
                    if (i3 != i28222) {
                    }
                    if (d == d1Var.f) {
                    }
                    if (org.telegram.messenger.t3.T(wmVar.e)) {
                    }
                    if (!z15) {
                    }
                    boolean z30222 = false;
                    ziVar3.h6(false);
                    if (s92 != null) {
                    }
                    if (wmVar.kb) {
                    }
                    z19 = true;
                    q1Var.setShowTopic(z19);
                    q1Var.u3(ziVar3, s92, z14, z18, z17, z28);
                    q1Var.setSpoilersSuppressed(wmVar.A0.getScrollState() != 0);
                    q1Var.setHighlighted(wmVar.c8 == Integer.MAX_VALUE && ziVar3.f1() == wmVar.c8);
                    z20 = q1Var.w6;
                    if (!z20) {
                    }
                    if (!z20) {
                    }
                    if (!z20) {
                    }
                    if (wmVar.g4 == 7) {
                    }
                    if (wmVar.c8 != Integer.MAX_VALUE) {
                    }
                    ArrayList arrayList102222 = arrayList2;
                    indexOf = arrayList102222.indexOf(ziVar3);
                    if (indexOf != -1) {
                    }
                    if (!hashMap.isEmpty()) {
                    }
                    r10 = 0;
                    if (q1Var.nb) {
                    }
                    wmVar.Xb(q1Var);
                }
                z12 = false;
                q1Var.p6 = z12;
                i12 = wmVar.g4;
                if (i12 != 1) {
                }
                arrayList = arrayList5;
                j10 = 0;
                q1Var.s6 = j10;
                if (i12 == 7) {
                }
                q1Var.t6 = org.telegram.messenger.l10.z(wmVar.f);
                q1Var.u6 = wmVar.g4 == 2;
                q1Var.V6 = wmVar.O9();
                q1Var.W6 = wmVar.Z9();
                q1Var.X6 = wmVar.Y9();
                q1Var.Y6 = wmVar.k9();
                q1Var.Z6 = wmVar.l9();
                if (ziVar3.s4()) {
                }
                int i252 = i3 + 2;
                if (s92 != null) {
                }
                z16 = z15;
                int d1122 = d(i14);
                d = d(i13);
                d(i252);
                if (ziVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                }
                arrayList2 = arrayList4;
                hashMap = hashMap2;
                arrayList3 = arrayList;
                i15 = i13 - this.K;
                if (i15 >= 0) {
                }
                z17 = true;
                int i282222 = this.K;
                if (i3 != i282222) {
                }
                if (d == d1Var.f) {
                }
                if (org.telegram.messenger.t3.T(wmVar.e)) {
                }
                if (!z15) {
                }
                boolean z302222 = false;
                ziVar3.h6(false);
                if (s92 != null) {
                }
                if (wmVar.kb) {
                }
                z19 = true;
                q1Var.setShowTopic(z19);
                q1Var.u3(ziVar3, s92, z14, z18, z17, z28);
                q1Var.setSpoilersSuppressed(wmVar.A0.getScrollState() != 0);
                q1Var.setHighlighted(wmVar.c8 == Integer.MAX_VALUE && ziVar3.f1() == wmVar.c8);
                z20 = q1Var.w6;
                if (!z20) {
                }
                if (!z20) {
                }
                if (!z20) {
                }
                if (wmVar.g4 == 7) {
                }
                if (wmVar.c8 != Integer.MAX_VALUE) {
                }
                ArrayList arrayList1022222 = arrayList2;
                indexOf = arrayList1022222.indexOf(ziVar3);
                if (indexOf != -1) {
                }
                if (!hashMap.isEmpty()) {
                }
                r10 = 0;
                if (q1Var.nb) {
                }
                wmVar.Xb(q1Var);
            }
        }
        z11 = false;
        q1Var.o6 = z11;
        if (wmVar.g4 == 0) {
        }
        z12 = false;
        q1Var.p6 = z12;
        i12 = wmVar.g4;
        if (i12 != 1) {
        }
        arrayList = arrayList5;
        j10 = 0;
        q1Var.s6 = j10;
        if (i12 == 7) {
        }
        q1Var.t6 = org.telegram.messenger.l10.z(wmVar.f);
        q1Var.u6 = wmVar.g4 == 2;
        q1Var.V6 = wmVar.O9();
        q1Var.W6 = wmVar.Z9();
        q1Var.X6 = wmVar.Y9();
        q1Var.Y6 = wmVar.k9();
        q1Var.Z6 = wmVar.l9();
        if (ziVar3.s4()) {
        }
        int i2522 = i3 + 2;
        if (s92 != null) {
        }
        z16 = z15;
        int d11222 = d(i14);
        d = d(i13);
        d(i2522);
        if (ziVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
        }
        arrayList2 = arrayList4;
        hashMap = hashMap2;
        arrayList3 = arrayList;
        i15 = i13 - this.K;
        if (i15 >= 0) {
        }
        z17 = true;
        int i2822222 = this.K;
        if (i3 != i2822222) {
        }
        if (d == d1Var.f) {
        }
        if (org.telegram.messenger.t3.T(wmVar.e)) {
        }
        if (!z15) {
        }
        boolean z3022222 = false;
        ziVar3.h6(false);
        if (s92 != null) {
        }
        if (wmVar.kb) {
        }
        z19 = true;
        q1Var.setShowTopic(z19);
        q1Var.u3(ziVar3, s92, z14, z18, z17, z28);
        q1Var.setSpoilersSuppressed(wmVar.A0.getScrollState() != 0);
        q1Var.setHighlighted(wmVar.c8 == Integer.MAX_VALUE && ziVar3.f1() == wmVar.c8);
        z20 = q1Var.w6;
        if (!z20) {
        }
        if (!z20) {
        }
        if (!z20) {
        }
        if (wmVar.g4 == 7) {
        }
        if (wmVar.c8 != Integer.MAX_VALUE) {
        }
        ArrayList arrayList10222222 = arrayList2;
        indexOf = arrayList10222222.indexOf(ziVar3);
        if (indexOf != -1) {
        }
        if (!hashMap.isEmpty()) {
        }
        r10 = 0;
        if (q1Var.nb) {
        }
        wmVar.Xb(q1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [org.telegram.ui.cl] */
    /* JADX WARN: Type inference failed for: r8v11, types: [org.telegram.ui.Cells.t0] */
    /* JADX WARN: Type inference failed for: r8v12, types: [org.telegram.ui.Cells.ra] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Cells.w0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [org.telegram.ui.Cells.f0, org.telegram.ui.bl] */
    /* JADX WARN: Type inference failed for: r8v16, types: [org.telegram.ui.Cells.z1] */
    /* JADX WARN: Type inference failed for: r8v9, types: [org.telegram.ui.Cells.y1] */
    /* JADX WARN: Type inference failed for: r9v15, types: [org.telegram.ui.Cells.t0] */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.q1 q1Var2;
        wm wmVar = this.R;
        if (i3 == 0) {
            q1Var = new org.telegram.ui.Cells.q1(this.h, ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount, true, wmVar.Wa, wmVar.ya);
            q1Var.setResourcesProvider(wmVar.ya);
            if (wmVar.Tc == null) {
                wmVar.Tc = new hm(wmVar);
            }
            q1Var.setDelegate(wmVar.Tc);
            q1Var.Wb = wmVar.qc;
            if (wmVar.h == null) {
                q1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i3 == 1) {
                ?? ykVar = new yk(context, wmVar.ya, true);
                ykVar.setInvalidateColors(true);
                ykVar.setDelegate(new al(this));
                q1Var = ykVar;
            } else {
                if (i3 == 2) {
                    ?? z1Var = new org.telegram.ui.Cells.z1(context, wmVar.ya);
                    q1Var2 = z1Var;
                    if (!wmVar.Q9()) {
                        org.telegram.ui.ActionBar.r6.V(z1Var.getTextView(), org.telegram.ui.ActionBar.k6.tf, wmVar.ya);
                        org.telegram.ui.ActionBar.r6.y(z1Var.getBackgroundLayout(), z1Var.getBackgroundLayout().getBackground(), org.telegram.ui.ActionBar.k6.uf, wmVar.ya, PorterDuff.Mode.MULTIPLY);
                        q1Var2 = z1Var;
                    }
                } else if (i3 == 3) {
                    ?? blVar = new bl(this, context, ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount, wmVar.ya);
                    blVar.setDelegate(new x0(this, 22));
                    q1Var2 = blVar;
                } else if (i3 == 4) {
                    q1Var2 = new org.telegram.ui.Cells.w0(context, wmVar.ya);
                } else if (i3 == 6) {
                    q1Var2 = new org.telegram.ui.Cells.ra(((org.telegram.ui.ActionBar.d2) wmVar).currentAccount, context, wmVar.ya);
                } else if (i3 == 7) {
                    q1Var2 = new org.telegram.ui.Cells.t0(context, wmVar.ya, false);
                } else if (i3 == 8) {
                    q1Var2 = new cl(this, context, ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount, wmVar.ya);
                } else if (i3 == 10) {
                    ?? y1Var = new org.telegram.ui.Cells.y1(context, wmVar.ya);
                    if (wmVar.Tc == null) {
                        wmVar.Tc = new hm(wmVar);
                    }
                    y1Var.setDelegate(wmVar.Tc);
                    q1Var2 = y1Var;
                } else {
                    q1Var = null;
                }
                q1Var = q1Var2;
            }
        }
        return k2.p1.p(q1Var, q1Var, -1, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0249  */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(u4.d1 d1Var) {
        TLRPC.Message message;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        byte[] bArr;
        Integer num;
        String str;
        String W1;
        org.telegram.messenger.ro roVar;
        wm wmVar = this.R;
        View view = d1Var.a;
        if ((view instanceof org.telegram.ui.Cells.q1) || (view instanceof org.telegram.ui.Cells.t0)) {
            wmVar.M9();
        }
        boolean z14 = view instanceof org.telegram.ui.Cells.q1;
        boolean z15 = true;
        if (z14) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
            q1Var.V6 = wmVar.O9();
            q1Var.W6 = wmVar.Z9();
            q1Var.X6 = wmVar.Y9();
            q1Var.Y6 = wmVar.k9();
            q1Var.Z6 = wmVar.l9();
            q1Var.E3(-1, true, false);
            org.telegram.messenger.zi ziVar = wmVar.V3;
            if (ziVar != null && ziVar.T(messageObject)) {
                q1Var.E3(wmVar.W3, false, false);
            }
            if (messageObject.H2() && (W1 = messageObject.W1()) != null && (roVar = (org.telegram.messenger.ro) wmVar.getMessagesController().i4.get(W1.replace("️", ""))) != null) {
                MediaController mediaController = wmVar.getMediaController();
                org.telegram.messenger.c accountInstance = wmVar.getAccountInstance();
                mediaController.getClass();
                Utilities.d.c(new ci.u8(mediaController, roVar, accountInstance, z15, 12));
            }
            if (messageObject.h6(false)) {
                q1Var.u3(messageObject, q1Var.getCurrentMessagesGroup(), q1Var.G2(), q1Var.H2(), q1Var.z2(), q1Var.C2());
            } else {
                org.telegram.messenger.ui currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    ArrayList arrayList = currentMessagesGroup.d;
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        ((org.telegram.messenger.zi) arrayList.get(i3)).h6(false);
                    }
                }
            }
            if (((org.telegram.ui.ActionBar.d2) wmVar).actionBar.v() || wmVar.W9()) {
                wmVar.e8 = false;
                wmVar.f8 = 0L;
                wmVar.g8 = null;
                ArrayList arrayList2 = wmVar.p4;
                q1Var.h3(arrayList2 == null || !arrayList2.contains(messageObject), false);
                int i10 = org.telegram.messenger.zi.B0(messageObject.k) == wmVar.k6 ? 0 : 1;
                if (wmVar.n6[i10].indexOfKey(messageObject.f1()) >= 0) {
                    wmVar.Jb(messageObject, q1Var, i10, false);
                    z10 = true;
                } else {
                    q1Var.setDrawSelectionBackground(false);
                    q1Var.j3(false, false, false);
                    z10 = false;
                }
                z11 = true;
            } else {
                q1Var.setDrawSelectionBackground(false);
                q1Var.j3(false, false, false);
                q1Var.h3(false, false);
                z10 = false;
                z11 = false;
            }
            q1Var.i3(!z11, z11 && z10);
            if (wmVar.g4 != 7 || wmVar.J3 == null || (str = wmVar.I3) == null) {
                pj pjVar = wmVar.g3;
                if (pjVar != null && pjVar.getVisibility() == 0) {
                    if (wmVar.getMediaDataController().c1[org.telegram.messenger.zi.B0(messageObject.k) == wmVar.c7 ? (char) 1 : (char) 0].indexOfKey(messageObject.f1()) >= 0 && wmVar.getMediaDataController().e1 != null) {
                        q1Var.q3(wmVar.getMediaDataController().e1);
                    }
                }
                q1Var.q3(null);
            } else {
                q1Var.q3(str);
            }
            if (!((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode || !q1Var.w6) {
                if (wmVar.c8 != Integer.MAX_VALUE) {
                    if (q1Var.getMessageObject() == null || q1Var.getMessageObject().f1() != wmVar.c8) {
                        if (q1Var.getCurrentMessagesGroup() != null) {
                            org.telegram.messenger.ui currentMessagesGroup2 = q1Var.getCurrentMessagesGroup();
                            int i11 = wmVar.c8;
                            ArrayList arrayList3 = currentMessagesGroup2.d;
                            if (arrayList3 != null) {
                                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                    org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList3.get(i12);
                                    if (ziVar2 == null || ziVar2.f1() != i11) {
                                    }
                                }
                            }
                        }
                    }
                    z12 = true;
                    q1Var.setHighlighted(z12);
                    z13 = q1Var.w6;
                    if (!z13 && wmVar.g8 != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!q1Var.r3(true, wmVar.j8, wmVar.g8, wmVar.e8 || currentTimeMillis - wmVar.f8 < 200) && wmVar.d8) {
                            org.telegram.ui.Components.fc.a0(wmVar).Q(R.raw.error, 36, org.telegram.messenger.bd.M0(2131746443, null)).k(true);
                        }
                        wmVar.d8 = false;
                        if (wmVar.e8) {
                            wmVar.f8 = currentTimeMillis;
                        }
                        wmVar.e8 = false;
                    } else if (!z13 && (num = wmVar.h8) != null) {
                        q1Var.p3(num.intValue());
                    } else if (z13 && (bArr = wmVar.i8) != null) {
                        q1Var.n3(bArr);
                    }
                    if (wmVar.c8 != Integer.MAX_VALUE) {
                        wmVar.Cc();
                    }
                }
                z12 = false;
                q1Var.setHighlighted(z12);
                z13 = q1Var.w6;
                if (!z13) {
                }
                if (!z13) {
                }
                if (z13) {
                    q1Var.n3(bArr);
                }
                if (wmVar.c8 != Integer.MAX_VALUE) {
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.t0) {
            org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
            t0Var.f0 = wmVar.O9();
            t0Var.j0 = wmVar.Z9();
            wmVar.Y9();
            wmVar.k9();
            t0Var.k0 = wmVar.l9();
        } else if (view instanceof org.telegram.ui.Cells.z1) {
            ((org.telegram.ui.Cells.z1) view).getTextView().setTranslationX(wmVar.l9() / 2.0f);
        }
        int b10 = d1Var.b();
        int i13 = this.K;
        if (b10 < i13 || b10 >= this.L) {
            return;
        }
        org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) (this.M ? this.N : this.O ? this.Q : wmVar.L6).get(b10 - i13);
        if (ziVar3 == null || (message = ziVar3.k) == null || !message.media_unread || !message.mentioned) {
            return;
        }
        if (!((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode && wmVar.g4 == 0 && !org.telegram.messenger.zi.S4(ziVar3.k) && !ziVar3.i4()) {
            int i14 = wmVar.C6 - 1;
            wmVar.C6 = i14;
            if (i14 <= 0) {
                wmVar.C6 = 0;
                wmVar.D6 = true;
                wmVar.nc(false);
            } else {
                wmVar.y1.c(2, i14, true);
            }
            wmVar.getMessagesController().n3(org.telegram.messenger.t3.T(wmVar.e) ? wmVar.e.id : 0L, ziVar3.f1(), wmVar.k6);
            ziVar3.k.media_unread = false;
        }
        if (z14) {
            org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
            if (((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode) {
                q1Var2.setHighlighted(true);
            } else {
                q1Var2.m3();
            }
        }
    }
}
