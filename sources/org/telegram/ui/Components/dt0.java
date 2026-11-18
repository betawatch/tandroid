package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class dt0 extends at0 {
    public final ArrayList E;
    public boolean F;
    public final /* synthetic */ gt0 G;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public fi.h6 s;
    public final int w;
    public final bt0 x;
    public boolean y;

    public dt0(gt0 gt0Var, Context context, boolean z10) {
        this(gt0Var, context, 0, z10);
    }

    @Override // org.telegram.ui.Components.at0, org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.at0, org.telegram.ui.Components.ij0
    public final String F(int i7) {
        org.telegram.messenger.fj fjVar;
        TL_stories.StoryItem storyItem;
        fi.h6 h6Var = this.s;
        if (h6Var == null || i7 < 0 || i7 >= h6Var.i.size() || (fjVar = (org.telegram.messenger.fj) this.s.i.get(i7)) == null || (storyItem = fjVar.l) == null) {
            return null;
        }
        return org.telegram.messenger.gd.e0(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.at0, org.telegram.ui.Components.ij0
    public final void I() {
        this.G.r1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i7) {
        fi.h6 h6Var;
        if (this.h || (h6Var = this.s) == null) {
            return false;
        }
        if (h6Var instanceof fi.z5) {
            gt0 gt0Var = this.G;
            TLRPC.User c22 = org.telegram.messenger.mp.u1(gt0Var.y1.getCurrentAccount()).c2(Long.valueOf(gt0Var.m1));
            return c22 != null && c22.bot && c22.bot_has_main_app && c22.bot_can_edit;
        }
        if (i7 < 0 || i7 >= h6Var.i.size()) {
            return false;
        }
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.s.i.get(i7);
        fi.h6 h6Var2 = this.s;
        if (h6Var2.f > 0) {
            return true;
        }
        return h6Var2.m(fjVar.e1());
    }

    public final void N() {
        bs0 bs0Var;
        bs0 bs0Var2;
        bs0 bs0Var3;
        bs0 bs0Var4;
        fi.h6 h6Var = this.s;
        if (h6Var == null || this.h) {
            return;
        }
        gt0 gt0Var = this.G;
        boolean z10 = gt0Var.o1;
        bs0[] bs0VarArr = gt0Var.n0;
        int[] iArr = gt0Var.p1;
        if ((!z10 || (gt0Var.n1 && h6Var.g() > 1)) && this.s.g() > 0 && !gt0Var.I0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (bs0VarArr != null && (bs0Var3 = bs0VarArr[0]) != null && (bs0Var4 = bs0VarArr[1]) != null && bs0Var3.h != null && bs0Var4.h != null) {
                    gt0Var.B1(false);
                }
                gt0Var.n1 = iArr[1] == 1;
            } else if (gt0Var.n1) {
                gt0Var.n1 = false;
                iArr[1] = Math.max(2, org.telegram.messenger.bz.u1);
                if (bs0VarArr != null && (bs0Var = bs0VarArr[0]) != null && (bs0Var2 = bs0VarArr[1]) != null && bs0Var.h != null && bs0Var2.h != null) {
                    gt0Var.B1(false);
                }
            }
            gt0Var.o1 = true;
        }
    }

    public final int O() {
        gt0 gt0Var = this.G;
        nr0 nr0Var = gt0Var.K;
        int[] iArr = gt0Var.p1;
        return this == nr0Var ? iArr[0] : gt0.x(gt0Var, this) != -1 ? iArr[1] : gt0Var.t1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.at0, v4.i0
    public final int b() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.G.t0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.at0, v4.i0
    public final int d(int i7) {
        return 19;
    }

    @Override // org.telegram.ui.Components.at0, v4.i0
    public final int e() {
        return b();
    }

    @Override // v4.i0
    public void f() {
        if (this.s != null) {
            gt0 gt0Var = this.G;
            if (gt0Var.B0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList F = org.telegram.messenger.mp.u1(this.s.c).R1().F(gt0Var.m1);
                if (F != null) {
                    arrayList.addAll(F);
                }
            }
        }
        super.f();
        N();
    }

    @Override // org.telegram.ui.Components.at0, v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        if (this.s != null && f1Var.f == 19) {
            View view = f1Var.a;
            if (view instanceof org.telegram.ui.Cells.p7) {
                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                p7Var.e0 = true;
                ArrayList arrayList = this.r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    fi.o6 o6Var = (fi.o6) arrayList.get(i7);
                    p7Var.g0 = false;
                    if (o6Var.L == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = o6Var.a;
                        int i10 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i10;
                        tL_storyItem.id = i10;
                        tL_storyItem.attachPath = o6Var.f;
                        ct0 ct0Var = new ct0(this.s.c, tL_storyItem);
                        o6Var.L = ct0Var;
                        ct0Var.m = o6Var;
                    }
                    p7Var.k(o6Var.L, O(), false);
                    p7Var.e0 = true;
                    p7Var.setReorder(false);
                    p7Var.i(false, false);
                    return;
                }
                int size = i7 - arrayList.size();
                if (size < 0 || size >= this.s.i.size()) {
                    p7Var.g0 = false;
                    p7Var.k(null, O(), false);
                    p7Var.e0 = true;
                    return;
                }
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.s.i.get(size);
                p7Var.g0 = fjVar != null && this.s.m(fjVar.e1());
                gt0 gt0Var = this.G;
                p7Var.setReorder(gt0Var.B0() || p7Var.g0);
                p7Var.h = gt0Var.G0();
                p7Var.k(fjVar, O(), false);
                if (!gt0Var.F1 || fjVar == null) {
                    p7Var.i(false, false);
                } else {
                    p7Var.i(gt0Var.c1[(org.telegram.messenger.fj.B0(fjVar.k) > gt0Var.m1 ? 1 : (org.telegram.messenger.fj.B0(fjVar.k) == gt0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(fjVar.e1()) >= 0, true);
                }
                p7Var.l(this.y, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.at0, v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        v4.f1 x10 = super.x(viewGroup, i7);
        View view = x10.a;
        if (view instanceof org.telegram.ui.Cells.p7) {
            ((org.telegram.ui.Cells.p7) view).e0 = true;
        }
        return x10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt0(gt0 gt0Var, Context context, int i7, boolean z10) {
        super(gt0Var, context);
        int i10;
        TLRPC.User c22;
        this.G = gt0Var;
        this.r = new ArrayList();
        this.E = new ArrayList();
        this.h = z10;
        this.n = i7;
        org.telegram.ui.ActionBar.h2 h2Var = gt0Var.y1;
        long j3 = gt0Var.m1;
        int currentAccount = h2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(gt0Var.getStoriesHashtag())) {
            if (gt0Var.X1 == null) {
                gt0Var.X1 = new fi.b6(currentAccount, TextUtils.isEmpty(gt0Var.getStoriesHashtagUsername()) ? null : gt0Var.getStoriesHashtagUsername(), gt0Var.getStoriesHashtag());
            }
            this.s = gt0Var.X1;
        } else if (gt0Var.getStoriesArea() != null) {
            if (gt0Var.X1 == null) {
                gt0Var.X1 = new fi.b6(currentAccount, gt0Var.getStoriesArea());
            }
            this.s = gt0Var.X1;
        } else if ((!z10 || gt0Var.I0()) && (z10 || !gt0Var.A0())) {
            int i11 = 1;
            boolean z11 = j3 > 0 && (c22 = org.telegram.messenger.mp.u1(currentAccount).c2(Long.valueOf(j3))) != null && c22.bot;
            if (i7 > 0) {
                this.s = h2Var.getMessagesController().R1().A(0, i7, gt0Var.m1, true);
            } else {
                fi.p6 R1 = h2Var.getMessagesController().R1();
                long j10 = gt0Var.m1;
                if (z11) {
                    i11 = 4;
                } else if (!z10) {
                    i10 = 0;
                    this.s = R1.A(i10, -1, j10, true);
                }
                i10 = i11;
                this.s = R1.A(i10, -1, j10, true);
            }
        } else {
            this.s = null;
        }
        fi.h6 h6Var = this.s;
        if (h6Var != null) {
            this.w = h6Var.o();
            this.x = new bt0(this, h2Var.getMessagesController().R1(), gt0Var.m1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.at0
    public final int L(int i7) {
        return i7;
    }
}
