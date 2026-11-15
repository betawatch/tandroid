package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class vs0 extends ss0 {
    public final ArrayList E;
    public boolean F;
    public final /* synthetic */ ys0 G;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public fi.k6 s;
    public final int w;
    public final ts0 x;
    public boolean y;

    public vs0(ys0 ys0Var, Context context, boolean z10) {
        this(ys0Var, context, 0, z10);
    }

    @Override // org.telegram.ui.Components.ss0, org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.ss0, org.telegram.ui.Components.aj0
    public final String F(int i7) {
        org.telegram.messenger.gj gjVar;
        TL_stories.StoryItem storyItem;
        fi.k6 k6Var = this.s;
        if (k6Var == null || i7 < 0 || i7 >= k6Var.i.size() || (gjVar = (org.telegram.messenger.gj) this.s.i.get(i7)) == null || (storyItem = gjVar.l) == null) {
            return null;
        }
        return org.telegram.messenger.hd.e0(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.ss0, org.telegram.ui.Components.aj0
    public final void I() {
        this.G.r1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i7) {
        fi.k6 k6Var;
        if (this.h || (k6Var = this.s) == null) {
            return false;
        }
        if (k6Var instanceof fi.c6) {
            ys0 ys0Var = this.G;
            TLRPC.User a22 = org.telegram.messenger.np.s1(ys0Var.y1.getCurrentAccount()).a2(Long.valueOf(ys0Var.m1));
            return a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit;
        }
        if (i7 < 0 || i7 >= k6Var.i.size()) {
            return false;
        }
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.s.i.get(i7);
        fi.k6 k6Var2 = this.s;
        if (k6Var2.f > 0) {
            return true;
        }
        return k6Var2.m(gjVar.e1());
    }

    public final void N() {
        tr0 tr0Var;
        tr0 tr0Var2;
        tr0 tr0Var3;
        tr0 tr0Var4;
        fi.k6 k6Var = this.s;
        if (k6Var == null || this.h) {
            return;
        }
        ys0 ys0Var = this.G;
        boolean z10 = ys0Var.o1;
        tr0[] tr0VarArr = ys0Var.n0;
        int[] iArr = ys0Var.p1;
        if ((!z10 || (ys0Var.n1 && k6Var.g() > 1)) && this.s.g() > 0 && !ys0Var.I0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (tr0VarArr != null && (tr0Var3 = tr0VarArr[0]) != null && (tr0Var4 = tr0VarArr[1]) != null && tr0Var3.h != null && tr0Var4.h != null) {
                    ys0Var.B1(false);
                }
                ys0Var.n1 = iArr[1] == 1;
            } else if (ys0Var.n1) {
                ys0Var.n1 = false;
                iArr[1] = Math.max(2, org.telegram.messenger.gz.u1);
                if (tr0VarArr != null && (tr0Var = tr0VarArr[0]) != null && (tr0Var2 = tr0VarArr[1]) != null && tr0Var.h != null && tr0Var2.h != null) {
                    ys0Var.B1(false);
                }
            }
            ys0Var.o1 = true;
        }
    }

    public final int O() {
        ys0 ys0Var = this.G;
        fr0 fr0Var = ys0Var.K;
        int[] iArr = ys0Var.p1;
        return this == fr0Var ? iArr[0] : ys0.x(ys0Var, this) != -1 ? iArr[1] : ys0Var.t1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.ss0, v4.h0
    public final int b() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.G.t0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.ss0, v4.h0
    public final int d(int i7) {
        return 19;
    }

    @Override // org.telegram.ui.Components.ss0, v4.h0
    public final int e() {
        return b();
    }

    @Override // v4.h0
    public void f() {
        if (this.s != null) {
            ys0 ys0Var = this.G;
            if (ys0Var.B0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList F = org.telegram.messenger.np.s1(this.s.c).P1().F(ys0Var.m1);
                if (F != null) {
                    arrayList.addAll(F);
                }
            }
        }
        super.f();
        N();
    }

    @Override // org.telegram.ui.Components.ss0, v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        if (this.s != null && e1Var.f == 19) {
            View view = e1Var.a;
            if (view instanceof org.telegram.ui.Cells.n7) {
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                n7Var.e0 = true;
                ArrayList arrayList = this.r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    fi.r6 r6Var = (fi.r6) arrayList.get(i7);
                    n7Var.g0 = false;
                    if (r6Var.L == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = r6Var.a;
                        int i10 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i10;
                        tL_storyItem.id = i10;
                        tL_storyItem.attachPath = r6Var.f;
                        us0 us0Var = new us0(this.s.c, tL_storyItem);
                        r6Var.L = us0Var;
                        us0Var.m = r6Var;
                    }
                    n7Var.k(r6Var.L, O(), false);
                    n7Var.e0 = true;
                    n7Var.setReorder(false);
                    n7Var.i(false, false);
                    return;
                }
                int size = i7 - arrayList.size();
                if (size < 0 || size >= this.s.i.size()) {
                    n7Var.g0 = false;
                    n7Var.k(null, O(), false);
                    n7Var.e0 = true;
                    return;
                }
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.s.i.get(size);
                n7Var.g0 = gjVar != null && this.s.m(gjVar.e1());
                ys0 ys0Var = this.G;
                n7Var.setReorder(ys0Var.B0() || n7Var.g0);
                n7Var.h = ys0Var.G0();
                n7Var.k(gjVar, O(), false);
                if (!ys0Var.F1 || gjVar == null) {
                    n7Var.i(false, false);
                } else {
                    n7Var.i(ys0Var.c1[(org.telegram.messenger.gj.B0(gjVar.k) > ys0Var.m1 ? 1 : (org.telegram.messenger.gj.B0(gjVar.k) == ys0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(gjVar.e1()) >= 0, true);
                }
                n7Var.l(this.y, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.ss0, v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        v4.e1 x10 = super.x(viewGroup, i7);
        View view = x10.a;
        if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).e0 = true;
        }
        return x10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(ys0 ys0Var, Context context, int i7, boolean z10) {
        super(ys0Var, context);
        int i10;
        TLRPC.User a22;
        this.G = ys0Var;
        this.r = new ArrayList();
        this.E = new ArrayList();
        this.h = z10;
        this.n = i7;
        org.telegram.ui.ActionBar.e2 e2Var = ys0Var.y1;
        long j3 = ys0Var.m1;
        int currentAccount = e2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(ys0Var.getStoriesHashtag())) {
            if (ys0Var.X1 == null) {
                ys0Var.X1 = new fi.d6(currentAccount, TextUtils.isEmpty(ys0Var.getStoriesHashtagUsername()) ? null : ys0Var.getStoriesHashtagUsername(), ys0Var.getStoriesHashtag());
            }
            this.s = ys0Var.X1;
        } else if (ys0Var.getStoriesArea() != null) {
            if (ys0Var.X1 == null) {
                ys0Var.X1 = new fi.d6(currentAccount, ys0Var.getStoriesArea());
            }
            this.s = ys0Var.X1;
        } else if ((!z10 || ys0Var.I0()) && (z10 || !ys0Var.A0())) {
            int i11 = 1;
            boolean z11 = j3 > 0 && (a22 = org.telegram.messenger.np.s1(currentAccount).a2(Long.valueOf(j3))) != null && a22.bot;
            if (i7 > 0) {
                this.s = e2Var.getMessagesController().P1().A(0, i7, ys0Var.m1, true);
            } else {
                fi.s6 P1 = e2Var.getMessagesController().P1();
                long j10 = ys0Var.m1;
                if (z11) {
                    i11 = 4;
                } else if (!z10) {
                    i10 = 0;
                    this.s = P1.A(i10, -1, j10, true);
                }
                i10 = i11;
                this.s = P1.A(i10, -1, j10, true);
            }
        } else {
            this.s = null;
        }
        fi.k6 k6Var = this.s;
        if (k6Var != null) {
            this.w = k6Var.o();
            this.x = new ts0(this, e2Var.getMessagesController().P1(), ys0Var.m1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.ss0
    public final int L(int i7) {
        return i7;
    }
}
