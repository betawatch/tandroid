// default package

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class k9c extends n9c {
    public kp d;
    public float e;
    public kp f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Paint.Cap l;
    public Paint.Join m;
    public float n;

    @Override // m9c
    public final boolean a() {
        return this.f.n() || this.d.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // m9c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z;
        kp kpVar;
        kp kpVar2 = this.f;
        boolean z2 = true;
        if (kpVar2.n()) {
            ColorStateList colorStateList = (ColorStateList) kpVar2.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != kpVar2.b) {
                kpVar2.b = colorForState;
                z = true;
                kpVar = this.d;
                if (kpVar.n()) {
                    ColorStateList colorStateList2 = (ColorStateList) kpVar.d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != kpVar.b) {
                        kpVar.b = colorForState2;
                        return z | z2;
                    }
                }
                z2 = false;
                return z | z2;
            }
        }
        z = false;
        kpVar = this.d;
        if (kpVar.n()) {
        }
        z2 = false;
        return z | z2;
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

    public void setFillAlpha(float f) {
        this.h = f;
    }

    public void setFillColor(int i) {
        this.f.b = i;
    }

    public void setStrokeAlpha(float f) {
        this.g = f;
    }

    public void setStrokeColor(int i) {
        this.d.b = i;
    }

    public void setStrokeWidth(float f) {
        this.e = f;
    }

    public void setTrimPathEnd(float f) {
        this.j = f;
    }

    public void setTrimPathOffset(float f) {
        this.k = f;
    }

    public void setTrimPathStart(float f) {
        this.i = f;
    }
}
