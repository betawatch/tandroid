package ng;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class f {
    public final mg.a a;
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
    public final i6 p;

    public f(mg.a aVar, boolean z10, i6 i6Var) {
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
        this.p = i6Var;
        this.a = aVar;
        paint2.setStrokeWidth(g0.N(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!lg.g.B1) {
            paint2.setStrokeJoin(Paint.Join.ROUND);
        }
        paint2.setColor(aVar.h);
        paint.setStrokeWidth(g0.N(1.0f));
        paint.setStyle(style);
        paint.setColor(aVar.h);
        paint3.setStrokeWidth(g0.N(10.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setColor(aVar.h);
        long[] jArr = aVar.a;
        this.k = new float[z10 ? jArr.length * 8 : jArr.length << 2];
        long[] jArr2 = aVar.a;
        this.l = new float[z10 ? jArr2.length * 8 : jArr2.length << 2];
    }

    public void a() {
        mg.a aVar = this.a;
        int i7 = aVar.g;
        i6 i6Var = this.p;
        if (i7 < 0 || !n6.f1(i7)) {
            this.m = i0.a.h(n6.w0(n6.d6, i6Var)) < 0.5d ? aVar.i : aVar.h;
        } else {
            this.m = n6.w0(aVar.g, i6Var);
        }
        this.c.setColor(this.m);
        this.b.setColor(this.m);
        this.d.setColor(this.m);
    }
}
