package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class a11 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public TextPaint A;
    public StaticLayout B;
    public bp C;
    public final o9 D;
    public final int E;
    public tp0 F;
    public final int G;
    public int H;
    public float I;
    public org.telegram.ui.tn J;
    public boolean K;
    public final ImageReceiver L;
    public z8 M;
    public final org.telegram.ui.ActionBar.d5 N;
    public final org.telegram.ui.ActionBar.d5 O;
    public TLRPC.WallPaper P;
    public long Q;
    public int R;
    public boolean S;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public z01 f;
    public z01 h;
    public float n;
    public final Paint r;
    public final Paint s;
    public final RectF v;
    public final Path w;
    public final org.telegram.ui.ActionBar.b6 x;
    public ValueAnimator y;

    public a11(int i9, int i10, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = AndroidUtilities.dp(8.0f);
        this.b = AndroidUtilities.dp(6.0f);
        this.c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.e = AndroidUtilities.dp(41.0f);
        this.f = new z01(this);
        this.n = 1.0f;
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.v = new RectF();
        this.w = new Path();
        this.N = new org.telegram.ui.ActionBar.d5(0, true, false, null);
        this.O = new org.telegram.ui.ActionBar.d5(0, false, false, null);
        this.G = i10;
        this.E = i9;
        this.x = b6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.L = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i5, b6Var));
        o9 o9Var = new o9(context);
        this.D = o9Var;
        o9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        o9Var.getImageReceiver().setAllowStartLottieAnimation(false);
        o9Var.getImageReceiver().setAutoRepeat(0);
        if (i10 == 0 || i10 == 3 || i10 == 2) {
            addView(o9Var, g7.e6.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(o9Var, g7.e6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        }
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(551805923);
    }

    public static Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        float max = Math.max(AndroidUtilities.dp(120.0f) / bitmap.getWidth(), AndroidUtilities.dp(140.0f) / bitmap.getHeight());
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0 || Math.abs(max - 1.0f) < 0.0125f) {
            return bitmap;
        }
        int width = (int) (bitmap.getWidth() * max);
        int height = (int) (bitmap.getHeight() * max);
        return (height <= 0 || width <= 0) ? bitmap : Bitmap.createScaledBitmap(bitmap, width, height, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StaticLayout getNoThemeStaticLayout() {
        StaticLayout staticLayout = this.B;
        if (staticLayout != null) {
            return staticLayout;
        }
        TextPaint textPaint = new TextPaint(129);
        this.A = textPaint;
        textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.We, this.x));
        this.A.setTextSize(AndroidUtilities.dp(c()));
        this.A.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(52.0f);
        int i9 = this.G;
        if (i9 == 3 || i9 == 4) {
            dp = AndroidUtilities.dp(77.0f);
        }
        int i10 = dp;
        String b10 = b();
        TextPaint textPaint2 = this.A;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = rv0.d(b10, textPaint2, i10, true, i10, 3);
        this.B = d;
        return d;
    }

    public String b() {
        return LocaleController.getString(R.string.ChatNoTheme);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.D.getImageReceiver().getLottieAnimation() != null) {
            AndroidUtilities.cancelRunOnUIThread(this.F);
            this.D.setVisibility(0);
            if (!this.D.getImageReceiver().getLottieAnimation().h0) {
                this.D.getImageReceiver().getLottieAnimation().L(0, true, false);
                this.D.getImageReceiver().getLottieAnimation().start();
            }
            this.D.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(AndroidUtilities.overshootInterpolator).start();
            tp0 tp0Var = new tp0(this, 16);
            this.F = tp0Var;
            AndroidUtilities.runOnUIThread(tp0Var, 2500L);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        z01 z01Var;
        z01 z01Var2;
        if (this.C == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.J != null) {
            canvas.save();
            canvas.clipPath(this.w);
            this.J.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.J.draw(canvas);
            canvas.restore();
        }
        if (this.n != 1.0f && (z01Var2 = this.h) != null) {
            z01Var2.b(canvas, 1.0f);
        }
        float f10 = this.n;
        if (f10 != 0.0f) {
            this.f.b(canvas, f10);
        }
        if (this.n != 1.0f && (z01Var = this.h) != null) {
            z01Var.a(canvas, 1.0f);
        }
        float f11 = this.n;
        if (f11 != 0.0f) {
            this.f.a(canvas, f11);
        }
        float f12 = this.n;
        if (f12 != 1.0f) {
            float f13 = f12 + 0.10666667f;
            this.n = f13;
            if (f13 >= 1.0f) {
                this.n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(bp bpVar, long j10, boolean z10) {
        long j11;
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.b4 b4Var;
        Drawable drawable;
        int i9;
        int i10;
        int i11;
        int i12;
        jb0 jb0Var;
        org.telegram.ui.tn tnVar;
        org.telegram.ui.tn tnVar2;
        boolean z11 = this.C != bpVar;
        int i13 = this.R;
        int i14 = bpVar.c;
        boolean z12 = i13 != i14;
        this.R = i14;
        this.C = bpVar;
        TLRPC.Document f10 = bpVar.a.f();
        org.telegram.ui.ActionBar.b4 b4Var2 = bpVar.a;
        long giftThemeUser = b4Var2.d instanceof TLRPC.TL_chatThemeUniqueGift ? ChatThemeController.getInstance(b4Var2.g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) b4Var2.d).gift.slug) : 0L;
        this.Q = giftThemeUser;
        if (j10 == giftThemeUser) {
            this.Q = 0L;
        }
        String str = null;
        if (this.Q != 0) {
            if (this.M == null) {
                this.M = new z8((org.telegram.ui.ActionBar.b6) null);
            }
            TLObject userOrChat = MessagesController.getInstance(this.E).getUserOrChat(this.Q);
            this.M.j(this.E, userOrChat);
            this.L.setForUserOrChat(userOrChat, this.M);
        } else {
            this.L.clearImage();
        }
        if (z11) {
            tp0 tp0Var = this.F;
            if (tp0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(tp0Var);
                this.F = null;
            }
            this.D.animate().cancel();
            this.D.setScaleX(1.0f);
            this.D.setScaleY(1.0f);
        }
        if (z11) {
            Drawable svgThumb = f10 != null ? DocumentObject.getSvgThumb(f10, org.telegram.ui.ActionBar.f6.c7, 0.2f) : null;
            if (svgThumb == null) {
                Emoji.preloadEmoji(bpVar.a.e);
                svgThumb = Emoji.getEmojiDrawable(bpVar.a.e);
            }
            this.D.h(ImageLocation.getForDocument(f10), "50_50", svgThumb, null);
            bpVar.a.getClass();
            TLRPC.WallPaper wallPaper = this.P;
            if (wallPaper != null) {
                if (this.K && (tnVar2 = this.J) != null) {
                    tnVar2.g(this);
                }
                org.telegram.ui.tn tnVar3 = new org.telegram.ui.tn(wallPaper, false, true);
                this.J = tnVar3;
                tnVar3.b = this;
                jb0 jb0Var2 = tnVar3.f;
                if (jb0Var2 != null) {
                    jb0Var2.r(this);
                }
                if (this.K) {
                    this.J.f(this);
                }
            } else {
                if (this.K && (tnVar = this.J) != null) {
                    tnVar.g(this);
                }
                this.J = null;
            }
        }
        this.D.setVisibility((!bpVar.a.m() || this.P == null) ? 0 : 8);
        if (z11 || z12) {
            if (z10) {
                this.n = 0.0f;
                this.h = this.f;
                this.f = new z01(this);
                invalidate();
            } else {
                this.n = 1.0f;
            }
            z01 z01Var = this.f;
            bp bpVar2 = this.C;
            if (bpVar2 == null || (b4Var = bpVar2.a) == null) {
                j11 = 0;
            } else {
                org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var.f.get(bpVar2.c);
                int i15 = a4Var.h;
                if (this.Q != 0) {
                    i15 = a4Var.k;
                }
                Paint paint = z01Var.c;
                Paint paint2 = z01Var.a;
                Paint paint3 = z01Var.b;
                paint.setColor(i15);
                paint3.setColor(a4Var.i);
                int v02 = this.C.a.m() ? org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.x) : a4Var.j;
                int alpha = paint2.getAlpha();
                paint2.setColor(v02);
                paint2.setAlpha(alpha);
                bp bpVar3 = this.C;
                nf.a aVar = (nf.a) bpVar3.a.f.get(bpVar3.c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.a4 a4Var2 = (org.telegram.ui.ActionBar.a4) aVar;
                    if (a4Var2.a() != 0) {
                        bp bpVar4 = this.C;
                        int i16 = ((org.telegram.ui.ActionBar.a4) bpVar4.a.f.get(bpVar4.c)).d;
                        ArrayList<Integer> arrayList = a4Var2.b(i16).message_colors;
                        if (arrayList.size() > 1) {
                            int[] iArr = new int[arrayList.size()];
                            for (int i17 = 0; i17 != arrayList.size(); i17++) {
                                iArr[i17] = arrayList.get(i17).intValue() | (-16777216);
                            }
                            float dp = this.c + AndroidUtilities.dp(8.0f);
                            paint3.setShader(new LinearGradient(0.0f, dp, 0.0f, dp + this.d, iArr, (float[]) null, Shader.TileMode.CLAMP));
                        } else {
                            paint3.setShader(null);
                        }
                        paint3.setAlpha(255);
                        if (this.C != null) {
                            if (i16 >= 0) {
                                TLRPC.WallPaperSettings wallPaperSettings = a4Var2.b(i16).wallpaper.settings;
                                int i18 = wallPaperSettings.background_color;
                                int i19 = wallPaperSettings.second_background_color;
                                int i20 = wallPaperSettings.third_background_color;
                                i12 = wallPaperSettings.fourth_background_color;
                                i9 = i18;
                                i10 = i19;
                                i11 = i20;
                            } else {
                                i9 = 0;
                                i10 = 0;
                                i11 = 0;
                                i12 = 0;
                            }
                            if (i10 != 0) {
                                jb0Var = new jb0(true, i9, i10, i11, i12);
                                this.H = jb0Var.f();
                            } else {
                                jb0 jb0Var3 = new jb0(true, i9, i9, i9, i9);
                                this.H = -16777216;
                                jb0Var = jb0Var3;
                            }
                            this.C.b = jb0Var;
                        }
                        j11 = 0;
                        z01Var.d = this.C.b;
                        invalidate();
                    }
                }
                bp bpVar5 = this.C;
                org.telegram.ui.ActionBar.a4 a4Var3 = (org.telegram.ui.ActionBar.a4) bpVar5.a.f.get(bpVar5.c);
                if (this.C != null) {
                    int i21 = a4Var3.k;
                    int i22 = a4Var3.l;
                    int i23 = a4Var3.m;
                    int i24 = a4Var3.n;
                    int i25 = a4Var3.o;
                    j11 = 0;
                    if (a4Var3.a.k(false) != null) {
                        if (i22 != 0) {
                            jb0 jb0Var4 = new jb0(i21, i22, i23, i24, true, i25, false);
                            this.H = jb0Var4.f();
                            drawable = jb0Var4;
                        } else {
                            Drawable jb0Var5 = new jb0(i21, i21, i21, i21, true, i25, false);
                            this.H = -16777216;
                            drawable = jb0Var5;
                        }
                    } else if (i21 != 0 && i22 != 0) {
                        drawable = new jb0(i21, i22, i23, i24, true, i25, false);
                    } else if (i21 != 0) {
                        drawable = new ColorDrawable(i21);
                    } else {
                        org.telegram.ui.ActionBar.e6 e6Var = a4Var3.a;
                        if (e6Var == null || (e6Var.L <= 0 && e6Var.c == null)) {
                            org.telegram.ui.ActionBar.b4 b4Var3 = this.C.a;
                            if (b4Var3 == null || !b4Var3.m()) {
                                drawable = new jb0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                            drawable = null;
                        } else {
                            float dp2 = AndroidUtilities.dp(112.0f);
                            float dp3 = AndroidUtilities.dp(134.0f);
                            org.telegram.ui.ActionBar.e6 e6Var2 = a4Var3.a;
                            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(dp2, dp3, e6Var2.c, e6Var2.b, e6Var2.L);
                            if (scaledBitmap != null) {
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(scaledBitmap);
                                bitmapDrawable.setFilterBitmap(true);
                                drawable = bitmapDrawable;
                            }
                            drawable = null;
                        }
                    }
                    this.C.b = drawable;
                    z01Var.d = this.C.b;
                    invalidate();
                }
                j11 = 0;
                z01Var.d = this.C.b;
                invalidate();
            }
            long i26 = bpVar.a.i(this.R);
            if (i26 != j11) {
                TLRPC.WallPaper k10 = bpVar.a.k(this.R);
                if (k10 != null) {
                    bpVar.a.p(this.R, new mh.q1(this, i26, bpVar, k10.settings.intensity));
                }
            } else {
                SparseArray sparseArray = bpVar.a.j(this.R).W;
                org.telegram.ui.ActionBar.d6 d6Var = sparseArray != null ? (org.telegram.ui.ActionBar.d6) sparseArray.get(((org.telegram.ui.ActionBar.a4) bpVar.a.f.get(this.R)).e) : null;
                if (d6Var != null && (tL_theme = d6Var.r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = d6Var.r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new hq0(this, bpVar, wallPaper2, 1));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (d6Var != null && d6Var.r == null) {
                    int i27 = (int) (d6Var.p * 100.0f);
                    Drawable drawable2 = bpVar.b;
                    if (drawable2 instanceof jb0) {
                        jb0 jb0Var6 = (jb0) drawable2;
                        jb0Var6.t(jb0Var6.u, i27);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new org.telegram.ui.rl(this, bpVar, i27, 24));
                }
            }
        }
        if (!z10) {
            this.D.animate().cancel();
            this.D.setScaleX(1.0f);
            this.D.setScaleY(1.0f);
            AndroidUtilities.cancelRunOnUIThread(this.F);
            if (this.D.getImageReceiver().getLottieAnimation() != null) {
                this.D.getImageReceiver().getLottieAnimation().stop();
                this.D.getImageReceiver().getLottieAnimation().L(0, false, false);
            }
        }
        org.telegram.ui.ActionBar.b4 b4Var4 = this.C.a;
        if (b4Var4 == null || b4Var4.m()) {
            setContentDescription(LocaleController.getString(R.string.ChatNoTheme));
            return;
        }
        nf.b bVar = this.C.a.c;
        if (bVar != null && (str = bVar.b) == null) {
            str = bVar.a;
        }
        setContentDescription(str);
    }

    public final void g(boolean z10, boolean z11) {
        if (!z11) {
            ValueAnimator valueAnimator = this.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.S = z10;
            this.I = z10 ? 1.0f : 0.0f;
            invalidate();
            return;
        }
        if (this.S != z10) {
            float f10 = this.I;
            ValueAnimator valueAnimator2 = this.y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
            this.y = ofFloat;
            ofFloat.addUpdateListener(new q60(this, 27));
            this.y.addListener(new u9(20, this, z10));
            this.y.setDuration(250L);
            this.y.start();
        }
        this.S = z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.K = true;
        org.telegram.ui.tn tnVar = this.J;
        if (tnVar != null) {
            tnVar.f(this);
        }
        this.L.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.K = false;
        org.telegram.ui.tn tnVar = this.J;
        if (tnVar != null) {
            tnVar.g(this);
        }
        this.L.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setSelected(this.S);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11 = this.G;
        if (i11 == 1 || i11 == 4) {
            int size = View.MeasureSpec.getSize(i9);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * 1.2f), TLObject.FLAG_30));
        } else {
            int dp = AndroidUtilities.dp(i11 == 0 ? 77.0f : 83.0f);
            int size2 = View.MeasureSpec.getSize(i10);
            if (size2 == 0) {
                size2 = (int) (dp * 1.35f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        o9 o9Var = this.D;
        o9Var.setPivotY(o9Var.getMeasuredHeight());
        o9Var.setPivotX(o9Var.getMeasuredWidth() / 2.0f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (i9 == i11 && i10 == i12) {
            return;
        }
        float f10 = this.c;
        RectF rectF = this.v;
        rectF.set(f10, f10, i9 - f10, i10 - f10);
        Path path = this.w;
        path.reset();
        float f11 = this.b;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        int i10 = org.telegram.ui.ActionBar.f6.i5;
        org.telegram.ui.ActionBar.b6 b6Var = this.x;
        this.s.setColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        TextPaint textPaint = this.A;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.We, b6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.P != wallPaper) {
            this.P = wallPaper;
            bp bpVar = this.C;
            if (bpVar != null) {
                this.C = null;
                f(bpVar, 0L, false);
            }
        }
    }
}
