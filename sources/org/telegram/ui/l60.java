package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l60 implements org.telegram.messenger.h9, org.telegram.messenger.i9, org.telegram.messenger.cb, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.ob0, org.telegram.messenger.r10, org.telegram.ui.Components.du0, org.telegram.ui.ActionBar.r6, org.telegram.ui.ActionBar.s6 {
    public final /* synthetic */ int a;

    public /* synthetic */ l60(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.ui.ActionBar.s6
    public void d(int i7, View view) {
        org.telegram.ui.Wallet.f4 f4Var = (org.telegram.ui.Wallet.f4) view;
        ShapeDrawable shapeDrawable = f4Var.f0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i7);
            f4Var.f0.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.ActionBar.r6
    public int f(View view) {
        ShapeDrawable shapeDrawable = ((org.telegram.ui.Wallet.f4) view).f0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override // org.telegram.messenger.r10
    public Object g(Number number, Object obj) {
        return ((Integer) number).intValue() == 0 ? di.pb.b1(false, org.telegram.messenger.gd.H(',', "Stars", ((Integer) obj).intValue()), 0.66f, null) : org.telegram.messenger.gd.E(r4.intValue(), ',');
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 4:
                u1Var.dismiss();
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
                u1Var.dismiss();
                break;
            case 6:
                Drawable[] drawableArr = PhotoViewer.Z8;
                break;
            case 7:
                u1Var.dismiss();
                break;
            case 8:
                u1Var.dismiss();
                break;
            case 10:
                RectF rectF = ProfileActivity.Z6;
                u1Var.dismiss();
                break;
            case 11:
                u1Var.dismiss();
                break;
            case 17:
                u1Var.dismiss();
                break;
            case 20:
                u1Var.dismiss();
                break;
            case 21:
                u1Var.dismiss();
                break;
            case 22:
                u1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ob0
    public String i(int i7) {
        return i7 == 0 ? org.telegram.messenger.gd.M0(2131753797, null) : i7 == 1 ? org.telegram.messenger.gd.a0("AutoLockInTime", null, 2131753796, org.telegram.messenger.gd.G(1, "Minutes", new Object[0])) : i7 == 2 ? org.telegram.messenger.gd.a0("AutoLockInTime", null, 2131753796, org.telegram.messenger.gd.G(5, "Minutes", new Object[0])) : i7 == 3 ? org.telegram.messenger.gd.a0("AutoLockInTime", null, 2131753796, org.telegram.messenger.gd.G(1, "Hours", new Object[0])) : i7 == 4 ? org.telegram.messenger.gd.a0("AutoLockInTime", null, 2131753796, org.telegram.messenger.gd.G(5, "Hours", new Object[0])) : "";
    }

    @Override // org.telegram.ui.Components.du0
    public void k(int i7) {
        org.telegram.messenger.bz.b1 = i7;
        org.telegram.messenger.bz.y();
    }

    @Override // org.telegram.messenger.i9
    public Object m(Object obj) {
        String str = LaunchActivity.C1;
        return new me0();
    }

    @Override // org.telegram.messenger.h9
    public boolean run() {
        String str = LaunchActivity.C1;
        return org.telegram.messenger.bz.s.length() > 0 && !org.telegram.messenger.bz.A;
    }

    @Override // org.telegram.ui.Components.du0
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.messenger.cb
    public void onClick() {
    }
}
