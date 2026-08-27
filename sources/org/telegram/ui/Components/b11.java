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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class b11 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public TextPaint A;
    public StaticLayout B;
    public zo C;
    public final n9 D;
    public final int E;
    public up0 F;
    public final int G;
    public int H;
    public float I;
    public org.telegram.ui.un J;
    public boolean K;
    public final ImageReceiver L;
    public y8 M;
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
    public a11 f;
    public a11 h;
    public float n;
    public final Paint r;
    public final Paint s;
    public final RectF v;
    public final Path w;
    public final org.telegram.ui.ActionBar.c6 x;
    public ValueAnimator y;

    public b11(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.a = AndroidUtilities.dp(8.0f);
        this.b = AndroidUtilities.dp(6.0f);
        this.c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.e = AndroidUtilities.dp(41.0f);
        this.f = new a11(this);
        this.n = 1.0f;
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.v = new RectF();
        this.w = new Path();
        this.N = new org.telegram.ui.ActionBar.d5(0, true, false, null);
        this.O = new org.telegram.ui.ActionBar.d5(0, false, false, null);
        this.G = i11;
        this.E = i10;
        this.x = c6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.L = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i5, c6Var));
        n9 n9Var = new n9(context);
        this.D = n9Var;
        n9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        n9Var.getImageReceiver().setAllowStartLottieAnimation(false);
        n9Var.getImageReceiver().setAutoRepeat(0);
        if (i11 == 0 || i11 == 3 || i11 == 2) {
            addView(n9Var, h7.z5.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(n9Var, h7.z5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
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
        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.We, this.x));
        this.A.setTextSize(AndroidUtilities.dp(c()));
        this.A.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(52.0f);
        int i10 = this.G;
        if (i10 == 3 || i10 == 4) {
            dp = AndroidUtilities.dp(77.0f);
        }
        int i11 = dp;
        String b10 = b();
        TextPaint textPaint2 = this.A;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = tv0.d(b10, textPaint2, i11, true, i11, 3);
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
            up0 up0Var = new up0(this, 16);
            this.F = up0Var;
            AndroidUtilities.runOnUIThread(up0Var, 2500L);
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
        a11 a11Var;
        a11 a11Var2;
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
        if (this.n != 1.0f && (a11Var2 = this.h) != null) {
            a11Var2.b(canvas, 1.0f);
        }
        float f10 = this.n;
        if (f10 != 0.0f) {
            this.f.b(canvas, f10);
        }
        if (this.n != 1.0f && (a11Var = this.h) != null) {
            a11Var.a(canvas, 1.0f);
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

    public final void f(zo zoVar, long j10, boolean z10) {
        long j11;
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.b4 b4Var;
        Drawable drawable;
        int i10;
        int i11;
        int i12;
        int i13;
        nb0 nb0Var;
        org.telegram.ui.un unVar;
        org.telegram.ui.un unVar2;
        boolean z11 = this.C != zoVar;
        int i14 = this.R;
        int i15 = zoVar.c;
        boolean z12 = i14 != i15;
        this.R = i15;
        this.C = zoVar;
        TLRPC.Document f10 = zoVar.a.f();
        org.telegram.ui.ActionBar.b4 b4Var2 = zoVar.a;
        long giftThemeUser = b4Var2.d instanceof TLRPC.TL_chatThemeUniqueGift ? ChatThemeController.getInstance(b4Var2.g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) b4Var2.d).gift.slug) : 0L;
        this.Q = giftThemeUser;
        if (j10 == giftThemeUser) {
            this.Q = 0L;
        }
        String str = null;
        if (this.Q != 0) {
            if (this.M == null) {
                this.M = new y8((org.telegram.ui.ActionBar.c6) null);
            }
            TLObject userOrChat = MessagesController.getInstance(this.E).getUserOrChat(this.Q);
            this.M.j(this.E, userOrChat);
            this.L.setForUserOrChat(userOrChat, this.M);
        } else {
            this.L.clearImage();
        }
        if (z11) {
            up0 up0Var = this.F;
            if (up0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(up0Var);
                this.F = null;
            }
            this.D.animate().cancel();
            this.D.setScaleX(1.0f);
            this.D.setScaleY(1.0f);
        }
        if (z11) {
            Drawable svgThumb = f10 != null ? DocumentObject.getSvgThumb(f10, org.telegram.ui.ActionBar.g6.c7, 0.2f) : null;
            if (svgThumb == null) {
                Emoji.preloadEmoji(zoVar.a.e);
                svgThumb = Emoji.getEmojiDrawable(zoVar.a.e);
            }
            this.D.h(ImageLocation.getForDocument(f10), "50_50", svgThumb, null);
            zoVar.a.getClass();
            TLRPC.WallPaper wallPaper = this.P;
            if (wallPaper != null) {
                if (this.K && (unVar2 = this.J) != null) {
                    unVar2.g(this);
                }
                org.telegram.ui.un unVar3 = new org.telegram.ui.un(wallPaper, false, true);
                this.J = unVar3;
                unVar3.b = this;
                nb0 nb0Var2 = unVar3.f;
                if (nb0Var2 != null) {
                    nb0Var2.r(this);
                }
                if (this.K) {
                    this.J.f(this);
                }
            } else {
                if (this.K && (unVar = this.J) != null) {
                    unVar.g(this);
                }
                this.J = null;
            }
        }
        this.D.setVisibility((!zoVar.a.m() || this.P == null) ? 0 : 8);
        if (z11 || z12) {
            if (z10) {
                this.n = 0.0f;
                this.h = this.f;
                this.f = new a11(this);
                invalidate();
            } else {
                this.n = 1.0f;
            }
            a11 a11Var = this.f;
            zo zoVar2 = this.C;
            if (zoVar2 == null || (b4Var = zoVar2.a) == null) {
                j11 = 0;
            } else {
                org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var.f.get(zoVar2.c);
                int i16 = a4Var.h;
                if (this.Q != 0) {
                    i16 = a4Var.k;
                }
                Paint paint = a11Var.c;
                Paint paint2 = a11Var.a;
                Paint paint3 = a11Var.b;
                paint.setColor(i16);
                paint3.setColor(a4Var.i);
                int v02 = this.C.a.m() ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.x) : a4Var.j;
                int alpha = paint2.getAlpha();
                paint2.setColor(v02);
                paint2.setAlpha(alpha);
                zo zoVar3 = this.C;
                of.a aVar = (of.a) zoVar3.a.f.get(zoVar3.c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.a4 a4Var2 = (org.telegram.ui.ActionBar.a4) aVar;
                    if (a4Var2.a() != 0) {
                        zo zoVar4 = this.C;
                        int i17 = ((org.telegram.ui.ActionBar.a4) zoVar4.a.f.get(zoVar4.c)).d;
                        ArrayList<Integer> arrayList = a4Var2.b(i17).message_colors;
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
                        if (this.C != null) {
                            if (i17 >= 0) {
                                TLRPC.WallPaperSettings wallPaperSettings = a4Var2.b(i17).wallpaper.settings;
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
                                nb0Var = new nb0(true, i10, i11, i12, i13);
                                this.H = nb0Var.f();
                            } else {
                                nb0 nb0Var3 = new nb0(true, i10, i10, i10, i10);
                                this.H = -16777216;
                                nb0Var = nb0Var3;
                            }
                            this.C.b = nb0Var;
                        }
                        j11 = 0;
                        a11Var.d = this.C.b;
                        invalidate();
                    }
                }
                zo zoVar5 = this.C;
                org.telegram.ui.ActionBar.a4 a4Var3 = (org.telegram.ui.ActionBar.a4) zoVar5.a.f.get(zoVar5.c);
                if (this.C != null) {
                    int i22 = a4Var3.k;
                    int i23 = a4Var3.l;
                    int i24 = a4Var3.m;
                    int i25 = a4Var3.n;
                    int i26 = a4Var3.o;
                    j11 = 0;
                    if (a4Var3.a.k(false) != null) {
                        if (i23 != 0) {
                            nb0 nb0Var4 = new nb0(i22, i23, i24, i25, true, i26, false);
                            this.H = nb0Var4.f();
                            drawable = nb0Var4;
                        } else {
                            Drawable nb0Var5 = new nb0(i22, i22, i22, i22, true, i26, false);
                            this.H = -16777216;
                            drawable = nb0Var5;
                        }
                    } else if (i22 != 0 && i23 != 0) {
                        drawable = new nb0(i22, i23, i24, i25, true, i26, false);
                    } else if (i22 != 0) {
                        drawable = new ColorDrawable(i22);
                    } else {
                        org.telegram.ui.ActionBar.f6 f6Var = a4Var3.a;
                        if (f6Var == null || (f6Var.L <= 0 && f6Var.c == null)) {
                            org.telegram.ui.ActionBar.b4 b4Var3 = this.C.a;
                            if (b4Var3 == null || !b4Var3.m()) {
                                drawable = new nb0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                            drawable = null;
                        } else {
                            float dp2 = AndroidUtilities.dp(112.0f);
                            float dp3 = AndroidUtilities.dp(134.0f);
                            org.telegram.ui.ActionBar.f6 f6Var2 = a4Var3.a;
                            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(dp2, dp3, f6Var2.c, f6Var2.b, f6Var2.L);
                            if (scaledBitmap != null) {
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(scaledBitmap);
                                bitmapDrawable.setFilterBitmap(true);
                                drawable = bitmapDrawable;
                            }
                            drawable = null;
                        }
                    }
                    this.C.b = drawable;
                    a11Var.d = this.C.b;
                    invalidate();
                }
                j11 = 0;
                a11Var.d = this.C.b;
                invalidate();
            }
            long i27 = zoVar.a.i(this.R);
            if (i27 != j11) {
                TLRPC.WallPaper k10 = zoVar.a.k(this.R);
                if (k10 != null) {
                    zoVar.a.p(this.R, new nh.p1(this, i27, zoVar, k10.settings.intensity));
                }
            } else {
                SparseArray sparseArray = zoVar.a.j(this.R).W;
                org.telegram.ui.ActionBar.e6 e6Var = sparseArray != null ? (org.telegram.ui.ActionBar.e6) sparseArray.get(((org.telegram.ui.ActionBar.a4) zoVar.a.f.get(this.R)).e) : null;
                if (e6Var != null && (tL_theme = e6Var.r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = e6Var.r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new iq0(this, zoVar, wallPaper2, 1));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (e6Var != null && e6Var.r == null) {
                    int i28 = (int) (e6Var.p * 100.0f);
                    Drawable drawable2 = zoVar.b;
                    if (drawable2 instanceof nb0) {
                        nb0 nb0Var6 = (nb0) drawable2;
                        nb0Var6.t(nb0Var6.u, i28);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new km(this, zoVar, i28, 23));
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
        of.b bVar = this.C.a.c;
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
            ofFloat.addUpdateListener(new v60(this, 27));
            this.y.addListener(new org.telegram.ui.go(21, this, z10));
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
        org.telegram.ui.un unVar = this.J;
        if (unVar != null) {
            unVar.f(this);
        }
        this.L.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.K = false;
        org.telegram.ui.un unVar = this.J;
        if (unVar != null) {
            unVar.g(this);
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
    public final void onMeasure(int i10, int i11) {
        int i12 = this.G;
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
        n9 n9Var = this.D;
        n9Var.setPivotY(n9Var.getMeasuredHeight());
        n9Var.setPivotX(n9Var.getMeasuredWidth() / 2.0f);
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
        int i11 = org.telegram.ui.ActionBar.g6.i5;
        org.telegram.ui.ActionBar.c6 c6Var = this.x;
        this.s.setColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        TextPaint textPaint = this.A;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.We, c6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.P != wallPaper) {
            this.P = wallPaper;
            zo zoVar = this.C;
            if (zoVar != null) {
                this.C = null;
                f(zoVar, 0L, false);
            }
        }
    }
}
