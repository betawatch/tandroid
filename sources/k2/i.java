package k2;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import b4.e0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class i extends l {
    public e0 d;
    public float e;
    public e0 f;
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
        return this.f.l() || this.d.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // k2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z4;
        e0 e0Var;
        e0 e0Var2 = this.f;
        boolean z10 = true;
        if (e0Var2.l()) {
            ColorStateList colorStateList = (ColorStateList) e0Var2.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != e0Var2.b) {
                e0Var2.b = colorForState;
                z4 = true;
                e0Var = this.d;
                if (e0Var.l()) {
                    ColorStateList colorStateList2 = (ColorStateList) e0Var.d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != e0Var.b) {
                        e0Var.b = colorForState2;
                        return z4 | z10;
                    }
                }
                z10 = false;
                return z4 | z10;
            }
        }
        z4 = false;
        e0Var = this.d;
        if (e0Var.l()) {
        }
        z10 = false;
        return z4 | z10;
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

    public void setFillAlpha(float f10) {
        this.h = f10;
    }

    public void setFillColor(int i10) {
        this.f.b = i10;
    }

    public void setStrokeAlpha(float f10) {
        this.g = f10;
    }

    public void setStrokeColor(int i10) {
        this.d.b = i10;
    }

    public void setStrokeWidth(float f10) {
        this.e = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.j = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.k = f10;
    }

    public void setTrimPathStart(float f10) {
        this.i = f10;
    }
}
