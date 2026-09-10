package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g90 extends ar {
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

    public g90() {
        this.j = -1.0f;
        this.n = true;
        this.s = Float.MAX_VALUE;
        this.u = Float.MAX_VALUE;
        this.c = false;
    }

    public static CornerPathEffect c() {
        if (w == null || x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            x = dp;
            w = new CornerPathEffect(dp);
        }
        return w;
    }

    @Override // org.telegram.ui.Components.ar, android.graphics.Path
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.j;
            if (f16 == -1.0f) {
                this.j = f14;
            } else if (f16 != f14) {
                this.j = f14;
                this.i++;
            }
            float lineRight = layout.getLineRight(this.i);
            float lineLeft = this.h.getLineLeft(this.i);
            if (f7 < lineRight) {
                if (f7 > lineLeft || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (f7 < lineLeft) {
                        f7 = lineLeft;
                    }
                    float f17 = this.k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    if (Build.VERSION.SDK_INT < 28) {
                        f15 -= f15 != ((float) this.h.getHeight()) ? this.h.getSpacingAdd() : 0.0f;
                    } else if (f15 - f14 > this.p) {
                        f15 = this.l + (f15 != ((float) this.h.getHeight()) ? this.h.getLineBottom(this.i) - this.h.getSpacingAdd() : 0.0f);
                    }
                    int i10 = this.o;
                    if (i10 < 0) {
                        f15 += i10;
                    } else if (i10 > 0) {
                        f14 += i10;
                    }
                    float f20 = f14;
                    float f21 = f15;
                    if (this.m) {
                        f(f18 - (AndroidUtilities.dp(5.0f) / 2.0f), f20, f19 + (AndroidUtilities.dp(5.0f) / 2.0f), f21, direction);
                    } else {
                        f(f18, f20, f19, f21, direction);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void d(Layout layout, int i10, float f7) {
        e(layout, i10, 0.0f, f7);
    }

    public final void e(Layout layout, int i10, float f7, float f10) {
        int lineCount;
        if (layout == null) {
            this.h = null;
            this.i = 0;
            this.j = -1.0f;
            this.k = f7;
            this.l = f10;
            return;
        }
        this.h = layout;
        this.i = layout.getLineForOffset(i10);
        this.j = -1.0f;
        this.k = f7;
        this.l = f10;
        if (Build.VERSION.SDK_INT < 28 || (lineCount = layout.getLineCount()) <= 0) {
            return;
        }
        int i11 = lineCount - 1;
        this.p = layout.getLineBottom(i11) - layout.getLineTop(i11);
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.r;
        float f14 = f7 - f13;
        float f15 = this.q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.s = Math.min(this.s, Math.min(f14, f17));
        this.u = Math.min(this.u, Math.min(f16, f18));
        this.t = Math.max(this.t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override // org.telegram.ui.Components.ar, android.graphics.Path
    public final void reset() {
        if (this.n) {
            super.reset();
        }
    }

    public g90(int i10) {
        this.j = -1.0f;
        this.n = true;
        this.s = Float.MAX_VALUE;
        this.u = Float.MAX_VALUE;
        this.m = true;
        this.c = false;
    }
}
