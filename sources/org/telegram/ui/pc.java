package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class pc implements org.telegram.ui.ActionBar.e6 {
    public final /* synthetic */ qc a;

    public pc(qc qcVar) {
        this.a = qcVar;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean a() {
        return this.a.K;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final void b(float f10, float f11, int i7, int i10) {
        org.telegram.ui.ActionBar.j6.r(f10, f11, i7, i10);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Paint d(String str) {
        return str.equals("paintDivider") ? this.a.z0 : org.telegram.ui.ActionBar.j6.V0(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean e() {
        return org.telegram.messenger.gz.H0;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int f(int i7) {
        return h(i7);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Drawable getDrawable(String str) {
        qc qcVar = this.a;
        Drawable drawable = qcVar.y0;
        Drawable drawable2 = qcVar.x0;
        if (str.equals("drawableMsgIn")) {
            return qcVar.t0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return qcVar.u0;
        }
        if (str.equals("drawableMsgOut")) {
            return qcVar.v0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return qcVar.w0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(h(org.telegram.ui.ActionBar.j6.Cb), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(h(org.telegram.ui.ActionBar.j6.Cb), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.e6 e6Var = qcVar.r0;
        return e6Var != null ? e6Var.getDrawable(str) : org.telegram.ui.ActionBar.j6.R0(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int h(int i7) {
        qc qcVar = this.a;
        int indexOfKey = qcVar.s0.indexOfKey(i7);
        if (indexOfKey >= 0) {
            return qcVar.s0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.e6 e6Var = qcVar.r0;
        return e6Var != null ? e6Var.h(i7) : org.telegram.ui.ActionBar.j6.v0(i7);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int j(int i7) {
        return h(i7);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final /* synthetic */ void i(int i7, int i10) {
    }
}
