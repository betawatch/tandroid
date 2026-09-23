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
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ix;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
    public final ca O;
    public float P;
    public float Q;
    public cj0 R;
    public o S;
    public final float T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean a;
    public final org.telegram.ui.Components.e6 a0;
    public int b;
    public final /* synthetic */ ix b0;
    public boolean c;
    public boolean d;
    public da e;
    public TLRPC.User f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.h9 n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public final org.telegram.ui.Components.h9 v;
    public boolean w;
    public final FrameLayout x;
    public org.telegram.ui.ActionBar.i5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ix ixVar, Context context) {
        super(context);
        this.b0 = ixVar;
        this.n = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.v = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.w = true;
        ca caVar = new ca(null, true);
        this.O = caVar;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.T = 1.0f;
        this.a0 = new org.telegram.ui.Components.e6(this, 0L, 350L, rr.h);
        caVar.o = ixVar.b == 1;
        caVar.D = true;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.x = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.N) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, w7.x5.c(-2.0f, -1));
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
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(getContext());
        this.y = i5Var;
        i5Var.setTypeface(AndroidUtilities.bold());
        this.y.setGravity(17);
        this.y.setTextSize(11);
        org.telegram.ui.ActionBar.i5 i5Var2 = this.y;
        textColor = this.b0.getTextColor();
        i5Var2.setTextColor(textColor);
        NotificationCenter.listenEmojiLoading(this.y);
        this.y.setMaxLines(1);
        this.x.addView(this.y, w7.x5.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.r.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        this.s.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f7, float f10, float f11) {
        ix ixVar = this.b0;
        int i10 = ixVar.b;
        Paint paint = ixVar.G;
        l9 l9Var = ixVar.s;
        Paint paint2 = ixVar.H;
        Drawable drawable = ixVar.c;
        if (this.F && !l9Var.I(this.E) && Utilities.isNullOrEmpty(l9Var.E(this.E))) {
            float dp = f7 + AndroidUtilities.dp(16.0f);
            float dp2 = f10 + AndroidUtilities.dp(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.h6.l1(f11, ixVar.f(org.telegram.ui.ActionBar.h6.hl)));
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.h6.l1(f11, ixVar.f(org.telegram.ui.ActionBar.h6.s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.h6.l1(f11, ixVar.f(org.telegram.ui.ActionBar.h6.M8)));
            }
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(11.0f), paint2);
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(9.0f), paint);
            int f12 = ixVar.f(i10 == 0 ? org.telegram.ui.ActionBar.h6.s8 : org.telegram.ui.ActionBar.h6.M8);
            if (f12 != ixVar.e) {
                ixVar.e = f12;
                drawable.setColorFilter(new PorterDuffColorFilter(f12, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f11 * 255.0f));
            drawable.setBounds((int) (dp - (drawable.getIntrinsicWidth() / 2.0f)), (int) (dp2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + dp), (int) ((drawable.getIntrinsicHeight() / 2.0f) + dp2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f7, float f10, float f11, boolean z10) {
        float f12 = this.J;
        ix ixVar = this.b0;
        if (f12 != f7 || this.K != f10 || 0.0f != f11 || this.V != z10) {
            this.V = z10;
            this.J = f7;
            this.K = f10;
            invalidate();
            ixVar.h.invalidate();
        }
        float clamp = this.N ? 0.0f : 1.0f - Utilities.clamp(ixVar.N / ixVar.B0, 1.0f, 0.0f);
        this.Q = clamp;
        float f13 = clamp * this.P;
        FrameLayout frameLayout = this.x;
        frameLayout.setAlpha(f13);
        frameLayout.setVisibility(f13 > 0.0f ? 0 : 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0207  */
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
        ca caVar;
        float size;
        boolean z10;
        float f13;
        float f14;
        boolean z11;
        int textColor;
        float f15;
        boolean z12;
        ImageReceiver imageReceiver2;
        boolean[] zArr;
        cj0 cj0Var;
        float dp = AndroidUtilities.dp(48.0f);
        float dp2 = AndroidUtilities.dp(26.33f);
        float dp3 = AndroidUtilities.dp(8.0f);
        ix ixVar = this.b0;
        int i10 = ixVar.b;
        l9 l9Var = ixVar.s;
        Paint paint = ixVar.H;
        float clamp = Utilities.clamp(ixVar.n0 / 0.5f, 1.0f, 0.0f) * dp3;
        if (this.V) {
            clamp += Utilities.clamp((ixVar.n0 - 0.5f) / 0.5f, 1.0f, 0.0f) * AndroidUtilities.dp(16.0f);
        }
        float lerp = AndroidUtilities.lerp(dp + clamp, dp2, this.J);
        float f16 = lerp / 2.0f;
        float measuredWidth = (getMeasuredWidth() / 2.0f) - f16;
        float lerp2 = AndroidUtilities.lerp(measuredWidth, 0.0f, this.J);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) / 2.0f, this.J);
        float clamp2 = Utilities.clamp(this.J / 0.5f, 1.0f, 0.0f);
        ca caVar2 = this.O;
        caVar2.a = true;
        RectF rectF = caVar2.F;
        if (!caVar2.p) {
            caVar2.e = 1.0f - ixVar.d0;
        }
        float f17 = lerp3 + lerp;
        rectF.set(lerp2, lerp3, lerp2 + lerp, f17);
        caVar2.G = AndroidUtilities.dpf2(1.33f) * this.J;
        ImageReceiver imageReceiver3 = this.r;
        imageReceiver3.setAlpha(1.0f);
        imageReceiver3.setRoundRadius((int) f16);
        float f18 = lerp2 + f16;
        this.L = f18;
        float f19 = lerp3 + f16;
        this.M = f19;
        if (i10 == 0) {
            f7 = f16;
            paint.setColor(ixVar.f(org.telegram.ui.ActionBar.h6.s8));
        } else {
            f7 = f16;
            paint.setColor(ixVar.f(org.telegram.ui.ActionBar.h6.M8));
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
            this.R = ixVar.n;
        }
        ArrayList arrayList = (ArrayList) l9Var.c.f(this.E);
        boolean z13 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z13 || (this.W && (cj0Var = this.R) != null && cj0Var.f < 0.98f)) {
            canvas2 = canvas;
            f11 = f17;
            f12 = f10;
            caVar = caVar2;
            ImageReceiver imageReceiver4 = imageReceiver;
            if (z13) {
                float f23 = 0.0f;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    f23 += ((k9) arrayList.get(i11)).h;
                }
                size = (l9Var.d + f23) / (arrayList.size() + r4);
                z10 = ((k9) hg.c.h(1, arrayList)).G;
                ixVar.m0 = z10;
            } else {
                z10 = ixVar.m0;
                size = 1.0f;
            }
            invalidate();
            if (this.R == null) {
                cj0 cj0Var2 = ixVar.n;
                if (cj0Var2 != null) {
                    this.R = cj0Var2;
                } else {
                    cj0 cj0Var3 = new cj0(this);
                    this.R = cj0Var3;
                    ixVar.n = cj0Var3;
                    cj0Var3.d(null, true, false);
                }
            }
            if (this.w) {
                canvas2.save();
                canvas2.scale(caVar.b(), caVar.b(), rectF.centerX(), rectF.centerY());
                imageReceiver4.setImageCoords(rectF);
                imageReceiver4.draw(canvas2);
                canvas2.restore();
            }
            this.R.q = 0;
            Paint o9 = z10 ? ia.o(imageReceiver4) : ia.t(imageReceiver4, true);
            o9.setAlpha(255);
            cj0 cj0Var4 = this.R;
            cj0Var4.t = o9;
            cj0Var4.f((int) (imageReceiver4.getImageX() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageY() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageX2() + AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageY2() + AndroidUtilities.dp(3.0f)));
            this.R.e(Utilities.clamp(size, 1.0f, 0.0f), this.W);
            if (imageReceiver4.getVisible()) {
                this.R.a(canvas2);
            }
            this.W = true;
            invalidate();
        } else {
            float e = this.a0.e(this.G);
            if (this.w) {
                if (this.W) {
                    int i12 = 1;
                    caVar2.p = true;
                    caVar2.e = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new a(this, i12));
                    ofFloat.addListener(new b(this, i12));
                    ofFloat.setDuration(100L);
                    ofFloat.start();
                }
                float f24 = e * caVar2.e;
                caVar2.b = !this.W;
                if (!this.c && ixVar.n0 <= 0.0f) {
                    if (AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(16.0f), rr.g.getInterpolation(this.J)) < (AndroidUtilities.dpf2(3.5f) + f7) * 2.0f) {
                        f15 = ((float) Math.toDegrees(Math.acos((r1 / 2.0f) / r3))) * 2.0f;
                        caVar2.f = f15;
                        caVar2.l = this.c;
                        caVar2.m = this.d;
                        caVar2.u = 1.0f - f24;
                        z12 = this.F;
                        if (z12 && this.H) {
                            caVar2.s = this.I;
                        } else {
                            caVar2.s = 0L;
                        }
                        if (z12) {
                            f11 = f17;
                            imageReceiver2 = imageReceiver;
                            f12 = f10;
                            z11 = false;
                            f14 = clamp2;
                            zArr = null;
                            caVar = caVar2;
                            long j3 = this.E;
                            canvas2 = canvas;
                            ia.i(j3, canvas2, imageReceiver2, l9Var.I(j3), caVar);
                        } else {
                            caVar = caVar2;
                            f11 = f17;
                            imageReceiver2 = imageReceiver;
                            f12 = f10;
                            z11 = false;
                            f14 = clamp2;
                            zArr = null;
                            canvas2 = canvas;
                            ia.i(this.E, canvas2, imageReceiver2, l9Var.H(), caVar);
                        }
                        ImageReceiver imageReceiver5 = imageReceiver2;
                        if (f24 > 0.0f) {
                            if (ia.d == null) {
                                p20 p20Var = new p20();
                                ia.d = p20Var;
                                p20Var.a = true;
                                p20Var.b = true;
                                int w02 = org.telegram.ui.ActionBar.h6.w0(zArr, org.telegram.ui.ActionBar.h6.xj, z11);
                                int w03 = org.telegram.ui.ActionBar.h6.w0(zArr, org.telegram.ui.ActionBar.h6.q7, z11);
                                ia.d.d(i0.a.d(0.25f, w02, w03), w03, z11 ? 1 : 0, z11 ? 1 : 0);
                                ia.d.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                                ia.d.c.setStyle(Paint.Style.STROKE);
                                ia.d.c.setStrokeCap(Paint.Cap.ROUND);
                            }
                            ia.d.b(imageReceiver5.getImageX(), imageReceiver5.getImageY(), imageReceiver5.getImageX2(), imageReceiver5.getImageY2());
                            Paint paint2 = ia.d.c;
                            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
                            paint2.setAlpha((int) (255.0f * f24));
                            canvas2.drawCircle(f18, f19, caVar.b() * (f7 + AndroidUtilities.dp(4.0f)), paint2);
                        }
                        e = f24;
                    }
                }
                f15 = 0.0f;
                caVar2.f = f15;
                caVar2.l = this.c;
                caVar2.m = this.d;
                caVar2.u = 1.0f - f24;
                z12 = this.F;
                if (z12) {
                }
                caVar2.s = 0L;
                if (z12) {
                }
                ImageReceiver imageReceiver52 = imageReceiver2;
                if (f24 > 0.0f) {
                }
                e = f24;
            } else {
                canvas2 = canvas;
                caVar = caVar2;
                f11 = f17;
                f14 = clamp2;
                f12 = f10;
                z11 = false;
            }
            this.W = z11;
            if (this.w) {
                canvas2.save();
                float f25 = 1.0f - f14;
                canvas2.scale(f25, f25, this.L + AndroidUtilities.dp(16.0f), this.M + AndroidUtilities.dp(16.0f));
                c(canvas2, this.L, this.M, 1.0f);
                float f26 = this.L;
                float f27 = this.M;
                if (e > 0.0f) {
                    float dp4 = f26 + AndroidUtilities.dp(17.0f);
                    float dp5 = f27 + AndroidUtilities.dp(17.0f);
                    Paint paint3 = ixVar.G;
                    paint3.setColor(org.telegram.ui.ActionBar.h6.l1(e, ixVar.f(org.telegram.ui.ActionBar.h6.q7)));
                    if (i10 == 0) {
                        paint.setColor(org.telegram.ui.ActionBar.h6.l1(e, ixVar.f(org.telegram.ui.ActionBar.h6.s8)));
                    } else {
                        paint.setColor(org.telegram.ui.ActionBar.h6.l1(e, ixVar.f(org.telegram.ui.ActionBar.h6.M8)));
                    }
                    float interpolation = rr.k.getInterpolation(e) * AndroidUtilities.dp(9.0f);
                    canvas2.drawCircle(dp4, dp5, AndroidUtilities.dp(2.0f) + interpolation, paint);
                    canvas2.drawCircle(dp4, dp5, interpolation, paint3);
                    textColor = ixVar.getTextColor();
                    paint3.setColor(org.telegram.ui.ActionBar.h6.l1(e, textColor));
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
                this.P = caVar.n == 2 ? 0.7f : 1.0f;
            }
            float f28 = this.Q * this.P;
            frameLayout.setAlpha(f28);
            frameLayout.setVisibility(f28 > 0.0f ? 0 : 4);
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
            ix ixVar = this.b0;
            q qVar = ixVar.r;
            if (parent == qVar) {
                qVar.invalidate();
            } else {
                ixVar.invalidate();
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
        da daVar = this.e;
        if (daVar != null) {
            daVar.a();
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
                org.telegram.ui.Components.h9 h9Var = this.v;
                h9Var.j(i10, chat);
                imageReceiver.setForUserOrChat(chat, h9Var);
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
        k9 k9Var;
        ix ixVar = this.b0;
        int i10 = ixVar.f;
        l9 l9Var = ixVar.s;
        long j10 = this.E;
        int i11 = 0;
        boolean z10 = j10 == j3;
        if (!z10 && this.e != null) {
            l9Var.e0(j10, false);
            this.e.a();
            this.e = null;
        }
        this.E = j3;
        this.F = j3 == UserConfig.getInstance(i10).getClientUserId();
        this.G = l9Var.N(j3);
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
        org.telegram.ui.Components.h9 h9Var = this.n;
        h9Var.j(i10, chat);
        imageReceiver.setForUserOrChat(chat, h9Var);
        if (this.N) {
            return;
        }
        this.y.i(null);
        if (l9Var.N(j3)) {
            this.y.setTextSize(10);
            this.y.l(LocaleController.getString(R.string.FailedStory), false);
            this.U = false;
            return;
        }
        if (!Utilities.isNullOrEmpty(l9Var.E(j3))) {
            this.y.setTextSize(10);
            ia.a(this.y);
            this.U = true;
            return;
        }
        HashMap hashMap = (HashMap) l9Var.e.f(j3);
        if (hashMap != null && !hashMap.isEmpty()) {
            Collection values = hashMap.values();
            if (!values.isEmpty()) {
                k9Var = (k9) values.iterator().next();
                if (k9Var == null) {
                    this.y.setTextSize(10);
                    ia.a(this.y);
                    this.U = true;
                    return;
                }
                if (this.F) {
                    if (z10 && this.U && !this.N) {
                        org.telegram.ui.ActionBar.i5 i5Var = this.y;
                        b();
                        ValueAnimator valueAnimator = ixVar.j0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            ixVar.j0 = null;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ixVar.j0 = ofFloat;
                        ofFloat.addUpdateListener(new x(i11, this, i5Var));
                        ixVar.j0.addListener(new z(i11, this, i5Var));
                        ixVar.j0.setDuration(150L);
                        this.y.setAlpha(0.0f);
                        this.y.setTranslationY(AndroidUtilities.dp(5.0f));
                        ixVar.k0 = new y(this, i11);
                    }
                    AndroidUtilities.runOnUIThread(ixVar.k0, 500L);
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
                    Drawable mutate = ixVar.getContext().getDrawable(R.drawable.verified_area).mutate();
                    Drawable mutate2 = ixVar.getContext().getDrawable(R.drawable.verified_check).mutate();
                    o oVar = new o(ixVar, mutate, mutate2, mutate, mutate2);
                    oVar.w = true;
                    this.S = oVar;
                }
                this.y.l(Emoji.replaceEmoji(trim, this.y.getPaint().getFontMetricsInt(), false), false);
                this.y.i(this.S);
                return;
            }
        }
        k9Var = null;
        if (k9Var == null) {
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        ca caVar = this.O;
        if (z10 && caVar.H == null) {
            caVar.H = new yc(this, 1.5f, 5.0f);
        }
        yc ycVar = caVar.H;
        if (ycVar != null) {
            ycVar.c(z10);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.N || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            ix ixVar = this.b0;
            q qVar = ixVar.r;
            if (parent == qVar) {
                qVar.invalidate();
            }
            ixVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
