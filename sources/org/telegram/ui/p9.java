package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class p9 extends ViewGroup {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(s9 s9Var, Context context) {
        super(context);
        this.c = s9Var;
        this.b = new Path();
    }

    public static RectF a(int i7, int i10, int i11) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(i7 - i11, i10 - i11, i7 + i11, i10 + i11);
        return rectF;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 0:
                Path path = (Path) this.b;
                boolean drawChild = super.drawChild(canvas, view, j3);
                s9 s9Var = (s9) this.c;
                Paint paint = s9Var.r;
                Paint paint2 = s9Var.n;
                if (!s9Var.f0() || view != s9Var.d) {
                    return drawChild;
                }
                float min = Math.min(1.0f, Math.max(0.0f, (SystemClock.elapsedRealtime() - s9Var.L) / 75.0f));
                if (min < 1.0f) {
                    s9Var.fragmentView.invalidate();
                }
                RectF rectF = s9Var.J;
                RectF rectF2 = s9Var.K;
                RectF rectF3 = org.telegram.messenger.g0.P;
                org.telegram.messenger.g0.Z1(rectF, rectF2, min, rectF3);
                if (s9Var.b0 < 1.0f) {
                    if (s9Var.c0 == null) {
                        s9Var.m0();
                    }
                    org.telegram.messenger.g0.Z1(s9Var.c0, rectF3, s9Var.b0, rectF3);
                }
                int width = (int) (rectF3.width() * view.getWidth());
                int height = (int) (rectF3.height() * view.getHeight());
                int centerX = (int) (rectF3.centerX() * view.getWidth());
                int centerY = (int) (rectF3.centerY() * view.getHeight());
                float f10 = s9Var.E;
                float f11 = (f10 * 0.5f) + 0.5f;
                int i7 = (int) (width * f11);
                int i10 = (int) (f11 * height);
                int i11 = centerX - (i7 / 2);
                int i12 = centerY - (i10 / 2);
                paint2.setAlpha((int) ((1.0f - (Math.min(1.0f, f10) * (1.0f - s9Var.x))) * 255.0f));
                float f12 = i12;
                canvas.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), f12, paint2);
                int i13 = i12 + i10;
                float f13 = i13;
                canvas.drawRect(0.0f, f13, view.getMeasuredWidth(), view.getMeasuredHeight(), paint2);
                float f14 = i11;
                canvas.drawRect(0.0f, f12, f14, f13, paint2);
                int i14 = i11 + i7;
                float f15 = i14;
                canvas.drawRect(f15, f12, view.getMeasuredWidth(), f13, paint2);
                paint2.setAlpha((int) (Math.max(0.0f, 1.0f - s9Var.E) * 255.0f));
                canvas.drawRect(f14, f12, f15, f13, paint2);
                int W1 = org.telegram.messenger.g0.W1(Math.min(1.0f, s9Var.E * 20.0f), 0, org.telegram.messenger.g0.L(4.0f));
                int i15 = W1 / 2;
                int W12 = org.telegram.messenger.g0.W1(Math.min(1.2f, (float) Math.pow(s9Var.E, 1.7999999523162842d)), Math.min(i7, i10), org.telegram.messenger.g0.L(20.0f));
                paint.setAlpha((int) (Math.min(1.0f, s9Var.E) * 255.0f));
                path.reset();
                int i16 = i12 + W12;
                path.arcTo(a(i11, i16, i15), 0.0f, 180.0f);
                float f16 = W1 * 1.5f;
                int i17 = (int) (f14 + f16);
                int i18 = (int) (f12 + f16);
                int i19 = W1 * 2;
                path.arcTo(a(i17, i18, i19), 180.0f, 90.0f);
                int i20 = i11 + W12;
                path.arcTo(a(i20, i12, i15), 270.0f, 180.0f);
                path.lineTo(i11 + i15, i12 + i15);
                path.arcTo(a(i17, i18, W1), 270.0f, -90.0f);
                path.close();
                canvas.drawPath(path, paint);
                path.reset();
                path.arcTo(a(i14, i16, i15), 180.0f, -180.0f);
                int i21 = (int) (f15 - f16);
                path.arcTo(a(i21, i18, i19), 0.0f, -90.0f);
                int i22 = i14 - W12;
                path.arcTo(a(i22, i12, i15), 270.0f, -180.0f);
                path.arcTo(a(i21, i18, W1), 270.0f, 90.0f);
                path.close();
                canvas.drawPath(path, paint);
                path.reset();
                int i23 = i13 - W12;
                path.arcTo(a(i11, i23, i15), 0.0f, -180.0f);
                int i24 = (int) (f13 - f16);
                path.arcTo(a(i17, i24, i19), 180.0f, -90.0f);
                path.arcTo(a(i20, i13, i15), 90.0f, -180.0f);
                path.arcTo(a(i17, i24, W1), 90.0f, 90.0f);
                path.close();
                canvas.drawPath(path, paint);
                path.reset();
                path.arcTo(a(i14, i23, i15), 180.0f, 180.0f);
                path.arcTo(a(i21, i24, i19), 0.0f, 90.0f);
                path.arcTo(a(i22, i13, i15), 90.0f, 180.0f);
                path.arcTo(a(i21, i24, W1), 90.0f, -90.0f);
                path.close();
                canvas.drawPath(path, paint);
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        int measuredHeight;
        int L;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        switch (this.a) {
            case 0:
                int i13 = i11 - i7;
                int i14 = i12 - i10;
                s9 s9Var = (s9) this.c;
                int i15 = s9Var.W;
                if (i15 == 0) {
                    CameraView cameraView = s9Var.d;
                    if (cameraView != null) {
                        cameraView.layout(0, 0, cameraView.getMeasuredWidth(), s9Var.d.getMeasuredHeight());
                    }
                    s9Var.h.setTextSize(0, i14 / 22);
                    s9Var.h.setPadding(0, 0, 0, i14 / 15);
                    int i16 = (int) (i14 * 0.65f);
                    s9Var.b.layout(org.telegram.messenger.g0.L(36.0f), i16, s9Var.b.getMeasuredWidth() + org.telegram.messenger.g0.L(36.0f), s9Var.b.getMeasuredHeight() + i16);
                } else {
                    kVar = ((org.telegram.ui.ActionBar.f2) s9Var).actionBar;
                    kVar2 = ((org.telegram.ui.ActionBar.f2) s9Var).actionBar;
                    int measuredWidth = kVar2.getMeasuredWidth();
                    kVar3 = ((org.telegram.ui.ActionBar.f2) s9Var).actionBar;
                    kVar.layout(0, 0, measuredWidth, kVar3.getMeasuredHeight());
                    CameraView cameraView2 = s9Var.d;
                    if (cameraView2 != null) {
                        cameraView2.layout(0, 0, cameraView2.getMeasuredWidth(), s9Var.d.getMeasuredHeight());
                    }
                    int min = (int) (Math.min(i13, i14) / 1.5f);
                    if (i15 == 1) {
                        measuredHeight = ((i14 - min) / 2) - s9Var.b.getMeasuredHeight();
                        L = org.telegram.messenger.g0.L(30.0f);
                    } else {
                        measuredHeight = ((i14 - min) / 2) - s9Var.b.getMeasuredHeight();
                        L = org.telegram.messenger.g0.L(64.0f);
                    }
                    int i17 = measuredHeight - L;
                    s9Var.b.layout(org.telegram.messenger.g0.L(36.0f), i17, s9Var.b.getMeasuredWidth() + org.telegram.messenger.g0.L(36.0f), s9Var.b.getMeasuredHeight() + i17);
                    if (i15 == 3) {
                        int C = org.telegram.messenger.k5.C(8.0f, s9Var.b.getMeasuredHeight(), i17);
                        s9Var.c.layout(org.telegram.messenger.g0.L(36.0f), C, s9Var.c.getMeasuredWidth() + org.telegram.messenger.g0.L(36.0f), s9Var.c.getMeasuredHeight() + C);
                    }
                    s9Var.h.layout(0, getMeasuredHeight() - s9Var.h.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    int measuredWidth2 = (i13 / 2) - (s9Var.s.getMeasuredWidth() / 2);
                    int L2 = org.telegram.messenger.g0.L(80.0f) + jg.g.D(i14, min, 2, min);
                    ImageView imageView = s9Var.s;
                    imageView.layout(measuredWidth2, L2, imageView.getMeasuredWidth() + measuredWidth2, s9Var.s.getMeasuredHeight() + L2);
                }
                if (i15 != 3) {
                    int i18 = (int) (i14 * 0.74f);
                    int i19 = (int) (i13 * 0.05f);
                    TextView textView = s9Var.c;
                    textView.layout(i19, i18, textView.getMeasuredWidth() + i19, s9Var.c.getMeasuredHeight() + i18);
                }
                s9Var.m0();
                break;
            default:
                ya1 ya1Var = (ya1) this.c;
                kVar4 = ((org.telegram.ui.ActionBar.f2) ya1Var).actionBar;
                kVar5 = ((org.telegram.ui.ActionBar.f2) ya1Var).actionBar;
                int measuredWidth3 = kVar5.getMeasuredWidth();
                kVar6 = ((org.telegram.ui.ActionBar.f2) ya1Var).actionBar;
                kVar4.layout(0, 0, measuredWidth3, kVar6.getMeasuredHeight());
                fi.p5 p5Var = ya1Var.D;
                p5Var.layout(0, 0, p5Var.getMeasuredWidth(), ya1Var.D.getMeasuredHeight());
                gi0 gi0Var = (gi0) this.b;
                gi0Var.layout(0, 0, gi0Var.getMeasuredWidth(), gi0Var.getMeasuredHeight());
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                s9 s9Var = (s9) this.c;
                kVar = ((org.telegram.ui.ActionBar.f2) s9Var).actionBar;
                kVar.measure(i7, i10);
                int i11 = s9Var.W;
                if (i11 == 0) {
                    CameraView cameraView = s9Var.d;
                    if (cameraView != null) {
                        cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), TLObject.FLAG_30));
                    }
                } else {
                    CameraView cameraView2 = s9Var.d;
                    if (cameraView2 != null) {
                        cameraView2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    }
                    s9Var.h.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    s9Var.s.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), TLObject.FLAG_30));
                }
                s9Var.b.measure(org.telegram.messenger.camera.q.c(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                if (i11 == 3) {
                    s9Var.c.measure(org.telegram.messenger.camera.q.c(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                } else {
                    s9Var.c.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                int size3 = View.MeasureSpec.getSize(i7);
                int size4 = View.MeasureSpec.getSize(i10);
                ya1 ya1Var = (ya1) this.c;
                kVar2 = ((org.telegram.ui.ActionBar.f2) ya1Var).actionBar;
                kVar2.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i10);
                fi.p5 p5Var = ya1Var.D;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
                kVar3 = ((org.telegram.ui.ActionBar.f2) ya1Var).actionBar;
                p5Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(3.0f) + kVar3.getMeasuredHeight(), TLObject.FLAG_30));
                ((gi0) this.b).measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i10);
                setMeasuredDimension(size3, size4);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(ya1 ya1Var, Context context, gi0 gi0Var) {
        super(context);
        this.c = ya1Var;
        this.b = gi0Var;
    }
}
