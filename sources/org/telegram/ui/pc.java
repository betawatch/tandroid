package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class pc implements org.telegram.ui.ActionBar.i6 {
    public final /* synthetic */ qc a;

    public pc(qc qcVar) {
        this.a = qcVar;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final boolean b() {
        return this.a.K;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final void c(float f10, float f11, int i7, int i10) {
        org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final ColorFilter d() {
        return org.telegram.ui.ActionBar.n6.v3;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final Paint e(String str) {
        return str.equals("paintDivider") ? this.a.z0 : org.telegram.ui.ActionBar.n6.V0(str);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final boolean f() {
        return org.telegram.messenger.bz.H0;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int g(int i7) {
        return i(i7);
    }

    @Override // org.telegram.ui.ActionBar.i6
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
            drawable2.setColorFilter(i(org.telegram.ui.ActionBar.n6.Cb), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(i(org.telegram.ui.ActionBar.n6.Cb), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.i6 i6Var = qcVar.r0;
        return i6Var != null ? i6Var.getDrawable(str) : org.telegram.ui.ActionBar.n6.R0(str);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int i(int i7) {
        qc qcVar = this.a;
        int indexOfKey = qcVar.s0.indexOfKey(i7);
        if (indexOfKey >= 0) {
            return qcVar.s0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.i6 i6Var = qcVar.r0;
        return i6Var != null ? i6Var.i(i7) : org.telegram.ui.ActionBar.n6.v0(i7);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int k(int i7) {
        return i(i7);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final /* synthetic */ void j(int i7, int i10) {
    }
}
