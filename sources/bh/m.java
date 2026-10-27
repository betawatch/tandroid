package bh;

import android.os.Bundle;
import android.text.TextUtils;
import hi.b5;
import hi.m3;
import jg.d1;
import jg.f2;
import jg.h1;
import jg.j1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.r5;
import org.telegram.ui.c6;
import org.telegram.ui.c7;
import org.telegram.ui.da;
import org.telegram.ui.m6;
import org.telegram.ui.n8;
import org.telegram.ui.o9;
import org.telegram.ui.p4;
import org.telegram.ui.t4;
import org.telegram.ui.y9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class m extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        r5 r5Var;
        r5 r5Var2;
        switch (this.a) {
            case 0:
                u uVar = (u) this.b;
                if (i10 == -1 && !uVar.Z(true)) {
                    uVar.finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((bi.y) this.b).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((hi.a0) this.b).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((m3) this.b).r();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((b5) this.b).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((ii.f) this.b).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((ii.o) this.b).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((ii.r) this.b).finishFragment();
                    break;
                }
                break;
            case 8:
                ii.j0 j0Var = ((ii.d0) this.b).h;
                if (i10 != -1) {
                    if (i10 == 3) {
                        j0Var.c.a(true, true);
                        j0Var.setAllowNestedScroll(false);
                        j0Var.S = null;
                        j0Var.G.g3.O(true);
                        j0Var.E.r.getText().clear();
                        j0Var.E.r.requestFocus();
                        AndroidUtilities.showKeyboard(j0Var.E.r);
                        break;
                    }
                } else if (!j0Var.N) {
                    j0Var.v.d.g3.O(false);
                    j0Var.d.E(0);
                    break;
                } else {
                    j0Var.dismiss();
                    break;
                }
                break;
            case 9:
                ii.j0 j0Var2 = ((ii.e0) this.b).r;
                if (i10 != 2) {
                    if (i10 == 3) {
                        j0Var2.b.a(true, true);
                        j0Var2.setAllowNestedScroll(false);
                        TextUtils.isEmpty(j0Var2.R);
                        j0Var2.R = null;
                        j0Var2.F.h(0L, j0Var2.e, 0L, 0L, null, false, null, true);
                        j0Var2.y.r.getText().clear();
                        j0Var2.y.r.requestFocus();
                        AndroidUtilities.showKeyboard(j0Var2.y.r);
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", j0Var2.e);
                    j0Var2.s.presentFragment(new ii.o(bundle));
                    j0Var2.dismiss();
                    break;
                }
                break;
            case 10:
                ii.j0 j0Var3 = ((ii.i0) this.b).h;
                if (i10 == -1) {
                    j0Var3.v.d.g3.O(false);
                    j0Var3.d.E(0);
                    break;
                }
                break;
            case 11:
                jg.c cVar = (jg.c) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        cVar.Y();
                        break;
                    }
                } else if (cVar.onBackPressed(true)) {
                    cVar.finishFragment();
                    break;
                }
                break;
            case 12:
                jg.n nVar = (jg.n) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        nVar.i0();
                        break;
                    }
                } else if (nVar.onBackPressed(true)) {
                    nVar.finishFragment();
                    break;
                }
                break;
            case 13:
                jg.t0 t0Var = (jg.t0) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        t0Var.b0();
                        break;
                    }
                } else if (t0Var.onBackPressed(true)) {
                    t0Var.finishFragment();
                    break;
                }
                break;
            case 14:
                jg.v0 v0Var = (jg.v0) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        v0Var.Y();
                        break;
                    }
                } else if (v0Var.onBackPressed(true)) {
                    v0Var.finishFragment();
                    break;
                }
                break;
            case 15:
                d1 d1Var = (d1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        d1Var.X();
                        break;
                    }
                } else if (d1Var.onBackPressed(true)) {
                    d1Var.finishFragment();
                    break;
                }
                break;
            case 16:
                h1 h1Var = (h1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        h1Var.e0();
                        break;
                    }
                } else if (h1Var.onBackPressed(true)) {
                    h1Var.finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((j1) this.b).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((f2) this.b).finishFragment();
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
                    ((p4) this.b).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((t4) this.b).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((c6) this.b).finishFragment();
                    break;
                }
                break;
            case 25:
                c7 c7Var = (c7) this.b;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                c7.h0(c7Var, true);
                                break;
                            }
                        } else {
                            c7.h0(c7Var, false);
                            break;
                        }
                    } else {
                        c7.g0(c7Var);
                        break;
                    }
                } else {
                    r5Var = ((r2) c7Var).simpleActionBar;
                    if (!r5Var.o()) {
                        c7Var.finishFragment();
                        break;
                    } else {
                        ci.b bVar = c7Var.e0;
                        if (bVar != null) {
                            bVar.d();
                        }
                        m6 m6Var = c7Var.M;
                        if (m6Var != null) {
                            m6Var.f(false);
                            c7Var.M.e();
                            break;
                        }
                    }
                }
                break;
            case 26:
                n8 n8Var = (n8) this.b;
                if (i10 == -1) {
                    if (n8Var.P != 0 || n8Var.Q != 0 || n8Var.G) {
                        n8Var.G = false;
                        n8Var.P = 0;
                        n8Var.Q = 0;
                        n8Var.x0();
                        n8Var.q0();
                        break;
                    } else {
                        n8Var.finishFragment();
                        break;
                    }
                }
                break;
            case 27:
                o9 o9Var = (o9) this.b;
                if (i10 != -1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            o9.a0(o9Var, true);
                            break;
                        }
                    } else {
                        o9.a0(o9Var, false);
                        break;
                    }
                } else {
                    r5Var2 = ((r2) o9Var).simpleActionBar;
                    if (!r5Var2.o()) {
                        o9Var.finishFragment();
                        break;
                    } else {
                        o9Var.f0(true);
                        break;
                    }
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((y9) this.b).finishFragment();
                    break;
                }
                break;
            default:
                da daVar = (da) this.b;
                if (i10 != -1) {
                    if (i10 == 1 && daVar.a.getText().length() != 0) {
                        da.V(daVar);
                        daVar.finishFragment();
                        break;
                    }
                } else {
                    daVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
