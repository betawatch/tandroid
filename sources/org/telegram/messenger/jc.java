package org.telegram.messenger;

import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.bi0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class jc {
    public Paint A;
    public Path B;
    public boolean a;
    public float b;
    public long c;
    public int d;
    public BitmapShader e;
    public org.telegram.ui.Components.s5 f;
    public bi0 g;
    public int[] h;
    public BitmapShader i;
    public Drawable j;
    public BitmapShader k;
    public Drawable l;
    public Drawable m;
    public BitmapShader n;
    public Drawable o;
    public float p;
    public float q;
    public BitmapShader r;
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;
    public Drawable x;
    public RectF y;
    public ColorFilter z;

    public final void a() {
        this.f = null;
        this.g = null;
        for (int i10 = 0; i10 < 4; i10++) {
            int[] iArr = this.h;
            iArr[i10] = iArr[i10];
        }
        this.j = null;
        this.i = null;
        this.l = null;
        this.k = null;
        this.m = null;
        this.n = null;
        this.e = null;
        this.o = null;
        this.x = null;
        this.z = null;
    }

    public final void b(Rect rect) {
        if (rect != null) {
            this.u = rect.left;
            this.v = rect.top;
            this.t = rect.width();
            this.s = rect.height();
        }
    }
}
