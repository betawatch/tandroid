package k2;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i extends l {
    public a6.a d;
    public float e;
    public a6.a f;
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
        return this.f.h() || this.d.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // k2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z10;
        a6.a aVar;
        a6.a aVar2 = this.f;
        boolean z11 = true;
        if (aVar2.h()) {
            ColorStateList colorStateList = (ColorStateList) aVar2.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != aVar2.c) {
                aVar2.c = colorForState;
                z10 = true;
                aVar = this.d;
                if (aVar.h()) {
                    ColorStateList colorStateList2 = (ColorStateList) aVar.d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != aVar.c) {
                        aVar.c = colorForState2;
                        return z10 | z11;
                    }
                }
                z11 = false;
                return z10 | z11;
            }
        }
        z10 = false;
        aVar = this.d;
        if (aVar.h()) {
        }
        z11 = false;
        return z10 | z11;
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f.c;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.d.c;
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

    public void setFillColor(int i9) {
        this.f.c = i9;
    }

    public void setStrokeAlpha(float f10) {
        this.g = f10;
    }

    public void setStrokeColor(int i9) {
        this.d.c = i9;
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
