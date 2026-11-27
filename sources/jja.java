// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class jja extends FrameLayout {
    public static long F0;
    public static boolean G0;
    public Path A0;
    public ValueAnimator B0;
    public float C0;
    public boolean D0;
    public boolean E;
    public final mm E0;
    public boolean F;
    public StaticLayout G;
    public String H;
    public boolean I;
    public int J;
    public Bitmap K;
    public Paint L;
    public boolean M;
    public final mm N;
    public final hn O;
    public pkb P;
    public CheckBoxBase Q;
    public final gd4 R;
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
    public tca e;
    public boolean e0;
    public final int f;
    public boolean f0;
    public boolean g0;
    public boolean h;
    public final Path h0;
    public npa i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public r47 n;
    public mpa n0;
    public final Path o0;
    public pkb p0;
    public pkb q0;
    public int r;
    public pkb r0;
    public tk4 s;
    public int s0;
    public final Paint t0;
    public final Paint u0;
    public final mm v0;
    public jja w;
    public za1 w0;
    public float x;
    public boolean x0;
    public float y;
    public boolean y0;
    public final RectF z0;

    public jja(Context context, gd4 gd4Var, int i) {
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
        k43 k43Var = k43.h;
        this.N = new mm(this, 0L, 350L, k43Var);
        hn hnVar = new hn(false, true, true);
        this.O = hnVar;
        this.h0 = new Path();
        this.o0 = new Path();
        this.s0 = 0;
        this.t0 = new Paint(1);
        this.u0 = new Paint(1);
        this.v0 = new mm(this, 0L, 200L, k43Var);
        this.z0 = new RectF();
        this.E0 = new mm(this, 0L, 320L, k43Var);
        this.R = gd4Var;
        this.f = i;
        i(false, false);
        imageReceiver2.p0(this);
        imageReceiver.p0(this);
        imageReceiver3.p0(this);
        imageReceiver2.h1 = new hja(this, (byte) 0);
        hnVar.setCallback(this);
        hnVar.w(hl.L(12.0f));
        hnVar.u(-1);
        hnVar.x(hl.o());
        hnVar.N = hl.q.x;
        setWillNotDraw(false);
    }

    private float getPadding() {
        if (this.T != 0.0f) {
            float f = this.U;
            if (f == 9.0f || this.r == 9) {
                if (f == 9.0f) {
                    return qd4.A(1.0f, this.T, hl.N(2.0f), hl.N(1.0f) * this.T);
                }
                return qd4.A(1.0f, this.T, hl.N(1.0f), hl.N(2.0f) * this.T);
            }
        }
        return this.r == 9 ? hl.N(1.0f) : hl.N(2.0f);
    }

    private void setPrivacyType(int i) {
        if (this.J == i) {
            return;
        }
        this.J = i;
        this.K = null;
        int i2 = i != 1 ? i != 2 ? i != 3 ? i != 100 ? 0 : R.drawable.msg_pin_mini : R.drawable.msg_folders_groups : R.drawable.msg_folders_private : R.drawable.msg_stories_closefriends;
        if (i2 != 0) {
            Context context = getContext();
            HashMap hashMap = (HashMap) this.R.g;
            Bitmap bitmap = (Bitmap) hashMap.get(Integer.valueOf(i2));
            if (bitmap == null) {
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i2);
                int width = decodeResource.getWidth();
                int height = decodeResource.getHeight();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                paint.setColorFilter(new PorterDuffColorFilter(-10461088, mode));
                canvas.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                Utilities.stackBlurBitmap(createBitmap, hl.L(1.0f));
                Bitmap createBitmap2 = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight(), config);
                Canvas canvas2 = new Canvas(createBitmap2);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
                canvas2.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                createBitmap.recycle();
                decodeResource.recycle();
                hashMap.put(Integer.valueOf(i2), createBitmap2);
                bitmap = createBitmap2;
            }
            this.K = bitmap;
        }
        invalidate();
    }

    public final void a(Canvas canvas, float f, float f2, float f3) {
        canvas.save();
        Path path = this.A0;
        if (path == null) {
            path = new Path();
            this.A0 = path;
        }
        path.rewind();
        RectF rectF = hl.P;
        rectF.set(0.0f, 0.0f, f, f2);
        float L = hl.L(12.0f) * f3;
        this.A0.addRoundRect(rectF, L, L, Path.Direction.CW);
        this.A0.close();
        canvas.clipPath(this.A0);
        canvas.scale(f / getWidth(), f2 / getHeight());
        boolean C = this.b.C();
        if (!C || f3 < 1.0f) {
            float f4 = 1.0f - f3;
            d(f4, 1.0f, f4, canvas, false);
        }
        if (C && f3 > 0.0f) {
            d(1.0f - f3, f3, 0.0f, canvas, true);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas, RectF rectF, float f) {
        if (this.e0) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.R0) && this.h && this.P != null) {
                float L = hl.L(5.33f);
                pkb pkbVar = this.P;
                pkbVar.p = (int) (rectF.width() - (2.0f * L));
                pkbVar.t = hl.L(14.0f);
                pkbVar.a.setShadowLayer(hl.L(1.0f), 0.0f, hl.L(0.66f), aob.p1(0.4f * f, -16777216));
                pkbVar.c(rectF.left + L, rectF.top + hl.L(this.r <= 2 ? 15.0f : 11.33f), 1.0f, aob.p1(f, -1), canvas);
            }
        }
    }

    public final void c(Canvas canvas, RectF rectF, float f) {
        String str;
        float f2 = f;
        if (this.E) {
            ImageReceiver imageReceiver = this.c;
            if (imageReceiver == null || imageReceiver.R0) {
                float L = (hl.L(20.0f) * this.C0) + rectF.width();
                float width = rectF.width() / L;
                if (f2 < 1.0f) {
                    f2 = (float) Math.pow(f2, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i = this.r;
                gd4 gd4Var = this.R;
                if (i != 9 && this.G == null && (str = this.H) != null) {
                    this.G = new StaticLayout(this.H, (TextPaint) gd4Var.a, (int) Math.ceil(((TextPaint) gd4Var.a).measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i >= 9 || this.H == null) && this.G != null) {
                    this.G = null;
                }
                boolean q = q(L);
                int L2 = hl.L(8.0f);
                StaticLayout staticLayout = this.G;
                int width2 = L2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.I ? hl.L(10.0f) : 0);
                canvas.translate(hl.L(5.0f), (((rectF.height() + hl.L(1.0f)) - hl.L(17.0f)) - hl.L(4.0f)) - (q ? hl.L(22.0f) : 0));
                RectF rectF2 = hl.P;
                rectF2.set(0.0f, 0.0f, width2, hl.L(17.0f));
                int alpha = aob.i2.getAlpha();
                aob.i2.setAlpha((int) (alpha * f2));
                canvas.drawRoundRect(rectF2, hl.L(4.0f), hl.L(4.0f), aob.i2);
                aob.i2.setAlpha(alpha);
                if (this.I) {
                    canvas.save();
                    float L3 = this.G == null ? hl.L(5.0f) : hl.L(4.0f);
                    int L4 = hl.L(17.0f);
                    Drawable drawable = (Drawable) gd4Var.c;
                    Drawable drawable2 = (Drawable) gd4Var.c;
                    canvas.translate(L3, (L4 - drawable.getIntrinsicHeight()) / 2.0f);
                    drawable2.setAlpha((int) (this.x * 255.0f * f2));
                    drawable2.draw(canvas);
                    canvas.restore();
                }
                if (this.G != null) {
                    canvas.translate(hl.L((this.I ? 10 : 0) + 4), (hl.L(17.0f) - this.G.getHeight()) / 2.0f);
                    TextPaint textPaint = (TextPaint) gd4Var.a;
                    TextPaint textPaint2 = (TextPaint) gd4Var.a;
                    int alpha2 = textPaint.getAlpha();
                    textPaint2.setAlpha((int) (alpha2 * f2));
                    this.G.draw(canvas);
                    textPaint2.setAlpha(alpha2);
                }
                canvas.restore();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x05fc, code lost:
    
        if (r0.getProgress() != 0.0f) goto L191;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(float f, float f2, float f3, Canvas canvas, boolean z) {
        float f4;
        float f5;
        boolean z2;
        RectF rectF;
        Canvas canvas2;
        float f6;
        float f7;
        float f8;
        ImageReceiver imageReceiver;
        float f9;
        RectF rectF2;
        jja jjaVar;
        float L;
        float f10;
        Drawable drawable;
        float f11;
        Canvas canvas3;
        float f12;
        int i;
        int i2;
        int i3;
        int i4;
        tk4 tk4Var;
        float padding = getPadding() * f;
        float f13 = this.W ? padding : 0.0f;
        float d = this.E0.d(this.D0);
        float measuredWidth = ((getMeasuredWidth() - f13) - padding) * this.y;
        float measuredHeight = ((getMeasuredHeight() - 0.0f) - padding) * this.y;
        ImageReceiver imageReceiver2 = z ? this.b : this.c;
        imageReceiver2.setAlpha(f2);
        RectF rectF3 = imageReceiver2.Q0;
        if (this.T > 0.5f && this.U != 9.0f && this.r != 9) {
            float f14 = f * 2.0f;
            measuredWidth -= f14;
            measuredHeight -= f14;
        }
        if ((this.n != null || this.s0 == 1) && imageReceiver2.B() && imageReceiver2.i1 == 1.0f && this.x == 1.0f) {
            f4 = 1.0f;
            f5 = 0.0f;
            z2 = true;
        } else {
            if (getParent() == null || (tk4Var = this.s) == null) {
                f4 = 1.0f;
                f5 = 0.0f;
                z2 = true;
            } else {
                int measuredWidth2 = ((View) getParent()).getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                float f15 = -getX();
                tk4Var.P = measuredWidth2;
                tk4Var.Q = measuredHeight2;
                tk4Var.R = f15;
                this.s.updateColors();
                this.s.f();
                float f16 = (this.T <= 0.5f || this.U == 9.0f || this.r == 9) ? 0.0f : 1.0f;
                float f17 = f13 + f16;
                float f18 = f16 + padding;
                f4 = 1.0f;
                f5 = 0.0f;
                z2 = true;
                canvas.drawRect(f17, f18, f17 + measuredWidth, f18 + measuredHeight, this.s.getPaint());
            }
            invalidate();
        }
        float f19 = this.x;
        if (f19 != f4) {
            rectF = rectF3;
            canvas.saveLayerAlpha(0.0f, 0.0f, f13 + padding + measuredWidth, padding + f5 + measuredHeight, (int) (f19 * 255.0f), 31);
        } else {
            rectF = rectF3;
            canvas.save();
        }
        CheckBoxBase checkBoxBase = this.Q;
        gd4 gd4Var = this.R;
        if (((checkBoxBase == null || !checkBoxBase.q) && !PhotoViewer.P0(this.n)) || this.x0) {
            canvas2 = canvas;
            f6 = f13;
        } else {
            canvas2 = canvas;
            f6 = f13;
            canvas2.drawRect(f6, 0.0f, (f13 + measuredWidth) - padding, (measuredHeight + f5) - padding, (Paint) gd4Var.b);
        }
        boolean z3 = this.e0;
        ImageReceiver imageReceiver3 = this.d;
        if (z3 && this.r == z2) {
            float height = getHeight() * 0.72f;
            GradientDrawable gradientDrawable = this.c0;
            if (gradientDrawable != null) {
                gradientDrawable.setBounds(0, 0, getWidth(), getHeight());
                this.c0.draw(canvas2);
            } else if (!this.d0 && imageReceiver2.n() != null) {
                this.d0 = z2;
                Bitmap n = imageReceiver2.n();
                boolean o = aob.I.o();
                if (n == null) {
                    int[] iArr = {0, 0};
                    if (this.d0) {
                        this.c0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
                        invalidate();
                        this.d0 = false;
                    }
                } else {
                    int[] b = bje.b(n, o);
                    if (this.d0) {
                        this.c0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, b);
                        invalidate();
                        this.d0 = false;
                    }
                }
            }
            imageReceiver2.i0((measuredWidth - height) / 2.0f, f5, height, getHeight());
        } else if (this.C0 > f5) {
            float L2 = hl.L(this.x0 ? 7.0f : 10.0f) * this.C0;
            float f20 = f6 + L2;
            float f21 = padding + L2;
            float f22 = L2 * 2.0f;
            float f23 = measuredWidth - f22;
            float f24 = measuredHeight - f22;
            imageReceiver2.i0(f20, f21, f23, f24);
            imageReceiver3.i0(f20, f21, f23, f24);
        } else {
            float f25 = (this.T <= 0.5f || this.U == 9.0f || this.r == 9) ? 0.0f : f4;
            float f26 = f6 + f25;
            float f27 = f25 + padding;
            imageReceiver2.i0(f26, f27, measuredWidth, measuredHeight);
            imageReceiver3.i0(f26, f27, measuredWidth, measuredHeight);
        }
        imageReceiver2.r0(hl.U1(this.C0, (this.W && this.b0) ? hl.L(18.0f) : hl.L(f4), hl.L(8.0f)), hl.U1(this.C0, (this.a0 && this.b0) ? hl.L(18.0f) : hl.L(f4), hl.L(8.0f)), hl.U1(this.C0, hl.L(f4), hl.L(8.0f)), hl.U1(this.C0, hl.L(f4), hl.L(8.0f)));
        if (this.x0) {
            canvas2.save();
            if (this.y0 || this.D0) {
                canvas2.translate(imageReceiver2.r(), imageReceiver2.s());
                tca tcaVar = this.e;
                if (tcaVar == null) {
                    tcaVar = new tca(this);
                    this.e = tcaVar;
                }
                tcaVar.a(canvas2, Math.max(this.C0, d));
                float f28 = f4 - (d * 0.075f);
                canvas2.scale(f28, f28);
                canvas2.translate(-imageReceiver2.r(), -imageReceiver2.s());
            }
        }
        if (PhotoViewer.P0(this.n)) {
            f7 = d;
            f8 = measuredWidth;
            imageReceiver = imageReceiver2;
            f9 = 0.075f;
            rectF2 = rectF;
            jjaVar = this;
        } else {
            imageReceiver2.h(canvas2, null);
            r47 r47Var = this.n;
            if (r47Var == null || !r47Var.t2() || this.n.P0) {
                f7 = d;
                f8 = measuredWidth;
                imageReceiver = imageReceiver2;
                f9 = 0.075f;
                jjaVar = this;
            } else {
                canvas2.save();
                canvas2.clipRect(f6, 0.0f, (f6 + measuredWidth) - padding, (measuredHeight + 0.0f) - padding);
                if (this.j0 != 0.0f) {
                    Path path = this.h0;
                    path.rewind();
                    path.addCircle(this.k0, this.l0, this.m0 * this.j0, Path.Direction.CW);
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                }
                imageReceiver3.h(canvas2, null);
                if (this.n0 != null) {
                    canvas2.clipRect(imageReceiver2.L0, imageReceiver2.M0, imageReceiver2.w(), imageReceiver2.x());
                    f11 = measuredWidth;
                    imageReceiver = imageReceiver2;
                    Canvas canvas4 = canvas2;
                    f12 = d;
                    this.n0.c(canvas4, this, (int) imageReceiver2.N0, (int) imageReceiver2.O0, 1.0f, false);
                    canvas3 = canvas4;
                    jjaVar = this;
                } else {
                    f11 = measuredWidth;
                    imageReceiver = imageReceiver2;
                    canvas3 = canvas2;
                    jjaVar = this;
                    f12 = d;
                    npa npaVar = jjaVar.i0;
                    if (npaVar == null) {
                        npaVar = new npa();
                        jjaVar.i0 = npaVar;
                    }
                    npaVar.h(vm2.o(-1, 82));
                    jjaVar.i0.setBounds((int) imageReceiver.L0, (int) imageReceiver.M0, (int) imageReceiver.w(), (int) imageReceiver.x());
                    jjaVar.i0.draw(canvas3);
                }
                canvas3.restore();
                if (jjaVar.n.o4()) {
                    pkb pkbVar = jjaVar.p0;
                    if (pkbVar == null) {
                        f9 = 0.075f;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ".concat(ob6.M0(2131748239, null)));
                        i = 1;
                        spannableStringBuilder.setSpan(new wm2(R.drawable.filled_sensitive, 0), 0, 1, 33);
                        pkb pkbVar2 = new pkb(spannableStringBuilder, 14.0f, hl.n1("fonts/rmedium.ttf"));
                        jjaVar.p0 = pkbVar2;
                        pkbVar = pkbVar2;
                    } else {
                        f9 = 0.075f;
                        i = 1;
                    }
                    if (f11 >= (hl.L(13.0f) << i) + pkbVar.c || (pkbVar = jjaVar.q0) != null) {
                        i2 = 1;
                    } else {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ".concat(ob6.M0(2131748238, null)));
                        i2 = 1;
                        spannableStringBuilder2.setSpan(new wm2(R.drawable.filled_sensitive, 0), 0, 1, 33);
                        pkb pkbVar3 = new pkb(spannableStringBuilder2, 14.0f, hl.n1("fonts/rmedium.ttf"));
                        jjaVar.q0 = pkbVar3;
                        pkbVar = pkbVar3;
                    }
                    if (f11 < (hl.L(26.0f) << i2) + pkbVar.c) {
                        pkbVar = jjaVar.r0;
                        if (pkbVar == null) {
                            pkb pkbVar4 = new pkb(new SpannableStringBuilder(ob6.M0(2131748238, null)), 13.0f, hl.n1("fonts/rmedium.ttf"));
                            jjaVar.r0 = pkbVar4;
                            pkbVar = pkbVar4;
                        }
                        i3 = 10;
                        i4 = 28;
                    } else {
                        i3 = 13;
                        i4 = 32;
                    }
                    float f29 = (imageReceiver.N0 / 2.0f) + imageReceiver.L0;
                    float f30 = (imageReceiver.O0 / 2.0f) + imageReceiver.M0;
                    float L3 = pkbVar.c + hl.L(i3 << 1);
                    float L4 = hl.L(i4) / 2.0f;
                    pkb pkbVar5 = pkbVar;
                    float R1 = hl.R1(0.8f, f4, f4 - jjaVar.j0);
                    RectF rectF4 = hl.P;
                    float f31 = L3 / 2.0f;
                    float f32 = f31 * R1;
                    float f33 = L4 * R1;
                    f8 = f11;
                    f7 = f12;
                    rectF4.set(f29 - f32, f30 - f33, f32 + f29, f30 + f33);
                    Path path2 = jjaVar.o0;
                    path2.reset();
                    path2.addRoundRect(rectF4, L4, L4, Path.Direction.CW);
                    canvas3.save();
                    canvas3.clipPath(path2);
                    float alpha = imageReceiver3.getAlpha();
                    imageReceiver3.setAlpha((1.0f - jjaVar.j0) * alpha);
                    imageReceiver3.h(canvas3, null);
                    imageReceiver3.setAlpha(alpha);
                    canvas3.restore();
                    Paint T0 = aob.T0("paintChatTimeBackground");
                    int alpha2 = T0.getAlpha();
                    T0.setAlpha((int) qd4.z(1.0f, jjaVar.j0, alpha2, 0.35f));
                    canvas3.drawRoundRect(rectF4, L4, L4, T0);
                    T0.setAlpha(alpha2);
                    canvas3.save();
                    canvas3.scale(R1, R1, f29, f30);
                    Canvas canvas5 = canvas3;
                    pkbVar5.c(hl.L(i3) + (f29 - f31), f30, 1.0f - jjaVar.j0, -1, canvas5);
                    canvas2 = canvas5;
                    canvas2.restore();
                } else {
                    f7 = f12;
                    f8 = f11;
                    f9 = 0.075f;
                    canvas2 = canvas3;
                }
                jjaVar.invalidate();
            }
            if (!jjaVar.h) {
                float f34 = jjaVar.V;
                if (f34 > 0.0f) {
                    ((Paint) gd4Var.e).setColor(vm2.o(-16777216, (int) (f34 * 0.5f * 255.0f)));
                    rectF2 = rectF;
                    canvas2.drawRect(rectF2, (Paint) gd4Var.e);
                }
            }
            rectF2 = rectF;
        }
        if (jjaVar.f0) {
            Paint paint = jjaVar.t0;
            paint.setColor(805306368);
            canvas2.drawRect(rectF2, paint);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint2 = jjaVar.u0;
            paint2.setStyle(style);
            paint2.setColor(-1);
            paint2.setStrokeWidth(hl.L(3.0f));
            paint2.setStrokeJoin(Paint.Join.ROUND);
            paint2.setStrokeCap(Paint.Cap.ROUND);
            float L5 = hl.L(18.0f);
            RectF rectF5 = hl.P;
            rectF5.set(imageReceiver.r() - L5, imageReceiver.s() - L5, imageReceiver.r() + L5, imageReceiver.s() + L5);
            float currentTimeMillis = ((System.currentTimeMillis() % 1500) / 1500.0f) * 360.0f;
            r47 r47Var2 = jjaVar.n;
            canvas2.drawArc(rectF5, currentTimeMillis, jjaVar.v0.e(false, hl.R1(0.15f, 0.95f, r47Var2 != null ? r47Var2.G1() : 0.0f)) * 360.0f, false, paint2);
            jjaVar.invalidate();
        }
        float f35 = imageReceiver.L0;
        float f36 = imageReceiver.M0;
        float w = imageReceiver.w();
        float x = imageReceiver.x();
        RectF rectF6 = jjaVar.z0;
        rectF6.set(f35, f36, w, x);
        if (jjaVar.F && (drawable = aob.l3) != null) {
            drawable.setBounds((int) (rectF6.left + hl.L(8.0f)), (int) (rectF6.top + hl.L(8.0f)), (int) ((aob.l3.getIntrinsicWidth() * 0.75f) + rectF6.left + hl.L(8.0f)), (int) ((aob.l3.getIntrinsicHeight() * 0.75f) + rectF6.top + hl.L(8.0f)));
            aob.l3.draw(canvas2);
        }
        jjaVar.c(canvas2, rectF6, f3);
        jjaVar.f(canvas2, rectF6, f3);
        if (jjaVar.h) {
            jjaVar.b(canvas2, rectF6, f3);
        } else {
            jjaVar.e(canvas2, rectF6, f3);
        }
        if (jjaVar.x0) {
            canvas2.restore();
        }
        CheckBoxBase checkBoxBase2 = jjaVar.Q;
        if (checkBoxBase2 != null) {
            float f37 = jjaVar.s0 != 1 ? 0.0f : 0.0f;
            canvas2.save();
            if (jjaVar.x0 && (jjaVar.y0 || jjaVar.D0)) {
                canvas2.translate(imageReceiver.r(), imageReceiver.s());
                tca tcaVar2 = jjaVar.e;
                if (tcaVar2 == null) {
                    tcaVar2 = new tca(jjaVar);
                    jjaVar.e = tcaVar2;
                }
                float f38 = f7;
                tcaVar2.a(canvas2, Math.max(jjaVar.C0, f38) * 0.5f);
                float f39 = 1.0f - (f38 * f9);
                canvas2.scale(f39, f39);
                canvas2.translate(-imageReceiver.r(), -imageReceiver.s());
            }
            if (jjaVar.s0 == 1) {
                L = ((f8 + hl.L(2.0f)) - hl.L(25.0f)) - hl.L(4.0f);
                f10 = hl.L(4.0f);
            } else if (jjaVar.x0) {
                L = (f8 + hl.L(2.0f)) - hl.L((jjaVar.C0 * 5.0f) + 22.0f);
                f10 = (hl.L(5.0f) * jjaVar.C0) + hl.L(-2.0f);
            } else {
                L = (f8 + hl.L(2.0f)) - hl.L(25.0f);
                f10 = f37;
            }
            canvas2.translate(L, f10);
            jjaVar.Q.a(canvas2);
            if (jjaVar.w0 != null) {
                RectF rectF7 = hl.P;
                rectF7.set(L, f10, jjaVar.Q.b.width() + L, jjaVar.Q.b.height() + f10);
                za1 za1Var = jjaVar.w0;
                za1Var.i = false;
                za1Var.c = 0;
                za1Var.a(rectF7);
            }
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void e(Canvas canvas, RectF rectF, float f) {
        Bitmap bitmap;
        if (!this.e0 || (bitmap = this.K) == null || bitmap.isRecycled()) {
            return;
        }
        int L = hl.L((rectF.width() / ((hl.L(20.0f) * this.C0) + rectF.width())) * 17.33f);
        canvas.save();
        float f2 = L;
        canvas.translate((rectF.right - f2) - hl.L(5.66f), rectF.top + hl.L(5.66f));
        Paint paint = this.L;
        if (paint == null) {
            paint = new Paint(3);
            this.L = paint;
        }
        paint.setAlpha((int) (f * 255.0f));
        RectF rectF2 = hl.P;
        rectF2.set(0.0f, 0.0f, f2, f2);
        canvas.drawBitmap(this.K, (Rect) null, rectF2, this.L);
        canvas.restore();
    }

    public final void f(Canvas canvas, RectF rectF, float f) {
        if (this.e0) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.R0) && this.r < 5) {
                float L = (hl.L(20.0f) * this.C0) + rectF.width();
                float width = rectF.width() / L;
                boolean q = q(L);
                float d = this.N.d(this.M);
                float f2 = f * d;
                if (f2 < 1.0f) {
                    f2 = (float) Math.pow(f2, 8.0d);
                }
                if (d > 0.0f) {
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    canvas.scale(width, width, q ? 0.0f : rectF.width(), rectF.height());
                    canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                    float L2 = hl.L(26.0f);
                    hn hnVar = this.O;
                    float c = hnVar.c() + L2;
                    canvas.translate(q ? hl.L(5.0f) : (rectF.width() - hl.L(5.0f)) - c, ((rectF.height() + hl.L(1.0f)) - hl.L(17.0f)) - hl.L(4.0f));
                    RectF rectF2 = hl.P;
                    rectF2.set(0.0f, 0.0f, c, hl.L(17.0f));
                    int alpha = aob.i2.getAlpha();
                    aob.i2.setAlpha((int) (alpha * f2));
                    canvas.drawRoundRect(rectF2, hl.L(4.0f), hl.L(4.0f), aob.i2);
                    aob.i2.setAlpha(alpha);
                    canvas.save();
                    float L3 = hl.L(3.0f);
                    int L4 = hl.L(17.0f);
                    gd4 gd4Var = this.R;
                    Drawable drawable = (Drawable) gd4Var.d;
                    Drawable drawable2 = (Drawable) gd4Var.d;
                    canvas.translate(L3, (L4 - drawable.getBounds().height()) / 2.0f);
                    drawable2.setAlpha((int) (this.x * 255.0f * f2));
                    drawable2.draw(canvas);
                    canvas.restore();
                    canvas.translate(hl.L(22.0f), 0.0f);
                    hnVar.setBounds(0, 0, (int) c, hl.L(17.0f));
                    hnVar.C = (int) (f2 * 255.0f);
                    hnVar.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final int g(r47 r47Var) {
        TL_stories.StoryItem storyItem;
        if (this.g0) {
            return 100;
        }
        if (!this.e0 || r47Var == null || (storyItem = r47Var.l) == null) {
            return -1;
        }
        u9b u9bVar = storyItem.parsedPrivacy;
        if (u9bVar == null) {
            u9bVar = new u9b(this.f, storyItem.privacy);
            storyItem.parsedPrivacy = u9bVar;
        }
        int i = u9bVar.a;
        if (i == 2 || i == 1 || i == 3) {
            return i;
        }
        return -1;
    }

    public View getCrossfadeView() {
        return this.w;
    }

    public int getMessageId() {
        r47 r47Var = this.n;
        if (r47Var != null) {
            return r47Var.e1();
        }
        return 0;
    }

    public r47 getMessageObject() {
        return this.n;
    }

    public int getStyle() {
        return this.s0;
    }

    public final void i(boolean z, boolean z2) {
        int i;
        CheckBoxBase checkBoxBase = this.Q;
        if ((checkBoxBase != null && checkBoxBase.q) == z) {
            return;
        }
        if (checkBoxBase == null) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, null, this);
            this.Q = checkBoxBase2;
            checkBoxBase2.h(-1, aob.Ci, aob.k7);
            if (this.x0 && (i = this.a) != 0) {
                CheckBoxBase checkBoxBase3 = this.Q;
                int v = aob.v(i, aob.p1(0.25f, -1));
                if (checkBoxBase3.x != v) {
                    checkBoxBase3.x = v;
                    checkBoxBase3.b();
                }
            }
            this.Q.k(false);
            this.Q.d(1);
            this.Q.e(0, 0, hl.L(24.0f), hl.L(24.0f));
            if (this.S) {
                this.Q.l = true;
            }
        }
        this.Q.f(-1, z, z2);
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            this.B0 = null;
            valueAnimator.cancel();
        }
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C0, z ? 1.0f : 0.0f);
            this.B0 = ofFloat;
            ofFloat.addUpdateListener(new ce0(this, (byte) 13));
            this.B0.setDuration(200L);
            this.B0.addListener(new i1a((byte) 3, this, z));
            this.B0.start();
        } else {
            this.C0 = z ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void j(boolean z, float f) {
        if (this.y != f) {
            this.y = f;
            if (z) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x045a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i, r47 r47Var, boolean z) {
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem;
        String str;
        boolean z2;
        float f;
        TLRPC.WebPage webPage;
        String str2;
        TL_stories.StoryViews storyViews;
        int i2 = i;
        if (i2 < 1) {
            i2 = 1;
        }
        int i3 = this.r;
        this.r = i2;
        r47 r47Var2 = this.n;
        if (r47Var2 == null) {
            if (r47Var == null) {
                return;
            }
        } else if (r47Var != null && r47Var2.e1() == r47Var.e1()) {
            r47 r47Var3 = this.n;
            if ((r47Var3 != null ? r47Var3.m : null) == r47Var.m) {
                if ((r47Var3 != null ? r47Var3.j : null) == r47Var.j) {
                    TLRPC.MessageMedia messageMedia = (r47Var3 == null || (storyItem = r47Var3.l) == null) ? null : storyItem.media;
                    TL_stories.StoryItem storyItem2 = r47Var.l;
                    TLRPC.MessageMedia messageMedia2 = storyItem2 == null ? null : storyItem2.media;
                    if (messageMedia != null ? !(messageMedia2 == null || ((document = messageMedia.document) == null ? (photo = messageMedia.photo) == null || (photo2 = messageMedia2.photo) == null || photo2.id != photo.id : (document2 = messageMedia2.document) == null || document2.id != document.id)) : messageMedia2 == null) {
                        if (i3 == i2) {
                            int i4 = this.J;
                            if ((i4 == 100) == this.g0 && i4 == g(r47Var) && !z) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        this.n = r47Var;
        this.e0 = r47Var != null && r47Var.w4();
        r47 r47Var4 = this.n;
        this.f0 = (r47Var4 == null || r47Var4.m == null) ? false : true;
        p();
        hn hnVar = this.O;
        mm mmVar = this.N;
        ImageReceiver imageReceiver = this.b;
        ImageReceiver imageReceiver2 = this.c;
        ImageReceiver imageReceiver3 = this.d;
        if (r47Var == null) {
            imageReceiver2.K();
            imageReceiver.K();
            imageReceiver3.K();
            this.H = null;
            this.M = false;
            mmVar.e(true, 0.0f);
            hnVar.t("", false, true);
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
        TL_stories.StoryItem storyItem3 = r47Var.l;
        if (this.S) {
            imageReceiver2.I();
            imageReceiver.I();
            imageReceiver3.I();
        }
        ImageReceiver imageReceiver4 = z ? imageReceiver : imageReceiver2;
        int i5 = this.f;
        String E1 = uc7.s1(i5).E1(r47Var.k.restriction_reason);
        int i6 = hl.q.x;
        float f2 = hl.p;
        int i7 = (int) ((i6 / i2) / f2);
        if (z) {
            i7 = (((int) (i6 / f2)) * 3) / 5;
        }
        SparseArray sparseArray = (SparseArray) this.R.f;
        String str3 = (String) sparseArray.get(i7);
        if (str3 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(i7);
            str = E1;
            sb.append("_");
            sb.append(i7);
            sb.append("_isc");
            String sb2 = sb.toString();
            sparseArray.put(i7, sb2);
            str3 = sb2;
        } else {
            str = E1;
        }
        int Y0 = (i2 <= 2 || z) ? hl.Y0(false) : jn7.q5;
        this.H = null;
        this.G = null;
        this.E = false;
        this.F = false;
        imageReceiver2.e();
        imageReceiver.e();
        if (!this.e0 || (storyViews = storyItem3.views) == null) {
            z2 = true;
            this.M = false;
            f = 0.0f;
            mmVar.e(true, 0.0f);
            hnVar.t("", false, true);
        } else {
            int i8 = storyViews.views_count;
            this.M = i8 > 0;
            z2 = true;
            hnVar.t(hl.o0(i8, 0), false, true);
            f = 0.0f;
        }
        mmVar.e(z2, this.M ? 1.0f : f);
        r47 r47Var5 = r47Var.j != null ? storyItem3 : r47Var;
        if (TextUtils.isEmpty(str)) {
            if (storyItem3 == 0 || !(storyItem3.media instanceof TLRPC.TL_messageMediaUnsupported)) {
                b6b b6bVar = r47Var.m;
                if (b6bVar == null || (str2 = b6bVar.f) == null) {
                    String str4 = str3;
                    TLRPC.Document F02 = r47Var.F0();
                    TLRPC.Photo C1 = r47.C1(r47Var.k);
                    if (r47.J4(F02)) {
                        this.E = !r47Var.D3();
                        this.F = r47Var.D3();
                        if (i2 != 9 && !r47Var.D3()) {
                            this.H = hl.g0((int) r47Var.L0(), false, false);
                        }
                        TLRPC.MessageMedia m1 = r47.m1(r47Var);
                        if ((m1 instanceof TLRPC.TL_messageMediaDocument ? ((TLRPC.TL_messageMediaDocument) m1).video_cover : (m1 == null || (webPage = m1.webpage) == null || !webPage.video_cover_photo) ? null : webPage.photo) != null) {
                            TLRPC.PhotoSize w = xb4.w(r47Var.p0, 50, false, null, false);
                            TLRPC.PhotoSize w2 = xb4.w(r47Var.p0, Y0, false, w, this.e0);
                            if (w2 == w) {
                                w = null;
                            }
                            BitmapDrawable bitmapDrawable = r47Var.I1;
                            TLObject tLObject = r47Var.n0;
                            if (bitmapDrawable != null) {
                                imageReceiver4.Z(jn5.f(w2, tLObject), str4, null, null, r47Var.I1, w2 != null ? w2.size : 0L, null, r47Var5, r47.Q5(r47Var.k) ? 2 : 1);
                            } else {
                                imageReceiver4.Z(jn5.f(w2, tLObject), str4, jn5.f(w, r47Var.n0), str4.concat("_b"), null, w2 != null ? w2.size : 0L, null, r47Var5, r47.Q5(r47Var.k) ? 2 : 1);
                            }
                        } else {
                            TLRPC.Document F03 = r47Var.F0();
                            TLRPC.PhotoSize w3 = xb4.w(F03.thumbs, 50, false, null, false);
                            TLRPC.PhotoSize w4 = xb4.w(F03.thumbs, Y0, false, null, this.e0);
                            if (w3 == w4 && !this.e0) {
                                w4 = null;
                            }
                            if (w3 != null) {
                                if (r47Var.I1 != null) {
                                    imageReceiver4.d0(jn5.c(w4, F03), str4, r47Var.I1, null, r47Var5, 0);
                                } else {
                                    imageReceiver4.Z(jn5.c(w4, F03), str4, jn5.c(w3, F03), str4.concat("_b"), null, 0L, null, r47Var5, 0);
                                }
                            }
                        }
                    } else if (C1 != null && !r47Var.p0.isEmpty()) {
                        if (!r47Var.z0) {
                            if (System.currentTimeMillis() - F0 > 5000) {
                                F0 = System.currentTimeMillis();
                                G0 = lq3.q(i5).d(r47Var);
                            }
                            if (!G0 && !this.e0) {
                                BitmapDrawable bitmapDrawable2 = r47Var.I1;
                                if (bitmapDrawable2 != null) {
                                    imageReceiver4.Z(null, null, null, null, bitmapDrawable2, 0L, null, r47Var5, 0);
                                } else {
                                    imageReceiver4.Z(null, null, jn5.f(xb4.w(r47Var.p0, 50, false, null, false), r47Var.n0), "b", null, 0L, null, r47Var5, 0);
                                }
                            }
                        }
                        TLRPC.PhotoSize w5 = xb4.w(r47Var.p0, 50, false, null, false);
                        TLRPC.PhotoSize w6 = xb4.w(r47Var.p0, Y0, false, w5, this.e0);
                        if (w6 == w5) {
                            w5 = null;
                        }
                        BitmapDrawable bitmapDrawable3 = r47Var.I1;
                        TLObject tLObject2 = r47Var.n0;
                        if (bitmapDrawable3 != null) {
                            imageReceiver4.Z(jn5.f(w6, tLObject2), str4, null, null, r47Var.I1, w6 != null ? w6.size : 0L, null, r47Var5, r47.Q5(r47Var.k) ? 2 : 1);
                        } else {
                            imageReceiver4.Z(jn5.f(w6, tLObject2), str4, z ? null : jn5.f(w5, r47Var.n0), str4.concat("_b"), null, w6 != null ? w6.size : 0L, null, r47Var5, r47.Q5(r47Var.k) ? 2 : 1);
                        }
                    }
                } else {
                    imageReceiver4.d0(jn5.g(str2), str3, null, null, r47Var5, 0);
                }
            } else {
                storyItem3.dialogId = r47.B0(r47Var.k);
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_emoji_recent).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(1090519039, PorterDuff.Mode.SRC_IN));
                imageReceiver4.g0(new zm2(new ColorDrawable(-13421773), mutate));
            }
            if (imageReceiver3.n() != null) {
                imageReceiver3.n().recycle();
                imageReceiver3.g0(null);
            }
            if (imageReceiver4.n() != null && this.n.t2() && !this.n.O0) {
                imageReceiver3.f0(Utilities.D(imageReceiver4.n(), false));
            }
            if (storyItem3 != 0) {
                imageReceiver4.a(new qcb(storyItem3));
            }
            setPrivacyType(g(r47Var));
            if (this.h) {
                long B0 = r47.B0(r47Var.k);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                spannableStringBuilder.append((CharSequence) uc7.s1(i5).A1(B0, false));
                gc0 gc0Var = new gc0(i2 == 2 ? 16.0f : 13.66f, i5, this);
                gc0Var.c(B0);
                spannableStringBuilder.setSpan(gc0Var, 0, 1, 33);
                this.P = new pkb(spannableStringBuilder, i2 == 2 ? 14.0f : 10.1666f, hl.o());
            }
            o();
            invalidate();
        }
        imageReceiver4.g0(getContext().getDrawable(R.drawable.photo_placeholder_in));
        if (imageReceiver3.n() != null) {
        }
        if (imageReceiver4.n() != null) {
            imageReceiver3.f0(Utilities.D(imageReceiver4.n(), false));
        }
        if (storyItem3 != 0) {
        }
        setPrivacyType(g(r47Var));
        if (this.h) {
        }
        o();
        invalidate();
    }

    public final void l(boolean z, boolean z2) {
        if (this.D0 == z) {
            return;
        }
        this.D0 = z;
        if (!z2) {
            this.E0.a(z);
        }
        invalidate();
    }

    public final void m(String str, boolean z) {
        this.H = str;
        this.E = true;
        this.F = false;
        StaticLayout staticLayout = this.G;
        if (staticLayout != null && !staticLayout.getText().toString().equals(str)) {
            this.G = null;
        }
        this.I = z;
    }

    public final void n(float f, float f2) {
        this.k0 = f;
        this.l0 = f2;
        this.m0 = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) ete.a(this.m0 * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(k43.j);
        duration.addUpdateListener(new ija(this, (byte) 0));
        duration.addListener(new po9((Object) this, (byte) 15));
        duration.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[Catch: Exception -> 0x00dc, TRY_ENTER, TryCatch #0 {Exception -> 0x00dc, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x000a, B:10:0x0017, B:12:0x001b, B:13:0x0025, B:15:0x002c, B:17:0x0080, B:20:0x0088, B:21:0x008b, B:23:0x0090, B:26:0x009e, B:28:0x00a2, B:30:0x00a6, B:31:0x00b8, B:33:0x00bc, B:34:0x00d4, B:36:0x0034, B:38:0x003a, B:39:0x007c, B:40:0x0046, B:42:0x004e, B:44:0x0056, B:46:0x005a, B:48:0x005e, B:50:0x0068, B:52:0x0071), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090 A[Catch: Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x000a, B:10:0x0017, B:12:0x001b, B:13:0x0025, B:15:0x002c, B:17:0x0080, B:20:0x0088, B:21:0x008b, B:23:0x0090, B:26:0x009e, B:28:0x00a2, B:30:0x00a6, B:31:0x00b8, B:33:0x00bc, B:34:0x00d4, B:36:0x0034, B:38:0x003a, B:39:0x007c, B:40:0x0046, B:42:0x004e, B:44:0x0056, B:46:0x005a, B:48:0x005e, B:50:0x0068, B:52:0x0071), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc A[Catch: Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x000a, B:10:0x0017, B:12:0x001b, B:13:0x0025, B:15:0x002c, B:17:0x0080, B:20:0x0088, B:21:0x008b, B:23:0x0090, B:26:0x009e, B:28:0x00a2, B:30:0x00a6, B:31:0x00b8, B:33:0x00bc, B:34:0x00d4, B:36:0x0034, B:38:0x003a, B:39:0x007c, B:40:0x0046, B:42:0x004e, B:44:0x0056, B:46:0x005a, B:48:0x005e, B:50:0x0068, B:52:0x0071), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        String M0;
        double L0;
        String M02;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        int i;
        TL_stories.StoryViews storyViews;
        try {
            r47 r47Var = this.n;
            if (r47Var == null) {
                setContentDescription(null);
                return;
            }
            TL_stories.StoryItem storyItem2 = r47Var.l;
            boolean w4 = r47Var.w4();
            StringBuilder sb = new StringBuilder();
            if (w4 && this.g0) {
                sb.append(ob6.M0(2131754748, null));
            }
            if (!r47Var.D3()) {
                if (r47Var.g4()) {
                    M0 = ob6.M0(2131754777, null);
                    L0 = r47Var.L0();
                } else {
                    if (!r47.K4(r47Var.k)) {
                        TLRPC.MessageMedia n1 = r47.n1(r47Var.k);
                        if (!((n1 == null || (storyItem = n1.storyItem) == null || (messageMedia = storyItem.media) == null) ? false : r47.J4(messageMedia.document))) {
                            M02 = ob6.M0(2131753941, null);
                        }
                    }
                    M0 = ob6.M0(2131753926, null);
                    L0 = r47Var.L0();
                }
                String str = M0;
                i = (int) L0;
                M02 = str;
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(M02);
                if (i > 0) {
                    sb.append(", ");
                    sb.append(ob6.z(i));
                }
                if (w4 && storyItem2 != null) {
                    storyViews = storyItem2.views;
                    if (storyViews != null && storyViews.views_count > 0) {
                        sb.append(", ");
                        sb.append(ob6.G(storyItem2.views.views_count, "Views", new Object[0]));
                    }
                    if (storyItem2.date > 0) {
                        sb.append(", ");
                        sb.append(ob6.a0(null, null, 2131754798, ob6.s(storyItem2.date, false)));
                    }
                }
                setContentDescription(sb.toString());
            }
            M02 = ob6.M0(2131754843, null);
            i = 0;
            if (sb.length() > 0) {
            }
            sb.append(M02);
            if (i > 0) {
            }
            if (w4) {
                storyViews = storyItem2.views;
                if (storyViews != null) {
                    sb.append(", ");
                    sb.append(ob6.G(storyItem2.views.views_count, "Views", new Object[0]));
                }
                if (storyItem2.date > 0) {
                }
            }
            setContentDescription(sb.toString());
        } catch (Exception e) {
            cc4.g(e, true);
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
            this.c.I();
            this.b.I();
            this.d.I();
        }
        mpa mpaVar = this.n0;
        if (mpaVar != null) {
            if (mpaVar.i) {
                this.n0 = mpa.e(this);
            } else {
                mpaVar.a(this);
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
            this.c.K();
            this.b.K();
            this.d.K();
        }
        mpa mpaVar = this.n0;
        if (mpaVar != null) {
            mpaVar.b(this);
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
            cc4.g(e, true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        boolean z = this.e0;
        int i3 = z ? (int) (size * 1.25f) : size;
        if (z && this.r == 1) {
            i3 /= 2;
        }
        setMeasuredDimension(size, i3);
        p();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        za1 za1Var = this.w0;
        if (za1Var == null || !za1Var.b(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void p() {
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            return;
        }
        r47 r47Var = this.n;
        if (r47Var != null && r47Var.t2()) {
            if (this.n0 == null) {
                this.n0 = mpa.e(this);
            }
        } else {
            mpa mpaVar = this.n0;
            if (mpaVar != null) {
                mpaVar.b(this);
                this.n0 = null;
            }
        }
    }

    public final boolean q(float f) {
        int i;
        if (this.e0 && this.r < 5) {
            int L = hl.L(26.0f) + ((int) this.O.c());
            if (this.E) {
                int L2 = hl.L(8.0f);
                StaticLayout staticLayout = this.G;
                i = L2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.I ? hl.L(10.0f) : 0);
            } else {
                i = 0;
            }
            if (L + ((L <= 0 || i <= 0) ? 0 : hl.L(8.0f)) + i > f) {
                return true;
            }
        }
        return false;
    }

    public void setGradientView(tk4 tk4Var) {
        this.s = tk4Var;
    }

    public void setHighlightProgress(float f) {
        if (this.V != f) {
            this.V = f;
            invalidate();
        }
    }

    public void setReorder(boolean z) {
        this.y0 = z;
        invalidate();
    }

    public void setStyle(int i) {
        if (this.s0 != i) {
            this.s0 = i;
            if (i == 1) {
                CheckBoxBase checkBoxBase = new CheckBoxBase(21, null, this);
                this.Q = checkBoxBase;
                checkBoxBase.h(-1, aob.Ci, aob.k7);
                this.Q.k(true);
                this.Q.d(0);
                this.Q.e(0, 0, hl.L(24.0f), hl.L(24.0f));
                if (this.S) {
                    this.Q.l = true;
                }
                za1 za1Var = new za1(this);
                this.w0 = za1Var;
                za1Var.h = new ux9(this, (byte) 27);
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.O == drawable || super.verifyDrawable(drawable);
    }

    public void h() {
    }
}
