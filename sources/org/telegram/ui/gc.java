package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gc extends View {
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
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gc(org.telegram.ui.ActionBar.o2 o2Var, Activity activity, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i9) {
        super(activity);
        this.a = i9;
        this.v = o2Var;
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
                xc xcVar = (xc) this.v;
                boolean z10 = xcVar.F;
                Paint paint = this.n;
                float f10 = this.e;
                float f11 = this.d;
                float f12 = this.c;
                if (z10) {
                    float f13 = xcVar.j0;
                    if (f13 > 0.0f) {
                        this.b.drawCircle(f12, f11, f10 * f13, this.f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - xcVar.j0) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.r, this.s);
                xcVar.H.draw(canvas);
                canvas.restore();
                break;
            case 1:
                super.onDraw(canvas);
                zo0 zo0Var = (zo0) this.v;
                boolean z11 = zo0Var.F;
                Paint paint2 = this.n;
                float f14 = this.e;
                float f15 = this.d;
                float f16 = this.c;
                if (z11) {
                    float f17 = zo0Var.L;
                    if (f17 > 0.0f) {
                        this.b.drawCircle(f16, f15, f14 * f17, this.f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - zo0Var.L) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.r, this.s);
                zo0Var.B.draw(canvas);
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                oc1 oc1Var = (oc1) this.v;
                boolean a2 = oc1Var.a.a();
                Paint paint3 = this.n;
                float f18 = this.e;
                float f19 = this.d;
                float f20 = this.c;
                if (a2) {
                    float f21 = oc1Var.e2;
                    if (f21 > 0.0f) {
                        this.b.drawCircle(f20, f19, f18 * f21, this.f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - oc1Var.e2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.r, this.s);
                oc1Var.K1.draw(canvas);
                canvas.restore();
                break;
        }
    }
}
