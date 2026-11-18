package bi;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.ue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.zy0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class r1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.a5 a5Var;
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                if (i7 == -1) {
                    ((a2) obj).dismiss();
                    break;
                }
                break;
            case 1:
                if (i7 == -1) {
                    ((j3) obj).dismiss();
                    break;
                }
                break;
            case 2:
                if (i7 == -1) {
                    ((g8) obj).finishFragment();
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
                hi.e3 e3Var = (hi.e3) obj;
                if (i7 != -1) {
                    if (i7 >= 10) {
                        e3Var.e((ue) e3Var.h0.get(i7 - 10), false);
                        break;
                    }
                } else {
                    Runnable runnable = e3Var.W;
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
                kg.t0 t0Var = (kg.t0) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        t0Var.f0();
                        break;
                    }
                } else if (t0Var.onBackPressed(true)) {
                    t0Var.finishFragment();
                    break;
                }
                break;
            case 9:
                kg.v0 v0Var = (kg.v0) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        v0Var.c0();
                        break;
                    }
                } else if (v0Var.onBackPressed(true)) {
                    v0Var.finishFragment();
                    break;
                }
                break;
            case 10:
                kg.d1 d1Var = (kg.d1) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        d1Var.b0();
                        break;
                    }
                } else if (d1Var.onBackPressed(true)) {
                    d1Var.finishFragment();
                    break;
                }
                break;
            case 11:
                kg.f1 f1Var = (kg.f1) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        f1Var.i0();
                        break;
                    }
                } else if (f1Var.onBackPressed(true)) {
                    f1Var.finishFragment();
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
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.S = G;
                            u1Var.U = gd.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                            alertDialog$Builder.k(gd.M0(2131746126, null), new di.c7(this, 28));
                            alertDialog$Builder.h(gd.M0(2131752578, null), null);
                            t1Var.showDialog(u1Var);
                            break;
                        }
                    } else if (arrayList.size() == 1) {
                        int intValue = ((Integer) arrayList.get(0)).intValue();
                        i10 = ((org.telegram.ui.ActionBar.h2) t1Var).currentAccount;
                        kg.v1 c10 = kg.w1.f(i10).c(intValue);
                        if (c10 != null) {
                            Activity parentActivity = t1Var.getParentActivity();
                            i11 = ((org.telegram.ui.ActionBar.h2) t1Var).currentAccount;
                            i6Var = ((org.telegram.ui.ActionBar.h2) t1Var).resourceProvider;
                            kg.t1.i0(parentActivity, i11, null, c10, i6Var, new ai.y1(this, intValue, 3));
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
                    ((ki.r) obj).finishFragment();
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
                    a5Var = ((org.telegram.ui.ActionBar.h2) x6Var).simpleActionBar;
                    if (!a5Var.x()) {
                        x6Var.finishFragment();
                        break;
                    } else {
                        ei.c cVar2 = x6Var.e0;
                        if (cVar2 != null) {
                            cVar2.d();
                        }
                        org.telegram.ui.i6 i6Var2 = x6Var.N;
                        if (i6Var2 != null) {
                            i6Var2.f(false);
                            x6Var.N.e();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
