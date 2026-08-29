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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class p7 extends FrameLayout {
    public static long A0;
    public static boolean B0;
    public boolean A;
    public StaticLayout B;
    public String C;
    public boolean D;
    public int E;
    public Bitmap F;
    public Paint G;
    public boolean H;
    public final org.telegram.ui.Components.d6 I;
    public final org.telegram.ui.Components.n6 J;
    public zz0 K;
    public CheckBoxBase L;
    public final o7 M;
    public boolean N;
    public float O;
    public float P;
    public float Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public GradientDrawable U;
    public boolean V;
    public boolean W;
    public int a;
    public boolean a0;
    public final ImageReceiver b;
    public boolean b0;
    public final ImageReceiver c;
    public final Path c0;
    public final ImageReceiver d;
    public gh.k d0;
    public so0 e;
    public float e0;
    public final int f;
    public float f0;
    public float g0;
    public boolean h;
    public float h0;
    public gh.j i0;
    public final Path j0;
    public zz0 k0;
    public zz0 l0;
    public zz0 m0;
    public MessageObject n;
    public int n0;
    public final Paint o0;
    public final Paint p0;
    public final org.telegram.ui.Components.d6 q0;
    public int r;
    public ad r0;
    public p00 s;
    public boolean s0;
    public boolean t0;
    public final RectF u0;
    public p7 v;
    public Path v0;
    public float w;
    public ValueAnimator w0;
    public float x;
    public float x0;
    public boolean y;
    public boolean y0;
    public final org.telegram.ui.Components.d6 z0;

    public p7(Context context, o7 o7Var, int i10) {
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
        this.D = true;
        jr jrVar = jr.h;
        this.I = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.J = n6Var;
        this.c0 = new Path();
        this.j0 = new Path();
        this.n0 = 0;
        this.o0 = new Paint(1);
        this.p0 = new Paint(1);
        this.q0 = new org.telegram.ui.Components.d6(this, 0L, 200L, jrVar);
        this.u0 = new RectF();
        this.z0 = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.M = o7Var;
        this.f = i10;
        i(false, false);
        imageReceiver2.setParentView(this);
        imageReceiver.setParentView(this);
        imageReceiver3.setParentView(this);
        imageReceiver2.setDelegate(new fa(this, 6));
        n6Var.setCallback(this);
        n6Var.t(AndroidUtilities.dp(12.0f));
        n6Var.r(-1);
        n6Var.u(AndroidUtilities.bold());
        n6Var.G = AndroidUtilities.displaySize.x;
        setWillNotDraw(false);
    }

    private float getPadding() {
        if (this.O != 0.0f) {
            float f9 = this.P;
            if (f9 == 9.0f || this.r == 9) {
                if (f9 == 9.0f) {
                    return com.google.android.recaptcha.internal.a.z(1.0f, this.O, AndroidUtilities.dpf2(2.0f), AndroidUtilities.dpf2(1.0f) * this.O);
                }
                return com.google.android.recaptcha.internal.a.z(1.0f, this.O, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(2.0f) * this.O);
            }
        }
        return this.r == 9 ? AndroidUtilities.dpf2(1.0f) : AndroidUtilities.dpf2(2.0f);
    }

    private void setPrivacyType(int i10) {
        if (this.E == i10) {
            return;
        }
        this.E = i10;
        this.F = null;
        int i11 = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 100 ? 0 : R.drawable.msg_pin_mini : R.drawable.msg_folders_groups : R.drawable.msg_folders_private : R.drawable.msg_stories_closefriends;
        if (i11 != 0) {
            Context context = getContext();
            HashMap hashMap = this.M.g;
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
            this.F = bitmap;
        }
        invalidate();
    }

    public final void a(Canvas canvas, float f9, float f10, float f11) {
        canvas.save();
        if (this.v0 == null) {
            this.v0 = new Path();
        }
        this.v0.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, f9, f10);
        float dp = AndroidUtilities.dp(12.0f) * f11;
        this.v0.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        this.v0.close();
        canvas.clipPath(this.v0);
        canvas.scale(f9 / getWidth(), f10 / getHeight());
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

    public final void b(Canvas canvas, RectF rectF, float f9) {
        if (this.W) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.h && this.K != null) {
                float dp = AndroidUtilities.dp(5.33f);
                zz0 zz0Var = this.K;
                zz0Var.p = (int) (rectF.width() - (2.0f * dp));
                zz0Var.t = AndroidUtilities.dp(14.0f);
                zz0Var.a.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.g6.l1(0.4f * f9, -16777216));
                zz0Var.c(rectF.left + dp, rectF.top + AndroidUtilities.dp(this.r <= 2 ? 15.0f : 11.33f), 1.0f, org.telegram.ui.ActionBar.g6.l1(f9, -1), canvas);
            }
        }
    }

    public final void c(Canvas canvas, RectF rectF, float f9) {
        String str;
        float f10 = f9;
        if (this.y) {
            ImageReceiver imageReceiver = this.c;
            if (imageReceiver == null || imageReceiver.getVisible()) {
                float dp = (AndroidUtilities.dp(20.0f) * this.x0) + rectF.width();
                float width = rectF.width() / dp;
                if (f10 < 1.0f) {
                    f10 = (float) Math.pow(f10, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i10 = this.r;
                o7 o7Var = this.M;
                if (i10 != 9 && this.B == null && (str = this.C) != null) {
                    this.B = new StaticLayout(this.C, o7Var.a, (int) Math.ceil(o7Var.a.measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i10 >= 9 || this.C == null) && this.B != null) {
                    this.B = null;
                }
                boolean q6 = q(dp);
                int dp2 = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.B;
                int width2 = dp2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.D ? AndroidUtilities.dp(10.0f) : 0);
                canvas.translate(AndroidUtilities.dp(5.0f), (((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f)) - (q6 ? AndroidUtilities.dp(22.0f) : 0));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, width2, AndroidUtilities.dp(17.0f));
                int alpha = org.telegram.ui.ActionBar.g6.i2.getAlpha();
                org.telegram.ui.ActionBar.g6.i2.setAlpha((int) (alpha * f10));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.i2);
                org.telegram.ui.ActionBar.g6.i2.setAlpha(alpha);
                if (this.D) {
                    canvas.save();
                    float dp3 = this.B == null ? AndroidUtilities.dp(5.0f) : AndroidUtilities.dp(4.0f);
                    int dp4 = AndroidUtilities.dp(17.0f);
                    Drawable drawable = o7Var.c;
                    Drawable drawable2 = o7Var.c;
                    canvas.translate(dp3, (dp4 - drawable.getIntrinsicHeight()) / 2.0f);
                    drawable2.setAlpha((int) (this.w * 255.0f * f10));
                    drawable2.draw(canvas);
                    canvas.restore();
                }
                if (this.B != null) {
                    canvas.translate(AndroidUtilities.dp((this.D ? 10 : 0) + 4), (AndroidUtilities.dp(17.0f) - this.B.getHeight()) / 2.0f);
                    TextPaint textPaint = o7Var.a;
                    TextPaint textPaint2 = o7Var.a;
                    int alpha2 = textPaint.getAlpha();
                    textPaint2.setAlpha((int) (alpha2 * f10));
                    this.B.draw(canvas);
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
    public final void d(float f9, float f10, float f11, Canvas canvas, boolean z10) {
        float f12;
        boolean z11;
        float f13;
        Canvas canvas2;
        float f14;
        float f15;
        float f16;
        ImageReceiver imageReceiver;
        float f17;
        p7 p7Var;
        float dp;
        float f18;
        Drawable drawable;
        float f19;
        ImageReceiver imageReceiver2;
        Canvas canvas3;
        float f20;
        int i10;
        p00 p00Var;
        float padding = getPadding() * f9;
        float f21 = this.R ? padding : 0.0f;
        float e10 = this.z0.e(this.y0);
        float measuredWidth = ((getMeasuredWidth() - f21) - padding) * this.x;
        float measuredHeight = ((getMeasuredHeight() - 0.0f) - padding) * this.x;
        ImageReceiver imageReceiver3 = z10 ? this.b : this.c;
        imageReceiver3.setAlpha(f10);
        if (this.O > 0.5f && this.P != 9.0f && this.r != 9) {
            float f22 = f9 * 2.0f;
            measuredWidth -= f22;
            measuredHeight -= f22;
        }
        if ((this.n != null || this.n0 == 1) && imageReceiver3.hasBitmapImage() && imageReceiver3.getCurrentAlpha() == 1.0f && this.w == 1.0f) {
            f12 = 1.0f;
            z11 = true;
            f13 = 0.0f;
        } else {
            if (getParent() == null || (p00Var = this.s) == null) {
                f12 = 1.0f;
                z11 = true;
                f13 = 0.0f;
            } else {
                int measuredWidth2 = ((View) getParent()).getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                float f23 = -getX();
                p00Var.K = measuredWidth2;
                p00Var.L = measuredHeight2;
                p00Var.M = f23;
                this.s.e();
                this.s.h();
                float f24 = (this.O <= 0.5f || this.P == 9.0f || this.r == 9) ? 0.0f : 1.0f;
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
        CheckBoxBase checkBoxBase = this.L;
        o7 o7Var = this.M;
        if (((checkBoxBase == null || !checkBoxBase.q) && !PhotoViewer.M1(this.n)) || this.s0) {
            canvas2 = canvas;
            f14 = f21;
        } else {
            canvas2 = canvas;
            f14 = f21;
            canvas2.drawRect(f14, 0.0f, (f21 + measuredWidth) - padding, (measuredHeight + f13) - padding, o7Var.b);
        }
        boolean z12 = this.W;
        ImageReceiver imageReceiver4 = this.d;
        if (z12 && this.r == z11) {
            float height = getHeight() * 0.72f;
            GradientDrawable gradientDrawable = this.U;
            if (gradientDrawable != null) {
                gradientDrawable.setBounds(0, 0, getWidth(), getHeight());
                this.U.draw(canvas2);
            } else if (!this.V && imageReceiver3.getBitmap() != null) {
                this.V = z11;
                Bitmap bitmap = imageReceiver3.getBitmap();
                boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
                if (bitmap == null) {
                    int[] iArr = {0, 0};
                    if (this.V) {
                        this.U = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
                        invalidate();
                        this.V = false;
                    }
                } else {
                    int[] b10 = nh.n0.b(bitmap, q6);
                    if (this.V) {
                        this.U = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, b10);
                        invalidate();
                        this.V = false;
                    }
                }
            }
            imageReceiver3.setImageCoords((measuredWidth - height) / 2.0f, 0.0f, height, getHeight());
        } else if (this.x0 > 0.0f) {
            float dp2 = AndroidUtilities.dp(this.s0 ? 7.0f : 10.0f) * this.x0;
            float f28 = f14 + dp2;
            float f29 = padding + dp2;
            float f30 = dp2 * 2.0f;
            float f31 = measuredWidth - f30;
            float f32 = measuredHeight - f30;
            imageReceiver3.setImageCoords(f28, f29, f31, f32);
            imageReceiver4.setImageCoords(f28, f29, f31, f32);
        } else {
            float f33 = (this.O <= 0.5f || this.P == 9.0f || this.r == 9) ? 0.0f : 1.0f;
            float f34 = f14 + f33;
            float f35 = f33 + padding;
            imageReceiver3.setImageCoords(f34, f35, measuredWidth, measuredHeight);
            imageReceiver4.setImageCoords(f34, f35, measuredWidth, measuredHeight);
        }
        imageReceiver3.setRoundRadius(AndroidUtilities.lerp((this.R && this.T) ? AndroidUtilities.dp(18.0f) : AndroidUtilities.dp(f12), AndroidUtilities.dp(8.0f), this.x0), AndroidUtilities.lerp((this.S && this.T) ? AndroidUtilities.dp(18.0f) : AndroidUtilities.dp(f12), AndroidUtilities.dp(8.0f), this.x0), AndroidUtilities.lerp(AndroidUtilities.dp(f12), AndroidUtilities.dp(8.0f), this.x0), AndroidUtilities.lerp(AndroidUtilities.dp(f12), AndroidUtilities.dp(8.0f), this.x0));
        if (this.s0) {
            canvas2.save();
            if (this.t0 || this.y0) {
                canvas2.translate(imageReceiver3.getCenterX(), imageReceiver3.getCenterY());
                if (this.e == null) {
                    this.e = new so0(this);
                }
                this.e.a(canvas2, Math.max(this.x0, e10));
                float f36 = f12 - (e10 * 0.075f);
                canvas2.scale(f36, f36);
                canvas2.translate(-imageReceiver3.getCenterX(), -imageReceiver3.getCenterY());
            }
        }
        if (PhotoViewer.M1(this.n)) {
            f15 = e10;
            f16 = measuredWidth;
            imageReceiver = imageReceiver3;
            f17 = 0.075f;
            p7Var = this;
        } else {
            imageReceiver3.draw(canvas2);
            MessageObject messageObject = this.n;
            if (messageObject == null || !messageObject.hasMediaSpoilers() || this.n.isMediaSpoilersRevealedInSharedMedia) {
                f15 = e10;
                f16 = measuredWidth;
                imageReceiver = imageReceiver3;
                f17 = 0.075f;
                p7Var = this;
            } else {
                canvas2.save();
                canvas2.clipRect(f14, 0.0f, (f14 + measuredWidth) - padding, (measuredHeight + 0.0f) - padding);
                if (this.e0 != 0.0f) {
                    Path path = this.c0;
                    path.rewind();
                    path.addCircle(this.f0, this.g0, this.h0 * this.e0, Path.Direction.CW);
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                }
                imageReceiver4.draw(canvas2);
                if (this.i0 != null) {
                    canvas2.clipRect(imageReceiver3.getImageX(), imageReceiver3.getImageY(), imageReceiver3.getImageX2(), imageReceiver3.getImageY2());
                    f19 = measuredWidth;
                    imageReceiver2 = imageReceiver3;
                    Canvas canvas4 = canvas2;
                    f20 = e10;
                    this.i0.c(canvas4, this, (int) imageReceiver3.getImageWidth(), (int) imageReceiver3.getImageHeight(), 1.0f, false);
                    canvas3 = canvas4;
                    p7Var = this;
                } else {
                    f19 = measuredWidth;
                    imageReceiver2 = imageReceiver3;
                    canvas3 = canvas2;
                    p7Var = this;
                    f20 = e10;
                    if (p7Var.d0 == null) {
                        p7Var.d0 = new gh.k();
                    }
                    p7Var.d0.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    p7Var.d0.setBounds((int) imageReceiver2.getImageX(), (int) imageReceiver2.getImageY(), (int) imageReceiver2.getImageX2(), (int) imageReceiver2.getImageY2());
                    p7Var.d0.draw(canvas3);
                }
                canvas3.restore();
                if (p7Var.n.isSensitive()) {
                    if (p7Var.k0 == null) {
                        f17 = 0.075f;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.x3.i(R.string.MessageSensitiveContent, new StringBuilder("x ")));
                        spannableStringBuilder.setSpan(new iq(R.drawable.filled_sensitive, 0), 0, 1, 33);
                        p7Var.k0 = new zz0(spannableStringBuilder, 14.0f, AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                    } else {
                        f17 = 0.075f;
                    }
                    zz0 zz0Var = p7Var.k0;
                    int i11 = 13;
                    if (f19 < (AndroidUtilities.dp(13) * 2) + zz0Var.c) {
                        if (p7Var.l0 == null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.x3.i(R.string.MessageSensitiveContentShort, new StringBuilder("x ")));
                            spannableStringBuilder2.setSpan(new iq(R.drawable.filled_sensitive, 0), 0, 1, 33);
                            p7Var.l0 = new zz0(spannableStringBuilder2, 14.0f, AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                        }
                        zz0Var = p7Var.l0;
                    }
                    if (f19 < (AndroidUtilities.dp(26) * 2) + zz0Var.c) {
                        if (p7Var.m0 == null) {
                            p7Var.m0 = new zz0(new SpannableStringBuilder(LocaleController.getString(R.string.MessageSensitiveContentShort)), 13.0f, AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                        }
                        zz0Var = p7Var.m0;
                        i11 = 10;
                        i10 = 28;
                    } else {
                        i10 = 32;
                    }
                    float imageWidth = (imageReceiver2.getImageWidth() / 2.0f) + imageReceiver2.getImageX();
                    float imageHeight = (imageReceiver2.getImageHeight() / 2.0f) + imageReceiver2.getImageY();
                    float dp3 = zz0Var.c + AndroidUtilities.dp(i11 + i11);
                    float dp4 = AndroidUtilities.dp(i10) / 2.0f;
                    zz0 zz0Var2 = zz0Var;
                    float lerp = AndroidUtilities.lerp(0.8f, 1.0f, f12 - p7Var.e0);
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f37 = dp3 / 2.0f;
                    float f38 = f37 * lerp;
                    float f39 = dp4 * lerp;
                    f16 = f19;
                    imageReceiver = imageReceiver2;
                    rectF.set(imageWidth - f38, imageHeight - f39, f38 + imageWidth, imageHeight + f39);
                    Path path2 = p7Var.j0;
                    path2.reset();
                    path2.addRoundRect(rectF, dp4, dp4, Path.Direction.CW);
                    canvas3.save();
                    canvas3.clipPath(path2);
                    float alpha = imageReceiver4.getAlpha();
                    imageReceiver4.setAlpha((1.0f - p7Var.e0) * alpha);
                    imageReceiver4.draw(canvas3);
                    imageReceiver4.setAlpha(alpha);
                    canvas3.restore();
                    Paint S0 = org.telegram.ui.ActionBar.g6.S0("paintChatTimeBackground");
                    int alpha2 = S0.getAlpha();
                    f15 = f20;
                    S0.setAlpha((int) org.telegram.messenger.x3.y(1.0f, p7Var.e0, alpha2, 0.35f));
                    canvas3.drawRoundRect(rectF, dp4, dp4, S0);
                    S0.setAlpha(alpha2);
                    canvas3.save();
                    canvas3.scale(lerp, lerp, imageWidth, imageHeight);
                    Canvas canvas5 = canvas3;
                    zz0Var2.c(AndroidUtilities.dp(i11) + (imageWidth - f37), imageHeight, 1.0f - p7Var.e0, -1, canvas5);
                    canvas2 = canvas5;
                    canvas2.restore();
                } else {
                    f15 = f20;
                    f16 = f19;
                    imageReceiver = imageReceiver2;
                    f17 = 0.075f;
                    canvas2 = canvas3;
                }
                p7Var.invalidate();
            }
            if (!p7Var.h) {
                float f40 = p7Var.Q;
                if (f40 > 0.0f) {
                    o7Var.e.setColor(i0.a.k(-16777216, (int) (f40 * 0.5f * 255.0f)));
                    canvas2.drawRect(imageReceiver.getDrawRegion(), o7Var.e);
                }
            }
        }
        if (p7Var.a0) {
            Paint paint = p7Var.o0;
            paint.setColor(805306368);
            canvas2.drawRect(imageReceiver.getDrawRegion(), paint);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint2 = p7Var.p0;
            paint2.setStyle(style);
            paint2.setColor(-1);
            paint2.setStrokeWidth(AndroidUtilities.dp(3.0f));
            paint2.setStrokeJoin(Paint.Join.ROUND);
            paint2.setStrokeCap(Paint.Cap.ROUND);
            float dp5 = AndroidUtilities.dp(18.0f);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(imageReceiver.getCenterX() - dp5, imageReceiver.getCenterY() - dp5, imageReceiver.getCenterX() + dp5, imageReceiver.getCenterY() + dp5);
            float currentTimeMillis = ((System.currentTimeMillis() % 1500) / 1500.0f) * 360.0f;
            MessageObject messageObject2 = p7Var.n;
            canvas2.drawArc(rectF2, currentTimeMillis, p7Var.q0.d(AndroidUtilities.lerp(0.15f, 0.95f, messageObject2 != null ? messageObject2.getProgress() : 0.0f), false) * 360.0f, false, paint2);
            p7Var.invalidate();
        }
        float imageX = imageReceiver.getImageX();
        float imageY = imageReceiver.getImageY();
        float imageX2 = imageReceiver.getImageX2();
        float imageY2 = imageReceiver.getImageY2();
        RectF rectF3 = p7Var.u0;
        rectF3.set(imageX, imageY, imageX2, imageY2);
        if (p7Var.A && (drawable = org.telegram.ui.ActionBar.g6.l3) != null) {
            drawable.setBounds((int) (rectF3.left + AndroidUtilities.dp(8.0f)), (int) (rectF3.top + AndroidUtilities.dp(8.0f)), (int) ((org.telegram.ui.ActionBar.g6.l3.getIntrinsicWidth() * 0.75f) + rectF3.left + AndroidUtilities.dp(8.0f)), (int) ((org.telegram.ui.ActionBar.g6.l3.getIntrinsicHeight() * 0.75f) + rectF3.top + AndroidUtilities.dp(8.0f)));
            org.telegram.ui.ActionBar.g6.l3.draw(canvas2);
        }
        p7Var.c(canvas2, rectF3, f11);
        p7Var.f(canvas2, rectF3, f11);
        if (p7Var.h) {
            p7Var.b(canvas2, rectF3, f11);
        } else {
            p7Var.e(canvas2, rectF3, f11);
        }
        if (p7Var.s0) {
            canvas2.restore();
        }
        CheckBoxBase checkBoxBase2 = p7Var.L;
        if (checkBoxBase2 != null) {
            if (p7Var.n0 != 1) {
            }
            canvas2.save();
            if (p7Var.s0 && (p7Var.t0 || p7Var.y0)) {
                canvas2.translate(imageReceiver.getCenterX(), imageReceiver.getCenterY());
                if (p7Var.e == null) {
                    p7Var.e = new so0(p7Var);
                }
                float f41 = f15;
                p7Var.e.a(canvas2, Math.max(p7Var.x0, f41) * 0.5f);
                float f42 = 1.0f - (f41 * f17);
                canvas2.scale(f42, f42);
                canvas2.translate(-imageReceiver.getCenterX(), -imageReceiver.getCenterY());
            }
            if (p7Var.n0 == 1) {
                dp = ((f16 + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(25.0f)) - AndroidUtilities.dp(4.0f);
                f18 = AndroidUtilities.dp(4.0f);
            } else if (p7Var.s0) {
                dp = (f16 + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp((p7Var.x0 * 5.0f) + 22.0f);
                f18 = (AndroidUtilities.dp(5.0f) * p7Var.x0) + AndroidUtilities.dp(-2.0f);
            } else {
                dp = (f16 + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(25.0f);
                f18 = 0.0f;
            }
            canvas2.translate(dp, f18);
            p7Var.L.a(canvas2);
            if (p7Var.r0 != null) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(dp, f18, p7Var.L.b.width() + dp, p7Var.L.b.height() + f18);
                ad adVar = p7Var.r0;
                adVar.i = false;
                adVar.c = 0;
                adVar.a(rectF4);
            }
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void e(Canvas canvas, RectF rectF, float f9) {
        Bitmap bitmap;
        if (!this.W || (bitmap = this.F) == null || bitmap.isRecycled()) {
            return;
        }
        int dp = AndroidUtilities.dp((rectF.width() / ((AndroidUtilities.dp(20.0f) * this.x0) + rectF.width())) * 17.33f);
        canvas.save();
        float f10 = dp;
        canvas.translate((rectF.right - f10) - AndroidUtilities.dp(5.66f), rectF.top + AndroidUtilities.dp(5.66f));
        if (this.G == null) {
            this.G = new Paint(3);
        }
        this.G.setAlpha((int) (f9 * 255.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, f10, f10);
        canvas.drawBitmap(this.F, (Rect) null, rectF2, this.G);
        canvas.restore();
    }

    public final void f(Canvas canvas, RectF rectF, float f9) {
        if (this.W) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.r < 5) {
                float dp = (AndroidUtilities.dp(20.0f) * this.x0) + rectF.width();
                float width = rectF.width() / dp;
                boolean q6 = q(dp);
                float e10 = this.I.e(this.H);
                float f10 = f9 * e10;
                if (f10 < 1.0f) {
                    f10 = (float) Math.pow(f10, 8.0d);
                }
                if (e10 <= 0.0f) {
                    return;
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, q6 ? 0.0f : rectF.width(), rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                float dp2 = AndroidUtilities.dp(26.0f);
                org.telegram.ui.Components.n6 n6Var = this.J;
                float d = n6Var.d() + dp2;
                canvas.translate(q6 ? AndroidUtilities.dp(5.0f) : (rectF.width() - AndroidUtilities.dp(5.0f)) - d, ((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, d, AndroidUtilities.dp(17.0f));
                int alpha = org.telegram.ui.ActionBar.g6.i2.getAlpha();
                org.telegram.ui.ActionBar.g6.i2.setAlpha((int) (alpha * f10));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.i2);
                org.telegram.ui.ActionBar.g6.i2.setAlpha(alpha);
                canvas.save();
                float dp3 = AndroidUtilities.dp(3.0f);
                int dp4 = AndroidUtilities.dp(17.0f);
                o7 o7Var = this.M;
                canvas.translate(dp3, (dp4 - o7Var.d.getBounds().height()) / 2.0f);
                o7Var.d.setAlpha((int) (this.w * 255.0f * f10));
                o7Var.d.draw(canvas);
                canvas.restore();
                canvas.translate(AndroidUtilities.dp(22.0f), 0.0f);
                n6Var.setBounds(0, 0, (int) d, AndroidUtilities.dp(17.0f));
                n6Var.w = (int) (f10 * 255.0f);
                n6Var.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final int g(MessageObject messageObject) {
        TL_stories.StoryItem storyItem;
        if (this.b0) {
            return 100;
        }
        if (!this.W || messageObject == null || (storyItem = messageObject.storyItem) == null) {
            return -1;
        }
        if (storyItem.parsedPrivacy == null) {
            storyItem.parsedPrivacy = new nh.c9(this.f, storyItem.privacy);
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
        return this.n0;
    }

    public final void i(boolean z10, boolean z11) {
        int i10;
        CheckBoxBase checkBoxBase = this.L;
        if ((checkBoxBase != null && checkBoxBase.q) == z10) {
            return;
        }
        if (checkBoxBase == null) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, null);
            this.L = checkBoxBase2;
            checkBoxBase2.h(-1, org.telegram.ui.ActionBar.g6.Lh, org.telegram.ui.ActionBar.g6.k7);
            if (this.s0 && (i10 = this.a) != 0) {
                CheckBoxBase checkBoxBase3 = this.L;
                int v = org.telegram.ui.ActionBar.g6.v(i10, org.telegram.ui.ActionBar.g6.l1(0.25f, -1));
                if (checkBoxBase3.x != v) {
                    checkBoxBase3.x = v;
                    checkBoxBase3.b();
                }
            }
            this.L.k(false);
            this.L.d(1);
            this.L.e(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            if (this.N) {
                this.L.l = true;
            }
        }
        this.L.f(-1, z10, z11);
        ValueAnimator valueAnimator = this.w0;
        if (valueAnimator != null) {
            this.w0 = null;
            valueAnimator.cancel();
        }
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x0, z10 ? 1.0f : 0.0f);
            this.w0 = ofFloat;
            ofFloat.addUpdateListener(new cg.c1(this, 6));
            this.w0.setDuration(200L);
            this.w0.addListener(new bg.z2(24, this, z10));
            this.w0.start();
        } else {
            this.x0 = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void j(float f9, boolean z10) {
        if (this.x != f9) {
            this.x = f9;
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
                        int i13 = this.E;
                        if ((i13 == 100) == this.b0 && i13 == g(messageObject) && !z10) {
                            return;
                        }
                    }
                }
            }
        }
        this.n = messageObject;
        this.W = messageObject != null && messageObject.isStory();
        MessageObject messageObject4 = this.n;
        this.a0 = (messageObject4 == null || messageObject4.uploadingStory == null) ? false : true;
        p();
        org.telegram.ui.Components.n6 n6Var = this.J;
        org.telegram.ui.Components.d6 d6Var = this.I;
        ImageReceiver imageReceiver = this.b;
        ImageReceiver imageReceiver2 = this.c;
        ImageReceiver imageReceiver3 = this.d;
        if (messageObject == null) {
            imageReceiver2.onDetachedFromWindow();
            imageReceiver.onDetachedFromWindow();
            imageReceiver3.onDetachedFromWindow();
            this.C = null;
            this.H = false;
            d6Var.d(0.0f, true);
            n6Var.q("", false, true);
            this.B = null;
            this.y = false;
            this.A = false;
            this.V = false;
            this.U = null;
            this.E = -1;
            this.F = null;
            this.K = null;
            o();
            return;
        }
        if (this.N) {
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
        SparseArray sparseArray = this.M.f;
        String str2 = (String) sparseArray.get(i15);
        if (str2 == null) {
            String str3 = i15 + "_" + i15 + "_isc";
            sparseArray.put(i15, str3);
            str2 = str3;
        }
        int photoSize = (i11 <= 2 || z10) ? AndroidUtilities.getPhotoSize() : 320;
        this.C = null;
        this.B = null;
        this.y = false;
        this.A = false;
        imageReceiver2.clearDecorators();
        imageReceiver.clearDecorators();
        if (!this.W || (storyViews = messageObject.storyItem.views) == null) {
            z11 = true;
            this.H = false;
            d6Var.d(0.0f, true);
            n6Var.q("", false, true);
        } else {
            int i16 = storyViews.views_count;
            this.H = i16 > 0;
            z11 = true;
            n6Var.q(AndroidUtilities.formatWholeNumber(i16, 0), false, true);
        }
        d6Var.d(this.H ? 1.0f : 0.0f, z11);
        Object obj = messageObject.parentStoriesList != null ? messageObject.storyItem : messageObject;
        if (TextUtils.isEmpty(restrictionReason)) {
            TL_stories.StoryItem storyItem4 = messageObject.storyItem;
            if (storyItem4 == null || !(storyItem4.media instanceof TLRPC.TL_messageMediaUnsupported)) {
                lh.r6 r6Var = messageObject.uploadingStory;
                if (r6Var == null || (str = r6Var.f) == null) {
                    TLRPC.Document document3 = messageObject.getDocument();
                    TLRPC.Photo photo3 = messageObject.getPhoto();
                    if (MessageObject.isVideoDocument(document3)) {
                        this.y = !messageObject.isLivePhoto();
                        this.A = messageObject.isLivePhoto();
                        if (i11 != 9 && !messageObject.isLivePhoto()) {
                            this.C = AndroidUtilities.formatShortDuration((int) messageObject.getDuration());
                        }
                        ImageLocation imageLocation = messageObject.mediaThumb;
                        if (imageLocation != null) {
                            BitmapDrawable bitmapDrawable = messageObject.strippedThumb;
                            if (bitmapDrawable != null) {
                                imageReceiver4.setImage(imageLocation, str2, bitmapDrawable, null, obj, 0);
                            } else {
                                imageReceiver4.setImage(imageLocation, str2, messageObject.mediaSmallThumb, u3.c.k(str2, "_b"), null, 0L, null, obj, 0);
                            }
                        } else if (messageObject.hasVideoCover()) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, photoSize, false, closestPhotoSizeWithSize, this.W);
                            if (closestPhotoSizeWithSize2 == closestPhotoSizeWithSize) {
                                closestPhotoSizeWithSize = null;
                            }
                            if (messageObject.strippedThumb != null) {
                                imageReceiver4.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), str2, null, null, messageObject.strippedThumb, closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                            } else {
                                String str4 = str2;
                                imageReceiver4.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), str4, ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), u3.c.k(str4, "_b"), closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                            }
                        } else {
                            TLRPC.Document document4 = messageObject.getDocument();
                            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document4.thumbs, 50);
                            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document4.thumbs, photoSize, false, null, this.W);
                            if (closestPhotoSizeWithSize3 == closestPhotoSizeWithSize4 && !this.W) {
                                closestPhotoSizeWithSize4 = null;
                            }
                            if (closestPhotoSizeWithSize3 != null) {
                                if (messageObject.strippedThumb != null) {
                                    imageReceiver4.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, document4), str2, messageObject.strippedThumb, null, obj, 0);
                                } else {
                                    imageReceiver4.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, document4), str2, ImageLocation.getForDocument(closestPhotoSizeWithSize3, document4), u3.c.k(str2, "_b"), null, 0L, null, obj, 0);
                                }
                            }
                        }
                    } else if (photo3 != null && !messageObject.photoThumbs.isEmpty()) {
                        if (!messageObject.mediaExists) {
                            if (System.currentTimeMillis() - A0 > 5000) {
                                A0 = System.currentTimeMillis();
                                B0 = DownloadController.getInstance(i14).canDownloadMedia(messageObject);
                            }
                            if (!B0 && !this.W) {
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
                                imageReceiver4.setImage(imageLocation2, str2, messageObject.mediaSmallThumb, u3.c.k(str2, "_b"), null, 0L, null, obj, 0);
                            }
                        } else {
                            TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                            TLRPC.PhotoSize closestPhotoSizeWithSize6 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, photoSize, false, closestPhotoSizeWithSize5, this.W);
                            if (closestPhotoSizeWithSize6 == closestPhotoSizeWithSize5) {
                                closestPhotoSizeWithSize5 = null;
                            }
                            if (messageObject.strippedThumb != null) {
                                imageReceiver4.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize6, messageObject.photoThumbsObject), str2, null, null, messageObject.strippedThumb, closestPhotoSizeWithSize6 != null ? closestPhotoSizeWithSize6.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                            } else {
                                String str5 = str2;
                                imageReceiver4.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize6, messageObject.photoThumbsObject), str5, z10 ? null : ImageLocation.getForObject(closestPhotoSizeWithSize5, messageObject.photoThumbsObject), u3.c.k(str5, "_b"), closestPhotoSizeWithSize6 != null ? closestPhotoSizeWithSize6.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
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
                imageReceiver4.setImageBitmap(new jq(new ColorDrawable(-13421773), mutate));
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
                imageReceiver4.addDecorator(new lh.n9(storyItem));
            }
            setPrivacyType(g(messageObject));
            if (this.h) {
                long dialogId = messageObject.getDialogId();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                spannableStringBuilder.append((CharSequence) MessagesController.getInstance(i14).getPeerName(dialogId));
                org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(this, i11 == 2 ? 16.0f : 13.66f, i14);
                g5Var.c(dialogId);
                spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
                this.K = new zz0(spannableStringBuilder, i11 == 2 ? 14.0f : 10.1666f, AndroidUtilities.bold());
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
        if (this.y0 == z10) {
            return;
        }
        this.y0 = z10;
        if (!z11) {
            this.z0.a(z10);
        }
        invalidate();
    }

    public final void m(String str, boolean z10) {
        StaticLayout staticLayout;
        this.C = str;
        boolean z11 = str != null;
        this.y = z11;
        this.A = false;
        if (z11 && (staticLayout = this.B) != null && !staticLayout.getText().toString().equals(str)) {
            this.B = null;
        }
        this.D = z10;
    }

    public final void n(float f9, float f10) {
        this.f0 = f9;
        this.g0 = f10;
        this.h0 = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) i7.w.a(this.h0 * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(jr.j);
        duration.addUpdateListener(new r(this, 5));
        duration.addListener(new nh.q5(this, 20));
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
            if (isStory && this.b0) {
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
        } catch (Exception e10) {
            FileLog.e(e10);
            try {
                setContentDescription(null);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
        CheckBoxBase checkBoxBase = this.L;
        if (checkBoxBase != null) {
            checkBoxBase.l = true;
        }
        if (this.n != null) {
            this.c.onAttachedToWindow();
            this.b.onAttachedToWindow();
            this.d.onAttachedToWindow();
        }
        gh.j jVar = this.i0;
        if (jVar != null) {
            if (jVar.i) {
                this.i0 = gh.j.e(this);
            } else {
                jVar.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.N = false;
        CheckBoxBase checkBoxBase = this.L;
        if (checkBoxBase != null) {
            checkBoxBase.l = false;
        }
        if (this.n != null) {
            this.c.onDetachedFromWindow();
            this.b.onDetachedFromWindow();
            this.d.onDetachedFromWindow();
        }
        gh.j jVar = this.i0;
        if (jVar != null) {
            jVar.b(this);
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
            FileLog.e(e10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.W;
        int i12 = z10 ? (int) (size * 1.25f) : size;
        if (z10 && this.r == 1) {
            i12 /= 2;
        }
        setMeasuredDimension(size, i12);
        p();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ad adVar = this.r0;
        if (adVar == null || !adVar.b(motionEvent)) {
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
            if (this.i0 == null) {
                this.i0 = gh.j.e(this);
            }
        } else {
            gh.j jVar = this.i0;
            if (jVar != null) {
                jVar.b(this);
                this.i0 = null;
            }
        }
    }

    public final boolean q(float f9) {
        int i10;
        if (this.W && this.r < 5) {
            int dp = AndroidUtilities.dp(26.0f) + ((int) this.J.d());
            if (this.y) {
                int dp2 = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.B;
                i10 = dp2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.D ? AndroidUtilities.dp(10.0f) : 0);
            } else {
                i10 = 0;
            }
            if (dp + ((dp <= 0 || i10 <= 0) ? 0 : AndroidUtilities.dp(8.0f)) + i10 > f9) {
                return true;
            }
        }
        return false;
    }

    public void setGradientView(p00 p00Var) {
        this.s = p00Var;
    }

    public void setHighlightProgress(float f9) {
        if (this.Q != f9) {
            this.Q = f9;
            invalidate();
        }
    }

    public void setReorder(boolean z10) {
        this.t0 = z10;
        invalidate();
    }

    public void setStyle(int i10) {
        if (this.n0 == i10) {
            return;
        }
        this.n0 = i10;
        if (i10 == 1) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(21, this, null);
            this.L = checkBoxBase;
            checkBoxBase.h(-1, org.telegram.ui.ActionBar.g6.Lh, org.telegram.ui.ActionBar.g6.k7);
            this.L.k(true);
            this.L.d(0);
            this.L.e(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            if (this.N) {
                this.L.l = true;
            }
            ad adVar = new ad(this);
            this.r0 = adVar;
            adVar.h = new g(this, 6);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.J == drawable || super.verifyDrawable(drawable);
    }

    public void h() {
    }
}
