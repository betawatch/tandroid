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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q9 extends ViewGroup {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(u9 u9Var, Context context) {
        super(context);
        this.c = u9Var;
        this.b = new Path();
    }

    public static RectF a(int i10, int i11, int i12) {
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        return rectF;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                Path path = (Path) this.b;
                boolean drawChild = super.drawChild(canvas, view, j10);
                u9 u9Var = (u9) this.c;
                Paint paint = u9Var.r;
                Paint paint2 = u9Var.n;
                if (!u9Var.e0() || view != u9Var.d) {
                    return drawChild;
                }
                float min = Math.min(1.0f, Math.max(0.0f, (SystemClock.elapsedRealtime() - u9Var.L) / 75.0f));
                if (min < 1.0f) {
                    u9Var.fragmentView.invalidate();
                }
                RectF rectF = u9Var.J;
                RectF rectF2 = u9Var.K;
                RectF rectF3 = org.telegram.messenger.i0.P;
                org.telegram.messenger.i0.Z1(rectF, rectF2, min, rectF3);
                if (u9Var.b0 < 1.0f) {
                    if (u9Var.c0 == null) {
                        u9Var.l0();
                    }
                    org.telegram.messenger.i0.Z1(u9Var.c0, rectF3, u9Var.b0, rectF3);
                }
                int width = (int) (rectF3.width() * view.getWidth());
                int height = (int) (rectF3.height() * view.getHeight());
                int centerX = (int) (rectF3.centerX() * view.getWidth());
                int centerY = (int) (rectF3.centerY() * view.getHeight());
                float f7 = u9Var.E;
                float f10 = (f7 * 0.5f) + 0.5f;
                int i10 = (int) (width * f10);
                int i11 = (int) (f10 * height);
                int i12 = centerX - (i10 / 2);
                int i13 = centerY - (i11 / 2);
                paint2.setAlpha((int) ((1.0f - (Math.min(1.0f, f7) * (1.0f - u9Var.x))) * 255.0f));
                float f11 = i13;
                canvas.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), f11, paint2);
                int i14 = i13 + i11;
                float f12 = i14;
                canvas.drawRect(0.0f, f12, view.getMeasuredWidth(), view.getMeasuredHeight(), paint2);
                float f13 = i12;
                canvas.drawRect(0.0f, f11, f13, f12, paint2);
                int i15 = i12 + i10;
                float f14 = i15;
                canvas.drawRect(f14, f11, view.getMeasuredWidth(), f12, paint2);
                paint2.setAlpha((int) (Math.max(0.0f, 1.0f - u9Var.E) * 255.0f));
                canvas.drawRect(f13, f11, f14, f12, paint2);
                int W1 = org.telegram.messenger.i0.W1(Math.min(1.0f, u9Var.E * 20.0f), 0, org.telegram.messenger.i0.L(4.0f));
                int i16 = W1 / 2;
                int W12 = org.telegram.messenger.i0.W1(Math.min(1.2f, (float) Math.pow(u9Var.E, 1.7999999523162842d)), Math.min(i10, i11), org.telegram.messenger.i0.L(20.0f));
                paint.setAlpha((int) (Math.min(1.0f, u9Var.E) * 255.0f));
                path.reset();
                int i17 = i13 + W12;
                path.arcTo(a(i12, i17, i16), 0.0f, 180.0f);
                float f15 = W1 * 1.5f;
                int i18 = (int) (f13 + f15);
                int i19 = (int) (f11 + f15);
                int i20 = W1 * 2;
                path.arcTo(a(i18, i19, i20), 180.0f, 90.0f);
                int i21 = i12 + W12;
                path.arcTo(a(i21, i13, i16), 270.0f, 180.0f);
                path.lineTo(i12 + i16, i13 + i16);
                path.arcTo(a(i18, i19, W1), 270.0f, -90.0f);
                path.close();
                canvas.drawPath(path, paint);
                path.reset();
                path.arcTo(a(i15, i17, i16), 180.0f, -180.0f);
                int i22 = (int) (f14 - f15);
                path.arcTo(a(i22, i19, i20), 0.0f, -90.0f);
                int i23 = i15 - W12;
                path.arcTo(a(i23, i13, i16), 270.0f, -180.0f);
                path.arcTo(a(i22, i19, W1), 270.0f, 90.0f);
                path.close();
                canvas.drawPath(path, paint);
                path.reset();
                int i24 = i14 - W12;
                path.arcTo(a(i12, i24, i16), 0.0f, -180.0f);
                int i25 = (int) (f12 - f15);
                path.arcTo(a(i18, i25, i20), 180.0f, -90.0f);
                path.arcTo(a(i21, i14, i16), 90.0f, -180.0f);
                path.arcTo(a(i18, i25, W1), 90.0f, 90.0f);
                path.close();
                canvas.drawPath(path, paint);
                path.reset();
                path.arcTo(a(i15, i24, i16), 180.0f, 180.0f);
                path.arcTo(a(i22, i25, i20), 0.0f, 90.0f);
                path.arcTo(a(i23, i14, i16), 90.0f, 180.0f);
                path.arcTo(a(i22, i25, W1), 90.0f, -90.0f);
                path.close();
                canvas.drawPath(path, paint);
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        int measuredHeight;
        int L;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        switch (this.a) {
            case 0:
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                u9 u9Var = (u9) this.c;
                int i16 = u9Var.W;
                if (i16 == 0) {
                    CameraView cameraView = u9Var.d;
                    if (cameraView != null) {
                        cameraView.layout(0, 0, cameraView.getMeasuredWidth(), u9Var.d.getMeasuredHeight());
                    }
                    u9Var.h.setTextSize(0, i15 / 22);
                    u9Var.h.setPadding(0, 0, 0, i15 / 15);
                    int i17 = (int) (i15 * 0.65f);
                    u9Var.b.layout(org.telegram.messenger.i0.L(36.0f), i17, u9Var.b.getMeasuredWidth() + org.telegram.messenger.i0.L(36.0f), u9Var.b.getMeasuredHeight() + i17);
                } else {
                    lVar = ((org.telegram.ui.ActionBar.k2) u9Var).actionBar;
                    lVar2 = ((org.telegram.ui.ActionBar.k2) u9Var).actionBar;
                    int measuredWidth = lVar2.getMeasuredWidth();
                    lVar3 = ((org.telegram.ui.ActionBar.k2) u9Var).actionBar;
                    lVar.layout(0, 0, measuredWidth, lVar3.getMeasuredHeight());
                    CameraView cameraView2 = u9Var.d;
                    if (cameraView2 != null) {
                        cameraView2.layout(0, 0, cameraView2.getMeasuredWidth(), u9Var.d.getMeasuredHeight());
                    }
                    int min = (int) (Math.min(i14, i15) / 1.5f);
                    if (i16 == 1) {
                        measuredHeight = ((i15 - min) / 2) - u9Var.b.getMeasuredHeight();
                        L = org.telegram.messenger.i0.L(30.0f);
                    } else {
                        measuredHeight = ((i15 - min) / 2) - u9Var.b.getMeasuredHeight();
                        L = org.telegram.messenger.i0.L(64.0f);
                    }
                    int i18 = measuredHeight - L;
                    u9Var.b.layout(org.telegram.messenger.i0.L(36.0f), i18, u9Var.b.getMeasuredWidth() + org.telegram.messenger.i0.L(36.0f), u9Var.b.getMeasuredHeight() + i18);
                    if (i16 == 3) {
                        int C = org.telegram.messenger.m5.C(8.0f, u9Var.b.getMeasuredHeight(), i18);
                        u9Var.c.layout(org.telegram.messenger.i0.L(36.0f), C, u9Var.c.getMeasuredWidth() + org.telegram.messenger.i0.L(36.0f), u9Var.c.getMeasuredHeight() + C);
                    }
                    u9Var.h.layout(0, getMeasuredHeight() - u9Var.h.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    int measuredWidth2 = (i14 / 2) - (u9Var.s.getMeasuredWidth() / 2);
                    int L2 = org.telegram.messenger.i0.L(80.0f) + i0.a.u(i15, min, 2, min);
                    ImageView imageView = u9Var.s;
                    imageView.layout(measuredWidth2, L2, imageView.getMeasuredWidth() + measuredWidth2, u9Var.s.getMeasuredHeight() + L2);
                }
                if (i16 != 3) {
                    int i19 = (int) (i15 * 0.74f);
                    int i20 = (int) (i14 * 0.05f);
                    TextView textView = u9Var.c;
                    textView.layout(i20, i19, textView.getMeasuredWidth() + i20, u9Var.c.getMeasuredHeight() + i19);
                }
                u9Var.l0();
                break;
            default:
                tc1 tc1Var = (tc1) this.c;
                lVar4 = ((org.telegram.ui.ActionBar.k2) tc1Var).actionBar;
                lVar5 = ((org.telegram.ui.ActionBar.k2) tc1Var).actionBar;
                int measuredWidth3 = lVar5.getMeasuredWidth();
                lVar6 = ((org.telegram.ui.ActionBar.k2) tc1Var).actionBar;
                lVar4.layout(0, 0, measuredWidth3, lVar6.getMeasuredHeight());
                kg.f0 f0Var = tc1Var.D;
                f0Var.layout(0, 0, f0Var.getMeasuredWidth(), tc1Var.D.getMeasuredHeight());
                oj0 oj0Var = (oj0) this.b;
                oj0Var.layout(0, 0, oj0Var.getMeasuredWidth(), oj0Var.getMeasuredHeight());
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                u9 u9Var = (u9) this.c;
                lVar = ((org.telegram.ui.ActionBar.k2) u9Var).actionBar;
                lVar.measure(i10, i11);
                int i12 = u9Var.W;
                if (i12 == 0) {
                    CameraView cameraView = u9Var.d;
                    if (cameraView != null) {
                        cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), TLObject.FLAG_30));
                    }
                } else {
                    CameraView cameraView2 = u9Var.d;
                    if (cameraView2 != null) {
                        cameraView2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    }
                    u9Var.h.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    u9Var.s.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), TLObject.FLAG_30));
                }
                u9Var.b.measure(org.telegram.messenger.z20.c(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                if (i12 == 3) {
                    u9Var.c.measure(org.telegram.messenger.z20.c(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                } else {
                    u9Var.c.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                tc1 tc1Var = (tc1) this.c;
                lVar2 = ((org.telegram.ui.ActionBar.k2) tc1Var).actionBar;
                lVar2.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i11);
                kg.f0 f0Var = tc1Var.D;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
                lVar3 = ((org.telegram.ui.ActionBar.k2) tc1Var).actionBar;
                f0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(3.0f) + lVar3.getMeasuredHeight(), TLObject.FLAG_30));
                ((oj0) this.b).measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i11);
                setMeasuredDimension(size3, size4);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(tc1 tc1Var, Context context, oj0 oj0Var) {
        super(context);
        this.c = tc1Var;
        this.b = oj0Var;
    }
}
