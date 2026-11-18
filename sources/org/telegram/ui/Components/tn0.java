package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo0 b;

    public /* synthetic */ tn0(yo0 yo0Var, int i7) {
        this.a = i7;
        this.b = yo0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        yo0 yo0Var = this.b;
        switch (i7) {
            case 0:
                yo0Var.W0(true);
                break;
            case 1:
                yo0Var.a2.a(!r7.a.q, true);
                yo0Var.b1();
                break;
            case 2:
                org.telegram.ui.ActionBar.h1 h1Var = yo0Var.F2;
                if (h1Var != null && h1Var.isShowing()) {
                    yo0Var.F2.d(true);
                }
                yo0Var.W0(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.h1 h1Var2 = yo0Var.F2;
                if (h1Var2 != null && h1Var2.isShowing()) {
                    yo0Var.F2.d(true);
                }
                yo0Var.W0(true);
                break;
            case 4:
                String[] strArr = yo0Var.k2;
                if (yo0Var.Q1.m() == 0) {
                    if (yo0Var.j2 || strArr[0] != null) {
                        yo0Var.dismiss();
                        PhotoViewer.p1().z0(true, false);
                        if (strArr[0] != null || !yo0Var.h2) {
                            yo0Var.getContext();
                            yo0Var.N0();
                            break;
                        } else {
                            yo0Var.i2 = true;
                            Toast.makeText(yo0Var.getContext(), org.telegram.messenger.gd.M0(2131748587, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                String[] strArr2 = yo0Var.k2;
                if (yo0Var.Q1.m() == 0) {
                    if (yo0Var.j2 || strArr2[0] != null) {
                        yo0Var.dismiss();
                        if (strArr2[0] != null || !yo0Var.h2) {
                            yo0Var.getContext();
                            yo0Var.N0();
                            break;
                        } else {
                            yo0Var.i2 = true;
                            Toast.makeText(yo0Var.getContext(), org.telegram.messenger.gd.M0(2131748587, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                String[] strArr3 = yo0Var.k2;
                if (yo0Var.Q1.m() == 0) {
                    if (yo0Var.j2 || strArr3[0] != null) {
                        yo0Var.dismiss();
                        if (strArr3[0] != null || !yo0Var.h2) {
                            yo0Var.getContext();
                            yo0Var.N0();
                            break;
                        } else {
                            yo0Var.i2 = true;
                            Toast.makeText(yo0Var.getContext(), org.telegram.messenger.gd.M0(2131748587, null), 0).show();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
