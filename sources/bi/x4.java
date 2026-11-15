package bi;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import di.z6;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.ve;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.i8;
import org.telegram.ui.i9;
import org.telegram.ui.vy0;
import org.telegram.ui.y6;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class x4 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.w4 w4Var;
        org.telegram.ui.ActionBar.w4 w4Var2;
        int i12 = this.a;
        int i13 = 3;
        Object obj = this.b;
        switch (i12) {
            case 0:
                if (i7 == -1) {
                    ((a6) obj).finishFragment();
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
                if (i7 == -1) {
                    ((di.t) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                hi.d3 d3Var = (hi.d3) obj;
                if (i7 != -1) {
                    if (i7 >= 10) {
                        d3Var.e((ve) d3Var.h0.get(i7 - 10), false);
                        break;
                    }
                } else {
                    Runnable runnable = d3Var.W;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 4:
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
            case 5:
                kg.n nVar = (kg.n) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        nVar.m0();
                        break;
                    }
                } else if (nVar.onBackPressed(true)) {
                    nVar.finishFragment();
                    break;
                }
                break;
            case 6:
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
            case 7:
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
            case 8:
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
            case 9:
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
            case 10:
                if (i7 == -1) {
                    ((kg.e1) obj).finishFragment();
                    break;
                }
                break;
            case 11:
                kg.r1 r1Var = (kg.r1) obj;
                ArrayList arrayList = r1Var.b;
                if (i7 != -1) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, r1Var.getParentActivity(), r1Var.getResourceProvider());
                            String G = hd.G(arrayList.size(), "BusinessRepliesDeleteTitle", new Object[0]);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = G;
                            t1Var.U = hd.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                            alertDialog$Builder.k(hd.M0(2131746321, null), new z6(this, 27));
                            alertDialog$Builder.h(hd.M0(2131752589, null), null);
                            r1Var.showDialog(t1Var);
                            break;
                        }
                    } else if (arrayList.size() == 1) {
                        int intValue = ((Integer) arrayList.get(0)).intValue();
                        i10 = ((org.telegram.ui.ActionBar.e2) r1Var).currentAccount;
                        kg.u1 c10 = kg.v1.f(i10).c(intValue);
                        if (c10 != null) {
                            Activity parentActivity = r1Var.getParentActivity();
                            i11 = ((org.telegram.ui.ActionBar.e2) r1Var).currentAccount;
                            e6Var = ((org.telegram.ui.ActionBar.e2) r1Var).resourceProvider;
                            kg.r1.i0(parentActivity, i11, null, c10, e6Var, new ai.x1(this, intValue, i13));
                            break;
                        }
                    }
                } else if (!arrayList.isEmpty()) {
                    kg.r1.c0(r1Var);
                    break;
                } else {
                    r1Var.finishFragment();
                    break;
                }
                break;
            case 12:
                if (i7 == -1) {
                    ((kg.y1) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i7 == -1) {
                    ((ki.s) obj).finishFragment();
                    break;
                }
                break;
            case 14:
                if (i7 == -1) {
                    ((ki.j4) obj).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i7 == -1) {
                    ((li.e) obj).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i7 == -1) {
                    ((li.n) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i7 == -1) {
                    ((li.r) obj).finishFragment();
                    break;
                }
                break;
            case 18:
                li.d0 d0Var = ((li.y) obj).n;
                if (i7 != -1) {
                    if (i7 == 3) {
                        d0Var.n1.a(true, true);
                        d0Var.u0(false);
                        d0Var.N1 = null;
                        d0Var.B1.g3.O(true);
                        d0Var.z1.r.getText().clear();
                        d0Var.z1.r.requestFocus();
                        org.telegram.messenger.g0.J3(d0Var.z1.r);
                        break;
                    }
                } else if (!d0Var.I1) {
                    d0Var.v1.d.g3.O(false);
                    d0Var.o1.C(0);
                    break;
                } else {
                    d0Var.dismiss();
                    break;
                }
                break;
            case 19:
                li.d0 d0Var2 = ((li.z) obj).r;
                if (i7 != 2) {
                    if (i7 == 3) {
                        d0Var2.m1.a(true, true);
                        d0Var2.u0(false);
                        TextUtils.isEmpty(d0Var2.M1);
                        d0Var2.M1 = null;
                        d0Var2.A1.h(0L, d0Var2.p1, 0L, 0L, null, false, null, true);
                        d0Var2.y1.r.getText().clear();
                        d0Var2.y1.r.requestFocus();
                        org.telegram.messenger.g0.J3(d0Var2.y1.r);
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", d0Var2.p1);
                    d0Var2.u1.presentFragment(new li.n(bundle));
                    d0Var2.dismiss();
                    break;
                }
                break;
            case 20:
                li.d0 d0Var3 = ((li.y) obj).n;
                if (i7 == -1) {
                    d0Var3.v1.d.g3.O(false);
                    d0Var3.o1.C(0);
                    break;
                }
                break;
            case 21:
                if (i7 == -1) {
                    ((org.telegram.ui.g) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i7 == -1) {
                    ((org.telegram.ui.k) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i7 == -1) {
                    ((org.telegram.ui.o) obj).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i7 == -1) {
                    ((vy0) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i7 == -1) {
                    ((org.telegram.ui.p4) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                if (i7 == -1) {
                    ((org.telegram.ui.y5) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                y6 y6Var = (y6) obj;
                if (i7 != -1) {
                    if (i7 != 1) {
                        if (i7 != 3) {
                            if (i7 == 4) {
                                y6.l0(y6Var, true);
                                break;
                            }
                        } else {
                            y6.l0(y6Var, false);
                            break;
                        }
                    } else {
                        y6.k0(y6Var);
                        break;
                    }
                } else {
                    w4Var = ((org.telegram.ui.ActionBar.e2) y6Var).simpleActionBar;
                    if (!w4Var.v()) {
                        y6Var.finishFragment();
                        break;
                    } else {
                        ei.c cVar2 = y6Var.e0;
                        if (cVar2 != null) {
                            cVar2.d();
                        }
                        org.telegram.ui.j6 j6Var = y6Var.N;
                        if (j6Var != null) {
                            j6Var.f(false);
                            y6Var.N.e();
                            break;
                        }
                    }
                }
                break;
            case 28:
                i8 i8Var = (i8) obj;
                if (i7 == -1) {
                    if (i8Var.Q != 0 || i8Var.R != 0 || i8Var.H) {
                        i8Var.H = false;
                        i8Var.Q = 0;
                        i8Var.R = 0;
                        i8Var.B0();
                        i8Var.u0();
                        break;
                    } else {
                        i8Var.finishFragment();
                        break;
                    }
                }
                break;
            default:
                i9 i9Var = (i9) obj;
                if (i7 != -1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            i9.e0(i9Var, true);
                            break;
                        }
                    } else {
                        i9.e0(i9Var, false);
                        break;
                    }
                } else {
                    w4Var2 = ((org.telegram.ui.ActionBar.e2) i9Var).simpleActionBar;
                    if (!w4Var2.v()) {
                        i9Var.finishFragment();
                        break;
                    } else {
                        i9Var.j0(true);
                        break;
                    }
                }
                break;
        }
    }
}
