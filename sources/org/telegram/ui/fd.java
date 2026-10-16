package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class fd implements org.telegram.ui.ActionBar.c6 {
    public final /* synthetic */ gd a;

    public fd(gd gdVar) {
        this.a = gdVar;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final int E0(int i10) {
        gd gdVar = this.a;
        int indexOfKey = gdVar.r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return gdVar.r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.c6 c6Var = gdVar.q0;
        return c6Var != null ? c6Var.E0(i10) : org.telegram.ui.ActionBar.g6.x0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final Paint F(String str) {
        return str.equals("paintDivider") ? this.a.y0 : org.telegram.ui.ActionBar.g6.T0(str);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final boolean a() {
        return this.a.J;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final int b0(int i10) {
        return E0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final int f1(int i10) {
        return E0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final Drawable getDrawable(String str) {
        gd gdVar = this.a;
        Drawable drawable = gdVar.x0;
        Drawable drawable2 = gdVar.w0;
        if (str.equals("drawableMsgIn")) {
            return gdVar.s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return gdVar.t0;
        }
        if (str.equals("drawableMsgOut")) {
            return gdVar.u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return gdVar.v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(E0(org.telegram.ui.ActionBar.g6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(E0(org.telegram.ui.ActionBar.g6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.c6 c6Var = gdVar.q0;
        return c6Var != null ? c6Var.getDrawable(str) : org.telegram.ui.ActionBar.g6.P0(str);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ boolean m0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final ColorFilter w() {
        return org.telegram.ui.ActionBar.g6.v3;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void M0(int i10, int i11) {
    }
}
