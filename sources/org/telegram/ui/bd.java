package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class bd implements org.telegram.ui.ActionBar.f6 {
    public final /* synthetic */ cd a;

    public bd(cd cdVar) {
        this.a = cdVar;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final Paint F(String str) {
        return str.equals("paintDivider") ? this.a.y0 : org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int F0(int i10) {
        cd cdVar = this.a;
        int indexOfKey = cdVar.r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return cdVar.r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = cdVar.q0;
        return f6Var != null ? f6Var.F0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final boolean a() {
        return this.a.J;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int e0(int i10) {
        return F0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int f1(int i10) {
        return F0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final Drawable getDrawable(String str) {
        cd cdVar = this.a;
        Drawable drawable = cdVar.x0;
        Drawable drawable2 = cdVar.w0;
        if (str.equals("drawableMsgIn")) {
            return cdVar.s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return cdVar.t0;
        }
        if (str.equals("drawableMsgOut")) {
            return cdVar.u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return cdVar.v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(F0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(F0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.f6 f6Var = cdVar.q0;
        return f6Var != null ? f6Var.getDrawable(str) : org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final /* synthetic */ boolean m0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final ColorFilter w() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final /* synthetic */ void L0(int i10, int i11) {
    }
}
