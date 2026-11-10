package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jo0 implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.w10, org.telegram.ui.Components.vt0, org.telegram.ui.ActionBar.q6, org.telegram.ui.ActionBar.r6 {
    public final /* synthetic */ int a;

    public /* synthetic */ jo0(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.ui.ActionBar.r6
    public void c(int i7, View view) {
        org.telegram.ui.Wallet.w3 w3Var = (org.telegram.ui.Wallet.w3) view;
        ShapeDrawable shapeDrawable = w3Var.e0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i7);
            w3Var.e0.invalidateSelf();
        }
    }

    @Override // org.telegram.messenger.w10
    public Object d(Number number, Object obj) {
        return ((Integer) number).intValue() == 0 ? bi.dd.a1(false, org.telegram.messenger.id.H(',', "Stars", ((Integer) obj).intValue()), 0.66f, null) : org.telegram.messenger.id.E(r4.intValue(), ',');
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                u1Var.dismiss();
                break;
            case 1:
                u1Var.dismiss();
                break;
            case 3:
                RectF rectF = ProfileActivity.V6;
                u1Var.dismiss();
                break;
            case 4:
                u1Var.dismiss();
                break;
            case 10:
                u1Var.dismiss();
                break;
            case 14:
                u1Var.dismiss();
                break;
            case 15:
                u1Var.dismiss();
                break;
            case 16:
                u1Var.dismiss();
                break;
            default:
                u1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q6
    public int i(View view) {
        ShapeDrawable shapeDrawable = ((org.telegram.ui.Wallet.w3) view).e0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.vt0
    public void m(int i7) {
        org.telegram.messenger.iz.b1 = i7;
        org.telegram.messenger.iz.y();
    }

    @Override // org.telegram.ui.Components.vt0
    public /* synthetic */ void n() {
    }
}
