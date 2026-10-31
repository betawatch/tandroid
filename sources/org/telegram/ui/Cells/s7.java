package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class s7 extends FrameLayout {
    public static long E0;
    public static boolean F0;
    public ValueAnimator A0;
    public float B0;
    public boolean C0;
    public boolean D;
    public final org.telegram.ui.Components.t5 D0;
    public boolean E;
    public StaticLayout F;
    public String G;
    public boolean H;
    public int I;
    public Bitmap J;
    public Paint K;
    public boolean L;
    public final org.telegram.ui.Components.t5 M;
    public final org.telegram.ui.Components.e6 N;
    public qz0 O;
    public CheckBoxBase P;
    public final m.p3 Q;
    public boolean R;
    public float S;
    public float T;
    public float U;
    public boolean V;
    public boolean W;
    public int a;
    public boolean a0;
    public final ImageReceiver b;
    public GradientDrawable b0;
    public final ImageReceiver c;
    public boolean c0;
    public final ImageReceiver d;
    public boolean d0;
    public fo0 e;
    public boolean e0;
    public final int f;
    public boolean f0;
    public final Path g0;
    public boolean h;
    public nh.i h0;
    public float i0;
    public float j0;
    public float k0;
    public float l0;
    public nh.h m0;
    public jj n;
    public final Path n0;
    public qz0 o0;
    public qz0 p0;
    public qz0 q0;
    public int r;
    public int r0;
    public zz s;
    public final Paint s0;
    public final Paint t0;
    public final org.telegram.ui.Components.t5 u0;
    public jc v0;
    public s7 w;
    public boolean w0;
    public float x;
    public boolean x0;
    public float y;
    public final RectF y0;
    public Path z0;

    public s7(Context context, m.p3 p3Var, int i10) {
        super(context);
        this.a = 0;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.c = imageReceiver2;
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.d = imageReceiver3;
        this.x = 1.0f;
        this.y = 1.0f;
        this.H = true;
        gr grVar = gr.h;
        this.M = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.N = e6Var;
        this.g0 = new Path();
        this.n0 = new Path();
        this.r0 = 0;
        this.s0 = new Paint(1);
        this.t0 = new Paint(1);
        this.u0 = new org.telegram.ui.Components.t5(this, 0L, 200L, grVar);
        this.y0 = new RectF();
        this.D0 = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        this.Q = p3Var;
        this.f = i10;
        i(false, false);
        imageReceiver2.H0(this);
        imageReceiver.H0(this);
        imageReceiver3.H0(this);
        imageReceiver2.g1 = new ca(this, 6);
        e6Var.setCallback(this);
        e6Var.w(org.telegram.messenger.i0.L(12.0f));
        e6Var.u(-1);
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.M = org.telegram.messenger.i0.q.x;
        setWillNotDraw(false);
    }

    private float getPadding() {
        if (this.S != 0.0f) {
            float f7 = this.T;
            if (f7 == 9.0f || this.r == 9) {
                if (f7 == 9.0f) {
                    return c3.i0.z(1.0f, this.S, org.telegram.messenger.i0.N(2.0f), org.telegram.messenger.i0.N(1.0f) * this.S);
                }
                return c3.i0.z(1.0f, this.S, org.telegram.messenger.i0.N(1.0f), org.telegram.messenger.i0.N(2.0f) * this.S);
            }
        }
        return this.r == 9 ? org.telegram.messenger.i0.N(1.0f) : org.telegram.messenger.i0.N(2.0f);
    }

    private void setPrivacyType(int i10) {
        if (this.I == i10) {
            return;
        }
        this.I = i10;
        this.J = null;
        int i11 = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 100 ? 0 : R.drawable.msg_pin_mini : R.drawable.msg_folders_groups : R.drawable.msg_folders_private : R.drawable.msg_stories_closefriends;
        if (i11 != 0) {
            Context context = getContext();
            HashMap hashMap = (HashMap) this.Q.h;
            Bitmap bitmap = (Bitmap) hashMap.get(Integer.valueOf(i11));
            if (bitmap == null) {
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i11);
                int width = decodeResource.getWidth();
                int height = decodeResource.getHeight();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                paint.setColorFilter(new PorterDuffColorFilter(-10461088, mode));
                canvas.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                Utilities.stackBlurBitmap(createBitmap, org.telegram.messenger.i0.L(1.0f));
                Bitmap createBitmap2 = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight(), config);
                Canvas canvas2 = new Canvas(createBitmap2);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
                canvas2.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                createBitmap.recycle();
                decodeResource.recycle();
                hashMap.put(Integer.valueOf(i11), createBitmap2);
                bitmap = createBitmap2;
            }
            this.J = bitmap;
        }
        invalidate();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11) {
        canvas.save();
        if (this.z0 == null) {
            this.z0 = new Path();
        }
        this.z0.rewind();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, f7, f10);
        float L = org.telegram.messenger.i0.L(12.0f) * f11;
        this.z0.addRoundRect(rectF, L, L, Path.Direction.CW);
        this.z0.close();
        canvas.clipPath(this.z0);
        canvas.scale(f7 / getWidth(), f10 / getHeight());
        boolean J = this.b.J();
        if (!J || f11 < 1.0f) {
            float f12 = 1.0f - f11;
            d(f12, 1.0f, f12, canvas, false);
        }
        if (J && f11 > 0.0f) {
            d(1.0f - f11, f11, 0.0f, canvas, true);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas, RectF rectF, float f7) {
        if (this.d0) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.Q0) && this.h && this.O != null) {
                float L = org.telegram.messenger.i0.L(5.33f);
                qz0 qz0Var = this.O;
                qz0Var.p = (int) (rectF.width() - (2.0f * L));
                qz0Var.t = org.telegram.messenger.i0.L(14.0f);
                qz0Var.a.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, org.telegram.messenger.i0.L(0.66f), org.telegram.ui.ActionBar.t6.r1(0.4f * f7, -16777216));
                qz0Var.c(rectF.left + L, rectF.top + org.telegram.messenger.i0.L(this.r <= 2 ? 15.0f : 11.33f), 1.0f, org.telegram.ui.ActionBar.t6.r1(f7, -1), canvas);
            }
        }
    }

    public final void c(Canvas canvas, RectF rectF, float f7) {
        String str;
        float f10 = f7;
        if (this.D) {
            ImageReceiver imageReceiver = this.c;
            if (imageReceiver == null || imageReceiver.Q0) {
                float L = (org.telegram.messenger.i0.L(20.0f) * this.B0) + rectF.width();
                float width = rectF.width() / L;
                if (f10 < 1.0f) {
                    f10 = (float) Math.pow(f10, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i10 = this.r;
                m.p3 p3Var = this.Q;
                if (i10 != 9 && this.F == null && (str = this.G) != null) {
                    this.F = new StaticLayout(this.G, (TextPaint) p3Var.a, (int) Math.ceil(((TextPaint) p3Var.a).measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i10 >= 9 || this.G == null) && this.F != null) {
                    this.F = null;
                }
                boolean q6 = q(L);
                int L2 = org.telegram.messenger.i0.L(8.0f);
                StaticLayout staticLayout = this.F;
                int width2 = L2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.H ? org.telegram.messenger.i0.L(10.0f) : 0);
                canvas.translate(org.telegram.messenger.i0.L(5.0f), (((rectF.height() + org.telegram.messenger.i0.L(1.0f)) - org.telegram.messenger.i0.L(17.0f)) - org.telegram.messenger.i0.L(4.0f)) - (q6 ? org.telegram.messenger.i0.L(22.0f) : 0));
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(0.0f, 0.0f, width2, org.telegram.messenger.i0.L(17.0f));
                int alpha = org.telegram.ui.ActionBar.t6.i2.getAlpha();
                org.telegram.ui.ActionBar.t6.i2.setAlpha((int) (alpha * f10));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.ui.ActionBar.t6.i2);
                org.telegram.ui.ActionBar.t6.i2.setAlpha(alpha);
                if (this.H) {
                    canvas.save();
                    float L3 = this.F == null ? org.telegram.messenger.i0.L(5.0f) : org.telegram.messenger.i0.L(4.0f);
                    int L4 = org.telegram.messenger.i0.L(17.0f);
                    Drawable drawable = (Drawable) p3Var.c;
                    Drawable drawable2 = (Drawable) p3Var.c;
                    canvas.translate(L3, (L4 - drawable.getIntrinsicHeight()) / 2.0f);
                    drawable2.setAlpha((int) (this.x * 255.0f * f10));
                    drawable2.draw(canvas);
                    canvas.restore();
                }
                if (this.F != null) {
                    canvas.translate(org.telegram.messenger.i0.L((this.H ? 10 : 0) + 4), (org.telegram.messenger.i0.L(17.0f) - this.F.getHeight()) / 2.0f);
                    TextPaint textPaint = (TextPaint) p3Var.a;
                    TextPaint textPaint2 = (TextPaint) p3Var.a;
                    int alpha2 = textPaint.getAlpha();
                    textPaint2.setAlpha((int) (alpha2 * f10));
                    this.F.draw(canvas);
                    textPaint2.setAlpha(alpha2);
                }
                canvas.restore();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0613, code lost:
    
        if (r0.getProgress() != 0.0f) goto L195;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(float f7, float f10, float f11, Canvas canvas, boolean z10) {
        float f12;
        float f13;
        boolean z11;
        RectF rectF;
        Canvas canvas2;
        float f14;
        float f15;
        float f16;
        ImageReceiver imageReceiver;
        float f17;
        RectF rectF2;
        s7 s7Var;
        float L;
        float f18;
        Drawable drawable;
        float f19;
        Canvas canvas3;
        float f20;
        int i10;
        int i11;
        zz zzVar;
        float padding = getPadding() * f7;
        float f21 = this.V ? padding : 0.0f;
        float d = this.D0.d(this.C0);
        float measuredWidth = ((getMeasuredWidth() - f21) - padding) * this.y;
        float measuredHeight = ((getMeasuredHeight() - 0.0f) - padding) * this.y;
        ImageReceiver imageReceiver2 = z10 ? this.b : this.c;
        imageReceiver2.setAlpha(f10);
        RectF rectF3 = imageReceiver2.P0;
        if (this.S > 0.5f && this.T != 9.0f && this.r != 9) {
            float f22 = f7 * 2.0f;
            measuredWidth -= f22;
            measuredHeight -= f22;
        }
        if ((this.n != null || this.r0 == 1) && imageReceiver2.I() && imageReceiver2.h1 == 1.0f && this.x == 1.0f) {
            f12 = 1.0f;
            f13 = 0.0f;
            z11 = true;
        } else {
            if (getParent() == null || (zzVar = this.s) == null) {
                f12 = 1.0f;
                f13 = 0.0f;
                z11 = true;
            } else {
                int measuredWidth2 = ((View) getParent()).getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                float f23 = -getX();
                zzVar.O = measuredWidth2;
                zzVar.P = measuredHeight2;
                zzVar.Q = f23;
                this.s.updateColors();
                this.s.f();
                float f24 = (this.S <= 0.5f || this.T == 9.0f || this.r == 9) ? 0.0f : 1.0f;
                float f25 = f21 + f24;
                float f26 = f24 + padding;
                f12 = 1.0f;
                f13 = 0.0f;
                z11 = true;
                canvas.drawRect(f25, f26, f25 + measuredWidth, f26 + measuredHeight, this.s.getPaint());
            }
            invalidate();
        }
        float f27 = this.x;
        if (f27 != f12) {
            rectF = rectF3;
            canvas.saveLayerAlpha(0.0f, 0.0f, f21 + padding + measuredWidth, padding + f13 + measuredHeight, (int) (f27 * 255.0f), 31);
        } else {
            rectF = rectF3;
            canvas.save();
        }
        CheckBoxBase checkBoxBase = this.P;
        m.p3 p3Var = this.Q;
        if (((checkBoxBase == null || !checkBoxBase.q) && !PhotoViewer.Q1(this.n)) || this.w0) {
            canvas2 = canvas;
            f14 = f21;
        } else {
            canvas2 = canvas;
            f14 = f21;
            canvas2.drawRect(f14, 0.0f, (f21 + measuredWidth) - padding, (measuredHeight + f13) - padding, (Paint) p3Var.b);
        }
        boolean z12 = this.d0;
        ImageReceiver imageReceiver3 = this.d;
        if (z12 && this.r == z11) {
            float height = getHeight() * 0.72f;
            GradientDrawable gradientDrawable = this.b0;
            if (gradientDrawable != null) {
                gradientDrawable.setBounds(0, 0, getWidth(), getHeight());
                this.b0.draw(canvas2);
            } else if (!this.c0 && imageReceiver2.n() != null) {
                this.c0 = z11;
                Bitmap n10 = imageReceiver2.n();
                boolean q6 = org.telegram.ui.ActionBar.t6.I.q();
                if (n10 == null) {
                    int[] iArr = {0, 0};
                    if (this.c0) {
                        this.b0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
                        invalidate();
                        this.c0 = false;
                    }
                } else {
                    int[] b10 = w7.l8.b(n10, q6);
                    if (this.c0) {
                        this.b0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, b10);
                        invalidate();
                        this.c0 = false;
                    }
                }
            }
            imageReceiver2.y0((measuredWidth - height) / 2.0f, f13, height, getHeight());
        } else if (this.B0 > f13) {
            float L2 = org.telegram.messenger.i0.L(this.w0 ? 7.0f : 10.0f) * this.B0;
            float f28 = f14 + L2;
            float f29 = padding + L2;
            float f30 = L2 * 2.0f;
            float f31 = measuredWidth - f30;
            float f32 = measuredHeight - f30;
            imageReceiver2.y0(f28, f29, f31, f32);
            imageReceiver3.y0(f28, f29, f31, f32);
        } else {
            float f33 = (this.S <= 0.5f || this.T == 9.0f || this.r == 9) ? 0.0f : f12;
            float f34 = f14 + f33;
            float f35 = f33 + padding;
            imageReceiver2.y0(f34, f35, measuredWidth, measuredHeight);
            imageReceiver3.y0(f34, f35, measuredWidth, measuredHeight);
        }
        imageReceiver2.K0(org.telegram.messenger.i0.W1(this.B0, (this.V && this.a0) ? org.telegram.messenger.i0.L(18.0f) : org.telegram.messenger.i0.L(f12), org.telegram.messenger.i0.L(8.0f)), org.telegram.messenger.i0.W1(this.B0, (this.W && this.a0) ? org.telegram.messenger.i0.L(18.0f) : org.telegram.messenger.i0.L(f12), org.telegram.messenger.i0.L(8.0f)), org.telegram.messenger.i0.W1(this.B0, org.telegram.messenger.i0.L(f12), org.telegram.messenger.i0.L(8.0f)), org.telegram.messenger.i0.W1(this.B0, org.telegram.messenger.i0.L(f12), org.telegram.messenger.i0.L(8.0f)));
        if (this.w0) {
            canvas2.save();
            if (this.x0 || this.C0) {
                canvas2.translate(imageReceiver2.r(), imageReceiver2.s());
                if (this.e == null) {
                    this.e = new fo0(this);
                }
                this.e.a(canvas2, Math.max(this.B0, d));
                float f36 = f12 - (d * 0.075f);
                canvas2.scale(f36, f36);
                canvas2.translate(-imageReceiver2.r(), -imageReceiver2.s());
            }
        }
        if (PhotoViewer.Q1(this.n)) {
            f15 = d;
            f16 = measuredWidth;
            imageReceiver = imageReceiver2;
            f17 = 0.075f;
            rectF2 = rectF;
            s7Var = this;
        } else {
            imageReceiver2.h(canvas2, null);
            jj jjVar = this.n;
            if (jjVar == null || !jjVar.t2() || this.n.N0) {
                f15 = d;
                f16 = measuredWidth;
                imageReceiver = imageReceiver2;
                f17 = 0.075f;
                s7Var = this;
            } else {
                canvas2.save();
                canvas2.clipRect(f14, 0.0f, (f14 + measuredWidth) - padding, (measuredHeight + 0.0f) - padding);
                if (this.i0 != 0.0f) {
                    Path path = this.g0;
                    path.rewind();
                    path.addCircle(this.j0, this.k0, this.l0 * this.i0, Path.Direction.CW);
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                }
                imageReceiver3.h(canvas2, null);
                if (this.m0 != null) {
                    canvas2.clipRect(imageReceiver2.K0, imageReceiver2.L0, imageReceiver2.y(), imageReceiver2.A());
                    f19 = measuredWidth;
                    imageReceiver = imageReceiver2;
                    Canvas canvas4 = canvas2;
                    f20 = d;
                    this.m0.c(canvas4, this, (int) imageReceiver2.M0, (int) imageReceiver2.N0, 1.0f, false);
                    canvas3 = canvas4;
                    s7Var = this;
                } else {
                    f19 = measuredWidth;
                    imageReceiver = imageReceiver2;
                    canvas3 = canvas2;
                    s7Var = this;
                    f20 = d;
                    if (s7Var.h0 == null) {
                        s7Var.h0 = new nh.i();
                    }
                    s7Var.h0.h(i0.b.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                    s7Var.h0.setBounds((int) imageReceiver.K0, (int) imageReceiver.L0, (int) imageReceiver.y(), (int) imageReceiver.A());
                    s7Var.h0.draw(canvas3);
                }
                canvas3.restore();
                if (s7Var.n.p4()) {
                    if (s7Var.o0 == null) {
                        f17 = 0.075f;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a1.g.m(null, 2131748500, new StringBuilder("x ")));
                        spannableStringBuilder.setSpan(new dq(R.drawable.filled_sensitive, 0), 0, 1, 33);
                        s7Var.o0 = new qz0(spannableStringBuilder, 14.0f, org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
                    } else {
                        f17 = 0.075f;
                    }
                    qz0 qz0Var = s7Var.o0;
                    if (f19 < (org.telegram.messenger.i0.L(13) * 2) + qz0Var.c) {
                        if (s7Var.p0 == null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a1.g.m(null, 2131748499, new StringBuilder("x ")));
                            spannableStringBuilder2.setSpan(new dq(R.drawable.filled_sensitive, 0), 0, 1, 33);
                            s7Var.p0 = new qz0(spannableStringBuilder2, 14.0f, org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
                        }
                        qz0Var = s7Var.p0;
                    }
                    if (f19 < (org.telegram.messenger.i0.L(26) * 2) + qz0Var.c) {
                        if (s7Var.q0 == null) {
                            s7Var.q0 = new qz0(new SpannableStringBuilder(cd.L0(2131748499, null)), 13.0f, org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
                        }
                        qz0Var = s7Var.q0;
                        i11 = 10;
                        i10 = 28;
                    } else {
                        i10 = 32;
                        i11 = 13;
                    }
                    float f37 = (imageReceiver.M0 / 2.0f) + imageReceiver.K0;
                    float f38 = (imageReceiver.N0 / 2.0f) + imageReceiver.L0;
                    float L3 = qz0Var.c + org.telegram.messenger.i0.L(i11 + i11);
                    float L4 = org.telegram.messenger.i0.L(i10) / 2.0f;
                    qz0 qz0Var2 = qz0Var;
                    float T1 = org.telegram.messenger.i0.T1(0.8f, f12, f12 - s7Var.i0);
                    RectF rectF4 = org.telegram.messenger.i0.P;
                    float f39 = L3 / 2.0f;
                    float f40 = f39 * T1;
                    float f41 = L4 * T1;
                    f16 = f19;
                    f15 = f20;
                    rectF4.set(f37 - f40, f38 - f41, f40 + f37, f38 + f41);
                    Path path2 = s7Var.n0;
                    path2.reset();
                    path2.addRoundRect(rectF4, L4, L4, Path.Direction.CW);
                    canvas3.save();
                    canvas3.clipPath(path2);
                    float alpha = imageReceiver3.getAlpha();
                    imageReceiver3.setAlpha((1.0f - s7Var.i0) * alpha);
                    imageReceiver3.h(canvas3, null);
                    imageReceiver3.setAlpha(alpha);
                    canvas3.restore();
                    Paint V0 = org.telegram.ui.ActionBar.t6.V0("paintChatTimeBackground");
                    int alpha2 = V0.getAlpha();
                    V0.setAlpha((int) org.telegram.messenger.m5.A(1.0f, s7Var.i0, alpha2, 0.35f));
                    canvas3.drawRoundRect(rectF4, L4, L4, V0);
                    V0.setAlpha(alpha2);
                    canvas3.save();
                    canvas3.scale(T1, T1, f37, f38);
                    Canvas canvas5 = canvas3;
                    qz0Var2.c(org.telegram.messenger.i0.L(i11) + (f37 - f39), f38, 1.0f - s7Var.i0, -1, canvas5);
                    canvas2 = canvas5;
                    canvas2.restore();
                } else {
                    f15 = f20;
                    f16 = f19;
                    f17 = 0.075f;
                    canvas2 = canvas3;
                }
                s7Var.invalidate();
            }
            if (!s7Var.h) {
                float f42 = s7Var.U;
                if (f42 > 0.0f) {
                    ((Paint) p3Var.e).setColor(i0.b.o(-16777216, (int) (f42 * 0.5f * 255.0f)));
                    rectF2 = rectF;
                    canvas2.drawRect(rectF2, (Paint) p3Var.e);
                }
            }
            rectF2 = rectF;
        }
        if (s7Var.e0) {
            Paint paint = s7Var.s0;
            paint.setColor(805306368);
            canvas2.drawRect(rectF2, paint);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint2 = s7Var.t0;
            paint2.setStyle(style);
            paint2.setColor(-1);
            paint2.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
            paint2.setStrokeJoin(Paint.Join.ROUND);
            paint2.setStrokeCap(Paint.Cap.ROUND);
            float L5 = org.telegram.messenger.i0.L(18.0f);
            RectF rectF5 = org.telegram.messenger.i0.P;
            rectF5.set(imageReceiver.r() - L5, imageReceiver.s() - L5, imageReceiver.r() + L5, imageReceiver.s() + L5);
            float currentTimeMillis = ((System.currentTimeMillis() % 1500) / 1500.0f) * 360.0f;
            jj jjVar2 = s7Var.n;
            canvas2.drawArc(rectF5, currentTimeMillis, s7Var.u0.e(false, org.telegram.messenger.i0.T1(0.15f, 0.95f, jjVar2 != null ? jjVar2.H1() : 0.0f)) * 360.0f, false, paint2);
            s7Var.invalidate();
        }
        float f43 = imageReceiver.K0;
        float f44 = imageReceiver.L0;
        float y3 = imageReceiver.y();
        float A = imageReceiver.A();
        RectF rectF6 = s7Var.y0;
        rectF6.set(f43, f44, y3, A);
        if (s7Var.E && (drawable = org.telegram.ui.ActionBar.t6.l3) != null) {
            drawable.setBounds((int) (rectF6.left + org.telegram.messenger.i0.L(8.0f)), (int) (rectF6.top + org.telegram.messenger.i0.L(8.0f)), (int) ((org.telegram.ui.ActionBar.t6.l3.getIntrinsicWidth() * 0.75f) + rectF6.left + org.telegram.messenger.i0.L(8.0f)), (int) ((org.telegram.ui.ActionBar.t6.l3.getIntrinsicHeight() * 0.75f) + rectF6.top + org.telegram.messenger.i0.L(8.0f)));
            org.telegram.ui.ActionBar.t6.l3.draw(canvas2);
        }
        s7Var.c(canvas2, rectF6, f11);
        s7Var.f(canvas2, rectF6, f11);
        if (s7Var.h) {
            s7Var.b(canvas2, rectF6, f11);
        } else {
            s7Var.e(canvas2, rectF6, f11);
        }
        if (s7Var.w0) {
            canvas2.restore();
        }
        CheckBoxBase checkBoxBase2 = s7Var.P;
        if (checkBoxBase2 != null) {
            float f45 = s7Var.r0 != 1 ? 0.0f : 0.0f;
            canvas2.save();
            if (s7Var.w0 && (s7Var.x0 || s7Var.C0)) {
                canvas2.translate(imageReceiver.r(), imageReceiver.s());
                if (s7Var.e == null) {
                    s7Var.e = new fo0(s7Var);
                }
                float f46 = f15;
                s7Var.e.a(canvas2, Math.max(s7Var.B0, f46) * 0.5f);
                float f47 = 1.0f - (f46 * f17);
                canvas2.scale(f47, f47);
                canvas2.translate(-imageReceiver.r(), -imageReceiver.s());
            }
            if (s7Var.r0 == 1) {
                L = ((f16 + org.telegram.messenger.i0.L(2.0f)) - org.telegram.messenger.i0.L(25.0f)) - org.telegram.messenger.i0.L(4.0f);
                f18 = org.telegram.messenger.i0.L(4.0f);
            } else if (s7Var.w0) {
                L = (f16 + org.telegram.messenger.i0.L(2.0f)) - org.telegram.messenger.i0.L((s7Var.B0 * 5.0f) + 22.0f);
                f18 = (org.telegram.messenger.i0.L(5.0f) * s7Var.B0) + org.telegram.messenger.i0.L(-2.0f);
            } else {
                L = (f16 + org.telegram.messenger.i0.L(2.0f)) - org.telegram.messenger.i0.L(25.0f);
                f18 = f45;
            }
            canvas2.translate(L, f18);
            s7Var.P.a(canvas2);
            if (s7Var.v0 != null) {
                RectF rectF7 = org.telegram.messenger.i0.P;
                rectF7.set(L, f18, s7Var.P.b.width() + L, s7Var.P.b.height() + f18);
                jc jcVar = s7Var.v0;
                jcVar.i = false;
                jcVar.c = 0;
                jcVar.a(rectF7);
            }
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void e(Canvas canvas, RectF rectF, float f7) {
        Bitmap bitmap;
        if (!this.d0 || (bitmap = this.J) == null || bitmap.isRecycled()) {
            return;
        }
        int L = org.telegram.messenger.i0.L((rectF.width() / ((org.telegram.messenger.i0.L(20.0f) * this.B0) + rectF.width())) * 17.33f);
        canvas.save();
        float f10 = L;
        canvas.translate((rectF.right - f10) - org.telegram.messenger.i0.L(5.66f), rectF.top + org.telegram.messenger.i0.L(5.66f));
        if (this.K == null) {
            this.K = new Paint(3);
        }
        this.K.setAlpha((int) (f7 * 255.0f));
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(0.0f, 0.0f, f10, f10);
        canvas.drawBitmap(this.J, (Rect) null, rectF2, this.K);
        canvas.restore();
    }

    public final void f(Canvas canvas, RectF rectF, float f7) {
        if (this.d0) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.Q0) && this.r < 5) {
                float L = (org.telegram.messenger.i0.L(20.0f) * this.B0) + rectF.width();
                float width = rectF.width() / L;
                boolean q6 = q(L);
                float d = this.M.d(this.L);
                float f10 = f7 * d;
                if (f10 < 1.0f) {
                    f10 = (float) Math.pow(f10, 8.0d);
                }
                if (d <= 0.0f) {
                    return;
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, q6 ? 0.0f : rectF.width(), rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                float L2 = org.telegram.messenger.i0.L(26.0f);
                org.telegram.ui.Components.e6 e6Var = this.N;
                float c10 = e6Var.c() + L2;
                canvas.translate(q6 ? org.telegram.messenger.i0.L(5.0f) : (rectF.width() - org.telegram.messenger.i0.L(5.0f)) - c10, ((rectF.height() + org.telegram.messenger.i0.L(1.0f)) - org.telegram.messenger.i0.L(17.0f)) - org.telegram.messenger.i0.L(4.0f));
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(0.0f, 0.0f, c10, org.telegram.messenger.i0.L(17.0f));
                int alpha = org.telegram.ui.ActionBar.t6.i2.getAlpha();
                org.telegram.ui.ActionBar.t6.i2.setAlpha((int) (alpha * f10));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.ui.ActionBar.t6.i2);
                org.telegram.ui.ActionBar.t6.i2.setAlpha(alpha);
                canvas.save();
                float L3 = org.telegram.messenger.i0.L(3.0f);
                int L4 = org.telegram.messenger.i0.L(17.0f);
                m.p3 p3Var = this.Q;
                canvas.translate(L3, (L4 - ((Drawable) p3Var.d).getBounds().height()) / 2.0f);
                ((Drawable) p3Var.d).setAlpha((int) (this.x * 255.0f * f10));
                ((Drawable) p3Var.d).draw(canvas);
                canvas.restore();
                canvas.translate(org.telegram.messenger.i0.L(22.0f), 0.0f);
                e6Var.setBounds(0, 0, (int) c10, org.telegram.messenger.i0.L(17.0f));
                e6Var.B = (int) (f10 * 255.0f);
                e6Var.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final int g(jj jjVar) {
        TL_stories.StoryItem storyItem;
        if (this.f0) {
            return 100;
        }
        if (!this.d0 || jjVar == null || (storyItem = jjVar.l) == null) {
            return -1;
        }
        if (storyItem.parsedPrivacy == null) {
            storyItem.parsedPrivacy = new vh.u6(this.f, storyItem.privacy);
        }
        int i10 = storyItem.parsedPrivacy.a;
        if (i10 == 2 || i10 == 1 || i10 == 3) {
            return i10;
        }
        return -1;
    }

    public View getCrossfadeView() {
        return this.w;
    }

    public int getMessageId() {
        jj jjVar = this.n;
        if (jjVar != null) {
            return jjVar.f1();
        }
        return 0;
    }

    public jj getMessageObject() {
        return this.n;
    }

    public int getStyle() {
        return this.r0;
    }

    public final void i(boolean z10, boolean z11) {
        int i10;
        CheckBoxBase checkBoxBase = this.P;
        if ((checkBoxBase != null && checkBoxBase.q) == z10) {
            return;
        }
        if (checkBoxBase == null) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, null);
            this.P = checkBoxBase2;
            checkBoxBase2.h(-1, org.telegram.ui.ActionBar.t6.zi, org.telegram.ui.ActionBar.t6.k7);
            if (this.w0 && (i10 = this.a) != 0) {
                CheckBoxBase checkBoxBase3 = this.P;
                int w9 = org.telegram.ui.ActionBar.t6.w(i10, org.telegram.ui.ActionBar.t6.r1(0.25f, -1));
                if (checkBoxBase3.x != w9) {
                    checkBoxBase3.x = w9;
                    checkBoxBase3.b();
                }
            }
            this.P.k(false);
            this.P.d(1);
            this.P.e(0, 0, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
            if (this.R) {
                this.P.l = true;
            }
        }
        this.P.f(-1, z10, z11);
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            this.A0 = null;
            valueAnimator.cancel();
        }
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.B0, z10 ? 1.0f : 0.0f);
            this.A0 = ofFloat;
            ofFloat.addUpdateListener(new bg.o(this, 5));
            this.A0.setDuration(200L);
            this.A0.addListener(new eg.m(10, this, z10));
            this.A0.start();
        } else {
            this.B0 = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void j(boolean z10, float f7) {
        if (this.y != f7) {
            this.y = f7;
            if (z10) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0468  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(jj jjVar, int i10, boolean z10) {
        String str;
        boolean z11;
        float f7;
        TLRPC.WebPage webPage;
        String str2;
        TL_stories.StoryViews storyViews;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem;
        int i11 = i10;
        if (i11 < 1) {
            i11 = 1;
        }
        int i12 = this.r;
        this.r = i11;
        jj jjVar2 = this.n;
        if (jjVar2 == null && jjVar == null) {
            return;
        }
        if (jjVar2 != null && jjVar != null && jjVar2.f1() == jjVar.f1()) {
            jj jjVar3 = this.n;
            if ((jjVar3 != null ? jjVar3.m : null) == jjVar.m) {
                if ((jjVar3 != null ? jjVar3.j : null) == jjVar.j) {
                    TLRPC.MessageMedia messageMedia = (jjVar3 == null || (storyItem = jjVar3.l) == null) ? null : storyItem.media;
                    TL_stories.StoryItem storyItem2 = jjVar.l;
                    TLRPC.MessageMedia messageMedia2 = storyItem2 == null ? null : storyItem2.media;
                    if (((messageMedia == null && messageMedia2 == null) || (messageMedia != null && messageMedia2 != null && ((document = messageMedia.document) == null ? !((photo = messageMedia.photo) == null || (photo2 = messageMedia2.photo) == null || photo2.id != photo.id) : !((document2 = messageMedia2.document) == null || document2.id != document.id)))) && i12 == i11) {
                        int i13 = this.I;
                        if ((i13 == 100) == this.f0 && i13 == g(jjVar) && !z10) {
                            return;
                        }
                    }
                }
            }
        }
        this.n = jjVar;
        this.d0 = jjVar != null && jjVar.x4();
        jj jjVar4 = this.n;
        this.e0 = (jjVar4 == null || jjVar4.m == null) ? false : true;
        p();
        org.telegram.ui.Components.e6 e6Var = this.N;
        org.telegram.ui.Components.t5 t5Var = this.M;
        ImageReceiver imageReceiver = this.b;
        ImageReceiver imageReceiver2 = this.c;
        ImageReceiver imageReceiver3 = this.d;
        if (jjVar == null) {
            imageReceiver2.R();
            imageReceiver.R();
            imageReceiver3.R();
            this.G = null;
            this.L = false;
            t5Var.e(true, 0.0f);
            e6Var.t("", false, true);
            this.F = null;
            this.D = false;
            this.E = false;
            this.c0 = false;
            this.b0 = null;
            this.I = -1;
            this.J = null;
            this.O = null;
            o();
            return;
        }
        TL_stories.StoryItem storyItem3 = jjVar.l;
        if (this.R) {
            imageReceiver2.P();
            imageReceiver.P();
            imageReceiver3.P();
        }
        ImageReceiver imageReceiver4 = z10 ? imageReceiver : imageReceiver2;
        int i14 = this.f;
        String E1 = vp.r1(i14).E1(jjVar.k.restriction_reason);
        int i15 = org.telegram.messenger.i0.q.x;
        float f10 = org.telegram.messenger.i0.p;
        int i16 = (int) ((i15 / i11) / f10);
        if (z10) {
            i16 = (((int) (i15 / f10)) * 3) / 5;
        }
        SparseArray sparseArray = (SparseArray) this.Q.f;
        String str3 = (String) sparseArray.get(i16);
        if (str3 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i16);
            str = E1;
            sb2.append("_");
            sb2.append(i16);
            sb2.append("_isc");
            String sb3 = sb2.toString();
            sparseArray.put(i16, sb3);
            str3 = sb3;
        } else {
            str = E1;
        }
        int Z0 = (i11 <= 2 || z10) ? org.telegram.messenger.i0.Z0(false) : zs.r5;
        this.G = null;
        this.F = null;
        this.D = false;
        this.E = false;
        imageReceiver2.e();
        imageReceiver.e();
        if (!this.d0 || (storyViews = storyItem3.views) == null) {
            z11 = true;
            this.L = false;
            f7 = 0.0f;
            t5Var.e(true, 0.0f);
            e6Var.t("", false, true);
        } else {
            int i17 = storyViews.views_count;
            this.L = i17 > 0;
            z11 = true;
            e6Var.t(org.telegram.messenger.i0.o0(i17, 0), false, true);
            f7 = 0.0f;
        }
        t5Var.e(z11, this.L ? 1.0f : f7);
        jj jjVar5 = jjVar.j != null ? storyItem3 : jjVar;
        if (TextUtils.isEmpty(str)) {
            if (storyItem3 == 0 || !(storyItem3.media instanceof TLRPC.TL_messageMediaUnsupported)) {
                th.d5 d5Var = jjVar.m;
                if (d5Var == null || (str2 = d5Var.f) == null) {
                    String str4 = str3;
                    TLRPC.Document F02 = jjVar.F0();
                    TLRPC.Photo D1 = jj.D1(jjVar.k);
                    if (jj.K4(F02)) {
                        this.D = !jjVar.D3();
                        this.E = jjVar.D3();
                        if (i11 != 9 && !jjVar.D3()) {
                            this.G = org.telegram.messenger.i0.g0((int) jjVar.L0(), false, false);
                        }
                        TLRPC.MessageMedia n12 = jj.n1(jjVar);
                        if ((n12 instanceof TLRPC.TL_messageMediaDocument ? ((TLRPC.TL_messageMediaDocument) n12).video_cover : (n12 == null || (webPage = n12.webpage) == null || !webPage.video_cover_photo) ? null : webPage.photo) != null) {
                            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(jjVar.n0, 50, false, null, false);
                            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(jjVar.n0, Z0, false, w9, this.d0);
                            if (w10 == w9) {
                                w9 = null;
                            }
                            if (jjVar.G1 != null) {
                                imageReceiver4.r0(ic.f(w10, jjVar.l0), str4, null, null, jjVar.G1, w10 != null ? w10.size : 0L, null, jjVar5, jj.Q5(jjVar.k) ? 2 : 1);
                            } else {
                                imageReceiver4.r0(ic.f(w10, jjVar.l0), str4, ic.f(w9, jjVar.l0), sc.e.A(str4, "_b"), null, w10 != null ? w10.size : 0L, null, jjVar5, jj.Q5(jjVar.k) ? 2 : 1);
                            }
                        } else {
                            TLRPC.Document F03 = jjVar.F0();
                            TLRPC.PhotoSize w11 = org.telegram.messenger.b8.w(F03.thumbs, 50, false, null, false);
                            TLRPC.PhotoSize w12 = org.telegram.messenger.b8.w(F03.thumbs, Z0, false, null, this.d0);
                            if (w11 == w12 && !this.d0) {
                                w12 = null;
                            }
                            if (w11 != null) {
                                if (jjVar.G1 != null) {
                                    imageReceiver4.q0(ic.c(w12, F03), str4, jjVar.G1, null, jjVar5, 0);
                                } else {
                                    imageReceiver4.r0(ic.c(w12, F03), str4, ic.c(w11, F03), sc.e.A(str4, "_b"), null, 0L, null, jjVar5, 0);
                                }
                            }
                        }
                    } else if (D1 != null && !jjVar.n0.isEmpty()) {
                        if (!jjVar.x0) {
                            if (System.currentTimeMillis() - E0 > 5000) {
                                E0 = System.currentTimeMillis();
                                F0 = org.telegram.messenger.b6.q(i14).d(jjVar);
                            }
                            if (!F0 && !this.d0) {
                                BitmapDrawable bitmapDrawable = jjVar.G1;
                                if (bitmapDrawable != null) {
                                    imageReceiver4.r0(null, null, null, null, bitmapDrawable, 0L, null, jjVar5, 0);
                                } else {
                                    imageReceiver4.r0(null, null, ic.f(org.telegram.messenger.b8.w(jjVar.n0, 50, false, null, false), jjVar.l0), "b", null, 0L, null, jjVar5, 0);
                                }
                            }
                        }
                        TLRPC.PhotoSize w13 = org.telegram.messenger.b8.w(jjVar.n0, 50, false, null, false);
                        TLRPC.PhotoSize w14 = org.telegram.messenger.b8.w(jjVar.n0, Z0, false, w13, this.d0);
                        if (w14 == w13) {
                            w13 = null;
                        }
                        if (jjVar.G1 != null) {
                            imageReceiver4.r0(ic.f(w14, jjVar.l0), str4, null, null, jjVar.G1, w14 != null ? w14.size : 0L, null, jjVar5, jj.Q5(jjVar.k) ? 2 : 1);
                        } else {
                            imageReceiver4.r0(ic.f(w14, jjVar.l0), str4, z10 ? null : ic.f(w13, jjVar.l0), sc.e.A(str4, "_b"), null, w14 != null ? w14.size : 0L, null, jjVar5, jj.Q5(jjVar.k) ? 2 : 1);
                        }
                    }
                } else {
                    imageReceiver4.q0(ic.g(str2), str3, null, null, jjVar5, 0);
                }
            } else {
                storyItem3.dialogId = jj.B0(jjVar.k);
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_emoji_recent).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(1090519039, PorterDuff.Mode.SRC_IN));
                imageReceiver4.w0(new eq(new ColorDrawable(-13421773), mutate));
            }
            if (imageReceiver3.n() != null) {
                imageReceiver3.n().recycle();
                imageReceiver3.w0(null);
            }
            if (imageReceiver4.n() != null && this.n.t2() && !this.n.M0) {
                imageReceiver3.v0(Utilities.D(imageReceiver4.n(), false));
            }
            if (storyItem3 != 0) {
                imageReceiver4.a(new th.t7(storyItem3));
            }
            setPrivacyType(g(jjVar));
            if (this.h) {
                long B0 = jj.B0(jjVar.k);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                spannableStringBuilder.append((CharSequence) vp.r1(i14).A1(B0, false));
                org.telegram.ui.e5 e5Var = new org.telegram.ui.e5(i11 == 2 ? 16.0f : 13.66f, i14, this);
                e5Var.c(B0);
                spannableStringBuilder.setSpan(e5Var, 0, 1, 33);
                this.O = new qz0(spannableStringBuilder, i11 == 2 ? 14.0f : 10.1666f, org.telegram.messenger.i0.o());
            }
            o();
            invalidate();
        }
        imageReceiver4.w0(getContext().getDrawable(R.drawable.photo_placeholder_in));
        if (imageReceiver3.n() != null) {
        }
        if (imageReceiver4.n() != null) {
            imageReceiver3.v0(Utilities.D(imageReceiver4.n(), false));
        }
        if (storyItem3 != 0) {
        }
        setPrivacyType(g(jjVar));
        if (this.h) {
        }
        o();
        invalidate();
    }

    public final void l(boolean z10, boolean z11) {
        if (this.C0 == z10) {
            return;
        }
        this.C0 = z10;
        if (!z11) {
            this.D0.a(z10);
        }
        invalidate();
    }

    public final void m(String str, boolean z10) {
        this.G = str;
        this.D = true;
        this.E = false;
        StaticLayout staticLayout = this.F;
        if (staticLayout != null && !staticLayout.getText().toString().equals(str)) {
            this.F = null;
        }
        this.H = z10;
    }

    public final void n(float f7, float f10) {
        this.j0 = f7;
        this.k0 = f10;
        this.l0 = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) w7.u.a(this.l0 * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(gr.j);
        duration.addUpdateListener(new r(this, 5));
        duration.addListener(new org.telegram.ui.s9(this, 9));
        duration.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008e A[Catch: Exception -> 0x000a, TRY_ENTER, TryCatch #0 {Exception -> 0x000a, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x000d, B:10:0x001a, B:12:0x001e, B:13:0x0028, B:15:0x002f, B:17:0x0086, B:20:0x008e, B:21:0x0091, B:23:0x0096, B:26:0x00a4, B:28:0x00a8, B:30:0x00ac, B:31:0x00be, B:33:0x00c2, B:34:0x00da, B:36:0x0038, B:38:0x003e, B:39:0x0049, B:40:0x004e, B:42:0x0056, B:47:0x0072, B:48:0x0060, B:50:0x0064, B:53:0x0069, B:54:0x007a), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096 A[Catch: Exception -> 0x000a, TryCatch #0 {Exception -> 0x000a, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x000d, B:10:0x001a, B:12:0x001e, B:13:0x0028, B:15:0x002f, B:17:0x0086, B:20:0x008e, B:21:0x0091, B:23:0x0096, B:26:0x00a4, B:28:0x00a8, B:30:0x00ac, B:31:0x00be, B:33:0x00c2, B:34:0x00da, B:36:0x0038, B:38:0x003e, B:39:0x0049, B:40:0x004e, B:42:0x0056, B:47:0x0072, B:48:0x0060, B:50:0x0064, B:53:0x0069, B:54:0x007a), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2 A[Catch: Exception -> 0x000a, TryCatch #0 {Exception -> 0x000a, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x000d, B:10:0x001a, B:12:0x001e, B:13:0x0028, B:15:0x002f, B:17:0x0086, B:20:0x008e, B:21:0x0091, B:23:0x0096, B:26:0x00a4, B:28:0x00a8, B:30:0x00ac, B:31:0x00be, B:33:0x00c2, B:34:0x00da, B:36:0x0038, B:38:0x003e, B:39:0x0049, B:40:0x004e, B:42:0x0056, B:47:0x0072, B:48:0x0060, B:50:0x0064, B:53:0x0069, B:54:0x007a), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0072 A[Catch: Exception -> 0x000a, TryCatch #0 {Exception -> 0x000a, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x000d, B:10:0x001a, B:12:0x001e, B:13:0x0028, B:15:0x002f, B:17:0x0086, B:20:0x008e, B:21:0x0091, B:23:0x0096, B:26:0x00a4, B:28:0x00a8, B:30:0x00ac, B:31:0x00be, B:33:0x00c2, B:34:0x00da, B:36:0x0038, B:38:0x003e, B:39:0x0049, B:40:0x004e, B:42:0x0056, B:47:0x0072, B:48:0x0060, B:50:0x0064, B:53:0x0069, B:54:0x007a), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        String L0;
        double L02;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        boolean K4;
        String L03;
        int i10;
        TL_stories.StoryViews storyViews;
        try {
            jj jjVar = this.n;
            if (jjVar == null) {
                setContentDescription(null);
                return;
            }
            TL_stories.StoryItem storyItem2 = jjVar.l;
            boolean x42 = jjVar.x4();
            StringBuilder sb2 = new StringBuilder();
            if (x42 && this.f0) {
                sb2.append(cd.L0(2131754753, null));
            }
            if (!jjVar.D3()) {
                if (jjVar.h4()) {
                    L0 = cd.L0(2131754782, null);
                    L02 = jjVar.L0();
                } else {
                    if (!jj.L4(jjVar.k)) {
                        TLRPC.MessageMedia o12 = jj.o1(jjVar.k);
                        if (o12 != null && (storyItem = o12.storyItem) != null && (messageMedia = storyItem.media) != null) {
                            K4 = jj.K4(messageMedia.document);
                            if (K4) {
                                L03 = cd.L0(2131753948, null);
                            }
                        }
                        K4 = false;
                        if (K4) {
                        }
                    }
                    L0 = cd.L0(2131753933, null);
                    L02 = jjVar.L0();
                }
                String str = L0;
                i10 = (int) L02;
                L03 = str;
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(L03);
                if (i10 > 0) {
                    sb2.append(", ");
                    sb2.append(cd.z(i10));
                }
                if (x42 && storyItem2 != null) {
                    storyViews = storyItem2.views;
                    if (storyViews != null && storyViews.views_count > 0) {
                        sb2.append(", ");
                        sb2.append(cd.G(storyItem2.views.views_count, "Views", new Object[0]));
                    }
                    if (storyItem2.date > 0) {
                        sb2.append(", ");
                        sb2.append(cd.a0(null, null, 2131754803, cd.s(storyItem2.date, false)));
                    }
                }
                setContentDescription(sb2.toString());
            }
            L03 = cd.L0(2131754848, null);
            i10 = 0;
            if (sb2.length() > 0) {
            }
            sb2.append(L03);
            if (i10 > 0) {
            }
            if (x42) {
                storyViews = storyItem2.views;
                if (storyViews != null) {
                    sb2.append(", ");
                    sb2.append(cd.G(storyItem2.views.views_count, "Views", new Object[0]));
                }
                if (storyItem2.date > 0) {
                }
            }
            setContentDescription(sb2.toString());
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            try {
                setContentDescription(null);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
        CheckBoxBase checkBoxBase = this.P;
        if (checkBoxBase != null) {
            checkBoxBase.l = true;
        }
        if (this.n != null) {
            this.c.P();
            this.b.P();
            this.d.P();
        }
        nh.h hVar = this.m0;
        if (hVar != null) {
            if (hVar.i) {
                this.m0 = nh.h.e(this);
            } else {
                hVar.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R = false;
        CheckBoxBase checkBoxBase = this.P;
        if (checkBoxBase != null) {
            checkBoxBase.l = false;
        }
        if (this.n != null) {
            this.c.R();
            this.b.R();
            this.d.R();
        }
        nh.h hVar = this.m0;
        if (hVar != null) {
            hVar.b(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(1.0f, 1.0f, 1.0f, canvas, false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        try {
            if (this.n != null) {
                accessibilityNodeInfo.setEnabled(true);
                accessibilityNodeInfo.setClickable(true);
                accessibilityNodeInfo.addAction(16);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.d0;
        int i12 = z10 ? (int) (size * 1.25f) : size;
        if (z10 && this.r == 1) {
            i12 /= 2;
        }
        setMeasuredDimension(size, i12);
        p();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jc jcVar = this.v0;
        if (jcVar == null || !jcVar.b(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void p() {
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            return;
        }
        jj jjVar = this.n;
        if (jjVar != null && jjVar.t2()) {
            if (this.m0 == null) {
                this.m0 = nh.h.e(this);
            }
        } else {
            nh.h hVar = this.m0;
            if (hVar != null) {
                hVar.b(this);
                this.m0 = null;
            }
        }
    }

    public final boolean q(float f7) {
        int i10;
        if (this.d0 && this.r < 5) {
            int L = org.telegram.messenger.i0.L(26.0f) + ((int) this.N.c());
            if (this.D) {
                int L2 = org.telegram.messenger.i0.L(8.0f);
                StaticLayout staticLayout = this.F;
                i10 = L2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.H ? org.telegram.messenger.i0.L(10.0f) : 0);
            } else {
                i10 = 0;
            }
            if (L + ((L <= 0 || i10 <= 0) ? 0 : org.telegram.messenger.i0.L(8.0f)) + i10 > f7) {
                return true;
            }
        }
        return false;
    }

    public void setGradientView(zz zzVar) {
        this.s = zzVar;
    }

    public void setHighlightProgress(float f7) {
        if (this.U != f7) {
            this.U = f7;
            invalidate();
        }
    }

    public void setReorder(boolean z10) {
        this.x0 = z10;
        invalidate();
    }

    public void setStyle(int i10) {
        if (this.r0 == i10) {
            return;
        }
        this.r0 = i10;
        if (i10 == 1) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(21, this, null);
            this.P = checkBoxBase;
            checkBoxBase.h(-1, org.telegram.ui.ActionBar.t6.zi, org.telegram.ui.ActionBar.t6.k7);
            this.P.k(true);
            this.P.d(0);
            this.P.e(0, 0, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
            if (this.R) {
                this.P.l = true;
            }
            jc jcVar = new jc(this);
            this.v0 = jcVar;
            jcVar.h = new f(this, 6);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.N == drawable || super.verifyDrawable(drawable);
    }

    public void h() {
    }
}
