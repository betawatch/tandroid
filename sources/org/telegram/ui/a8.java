package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a8(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                f8 f8Var = (f8) this.b;
                i8 i8Var = f8Var.y;
                if (f8Var.n != null && i8Var.H) {
                    int i3 = -1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < f8Var.d; i11++) {
                        g8 g8Var = (g8) f8Var.n.get(i11, null);
                        if (g8Var != null) {
                            if (i3 == -1) {
                                i3 = g8Var.h;
                            }
                            i10 = g8Var.h;
                        }
                    }
                    if (i3 >= 0 && i10 >= 0) {
                        i8Var.Q = i3;
                        i8Var.R = i10;
                        i8Var.B0();
                        i8Var.u0();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.ac.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
            case 2:
                if (((p21) this.b).a.getImageReceiver().B() != null && !((p21) this.b).a.getImageReceiver().B().l0) {
                    ((p21) this.b).a.getImageReceiver().B().N(0, false, false);
                    ((p21) this.b).a.getImageReceiver().B().H(false);
                    break;
                }
                break;
            case 3:
                sf.c.t((Context) this.b, org.telegram.messenger.bd.M0(2131745265, null));
                break;
            default:
                ((m91) this.b).L0(true);
                break;
        }
    }
}
