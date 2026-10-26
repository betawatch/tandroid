package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ad implements org.telegram.ui.ActionBar.u6 {
    public final /* synthetic */ bd a;

    public ad(bd bdVar) {
        this.a = bdVar;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final boolean a() {
        return this.a.J;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final void b(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.y6.v3;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final Paint d(String str) {
        return str.equals("paintDivider") ? this.a.y0 : org.telegram.ui.ActionBar.y6.U0(str);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int e(int i10) {
        return g(i10);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int g(int i10) {
        bd bdVar = this.a;
        int indexOfKey = bdVar.r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return bdVar.r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.u6 u6Var = bdVar.q0;
        return u6Var != null ? u6Var.g(i10) : org.telegram.ui.ActionBar.y6.x0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final Drawable getDrawable(String str) {
        bd bdVar = this.a;
        Drawable drawable = bdVar.x0;
        Drawable drawable2 = bdVar.w0;
        if (str.equals("drawableMsgIn")) {
            return bdVar.s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return bdVar.t0;
        }
        if (str.equals("drawableMsgOut")) {
            return bdVar.u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return bdVar.v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(g(org.telegram.ui.ActionBar.y6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(g(org.telegram.ui.ActionBar.y6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.u6 u6Var = bdVar.q0;
        return u6Var != null ? u6Var.getDrawable(str) : org.telegram.ui.ActionBar.y6.Q0(str);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int i(int i10) {
        return g(i10);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final /* synthetic */ void h(int i10, int i11) {
    }
}
