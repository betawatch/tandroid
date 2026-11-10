package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mo0 b;

    public /* synthetic */ gn0(mo0 mo0Var, int i7) {
        this.a = i7;
        this.b = mo0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        mo0 mo0Var = this.b;
        switch (i7) {
            case 0:
                mo0Var.V0(true);
                break;
            case 1:
                mo0Var.Z1.a(!r7.a.q, true);
                mo0Var.a1();
                break;
            case 2:
                org.telegram.ui.ActionBar.g1 g1Var = mo0Var.E2;
                if (g1Var != null && g1Var.isShowing()) {
                    mo0Var.E2.d(true);
                }
                mo0Var.V0(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.g1 g1Var2 = mo0Var.E2;
                if (g1Var2 != null && g1Var2.isShowing()) {
                    mo0Var.E2.d(true);
                }
                mo0Var.V0(true);
                break;
            case 4:
                String[] strArr = mo0Var.j2;
                if (mo0Var.P1.m() == 0) {
                    if (mo0Var.i2 || strArr[0] != null) {
                        mo0Var.dismiss();
                        PhotoViewer.p1().z0(true, false);
                        if (strArr[0] != null || !mo0Var.g2) {
                            mo0Var.getContext();
                            mo0Var.M0();
                            break;
                        } else {
                            mo0Var.h2 = true;
                            Toast.makeText(mo0Var.getContext(), org.telegram.messenger.id.M0(2131748779, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                String[] strArr2 = mo0Var.j2;
                if (mo0Var.P1.m() == 0) {
                    if (mo0Var.i2 || strArr2[0] != null) {
                        mo0Var.dismiss();
                        if (strArr2[0] != null || !mo0Var.g2) {
                            mo0Var.getContext();
                            mo0Var.M0();
                            break;
                        } else {
                            mo0Var.h2 = true;
                            Toast.makeText(mo0Var.getContext(), org.telegram.messenger.id.M0(2131748779, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                String[] strArr3 = mo0Var.j2;
                if (mo0Var.P1.m() == 0) {
                    if (mo0Var.i2 || strArr3[0] != null) {
                        mo0Var.dismiss();
                        if (strArr3[0] != null || !mo0Var.g2) {
                            mo0Var.getContext();
                            mo0Var.M0();
                            break;
                        } else {
                            mo0Var.h2 = true;
                            Toast.makeText(mo0Var.getContext(), org.telegram.messenger.id.M0(2131748779, null), 0).show();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
