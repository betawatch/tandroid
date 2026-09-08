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
import bi.ub;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class t7 extends FrameLayout {
    public static long E0;
    public static boolean F0;
    public ValueAnimator A0;
    public float B0;
    public boolean C0;
    public final org.telegram.ui.Components.e6 D0;
    public boolean E;
    public StaticLayout F;
    public String G;
    public boolean H;
    public int I;
    public Bitmap J;
    public Paint K;
    public boolean L;
    public final org.telegram.ui.Components.e6 M;
    public final org.telegram.ui.Components.p6 N;
    public f01 O;
    public CheckBoxBase P;
    public final s7 Q;
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
    public zo0 e;
    public boolean e0;
    public final int f;
    public boolean f0;
    public final Path g0;
    public boolean h;
    public wh.h h0;
    public float i0;
    public float j0;
    public float k0;
    public float l0;
    public wh.g m0;
    public MessageObject n;
    public final Path n0;
    public f01 o0;
    public f01 p0;
    public f01 q0;
    public int r;
    public int r0;
    public t00 s;
    public final Paint s0;
    public final Paint t0;
    public final org.telegram.ui.Components.e6 u0;
    public t7 v;
    public gd v0;
    public float w;
    public boolean w0;
    public float x;
    public boolean x0;
    public boolean y;
    public final RectF y0;
    public Path z0;

    public t7(Context context, s7 s7Var, int i10) {
        super(context);
        this.a = 0;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.b = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.c = imageReceiver2;
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.d = imageReceiver3;
        this.w = 1.0f;
        this.x = 1.0f;
        this.H = true;
        pr prVar = pr.h;
        this.M = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true, false);
        this.N = p6Var;
        this.g0 = new Path();
        this.n0 = new Path();
        this.r0 = 0;
        this.s0 = new Paint(1);
        this.t0 = new Paint(1);
        this.u0 = new org.telegram.ui.Components.e6(this, 0L, 200L, prVar);
        this.y0 = new RectF();
        this.D0 = new org.telegram.ui.Components.e6(this, 0L, 320L, prVar);
        this.Q = s7Var;
        this.f = i10;
        i(false, false);
        imageReceiver2.setParentView(this);
        imageReceiver.setParentView(this);
        imageReceiver3.setParentView(this);
        imageReceiver2.setDelegate(new la(this, 6));
        p6Var.setCallback(this);
        p6Var.t(AndroidUtilities.dp(12.0f));
        p6Var.r(-1);
        p6Var.u(AndroidUtilities.bold());
        p6Var.G = AndroidUtilities.displaySize.x;
        setWillNotDraw(false);
    }

    private float getPadding() {
        if (this.S != 0.0f) {
            float f7 = this.T;
            if (f7 == 9.0f || this.r == 9) {
                if (f7 == 9.0f) {
                    return com.google.android.gms.internal.vision.e2.z(1.0f, this.S, AndroidUtilities.dpf2(2.0f), AndroidUtilities.dpf2(1.0f) * this.S);
                }
                return com.google.android.gms.internal.vision.e2.z(1.0f, this.S, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(2.0f) * this.S);
            }
        }
        return this.r == 9 ? AndroidUtilities.dpf2(1.0f) : AndroidUtilities.dpf2(2.0f);
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
            HashMap hashMap = this.Q.g;
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
                Utilities.stackBlurBitmap(createBitmap, AndroidUtilities.dp(1.0f));
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
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, f7, f10);
        float dp = AndroidUtilities.dp(12.0f) * f11;
        this.z0.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        this.z0.close();
        canvas.clipPath(this.z0);
        canvas.scale(f7 / getWidth(), f10 / getHeight());
        boolean hasImageLoaded = this.b.hasImageLoaded();
        if (!hasImageLoaded || f11 < 1.0f) {
            float f12 = 1.0f - f11;
            d(f12, 1.0f, f12, canvas, false);
        }
        if (hasImageLoaded && f11 > 0.0f) {
            d(1.0f - f11, f11, 0.0f, canvas, true);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas, RectF rectF, float f7) {
        if (this.d0) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.h && this.O != null) {
                float dp = AndroidUtilities.dp(5.33f);
                f01 f01Var = this.O;
                f01Var.p = (int) (rectF.width() - (2.0f * dp));
                f01Var.t = AndroidUtilities.dp(14.0f);
                f01Var.a.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.j6.l1(0.4f * f7, -16777216));
                f01Var.c(rectF.left + dp, rectF.top + AndroidUtilities.dp(this.r <= 2 ? 15.0f : 11.33f), 1.0f, org.telegram.ui.ActionBar.j6.l1(f7, -1), canvas);
            }
        }
    }

    public final void c(Canvas canvas, RectF rectF, float f7) {
        String str;
        float f10 = f7;
        if (this.y) {
            ImageReceiver imageReceiver = this.c;
            if (imageReceiver == null || imageReceiver.getVisible()) {
                float dp = (AndroidUtilities.dp(20.0f) * this.B0) + rectF.width();
                float width = rectF.width() / dp;
                if (f10 < 1.0f) {
                    f10 = (float) Math.pow(f10, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i10 = this.r;
                s7 s7Var = this.Q;
                if (i10 != 9 && this.F == null && (str = this.G) != null) {
                    this.F = new StaticLayout(this.G, s7Var.a, (int) Math.ceil(s7Var.a.measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i10 >= 9 || this.G == null) && this.F != null) {
                    this.F = null;
                }
                boolean q6 = q(dp);
                int dp2 = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.F;
                int width2 = dp2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.H ? AndroidUtilities.dp(10.0f) : 0);
                canvas.translate(AndroidUtilities.dp(5.0f), (((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f)) - (q6 ? AndroidUtilities.dp(22.0f) : 0));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, width2, AndroidUtilities.dp(17.0f));
                int alpha = org.telegram.ui.ActionBar.j6.i2.getAlpha();
                org.telegram.ui.ActionBar.j6.i2.setAlpha((int) (alpha * f10));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.i2);
                org.telegram.ui.ActionBar.j6.i2.setAlpha(alpha);
                if (this.H) {
                    canvas.save();
                    float dp3 = this.F == null ? AndroidUtilities.dp(5.0f) : AndroidUtilities.dp(4.0f);
                    int dp4 = AndroidUtilities.dp(17.0f);
                    Drawable drawable = s7Var.c;
                    Drawable drawable2 = s7Var.c;
                    canvas.translate(dp3, (dp4 - drawable.getIntrinsicHeight()) / 2.0f);
                    drawable2.setAlpha((int) (this.w * 255.0f * f10));
                    drawable2.draw(canvas);
                    canvas.restore();
                }
                if (this.F != null) {
                    canvas.translate(AndroidUtilities.dp((this.H ? 10 : 0) + 4), (AndroidUtilities.dp(17.0f) - this.F.getHeight()) / 2.0f);
                    TextPaint textPaint = s7Var.a;
                    TextPaint textPaint2 = s7Var.a;
                    int alpha2 = textPaint.getAlpha();
                    textPaint2.setAlpha((int) (alpha2 * f10));
                    this.F.draw(canvas);
                    textPaint2.setAlpha(alpha2);
                }
                canvas.restore();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0630, code lost:
    
        if (r0.getProgress() != 0.0f) goto L194;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(float f7, float f10, float f11, Canvas canvas, boolean z10) {
        float f12;
        boolean z11;
        float f13;
        Canvas canvas2;
        float f14;
        float f15;
        float f16;
        ImageReceiver imageReceiver;
        float f17;
        t7 t7Var;
        float dp;
        float f18;
        Drawable drawable;
        float f19;
        ImageReceiver imageReceiver2;
        Canvas canvas3;
        float f20;
        int i10;
        t00 t00Var;
        float padding = getPadding() * f7;
        float f21 = this.V ? padding : 0.0f;
        float e7 = this.D0.e(this.C0);
        float measuredWidth = ((getMeasuredWidth() - f21) - padding) * this.x;
        float measuredHeight = ((getMeasuredHeight() - 0.0f) - padding) * this.x;
        ImageReceiver imageReceiver3 = z10 ? this.b : this.c;
        imageReceiver3.setAlpha(f10);
        if (this.S > 0.5f && this.T != 9.0f && this.r != 9) {
            float f22 = f7 * 2.0f;
            measuredWidth -= f22;
            measuredHeight -= f22;
        }
        if ((this.n != null || this.r0 == 1) && imageReceiver3.hasBitmapImage() && imageReceiver3.getCurrentAlpha() == 1.0f && this.w == 1.0f) {
            f12 = 1.0f;
            z11 = true;
            f13 = 0.0f;
        } else {
            if (getParent() == null || (t00Var = this.s) == null) {
                f12 = 1.0f;
                z11 = true;
                f13 = 0.0f;
            } else {
                int measuredWidth2 = ((View) getParent()).getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                float f23 = -getX();
                t00Var.O = measuredWidth2;
                t00Var.P = measuredHeight2;
                t00Var.Q = f23;
                this.s.d();
                this.s.h();
                float f24 = (this.S <= 0.5f || this.T == 9.0f || this.r == 9) ? 0.0f : 1.0f;
                float f25 = f21 + f24;
                float f26 = f24 + padding;
                f12 = 1.0f;
                z11 = true;
                f13 = 0.0f;
                canvas.drawRect(f25, f26, f25 + measuredWidth, f26 + measuredHeight, this.s.getPaint());
            }
            invalidate();
        }
        float f27 = this.w;
        if (f27 != f12) {
            canvas.saveLayerAlpha(0.0f, 0.0f, f21 + padding + measuredWidth, padding + f13 + measuredHeight, (int) (f27 * 255.0f), 31);
        } else {
            canvas.save();
        }
        CheckBoxBase checkBoxBase = this.P;
        s7 s7Var = this.Q;
        if (((checkBoxBase == null || !checkBoxBase.q) && !PhotoViewer.M1(this.n)) || this.w0) {
            canvas2 = canvas;
            f14 = f21;
        } else {
            canvas2 = canvas;
            f14 = f21;
            canvas2.drawRect(f14, 0.0f, (f21 + measuredWidth) - padding, (measuredHeight + f13) - padding, s7Var.b);
        }
        boolean z12 = this.d0;
        ImageReceiver imageReceiver4 = this.d;
        if (z12 && this.r == z11) {
            float height = getHeight() * 0.72f;
            GradientDrawable gradientDrawable = this.b0;
            if (gradientDrawable != null) {
                gradientDrawable.setBounds(0, 0, getWidth(), getHeight());
                this.b0.draw(canvas2);
            } else if (!this.c0 && imageReceiver3.getBitmap() != null) {
                this.c0 = z11;
                Bitmap bitmap = imageReceiver3.getBitmap();
                boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
                if (bitmap == null) {
                    int[] iArr = {0, 0};
                    if (this.c0) {
                        this.b0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
                        invalidate();
                        this.c0 = false;
                    }
                } else {
                    int[] b10 = di.n0.b(bitmap, q6);
                    if (this.c0) {
                        this.b0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, b10);
                        invalidate();
                        this.c0 = false;
                    }
                }
            }
            imageReceiver3.setImageCoords((measuredWidth - height) / 2.0f, 0.0f, height, getHeight());
        } else if (this.B0 > 0.0f) {
            float dp2 = AndroidUtilities.dp(this.w0 ? 7.0f : 10.0f) * this.B0;
            float f28 = f14 + dp2;
            float f29 = padding + dp2;
            float f30 = dp2 * 2.0f;
            float f31 = measuredWidth - f30;
            float f32 = measuredHeight - f30;
            imageReceiver3.setImageCoords(f28, f29, f31, f32);
            imageReceiver4.setImageCoords(f28, f29, f31, f32);
        } else {
            float f33 = (this.S <= 0.5f || this.T == 9.0f || this.r == 9) ? 0.0f : 1.0f;
            float f34 = f14 + f33;
            float f35 = f33 + padding;
            imageReceiver3.setImageCoords(f34, f35, measuredWidth, measuredHeight);
            imageReceiver4.setImageCoords(f34, f35, measuredWidth, measuredHeight);
        }
        imageReceiver3.setRoundRadius(AndroidUtilities.lerp((this.V && this.a0) ? AndroidUtilities.dp(18.0f) : AndroidUtilities.dp(f12), AndroidUtilities.dp(8.0f), this.B0), AndroidUtilities.lerp((this.W && this.a0) ? AndroidUtilities.dp(18.0f) : AndroidUtilities.dp(f12), AndroidUtilities.dp(8.0f), this.B0), AndroidUtilities.lerp(AndroidUtilities.dp(f12), AndroidUtilities.dp(8.0f), this.B0), AndroidUtilities.lerp(AndroidUtilities.dp(f12), AndroidUtilities.dp(8.0f), this.B0));
        if (this.w0) {
            canvas2.save();
            if (this.x0 || this.C0) {
                canvas2.translate(imageReceiver3.getCenterX(), imageReceiver3.getCenterY());
                if (this.e == null) {
                    this.e = new zo0(this);
                }
                this.e.a(canvas2, Math.max(this.B0, e7));
                float f36 = f12 - (e7 * 0.075f);
                canvas2.scale(f36, f36);
                canvas2.translate(-imageReceiver3.getCenterX(), -imageReceiver3.getCenterY());
            }
        }
        if (PhotoViewer.M1(this.n)) {
            f15 = e7;
            f16 = measuredWidth;
            imageReceiver = imageReceiver3;
            f17 = 0.075f;
            t7Var = this;
        } else {
            imageReceiver3.draw(canvas2);
            MessageObject messageObject = this.n;
            if (messageObject == null || !messageObject.hasMediaSpoilers() || this.n.isMediaSpoilersRevealedInSharedMedia) {
                f15 = e7;
                f16 = measuredWidth;
                imageReceiver = imageReceiver3;
                f17 = 0.075f;
                t7Var = this;
            } else {
                canvas2.save();
                canvas2.clipRect(f14, 0.0f, (f14 + measuredWidth) - padding, (measuredHeight + 0.0f) - padding);
                if (this.i0 != 0.0f) {
                    Path path = this.g0;
                    path.rewind();
                    path.addCircle(this.j0, this.k0, this.l0 * this.i0, Path.Direction.CW);
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                }
                imageReceiver4.draw(canvas2);
                if (this.m0 != null) {
                    canvas2.clipRect(imageReceiver3.getImageX(), imageReceiver3.getImageY(), imageReceiver3.getImageX2(), imageReceiver3.getImageY2());
                    f19 = measuredWidth;
                    imageReceiver2 = imageReceiver3;
                    Canvas canvas4 = canvas2;
                    f20 = e7;
                    this.m0.c(canvas4, this, (int) imageReceiver3.getImageWidth(), (int) imageReceiver3.getImageHeight(), 1.0f, false);
                    canvas3 = canvas4;
                    t7Var = this;
                } else {
                    f19 = measuredWidth;
                    imageReceiver2 = imageReceiver3;
                    canvas3 = canvas2;
                    t7Var = this;
                    f20 = e7;
                    if (t7Var.h0 == null) {
                        t7Var.h0 = new wh.h();
                    }
                    t7Var.h0.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    t7Var.h0.setBounds((int) imageReceiver2.getImageX(), (int) imageReceiver2.getImageY(), (int) imageReceiver2.getImageX2(), (int) imageReceiver2.getImageY2());
                    t7Var.h0.draw(canvas3);
                }
                canvas3.restore();
                if (t7Var.n.isSensitive()) {
                    if (t7Var.o0 == null) {
                        f17 = 0.075f;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.w1.h(R.string.MessageSensitiveContent, new StringBuilder("x ")));
                        spannableStringBuilder.setSpan(new nq(R.drawable.filled_sensitive, 0), 0, 1, 33);
                        t7Var.o0 = new f01(spannableStringBuilder, 14.0f, AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                    } else {
                        f17 = 0.075f;
                    }
                    f01 f01Var = t7Var.o0;
                    int i11 = 13;
                    if (f19 < (AndroidUtilities.dp(13) * 2) + f01Var.c) {
                        if (t7Var.p0 == null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.w1.h(R.string.MessageSensitiveContentShort, new StringBuilder("x ")));
                            spannableStringBuilder2.setSpan(new nq(R.drawable.filled_sensitive, 0), 0, 1, 33);
                            t7Var.p0 = new f01(spannableStringBuilder2, 14.0f, AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                        }
                        f01Var = t7Var.p0;
                    }
                    if (f19 < (AndroidUtilities.dp(26) * 2) + f01Var.c) {
                        if (t7Var.q0 == null) {
                            t7Var.q0 = new f01(new SpannableStringBuilder(LocaleController.getString(R.string.MessageSensitiveContentShort)), 13.0f, AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                        }
                        f01Var = t7Var.q0;
                        i11 = 10;
                        i10 = 28;
                    } else {
                        i10 = 32;
                    }
                    float imageWidth = (imageReceiver2.getImageWidth() / 2.0f) + imageReceiver2.getImageX();
                    float imageHeight = (imageReceiver2.getImageHeight() / 2.0f) + imageReceiver2.getImageY();
                    float dp3 = f01Var.c + AndroidUtilities.dp(i11 + i11);
                    float dp4 = AndroidUtilities.dp(i10) / 2.0f;
                    f01 f01Var2 = f01Var;
                    float lerp = AndroidUtilities.lerp(0.8f, 1.0f, f12 - t7Var.i0);
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f37 = dp3 / 2.0f;
                    float f38 = f37 * lerp;
                    float f39 = dp4 * lerp;
                    f16 = f19;
                    imageReceiver = imageReceiver2;
                    rectF.set(imageWidth - f38, imageHeight - f39, f38 + imageWidth, imageHeight + f39);
                    Path path2 = t7Var.n0;
                    path2.reset();
                    path2.addRoundRect(rectF, dp4, dp4, Path.Direction.CW);
                    canvas3.save();
                    canvas3.clipPath(path2);
                    float alpha = imageReceiver4.getAlpha();
                    imageReceiver4.setAlpha((1.0f - t7Var.i0) * alpha);
                    imageReceiver4.draw(canvas3);
                    imageReceiver4.setAlpha(alpha);
                    canvas3.restore();
                    Paint S0 = org.telegram.ui.ActionBar.j6.S0("paintChatTimeBackground");
                    int alpha2 = S0.getAlpha();
                    f15 = f20;
                    S0.setAlpha((int) org.telegram.messenger.w1.A(1.0f, t7Var.i0, alpha2, 0.35f));
                    canvas3.drawRoundRect(rectF, dp4, dp4, S0);
                    S0.setAlpha(alpha2);
                    canvas3.save();
                    canvas3.scale(lerp, lerp, imageWidth, imageHeight);
                    Canvas canvas5 = canvas3;
                    f01Var2.c(AndroidUtilities.dp(i11) + (imageWidth - f37), imageHeight, 1.0f - t7Var.i0, -1, canvas5);
                    canvas2 = canvas5;
                    canvas2.restore();
                } else {
                    f15 = f20;
                    f16 = f19;
                    imageReceiver = imageReceiver2;
                    f17 = 0.075f;
                    canvas2 = canvas3;
                }
                t7Var.invalidate();
            }
            if (!t7Var.h) {
                float f40 = t7Var.U;
                if (f40 > 0.0f) {
                    s7Var.e.setColor(i0.a.k(-16777216, (int) (f40 * 0.5f * 255.0f)));
                    canvas2.drawRect(imageReceiver.getDrawRegion(), s7Var.e);
                }
            }
        }
        if (t7Var.e0) {
            Paint paint = t7Var.s0;
            paint.setColor(805306368);
            canvas2.drawRect(imageReceiver.getDrawRegion(), paint);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint2 = t7Var.t0;
            paint2.setStyle(style);
            paint2.setColor(-1);
            paint2.setStrokeWidth(AndroidUtilities.dp(3.0f));
            paint2.setStrokeJoin(Paint.Join.ROUND);
            paint2.setStrokeCap(Paint.Cap.ROUND);
            float dp5 = AndroidUtilities.dp(18.0f);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(imageReceiver.getCenterX() - dp5, imageReceiver.getCenterY() - dp5, imageReceiver.getCenterX() + dp5, imageReceiver.getCenterY() + dp5);
            float currentTimeMillis = ((System.currentTimeMillis() % 1500) / 1500.0f) * 360.0f;
            MessageObject messageObject2 = t7Var.n;
            canvas2.drawArc(rectF2, currentTimeMillis, t7Var.u0.d(AndroidUtilities.lerp(0.15f, 0.95f, messageObject2 != null ? messageObject2.getProgress() : 0.0f), false) * 360.0f, false, paint2);
            t7Var.invalidate();
        }
        float imageX = imageReceiver.getImageX();
        float imageY = imageReceiver.getImageY();
        float imageX2 = imageReceiver.getImageX2();
        float imageY2 = imageReceiver.getImageY2();
        RectF rectF3 = t7Var.y0;
        rectF3.set(imageX, imageY, imageX2, imageY2);
        if (t7Var.E && (drawable = org.telegram.ui.ActionBar.j6.l3) != null) {
            drawable.setBounds((int) (rectF3.left + AndroidUtilities.dp(8.0f)), (int) (rectF3.top + AndroidUtilities.dp(8.0f)), (int) ((org.telegram.ui.ActionBar.j6.l3.getIntrinsicWidth() * 0.75f) + rectF3.left + AndroidUtilities.dp(8.0f)), (int) ((org.telegram.ui.ActionBar.j6.l3.getIntrinsicHeight() * 0.75f) + rectF3.top + AndroidUtilities.dp(8.0f)));
            org.telegram.ui.ActionBar.j6.l3.draw(canvas2);
        }
        t7Var.c(canvas2, rectF3, f11);
        t7Var.f(canvas2, rectF3, f11);
        if (t7Var.h) {
            t7Var.b(canvas2, rectF3, f11);
        } else {
            t7Var.e(canvas2, rectF3, f11);
        }
        if (t7Var.w0) {
            canvas2.restore();
        }
        CheckBoxBase checkBoxBase2 = t7Var.P;
        if (checkBoxBase2 != null) {
            if (t7Var.r0 != 1) {
            }
            canvas2.save();
            if (t7Var.w0 && (t7Var.x0 || t7Var.C0)) {
                canvas2.translate(imageReceiver.getCenterX(), imageReceiver.getCenterY());
                if (t7Var.e == null) {
                    t7Var.e = new zo0(t7Var);
                }
                float f41 = f15;
                t7Var.e.a(canvas2, Math.max(t7Var.B0, f41) * 0.5f);
                float f42 = 1.0f - (f41 * f17);
                canvas2.scale(f42, f42);
                canvas2.translate(-imageReceiver.getCenterX(), -imageReceiver.getCenterY());
            }
            if (t7Var.r0 == 1) {
                dp = ((f16 + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(25.0f)) - AndroidUtilities.dp(4.0f);
                f18 = AndroidUtilities.dp(4.0f);
            } else if (t7Var.w0) {
                dp = (f16 + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp((t7Var.B0 * 5.0f) + 22.0f);
                f18 = (AndroidUtilities.dp(5.0f) * t7Var.B0) + AndroidUtilities.dp(-2.0f);
            } else {
                dp = (f16 + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(25.0f);
                f18 = 0.0f;
            }
            canvas2.translate(dp, f18);
            t7Var.P.a(canvas2);
            if (t7Var.v0 != null) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(dp, f18, t7Var.P.b.width() + dp, t7Var.P.b.height() + f18);
                gd gdVar = t7Var.v0;
                gdVar.i = false;
                gdVar.c = 0;
                gdVar.a(rectF4);
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
        int dp = AndroidUtilities.dp((rectF.width() / ((AndroidUtilities.dp(20.0f) * this.B0) + rectF.width())) * 17.33f);
        canvas.save();
        float f10 = dp;
        canvas.translate((rectF.right - f10) - AndroidUtilities.dp(5.66f), rectF.top + AndroidUtilities.dp(5.66f));
        if (this.K == null) {
            this.K = new Paint(3);
        }
        this.K.setAlpha((int) (f7 * 255.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, f10, f10);
        canvas.drawBitmap(this.J, (Rect) null, rectF2, this.K);
        canvas.restore();
    }

    public final void f(Canvas canvas, RectF rectF, float f7) {
        if (this.d0) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.r < 5) {
                float dp = (AndroidUtilities.dp(20.0f) * this.B0) + rectF.width();
                float width = rectF.width() / dp;
                boolean q6 = q(dp);
                float e7 = this.M.e(this.L);
                float f10 = f7 * e7;
                if (f10 < 1.0f) {
                    f10 = (float) Math.pow(f10, 8.0d);
                }
                if (e7 <= 0.0f) {
                    return;
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, q6 ? 0.0f : rectF.width(), rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                float dp2 = AndroidUtilities.dp(26.0f);
                org.telegram.ui.Components.p6 p6Var = this.N;
                float d = p6Var.d() + dp2;
                canvas.translate(q6 ? AndroidUtilities.dp(5.0f) : (rectF.width() - AndroidUtilities.dp(5.0f)) - d, ((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, d, AndroidUtilities.dp(17.0f));
                int alpha = org.telegram.ui.ActionBar.j6.i2.getAlpha();
                org.telegram.ui.ActionBar.j6.i2.setAlpha((int) (alpha * f10));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.i2);
                org.telegram.ui.ActionBar.j6.i2.setAlpha(alpha);
                canvas.save();
                float dp3 = AndroidUtilities.dp(3.0f);
                int dp4 = AndroidUtilities.dp(17.0f);
                s7 s7Var = this.Q;
                canvas.translate(dp3, (dp4 - s7Var.d.getBounds().height()) / 2.0f);
                s7Var.d.setAlpha((int) (this.w * 255.0f * f10));
                s7Var.d.draw(canvas);
                canvas.restore();
                canvas.translate(AndroidUtilities.dp(22.0f), 0.0f);
                p6Var.setBounds(0, 0, (int) d, AndroidUtilities.dp(17.0f));
                p6Var.w = (int) (f10 * 255.0f);
                p6Var.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final int g(MessageObject messageObject) {
        TL_stories.StoryItem storyItem;
        if (this.f0) {
            return 100;
        }
        if (!this.d0 || messageObject == null || (storyItem = messageObject.storyItem) == null) {
            return -1;
        }
        if (storyItem.parsedPrivacy == null) {
            storyItem.parsedPrivacy = new di.ga(this.f, storyItem.privacy);
        }
        int i10 = messageObject.storyItem.parsedPrivacy.a;
        if (i10 == 2 || i10 == 1 || i10 == 3) {
            return i10;
        }
        return -1;
    }

    public View getCrossfadeView() {
        return this.v;
    }

    public int getMessageId() {
        MessageObject messageObject = this.n;
        if (messageObject != null) {
            return messageObject.getId();
        }
        return 0;
    }

    public MessageObject getMessageObject() {
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
            checkBoxBase2.h(-1, org.telegram.ui.ActionBar.j6.Lh, org.telegram.ui.ActionBar.j6.k7);
            if (this.w0 && (i10 = this.a) != 0) {
                CheckBoxBase checkBoxBase3 = this.P;
                int v = org.telegram.ui.ActionBar.j6.v(i10, org.telegram.ui.ActionBar.j6.l1(0.25f, -1));
                if (checkBoxBase3.x != v) {
                    checkBoxBase3.x = v;
                    checkBoxBase3.b();
                }
            }
            this.P.k(false);
            this.P.d(1);
            this.P.e(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
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
            ofFloat.addUpdateListener(new bi.u5(this, 6));
            this.A0.setDuration(200L);
            this.A0.addListener(new ah.q0(25, this, z10));
            this.A0.start();
        } else {
            this.B0 = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void j(float f7, boolean z10) {
        if (this.x != f7) {
            this.x = f7;
            if (z10) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x048e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(MessageObject messageObject, int i10, boolean z10) {
        boolean z11;
        TL_stories.StoryItem storyItem;
        String str;
        TL_stories.StoryViews storyViews;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem2;
        int i11 = i10;
        if (i11 < 1) {
            i11 = 1;
        }
        int i12 = this.r;
        this.r = i11;
        MessageObject messageObject2 = this.n;
        if (messageObject2 == null && messageObject == null) {
            return;
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getId() == messageObject.getId()) {
            MessageObject messageObject3 = this.n;
            if ((messageObject3 != null ? messageObject3.uploadingStory : null) == messageObject.uploadingStory) {
                if ((messageObject3 != null ? messageObject3.parentStoriesList : null) == messageObject.parentStoriesList) {
                    TLRPC.MessageMedia messageMedia = (messageObject3 == null || (storyItem2 = messageObject3.storyItem) == null) ? null : storyItem2.media;
                    TL_stories.StoryItem storyItem3 = messageObject.storyItem;
                    TLRPC.MessageMedia messageMedia2 = storyItem3 == null ? null : storyItem3.media;
                    if (((messageMedia == null && messageMedia2 == null) || (messageMedia != null && messageMedia2 != null && ((document = messageMedia.document) == null ? !((photo = messageMedia.photo) == null || (photo2 = messageMedia2.photo) == null || photo2.id != photo.id) : !((document2 = messageMedia2.document) == null || document2.id != document.id)))) && i12 == i11) {
                        int i13 = this.I;
                        if ((i13 == 100) == this.f0 && i13 == g(messageObject) && !z10) {
                            return;
                        }
                    }
                }
            }
        }
        this.n = messageObject;
        this.d0 = messageObject != null && messageObject.isStory();
        MessageObject messageObject4 = this.n;
        this.e0 = (messageObject4 == null || messageObject4.uploadingStory == null) ? false : true;
        p();
        org.telegram.ui.Components.p6 p6Var = this.N;
        org.telegram.ui.Components.e6 e6Var = this.M;
        ImageReceiver imageReceiver = this.b;
        ImageReceiver imageReceiver2 = this.c;
        ImageReceiver imageReceiver3 = this.d;
        if (messageObject == null) {
            imageReceiver2.onDetachedFromWindow();
            imageReceiver.onDetachedFromWindow();
            imageReceiver3.onDetachedFromWindow();
            this.G = null;
            this.L = false;
            e6Var.d(0.0f, true);
            p6Var.q("", false, true);
            this.F = null;
            this.y = false;
            this.E = false;
            this.c0 = false;
            this.b0 = null;
            this.I = -1;
            this.J = null;
            this.O = null;
            o();
            return;
        }
        if (this.R) {
            imageReceiver2.onAttachedToWindow();
            imageReceiver.onAttachedToWindow();
            imageReceiver3.onAttachedToWindow();
        }
        ImageReceiver imageReceiver4 = z10 ? imageReceiver : imageReceiver2;
        int i14 = this.f;
        String restrictionReason = MessagesController.getInstance(i14).getRestrictionReason(messageObject.messageOwner.restriction_reason);
        int i15 = (int) ((AndroidUtilities.displaySize.x / i11) / AndroidUtilities.density);
        if (z10) {
            i15 = (((int) (AndroidUtilities.displaySize.x / AndroidUtilities.density)) * 3) / 5;
        }
        SparseArray sparseArray = this.Q.f;
        String str2 = (String) sparseArray.get(i15);
        if (str2 == null) {
            String str3 = i15 + "_" + i15 + "_isc";
            sparseArray.put(i15, str3);
            str2 = str3;
        }
        int photoSize = (i11 <= 2 || z10) ? AndroidUtilities.getPhotoSize() : 320;
        this.G = null;
        this.F = null;
        this.y = false;
        this.E = false;
        imageReceiver2.clearDecorators();
        imageReceiver.clearDecorators();
        if (!this.d0 || (storyViews = messageObject.storyItem.views) == null) {
            z11 = true;
            this.L = false;
            e6Var.d(0.0f, true);
            p6Var.q("", false, true);
        } else {
            int i16 = storyViews.views_count;
            this.L = i16 > 0;
            z11 = true;
            p6Var.q(AndroidUtilities.formatWholeNumber(i16, 0), false, true);
        }
        e6Var.d(this.L ? 1.0f : 0.0f, z11);
        Object obj = messageObject.parentStoriesList != null ? messageObject.storyItem : messageObject;
        if (TextUtils.isEmpty(restrictionReason)) {
            TL_stories.StoryItem storyItem4 = messageObject.storyItem;
            if (storyItem4 == null || !(storyItem4.media instanceof TLRPC.TL_messageMediaUnsupported)) {
                bi.t8 t8Var = messageObject.uploadingStory;
                if (t8Var == null || (str = t8Var.f) == null) {
                    TLRPC.Document document3 = messageObject.getDocument();
                    TLRPC.Photo photo3 = messageObject.getPhoto();
                    if (MessageObject.isVideoDocument(document3)) {
                        this.y = !messageObject.isLivePhoto();
                        this.E = messageObject.isLivePhoto();
                        if (i11 != 9 && !messageObject.isLivePhoto()) {
                            this.G = AndroidUtilities.formatShortDuration((int) messageObject.getDuration());
                        }
                        ImageLocation imageLocation = messageObject.mediaThumb;
                        if (imageLocation != null) {
                            BitmapDrawable bitmapDrawable = messageObject.strippedThumb;
                            if (bitmapDrawable != null) {
                                imageReceiver4.setImage(imageLocation, str2, bitmapDrawable, null, obj, 0);
                            } else {
                                imageReceiver4.setImage(imageLocation, str2, messageObject.mediaSmallThumb, p6.t(str2, "_b"), null, 0L, null, obj, 0);
                            }
                        } else if (messageObject.hasVideoCover()) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, photoSize, false, closestPhotoSizeWithSize, this.d0);
                            if (closestPhotoSizeWithSize2 == closestPhotoSizeWithSize) {
                                closestPhotoSizeWithSize = null;
                            }
                            if (messageObject.strippedThumb != null) {
                                imageReceiver4.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), str2, null, null, messageObject.strippedThumb, closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                            } else {
                                String str4 = str2;
                                imageReceiver4.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), str4, ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), p6.t(str4, "_b"), closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                            }
                        } else {
                            TLRPC.Document document4 = messageObject.getDocument();
                            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document4.thumbs, 50);
                            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document4.thumbs, photoSize, false, null, this.d0);
                            if (closestPhotoSizeWithSize3 == closestPhotoSizeWithSize4 && !this.d0) {
                                closestPhotoSizeWithSize4 = null;
                            }
                            if (closestPhotoSizeWithSize3 != null) {
                                if (messageObject.strippedThumb != null) {
                                    imageReceiver4.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, document4), str2, messageObject.strippedThumb, null, obj, 0);
                                } else {
                                    imageReceiver4.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, document4), str2, ImageLocation.getForDocument(closestPhotoSizeWithSize3, document4), p6.t(str2, "_b"), null, 0L, null, obj, 0);
                                }
                            }
                        }
                    } else if (photo3 != null && !messageObject.photoThumbs.isEmpty()) {
                        if (!messageObject.mediaExists) {
                            if (System.currentTimeMillis() - E0 > 5000) {
                                E0 = System.currentTimeMillis();
                                F0 = DownloadController.getInstance(i14).canDownloadMedia(messageObject);
                            }
                            if (!F0 && !this.d0) {
                                BitmapDrawable bitmapDrawable2 = messageObject.strippedThumb;
                                if (bitmapDrawable2 != null) {
                                    imageReceiver4.setImage(null, null, null, null, bitmapDrawable2, 0L, null, obj, 0);
                                } else {
                                    imageReceiver4.setImage(null, null, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50), messageObject.photoThumbsObject), "b", null, 0L, null, obj, 0);
                                }
                            }
                        }
                        ImageLocation imageLocation2 = messageObject.mediaThumb;
                        if (imageLocation2 != null) {
                            BitmapDrawable bitmapDrawable3 = messageObject.strippedThumb;
                            if (bitmapDrawable3 != null) {
                                imageReceiver4.setImage(imageLocation2, str2, bitmapDrawable3, null, obj, 0);
                            } else {
                                imageReceiver4.setImage(imageLocation2, str2, messageObject.mediaSmallThumb, p6.t(str2, "_b"), null, 0L, null, obj, 0);
                            }
                        } else {
                            TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                            TLRPC.PhotoSize closestPhotoSizeWithSize6 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, photoSize, false, closestPhotoSizeWithSize5, this.d0);
                            if (closestPhotoSizeWithSize6 == closestPhotoSizeWithSize5) {
                                closestPhotoSizeWithSize5 = null;
                            }
                            if (messageObject.strippedThumb != null) {
                                imageReceiver4.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize6, messageObject.photoThumbsObject), str2, null, null, messageObject.strippedThumb, closestPhotoSizeWithSize6 != null ? closestPhotoSizeWithSize6.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                            } else {
                                String str5 = str2;
                                imageReceiver4.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize6, messageObject.photoThumbsObject), str5, z10 ? null : ImageLocation.getForObject(closestPhotoSizeWithSize5, messageObject.photoThumbsObject), p6.t(str5, "_b"), closestPhotoSizeWithSize6 != null ? closestPhotoSizeWithSize6.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                            }
                        }
                    }
                } else {
                    imageReceiver4.setImage(ImageLocation.getForPath(str), str2, null, null, obj, 0);
                }
            } else {
                storyItem4.dialogId = messageObject.getDialogId();
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_emoji_recent).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(1090519039, PorterDuff.Mode.SRC_IN));
                imageReceiver4.setImageBitmap(new oq(new ColorDrawable(-13421773), mutate));
            }
            if (imageReceiver3.getBitmap() != null) {
                imageReceiver3.getBitmap().recycle();
                imageReceiver3.setImageBitmap((Bitmap) null);
            }
            if (imageReceiver4.getBitmap() != null && this.n.hasMediaSpoilers() && !this.n.isMediaSpoilersRevealed) {
                imageReceiver3.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver4.getBitmap()));
            }
            storyItem = messageObject.storyItem;
            if (storyItem != null) {
                imageReceiver4.addDecorator(new ub(storyItem));
            }
            setPrivacyType(g(messageObject));
            if (this.h) {
                long dialogId = messageObject.getDialogId();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                spannableStringBuilder.append((CharSequence) MessagesController.getInstance(i14).getPeerName(dialogId));
                org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(this, i11 == 2 ? 16.0f : 13.66f, i14);
                g5Var.c(dialogId);
                spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
                this.O = new f01(spannableStringBuilder, i11 == 2 ? 14.0f : 10.1666f, AndroidUtilities.bold());
            }
            o();
            invalidate();
        }
        imageReceiver4.setImageBitmap(getContext().getDrawable(R.drawable.photo_placeholder_in));
        if (imageReceiver3.getBitmap() != null) {
        }
        if (imageReceiver4.getBitmap() != null) {
            imageReceiver3.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver4.getBitmap()));
        }
        storyItem = messageObject.storyItem;
        if (storyItem != null) {
        }
        setPrivacyType(g(messageObject));
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
        StaticLayout staticLayout;
        this.G = str;
        boolean z11 = str != null;
        this.y = z11;
        this.E = false;
        if (z11 && (staticLayout = this.F) != null && !staticLayout.getText().toString().equals(str)) {
            this.F = null;
        }
        this.H = z10;
    }

    public final void n(float f7, float f10) {
        this.j0 = f7;
        this.k0 = f10;
        this.l0 = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) w7.p.a(this.l0 * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(pr.j);
        duration.addUpdateListener(new r(this, 5));
        duration.addListener(new org.telegram.ui.s0(this, 15));
        duration.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c A[Catch: Exception -> 0x0009, TRY_ENTER, TryCatch #1 {Exception -> 0x0009, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000c, B:10:0x0017, B:12:0x001b, B:13:0x0024, B:15:0x002b, B:17:0x0064, B:20:0x006c, B:21:0x006f, B:23:0x0074, B:25:0x0080, B:27:0x0084, B:29:0x0088, B:31:0x008c, B:32:0x00a0, B:34:0x00a6, B:35:0x00c0, B:37:0x0033, B:39:0x0039, B:40:0x0043, B:41:0x0045, B:43:0x004b, B:46:0x0052, B:47:0x0059), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074 A[Catch: Exception -> 0x0009, TryCatch #1 {Exception -> 0x0009, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000c, B:10:0x0017, B:12:0x001b, B:13:0x0024, B:15:0x002b, B:17:0x0064, B:20:0x006c, B:21:0x006f, B:23:0x0074, B:25:0x0080, B:27:0x0084, B:29:0x0088, B:31:0x008c, B:32:0x00a0, B:34:0x00a6, B:35:0x00c0, B:37:0x0033, B:39:0x0039, B:40:0x0043, B:41:0x0045, B:43:0x004b, B:46:0x0052, B:47:0x0059), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[Catch: Exception -> 0x0009, TryCatch #1 {Exception -> 0x0009, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000c, B:10:0x0017, B:12:0x001b, B:13:0x0024, B:15:0x002b, B:17:0x0064, B:20:0x006c, B:21:0x006f, B:23:0x0074, B:25:0x0080, B:27:0x0084, B:29:0x0088, B:31:0x008c, B:32:0x00a0, B:34:0x00a6, B:35:0x00c0, B:37:0x0033, B:39:0x0039, B:40:0x0043, B:41:0x0045, B:43:0x004b, B:46:0x0052, B:47:0x0059), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        String string;
        double duration;
        int i10;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        try {
            MessageObject messageObject = this.n;
            if (messageObject == null) {
                setContentDescription(null);
                return;
            }
            boolean isStory = messageObject.isStory();
            StringBuilder sb2 = new StringBuilder();
            if (isStory && this.f0) {
                sb2.append(LocaleController.getString(R.string.AccDescrStoryPinned));
            }
            if (!messageObject.isLivePhoto()) {
                if (messageObject.isRoundVideo()) {
                    string = LocaleController.getString(R.string.AccDescrRoundVideo);
                    duration = messageObject.getDuration();
                } else {
                    if (!messageObject.isVideo() && !messageObject.isVideoStory()) {
                        string = LocaleController.getString(R.string.AttachPhoto);
                    }
                    string = LocaleController.getString(R.string.AttachVideo);
                    duration = messageObject.getDuration();
                }
                i10 = (int) duration;
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(string);
                if (i10 > 0) {
                    sb2.append(", ");
                    sb2.append(LocaleController.formatDuration(i10));
                }
                if (isStory && (storyItem = messageObject.storyItem) != null) {
                    storyViews = storyItem.views;
                    if (storyViews != null && storyViews.views_count > 0) {
                        sb2.append(", ");
                        sb2.append(LocaleController.formatPluralString("Views", messageObject.storyItem.views.views_count, new Object[0]));
                    }
                    if (messageObject.storyItem.date > 0) {
                        sb2.append(", ");
                        sb2.append(LocaleController.formatString(R.string.AccDescrPostedDate, LocaleController.formatDateAudio(messageObject.storyItem.date, false)));
                    }
                }
                setContentDescription(sb2.toString());
            }
            string = LocaleController.getString(R.string.AccDescrLivePhoto);
            i10 = 0;
            if (sb2.length() > 0) {
            }
            sb2.append(string);
            if (i10 > 0) {
            }
            if (isStory) {
                storyViews = storyItem.views;
                if (storyViews != null) {
                    sb2.append(", ");
                    sb2.append(LocaleController.formatPluralString("Views", messageObject.storyItem.views.views_count, new Object[0]));
                }
                if (messageObject.storyItem.date > 0) {
                }
            }
            setContentDescription(sb2.toString());
        } catch (Exception e7) {
            FileLog.e(e7);
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
            this.c.onAttachedToWindow();
            this.b.onAttachedToWindow();
            this.d.onAttachedToWindow();
        }
        wh.g gVar = this.m0;
        if (gVar != null) {
            if (gVar.i) {
                this.m0 = wh.g.e(this);
            } else {
                gVar.a(this);
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
            this.c.onDetachedFromWindow();
            this.b.onDetachedFromWindow();
            this.d.onDetachedFromWindow();
        }
        wh.g gVar = this.m0;
        if (gVar != null) {
            gVar.b(this);
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
        } catch (Exception e7) {
            FileLog.e(e7);
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
        gd gdVar = this.v0;
        if (gdVar == null || !gdVar.b(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void p() {
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            return;
        }
        MessageObject messageObject = this.n;
        if (messageObject != null && messageObject.hasMediaSpoilers()) {
            if (this.m0 == null) {
                this.m0 = wh.g.e(this);
            }
        } else {
            wh.g gVar = this.m0;
            if (gVar != null) {
                gVar.b(this);
                this.m0 = null;
            }
        }
    }

    public final boolean q(float f7) {
        int i10;
        if (this.d0 && this.r < 5) {
            int dp = AndroidUtilities.dp(26.0f) + ((int) this.N.d());
            if (this.y) {
                int dp2 = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.F;
                i10 = dp2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.H ? AndroidUtilities.dp(10.0f) : 0);
            } else {
                i10 = 0;
            }
            if (dp + ((dp <= 0 || i10 <= 0) ? 0 : AndroidUtilities.dp(8.0f)) + i10 > f7) {
                return true;
            }
        }
        return false;
    }

    public void setGradientView(t00 t00Var) {
        this.s = t00Var;
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
            checkBoxBase.h(-1, org.telegram.ui.ActionBar.j6.Lh, org.telegram.ui.ActionBar.j6.k7);
            this.P.k(true);
            this.P.d(0);
            this.P.e(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            if (this.R) {
                this.P.l = true;
            }
            gd gdVar = new gd(this);
            this.v0 = gdVar;
            gdVar.h = new g(this, 6);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.N == drawable || super.verifyDrawable(drawable);
    }

    public void h() {
    }
}
