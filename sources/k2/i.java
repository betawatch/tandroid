package k2;

import ag.j2;
import android.content.res.ColorStateList;
import android.graphics.Paint;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i extends l {
    public j2 d;
    public float e;
    public j2 f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Paint.Cap l;
    public Paint.Join m;
    public float n;

    @Override // k2.k
    public final boolean a() {
        return this.f.j() || this.d.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // k2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z10;
        j2 j2Var;
        j2 j2Var2 = this.f;
        boolean z11 = true;
        if (j2Var2.j()) {
            ColorStateList colorStateList = (ColorStateList) j2Var2.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != j2Var2.b) {
                j2Var2.b = colorForState;
                z10 = true;
                j2Var = this.d;
                if (j2Var.j()) {
                    ColorStateList colorStateList2 = (ColorStateList) j2Var.d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != j2Var.b) {
                        j2Var.b = colorForState2;
                        return z10 | z11;
                    }
                }
                z11 = false;
                return z10 | z11;
            }
        }
        z10 = false;
        j2Var = this.d;
        if (j2Var.j()) {
        }
        z11 = false;
        return z10 | z11;
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f.b;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.d.b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f9) {
        this.h = f9;
    }

    public void setFillColor(int i10) {
        this.f.b = i10;
    }

    public void setStrokeAlpha(float f9) {
        this.g = f9;
    }

    public void setStrokeColor(int i10) {
        this.d.b = i10;
    }

    public void setStrokeWidth(float f9) {
        this.e = f9;
    }

    public void setTrimPathEnd(float f9) {
        this.j = f9;
    }

    public void setTrimPathOffset(float f9) {
        this.k = f9;
    }

    public void setTrimPathStart(float f9) {
        this.i = f9;
    }
}
