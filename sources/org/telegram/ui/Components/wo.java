package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wo extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Canvas c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Paint h;
    public final /* synthetic */ Bitmap n;
    public final /* synthetic */ Paint r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float v;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wo(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z4, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i10) {
        super(context);
        this.a = i10;
        this.w = notificationCenterDelegate;
        this.b = z4;
        this.c = canvas;
        this.d = f10;
        this.e = f11;
        this.f = f12;
        this.h = paint;
        this.n = bitmap;
        this.r = paint2;
        this.s = f13;
        this.v = f14;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                mp mpVar = (mp) this.w;
                super.onDraw(canvas);
                boolean z4 = this.b;
                Paint paint = this.r;
                float f10 = this.f;
                float f11 = this.e;
                float f12 = this.d;
                if (z4) {
                    float f13 = mpVar.P;
                    if (f13 > 0.0f) {
                        this.c.drawCircle(f12, f11, f10 * f13, this.h);
                    }
                    canvas.drawBitmap(this.n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - mpVar.P) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.s, this.v);
                mpVar.D.draw(canvas);
                canvas.restore();
                break;
            case 1:
                org.telegram.ui.t21 t21Var = (org.telegram.ui.t21) this.w;
                super.onDraw(canvas);
                boolean z10 = this.b;
                Paint paint2 = this.r;
                float f14 = this.f;
                float f15 = this.e;
                float f16 = this.d;
                if (z10) {
                    float f17 = t21Var.M;
                    if (f17 > 0.0f) {
                        this.c.drawCircle(f16, f15, f14 * f17, this.h);
                    }
                    canvas.drawBitmap(this.n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - t21Var.M) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.s, this.v);
                t21Var.C.draw(canvas);
                canvas.restore();
                break;
            default:
                qh.ba baVar = (qh.ba) this.w;
                super.onDraw(canvas);
                boolean z11 = this.b;
                Paint paint3 = this.r;
                float f18 = this.f;
                float f19 = this.e;
                float f20 = this.d;
                if (z11) {
                    float f21 = baVar.A2;
                    if (f21 > 0.0f) {
                        this.c.drawCircle(f20, f19, f18 * f21, this.h);
                    }
                    canvas.drawBitmap(this.n, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - baVar.A2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.s, this.v);
                baVar.f1.draw(canvas);
                canvas.restore();
                break;
        }
    }
}
