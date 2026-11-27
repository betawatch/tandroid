// default package

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class dj3 {
    public final /* synthetic */ uj3 a;

    public dj3(uj3 uj3Var) {
        this.a = uj3Var;
    }

    public final long a() {
        uj3 uj3Var = this.a;
        li3 li3Var = uj3Var.H3;
        if (li3Var == null || !(li3Var.getFragment() instanceof tzb)) {
            return 0L;
        }
        return -((tzb) uj3Var.H3.getFragment()).a;
    }

    public final void b() {
        uj3 uj3Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uj3Var.getParentActivity());
        gx9 gx9Var = uj3Var.D0.e0;
        boolean z = gx9Var.O;
        id idVar = alertDialog$Builder.a;
        if (z && gx9Var.O()) {
            idVar.S = ob6.M0(2131752024, null);
            gx9 gx9Var2 = uj3Var.D0.e0;
            ArrayList arrayList = gx9Var2.O ? gx9Var2.w0 : gx9Var2.v0;
            final byte b = 0;
            idVar.U = ob6.G(arrayList != null ? arrayList.size() : 0, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.j(ob6.M0(2131752066, null), new fd(this) { // from class: cj3
                public final /* synthetic */ dj3 b;

                {
                    this.b = this;
                }

                @Override // fd
                public final void w(id idVar2, int i) {
                    byte b2 = b;
                    dj3 dj3Var = this.b;
                    switch (b2) {
                        case 0:
                            dj3Var.a.D0.e0.E();
                            break;
                        default:
                            uj3 uj3Var2 = dj3Var.a;
                            boolean O = uj3Var2.D0.e0.O();
                            bj3 bj3Var = uj3Var2.D0;
                            if (!O) {
                                gx9 gx9Var3 = bj3Var.e0;
                                gx9Var3.k0.c();
                                gx9Var3.K.clear();
                                gx9Var3.f();
                                break;
                            } else {
                                bj3Var.e0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            idVar.S = ob6.M0(2131752021, null);
            idVar.U = ob6.M0(2131752026, null);
            final byte b2 = 1;
            alertDialog$Builder.j(ob6.M0(2131752064, null), new fd(this) { // from class: cj3
                public final /* synthetic */ dj3 b;

                {
                    this.b = this;
                }

                @Override // fd
                public final void w(id idVar2, int i) {
                    byte b22 = b2;
                    dj3 dj3Var = this.b;
                    switch (b22) {
                        case 0:
                            dj3Var.a.D0.e0.E();
                            break;
                        default:
                            uj3 uj3Var2 = dj3Var.a;
                            boolean O = uj3Var2.D0.e0.O();
                            bj3 bj3Var = uj3Var2.D0;
                            if (!O) {
                                gx9 gx9Var3 = bj3Var.e0;
                                gx9Var3.k0.c();
                                gx9Var3.K.clear();
                                gx9Var3.f();
                                break;
                            } else {
                                bj3Var.e0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        uj3Var.showDialog(idVar);
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, uj3Var.getResourceProvider());
        }
    }

    public final void c() {
        bj3 bj3Var = this.a.D0;
        if (bj3Var != null) {
            i69 i69Var = bj3Var.g0;
            int i = bj3Var.V0;
            i69Var.b(i > 0 ? i + 1 : 0);
            bj3Var.V0 = bj3Var.e0.b();
        }
    }

    public final void d(boolean z, boolean z2) {
        uj3 uj3Var = this.a;
        if (uj3Var.D0.c0.getVisibility() == 0) {
            z2 = true;
        }
        if (uj3Var.l2 && uj3Var.m2) {
            bj3 bj3Var = uj3Var.D0;
            if (bj3Var.c0 != null) {
                if (z || bj3Var.e0.b() != 0) {
                    uj3Var.D0.c0.e(true, z2);
                } else {
                    uj3Var.D0.c0.e(false, z2);
                }
            }
        }
        if (z && uj3Var.D0.e0.b() == 0) {
            bj3 bj3Var2 = uj3Var.D0;
            bj3Var2.g0.a();
            bj3Var2.b0.invalidate();
            bj3Var2.V0 = 0;
        }
    }
}
