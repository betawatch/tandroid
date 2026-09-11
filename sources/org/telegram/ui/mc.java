package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class mc extends View {
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
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mc(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.a = i10;
        this.v = n2Var;
        this.b = canvas;
        this.c = f7;
        this.d = f10;
        this.e = f11;
        this.f = paint;
        this.h = bitmap;
        this.n = paint2;
        this.r = f12;
        this.s = f13;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                bd bdVar = (bd) this.v;
                boolean z10 = bdVar.J;
                Paint paint = this.n;
                float f7 = this.e;
                float f10 = this.d;
                float f11 = this.c;
                if (z10) {
                    float f12 = bdVar.n0;
                    if (f12 > 0.0f) {
                        this.b.drawCircle(f11, f10, f7 * f12, this.f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - bdVar.n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.r, this.s);
                bdVar.L.draw(canvas);
                canvas.restore();
                break;
            case 1:
                super.onDraw(canvas);
                bq0 bq0Var = (bq0) this.v;
                boolean z11 = bq0Var.S;
                Paint paint2 = this.n;
                float f13 = this.e;
                float f14 = this.d;
                float f15 = this.c;
                if (z11) {
                    float f16 = bq0Var.Y;
                    if (f16 > 0.0f) {
                        this.b.drawCircle(f15, f14, f13 * f16, this.f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - bq0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.r, this.s);
                bq0Var.K.draw(canvas);
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                wd1 wd1Var = (wd1) this.v;
                boolean a2 = wd1Var.a.a();
                Paint paint3 = this.n;
                float f17 = this.e;
                float f18 = this.d;
                float f19 = this.c;
                if (a2) {
                    float f20 = wd1Var.i2;
                    if (f20 > 0.0f) {
                        this.b.drawCircle(f19, f18, f17 * f20, this.f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - wd1Var.i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.r, this.s);
                wd1Var.O1.draw(canvas);
                canvas.restore();
                break;
        }
    }
}
