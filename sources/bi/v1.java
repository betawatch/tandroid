package bi;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.ue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.zy0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class v1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.z4 z4Var;
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                if (i7 == -1) {
                    ((e2) obj).dismiss();
                    break;
                }
                break;
            case 1:
                if (i7 == -1) {
                    ((n3) obj).dismiss();
                    break;
                }
                break;
            case 2:
                if (i7 == -1) {
                    ((k8) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                ch.p pVar = (ch.p) obj;
                if (i7 == -1 && !pVar.d0(true)) {
                    pVar.finishFragment();
                    break;
                }
                break;
            case 4:
                if (i7 == -1) {
                    ((di.t) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                hi.d3 d3Var = (hi.d3) obj;
                if (i7 != -1) {
                    if (i7 >= 10) {
                        d3Var.e((ue) d3Var.h0.get(i7 - 10), false);
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
            case 6:
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
            case 7:
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
            case 8:
                kg.s0 s0Var = (kg.s0) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        s0Var.f0();
                        break;
                    }
                } else if (s0Var.onBackPressed(true)) {
                    s0Var.finishFragment();
                    break;
                }
                break;
            case 9:
                kg.u0 u0Var = (kg.u0) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        u0Var.c0();
                        break;
                    }
                } else if (u0Var.onBackPressed(true)) {
                    u0Var.finishFragment();
                    break;
                }
                break;
            case 10:
                kg.c1 c1Var = (kg.c1) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        c1Var.b0();
                        break;
                    }
                } else if (c1Var.onBackPressed(true)) {
                    c1Var.finishFragment();
                    break;
                }
                break;
            case 11:
                kg.e1 e1Var = (kg.e1) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        e1Var.i0();
                        break;
                    }
                } else if (e1Var.onBackPressed(true)) {
                    e1Var.finishFragment();
                    break;
                }
                break;
            case 12:
                if (i7 == -1) {
                    ((kg.g1) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                kg.s1 s1Var = (kg.s1) obj;
                ArrayList arrayList = s1Var.b;
                if (i7 != -1) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, s1Var.getParentActivity(), s1Var.getResourceProvider());
                            String G = gd.G(arrayList.size(), "BusinessRepliesDeleteTitle", new Object[0]);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = G;
                            t1Var.U = gd.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                            alertDialog$Builder.k(gd.N0(2131746125, null), new di.v6(this, 29));
                            alertDialog$Builder.h(gd.N0(2131752577, null), null);
                            s1Var.showDialog(t1Var);
                            break;
                        }
                    } else if (arrayList.size() == 1) {
                        int intValue = ((Integer) arrayList.get(0)).intValue();
                        i10 = ((org.telegram.ui.ActionBar.g2) s1Var).currentAccount;
                        kg.u1 c10 = kg.v1.f(i10).c(intValue);
                        if (c10 != null) {
                            Activity parentActivity = s1Var.getParentActivity();
                            i11 = ((org.telegram.ui.ActionBar.g2) s1Var).currentAccount;
                            h6Var = ((org.telegram.ui.ActionBar.g2) s1Var).resourceProvider;
                            kg.s1.i0(parentActivity, i11, null, c10, h6Var, new ai.a2(this, intValue, 3));
                            break;
                        }
                    }
                } else if (!arrayList.isEmpty()) {
                    kg.s1.c0(s1Var);
                    break;
                } else {
                    s1Var.finishFragment();
                    break;
                }
                break;
            case 14:
                if (i7 == -1) {
                    ((kg.y1) obj).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i7 == -1) {
                    ((ki.q) obj).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i7 == -1) {
                    ((ki.d4) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i7 == -1) {
                    ((li.g) obj).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i7 == -1) {
                    ((li.p) obj).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i7 == -1) {
                    ((li.s) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                li.d0 d0Var = ((li.y) obj).n;
                if (i7 != -1) {
                    if (i7 == 3) {
                        d0Var.n1.a(true, true);
                        d0Var.u0(false);
                        d0Var.N1 = null;
                        d0Var.B1.g3.O(true);
                        d0Var.z1.r.getText().clear();
                        d0Var.z1.r.requestFocus();
                        org.telegram.messenger.g0.I3(d0Var.z1.r);
                        break;
                    }
                } else if (!d0Var.I1) {
                    d0Var.v1.d.g3.O(false);
                    d0Var.o1.A(0);
                    break;
                } else {
                    d0Var.dismiss();
                    break;
                }
                break;
            case 21:
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
                        org.telegram.messenger.g0.I3(d0Var2.y1.r);
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", d0Var2.p1);
                    d0Var2.u1.presentFragment(new li.p(bundle));
                    d0Var2.dismiss();
                    break;
                }
                break;
            case 22:
                li.d0 d0Var3 = ((li.y) obj).n;
                if (i7 == -1) {
                    d0Var3.v1.d.g3.O(false);
                    d0Var3.o1.A(0);
                    break;
                }
                break;
            case 23:
                if (i7 == -1) {
                    ((org.telegram.ui.g) obj).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i7 == -1) {
                    ((org.telegram.ui.k) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i7 == -1) {
                    ((org.telegram.ui.o) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                if (i7 == -1) {
                    ((zy0) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                if (i7 == -1) {
                    ((org.telegram.ui.p4) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i7 == -1) {
                    ((org.telegram.ui.x5) obj).finishFragment();
                    break;
                }
                break;
            default:
                org.telegram.ui.x6 x6Var = (org.telegram.ui.x6) obj;
                if (i7 != -1) {
                    if (i7 != 1) {
                        if (i7 != 3) {
                            if (i7 == 4) {
                                org.telegram.ui.x6.l0(x6Var, true);
                                break;
                            }
                        } else {
                            org.telegram.ui.x6.l0(x6Var, false);
                            break;
                        }
                    } else {
                        org.telegram.ui.x6.k0(x6Var);
                        break;
                    }
                } else {
                    z4Var = ((org.telegram.ui.ActionBar.g2) x6Var).simpleActionBar;
                    if (!z4Var.x()) {
                        x6Var.finishFragment();
                        break;
                    } else {
                        ei.c cVar2 = x6Var.e0;
                        if (cVar2 != null) {
                            cVar2.d();
                        }
                        org.telegram.ui.i6 i6Var = x6Var.N;
                        if (i6Var != null) {
                            i6Var.f(false);
                            x6Var.N.e();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
