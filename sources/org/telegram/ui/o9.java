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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o9 extends ViewGroup {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(r9 r9Var, Context context) {
        super(context);
        this.c = r9Var;
        this.b = new Path();
    }

    public static RectF a(int i10, int i11, int i12) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        return rectF;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                Path path = (Path) this.b;
                boolean drawChild = super.drawChild(canvas, view, j10);
                r9 r9Var = (r9) this.c;
                Paint paint = r9Var.n;
                Paint paint2 = r9Var.h;
                if (!r9Var.a0() || view != r9Var.c) {
                    return drawChild;
                }
                float min = Math.min(1.0f, Math.max(0.0f, (SystemClock.elapsedRealtime() - r9Var.G) / 75.0f));
                if (min < 1.0f) {
                    r9Var.fragmentView.invalidate();
                }
                RectF rectF = r9Var.E;
                RectF rectF2 = r9Var.F;
                RectF rectF3 = AndroidUtilities.rectTmp;
                AndroidUtilities.lerp(rectF, rectF2, min, rectF3);
                if (r9Var.W < 1.0f) {
                    if (r9Var.X == null) {
                        r9Var.h0();
                    }
                    AndroidUtilities.lerp(r9Var.X, rectF3, r9Var.W, rectF3);
                }
                int width = (int) (rectF3.width() * view.getWidth());
                int height = (int) (rectF3.height() * view.getHeight());
                int centerX = (int) (rectF3.centerX() * view.getWidth());
                int centerY = (int) (rectF3.centerY() * view.getHeight());
                float f9 = r9Var.y;
                float f10 = (f9 * 0.5f) + 0.5f;
                int i10 = (int) (width * f10);
                int i11 = (int) (f10 * height);
                int i12 = centerX - (i10 / 2);
                int i13 = centerY - (i11 / 2);
                paint2.setAlpha((int) ((1.0f - (Math.min(1.0f, f9) * (1.0f - r9Var.v))) * 255.0f));
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
                paint2.setAlpha((int) (Math.max(0.0f, 1.0f - r9Var.y) * 255.0f));
                canvas.drawRect(f13, f11, f14, f12, paint2);
                int lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), Math.min(1.0f, r9Var.y * 20.0f));
                int i16 = lerp / 2;
                int lerp2 = AndroidUtilities.lerp(Math.min(i10, i11), AndroidUtilities.dp(20.0f), Math.min(1.2f, (float) Math.pow(r9Var.y, 1.7999999523162842d)));
                paint.setAlpha((int) (Math.min(1.0f, r9Var.y) * 255.0f));
                path.reset();
                int i17 = i13 + lerp2;
                path.arcTo(a(i12, i17, i16), 0.0f, 180.0f);
                float f15 = lerp * 1.5f;
                int i18 = (int) (f13 + f15);
                int i19 = (int) (f11 + f15);
                int i20 = lerp * 2;
                path.arcTo(a(i18, i19, i20), 180.0f, 90.0f);
                int i21 = i12 + lerp2;
                path.arcTo(a(i21, i13, i16), 270.0f, 180.0f);
                path.lineTo(i12 + i16, i13 + i16);
                path.arcTo(a(i18, i19, lerp), 270.0f, -90.0f);
                path.close();
                canvas.drawPath(path, paint);
                path.reset();
                path.arcTo(a(i15, i17, i16), 180.0f, -180.0f);
                int i22 = (int) (f14 - f15);
                path.arcTo(a(i22, i19, i20), 0.0f, -90.0f);
                int i23 = i15 - lerp2;
                path.arcTo(a(i23, i13, i16), 270.0f, -180.0f);
                path.arcTo(a(i22, i19, lerp), 270.0f, 90.0f);
                path.close();
                canvas.drawPath(path, paint);
                path.reset();
                int i24 = i14 - lerp2;
                path.arcTo(a(i12, i24, i16), 0.0f, -180.0f);
                int i25 = (int) (f12 - f15);
                path.arcTo(a(i18, i25, i20), 180.0f, -90.0f);
                path.arcTo(a(i21, i14, i16), 90.0f, -180.0f);
                path.arcTo(a(i18, i25, lerp), 90.0f, 90.0f);
                path.close();
                canvas.drawPath(path, paint);
                path.reset();
                path.arcTo(a(i15, i24, i16), 180.0f, 180.0f);
                path.arcTo(a(i22, i25, i20), 0.0f, 90.0f);
                path.arcTo(a(i23, i14, i16), 90.0f, 180.0f);
                path.arcTo(a(i22, i25, lerp), 90.0f, -90.0f);
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
        int dp;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        switch (this.a) {
            case 0:
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                r9 r9Var = (r9) this.c;
                int i16 = r9Var.R;
                if (i16 == 0) {
                    CameraView cameraView = r9Var.c;
                    if (cameraView != null) {
                        cameraView.layout(0, 0, cameraView.getMeasuredWidth(), r9Var.c.getMeasuredHeight());
                    }
                    r9Var.f.setTextSize(0, i15 / 22);
                    r9Var.f.setPadding(0, 0, 0, i15 / 15);
                    int i17 = (int) (i15 * 0.65f);
                    r9Var.a.layout(AndroidUtilities.dp(36.0f), i17, r9Var.a.getMeasuredWidth() + AndroidUtilities.dp(36.0f), r9Var.a.getMeasuredHeight() + i17);
                } else {
                    lVar = ((org.telegram.ui.ActionBar.o2) r9Var).actionBar;
                    lVar2 = ((org.telegram.ui.ActionBar.o2) r9Var).actionBar;
                    int measuredWidth = lVar2.getMeasuredWidth();
                    lVar3 = ((org.telegram.ui.ActionBar.o2) r9Var).actionBar;
                    lVar.layout(0, 0, measuredWidth, lVar3.getMeasuredHeight());
                    CameraView cameraView2 = r9Var.c;
                    if (cameraView2 != null) {
                        cameraView2.layout(0, 0, cameraView2.getMeasuredWidth(), r9Var.c.getMeasuredHeight());
                    }
                    int min = (int) (Math.min(i14, i15) / 1.5f);
                    if (i16 == 1) {
                        measuredHeight = ((i15 - min) / 2) - r9Var.a.getMeasuredHeight();
                        dp = AndroidUtilities.dp(30.0f);
                    } else {
                        measuredHeight = ((i15 - min) / 2) - r9Var.a.getMeasuredHeight();
                        dp = AndroidUtilities.dp(64.0f);
                    }
                    int i18 = measuredHeight - dp;
                    r9Var.a.layout(AndroidUtilities.dp(36.0f), i18, r9Var.a.getMeasuredWidth() + AndroidUtilities.dp(36.0f), r9Var.a.getMeasuredHeight() + i18);
                    if (i16 == 3) {
                        int C = org.telegram.messenger.x3.C(8.0f, r9Var.a.getMeasuredHeight(), i18);
                        r9Var.b.layout(AndroidUtilities.dp(36.0f), C, r9Var.b.getMeasuredWidth() + AndroidUtilities.dp(36.0f), r9Var.b.getMeasuredHeight() + C);
                    }
                    r9Var.f.layout(0, getMeasuredHeight() - r9Var.f.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    int measuredWidth2 = (i14 / 2) - (r9Var.r.getMeasuredWidth() / 2);
                    int dp2 = AndroidUtilities.dp(80.0f) + j7.l1.e(i15, min, 2, min);
                    ImageView imageView = r9Var.r;
                    imageView.layout(measuredWidth2, dp2, imageView.getMeasuredWidth() + measuredWidth2, r9Var.r.getMeasuredHeight() + dp2);
                }
                if (i16 != 3) {
                    int i19 = (int) (i15 * 0.74f);
                    int i20 = (int) (i14 * 0.05f);
                    TextView textView = r9Var.b;
                    textView.layout(i20, i19, textView.getMeasuredWidth() + i20, r9Var.b.getMeasuredHeight() + i19);
                }
                r9Var.h0();
                break;
            default:
                cg1 cg1Var = (cg1) this.c;
                lVar4 = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
                lVar5 = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
                int measuredWidth3 = lVar5.getMeasuredWidth();
                lVar6 = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
                lVar4.layout(0, 0, measuredWidth3, lVar6.getMeasuredHeight());
                cg.i0 i0Var = cg1Var.y;
                i0Var.layout(0, 0, i0Var.getMeasuredWidth(), cg1Var.y.getMeasuredHeight());
                org.telegram.ui.Components.s90 s90Var = (org.telegram.ui.Components.s90) this.b;
                s90Var.layout(0, 0, s90Var.getMeasuredWidth(), s90Var.getMeasuredHeight());
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
                r9 r9Var = (r9) this.c;
                lVar = ((org.telegram.ui.ActionBar.o2) r9Var).actionBar;
                lVar.measure(i10, i11);
                int i12 = r9Var.R;
                if (i12 == 0) {
                    CameraView cameraView = r9Var.c;
                    if (cameraView != null) {
                        cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), TLObject.FLAG_30));
                    }
                } else {
                    CameraView cameraView2 = r9Var.c;
                    if (cameraView2 != null) {
                        cameraView2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    }
                    r9Var.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    r9Var.r.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30));
                }
                r9Var.a.measure(b.d(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                if (i12 == 3) {
                    r9Var.b.measure(b.d(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                } else {
                    r9Var.b.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                cg1 cg1Var = (cg1) this.c;
                lVar2 = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
                lVar2.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i11);
                cg.i0 i0Var = cg1Var.y;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
                lVar3 = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
                i0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(3.0f) + lVar3.getMeasuredHeight(), TLObject.FLAG_30));
                ((org.telegram.ui.Components.s90) this.b).measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i11);
                setMeasuredDimension(size3, size4);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(cg1 cg1Var, Context context, org.telegram.ui.Components.s90 s90Var) {
        super(context);
        this.c = cg1Var;
        this.b = s90Var;
    }
}
