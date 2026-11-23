package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class b8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b8(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                g8 g8Var = (g8) this.b;
                j8 j8Var = g8Var.y;
                if (g8Var.n != null && j8Var.H) {
                    int i7 = -1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < g8Var.d; i11++) {
                        h8 h8Var = (h8) g8Var.n.get(i11, null);
                        if (h8Var != null) {
                            if (i7 == -1) {
                                i7 = h8Var.h;
                            }
                            i10 = h8Var.h;
                        }
                    }
                    if (i7 >= 0 && i10 >= 0) {
                        j8Var.Q = i7;
                        j8Var.R = i10;
                        j8Var.B0();
                        j8Var.u0();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.fc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
            case 2:
                if (((z21) this.b).a.getImageReceiver().C() != null && !((z21) this.b).a.getImageReceiver().C().l0) {
                    ((z21) this.b).a.getImageReceiver().C().N(0, false, false);
                    ((z21) this.b).a.getImageReceiver().C().H(false);
                    break;
                }
                break;
            case 3:
                vf.c.t((Context) this.b, org.telegram.messenger.gd.N0(2131745014, null));
                break;
            default:
                ((w91) this.b).L0(true);
                break;
        }
    }
}
