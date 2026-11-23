package bi;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.ue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.yy0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class w1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.z4 z4Var;
        int i12 = this.a;
        int i13 = 1;
        Object obj = this.b;
        switch (i12) {
            case 0:
                if (i7 == -1) {
                    ((f2) obj).dismiss();
                    break;
                }
                break;
            case 1:
                if (i7 == -1) {
                    ((p3) obj).dismiss();
                    break;
                }
                break;
            case 2:
                if (i7 == -1) {
                    ((m8) obj).finishFragment();
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
                hi.m3 m3Var = (hi.m3) obj;
                if (i7 != -1) {
                    if (i7 >= 10) {
                        m3Var.e((ue) m3Var.h0.get(i7 - 10), false);
                        break;
                    }
                } else {
                    Runnable runnable = m3Var.W;
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
                    ((kg.h1) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                kg.t1 t1Var = (kg.t1) obj;
                ArrayList arrayList = t1Var.b;
                if (i7 != -1) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, t1Var.getParentActivity(), t1Var.getResourceProvider());
                            String G = gd.G(arrayList.size(), "BusinessRepliesDeleteTitle", new Object[0]);
                            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                            t1Var2.S = G;
                            t1Var2.U = gd.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                            alertDialog$Builder.k(gd.N0(2131746125, null), new kg.f1(this, i13));
                            alertDialog$Builder.h(gd.N0(2131752577, null), null);
                            t1Var.showDialog(t1Var2);
                            break;
                        }
                    } else if (arrayList.size() == 1) {
                        int intValue = ((Integer) arrayList.get(0)).intValue();
                        i10 = ((org.telegram.ui.ActionBar.g2) t1Var).currentAccount;
                        kg.v1 c10 = kg.w1.f(i10).c(intValue);
                        if (c10 != null) {
                            Activity parentActivity = t1Var.getParentActivity();
                            i11 = ((org.telegram.ui.ActionBar.g2) t1Var).currentAccount;
                            i6Var = ((org.telegram.ui.ActionBar.g2) t1Var).resourceProvider;
                            kg.t1.i0(parentActivity, i11, null, c10, i6Var, new hi.a4(this, intValue, 2));
                            break;
                        }
                    }
                } else if (!arrayList.isEmpty()) {
                    kg.t1.c0(t1Var);
                    break;
                } else {
                    t1Var.finishFragment();
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
                    ((ki.e4) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i7 == -1) {
                    ((li.f) obj).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i7 == -1) {
                    ((li.o) obj).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i7 == -1) {
                    ((li.r) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                li.c0 c0Var = ((li.x) obj).n;
                if (i7 != -1) {
                    if (i7 == 3) {
                        c0Var.n1.a(true, true);
                        c0Var.u0(false);
                        c0Var.N1 = null;
                        c0Var.B1.g3.O(true);
                        c0Var.z1.r.getText().clear();
                        c0Var.z1.r.requestFocus();
                        org.telegram.messenger.g0.I3(c0Var.z1.r);
                        break;
                    }
                } else if (!c0Var.I1) {
                    c0Var.v1.d.g3.O(false);
                    c0Var.o1.C(0);
                    break;
                } else {
                    c0Var.dismiss();
                    break;
                }
                break;
            case 21:
                li.c0 c0Var2 = ((li.y) obj).r;
                if (i7 != 2) {
                    if (i7 == 3) {
                        c0Var2.m1.a(true, true);
                        c0Var2.u0(false);
                        TextUtils.isEmpty(c0Var2.M1);
                        c0Var2.M1 = null;
                        c0Var2.A1.h(0L, c0Var2.p1, 0L, 0L, null, false, null, true);
                        c0Var2.y1.r.getText().clear();
                        c0Var2.y1.r.requestFocus();
                        org.telegram.messenger.g0.I3(c0Var2.y1.r);
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", c0Var2.p1);
                    c0Var2.u1.presentFragment(new li.o(bundle));
                    c0Var2.dismiss();
                    break;
                }
                break;
            case 22:
                li.c0 c0Var3 = ((li.x) obj).n;
                if (i7 == -1) {
                    c0Var3.v1.d.g3.O(false);
                    c0Var3.o1.C(0);
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
                    ((yy0) obj).finishFragment();
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
                    ((org.telegram.ui.y5) obj).finishFragment();
                    break;
                }
                break;
            default:
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
                    z4Var = ((org.telegram.ui.ActionBar.g2) y6Var).simpleActionBar;
                    if (!z4Var.x()) {
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
        }
    }
}
