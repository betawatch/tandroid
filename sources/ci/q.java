package ci;

import ai.ne;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.x20;
import org.telegram.ui.Components.yc;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class q extends FrameLayout {
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
    public final x7 O;
    public float P;
    public float Q;
    public ck0 R;
    public h S;
    public final float T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean a;
    public final org.telegram.ui.Components.f6 a0;
    public int b;
    public final /* synthetic */ vw b0;
    public boolean c;
    public boolean d;
    public y7 e;
    public TLRPC.User f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.h9 n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public final org.telegram.ui.Components.h9 v;
    public boolean w;
    public final FrameLayout x;
    public org.telegram.ui.ActionBar.n5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(vw vwVar, Context context) {
        super(context);
        this.b0 = vwVar;
        this.n = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.v = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        this.w = true;
        x7 x7Var = new x7(null, true);
        this.O = x7Var;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.T = 1.0f;
        this.a0 = new org.telegram.ui.Components.f6(this, 0L, 350L, bs.h);
        x7Var.o = vwVar.b == 1;
        x7Var.D = true;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.x = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.N) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, w7.z5.c(-2.0f, -1));
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
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(getContext());
        this.y = n5Var;
        n5Var.setTypeface(AndroidUtilities.bold());
        this.y.setGravity(17);
        this.y.setTextSize(11);
        org.telegram.ui.ActionBar.n5 n5Var2 = this.y;
        textColor = this.b0.getTextColor();
        n5Var2.setTextColor(textColor);
        NotificationCenter.listenEmojiLoading(this.y);
        this.y.setMaxLines(1);
        this.x.addView(this.y, w7.z5.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.r.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        this.s.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f7, float f10, float f11) {
        vw vwVar = this.b0;
        int i10 = vwVar.b;
        Paint paint = vwVar.G;
        h7 h7Var = vwVar.s;
        Paint paint2 = vwVar.H;
        Drawable drawable = vwVar.c;
        if (this.F && !h7Var.I(this.E) && Utilities.isNullOrEmpty(h7Var.E(this.E))) {
            float dp = f7 + AndroidUtilities.dp(16.0f);
            float dp2 = f10 + AndroidUtilities.dp(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.k6.o1(f11, vwVar.f(org.telegram.ui.ActionBar.k6.hl)));
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.k6.o1(f11, vwVar.f(org.telegram.ui.ActionBar.k6.s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.k6.o1(f11, vwVar.f(org.telegram.ui.ActionBar.k6.M8)));
            }
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(11.0f), paint2);
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(9.0f), paint);
            int f12 = vwVar.f(i10 == 0 ? org.telegram.ui.ActionBar.k6.s8 : org.telegram.ui.ActionBar.k6.M8);
            if (f12 != vwVar.e) {
                vwVar.e = f12;
                drawable.setColorFilter(new PorterDuffColorFilter(f12, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f11 * 255.0f));
            drawable.setBounds((int) (dp - (drawable.getIntrinsicWidth() / 2.0f)), (int) (dp2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + dp), (int) ((drawable.getIntrinsicHeight() / 2.0f) + dp2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f7, float f10, float f11, boolean z10) {
        float f12 = this.J;
        vw vwVar = this.b0;
        if (f12 != f7 || this.K != f10 || 0.0f != f11 || this.V != z10) {
            this.V = z10;
            this.J = f7;
            this.K = f10;
            invalidate();
            vwVar.h.invalidate();
        }
        float clamp = this.N ? 0.0f : 1.0f - Utilities.clamp(vwVar.N / vwVar.B0, 1.0f, 0.0f);
        this.Q = clamp;
        float f13 = clamp * this.P;
        FrameLayout frameLayout = this.x;
        frameLayout.setAlpha(f13);
        frameLayout.setVisibility(f13 > 0.0f ? 0 : 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        ImageReceiver imageReceiver;
        float f10;
        Canvas canvas2;
        x7 x7Var;
        float f11;
        boolean z10;
        float f12;
        float size;
        boolean z11;
        float f13;
        vw vwVar;
        int textColor;
        vw vwVar2;
        float f14;
        boolean z12;
        float f15;
        ImageReceiver imageReceiver2;
        boolean[] zArr;
        ck0 ck0Var;
        float dp = AndroidUtilities.dp(48.0f);
        float dp2 = AndroidUtilities.dp(26.33f);
        float dp3 = AndroidUtilities.dp(8.0f);
        vw vwVar3 = this.b0;
        int i10 = vwVar3.b;
        h7 h7Var = vwVar3.s;
        Paint paint = vwVar3.H;
        float clamp = Utilities.clamp(vwVar3.n0 / 0.5f, 1.0f, 0.0f) * dp3;
        if (this.V) {
            clamp += Utilities.clamp((vwVar3.n0 - 0.5f) / 0.5f, 1.0f, 0.0f) * AndroidUtilities.dp(16.0f);
        }
        float lerp = AndroidUtilities.lerp(dp + clamp, dp2, this.J);
        float f16 = lerp / 2.0f;
        float measuredWidth = (getMeasuredWidth() / 2.0f) - f16;
        float lerp2 = AndroidUtilities.lerp(measuredWidth, 0.0f, this.J);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) / 2.0f, this.J);
        float clamp2 = Utilities.clamp(this.J / 0.5f, 1.0f, 0.0f);
        x7 x7Var2 = this.O;
        x7Var2.a = true;
        RectF rectF = x7Var2.F;
        if (!x7Var2.p) {
            x7Var2.e = 1.0f - vwVar3.d0;
        }
        float f17 = lerp3 + lerp;
        rectF.set(lerp2, lerp3, lerp2 + lerp, f17);
        x7Var2.G = AndroidUtilities.dpf2(1.33f) * this.J;
        ImageReceiver imageReceiver3 = this.r;
        imageReceiver3.setAlpha(1.0f);
        imageReceiver3.setRoundRadius((int) f16);
        float f18 = lerp2 + f16;
        this.L = f18;
        float f19 = lerp3 + f16;
        this.M = f19;
        if (i10 == 0) {
            f7 = f16;
            paint.setColor(vwVar3.f(org.telegram.ui.ActionBar.k6.s8));
        } else {
            f7 = f16;
            paint.setColor(vwVar3.f(org.telegram.ui.ActionBar.k6.M8));
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
            this.R = vwVar3.n;
        }
        ArrayList arrayList = (ArrayList) h7Var.c.f(this.E);
        boolean z13 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z13 || (this.W && (ck0Var = this.R) != null && ck0Var.f < 0.98f)) {
            canvas2 = canvas;
            x7Var = x7Var2;
            ImageReceiver imageReceiver4 = imageReceiver;
            f11 = f10;
            z10 = false;
            f12 = f17;
            if (z13) {
                float f23 = 0.0f;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    f23 += ((g7) arrayList.get(i11)).h;
                }
                size = (h7Var.d + f23) / (arrayList.size() + r4);
                z11 = ((g7) i2.o1.i(1, arrayList)).G;
                vwVar3.m0 = z11;
            } else {
                z11 = vwVar3.m0;
                size = 1.0f;
            }
            invalidate();
            if (this.R == null) {
                ck0 ck0Var2 = vwVar3.n;
                if (ck0Var2 != null) {
                    this.R = ck0Var2;
                } else {
                    ck0 ck0Var3 = new ck0(this);
                    this.R = ck0Var3;
                    vwVar3.n = ck0Var3;
                    ck0Var3.d(null, true, false);
                }
            }
            if (this.w) {
                canvas2.save();
                canvas2.scale(x7Var.b(), x7Var.b(), rectF.centerX(), rectF.centerY());
                imageReceiver4.setImageCoords(rectF);
                imageReceiver4.draw(canvas2);
                canvas2.restore();
            }
            this.R.q = 0;
            Paint o10 = z11 ? c8.o(imageReceiver4) : c8.t(imageReceiver4, true);
            o10.setAlpha(255);
            ck0 ck0Var4 = this.R;
            ck0Var4.t = o10;
            ck0Var4.f((int) (imageReceiver4.getImageX() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageY() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageX2() + AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageY2() + AndroidUtilities.dp(3.0f)));
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
                    x7Var2.p = true;
                    x7Var2.e = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ah.c0(this, 9));
                    ofFloat.addListener(new ah.b(this, 6));
                    vwVar2 = vwVar3;
                    ofFloat.setDuration(100L);
                    ofFloat.start();
                } else {
                    vwVar2 = vwVar3;
                }
                float f24 = e * x7Var2.e;
                x7Var2.b = !this.W;
                vwVar = vwVar2;
                if (!this.c && vwVar.n0 <= 0.0f) {
                    if (AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(16.0f), bs.g.getInterpolation(this.J)) < (AndroidUtilities.dpf2(3.5f) + f7) * 2.0f) {
                        f14 = ((float) Math.toDegrees(Math.acos((r1 / 2.0f) / r4))) * 2.0f;
                        x7Var2.f = f14;
                        x7Var2.l = this.c;
                        x7Var2.m = this.d;
                        x7Var2.u = 1.0f - f24;
                        z12 = this.F;
                        if (z12 && this.H) {
                            x7Var2.s = this.I;
                        } else {
                            x7Var2.s = 0L;
                        }
                        if (z12) {
                            x7Var = x7Var2;
                            f15 = f24;
                            imageReceiver2 = imageReceiver;
                            f11 = f10;
                            z10 = false;
                            f12 = f17;
                            zArr = null;
                            long j10 = this.E;
                            canvas2 = canvas;
                            c8.i(j10, canvas2, imageReceiver2, h7Var.I(j10), x7Var);
                        } else {
                            x7Var = x7Var2;
                            f15 = f24;
                            imageReceiver2 = imageReceiver;
                            f11 = f10;
                            z10 = false;
                            f12 = f17;
                            zArr = null;
                            canvas2 = canvas;
                            c8.i(this.E, canvas2, imageReceiver2, h7Var.H(), x7Var);
                        }
                        ImageReceiver imageReceiver5 = imageReceiver2;
                        if (f15 > 0.0f) {
                            if (c8.d == null) {
                                x20 x20Var = new x20();
                                c8.d = x20Var;
                                x20Var.a = true;
                                x20Var.b = true;
                                x20Var.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                                c8.d.c.setStyle(Paint.Style.STROKE);
                                c8.d.c.setStrokeCap(Paint.Cap.ROUND);
                            }
                            int x02 = org.telegram.ui.ActionBar.k6.x0(zArr, org.telegram.ui.ActionBar.k6.xj, z10);
                            int x03 = org.telegram.ui.ActionBar.k6.x0(zArr, org.telegram.ui.ActionBar.k6.q7, z10);
                            c8.d.d(i0.a.f(0.25f, x02, x03), x03, z10 ? 1 : 0, z10 ? 1 : 0);
                            c8.d.b(imageReceiver5.getImageX(), imageReceiver5.getImageY(), imageReceiver5.getImageX2(), imageReceiver5.getImageY2());
                            Paint paint2 = c8.d.c;
                            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
                            paint2.setAlpha((int) (255.0f * f15));
                            canvas2.drawCircle(f18, f19, x7Var.b() * (f7 + AndroidUtilities.dp(4.0f)), paint2);
                        }
                        e = f15;
                    }
                }
                f14 = 0.0f;
                x7Var2.f = f14;
                x7Var2.l = this.c;
                x7Var2.m = this.d;
                x7Var2.u = 1.0f - f24;
                z12 = this.F;
                if (z12) {
                }
                x7Var2.s = 0L;
                if (z12) {
                }
                ImageReceiver imageReceiver52 = imageReceiver2;
                if (f15 > 0.0f) {
                }
                e = f15;
            } else {
                canvas2 = canvas;
                x7Var = x7Var2;
                vwVar = vwVar3;
                f12 = f17;
                f11 = f10;
                z10 = false;
            }
            this.W = z10;
            if (this.w) {
                canvas2.save();
                float f25 = 1.0f - clamp2;
                canvas2.scale(f25, f25, this.L + AndroidUtilities.dp(16.0f), this.M + AndroidUtilities.dp(16.0f));
                c(canvas2, this.L, this.M, 1.0f);
                float f26 = this.L;
                float f27 = this.M;
                if (e > 0.0f) {
                    float dp4 = f26 + AndroidUtilities.dp(17.0f);
                    float dp5 = f27 + AndroidUtilities.dp(17.0f);
                    Paint paint3 = vwVar.G;
                    paint3.setColor(org.telegram.ui.ActionBar.k6.o1(e, vwVar.f(org.telegram.ui.ActionBar.k6.q7)));
                    if (i10 == 0) {
                        paint.setColor(org.telegram.ui.ActionBar.k6.o1(e, vwVar.f(org.telegram.ui.ActionBar.k6.s8)));
                    } else {
                        paint.setColor(org.telegram.ui.ActionBar.k6.o1(e, vwVar.f(org.telegram.ui.ActionBar.k6.M8)));
                    }
                    float interpolation = bs.k.getInterpolation(e) * AndroidUtilities.dp(9.0f);
                    canvas2.drawCircle(dp4, dp5, AndroidUtilities.dp(2.0f) + interpolation, paint);
                    canvas2.drawCircle(dp4, dp5, interpolation, paint3);
                    textColor = vwVar.getTextColor();
                    paint3.setColor(org.telegram.ui.ActionBar.k6.o1(e, textColor));
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
            f13 = f11;
        } else {
            ImageReceiver imageReceiver6 = this.s;
            f13 = f11;
            imageReceiver6.setImageCoords(f13, lerp3, lerp, lerp);
            imageReceiver6.setAlpha(this.K);
            imageReceiver6.draw(canvas2);
        }
        float dp6 = ((1.0f - this.J) * AndroidUtilities.dp(7.0f)) + f12;
        FrameLayout frameLayout = this.x;
        frameLayout.setTranslationY(dp6);
        frameLayout.setTranslationX(f13 - measuredWidth);
        if (!this.N) {
            if (this.F) {
                this.P = 1.0f;
            } else {
                this.P = x7Var.n == 2 ? 0.7f : 1.0f;
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
            vw vwVar = this.b0;
            j jVar = vwVar.r;
            if (parent == jVar) {
                jVar.invalidate();
            } else {
                vwVar.invalidate();
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
        y7 y7Var = this.e;
        if (y7Var != null) {
            y7Var.a();
            this.e = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.N ? AndroidUtilities.dp(70.0f) : this.b0.M, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCrossfadeTo(long j10) {
        TLRPC.Chat chat;
        int i10 = this.b0.f;
        if (this.I != j10) {
            this.I = j10;
            boolean z10 = j10 != -1;
            this.H = z10;
            ImageReceiver imageReceiver = this.s;
            if (!z10) {
                imageReceiver.clearImage();
                return;
            }
            if (j10 > 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                this.f = user;
                this.h = null;
                chat = user;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
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
    public void setDialogId(long j10) {
        TLRPC.Chat chat;
        g7 g7Var;
        vw vwVar = this.b0;
        int i10 = vwVar.f;
        h7 h7Var = vwVar.s;
        long j11 = this.E;
        int i11 = 1;
        int i12 = 0;
        boolean z10 = j11 == j10;
        if (!z10 && this.e != null) {
            h7Var.e0(j11, false);
            this.e.a();
            this.e = null;
        }
        this.E = j10;
        this.F = j10 == UserConfig.getInstance(i10).getClientUserId();
        this.G = h7Var.N(j10);
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.f = user;
            this.h = null;
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
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
        if (h7Var.N(j10)) {
            this.y.setTextSize(10);
            this.y.l(LocaleController.getString(R.string.FailedStory), false);
            this.U = false;
            return;
        }
        if (!Utilities.isNullOrEmpty(h7Var.E(j10))) {
            this.y.setTextSize(10);
            c8.a(this.y);
            this.U = true;
            return;
        }
        HashMap hashMap = (HashMap) h7Var.e.f(j10);
        if (hashMap != null && !hashMap.isEmpty()) {
            Collection values = hashMap.values();
            if (!values.isEmpty()) {
                g7Var = (g7) values.iterator().next();
                if (g7Var == null) {
                    this.y.setTextSize(10);
                    c8.a(this.y);
                    this.U = true;
                    return;
                }
                if (this.F) {
                    if (z10 && this.U && !this.N) {
                        org.telegram.ui.ActionBar.n5 n5Var = this.y;
                        b();
                        ValueAnimator valueAnimator = vwVar.j0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            vwVar.j0 = null;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        vwVar.j0 = ofFloat;
                        ofFloat.addUpdateListener(new ah.l0(2, this, n5Var));
                        vwVar.j0.addListener(new ne(i11, this, n5Var));
                        vwVar.j0.setDuration(150L);
                        this.y.setAlpha(0.0f);
                        this.y.setTranslationY(AndroidUtilities.dp(5.0f));
                        vwVar.k0 = new p(this, i12);
                    }
                    AndroidUtilities.runOnUIThread(vwVar.k0, 500L);
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
                    Drawable mutate = vwVar.getContext().getDrawable(R.drawable.verified_area).mutate();
                    Drawable mutate2 = vwVar.getContext().getDrawable(R.drawable.verified_check).mutate();
                    h hVar = new h(vwVar, mutate, mutate2, mutate, mutate2);
                    hVar.w = true;
                    this.S = hVar;
                }
                this.y.l(Emoji.replaceEmoji(trim, this.y.getPaint().getFontMetricsInt(), false), false);
                this.y.i(this.S);
                return;
            }
        }
        g7Var = null;
        if (g7Var == null) {
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        x7 x7Var = this.O;
        if (z10 && x7Var.H == null) {
            x7Var.H = new yc(this, 1.5f, 5.0f);
        }
        yc ycVar = x7Var.H;
        if (ycVar != null) {
            ycVar.c(z10);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.N || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            vw vwVar = this.b0;
            j jVar = vwVar.r;
            if (parent == jVar) {
                jVar.invalidate();
            }
            vwVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
