package ai;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.pe;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.h9;
import org.telegram.ui.i8;
import org.telegram.ui.ny0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g5 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g5(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 3;
        Object obj = this.b;
        switch (i12) {
            case 0:
                if (i3 == -1) {
                    ((i6) obj).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i3 == -1) {
                    ((ci.v) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                dh.o oVar = (dh.o) obj;
                if (i3 == -1 && !oVar.d0(true)) {
                    oVar.finishFragment();
                    break;
                }
                break;
            case 3:
                gi.d3 d3Var = (gi.d3) obj;
                if (i3 != -1) {
                    if (i3 >= 10) {
                        d3Var.e((pe) d3Var.h0.get(i3 - 10), false);
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
                if (i3 == -1) {
                    ((ii.s) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i3 == -1) {
                    ((ii.p4) obj).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i3 == -1) {
                    ((ji.e) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i3 == -1) {
                    ((ji.n) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i3 == -1) {
                    ((ji.q) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                ji.b0 b0Var = ((ji.w) obj).n;
                if (i3 != -1) {
                    if (i3 == 3) {
                        b0Var.k1.a(true, true);
                        b0Var.u0(false);
                        b0Var.K1 = null;
                        b0Var.y1.g3.O(true);
                        b0Var.w1.r.getText().clear();
                        b0Var.w1.r.requestFocus();
                        org.telegram.messenger.g0.K3(b0Var.w1.r);
                        break;
                    }
                } else if (!b0Var.F1) {
                    b0Var.s1.d.g3.O(false);
                    b0Var.l1.D(0);
                    break;
                } else {
                    b0Var.dismiss();
                    break;
                }
                break;
            case 10:
                ji.b0 b0Var2 = ((ji.x) obj).r;
                if (i3 != 2) {
                    if (i3 == 3) {
                        b0Var2.j1.a(true, true);
                        b0Var2.u0(false);
                        TextUtils.isEmpty(b0Var2.J1);
                        b0Var2.J1 = null;
                        b0Var2.x1.h(0L, b0Var2.m1, 0L, 0L, null, false, null, true);
                        b0Var2.v1.r.getText().clear();
                        b0Var2.v1.r.requestFocus();
                        org.telegram.messenger.g0.K3(b0Var2.v1.r);
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", b0Var2.m1);
                    b0Var2.r1.presentFragment(new ji.n(bundle));
                    b0Var2.dismiss();
                    break;
                }
                break;
            case 11:
                ji.b0 b0Var3 = ((ji.w) obj).n;
                if (i3 == -1) {
                    b0Var3.s1.d.g3.O(false);
                    b0Var3.l1.D(0);
                    break;
                }
                break;
            case 12:
                lg.c cVar = (lg.c) obj;
                if (i3 != -1) {
                    if (i3 == 1) {
                        cVar.c0();
                        break;
                    }
                } else if (cVar.onBackPressed(true)) {
                    cVar.finishFragment();
                    break;
                }
                break;
            case 13:
                lg.m mVar = (lg.m) obj;
                if (i3 != -1) {
                    if (i3 == 1) {
                        mVar.m0();
                        break;
                    }
                } else if (mVar.onBackPressed(true)) {
                    mVar.finishFragment();
                    break;
                }
                break;
            case 14:
                lg.r0 r0Var = (lg.r0) obj;
                if (i3 != -1) {
                    if (i3 == 1) {
                        r0Var.f0();
                        break;
                    }
                } else if (r0Var.onBackPressed(true)) {
                    r0Var.finishFragment();
                    break;
                }
                break;
            case 15:
                lg.t0 t0Var = (lg.t0) obj;
                if (i3 != -1) {
                    if (i3 == 1) {
                        t0Var.c0();
                        break;
                    }
                } else if (t0Var.onBackPressed(true)) {
                    t0Var.finishFragment();
                    break;
                }
                break;
            case 16:
                lg.b1 b1Var = (lg.b1) obj;
                if (i3 != -1) {
                    if (i3 == 1) {
                        b1Var.b0();
                        break;
                    }
                } else if (b1Var.onBackPressed(true)) {
                    b1Var.finishFragment();
                    break;
                }
                break;
            case 17:
                lg.d1 d1Var = (lg.d1) obj;
                if (i3 != -1) {
                    if (i3 == 1) {
                        d1Var.i0();
                        break;
                    }
                } else if (d1Var.onBackPressed(true)) {
                    d1Var.finishFragment();
                    break;
                }
                break;
            case 18:
                if (i3 == -1) {
                    ((lg.f1) obj).finishFragment();
                    break;
                }
                break;
            case 19:
                lg.r1 r1Var = (lg.r1) obj;
                ArrayList arrayList = r1Var.b;
                if (i3 != -1) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, r1Var.getParentActivity(), r1Var.getResourceProvider());
                            String G = bd.G(arrayList.size(), "BusinessRepliesDeleteTitle", new Object[0]);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.S = G;
                            s1Var.U = bd.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                            alertDialog$Builder.k(bd.M0(2131746329, null), new l5.b(this, i14));
                            alertDialog$Builder.h(bd.M0(2131752589, null), null);
                            r1Var.showDialog(s1Var);
                            break;
                        }
                    } else if (arrayList.size() == 1) {
                        int intValue = ((Integer) arrayList.get(0)).intValue();
                        i10 = ((org.telegram.ui.ActionBar.d2) r1Var).currentAccount;
                        lg.t1 c2 = lg.u1.f(i10).c(intValue);
                        if (c2 != null) {
                            Activity parentActivity = r1Var.getParentActivity();
                            i11 = ((org.telegram.ui.ActionBar.d2) r1Var).currentAccount;
                            e6Var = ((org.telegram.ui.ActionBar.d2) r1Var).resourceProvider;
                            lg.r1.i0(parentActivity, i11, null, c2, e6Var, new gi.s3(this, intValue, i13));
                            break;
                        }
                    }
                } else if (!arrayList.isEmpty()) {
                    lg.r1.c0(r1Var);
                    break;
                } else {
                    r1Var.finishFragment();
                    break;
                }
                break;
            case 20:
                if (i3 == -1) {
                    ((lg.x1) obj).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i3 == -1) {
                    ((org.telegram.ui.g) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i3 == -1) {
                    ((org.telegram.ui.k) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i3 == -1) {
                    ((org.telegram.ui.o) obj).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i3 == -1) {
                    ((ny0) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i3 == -1) {
                    ((org.telegram.ui.r4) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                if (i3 == -1) {
                    ((org.telegram.ui.z5) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                org.telegram.ui.z6 z6Var = (org.telegram.ui.z6) obj;
                if (i3 != -1) {
                    if (i3 != 1) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                org.telegram.ui.z6.l0(z6Var, true);
                                break;
                            }
                        } else {
                            org.telegram.ui.z6.l0(z6Var, false);
                            break;
                        }
                    } else {
                        org.telegram.ui.z6.k0(z6Var);
                        break;
                    }
                } else {
                    y4Var = ((org.telegram.ui.ActionBar.d2) z6Var).simpleActionBar;
                    if (!y4Var.s()) {
                        z6Var.finishFragment();
                        break;
                    } else {
                        di.c cVar2 = z6Var.e0;
                        if (cVar2 != null) {
                            cVar2.d();
                        }
                        org.telegram.ui.k6 k6Var = z6Var.N;
                        if (k6Var != null) {
                            k6Var.f(false);
                            z6Var.N.e();
                            break;
                        }
                    }
                }
                break;
            case 28:
                i8 i8Var = (i8) obj;
                if (i3 == -1) {
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
                h9 h9Var = (h9) obj;
                if (i3 != -1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            h9.e0(h9Var, true);
                            break;
                        }
                    } else {
                        h9.e0(h9Var, false);
                        break;
                    }
                } else {
                    y4Var2 = ((org.telegram.ui.ActionBar.d2) h9Var).simpleActionBar;
                    if (!y4Var2.s()) {
                        h9Var.finishFragment();
                        break;
                    } else {
                        h9Var.j0(true);
                        break;
                    }
                }
                break;
        }
    }
}
