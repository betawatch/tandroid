package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class bd implements org.telegram.ui.ActionBar.f6 {
    public final /* synthetic */ cd a;

    public bd(cd cdVar) {
        this.a = cdVar;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final Paint G(String str) {
        return str.equals("paintDivider") ? this.a.y0 : org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int G0(int i10) {
        cd cdVar = this.a;
        int indexOfKey = cdVar.r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return cdVar.r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = cdVar.q0;
        return f6Var != null ? f6Var.G0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final boolean a() {
        return this.a.J;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int g0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int g1(int i10) {
        return G0(i10);
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
            drawable2.setColorFilter(G0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(G0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.f6 f6Var = cdVar.q0;
        return f6Var != null ? f6Var.getDrawable(str) : org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final /* synthetic */ boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final /* synthetic */ void L0(int i10, int i11) {
    }
}
