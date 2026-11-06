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
import c8.ha;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.va;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class k2 extends FrameLayout {
    public float D;
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
    public final j2 d;
    public float d0;
    public final TextureView e;
    public boolean e0;
    public final ImageView f;
    public boolean f0;
    public final View h;
    public View n;
    public final FrameLayout r;
    public final ImageView s;
    public final TextView w;
    public Bitmap x;
    public final Bitmap y;

    public k2(Context context, boolean z9, boolean z10) {
        this(context, z9, z10, true, false);
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
        j2 j2Var = this.d;
        this.S = j2Var.getMeasuredWidth();
        j2Var.getMeasuredHeight();
        this.E = true;
        requestLayout();
    }

    public void b() {
        invalidate();
        j2 j2Var = this.d;
        if (j2Var.getAlpha() != 1.0f) {
            j2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView == null || textureView.getAlpha() == 1.0f) {
            return;
        }
        textureView.animate().setDuration(300L).alpha(1.0f);
    }

    public final void c() {
        Bitmap bitmap = this.d.getBitmap(qs.g2, qs.g2);
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.blurBitmap(bitmap, 3);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.t0.h(), "voip_icthumb.jpg"));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable unused) {
        }
    }

    public final void d(boolean z9, float f10) {
        if (this.c) {
            float scaleX = ((View) getParent()).getScaleX();
            this.w.setAlpha(1.0f - f10);
            float v = !z9 ? org.telegram.messenger.camera.q.v(0.4f, scaleX, f10, 1.0f / scaleX) : 1.0f - (0.4f * f10);
            ImageView imageView = this.s;
            imageView.setScaleX(v);
            imageView.setScaleY(v);
            imageView.setTranslationY(org.telegram.messenger.g0.L(60.0f) * f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z9 = org.telegram.messenger.g0.m0;
        j2 j2Var = this.d;
        if (z9) {
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
            if (j2Var != null) {
                canvas.save();
                canvas.translate(j2Var.getX(), j2Var.getY());
                Bitmap bitmap2 = j2Var.getBitmap();
                if (bitmap2 != null) {
                    canvas.scale(j2Var.getWidth() / bitmap2.getWidth(), j2Var.getHeight() / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                }
                canvas.restore();
            }
        }
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0 && j2Var.isFirstFrameRendered()) {
            float f10 = this.D - 0.10666667f;
            this.D = f10;
            if (f10 <= 0.0f) {
                this.D = 0.0f;
                imageView.setVisibility(8);
            } else {
                invalidate();
                imageView.setAlpha(this.D);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (org.telegram.messenger.g0.m0 && (view == this.d || view == this.e)) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    public void e() {
        TextureView textureView = this.e;
        if (textureView != null) {
            ViewGroup.LayoutParams layoutParams = textureView.getLayoutParams();
            j2 j2Var = this.d;
            layoutParams.width = j2Var.getMeasuredWidth();
            textureView.getLayoutParams().height = j2Var.getMeasuredHeight();
        }
    }

    public View getPlaceholderView() {
        if (this.n == null) {
            View view = new View(getContext());
            this.n = view;
            addView(view, ha.g());
        }
        return this.n;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        float top;
        final float left;
        super.onLayout(z9, i7, i10, i11, i12);
        TextureView textureView = this.e;
        if (textureView != null) {
            this.U = Math.max(getMeasuredHeight() / textureView.getMeasuredHeight(), getMeasuredWidth() / textureView.getMeasuredWidth());
        }
        boolean z10 = this.a;
        j2 j2Var = this.d;
        if (!z10) {
            j2Var.updateRotation();
        }
        if (this.a0 == 3) {
            if (textureView != null) {
                textureView.setScaleX(this.U);
                textureView.setScaleY(this.U);
                return;
            }
            return;
        }
        if (j2Var.getMeasuredHeight() == 0 || j2Var.getMeasuredWidth() == 0 || getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            this.T = 1.0f;
            if (this.b0 == null && !this.E) {
                this.O = 0.0f;
                this.N = 0.0f;
            }
        } else {
            int i13 = this.a0;
            if (i13 == 0) {
                this.T = Math.max(getMeasuredHeight() / j2Var.getMeasuredHeight(), getMeasuredWidth() / j2Var.getMeasuredWidth());
            } else if (i13 == 2) {
                if (Math.abs((getMeasuredHeight() / getMeasuredWidth()) - 1.0f) < 0.02f) {
                    this.T = Math.max(getMeasuredHeight() / j2Var.getMeasuredHeight(), getMeasuredWidth() / j2Var.getMeasuredWidth());
                } else if (getMeasuredWidth() <= getMeasuredHeight() || j2Var.getMeasuredHeight() <= j2Var.getMeasuredWidth()) {
                    this.T = Math.min(getMeasuredHeight() / j2Var.getMeasuredHeight(), getMeasuredWidth() / j2Var.getMeasuredWidth());
                } else {
                    this.T = Math.max(getMeasuredHeight() / j2Var.getMeasuredHeight(), (getMeasuredWidth() / 2.0f) / j2Var.getMeasuredWidth());
                }
            } else if (i13 == 1) {
                this.T = Math.min(getMeasuredHeight() / j2Var.getMeasuredHeight(), getMeasuredWidth() / j2Var.getMeasuredWidth());
                if (this.c0 && !this.f0 && this.b0 == null && !this.E) {
                    this.O = (getMeasuredWidth() - j2Var.getMeasuredWidth()) / 2.0f;
                    this.N = (getMeasuredHeight() - j2Var.getMeasuredHeight()) / 2.0f;
                    invalidateOutline();
                }
            }
        }
        if (this.x != null) {
            this.V = Math.max(getMeasuredWidth() / this.x.getWidth(), getMeasuredHeight() / this.x.getHeight());
        }
        if (!this.E) {
            if (this.b0 == null) {
                j2Var.setScaleX(this.T);
                j2Var.setScaleY(this.T);
                if (textureView != null) {
                    textureView.setScaleX(this.U);
                    textureView.setScaleY(this.U);
                }
                this.W = this.V;
                return;
            }
            return;
        }
        this.P /= j2Var.getMeasuredWidth() / this.S;
        this.Q /= j2Var.getMeasuredWidth() / this.S;
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
        final float f10 = top;
        if (this.I != getMeasuredWidth()) {
            float measuredWidth = (getMeasuredWidth() - this.I) / 2.0f;
            this.M = measuredWidth;
            left -= measuredWidth;
        }
        setTranslationY(f10);
        setTranslationX(left);
        ValueAnimator valueAnimator = this.b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.b0.cancel();
        }
        j2Var.setScaleX(this.P);
        j2Var.setScaleY(this.P);
        if (textureView != null) {
            textureView.setScaleX(this.Q);
            textureView.setScaleY(this.Q);
        }
        this.N = this.L;
        this.O = this.M;
        invalidateOutline();
        invalidate();
        final float f11 = this.P;
        final float f12 = this.Q;
        final float f13 = this.R;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.b0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.voip.i2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f14 = 1.0f - floatValue;
                k2 k2Var = k2.this;
                k2Var.d0 = f14;
                k2Var.N = k2Var.L * floatValue;
                k2Var.O = k2Var.M * floatValue;
                k2Var.invalidateOutline();
                k2Var.invalidate();
                float f15 = (k2Var.T * f14) + (f11 * floatValue);
                j2 j2Var2 = k2Var.d;
                j2Var2.setScaleX(f15);
                j2Var2.setScaleY(f15);
                float f16 = (k2Var.U * f14) + (f12 * floatValue);
                TextureView textureView2 = k2Var.e;
                if (textureView2 != null) {
                    textureView2.setScaleX(f16);
                    textureView2.setScaleY(f16);
                }
                k2Var.setTranslationX(left * floatValue);
                k2Var.setTranslationY(f10 * floatValue);
                k2Var.W = (k2Var.V * f14) + (f13 * floatValue);
            }
        });
        long j3 = this.F;
        if (j3 != 0) {
            this.b0.setDuration(j3);
        } else {
            this.b0.setDuration(350L);
        }
        this.b0.setInterpolator(xq.f);
        this.b0.addListener(new va(this, 16));
        this.b0.start();
        ArrayList arrayList = this.G;
        if (!arrayList.isEmpty()) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((Animator) arrayList.get(i14)).start();
            }
        }
        arrayList.clear();
        this.F = 0L;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        boolean z9 = this.a;
        j2 j2Var = this.d;
        if (!z9) {
            this.e0 = true;
            j2Var.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
            this.e0 = false;
        }
        super.onMeasure(i7, i10);
        e();
        super.onMeasure(i7, i10);
        j2Var.updateRotation();
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

    public void setAnimateWithParent(boolean z9) {
        this.f0 = z9;
    }

    public void setIsScreencast(boolean z9) {
        this.c = z9;
        this.r.setVisibility(z9 ? 0 : 8);
        boolean z10 = this.c;
        TextureView textureView = this.e;
        j2 j2Var = this.d;
        if (z10) {
            j2Var.setVisibility(8);
            if (textureView != null) {
                textureView.setVisibility(8);
            }
            this.f.setVisibility(8);
            return;
        }
        j2Var.setVisibility(0);
        if (textureView != null) {
            textureView.setVisibility(0);
        }
    }

    public void setRoundCorners(float f10) {
        if (this.b != f10) {
            this.b = f10;
            invalidateOutline();
        }
    }

    public void setStub(k2 k2Var) {
        if (this.c) {
            return;
        }
        Bitmap bitmap = k2Var.d.getBitmap();
        ImageView imageView = this.f;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            imageView.setImageDrawable(k2Var.f.getDrawable());
        } else {
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        this.D = 1.0f;
        imageView.setVisibility(0);
        imageView.setAlpha(1.0f);
    }

    public void setThumb(Bitmap bitmap) {
        this.x = bitmap;
    }

    public k2(Context context, boolean z9, boolean z10, boolean z11, boolean z12) {
        super(context);
        this.D = 1.0f;
        this.G = new ArrayList();
        this.P = 1.0f;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.a = z10;
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        j2 j2Var = new j2(this, context);
        this.d = j2Var;
        j2Var.setFpsReduction(30.0f);
        j2Var.setOpaque(false);
        j2Var.setEnableHardwareScaler(true);
        j2Var.setIsCamera(!z10);
        if (!z9 && z10) {
            View view = new View(context);
            this.h = view;
            view.setBackgroundColor(-14999773);
            addView(view, ha.c(-1.0f, -1));
            if (z12) {
                TextureView textureView = new TextureView(context);
                this.e = textureView;
                addView(textureView, ha.e(-1, -2, 17));
            }
            j2Var.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView(j2Var, ha.e(-1, -2, 17));
        } else if (z9) {
            if (z12) {
                TextureView textureView2 = new TextureView(context);
                this.e = textureView2;
                addView(textureView2, ha.e(-1, -2, 17));
            }
            addView(j2Var);
        } else {
            if (z12) {
                TextureView textureView3 = new TextureView(context);
                this.e = textureView3;
                addView(textureView3, ha.e(-1, -2, 17));
            }
            addView(j2Var, ha.e(-1, -2, 17));
        }
        addView(imageView);
        TextureView textureView4 = this.e;
        if (textureView4 != null) {
            textureView4.setOpaque(false);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.r = frameLayout;
        frameLayout.setBackground(new qa0(true, -14602694, -13935795, -14395293, -14203560));
        addView(frameLayout, ha.c(-1.0f, -1));
        int i7 = 8;
        frameLayout.setVisibility(8);
        ImageView imageView2 = new ImageView(getContext());
        this.s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView2, ha.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        this.w = textView;
        textView.setText(hd.M0(2131743223, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, ha.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        if (z11) {
            setOutlineProvider(new fh.a(this, i7));
            setClipToOutline(true);
        }
        if (z9 && this.y == null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "voip_icthumb.jpg").getAbsolutePath());
                this.y = decodeFile;
                if (decodeFile == null) {
                    this.y = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                }
                imageView.setImageBitmap(this.y);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            } catch (Throwable unused) {
            }
        }
        if (z10) {
            return;
        }
        this.d.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
    }
}
