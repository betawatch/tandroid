package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class gd implements org.telegram.ui.ActionBar.c6 {
    public final /* synthetic */ hd a;

    public gd(hd hdVar) {
        this.a = hdVar;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final int F0(int i10) {
        hd hdVar = this.a;
        int indexOfKey = hdVar.r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return hdVar.r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.c6 c6Var = hdVar.q0;
        return c6Var != null ? c6Var.F0(i10) : org.telegram.ui.ActionBar.g6.x0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final Paint G(String str) {
        return str.equals("paintDivider") ? this.a.y0 : org.telegram.ui.ActionBar.g6.T0(str);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final boolean a() {
        return this.a.J;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final int b0(int i10) {
        return F0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final int g1(int i10) {
        return F0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final Drawable getDrawable(String str) {
        hd hdVar = this.a;
        Drawable drawable = hdVar.x0;
        Drawable drawable2 = hdVar.w0;
        if (str.equals("drawableMsgIn")) {
            return hdVar.s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return hdVar.t0;
        }
        if (str.equals("drawableMsgOut")) {
            return hdVar.u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return hdVar.v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(F0(org.telegram.ui.ActionBar.g6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(F0(org.telegram.ui.ActionBar.g6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.c6 c6Var = hdVar.q0;
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
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.g6.v3;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void N0(int i10, int i11) {
    }
}
