package hi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cz;
import org.telegram.messenger.ls;
import org.telegram.messenger.qc;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ep0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class k1 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object h;
    public final Object n;
    public final Object r;
    public Object s;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(ep0 ep0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.w = ep0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.m6.c0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i6, h6Var), 20, 20, 6, 6));
        c8.ra.b(linearLayout, 0.02f, 1.2f);
        addView(linearLayout, c8.ma.d(-1, -1.0f, ls.E1, 4.0f, 4.0f, 4.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.lf, h6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, c8.ma.r(40, 38, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, c8.ma.t(-2, -1, ls.A1, 6, 0, 0, 0));
        this.n = new org.telegram.ui.Components.q9[3];
        for (int i7 = 2; i7 >= 0; i7--) {
            ((org.telegram.ui.Components.q9[]) this.n)[i7] = new org.telegram.ui.Components.q9(context);
            ((org.telegram.ui.Components.q9[]) this.n)[i7].setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            ((org.telegram.ui.Components.q9[]) this.n)[i7].setVisibility(8);
            int i10 = 32 - (i7 * 4);
            ((FrameLayout) this.h).addView(((org.telegram.ui.Components.q9[]) this.n)[i7], c8.ma.d(i10, i10, 19, i7 * 12, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.r = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
        q9Var.setVisibility(8);
        ((LinearLayout) this.b).addView(q9Var, c8.ma.t(34, 34, 19, 6, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ((LinearLayout) this.b).addView(frameLayout2, c8.ma.p(0, -1, 1.0f, ls.E1));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.d = m5Var;
        m5Var.setTextSize(14);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.nf, h6Var);
        frameLayout2.addView(m5Var, c8.ma.d(-1, 18.0f, 51, 8.0f, 2.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.e = m5Var2;
        m5Var2.setTextSize(14);
        int i11 = org.telegram.ui.ActionBar.m6.Ol;
        org.telegram.ui.ActionBar.t6.X(m5Var2, i11, h6Var);
        frameLayout2.addView(m5Var2, c8.ma.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var3 = new org.telegram.ui.ActionBar.m5(context);
        this.f = m5Var3;
        m5Var3.setTextSize(14);
        org.telegram.ui.ActionBar.t6.X(m5Var3, i11, h6Var);
        m5Var3.setAlpha(0.0f);
        frameLayout2.addView(m5Var3, c8.ma.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.input_clear);
        org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.Nl, h6Var, PorterDuff.Mode.MULTIPLY);
        imageView2.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i6, h6Var), 1, org.telegram.messenger.g0.L(18.0f)));
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new j70(this, 14));
        ((LinearLayout) this.b).addView(imageView2, c8.ma.t(36, 36, 21, 0, 0, 4, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                RectF rectF = (RectF) this.r;
                Paint paint = (Paint) this.d;
                Paint paint2 = (Paint) this.b;
                int i7 = org.telegram.ui.ActionBar.m6.h5;
                i2 i2Var = (i2) this.w;
                i1 i1Var = i2Var.q1;
                paint2.setColor(org.telegram.ui.ActionBar.m6.w0(i7, i2Var.J0));
                paint2.setAlpha((int) ((((Bitmap) this.e) == null ? 1.0f : 0.85f) * 255.0f));
                View[] viewPages = i1Var.getViewPages();
                i2Var.y1 = 0.0f;
                boolean z10 = false;
                for (View view : viewPages) {
                    if (view instanceof u1) {
                        u1 u1Var = (u1) view;
                        i2Var.y1 += Utilities.i(1.0f - Math.abs(u1Var.getTranslationX() / u1Var.getMeasuredWidth()), 1.0f, 0.0f) * u1Var.b();
                        if (u1Var.getVisibility() == 0) {
                            u1Var.c();
                        }
                    }
                }
                float e10 = ((org.telegram.ui.Components.d6) this.n).e(false, i2Var.y1 <= 0.0f ? 1.0f : 0.0f);
                float paddingTop = (i2Var.y1 + i1Var.getPaddingTop()) - org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(8.0f), i1Var.getPaddingTop());
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(i2Var.u0, paddingTop, getWidth() - i2Var.u0, org.telegram.messenger.g0.L(8.0f) + getHeight());
                if (((Bitmap) this.e) != null) {
                    ((Matrix) this.h).reset();
                    ((Matrix) this.h).postScale(16.0f, 16.0f);
                    ((Matrix) this.h).postTranslate(0.0f, -getY());
                    ((BitmapShader) this.f).setLocalMatrix((Matrix) this.h);
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), (Paint) this.c);
                }
                boolean z11 = rectF2.top < ((float) org.telegram.messenger.g0.m);
                Boolean bool = (Boolean) this.s;
                if (bool == null || bool.booleanValue() != z11) {
                    this.s = Boolean.valueOf(z11);
                    Window window = i2Var.getWindow();
                    if (z11 && org.telegram.messenger.g0.B(paint2.getColor()) >= 0.721f) {
                        z10 = true;
                    }
                    org.telegram.messenger.g0.r3(window, z10);
                }
                float f10 = 1.0f - e10;
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(14.0f) * f10, org.telegram.messenger.g0.L(14.0f) * f10, paint2);
                rectF.set((getWidth() - org.telegram.messenger.g0.L(36.0f)) / 2.0f, org.telegram.messenger.g0.L(9.66f) + paddingTop, (org.telegram.messenger.g0.L(36.0f) + getWidth()) / 2.0f, paddingTop + org.telegram.messenger.g0.L(13.66f));
                paint.setColor(1367573379);
                paint.setAlpha((int) (f10 * 81.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                canvas.save();
                canvas.clipRect(rectF2);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    float y10 = motionEvent.getY();
                    i2 i2Var = (i2) this.w;
                    if (y10 < i2Var.y1) {
                        i2Var.dismiss();
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                super.onDetachedFromWindow();
                Bitmap bitmap = (Bitmap) this.e;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                ((Paint) this.c).setShader(null);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                i2 i2Var = (i2) this.w;
                if (((Bitmap) this.e) == null) {
                    org.telegram.ui.ActionBar.h6 h6Var = i2Var.J0;
                    if (h6Var == null) {
                        if (!org.telegram.ui.ActionBar.m6.I.q()) {
                        }
                    } else if (!h6Var.d()) {
                    }
                    if (i2Var.x1 != null && cz.o() > 0 && !qc.f()) {
                        Point point = org.telegram.messenger.g0.q;
                        Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                        i2Var.x1.a(createBitmap, Float.valueOf(16.0f));
                        Utilities.stackBlurBitmap(createBitmap, 8);
                        this.e = createBitmap;
                        Paint paint = (Paint) this.c;
                        Bitmap bitmap = (Bitmap) this.e;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f = bitmapShader;
                        paint.setShader(bitmapShader);
                        if (((Matrix) this.h) == null) {
                            this.h = new Matrix();
                        }
                        ((Matrix) this.h).postScale(16.0f, 16.0f);
                        ((BitmapShader) this.f).setLocalMatrix((Matrix) this.h);
                        invalidate();
                        break;
                    }
                }
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                float min = Math.min(size2 * 0.45f, (org.telegram.messenger.g0.L(350.0f) / 0.55f) * 0.45f);
                i2 i2Var = (i2) this.w;
                i2Var.s1 = min;
                i1 i1Var = i2Var.q1;
                i1Var.setPadding(0, org.telegram.messenger.g0.m, 0, 0);
                i1Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                h2 h2Var = i2Var.r1;
                if (h2Var != null) {
                    h2Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), 0);
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 0:
                super.setTranslationY(f10);
                invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(i2 i2Var, Context context) {
        super(context);
        this.w = i2Var;
        this.b = new Paint(1);
        this.c = new Paint(3);
        this.d = new Paint(1);
        this.n = new org.telegram.ui.Components.d6(this, 0L, 250L, nr.h);
        this.r = new RectF();
    }
}
