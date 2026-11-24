// default package

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mh1 implements wjb {
    public final /* synthetic */ nh1 a;

    public mh1(nh1 nh1Var) {
        this.a = nh1Var;
    }

    @Override // wjb
    public final boolean a() {
        return this.a.K;
    }

    @Override // wjb
    public final void b(float f, float f2, int i, int i2) {
        bkb.q(f, f2, i, i2);
    }

    @Override // wjb
    public final ColorFilter c() {
        return bkb.u3;
    }

    @Override // wjb
    public final Paint d(String str) {
        return str.equals("paintDivider") ? this.a.z0 : bkb.T0(str);
    }

    @Override // wjb
    public final boolean e() {
        return gba.D0;
    }

    @Override // wjb
    public final int f(int i) {
        return h(i);
    }

    @Override // wjb
    public final boolean g() {
        return false;
    }

    @Override // wjb
    public final Drawable getDrawable(String str) {
        nh1 nh1Var = this.a;
        Drawable drawable = nh1Var.y0;
        Drawable drawable2 = nh1Var.x0;
        if (str.equals("drawableMsgIn")) {
            return nh1Var.t0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return nh1Var.u0;
        }
        if (str.equals("drawableMsgOut")) {
            return nh1Var.v0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return nh1Var.w0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(h(bkb.Bb), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(h(bkb.Bb), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        wjb wjbVar = nh1Var.r0;
        return wjbVar != null ? wjbVar.getDrawable(str) : bkb.P0(str);
    }

    @Override // wjb
    public final int h(int i) {
        nh1 nh1Var = this.a;
        SparseIntArray sparseIntArray = nh1Var.s0;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        wjb wjbVar = nh1Var.r0;
        return wjbVar != null ? wjbVar.h(i) : bkb.w0(null, i, false);
    }

    @Override // wjb
    public final int j(int i) {
        return h(i);
    }

    @Override // wjb
    public final void i(int i, int i2) {
    }
}
