package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class cd implements org.telegram.ui.ActionBar.f6 {
    public final /* synthetic */ dd a;

    public cd(dd ddVar) {
        this.a = ddVar;
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
    public final int d0(int i10) {
        return x0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int f1(int i10) {
        return x0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final Drawable getDrawable(String str) {
        dd ddVar = this.a;
        Drawable drawable = ddVar.u0;
        Drawable drawable2 = ddVar.t0;
        if (str.equals("drawableMsgIn")) {
            return ddVar.p0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return ddVar.q0;
        }
        if (str.equals("drawableMsgOut")) {
            return ddVar.r0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return ddVar.s0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(x0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(x0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.f6 f6Var = ddVar.n0;
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
        dd ddVar = this.a;
        int indexOfKey = ddVar.o0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return ddVar.o0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = ddVar.n0;
        return f6Var != null ? f6Var.x0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final /* synthetic */ void J0(int i10, int i11) {
    }
}
