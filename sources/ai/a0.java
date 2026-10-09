package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.kx;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class a0 extends FrameLayout {
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    public final da O;
    public float P;
    public float Q;
    public gk0 R;
    public o S;
    public final float T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean a;
    public final org.telegram.ui.Components.g6 a0;
    public int b;
    public final /* synthetic */ kx b0;
    public boolean c;
    public boolean d;
    public ea e;
    public TLRPC.User f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.j9 n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public final org.telegram.ui.Components.j9 v;
    public boolean w;
    public final FrameLayout x;
    public org.telegram.ui.ActionBar.j5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(kx kxVar, Context context) {
        super(context);
        this.b0 = kxVar;
        this.n = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.v = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        this.w = true;
        da daVar = new da(null, true);
        this.O = daVar;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.T = 1.0f;
        this.a0 = new org.telegram.ui.Components.g6(this, 0L, 350L, hs.h);
        daVar.o = kxVar.b == 1;
        daVar.D = true;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.x = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.N) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, w7.x5.d(-2.0f, -1));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClipInParent(boolean z10) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).setClipChildren(z10);
        }
        if (getParent() == null || getParent().getParent() == null || getParent().getParent().getParent() == null) {
            return;
        }
        ((ViewGroup) getParent().getParent().getParent()).setClipChildren(z10);
    }

    public final void b() {
        int textColor;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
        this.y = j5Var;
        j5Var.setTypeface(AndroidUtilities.bold());
        this.y.setGravity(17);
        this.y.setTextSize(11);
        org.telegram.ui.ActionBar.j5 j5Var2 = this.y;
        textColor = this.b0.getTextColor();
        j5Var2.setTextColor(textColor);
        NotificationCenter.listenEmojiLoading(this.y);
        this.y.setMaxLines(1);
        this.x.addView(this.y, w7.x5.a(-2.0f, 1.0f, 0.0f, 1.0f, 0.0f, -1, 0));
        this.r.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        this.s.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f7, float f10, float f11) {
        kx kxVar = this.b0;
        int i10 = kxVar.b;
        Paint paint = kxVar.G;
        m9 m9Var = kxVar.s;
        Paint paint2 = kxVar.H;
        Drawable drawable = kxVar.c;
        if (this.F && !m9Var.I(this.E) && Utilities.isNullOrEmpty(m9Var.E(this.E))) {
            float dp = f7 + AndroidUtilities.dp(16.0f);
            float dp2 = f10 + AndroidUtilities.dp(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.i6.m1(f11, kxVar.f(org.telegram.ui.ActionBar.i6.hl)));
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.i6.m1(f11, kxVar.f(org.telegram.ui.ActionBar.i6.s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.i6.m1(f11, kxVar.f(org.telegram.ui.ActionBar.i6.M8)));
            }
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(11.0f), paint2);
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(9.0f), paint);
            int f12 = kxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.i6.s8 : org.telegram.ui.ActionBar.i6.M8);
            if (f12 != kxVar.e) {
                kxVar.e = f12;
                drawable.setColorFilter(new PorterDuffColorFilter(f12, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f11 * 255.0f));
            drawable.setBounds((int) (dp - (drawable.getIntrinsicWidth() / 2.0f)), (int) (dp2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + dp), (int) ((drawable.getIntrinsicHeight() / 2.0f) + dp2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f7, float f10, float f11, boolean z10) {
        float f12 = this.J;
        kx kxVar = this.b0;
        if (f12 != f7 || this.K != f10 || 0.0f != f11 || this.V != z10) {
            this.V = z10;
            this.J = f7;
            this.K = f10;
            invalidate();
            kxVar.h.invalidate();
        }
        float clamp = this.N ? 0.0f : 1.0f - Utilities.clamp(kxVar.N / kxVar.B0, 1.0f, 0.0f);
        this.Q = clamp;
        float f13 = clamp * this.P;
        FrameLayout frameLayout = this.x;
        frameLayout.setAlpha(f13);
        frameLayout.setVisibility(f13 > 0.0f ? 0 : 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0205  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        ImageReceiver imageReceiver;
        float f10;
        Canvas canvas2;
        float f11;
        float f12;
        boolean z10;
        da daVar;
        float size;
        boolean z11;
        float f13;
        float f14;
        int textColor;
        float f15;
        boolean z12;
        ImageReceiver imageReceiver2;
        boolean[] zArr;
        gk0 gk0Var;
        float dp = AndroidUtilities.dp(48.0f);
        float dp2 = AndroidUtilities.dp(26.33f);
        float dp3 = AndroidUtilities.dp(8.0f);
        kx kxVar = this.b0;
        int i10 = kxVar.b;
        m9 m9Var = kxVar.s;
        Paint paint = kxVar.H;
        float clamp = Utilities.clamp(kxVar.n0 / 0.5f, 1.0f, 0.0f) * dp3;
        if (this.V) {
            clamp += Utilities.clamp((kxVar.n0 - 0.5f) / 0.5f, 1.0f, 0.0f) * AndroidUtilities.dp(16.0f);
        }
        float lerp = AndroidUtilities.lerp(dp + clamp, dp2, this.J);
        float f16 = lerp / 2.0f;
        float measuredWidth = (getMeasuredWidth() / 2.0f) - f16;
        float lerp2 = AndroidUtilities.lerp(measuredWidth, 0.0f, this.J);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) / 2.0f, this.J);
        float clamp2 = Utilities.clamp(this.J / 0.5f, 1.0f, 0.0f);
        da daVar2 = this.O;
        daVar2.a = true;
        RectF rectF = daVar2.F;
        if (!daVar2.p) {
            daVar2.e = 1.0f - kxVar.d0;
        }
        float f17 = lerp3 + lerp;
        rectF.set(lerp2, lerp3, lerp2 + lerp, f17);
        daVar2.G = AndroidUtilities.dpf2(1.33f) * this.J;
        ImageReceiver imageReceiver3 = this.r;
        imageReceiver3.setAlpha(1.0f);
        imageReceiver3.setRoundRadius((int) f16);
        float f18 = lerp2 + f16;
        this.L = f18;
        float f19 = lerp3 + f16;
        this.M = f19;
        if (i10 == 0) {
            f7 = f16;
            paint.setColor(kxVar.f(org.telegram.ui.ActionBar.i6.s8));
        } else {
            f7 = f16;
            paint.setColor(kxVar.f(org.telegram.ui.ActionBar.i6.M8));
        }
        if (this.J != 0.0f) {
            imageReceiver = imageReceiver3;
            f10 = lerp2;
            canvas.drawCircle(this.L, this.M, AndroidUtilities.dpf2(1.5f) + f7, paint);
        } else {
            imageReceiver = imageReceiver3;
            f10 = lerp2;
        }
        canvas.save();
        float f20 = this.L;
        float f21 = this.M;
        float f22 = this.T;
        canvas.scale(f22, f22, f20, f21);
        if (this.R == null) {
            this.R = kxVar.n;
        }
        ArrayList arrayList = (ArrayList) m9Var.c.f(this.E);
        boolean z13 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z13 || (this.W && (gk0Var = this.R) != null && gk0Var.f < 0.98f)) {
            canvas2 = canvas;
            f11 = f17;
            f12 = f10;
            z10 = false;
            daVar = daVar2;
            ImageReceiver imageReceiver4 = imageReceiver;
            if (z13) {
                float f23 = 0.0f;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    f23 += ((l9) arrayList.get(i11)).h;
                }
                size = (m9Var.d + f23) / (arrayList.size() + r4);
                z11 = ((l9) hg.c.g(1, arrayList)).G;
                kxVar.m0 = z11;
            } else {
                z11 = kxVar.m0;
                size = 1.0f;
            }
            invalidate();
            if (this.R == null) {
                gk0 gk0Var2 = kxVar.n;
                if (gk0Var2 != null) {
                    this.R = gk0Var2;
                } else {
                    gk0 gk0Var3 = new gk0(this);
                    this.R = gk0Var3;
                    kxVar.n = gk0Var3;
                    gk0Var3.d(null, true, false);
                }
            }
            if (this.w) {
                canvas2.save();
                canvas2.scale(daVar.b(), daVar.b(), rectF.centerX(), rectF.centerY());
                imageReceiver4.setImageCoords(rectF);
                imageReceiver4.draw(canvas2);
                canvas2.restore();
            }
            this.R.q = 0;
            Paint o9 = z11 ? ja.o(imageReceiver4) : ja.t(imageReceiver4, true);
            o9.setAlpha(255);
            gk0 gk0Var4 = this.R;
            gk0Var4.t = o9;
            gk0Var4.f((int) (imageReceiver4.getImageX() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageY() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageX2() + AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageY2() + AndroidUtilities.dp(3.0f)));
            this.R.e(Utilities.clamp(size, 1.0f, 0.0f), this.W);
            if (imageReceiver4.getVisible()) {
                this.R.a(canvas2);
            }
            this.W = true;
            invalidate();
        } else {
            float e7 = this.a0.e(this.G);
            if (this.w) {
                if (this.W) {
                    int i12 = 1;
                    daVar2.p = true;
                    daVar2.e = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new a(this, i12));
                    ofFloat.addListener(new b(this, i12));
                    ofFloat.setDuration(100L);
                    ofFloat.start();
                }
                float f24 = e7 * daVar2.e;
                daVar2.b = !this.W;
                if (!this.c && kxVar.n0 <= 0.0f) {
                    if (AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(16.0f), hs.g.getInterpolation(this.J)) < (AndroidUtilities.dpf2(3.5f) + f7) * 2.0f) {
                        f15 = ((float) Math.toDegrees(Math.acos((r1 / 2.0f) / r3))) * 2.0f;
                        daVar2.f = f15;
                        daVar2.l = this.c;
                        daVar2.m = this.d;
                        daVar2.u = 1.0f - f24;
                        z12 = this.F;
                        if (z12 && this.H) {
                            daVar2.s = this.I;
                        } else {
                            daVar2.s = 0L;
                        }
                        if (z12) {
                            f11 = f17;
                            imageReceiver2 = imageReceiver;
                            f12 = f10;
                            z10 = false;
                            f14 = clamp2;
                            zArr = null;
                            daVar = daVar2;
                            long j3 = this.E;
                            canvas2 = canvas;
                            ja.i(j3, canvas2, imageReceiver2, m9Var.I(j3), daVar);
                        } else {
                            daVar = daVar2;
                            f11 = f17;
                            imageReceiver2 = imageReceiver;
                            f12 = f10;
                            z10 = false;
                            f14 = clamp2;
                            zArr = null;
                            canvas2 = canvas;
                            ja.i(this.E, canvas2, imageReceiver2, m9Var.H(), daVar);
                        }
                        ImageReceiver imageReceiver5 = imageReceiver2;
                        if (f24 > 0.0f) {
                            if (ja.d == null) {
                                f30 f30Var = new f30();
                                ja.d = f30Var;
                                f30Var.a = true;
                                f30Var.b = true;
                                int x02 = org.telegram.ui.ActionBar.i6.x0(zArr, org.telegram.ui.ActionBar.i6.xj, z10);
                                int x03 = org.telegram.ui.ActionBar.i6.x0(zArr, org.telegram.ui.ActionBar.i6.q7, z10);
                                ja.d.d(i0.a.d(0.25f, x02, x03), x03, z10 ? 1 : 0, z10 ? 1 : 0);
                                ja.d.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                                ja.d.c.setStyle(Paint.Style.STROKE);
                                ja.d.c.setStrokeCap(Paint.Cap.ROUND);
                            }
                            ja.d.b(imageReceiver5.getImageX(), imageReceiver5.getImageY(), imageReceiver5.getImageX2(), imageReceiver5.getImageY2());
                            Paint paint2 = ja.d.c;
                            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
                            paint2.setAlpha((int) (255.0f * f24));
                            canvas2.drawCircle(f18, f19, daVar.b() * (f7 + AndroidUtilities.dp(4.0f)), paint2);
                        }
                        e7 = f24;
                    }
                }
                f15 = 0.0f;
                daVar2.f = f15;
                daVar2.l = this.c;
                daVar2.m = this.d;
                daVar2.u = 1.0f - f24;
                z12 = this.F;
                if (z12) {
                }
                daVar2.s = 0L;
                if (z12) {
                }
                ImageReceiver imageReceiver52 = imageReceiver2;
                if (f24 > 0.0f) {
                }
                e7 = f24;
            } else {
                canvas2 = canvas;
                daVar = daVar2;
                f11 = f17;
                f14 = clamp2;
                f12 = f10;
                z10 = false;
            }
            this.W = z10;
            if (this.w) {
                canvas2.save();
                float f25 = 1.0f - f14;
                canvas2.scale(f25, f25, this.L + AndroidUtilities.dp(16.0f), this.M + AndroidUtilities.dp(16.0f));
                c(canvas2, this.L, this.M, 1.0f);
                float f26 = this.L;
                float f27 = this.M;
                if (e7 > 0.0f) {
                    float dp4 = f26 + AndroidUtilities.dp(17.0f);
                    float dp5 = f27 + AndroidUtilities.dp(17.0f);
                    Paint paint3 = kxVar.G;
                    paint3.setColor(org.telegram.ui.ActionBar.i6.m1(e7, kxVar.f(org.telegram.ui.ActionBar.i6.q7)));
                    if (i10 == 0) {
                        paint.setColor(org.telegram.ui.ActionBar.i6.m1(e7, kxVar.f(org.telegram.ui.ActionBar.i6.s8)));
                    } else {
                        paint.setColor(org.telegram.ui.ActionBar.i6.m1(e7, kxVar.f(org.telegram.ui.ActionBar.i6.M8)));
                    }
                    float interpolation = hs.k.getInterpolation(e7) * AndroidUtilities.dp(9.0f);
                    canvas2.drawCircle(dp4, dp5, AndroidUtilities.dp(2.0f) + interpolation, paint);
                    canvas2.drawCircle(dp4, dp5, interpolation, paint3);
                    textColor = kxVar.getTextColor();
                    paint3.setColor(org.telegram.ui.ActionBar.i6.m1(e7, textColor));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(dp4 - AndroidUtilities.dp(1.0f), dp5 - AndroidUtilities.dpf2(4.6f), AndroidUtilities.dp(1.0f) + dp4, AndroidUtilities.dpf2(1.6f) + dp5);
                    canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint3);
                    rectF2.set(dp4 - AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(2.6f) + dp5, dp4 + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(4.6f) + dp5);
                    canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint3);
                }
                canvas2.restore();
            }
        }
        canvas2.restore();
        if (!this.H || this.K <= 0.0f) {
            f13 = f12;
        } else {
            ImageReceiver imageReceiver6 = this.s;
            f13 = f12;
            imageReceiver6.setImageCoords(f13, lerp3, lerp, lerp);
            imageReceiver6.setAlpha(this.K);
            imageReceiver6.draw(canvas2);
        }
        float dp6 = ((1.0f - this.J) * AndroidUtilities.dp(7.0f)) + f11;
        FrameLayout frameLayout = this.x;
        frameLayout.setTranslationY(dp6);
        frameLayout.setTranslationX(f13 - measuredWidth);
        if (!this.N) {
            if (this.F) {
                this.P = 1.0f;
            } else {
                this.P = daVar.n == 2 ? 0.7f : 1.0f;
            }
            float f28 = this.Q * this.P;
            frameLayout.setAlpha(f28);
            frameLayout.setVisibility(f28 > 0.0f ? z10 : 4);
        }
        super.dispatchDraw(canvas);
    }

    public float getCy() {
        float dp = AndroidUtilities.dp(48.0f);
        float dp2 = AndroidUtilities.dp(26.33f);
        return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) / 2.0f, this.b0.c0) + (AndroidUtilities.lerp(dp, dp2, this.J) / 2.0f);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.N || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            kx kxVar = this.b0;
            q qVar = kxVar.r;
            if (parent == qVar) {
                qVar.invalidate();
            } else {
                kxVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.onAttachedToWindow();
        this.s.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.onDetachedFromWindow();
        this.s.onDetachedFromWindow();
        this.O.g();
        ea eaVar = this.e;
        if (eaVar != null) {
            eaVar.a();
            this.e = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.N ? AndroidUtilities.dp(70.0f) : this.b0.M, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCrossfadeTo(long j3) {
        TLRPC.Chat chat;
        int i10 = this.b0.f;
        if (this.I != j3) {
            this.I = j3;
            boolean z10 = j3 != -1;
            this.H = z10;
            ImageReceiver imageReceiver = this.s;
            if (!z10) {
                imageReceiver.clearImage();
                return;
            }
            if (j3 > 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                this.f = user;
                this.h = null;
                chat = user;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                this.h = chat2;
                this.f = null;
                chat = chat2;
            }
            if (chat != null) {
                org.telegram.ui.Components.j9 j9Var = this.v;
                j9Var.j(i10, chat);
                imageReceiver.setForUserOrChat(chat, j9Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setDialogId(long j3) {
        TLRPC.Chat chat;
        l9 l9Var;
        kx kxVar = this.b0;
        int i10 = kxVar.f;
        m9 m9Var = kxVar.s;
        long j10 = this.E;
        int i11 = 0;
        boolean z10 = j10 == j3;
        if (!z10 && this.e != null) {
            m9Var.e0(j10, false);
            this.e.a();
            this.e = null;
        }
        this.E = j3;
        this.F = j3 == UserConfig.getInstance(i10).getClientUserId();
        this.G = m9Var.N(j3);
        if (j3 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            this.f = user;
            this.h = null;
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            this.h = chat2;
            this.f = null;
            chat = chat2;
        }
        ImageReceiver imageReceiver = this.r;
        if (chat == null) {
            this.y.l("", false);
            imageReceiver.clearImage();
            return;
        }
        org.telegram.ui.Components.j9 j9Var = this.n;
        j9Var.j(i10, chat);
        imageReceiver.setForUserOrChat(chat, j9Var);
        if (this.N) {
            return;
        }
        this.y.i(null);
        if (m9Var.N(j3)) {
            this.y.setTextSize(10);
            this.y.l(LocaleController.getString(R.string.FailedStory), false);
            this.U = false;
            return;
        }
        if (!Utilities.isNullOrEmpty(m9Var.E(j3))) {
            this.y.setTextSize(10);
            ja.a(this.y);
            this.U = true;
            return;
        }
        HashMap hashMap = (HashMap) m9Var.e.f(j3);
        if (hashMap != null && !hashMap.isEmpty()) {
            Collection values = hashMap.values();
            if (!values.isEmpty()) {
                l9Var = (l9) values.iterator().next();
                if (l9Var == null) {
                    this.y.setTextSize(10);
                    ja.a(this.y);
                    this.U = true;
                    return;
                }
                if (this.F) {
                    if (z10 && this.U && !this.N) {
                        org.telegram.ui.ActionBar.j5 j5Var = this.y;
                        b();
                        ValueAnimator valueAnimator = kxVar.j0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            kxVar.j0 = null;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        kxVar.j0 = ofFloat;
                        ofFloat.addUpdateListener(new x(i11, this, j5Var));
                        kxVar.j0.addListener(new z(i11, this, j5Var));
                        kxVar.j0.setDuration(150L);
                        this.y.setAlpha(0.0f);
                        this.y.setTranslationY(AndroidUtilities.dp(5.0f));
                        kxVar.k0 = new y(this, i11);
                    }
                    AndroidUtilities.runOnUIThread(kxVar.k0, 500L);
                    this.U = false;
                    this.y.setTextSize(10);
                    this.y.l(LocaleController.getString(R.string.MyStory), false);
                    return;
                }
                if (this.f == null) {
                    this.y.setTextSize(11);
                    this.y.l(Emoji.replaceEmoji(this.h.title, this.y.getPaint().getFontMetricsInt(), false), false);
                    this.y.i(null);
                    return;
                }
                this.y.setTextSize(11);
                String str = this.f.first_name;
                String trim = str != null ? str.trim() : "";
                int indexOf = trim.indexOf(" ");
                if (indexOf > 0) {
                    trim = trim.substring(0, indexOf);
                }
                if (!this.f.verified) {
                    this.y.l(Emoji.replaceEmoji(trim, this.y.getPaint().getFontMetricsInt(), false), false);
                    this.y.i(null);
                    return;
                }
                if (this.S == null) {
                    Drawable mutate = kxVar.getContext().getDrawable(R.drawable.verified_area).mutate();
                    Drawable mutate2 = kxVar.getContext().getDrawable(R.drawable.verified_check).mutate();
                    o oVar = new o(kxVar, mutate, mutate2, mutate, mutate2);
                    oVar.w = true;
                    this.S = oVar;
                }
                this.y.l(Emoji.replaceEmoji(trim, this.y.getPaint().getFontMetricsInt(), false), false);
                this.y.i(this.S);
                return;
            }
        }
        l9Var = null;
        if (l9Var == null) {
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        da daVar = this.O;
        if (z10 && daVar.H == null) {
            daVar.H = new bd(this, 1.5f, 5.0f);
        }
        bd bdVar = daVar.H;
        if (bdVar != null) {
            bdVar.c(z10);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.N || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            kx kxVar = this.b0;
            q qVar = kxVar.r;
            if (parent == qVar) {
                qVar.invalidate();
            }
            kxVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
