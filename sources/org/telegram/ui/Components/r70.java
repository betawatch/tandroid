package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class r70 extends aq {
    public static CornerPathEffect w;
    public static int x;
    public Layout h;
    public int i;
    public float j;
    public float k;
    public float l;
    public final boolean m;
    public boolean n;
    public int o;
    public int p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;

    public r70() {
        this.j = -1.0f;
        this.n = true;
        this.s = Float.MAX_VALUE;
        this.u = Float.MAX_VALUE;
        this.c = false;
    }

    public static CornerPathEffect c() {
        if (w == null || x != org.telegram.messenger.g0.L(5.0f)) {
            int L = org.telegram.messenger.g0.L(5.0f);
            x = L;
            w = new CornerPathEffect(L);
        }
        return w;
    }

    @Override // org.telegram.ui.Components.aq, android.graphics.Path
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f10, f11, f12, f13, direction);
            return;
        }
        try {
            float f14 = this.l;
            float f15 = f11 + f14;
            float f16 = f13 + f14;
            float f17 = this.j;
            if (f17 == -1.0f) {
                this.j = f15;
            } else if (f17 != f15) {
                this.j = f15;
                this.i++;
            }
            float lineRight = layout.getLineRight(this.i);
            float lineLeft = this.h.getLineLeft(this.i);
            if (f10 < lineRight) {
                if (f10 > lineLeft || f12 > lineLeft) {
                    if (f12 > lineRight) {
                        f12 = lineRight;
                    }
                    if (f10 < lineLeft) {
                        f10 = lineLeft;
                    }
                    float f18 = this.k;
                    float f19 = f10 + f18;
                    float f20 = f12 + f18;
                    if (Build.VERSION.SDK_INT < 28) {
                        f16 -= f16 != ((float) this.h.getHeight()) ? this.h.getSpacingAdd() : 0.0f;
                    } else if (f16 - f15 > this.p) {
                        f16 = this.l + (f16 != ((float) this.h.getHeight()) ? this.h.getLineBottom(this.i) - this.h.getSpacingAdd() : 0.0f);
                    }
                    int i7 = this.o;
                    if (i7 < 0) {
                        f16 += i7;
                    } else if (i7 > 0) {
                        f15 += i7;
                    }
                    float f21 = f15;
                    float f22 = f16;
                    if (this.m) {
                        f(f19 - (org.telegram.messenger.g0.L(5.0f) / 2.0f), f21, f20 + (org.telegram.messenger.g0.L(5.0f) / 2.0f), f22, direction);
                    } else {
                        f(f19, f21, f20, f22, direction);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void d(Layout layout, int i7, float f10) {
        e(layout, i7, 0.0f, f10);
    }

    public final void e(Layout layout, int i7, float f10, float f11) {
        int lineCount;
        if (layout == null) {
            this.h = null;
            this.i = 0;
            this.j = -1.0f;
            this.k = f10;
            this.l = f11;
            return;
        }
        this.h = layout;
        this.i = layout.getLineForOffset(i7);
        this.j = -1.0f;
        this.k = f10;
        this.l = f11;
        if (Build.VERSION.SDK_INT < 28 || (lineCount = layout.getLineCount()) <= 0) {
            return;
        }
        int i10 = lineCount - 1;
        this.p = layout.getLineBottom(i10) - layout.getLineTop(i10);
    }

    public final void f(float f10, float f11, float f12, float f13, Path.Direction direction) {
        float f14 = this.r;
        float f15 = f10 - f14;
        float f16 = this.q;
        float f17 = f11 - f16;
        float f18 = f12 + f14;
        float f19 = f13 + f16;
        this.s = Math.min(this.s, Math.min(f15, f18));
        this.u = Math.min(this.u, Math.min(f17, f19));
        this.t = Math.max(this.t, Math.max(f15, f18));
        this.v = Math.max(this.v, Math.max(f17, f19));
        super.addRect(f15, f17, f18, f19, direction);
    }

    @Override // org.telegram.ui.Components.aq, android.graphics.Path
    public final void reset() {
        if (this.n) {
            super.reset();
        }
    }

    public r70(int i7) {
        this.j = -1.0f;
        this.n = true;
        this.s = Float.MAX_VALUE;
        this.u = Float.MAX_VALUE;
        this.m = true;
        this.c = false;
    }
}
