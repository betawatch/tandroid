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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class e31 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.p6 {
    public TextPaint E;
    public StaticLayout F;
    public yp G;
    public final y9 H;
    public final int I;
    public np0 J;
    public final int K;
    public int L;
    public float M;
    public org.telegram.ui.zn N;
    public boolean O;
    public final ImageReceiver P;
    public j9 Q;
    public final org.telegram.ui.ActionBar.l5 R;
    public final org.telegram.ui.ActionBar.l5 S;
    public TLRPC.WallPaper T;
    public long U;
    public int V;
    public boolean W;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public d31 f;
    public d31 h;
    public float n;
    public final Paint r;
    public final Paint s;
    public final RectF v;
    public final Path w;
    public final org.telegram.ui.ActionBar.u6 x;
    public ValueAnimator y;

    public e31(int i10, int i11, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.a = AndroidUtilities.dp(8.0f);
        this.b = AndroidUtilities.dp(6.0f);
        this.c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.e = AndroidUtilities.dp(41.0f);
        this.f = new d31(this);
        this.n = 1.0f;
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.v = new RectF();
        this.w = new Path();
        this.R = new org.telegram.ui.ActionBar.l5(0, true, false, null);
        this.S = new org.telegram.ui.ActionBar.l5(0, false, false, null);
        this.K = i11;
        this.I = i10;
        this.x = u6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.i5, this, u6Var);
        y9 y9Var = new y9(context);
        this.H = y9Var;
        y9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        y9Var.getImageReceiver().setAllowStartLottieAnimation(false);
        y9Var.getImageReceiver().setAutoRepeat(0);
        if (i11 == 0 || i11 == 3 || i11 == 2) {
            addView(y9Var, kb1.h(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(y9Var, kb1.h(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
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
        StaticLayout staticLayout = this.F;
        if (staticLayout != null) {
            return staticLayout;
        }
        TextPaint textPaint = new TextPaint(129);
        this.E = textPaint;
        textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.We, this.x));
        this.E.setTextSize(AndroidUtilities.dp(c()));
        this.E.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(52.0f);
        int i10 = this.K;
        if (i10 == 3 || i10 == 4) {
            dp = AndroidUtilities.dp(77.0f);
        }
        String b10 = b();
        TextPaint textPaint2 = this.E;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = qx0.d(b10, textPaint2, true, dp, 3);
        this.F = d;
        return d;
    }

    public String b() {
        return LocaleController.getString(R.string.ChatNoTheme);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.H.getImageReceiver().getLottieAnimation() != null) {
            AndroidUtilities.cancelRunOnUIThread(this.J);
            this.H.setVisibility(0);
            if (!this.H.getImageReceiver().getLottieAnimation().k0) {
                this.H.getImageReceiver().getLottieAnimation().N(0, true, false);
                this.H.getImageReceiver().getLottieAnimation().start();
            }
            this.H.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(AndroidUtilities.overshootInterpolator).start();
            np0 np0Var = new np0(this, 22);
            this.J = np0Var;
            AndroidUtilities.runOnUIThread(np0Var, 2500L);
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
        d31 d31Var;
        d31 d31Var2;
        if (this.G == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.N != null) {
            canvas.save();
            canvas.clipPath(this.w);
            this.N.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.n != 1.0f && (d31Var2 = this.h) != null) {
            d31Var2.b(canvas, 1.0f);
        }
        float f7 = this.n;
        if (f7 != 0.0f) {
            this.f.b(canvas, f7);
        }
        if (this.n != 1.0f && (d31Var = this.h) != null) {
            d31Var.a(canvas, 1.0f);
        }
        float f10 = this.n;
        if (f10 != 0.0f) {
            this.f.a(canvas, f10);
        }
        float f11 = this.n;
        if (f11 != 1.0f) {
            float f12 = f11 + 0.10666667f;
            this.n = f12;
            if (f12 >= 1.0f) {
                this.n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(yp ypVar, long j10, boolean z10) {
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.h4 h4Var;
        Drawable vc0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        vc0 vc0Var2;
        String str;
        org.telegram.ui.zn znVar;
        org.telegram.ui.zn znVar2;
        boolean z11 = this.G != ypVar;
        int i14 = this.V;
        int i15 = ypVar.c;
        boolean z12 = i14 != i15;
        this.V = i15;
        this.G = ypVar;
        TLRPC.Document e = ypVar.a.e();
        org.telegram.ui.ActionBar.h4 h4Var2 = ypVar.a;
        long giftThemeUser = h4Var2.d instanceof TLRPC.TL_chatThemeUniqueGift ? ChatThemeController.getInstance(h4Var2.g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) h4Var2.d).gift.slug) : 0L;
        this.U = giftThemeUser;
        if (j10 == giftThemeUser) {
            this.U = 0L;
        }
        if (this.U != 0) {
            if (this.Q == null) {
                this.Q = new j9((org.telegram.ui.ActionBar.u6) null);
            }
            TLObject userOrChat = MessagesController.getInstance(this.I).getUserOrChat(this.U);
            this.Q.j(this.I, userOrChat);
            this.P.setForUserOrChat(userOrChat, this.Q);
        } else {
            this.P.clearImage();
        }
        if (z11) {
            np0 np0Var = this.J;
            if (np0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(np0Var);
                this.J = null;
            }
            this.H.animate().cancel();
            this.H.setScaleX(1.0f);
            this.H.setScaleY(1.0f);
        }
        if (z11) {
            Drawable svgThumb = e != null ? DocumentObject.getSvgThumb(e, org.telegram.ui.ActionBar.y6.c7, 0.2f) : null;
            if (svgThumb == null) {
                Emoji.preloadEmoji(ypVar.a.e);
                svgThumb = Emoji.getEmojiDrawable(ypVar.a.e);
            }
            this.H.h(ImageLocation.getForDocument(e), "50_50", svgThumb, null);
            ypVar.a.getClass();
            TLRPC.WallPaper wallPaper = this.T;
            if (wallPaper != null) {
                if (this.O && (znVar2 = this.N) != null) {
                    znVar2.g(this);
                }
                org.telegram.ui.zn znVar3 = new org.telegram.ui.zn(wallPaper, false, true);
                this.N = znVar3;
                znVar3.b = this;
                vc0 vc0Var3 = znVar3.f;
                if (vc0Var3 != null) {
                    vc0Var3.q(this);
                }
                if (this.O) {
                    this.N.f(this);
                }
            } else {
                if (this.O && (znVar = this.N) != null) {
                    znVar.g(this);
                }
                this.N = null;
            }
        }
        this.H.setVisibility((!ypVar.a.l() || this.T == null) ? 0 : 8);
        if (z11 || z12) {
            if (z10) {
                this.n = 0.0f;
                this.h = this.f;
                this.f = new d31(this);
                invalidate();
            } else {
                this.n = 1.0f;
            }
            d31 d31Var = this.f;
            yp ypVar2 = this.G;
            if (ypVar2 != null && (h4Var = ypVar2.a) != null) {
                org.telegram.ui.ActionBar.g4 g4Var = (org.telegram.ui.ActionBar.g4) h4Var.f.get(ypVar2.c);
                int i16 = g4Var.h;
                if (this.U != 0) {
                    i16 = g4Var.k;
                }
                Paint paint = d31Var.c;
                Paint paint2 = d31Var.a;
                Paint paint3 = d31Var.b;
                paint.setColor(i16);
                paint3.setColor(g4Var.i);
                int w02 = this.G.a.l() ? org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.x) : g4Var.j;
                int alpha = paint2.getAlpha();
                paint2.setColor(w02);
                paint2.setAlpha(alpha);
                yp ypVar3 = this.G;
                hg.a aVar = (hg.a) ypVar3.a.f.get(ypVar3.c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.g4 g4Var2 = (org.telegram.ui.ActionBar.g4) aVar;
                    if (g4Var2.a() != 0) {
                        yp ypVar4 = this.G;
                        int i17 = ((org.telegram.ui.ActionBar.g4) ypVar4.a.f.get(ypVar4.c)).d;
                        ArrayList<Integer> arrayList = g4Var2.b(i17).message_colors;
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
                        if (this.G != null) {
                            if (i17 >= 0) {
                                TLRPC.WallPaperSettings wallPaperSettings = g4Var2.b(i17).wallpaper.settings;
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
                                vc0Var2 = new vc0(true, i10, i11, i12, i13);
                                this.L = vc0Var2.f();
                            } else {
                                int i22 = i10;
                                vc0 vc0Var4 = new vc0(true, i10, i22, i22, i10);
                                this.L = -16777216;
                                vc0Var2 = vc0Var4;
                            }
                            this.G.b = vc0Var2;
                        }
                        d31Var.d = this.G.b;
                        invalidate();
                    }
                }
                yp ypVar5 = this.G;
                org.telegram.ui.ActionBar.g4 g4Var3 = (org.telegram.ui.ActionBar.g4) ypVar5.a.f.get(ypVar5.c);
                if (this.G != null) {
                    int i23 = g4Var3.k;
                    int i24 = g4Var3.l;
                    int i25 = g4Var3.m;
                    int i26 = g4Var3.n;
                    int i27 = g4Var3.o;
                    if (g4Var3.a.k(false) != null) {
                        if (i24 != 0) {
                            vc0 vc0Var5 = new vc0(i23, i24, i25, i26, true, i27, false);
                            this.L = vc0Var5.f();
                            vc0Var = vc0Var5;
                        } else {
                            Drawable vc0Var6 = new vc0(i23, i23, i23, i23, true, i27, false);
                            this.L = -16777216;
                            vc0Var = vc0Var6;
                        }
                    } else if (i23 != 0 && i24 != 0) {
                        vc0Var = new vc0(i23, i24, i25, i26, true, i27, false);
                    } else if (i23 != 0) {
                        vc0Var = new ColorDrawable(i23);
                    } else {
                        org.telegram.ui.ActionBar.x6 x6Var = g4Var3.a;
                        if (x6Var == null || (x6Var.P <= 0 && x6Var.c == null)) {
                            org.telegram.ui.ActionBar.h4 h4Var3 = this.G.a;
                            if (h4Var3 == null || !h4Var3.l()) {
                                vc0Var = new vc0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                            vc0Var = null;
                        } else {
                            float dp2 = AndroidUtilities.dp(112.0f);
                            float dp3 = AndroidUtilities.dp(134.0f);
                            org.telegram.ui.ActionBar.x6 x6Var2 = g4Var3.a;
                            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(dp2, dp3, x6Var2.c, x6Var2.b, x6Var2.P);
                            if (scaledBitmap != null) {
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(scaledBitmap);
                                bitmapDrawable.setFilterBitmap(true);
                                vc0Var = bitmapDrawable;
                            }
                            vc0Var = null;
                        }
                    }
                    this.G.b = vc0Var;
                }
                d31Var.d = this.G.b;
                invalidate();
            }
            long h = ypVar.a.h(this.V);
            if (h != 0) {
                TLRPC.WallPaper j11 = ypVar.a.j(this.V);
                if (j11 != null) {
                    ypVar.a.o(this.V, new s1(this, h, ypVar, j11.settings.intensity));
                }
            } else {
                SparseArray sparseArray = ypVar.a.i(this.V).a0;
                org.telegram.ui.ActionBar.w6 w6Var = sparseArray != null ? (org.telegram.ui.ActionBar.w6) sparseArray.get(((org.telegram.ui.ActionBar.g4) ypVar.a.f.get(this.V)).e) : null;
                if (w6Var != null && (tL_theme = w6Var.r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = w6Var.r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new qy(this, ypVar, wallPaper2, 4));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (w6Var != null && w6Var.r == null) {
                    int i28 = (int) (w6Var.p * 100.0f);
                    Drawable drawable = ypVar.b;
                    if (drawable instanceof vc0) {
                        vc0 vc0Var7 = (vc0) drawable;
                        vc0Var7.s(vc0Var7.u, i28);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new org.telegram.ui.g4(this, ypVar, i28, 27));
                }
            }
        }
        if (!z10) {
            this.H.animate().cancel();
            this.H.setScaleX(1.0f);
            this.H.setScaleY(1.0f);
            AndroidUtilities.cancelRunOnUIThread(this.J);
            if (this.H.getImageReceiver().getLottieAnimation() != null) {
                this.H.getImageReceiver().getLottieAnimation().stop();
                this.H.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
        }
        org.telegram.ui.ActionBar.h4 h4Var4 = this.G.a;
        if (h4Var4 == null || h4Var4.l()) {
            setContentDescription(LocaleController.getString(R.string.ChatNoTheme));
            return;
        }
        hg.b bVar = this.G.a.c;
        if (bVar == null) {
            str = null;
        } else {
            str = bVar.b;
            if (str == null) {
                str = bVar.a;
            }
        }
        setContentDescription(str);
    }

    public final void g(boolean z10, boolean z11) {
        if (!z11) {
            ValueAnimator valueAnimator = this.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            this.M = z10 ? 1.0f : 0.0f;
            invalidate();
            return;
        }
        if (this.W != z10) {
            float f7 = this.M;
            ValueAnimator valueAnimator2 = this.y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
            this.y = ofFloat;
            ofFloat.addUpdateListener(new f80(this, 27));
            this.y.addListener(new org.telegram.ui.lo(21, this, z10));
            this.y.setDuration(250L);
            this.y.start();
        }
        this.W = z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
        this.O = true;
        org.telegram.ui.zn znVar = this.N;
        if (znVar != null) {
            znVar.f(this);
        }
        this.P.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.O = false;
        org.telegram.ui.zn znVar = this.N;
        if (znVar != null) {
            znVar.g(this);
        }
        this.P.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setSelected(this.W);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.K;
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
        y9 y9Var = this.H;
        y9Var.setPivotY(y9Var.getMeasuredHeight());
        y9Var.setPivotX(y9Var.getMeasuredWidth() / 2.0f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        float f7 = this.c;
        RectF rectF = this.v;
        rectF.set(f7, f7, i10 - f7, i11 - f7);
        Path path = this.w;
        path.reset();
        float f10 = this.b;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        int i11 = org.telegram.ui.ActionBar.y6.i5;
        org.telegram.ui.ActionBar.u6 u6Var = this.x;
        this.s.setColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        TextPaint textPaint = this.E;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.We, u6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.T != wallPaper) {
            this.T = wallPaper;
            yp ypVar = this.G;
            if (ypVar != null) {
                this.G = null;
                f(ypVar, 0L, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        org.telegram.ui.ActionBar.u6 u6Var = this.x;
        try {
            this.s.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.i5, u6Var));
            TextPaint textPaint = this.E;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.We, u6Var));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
