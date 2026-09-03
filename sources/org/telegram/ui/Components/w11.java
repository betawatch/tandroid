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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class w11 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public TextPaint B;
    public StaticLayout C;
    public ip D;
    public final p9 E;
    public final int F;
    public nq0 G;
    public final int H;
    public int I;
    public float J;
    public org.telegram.ui.co K;
    public boolean L;
    public final ImageReceiver M;
    public z8 N;
    public final org.telegram.ui.ActionBar.g5 O;
    public final org.telegram.ui.ActionBar.g5 P;
    public TLRPC.WallPaper Q;
    public long R;
    public int S;
    public boolean T;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public v11 f;
    public v11 h;
    public float n;
    public final Paint r;
    public final Paint s;
    public final RectF v;
    public final Path w;
    public final org.telegram.ui.ActionBar.f6 x;
    public ValueAnimator y;

    public w11(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = AndroidUtilities.dp(8.0f);
        this.b = AndroidUtilities.dp(6.0f);
        this.c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.e = AndroidUtilities.dp(41.0f);
        this.f = new v11(this);
        this.n = 1.0f;
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.v = new RectF();
        this.w = new Path();
        this.O = new org.telegram.ui.ActionBar.g5(0, true, false, null);
        this.P = new org.telegram.ui.ActionBar.g5(0, false, false, null);
        this.H = i11;
        this.F = i10;
        this.x = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.M = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i5, f6Var));
        p9 p9Var = new p9(context);
        this.E = p9Var;
        p9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        p9Var.getImageReceiver().setAllowStartLottieAnimation(false);
        p9Var.getImageReceiver().setAutoRepeat(0);
        if (i11 == 0 || i11 == 3 || i11 == 2) {
            addView(p9Var, k7.b6.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(p9Var, k7.b6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
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
        StaticLayout staticLayout = this.C;
        if (staticLayout != null) {
            return staticLayout;
        }
        TextPaint textPaint = new TextPaint(129);
        this.B = textPaint;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.We, this.x));
        this.B.setTextSize(AndroidUtilities.dp(c()));
        this.B.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(52.0f);
        int i10 = this.H;
        if (i10 == 3 || i10 == 4) {
            dp = AndroidUtilities.dp(77.0f);
        }
        int i11 = dp;
        String b10 = b();
        TextPaint textPaint2 = this.B;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = kw0.d(b10, textPaint2, i11, true, i11, 3);
        this.C = d;
        return d;
    }

    public String b() {
        return LocaleController.getString(R.string.ChatNoTheme);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.E.getImageReceiver().getLottieAnimation() != null) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            this.E.setVisibility(0);
            if (!this.E.getImageReceiver().getLottieAnimation().i0) {
                this.E.getImageReceiver().getLottieAnimation().L(0, true, false);
                this.E.getImageReceiver().getLottieAnimation().start();
            }
            this.E.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(AndroidUtilities.overshootInterpolator).start();
            nq0 nq0Var = new nq0(this, 16);
            this.G = nq0Var;
            AndroidUtilities.runOnUIThread(nq0Var, 2500L);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        v11 v11Var;
        v11 v11Var2;
        if (this.D == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.K != null) {
            canvas.save();
            canvas.clipPath(this.w);
            this.K.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.K.draw(canvas);
            canvas.restore();
        }
        if (this.n != 1.0f && (v11Var2 = this.h) != null) {
            v11Var2.b(canvas, 1.0f);
        }
        float f10 = this.n;
        if (f10 != 0.0f) {
            this.f.b(canvas, f10);
        }
        if (this.n != 1.0f && (v11Var = this.h) != null) {
            v11Var.a(canvas, 1.0f);
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

    public final void f(ip ipVar, long j10, boolean z4) {
        long j11;
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.e4 e4Var;
        Drawable drawable;
        int i10;
        int i11;
        int i12;
        int i13;
        ec0 ec0Var;
        org.telegram.ui.co coVar;
        org.telegram.ui.co coVar2;
        boolean z10 = this.D != ipVar;
        int i14 = this.S;
        int i15 = ipVar.c;
        boolean z11 = i14 != i15;
        this.S = i15;
        this.D = ipVar;
        TLRPC.Document f10 = ipVar.a.f();
        org.telegram.ui.ActionBar.e4 e4Var2 = ipVar.a;
        long giftThemeUser = e4Var2.d instanceof TLRPC.TL_chatThemeUniqueGift ? ChatThemeController.getInstance(e4Var2.g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) e4Var2.d).gift.slug) : 0L;
        this.R = giftThemeUser;
        if (j10 == giftThemeUser) {
            this.R = 0L;
        }
        String str = null;
        if (this.R != 0) {
            if (this.N == null) {
                this.N = new z8((org.telegram.ui.ActionBar.f6) null);
            }
            TLObject userOrChat = MessagesController.getInstance(this.F).getUserOrChat(this.R);
            this.N.j(this.F, userOrChat);
            this.M.setForUserOrChat(userOrChat, this.N);
        } else {
            this.M.clearImage();
        }
        if (z10) {
            nq0 nq0Var = this.G;
            if (nq0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(nq0Var);
                this.G = null;
            }
            this.E.animate().cancel();
            this.E.setScaleX(1.0f);
            this.E.setScaleY(1.0f);
        }
        if (z10) {
            Drawable svgThumb = f10 != null ? DocumentObject.getSvgThumb(f10, org.telegram.ui.ActionBar.j6.c7, 0.2f) : null;
            if (svgThumb == null) {
                Emoji.preloadEmoji(ipVar.a.e);
                svgThumb = Emoji.getEmojiDrawable(ipVar.a.e);
            }
            this.E.h(ImageLocation.getForDocument(f10), "50_50", svgThumb, null);
            ipVar.a.getClass();
            TLRPC.WallPaper wallPaper = this.Q;
            if (wallPaper != null) {
                if (this.L && (coVar2 = this.K) != null) {
                    coVar2.g(this);
                }
                org.telegram.ui.co coVar3 = new org.telegram.ui.co(wallPaper, false, true);
                this.K = coVar3;
                coVar3.b = this;
                ec0 ec0Var2 = coVar3.f;
                if (ec0Var2 != null) {
                    ec0Var2.r(this);
                }
                if (this.L) {
                    this.K.f(this);
                }
            } else {
                if (this.L && (coVar = this.K) != null) {
                    coVar.g(this);
                }
                this.K = null;
            }
        }
        this.E.setVisibility((!ipVar.a.m() || this.Q == null) ? 0 : 8);
        if (z10 || z11) {
            if (z4) {
                this.n = 0.0f;
                this.h = this.f;
                this.f = new v11(this);
                invalidate();
            } else {
                this.n = 1.0f;
            }
            v11 v11Var = this.f;
            ip ipVar2 = this.D;
            if (ipVar2 == null || (e4Var = ipVar2.a) == null) {
                j11 = 0;
            } else {
                org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) e4Var.f.get(ipVar2.c);
                int i16 = d4Var.h;
                if (this.R != 0) {
                    i16 = d4Var.k;
                }
                Paint paint = v11Var.c;
                Paint paint2 = v11Var.a;
                Paint paint3 = v11Var.b;
                paint.setColor(i16);
                paint3.setColor(d4Var.i);
                int v02 = this.D.a.m() ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.x) : d4Var.j;
                int alpha = paint2.getAlpha();
                paint2.setColor(v02);
                paint2.setAlpha(alpha);
                ip ipVar3 = this.D;
                sf.a aVar = (sf.a) ipVar3.a.f.get(ipVar3.c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.d4 d4Var2 = (org.telegram.ui.ActionBar.d4) aVar;
                    if (d4Var2.a() != 0) {
                        ip ipVar4 = this.D;
                        int i17 = ((org.telegram.ui.ActionBar.d4) ipVar4.a.f.get(ipVar4.c)).d;
                        ArrayList<Integer> arrayList = d4Var2.b(i17).message_colors;
                        if (arrayList.size() > 1) {
                            int[] iArr = new int[arrayList.size()];
                            for (int i18 = 0; i18 != arrayList.size(); i18++) {
                                iArr[i18] = arrayList.get(i18).intValue() | (-16777216);
                            }
                            float dp = this.c + AndroidUtilities.dp(8.0f);
                            paint3.setShader(new LinearGradient(0.0f, dp, 0.0f, dp + this.d, iArr, (float[]) null, Shader.TileMode.CLAMP));
                        } else {
                            paint3.setShader(null);
                        }
                        paint3.setAlpha(255);
                        if (this.D != null) {
                            if (i17 >= 0) {
                                TLRPC.WallPaperSettings wallPaperSettings = d4Var2.b(i17).wallpaper.settings;
                                int i19 = wallPaperSettings.background_color;
                                int i20 = wallPaperSettings.second_background_color;
                                int i21 = wallPaperSettings.third_background_color;
                                i13 = wallPaperSettings.fourth_background_color;
                                i10 = i19;
                                i11 = i20;
                                i12 = i21;
                            } else {
                                i10 = 0;
                                i11 = 0;
                                i12 = 0;
                                i13 = 0;
                            }
                            if (i11 != 0) {
                                ec0Var = new ec0(true, i10, i11, i12, i13);
                                this.I = ec0Var.f();
                            } else {
                                ec0 ec0Var3 = new ec0(true, i10, i10, i10, i10);
                                this.I = -16777216;
                                ec0Var = ec0Var3;
                            }
                            this.D.b = ec0Var;
                        }
                        j11 = 0;
                        v11Var.d = this.D.b;
                        invalidate();
                    }
                }
                ip ipVar5 = this.D;
                org.telegram.ui.ActionBar.d4 d4Var3 = (org.telegram.ui.ActionBar.d4) ipVar5.a.f.get(ipVar5.c);
                if (this.D != null) {
                    int i22 = d4Var3.k;
                    int i23 = d4Var3.l;
                    int i24 = d4Var3.m;
                    int i25 = d4Var3.n;
                    int i26 = d4Var3.o;
                    j11 = 0;
                    if (d4Var3.a.k(false) != null) {
                        if (i23 != 0) {
                            ec0 ec0Var4 = new ec0(i22, i23, i24, i25, true, i26, false);
                            this.I = ec0Var4.f();
                            drawable = ec0Var4;
                        } else {
                            Drawable ec0Var5 = new ec0(i22, i22, i22, i22, true, i26, false);
                            this.I = -16777216;
                            drawable = ec0Var5;
                        }
                    } else if (i22 != 0 && i23 != 0) {
                        drawable = new ec0(i22, i23, i24, i25, true, i26, false);
                    } else if (i22 != 0) {
                        drawable = new ColorDrawable(i22);
                    } else {
                        org.telegram.ui.ActionBar.i6 i6Var = d4Var3.a;
                        if (i6Var == null || (i6Var.M <= 0 && i6Var.c == null)) {
                            org.telegram.ui.ActionBar.e4 e4Var3 = this.D.a;
                            if (e4Var3 == null || !e4Var3.m()) {
                                drawable = new ec0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                            drawable = null;
                        } else {
                            float dp2 = AndroidUtilities.dp(112.0f);
                            float dp3 = AndroidUtilities.dp(134.0f);
                            org.telegram.ui.ActionBar.i6 i6Var2 = d4Var3.a;
                            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(dp2, dp3, i6Var2.c, i6Var2.b, i6Var2.M);
                            if (scaledBitmap != null) {
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(scaledBitmap);
                                bitmapDrawable.setFilterBitmap(true);
                                drawable = bitmapDrawable;
                            }
                            drawable = null;
                        }
                    }
                    this.D.b = drawable;
                    v11Var.d = this.D.b;
                    invalidate();
                }
                j11 = 0;
                v11Var.d = this.D.b;
                invalidate();
            }
            long i27 = ipVar.a.i(this.S);
            if (i27 != j11) {
                TLRPC.WallPaper k10 = ipVar.a.k(this.S);
                if (k10 != null) {
                    ipVar.a.p(this.S, new s1(this, i27, ipVar, k10.settings.intensity));
                }
            } else {
                SparseArray sparseArray = ipVar.a.j(this.S).X;
                org.telegram.ui.ActionBar.h6 h6Var = sparseArray != null ? (org.telegram.ui.ActionBar.h6) sparseArray.get(((org.telegram.ui.ActionBar.d4) ipVar.a.f.get(this.S)).e) : null;
                if (h6Var != null && (tL_theme = h6Var.r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = h6Var.r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new androidx.car.app.utils.a(this, ipVar, wallPaper2, 27));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (h6Var != null && h6Var.r == null) {
                    int i28 = (int) (h6Var.p * 100.0f);
                    Drawable drawable2 = ipVar.b;
                    if (drawable2 instanceof ec0) {
                        ec0 ec0Var6 = (ec0) drawable2;
                        ec0Var6.t(ec0Var6.u, i28);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new ey(this, ipVar, i28, 21));
                }
            }
        }
        if (!z4) {
            this.E.animate().cancel();
            this.E.setScaleX(1.0f);
            this.E.setScaleY(1.0f);
            AndroidUtilities.cancelRunOnUIThread(this.G);
            if (this.E.getImageReceiver().getLottieAnimation() != null) {
                this.E.getImageReceiver().getLottieAnimation().stop();
                this.E.getImageReceiver().getLottieAnimation().L(0, false, false);
            }
        }
        org.telegram.ui.ActionBar.e4 e4Var4 = this.D.a;
        if (e4Var4 == null || e4Var4.m()) {
            setContentDescription(LocaleController.getString(R.string.ChatNoTheme));
            return;
        }
        sf.b bVar = this.D.a.c;
        if (bVar != null && (str = bVar.b) == null) {
            str = bVar.a;
        }
        setContentDescription(str);
    }

    public final void g(boolean z4, boolean z10) {
        if (!z10) {
            ValueAnimator valueAnimator = this.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.T = z4;
            this.J = z4 ? 1.0f : 0.0f;
            invalidate();
            return;
        }
        if (this.T != z4) {
            float f10 = this.J;
            ValueAnimator valueAnimator2 = this.y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z4 ? 1.0f : 0.0f);
            this.y = ofFloat;
            ofFloat.addUpdateListener(new j70(this, 27));
            this.y.addListener(new m00(12, this, z4));
            this.y.setDuration(250L);
            this.y.start();
        }
        this.T = z4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.L = true;
        org.telegram.ui.co coVar = this.K;
        if (coVar != null) {
            coVar.f(this);
        }
        this.M.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.L = false;
        org.telegram.ui.co coVar = this.K;
        if (coVar != null) {
            coVar.g(this);
        }
        this.M.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setSelected(this.T);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.H;
        if (i12 == 1 || i12 == 4) {
            int size = View.MeasureSpec.getSize(i10);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * 1.2f), TLObject.FLAG_30));
        } else {
            int dp = AndroidUtilities.dp(i12 == 0 ? 77.0f : 83.0f);
            int size2 = View.MeasureSpec.getSize(i11);
            if (size2 == 0) {
                size2 = (int) (dp * 1.35f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        p9 p9Var = this.E;
        p9Var.setPivotY(p9Var.getMeasuredHeight());
        p9Var.setPivotX(p9Var.getMeasuredWidth() / 2.0f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        float f10 = this.c;
        RectF rectF = this.v;
        rectF.set(f10, f10, i10 - f10, i11 - f10);
        Path path = this.w;
        path.reset();
        float f11 = this.b;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        int i11 = org.telegram.ui.ActionBar.j6.i5;
        org.telegram.ui.ActionBar.f6 f6Var = this.x;
        this.s.setColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        TextPaint textPaint = this.B;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.We, f6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.Q != wallPaper) {
            this.Q = wallPaper;
            ip ipVar = this.D;
            if (ipVar != null) {
                this.D = null;
                f(ipVar, 0L, false);
            }
        }
    }
}
