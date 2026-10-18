package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class cd implements org.telegram.ui.ActionBar.d6 {
    public final /* synthetic */ dd a;

    public cd(dd ddVar) {
        this.a = ddVar;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final int I(int i10) {
        return u(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final boolean a() {
        return this.a.J;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final void d(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final Drawable getDrawable(String str) {
        dd ddVar = this.a;
        Drawable drawable = ddVar.x0;
        Drawable drawable2 = ddVar.w0;
        if (str.equals("drawableMsgIn")) {
            return ddVar.s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return ddVar.t0;
        }
        if (str.equals("drawableMsgOut")) {
            return ddVar.u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return ddVar.v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(u(org.telegram.ui.ActionBar.h6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(u(org.telegram.ui.ActionBar.h6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.d6 d6Var = ddVar.q0;
        return d6Var != null ? d6Var.getDrawable(str) : org.telegram.ui.ActionBar.h6.P0(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final ColorFilter j() {
        return org.telegram.ui.ActionBar.h6.v3;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final Paint n(String str) {
        return str.equals("paintDivider") ? this.a.y0 : org.telegram.ui.ActionBar.h6.T0(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final int r(int i10) {
        return u(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final /* synthetic */ boolean s() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final int u(int i10) {
        dd ddVar = this.a;
        int indexOfKey = ddVar.r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return ddVar.r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.d6 d6Var = ddVar.q0;
        return d6Var != null ? d6Var.u(i10) : org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final /* synthetic */ void B(int i10, int i11) {
    }
}
