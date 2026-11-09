package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class ws0 extends ts0 {
    public final ArrayList D;
    public boolean E;
    public final /* synthetic */ zs0 F;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public di.r6 s;
    public final int w;
    public final us0 x;
    public boolean y;

    public ws0(zs0 zs0Var, Context context, boolean z9) {
        this(zs0Var, context, 0, z9);
    }

    @Override // org.telegram.ui.Components.ts0, org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.ts0, org.telegram.ui.Components.wi0
    public final String F(int i7) {
        org.telegram.messenger.ij ijVar;
        TL_stories.StoryItem storyItem;
        di.r6 r6Var = this.s;
        if (r6Var == null || i7 < 0 || i7 >= r6Var.i.size() || (ijVar = (org.telegram.messenger.ij) this.s.i.get(i7)) == null || (storyItem = ijVar.l) == null) {
            return null;
        }
        return org.telegram.messenger.id.e0(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.ts0, org.telegram.ui.Components.wi0
    public final void I() {
        this.F.r1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i7) {
        di.r6 r6Var;
        if (this.h || (r6Var = this.s) == null) {
            return false;
        }
        if (r6Var instanceof di.k6) {
            zs0 zs0Var = this.F;
            TLRPC.User a22 = org.telegram.messenger.qp.s1(zs0Var.x1.getCurrentAccount()).a2(Long.valueOf(zs0Var.l1));
            return a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit;
        }
        if (i7 < 0 || i7 >= r6Var.i.size()) {
            return false;
        }
        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.s.i.get(i7);
        di.r6 r6Var2 = this.s;
        if (r6Var2.f > 0) {
            return true;
        }
        return r6Var2.m(ijVar.e1());
    }

    public final void N() {
        ur0 ur0Var;
        ur0 ur0Var2;
        ur0 ur0Var3;
        ur0 ur0Var4;
        di.r6 r6Var = this.s;
        if (r6Var == null || this.h) {
            return;
        }
        zs0 zs0Var = this.F;
        boolean z9 = zs0Var.n1;
        ur0[] ur0VarArr = zs0Var.m0;
        int[] iArr = zs0Var.o1;
        if ((!z9 || (zs0Var.m1 && r6Var.g() > 1)) && this.s.g() > 0 && !zs0Var.I0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (ur0VarArr != null && (ur0Var3 = ur0VarArr[0]) != null && (ur0Var4 = ur0VarArr[1]) != null && ur0Var3.h != null && ur0Var4.h != null) {
                    zs0Var.B1(false);
                }
                zs0Var.m1 = iArr[1] == 1;
            } else if (zs0Var.m1) {
                zs0Var.m1 = false;
                iArr[1] = Math.max(2, org.telegram.messenger.iz.u1);
                if (ur0VarArr != null && (ur0Var = ur0VarArr[0]) != null && (ur0Var2 = ur0VarArr[1]) != null && ur0Var.h != null && ur0Var2.h != null) {
                    zs0Var.B1(false);
                }
            }
            zs0Var.n1 = true;
        }
    }

    public final int O() {
        zs0 zs0Var = this.F;
        fr0 fr0Var = zs0Var.J;
        int[] iArr = zs0Var.o1;
        return this == fr0Var ? iArr[0] : zs0.x(zs0Var, this) != -1 ? iArr[1] : zs0Var.s1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.ts0, v4.g0
    public final int b() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.F.t0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.ts0, v4.g0
    public final int d(int i7) {
        return 19;
    }

    @Override // org.telegram.ui.Components.ts0, v4.g0
    public final int e() {
        return b();
    }

    @Override // v4.g0
    public void f() {
        if (this.s != null) {
            zs0 zs0Var = this.F;
            if (zs0Var.B0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList F = org.telegram.messenger.qp.s1(this.s.c).P1().F(zs0Var.l1);
                if (F != null) {
                    arrayList.addAll(F);
                }
            }
        }
        super.f();
        N();
    }

    @Override // org.telegram.ui.Components.ts0, v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        if (this.s != null && d1Var.f == 19) {
            View view = d1Var.a;
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                o7Var.d0 = true;
                ArrayList arrayList = this.r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    di.y6 y6Var = (di.y6) arrayList.get(i7);
                    o7Var.f0 = false;
                    if (y6Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = y6Var.a;
                        int i10 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i10;
                        tL_storyItem.id = i10;
                        tL_storyItem.attachPath = y6Var.f;
                        vs0 vs0Var = new vs0(this.s.c, tL_storyItem);
                        y6Var.K = vs0Var;
                        vs0Var.m = y6Var;
                    }
                    o7Var.k(y6Var.K, O(), false);
                    o7Var.d0 = true;
                    o7Var.setReorder(false);
                    o7Var.i(false, false);
                    return;
                }
                int size = i7 - arrayList.size();
                if (size < 0 || size >= this.s.i.size()) {
                    o7Var.f0 = false;
                    o7Var.k(null, O(), false);
                    o7Var.d0 = true;
                    return;
                }
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.s.i.get(size);
                o7Var.f0 = ijVar != null && this.s.m(ijVar.e1());
                zs0 zs0Var = this.F;
                o7Var.setReorder(zs0Var.B0() || o7Var.f0);
                o7Var.h = zs0Var.G0();
                o7Var.k(ijVar, O(), false);
                if (!zs0Var.E1 || ijVar == null) {
                    o7Var.i(false, false);
                } else {
                    o7Var.i(zs0Var.b1[(org.telegram.messenger.ij.B0(ijVar.k) > zs0Var.l1 ? 1 : (org.telegram.messenger.ij.B0(ijVar.k) == zs0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ijVar.e1()) >= 0, true);
                }
                o7Var.l(this.y, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.ts0, v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        v4.d1 x10 = super.x(viewGroup, i7);
        View view = x10.a;
        if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).d0 = true;
        }
        return x10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(zs0 zs0Var, Context context, int i7, boolean z9) {
        super(zs0Var, context);
        int i10;
        TLRPC.User a22;
        this.F = zs0Var;
        this.r = new ArrayList();
        this.D = new ArrayList();
        this.h = z9;
        this.n = i7;
        org.telegram.ui.ActionBar.f2 f2Var = zs0Var.x1;
        long j3 = zs0Var.l1;
        int currentAccount = f2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(zs0Var.getStoriesHashtag())) {
            if (zs0Var.W1 == null) {
                zs0Var.W1 = new di.l6(currentAccount, TextUtils.isEmpty(zs0Var.getStoriesHashtagUsername()) ? null : zs0Var.getStoriesHashtagUsername(), zs0Var.getStoriesHashtag());
            }
            this.s = zs0Var.W1;
        } else if (zs0Var.getStoriesArea() != null) {
            if (zs0Var.W1 == null) {
                zs0Var.W1 = new di.l6(currentAccount, zs0Var.getStoriesArea());
            }
            this.s = zs0Var.W1;
        } else if ((!z9 || zs0Var.I0()) && (z9 || !zs0Var.A0())) {
            int i11 = 1;
            boolean z10 = j3 > 0 && (a22 = org.telegram.messenger.qp.s1(currentAccount).a2(Long.valueOf(j3))) != null && a22.bot;
            if (i7 > 0) {
                this.s = f2Var.getMessagesController().P1().A(0, i7, zs0Var.l1, true);
            } else {
                di.z6 P1 = f2Var.getMessagesController().P1();
                long j10 = zs0Var.l1;
                if (z10) {
                    i11 = 4;
                } else if (!z9) {
                    i10 = 0;
                    this.s = P1.A(i10, -1, j10, true);
                }
                i10 = i11;
                this.s = P1.A(i10, -1, j10, true);
            }
        } else {
            this.s = null;
        }
        di.r6 r6Var = this.s;
        if (r6Var != null) {
            this.w = r6Var.o();
            this.x = new us0(this, f2Var.getMessagesController().P1(), zs0Var.l1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.ts0
    public final int L(int i7) {
        return i7;
    }
}
