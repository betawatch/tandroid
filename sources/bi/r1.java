package bi;

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
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class r1 extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Bitmap d;
    public BitmapShader e;
    public Matrix f;
    public final org.telegram.ui.Components.d6 h;
    public final RectF n;
    public Boolean r;
    public final /* synthetic */ f3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(f3 f3Var, Context context) {
        super(context);
        this.s = f3Var;
        this.a = new Paint(1);
        this.b = new Paint(3);
        this.c = new Paint(1);
        this.h = new org.telegram.ui.Components.d6(this, 0L, 250L, wr.h);
        this.n = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        int i11;
        int i12 = org.telegram.ui.ActionBar.j6.h5;
        f3 f3Var = this.s;
        p1 p1Var = f3Var.f;
        f6Var = ((org.telegram.ui.ActionBar.h3) f3Var).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
        Paint paint = this.a;
        paint.setColor(v02);
        paint.setAlpha((int) ((this.d == null ? 1.0f : 0.85f) * 255.0f));
        View[] viewPages = p1Var.getViewPages();
        f3Var.x = 0.0f;
        boolean z10 = false;
        for (View view : viewPages) {
            if (view instanceof l2) {
                l2 l2Var = (l2) view;
                f3Var.x += Utilities.clamp(1.0f - Math.abs(l2Var.getTranslationX() / l2Var.getMeasuredWidth()), 1.0f, 0.0f) * l2Var.b();
                if (l2Var.getVisibility() == 0) {
                    l2Var.c();
                }
            }
        }
        float d = this.h.d(f3Var.x <= 0.0f ? 1.0f : 0.0f, false);
        float paddingTop = (f3Var.x + p1Var.getPaddingTop()) - AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), p1Var.getPaddingTop(), d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.h3) f3Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.h3) f3Var).backgroundPaddingLeft;
        rectF.set(i10, paddingTop, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
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
            Window window = f3Var.getWindow();
            if (z11 && AndroidUtilities.computePerceivedBrightness(paint.getColor()) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightStatusBar(window, z10);
        }
        float f7 = 1.0f - d;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f) * f7, AndroidUtilities.dp(14.0f) * f7, paint);
        RectF rectF2 = this.n;
        rectF2.set((getWidth() - AndroidUtilities.dp(36.0f)) / 2.0f, AndroidUtilities.dp(9.66f) + paddingTop, (AndroidUtilities.dp(36.0f) + getWidth()) / 2.0f, paddingTop + AndroidUtilities.dp(13.66f));
        Paint paint2 = this.c;
        paint2.setColor(1367573379);
        paint2.setAlpha((int) (f7 * 81.0f));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        canvas.save();
        canvas.clipRect(rectF);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            f3 f3Var = this.s;
            if (y3 < f3Var.x) {
                f3Var.dismiss();
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.d == null) {
            f3 f3Var = this.s;
            f6Var = ((org.telegram.ui.ActionBar.h3) f3Var).resourcesProvider;
            if (f6Var != null) {
                f6Var2 = ((org.telegram.ui.ActionBar.h3) f3Var).resourcesProvider;
                if (!f6Var2.a()) {
                    return;
                }
            } else if (!org.telegram.ui.ActionBar.j6.I.q()) {
                return;
            }
            if (f3Var.w == null || SharedConfig.getDevicePerformanceClass() <= 0 || LiteMode.isPowerSaverApplied()) {
                return;
            }
            Point point = AndroidUtilities.displaySize;
            Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
            f3Var.w.run(createBitmap, Float.valueOf(16.0f));
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
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float min = Math.min(size2 * 0.45f, (AndroidUtilities.dp(350.0f) / 0.55f) * 0.45f);
        f3 f3Var = this.s;
        f3Var.n = min;
        p1 p1Var = f3Var.f;
        p1Var.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        p1Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        e3 e3Var = f3Var.h;
        if (e3Var != null) {
            e3Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), 0);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        invalidate();
    }
}
