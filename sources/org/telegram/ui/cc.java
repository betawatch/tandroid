package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class cc extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ Canvas b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Paint f;
    public final /* synthetic */ Bitmap h;
    public final /* synthetic */ Paint n;
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc(org.telegram.ui.ActionBar.f2 f2Var, Activity activity, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i7) {
        super(activity);
        this.a = i7;
        this.w = f2Var;
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
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                rc rcVar = (rc) this.w;
                boolean z9 = rcVar.J;
                Paint paint = this.n;
                float f10 = this.e;
                float f11 = this.d;
                float f12 = this.c;
                if (z9) {
                    float f13 = rcVar.n0;
                    if (f13 > 0.0f) {
                        this.b.drawCircle(f12, f11, f10 * f13, this.f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - rcVar.n0) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.r, this.s);
                rcVar.L.draw(canvas);
                canvas.restore();
                break;
            case 1:
                super.onDraw(canvas);
                hm0 hm0Var = (hm0) this.w;
                boolean z10 = hm0Var.S;
                Paint paint2 = this.n;
                float f14 = this.e;
                float f15 = this.d;
                float f16 = this.c;
                if (z10) {
                    float f17 = hm0Var.Y;
                    if (f17 > 0.0f) {
                        this.b.drawCircle(f16, f15, f14 * f17, this.f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - hm0Var.Y) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.r, this.s);
                hm0Var.K.draw(canvas);
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                v71 v71Var = (v71) this.w;
                boolean a10 = v71Var.a.a();
                Paint paint3 = this.n;
                float f18 = this.e;
                float f19 = this.d;
                float f20 = this.c;
                if (a10) {
                    float f21 = v71Var.j2;
                    if (f21 > 0.0f) {
                        this.b.drawCircle(f20, f19, f18 * f21, this.f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - v71Var.j2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.r, this.s);
                v71Var.P1.draw(canvas);
                canvas.restore();
                break;
        }
    }
}
