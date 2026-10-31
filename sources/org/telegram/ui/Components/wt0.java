package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class wt0 extends tt0 {
    public final ArrayList D;
    public boolean E;
    public final /* synthetic */ zt0 F;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public th.x4 s;
    public final int w;
    public final ut0 x;
    public boolean y;

    public wt0(zt0 zt0Var, Context context, boolean z10) {
        this(zt0Var, context, 0, z10);
    }

    @Override // org.telegram.ui.Components.tt0, org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.tt0, org.telegram.ui.Components.ak0
    public final String F(int i10) {
        org.telegram.messenger.jj jjVar;
        TL_stories.StoryItem storyItem;
        th.x4 x4Var = this.s;
        if (x4Var == null || i10 < 0 || i10 >= x4Var.i.size() || (jjVar = (org.telegram.messenger.jj) this.s.i.get(i10)) == null || (storyItem = jjVar.l) == null) {
            return null;
        }
        return org.telegram.messenger.cd.e0(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.tt0, org.telegram.ui.Components.ak0
    public final void I() {
        this.F.m1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i10) {
        th.x4 x4Var;
        if (this.h || (x4Var = this.s) == null) {
            return false;
        }
        if (x4Var instanceof th.q4) {
            zt0 zt0Var = this.F;
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(zt0Var.x1.getCurrentAccount()).Z1(Long.valueOf(zt0Var.l1));
            return Z1 != null && Z1.bot && Z1.bot_has_main_app && Z1.bot_can_edit;
        }
        if (i10 < 0 || i10 >= x4Var.i.size()) {
            return false;
        }
        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.s.i.get(i10);
        th.x4 x4Var2 = this.s;
        if (x4Var2.f > 0) {
            return true;
        }
        return x4Var2.m(jjVar.f1());
    }

    public final void N() {
        ss0 ss0Var;
        ss0 ss0Var2;
        ss0 ss0Var3;
        ss0 ss0Var4;
        th.x4 x4Var = this.s;
        if (x4Var == null || this.h) {
            return;
        }
        zt0 zt0Var = this.F;
        boolean z10 = zt0Var.n1;
        ss0[] ss0VarArr = zt0Var.m0;
        int[] iArr = zt0Var.o1;
        if ((!z10 || (zt0Var.m1 && x4Var.g() > 1)) && this.s.g() > 0 && !zt0Var.E0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (ss0VarArr != null && (ss0Var3 = ss0VarArr[0]) != null && (ss0Var4 = ss0VarArr[1]) != null && ss0Var3.h != null && ss0Var4.h != null) {
                    zt0Var.w1(false);
                }
                zt0Var.m1 = iArr[1] == 1;
            } else if (zt0Var.m1) {
                zt0Var.m1 = false;
                iArr[1] = Math.max(2, org.telegram.messenger.tz.u1);
                if (ss0VarArr != null && (ss0Var = ss0VarArr[0]) != null && (ss0Var2 = ss0VarArr[1]) != null && ss0Var.h != null && ss0Var2.h != null) {
                    zt0Var.w1(false);
                }
            }
            zt0Var.n1 = true;
        }
    }

    public final int O() {
        zt0 zt0Var = this.F;
        es0 es0Var = zt0Var.J;
        int[] iArr = zt0Var.o1;
        return this == es0Var ? iArr[0] : zt0.v(zt0Var, this) != -1 ? iArr[1] : zt0Var.s1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.tt0, s4.g0
    public final int b() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.F.r0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.tt0, s4.g0
    public final int d(int i10) {
        return 19;
    }

    @Override // org.telegram.ui.Components.tt0, s4.g0
    public final int e() {
        return b();
    }

    @Override // s4.g0
    public void f() {
        if (this.s != null) {
            zt0 zt0Var = this.F;
            if (zt0Var.z0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList F = org.telegram.messenger.vp.r1(this.s.c).O1().F(zt0Var.l1);
                if (F != null) {
                    arrayList.addAll(F);
                }
            }
        }
        super.f();
        N();
    }

    @Override // org.telegram.ui.Components.tt0, s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        if (this.s != null && c1Var.f == 19) {
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.s7) {
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                s7Var.d0 = true;
                ArrayList arrayList = this.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    th.d5 d5Var = (th.d5) arrayList.get(i10);
                    s7Var.f0 = false;
                    if (d5Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = d5Var.a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.id = i11;
                        tL_storyItem.attachPath = d5Var.f;
                        vt0 vt0Var = new vt0(this.s.c, tL_storyItem);
                        d5Var.K = vt0Var;
                        vt0Var.m = d5Var;
                    }
                    s7Var.k(d5Var.K, O(), false);
                    s7Var.d0 = true;
                    s7Var.setReorder(false);
                    s7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size < 0 || size >= this.s.i.size()) {
                    s7Var.f0 = false;
                    s7Var.k(null, O(), false);
                    s7Var.d0 = true;
                    return;
                }
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.s.i.get(size);
                s7Var.f0 = jjVar != null && this.s.m(jjVar.f1());
                zt0 zt0Var = this.F;
                s7Var.setReorder(zt0Var.z0() || s7Var.f0);
                s7Var.h = zt0Var.C0();
                s7Var.k(jjVar, O(), false);
                if (!zt0Var.E1 || jjVar == null) {
                    s7Var.i(false, false);
                } else {
                    s7Var.i(zt0Var.b1[(org.telegram.messenger.jj.B0(jjVar.k) > zt0Var.l1 ? 1 : (org.telegram.messenger.jj.B0(jjVar.k) == zt0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(jjVar.f1()) >= 0, true);
                }
                s7Var.l(this.y, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.tt0, s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        s4.c1 w9 = super.w(viewGroup, i10);
        View view = w9.a;
        if (view instanceof org.telegram.ui.Cells.s7) {
            ((org.telegram.ui.Cells.s7) view).d0 = true;
        }
        return w9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt0(zt0 zt0Var, Context context, int i10, boolean z10) {
        super(zt0Var, context);
        int i11;
        TLRPC.User Z1;
        this.F = zt0Var;
        this.r = new ArrayList();
        this.D = new ArrayList();
        this.h = z10;
        this.n = i10;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.x1;
        long j10 = zt0Var.l1;
        int currentAccount = k2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(zt0Var.getStoriesHashtag())) {
            if (zt0Var.W1 == null) {
                zt0Var.W1 = new th.r4(currentAccount, TextUtils.isEmpty(zt0Var.getStoriesHashtagUsername()) ? null : zt0Var.getStoriesHashtagUsername(), zt0Var.getStoriesHashtag());
            }
            this.s = zt0Var.W1;
        } else if (zt0Var.getStoriesArea() != null) {
            if (zt0Var.W1 == null) {
                zt0Var.W1 = new th.r4(currentAccount, zt0Var.getStoriesArea());
            }
            this.s = zt0Var.W1;
        } else if ((!z10 || zt0Var.E0()) && (z10 || !zt0Var.y0())) {
            int i12 = 1;
            boolean z11 = j10 > 0 && (Z1 = org.telegram.messenger.vp.r1(currentAccount).Z1(Long.valueOf(j10))) != null && Z1.bot;
            if (i10 > 0) {
                this.s = k2Var.getMessagesController().O1().A(0, i10, zt0Var.l1, true);
            } else {
                th.e5 O1 = k2Var.getMessagesController().O1();
                long j11 = zt0Var.l1;
                if (z11) {
                    i12 = 4;
                } else if (!z10) {
                    i11 = 0;
                    this.s = O1.A(i11, -1, j11, true);
                }
                i11 = i12;
                this.s = O1.A(i11, -1, j11, true);
            }
        } else {
            this.s = null;
        }
        th.x4 x4Var = this.s;
        if (x4Var != null) {
            this.w = x4Var.o();
            this.x = new ut0(this, k2Var.getMessagesController().O1(), zt0Var.l1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.tt0
    public final int L(int i10) {
        return i10;
    }
}
