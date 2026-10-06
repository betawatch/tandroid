package ci;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.pp;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class sb extends View {
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
    public /* synthetic */ sb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z10, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(context);
        this.a = i10;
        this.w = notificationCenterDelegate;
        this.b = z10;
        this.c = canvas;
        this.d = f7;
        this.e = f10;
        this.f = f11;
        this.h = paint;
        this.n = bitmap;
        this.r = paint2;
        this.s = f12;
        this.v = f13;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                kc kcVar = (kc) this.w;
                super.onDraw(canvas);
                boolean z10 = this.b;
                Paint paint = this.r;
                float f7 = this.f;
                float f10 = this.e;
                float f11 = this.d;
                if (z10) {
                    float f12 = kcVar.D2;
                    if (f12 > 0.0f) {
                        this.c.drawCircle(f11, f10, f7 * f12, this.h);
                    }
                    canvas.drawBitmap(this.n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - kcVar.D2) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.s, this.v);
                kcVar.i1.draw(canvas);
                canvas.restore();
                break;
            case 1:
                pp ppVar = (pp) this.w;
                super.onDraw(canvas);
                boolean z11 = this.b;
                Paint paint2 = this.r;
                float f13 = this.f;
                float f14 = this.e;
                float f15 = this.d;
                if (z11) {
                    float f16 = ppVar.S;
                    if (f16 > 0.0f) {
                        this.c.drawCircle(f15, f14, f13 * f16, this.h);
                    }
                    canvas.drawBitmap(this.n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - ppVar.S) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.s, this.v);
                ppVar.G.draw(canvas);
                canvas.restore();
                break;
            default:
                x21 x21Var = (x21) this.w;
                super.onDraw(canvas);
                boolean z12 = this.b;
                Paint paint3 = this.r;
                float f17 = this.f;
                float f18 = this.e;
                float f19 = this.d;
                if (z12) {
                    float f20 = x21Var.P;
                    if (f20 > 0.0f) {
                        this.c.drawCircle(f19, f18, f17 * f20, this.h);
                    }
                    canvas.drawBitmap(this.n, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - x21Var.P) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.s, this.v);
                x21Var.F.draw(canvas);
                canvas.restore();
                break;
        }
    }
}
