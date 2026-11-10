package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class vs0 extends ss0 {
    public final ArrayList D;
    public boolean E;
    public final /* synthetic */ ys0 F;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public di.r6 s;
    public final int w;
    public final ts0 x;
    public boolean y;

    public vs0(ys0 ys0Var, Context context, boolean z9) {
        this(ys0Var, context, 0, z9);
    }

    @Override // org.telegram.ui.Components.ss0, org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.ss0, org.telegram.ui.Components.vi0
    public final String F(int i7) {
        org.telegram.messenger.ij ijVar;
        TL_stories.StoryItem storyItem;
        di.r6 r6Var = this.s;
        if (r6Var == null || i7 < 0 || i7 >= r6Var.i.size() || (ijVar = (org.telegram.messenger.ij) this.s.i.get(i7)) == null || (storyItem = ijVar.l) == null) {
            return null;
        }
        return org.telegram.messenger.id.e0(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.ss0, org.telegram.ui.Components.vi0
    public final void I() {
        this.F.r1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i7) {
        di.r6 r6Var;
        if (this.h || (r6Var = this.s) == null) {
            return false;
        }
        if (r6Var instanceof di.k6) {
            ys0 ys0Var = this.F;
            TLRPC.User a22 = org.telegram.messenger.qp.s1(ys0Var.x1.getCurrentAccount()).a2(Long.valueOf(ys0Var.l1));
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
        tr0 tr0Var;
        tr0 tr0Var2;
        tr0 tr0Var3;
        tr0 tr0Var4;
        di.r6 r6Var = this.s;
        if (r6Var == null || this.h) {
            return;
        }
        ys0 ys0Var = this.F;
        boolean z9 = ys0Var.n1;
        tr0[] tr0VarArr = ys0Var.m0;
        int[] iArr = ys0Var.o1;
        if ((!z9 || (ys0Var.m1 && r6Var.g() > 1)) && this.s.g() > 0 && !ys0Var.I0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (tr0VarArr != null && (tr0Var3 = tr0VarArr[0]) != null && (tr0Var4 = tr0VarArr[1]) != null && tr0Var3.h != null && tr0Var4.h != null) {
                    ys0Var.B1(false);
                }
                ys0Var.m1 = iArr[1] == 1;
            } else if (ys0Var.m1) {
                ys0Var.m1 = false;
                iArr[1] = Math.max(2, org.telegram.messenger.iz.u1);
                if (tr0VarArr != null && (tr0Var = tr0VarArr[0]) != null && (tr0Var2 = tr0VarArr[1]) != null && tr0Var.h != null && tr0Var2.h != null) {
                    ys0Var.B1(false);
                }
            }
            ys0Var.n1 = true;
        }
    }

    public final int O() {
        ys0 ys0Var = this.F;
        er0 er0Var = ys0Var.J;
        int[] iArr = ys0Var.o1;
        return this == er0Var ? iArr[0] : ys0.x(ys0Var, this) != -1 ? iArr[1] : ys0Var.s1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.ss0, v4.g0
    public final int b() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.F.t0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.ss0, v4.g0
    public final int d(int i7) {
        return 19;
    }

    @Override // org.telegram.ui.Components.ss0, v4.g0
    public final int e() {
        return b();
    }

    @Override // v4.g0
    public void f() {
        if (this.s != null) {
            ys0 ys0Var = this.F;
            if (ys0Var.B0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList F = org.telegram.messenger.qp.s1(this.s.c).P1().F(ys0Var.l1);
                if (F != null) {
                    arrayList.addAll(F);
                }
            }
        }
        super.f();
        N();
    }

    @Override // org.telegram.ui.Components.ss0, v4.g0
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
                        us0 us0Var = new us0(this.s.c, tL_storyItem);
                        y6Var.K = us0Var;
                        us0Var.m = y6Var;
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
                ys0 ys0Var = this.F;
                o7Var.setReorder(ys0Var.B0() || o7Var.f0);
                o7Var.h = ys0Var.G0();
                o7Var.k(ijVar, O(), false);
                if (!ys0Var.E1 || ijVar == null) {
                    o7Var.i(false, false);
                } else {
                    o7Var.i(ys0Var.b1[(org.telegram.messenger.ij.B0(ijVar.k) > ys0Var.l1 ? 1 : (org.telegram.messenger.ij.B0(ijVar.k) == ys0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ijVar.e1()) >= 0, true);
                }
                o7Var.l(this.y, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.ss0, v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        v4.d1 x10 = super.x(viewGroup, i7);
        View view = x10.a;
        if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).d0 = true;
        }
        return x10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(ys0 ys0Var, Context context, int i7, boolean z9) {
        super(ys0Var, context);
        int i10;
        TLRPC.User a22;
        this.F = ys0Var;
        this.r = new ArrayList();
        this.D = new ArrayList();
        this.h = z9;
        this.n = i7;
        org.telegram.ui.ActionBar.f2 f2Var = ys0Var.x1;
        long j3 = ys0Var.l1;
        int currentAccount = f2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(ys0Var.getStoriesHashtag())) {
            if (ys0Var.W1 == null) {
                ys0Var.W1 = new di.l6(currentAccount, TextUtils.isEmpty(ys0Var.getStoriesHashtagUsername()) ? null : ys0Var.getStoriesHashtagUsername(), ys0Var.getStoriesHashtag());
            }
            this.s = ys0Var.W1;
        } else if (ys0Var.getStoriesArea() != null) {
            if (ys0Var.W1 == null) {
                ys0Var.W1 = new di.l6(currentAccount, ys0Var.getStoriesArea());
            }
            this.s = ys0Var.W1;
        } else if ((!z9 || ys0Var.I0()) && (z9 || !ys0Var.A0())) {
            int i11 = 1;
            boolean z10 = j3 > 0 && (a22 = org.telegram.messenger.qp.s1(currentAccount).a2(Long.valueOf(j3))) != null && a22.bot;
            if (i7 > 0) {
                this.s = f2Var.getMessagesController().P1().A(0, i7, ys0Var.l1, true);
            } else {
                di.z6 P1 = f2Var.getMessagesController().P1();
                long j10 = ys0Var.l1;
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
            this.x = new ts0(this, f2Var.getMessagesController().P1(), ys0Var.l1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.ss0
    public final int L(int i7) {
        return i7;
    }
}
