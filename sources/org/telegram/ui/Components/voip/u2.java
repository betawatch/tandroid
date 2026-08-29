package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import i7.f6;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x3;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.yb0;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class u2 extends FrameLayout {
    public boolean A;
    public long B;
    public final ArrayList C;
    public int D;
    public int E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public int T;
    public ValueAnimator U;
    public boolean V;
    public float W;
    public final boolean a;
    public boolean a0;
    public float b;
    public boolean b0;
    public boolean c;
    public final t2 d;
    public final TextureView e;
    public final ImageView f;
    public final View h;
    public View n;
    public final FrameLayout r;
    public final ImageView s;
    public final TextView v;
    public Bitmap w;
    public final Bitmap x;
    public float y;

    public u2(Context context, boolean z10, boolean z11) {
        this(context, z10, z11, true, false);
    }

    public void a() {
        if (this.A || getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            return;
        }
        this.D = getMeasuredHeight();
        this.E = getMeasuredWidth();
        if (!this.b0 || getParent() == null) {
            this.F = getY();
            this.G = getX();
        } else {
            View view = (View) getParent();
            this.F = view.getY();
            this.G = view.getX();
        }
        this.L = this.P;
        this.M = this.Q;
        this.N = this.R;
        t2 t2Var = this.d;
        this.O = t2Var.getMeasuredWidth();
        t2Var.getMeasuredHeight();
        this.A = true;
        requestLayout();
    }

    public void b() {
        invalidate();
        t2 t2Var = this.d;
        if (t2Var.getAlpha() != 1.0f) {
            t2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView == null || textureView.getAlpha() == 1.0f) {
            return;
        }
        textureView.animate().setDuration(300L).alpha(1.0f);
    }

    public final void c() {
        Bitmap bitmap = this.d.getBitmap(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.blurBitmap(bitmap, 3);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "voip_icthumb.jpg"));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable unused) {
        }
    }

    public final void d(float f9, boolean z10) {
        if (this.c) {
            float scaleX = ((View) getParent()).getScaleX();
            this.v.setAlpha(1.0f - f9);
            float A = !z10 ? x3.A(0.4f, scaleX, f9, 1.0f / scaleX) : 1.0f - (0.4f * f9);
            ImageView imageView = this.s;
            imageView.setScaleX(A);
            imageView.setScaleY(A);
            imageView.setTranslationY(AndroidUtilities.dp(60.0f) * f9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z10 = AndroidUtilities.makingGlobalBlurBitmap;
        t2 t2Var = this.d;
        if (z10) {
            TextureView textureView = this.e;
            if (textureView != null) {
                canvas.save();
                canvas.translate(textureView.getX(), textureView.getY());
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap != null) {
                    canvas.scale(textureView.getWidth() / bitmap.getWidth(), textureView.getHeight() / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                }
                canvas.restore();
            }
            if (t2Var != null) {
                canvas.save();
                canvas.translate(t2Var.getX(), t2Var.getY());
                Bitmap bitmap2 = t2Var.getBitmap();
                if (bitmap2 != null) {
                    canvas.scale(t2Var.getWidth() / bitmap2.getWidth(), t2Var.getHeight() / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                }
                canvas.restore();
            }
        }
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0 && t2Var.isFirstFrameRendered()) {
            float f9 = this.y - 0.10666667f;
            this.y = f9;
            if (f9 <= 0.0f) {
                this.y = 0.0f;
                imageView.setVisibility(8);
            } else {
                invalidate();
                imageView.setAlpha(this.y);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (AndroidUtilities.makingGlobalBlurBitmap && (view == this.d || view == this.e)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public void e() {
        TextureView textureView = this.e;
        if (textureView != null) {
            ViewGroup.LayoutParams layoutParams = textureView.getLayoutParams();
            t2 t2Var = this.d;
            layoutParams.width = t2Var.getMeasuredWidth();
            textureView.getLayoutParams().height = t2Var.getMeasuredHeight();
        }
    }

    public View getPlaceholderView() {
        if (this.n == null) {
            View view = new View(getContext());
            this.n = view;
            addView(view, f6.g());
        }
        return this.n;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float top;
        final float left;
        super.onLayout(z10, i10, i11, i12, i13);
        TextureView textureView = this.e;
        if (textureView != null) {
            this.Q = Math.max(getMeasuredHeight() / textureView.getMeasuredHeight(), getMeasuredWidth() / textureView.getMeasuredWidth());
        }
        boolean z11 = this.a;
        t2 t2Var = this.d;
        if (!z11) {
            t2Var.updateRotation();
        }
        if (this.T == 3) {
            if (textureView != null) {
                textureView.setScaleX(this.Q);
                textureView.setScaleY(this.Q);
                return;
            }
            return;
        }
        if (t2Var.getMeasuredHeight() == 0 || t2Var.getMeasuredWidth() == 0 || getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            this.P = 1.0f;
            if (this.U == null && !this.A) {
                this.K = 0.0f;
                this.J = 0.0f;
            }
        } else {
            int i14 = this.T;
            if (i14 == 0) {
                this.P = Math.max(getMeasuredHeight() / t2Var.getMeasuredHeight(), getMeasuredWidth() / t2Var.getMeasuredWidth());
            } else if (i14 == 2) {
                if (Math.abs((getMeasuredHeight() / getMeasuredWidth()) - 1.0f) < 0.02f) {
                    this.P = Math.max(getMeasuredHeight() / t2Var.getMeasuredHeight(), getMeasuredWidth() / t2Var.getMeasuredWidth());
                } else if (getMeasuredWidth() <= getMeasuredHeight() || t2Var.getMeasuredHeight() <= t2Var.getMeasuredWidth()) {
                    this.P = Math.min(getMeasuredHeight() / t2Var.getMeasuredHeight(), getMeasuredWidth() / t2Var.getMeasuredWidth());
                } else {
                    this.P = Math.max(getMeasuredHeight() / t2Var.getMeasuredHeight(), (getMeasuredWidth() / 2.0f) / t2Var.getMeasuredWidth());
                }
            } else if (i14 == 1) {
                this.P = Math.min(getMeasuredHeight() / t2Var.getMeasuredHeight(), getMeasuredWidth() / t2Var.getMeasuredWidth());
                if (this.V && !this.b0 && this.U == null && !this.A) {
                    this.K = (getMeasuredWidth() - t2Var.getMeasuredWidth()) / 2.0f;
                    this.J = (getMeasuredHeight() - t2Var.getMeasuredHeight()) / 2.0f;
                    invalidateOutline();
                }
            }
        }
        if (this.w != null) {
            this.R = Math.max(getMeasuredWidth() / this.w.getWidth(), getMeasuredHeight() / this.w.getHeight());
        }
        if (!this.A) {
            if (this.U == null) {
                t2Var.setScaleX(this.P);
                t2Var.setScaleY(this.P);
                if (textureView != null) {
                    textureView.setScaleX(this.Q);
                    textureView.setScaleY(this.Q);
                }
                this.S = this.R;
                return;
            }
            return;
        }
        this.L /= t2Var.getMeasuredWidth() / this.O;
        this.M /= t2Var.getMeasuredWidth() / this.O;
        this.A = false;
        if (!this.b0 || getParent() == null) {
            top = this.F - getTop();
            left = this.G - getLeft();
        } else {
            View view = (View) getParent();
            top = this.F - view.getTop();
            left = this.G - view.getLeft();
        }
        this.H = 0.0f;
        this.I = 0.0f;
        if (this.D != getMeasuredHeight()) {
            float measuredHeight = (getMeasuredHeight() - this.D) / 2.0f;
            this.H = measuredHeight;
            top -= measuredHeight;
        }
        final float f9 = top;
        if (this.E != getMeasuredWidth()) {
            float measuredWidth = (getMeasuredWidth() - this.E) / 2.0f;
            this.I = measuredWidth;
            left -= measuredWidth;
        }
        setTranslationY(f9);
        setTranslationX(left);
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.U.cancel();
        }
        t2Var.setScaleX(this.L);
        t2Var.setScaleY(this.L);
        if (textureView != null) {
            textureView.setScaleX(this.M);
            textureView.setScaleY(this.M);
        }
        this.J = this.H;
        this.K = this.I;
        invalidateOutline();
        invalidate();
        final float f10 = this.L;
        final float f11 = this.M;
        final float f12 = this.N;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.U = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.voip.s2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue;
                u2 u2Var = u2.this;
                u2Var.W = f13;
                u2Var.J = u2Var.H * floatValue;
                u2Var.K = u2Var.I * floatValue;
                u2Var.invalidateOutline();
                u2Var.invalidate();
                float f14 = (u2Var.P * f13) + (f10 * floatValue);
                t2 t2Var2 = u2Var.d;
                t2Var2.setScaleX(f14);
                t2Var2.setScaleY(f14);
                float f15 = (u2Var.Q * f13) + (f11 * floatValue);
                TextureView textureView2 = u2Var.e;
                if (textureView2 != null) {
                    textureView2.setScaleX(f15);
                    textureView2.setScaleY(f15);
                }
                u2Var.setTranslationX(left * floatValue);
                u2Var.setTranslationY(f9 * floatValue);
                u2Var.S = (u2Var.R * f13) + (f12 * floatValue);
            }
        });
        long j10 = this.B;
        if (j10 != 0) {
            this.U.setDuration(j10);
        } else {
            this.U.setDuration(350L);
        }
        this.U.setInterpolator(jr.f);
        this.U.addListener(new p11(this, 16));
        this.U.start();
        ArrayList arrayList = this.C;
        if (!arrayList.isEmpty()) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                ((Animator) arrayList.get(i15)).start();
            }
        }
        arrayList.clear();
        this.B = 0L;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = this.a;
        t2 t2Var = this.d;
        if (!z10) {
            this.a0 = true;
            t2Var.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
            this.a0 = false;
        }
        super.onMeasure(i10, i11);
        e();
        super.onMeasure(i10, i11);
        t2Var.updateRotation();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.a0) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimateNextDuration(long j10) {
        this.B = j10;
    }

    public void setAnimateWithParent(boolean z10) {
        this.b0 = z10;
    }

    public void setIsScreencast(boolean z10) {
        this.c = z10;
        this.r.setVisibility(z10 ? 0 : 8);
        boolean z11 = this.c;
        TextureView textureView = this.e;
        t2 t2Var = this.d;
        if (z11) {
            t2Var.setVisibility(8);
            if (textureView != null) {
                textureView.setVisibility(8);
            }
            this.f.setVisibility(8);
            return;
        }
        t2Var.setVisibility(0);
        if (textureView != null) {
            textureView.setVisibility(0);
        }
    }

    public void setRoundCorners(float f9) {
        if (this.b != f9) {
            this.b = f9;
            invalidateOutline();
        }
    }

    public void setStub(u2 u2Var) {
        if (this.c) {
            return;
        }
        Bitmap bitmap = u2Var.d.getBitmap();
        ImageView imageView = this.f;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            imageView.setImageDrawable(u2Var.f.getDrawable());
        } else {
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        this.y = 1.0f;
        imageView.setVisibility(0);
        imageView.setAlpha(1.0f);
    }

    public void setThumb(Bitmap bitmap) {
        this.w = bitmap;
    }

    public u2(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(context);
        this.y = 1.0f;
        this.C = new ArrayList();
        this.L = 1.0f;
        this.M = 1.0f;
        this.N = 1.0f;
        this.a = z11;
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        t2 t2Var = new t2(this, context);
        this.d = t2Var;
        t2Var.setFpsReduction(30.0f);
        t2Var.setOpaque(false);
        t2Var.setEnableHardwareScaler(true);
        t2Var.setIsCamera(!z11);
        if (!z10 && z11) {
            View view = new View(context);
            this.h = view;
            view.setBackgroundColor(-14999773);
            addView(view, f6.c(-1.0f, -1));
            if (z13) {
                TextureView textureView = new TextureView(context);
                this.e = textureView;
                addView(textureView, f6.e(-1, -2, 17));
            }
            t2Var.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView(t2Var, f6.e(-1, -2, 17));
        } else if (z10) {
            if (z13) {
                TextureView textureView2 = new TextureView(context);
                this.e = textureView2;
                addView(textureView2, f6.e(-1, -2, 17));
            }
            addView(t2Var);
        } else {
            if (z13) {
                TextureView textureView3 = new TextureView(context);
                this.e = textureView3;
                addView(textureView3, f6.e(-1, -2, 17));
            }
            addView(t2Var, f6.e(-1, -2, 17));
        }
        addView(imageView);
        TextureView textureView4 = this.e;
        if (textureView4 != null) {
            textureView4.setOpaque(false);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.r = frameLayout;
        frameLayout.setBackground(new yb0(true, -14602694, -13935795, -14395293, -14203560));
        addView(frameLayout, f6.c(-1.0f, -1));
        frameLayout.setVisibility(8);
        ImageView imageView2 = new ImageView(getContext());
        this.s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView2, f6.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        this.v = textView;
        textView.setText(LocaleController.getString(R.string.VoipVideoScreenSharing));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        x3.t(textView, -1, 1, 15.0f);
        frameLayout.addView(textView, f6.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        if (z12) {
            setOutlineProvider(new ng.b(this, 5));
            setClipToOutline(true);
        }
        if (z10 && this.x == null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "voip_icthumb.jpg").getAbsolutePath());
                this.x = decodeFile;
                if (decodeFile == null) {
                    this.x = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                }
                imageView.setImageBitmap(this.x);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            } catch (Throwable unused) {
            }
        }
        if (z11) {
            return;
        }
        this.d.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
    }
}
