package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class a8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a8(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                f8 f8Var = (f8) this.b;
                i8 i8Var = f8Var.y;
                if (f8Var.n != null && i8Var.H) {
                    int i7 = -1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < f8Var.d; i11++) {
                        g8 g8Var = (g8) f8Var.n.get(i11, null);
                        if (g8Var != null) {
                            if (i7 == -1) {
                                i7 = g8Var.h;
                            }
                            i10 = g8Var.h;
                        }
                    }
                    if (i7 >= 0 && i10 >= 0) {
                        i8Var.Q = i7;
                        i8Var.R = i10;
                        i8Var.B0();
                        i8Var.u0();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.gc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
            case 2:
                if (((a31) this.b).a.getImageReceiver().B() != null && !((a31) this.b).a.getImageReceiver().B().l0) {
                    ((a31) this.b).a.getImageReceiver().B().N(0, false, false);
                    ((a31) this.b).a.getImageReceiver().B().H(false);
                    break;
                }
                break;
            case 3:
                vf.c.t((Context) this.b, org.telegram.messenger.gd.M0(2131745020, null));
                break;
            default:
                ((y91) this.b).L0(true);
                break;
        }
    }
}
