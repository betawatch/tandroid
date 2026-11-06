package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class us0 extends rs0 {
    public final ArrayList D;
    public boolean E;
    public final /* synthetic */ xs0 F;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public di.q6 s;
    public final int w;
    public final ss0 x;
    public boolean y;

    public us0(xs0 xs0Var, Context context, boolean z9) {
        this(xs0Var, context, 0, z9);
    }

    @Override // org.telegram.ui.Components.rs0, org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.rs0, org.telegram.ui.Components.vi0
    public final String F(int i7) {
        org.telegram.messenger.ij ijVar;
        TL_stories.StoryItem storyItem;
        di.q6 q6Var = this.s;
        if (q6Var == null || i7 < 0 || i7 >= q6Var.i.size() || (ijVar = (org.telegram.messenger.ij) this.s.i.get(i7)) == null || (storyItem = ijVar.l) == null) {
            return null;
        }
        return org.telegram.messenger.hd.e0(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.rs0, org.telegram.ui.Components.vi0
    public final void I() {
        this.F.p1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i7) {
        di.q6 q6Var;
        if (this.h || (q6Var = this.s) == null) {
            return false;
        }
        if (q6Var instanceof di.j6) {
            xs0 xs0Var = this.F;
            TLRPC.User a22 = org.telegram.messenger.qp.s1(xs0Var.x1.getCurrentAccount()).a2(Long.valueOf(xs0Var.l1));
            return a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit;
        }
        if (i7 < 0 || i7 >= q6Var.i.size()) {
            return false;
        }
        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.s.i.get(i7);
        di.q6 q6Var2 = this.s;
        if (q6Var2.f > 0) {
            return true;
        }
        return q6Var2.m(ijVar.f1());
    }

    public final void N() {
        sr0 sr0Var;
        sr0 sr0Var2;
        sr0 sr0Var3;
        sr0 sr0Var4;
        di.q6 q6Var = this.s;
        if (q6Var == null || this.h) {
            return;
        }
        xs0 xs0Var = this.F;
        boolean z9 = xs0Var.n1;
        sr0[] sr0VarArr = xs0Var.m0;
        int[] iArr = xs0Var.o1;
        if ((!z9 || (xs0Var.m1 && q6Var.g() > 1)) && this.s.g() > 0 && !xs0Var.H0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (sr0VarArr != null && (sr0Var3 = sr0VarArr[0]) != null && (sr0Var4 = sr0VarArr[1]) != null && sr0Var3.h != null && sr0Var4.h != null) {
                    xs0Var.z1(false);
                }
                xs0Var.m1 = iArr[1] == 1;
            } else if (xs0Var.m1) {
                xs0Var.m1 = false;
                iArr[1] = Math.max(2, org.telegram.messenger.iz.u1);
                if (sr0VarArr != null && (sr0Var = sr0VarArr[0]) != null && (sr0Var2 = sr0VarArr[1]) != null && sr0Var.h != null && sr0Var2.h != null) {
                    xs0Var.z1(false);
                }
            }
            xs0Var.n1 = true;
        }
    }

    public final int O() {
        xs0 xs0Var = this.F;
        dr0 dr0Var = xs0Var.J;
        int[] iArr = xs0Var.o1;
        return this == dr0Var ? iArr[0] : xs0.x(xs0Var, this) != -1 ? iArr[1] : xs0Var.s1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.rs0, v4.g0
    public final int b() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.F.t0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.rs0, v4.g0
    public final int d(int i7) {
        return 19;
    }

    @Override // org.telegram.ui.Components.rs0, v4.g0
    public final int e() {
        return b();
    }

    @Override // v4.g0
    public void f() {
        if (this.s != null) {
            xs0 xs0Var = this.F;
            if (xs0Var.B0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList F = org.telegram.messenger.qp.s1(this.s.c).P1().F(xs0Var.l1);
                if (F != null) {
                    arrayList.addAll(F);
                }
            }
        }
        super.f();
        N();
    }

    @Override // org.telegram.ui.Components.rs0, v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        if (this.s != null && d1Var.f == 19) {
            View view = d1Var.a;
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                o7Var.d0 = true;
                ArrayList arrayList = this.r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    di.x6 x6Var = (di.x6) arrayList.get(i7);
                    o7Var.f0 = false;
                    if (x6Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = x6Var.a;
                        int i10 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i10;
                        tL_storyItem.id = i10;
                        tL_storyItem.attachPath = x6Var.f;
                        ts0 ts0Var = new ts0(this.s.c, tL_storyItem);
                        x6Var.K = ts0Var;
                        ts0Var.m = x6Var;
                    }
                    o7Var.k(x6Var.K, O(), false);
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
                o7Var.f0 = ijVar != null && this.s.m(ijVar.f1());
                xs0 xs0Var = this.F;
                o7Var.setReorder(xs0Var.B0() || o7Var.f0);
                o7Var.h = xs0Var.F0();
                o7Var.k(ijVar, O(), false);
                if (!xs0Var.E1 || ijVar == null) {
                    o7Var.i(false, false);
                } else {
                    o7Var.i(xs0Var.b1[(org.telegram.messenger.ij.B0(ijVar.k) > xs0Var.l1 ? 1 : (org.telegram.messenger.ij.B0(ijVar.k) == xs0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ijVar.f1()) >= 0, true);
                }
                o7Var.l(this.y, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.rs0, v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        v4.d1 x10 = super.x(viewGroup, i7);
        View view = x10.a;
        if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).d0 = true;
        }
        return x10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(xs0 xs0Var, Context context, int i7, boolean z9) {
        super(xs0Var, context);
        int i10;
        TLRPC.User a22;
        this.F = xs0Var;
        this.r = new ArrayList();
        this.D = new ArrayList();
        this.h = z9;
        this.n = i7;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.x1;
        long j3 = xs0Var.l1;
        int currentAccount = f2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(xs0Var.getStoriesHashtag())) {
            if (xs0Var.W1 == null) {
                xs0Var.W1 = new di.k6(currentAccount, TextUtils.isEmpty(xs0Var.getStoriesHashtagUsername()) ? null : xs0Var.getStoriesHashtagUsername(), xs0Var.getStoriesHashtag());
            }
            this.s = xs0Var.W1;
        } else if (xs0Var.getStoriesArea() != null) {
            if (xs0Var.W1 == null) {
                xs0Var.W1 = new di.k6(currentAccount, xs0Var.getStoriesArea());
            }
            this.s = xs0Var.W1;
        } else if ((!z9 || xs0Var.H0()) && (z9 || !xs0Var.A0())) {
            int i11 = 1;
            boolean z10 = j3 > 0 && (a22 = org.telegram.messenger.qp.s1(currentAccount).a2(Long.valueOf(j3))) != null && a22.bot;
            if (i7 > 0) {
                this.s = f2Var.getMessagesController().P1().A(0, i7, xs0Var.l1, true);
            } else {
                di.y6 P1 = f2Var.getMessagesController().P1();
                long j10 = xs0Var.l1;
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
        di.q6 q6Var = this.s;
        if (q6Var != null) {
            this.w = q6Var.o();
            this.x = new ss0(this, f2Var.getMessagesController().P1(), xs0Var.l1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.rs0
    public final int L(int i7) {
        return i7;
    }
}
