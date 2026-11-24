// default package

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lbc extends obc {
    public kq d;
    public float e;
    public kq f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Paint.Cap l;
    public Paint.Join m;
    public float n;

    @Override // nbc
    public final boolean a() {
        return this.f.n() || this.d.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // nbc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z;
        kq kqVar;
        kq kqVar2 = this.f;
        boolean z2 = true;
        if (kqVar2.n()) {
            ColorStateList colorStateList = (ColorStateList) kqVar2.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != kqVar2.b) {
                kqVar2.b = colorForState;
                z = true;
                kqVar = this.d;
                if (kqVar.n()) {
                    ColorStateList colorStateList2 = (ColorStateList) kqVar.d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != kqVar.b) {
                        kqVar.b = colorForState2;
                        return z | z2;
                    }
                }
                z2 = false;
                return z | z2;
            }
        }
        z = false;
        kqVar = this.d;
        if (kqVar.n()) {
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
