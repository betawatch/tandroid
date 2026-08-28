package kh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class l1 extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Bitmap d;
    public BitmapShader e;
    public Matrix f;
    public final org.telegram.ui.Components.y5 h;
    public final RectF n;
    public Boolean r;
    public final /* synthetic */ n2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(n2 n2Var, Context context) {
        super(context);
        this.s = n2Var;
        this.a = new Paint(1);
        this.b = new Paint(3);
        this.c = new Paint(1);
        this.h = new org.telegram.ui.Components.y5(this, 0L, 250L, gr.h);
        this.n = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b6 b6Var;
        int i9;
        int i10;
        int i11 = org.telegram.ui.ActionBar.f6.h5;
        n2 n2Var = this.s;
        j1 j1Var = n2Var.f;
        b6Var = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i11, b6Var);
        Paint paint = this.a;
        paint.setColor(v02);
        paint.setAlpha((int) ((this.d == null ? 1.0f : 0.85f) * 255.0f));
        View[] viewPages = j1Var.getViewPages();
        n2Var.x = 0.0f;
        boolean z10 = false;
        for (View view : viewPages) {
            if (view instanceof x1) {
                x1 x1Var = (x1) view;
                n2Var.x += Utilities.clamp(1.0f - Math.abs(x1Var.getTranslationX() / x1Var.getMeasuredWidth()), 1.0f, 0.0f) * x1Var.b();
                if (x1Var.getVisibility() == 0) {
                    x1Var.c();
                }
            }
        }
        float d = this.h.d(n2Var.x <= 0.0f ? 1.0f : 0.0f, false);
        float paddingTop = (n2Var.x + j1Var.getPaddingTop()) - AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), j1Var.getPaddingTop(), d);
        RectF rectF = AndroidUtilities.rectTmp;
        i9 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        int width = getWidth();
        i10 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        rectF.set(i9, paddingTop, width - i10, AndroidUtilities.dp(8.0f) + getHeight());
        if (this.d != null) {
            this.f.reset();
            this.f.postScale(16.0f, 16.0f);
            this.f.postTranslate(0.0f, -getY());
            this.e.setLocalMatrix(this.f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.b);
        }
        boolean z11 = rectF.top < ((float) AndroidUtilities.statusBarHeight);
        Boolean bool = this.r;
        if (bool == null || bool.booleanValue() != z11) {
            this.r = Boolean.valueOf(z11);
            Window window = n2Var.getWindow();
            if (z11 && AndroidUtilities.computePerceivedBrightness(paint.getColor()) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightStatusBar(window, z10);
        }
        float f10 = 1.0f - d;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f) * f10, AndroidUtilities.dp(14.0f) * f10, paint);
        RectF rectF2 = this.n;
        rectF2.set((getWidth() - AndroidUtilities.dp(36.0f)) / 2.0f, AndroidUtilities.dp(9.66f) + paddingTop, (AndroidUtilities.dp(36.0f) + getWidth()) / 2.0f, paddingTop + AndroidUtilities.dp(13.66f));
        Paint paint2 = this.c;
        paint2.setColor(1367573379);
        paint2.setAlpha((int) (f10 * 81.0f));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        canvas.save();
        canvas.clipRect(rectF);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            n2 n2Var = this.s;
            if (y10 < n2Var.x) {
                n2Var.dismiss();
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.b.setShader(null);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.d == null) {
            n2 n2Var = this.s;
            b6Var = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
            if (b6Var != null) {
                b6Var2 = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
                if (!b6Var2.a()) {
                    return;
                }
            } else if (!org.telegram.ui.ActionBar.f6.I.q()) {
                return;
            }
            if (n2Var.w == null || SharedConfig.getDevicePerformanceClass() <= 0 || LiteMode.isPowerSaverApplied()) {
                return;
            }
            Point point = AndroidUtilities.displaySize;
            Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
            n2Var.w.run(createBitmap, Float.valueOf(16.0f));
            Utilities.stackBlurBitmap(createBitmap, 8);
            this.d = createBitmap;
            Bitmap bitmap = this.d;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.e = bitmapShader;
            this.b.setShader(bitmapShader);
            if (this.f == null) {
                this.f = new Matrix();
            }
            this.f.postScale(16.0f, 16.0f);
            this.e.setLocalMatrix(this.f);
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        float min = Math.min(size2 * 0.45f, (AndroidUtilities.dp(350.0f) / 0.55f) * 0.45f);
        n2 n2Var = this.s;
        n2Var.n = min;
        j1 j1Var = n2Var.f;
        j1Var.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        j1Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        m2 m2Var = n2Var.h;
        if (m2Var != null) {
            m2Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), 0);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        invalidate();
    }
}
