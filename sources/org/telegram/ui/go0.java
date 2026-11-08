package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class go0 implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.w10, org.telegram.ui.Components.ut0, org.telegram.ui.ActionBar.o6, org.telegram.ui.ActionBar.p6 {
    public final /* synthetic */ int a;

    public /* synthetic */ go0(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public void c(int i7, View view) {
        org.telegram.ui.Wallet.v3 v3Var = (org.telegram.ui.Wallet.v3) view;
        ShapeDrawable shapeDrawable = v3Var.e0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i7);
            v3Var.e0.invalidateSelf();
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
                RectF rectF = ProfileActivity.S6;
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

    @Override // org.telegram.ui.ActionBar.o6
    public int i(View view) {
        ShapeDrawable shapeDrawable = ((org.telegram.ui.Wallet.v3) view).e0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.ut0
    public void m(int i7) {
        org.telegram.messenger.iz.b1 = i7;
        org.telegram.messenger.iz.y();
    }

    @Override // org.telegram.ui.Components.ut0
    public /* synthetic */ void n() {
    }
}
