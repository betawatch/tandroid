package ah;

import android.os.Bundle;
import android.text.TextUtils;
import gi.d3;
import gi.s4;
import ig.d2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ba;
import org.telegram.ui.c7;
import org.telegram.ui.e6;
import org.telegram.ui.k8;
import org.telegram.ui.m9;
import org.telegram.ui.r4;
import org.telegram.ui.v4;
import org.telegram.ui.w9;
import org.telegram.ui.z6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                    ((ai.x) this.b).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((gi.t) this.b).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((d3) this.b).r();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((s4) this.b).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((hi.f) this.b).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((hi.o) this.b).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((hi.r) this.b).finishFragment();
                    break;
                }
                break;
            case 8:
                hi.k0 k0Var = ((hi.e0) this.b).h;
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
            case 9:
                hi.k0 k0Var2 = ((hi.f0) this.b).r;
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
                    k0Var2.s.presentFragment(new hi.o(bundle));
                    k0Var2.dismiss();
                    break;
                }
                break;
            case 10:
                hi.k0 k0Var3 = ((hi.j0) this.b).h;
                if (i10 == -1) {
                    k0Var3.v.d.W2.N(false);
                    k0Var3.d.D(0);
                    break;
                }
                break;
            case 11:
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
            case 12:
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
            case 13:
                ig.t0 t0Var = (ig.t0) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        t0Var.a0();
                        break;
                    }
                } else if (t0Var.onBackPressed(true)) {
                    t0Var.finishFragment();
                    break;
                }
                break;
            case 14:
                ig.v0 v0Var = (ig.v0) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        v0Var.X();
                        break;
                    }
                } else if (v0Var.onBackPressed(true)) {
                    v0Var.finishFragment();
                    break;
                }
                break;
            case 15:
                ig.d1 d1Var = (ig.d1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        d1Var.W();
                        break;
                    }
                } else if (d1Var.onBackPressed(true)) {
                    d1Var.finishFragment();
                    break;
                }
                break;
            case 16:
                ig.f1 f1Var = (ig.f1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        f1Var.d0();
                        break;
                    }
                } else if (f1Var.onBackPressed(true)) {
                    f1Var.finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((ig.h1) this.b).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((d2) this.b).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((org.telegram.ui.h) this.b).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((org.telegram.ui.l) this.b).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((org.telegram.ui.p) this.b).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((r4) this.b).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((v4) this.b).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((e6) this.b).finishFragment();
                    break;
                }
                break;
            case 25:
                c7 c7Var = (c7) this.b;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                c7.f0(c7Var, true);
                                break;
                            }
                        } else {
                            c7.f0(c7Var, false);
                            break;
                        }
                    } else {
                        c7Var.m0();
                        break;
                    }
                } else {
                    kVar = ((n2) c7Var).actionBar;
                    if (!kVar.t()) {
                        c7Var.finishFragment();
                        break;
                    } else {
                        bi.c cVar2 = c7Var.Y;
                        if (cVar2 != null) {
                            cVar2.d();
                        }
                        z6 z6Var = c7Var.N;
                        if (z6Var != null) {
                            z6Var.e(false);
                            c7Var.N.d();
                            break;
                        }
                    }
                }
                break;
            case 26:
                k8 k8Var = (k8) this.b;
                if (i10 == -1) {
                    if (k8Var.P != 0 || k8Var.Q != 0 || k8Var.G) {
                        k8Var.G = false;
                        k8Var.P = 0;
                        k8Var.Q = 0;
                        k8Var.t0();
                        k8Var.o0();
                        break;
                    } else {
                        k8Var.finishFragment();
                        break;
                    }
                }
                break;
            case 27:
                m9 m9Var = (m9) this.b;
                if (i10 != -1) {
                    if (i10 == 2) {
                        m9Var.p0(false);
                        break;
                    }
                } else {
                    kVar2 = ((n2) m9Var).actionBar;
                    if (!kVar2.t()) {
                        m9Var.finishFragment();
                        break;
                    } else {
                        m9Var.k0(true);
                        break;
                    }
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((w9) this.b).finishFragment();
                    break;
                }
                break;
            default:
                ba baVar = (ba) this.b;
                if (i10 != -1) {
                    if (i10 == 1 && baVar.a.getText().length() != 0) {
                        ba.U(baVar);
                        baVar.finishFragment();
                        break;
                    }
                } else {
                    baVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
