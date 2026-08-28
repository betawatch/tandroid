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
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class r7 extends FrameLayout {
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
    public final org.telegram.ui.Components.y5 I;
    public final org.telegram.ui.Components.i6 J;
    public nz0 K;
    public CheckBoxBase L;
    public final q7 M;
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
    public dh.l d0;
    public ho0 e;
    public float e0;
    public final int f;
    public float f0;
    public float g0;
    public boolean h;
    public float h0;
    public dh.k i0;
    public final Path j0;
    public nz0 k0;
    public nz0 l0;
    public nz0 m0;
    public MessageObject n;
    public int n0;
    public final Paint o0;
    public final Paint p0;
    public final org.telegram.ui.Components.y5 q0;
    public int r;
    public wc r0;
    public e00 s;
    public boolean s0;
    public boolean t0;
    public final RectF u0;
    public r7 v;
    public Path v0;
    public float w;
    public ValueAnimator w0;
    public float x;
    public float x0;
    public boolean y;
    public boolean y0;
    public final org.telegram.ui.Components.y5 z0;

    public r7(Context context, q7 q7Var, int i9) {
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
        gr grVar = gr.h;
        this.I = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.J = i6Var;
        this.c0 = new Path();
        this.j0 = new Path();
        this.n0 = 0;
        this.o0 = new Paint(1);
        this.p0 = new Paint(1);
        this.q0 = new org.telegram.ui.Components.y5(this, 0L, 200L, grVar);
        this.u0 = new RectF();
        this.z0 = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        this.M = q7Var;
        this.f = i9;
        i(false, false);
        imageReceiver2.setParentView(this);
        imageReceiver.setParentView(this);
        imageReceiver3.setParentView(this);
        imageReceiver2.setDelegate(new ia(this, 6));
        i6Var.setCallback(this);
        i6Var.t(AndroidUtilities.dp(12.0f));
        i6Var.r(-1);
        i6Var.u(AndroidUtilities.bold());
        i6Var.G = AndroidUtilities.displaySize.x;
        setWillNotDraw(false);
    }

    private float getPadding() {
        if (this.O != 0.0f) {
            float f10 = this.P;
            if (f10 == 9.0f || this.r == 9) {
                if (f10 == 9.0f) {
                    return e2.c.z(1.0f, this.O, AndroidUtilities.dpf2(2.0f), AndroidUtilities.dpf2(1.0f) * this.O);
                }
                return e2.c.z(1.0f, this.O, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(2.0f) * this.O);
            }
        }
        return this.r == 9 ? AndroidUtilities.dpf2(1.0f) : AndroidUtilities.dpf2(2.0f);
    }

    private void setPrivacyType(int i9) {
        if (this.E == i9) {
            return;
        }
        this.E = i9;
        this.F = null;
        int i10 = i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 100 ? 0 : R.drawable.msg_pin_mini : R.drawable.msg_folders_groups : R.drawable.msg_folders_private : R.drawable.msg_stories_closefriends;
        if (i10 != 0) {
            Context context = getContext();
            HashMap hashMap = this.M.g;
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
                hashMap.put(Integer.valueOf(i10), createBitmap2);
                bitmap = createBitmap2;
            }
            this.F = bitmap;
        }
        invalidate();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12) {
        canvas.save();
        if (this.v0 == null) {
            this.v0 = new Path();
        }
        this.v0.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, f10, f11);
        float dp = AndroidUtilities.dp(12.0f) * f12;
        this.v0.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        this.v0.close();
        canvas.clipPath(this.v0);
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
        if (this.W) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.h && this.K != null) {
                float dp = AndroidUtilities.dp(5.33f);
                nz0 nz0Var = this.K;
                nz0Var.p = (int) (rectF.width() - (2.0f * dp));
                nz0Var.t = AndroidUtilities.dp(14.0f);
                nz0Var.a.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.f6.l1(0.4f * f10, -16777216));
                nz0Var.c(rectF.left + dp, rectF.top + AndroidUtilities.dp(this.r <= 2 ? 15.0f : 11.33f), 1.0f, org.telegram.ui.ActionBar.f6.l1(f10, -1), canvas);
            }
        }
    }

    public final void c(Canvas canvas, RectF rectF, float f10) {
        String str;
        float f11 = f10;
        if (this.y) {
            ImageReceiver imageReceiver = this.c;
            if (imageReceiver == null || imageReceiver.getVisible()) {
                float dp = (AndroidUtilities.dp(20.0f) * this.x0) + rectF.width();
                float width = rectF.width() / dp;
                if (f11 < 1.0f) {
                    f11 = (float) Math.pow(f11, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i9 = this.r;
                q7 q7Var = this.M;
                if (i9 != 9 && this.B == null && (str = this.C) != null) {
                    this.B = new StaticLayout(this.C, q7Var.a, (int) Math.ceil(q7Var.a.measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i9 >= 9 || this.C == null) && this.B != null) {
                    this.B = null;
                }
                boolean q10 = q(dp);
                int dp2 = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.B;
                int width2 = dp2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.D ? AndroidUtilities.dp(10.0f) : 0);
                canvas.translate(AndroidUtilities.dp(5.0f), (((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f)) - (q10 ? AndroidUtilities.dp(22.0f) : 0));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, width2, AndroidUtilities.dp(17.0f));
                int alpha = org.telegram.ui.ActionBar.f6.i2.getAlpha();
                org.telegram.ui.ActionBar.f6.i2.setAlpha((int) (alpha * f11));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.f6.i2);
                org.telegram.ui.ActionBar.f6.i2.setAlpha(alpha);
                if (this.D) {
                    canvas.save();
                    float dp3 = this.B == null ? AndroidUtilities.dp(5.0f) : AndroidUtilities.dp(4.0f);
                    int dp4 = AndroidUtilities.dp(17.0f);
                    Drawable drawable = q7Var.c;
                    Drawable drawable2 = q7Var.c;
                    canvas.translate(dp3, (dp4 - drawable.getIntrinsicHeight()) / 2.0f);
                    drawable2.setAlpha((int) (this.w * 255.0f * f11));
                    drawable2.draw(canvas);
                    canvas.restore();
                }
                if (this.B != null) {
                    canvas.translate(AndroidUtilities.dp((this.D ? 10 : 0) + 4), (AndroidUtilities.dp(17.0f) - this.B.getHeight()) / 2.0f);
                    TextPaint textPaint = q7Var.a;
                    TextPaint textPaint2 = q7Var.a;
                    int alpha2 = textPaint.getAlpha();
                    textPaint2.setAlpha((int) (alpha2 * f11));
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
    public final void d(float f10, float f11, float f12, Canvas canvas, boolean z10) {
        float f13;
        boolean z11;
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
        int i9;
        e00 e00Var;
        float padding = getPadding() * f10;
        float f22 = this.R ? padding : 0.0f;
        float e10 = this.z0.e(this.y0);
        float measuredWidth = ((getMeasuredWidth() - f22) - padding) * this.x;
        float measuredHeight = ((getMeasuredHeight() - 0.0f) - padding) * this.x;
        ImageReceiver imageReceiver3 = z10 ? this.b : this.c;
        imageReceiver3.setAlpha(f11);
        if (this.O > 0.5f && this.P != 9.0f && this.r != 9) {
            float f23 = f10 * 2.0f;
            measuredWidth -= f23;
            measuredHeight -= f23;
        }
        if ((this.n != null || this.n0 == 1) && imageReceiver3.hasBitmapImage() && imageReceiver3.getCurrentAlpha() == 1.0f && this.w == 1.0f) {
            f13 = 1.0f;
            z11 = true;
            f14 = 0.0f;
        } else {
            if (getParent() == null || (e00Var = this.s) == null) {
                f13 = 1.0f;
                z11 = true;
                f14 = 0.0f;
            } else {
                int measuredWidth2 = ((View) getParent()).getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                float f24 = -getX();
                e00Var.K = measuredWidth2;
                e00Var.L = measuredHeight2;
                e00Var.M = f24;
                this.s.d();
                this.s.h();
                float f25 = (this.O <= 0.5f || this.P == 9.0f || this.r == 9) ? 0.0f : 1.0f;
                float f26 = f22 + f25;
                float f27 = f25 + padding;
                f13 = 1.0f;
                z11 = true;
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
        CheckBoxBase checkBoxBase = this.L;
        q7 q7Var = this.M;
        if (((checkBoxBase == null || !checkBoxBase.q) && !PhotoViewer.M1(this.n)) || this.s0) {
            canvas2 = canvas;
            f15 = f22;
        } else {
            canvas2 = canvas;
            f15 = f22;
            canvas2.drawRect(f15, 0.0f, (f22 + measuredWidth) - padding, (measuredHeight + f14) - padding, q7Var.b);
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
                boolean q10 = org.telegram.ui.ActionBar.f6.I.q();
                if (bitmap == null) {
                    int[] iArr = {0, 0};
                    if (this.V) {
                        this.U = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
                        invalidate();
                        this.V = false;
                    }
                } else {
                    int[] b10 = kh.o0.b(bitmap, q10);
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
            float f29 = f15 + dp2;
            float f30 = padding + dp2;
            float f31 = dp2 * 2.0f;
            float f32 = measuredWidth - f31;
            float f33 = measuredHeight - f31;
            imageReceiver3.setImageCoords(f29, f30, f32, f33);
            imageReceiver4.setImageCoords(f29, f30, f32, f33);
        } else {
            float f34 = (this.O <= 0.5f || this.P == 9.0f || this.r == 9) ? 0.0f : 1.0f;
            float f35 = f15 + f34;
            float f36 = f34 + padding;
            imageReceiver3.setImageCoords(f35, f36, measuredWidth, measuredHeight);
            imageReceiver4.setImageCoords(f35, f36, measuredWidth, measuredHeight);
        }
        imageReceiver3.setRoundRadius(AndroidUtilities.lerp((this.R && this.T) ? AndroidUtilities.dp(18.0f) : AndroidUtilities.dp(f13), AndroidUtilities.dp(8.0f), this.x0), AndroidUtilities.lerp((this.S && this.T) ? AndroidUtilities.dp(18.0f) : AndroidUtilities.dp(f13), AndroidUtilities.dp(8.0f), this.x0), AndroidUtilities.lerp(AndroidUtilities.dp(f13), AndroidUtilities.dp(8.0f), this.x0), AndroidUtilities.lerp(AndroidUtilities.dp(f13), AndroidUtilities.dp(8.0f), this.x0));
        if (this.s0) {
            canvas2.save();
            if (this.t0 || this.y0) {
                canvas2.translate(imageReceiver3.getCenterX(), imageReceiver3.getCenterY());
                if (this.e == null) {
                    this.e = new ho0(this);
                }
                this.e.a(canvas2, Math.max(this.x0, e10));
                float f37 = f13 - (e10 * 0.075f);
                canvas2.scale(f37, f37);
                canvas2.translate(-imageReceiver3.getCenterX(), -imageReceiver3.getCenterY());
            }
        }
        if (PhotoViewer.M1(this.n)) {
            f16 = e10;
            f17 = measuredWidth;
            imageReceiver = imageReceiver3;
            f18 = 0.075f;
            r7Var = this;
        } else {
            imageReceiver3.draw(canvas2);
            MessageObject messageObject = this.n;
            if (messageObject == null || !messageObject.hasMediaSpoilers() || this.n.isMediaSpoilersRevealedInSharedMedia) {
                f16 = e10;
                f17 = measuredWidth;
                imageReceiver = imageReceiver3;
                f18 = 0.075f;
                r7Var = this;
            } else {
                canvas2.save();
                canvas2.clipRect(f15, 0.0f, (f15 + measuredWidth) - padding, (measuredHeight + 0.0f) - padding);
                if (this.e0 != 0.0f) {
                    Path path = this.c0;
                    path.rewind();
                    path.addCircle(this.f0, this.g0, this.h0 * this.e0, Path.Direction.CW);
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                }
                imageReceiver4.draw(canvas2);
                if (this.i0 != null) {
                    canvas2.clipRect(imageReceiver3.getImageX(), imageReceiver3.getImageY(), imageReceiver3.getImageX2(), imageReceiver3.getImageY2());
                    f20 = measuredWidth;
                    imageReceiver2 = imageReceiver3;
                    Canvas canvas4 = canvas2;
                    f21 = e10;
                    this.i0.c(canvas4, this, (int) imageReceiver3.getImageWidth(), (int) imageReceiver3.getImageHeight(), 1.0f, false);
                    canvas3 = canvas4;
                    r7Var = this;
                } else {
                    f20 = measuredWidth;
                    imageReceiver2 = imageReceiver3;
                    canvas3 = canvas2;
                    r7Var = this;
                    f21 = e10;
                    if (r7Var.d0 == null) {
                        r7Var.d0 = new dh.l();
                    }
                    r7Var.d0.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    r7Var.d0.setBounds((int) imageReceiver2.getImageX(), (int) imageReceiver2.getImageY(), (int) imageReceiver2.getImageX2(), (int) imageReceiver2.getImageY2());
                    r7Var.d0.draw(canvas3);
                }
                canvas3.restore();
                if (r7Var.n.isSensitive()) {
                    if (r7Var.k0 == null) {
                        f18 = 0.075f;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.l0.h(R.string.MessageSensitiveContent, new StringBuilder("x ")));
                        spannableStringBuilder.setSpan(new eq(R.drawable.filled_sensitive, 0), 0, 1, 33);
                        r7Var.k0 = new nz0(spannableStringBuilder, 14.0f, AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                    } else {
                        f18 = 0.075f;
                    }
                    nz0 nz0Var = r7Var.k0;
                    int i10 = 13;
                    if (f20 < (AndroidUtilities.dp(13) * 2) + nz0Var.c) {
                        if (r7Var.l0 == null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.l0.h(R.string.MessageSensitiveContentShort, new StringBuilder("x ")));
                            spannableStringBuilder2.setSpan(new eq(R.drawable.filled_sensitive, 0), 0, 1, 33);
                            r7Var.l0 = new nz0(spannableStringBuilder2, 14.0f, AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                        }
                        nz0Var = r7Var.l0;
                    }
                    if (f20 < (AndroidUtilities.dp(26) * 2) + nz0Var.c) {
                        if (r7Var.m0 == null) {
                            r7Var.m0 = new nz0(new SpannableStringBuilder(LocaleController.getString(R.string.MessageSensitiveContentShort)), 13.0f, AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                        }
                        nz0Var = r7Var.m0;
                        i10 = 10;
                        i9 = 28;
                    } else {
                        i9 = 32;
                    }
                    float imageWidth = (imageReceiver2.getImageWidth() / 2.0f) + imageReceiver2.getImageX();
                    float imageHeight = (imageReceiver2.getImageHeight() / 2.0f) + imageReceiver2.getImageY();
                    float dp3 = nz0Var.c + AndroidUtilities.dp(i10 + i10);
                    float dp4 = AndroidUtilities.dp(i9) / 2.0f;
                    nz0 nz0Var2 = nz0Var;
                    float lerp = AndroidUtilities.lerp(0.8f, 1.0f, f13 - r7Var.e0);
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f38 = dp3 / 2.0f;
                    float f39 = f38 * lerp;
                    float f40 = dp4 * lerp;
                    f17 = f20;
                    imageReceiver = imageReceiver2;
                    rectF.set(imageWidth - f39, imageHeight - f40, f39 + imageWidth, imageHeight + f40);
                    Path path2 = r7Var.j0;
                    path2.reset();
                    path2.addRoundRect(rectF, dp4, dp4, Path.Direction.CW);
                    canvas3.save();
                    canvas3.clipPath(path2);
                    float alpha = imageReceiver4.getAlpha();
                    imageReceiver4.setAlpha((1.0f - r7Var.e0) * alpha);
                    imageReceiver4.draw(canvas3);
                    imageReceiver4.setAlpha(alpha);
                    canvas3.restore();
                    Paint S0 = org.telegram.ui.ActionBar.f6.S0("paintChatTimeBackground");
                    int alpha2 = S0.getAlpha();
                    f16 = f21;
                    S0.setAlpha((int) org.telegram.messenger.l0.y(1.0f, r7Var.e0, alpha2, 0.35f));
                    canvas3.drawRoundRect(rectF, dp4, dp4, S0);
                    S0.setAlpha(alpha2);
                    canvas3.save();
                    canvas3.scale(lerp, lerp, imageWidth, imageHeight);
                    Canvas canvas5 = canvas3;
                    nz0Var2.c(AndroidUtilities.dp(i10) + (imageWidth - f38), imageHeight, 1.0f - r7Var.e0, -1, canvas5);
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
                float f41 = r7Var.Q;
                if (f41 > 0.0f) {
                    q7Var.e.setColor(i0.a.k(-16777216, (int) (f41 * 0.5f * 255.0f)));
                    canvas2.drawRect(imageReceiver.getDrawRegion(), q7Var.e);
                }
            }
        }
        if (r7Var.a0) {
            Paint paint = r7Var.o0;
            paint.setColor(805306368);
            canvas2.drawRect(imageReceiver.getDrawRegion(), paint);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint2 = r7Var.p0;
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
            canvas2.drawArc(rectF2, currentTimeMillis, r7Var.q0.d(AndroidUtilities.lerp(0.15f, 0.95f, messageObject2 != null ? messageObject2.getProgress() : 0.0f), false) * 360.0f, false, paint2);
            r7Var.invalidate();
        }
        float imageX = imageReceiver.getImageX();
        float imageY = imageReceiver.getImageY();
        float imageX2 = imageReceiver.getImageX2();
        float imageY2 = imageReceiver.getImageY2();
        RectF rectF3 = r7Var.u0;
        rectF3.set(imageX, imageY, imageX2, imageY2);
        if (r7Var.A && (drawable = org.telegram.ui.ActionBar.f6.l3) != null) {
            drawable.setBounds((int) (rectF3.left + AndroidUtilities.dp(8.0f)), (int) (rectF3.top + AndroidUtilities.dp(8.0f)), (int) ((org.telegram.ui.ActionBar.f6.l3.getIntrinsicWidth() * 0.75f) + rectF3.left + AndroidUtilities.dp(8.0f)), (int) ((org.telegram.ui.ActionBar.f6.l3.getIntrinsicHeight() * 0.75f) + rectF3.top + AndroidUtilities.dp(8.0f)));
            org.telegram.ui.ActionBar.f6.l3.draw(canvas2);
        }
        r7Var.c(canvas2, rectF3, f12);
        r7Var.f(canvas2, rectF3, f12);
        if (r7Var.h) {
            r7Var.b(canvas2, rectF3, f12);
        } else {
            r7Var.e(canvas2, rectF3, f12);
        }
        if (r7Var.s0) {
            canvas2.restore();
        }
        CheckBoxBase checkBoxBase2 = r7Var.L;
        if (checkBoxBase2 != null) {
            if (r7Var.n0 != 1) {
            }
            canvas2.save();
            if (r7Var.s0 && (r7Var.t0 || r7Var.y0)) {
                canvas2.translate(imageReceiver.getCenterX(), imageReceiver.getCenterY());
                if (r7Var.e == null) {
                    r7Var.e = new ho0(r7Var);
                }
                float f42 = f16;
                r7Var.e.a(canvas2, Math.max(r7Var.x0, f42) * 0.5f);
                float f43 = 1.0f - (f42 * f18);
                canvas2.scale(f43, f43);
                canvas2.translate(-imageReceiver.getCenterX(), -imageReceiver.getCenterY());
            }
            if (r7Var.n0 == 1) {
                dp = ((f17 + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(25.0f)) - AndroidUtilities.dp(4.0f);
                f19 = AndroidUtilities.dp(4.0f);
            } else if (r7Var.s0) {
                dp = (f17 + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp((r7Var.x0 * 5.0f) + 22.0f);
                f19 = (AndroidUtilities.dp(5.0f) * r7Var.x0) + AndroidUtilities.dp(-2.0f);
            } else {
                dp = (f17 + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(25.0f);
                f19 = 0.0f;
            }
            canvas2.translate(dp, f19);
            r7Var.L.a(canvas2);
            if (r7Var.r0 != null) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(dp, f19, r7Var.L.b.width() + dp, r7Var.L.b.height() + f19);
                wc wcVar = r7Var.r0;
                wcVar.i = false;
                wcVar.c = 0;
                wcVar.a(rectF4);
            }
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void e(Canvas canvas, RectF rectF, float f10) {
        Bitmap bitmap;
        if (!this.W || (bitmap = this.F) == null || bitmap.isRecycled()) {
            return;
        }
        int dp = AndroidUtilities.dp((rectF.width() / ((AndroidUtilities.dp(20.0f) * this.x0) + rectF.width())) * 17.33f);
        canvas.save();
        float f11 = dp;
        canvas.translate((rectF.right - f11) - AndroidUtilities.dp(5.66f), rectF.top + AndroidUtilities.dp(5.66f));
        if (this.G == null) {
            this.G = new Paint(3);
        }
        this.G.setAlpha((int) (f10 * 255.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, f11, f11);
        canvas.drawBitmap(this.F, (Rect) null, rectF2, this.G);
        canvas.restore();
    }

    public final void f(Canvas canvas, RectF rectF, float f10) {
        if (this.W) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.r < 5) {
                float dp = (AndroidUtilities.dp(20.0f) * this.x0) + rectF.width();
                float width = rectF.width() / dp;
                boolean q10 = q(dp);
                float e10 = this.I.e(this.H);
                float f11 = f10 * e10;
                if (f11 < 1.0f) {
                    f11 = (float) Math.pow(f11, 8.0d);
                }
                if (e10 <= 0.0f) {
                    return;
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, q10 ? 0.0f : rectF.width(), rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                float dp2 = AndroidUtilities.dp(26.0f);
                org.telegram.ui.Components.i6 i6Var = this.J;
                float d = i6Var.d() + dp2;
                canvas.translate(q10 ? AndroidUtilities.dp(5.0f) : (rectF.width() - AndroidUtilities.dp(5.0f)) - d, ((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, d, AndroidUtilities.dp(17.0f));
                int alpha = org.telegram.ui.ActionBar.f6.i2.getAlpha();
                org.telegram.ui.ActionBar.f6.i2.setAlpha((int) (alpha * f11));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.f6.i2);
                org.telegram.ui.ActionBar.f6.i2.setAlpha(alpha);
                canvas.save();
                float dp3 = AndroidUtilities.dp(3.0f);
                int dp4 = AndroidUtilities.dp(17.0f);
                q7 q7Var = this.M;
                canvas.translate(dp3, (dp4 - q7Var.d.getBounds().height()) / 2.0f);
                q7Var.d.setAlpha((int) (this.w * 255.0f * f11));
                q7Var.d.draw(canvas);
                canvas.restore();
                canvas.translate(AndroidUtilities.dp(22.0f), 0.0f);
                i6Var.setBounds(0, 0, (int) d, AndroidUtilities.dp(17.0f));
                i6Var.w = (int) (f11 * 255.0f);
                i6Var.draw(canvas);
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
            storyItem.parsedPrivacy = new kh.r9(this.f, storyItem.privacy);
        }
        int i9 = messageObject.storyItem.parsedPrivacy.a;
        if (i9 == 2 || i9 == 1 || i9 == 3) {
            return i9;
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
        int i9;
        CheckBoxBase checkBoxBase = this.L;
        if ((checkBoxBase != null && checkBoxBase.q) == z10) {
            return;
        }
        if (checkBoxBase == null) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, null);
            this.L = checkBoxBase2;
            checkBoxBase2.h(-1, org.telegram.ui.ActionBar.f6.Lh, org.telegram.ui.ActionBar.f6.k7);
            if (this.s0 && (i9 = this.a) != 0) {
                CheckBoxBase checkBoxBase3 = this.L;
                int v = org.telegram.ui.ActionBar.f6.v(i9, org.telegram.ui.ActionBar.f6.l1(0.25f, -1));
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
            ofFloat.addUpdateListener(new f2.f0(this, 5));
            this.w0.setDuration(200L);
            this.w0.addListener(new hg.b0(24, this, z10));
            this.w0.start();
        } else {
            this.x0 = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void j(float f10, boolean z10) {
        if (this.x != f10) {
            this.x = f10;
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
    public final void k(MessageObject messageObject, int i9, boolean z10) {
        boolean z11;
        TL_stories.StoryItem storyItem;
        String str;
        TL_stories.StoryViews storyViews;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem2;
        int i10 = i9;
        if (i10 < 1) {
            i10 = 1;
        }
        int i11 = this.r;
        this.r = i10;
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
                    if (((messageMedia == null && messageMedia2 == null) || (messageMedia != null && messageMedia2 != null && ((document = messageMedia.document) == null ? !((photo = messageMedia.photo) == null || (photo2 = messageMedia2.photo) == null || photo2.id != photo.id) : !((document2 = messageMedia2.document) == null || document2.id != document.id)))) && i11 == i10) {
                        int i12 = this.E;
                        if ((i12 == 100) == this.b0 && i12 == g(messageObject) && !z10) {
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
        org.telegram.ui.Components.i6 i6Var = this.J;
        org.telegram.ui.Components.y5 y5Var = this.I;
        ImageReceiver imageReceiver = this.b;
        ImageReceiver imageReceiver2 = this.c;
        ImageReceiver imageReceiver3 = this.d;
        if (messageObject == null) {
            imageReceiver2.onDetachedFromWindow();
            imageReceiver.onDetachedFromWindow();
            imageReceiver3.onDetachedFromWindow();
            this.C = null;
            this.H = false;
            y5Var.d(0.0f, true);
            i6Var.q("", false, true);
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
        int i13 = this.f;
        String restrictionReason = MessagesController.getInstance(i13).getRestrictionReason(messageObject.messageOwner.restriction_reason);
        int i14 = (int) ((AndroidUtilities.displaySize.x / i10) / AndroidUtilities.density);
        if (z10) {
            i14 = (((int) (AndroidUtilities.displaySize.x / AndroidUtilities.density)) * 3) / 5;
        }
        SparseArray sparseArray = this.M.f;
        String str2 = (String) sparseArray.get(i14);
        if (str2 == null) {
            String str3 = i14 + "_" + i14 + "_isc";
            sparseArray.put(i14, str3);
            str2 = str3;
        }
        int photoSize = (i10 <= 2 || z10) ? AndroidUtilities.getPhotoSize() : 320;
        this.C = null;
        this.B = null;
        this.y = false;
        this.A = false;
        imageReceiver2.clearDecorators();
        imageReceiver.clearDecorators();
        if (!this.W || (storyViews = messageObject.storyItem.views) == null) {
            z11 = true;
            this.H = false;
            y5Var.d(0.0f, true);
            i6Var.q("", false, true);
        } else {
            int i15 = storyViews.views_count;
            this.H = i15 > 0;
            z11 = true;
            i6Var.q(AndroidUtilities.formatWholeNumber(i15, 0), false, true);
        }
        y5Var.d(this.H ? 1.0f : 0.0f, z11);
        Object obj = messageObject.parentStoriesList != null ? messageObject.storyItem : messageObject;
        if (TextUtils.isEmpty(restrictionReason)) {
            TL_stories.StoryItem storyItem4 = messageObject.storyItem;
            if (storyItem4 == null || !(storyItem4.media instanceof TLRPC.TL_messageMediaUnsupported)) {
                ih.u6 u6Var = messageObject.uploadingStory;
                if (u6Var == null || (str = u6Var.f) == null) {
                    TLRPC.Document document3 = messageObject.getDocument();
                    TLRPC.Photo photo3 = messageObject.getPhoto();
                    if (MessageObject.isVideoDocument(document3)) {
                        this.y = !messageObject.isLivePhoto();
                        this.A = messageObject.isLivePhoto();
                        if (i10 != 9 && !messageObject.isLivePhoto()) {
                            this.C = AndroidUtilities.formatShortDuration((int) messageObject.getDuration());
                        }
                        ImageLocation imageLocation = messageObject.mediaThumb;
                        if (imageLocation != null) {
                            BitmapDrawable bitmapDrawable = messageObject.strippedThumb;
                            if (bitmapDrawable != null) {
                                imageReceiver4.setImage(imageLocation, str2, bitmapDrawable, null, obj, 0);
                            } else {
                                imageReceiver4.setImage(imageLocation, str2, messageObject.mediaSmallThumb, ta.b.j(str2, "_b"), null, 0L, null, obj, 0);
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
                                imageReceiver4.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), str4, ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), ta.b.j(str4, "_b"), closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
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
                                    imageReceiver4.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, document4), str2, ImageLocation.getForDocument(closestPhotoSizeWithSize3, document4), ta.b.j(str2, "_b"), null, 0L, null, obj, 0);
                                }
                            }
                        }
                    } else if (photo3 != null && !messageObject.photoThumbs.isEmpty()) {
                        if (!messageObject.mediaExists) {
                            if (System.currentTimeMillis() - A0 > 5000) {
                                A0 = System.currentTimeMillis();
                                B0 = DownloadController.getInstance(i13).canDownloadMedia(messageObject);
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
                                imageReceiver4.setImage(imageLocation2, str2, messageObject.mediaSmallThumb, ta.b.j(str2, "_b"), null, 0L, null, obj, 0);
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
                                imageReceiver4.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize6, messageObject.photoThumbsObject), str5, z10 ? null : ImageLocation.getForObject(closestPhotoSizeWithSize5, messageObject.photoThumbsObject), ta.b.j(str5, "_b"), closestPhotoSizeWithSize6 != null ? closestPhotoSizeWithSize6.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
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
                imageReceiver4.setImageBitmap(new fq(new ColorDrawable(-13421773), mutate));
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
                imageReceiver4.addDecorator(new ih.r9(storyItem));
            }
            setPrivacyType(g(messageObject));
            if (this.h) {
                long dialogId = messageObject.getDialogId();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                spannableStringBuilder.append((CharSequence) MessagesController.getInstance(i13).getPeerName(dialogId));
                org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(this, i10 == 2 ? 16.0f : 13.66f, i13);
                f5Var.c(dialogId);
                spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
                this.K = new nz0(spannableStringBuilder, i10 == 2 ? 14.0f : 10.1666f, AndroidUtilities.bold());
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

    public final void n(float f10, float f11) {
        this.f0 = f10;
        this.g0 = f11;
        this.h0 = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) g7.n.a(this.h0 * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(gr.j);
        duration.addUpdateListener(new r(this, 5));
        duration.addListener(new mh.x(this, 18));
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
        int i9;
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
                i9 = (int) duration;
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(string);
                if (i9 > 0) {
                    sb2.append(", ");
                    sb2.append(LocaleController.formatDuration(i9));
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
            i9 = 0;
            if (sb2.length() > 0) {
            }
            sb2.append(string);
            if (i9 > 0) {
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
        dh.k kVar = this.i0;
        if (kVar != null) {
            if (kVar.i) {
                this.i0 = dh.k.e(this);
            } else {
                kVar.a(this);
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
        dh.k kVar = this.i0;
        if (kVar != null) {
            kVar.b(this);
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
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        boolean z10 = this.W;
        int i11 = z10 ? (int) (size * 1.25f) : size;
        if (z10 && this.r == 1) {
            i11 /= 2;
        }
        setMeasuredDimension(size, i11);
        p();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wc wcVar = this.r0;
        if (wcVar == null || !wcVar.b(motionEvent)) {
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
                this.i0 = dh.k.e(this);
            }
        } else {
            dh.k kVar = this.i0;
            if (kVar != null) {
                kVar.b(this);
                this.i0 = null;
            }
        }
    }

    public final boolean q(float f10) {
        int i9;
        if (this.W && this.r < 5) {
            int dp = AndroidUtilities.dp(26.0f) + ((int) this.J.d());
            if (this.y) {
                int dp2 = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.B;
                i9 = dp2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.D ? AndroidUtilities.dp(10.0f) : 0);
            } else {
                i9 = 0;
            }
            if (dp + ((dp <= 0 || i9 <= 0) ? 0 : AndroidUtilities.dp(8.0f)) + i9 > f10) {
                return true;
            }
        }
        return false;
    }

    public void setGradientView(e00 e00Var) {
        this.s = e00Var;
    }

    public void setHighlightProgress(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            invalidate();
        }
    }

    public void setReorder(boolean z10) {
        this.t0 = z10;
        invalidate();
    }

    public void setStyle(int i9) {
        if (this.n0 == i9) {
            return;
        }
        this.n0 = i9;
        if (i9 == 1) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(21, this, null);
            this.L = checkBoxBase;
            checkBoxBase.h(-1, org.telegram.ui.ActionBar.f6.Lh, org.telegram.ui.ActionBar.f6.k7);
            this.L.k(true);
            this.L.d(0);
            this.L.e(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            if (this.N) {
                this.L.l = true;
            }
            wc wcVar = new wc(this);
            this.r0 = wcVar;
            wcVar.h = new g(this, 6);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.J == drawable || super.verifyDrawable(drawable);
    }

    public void h() {
    }
}
