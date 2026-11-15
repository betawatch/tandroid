package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class bc extends View {
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
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bc(org.telegram.ui.ActionBar.e2 e2Var, Activity activity, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i7) {
        super(activity);
        this.a = i7;
        this.w = e2Var;
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
                qc qcVar = (qc) this.w;
                boolean z10 = qcVar.K;
                Paint paint = this.n;
                float f10 = this.e;
                float f11 = this.d;
                float f12 = this.c;
                if (z10) {
                    float f13 = qcVar.o0;
                    if (f13 > 0.0f) {
                        this.b.drawCircle(f12, f11, f10 * f13, this.f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - qcVar.o0) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.r, this.s);
                qcVar.M.draw(canvas);
                canvas.restore();
                break;
            case 1:
                super.onDraw(canvas);
                jm0 jm0Var = (jm0) this.w;
                boolean z11 = jm0Var.T;
                Paint paint2 = this.n;
                float f14 = this.e;
                float f15 = this.d;
                float f16 = this.c;
                if (z11) {
                    float f17 = jm0Var.Z;
                    if (f17 > 0.0f) {
                        this.b.drawCircle(f16, f15, f14 * f17, this.f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - jm0Var.Z) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.r, this.s);
                jm0Var.L.draw(canvas);
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                t71 t71Var = (t71) this.w;
                boolean a10 = t71Var.a.a();
                Paint paint3 = this.n;
                float f18 = this.e;
                float f19 = this.d;
                float f20 = this.c;
                if (a10) {
                    float f21 = t71Var.k2;
                    if (f21 > 0.0f) {
                        this.b.drawCircle(f20, f19, f18 * f21, this.f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - t71Var.k2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.r, this.s);
                t71Var.Q1.draw(canvas);
                canvas.restore();
                break;
        }
    }
}
