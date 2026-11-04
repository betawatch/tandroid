package org.telegram.messenger;

import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class bc {
    public Paint A;
    public Path B;
    public boolean a;
    public float b;
    public long c;
    public int d;
    public BitmapShader e;
    public org.telegram.ui.Components.t5 f;
    public ch0 g;
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
        for (int i3 = 0; i3 < 4; i3++) {
            int[] iArr = this.h;
            iArr[i3] = iArr[i3];
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
