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
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zn0;
import org.webrtc.RendererCommon;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class r2 extends FrameLayout {
    public boolean E;
    public long F;
    public final ArrayList G;
    public int H;
    public int I;
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
    public float T;
    public float U;
    public float V;
    public float W;
    public final boolean a;
    public int a0;
    public float b;
    public ValueAnimator b0;
    public boolean c;
    public boolean c0;
    public final q2 d;
    public float d0;
    public final TextureView e;
    public boolean e0;
    public final ImageView f;
    public boolean f0;
    public final View h;
    public View n;
    public final FrameLayout r;
    public final ImageView s;
    public final TextView v;
    public Bitmap w;
    public final Bitmap x;
    public float y;

    public r2(Context context, boolean z10, boolean z11) {
        this(context, z10, z11, true, false);
    }

    public void a() {
        if (this.E || getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            return;
        }
        this.H = getMeasuredHeight();
        this.I = getMeasuredWidth();
        if (!this.f0 || getParent() == null) {
            this.J = getY();
            this.K = getX();
        } else {
            View view = (View) getParent();
            this.J = view.getY();
            this.K = view.getX();
        }
        this.P = this.T;
        this.Q = this.U;
        this.R = this.V;
        q2 q2Var = this.d;
        this.S = q2Var.getMeasuredWidth();
        q2Var.getMeasuredHeight();
        this.E = true;
        requestLayout();
    }

    public void b() {
        invalidate();
        q2 q2Var = this.d;
        if (q2Var.getAlpha() != 1.0f) {
            q2Var.animate().setDuration(300L).alpha(1.0f);
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

    public final void d(float f7, boolean z10) {
        if (this.c) {
            float scaleX = ((View) getParent()).getScaleX();
            this.v.setAlpha(1.0f - f7);
            float c10 = !z10 ? em.c(0.4f, scaleX, f7, 1.0f / scaleX) : 1.0f - (0.4f * f7);
            ImageView imageView = this.s;
            imageView.setScaleX(c10);
            imageView.setScaleY(c10);
            imageView.setTranslationY(AndroidUtilities.dp(60.0f) * f7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z10 = AndroidUtilities.makingGlobalBlurBitmap;
        q2 q2Var = this.d;
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
            if (q2Var != null) {
                canvas.save();
                canvas.translate(q2Var.getX(), q2Var.getY());
                Bitmap bitmap2 = q2Var.getBitmap();
                if (bitmap2 != null) {
                    canvas.scale(q2Var.getWidth() / bitmap2.getWidth(), q2Var.getHeight() / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                }
                canvas.restore();
            }
        }
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0 && q2Var.isFirstFrameRendered()) {
            float f7 = this.y - 0.10666667f;
            this.y = f7;
            if (f7 <= 0.0f) {
                this.y = 0.0f;
                imageView.setVisibility(8);
            } else {
                invalidate();
                imageView.setAlpha(this.y);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (AndroidUtilities.makingGlobalBlurBitmap && (view == this.d || view == this.e)) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    public void e() {
        TextureView textureView = this.e;
        if (textureView != null) {
            ViewGroup.LayoutParams layoutParams = textureView.getLayoutParams();
            q2 q2Var = this.d;
            layoutParams.width = q2Var.getMeasuredWidth();
            textureView.getLayoutParams().height = q2Var.getMeasuredHeight();
        }
    }

    public View getPlaceholderView() {
        if (this.n == null) {
            View view = new View(getContext());
            this.n = view;
            addView(view, a6.g());
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
            this.U = Math.max(getMeasuredHeight() / textureView.getMeasuredHeight(), getMeasuredWidth() / textureView.getMeasuredWidth());
        }
        boolean z11 = this.a;
        q2 q2Var = this.d;
        if (!z11) {
            q2Var.updateRotation();
        }
        if (this.a0 == 3) {
            if (textureView != null) {
                textureView.setScaleX(this.U);
                textureView.setScaleY(this.U);
                return;
            }
            return;
        }
        if (q2Var.getMeasuredHeight() == 0 || q2Var.getMeasuredWidth() == 0 || getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            this.T = 1.0f;
            if (this.b0 == null && !this.E) {
                this.O = 0.0f;
                this.N = 0.0f;
            }
        } else {
            int i14 = this.a0;
            if (i14 == 0) {
                this.T = Math.max(getMeasuredHeight() / q2Var.getMeasuredHeight(), getMeasuredWidth() / q2Var.getMeasuredWidth());
            } else if (i14 == 2) {
                if (Math.abs((getMeasuredHeight() / getMeasuredWidth()) - 1.0f) < 0.02f) {
                    this.T = Math.max(getMeasuredHeight() / q2Var.getMeasuredHeight(), getMeasuredWidth() / q2Var.getMeasuredWidth());
                } else if (getMeasuredWidth() <= getMeasuredHeight() || q2Var.getMeasuredHeight() <= q2Var.getMeasuredWidth()) {
                    this.T = Math.min(getMeasuredHeight() / q2Var.getMeasuredHeight(), getMeasuredWidth() / q2Var.getMeasuredWidth());
                } else {
                    this.T = Math.max(getMeasuredHeight() / q2Var.getMeasuredHeight(), (getMeasuredWidth() / 2.0f) / q2Var.getMeasuredWidth());
                }
            } else if (i14 == 1) {
                this.T = Math.min(getMeasuredHeight() / q2Var.getMeasuredHeight(), getMeasuredWidth() / q2Var.getMeasuredWidth());
                if (this.c0 && !this.f0 && this.b0 == null && !this.E) {
                    this.O = (getMeasuredWidth() - q2Var.getMeasuredWidth()) / 2.0f;
                    this.N = (getMeasuredHeight() - q2Var.getMeasuredHeight()) / 2.0f;
                    invalidateOutline();
                }
            }
        }
        if (this.w != null) {
            this.V = Math.max(getMeasuredWidth() / this.w.getWidth(), getMeasuredHeight() / this.w.getHeight());
        }
        if (!this.E) {
            if (this.b0 == null) {
                q2Var.setScaleX(this.T);
                q2Var.setScaleY(this.T);
                if (textureView != null) {
                    textureView.setScaleX(this.U);
                    textureView.setScaleY(this.U);
                }
                this.W = this.V;
                return;
            }
            return;
        }
        this.P /= q2Var.getMeasuredWidth() / this.S;
        this.Q /= q2Var.getMeasuredWidth() / this.S;
        this.E = false;
        if (!this.f0 || getParent() == null) {
            top = this.J - getTop();
            left = this.K - getLeft();
        } else {
            View view = (View) getParent();
            top = this.J - view.getTop();
            left = this.K - view.getLeft();
        }
        this.L = 0.0f;
        this.M = 0.0f;
        if (this.H != getMeasuredHeight()) {
            float measuredHeight = (getMeasuredHeight() - this.H) / 2.0f;
            this.L = measuredHeight;
            top -= measuredHeight;
        }
        final float f7 = top;
        if (this.I != getMeasuredWidth()) {
            float measuredWidth = (getMeasuredWidth() - this.I) / 2.0f;
            this.M = measuredWidth;
            left -= measuredWidth;
        }
        setTranslationY(f7);
        setTranslationX(left);
        ValueAnimator valueAnimator = this.b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.b0.cancel();
        }
        q2Var.setScaleX(this.P);
        q2Var.setScaleY(this.P);
        if (textureView != null) {
            textureView.setScaleX(this.Q);
            textureView.setScaleY(this.Q);
        }
        this.N = this.L;
        this.O = this.M;
        invalidateOutline();
        invalidate();
        final float f10 = this.P;
        final float f11 = this.Q;
        final float f12 = this.R;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.b0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.voip.p2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue;
                r2 r2Var = r2.this;
                r2Var.d0 = f13;
                r2Var.N = r2Var.L * floatValue;
                r2Var.O = r2Var.M * floatValue;
                r2Var.invalidateOutline();
                r2Var.invalidate();
                float f14 = (r2Var.T * f13) + (f10 * floatValue);
                q2 q2Var2 = r2Var.d;
                q2Var2.setScaleX(f14);
                q2Var2.setScaleY(f14);
                float f15 = (r2Var.U * f13) + (f11 * floatValue);
                TextureView textureView2 = r2Var.e;
                if (textureView2 != null) {
                    textureView2.setScaleX(f15);
                    textureView2.setScaleY(f15);
                }
                r2Var.setTranslationX(left * floatValue);
                r2Var.setTranslationY(f7 * floatValue);
                r2Var.W = (r2Var.V * f13) + (f12 * floatValue);
            }
        });
        long j3 = this.F;
        if (j3 != 0) {
            this.b0.setDuration(j3);
        } else {
            this.b0.setDuration(350L);
        }
        this.b0.setInterpolator(wr.f);
        this.b0.addListener(new zn0(this, 28));
        this.b0.start();
        ArrayList arrayList = this.G;
        if (!arrayList.isEmpty()) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                ((Animator) arrayList.get(i15)).start();
            }
        }
        arrayList.clear();
        this.F = 0L;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = this.a;
        q2 q2Var = this.d;
        if (!z10) {
            this.e0 = true;
            q2Var.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
            this.e0 = false;
        }
        super.onMeasure(i10, i11);
        e();
        super.onMeasure(i10, i11);
        q2Var.updateRotation();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.e0) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimateNextDuration(long j3) {
        this.F = j3;
    }

    public void setAnimateWithParent(boolean z10) {
        this.f0 = z10;
    }

    public void setIsScreencast(boolean z10) {
        this.c = z10;
        this.r.setVisibility(z10 ? 0 : 8);
        boolean z11 = this.c;
        TextureView textureView = this.e;
        q2 q2Var = this.d;
        if (z11) {
            q2Var.setVisibility(8);
            if (textureView != null) {
                textureView.setVisibility(8);
            }
            this.f.setVisibility(8);
            return;
        }
        q2Var.setVisibility(0);
        if (textureView != null) {
            textureView.setVisibility(0);
        }
    }

    public void setRoundCorners(float f7) {
        if (this.b != f7) {
            this.b = f7;
            invalidateOutline();
        }
    }

    public void setStub(r2 r2Var) {
        if (this.c) {
            return;
        }
        Bitmap bitmap = r2Var.d.getBitmap();
        ImageView imageView = this.f;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            imageView.setImageDrawable(r2Var.f.getDrawable());
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

    public r2(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(context);
        this.y = 1.0f;
        this.G = new ArrayList();
        this.P = 1.0f;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.a = z11;
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        q2 q2Var = new q2(this, context);
        this.d = q2Var;
        q2Var.setFpsReduction(30.0f);
        q2Var.setOpaque(false);
        q2Var.setEnableHardwareScaler(true);
        q2Var.setIsCamera(!z11);
        if (!z10 && z11) {
            View view = new View(context);
            this.h = view;
            view.setBackgroundColor(-14999773);
            addView(view, a6.c(-1.0f, -1));
            if (z13) {
                TextureView textureView = new TextureView(context);
                this.e = textureView;
                addView(textureView, a6.e(-1, -2, 17));
            }
            q2Var.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView(q2Var, a6.e(-1, -2, 17));
        } else if (z10) {
            if (z13) {
                TextureView textureView2 = new TextureView(context);
                this.e = textureView2;
                addView(textureView2, a6.e(-1, -2, 17));
            }
            addView(q2Var);
        } else {
            if (z13) {
                TextureView textureView3 = new TextureView(context);
                this.e = textureView3;
                addView(textureView3, a6.e(-1, -2, 17));
            }
            addView(q2Var, a6.e(-1, -2, 17));
        }
        addView(imageView);
        TextureView textureView4 = this.e;
        if (textureView4 != null) {
            textureView4.setOpaque(false);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.r = frameLayout;
        frameLayout.setBackground(new lc0(true, -14602694, -13935795, -14395293, -14203560));
        addView(frameLayout, a6.c(-1.0f, -1));
        frameLayout.setVisibility(8);
        ImageView imageView2 = new ImageView(getContext());
        this.s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView2, a6.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        this.v = textView;
        textView.setText(LocaleController.getString(R.string.VoipVideoScreenSharing));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        org.telegram.messenger.a2.q(textView, -1, 1, 15.0f);
        frameLayout.addView(textView, a6.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        if (z12) {
            setOutlineProvider(new bh.b(this, 5));
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
