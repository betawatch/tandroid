// default package

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ji3 {
    public final /* synthetic */ cj3 a;

    public ji3(cj3 cj3Var) {
        this.a = cj3Var;
    }

    public final long a() {
        cj3 cj3Var = this.a;
        rh3 rh3Var = cj3Var.H3;
        if (rh3Var == null || !(rh3Var.getFragment() instanceof qvb)) {
            return 0L;
        }
        return -((qvb) cj3Var.H3.getFragment()).a;
    }

    public final void b() {
        cj3 cj3Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cj3Var.getParentActivity());
        mt9 mt9Var = cj3Var.D0.e0;
        boolean z = mt9Var.O;
        hd hdVar = alertDialog$Builder.a;
        if (z && mt9Var.O()) {
            hdVar.S = k96.M0(2131752047, null);
            mt9 mt9Var2 = cj3Var.D0.e0;
            ArrayList arrayList = mt9Var2.O ? mt9Var2.w0 : mt9Var2.v0;
            final byte b = 0;
            hdVar.U = k96.G(arrayList != null ? arrayList.size() : 0, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.j(k96.M0(2131752089, null), new ed(this) { // from class: ii3
                public final /* synthetic */ ji3 b;

                {
                    this.b = this;
                }

                @Override // ed
                public final void u(hd hdVar2, int i) {
                    byte b2 = b;
                    ji3 ji3Var = this.b;
                    switch (b2) {
                        case 0:
                            ji3Var.a.D0.e0.E();
                            break;
                        default:
                            cj3 cj3Var2 = ji3Var.a;
                            boolean O = cj3Var2.D0.e0.O();
                            hi3 hi3Var = cj3Var2.D0;
                            if (!O) {
                                mt9 mt9Var3 = hi3Var.e0;
                                mt9Var3.k0.c();
                                mt9Var3.K.clear();
                                mt9Var3.f();
                                break;
                            } else {
                                hi3Var.e0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            hdVar.S = k96.M0(2131752044, null);
            hdVar.U = k96.M0(2131752049, null);
            final byte b2 = 1;
            alertDialog$Builder.j(k96.M0(2131752087, null), new ed(this) { // from class: ii3
                public final /* synthetic */ ji3 b;

                {
                    this.b = this;
                }

                @Override // ed
                public final void u(hd hdVar2, int i) {
                    byte b22 = b2;
                    ji3 ji3Var = this.b;
                    switch (b22) {
                        case 0:
                            ji3Var.a.D0.e0.E();
                            break;
                        default:
                            cj3 cj3Var2 = ji3Var.a;
                            boolean O = cj3Var2.D0.e0.O();
                            hi3 hi3Var = cj3Var2.D0;
                            if (!O) {
                                mt9 mt9Var3 = hi3Var.e0;
                                mt9Var3.k0.c();
                                mt9Var3.K.clear();
                                mt9Var3.f();
                                break;
                            } else {
                                hi3Var.e0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        cj3Var.showDialog(hdVar);
        TextView textView = (TextView) hdVar.c(-1);
        if (textView != null) {
            zkb.X(textView, bkb.p7, cj3Var.getResourceProvider());
        }
    }

    public final void c() {
        hi3 hi3Var = this.a.D0;
        if (hi3Var != null) {
            t29 t29Var = hi3Var.g0;
            int i = hi3Var.V0;
            t29Var.b(i > 0 ? i + 1 : 0);
            hi3Var.V0 = hi3Var.e0.b();
        }
    }

    public final void d(boolean z, boolean z2) {
        cj3 cj3Var = this.a;
        if (cj3Var.D0.c0.getVisibility() == 0) {
            z2 = true;
        }
        if (cj3Var.l2 && cj3Var.m2) {
            hi3 hi3Var = cj3Var.D0;
            if (hi3Var.c0 != null) {
                if (z || hi3Var.e0.b() != 0) {
                    cj3Var.D0.c0.e(true, z2);
                } else {
                    cj3Var.D0.c0.e(false, z2);
                }
            }
        }
        if (z && cj3Var.D0.e0.b() == 0) {
            hi3 hi3Var2 = cj3Var.D0;
            hi3Var2.g0.a();
            hi3Var2.b0.invalidate();
            hi3Var2.V0 = 0;
        }
    }
}
