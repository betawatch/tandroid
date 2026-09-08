package ah;

import android.os.Bundle;
import android.text.TextUtils;
import fi.e5;
import fi.k3;
import ig.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.a6;
import org.telegram.ui.h8;
import org.telegram.ui.k9;
import org.telegram.ui.q4;
import org.telegram.ui.qa;
import org.telegram.ui.u9;
import org.telegram.ui.ub;
import org.telegram.ui.w6;
import org.telegram.ui.z6;
import org.telegram.ui.z9;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class t extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) this.b;
                if (i10 == -1 && !b0Var.X(true)) {
                    b0Var.finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((fi.u) this.b).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((k3) this.b).q();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((e5) this.b).finishFragment();
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
                        k0Var.G.Y2.N(true);
                        k0Var.E.r.getText().clear();
                        k0Var.E.r.requestFocus();
                        AndroidUtilities.showKeyboard(k0Var.E.r);
                        break;
                    }
                } else if (!k0Var.N) {
                    k0Var.v.d.Y2.N(false);
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
                    k0Var3.v.d.Y2.N(false);
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
                    ((a6) this.b).finishFragment();
                    break;
                }
                break;
            case 23:
                z6 z6Var = (z6) this.b;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                z6.f0(z6Var, true);
                                break;
                            }
                        } else {
                            z6.f0(z6Var, false);
                            break;
                        }
                    } else {
                        z6Var.m0();
                        break;
                    }
                } else {
                    kVar = ((n2) z6Var).actionBar;
                    if (!kVar.s()) {
                        z6Var.finishFragment();
                        break;
                    } else {
                        ai.c cVar2 = z6Var.Y;
                        if (cVar2 != null) {
                            cVar2.d();
                        }
                        w6 w6Var = z6Var.N;
                        if (w6Var != null) {
                            w6Var.e(false);
                            z6Var.N.d();
                            break;
                        }
                    }
                }
                break;
            case 24:
                h8 h8Var = (h8) this.b;
                if (i10 == -1) {
                    if (h8Var.P != 0 || h8Var.Q != 0 || h8Var.G) {
                        h8Var.G = false;
                        h8Var.P = 0;
                        h8Var.Q = 0;
                        h8Var.t0();
                        h8Var.o0();
                        break;
                    } else {
                        h8Var.finishFragment();
                        break;
                    }
                }
                break;
            case 25:
                k9 k9Var = (k9) this.b;
                if (i10 != -1) {
                    if (i10 == 2) {
                        k9Var.p0(false);
                        break;
                    }
                } else {
                    kVar2 = ((n2) k9Var).actionBar;
                    if (!kVar2.s()) {
                        k9Var.finishFragment();
                        break;
                    } else {
                        k9Var.k0(true);
                        break;
                    }
                }
                break;
            case 26:
                if (i10 == -1) {
                    ((u9) this.b).finishFragment();
                    break;
                }
                break;
            case 27:
                z9 z9Var = (z9) this.b;
                if (i10 != -1) {
                    if (i10 == 1 && z9Var.a.getText().length() != 0) {
                        z9.U(z9Var);
                        z9Var.finishFragment();
                        break;
                    }
                } else {
                    z9Var.finishFragment();
                    break;
                }
                break;
            case 28:
                qa qaVar = (qa) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        qa.Y(qaVar);
                        qa.Z(qaVar);
                        break;
                    }
                } else {
                    qaVar.finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((ub) this.b).finishFragment();
                    break;
                }
                break;
        }
    }
}
