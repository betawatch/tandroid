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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ia1 extends ViewGroup {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final /* synthetic */ e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia1(la1 la1Var, Context context) {
        super(context);
        this.c = la1Var;
        this.b = new Path();
    }

    public static RectF a(int i, int i2, int i3) {
        RectF rectF = hl.P;
        rectF.set(i - i3, i2 - i3, i + i3, i2 + i3);
        return rectF;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 0:
                Path path = (Path) this.b;
                boolean drawChild = super.drawChild(canvas, view, j);
                la1 la1Var = (la1) this.c;
                Paint paint = la1Var.r;
                Paint paint2 = la1Var.n;
                if (!la1Var.e0() || view != la1Var.d) {
                    return drawChild;
                }
                float min = Math.min(1.0f, Math.max(0.0f, (SystemClock.elapsedRealtime() - la1Var.M) / 75.0f));
                if (min < 1.0f) {
                    la1Var.fragmentView.invalidate();
                }
                RectF rectF = la1Var.K;
                RectF rectF2 = la1Var.L;
                RectF rectF3 = hl.P;
                hl.X1(rectF, rectF2, min, rectF3);
                if (la1Var.c0 < 1.0f) {
                    if (la1Var.d0 == null) {
                        la1Var.l0();
                    }
                    hl.X1(la1Var.d0, rectF3, la1Var.c0, rectF3);
                }
                int width = (int) (rectF3.width() * view.getWidth());
                int height = (int) (rectF3.height() * view.getHeight());
                int centerX = (int) (rectF3.centerX() * view.getWidth());
                int centerY = (int) (rectF3.centerY() * view.getHeight());
                float f = la1Var.F;
                float f2 = (f * 0.5f) + 0.5f;
                int i = (int) (width * f2);
                int i2 = (int) (f2 * height);
                int i3 = centerX - (i / 2);
                int i4 = centerY - (i2 / 2);
                paint2.setAlpha((int) ((1.0f - (Math.min(1.0f, f) * (1.0f - la1Var.x))) * 255.0f));
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
                paint2.setAlpha((int) (Math.max(0.0f, 1.0f - la1Var.F) * 255.0f));
                canvas.drawRect(f5, f3, f6, f4, paint2);
                int U1 = hl.U1(Math.min(1.0f, la1Var.F * 20.0f), 0, hl.L(4.0f));
                int i7 = U1 / 2;
                int U12 = hl.U1(Math.min(1.2f, (float) Math.pow(la1Var.F, 1.7999999523162842d)), Math.min(i, i2), hl.L(20.0f));
                paint.setAlpha((int) (Math.min(1.0f, la1Var.F) * 255.0f));
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
        e eVar = this.c;
        switch (b) {
            case 0:
                int i5 = i3 - i;
                int i6 = i4 - i2;
                la1 la1Var = (la1) eVar;
                byte b2 = la1Var.X;
                if (b2 == 0) {
                    CameraView cameraView = la1Var.d;
                    if (cameraView != null) {
                        cameraView.layout(0, 0, cameraView.getMeasuredWidth(), la1Var.d.getMeasuredHeight());
                    }
                    la1Var.h.setTextSize(0, i6 / 22);
                    la1Var.h.setPadding(0, 0, 0, i6 / 15);
                    int i7 = (int) (i6 * 0.65f);
                    la1Var.b.layout(hl.L(36.0f), i7, la1Var.b.getMeasuredWidth() + hl.L(36.0f), la1Var.b.getMeasuredHeight() + i7);
                } else {
                    aVar = ((e) la1Var).actionBar;
                    aVar2 = ((e) la1Var).actionBar;
                    int measuredWidth = aVar2.getMeasuredWidth();
                    aVar3 = ((e) la1Var).actionBar;
                    aVar.layout(0, 0, measuredWidth, aVar3.getMeasuredHeight());
                    CameraView cameraView2 = la1Var.d;
                    if (cameraView2 != null) {
                        cameraView2.layout(0, 0, cameraView2.getMeasuredWidth(), la1Var.d.getMeasuredHeight());
                    }
                    int min = (int) (Math.min(i5, i6) / 1.5f);
                    ja1 ja1Var = la1Var.b;
                    if (b2 == 1) {
                        measuredHeight = ((i6 - min) / 2) - ja1Var.getMeasuredHeight();
                        L = hl.L(30.0f);
                    } else {
                        measuredHeight = ((i6 - min) / 2) - ja1Var.getMeasuredHeight();
                        L = hl.L(64.0f);
                    }
                    int i8 = measuredHeight - L;
                    la1Var.b.layout(hl.L(36.0f), i8, la1Var.b.getMeasuredWidth() + hl.L(36.0f), la1Var.b.getMeasuredHeight() + i8);
                    if (b2 == 3) {
                        int w = uh9.w(8.0f, la1Var.b.getMeasuredHeight(), i8);
                        la1Var.c.layout(hl.L(36.0f), w, la1Var.c.getMeasuredWidth() + hl.L(36.0f), la1Var.c.getMeasuredHeight() + w);
                    }
                    la1Var.h.layout(0, getMeasuredHeight() - la1Var.h.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    int measuredWidth2 = (i5 / 2) - (la1Var.s.getMeasuredWidth() / 2);
                    int L2 = hl.L(80.0f) + ik8.g(i6, min, 2, min);
                    ImageView imageView = la1Var.s;
                    imageView.layout(measuredWidth2, L2, imageView.getMeasuredWidth() + measuredWidth2, la1Var.s.getMeasuredHeight() + L2);
                }
                if (b2 != 3) {
                    int i9 = (int) (i6 * 0.74f);
                    int i10 = (int) (i5 * 0.05f);
                    TextView textView = la1Var.c;
                    textView.layout(i10, i9, textView.getMeasuredWidth() + i10, la1Var.c.getMeasuredHeight() + i9);
                }
                la1Var.l0();
                break;
            default:
                o7c o7cVar = (o7c) eVar;
                aVar4 = ((e) o7cVar).actionBar;
                aVar5 = ((e) o7cVar).actionBar;
                int measuredWidth3 = aVar5.getMeasuredWidth();
                aVar6 = ((e) o7cVar).actionBar;
                aVar4.layout(0, 0, measuredWidth3, aVar6.getMeasuredHeight());
                a81 a81Var = o7cVar.E;
                a81Var.layout(0, 0, a81Var.getMeasuredWidth(), o7cVar.E.getMeasuredHeight());
                oy7 oy7Var = (oy7) this.b;
                oy7Var.layout(0, 0, oy7Var.getMeasuredWidth(), oy7Var.getMeasuredHeight());
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        a aVar;
        a aVar2;
        a aVar3;
        byte b = this.a;
        e eVar = this.c;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                la1 la1Var = (la1) eVar;
                aVar = ((e) la1Var).actionBar;
                aVar.measure(i, i2);
                byte b2 = la1Var.X;
                CameraView cameraView = la1Var.d;
                if (b2 != 0) {
                    if (cameraView != null) {
                        cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    }
                    la1Var.h.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    la1Var.s.measure(View.MeasureSpec.makeMeasureSpec(hl.L(60.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(60.0f), TLObject.FLAG_30));
                } else if (cameraView != null) {
                    cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), TLObject.FLAG_30));
                }
                la1Var.b.measure(ik8.f(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                TextView textView = la1Var.c;
                if (b2 == 3) {
                    textView.measure(ik8.f(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                } else {
                    textView.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                int size3 = View.MeasureSpec.getSize(i);
                int size4 = View.MeasureSpec.getSize(i2);
                o7c o7cVar = (o7c) eVar;
                aVar2 = ((e) o7cVar).actionBar;
                aVar2.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i2);
                a81 a81Var = o7cVar.E;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
                aVar3 = ((e) o7cVar).actionBar;
                a81Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(hl.L(3.0f) + aVar3.getMeasuredHeight(), TLObject.FLAG_30));
                ((oy7) this.b).measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i2);
                setMeasuredDimension(size3, size4);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia1(o7c o7cVar, Context context, oy7 oy7Var) {
        super(context);
        this.c = o7cVar;
        this.b = oy7Var;
    }
}
