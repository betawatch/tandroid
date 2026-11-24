// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fl0 extends mod {
    public NinePatchDrawable d;
    public long e;
    public final /* synthetic */ il0 g;
    public final tab a = new tab();
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Bitmap[] f = new Bitmap[1];

    public fl0(il0 il0Var) {
        this.g = il0Var;
    }

    @Override // mod
    public final void b(Canvas canvas, gx4 gx4Var) {
        gx4 v = il0.v(gx4Var);
        il0 il0Var = this.g;
        c(canvas, bm2.k(il0Var.y, (Color.alpha(il0Var.y) == 255 || !(v instanceof ix4)) ? 0 : ((ix4) v).b));
    }

    public final void c(Canvas canvas, int i) {
        il0 il0Var = this.g;
        hl0 hl0Var = il0Var.S;
        if (Color.alpha(i) == 0 && Color.alpha(il0Var.x) == 0) {
            return;
        }
        if (hl0Var.e()) {
            float f = il0Var.c / 255.0f;
            int p1 = bkb.p1(f, i);
            Paint paint = this.b;
            paint.setColor(p1);
            int p12 = bkb.p1(f * il0Var.X, il0Var.x);
            if (Color.alpha(p12) != 0) {
                paint.setShadowLayer(il0Var.V, 0.0f, il0Var.W, p12);
            } else {
                paint.clearShadowLayer();
            }
            canvas.drawPath(hl0Var.k, paint);
            return;
        }
        tab tabVar = this.a;
        tabVar.a = 0L;
        tabVar.b = false;
        tabVar.a(i);
        tabVar.a(il0Var.x);
        for (float f2 : hl0Var.b) {
            tabVar.c(f2);
        }
        tabVar.c(il0Var.V);
        tabVar.c(0.0f);
        tabVar.c(il0Var.W);
        long j = tabVar.b ? -1L : tabVar.a;
        NinePatchDrawable ninePatchDrawable = this.d;
        Rect rect = this.c;
        if (ninePatchDrawable == null || this.e != j) {
            this.e = j;
            NinePatchDrawable b = rpe.b(this.f, i, hl0Var.b, il0Var.V, il0Var.x, il0Var.W, Color.alpha(i) == 255 ? i : 1);
            this.d = b;
            b.getPadding(rect);
        }
        NinePatchDrawable ninePatchDrawable2 = this.d;
        Rect rect2 = hl0Var.m;
        ninePatchDrawable2.setBounds(rect2.left - rect.left, rect2.top - rect.top, rect2.right + rect.right, rect2.bottom + rect.bottom);
        ninePatchDrawable2.setAlpha(il0Var.c);
        ninePatchDrawable2.draw(canvas);
    }
}
