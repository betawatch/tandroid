package fi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class da extends View {
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
    public final /* synthetic */ va w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(va vaVar, Context context, boolean z9, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14) {
        super(context);
        this.w = vaVar;
        this.a = z9;
        this.b = canvas;
        this.c = f10;
        this.d = f11;
        this.e = f12;
        this.f = paint;
        this.h = bitmap;
        this.n = paint2;
        this.r = f13;
        this.s = f14;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z9 = this.a;
        Paint paint = this.n;
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.c;
        va vaVar = this.w;
        if (z9) {
            float f13 = vaVar.D2;
            if (f13 > 0.0f) {
                this.b.drawCircle(f12, f11, f10 * f13, this.f);
            }
            canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawCircle(f12, f11, (1.0f - vaVar.D2) * f10, paint);
        }
        canvas.save();
        canvas.translate(this.r, this.s);
        vaVar.i1.draw(canvas);
        canvas.restore();
    }
}
