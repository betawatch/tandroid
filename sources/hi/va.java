package hi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class va extends View {
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
    public final /* synthetic */ nb w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(nb nbVar, Context context, boolean z10, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14) {
        super(context);
        this.w = nbVar;
        this.a = z10;
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
        boolean z10 = this.a;
        Paint paint = this.n;
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.c;
        nb nbVar = this.w;
        if (z10) {
            float f13 = nbVar.E2;
            if (f13 > 0.0f) {
                this.b.drawCircle(f12, f11, f10 * f13, this.f);
            }
            canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawCircle(f12, f11, (1.0f - nbVar.E2) * f10, paint);
        }
        canvas.save();
        canvas.translate(this.r, this.s);
        nbVar.j1.draw(canvas);
        canvas.restore();
    }
}
