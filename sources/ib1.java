// default package

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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ib1 extends ViewGroup {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final /* synthetic */ d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib1(lb1 lb1Var, Context context) {
        super(context);
        this.c = lb1Var;
        this.b = new Path();
    }

    public static RectF a(int i, int i2, int i3) {
        RectF rectF = gm.P;
        rectF.set(i - i3, i2 - i3, i + i3, i2 + i3);
        return rectF;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 0:
                Path path = (Path) this.b;
                boolean drawChild = super.drawChild(canvas, view, j);
                lb1 lb1Var = (lb1) this.c;
                Paint paint = lb1Var.r;
                Paint paint2 = lb1Var.n;
                if (!lb1Var.f0() || view != lb1Var.d) {
                    return drawChild;
                }
                float min = Math.min(1.0f, Math.max(0.0f, (SystemClock.elapsedRealtime() - lb1Var.M) / 75.0f));
                if (min < 1.0f) {
                    lb1Var.fragmentView.invalidate();
                }
                RectF rectF = lb1Var.K;
                RectF rectF2 = lb1Var.L;
                RectF rectF3 = gm.P;
                gm.X1(rectF, rectF2, min, rectF3);
                if (lb1Var.c0 < 1.0f) {
                    if (lb1Var.d0 == null) {
                        lb1Var.m0();
                    }
                    gm.X1(lb1Var.d0, rectF3, lb1Var.c0, rectF3);
                }
                int width = (int) (rectF3.width() * view.getWidth());
                int height = (int) (rectF3.height() * view.getHeight());
                int centerX = (int) (rectF3.centerX() * view.getWidth());
                int centerY = (int) (rectF3.centerY() * view.getHeight());
                float f = lb1Var.F;
                float f2 = (f * 0.5f) + 0.5f;
                int i = (int) (width * f2);
                int i2 = (int) (f2 * height);
                int i3 = centerX - (i / 2);
                int i4 = centerY - (i2 / 2);
                paint2.setAlpha((int) ((1.0f - (Math.min(1.0f, f) * (1.0f - lb1Var.x))) * 255.0f));
                float f3 = i4;
                canvas.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), f3, paint2);
                int i5 = i4 + i2;
                float f4 = i5;
                canvas.drawRect(0.0f, f4, view.getMeasuredWidth(), view.getMeasuredHeight(), paint2);
                float f5 = i3;
                canvas.drawRect(0.0f, f3, f5, f4, paint2);
                int i6 = i3 + i;
                float f6 = i6;
                canvas.drawRect(f6, f3, view.getMeasuredWidth(), f4, paint2);
                paint2.setAlpha((int) (Math.max(0.0f, 1.0f - lb1Var.F) * 255.0f));
                canvas.drawRect(f5, f3, f6, f4, paint2);
                int U1 = gm.U1(Math.min(1.0f, lb1Var.F * 20.0f), 0, gm.L(4.0f));
                int i7 = U1 / 2;
                int U12 = gm.U1(Math.min(1.2f, (float) Math.pow(lb1Var.F, 1.7999999523162842d)), Math.min(i, i2), gm.L(20.0f));
                paint.setAlpha((int) (Math.min(1.0f, lb1Var.F) * 255.0f));
                path.reset();
                int i8 = i4 + U12;
                path.arcTo(a(i3, i8, i7), 0.0f, 180.0f);
                float f7 = U1 * 1.5f;
                int i9 = (int) (f5 + f7);
                int i10 = (int) (f3 + f7);
                int i11 = U1 << 1;
                path.arcTo(a(i9, i10, i11), 180.0f, 90.0f);
                int i12 = i3 + U12;
                path.arcTo(a(i12, i4, i7), 270.0f, 180.0f);
                path.lineTo(i3 + i7, i4 + i7);
                path.arcTo(a(i9, i10, U1), 270.0f, -90.0f);
                path.close();
                canvas.drawPath(path, paint);
                path.reset();
                path.arcTo(a(i6, i8, i7), 180.0f, -180.0f);
                int i13 = (int) (f6 - f7);
                path.arcTo(a(i13, i10, i11), 0.0f, -90.0f);
                int i14 = i6 - U12;
                path.arcTo(a(i14, i4, i7), 270.0f, -180.0f);
                path.arcTo(a(i13, i10, U1), 270.0f, 90.0f);
                path.close();
                canvas.drawPath(path, paint);
                path.reset();
                int i15 = i5 - U12;
                path.arcTo(a(i3, i15, i7), 0.0f, -180.0f);
                int i16 = (int) (f4 - f7);
                path.arcTo(a(i9, i16, i11), 180.0f, -90.0f);
                path.arcTo(a(i12, i5, i7), 90.0f, -180.0f);
                path.arcTo(a(i9, i16, U1), 90.0f, 90.0f);
                path.close();
                canvas.drawPath(path, paint);
                path.reset();
                path.arcTo(a(i6, i15, i7), 180.0f, 180.0f);
                path.arcTo(a(i13, i16, i11), 0.0f, 90.0f);
                path.arcTo(a(i14, i5, i7), 90.0f, 180.0f);
                path.arcTo(a(i13, i16, U1), 90.0f, -90.0f);
                path.close();
                canvas.drawPath(path, paint);
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a aVar;
        a aVar2;
        a aVar3;
        int measuredHeight;
        int L;
        a aVar4;
        a aVar5;
        a aVar6;
        byte b = this.a;
        d dVar = this.c;
        switch (b) {
            case 0:
                int i5 = i3 - i;
                int i6 = i4 - i2;
                lb1 lb1Var = (lb1) dVar;
                byte b2 = lb1Var.X;
                if (b2 == 0) {
                    CameraView cameraView = lb1Var.d;
                    if (cameraView != null) {
                        cameraView.layout(0, 0, cameraView.getMeasuredWidth(), lb1Var.d.getMeasuredHeight());
                    }
                    lb1Var.h.setTextSize(0, i6 / 22);
                    lb1Var.h.setPadding(0, 0, 0, i6 / 15);
                    int i7 = (int) (i6 * 0.65f);
                    lb1Var.b.layout(gm.L(36.0f), i7, lb1Var.b.getMeasuredWidth() + gm.L(36.0f), lb1Var.b.getMeasuredHeight() + i7);
                } else {
                    aVar = ((d) lb1Var).actionBar;
                    aVar2 = ((d) lb1Var).actionBar;
                    int measuredWidth = aVar2.getMeasuredWidth();
                    aVar3 = ((d) lb1Var).actionBar;
                    aVar.layout(0, 0, measuredWidth, aVar3.getMeasuredHeight());
                    CameraView cameraView2 = lb1Var.d;
                    if (cameraView2 != null) {
                        cameraView2.layout(0, 0, cameraView2.getMeasuredWidth(), lb1Var.d.getMeasuredHeight());
                    }
                    int min = (int) (Math.min(i5, i6) / 1.5f);
                    jb1 jb1Var = lb1Var.b;
                    if (b2 == 1) {
                        measuredHeight = ((i6 - min) / 2) - jb1Var.getMeasuredHeight();
                        L = gm.L(30.0f);
                    } else {
                        measuredHeight = ((i6 - min) / 2) - jb1Var.getMeasuredHeight();
                        L = gm.L(64.0f);
                    }
                    int i8 = measuredHeight - L;
                    lb1Var.b.layout(gm.L(36.0f), i8, lb1Var.b.getMeasuredWidth() + gm.L(36.0f), lb1Var.b.getMeasuredHeight() + i8);
                    if (b2 == 3) {
                        int v = hg9.v(8.0f, lb1Var.b.getMeasuredHeight(), i8);
                        lb1Var.c.layout(gm.L(36.0f), v, lb1Var.c.getMeasuredWidth() + gm.L(36.0f), lb1Var.c.getMeasuredHeight() + v);
                    }
                    lb1Var.h.layout(0, getMeasuredHeight() - lb1Var.h.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    int measuredWidth2 = (i5 / 2) - (lb1Var.s.getMeasuredWidth() / 2);
                    int L2 = gm.L(80.0f) + wi8.g(i6, min, 2, min);
                    ImageView imageView = lb1Var.s;
                    imageView.layout(measuredWidth2, L2, imageView.getMeasuredWidth() + measuredWidth2, lb1Var.s.getMeasuredHeight() + L2);
                }
                if (b2 != 3) {
                    int i9 = (int) (i6 * 0.74f);
                    int i10 = (int) (i5 * 0.05f);
                    TextView textView = lb1Var.c;
                    textView.layout(i10, i9, textView.getMeasuredWidth() + i10, lb1Var.c.getMeasuredHeight() + i9);
                }
                lb1Var.m0();
                break;
            default:
                p5c p5cVar = (p5c) dVar;
                aVar4 = ((d) p5cVar).actionBar;
                aVar5 = ((d) p5cVar).actionBar;
                int measuredWidth3 = aVar5.getMeasuredWidth();
                aVar6 = ((d) p5cVar).actionBar;
                aVar4.layout(0, 0, measuredWidth3, aVar6.getMeasuredHeight());
                a91 a91Var = p5cVar.E;
                a91Var.layout(0, 0, a91Var.getMeasuredWidth(), p5cVar.E.getMeasuredHeight());
                jx7 jx7Var = (jx7) this.b;
                jx7Var.layout(0, 0, jx7Var.getMeasuredWidth(), jx7Var.getMeasuredHeight());
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        a aVar;
        a aVar2;
        a aVar3;
        byte b = this.a;
        d dVar = this.c;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                lb1 lb1Var = (lb1) dVar;
                aVar = ((d) lb1Var).actionBar;
                aVar.measure(i, i2);
                byte b2 = lb1Var.X;
                CameraView cameraView = lb1Var.d;
                if (b2 != 0) {
                    if (cameraView != null) {
                        cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    }
                    lb1Var.h.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    lb1Var.s.measure(View.MeasureSpec.makeMeasureSpec(gm.L(60.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(60.0f), TLObject.FLAG_30));
                } else if (cameraView != null) {
                    cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), TLObject.FLAG_30));
                }
                lb1Var.b.measure(wi8.f(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                TextView textView = lb1Var.c;
                if (b2 == 3) {
                    textView.measure(wi8.f(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                } else {
                    textView.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                int size3 = View.MeasureSpec.getSize(i);
                int size4 = View.MeasureSpec.getSize(i2);
                p5c p5cVar = (p5c) dVar;
                aVar2 = ((d) p5cVar).actionBar;
                aVar2.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i2);
                a91 a91Var = p5cVar.E;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
                aVar3 = ((d) p5cVar).actionBar;
                a91Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gm.L(3.0f) + aVar3.getMeasuredHeight(), TLObject.FLAG_30));
                ((jx7) this.b).measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i2);
                setMeasuredDimension(size3, size4);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib1(p5c p5cVar, Context context, jx7 jx7Var) {
        super(context);
        this.c = p5cVar;
        this.b = jx7Var;
    }
}
