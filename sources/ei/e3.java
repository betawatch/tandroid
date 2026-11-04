package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.i30;
import org.telegram.ui.r40;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e3 extends View {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(Context context, int i3) {
        super(context);
        this.a = i3;
        switch (i3) {
            case 8:
                super(context);
                this.b = new ue.b();
                this.c = new cg.y(1, this);
                break;
            default:
                this.b = new qe.a(this, xq.h, 320L);
                this.c = k2.p1.g(context, R.drawable.outline_poll_emoji_24);
                this.d = k2.p1.g(context, R.drawable.input_keyboard);
                break;
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        int textColor;
        Canvas canvas2;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 2:
                b11 b11Var = (b11) this.d;
                org.telegram.ui.Components.g6 g6Var = b11Var.e;
                float i3 = g6Var.i();
                if (i3 > 0.0f) {
                    float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, i3);
                    float max = Math.max(org.telegram.messenger.g0.L(16.66f), g6Var.c() + org.telegram.messenger.g0.L(10.0f));
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(T1, T1, rectF.centerX(), rectF.centerY());
                    float L = org.telegram.messenger.g0.L(8.33f);
                    float L2 = org.telegram.messenger.g0.L(8.33f);
                    org.telegram.ui.Components.z5 z5Var = (org.telegram.ui.Components.z5) this.b;
                    z5Var.setColor(z5Var.b.a(org.telegram.ui.ActionBar.k6.w0(b11Var.J, z5Var.a), false));
                    textColor = b11Var.getTextColor();
                    z5Var.setColor(i0.a.f(b11Var.G, z5Var.getColor(), textColor));
                    z5Var.setAlpha((int) (z5Var.getAlpha() * i3));
                    canvas.drawRoundRect(rectF, L, L2, z5Var);
                    g6Var.p(rectF);
                    g6Var.B = (int) (i3 * 255.0f);
                    g6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W8, (org.telegram.ui.ActionBar.e6) this.c));
                    g6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                int[] iArr = (int[]) this.b;
                org.telegram.ui.Components.voip.r0 r0Var = (org.telegram.ui.Components.voip.r0) this.c;
                i30 i30Var = (i30) this.d;
                if (i30Var.h <= 0.0f || i30Var.d == null) {
                    canvas2 = canvas;
                } else {
                    i30Var.f.reset();
                    float width = getWidth() / i30Var.c.getWidth();
                    i30Var.f.postScale(width, width);
                    i30Var.e.setLocalMatrix(i30Var.f);
                    i30Var.d.setAlpha((int) (i30Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), i30Var.d);
                }
                if (r0Var != null) {
                    if (!r0Var.isAttachedToWindow() || r0Var.getAlpha() <= 0.5f) {
                        i30Var.dismiss();
                    } else {
                        r0Var.getLocationInWindow(iArr);
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - r0Var.getScaleX()) * r0Var.getMeasuredWidth()), iArr[1] - ((1.0f - r0Var.getScaleY()) * r0Var.getMeasuredHeight()));
                    if (((g.b) r0Var.b).a(canvas2, r0Var.getMeasuredWidth(), i30Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    break;
                }
                break;
            case 4:
                super.dispatchDraw(canvas);
                int L3 = org.telegram.messenger.g0.L(48.0f);
                r40 r40Var = (r40) this.d;
                int i10 = L3 + ((int) r40Var.b.f);
                Paint paint = (Paint) this.c;
                paint.setColor(r40Var.getThemedColor(org.telegram.ui.ActionBar.k6.s8));
                RectF rectF2 = (RectF) this.b;
                float measuredWidth = getMeasuredWidth();
                kVar = ((org.telegram.ui.ActionBar.d2) r40Var).actionBar;
                rectF2.set(0.0f, 0.0f, measuredWidth, kVar.getMeasuredHeight() + i10);
                r40.f0(r40Var, canvas, rectF2, paint);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 6:
                super.onAttachedToWindow();
                if (((bi.e) this.c) != null) {
                    postDelayed((org.telegram.ui.Wallet.l) this.d, 200L);
                    break;
                }
                break;
            case 7:
            default:
                super.onAttachedToWindow();
                break;
            case 8:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((cg.y) this.c);
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 6:
                super.onDetachedFromWindow();
                org.telegram.ui.Wallet.l lVar = (org.telegram.ui.Wallet.l) this.d;
                removeCallbacks(lVar);
                lVar.run();
                break;
            case 7:
            default:
                super.onDetachedFromWindow();
                break;
            case 8:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((cg.y) this.c);
                }
                this.d = null;
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        ud0 ud0Var;
        switch (this.a) {
            case 0:
                w70 w70Var = (w70) this.b;
                super.onDraw(canvas);
                org.telegram.ui.Components.u5 u5Var = (org.telegram.ui.Components.u5) this.c;
                u5Var.a = this;
                ((j4) this.d).getClass();
                u5Var.e(false, 0.0f);
                float f10 = u5Var.c;
                if (f10 != 0.0f) {
                    if (f10 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (u5Var.c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    w70Var.e(rectF);
                    w70Var.k(24.0f);
                    w70Var.g(i0.a.o(-1, 20), i0.a.o(-1, 50), i0.a.o(-1, 50), i0.a.o(-1, 70));
                    w70Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                super.onDraw(canvas);
                ie0 ie0Var = (ie0) this.d;
                if (!ie0Var.n || ((ud0Var = ie0Var.r) != null && ud0Var.y)) {
                    int width = getWidth();
                    int L = org.telegram.messenger.g0.L(10.0f);
                    float f11 = (width - L) - L;
                    int i3 = L + ((int) (ie0Var.a0 * f11));
                    float height = getHeight() - org.telegram.messenger.g0.L(8.0f);
                    float f12 = ie0Var.b0;
                    if (f12 != 0.0f) {
                        float f13 = L;
                        canvas.drawLine(f13, height, (f12 * f11) + f13, height, (Paint) this.c);
                    }
                    canvas.drawLine(L, height, i3, height, (Paint) this.b);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            default:
                super.onDraw(canvas);
                return;
            case 5:
                float L2 = org.telegram.messenger.g0.L(10.0f);
                float f14 = L2 * 2.0f;
                float measuredWidth = getMeasuredWidth() - f14;
                float measuredHeight = getMeasuredHeight() - f14;
                canvas.save();
                RectF rectF2 = org.telegram.messenger.g0.P;
                float f15 = L2 + measuredWidth;
                rectF2.set(L2, L2, f15, f15);
                rectF2.offset(0.0f, (measuredHeight - rectF2.height()) / 2.0f);
                float f16 = measuredWidth / 7.0f;
                Path path = (Path) this.c;
                path.rewind();
                path.addRoundRect(rectF2, f16, f16, Path.Direction.CW);
                canvas.clipPath(path);
                int L3 = org.telegram.messenger.g0.L(10.0f);
                canvas.save();
                canvas.translate(rectF2.left, rectF2.top);
                float f17 = L3;
                int width2 = ((int) (rectF2.width() / f17)) + 1;
                int height2 = ((int) (rectF2.height() / f17)) + 1;
                for (int i10 = 0; i10 < height2; i10++) {
                    canvas.save();
                    for (int i11 = 0; i11 < width2; i11++) {
                        int i12 = i11 % 2;
                        if ((i12 == 0 && i10 % 2 == 0) || (i12 != 0 && i10 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f17, f17, (Paint) this.b);
                        }
                        canvas.translate(f17, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f17);
                }
                canvas.restore();
                canvas.restore();
                return;
            case 6:
                bi.f fVar = (bi.f) this.b;
                fVar.e(canvas, 0.0f, 0.0f, getWidth());
                if (fVar.o < 1.0f || fVar.l > 0) {
                    invalidate();
                    return;
                }
                return;
            case 7:
                super.onDraw(canvas);
                float f18 = ((qe.a) this.b).e;
                cg.r.b(canvas, (Drawable) this.c, 1.0f - f18);
                cg.r.b(canvas, (Drawable) this.d, f18);
                return;
            case 8:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((ue.b) this.b).iterator();
                    while (it.hasNext()) {
                        ((pi.h) it.next()).b();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(org.telegram.messenger.g0.L(16.66f), ((b11) this.d).e.d + org.telegram.messenger.g0.L(10.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.66f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 7:
                super.onSizeChanged(i3, i10, i11, i12);
                float f10 = i3 / 2.0f;
                float f11 = i10 / 2.0f;
                cg.r.d((Drawable) this.c, f10, f11, 17);
                cg.r.d((Drawable) this.d, f10, f11, 17);
                break;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 5:
                super.setAlpha(f10);
                ((PhotoViewer) this.d).h0.invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 2:
                return ((b11) this.d).e == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(r40 r40Var, Context context) {
        super(context);
        this.a = 4;
        this.d = r40Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(ie0 ie0Var, Context context) {
        super(context);
        this.a = 1;
        this.d = ie0Var;
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setColor(paint.getColor());
        paint2.setAlpha((int) (paint.getAlpha() * 0.3f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(b11 b11Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 2;
        this.d = b11Var;
        this.c = e6Var;
        this.b = new org.telegram.ui.Components.z5(this, e6Var);
        b11Var.e.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(Context context, bi.e eVar) {
        super(context);
        this.a = 6;
        bi.f fVar = new bi.f();
        this.b = fVar;
        this.d = new org.telegram.ui.Wallet.l(this, 9);
        if (fVar.y != -16777216 || fVar.z == null) {
            fVar.y = -16777216;
            fVar.z = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
        }
        this.c = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(j4 j4Var, Context context) {
        super(context);
        this.a = 0;
        this.d = j4Var;
        this.b = new w70();
        this.c = new org.telegram.ui.Components.u5(250L, xq.f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.a = 5;
        this.d = photoViewer;
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(i30 i30Var, Context context, org.telegram.ui.Components.voip.r0 r0Var) {
        super(context);
        this.a = 3;
        this.d = i30Var;
        this.c = r0Var;
        this.b = new int[2];
    }
}
