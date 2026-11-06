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
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class o7 extends FrameLayout {
    public static long E0;
    public static boolean F0;
    public ValueAnimator A0;
    public float B0;
    public boolean C0;
    public boolean D;
    public final org.telegram.ui.Components.w5 D0;
    public boolean E;
    public StaticLayout F;
    public String G;
    public boolean H;
    public int I;
    public Bitmap J;
    public Paint K;
    public boolean L;
    public final org.telegram.ui.Components.w5 M;
    public final org.telegram.ui.Components.i6 N;
    public my0 O;
    public CheckBoxBase P;
    public final m.q3 Q;
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
    public en0 e;
    public boolean e0;
    public final int f;
    public boolean f0;
    public final Path g0;
    public boolean h;
    public xh.f h0;
    public float i0;
    public float j0;
    public float k0;
    public float l0;
    public xh.e m0;
    public ij n;
    public final Path n0;
    public my0 o0;
    public my0 p0;
    public my0 q0;
    public int r;
    public int r0;
    public lz s;
    public final Paint s0;
    public final Paint t0;
    public final org.telegram.ui.Components.w5 u0;
    public pc v0;
    public o7 w;
    public boolean w0;
    public float x;
    public boolean x0;
    public float y;
    public final RectF y0;
    public Path z0;

    public o7(Context context, m.q3 q3Var, int i7) {
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
        xq xqVar = xq.h;
        this.M = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.N = i6Var;
        this.g0 = new Path();
        this.n0 = new Path();
        this.r0 = 0;
        this.s0 = new Paint(1);
        this.t0 = new Paint(1);
        this.u0 = new org.telegram.ui.Components.w5(this, 0L, 200L, xqVar);
        this.y0 = new RectF();
        this.D0 = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        this.Q = q3Var;
        this.f = i7;
        i(false, false);
        imageReceiver2.H0(this);
        imageReceiver.H0(this);
        imageReceiver3.H0(this);
        imageReceiver2.g1 = new ca(this, 6);
        i6Var.setCallback(this);
        i6Var.w(org.telegram.messenger.g0.L(12.0f));
        i6Var.u(-1);
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.M = org.telegram.messenger.g0.q.x;
        setWillNotDraw(false);
    }

    private float getPadding() {
        if (this.S != 0.0f) {
            float f10 = this.T;
            if (f10 == 9.0f || this.r == 9) {
                if (f10 == 9.0f) {
                    return com.google.android.recaptcha.internal.a.z(1.0f, this.S, org.telegram.messenger.g0.N(2.0f), org.telegram.messenger.g0.N(1.0f) * this.S);
                }
                return com.google.android.recaptcha.internal.a.z(1.0f, this.S, org.telegram.messenger.g0.N(1.0f), org.telegram.messenger.g0.N(2.0f) * this.S);
            }
        }
        return this.r == 9 ? org.telegram.messenger.g0.N(1.0f) : org.telegram.messenger.g0.N(2.0f);
    }

    private void setPrivacyType(int i7) {
        if (this.I == i7) {
            return;
        }
        this.I = i7;
        this.J = null;
        int i10 = i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 100 ? 0 : R.drawable.msg_pin_mini : R.drawable.msg_folders_groups : R.drawable.msg_folders_private : R.drawable.msg_stories_closefriends;
        if (i10 != 0) {
            Context context = getContext();
            HashMap hashMap = (HashMap) this.Q.g;
            Bitmap bitmap = (Bitmap) hashMap.get(Integer.valueOf(i10));
            if (bitmap == null) {
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i10);
                int width = decodeResource.getWidth();
                int height = decodeResource.getHeight();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                paint.setColorFilter(new PorterDuffColorFilter(-10461088, mode));
                canvas.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                Utilities.stackBlurBitmap(createBitmap, org.telegram.messenger.g0.L(1.0f));
                Bitmap createBitmap2 = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight(), config);
                Canvas canvas2 = new Canvas(createBitmap2);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
                canvas2.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                createBitmap.recycle();
                decodeResource.recycle();
                hashMap.put(Integer.valueOf(i10), createBitmap2);
                bitmap = createBitmap2;
            }
            this.J = bitmap;
        }
        invalidate();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12) {
        canvas.save();
        if (this.z0 == null) {
            this.z0 = new Path();
        }
        this.z0.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, f10, f11);
        float L = org.telegram.messenger.g0.L(12.0f) * f12;
        this.z0.addRoundRect(rectF, L, L, Path.Direction.CW);
        this.z0.close();
        canvas.clipPath(this.z0);
        canvas.scale(f10 / getWidth(), f11 / getHeight());
        boolean J = this.b.J();
        if (!J || f12 < 1.0f) {
            float f13 = 1.0f - f12;
            d(f13, 1.0f, f13, canvas, false);
        }
        if (J && f12 > 0.0f) {
            d(1.0f - f12, f12, 0.0f, canvas, true);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas, RectF rectF, float f10) {
        if (this.d0) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.Q0) && this.h && this.O != null) {
                float L = org.telegram.messenger.g0.L(5.33f);
                my0 my0Var = this.O;
                my0Var.p = (int) (rectF.width() - (2.0f * L));
                my0Var.t = org.telegram.messenger.g0.L(14.0f);
                my0Var.a.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.k6.r1(0.4f * f10, -16777216));
                my0Var.c(rectF.left + L, rectF.top + org.telegram.messenger.g0.L(this.r <= 2 ? 15.0f : 11.33f), 1.0f, org.telegram.ui.ActionBar.k6.r1(f10, -1), canvas);
            }
        }
    }

    public final void c(Canvas canvas, RectF rectF, float f10) {
        String str;
        float f11 = f10;
        if (this.D) {
            ImageReceiver imageReceiver = this.c;
            if (imageReceiver == null || imageReceiver.Q0) {
                float L = (org.telegram.messenger.g0.L(20.0f) * this.B0) + rectF.width();
                float width = rectF.width() / L;
                if (f11 < 1.0f) {
                    f11 = (float) Math.pow(f11, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i7 = this.r;
                m.q3 q3Var = this.Q;
                if (i7 != 9 && this.F == null && (str = this.G) != null) {
                    this.F = new StaticLayout(this.G, (TextPaint) q3Var.a, (int) Math.ceil(((TextPaint) q3Var.a).measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i7 >= 9 || this.G == null) && this.F != null) {
                    this.F = null;
                }
                boolean q10 = q(L);
                int L2 = org.telegram.messenger.g0.L(8.0f);
                StaticLayout staticLayout = this.F;
                int width2 = L2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.H ? org.telegram.messenger.g0.L(10.0f) : 0);
                canvas.translate(org.telegram.messenger.g0.L(5.0f), (((rectF.height() + org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(17.0f)) - org.telegram.messenger.g0.L(4.0f)) - (q10 ? org.telegram.messenger.g0.L(22.0f) : 0));
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(0.0f, 0.0f, width2, org.telegram.messenger.g0.L(17.0f));
                int alpha = org.telegram.ui.ActionBar.k6.i2.getAlpha();
                org.telegram.ui.ActionBar.k6.i2.setAlpha((int) (alpha * f11));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.i2);
                org.telegram.ui.ActionBar.k6.i2.setAlpha(alpha);
                if (this.H) {
                    canvas.save();
                    float L3 = this.F == null ? org.telegram.messenger.g0.L(5.0f) : org.telegram.messenger.g0.L(4.0f);
                    int L4 = org.telegram.messenger.g0.L(17.0f);
                    Drawable drawable = (Drawable) q3Var.c;
                    Drawable drawable2 = (Drawable) q3Var.c;
                    canvas.translate(L3, (L4 - drawable.getIntrinsicHeight()) / 2.0f);
                    drawable2.setAlpha((int) (this.x * 255.0f * f11));
                    drawable2.draw(canvas);
                    canvas.restore();
                }
                if (this.F != null) {
                    canvas.translate(org.telegram.messenger.g0.L((this.H ? 10 : 0) + 4), (org.telegram.messenger.g0.L(17.0f) - this.F.getHeight()) / 2.0f);
                    TextPaint textPaint = (TextPaint) q3Var.a;
                    TextPaint textPaint2 = (TextPaint) q3Var.a;
                    int alpha2 = textPaint.getAlpha();
                    textPaint2.setAlpha((int) (alpha2 * f11));
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
    public final void d(float f10, float f11, float f12, Canvas canvas, boolean z9) {
        float f13;
        float f14;
        boolean z10;
        RectF rectF;
        Canvas canvas2;
        float f15;
        float f16;
        float f17;
        ImageReceiver imageReceiver;
        float f18;
        RectF rectF2;
        o7 o7Var;
        float L;
        float f19;
        Drawable drawable;
        float f20;
        Canvas canvas3;
        float f21;
        int i7;
        int i10;
        lz lzVar;
        float padding = getPadding() * f10;
        float f22 = this.V ? padding : 0.0f;
        float d = this.D0.d(this.C0);
        float measuredWidth = ((getMeasuredWidth() - f22) - padding) * this.y;
        float measuredHeight = ((getMeasuredHeight() - 0.0f) - padding) * this.y;
        ImageReceiver imageReceiver2 = z9 ? this.b : this.c;
        imageReceiver2.setAlpha(f11);
        RectF rectF3 = imageReceiver2.P0;
        if (this.S > 0.5f && this.T != 9.0f && this.r != 9) {
            float f23 = f10 * 2.0f;
            measuredWidth -= f23;
            measuredHeight -= f23;
        }
        if ((this.n != null || this.r0 == 1) && imageReceiver2.I() && imageReceiver2.h1 == 1.0f && this.x == 1.0f) {
            f13 = 1.0f;
            f14 = 0.0f;
            z10 = true;
        } else {
            if (getParent() == null || (lzVar = this.s) == null) {
                f13 = 1.0f;
                f14 = 0.0f;
                z10 = true;
            } else {
                int measuredWidth2 = ((View) getParent()).getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                float f24 = -getX();
                lzVar.O = measuredWidth2;
                lzVar.P = measuredHeight2;
                lzVar.Q = f24;
                this.s.updateColors();
                this.s.f();
                float f25 = (this.S <= 0.5f || this.T == 9.0f || this.r == 9) ? 0.0f : 1.0f;
                float f26 = f22 + f25;
                float f27 = f25 + padding;
                f13 = 1.0f;
                f14 = 0.0f;
                z10 = true;
                canvas.drawRect(f26, f27, f26 + measuredWidth, f27 + measuredHeight, this.s.getPaint());
            }
            invalidate();
        }
        float f28 = this.x;
        if (f28 != f13) {
            rectF = rectF3;
            canvas.saveLayerAlpha(0.0f, 0.0f, f22 + padding + measuredWidth, padding + f14 + measuredHeight, (int) (f28 * 255.0f), 31);
        } else {
            rectF = rectF3;
            canvas.save();
        }
        CheckBoxBase checkBoxBase = this.P;
        m.q3 q3Var = this.Q;
        if (((checkBoxBase == null || !checkBoxBase.q) && !PhotoViewer.L1(this.n)) || this.w0) {
            canvas2 = canvas;
            f15 = f22;
        } else {
            canvas2 = canvas;
            f15 = f22;
            canvas2.drawRect(f15, 0.0f, (f22 + measuredWidth) - padding, (measuredHeight + f14) - padding, (Paint) q3Var.b);
        }
        boolean z11 = this.d0;
        ImageReceiver imageReceiver3 = this.d;
        if (z11 && this.r == z10) {
            float height = getHeight() * 0.72f;
            GradientDrawable gradientDrawable = this.b0;
            if (gradientDrawable != null) {
                gradientDrawable.setBounds(0, 0, getWidth(), getHeight());
                this.b0.draw(canvas2);
            } else if (!this.c0 && imageReceiver2.n() != null) {
                this.c0 = z10;
                Bitmap n10 = imageReceiver2.n();
                boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
                if (n10 == null) {
                    int[] iArr = {0, 0};
                    if (this.c0) {
                        this.b0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
                        invalidate();
                        this.c0 = false;
                    }
                } else {
                    int[] b10 = a8.ba.b(n10, q10);
                    if (this.c0) {
                        this.b0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, b10);
                        invalidate();
                        this.c0 = false;
                    }
                }
            }
            imageReceiver2.y0((measuredWidth - height) / 2.0f, f14, height, getHeight());
        } else if (this.B0 > f14) {
            float L2 = org.telegram.messenger.g0.L(this.w0 ? 7.0f : 10.0f) * this.B0;
            float f29 = f15 + L2;
            float f30 = padding + L2;
            float f31 = L2 * 2.0f;
            float f32 = measuredWidth - f31;
            float f33 = measuredHeight - f31;
            imageReceiver2.y0(f29, f30, f32, f33);
            imageReceiver3.y0(f29, f30, f32, f33);
        } else {
            float f34 = (this.S <= 0.5f || this.T == 9.0f || this.r == 9) ? 0.0f : f13;
            float f35 = f15 + f34;
            float f36 = f34 + padding;
            imageReceiver2.y0(f35, f36, measuredWidth, measuredHeight);
            imageReceiver3.y0(f35, f36, measuredWidth, measuredHeight);
        }
        imageReceiver2.K0(org.telegram.messenger.g0.W1(this.B0, (this.V && this.a0) ? org.telegram.messenger.g0.L(18.0f) : org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(8.0f)), org.telegram.messenger.g0.W1(this.B0, (this.W && this.a0) ? org.telegram.messenger.g0.L(18.0f) : org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(8.0f)), org.telegram.messenger.g0.W1(this.B0, org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(8.0f)), org.telegram.messenger.g0.W1(this.B0, org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(8.0f)));
        if (this.w0) {
            canvas2.save();
            if (this.x0 || this.C0) {
                canvas2.translate(imageReceiver2.r(), imageReceiver2.s());
                if (this.e == null) {
                    this.e = new en0(this);
                }
                this.e.a(canvas2, Math.max(this.B0, d));
                float f37 = f13 - (d * 0.075f);
                canvas2.scale(f37, f37);
                canvas2.translate(-imageReceiver2.r(), -imageReceiver2.s());
            }
        }
        if (PhotoViewer.L1(this.n)) {
            f16 = d;
            f17 = measuredWidth;
            imageReceiver = imageReceiver2;
            f18 = 0.075f;
            rectF2 = rectF;
            o7Var = this;
        } else {
            imageReceiver2.h(canvas2, null);
            ij ijVar = this.n;
            if (ijVar == null || !ijVar.u2() || this.n.N0) {
                f16 = d;
                f17 = measuredWidth;
                imageReceiver = imageReceiver2;
                f18 = 0.075f;
                o7Var = this;
            } else {
                canvas2.save();
                canvas2.clipRect(f15, 0.0f, (f15 + measuredWidth) - padding, (measuredHeight + 0.0f) - padding);
                if (this.i0 != 0.0f) {
                    Path path = this.g0;
                    path.rewind();
                    path.addCircle(this.j0, this.k0, this.l0 * this.i0, Path.Direction.CW);
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                }
                imageReceiver3.h(canvas2, null);
                if (this.m0 != null) {
                    canvas2.clipRect(imageReceiver2.K0, imageReceiver2.L0, imageReceiver2.y(), imageReceiver2.A());
                    f20 = measuredWidth;
                    imageReceiver = imageReceiver2;
                    Canvas canvas4 = canvas2;
                    f21 = d;
                    this.m0.c(canvas4, this, (int) imageReceiver2.M0, (int) imageReceiver2.N0, 1.0f, false);
                    canvas3 = canvas4;
                    o7Var = this;
                } else {
                    f20 = measuredWidth;
                    imageReceiver = imageReceiver2;
                    canvas3 = canvas2;
                    o7Var = this;
                    f21 = d;
                    if (o7Var.h0 == null) {
                        o7Var.h0 = new xh.f();
                    }
                    o7Var.h0.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                    o7Var.h0.setBounds((int) imageReceiver.K0, (int) imageReceiver.L0, (int) imageReceiver.y(), (int) imageReceiver.A());
                    o7Var.h0.draw(canvas3);
                }
                canvas3.restore();
                if (o7Var.n.q4()) {
                    if (o7Var.o0 == null) {
                        f18 = 0.075f;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jg.g.l(2131748484, null, new StringBuilder("x ")));
                        spannableStringBuilder.setSpan(new wp(R.drawable.filled_sensitive, 0), 0, 1, 33);
                        o7Var.o0 = new my0(spannableStringBuilder, 14.0f, org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                    } else {
                        f18 = 0.075f;
                    }
                    my0 my0Var = o7Var.o0;
                    if (f20 < (org.telegram.messenger.g0.L(13) * 2) + my0Var.c) {
                        if (o7Var.p0 == null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(jg.g.l(2131748483, null, new StringBuilder("x ")));
                            spannableStringBuilder2.setSpan(new wp(R.drawable.filled_sensitive, 0), 0, 1, 33);
                            o7Var.p0 = new my0(spannableStringBuilder2, 14.0f, org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                        }
                        my0Var = o7Var.p0;
                    }
                    if (f20 < (org.telegram.messenger.g0.L(26) * 2) + my0Var.c) {
                        if (o7Var.q0 == null) {
                            o7Var.q0 = new my0(new SpannableStringBuilder(hd.M0(2131748483, null)), 13.0f, org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                        }
                        my0Var = o7Var.q0;
                        i10 = 10;
                        i7 = 28;
                    } else {
                        i7 = 32;
                        i10 = 13;
                    }
                    float f38 = (imageReceiver.M0 / 2.0f) + imageReceiver.K0;
                    float f39 = (imageReceiver.N0 / 2.0f) + imageReceiver.L0;
                    float L3 = my0Var.c + org.telegram.messenger.g0.L(i10 + i10);
                    float L4 = org.telegram.messenger.g0.L(i7) / 2.0f;
                    my0 my0Var2 = my0Var;
                    float T1 = org.telegram.messenger.g0.T1(0.8f, f13, f13 - o7Var.i0);
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float f40 = L3 / 2.0f;
                    float f41 = f40 * T1;
                    float f42 = L4 * T1;
                    f17 = f20;
                    f16 = f21;
                    rectF4.set(f38 - f41, f39 - f42, f41 + f38, f39 + f42);
                    Path path2 = o7Var.n0;
                    path2.reset();
                    path2.addRoundRect(rectF4, L4, L4, Path.Direction.CW);
                    canvas3.save();
                    canvas3.clipPath(path2);
                    float alpha = imageReceiver3.getAlpha();
                    imageReceiver3.setAlpha((1.0f - o7Var.i0) * alpha);
                    imageReceiver3.h(canvas3, null);
                    imageReceiver3.setAlpha(alpha);
                    canvas3.restore();
                    Paint V0 = org.telegram.ui.ActionBar.k6.V0("paintChatTimeBackground");
                    int alpha2 = V0.getAlpha();
                    V0.setAlpha((int) org.telegram.messenger.k5.A(1.0f, o7Var.i0, alpha2, 0.35f));
                    canvas3.drawRoundRect(rectF4, L4, L4, V0);
                    V0.setAlpha(alpha2);
                    canvas3.save();
                    canvas3.scale(T1, T1, f38, f39);
                    Canvas canvas5 = canvas3;
                    my0Var2.c(org.telegram.messenger.g0.L(i10) + (f38 - f40), f39, 1.0f - o7Var.i0, -1, canvas5);
                    canvas2 = canvas5;
                    canvas2.restore();
                } else {
                    f16 = f21;
                    f17 = f20;
                    f18 = 0.075f;
                    canvas2 = canvas3;
                }
                o7Var.invalidate();
            }
            if (!o7Var.h) {
                float f43 = o7Var.U;
                if (f43 > 0.0f) {
                    ((Paint) q3Var.e).setColor(i0.a.o(-16777216, (int) (f43 * 0.5f * 255.0f)));
                    rectF2 = rectF;
                    canvas2.drawRect(rectF2, (Paint) q3Var.e);
                }
            }
            rectF2 = rectF;
        }
        if (o7Var.e0) {
            Paint paint = o7Var.s0;
            paint.setColor(805306368);
            canvas2.drawRect(rectF2, paint);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint2 = o7Var.t0;
            paint2.setStyle(style);
            paint2.setColor(-1);
            paint2.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            paint2.setStrokeJoin(Paint.Join.ROUND);
            paint2.setStrokeCap(Paint.Cap.ROUND);
            float L5 = org.telegram.messenger.g0.L(18.0f);
            RectF rectF5 = org.telegram.messenger.g0.P;
            rectF5.set(imageReceiver.r() - L5, imageReceiver.s() - L5, imageReceiver.r() + L5, imageReceiver.s() + L5);
            float currentTimeMillis = ((System.currentTimeMillis() % 1500) / 1500.0f) * 360.0f;
            ij ijVar2 = o7Var.n;
            canvas2.drawArc(rectF5, currentTimeMillis, o7Var.u0.e(false, org.telegram.messenger.g0.T1(0.15f, 0.95f, ijVar2 != null ? ijVar2.H1() : 0.0f)) * 360.0f, false, paint2);
            o7Var.invalidate();
        }
        float f44 = imageReceiver.K0;
        float f45 = imageReceiver.L0;
        float y10 = imageReceiver.y();
        float A = imageReceiver.A();
        RectF rectF6 = o7Var.y0;
        rectF6.set(f44, f45, y10, A);
        if (o7Var.E && (drawable = org.telegram.ui.ActionBar.k6.l3) != null) {
            drawable.setBounds((int) (rectF6.left + org.telegram.messenger.g0.L(8.0f)), (int) (rectF6.top + org.telegram.messenger.g0.L(8.0f)), (int) ((org.telegram.ui.ActionBar.k6.l3.getIntrinsicWidth() * 0.75f) + rectF6.left + org.telegram.messenger.g0.L(8.0f)), (int) ((org.telegram.ui.ActionBar.k6.l3.getIntrinsicHeight() * 0.75f) + rectF6.top + org.telegram.messenger.g0.L(8.0f)));
            org.telegram.ui.ActionBar.k6.l3.draw(canvas2);
        }
        o7Var.c(canvas2, rectF6, f12);
        o7Var.f(canvas2, rectF6, f12);
        if (o7Var.h) {
            o7Var.b(canvas2, rectF6, f12);
        } else {
            o7Var.e(canvas2, rectF6, f12);
        }
        if (o7Var.w0) {
            canvas2.restore();
        }
        CheckBoxBase checkBoxBase2 = o7Var.P;
        if (checkBoxBase2 != null) {
            float f46 = o7Var.r0 != 1 ? 0.0f : 0.0f;
            canvas2.save();
            if (o7Var.w0 && (o7Var.x0 || o7Var.C0)) {
                canvas2.translate(imageReceiver.r(), imageReceiver.s());
                if (o7Var.e == null) {
                    o7Var.e = new en0(o7Var);
                }
                float f47 = f16;
                o7Var.e.a(canvas2, Math.max(o7Var.B0, f47) * 0.5f);
                float f48 = 1.0f - (f47 * f18);
                canvas2.scale(f48, f48);
                canvas2.translate(-imageReceiver.r(), -imageReceiver.s());
            }
            if (o7Var.r0 == 1) {
                L = ((f17 + org.telegram.messenger.g0.L(2.0f)) - org.telegram.messenger.g0.L(25.0f)) - org.telegram.messenger.g0.L(4.0f);
                f19 = org.telegram.messenger.g0.L(4.0f);
            } else if (o7Var.w0) {
                L = (f17 + org.telegram.messenger.g0.L(2.0f)) - org.telegram.messenger.g0.L((o7Var.B0 * 5.0f) + 22.0f);
                f19 = (org.telegram.messenger.g0.L(5.0f) * o7Var.B0) + org.telegram.messenger.g0.L(-2.0f);
            } else {
                L = (f17 + org.telegram.messenger.g0.L(2.0f)) - org.telegram.messenger.g0.L(25.0f);
                f19 = f46;
            }
            canvas2.translate(L, f19);
            o7Var.P.a(canvas2);
            if (o7Var.v0 != null) {
                RectF rectF7 = org.telegram.messenger.g0.P;
                rectF7.set(L, f19, o7Var.P.b.width() + L, o7Var.P.b.height() + f19);
                pc pcVar = o7Var.v0;
                pcVar.i = false;
                pcVar.c = 0;
                pcVar.a(rectF7);
            }
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void e(Canvas canvas, RectF rectF, float f10) {
        Bitmap bitmap;
        if (!this.d0 || (bitmap = this.J) == null || bitmap.isRecycled()) {
            return;
        }
        int L = org.telegram.messenger.g0.L((rectF.width() / ((org.telegram.messenger.g0.L(20.0f) * this.B0) + rectF.width())) * 17.33f);
        canvas.save();
        float f11 = L;
        canvas.translate((rectF.right - f11) - org.telegram.messenger.g0.L(5.66f), rectF.top + org.telegram.messenger.g0.L(5.66f));
        if (this.K == null) {
            this.K = new Paint(3);
        }
        this.K.setAlpha((int) (f10 * 255.0f));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(0.0f, 0.0f, f11, f11);
        canvas.drawBitmap(this.J, (Rect) null, rectF2, this.K);
        canvas.restore();
    }

    public final void f(Canvas canvas, RectF rectF, float f10) {
        if (this.d0) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.Q0) && this.r < 5) {
                float L = (org.telegram.messenger.g0.L(20.0f) * this.B0) + rectF.width();
                float width = rectF.width() / L;
                boolean q10 = q(L);
                float d = this.M.d(this.L);
                float f11 = f10 * d;
                if (f11 < 1.0f) {
                    f11 = (float) Math.pow(f11, 8.0d);
                }
                if (d <= 0.0f) {
                    return;
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, q10 ? 0.0f : rectF.width(), rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                float L2 = org.telegram.messenger.g0.L(26.0f);
                org.telegram.ui.Components.i6 i6Var = this.N;
                float c10 = i6Var.c() + L2;
                canvas.translate(q10 ? org.telegram.messenger.g0.L(5.0f) : (rectF.width() - org.telegram.messenger.g0.L(5.0f)) - c10, ((rectF.height() + org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(17.0f)) - org.telegram.messenger.g0.L(4.0f));
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(0.0f, 0.0f, c10, org.telegram.messenger.g0.L(17.0f));
                int alpha = org.telegram.ui.ActionBar.k6.i2.getAlpha();
                org.telegram.ui.ActionBar.k6.i2.setAlpha((int) (alpha * f11));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.i2);
                org.telegram.ui.ActionBar.k6.i2.setAlpha(alpha);
                canvas.save();
                float L3 = org.telegram.messenger.g0.L(3.0f);
                int L4 = org.telegram.messenger.g0.L(17.0f);
                m.q3 q3Var = this.Q;
                canvas.translate(L3, (L4 - ((Drawable) q3Var.d).getBounds().height()) / 2.0f);
                ((Drawable) q3Var.d).setAlpha((int) (this.x * 255.0f * f11));
                ((Drawable) q3Var.d).draw(canvas);
                canvas.restore();
                canvas.translate(org.telegram.messenger.g0.L(22.0f), 0.0f);
                i6Var.setBounds(0, 0, (int) c10, org.telegram.messenger.g0.L(17.0f));
                i6Var.B = (int) (f11 * 255.0f);
                i6Var.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final int g(ij ijVar) {
        TL_stories.StoryItem storyItem;
        if (this.f0) {
            return 100;
        }
        if (!this.d0 || ijVar == null || (storyItem = ijVar.l) == null) {
            return -1;
        }
        if (storyItem.parsedPrivacy == null) {
            storyItem.parsedPrivacy = new fi.q8(this.f, storyItem.privacy);
        }
        int i7 = storyItem.parsedPrivacy.a;
        if (i7 == 2 || i7 == 1 || i7 == 3) {
            return i7;
        }
        return -1;
    }

    public View getCrossfadeView() {
        return this.w;
    }

    public int getMessageId() {
        ij ijVar = this.n;
        if (ijVar != null) {
            return ijVar.f1();
        }
        return 0;
    }

    public ij getMessageObject() {
        return this.n;
    }

    public int getStyle() {
        return this.r0;
    }

    public final void i(boolean z9, boolean z10) {
        int i7;
        CheckBoxBase checkBoxBase = this.P;
        if ((checkBoxBase != null && checkBoxBase.q) == z9) {
            return;
        }
        if (checkBoxBase == null) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, null);
            this.P = checkBoxBase2;
            checkBoxBase2.h(-1, org.telegram.ui.ActionBar.k6.zi, org.telegram.ui.ActionBar.k6.k7);
            if (this.w0 && (i7 = this.a) != 0) {
                CheckBoxBase checkBoxBase3 = this.P;
                int w10 = org.telegram.ui.ActionBar.k6.w(i7, org.telegram.ui.ActionBar.k6.r1(0.25f, -1));
                if (checkBoxBase3.x != w10) {
                    checkBoxBase3.x = w10;
                    checkBoxBase3.b();
                }
            }
            this.P.k(false);
            this.P.d(1);
            this.P.e(0, 0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            if (this.R) {
                this.P.l = true;
            }
        }
        this.P.f(-1, z9, z10);
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            this.A0 = null;
            valueAnimator.cancel();
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.B0, z9 ? 1.0f : 0.0f);
            this.A0 = ofFloat;
            ofFloat.addUpdateListener(new di.m4(this, 7));
            this.A0.setDuration(200L);
            this.A0.addListener(new ch.y(24, this, z9));
            this.A0.start();
        } else {
            this.B0 = z9 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void j(boolean z9, float f10) {
        if (this.y != f10) {
            this.y = f10;
            if (z9) {
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
    public final void k(ij ijVar, int i7, boolean z9) {
        String str;
        boolean z10;
        float f10;
        TLRPC.WebPage webPage;
        String str2;
        TL_stories.StoryViews storyViews;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem;
        int i10 = i7;
        if (i10 < 1) {
            i10 = 1;
        }
        int i11 = this.r;
        this.r = i10;
        ij ijVar2 = this.n;
        if (ijVar2 == null && ijVar == null) {
            return;
        }
        if (ijVar2 != null && ijVar != null && ijVar2.f1() == ijVar.f1()) {
            ij ijVar3 = this.n;
            if ((ijVar3 != null ? ijVar3.m : null) == ijVar.m) {
                if ((ijVar3 != null ? ijVar3.j : null) == ijVar.j) {
                    TLRPC.MessageMedia messageMedia = (ijVar3 == null || (storyItem = ijVar3.l) == null) ? null : storyItem.media;
                    TL_stories.StoryItem storyItem2 = ijVar.l;
                    TLRPC.MessageMedia messageMedia2 = storyItem2 == null ? null : storyItem2.media;
                    if (((messageMedia == null && messageMedia2 == null) || (messageMedia != null && messageMedia2 != null && ((document = messageMedia.document) == null ? !((photo = messageMedia.photo) == null || (photo2 = messageMedia2.photo) == null || photo2.id != photo.id) : !((document2 = messageMedia2.document) == null || document2.id != document.id)))) && i11 == i10) {
                        int i12 = this.I;
                        if ((i12 == 100) == this.f0 && i12 == g(ijVar) && !z9) {
                            return;
                        }
                    }
                }
            }
        }
        this.n = ijVar;
        this.d0 = ijVar != null && ijVar.y4();
        ij ijVar4 = this.n;
        this.e0 = (ijVar4 == null || ijVar4.m == null) ? false : true;
        p();
        org.telegram.ui.Components.i6 i6Var = this.N;
        org.telegram.ui.Components.w5 w5Var = this.M;
        ImageReceiver imageReceiver = this.b;
        ImageReceiver imageReceiver2 = this.c;
        ImageReceiver imageReceiver3 = this.d;
        if (ijVar == null) {
            imageReceiver2.R();
            imageReceiver.R();
            imageReceiver3.R();
            this.G = null;
            this.L = false;
            w5Var.e(true, 0.0f);
            i6Var.t("", false, true);
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
        TL_stories.StoryItem storyItem3 = ijVar.l;
        if (this.R) {
            imageReceiver2.P();
            imageReceiver.P();
            imageReceiver3.P();
        }
        ImageReceiver imageReceiver4 = z9 ? imageReceiver : imageReceiver2;
        int i13 = this.f;
        String F1 = qp.s1(i13).F1(ijVar.k.restriction_reason);
        int i14 = org.telegram.messenger.g0.q.x;
        float f11 = org.telegram.messenger.g0.p;
        int i15 = (int) ((i14 / i10) / f11);
        if (z9) {
            i15 = (((int) (i14 / f11)) * 3) / 5;
        }
        SparseArray sparseArray = (SparseArray) this.Q.f;
        String str3 = (String) sparseArray.get(i15);
        if (str3 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i15);
            str = F1;
            sb2.append("_");
            sb2.append(i15);
            sb2.append("_isc");
            String sb3 = sb2.toString();
            sparseArray.put(i15, sb3);
            str3 = sb3;
        } else {
            str = F1;
        }
        int Z0 = (i10 <= 2 || z9) ? org.telegram.messenger.g0.Z0(false) : qs.r5;
        this.G = null;
        this.F = null;
        this.D = false;
        this.E = false;
        imageReceiver2.e();
        imageReceiver.e();
        if (!this.d0 || (storyViews = storyItem3.views) == null) {
            z10 = true;
            this.L = false;
            f10 = 0.0f;
            w5Var.e(true, 0.0f);
            i6Var.t("", false, true);
        } else {
            int i16 = storyViews.views_count;
            this.L = i16 > 0;
            z10 = true;
            i6Var.t(org.telegram.messenger.g0.o0(i16, 0), false, true);
            f10 = 0.0f;
        }
        w5Var.e(z10, this.L ? 1.0f : f10);
        ij ijVar5 = ijVar.j != null ? storyItem3 : ijVar;
        if (TextUtils.isEmpty(str)) {
            if (storyItem3 == 0 || !(storyItem3.media instanceof TLRPC.TL_messageMediaUnsupported)) {
                di.x6 x6Var = ijVar.m;
                if (x6Var == null || (str2 = x6Var.f) == null) {
                    String str4 = str3;
                    TLRPC.Document F02 = ijVar.F0();
                    TLRPC.Photo D1 = ij.D1(ijVar.k);
                    if (ij.L4(F02)) {
                        this.D = !ijVar.E3();
                        this.E = ijVar.E3();
                        if (i10 != 9 && !ijVar.E3()) {
                            this.G = org.telegram.messenger.g0.g0((int) ijVar.L0(), false, false);
                        }
                        TLRPC.MessageMedia n1 = ij.n1(ijVar);
                        if ((n1 instanceof TLRPC.TL_messageMediaDocument ? ((TLRPC.TL_messageMediaDocument) n1).video_cover : (n1 == null || (webPage = n1.webpage) == null || !webPage.video_cover_photo) ? null : webPage.photo) != null) {
                            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ijVar.n0, 50, false, null, false);
                            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(ijVar.n0, Z0, false, w10, this.d0);
                            if (w11 == w10) {
                                w10 = null;
                            }
                            if (ijVar.G1 != null) {
                                imageReceiver4.r0(hc.f(w11, ijVar.l0), str4, null, null, ijVar.G1, w11 != null ? w11.size : 0L, null, ijVar5, ij.S5(ijVar.k) ? 2 : 1);
                            } else {
                                imageReceiver4.r0(hc.f(w11, ijVar.l0), str4, hc.f(w10, ijVar.l0), rf.b.q(str4, "_b"), null, w11 != null ? w11.size : 0L, null, ijVar5, ij.S5(ijVar.k) ? 2 : 1);
                            }
                        } else {
                            TLRPC.Document F03 = ijVar.F0();
                            TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(F03.thumbs, 50, false, null, false);
                            TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(F03.thumbs, Z0, false, null, this.d0);
                            if (w12 == w13 && !this.d0) {
                                w13 = null;
                            }
                            if (w12 != null) {
                                if (ijVar.G1 != null) {
                                    imageReceiver4.q0(hc.c(w13, F03), str4, ijVar.G1, null, ijVar5, 0);
                                } else {
                                    imageReceiver4.r0(hc.c(w13, F03), str4, hc.c(w12, F03), rf.b.q(str4, "_b"), null, 0L, null, ijVar5, 0);
                                }
                            }
                        }
                    } else if (D1 != null && !ijVar.n0.isEmpty()) {
                        if (!ijVar.x0) {
                            if (System.currentTimeMillis() - E0 > 5000) {
                                E0 = System.currentTimeMillis();
                                F0 = org.telegram.messenger.z5.q(i13).d(ijVar);
                            }
                            if (!F0 && !this.d0) {
                                BitmapDrawable bitmapDrawable = ijVar.G1;
                                if (bitmapDrawable != null) {
                                    imageReceiver4.r0(null, null, null, null, bitmapDrawable, 0L, null, ijVar5, 0);
                                } else {
                                    imageReceiver4.r0(null, null, hc.f(org.telegram.messenger.w7.w(ijVar.n0, 50, false, null, false), ijVar.l0), "b", null, 0L, null, ijVar5, 0);
                                }
                            }
                        }
                        TLRPC.PhotoSize w14 = org.telegram.messenger.w7.w(ijVar.n0, 50, false, null, false);
                        TLRPC.PhotoSize w15 = org.telegram.messenger.w7.w(ijVar.n0, Z0, false, w14, this.d0);
                        if (w15 == w14) {
                            w14 = null;
                        }
                        if (ijVar.G1 != null) {
                            imageReceiver4.r0(hc.f(w15, ijVar.l0), str4, null, null, ijVar.G1, w15 != null ? w15.size : 0L, null, ijVar5, ij.S5(ijVar.k) ? 2 : 1);
                        } else {
                            imageReceiver4.r0(hc.f(w15, ijVar.l0), str4, z9 ? null : hc.f(w14, ijVar.l0), rf.b.q(str4, "_b"), null, w15 != null ? w15.size : 0L, null, ijVar5, ij.S5(ijVar.k) ? 2 : 1);
                        }
                    }
                } else {
                    imageReceiver4.q0(hc.g(str2), str3, null, null, ijVar5, 0);
                }
            } else {
                storyItem3.dialogId = ij.B0(ijVar.k);
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_emoji_recent).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(1090519039, PorterDuff.Mode.SRC_IN));
                imageReceiver4.w0(new xp(new ColorDrawable(-13421773), mutate));
            }
            if (imageReceiver3.n() != null) {
                imageReceiver3.n().recycle();
                imageReceiver3.w0(null);
            }
            if (imageReceiver4.n() != null && this.n.u2() && !this.n.M0) {
                imageReceiver3.v0(Utilities.D(imageReceiver4.n(), false));
            }
            if (storyItem3 != 0) {
                imageReceiver4.a(new di.u9(storyItem3));
            }
            setPrivacyType(g(ijVar));
            if (this.h) {
                long B0 = ij.B0(ijVar.k);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                spannableStringBuilder.append((CharSequence) qp.s1(i13).B1(B0, false));
                org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(i10 == 2 ? 16.0f : 13.66f, i13, this);
                f5Var.c(B0);
                spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
                this.O = new my0(spannableStringBuilder, i10 == 2 ? 14.0f : 10.1666f, org.telegram.messenger.g0.o());
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
        setPrivacyType(g(ijVar));
        if (this.h) {
        }
        o();
        invalidate();
    }

    public final void l(boolean z9, boolean z10) {
        if (this.C0 == z9) {
            return;
        }
        this.C0 = z9;
        if (!z10) {
            this.D0.a(z9);
        }
        invalidate();
    }

    public final void m(String str, boolean z9) {
        this.G = str;
        this.D = true;
        this.E = false;
        StaticLayout staticLayout = this.F;
        if (staticLayout != null && !staticLayout.getText().toString().equals(str)) {
            this.F = null;
        }
        this.H = z9;
    }

    public final void n(float f10, float f11) {
        this.j0 = f10;
        this.k0 = f11;
        this.l0 = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) c8.j9.a(this.l0 * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(xq.j);
        duration.addUpdateListener(new r(this, 5));
        duration.addListener(new m.a(this, 28));
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
        String M0;
        double L0;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        boolean L4;
        String M02;
        int i7;
        TL_stories.StoryViews storyViews;
        try {
            ij ijVar = this.n;
            if (ijVar == null) {
                setContentDescription(null);
                return;
            }
            TL_stories.StoryItem storyItem2 = ijVar.l;
            boolean y42 = ijVar.y4();
            StringBuilder sb2 = new StringBuilder();
            if (y42 && this.f0) {
                sb2.append(hd.M0(2131754753, null));
            }
            if (!ijVar.E3()) {
                if (ijVar.i4()) {
                    M0 = hd.M0(2131754782, null);
                    L0 = ijVar.L0();
                } else {
                    if (!ij.M4(ijVar.k)) {
                        TLRPC.MessageMedia o12 = ij.o1(ijVar.k);
                        if (o12 != null && (storyItem = o12.storyItem) != null && (messageMedia = storyItem.media) != null) {
                            L4 = ij.L4(messageMedia.document);
                            if (L4) {
                                M02 = hd.M0(2131753948, null);
                            }
                        }
                        L4 = false;
                        if (L4) {
                        }
                    }
                    M0 = hd.M0(2131753933, null);
                    L0 = ijVar.L0();
                }
                String str = M0;
                i7 = (int) L0;
                M02 = str;
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(M02);
                if (i7 > 0) {
                    sb2.append(", ");
                    sb2.append(hd.z(i7));
                }
                if (y42 && storyItem2 != null) {
                    storyViews = storyItem2.views;
                    if (storyViews != null && storyViews.views_count > 0) {
                        sb2.append(", ");
                        sb2.append(hd.G(storyItem2.views.views_count, "Views", new Object[0]));
                    }
                    if (storyItem2.date > 0) {
                        sb2.append(", ");
                        sb2.append(hd.a0(null, null, 2131754803, hd.s(storyItem2.date, false)));
                    }
                }
                setContentDescription(sb2.toString());
            }
            M02 = hd.M0(2131754848, null);
            i7 = 0;
            if (sb2.length() > 0) {
            }
            sb2.append(M02);
            if (i7 > 0) {
            }
            if (y42) {
                storyViews = storyItem2.views;
                if (storyViews != null) {
                    sb2.append(", ");
                    sb2.append(hd.G(storyItem2.views.views_count, "Views", new Object[0]));
                }
                if (storyItem2.date > 0) {
                }
            }
            setContentDescription(sb2.toString());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
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
        xh.e eVar = this.m0;
        if (eVar != null) {
            if (eVar.i) {
                this.m0 = xh.e.e(this);
            } else {
                eVar.a(this);
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
        xh.e eVar = this.m0;
        if (eVar != null) {
            eVar.b(this);
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        boolean z9 = this.d0;
        int i11 = z9 ? (int) (size * 1.25f) : size;
        if (z9 && this.r == 1) {
            i11 /= 2;
        }
        setMeasuredDimension(size, i11);
        p();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pc pcVar = this.v0;
        if (pcVar == null || !pcVar.b(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void p() {
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            return;
        }
        ij ijVar = this.n;
        if (ijVar != null && ijVar.u2()) {
            if (this.m0 == null) {
                this.m0 = xh.e.e(this);
            }
        } else {
            xh.e eVar = this.m0;
            if (eVar != null) {
                eVar.b(this);
                this.m0 = null;
            }
        }
    }

    public final boolean q(float f10) {
        int i7;
        if (this.d0 && this.r < 5) {
            int L = org.telegram.messenger.g0.L(26.0f) + ((int) this.N.c());
            if (this.D) {
                int L2 = org.telegram.messenger.g0.L(8.0f);
                StaticLayout staticLayout = this.F;
                i7 = L2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.H ? org.telegram.messenger.g0.L(10.0f) : 0);
            } else {
                i7 = 0;
            }
            if (L + ((L <= 0 || i7 <= 0) ? 0 : org.telegram.messenger.g0.L(8.0f)) + i7 > f10) {
                return true;
            }
        }
        return false;
    }

    public void setGradientView(lz lzVar) {
        this.s = lzVar;
    }

    public void setHighlightProgress(float f10) {
        if (this.U != f10) {
            this.U = f10;
            invalidate();
        }
    }

    public void setReorder(boolean z9) {
        this.x0 = z9;
        invalidate();
    }

    public void setStyle(int i7) {
        if (this.r0 == i7) {
            return;
        }
        this.r0 = i7;
        if (i7 == 1) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(21, this, null);
            this.P = checkBoxBase;
            checkBoxBase.h(-1, org.telegram.ui.ActionBar.k6.zi, org.telegram.ui.ActionBar.k6.k7);
            this.P.k(true);
            this.P.d(0);
            this.P.e(0, 0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            if (this.R) {
                this.P.l = true;
            }
            pc pcVar = new pc(this);
            this.v0 = pcVar;
            pcVar.h = new f(this, 7);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.N == drawable || super.verifyDrawable(drawable);
    }

    public void h() {
    }
}
