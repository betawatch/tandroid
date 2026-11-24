// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class d7b extends View {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Canvas b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Paint f;
    public final /* synthetic */ Bitmap h;
    public final /* synthetic */ Paint n;
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ t7b w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7b(t7b t7bVar, Context context, boolean z, Canvas canvas, float f, float f2, float f3, Paint paint, Bitmap bitmap, Paint paint2, float f4, float f5) {
        super(context);
        this.w = t7bVar;
        this.a = z;
        this.b = canvas;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = paint;
        this.h = bitmap;
        this.n = paint2;
        this.r = f4;
        this.s = f5;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        t7b t7bVar = this.w;
        float f = t7bVar.E2;
        Paint paint = this.n;
        float f2 = this.e;
        float f3 = this.d;
        float f4 = this.c;
        if (this.a) {
            if (f > 0.0f) {
                this.b.drawCircle(f4, f3, f2 * f, this.f);
            }
            canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawCircle(f4, f3, (1.0f - f) * f2, paint);
        }
        canvas.save();
        canvas.translate(this.r, this.s);
        t7bVar.j1.draw(canvas);
        canvas.restore();
    }
}
