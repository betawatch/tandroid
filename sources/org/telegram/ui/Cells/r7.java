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
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.xc;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class r7 extends FrameLayout {
    public static long B0;
    public static boolean C0;
    public final org.telegram.ui.Components.z5 A0;
    public boolean B;
    public StaticLayout C;
    public String D;
    public boolean E;
    public int F;
    public Bitmap G;
    public Paint H;
    public boolean I;
    public final org.telegram.ui.Components.z5 J;
    public final org.telegram.ui.Components.j6 K;
    public k01 L;
    public CheckBoxBase M;
    public final q7 N;
    public boolean O;
    public float P;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public GradientDrawable V;
    public boolean W;
    public int a;
    public boolean a0;
    public final ImageReceiver b;
    public boolean b0;
    public final ImageReceiver c;
    public boolean c0;
    public final ImageReceiver d;
    public final Path d0;
    public cp0 e;
    public jh.k e0;
    public final int f;
    public float f0;
    public float g0;
    public boolean h;
    public float h0;
    public float i0;
    public jh.j j0;
    public final Path k0;
    public k01 l0;
    public k01 m0;
    public MessageObject n;
    public k01 n0;
    public int o0;
    public final Paint p0;
    public final Paint q0;
    public int r;
    public final org.telegram.ui.Components.z5 r0;
    public u00 s;
    public xc s0;
    public boolean t0;
    public boolean u0;
    public r7 v;
    public final RectF v0;
    public float w;
    public Path w0;
    public float x;
    public ValueAnimator x0;
    public boolean y;
    public float y0;
    public boolean z0;

    public r7(Context context, q7 q7Var, int i10) {
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
        this.E = true;
        pr prVar = pr.h;
        this.J = new org.telegram.ui.Components.z5(this, 0L, 350L, prVar);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.K = j6Var;
        this.d0 = new Path();
        this.k0 = new Path();
        this.o0 = 0;
        this.p0 = new Paint(1);
        this.q0 = new Paint(1);
        this.r0 = new org.telegram.ui.Components.z5(this, 0L, 200L, prVar);
        this.v0 = new RectF();
        this.A0 = new org.telegram.ui.Components.z5(this, 0L, 320L, prVar);
        this.N = q7Var;
        this.f = i10;
        i(false, false);
        imageReceiver2.setParentView(this);
        imageReceiver.setParentView(this);
        imageReceiver3.setParentView(this);
        imageReceiver2.setDelegate(new ha(this, 6));
        j6Var.setCallback(this);
        j6Var.t(AndroidUtilities.dp(12.0f));
        j6Var.r(-1);
        j6Var.u(AndroidUtilities.bold());
        j6Var.G = AndroidUtilities.displaySize.x;
        setWillNotDraw(false);
    }

    private float getPadding() {
        if (this.P != 0.0f) {
            float f10 = this.Q;
            if (f10 == 9.0f || this.r == 9) {
                if (f10 == 9.0f) {
                    return e2.c.w(1.0f, this.P, AndroidUtilities.dpf2(2.0f), AndroidUtilities.dpf2(1.0f) * this.P);
                }
                return e2.c.w(1.0f, this.P, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(2.0f) * this.P);
            }
        }
        return this.r == 9 ? AndroidUtilities.dpf2(1.0f) : AndroidUtilities.dpf2(2.0f);
    }

    private void setPrivacyType(int i10) {
        if (this.F == i10) {
            return;
        }
        this.F = i10;
        this.G = null;
        int i11 = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 100 ? 0 : R.drawable.msg_pin_mini : R.drawable.msg_folders_groups : R.drawable.msg_folders_private : R.drawable.msg_stories_closefriends;
        if (i11 != 0) {
            Context context = getContext();
            HashMap hashMap = this.N.g;
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
            this.G = bitmap;
        }
        invalidate();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12) {
        canvas.save();
        if (this.w0 == null) {
            this.w0 = new Path();
        }
        this.w0.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, f10, f11);
        float dp = AndroidUtilities.dp(12.0f) * f12;
        this.w0.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        this.w0.close();
        canvas.clipPath(this.w0);
        canvas.scale(f10 / getWidth(), f11 / getHeight());
        boolean hasImageLoaded = this.b.hasImageLoaded();
        if (!hasImageLoaded || f12 < 1.0f) {
            float f13 = 1.0f - f12;
            d(f13, 1.0f, f13, canvas, false);
        }
        if (hasImageLoaded && f12 > 0.0f) {
            d(1.0f - f12, f12, 0.0f, canvas, true);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas, RectF rectF, float f10) {
        if (this.a0) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.h && this.L != null) {
                float dp = AndroidUtilities.dp(5.33f);
                k01 k01Var = this.L;
                k01Var.p = (int) (rectF.width() - (2.0f * dp));
                k01Var.t = AndroidUtilities.dp(14.0f);
                k01Var.a.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.k6.l1(0.4f * f10, -16777216));
                k01Var.c(rectF.left + dp, rectF.top + AndroidUtilities.dp(this.r <= 2 ? 15.0f : 11.33f), 1.0f, org.telegram.ui.ActionBar.k6.l1(f10, -1), canvas);
            }
        }
    }

    public final void c(Canvas canvas, RectF rectF, float f10) {
        String str;
        float f11 = f10;
        if (this.y) {
            ImageReceiver imageReceiver = this.c;
            if (imageReceiver == null || imageReceiver.getVisible()) {
                float dp = (AndroidUtilities.dp(20.0f) * this.y0) + rectF.width();
                float width = rectF.width() / dp;
                if (f11 < 1.0f) {
                    f11 = (float) Math.pow(f11, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i10 = this.r;
                q7 q7Var = this.N;
                if (i10 != 9 && this.C == null && (str = this.D) != null) {
                    this.C = new StaticLayout(this.D, q7Var.a, (int) Math.ceil(q7Var.a.measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i10 >= 9 || this.D == null) && this.C != null) {
                    this.C = null;
                }
                boolean q10 = q(dp);
                int dp2 = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.C;
                int width2 = dp2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.E ? AndroidUtilities.dp(10.0f) : 0);
                canvas.translate(AndroidUtilities.dp(5.0f), (((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f)) - (q10 ? AndroidUtilities.dp(22.0f) : 0));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, width2, AndroidUtilities.dp(17.0f));
                int alpha = org.telegram.ui.ActionBar.k6.i2.getAlpha();
                org.telegram.ui.ActionBar.k6.i2.setAlpha((int) (alpha * f11));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.k6.i2);
                org.telegram.ui.ActionBar.k6.i2.setAlpha(alpha);
                if (this.E) {
                    canvas.save();
                    float dp3 = this.C == null ? AndroidUtilities.dp(5.0f) : AndroidUtilities.dp(4.0f);
                    int dp4 = AndroidUtilities.dp(17.0f);
                    Drawable drawable = q7Var.c;
                    Drawable drawable2 = q7Var.c;
                    canvas.translate(dp3, (dp4 - drawable.getIntrinsicHeight()) / 2.0f);
                    drawable2.setAlpha((int) (this.w * 255.0f * f11));
                    drawable2.draw(canvas);
                    canvas.restore();
                }
                if (this.C != null) {
                    canvas.translate(AndroidUtilities.dp((this.E ? 10 : 0) + 4), (AndroidUtilities.dp(17.0f) - this.C.getHeight()) / 2.0f);
                    TextPaint textPaint = q7Var.a;
                    TextPaint textPaint2 = q7Var.a;
                    int alpha2 = textPaint.getAlpha();
                    textPaint2.setAlpha((int) (alpha2 * f11));
                    this.C.draw(canvas);
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
    public final void d(float f10, float f11, float f12, Canvas canvas, boolean z4) {
        float f13;
        boolean z10;
        float f14;
        Canvas canvas2;
        float f15;
        float f16;
        float f17;
        ImageReceiver imageReceiver;
        float f18;
        r7 r7Var;
        float dp;
        float f19;
        Drawable drawable;
        float f20;
        ImageReceiver imageReceiver2;
        Canvas canvas3;
        float f21;
        int i10;
        u00 u00Var;
        float padding = getPadding() * f10;
        float f22 = this.S ? padding : 0.0f;
        float e6 = this.A0.e(this.z0);
        float measuredWidth = ((getMeasuredWidth() - f22) - padding) * this.x;
        float measuredHeight = ((getMeasuredHeight() - 0.0f) - padding) * this.x;
        ImageReceiver imageReceiver3 = z4 ? this.b : this.c;
        imageReceiver3.setAlpha(f11);
        if (this.P > 0.5f && this.Q != 9.0f && this.r != 9) {
            float f23 = f10 * 2.0f;
            measuredWidth -= f23;
            measuredHeight -= f23;
        }
        if ((this.n != null || this.o0 == 1) && imageReceiver3.hasBitmapImage() && imageReceiver3.getCurrentAlpha() == 1.0f && this.w == 1.0f) {
            f13 = 1.0f;
            z10 = true;
            f14 = 0.0f;
        } else {
            if (getParent() == null || (u00Var = this.s) == null) {
                f13 = 1.0f;
                z10 = true;
                f14 = 0.0f;
            } else {
                int measuredWidth2 = ((View) getParent()).getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                float f24 = -getX();
                u00Var.L = measuredWidth2;
                u00Var.M = measuredHeight2;
                u00Var.N = f24;
                this.s.e();
                this.s.h();
                float f25 = (this.P <= 0.5f || this.Q == 9.0f || this.r == 9) ? 0.0f : 1.0f;
                float f26 = f22 + f25;
                float f27 = f25 + padding;
                f13 = 1.0f;
                z10 = true;
                f14 = 0.0f;
                canvas.drawRect(f26, f27, f26 + measuredWidth, f27 + measuredHeight, this.s.getPaint());
            }
            invalidate();
        }
        float f28 = this.w;
        if (f28 != f13) {
            canvas.saveLayerAlpha(0.0f, 0.0f, f22 + padding + measuredWidth, padding + f14 + measuredHeight, (int) (f28 * 255.0f), 31);
        } else {
            canvas.save();
        }
        CheckBoxBase checkBoxBase = this.M;
        q7 q7Var = this.N;
        if (((checkBoxBase == null || !checkBoxBase.q) && !PhotoViewer.M1(this.n)) || this.t0) {
            canvas2 = canvas;
            f15 = f22;
        } else {
            canvas2 = canvas;
            f15 = f22;
            canvas2.drawRect(f15, 0.0f, (f22 + measuredWidth) - padding, (measuredHeight + f14) - padding, q7Var.b);
        }
        boolean z11 = this.a0;
        ImageReceiver imageReceiver4 = this.d;
        if (z11 && this.r == z10) {
            float height = getHeight() * 0.72f;
            GradientDrawable gradientDrawable = this.V;
            if (gradientDrawable != null) {
                gradientDrawable.setBounds(0, 0, getWidth(), getHeight());
                this.V.draw(canvas2);
            } else if (!this.W && imageReceiver3.getBitmap() != null) {
                this.W = z10;
                Bitmap bitmap = imageReceiver3.getBitmap();
                boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
                if (bitmap == null) {
                    int[] iArr = {0, 0};
                    if (this.W) {
                        this.V = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
                        invalidate();
                        this.W = false;
                    }
                } else {
                    int[] b10 = qh.g0.b(bitmap, q10);
                    if (this.W) {
                        this.V = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, b10);
                        invalidate();
                        this.W = false;
                    }
                }
            }
            imageReceiver3.setImageCoords((measuredWidth - height) / 2.0f, 0.0f, height, getHeight());
        } else if (this.y0 > 0.0f) {
            float dp2 = AndroidUtilities.dp(this.t0 ? 7.0f : 10.0f) * this.y0;
            float f29 = f15 + dp2;
            float f30 = padding + dp2;
            float f31 = dp2 * 2.0f;
            float f32 = measuredWidth - f31;
            float f33 = measuredHeight - f31;
            imageReceiver3.setImageCoords(f29, f30, f32, f33);
            imageReceiver4.setImageCoords(f29, f30, f32, f33);
        } else {
            float f34 = (this.P <= 0.5f || this.Q == 9.0f || this.r == 9) ? 0.0f : 1.0f;
            float f35 = f15 + f34;
            float f36 = f34 + padding;
            imageReceiver3.setImageCoords(f35, f36, measuredWidth, measuredHeight);
            imageReceiver4.setImageCoords(f35, f36, measuredWidth, measuredHeight);
        }
        imageReceiver3.setRoundRadius(AndroidUtilities.lerp((this.S && this.U) ? AndroidUtilities.dp(18.0f) : AndroidUtilities.dp(f13), AndroidUtilities.dp(8.0f), this.y0), AndroidUtilities.lerp((this.T && this.U) ? AndroidUtilities.dp(18.0f) : AndroidUtilities.dp(f13), AndroidUtilities.dp(8.0f), this.y0), AndroidUtilities.lerp(AndroidUtilities.dp(f13), AndroidUtilities.dp(8.0f), this.y0), AndroidUtilities.lerp(AndroidUtilities.dp(f13), AndroidUtilities.dp(8.0f), this.y0));
        if (this.t0) {
            canvas2.save();
            if (this.u0 || this.z0) {
                canvas2.translate(imageReceiver3.getCenterX(), imageReceiver3.getCenterY());
                if (this.e == null) {
                    this.e = new cp0(this);
                }
                this.e.a(canvas2, Math.max(this.y0, e6));
                float f37 = f13 - (e6 * 0.075f);
                canvas2.scale(f37, f37);
                canvas2.translate(-imageReceiver3.getCenterX(), -imageReceiver3.getCenterY());
            }
        }
        if (PhotoViewer.M1(this.n)) {
            f16 = e6;
            f17 = measuredWidth;
            imageReceiver = imageReceiver3;
            f18 = 0.075f;
            r7Var = this;
        } else {
            imageReceiver3.draw(canvas2);
            MessageObject messageObject = this.n;
            if (messageObject == null || !messageObject.hasMediaSpoilers() || this.n.isMediaSpoilersRevealedInSharedMedia) {
                f16 = e6;
                f17 = measuredWidth;
                imageReceiver = imageReceiver3;
                f18 = 0.075f;
                r7Var = this;
            } else {
                canvas2.save();
                canvas2.clipRect(f15, 0.0f, (f15 + measuredWidth) - padding, (measuredHeight + 0.0f) - padding);
                if (this.f0 != 0.0f) {
                    Path path = this.d0;
                    path.rewind();
                    path.addCircle(this.g0, this.h0, this.i0 * this.f0, Path.Direction.CW);
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                }
                imageReceiver4.draw(canvas2);
                if (this.j0 != null) {
                    canvas2.clipRect(imageReceiver3.getImageX(), imageReceiver3.getImageY(), imageReceiver3.getImageX2(), imageReceiver3.getImageY2());
                    f20 = measuredWidth;
                    imageReceiver2 = imageReceiver3;
                    Canvas canvas4 = canvas2;
                    f21 = e6;
                    this.j0.c(canvas4, this, (int) imageReceiver3.getImageWidth(), (int) imageReceiver3.getImageHeight(), 1.0f, false);
                    canvas3 = canvas4;
                    r7Var = this;
                } else {
                    f20 = measuredWidth;
                    imageReceiver2 = imageReceiver3;
                    canvas3 = canvas2;
                    r7Var = this;
                    f21 = e6;
                    if (r7Var.e0 == null) {
                        r7Var.e0 = new jh.k();
                    }
                    r7Var.e0.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    r7Var.e0.setBounds((int) imageReceiver2.getImageX(), (int) imageReceiver2.getImageY(), (int) imageReceiver2.getImageX2(), (int) imageReceiver2.getImageY2());
                    r7Var.e0.draw(canvas3);
                }
                canvas3.restore();
                if (r7Var.n.isSensitive()) {
                    if (r7Var.l0 == null) {
                        f18 = 0.075f;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.y3.h(R.string.MessageSensitiveContent, new StringBuilder("x ")));
                        spannableStringBuilder.setSpan(new oq(R.drawable.filled_sensitive, 0), 0, 1, 33);
                        r7Var.l0 = new k01(spannableStringBuilder, 14.0f, AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                    } else {
                        f18 = 0.075f;
                    }
                    k01 k01Var = r7Var.l0;
                    int i11 = 13;
                    if (f20 < (AndroidUtilities.dp(13) * 2) + k01Var.c) {
                        if (r7Var.m0 == null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.y3.h(R.string.MessageSensitiveContentShort, new StringBuilder("x ")));
                            spannableStringBuilder2.setSpan(new oq(R.drawable.filled_sensitive, 0), 0, 1, 33);
                            r7Var.m0 = new k01(spannableStringBuilder2, 14.0f, AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                        }
                        k01Var = r7Var.m0;
                    }
                    if (f20 < (AndroidUtilities.dp(26) * 2) + k01Var.c) {
                        if (r7Var.n0 == null) {
                            r7Var.n0 = new k01(new SpannableStringBuilder(LocaleController.getString(R.string.MessageSensitiveContentShort)), 13.0f, AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                        }
                        k01Var = r7Var.n0;
                        i11 = 10;
                        i10 = 28;
                    } else {
                        i10 = 32;
                    }
                    float imageWidth = (imageReceiver2.getImageWidth() / 2.0f) + imageReceiver2.getImageX();
                    float imageHeight = (imageReceiver2.getImageHeight() / 2.0f) + imageReceiver2.getImageY();
                    float dp3 = k01Var.c + AndroidUtilities.dp(i11 + i11);
                    float dp4 = AndroidUtilities.dp(i10) / 2.0f;
                    k01 k01Var2 = k01Var;
                    float lerp = AndroidUtilities.lerp(0.8f, 1.0f, f13 - r7Var.f0);
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f38 = dp3 / 2.0f;
                    float f39 = f38 * lerp;
                    float f40 = dp4 * lerp;
                    f17 = f20;
                    imageReceiver = imageReceiver2;
                    rectF.set(imageWidth - f39, imageHeight - f40, f39 + imageWidth, imageHeight + f40);
                    Path path2 = r7Var.k0;
                    path2.reset();
                    path2.addRoundRect(rectF, dp4, dp4, Path.Direction.CW);
                    canvas3.save();
                    canvas3.clipPath(path2);
                    float alpha = imageReceiver4.getAlpha();
                    imageReceiver4.setAlpha((1.0f - r7Var.f0) * alpha);
                    imageReceiver4.draw(canvas3);
                    imageReceiver4.setAlpha(alpha);
                    canvas3.restore();
                    Paint S0 = org.telegram.ui.ActionBar.k6.S0("paintChatTimeBackground");
                    int alpha2 = S0.getAlpha();
                    f16 = f21;
                    S0.setAlpha((int) org.telegram.messenger.y3.y(1.0f, r7Var.f0, alpha2, 0.35f));
                    canvas3.drawRoundRect(rectF, dp4, dp4, S0);
                    S0.setAlpha(alpha2);
                    canvas3.save();
                    canvas3.scale(lerp, lerp, imageWidth, imageHeight);
                    Canvas canvas5 = canvas3;
                    k01Var2.c(AndroidUtilities.dp(i11) + (imageWidth - f38), imageHeight, 1.0f - r7Var.f0, -1, canvas5);
                    canvas2 = canvas5;
                    canvas2.restore();
                } else {
                    f16 = f21;
                    f17 = f20;
                    imageReceiver = imageReceiver2;
                    f18 = 0.075f;
                    canvas2 = canvas3;
                }
                r7Var.invalidate();
            }
            if (!r7Var.h) {
                float f41 = r7Var.R;
                if (f41 > 0.0f) {
                    q7Var.e.setColor(i0.a.k(-16777216, (int) (f41 * 0.5f * 255.0f)));
                    canvas2.drawRect(imageReceiver.getDrawRegion(), q7Var.e);
                }
            }
        }
        if (r7Var.b0) {
            Paint paint = r7Var.p0;
            paint.setColor(805306368);
            canvas2.drawRect(imageReceiver.getDrawRegion(), paint);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint2 = r7Var.q0;
            paint2.setStyle(style);
            paint2.setColor(-1);
            paint2.setStrokeWidth(AndroidUtilities.dp(3.0f));
            paint2.setStrokeJoin(Paint.Join.ROUND);
            paint2.setStrokeCap(Paint.Cap.ROUND);
            float dp5 = AndroidUtilities.dp(18.0f);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(imageReceiver.getCenterX() - dp5, imageReceiver.getCenterY() - dp5, imageReceiver.getCenterX() + dp5, imageReceiver.getCenterY() + dp5);
            float currentTimeMillis = ((System.currentTimeMillis() % 1500) / 1500.0f) * 360.0f;
            MessageObject messageObject2 = r7Var.n;
            canvas2.drawArc(rectF2, currentTimeMillis, r7Var.r0.d(AndroidUtilities.lerp(0.15f, 0.95f, messageObject2 != null ? messageObject2.getProgress() : 0.0f), false) * 360.0f, false, paint2);
            r7Var.invalidate();
        }
        float imageX = imageReceiver.getImageX();
        float imageY = imageReceiver.getImageY();
        float imageX2 = imageReceiver.getImageX2();
        float imageY2 = imageReceiver.getImageY2();
        RectF rectF3 = r7Var.v0;
        rectF3.set(imageX, imageY, imageX2, imageY2);
        if (r7Var.B && (drawable = org.telegram.ui.ActionBar.k6.l3) != null) {
            drawable.setBounds((int) (rectF3.left + AndroidUtilities.dp(8.0f)), (int) (rectF3.top + AndroidUtilities.dp(8.0f)), (int) ((org.telegram.ui.ActionBar.k6.l3.getIntrinsicWidth() * 0.75f) + rectF3.left + AndroidUtilities.dp(8.0f)), (int) ((org.telegram.ui.ActionBar.k6.l3.getIntrinsicHeight() * 0.75f) + rectF3.top + AndroidUtilities.dp(8.0f)));
            org.telegram.ui.ActionBar.k6.l3.draw(canvas2);
        }
        r7Var.c(canvas2, rectF3, f12);
        r7Var.f(canvas2, rectF3, f12);
        if (r7Var.h) {
            r7Var.b(canvas2, rectF3, f12);
        } else {
            r7Var.e(canvas2, rectF3, f12);
        }
        if (r7Var.t0) {
            canvas2.restore();
        }
        CheckBoxBase checkBoxBase2 = r7Var.M;
        if (checkBoxBase2 != null) {
            if (r7Var.o0 != 1) {
            }
            canvas2.save();
            if (r7Var.t0 && (r7Var.u0 || r7Var.z0)) {
                canvas2.translate(imageReceiver.getCenterX(), imageReceiver.getCenterY());
                if (r7Var.e == null) {
                    r7Var.e = new cp0(r7Var);
                }
                float f42 = f16;
                r7Var.e.a(canvas2, Math.max(r7Var.y0, f42) * 0.5f);
                float f43 = 1.0f - (f42 * f18);
                canvas2.scale(f43, f43);
                canvas2.translate(-imageReceiver.getCenterX(), -imageReceiver.getCenterY());
            }
            if (r7Var.o0 == 1) {
                dp = ((f17 + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(25.0f)) - AndroidUtilities.dp(4.0f);
                f19 = AndroidUtilities.dp(4.0f);
            } else if (r7Var.t0) {
                dp = (f17 + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp((r7Var.y0 * 5.0f) + 22.0f);
                f19 = (AndroidUtilities.dp(5.0f) * r7Var.y0) + AndroidUtilities.dp(-2.0f);
            } else {
                dp = (f17 + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(25.0f);
                f19 = 0.0f;
            }
            canvas2.translate(dp, f19);
            r7Var.M.a(canvas2);
            if (r7Var.s0 != null) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(dp, f19, r7Var.M.b.width() + dp, r7Var.M.b.height() + f19);
                xc xcVar = r7Var.s0;
                xcVar.i = false;
                xcVar.c = 0;
                xcVar.a(rectF4);
            }
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void e(Canvas canvas, RectF rectF, float f10) {
        Bitmap bitmap;
        if (!this.a0 || (bitmap = this.G) == null || bitmap.isRecycled()) {
            return;
        }
        int dp = AndroidUtilities.dp((rectF.width() / ((AndroidUtilities.dp(20.0f) * this.y0) + rectF.width())) * 17.33f);
        canvas.save();
        float f11 = dp;
        canvas.translate((rectF.right - f11) - AndroidUtilities.dp(5.66f), rectF.top + AndroidUtilities.dp(5.66f));
        if (this.H == null) {
            this.H = new Paint(3);
        }
        this.H.setAlpha((int) (f10 * 255.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, f11, f11);
        canvas.drawBitmap(this.G, (Rect) null, rectF2, this.H);
        canvas.restore();
    }

    public final void f(Canvas canvas, RectF rectF, float f10) {
        if (this.a0) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.r < 5) {
                float dp = (AndroidUtilities.dp(20.0f) * this.y0) + rectF.width();
                float width = rectF.width() / dp;
                boolean q10 = q(dp);
                float e6 = this.J.e(this.I);
                float f11 = f10 * e6;
                if (f11 < 1.0f) {
                    f11 = (float) Math.pow(f11, 8.0d);
                }
                if (e6 <= 0.0f) {
                    return;
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, q10 ? 0.0f : rectF.width(), rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                float dp2 = AndroidUtilities.dp(26.0f);
                org.telegram.ui.Components.j6 j6Var = this.K;
                float d = j6Var.d() + dp2;
                canvas.translate(q10 ? AndroidUtilities.dp(5.0f) : (rectF.width() - AndroidUtilities.dp(5.0f)) - d, ((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, d, AndroidUtilities.dp(17.0f));
                int alpha = org.telegram.ui.ActionBar.k6.i2.getAlpha();
                org.telegram.ui.ActionBar.k6.i2.setAlpha((int) (alpha * f11));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.k6.i2);
                org.telegram.ui.ActionBar.k6.i2.setAlpha(alpha);
                canvas.save();
                float dp3 = AndroidUtilities.dp(3.0f);
                int dp4 = AndroidUtilities.dp(17.0f);
                q7 q7Var = this.N;
                canvas.translate(dp3, (dp4 - q7Var.d.getBounds().height()) / 2.0f);
                q7Var.d.setAlpha((int) (this.w * 255.0f * f11));
                q7Var.d.draw(canvas);
                canvas.restore();
                canvas.translate(AndroidUtilities.dp(22.0f), 0.0f);
                j6Var.setBounds(0, 0, (int) d, AndroidUtilities.dp(17.0f));
                j6Var.w = (int) (f11 * 255.0f);
                j6Var.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final int g(MessageObject messageObject) {
        TL_stories.StoryItem storyItem;
        if (this.c0) {
            return 100;
        }
        if (!this.a0 || messageObject == null || (storyItem = messageObject.storyItem) == null) {
            return -1;
        }
        if (storyItem.parsedPrivacy == null) {
            storyItem.parsedPrivacy = new qh.a8(this.f, storyItem.privacy);
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
        return this.o0;
    }

    public final void i(boolean z4, boolean z10) {
        int i10;
        CheckBoxBase checkBoxBase = this.M;
        if ((checkBoxBase != null && checkBoxBase.q) == z4) {
            return;
        }
        if (checkBoxBase == null) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, null);
            this.M = checkBoxBase2;
            checkBoxBase2.h(-1, org.telegram.ui.ActionBar.k6.Lh, org.telegram.ui.ActionBar.k6.k7);
            if (this.t0 && (i10 = this.a) != 0) {
                CheckBoxBase checkBoxBase3 = this.M;
                int v = org.telegram.ui.ActionBar.k6.v(i10, org.telegram.ui.ActionBar.k6.l1(0.25f, -1));
                if (checkBoxBase3.x != v) {
                    checkBoxBase3.x = v;
                    checkBoxBase3.b();
                }
            }
            this.M.k(false);
            this.M.d(1);
            this.M.e(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            if (this.O) {
                this.M.l = true;
            }
        }
        this.M.f(-1, z4, z10);
        ValueAnimator valueAnimator = this.x0;
        if (valueAnimator != null) {
            this.x0 = null;
            valueAnimator.cancel();
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y0, z4 ? 1.0f : 0.0f);
            this.x0 = ofFloat;
            ofFloat.addUpdateListener(new f2.d0(this, 4));
            this.x0.setDuration(200L);
            this.x0.addListener(new eg.u2(14, this, z4));
            this.x0.start();
        } else {
            this.y0 = z4 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void j(float f10, boolean z4) {
        if (this.x != f10) {
            this.x = f10;
            if (z4) {
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
    public final void k(MessageObject messageObject, int i10, boolean z4) {
        boolean z10;
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
                        int i13 = this.F;
                        if ((i13 == 100) == this.c0 && i13 == g(messageObject) && !z4) {
                            return;
                        }
                    }
                }
            }
        }
        this.n = messageObject;
        this.a0 = messageObject != null && messageObject.isStory();
        MessageObject messageObject4 = this.n;
        this.b0 = (messageObject4 == null || messageObject4.uploadingStory == null) ? false : true;
        p();
        org.telegram.ui.Components.j6 j6Var = this.K;
        org.telegram.ui.Components.z5 z5Var = this.J;
        ImageReceiver imageReceiver = this.b;
        ImageReceiver imageReceiver2 = this.c;
        ImageReceiver imageReceiver3 = this.d;
        if (messageObject == null) {
            imageReceiver2.onDetachedFromWindow();
            imageReceiver.onDetachedFromWindow();
            imageReceiver3.onDetachedFromWindow();
            this.D = null;
            this.I = false;
            z5Var.d(0.0f, true);
            j6Var.q("", false, true);
            this.C = null;
            this.y = false;
            this.B = false;
            this.W = false;
            this.V = null;
            this.F = -1;
            this.G = null;
            this.L = null;
            o();
            return;
        }
        if (this.O) {
            imageReceiver2.onAttachedToWindow();
            imageReceiver.onAttachedToWindow();
            imageReceiver3.onAttachedToWindow();
        }
        ImageReceiver imageReceiver4 = z4 ? imageReceiver : imageReceiver2;
        int i14 = this.f;
        String restrictionReason = MessagesController.getInstance(i14).getRestrictionReason(messageObject.messageOwner.restriction_reason);
        int i15 = (int) ((AndroidUtilities.displaySize.x / i11) / AndroidUtilities.density);
        if (z4) {
            i15 = (((int) (AndroidUtilities.displaySize.x / AndroidUtilities.density)) * 3) / 5;
        }
        SparseArray sparseArray = this.N.f;
        String str2 = (String) sparseArray.get(i15);
        if (str2 == null) {
            String str3 = i15 + "_" + i15 + "_isc";
            sparseArray.put(i15, str3);
            str2 = str3;
        }
        int photoSize = (i11 <= 2 || z4) ? AndroidUtilities.getPhotoSize() : 320;
        this.D = null;
        this.C = null;
        this.y = false;
        this.B = false;
        imageReceiver2.clearDecorators();
        imageReceiver.clearDecorators();
        if (!this.a0 || (storyViews = messageObject.storyItem.views) == null) {
            z10 = true;
            this.I = false;
            z5Var.d(0.0f, true);
            j6Var.q("", false, true);
        } else {
            int i16 = storyViews.views_count;
            this.I = i16 > 0;
            z10 = true;
            j6Var.q(AndroidUtilities.formatWholeNumber(i16, 0), false, true);
        }
        z5Var.d(this.I ? 1.0f : 0.0f, z10);
        Object obj = messageObject.parentStoriesList != null ? messageObject.storyItem : messageObject;
        if (TextUtils.isEmpty(restrictionReason)) {
            TL_stories.StoryItem storyItem4 = messageObject.storyItem;
            if (storyItem4 == null || !(storyItem4.media instanceof TLRPC.TL_messageMediaUnsupported)) {
                oh.s6 s6Var = messageObject.uploadingStory;
                if (s6Var == null || (str = s6Var.f) == null) {
                    TLRPC.Document document3 = messageObject.getDocument();
                    TLRPC.Photo photo3 = messageObject.getPhoto();
                    if (MessageObject.isVideoDocument(document3)) {
                        this.y = !messageObject.isLivePhoto();
                        this.B = messageObject.isLivePhoto();
                        if (i11 != 9 && !messageObject.isLivePhoto()) {
                            this.D = AndroidUtilities.formatShortDuration((int) messageObject.getDuration());
                        }
                        ImageLocation imageLocation = messageObject.mediaThumb;
                        if (imageLocation != null) {
                            BitmapDrawable bitmapDrawable = messageObject.strippedThumb;
                            if (bitmapDrawable != null) {
                                imageReceiver4.setImage(imageLocation, str2, bitmapDrawable, null, obj, 0);
                            } else {
                                imageReceiver4.setImage(imageLocation, str2, messageObject.mediaSmallThumb, w.c.e(str2, "_b"), null, 0L, null, obj, 0);
                            }
                        } else if (messageObject.hasVideoCover()) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, photoSize, false, closestPhotoSizeWithSize, this.a0);
                            if (closestPhotoSizeWithSize2 == closestPhotoSizeWithSize) {
                                closestPhotoSizeWithSize = null;
                            }
                            if (messageObject.strippedThumb != null) {
                                imageReceiver4.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), str2, null, null, messageObject.strippedThumb, closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                            } else {
                                String str4 = str2;
                                imageReceiver4.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), str4, ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), w.c.e(str4, "_b"), closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                            }
                        } else {
                            TLRPC.Document document4 = messageObject.getDocument();
                            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document4.thumbs, 50);
                            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document4.thumbs, photoSize, false, null, this.a0);
                            if (closestPhotoSizeWithSize3 == closestPhotoSizeWithSize4 && !this.a0) {
                                closestPhotoSizeWithSize4 = null;
                            }
                            if (closestPhotoSizeWithSize3 != null) {
                                if (messageObject.strippedThumb != null) {
                                    imageReceiver4.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, document4), str2, messageObject.strippedThumb, null, obj, 0);
                                } else {
                                    imageReceiver4.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, document4), str2, ImageLocation.getForDocument(closestPhotoSizeWithSize3, document4), w.c.e(str2, "_b"), null, 0L, null, obj, 0);
                                }
                            }
                        }
                    } else if (photo3 != null && !messageObject.photoThumbs.isEmpty()) {
                        if (!messageObject.mediaExists) {
                            if (System.currentTimeMillis() - B0 > 5000) {
                                B0 = System.currentTimeMillis();
                                C0 = DownloadController.getInstance(i14).canDownloadMedia(messageObject);
                            }
                            if (!C0 && !this.a0) {
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
                                imageReceiver4.setImage(imageLocation2, str2, messageObject.mediaSmallThumb, w.c.e(str2, "_b"), null, 0L, null, obj, 0);
                            }
                        } else {
                            TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                            TLRPC.PhotoSize closestPhotoSizeWithSize6 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, photoSize, false, closestPhotoSizeWithSize5, this.a0);
                            if (closestPhotoSizeWithSize6 == closestPhotoSizeWithSize5) {
                                closestPhotoSizeWithSize5 = null;
                            }
                            if (messageObject.strippedThumb != null) {
                                imageReceiver4.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize6, messageObject.photoThumbsObject), str2, null, null, messageObject.strippedThumb, closestPhotoSizeWithSize6 != null ? closestPhotoSizeWithSize6.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                            } else {
                                String str5 = str2;
                                imageReceiver4.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize6, messageObject.photoThumbsObject), str5, z4 ? null : ImageLocation.getForObject(closestPhotoSizeWithSize5, messageObject.photoThumbsObject), w.c.e(str5, "_b"), closestPhotoSizeWithSize6 != null ? closestPhotoSizeWithSize6.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
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
                imageReceiver4.setImageBitmap(new pq(new ColorDrawable(-13421773), mutate));
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
                imageReceiver4.addDecorator(new oh.n9(storyItem));
            }
            setPrivacyType(g(messageObject));
            if (this.h) {
                long dialogId = messageObject.getDialogId();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                spannableStringBuilder.append((CharSequence) MessagesController.getInstance(i14).getPeerName(dialogId));
                org.telegram.ui.i5 i5Var = new org.telegram.ui.i5(this, i11 == 2 ? 16.0f : 13.66f, i14);
                i5Var.c(dialogId);
                spannableStringBuilder.setSpan(i5Var, 0, 1, 33);
                this.L = new k01(spannableStringBuilder, i11 == 2 ? 14.0f : 10.1666f, AndroidUtilities.bold());
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

    public final void l(boolean z4, boolean z10) {
        if (this.z0 == z4) {
            return;
        }
        this.z0 = z4;
        if (!z10) {
            this.A0.a(z4);
        }
        invalidate();
    }

    public final void m(String str, boolean z4) {
        StaticLayout staticLayout;
        this.D = str;
        boolean z10 = str != null;
        this.y = z10;
        this.B = false;
        if (z10 && (staticLayout = this.C) != null && !staticLayout.getText().toString().equals(str)) {
            this.C = null;
        }
        this.E = z4;
    }

    public final void n(float f10, float f11) {
        this.g0 = f10;
        this.h0 = f11;
        this.i0 = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) k7.o.a(this.i0 * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(pr.j);
        duration.addUpdateListener(new r(this, 5));
        duration.addListener(new org.telegram.ui.s5(this, 11));
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
            StringBuilder sb = new StringBuilder();
            if (isStory && this.c0) {
                sb.append(LocaleController.getString(R.string.AccDescrStoryPinned));
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
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(string);
                if (i10 > 0) {
                    sb.append(", ");
                    sb.append(LocaleController.formatDuration(i10));
                }
                if (isStory && (storyItem = messageObject.storyItem) != null) {
                    storyViews = storyItem.views;
                    if (storyViews != null && storyViews.views_count > 0) {
                        sb.append(", ");
                        sb.append(LocaleController.formatPluralString("Views", messageObject.storyItem.views.views_count, new Object[0]));
                    }
                    if (messageObject.storyItem.date > 0) {
                        sb.append(", ");
                        sb.append(LocaleController.formatString(R.string.AccDescrPostedDate, LocaleController.formatDateAudio(messageObject.storyItem.date, false)));
                    }
                }
                setContentDescription(sb.toString());
            }
            string = LocaleController.getString(R.string.AccDescrLivePhoto);
            i10 = 0;
            if (sb.length() > 0) {
            }
            sb.append(string);
            if (i10 > 0) {
            }
            if (isStory) {
                storyViews = storyItem.views;
                if (storyViews != null) {
                    sb.append(", ");
                    sb.append(LocaleController.formatPluralString("Views", messageObject.storyItem.views.views_count, new Object[0]));
                }
                if (messageObject.storyItem.date > 0) {
                }
            }
            setContentDescription(sb.toString());
        } catch (Exception e6) {
            FileLog.e(e6);
            try {
                setContentDescription(null);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
        CheckBoxBase checkBoxBase = this.M;
        if (checkBoxBase != null) {
            checkBoxBase.l = true;
        }
        if (this.n != null) {
            this.c.onAttachedToWindow();
            this.b.onAttachedToWindow();
            this.d.onAttachedToWindow();
        }
        jh.j jVar = this.j0;
        if (jVar != null) {
            if (jVar.i) {
                this.j0 = jh.j.e(this);
            } else {
                jVar.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.O = false;
        CheckBoxBase checkBoxBase = this.M;
        if (checkBoxBase != null) {
            checkBoxBase.l = false;
        }
        if (this.n != null) {
            this.c.onDetachedFromWindow();
            this.b.onDetachedFromWindow();
            this.d.onDetachedFromWindow();
        }
        jh.j jVar = this.j0;
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
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        boolean z4 = this.a0;
        int i12 = z4 ? (int) (size * 1.25f) : size;
        if (z4 && this.r == 1) {
            i12 /= 2;
        }
        setMeasuredDimension(size, i12);
        p();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xc xcVar = this.s0;
        if (xcVar == null || !xcVar.b(motionEvent)) {
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
            if (this.j0 == null) {
                this.j0 = jh.j.e(this);
            }
        } else {
            jh.j jVar = this.j0;
            if (jVar != null) {
                jVar.b(this);
                this.j0 = null;
            }
        }
    }

    public final boolean q(float f10) {
        int i10;
        if (this.a0 && this.r < 5) {
            int dp = AndroidUtilities.dp(26.0f) + ((int) this.K.d());
            if (this.y) {
                int dp2 = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.C;
                i10 = dp2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.E ? AndroidUtilities.dp(10.0f) : 0);
            } else {
                i10 = 0;
            }
            if (dp + ((dp <= 0 || i10 <= 0) ? 0 : AndroidUtilities.dp(8.0f)) + i10 > f10) {
                return true;
            }
        }
        return false;
    }

    public void setGradientView(u00 u00Var) {
        this.s = u00Var;
    }

    public void setHighlightProgress(float f10) {
        if (this.R != f10) {
            this.R = f10;
            invalidate();
        }
    }

    public void setReorder(boolean z4) {
        this.u0 = z4;
        invalidate();
    }

    public void setStyle(int i10) {
        if (this.o0 == i10) {
            return;
        }
        this.o0 = i10;
        if (i10 == 1) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(21, this, null);
            this.M = checkBoxBase;
            checkBoxBase.h(-1, org.telegram.ui.ActionBar.k6.Lh, org.telegram.ui.ActionBar.k6.k7);
            this.M.k(true);
            this.M.d(0);
            this.M.e(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            if (this.O) {
                this.M.l = true;
            }
            xc xcVar = new xc(this);
            this.s0 = xcVar;
            xcVar.h = new g(this, 6);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.K == drawable || super.verifyDrawable(drawable);
    }

    public void h() {
    }
}
