package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ad implements org.telegram.ui.ActionBar.f6 {
    public final /* synthetic */ bd a;

    public ad(bd bdVar) {
        this.a = bdVar;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final Paint G(String str) {
        return str.equals("paintDivider") ? this.a.v0 : org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final boolean a() {
        return this.a.G;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int c0(int i10) {
        return x0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int g1(int i10) {
        return x0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final Drawable getDrawable(String str) {
        bd bdVar = this.a;
        Drawable drawable = bdVar.u0;
        Drawable drawable2 = bdVar.t0;
        if (str.equals("drawableMsgIn")) {
            return bdVar.p0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return bdVar.q0;
        }
        if (str.equals("drawableMsgOut")) {
            return bdVar.r0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return bdVar.s0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(x0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(x0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.f6 f6Var = bdVar.n0;
        return f6Var != null ? f6Var.getDrawable(str) : org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final void l(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final /* synthetic */ boolean m0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int x0(int i10) {
        bd bdVar = this.a;
        int indexOfKey = bdVar.o0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return bdVar.o0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = bdVar.n0;
        return f6Var != null ? f6Var.x0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final /* synthetic */ void K0(int i10, int i11) {
    }
}
