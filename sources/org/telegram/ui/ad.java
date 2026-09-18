package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ad implements org.telegram.ui.ActionBar.e6 {
    public final /* synthetic */ bd a;

    public ad(bd bdVar) {
        this.a = bdVar;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Paint G(String str) {
        return str.equals("paintDivider") ? this.a.y0 : org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int G0(int i10) {
        bd bdVar = this.a;
        int indexOfKey = bdVar.r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return bdVar.r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.e6 e6Var = bdVar.q0;
        return e6Var != null ? e6Var.G0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean a() {
        return this.a.J;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int g0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int g1(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.e6
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
            drawable2.setColorFilter(G0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(G0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.e6 e6Var = bdVar.q0;
        return e6Var != null ? e6Var.getDrawable(str) : org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final /* synthetic */ boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final /* synthetic */ void L0(int i10, int i11) {
    }
}
