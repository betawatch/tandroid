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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class v21 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b6 {
    public TextPaint E;
    public StaticLayout F;
    public vp G;
    public final w9 H;
    public final int I;
    public kr0 J;
    public final int K;
    public int L;
    public float M;
    public org.telegram.ui.vn N;
    public boolean O;
    public final ImageReceiver P;
    public h9 Q;
    public final org.telegram.ui.ActionBar.j5 R;
    public final org.telegram.ui.ActionBar.j5 S;
    public TLRPC.WallPaper T;
    public long U;
    public int V;
    public boolean W;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public u21 f;
    public u21 h;
    public float n;
    public final Paint r;
    public final Paint s;
    public final RectF v;
    public final Path w;
    public final org.telegram.ui.ActionBar.g6 x;
    public ValueAnimator y;

    public v21(int i10, int i11, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = AndroidUtilities.dp(8.0f);
        this.b = AndroidUtilities.dp(6.0f);
        this.c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.e = AndroidUtilities.dp(41.0f);
        this.f = new u21(this);
        this.n = 1.0f;
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.v = new RectF();
        this.w = new Path();
        this.R = new org.telegram.ui.ActionBar.j5(0, true, false, null);
        this.S = new org.telegram.ui.ActionBar.j5(0, false, false, null);
        this.K = i11;
        this.I = i10;
        this.x = g6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.i5, this, g6Var);
        w9 w9Var = new w9(context);
        this.H = w9Var;
        w9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        w9Var.getImageReceiver().setAllowStartLottieAnimation(false);
        w9Var.getImageReceiver().setAutoRepeat(0);
        if (i11 == 0 || i11 == 3 || i11 == 2) {
            addView(w9Var, w7.z5.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(w9Var, w7.z5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
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
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.We, this.x));
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
        StaticLayout d = ix0.d(b10, textPaint2, true, dp, 3);
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
            kr0 kr0Var = new kr0(this, 17);
            this.J = kr0Var;
            AndroidUtilities.runOnUIThread(kr0Var, 2500L);
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
        u21 u21Var;
        u21 u21Var2;
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
        if (this.n != 1.0f && (u21Var2 = this.h) != null) {
            u21Var2.b(canvas, 1.0f);
        }
        float f7 = this.n;
        if (f7 != 0.0f) {
            this.f.b(canvas, f7);
        }
        if (this.n != 1.0f && (u21Var = this.h) != null) {
            u21Var.a(canvas, 1.0f);
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

    public final void f(vp vpVar, long j10, boolean z10) {
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.f4 f4Var;
        Drawable drawable;
        int i10;
        int i11;
        int i12;
        int i13;
        yc0 yc0Var;
        String str;
        org.telegram.ui.vn vnVar;
        org.telegram.ui.vn vnVar2;
        boolean z11 = this.G != vpVar;
        int i14 = this.V;
        int i15 = vpVar.c;
        boolean z12 = i14 != i15;
        this.V = i15;
        this.G = vpVar;
        TLRPC.Document e = vpVar.a.e();
        org.telegram.ui.ActionBar.f4 f4Var2 = vpVar.a;
        long giftThemeUser = f4Var2.d instanceof TLRPC.TL_chatThemeUniqueGift ? ChatThemeController.getInstance(f4Var2.g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) f4Var2.d).gift.slug) : 0L;
        this.U = giftThemeUser;
        if (j10 == giftThemeUser) {
            this.U = 0L;
        }
        if (this.U != 0) {
            if (this.Q == null) {
                this.Q = new h9((org.telegram.ui.ActionBar.g6) null);
            }
            TLObject userOrChat = MessagesController.getInstance(this.I).getUserOrChat(this.U);
            this.Q.j(this.I, userOrChat);
            this.P.setForUserOrChat(userOrChat, this.Q);
        } else {
            this.P.clearImage();
        }
        if (z11) {
            kr0 kr0Var = this.J;
            if (kr0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(kr0Var);
                this.J = null;
            }
            this.H.animate().cancel();
            this.H.setScaleX(1.0f);
            this.H.setScaleY(1.0f);
        }
        if (z11) {
            Drawable svgThumb = e != null ? DocumentObject.getSvgThumb(e, org.telegram.ui.ActionBar.k6.c7, 0.2f) : null;
            if (svgThumb == null) {
                Emoji.preloadEmoji(vpVar.a.e);
                svgThumb = Emoji.getEmojiDrawable(vpVar.a.e);
            }
            this.H.h(ImageLocation.getForDocument(e), "50_50", svgThumb, null);
            vpVar.a.getClass();
            TLRPC.WallPaper wallPaper = this.T;
            if (wallPaper != null) {
                if (this.O && (vnVar2 = this.N) != null) {
                    vnVar2.g(this);
                }
                org.telegram.ui.vn vnVar3 = new org.telegram.ui.vn(wallPaper, false, true);
                this.N = vnVar3;
                vnVar3.b = this;
                yc0 yc0Var2 = vnVar3.f;
                if (yc0Var2 != null) {
                    yc0Var2.q(this);
                }
                if (this.O) {
                    this.N.f(this);
                }
            } else {
                if (this.O && (vnVar = this.N) != null) {
                    vnVar.g(this);
                }
                this.N = null;
            }
        }
        this.H.setVisibility((!vpVar.a.l() || this.T == null) ? 0 : 8);
        if (z11 || z12) {
            if (z10) {
                this.n = 0.0f;
                this.h = this.f;
                this.f = new u21(this);
                invalidate();
            } else {
                this.n = 1.0f;
            }
            u21 u21Var = this.f;
            vp vpVar2 = this.G;
            if (vpVar2 != null && (f4Var = vpVar2.a) != null) {
                org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) f4Var.f.get(vpVar2.c);
                int i16 = e4Var.h;
                if (this.U != 0) {
                    i16 = e4Var.k;
                }
                Paint paint = u21Var.c;
                Paint paint2 = u21Var.a;
                Paint paint3 = u21Var.b;
                paint.setColor(i16);
                paint3.setColor(e4Var.i);
                int w02 = this.G.a.l() ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, this.x) : e4Var.j;
                int alpha = paint2.getAlpha();
                paint2.setColor(w02);
                paint2.setAlpha(alpha);
                vp vpVar3 = this.G;
                gg.a aVar = (gg.a) vpVar3.a.f.get(vpVar3.c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.e4 e4Var2 = (org.telegram.ui.ActionBar.e4) aVar;
                    if (e4Var2.a() != 0) {
                        vp vpVar4 = this.G;
                        int i17 = ((org.telegram.ui.ActionBar.e4) vpVar4.a.f.get(vpVar4.c)).d;
                        ArrayList<Integer> arrayList = e4Var2.b(i17).message_colors;
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
                                TLRPC.WallPaperSettings wallPaperSettings = e4Var2.b(i17).wallpaper.settings;
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
                                yc0Var = new yc0(true, i10, i11, i12, i13);
                                this.L = yc0Var.f();
                            } else {
                                yc0 yc0Var3 = new yc0(true, i10, i10, i10, i10);
                                this.L = -16777216;
                                yc0Var = yc0Var3;
                            }
                            this.G.b = yc0Var;
                        }
                        u21Var.d = this.G.b;
                        invalidate();
                    }
                }
                vp vpVar5 = this.G;
                org.telegram.ui.ActionBar.e4 e4Var3 = (org.telegram.ui.ActionBar.e4) vpVar5.a.f.get(vpVar5.c);
                if (this.G != null) {
                    int i22 = e4Var3.k;
                    int i23 = e4Var3.l;
                    int i24 = e4Var3.m;
                    int i25 = e4Var3.n;
                    int i26 = e4Var3.o;
                    if (e4Var3.a.k(false) != null) {
                        if (i23 != 0) {
                            yc0 yc0Var4 = new yc0(i22, i23, i24, i25, true, i26, false);
                            this.L = yc0Var4.f();
                            drawable = yc0Var4;
                        } else {
                            Drawable yc0Var5 = new yc0(i22, i22, i22, i22, true, i26, false);
                            this.L = -16777216;
                            drawable = yc0Var5;
                        }
                    } else if (i22 != 0 && i23 != 0) {
                        drawable = new yc0(i22, i23, i24, i25, true, i26, false);
                    } else if (i22 != 0) {
                        drawable = new ColorDrawable(i22);
                    } else {
                        org.telegram.ui.ActionBar.j6 j6Var = e4Var3.a;
                        if (j6Var == null || (j6Var.P <= 0 && j6Var.c == null)) {
                            org.telegram.ui.ActionBar.f4 f4Var3 = this.G.a;
                            if (f4Var3 == null || !f4Var3.l()) {
                                drawable = new yc0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                            drawable = null;
                        } else {
                            float dp2 = AndroidUtilities.dp(112.0f);
                            float dp3 = AndroidUtilities.dp(134.0f);
                            org.telegram.ui.ActionBar.j6 j6Var2 = e4Var3.a;
                            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(dp2, dp3, j6Var2.c, j6Var2.b, j6Var2.P);
                            if (scaledBitmap != null) {
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(scaledBitmap);
                                bitmapDrawable.setFilterBitmap(true);
                                drawable = bitmapDrawable;
                            }
                            drawable = null;
                        }
                    }
                    this.G.b = drawable;
                }
                u21Var.d = this.G.b;
                invalidate();
            }
            long h = vpVar.a.h(this.V);
            if (h != 0) {
                TLRPC.WallPaper j11 = vpVar.a.j(this.V);
                if (j11 != null) {
                    vpVar.a.o(this.V, new gi.q1(this, h, vpVar, j11.settings.intensity, 4));
                }
            } else {
                SparseArray sparseArray = vpVar.a.i(this.V).a0;
                org.telegram.ui.ActionBar.i6 i6Var = sparseArray != null ? (org.telegram.ui.ActionBar.i6) sparseArray.get(((org.telegram.ui.ActionBar.e4) vpVar.a.f.get(this.V)).e) : null;
                if (i6Var != null && (tL_theme = i6Var.r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = i6Var.r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new ry(this, vpVar, wallPaper2, 4));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (i6Var != null && i6Var.r == null) {
                    int i27 = (int) (i6Var.p * 100.0f);
                    Drawable drawable2 = vpVar.b;
                    if (drawable2 instanceof yc0) {
                        yc0 yc0Var6 = (yc0) drawable2;
                        yc0Var6.s(yc0Var6.u, i27);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new org.telegram.ui.h4(this, vpVar, i27, 29));
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
        org.telegram.ui.ActionBar.f4 f4Var4 = this.G.a;
        if (f4Var4 == null || f4Var4.l()) {
            setContentDescription(LocaleController.getString(R.string.ChatNoTheme));
            return;
        }
        gg.b bVar = this.G.a.c;
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
            ofFloat.addUpdateListener(new d80(this, 28));
            this.y.addListener(new org.telegram.ui.ho(21, this, z10));
            this.y.setDuration(250L);
            this.y.start();
        }
        this.W = z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.O = true;
        org.telegram.ui.vn vnVar = this.N;
        if (vnVar != null) {
            vnVar.f(this);
        }
        this.P.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.O = false;
        org.telegram.ui.vn vnVar = this.N;
        if (vnVar != null) {
            vnVar.g(this);
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
        w9 w9Var = this.H;
        w9Var.setPivotY(w9Var.getMeasuredHeight());
        w9Var.setPivotX(w9Var.getMeasuredWidth() / 2.0f);
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
        int i11 = org.telegram.ui.ActionBar.k6.i5;
        org.telegram.ui.ActionBar.g6 g6Var = this.x;
        this.s.setColor(org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        TextPaint textPaint = this.E;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.We, g6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.T != wallPaper) {
            this.T = wallPaper;
            vp vpVar = this.G;
            if (vpVar != null) {
                this.G = null;
                f(vpVar, 0L, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.ActionBar.g6 g6Var = this.x;
        try {
            this.s.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, g6Var));
            TextPaint textPaint = this.E;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.We, g6Var));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
