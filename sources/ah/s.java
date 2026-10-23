package ah;

import android.os.Bundle;
import android.text.TextUtils;
import gi.d3;
import gi.s4;
import ig.c2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ba;
import org.telegram.ui.c7;
import org.telegram.ui.d6;
import org.telegram.ui.k8;
import org.telegram.ui.m9;
import org.telegram.ui.q4;
import org.telegram.ui.u4;
import org.telegram.ui.w9;
import org.telegram.ui.z6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                        k0Var.G.Z2.N(true);
                        k0Var.E.r.getText().clear();
                        k0Var.E.r.requestFocus();
                        AndroidUtilities.showKeyboard(k0Var.E.r);
                        break;
                    }
                } else if (!k0Var.N) {
                    k0Var.v.d.Z2.N(false);
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
                    k0Var3.v.d.Z2.N(false);
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
                ig.s0 s0Var = (ig.s0) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        s0Var.a0();
                        break;
                    }
                } else if (s0Var.onBackPressed(true)) {
                    s0Var.finishFragment();
                    break;
                }
                break;
            case 14:
                ig.u0 u0Var = (ig.u0) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        u0Var.X();
                        break;
                    }
                } else if (u0Var.onBackPressed(true)) {
                    u0Var.finishFragment();
                    break;
                }
                break;
            case 15:
                ig.c1 c1Var = (ig.c1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        c1Var.W();
                        break;
                    }
                } else if (c1Var.onBackPressed(true)) {
                    c1Var.finishFragment();
                    break;
                }
                break;
            case 16:
                ig.e1 e1Var = (ig.e1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        e1Var.d0();
                        break;
                    }
                } else if (e1Var.onBackPressed(true)) {
                    e1Var.finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((ig.g1) this.b).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((c2) this.b).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((org.telegram.ui.g) this.b).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((org.telegram.ui.k) this.b).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((org.telegram.ui.o) this.b).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((q4) this.b).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((u4) this.b).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((d6) this.b).finishFragment();
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
                        c7Var.n0();
                        break;
                    }
                } else {
                    kVar = ((o2) c7Var).actionBar;
                    if (!kVar.s()) {
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
                        k8Var.u0();
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
                        m9Var.o0(false);
                        break;
                    }
                } else {
                    kVar2 = ((o2) m9Var).actionBar;
                    if (!kVar2.s()) {
                        m9Var.finishFragment();
                        break;
                    } else {
                        m9Var.j0(true);
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
