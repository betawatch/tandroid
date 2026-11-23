package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l60 implements org.telegram.messenger.h9, org.telegram.messenger.i9, org.telegram.messenger.cb, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.mb0, org.telegram.messenger.q10, org.telegram.ui.Components.fu0, org.telegram.ui.ActionBar.r6, org.telegram.ui.ActionBar.s6 {
    public final /* synthetic */ int a;

    public /* synthetic */ l60(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.q10
    public Object d(Number number, Object obj) {
        return ((Integer) number).intValue() == 0 ? di.pb.b1(false, org.telegram.messenger.gd.H(',', "Stars", ((Integer) obj).intValue()), 0.66f, null) : org.telegram.messenger.gd.E(r4.intValue(), ',');
    }

    @Override // org.telegram.ui.Components.mb0
    public String e(int i7) {
        return i7 == 0 ? org.telegram.messenger.gd.N0(2131753796, null) : i7 == 1 ? org.telegram.messenger.gd.a0("AutoLockInTime", null, 2131753795, org.telegram.messenger.gd.G(1, "Minutes", new Object[0])) : i7 == 2 ? org.telegram.messenger.gd.a0("AutoLockInTime", null, 2131753795, org.telegram.messenger.gd.G(5, "Minutes", new Object[0])) : i7 == 3 ? org.telegram.messenger.gd.a0("AutoLockInTime", null, 2131753795, org.telegram.messenger.gd.G(1, "Hours", new Object[0])) : i7 == 4 ? org.telegram.messenger.gd.a0("AutoLockInTime", null, 2131753795, org.telegram.messenger.gd.G(5, "Hours", new Object[0])) : "";
    }

    @Override // org.telegram.ui.ActionBar.s6
    public void g(int i7, View view) {
        org.telegram.ui.Wallet.g4 g4Var = (org.telegram.ui.Wallet.g4) view;
        ShapeDrawable shapeDrawable = g4Var.f0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i7);
            g4Var.f0.invalidateSelf();
        }
    }

    @Override // org.telegram.messenger.i9
    public Object h(Object obj) {
        String str = LaunchActivity.C1;
        return new le0();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
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
                Drawable[] drawableArr = PhotoViewer.f9;
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

    @Override // org.telegram.ui.ActionBar.r6
    public int k(View view) {
        ShapeDrawable shapeDrawable = ((org.telegram.ui.Wallet.g4) view).f0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.fu0
    public void n(int i7) {
        org.telegram.messenger.bz.b1 = i7;
        org.telegram.messenger.bz.y();
    }

    @Override // org.telegram.messenger.h9
    public boolean run() {
        String str = LaunchActivity.C1;
        return org.telegram.messenger.bz.s.length() > 0 && !org.telegram.messenger.bz.A;
    }

    @Override // org.telegram.ui.Components.fu0
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.messenger.cb
    public void onClick() {
    }
}
