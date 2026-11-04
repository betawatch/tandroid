package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class ts0 extends qs0 {
    public final ArrayList E;
    public boolean F;
    public final /* synthetic */ ws0 G;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public ei.r6 s;
    public final int w;
    public final rs0 x;
    public boolean y;

    public ts0(ws0 ws0Var, Context context, boolean z10) {
        this(ws0Var, context, 0, z10);
    }

    @Override // org.telegram.ui.Components.qs0, org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.qs0, org.telegram.ui.Components.zi0
    public final String F(int i3) {
        org.telegram.messenger.zi ziVar;
        TL_stories.StoryItem storyItem;
        ei.r6 r6Var = this.s;
        if (r6Var == null || i3 < 0 || i3 >= r6Var.i.size() || (ziVar = (org.telegram.messenger.zi) this.s.i.get(i3)) == null || (storyItem = ziVar.l) == null) {
            return null;
        }
        return org.telegram.messenger.bd.e0(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.qs0, org.telegram.ui.Components.zi0
    public final void I() {
        this.G.p1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i3) {
        ei.r6 r6Var;
        if (this.h || (r6Var = this.s) == null) {
            return false;
        }
        if (r6Var instanceof ei.k6) {
            ws0 ws0Var = this.G;
            TLRPC.User a22 = org.telegram.messenger.hp.s1(ws0Var.y1.getCurrentAccount()).a2(Long.valueOf(ws0Var.m1));
            return a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit;
        }
        if (i3 < 0 || i3 >= r6Var.i.size()) {
            return false;
        }
        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.s.i.get(i3);
        ei.r6 r6Var2 = this.s;
        if (r6Var2.f > 0) {
            return true;
        }
        return r6Var2.m(ziVar.f1());
    }

    public final void N() {
        rr0 rr0Var;
        rr0 rr0Var2;
        rr0 rr0Var3;
        rr0 rr0Var4;
        ei.r6 r6Var = this.s;
        if (r6Var == null || this.h) {
            return;
        }
        ws0 ws0Var = this.G;
        boolean z10 = ws0Var.o1;
        rr0[] rr0VarArr = ws0Var.n0;
        int[] iArr = ws0Var.p1;
        if ((!z10 || (ws0Var.n1 && r6Var.g() > 1)) && this.s.g() > 0 && !ws0Var.H0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (rr0VarArr != null && (rr0Var3 = rr0VarArr[0]) != null && (rr0Var4 = rr0VarArr[1]) != null && rr0Var3.h != null && rr0Var4.h != null) {
                    ws0Var.z1(false);
                }
                ws0Var.n1 = iArr[1] == 1;
            } else if (ws0Var.n1) {
                ws0Var.n1 = false;
                iArr[1] = Math.max(2, org.telegram.messenger.az.u1);
                if (rr0VarArr != null && (rr0Var = rr0VarArr[0]) != null && (rr0Var2 = rr0VarArr[1]) != null && rr0Var.h != null && rr0Var2.h != null) {
                    ws0Var.z1(false);
                }
            }
            ws0Var.o1 = true;
        }
    }

    public final int O() {
        ws0 ws0Var = this.G;
        dr0 dr0Var = ws0Var.K;
        int[] iArr = ws0Var.p1;
        return this == dr0Var ? iArr[0] : ws0.x(ws0Var, this) != -1 ? iArr[1] : ws0Var.t1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.qs0, u4.h0
    public final int b() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.G.t0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.qs0, u4.h0
    public final int d(int i3) {
        return 19;
    }

    @Override // org.telegram.ui.Components.qs0, u4.h0
    public final int e() {
        return b();
    }

    @Override // u4.h0
    public void f() {
        if (this.s != null) {
            ws0 ws0Var = this.G;
            if (ws0Var.B0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList F = org.telegram.messenger.hp.s1(this.s.c).P1().F(ws0Var.m1);
                if (F != null) {
                    arrayList.addAll(F);
                }
            }
        }
        super.f();
        N();
    }

    @Override // org.telegram.ui.Components.qs0, u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        if (this.s != null && d1Var.f == 19) {
            View view = d1Var.a;
            if (view instanceof org.telegram.ui.Cells.n7) {
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                n7Var.e0 = true;
                ArrayList arrayList = this.r;
                if (i3 >= 0 && i3 < arrayList.size()) {
                    ei.y6 y6Var = (ei.y6) arrayList.get(i3);
                    n7Var.g0 = false;
                    if (y6Var.L == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = y6Var.a;
                        int i10 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i10;
                        tL_storyItem.id = i10;
                        tL_storyItem.attachPath = y6Var.f;
                        ss0 ss0Var = new ss0(this.s.c, tL_storyItem);
                        y6Var.L = ss0Var;
                        ss0Var.m = y6Var;
                    }
                    n7Var.k(y6Var.L, O(), false);
                    n7Var.e0 = true;
                    n7Var.setReorder(false);
                    n7Var.i(false, false);
                    return;
                }
                int size = i3 - arrayList.size();
                if (size < 0 || size >= this.s.i.size()) {
                    n7Var.g0 = false;
                    n7Var.k(null, O(), false);
                    n7Var.e0 = true;
                    return;
                }
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.s.i.get(size);
                n7Var.g0 = ziVar != null && this.s.m(ziVar.f1());
                ws0 ws0Var = this.G;
                n7Var.setReorder(ws0Var.B0() || n7Var.g0);
                n7Var.h = ws0Var.F0();
                n7Var.k(ziVar, O(), false);
                if (!ws0Var.F1 || ziVar == null) {
                    n7Var.i(false, false);
                } else {
                    n7Var.i(ws0Var.c1[(org.telegram.messenger.zi.B0(ziVar.k) > ws0Var.m1 ? 1 : (org.telegram.messenger.zi.B0(ziVar.k) == ws0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ziVar.f1()) >= 0, true);
                }
                n7Var.l(this.y, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.qs0, u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        u4.d1 x10 = super.x(viewGroup, i3);
        View view = x10.a;
        if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).e0 = true;
        }
        return x10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts0(ws0 ws0Var, Context context, int i3, boolean z10) {
        super(ws0Var, context);
        int i10;
        TLRPC.User a22;
        this.G = ws0Var;
        this.r = new ArrayList();
        this.E = new ArrayList();
        this.h = z10;
        this.n = i3;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.y1;
        long j10 = ws0Var.m1;
        int currentAccount = d2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(ws0Var.getStoriesHashtag())) {
            if (ws0Var.X1 == null) {
                ws0Var.X1 = new ei.l6(currentAccount, TextUtils.isEmpty(ws0Var.getStoriesHashtagUsername()) ? null : ws0Var.getStoriesHashtagUsername(), ws0Var.getStoriesHashtag());
            }
            this.s = ws0Var.X1;
        } else if (ws0Var.getStoriesArea() != null) {
            if (ws0Var.X1 == null) {
                ws0Var.X1 = new ei.l6(currentAccount, ws0Var.getStoriesArea());
            }
            this.s = ws0Var.X1;
        } else if ((!z10 || ws0Var.H0()) && (z10 || !ws0Var.A0())) {
            int i11 = 1;
            boolean z11 = j10 > 0 && (a22 = org.telegram.messenger.hp.s1(currentAccount).a2(Long.valueOf(j10))) != null && a22.bot;
            if (i3 > 0) {
                this.s = d2Var.getMessagesController().P1().A(0, i3, ws0Var.m1, true);
            } else {
                ei.z6 P1 = d2Var.getMessagesController().P1();
                long j11 = ws0Var.m1;
                if (z11) {
                    i11 = 4;
                } else if (!z10) {
                    i10 = 0;
                    this.s = P1.A(i10, -1, j11, true);
                }
                i10 = i11;
                this.s = P1.A(i10, -1, j11, true);
            }
        } else {
            this.s = null;
        }
        ei.r6 r6Var = this.s;
        if (r6Var != null) {
            this.w = r6Var.o();
            this.x = new rs0(this, d2Var.getMessagesController().P1(), ws0Var.m1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.qs0
    public final int L(int i3) {
        return i3;
    }
}
