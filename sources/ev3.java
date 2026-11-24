// default package

import android.app.Activity;
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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ev3 extends FrameLayout {
    public final /* synthetic */ byte a = 1;
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
    public ev3(bba bbaVar, Activity activity, wjb wjbVar) {
        super(activity);
        this.w = bbaVar;
        LinearLayout linearLayout = new LinearLayout(activity);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(bkb.a0(bkb.v0(bkb.h6, wjbVar), 20, 20, 6, 6));
        ote.b(linearLayout, 0.02f, 1.2f);
        addView(linearLayout, nme.d(-1, -1.0f, kk7.D1, 4.0f, 4.0f, 4.0f, 4.0f));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(imageView, bkb.kf, wjbVar, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, nme.r(40, 38, 51));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, nme.t(-2, -1, kk7.z1, 6, 0, 0, 0));
        this.n = new be0[3];
        for (int i = 2; i >= 0; i--) {
            ((be0[]) this.n)[i] = new be0(activity);
            ((be0[]) this.n)[i].setRoundRadius(gl.L(6.0f));
            ((be0[]) this.n)[i].setVisibility(8);
            int i2 = 32 - (i << 2);
            ((FrameLayout) this.h).addView(((be0[]) this.n)[i], nme.d(i2, i2, 19, i * 12, 0.0f, 0.0f, 0.0f));
        }
        be0 be0Var = new be0(activity);
        this.r = be0Var;
        be0Var.setRoundRadius(gl.L(4.0f));
        be0Var.setVisibility(8);
        ((LinearLayout) this.b).addView(be0Var, nme.t(34, 34, 19, 6, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        ((LinearLayout) this.b).addView(frameLayout2, nme.p(0, -1, 1.0f, kk7.D1));
        jia jiaVar = new jia(activity);
        this.d = jiaVar;
        jiaVar.setTextSize(14);
        jiaVar.setTypeface(gl.o());
        zkb.W(jiaVar, bkb.mf, wjbVar);
        frameLayout2.addView(jiaVar, nme.d(-1, 18.0f, 51, 8.0f, 2.0f, 8.0f, 0.0f));
        jia jiaVar2 = new jia(activity);
        this.e = jiaVar2;
        jiaVar2.setTextSize(14);
        int i3 = bkb.Nl;
        zkb.W(jiaVar2, i3, wjbVar);
        frameLayout2.addView(jiaVar2, nme.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        jia jiaVar3 = new jia(activity);
        this.f = jiaVar3;
        jiaVar3.setTextSize(14);
        zkb.W(jiaVar3, i3, wjbVar);
        jiaVar3.setAlpha(0.0f);
        frameLayout2.addView(jiaVar3, nme.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        ImageView imageView2 = new ImageView(activity);
        this.s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.input_clear);
        zkb.s(imageView2, bkb.Ml, wjbVar, PorterDuff.Mode.MULTIPLY);
        imageView2.setBackground(bkb.f0(bkb.v0(bkb.h6, wjbVar), 1, gl.L(18.0f)));
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new ik8(this, (byte) 24));
        ((LinearLayout) this.b).addView(imageView2, nme.t(36, 36, 21, 0, 0, 4, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                RectF rectF = (RectF) this.r;
                Paint paint = (Paint) this.d;
                Paint paint2 = (Paint) this.b;
                int i = bkb.g5;
                ew3 ew3Var = (ew3) this.w;
                vq1 vq1Var = ew3Var.p1;
                paint2.setColor(bkb.v0(i, ew3Var.J0));
                paint2.setAlpha((int) ((((Bitmap) this.e) == null ? 1.0f : 0.85f) * 255.0f));
                View[] viewPages = vq1Var.getViewPages();
                ew3Var.x1 = 0.0f;
                boolean z = false;
                for (View view : viewPages) {
                    if (view instanceof ov3) {
                        ov3 ov3Var = (ov3) view;
                        ew3Var.x1 += Utilities.i(1.0f - Math.abs(ov3Var.getTranslationX() / ov3Var.getMeasuredWidth()), 1.0f, 0.0f) * ov3Var.b();
                        if (ov3Var.getVisibility() == 0) {
                            ov3Var.c();
                        }
                    }
                }
                float e = ((lm) this.n).e(false, ew3Var.x1 <= 0.0f ? 1.0f : 0.0f);
                float paddingTop = (ew3Var.x1 + vq1Var.getPaddingTop()) - gl.U1(e, gl.L(8.0f), vq1Var.getPaddingTop());
                RectF rectF2 = gl.P;
                rectF2.set(ew3Var.u0, paddingTop, getWidth() - ew3Var.u0, gl.L(8.0f) + getHeight());
                if (((Bitmap) this.e) != null) {
                    ((Matrix) this.h).reset();
                    ((Matrix) this.h).postScale(16.0f, 16.0f);
                    ((Matrix) this.h).postTranslate(0.0f, -getY());
                    ((BitmapShader) this.f).setLocalMatrix((Matrix) this.h);
                    canvas.drawRoundRect(rectF2, gl.L(14.0f), gl.L(14.0f), (Paint) this.c);
                }
                boolean z2 = rectF2.top < ((float) gl.m);
                Boolean bool = (Boolean) this.s;
                if (bool == null || bool.booleanValue() != z2) {
                    this.s = Boolean.valueOf(z2);
                    Window window = ew3Var.getWindow();
                    if (z2 && gl.B(paint2.getColor()) >= 0.721f) {
                        z = true;
                    }
                    gl.n3(window, z);
                }
                float f = 1.0f - e;
                canvas.drawRoundRect(rectF2, gl.L(14.0f) * f, gl.L(14.0f) * f, paint2);
                rectF.set((getWidth() - gl.L(36.0f)) / 2.0f, gl.L(9.66f) + paddingTop, (gl.L(36.0f) + getWidth()) / 2.0f, paddingTop + gl.L(13.66f));
                paint.setColor(1367573379);
                paint.setAlpha((int) (f * 81.0f));
                canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint);
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
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    float y = motionEvent.getY();
                    ew3 ew3Var = (ew3) this.w;
                    if (y < ew3Var.x1) {
                        ew3Var.dismiss();
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                ew3 ew3Var = (ew3) this.w;
                if (((Bitmap) this.e) == null) {
                    wjb wjbVar = ew3Var.J0;
                    if (wjbVar == null) {
                        if (!bkb.I.o()) {
                        }
                    } else if (!wjbVar.a()) {
                    }
                    if (ew3Var.w1 != null && gba.o() > 0 && !e66.f()) {
                        Point point = gl.q;
                        Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                        ((s7b) ew3Var.w1.b).X(16.0f, createBitmap);
                        Utilities.stackBlurBitmap(createBitmap, 8);
                        this.e = createBitmap;
                        Paint paint = (Paint) this.c;
                        Bitmap bitmap = (Bitmap) this.e;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f = bitmapShader;
                        paint.setShader(bitmapShader);
                        Matrix matrix = (Matrix) this.h;
                        if (matrix == null) {
                            matrix = new Matrix();
                            this.h = matrix;
                        }
                        matrix.postScale(16.0f, 16.0f);
                        ((BitmapShader) this.f).setLocalMatrix((Matrix) this.h);
                        invalidate();
                        break;
                    }
                }
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                float min = Math.min(size2 * 0.45f, (gl.L(350.0f) / 0.55f) * 0.45f);
                ew3 ew3Var = (ew3) this.w;
                ew3Var.r1 = min;
                vq1 vq1Var = ew3Var.p1;
                vq1Var.setPadding(0, gl.m, 0, 0);
                vq1Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                dw3 dw3Var = ew3Var.q1;
                if (dw3Var != null) {
                    dw3Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), 0);
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 0:
                super.setTranslationY(f);
                invalidate();
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev3(ew3 ew3Var, Context context) {
        super(context);
        this.w = ew3Var;
        this.b = new Paint(1);
        this.c = new Paint(3);
        this.d = new Paint(1);
        this.n = new lm(this, 0L, 250L, s33.h);
        this.r = new RectF();
    }
}
