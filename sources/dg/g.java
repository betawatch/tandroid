package dg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class g {
    public final cg.a a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Path e;
    public final Path f;
    public final Path g;
    public ValueAnimator h;
    public ValueAnimator i;
    public int j;
    public final float[] k;
    public final float[] l;
    public int m;
    public boolean n;
    public float o;
    public final p6 p;

    public g(cg.a aVar, boolean z10, p6 p6Var) {
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new Path();
        this.f = new Path();
        this.g = new Path();
        this.n = true;
        this.o = 1.0f;
        this.p = p6Var;
        this.a = aVar;
        paint2.setStrokeWidth(i0.N(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!bg.i.A1) {
            paint2.setStrokeJoin(Paint.Join.ROUND);
        }
        paint2.setColor(aVar.h);
        paint.setStrokeWidth(i0.N(1.0f));
        paint.setStyle(style);
        paint.setColor(aVar.h);
        paint3.setStrokeWidth(i0.N(10.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setColor(aVar.h);
        long[] jArr = aVar.a;
        this.k = new float[z10 ? jArr.length * 8 : jArr.length << 2];
        long[] jArr2 = aVar.a;
        this.l = new float[z10 ? jArr2.length * 8 : jArr2.length << 2];
    }

    public void a() {
        cg.a aVar = this.a;
        int i10 = aVar.g;
        p6 p6Var = this.p;
        if (i10 < 0 || !t6.f1(i10)) {
            this.m = i0.b.h(t6.w0(t6.d6, p6Var)) < 0.5d ? aVar.i : aVar.h;
        } else {
            this.m = t6.w0(aVar.g, p6Var);
        }
        this.c.setColor(this.m);
        this.b.setColor(this.m);
        this.d.setColor(this.m);
    }
}
