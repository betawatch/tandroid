package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public class xt0 extends ut0 {
    public final ArrayList D;
    public boolean E;
    public final /* synthetic */ au0 F;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public th.x4 s;
    public final int w;
    public final vt0 x;
    public boolean y;

    public xt0(au0 au0Var, Context context, boolean z10) {
        this(au0Var, context, 0, z10);
    }

    @Override // org.telegram.ui.Components.ut0, org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.ut0, org.telegram.ui.Components.bk0
    public final String F(int i10) {
        org.telegram.messenger.kj kjVar;
        TL_stories.StoryItem storyItem;
        th.x4 x4Var = this.s;
        if (x4Var == null || i10 < 0 || i10 >= x4Var.i.size() || (kjVar = (org.telegram.messenger.kj) this.s.i.get(i10)) == null || (storyItem = kjVar.l) == null) {
            return null;
        }
        return org.telegram.messenger.dd.e0(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.ut0, org.telegram.ui.Components.bk0
    public final void I() {
        this.F.n1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i10) {
        th.x4 x4Var;
        if (this.h || (x4Var = this.s) == null) {
            return false;
        }
        if (x4Var instanceof th.q4) {
            au0 au0Var = this.F;
            TLRPC.User Z1 = org.telegram.messenger.wp.r1(au0Var.x1.getCurrentAccount()).Z1(Long.valueOf(au0Var.l1));
            return Z1 != null && Z1.bot && Z1.bot_has_main_app && Z1.bot_can_edit;
        }
        if (i10 < 0 || i10 >= x4Var.i.size()) {
            return false;
        }
        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) this.s.i.get(i10);
        th.x4 x4Var2 = this.s;
        if (x4Var2.f > 0) {
            return true;
        }
        return x4Var2.m(kjVar.f1());
    }

    public final void N() {
        ts0 ts0Var;
        ts0 ts0Var2;
        ts0 ts0Var3;
        ts0 ts0Var4;
        th.x4 x4Var = this.s;
        if (x4Var == null || this.h) {
            return;
        }
        au0 au0Var = this.F;
        boolean z10 = au0Var.n1;
        ts0[] ts0VarArr = au0Var.m0;
        int[] iArr = au0Var.o1;
        if ((!z10 || (au0Var.m1 && x4Var.g() > 1)) && this.s.g() > 0 && !au0Var.F0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (ts0VarArr != null && (ts0Var3 = ts0VarArr[0]) != null && (ts0Var4 = ts0VarArr[1]) != null && ts0Var3.h != null && ts0Var4.h != null) {
                    au0Var.x1(false);
                }
                au0Var.m1 = iArr[1] == 1;
            } else if (au0Var.m1) {
                au0Var.m1 = false;
                iArr[1] = Math.max(2, org.telegram.messenger.uz.u1);
                if (ts0VarArr != null && (ts0Var = ts0VarArr[0]) != null && (ts0Var2 = ts0VarArr[1]) != null && ts0Var.h != null && ts0Var2.h != null) {
                    au0Var.x1(false);
                }
            }
            au0Var.n1 = true;
        }
    }

    public final int O() {
        au0 au0Var = this.F;
        fs0 fs0Var = au0Var.J;
        int[] iArr = au0Var.o1;
        return this == fs0Var ? iArr[0] : au0.v(au0Var, this) != -1 ? iArr[1] : au0Var.s1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.ut0, s4.g0
    public final int b() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.F.s0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.ut0, s4.g0
    public final int d(int i10) {
        return 19;
    }

    @Override // org.telegram.ui.Components.ut0, s4.g0
    public final int e() {
        return b();
    }

    @Override // s4.g0
    public void f() {
        if (this.s != null) {
            au0 au0Var = this.F;
            if (au0Var.A0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList F = org.telegram.messenger.wp.r1(this.s.c).O1().F(au0Var.l1);
                if (F != null) {
                    arrayList.addAll(F);
                }
            }
        }
        super.f();
        N();
    }

    @Override // org.telegram.ui.Components.ut0, s4.g0
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
                        wt0 wt0Var = new wt0(this.s.c, tL_storyItem);
                        d5Var.K = wt0Var;
                        wt0Var.m = d5Var;
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
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) this.s.i.get(size);
                s7Var.f0 = kjVar != null && this.s.m(kjVar.f1());
                au0 au0Var = this.F;
                s7Var.setReorder(au0Var.A0() || s7Var.f0);
                s7Var.h = au0Var.D0();
                s7Var.k(kjVar, O(), false);
                if (!au0Var.E1 || kjVar == null) {
                    s7Var.i(false, false);
                } else {
                    s7Var.i(au0Var.b1[(org.telegram.messenger.kj.B0(kjVar.k) > au0Var.l1 ? 1 : (org.telegram.messenger.kj.B0(kjVar.k) == au0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(kjVar.f1()) >= 0, true);
                }
                s7Var.l(this.y, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.ut0, s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        s4.c1 w9 = super.w(viewGroup, i10);
        View view = w9.a;
        if (view instanceof org.telegram.ui.Cells.s7) {
            ((org.telegram.ui.Cells.s7) view).d0 = true;
        }
        return w9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt0(au0 au0Var, Context context, int i10, boolean z10) {
        super(au0Var, context);
        int i11;
        TLRPC.User Z1;
        this.F = au0Var;
        this.r = new ArrayList();
        this.D = new ArrayList();
        this.h = z10;
        this.n = i10;
        org.telegram.ui.ActionBar.k2 k2Var = au0Var.x1;
        long j10 = au0Var.l1;
        int currentAccount = k2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(au0Var.getStoriesHashtag())) {
            if (au0Var.W1 == null) {
                au0Var.W1 = new th.r4(currentAccount, TextUtils.isEmpty(au0Var.getStoriesHashtagUsername()) ? null : au0Var.getStoriesHashtagUsername(), au0Var.getStoriesHashtag());
            }
            this.s = au0Var.W1;
        } else if (au0Var.getStoriesArea() != null) {
            if (au0Var.W1 == null) {
                au0Var.W1 = new th.r4(currentAccount, au0Var.getStoriesArea());
            }
            this.s = au0Var.W1;
        } else if ((!z10 || au0Var.F0()) && (z10 || !au0Var.z0())) {
            int i12 = 1;
            boolean z11 = j10 > 0 && (Z1 = org.telegram.messenger.wp.r1(currentAccount).Z1(Long.valueOf(j10))) != null && Z1.bot;
            if (i10 > 0) {
                this.s = k2Var.getMessagesController().O1().A(0, i10, au0Var.l1, true);
            } else {
                th.e5 O1 = k2Var.getMessagesController().O1();
                long j11 = au0Var.l1;
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
            this.x = new vt0(this, k2Var.getMessagesController().O1(), au0Var.l1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.ut0
    public final int L(int i10) {
        return i10;
    }
}
