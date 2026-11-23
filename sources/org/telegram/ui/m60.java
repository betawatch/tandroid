package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m60 implements org.telegram.messenger.i9, org.telegram.messenger.j9, org.telegram.messenger.db, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.pb0, org.telegram.messenger.s10, org.telegram.ui.Components.gu0, org.telegram.ui.ActionBar.q6, org.telegram.ui.ActionBar.r6 {
    public final /* synthetic */ int a;

    public /* synthetic */ m60(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.ui.ActionBar.r6
    public void d(int i7, View view) {
        org.telegram.ui.Wallet.f4 f4Var = (org.telegram.ui.Wallet.f4) view;
        ShapeDrawable shapeDrawable = f4Var.f0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i7);
            f4Var.f0.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.ActionBar.q6
    public int f(View view) {
        ShapeDrawable shapeDrawable = ((org.telegram.ui.Wallet.f4) view).f0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override // org.telegram.messenger.s10
    public Object g(Number number, Object obj) {
        return ((Integer) number).intValue() == 0 ? di.pb.b1(false, org.telegram.messenger.hd.H(',', "Stars", ((Integer) obj).intValue()), 0.66f, null) : org.telegram.messenger.hd.E(r4.intValue(), ',');
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 4:
                t1Var.dismiss();
                break;
            case 5:
            case 9:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            default:
                t1Var.dismiss();
                break;
            case 6:
                Drawable[] drawableArr = PhotoViewer.Z8;
                break;
            case 7:
                t1Var.dismiss();
                break;
            case 8:
                t1Var.dismiss();
                break;
            case 10:
                RectF rectF = ProfileActivity.Z6;
                t1Var.dismiss();
                break;
            case 11:
                t1Var.dismiss();
                break;
            case 17:
                t1Var.dismiss();
                break;
            case 20:
                t1Var.dismiss();
                break;
            case 21:
                t1Var.dismiss();
                break;
            case 22:
                t1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.pb0
    public String i(int i7) {
        return i7 == 0 ? org.telegram.messenger.hd.N0(2131753796, null) : i7 == 1 ? org.telegram.messenger.hd.a0("AutoLockInTime", null, 2131753795, org.telegram.messenger.hd.G(1, "Minutes", new Object[0])) : i7 == 2 ? org.telegram.messenger.hd.a0("AutoLockInTime", null, 2131753795, org.telegram.messenger.hd.G(5, "Minutes", new Object[0])) : i7 == 3 ? org.telegram.messenger.hd.a0("AutoLockInTime", null, 2131753795, org.telegram.messenger.hd.G(1, "Hours", new Object[0])) : i7 == 4 ? org.telegram.messenger.hd.a0("AutoLockInTime", null, 2131753795, org.telegram.messenger.hd.G(5, "Hours", new Object[0])) : "";
    }

    @Override // org.telegram.ui.Components.gu0
    public void k(int i7) {
        org.telegram.messenger.cz.b1 = i7;
        org.telegram.messenger.cz.y();
    }

    @Override // org.telegram.messenger.j9
    public Object m(Object obj) {
        String str = LaunchActivity.C1;
        return new me0();
    }

    @Override // org.telegram.messenger.i9
    public boolean run() {
        String str = LaunchActivity.C1;
        return org.telegram.messenger.cz.s.length() > 0 && !org.telegram.messenger.cz.A;
    }

    @Override // org.telegram.ui.Components.gu0
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.messenger.db
    public void onClick() {
    }
}
