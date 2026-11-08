package a5;

import a8.wa;
import android.content.res.ColorStateList;
import android.graphics.Paint;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class j extends m {
    public wa d;
    public float e;
    public wa f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Paint.Cap l;
    public Paint.Join m;
    public float n;

    @Override // a5.l
    public final boolean a() {
        return this.f.n() || this.d.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // a5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z9;
        wa waVar;
        wa waVar2 = this.f;
        boolean z10 = true;
        if (waVar2.n()) {
            ColorStateList colorStateList = (ColorStateList) waVar2.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != waVar2.b) {
                waVar2.b = colorForState;
                z9 = true;
                waVar = this.d;
                if (waVar.n()) {
                    ColorStateList colorStateList2 = (ColorStateList) waVar.d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != waVar.b) {
                        waVar.b = colorForState2;
                        return z9 | z10;
                    }
                }
                z10 = false;
                return z9 | z10;
            }
        }
        z9 = false;
        waVar = this.d;
        if (waVar.n()) {
        }
        z10 = false;
        return z9 | z10;
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

    public void setFillColor(int i7) {
        this.f.b = i7;
    }

    public void setStrokeAlpha(float f10) {
        this.g = f10;
    }

    public void setStrokeColor(int i7) {
        this.d.b = i7;
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
