package a5;

import a8.xa;
import android.content.res.ColorStateList;
import android.graphics.Paint;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class j extends m {
    public xa d;
    public float e;
    public xa f;
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
        return this.f.m() || this.d.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // a5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z10;
        xa xaVar;
        xa xaVar2 = this.f;
        boolean z11 = true;
        if (xaVar2.m()) {
            ColorStateList colorStateList = (ColorStateList) xaVar2.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != xaVar2.b) {
                xaVar2.b = colorForState;
                z10 = true;
                xaVar = this.d;
                if (xaVar.m()) {
                    ColorStateList colorStateList2 = (ColorStateList) xaVar.d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != xaVar.b) {
                        xaVar.b = colorForState2;
                        return z10 | z11;
                    }
                }
                z11 = false;
                return z10 | z11;
            }
        }
        z10 = false;
        xaVar = this.d;
        if (xaVar.m()) {
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
