package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class kc extends View {
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
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kc(org.telegram.ui.ActionBar.p2 p2Var, Activity activity, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i10) {
        super(activity);
        this.a = i10;
        this.v = p2Var;
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
                bd bdVar = (bd) this.v;
                boolean z4 = bdVar.G;
                Paint paint = this.n;
                float f10 = this.e;
                float f11 = this.d;
                float f12 = this.c;
                if (z4) {
                    float f13 = bdVar.k0;
                    if (f13 > 0.0f) {
                        this.b.drawCircle(f12, f11, f10 * f13, this.f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - bdVar.k0) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.r, this.s);
                bdVar.I.draw(canvas);
                canvas.restore();
                break;
            case 1:
                super.onDraw(canvas);
                gp0 gp0Var = (gp0) this.v;
                boolean z10 = gp0Var.G;
                Paint paint2 = this.n;
                float f14 = this.e;
                float f15 = this.d;
                float f16 = this.c;
                if (z10) {
                    float f17 = gp0Var.M;
                    if (f17 > 0.0f) {
                        this.b.drawCircle(f16, f15, f14 * f17, this.f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - gp0Var.M) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.r, this.s);
                gp0Var.C.draw(canvas);
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                cd1 cd1Var = (cd1) this.v;
                boolean a2 = cd1Var.a.a();
                Paint paint3 = this.n;
                float f18 = this.e;
                float f19 = this.d;
                float f20 = this.c;
                if (a2) {
                    float f21 = cd1Var.f2;
                    if (f21 > 0.0f) {
                        this.b.drawCircle(f20, f19, f18 * f21, this.f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - cd1Var.f2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.r, this.s);
                cd1Var.L1.draw(canvas);
                canvas.restore();
                break;
        }
    }
}
