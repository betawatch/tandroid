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
import b8.be;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class n7 extends FrameLayout {
    public static long F0;
    public static boolean G0;
    public Path A0;
    public ValueAnimator B0;
    public float C0;
    public boolean D0;
    public boolean E;
    public final org.telegram.ui.Components.u5 E0;
    public boolean F;
    public StaticLayout G;
    public String H;
    public boolean I;
    public int J;
    public Bitmap K;
    public Paint L;
    public boolean M;
    public final org.telegram.ui.Components.u5 N;
    public final org.telegram.ui.Components.g6 O;
    public ly0 P;
    public CheckBoxBase Q;
    public final m.o3 R;
    public boolean S;
    public float T;
    public float U;
    public float V;
    public boolean W;
    public int a;
    public boolean a0;
    public final ImageReceiver b;
    public boolean b0;
    public final ImageReceiver c;
    public GradientDrawable c0;
    public final ImageReceiver d;
    public boolean d0;
    public hn0 e;
    public boolean e0;
    public final int f;
    public boolean f0;
    public boolean g0;
    public boolean h;
    public final Path h0;
    public yh.f i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public zi n;
    public yh.e n0;
    public final Path o0;
    public ly0 p0;
    public ly0 q0;
    public int r;
    public ly0 r0;
    public iz s;
    public int s0;
    public final Paint t0;
    public final Paint u0;
    public final org.telegram.ui.Components.u5 v0;
    public n7 w;
    public nc w0;
    public float x;
    public boolean x0;
    public float y;
    public boolean y0;
    public final RectF z0;

    public n7(Context context, m.o3 o3Var, int i3) {
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
        this.I = true;
        xq xqVar = xq.h;
        this.N = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.O = g6Var;
        this.h0 = new Path();
        this.o0 = new Path();
        this.s0 = 0;
        this.t0 = new Paint(1);
        this.u0 = new Paint(1);
        this.v0 = new org.telegram.ui.Components.u5(this, 0L, 200L, xqVar);
        this.z0 = new RectF();
        this.E0 = new org.telegram.ui.Components.u5(this, 0L, 320L, xqVar);
        this.R = o3Var;
        this.f = i3;
        i(false, false);
        imageReceiver2.H0(this);
        imageReceiver.H0(this);
        imageReceiver3.H0(this);
        imageReceiver2.h1 = new ca(this, 6);
        g6Var.setCallback(this);
        g6Var.w(org.telegram.messenger.g0.L(12.0f));
        g6Var.u(-1);
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.M = org.telegram.messenger.g0.q.x;
        setWillNotDraw(false);
    }

    private float getPadding() {
        if (this.T != 0.0f) {
            float f10 = this.U;
            if (f10 == 9.0f || this.r == 9) {
                if (f10 == 9.0f) {
                    return com.google.android.recaptcha.internal.a.y(1.0f, this.T, org.telegram.messenger.g0.N(2.0f), org.telegram.messenger.g0.N(1.0f) * this.T);
                }
                return com.google.android.recaptcha.internal.a.y(1.0f, this.T, org.telegram.messenger.g0.N(1.0f), org.telegram.messenger.g0.N(2.0f) * this.T);
            }
        }
        return this.r == 9 ? org.telegram.messenger.g0.N(1.0f) : org.telegram.messenger.g0.N(2.0f);
    }

    private void setPrivacyType(int i3) {
        if (this.J == i3) {
            return;
        }
        this.J = i3;
        this.K = null;
        int i10 = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 100 ? 0 : R.drawable.msg_pin_mini : R.drawable.msg_folders_groups : R.drawable.msg_folders_private : R.drawable.msg_stories_closefriends;
        if (i10 != 0) {
            Context context = getContext();
            HashMap hashMap = (HashMap) this.R.g;
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
            this.K = bitmap;
        }
        invalidate();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12) {
        canvas.save();
        if (this.A0 == null) {
            this.A0 = new Path();
        }
        this.A0.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, f10, f11);
        float L = org.telegram.messenger.g0.L(12.0f) * f12;
        this.A0.addRoundRect(rectF, L, L, Path.Direction.CW);
        this.A0.close();
        canvas.clipPath(this.A0);
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
        if (this.e0) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.R0) && this.h && this.P != null) {
                float L = org.telegram.messenger.g0.L(5.33f);
                ly0 ly0Var = this.P;
                ly0Var.p = (int) (rectF.width() - (2.0f * L));
                ly0Var.t = org.telegram.messenger.g0.L(14.0f);
                ly0Var.a.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.k6.r1(0.4f * f10, -16777216));
                ly0Var.c(rectF.left + L, rectF.top + org.telegram.messenger.g0.L(this.r <= 2 ? 15.0f : 11.33f), 1.0f, org.telegram.ui.ActionBar.k6.r1(f10, -1), canvas);
            }
        }
    }

    public final void c(Canvas canvas, RectF rectF, float f10) {
        String str;
        float f11 = f10;
        if (this.E) {
            ImageReceiver imageReceiver = this.c;
            if (imageReceiver == null || imageReceiver.R0) {
                float L = (org.telegram.messenger.g0.L(20.0f) * this.C0) + rectF.width();
                float width = rectF.width() / L;
                if (f11 < 1.0f) {
                    f11 = (float) Math.pow(f11, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i3 = this.r;
                m.o3 o3Var = this.R;
                if (i3 != 9 && this.G == null && (str = this.H) != null) {
                    this.G = new StaticLayout(this.H, (TextPaint) o3Var.a, (int) Math.ceil(((TextPaint) o3Var.a).measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i3 >= 9 || this.H == null) && this.G != null) {
                    this.G = null;
                }
                boolean q10 = q(L);
                int L2 = org.telegram.messenger.g0.L(8.0f);
                StaticLayout staticLayout = this.G;
                int width2 = L2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.I ? org.telegram.messenger.g0.L(10.0f) : 0);
                canvas.translate(org.telegram.messenger.g0.L(5.0f), (((rectF.height() + org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(17.0f)) - org.telegram.messenger.g0.L(4.0f)) - (q10 ? org.telegram.messenger.g0.L(22.0f) : 0));
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(0.0f, 0.0f, width2, org.telegram.messenger.g0.L(17.0f));
                int alpha = org.telegram.ui.ActionBar.k6.i2.getAlpha();
                org.telegram.ui.ActionBar.k6.i2.setAlpha((int) (alpha * f11));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.i2);
                org.telegram.ui.ActionBar.k6.i2.setAlpha(alpha);
                if (this.I) {
                    canvas.save();
                    float L3 = this.G == null ? org.telegram.messenger.g0.L(5.0f) : org.telegram.messenger.g0.L(4.0f);
                    int L4 = org.telegram.messenger.g0.L(17.0f);
                    Drawable drawable = (Drawable) o3Var.c;
                    Drawable drawable2 = (Drawable) o3Var.c;
                    canvas.translate(L3, (L4 - drawable.getIntrinsicHeight()) / 2.0f);
                    drawable2.setAlpha((int) (this.x * 255.0f * f11));
                    drawable2.draw(canvas);
                    canvas.restore();
                }
                if (this.G != null) {
                    canvas.translate(org.telegram.messenger.g0.L((this.I ? 10 : 0) + 4), (org.telegram.messenger.g0.L(17.0f) - this.G.getHeight()) / 2.0f);
                    TextPaint textPaint = (TextPaint) o3Var.a;
                    TextPaint textPaint2 = (TextPaint) o3Var.a;
                    int alpha2 = textPaint.getAlpha();
                    textPaint2.setAlpha((int) (alpha2 * f11));
                    this.G.draw(canvas);
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
    public final void d(float f10, float f11, float f12, Canvas canvas, boolean z10) {
        float f13;
        float f14;
        boolean z11;
        RectF rectF;
        Canvas canvas2;
        float f15;
        float f16;
        float f17;
        ImageReceiver imageReceiver;
        float f18;
        RectF rectF2;
        n7 n7Var;
        float L;
        float f19;
        Drawable drawable;
        float f20;
        Canvas canvas3;
        float f21;
        int i3;
        int i10;
        iz izVar;
        float padding = getPadding() * f10;
        float f22 = this.W ? padding : 0.0f;
        float d = this.E0.d(this.D0);
        float measuredWidth = ((getMeasuredWidth() - f22) - padding) * this.y;
        float measuredHeight = ((getMeasuredHeight() - 0.0f) - padding) * this.y;
        ImageReceiver imageReceiver2 = z10 ? this.b : this.c;
        imageReceiver2.setAlpha(f11);
        RectF rectF3 = imageReceiver2.Q0;
        if (this.T > 0.5f && this.U != 9.0f && this.r != 9) {
            float f23 = f10 * 2.0f;
            measuredWidth -= f23;
            measuredHeight -= f23;
        }
        if ((this.n != null || this.s0 == 1) && imageReceiver2.I() && imageReceiver2.i1 == 1.0f && this.x == 1.0f) {
            f13 = 1.0f;
            f14 = 0.0f;
            z11 = true;
        } else {
            if (getParent() == null || (izVar = this.s) == null) {
                f13 = 1.0f;
                f14 = 0.0f;
                z11 = true;
            } else {
                int measuredWidth2 = ((View) getParent()).getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                float f24 = -getX();
                izVar.P = measuredWidth2;
                izVar.Q = measuredHeight2;
                izVar.R = f24;
                this.s.updateColors();
                this.s.f();
                float f25 = (this.T <= 0.5f || this.U == 9.0f || this.r == 9) ? 0.0f : 1.0f;
                float f26 = f22 + f25;
                float f27 = f25 + padding;
                f13 = 1.0f;
                f14 = 0.0f;
                z11 = true;
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
        CheckBoxBase checkBoxBase = this.Q;
        m.o3 o3Var = this.R;
        if (((checkBoxBase == null || !checkBoxBase.q) && !PhotoViewer.Q1(this.n)) || this.x0) {
            canvas2 = canvas;
            f15 = f22;
        } else {
            canvas2 = canvas;
            f15 = f22;
            canvas2.drawRect(f15, 0.0f, (f22 + measuredWidth) - padding, (measuredHeight + f14) - padding, (Paint) o3Var.b);
        }
        boolean z12 = this.e0;
        ImageReceiver imageReceiver3 = this.d;
        if (z12 && this.r == z11) {
            float height = getHeight() * 0.72f;
            GradientDrawable gradientDrawable = this.c0;
            if (gradientDrawable != null) {
                gradientDrawable.setBounds(0, 0, getWidth(), getHeight());
                this.c0.draw(canvas2);
            } else if (!this.d0 && imageReceiver2.n() != null) {
                this.d0 = z11;
                Bitmap n4 = imageReceiver2.n();
                boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
                if (n4 == null) {
                    int[] iArr = {0, 0};
                    if (this.d0) {
                        this.c0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
                        invalidate();
                        this.d0 = false;
                    }
                } else {
                    int[] b10 = b8.nc.b(n4, q10);
                    if (this.d0) {
                        this.c0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, b10);
                        invalidate();
                        this.d0 = false;
                    }
                }
            }
            imageReceiver2.y0((measuredWidth - height) / 2.0f, f14, height, getHeight());
        } else if (this.C0 > f14) {
            float L2 = org.telegram.messenger.g0.L(this.x0 ? 7.0f : 10.0f) * this.C0;
            float f29 = f15 + L2;
            float f30 = padding + L2;
            float f31 = L2 * 2.0f;
            float f32 = measuredWidth - f31;
            float f33 = measuredHeight - f31;
            imageReceiver2.y0(f29, f30, f32, f33);
            imageReceiver3.y0(f29, f30, f32, f33);
        } else {
            float f34 = (this.T <= 0.5f || this.U == 9.0f || this.r == 9) ? 0.0f : f13;
            float f35 = f15 + f34;
            float f36 = f34 + padding;
            imageReceiver2.y0(f35, f36, measuredWidth, measuredHeight);
            imageReceiver3.y0(f35, f36, measuredWidth, measuredHeight);
        }
        imageReceiver2.K0(org.telegram.messenger.g0.W1(this.C0, (this.W && this.b0) ? org.telegram.messenger.g0.L(18.0f) : org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(8.0f)), org.telegram.messenger.g0.W1(this.C0, (this.a0 && this.b0) ? org.telegram.messenger.g0.L(18.0f) : org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(8.0f)), org.telegram.messenger.g0.W1(this.C0, org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(8.0f)), org.telegram.messenger.g0.W1(this.C0, org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(8.0f)));
        if (this.x0) {
            canvas2.save();
            if (this.y0 || this.D0) {
                canvas2.translate(imageReceiver2.r(), imageReceiver2.s());
                if (this.e == null) {
                    this.e = new hn0(this);
                }
                this.e.a(canvas2, Math.max(this.C0, d));
                float f37 = f13 - (d * 0.075f);
                canvas2.scale(f37, f37);
                canvas2.translate(-imageReceiver2.r(), -imageReceiver2.s());
            }
        }
        if (PhotoViewer.Q1(this.n)) {
            f16 = d;
            f17 = measuredWidth;
            imageReceiver = imageReceiver2;
            f18 = 0.075f;
            rectF2 = rectF;
            n7Var = this;
        } else {
            imageReceiver2.h(canvas2, null);
            zi ziVar = this.n;
            if (ziVar == null || !ziVar.u2() || this.n.N0) {
                f16 = d;
                f17 = measuredWidth;
                imageReceiver = imageReceiver2;
                f18 = 0.075f;
                n7Var = this;
            } else {
                canvas2.save();
                canvas2.clipRect(f15, 0.0f, (f15 + measuredWidth) - padding, (measuredHeight + 0.0f) - padding);
                if (this.j0 != 0.0f) {
                    Path path = this.h0;
                    path.rewind();
                    path.addCircle(this.k0, this.l0, this.m0 * this.j0, Path.Direction.CW);
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                }
                imageReceiver3.h(canvas2, null);
                if (this.n0 != null) {
                    canvas2.clipRect(imageReceiver2.L0, imageReceiver2.M0, imageReceiver2.y(), imageReceiver2.A());
                    f20 = measuredWidth;
                    imageReceiver = imageReceiver2;
                    Canvas canvas4 = canvas2;
                    f21 = d;
                    this.n0.c(canvas4, this, (int) imageReceiver2.N0, (int) imageReceiver2.O0, 1.0f, false);
                    canvas3 = canvas4;
                    n7Var = this;
                } else {
                    f20 = measuredWidth;
                    imageReceiver = imageReceiver2;
                    canvas3 = canvas2;
                    n7Var = this;
                    f21 = d;
                    if (n7Var.i0 == null) {
                        n7Var.i0 = new yh.f();
                    }
                    n7Var.i0.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                    n7Var.i0.setBounds((int) imageReceiver.L0, (int) imageReceiver.M0, (int) imageReceiver.y(), (int) imageReceiver.A());
                    n7Var.i0.draw(canvas3);
                }
                canvas3.restore();
                if (n7Var.n.q4()) {
                    if (n7Var.p0 == null) {
                        f18 = 0.075f;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k2.p1.k(2131748493, null, new StringBuilder("x ")));
                        spannableStringBuilder.setSpan(new wp(R.drawable.filled_sensitive, 0), 0, 1, 33);
                        n7Var.p0 = new ly0(spannableStringBuilder, 14.0f, org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                    } else {
                        f18 = 0.075f;
                    }
                    ly0 ly0Var = n7Var.p0;
                    if (f20 < (org.telegram.messenger.g0.L(13) * 2) + ly0Var.c) {
                        if (n7Var.q0 == null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(k2.p1.k(2131748492, null, new StringBuilder("x ")));
                            spannableStringBuilder2.setSpan(new wp(R.drawable.filled_sensitive, 0), 0, 1, 33);
                            n7Var.q0 = new ly0(spannableStringBuilder2, 14.0f, org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                        }
                        ly0Var = n7Var.q0;
                    }
                    if (f20 < (org.telegram.messenger.g0.L(26) * 2) + ly0Var.c) {
                        if (n7Var.r0 == null) {
                            n7Var.r0 = new ly0(new SpannableStringBuilder(bd.M0(2131748492, null)), 13.0f, org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                        }
                        ly0Var = n7Var.r0;
                        i10 = 10;
                        i3 = 28;
                    } else {
                        i3 = 32;
                        i10 = 13;
                    }
                    float f38 = (imageReceiver.N0 / 2.0f) + imageReceiver.L0;
                    float f39 = (imageReceiver.O0 / 2.0f) + imageReceiver.M0;
                    float L3 = ly0Var.c + org.telegram.messenger.g0.L(i10 + i10);
                    float L4 = org.telegram.messenger.g0.L(i3) / 2.0f;
                    ly0 ly0Var2 = ly0Var;
                    float T1 = org.telegram.messenger.g0.T1(0.8f, f13, f13 - n7Var.j0);
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float f40 = L3 / 2.0f;
                    float f41 = f40 * T1;
                    float f42 = L4 * T1;
                    f17 = f20;
                    f16 = f21;
                    rectF4.set(f38 - f41, f39 - f42, f41 + f38, f39 + f42);
                    Path path2 = n7Var.o0;
                    path2.reset();
                    path2.addRoundRect(rectF4, L4, L4, Path.Direction.CW);
                    canvas3.save();
                    canvas3.clipPath(path2);
                    float alpha = imageReceiver3.getAlpha();
                    imageReceiver3.setAlpha((1.0f - n7Var.j0) * alpha);
                    imageReceiver3.h(canvas3, null);
                    imageReceiver3.setAlpha(alpha);
                    canvas3.restore();
                    Paint V0 = org.telegram.ui.ActionBar.k6.V0("paintChatTimeBackground");
                    int alpha2 = V0.getAlpha();
                    V0.setAlpha((int) org.telegram.messenger.k5.A(1.0f, n7Var.j0, alpha2, 0.35f));
                    canvas3.drawRoundRect(rectF4, L4, L4, V0);
                    V0.setAlpha(alpha2);
                    canvas3.save();
                    canvas3.scale(T1, T1, f38, f39);
                    Canvas canvas5 = canvas3;
                    ly0Var2.c(org.telegram.messenger.g0.L(i10) + (f38 - f40), f39, 1.0f - n7Var.j0, -1, canvas5);
                    canvas2 = canvas5;
                    canvas2.restore();
                } else {
                    f16 = f21;
                    f17 = f20;
                    f18 = 0.075f;
                    canvas2 = canvas3;
                }
                n7Var.invalidate();
            }
            if (!n7Var.h) {
                float f43 = n7Var.V;
                if (f43 > 0.0f) {
                    ((Paint) o3Var.e).setColor(i0.a.o(-16777216, (int) (f43 * 0.5f * 255.0f)));
                    rectF2 = rectF;
                    canvas2.drawRect(rectF2, (Paint) o3Var.e);
                }
            }
            rectF2 = rectF;
        }
        if (n7Var.f0) {
            Paint paint = n7Var.t0;
            paint.setColor(805306368);
            canvas2.drawRect(rectF2, paint);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint2 = n7Var.u0;
            paint2.setStyle(style);
            paint2.setColor(-1);
            paint2.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            paint2.setStrokeJoin(Paint.Join.ROUND);
            paint2.setStrokeCap(Paint.Cap.ROUND);
            float L5 = org.telegram.messenger.g0.L(18.0f);
            RectF rectF5 = org.telegram.messenger.g0.P;
            rectF5.set(imageReceiver.r() - L5, imageReceiver.s() - L5, imageReceiver.r() + L5, imageReceiver.s() + L5);
            float currentTimeMillis = ((System.currentTimeMillis() % 1500) / 1500.0f) * 360.0f;
            zi ziVar2 = n7Var.n;
            canvas2.drawArc(rectF5, currentTimeMillis, n7Var.v0.e(false, org.telegram.messenger.g0.T1(0.15f, 0.95f, ziVar2 != null ? ziVar2.H1() : 0.0f)) * 360.0f, false, paint2);
            n7Var.invalidate();
        }
        float f44 = imageReceiver.L0;
        float f45 = imageReceiver.M0;
        float y9 = imageReceiver.y();
        float A = imageReceiver.A();
        RectF rectF6 = n7Var.z0;
        rectF6.set(f44, f45, y9, A);
        if (n7Var.F && (drawable = org.telegram.ui.ActionBar.k6.l3) != null) {
            drawable.setBounds((int) (rectF6.left + org.telegram.messenger.g0.L(8.0f)), (int) (rectF6.top + org.telegram.messenger.g0.L(8.0f)), (int) ((org.telegram.ui.ActionBar.k6.l3.getIntrinsicWidth() * 0.75f) + rectF6.left + org.telegram.messenger.g0.L(8.0f)), (int) ((org.telegram.ui.ActionBar.k6.l3.getIntrinsicHeight() * 0.75f) + rectF6.top + org.telegram.messenger.g0.L(8.0f)));
            org.telegram.ui.ActionBar.k6.l3.draw(canvas2);
        }
        n7Var.c(canvas2, rectF6, f12);
        n7Var.f(canvas2, rectF6, f12);
        if (n7Var.h) {
            n7Var.b(canvas2, rectF6, f12);
        } else {
            n7Var.e(canvas2, rectF6, f12);
        }
        if (n7Var.x0) {
            canvas2.restore();
        }
        CheckBoxBase checkBoxBase2 = n7Var.Q;
        if (checkBoxBase2 != null) {
            float f46 = n7Var.s0 != 1 ? 0.0f : 0.0f;
            canvas2.save();
            if (n7Var.x0 && (n7Var.y0 || n7Var.D0)) {
                canvas2.translate(imageReceiver.r(), imageReceiver.s());
                if (n7Var.e == null) {
                    n7Var.e = new hn0(n7Var);
                }
                float f47 = f16;
                n7Var.e.a(canvas2, Math.max(n7Var.C0, f47) * 0.5f);
                float f48 = 1.0f - (f47 * f18);
                canvas2.scale(f48, f48);
                canvas2.translate(-imageReceiver.r(), -imageReceiver.s());
            }
            if (n7Var.s0 == 1) {
                L = ((f17 + org.telegram.messenger.g0.L(2.0f)) - org.telegram.messenger.g0.L(25.0f)) - org.telegram.messenger.g0.L(4.0f);
                f19 = org.telegram.messenger.g0.L(4.0f);
            } else if (n7Var.x0) {
                L = (f17 + org.telegram.messenger.g0.L(2.0f)) - org.telegram.messenger.g0.L((n7Var.C0 * 5.0f) + 22.0f);
                f19 = (org.telegram.messenger.g0.L(5.0f) * n7Var.C0) + org.telegram.messenger.g0.L(-2.0f);
            } else {
                L = (f17 + org.telegram.messenger.g0.L(2.0f)) - org.telegram.messenger.g0.L(25.0f);
                f19 = f46;
            }
            canvas2.translate(L, f19);
            n7Var.Q.a(canvas2);
            if (n7Var.w0 != null) {
                RectF rectF7 = org.telegram.messenger.g0.P;
                rectF7.set(L, f19, n7Var.Q.b.width() + L, n7Var.Q.b.height() + f19);
                nc ncVar = n7Var.w0;
                ncVar.i = false;
                ncVar.c = 0;
                ncVar.a(rectF7);
            }
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void e(Canvas canvas, RectF rectF, float f10) {
        Bitmap bitmap;
        if (!this.e0 || (bitmap = this.K) == null || bitmap.isRecycled()) {
            return;
        }
        int L = org.telegram.messenger.g0.L((rectF.width() / ((org.telegram.messenger.g0.L(20.0f) * this.C0) + rectF.width())) * 17.33f);
        canvas.save();
        float f11 = L;
        canvas.translate((rectF.right - f11) - org.telegram.messenger.g0.L(5.66f), rectF.top + org.telegram.messenger.g0.L(5.66f));
        if (this.L == null) {
            this.L = new Paint(3);
        }
        this.L.setAlpha((int) (f10 * 255.0f));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(0.0f, 0.0f, f11, f11);
        canvas.drawBitmap(this.K, (Rect) null, rectF2, this.L);
        canvas.restore();
    }

    public final void f(Canvas canvas, RectF rectF, float f10) {
        if (this.e0) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.R0) && this.r < 5) {
                float L = (org.telegram.messenger.g0.L(20.0f) * this.C0) + rectF.width();
                float width = rectF.width() / L;
                boolean q10 = q(L);
                float d = this.N.d(this.M);
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
                org.telegram.ui.Components.g6 g6Var = this.O;
                float c2 = g6Var.c() + L2;
                canvas.translate(q10 ? org.telegram.messenger.g0.L(5.0f) : (rectF.width() - org.telegram.messenger.g0.L(5.0f)) - c2, ((rectF.height() + org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(17.0f)) - org.telegram.messenger.g0.L(4.0f));
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(0.0f, 0.0f, c2, org.telegram.messenger.g0.L(17.0f));
                int alpha = org.telegram.ui.ActionBar.k6.i2.getAlpha();
                org.telegram.ui.ActionBar.k6.i2.setAlpha((int) (alpha * f11));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.i2);
                org.telegram.ui.ActionBar.k6.i2.setAlpha(alpha);
                canvas.save();
                float L3 = org.telegram.messenger.g0.L(3.0f);
                int L4 = org.telegram.messenger.g0.L(17.0f);
                m.o3 o3Var = this.R;
                canvas.translate(L3, (L4 - ((Drawable) o3Var.d).getBounds().height()) / 2.0f);
                ((Drawable) o3Var.d).setAlpha((int) (this.x * 255.0f * f11));
                ((Drawable) o3Var.d).draw(canvas);
                canvas.restore();
                canvas.translate(org.telegram.messenger.g0.L(22.0f), 0.0f);
                g6Var.setBounds(0, 0, (int) c2, org.telegram.messenger.g0.L(17.0f));
                g6Var.B = (int) (f11 * 255.0f);
                g6Var.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final int g(zi ziVar) {
        TL_stories.StoryItem storyItem;
        if (this.g0) {
            return 100;
        }
        if (!this.e0 || ziVar == null || (storyItem = ziVar.l) == null) {
            return -1;
        }
        if (storyItem.parsedPrivacy == null) {
            storyItem.parsedPrivacy = new gi.r8(this.f, storyItem.privacy);
        }
        int i3 = storyItem.parsedPrivacy.a;
        if (i3 == 2 || i3 == 1 || i3 == 3) {
            return i3;
        }
        return -1;
    }

    public View getCrossfadeView() {
        return this.w;
    }

    public int getMessageId() {
        zi ziVar = this.n;
        if (ziVar != null) {
            return ziVar.f1();
        }
        return 0;
    }

    public zi getMessageObject() {
        return this.n;
    }

    public int getStyle() {
        return this.s0;
    }

    public final void i(boolean z10, boolean z11) {
        int i3;
        CheckBoxBase checkBoxBase = this.Q;
        if ((checkBoxBase != null && checkBoxBase.q) == z10) {
            return;
        }
        if (checkBoxBase == null) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, null);
            this.Q = checkBoxBase2;
            checkBoxBase2.h(-1, org.telegram.ui.ActionBar.k6.zi, org.telegram.ui.ActionBar.k6.k7);
            if (this.x0 && (i3 = this.a) != 0) {
                CheckBoxBase checkBoxBase3 = this.Q;
                int w10 = org.telegram.ui.ActionBar.k6.w(i3, org.telegram.ui.ActionBar.k6.r1(0.25f, -1));
                if (checkBoxBase3.x != w10) {
                    checkBoxBase3.x = w10;
                    checkBoxBase3.b();
                }
            }
            this.Q.k(false);
            this.Q.d(1);
            this.Q.e(0, 0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            if (this.S) {
                this.Q.l = true;
            }
        }
        this.Q.f(-1, z10, z11);
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            this.B0 = null;
            valueAnimator.cancel();
        }
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C0, z10 ? 1.0f : 0.0f);
            this.B0 = ofFloat;
            ofFloat.addUpdateListener(new ei.n4(this, 7));
            this.B0.setDuration(200L);
            this.B0.addListener(new dh.x(24, this, z10));
            this.B0.start();
        } else {
            this.C0 = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void j(boolean z10, float f10) {
        if (this.y != f10) {
            this.y = f10;
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
    public final void k(zi ziVar, int i3, boolean z10) {
        String str;
        boolean z11;
        float f10;
        TLRPC.WebPage webPage;
        String str2;
        TL_stories.StoryViews storyViews;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem;
        int i10 = i3;
        if (i10 < 1) {
            i10 = 1;
        }
        int i11 = this.r;
        this.r = i10;
        zi ziVar2 = this.n;
        if (ziVar2 == null && ziVar == null) {
            return;
        }
        if (ziVar2 != null && ziVar != null && ziVar2.f1() == ziVar.f1()) {
            zi ziVar3 = this.n;
            if ((ziVar3 != null ? ziVar3.m : null) == ziVar.m) {
                if ((ziVar3 != null ? ziVar3.j : null) == ziVar.j) {
                    TLRPC.MessageMedia messageMedia = (ziVar3 == null || (storyItem = ziVar3.l) == null) ? null : storyItem.media;
                    TL_stories.StoryItem storyItem2 = ziVar.l;
                    TLRPC.MessageMedia messageMedia2 = storyItem2 == null ? null : storyItem2.media;
                    if (((messageMedia == null && messageMedia2 == null) || (messageMedia != null && messageMedia2 != null && ((document = messageMedia.document) == null ? !((photo = messageMedia.photo) == null || (photo2 = messageMedia2.photo) == null || photo2.id != photo.id) : !((document2 = messageMedia2.document) == null || document2.id != document.id)))) && i11 == i10) {
                        int i12 = this.J;
                        if ((i12 == 100) == this.g0 && i12 == g(ziVar) && !z10) {
                            return;
                        }
                    }
                }
            }
        }
        this.n = ziVar;
        this.e0 = ziVar != null && ziVar.y4();
        zi ziVar4 = this.n;
        this.f0 = (ziVar4 == null || ziVar4.m == null) ? false : true;
        p();
        org.telegram.ui.Components.g6 g6Var = this.O;
        org.telegram.ui.Components.u5 u5Var = this.N;
        ImageReceiver imageReceiver = this.b;
        ImageReceiver imageReceiver2 = this.c;
        ImageReceiver imageReceiver3 = this.d;
        if (ziVar == null) {
            imageReceiver2.R();
            imageReceiver.R();
            imageReceiver3.R();
            this.H = null;
            this.M = false;
            u5Var.e(true, 0.0f);
            g6Var.t("", false, true);
            this.G = null;
            this.E = false;
            this.F = false;
            this.d0 = false;
            this.c0 = null;
            this.J = -1;
            this.K = null;
            this.P = null;
            o();
            return;
        }
        TL_stories.StoryItem storyItem3 = ziVar.l;
        if (this.S) {
            imageReceiver2.P();
            imageReceiver.P();
            imageReceiver3.P();
        }
        ImageReceiver imageReceiver4 = z10 ? imageReceiver : imageReceiver2;
        int i13 = this.f;
        String F1 = hp.s1(i13).F1(ziVar.k.restriction_reason);
        int i14 = org.telegram.messenger.g0.q.x;
        float f11 = org.telegram.messenger.g0.p;
        int i15 = (int) ((i14 / i10) / f11);
        if (z10) {
            i15 = (((int) (i14 / f11)) * 3) / 5;
        }
        SparseArray sparseArray = (SparseArray) this.R.f;
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
        int Z0 = (i10 <= 2 || z10) ? org.telegram.messenger.g0.Z0(false) : hs.r5;
        this.H = null;
        this.G = null;
        this.E = false;
        this.F = false;
        imageReceiver2.e();
        imageReceiver.e();
        if (!this.e0 || (storyViews = storyItem3.views) == null) {
            z11 = true;
            this.M = false;
            f10 = 0.0f;
            u5Var.e(true, 0.0f);
            g6Var.t("", false, true);
        } else {
            int i16 = storyViews.views_count;
            this.M = i16 > 0;
            z11 = true;
            g6Var.t(org.telegram.messenger.g0.o0(i16, 0), false, true);
            f10 = 0.0f;
        }
        u5Var.e(z11, this.M ? 1.0f : f10);
        zi ziVar5 = ziVar.j != null ? storyItem3 : ziVar;
        if (TextUtils.isEmpty(str)) {
            if (storyItem3 == 0 || !(storyItem3.media instanceof TLRPC.TL_messageMediaUnsupported)) {
                ei.y6 y6Var = ziVar.m;
                if (y6Var == null || (str2 = y6Var.f) == null) {
                    String str4 = str3;
                    TLRPC.Document F02 = ziVar.F0();
                    TLRPC.Photo D1 = zi.D1(ziVar.k);
                    if (zi.L4(F02)) {
                        this.E = !ziVar.E3();
                        this.F = ziVar.E3();
                        if (i10 != 9 && !ziVar.E3()) {
                            this.H = org.telegram.messenger.g0.g0((int) ziVar.L0(), false, false);
                        }
                        TLRPC.MessageMedia n12 = zi.n1(ziVar);
                        if ((n12 instanceof TLRPC.TL_messageMediaDocument ? ((TLRPC.TL_messageMediaDocument) n12).video_cover : (n12 == null || (webPage = n12.webpage) == null || !webPage.video_cover_photo) ? null : webPage.photo) != null) {
                            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ziVar.n0, 50, false, null, false);
                            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(ziVar.n0, Z0, false, w10, this.e0);
                            if (w11 == w10) {
                                w10 = null;
                            }
                            if (ziVar.G1 != null) {
                                imageReceiver4.r0(ac.f(w11, ziVar.l0), str4, null, null, ziVar.G1, w11 != null ? w11.size : 0L, null, ziVar5, zi.S5(ziVar.k) ? 2 : 1);
                            } else {
                                imageReceiver4.r0(ac.f(w11, ziVar.l0), str4, ac.f(w10, ziVar.l0), t4.c.q(str4, "_b"), null, w11 != null ? w11.size : 0L, null, ziVar5, zi.S5(ziVar.k) ? 2 : 1);
                            }
                        } else {
                            TLRPC.Document F03 = ziVar.F0();
                            TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(F03.thumbs, 50, false, null, false);
                            TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(F03.thumbs, Z0, false, null, this.e0);
                            if (w12 == w13 && !this.e0) {
                                w13 = null;
                            }
                            if (w12 != null) {
                                if (ziVar.G1 != null) {
                                    imageReceiver4.q0(ac.c(w13, F03), str4, ziVar.G1, null, ziVar5, 0);
                                } else {
                                    imageReceiver4.r0(ac.c(w13, F03), str4, ac.c(w12, F03), t4.c.q(str4, "_b"), null, 0L, null, ziVar5, 0);
                                }
                            }
                        }
                    } else if (D1 != null && !ziVar.n0.isEmpty()) {
                        if (!ziVar.x0) {
                            if (System.currentTimeMillis() - F0 > 5000) {
                                F0 = System.currentTimeMillis();
                                G0 = org.telegram.messenger.z5.q(i13).d(ziVar);
                            }
                            if (!G0 && !this.e0) {
                                BitmapDrawable bitmapDrawable = ziVar.G1;
                                if (bitmapDrawable != null) {
                                    imageReceiver4.r0(null, null, null, null, bitmapDrawable, 0L, null, ziVar5, 0);
                                } else {
                                    imageReceiver4.r0(null, null, ac.f(org.telegram.messenger.w7.w(ziVar.n0, 50, false, null, false), ziVar.l0), "b", null, 0L, null, ziVar5, 0);
                                }
                            }
                        }
                        TLRPC.PhotoSize w14 = org.telegram.messenger.w7.w(ziVar.n0, 50, false, null, false);
                        TLRPC.PhotoSize w15 = org.telegram.messenger.w7.w(ziVar.n0, Z0, false, w14, this.e0);
                        if (w15 == w14) {
                            w14 = null;
                        }
                        if (ziVar.G1 != null) {
                            imageReceiver4.r0(ac.f(w15, ziVar.l0), str4, null, null, ziVar.G1, w15 != null ? w15.size : 0L, null, ziVar5, zi.S5(ziVar.k) ? 2 : 1);
                        } else {
                            imageReceiver4.r0(ac.f(w15, ziVar.l0), str4, z10 ? null : ac.f(w14, ziVar.l0), t4.c.q(str4, "_b"), null, w15 != null ? w15.size : 0L, null, ziVar5, zi.S5(ziVar.k) ? 2 : 1);
                        }
                    }
                } else {
                    imageReceiver4.q0(ac.g(str2), str3, null, null, ziVar5, 0);
                }
            } else {
                storyItem3.dialogId = zi.B0(ziVar.k);
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
                imageReceiver4.a(new ei.w9(storyItem3));
            }
            setPrivacyType(g(ziVar));
            if (this.h) {
                long B0 = zi.B0(ziVar.k);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                spannableStringBuilder.append((CharSequence) hp.s1(i13).B1(B0, false));
                org.telegram.ui.h5 h5Var = new org.telegram.ui.h5(i10 == 2 ? 16.0f : 13.66f, i13, this);
                h5Var.c(B0);
                spannableStringBuilder.setSpan(h5Var, 0, 1, 33);
                this.P = new ly0(spannableStringBuilder, i10 == 2 ? 14.0f : 10.1666f, org.telegram.messenger.g0.o());
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
        setPrivacyType(g(ziVar));
        if (this.h) {
        }
        o();
        invalidate();
    }

    public final void l(boolean z10, boolean z11) {
        if (this.D0 == z10) {
            return;
        }
        this.D0 = z10;
        if (!z11) {
            this.E0.a(z10);
        }
        invalidate();
    }

    public final void m(String str, boolean z10) {
        this.H = str;
        this.E = true;
        this.F = false;
        StaticLayout staticLayout = this.G;
        if (staticLayout != null && !staticLayout.getText().toString().equals(str)) {
            this.G = null;
        }
        this.I = z10;
    }

    public final void n(float f10, float f11) {
        this.k0 = f10;
        this.l0 = f11;
        this.m0 = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) be.a(this.m0 * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(xq.j);
        duration.addUpdateListener(new r(this, 5));
        duration.addListener(new ii.v3(this, 29));
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
        int i3;
        TL_stories.StoryViews storyViews;
        try {
            zi ziVar = this.n;
            if (ziVar == null) {
                setContentDescription(null);
                return;
            }
            TL_stories.StoryItem storyItem2 = ziVar.l;
            boolean y42 = ziVar.y4();
            StringBuilder sb2 = new StringBuilder();
            if (y42 && this.g0) {
                sb2.append(bd.M0(2131754753, null));
            }
            if (!ziVar.E3()) {
                if (ziVar.i4()) {
                    M0 = bd.M0(2131754782, null);
                    L0 = ziVar.L0();
                } else {
                    if (!zi.M4(ziVar.k)) {
                        TLRPC.MessageMedia o12 = zi.o1(ziVar.k);
                        if (o12 != null && (storyItem = o12.storyItem) != null && (messageMedia = storyItem.media) != null) {
                            L4 = zi.L4(messageMedia.document);
                            if (L4) {
                                M02 = bd.M0(2131753948, null);
                            }
                        }
                        L4 = false;
                        if (L4) {
                        }
                    }
                    M0 = bd.M0(2131753933, null);
                    L0 = ziVar.L0();
                }
                String str = M0;
                i3 = (int) L0;
                M02 = str;
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(M02);
                if (i3 > 0) {
                    sb2.append(", ");
                    sb2.append(bd.z(i3));
                }
                if (y42 && storyItem2 != null) {
                    storyViews = storyItem2.views;
                    if (storyViews != null && storyViews.views_count > 0) {
                        sb2.append(", ");
                        sb2.append(bd.G(storyItem2.views.views_count, "Views", new Object[0]));
                    }
                    if (storyItem2.date > 0) {
                        sb2.append(", ");
                        sb2.append(bd.a0(null, null, 2131754803, bd.s(storyItem2.date, false)));
                    }
                }
                setContentDescription(sb2.toString());
            }
            M02 = bd.M0(2131754848, null);
            i3 = 0;
            if (sb2.length() > 0) {
            }
            sb2.append(M02);
            if (i3 > 0) {
            }
            if (y42) {
                storyViews = storyItem2.views;
                if (storyViews != null) {
                    sb2.append(", ");
                    sb2.append(bd.G(storyItem2.views.views_count, "Views", new Object[0]));
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
        this.S = true;
        CheckBoxBase checkBoxBase = this.Q;
        if (checkBoxBase != null) {
            checkBoxBase.l = true;
        }
        if (this.n != null) {
            this.c.P();
            this.b.P();
            this.d.P();
        }
        yh.e eVar = this.n0;
        if (eVar != null) {
            if (eVar.i) {
                this.n0 = yh.e.e(this);
            } else {
                eVar.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.S = false;
        CheckBoxBase checkBoxBase = this.Q;
        if (checkBoxBase != null) {
            checkBoxBase.l = false;
        }
        if (this.n != null) {
            this.c.R();
            this.b.R();
            this.d.R();
        }
        yh.e eVar = this.n0;
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
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        boolean z10 = this.e0;
        int i11 = z10 ? (int) (size * 1.25f) : size;
        if (z10 && this.r == 1) {
            i11 /= 2;
        }
        setMeasuredDimension(size, i11);
        p();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        nc ncVar = this.w0;
        if (ncVar == null || !ncVar.b(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void p() {
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            return;
        }
        zi ziVar = this.n;
        if (ziVar != null && ziVar.u2()) {
            if (this.n0 == null) {
                this.n0 = yh.e.e(this);
            }
        } else {
            yh.e eVar = this.n0;
            if (eVar != null) {
                eVar.b(this);
                this.n0 = null;
            }
        }
    }

    public final boolean q(float f10) {
        int i3;
        if (this.e0 && this.r < 5) {
            int L = org.telegram.messenger.g0.L(26.0f) + ((int) this.O.c());
            if (this.E) {
                int L2 = org.telegram.messenger.g0.L(8.0f);
                StaticLayout staticLayout = this.G;
                i3 = L2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.I ? org.telegram.messenger.g0.L(10.0f) : 0);
            } else {
                i3 = 0;
            }
            if (L + ((L <= 0 || i3 <= 0) ? 0 : org.telegram.messenger.g0.L(8.0f)) + i3 > f10) {
                return true;
            }
        }
        return false;
    }

    public void setGradientView(iz izVar) {
        this.s = izVar;
    }

    public void setHighlightProgress(float f10) {
        if (this.V != f10) {
            this.V = f10;
            invalidate();
        }
    }

    public void setReorder(boolean z10) {
        this.y0 = z10;
        invalidate();
    }

    public void setStyle(int i3) {
        if (this.s0 == i3) {
            return;
        }
        this.s0 = i3;
        if (i3 == 1) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(21, this, null);
            this.Q = checkBoxBase;
            checkBoxBase.h(-1, org.telegram.ui.ActionBar.k6.zi, org.telegram.ui.ActionBar.k6.k7);
            this.Q.k(true);
            this.Q.d(0);
            this.Q.e(0, 0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            if (this.S) {
                this.Q.l = true;
            }
            nc ncVar = new nc(this);
            this.w0 = ncVar;
            ncVar.h = new f(this, 7);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.O == drawable || super.verifyDrawable(drawable);
    }

    public void h() {
    }
}
