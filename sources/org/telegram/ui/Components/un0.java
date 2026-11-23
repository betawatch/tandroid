package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class un0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zo0 b;

    public /* synthetic */ un0(zo0 zo0Var, int i7) {
        this.a = i7;
        this.b = zo0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        zo0 zo0Var = this.b;
        switch (i7) {
            case 0:
                zo0Var.W0(true);
                break;
            case 1:
                zo0Var.a2.a(!r7.a.q, true);
                zo0Var.b1();
                break;
            case 2:
                org.telegram.ui.ActionBar.g1 g1Var = zo0Var.F2;
                if (g1Var != null && g1Var.isShowing()) {
                    zo0Var.F2.d(true);
                }
                zo0Var.W0(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.g1 g1Var2 = zo0Var.F2;
                if (g1Var2 != null && g1Var2.isShowing()) {
                    zo0Var.F2.d(true);
                }
                zo0Var.W0(true);
                break;
            case 4:
                String[] strArr = zo0Var.k2;
                if (zo0Var.Q1.m() == 0) {
                    if (zo0Var.j2 || strArr[0] != null) {
                        zo0Var.dismiss();
                        PhotoViewer.p1().z0(true, false);
                        if (strArr[0] != null || !zo0Var.h2) {
                            zo0Var.getContext();
                            zo0Var.N0();
                            break;
                        } else {
                            zo0Var.i2 = true;
                            Toast.makeText(zo0Var.getContext(), org.telegram.messenger.gd.N0(2131748586, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                String[] strArr2 = zo0Var.k2;
                if (zo0Var.Q1.m() == 0) {
                    if (zo0Var.j2 || strArr2[0] != null) {
                        zo0Var.dismiss();
                        if (strArr2[0] != null || !zo0Var.h2) {
                            zo0Var.getContext();
                            zo0Var.N0();
                            break;
                        } else {
                            zo0Var.i2 = true;
                            Toast.makeText(zo0Var.getContext(), org.telegram.messenger.gd.N0(2131748586, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                String[] strArr3 = zo0Var.k2;
                if (zo0Var.Q1.m() == 0) {
                    if (zo0Var.j2 || strArr3[0] != null) {
                        zo0Var.dismiss();
                        if (strArr3[0] != null || !zo0Var.h2) {
                            zo0Var.getContext();
                            zo0Var.N0();
                            break;
                        } else {
                            zo0Var.i2 = true;
                            Toast.makeText(zo0Var.getContext(), org.telegram.messenger.gd.N0(2131748586, null), 0).show();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
