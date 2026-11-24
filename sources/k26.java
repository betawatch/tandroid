// default package

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class k26 {
    public final ek1 a;
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
    public final wjb p;

    public k26(ek1 ek1Var, boolean z, wjb wjbVar) {
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
        this.p = wjbVar;
        this.a = ek1Var;
        paint2.setStrokeWidth(gl.N(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!nf0.B1) {
            paint2.setStrokeJoin(Paint.Join.ROUND);
        }
        paint2.setColor(ek1Var.h);
        paint.setStrokeWidth(gl.N(1.0f));
        paint.setStyle(style);
        paint.setColor(ek1Var.h);
        paint3.setStrokeWidth(gl.N(10.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setColor(ek1Var.h);
        long[] jArr = ek1Var.a;
        int length = jArr.length;
        this.k = new float[z ? length << 3 : length << 2];
        int length2 = jArr.length;
        this.l = new float[z ? length2 << 3 : length2 << 2];
    }

    public void a() {
        int i;
        ek1 ek1Var = this.a;
        int i2 = ek1Var.g;
        wjb wjbVar = this.p;
        if (i2 < 0 || !bkb.d1(i2)) {
            i = bm2.h(bkb.v0(bkb.c6, wjbVar)) < 0.5d ? ek1Var.i : ek1Var.h;
            this.m = i;
        } else {
            i = bkb.v0(ek1Var.g, wjbVar);
            this.m = i;
        }
        this.c.setColor(i);
        this.b.setColor(this.m);
        this.d.setColor(this.m);
    }
}
