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
import c8.na;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.za0;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class o2 extends FrameLayout {
    public float E;
    public boolean F;
    public long G;
    public final ArrayList H;
    public int I;
    public int J;
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
    public float a0;
    public float b;
    public int b0;
    public boolean c;
    public ValueAnimator c0;
    public final n2 d;
    public boolean d0;
    public final TextureView e;
    public float e0;
    public final ImageView f;
    public boolean f0;
    public boolean g0;
    public final View h;
    public View n;
    public final FrameLayout r;
    public final ImageView s;
    public final TextView w;
    public Bitmap x;
    public final Bitmap y;

    public o2(Context context, boolean z10, boolean z11) {
        this(context, z10, z11, true, false);
    }

    public void a() {
        if (this.F || getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            return;
        }
        this.I = getMeasuredHeight();
        this.J = getMeasuredWidth();
        if (!this.g0 || getParent() == null) {
            this.K = getY();
            this.L = getX();
        } else {
            View view = (View) getParent();
            this.K = view.getY();
            this.L = view.getX();
        }
        this.Q = this.U;
        this.R = this.V;
        this.S = this.W;
        n2 n2Var = this.d;
        this.T = n2Var.getMeasuredWidth();
        n2Var.getMeasuredHeight();
        this.F = true;
        requestLayout();
    }

    public void b() {
        invalidate();
        n2 n2Var = this.d;
        if (n2Var.getAlpha() != 1.0f) {
            n2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView == null || textureView.getAlpha() == 1.0f) {
            return;
        }
        textureView.animate().setDuration(300L).alpha(1.0f);
    }

    public final void c() {
        Bitmap bitmap = this.d.getBitmap(ks.g2, ks.g2);
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

    public final void d(boolean z10, float f10) {
        if (this.c) {
            float scaleX = ((View) getParent()).getScaleX();
            this.w.setAlpha(1.0f - f10);
            float w10 = !z10 ? m10.w(0.4f, scaleX, f10, 1.0f / scaleX) : 1.0f - (0.4f * f10);
            ImageView imageView = this.s;
            imageView.setScaleX(w10);
            imageView.setScaleY(w10);
            imageView.setTranslationY(org.telegram.messenger.g0.L(60.0f) * f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z10 = org.telegram.messenger.g0.m0;
        n2 n2Var = this.d;
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
            if (n2Var != null) {
                canvas.save();
                canvas.translate(n2Var.getX(), n2Var.getY());
                Bitmap bitmap2 = n2Var.getBitmap();
                if (bitmap2 != null) {
                    canvas.scale(n2Var.getWidth() / bitmap2.getWidth(), n2Var.getHeight() / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                }
                canvas.restore();
            }
        }
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0 && n2Var.isFirstFrameRendered()) {
            float f10 = this.E - 0.10666667f;
            this.E = f10;
            if (f10 <= 0.0f) {
                this.E = 0.0f;
                imageView.setVisibility(8);
            } else {
                invalidate();
                imageView.setAlpha(this.E);
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
            n2 n2Var = this.d;
            layoutParams.width = n2Var.getMeasuredWidth();
            textureView.getLayoutParams().height = n2Var.getMeasuredHeight();
        }
    }

    public View getPlaceholderView() {
        if (this.n == null) {
            View view = new View(getContext());
            this.n = view;
            addView(view, na.g());
        }
        return this.n;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        float top;
        final float left;
        super.onLayout(z10, i7, i10, i11, i12);
        TextureView textureView = this.e;
        if (textureView != null) {
            this.V = Math.max(getMeasuredHeight() / textureView.getMeasuredHeight(), getMeasuredWidth() / textureView.getMeasuredWidth());
        }
        boolean z11 = this.a;
        n2 n2Var = this.d;
        if (!z11) {
            n2Var.updateRotation();
        }
        if (this.b0 == 3) {
            if (textureView != null) {
                textureView.setScaleX(this.V);
                textureView.setScaleY(this.V);
                return;
            }
            return;
        }
        if (n2Var.getMeasuredHeight() == 0 || n2Var.getMeasuredWidth() == 0 || getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            this.U = 1.0f;
            if (this.c0 == null && !this.F) {
                this.P = 0.0f;
                this.O = 0.0f;
            }
        } else {
            int i13 = this.b0;
            if (i13 == 0) {
                this.U = Math.max(getMeasuredHeight() / n2Var.getMeasuredHeight(), getMeasuredWidth() / n2Var.getMeasuredWidth());
            } else if (i13 == 2) {
                if (Math.abs((getMeasuredHeight() / getMeasuredWidth()) - 1.0f) < 0.02f) {
                    this.U = Math.max(getMeasuredHeight() / n2Var.getMeasuredHeight(), getMeasuredWidth() / n2Var.getMeasuredWidth());
                } else if (getMeasuredWidth() <= getMeasuredHeight() || n2Var.getMeasuredHeight() <= n2Var.getMeasuredWidth()) {
                    this.U = Math.min(getMeasuredHeight() / n2Var.getMeasuredHeight(), getMeasuredWidth() / n2Var.getMeasuredWidth());
                } else {
                    this.U = Math.max(getMeasuredHeight() / n2Var.getMeasuredHeight(), (getMeasuredWidth() / 2.0f) / n2Var.getMeasuredWidth());
                }
            } else if (i13 == 1) {
                this.U = Math.min(getMeasuredHeight() / n2Var.getMeasuredHeight(), getMeasuredWidth() / n2Var.getMeasuredWidth());
                if (this.d0 && !this.g0 && this.c0 == null && !this.F) {
                    this.P = (getMeasuredWidth() - n2Var.getMeasuredWidth()) / 2.0f;
                    this.O = (getMeasuredHeight() - n2Var.getMeasuredHeight()) / 2.0f;
                    invalidateOutline();
                }
            }
        }
        if (this.x != null) {
            this.W = Math.max(getMeasuredWidth() / this.x.getWidth(), getMeasuredHeight() / this.x.getHeight());
        }
        if (!this.F) {
            if (this.c0 == null) {
                n2Var.setScaleX(this.U);
                n2Var.setScaleY(this.U);
                if (textureView != null) {
                    textureView.setScaleX(this.V);
                    textureView.setScaleY(this.V);
                }
                this.a0 = this.W;
                return;
            }
            return;
        }
        this.Q /= n2Var.getMeasuredWidth() / this.T;
        this.R /= n2Var.getMeasuredWidth() / this.T;
        this.F = false;
        if (!this.g0 || getParent() == null) {
            top = this.K - getTop();
            left = this.L - getLeft();
        } else {
            View view = (View) getParent();
            top = this.K - view.getTop();
            left = this.L - view.getLeft();
        }
        this.M = 0.0f;
        this.N = 0.0f;
        if (this.I != getMeasuredHeight()) {
            float measuredHeight = (getMeasuredHeight() - this.I) / 2.0f;
            this.M = measuredHeight;
            top -= measuredHeight;
        }
        final float f10 = top;
        if (this.J != getMeasuredWidth()) {
            float measuredWidth = (getMeasuredWidth() - this.J) / 2.0f;
            this.N = measuredWidth;
            left -= measuredWidth;
        }
        setTranslationY(f10);
        setTranslationX(left);
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.c0.cancel();
        }
        n2Var.setScaleX(this.Q);
        n2Var.setScaleY(this.Q);
        if (textureView != null) {
            textureView.setScaleX(this.R);
            textureView.setScaleY(this.R);
        }
        this.O = this.M;
        this.P = this.N;
        invalidateOutline();
        invalidate();
        final float f11 = this.Q;
        final float f12 = this.R;
        final float f13 = this.S;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.c0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.voip.m2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f14 = 1.0f - floatValue;
                o2 o2Var = o2.this;
                o2Var.e0 = f14;
                o2Var.O = o2Var.M * floatValue;
                o2Var.P = o2Var.N * floatValue;
                o2Var.invalidateOutline();
                o2Var.invalidate();
                float f15 = (o2Var.U * f14) + (f11 * floatValue);
                n2 n2Var2 = o2Var.d;
                n2Var2.setScaleX(f15);
                n2Var2.setScaleY(f15);
                float f16 = (o2Var.V * f14) + (f12 * floatValue);
                TextureView textureView2 = o2Var.e;
                if (textureView2 != null) {
                    textureView2.setScaleX(f16);
                    textureView2.setScaleY(f16);
                }
                o2Var.setTranslationX(left * floatValue);
                o2Var.setTranslationY(f10 * floatValue);
                o2Var.a0 = (o2Var.W * f14) + (f13 * floatValue);
            }
        });
        long j3 = this.G;
        if (j3 != 0) {
            this.c0.setDuration(j3);
        } else {
            this.c0.setDuration(350L);
        }
        this.c0.setInterpolator(kr.f);
        this.c0.addListener(new x9(this, 17));
        this.c0.start();
        ArrayList arrayList = this.H;
        if (!arrayList.isEmpty()) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((Animator) arrayList.get(i14)).start();
            }
        }
        arrayList.clear();
        this.G = 0L;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        boolean z10 = this.a;
        n2 n2Var = this.d;
        if (!z10) {
            this.f0 = true;
            n2Var.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
            this.f0 = false;
        }
        super.onMeasure(i7, i10);
        e();
        super.onMeasure(i7, i10);
        n2Var.updateRotation();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f0) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimateNextDuration(long j3) {
        this.G = j3;
    }

    public void setAnimateWithParent(boolean z10) {
        this.g0 = z10;
    }

    public void setIsScreencast(boolean z10) {
        this.c = z10;
        this.r.setVisibility(z10 ? 0 : 8);
        boolean z11 = this.c;
        TextureView textureView = this.e;
        n2 n2Var = this.d;
        if (z11) {
            n2Var.setVisibility(8);
            if (textureView != null) {
                textureView.setVisibility(8);
            }
            this.f.setVisibility(8);
            return;
        }
        n2Var.setVisibility(0);
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

    public void setStub(o2 o2Var) {
        if (this.c) {
            return;
        }
        Bitmap bitmap = o2Var.d.getBitmap();
        ImageView imageView = this.f;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            imageView.setImageDrawable(o2Var.f.getDrawable());
        } else {
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        this.E = 1.0f;
        imageView.setVisibility(0);
        imageView.setAlpha(1.0f);
    }

    public void setThumb(Bitmap bitmap) {
        this.x = bitmap;
    }

    public o2(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(context);
        this.E = 1.0f;
        this.H = new ArrayList();
        this.Q = 1.0f;
        this.R = 1.0f;
        this.S = 1.0f;
        this.a = z11;
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        n2 n2Var = new n2(this, context);
        this.d = n2Var;
        n2Var.setFpsReduction(30.0f);
        n2Var.setOpaque(false);
        n2Var.setEnableHardwareScaler(true);
        n2Var.setIsCamera(!z11);
        if (!z10 && z11) {
            View view = new View(context);
            this.h = view;
            view.setBackgroundColor(-14999773);
            addView(view, na.c(-1.0f, -1));
            if (z13) {
                TextureView textureView = new TextureView(context);
                this.e = textureView;
                addView(textureView, na.e(-1, -2, 17));
            }
            n2Var.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView(n2Var, na.e(-1, -2, 17));
        } else if (z10) {
            if (z13) {
                TextureView textureView2 = new TextureView(context);
                this.e = textureView2;
                addView(textureView2, na.e(-1, -2, 17));
            }
            addView(n2Var);
        } else {
            if (z13) {
                TextureView textureView3 = new TextureView(context);
                this.e = textureView3;
                addView(textureView3, na.e(-1, -2, 17));
            }
            addView(n2Var, na.e(-1, -2, 17));
        }
        addView(imageView);
        TextureView textureView4 = this.e;
        if (textureView4 != null) {
            textureView4.setOpaque(false);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.r = frameLayout;
        frameLayout.setBackground(new za0(true, -14602694, -13935795, -14395293, -14203560));
        addView(frameLayout, na.c(-1.0f, -1));
        int i7 = 8;
        frameLayout.setVisibility(8);
        ImageView imageView2 = new ImageView(getContext());
        this.s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView2, na.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        this.w = textView;
        textView.setText(gd.N0(2131742972, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, na.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        if (z12) {
            setOutlineProvider(new fh.a(this, i7));
            setClipToOutline(true);
        }
        if (z10 && this.y == null) {
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
        if (z11) {
            return;
        }
        this.d.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
    }
}
