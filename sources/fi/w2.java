package fi;

import android.app.Activity;
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
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k11;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.n30;
import org.telegram.ui.rv;
import org.telegram.ui.w40;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class w2 extends View {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 8:
                super(context);
                this.b = new xe.b();
                this.c = new bg.z(1, this);
                break;
            default:
                this.b = new te.a(this, er.h, 320L);
                this.c = i5.c.g(context, R.drawable.outline_poll_emoji_24);
                this.d = i5.c.g(context, R.drawable.input_keyboard);
                break;
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        int textColor;
        Canvas canvas2;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 1:
                k11 k11Var = (k11) this.d;
                org.telegram.ui.Components.g6 g6Var = k11Var.e;
                float i7 = g6Var.i();
                if (i7 > 0.0f) {
                    float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, i7);
                    float max = Math.max(org.telegram.messenger.g0.L(16.66f), g6Var.c() + org.telegram.messenger.g0.L(10.0f));
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(T1, T1, rectF.centerX(), rectF.centerY());
                    float L = org.telegram.messenger.g0.L(8.33f);
                    float L2 = org.telegram.messenger.g0.L(8.33f);
                    org.telegram.ui.Components.z5 z5Var = (org.telegram.ui.Components.z5) this.b;
                    z5Var.setColor(z5Var.b.a(org.telegram.ui.ActionBar.j6.w0(k11Var.J, z5Var.a), false));
                    textColor = k11Var.getTextColor();
                    z5Var.setColor(i0.a.f(k11Var.G, z5Var.getColor(), textColor));
                    z5Var.setAlpha((int) (z5Var.getAlpha() * i7));
                    canvas.drawRoundRect(rectF, L, L2, z5Var);
                    g6Var.p(rectF);
                    g6Var.C = (int) (i7 * 255.0f);
                    g6Var.u(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.W8, (org.telegram.ui.ActionBar.e6) this.c));
                    g6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
            case 2:
                int[] iArr = (int[]) this.b;
                rv rvVar = (rv) this.c;
                n30 n30Var = (n30) this.d;
                if (n30Var.h <= 0.0f || n30Var.d == null) {
                    canvas2 = canvas;
                } else {
                    n30Var.f.reset();
                    float width = getWidth() / n30Var.c.getWidth();
                    n30Var.f.postScale(width, width);
                    n30Var.e.setLocalMatrix(n30Var.f);
                    n30Var.d.setAlpha((int) (n30Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), n30Var.d);
                }
                if (rvVar != null) {
                    if (!rvVar.isAttachedToWindow() || rvVar.getAlpha() <= 0.5f) {
                        n30Var.dismiss();
                    } else {
                        rvVar.getLocationInWindow(iArr);
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - rvVar.getScaleX()) * rvVar.getMeasuredWidth()), iArr[1] - ((1.0f - rvVar.getScaleY()) * rvVar.getMeasuredHeight()));
                    if (((g.b) rvVar.b).a(canvas2, rvVar.getMeasuredWidth(), n30Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    break;
                }
                break;
            case 3:
                super.dispatchDraw(canvas);
                int L3 = org.telegram.messenger.g0.L(48.0f);
                w40 w40Var = (w40) this.d;
                int i10 = L3 + ((int) w40Var.b.f);
                Paint paint = (Paint) this.c;
                paint.setColor(w40Var.getThemedColor(org.telegram.ui.ActionBar.j6.s8));
                RectF rectF2 = (RectF) this.b;
                float measuredWidth = getMeasuredWidth();
                kVar = ((org.telegram.ui.ActionBar.e2) w40Var).actionBar;
                rectF2.set(0.0f, 0.0f, measuredWidth, kVar.getMeasuredHeight() + i10);
                w40.f0(w40Var, canvas, rectF2, paint);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 5:
                super.onAttachedToWindow();
                if (((ci.e) this.c) != null) {
                    postDelayed((org.telegram.ui.Wallet.l) this.d, 200L);
                    break;
                }
                break;
            case 8:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((bg.z) this.c);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 5:
                super.onDetachedFromWindow();
                org.telegram.ui.Wallet.l lVar = (org.telegram.ui.Wallet.l) this.d;
                removeCallbacks(lVar);
                lVar.run();
                break;
            case 8:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((bg.z) this.c);
                }
                this.d = null;
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                d80 d80Var = (d80) this.b;
                super.onDraw(canvas);
                org.telegram.ui.Components.u5 u5Var = (org.telegram.ui.Components.u5) this.c;
                u5Var.a = this;
                ((b4) this.d).getClass();
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
                    d80Var.e(rectF);
                    d80Var.k(24.0f);
                    d80Var.g(i0.a.o(-1, 20), i0.a.o(-1, 50), i0.a.o(-1, 50), i0.a.o(-1, 70));
                    d80Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
            default:
                super.onDraw(canvas);
                return;
            case 4:
                float L = org.telegram.messenger.g0.L(10.0f);
                float f11 = L * 2.0f;
                float measuredWidth = getMeasuredWidth() - f11;
                float measuredHeight = getMeasuredHeight() - f11;
                canvas.save();
                RectF rectF2 = org.telegram.messenger.g0.P;
                float f12 = L + measuredWidth;
                rectF2.set(L, L, f12, f12);
                rectF2.offset(0.0f, (measuredHeight - rectF2.height()) / 2.0f);
                float f13 = measuredWidth / 7.0f;
                Path path = (Path) this.c;
                path.rewind();
                path.addRoundRect(rectF2, f13, f13, Path.Direction.CW);
                canvas.clipPath(path);
                int L2 = org.telegram.messenger.g0.L(10.0f);
                canvas.save();
                canvas.translate(rectF2.left, rectF2.top);
                float f14 = L2;
                int width = ((int) (rectF2.width() / f14)) + 1;
                int height = ((int) (rectF2.height() / f14)) + 1;
                for (int i7 = 0; i7 < height; i7++) {
                    canvas.save();
                    for (int i10 = 0; i10 < width; i10++) {
                        int i11 = i10 % 2;
                        if ((i11 == 0 && i7 % 2 == 0) || (i11 != 0 && i7 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f14, f14, (Paint) this.b);
                        }
                        canvas.translate(f14, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f14);
                }
                canvas.restore();
                canvas.restore();
                return;
            case 5:
                ci.f fVar = (ci.f) this.b;
                fVar.e(canvas, 0.0f, 0.0f, getWidth());
                if (fVar.o < 1.0f || fVar.l > 0) {
                    invalidate();
                    return;
                }
                return;
            case 6:
                super.onDraw(canvas);
                float f15 = ((te.a) this.b).e;
                bg.s.b(canvas, (Drawable) this.c, 1.0f - f15);
                bg.s.b(canvas, (Drawable) this.d, f15);
                return;
            case 7:
                int width2 = getWidth();
                float L3 = org.telegram.messenger.g0.L(10.0f);
                float L4 = (width2 - L3) - org.telegram.messenger.g0.L(10.0f);
                float height2 = getHeight() - org.telegram.messenger.g0.L(8.0f);
                wi.h hVar = (wi.h) this.d;
                float f16 = hVar.J;
                if (f16 != 0.0f) {
                    canvas.drawLine(L3, height2, (f16 * L4) + L3, height2, (Paint) this.c);
                }
                canvas.drawLine(L3, height2, (L4 * hVar.I) + L3, height2, (Paint) this.b);
                return;
            case 8:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((xe.b) this.b).iterator();
                    while (it.hasNext()) {
                        ((ri.h) it.next()).b();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(org.telegram.messenger.g0.L(16.66f), ((k11) this.d).e.d + org.telegram.messenger.g0.L(10.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.66f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 6:
                super.onSizeChanged(i7, i10, i11, i12);
                float f10 = i7 / 2.0f;
                float f11 = i10 / 2.0f;
                bg.s.d((Drawable) this.c, f10, f11, 17);
                bg.s.d((Drawable) this.d, f10, f11, 17);
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 4:
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
            case 1:
                return ((k11) this.d).e == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(w40 w40Var, Context context) {
        super(context);
        this.a = 3;
        this.d = w40Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(wi.h hVar, Activity activity) {
        super(activity);
        this.a = 7;
        this.d = hVar;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
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
    public w2(k11 k11Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 1;
        this.d = k11Var;
        this.c = e6Var;
        this.b = new org.telegram.ui.Components.z5(this, e6Var);
        k11Var.e.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(Context context, ci.e eVar) {
        super(context);
        this.a = 5;
        ci.f fVar = new ci.f();
        this.b = fVar;
        this.d = new org.telegram.ui.Wallet.l(this, 9);
        if (fVar.y != -16777216 || fVar.z == null) {
            fVar.y = -16777216;
            fVar.z = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
        }
        this.c = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(b4 b4Var, Context context) {
        super(context);
        this.a = 0;
        this.d = b4Var;
        this.b = new d80();
        this.c = new org.telegram.ui.Components.u5(250L, er.f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.a = 4;
        this.d = photoViewer;
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(n30 n30Var, Context context, rv rvVar) {
        super(context);
        this.a = 2;
        this.d = n30Var;
        this.c = rvVar;
        this.b = new int[2];
    }
}
