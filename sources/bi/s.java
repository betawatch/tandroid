package bi;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.we;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.xy0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class s extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        int i12 = this.a;
        int i13 = 2;
        Object obj = this.b;
        switch (i12) {
            case 0:
                if (i7 == -1) {
                    ((z) obj).finishFragment();
                    break;
                }
                break;
            case 1:
                ch.o oVar = (ch.o) obj;
                if (i7 == -1 && !oVar.d0(true)) {
                    oVar.finishFragment();
                    break;
                }
                break;
            case 2:
                fi.f3 f3Var = (fi.f3) obj;
                if (i7 != -1) {
                    if (i7 >= 10) {
                        f3Var.e((we) f3Var.g0.get(i7 - 10), false);
                        break;
                    }
                } else {
                    Runnable runnable = f3Var.V;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 3:
                if (i7 == -1) {
                    ((hi.q) obj).finishFragment();
                    break;
                }
                break;
            case 4:
                if (i7 == -1) {
                    ((hi.p4) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i7 == -1) {
                    ((ii.f) obj).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i7 == -1) {
                    ((ii.p) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i7 == -1) {
                    ((ii.s) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                ii.d0 d0Var = ((ii.y) obj).n;
                if (i7 != -1) {
                    if (i7 == 3) {
                        d0Var.j1.a(true, true);
                        d0Var.u0(false);
                        d0Var.J1 = null;
                        d0Var.x1.f3.O(true);
                        d0Var.v1.r.getText().clear();
                        d0Var.v1.r.requestFocus();
                        org.telegram.messenger.g0.K3(d0Var.v1.r);
                        break;
                    }
                } else if (!d0Var.E1) {
                    d0Var.r1.d.f3.O(false);
                    d0Var.k1.E(0);
                    break;
                } else {
                    d0Var.dismiss();
                    break;
                }
                break;
            case 9:
                ii.d0 d0Var2 = ((ii.z) obj).r;
                if (i7 != 2) {
                    if (i7 == 3) {
                        d0Var2.i1.a(true, true);
                        d0Var2.u0(false);
                        TextUtils.isEmpty(d0Var2.I1);
                        d0Var2.I1 = null;
                        d0Var2.w1.h(0L, d0Var2.l1, 0L, 0L, null, false, null, true);
                        d0Var2.u1.r.getText().clear();
                        d0Var2.u1.r.requestFocus();
                        org.telegram.messenger.g0.K3(d0Var2.u1.r);
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", d0Var2.l1);
                    d0Var2.q1.presentFragment(new ii.p(bundle));
                    d0Var2.dismiss();
                    break;
                }
                break;
            case 10:
                ii.d0 d0Var3 = ((ii.y) obj).n;
                if (i7 == -1) {
                    d0Var3.r1.d.f3.O(false);
                    d0Var3.k1.E(0);
                    break;
                }
                break;
            case 11:
                kg.c cVar = (kg.c) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        cVar.c0();
                        break;
                    }
                } else if (cVar.onBackPressed(true)) {
                    cVar.finishFragment();
                    break;
                }
                break;
            case 12:
                kg.m mVar = (kg.m) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        mVar.m0();
                        break;
                    }
                } else if (mVar.onBackPressed(true)) {
                    mVar.finishFragment();
                    break;
                }
                break;
            case 13:
                kg.q0 q0Var = (kg.q0) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        q0Var.f0();
                        break;
                    }
                } else if (q0Var.onBackPressed(true)) {
                    q0Var.finishFragment();
                    break;
                }
                break;
            case 14:
                kg.s0 s0Var = (kg.s0) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        s0Var.c0();
                        break;
                    }
                } else if (s0Var.onBackPressed(true)) {
                    s0Var.finishFragment();
                    break;
                }
                break;
            case 15:
                kg.a1 a1Var = (kg.a1) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        a1Var.b0();
                        break;
                    }
                } else if (a1Var.onBackPressed(true)) {
                    a1Var.finishFragment();
                    break;
                }
                break;
            case 16:
                kg.c1 c1Var = (kg.c1) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        c1Var.i0();
                        break;
                    }
                } else if (c1Var.onBackPressed(true)) {
                    c1Var.finishFragment();
                    break;
                }
                break;
            case 17:
                if (i7 == -1) {
                    ((kg.e1) obj).finishFragment();
                    break;
                }
                break;
            case 18:
                kg.q1 q1Var = (kg.q1) obj;
                ArrayList arrayList = q1Var.b;
                if (i7 != -1) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, q1Var.getParentActivity(), q1Var.getResourceProvider());
                            String G = org.telegram.messenger.id.G(arrayList.size(), "BusinessRepliesDeleteTitle", new Object[0]);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.R = G;
                            u1Var.T = org.telegram.messenger.id.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746322, null), new di.q4(this, 26));
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            q1Var.showDialog(u1Var);
                            break;
                        }
                    } else if (arrayList.size() == 1) {
                        int intValue = ((Integer) arrayList.get(0)).intValue();
                        i10 = ((org.telegram.ui.ActionBar.f2) q1Var).currentAccount;
                        kg.s1 c10 = kg.t1.f(i10).c(intValue);
                        if (c10 != null) {
                            Activity parentActivity = q1Var.getParentActivity();
                            i11 = ((org.telegram.ui.ActionBar.f2) q1Var).currentAccount;
                            f6Var = ((org.telegram.ui.ActionBar.f2) q1Var).resourceProvider;
                            kg.q1.i0(parentActivity, i11, null, c10, f6Var, new fi.t3(this, intValue, i13));
                            break;
                        }
                    }
                } else if (!arrayList.isEmpty()) {
                    kg.q1.c0(q1Var);
                    break;
                } else {
                    q1Var.finishFragment();
                    break;
                }
                break;
            case 19:
                if (i7 == -1) {
                    ((kg.w1) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i7 == -1) {
                    ((org.telegram.ui.g) obj).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i7 == -1) {
                    ((org.telegram.ui.k) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i7 == -1) {
                    ((org.telegram.ui.o) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i7 == -1) {
                    ((xy0) obj).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i7 == -1) {
                    ((org.telegram.ui.p4) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i7 == -1) {
                    ((org.telegram.ui.x5) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.y6 y6Var = (org.telegram.ui.y6) obj;
                if (i7 != -1) {
                    if (i7 != 1) {
                        if (i7 != 3) {
                            if (i7 == 4) {
                                org.telegram.ui.y6.l0(y6Var, true);
                                break;
                            }
                        } else {
                            org.telegram.ui.y6.l0(y6Var, false);
                            break;
                        }
                    } else {
                        org.telegram.ui.y6.k0(y6Var);
                        break;
                    }
                } else {
                    y4Var = ((org.telegram.ui.ActionBar.f2) y6Var).simpleActionBar;
                    if (!y4Var.s()) {
                        y6Var.finishFragment();
                        break;
                    } else {
                        ci.c cVar2 = y6Var.d0;
                        if (cVar2 != null) {
                            cVar2.d();
                        }
                        org.telegram.ui.i6 i6Var = y6Var.M;
                        if (i6Var != null) {
                            i6Var.f(false);
                            y6Var.M.e();
                            break;
                        }
                    }
                }
                break;
            case 27:
                org.telegram.ui.h8 h8Var = (org.telegram.ui.h8) obj;
                if (i7 == -1) {
                    if (h8Var.P != 0 || h8Var.Q != 0 || h8Var.G) {
                        h8Var.G = false;
                        h8Var.P = 0;
                        h8Var.Q = 0;
                        h8Var.B0();
                        h8Var.u0();
                        break;
                    } else {
                        h8Var.finishFragment();
                        break;
                    }
                }
                break;
            case 28:
                org.telegram.ui.i9 i9Var = (org.telegram.ui.i9) obj;
                if (i7 != -1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            org.telegram.ui.i9.e0(i9Var, true);
                            break;
                        }
                    } else {
                        org.telegram.ui.i9.e0(i9Var, false);
                        break;
                    }
                } else {
                    y4Var2 = ((org.telegram.ui.ActionBar.f2) i9Var).simpleActionBar;
                    if (!y4Var2.s()) {
                        i9Var.finishFragment();
                        break;
                    } else {
                        i9Var.j0(true);
                        break;
                    }
                }
                break;
            default:
                if (i7 == -1) {
                    ((org.telegram.ui.s9) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
