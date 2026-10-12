package ah;

import android.os.Bundle;
import android.text.TextUtils;
import fi.d5;
import fi.k3;
import ig.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.a7;
import org.telegram.ui.d7;
import org.telegram.ui.e6;
import org.telegram.ui.ea;
import org.telegram.ui.l8;
import org.telegram.ui.n9;
import org.telegram.ui.q4;
import org.telegram.ui.u4;
import org.telegram.ui.va;
import org.telegram.ui.z9;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class s extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                a0 a0Var = (a0) this.b;
                if (i10 == -1 && !a0Var.X(true)) {
                    a0Var.finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((fi.t) this.b).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((k3) this.b).r();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((d5) this.b).finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((gi.f) this.b).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((gi.p) this.b).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((gi.s) this.b).finishFragment();
                    break;
                }
                break;
            case 7:
                gi.k0 k0Var = ((gi.e0) this.b).h;
                if (i10 != -1) {
                    if (i10 == 3) {
                        k0Var.c.a(true, true);
                        k0Var.setAllowNestedScroll(false);
                        k0Var.S = null;
                        k0Var.G.W2.N(true);
                        k0Var.E.r.getText().clear();
                        k0Var.E.r.requestFocus();
                        AndroidUtilities.showKeyboard(k0Var.E.r);
                        break;
                    }
                } else if (!k0Var.N) {
                    k0Var.v.d.W2.N(false);
                    k0Var.d.D(0);
                    break;
                } else {
                    k0Var.dismiss();
                    break;
                }
                break;
            case 8:
                gi.k0 k0Var2 = ((gi.f0) this.b).r;
                if (i10 != 2) {
                    if (i10 == 3) {
                        k0Var2.b.a(true, true);
                        k0Var2.setAllowNestedScroll(false);
                        TextUtils.isEmpty(k0Var2.R);
                        k0Var2.R = null;
                        k0Var2.F.h(0L, k0Var2.e, 0L, 0L, null, false, null, true);
                        k0Var2.y.r.getText().clear();
                        k0Var2.y.r.requestFocus();
                        AndroidUtilities.showKeyboard(k0Var2.y.r);
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", k0Var2.e);
                    k0Var2.s.presentFragment(new gi.p(bundle));
                    k0Var2.dismiss();
                    break;
                }
                break;
            case 9:
                gi.k0 k0Var3 = ((gi.j0) this.b).h;
                if (i10 == -1) {
                    k0Var3.v.d.W2.N(false);
                    k0Var3.d.D(0);
                    break;
                }
                break;
            case 10:
                ig.c cVar = (ig.c) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        cVar.X();
                        break;
                    }
                } else if (cVar.onBackPressed(true)) {
                    cVar.finishFragment();
                    break;
                }
                break;
            case 11:
                ig.m mVar = (ig.m) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        mVar.h0();
                        break;
                    }
                } else if (mVar.onBackPressed(true)) {
                    mVar.finishFragment();
                    break;
                }
                break;
            case 12:
                ig.u0 u0Var = (ig.u0) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        u0Var.a0();
                        break;
                    }
                } else if (u0Var.onBackPressed(true)) {
                    u0Var.finishFragment();
                    break;
                }
                break;
            case 13:
                ig.w0 w0Var = (ig.w0) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        w0Var.X();
                        break;
                    }
                } else if (w0Var.onBackPressed(true)) {
                    w0Var.finishFragment();
                    break;
                }
                break;
            case 14:
                ig.e1 e1Var = (ig.e1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        e1Var.W();
                        break;
                    }
                } else if (e1Var.onBackPressed(true)) {
                    e1Var.finishFragment();
                    break;
                }
                break;
            case 15:
                ig.g1 g1Var = (ig.g1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        g1Var.d0();
                        break;
                    }
                } else if (g1Var.onBackPressed(true)) {
                    g1Var.finishFragment();
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((ig.i1) this.b).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((e2) this.b).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((org.telegram.ui.h) this.b).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((org.telegram.ui.l) this.b).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((org.telegram.ui.p) this.b).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((q4) this.b).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((u4) this.b).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((e6) this.b).finishFragment();
                    break;
                }
                break;
            case 24:
                d7 d7Var = (d7) this.b;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                d7.f0(d7Var, true);
                                break;
                            }
                        } else {
                            d7.f0(d7Var, false);
                            break;
                        }
                    } else {
                        d7Var.m0();
                        break;
                    }
                } else {
                    kVar = ((m2) d7Var).actionBar;
                    if (!kVar.t()) {
                        d7Var.finishFragment();
                        break;
                    } else {
                        ai.c cVar2 = d7Var.Y;
                        if (cVar2 != null) {
                            cVar2.d();
                        }
                        a7 a7Var = d7Var.N;
                        if (a7Var != null) {
                            a7Var.e(false);
                            d7Var.N.d();
                            break;
                        }
                    }
                }
                break;
            case 25:
                l8 l8Var = (l8) this.b;
                if (i10 == -1) {
                    if (l8Var.P != 0 || l8Var.Q != 0 || l8Var.G) {
                        l8Var.G = false;
                        l8Var.P = 0;
                        l8Var.Q = 0;
                        l8Var.t0();
                        l8Var.o0();
                        break;
                    } else {
                        l8Var.finishFragment();
                        break;
                    }
                }
                break;
            case 26:
                n9 n9Var = (n9) this.b;
                if (i10 != -1) {
                    if (i10 == 2) {
                        n9Var.p0(false);
                        break;
                    }
                } else {
                    kVar2 = ((m2) n9Var).actionBar;
                    if (!kVar2.t()) {
                        n9Var.finishFragment();
                        break;
                    } else {
                        n9Var.k0(true);
                        break;
                    }
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((z9) this.b).finishFragment();
                    break;
                }
                break;
            case 28:
                ea eaVar = (ea) this.b;
                if (i10 != -1) {
                    if (i10 == 1 && eaVar.a.getText().length() != 0) {
                        ea.U(eaVar);
                        eaVar.finishFragment();
                        break;
                    }
                } else {
                    eaVar.finishFragment();
                    break;
                }
                break;
            default:
                va vaVar = (va) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        va.Y(vaVar);
                        va.Z(vaVar);
                        break;
                    }
                } else {
                    vaVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
