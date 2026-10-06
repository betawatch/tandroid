package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class bd implements org.telegram.ui.ActionBar.d6 {
    public final /* synthetic */ cd a;

    public bd(cd cdVar) {
        this.a = cdVar;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final Paint H(String str) {
        return str.equals("paintDivider") ? this.a.y0 : org.telegram.ui.ActionBar.i6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final int H0(int i10) {
        cd cdVar = this.a;
        int indexOfKey = cdVar.r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return cdVar.r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.d6 d6Var = cdVar.q0;
        return d6Var != null ? d6Var.H0(i10) : org.telegram.ui.ActionBar.i6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final boolean a() {
        return this.a.J;
    }

    @Override // org.telegram.ui.ActionBar.d6
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
            drawable2.setColorFilter(H0(org.telegram.ui.ActionBar.i6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(H0(org.telegram.ui.ActionBar.i6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.d6 d6Var = cdVar.q0;
        return d6Var != null ? d6Var.getDrawable(str) : org.telegram.ui.ActionBar.i6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final int j0(int i10) {
        return H0(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final int j1(int i10) {
        return H0(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final /* synthetic */ boolean r0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.v3;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final /* synthetic */ void L0(int i10, int i11) {
    }
}
