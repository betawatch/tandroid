package lg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public class f {
    public final kg.a a;
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
    public final d6 p;

    public f(kg.a aVar, boolean z10, d6 d6Var) {
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
        this.p = d6Var;
        this.a = aVar;
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!jg.g.A1) {
            paint2.setStrokeJoin(Paint.Join.ROUND);
        }
        paint2.setColor(aVar.h);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        paint.setStyle(style);
        paint.setColor(aVar.h);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(10.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setColor(aVar.h);
        long[] jArr = aVar.a;
        this.k = new float[z10 ? jArr.length * 8 : jArr.length << 2];
        long[] jArr2 = aVar.a;
        this.l = new float[z10 ? jArr2.length * 8 : jArr2.length << 2];
    }

    public void a() {
        kg.a aVar = this.a;
        int i10 = aVar.g;
        d6 d6Var = this.p;
        if (i10 < 0 || !h6.d1(i10)) {
            this.m = i0.a.h(h6.w0(h6.d6, d6Var)) < 0.5d ? aVar.i : aVar.h;
        } else {
            this.m = h6.w0(aVar.g, d6Var);
        }
        this.c.setColor(this.m);
        this.b.setColor(this.m);
        this.d.setColor(this.m);
    }
}
