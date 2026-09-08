package bi;

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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zc;
import org.telegram.ui.lx;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class u extends FrameLayout {
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
    public final j9 O;
    public float P;
    public float Q;
    public bj0 R;
    public k S;
    public final float T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean a;
    public final org.telegram.ui.Components.e6 a0;
    public int b;
    public final /* synthetic */ lx b0;
    public boolean c;
    public boolean d;
    public k9 e;
    public TLRPC.User f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.i9 n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public final org.telegram.ui.Components.i9 v;
    public boolean w;
    public final FrameLayout x;
    public org.telegram.ui.ActionBar.j5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(lx lxVar, Context context) {
        super(context);
        this.b0 = lxVar;
        this.n = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.v = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        this.w = true;
        j9 j9Var = new j9(null, true);
        this.O = j9Var;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.T = 1.0f;
        this.a0 = new org.telegram.ui.Components.e6(this, 0L, 350L, pr.h);
        j9Var.o = lxVar.b == 1;
        j9Var.D = true;
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
        this.x.addView(this.y, w7.x5.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.r.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        this.s.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f7, float f10, float f11) {
        lx lxVar = this.b0;
        int i10 = lxVar.b;
        Paint paint = lxVar.G;
        u8 u8Var = lxVar.s;
        Paint paint2 = lxVar.H;
        Drawable drawable = lxVar.c;
        if (this.F && !u8Var.I(this.E) && Utilities.isNullOrEmpty(u8Var.E(this.E))) {
            float dp = f7 + AndroidUtilities.dp(16.0f);
            float dp2 = f10 + AndroidUtilities.dp(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(f11, lxVar.f(org.telegram.ui.ActionBar.j6.hl)));
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.j6.l1(f11, lxVar.f(org.telegram.ui.ActionBar.j6.s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.j6.l1(f11, lxVar.f(org.telegram.ui.ActionBar.j6.M8)));
            }
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(11.0f), paint2);
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(9.0f), paint);
            int f12 = lxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.j6.s8 : org.telegram.ui.ActionBar.j6.M8);
            if (f12 != lxVar.e) {
                lxVar.e = f12;
                drawable.setColorFilter(new PorterDuffColorFilter(f12, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f11 * 255.0f));
            drawable.setBounds((int) (dp - (drawable.getIntrinsicWidth() / 2.0f)), (int) (dp2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + dp), (int) ((drawable.getIntrinsicHeight() / 2.0f) + dp2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f7, float f10, float f11, boolean z10) {
        float f12 = this.J;
        lx lxVar = this.b0;
        if (f12 != f7 || this.K != f10 || 0.0f != f11 || this.V != z10) {
            this.V = z10;
            this.J = f7;
            this.K = f10;
            invalidate();
            lxVar.h.invalidate();
        }
        float clamp = this.N ? 0.0f : 1.0f - Utilities.clamp(lxVar.N / lxVar.B0, 1.0f, 0.0f);
        this.Q = clamp;
        float f13 = clamp * this.P;
        FrameLayout frameLayout = this.x;
        frameLayout.setAlpha(f13);
        frameLayout.setVisibility(f13 > 0.0f ? 0 : 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0210  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [boolean, int] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        ImageReceiver imageReceiver;
        float f10;
        Canvas canvas2;
        j9 j9Var;
        float f11;
        int i10;
        float f12;
        float size;
        boolean z10;
        float f13;
        lx lxVar;
        boolean z11;
        int textColor;
        lx lxVar2;
        float f14;
        boolean z12;
        float f15;
        ImageReceiver imageReceiver2;
        ?? r72;
        boolean[] zArr;
        bj0 bj0Var;
        float dp = AndroidUtilities.dp(48.0f);
        float dp2 = AndroidUtilities.dp(26.33f);
        float dp3 = AndroidUtilities.dp(8.0f);
        lx lxVar3 = this.b0;
        int i11 = lxVar3.b;
        u8 u8Var = lxVar3.s;
        Paint paint = lxVar3.H;
        float clamp = Utilities.clamp(lxVar3.n0 / 0.5f, 1.0f, 0.0f) * dp3;
        if (this.V) {
            clamp += Utilities.clamp((lxVar3.n0 - 0.5f) / 0.5f, 1.0f, 0.0f) * AndroidUtilities.dp(16.0f);
        }
        float lerp = AndroidUtilities.lerp(dp + clamp, dp2, this.J);
        float f16 = lerp / 2.0f;
        float measuredWidth = (getMeasuredWidth() / 2.0f) - f16;
        float lerp2 = AndroidUtilities.lerp(measuredWidth, 0.0f, this.J);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) / 2.0f, this.J);
        float clamp2 = Utilities.clamp(this.J / 0.5f, 1.0f, 0.0f);
        j9 j9Var2 = this.O;
        j9Var2.a = true;
        RectF rectF = j9Var2.F;
        if (!j9Var2.p) {
            j9Var2.e = 1.0f - lxVar3.d0;
        }
        float f17 = lerp3 + lerp;
        rectF.set(lerp2, lerp3, lerp2 + lerp, f17);
        j9Var2.G = AndroidUtilities.dpf2(1.33f) * this.J;
        ImageReceiver imageReceiver3 = this.r;
        imageReceiver3.setAlpha(1.0f);
        imageReceiver3.setRoundRadius((int) f16);
        float f18 = lerp2 + f16;
        this.L = f18;
        float f19 = lerp3 + f16;
        this.M = f19;
        if (i11 == 0) {
            f7 = f16;
            paint.setColor(lxVar3.f(org.telegram.ui.ActionBar.j6.s8));
        } else {
            f7 = f16;
            paint.setColor(lxVar3.f(org.telegram.ui.ActionBar.j6.M8));
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
            this.R = lxVar3.n;
        }
        ArrayList arrayList = (ArrayList) u8Var.c.f(this.E);
        boolean z13 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z13 || (this.W && (bj0Var = this.R) != null && bj0Var.f < 0.98f)) {
            canvas2 = canvas;
            j9Var = j9Var2;
            ImageReceiver imageReceiver4 = imageReceiver;
            f11 = f10;
            i10 = 0;
            f12 = f17;
            if (z13) {
                float f23 = 0.0f;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    f23 += ((t8) arrayList.get(i12)).h;
                }
                size = (u8Var.d + f23) / (arrayList.size() + r4);
                z10 = ((t8) i2.g.h(1, arrayList)).G;
                lxVar3.m0 = z10;
            } else {
                z10 = lxVar3.m0;
                size = 1.0f;
            }
            invalidate();
            if (this.R == null) {
                bj0 bj0Var2 = lxVar3.n;
                if (bj0Var2 != null) {
                    this.R = bj0Var2;
                } else {
                    bj0 bj0Var3 = new bj0(this);
                    this.R = bj0Var3;
                    lxVar3.n = bj0Var3;
                    bj0Var3.d(null, true, false);
                }
            }
            if (this.w) {
                canvas2.save();
                canvas2.scale(j9Var.b(), j9Var.b(), rectF.centerX(), rectF.centerY());
                imageReceiver4.setImageCoords(rectF);
                imageReceiver4.draw(canvas2);
                canvas2.restore();
            }
            this.R.q = 0;
            Paint o9 = z10 ? p9.o(imageReceiver4) : p9.t(imageReceiver4, true);
            o9.setAlpha(255);
            bj0 bj0Var4 = this.R;
            bj0Var4.t = o9;
            bj0Var4.f((int) (imageReceiver4.getImageX() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageY() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageX2() + AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageY2() + AndroidUtilities.dp(3.0f)));
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
                    j9Var2.p = true;
                    j9Var2.e = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ah.d0(this, 2));
                    ofFloat.addListener(new ah.b(this, 4));
                    lxVar2 = lxVar3;
                    ofFloat.setDuration(100L);
                    ofFloat.start();
                } else {
                    lxVar2 = lxVar3;
                }
                float f24 = e7 * j9Var2.e;
                j9Var2.b = !this.W;
                lxVar = lxVar2;
                if (!this.c && lxVar.n0 <= 0.0f) {
                    if (AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(16.0f), pr.g.getInterpolation(this.J)) < (AndroidUtilities.dpf2(3.5f) + f7) * 2.0f) {
                        f14 = ((float) Math.toDegrees(Math.acos((r1 / 2.0f) / r4))) * 2.0f;
                        j9Var2.f = f14;
                        j9Var2.l = this.c;
                        j9Var2.m = this.d;
                        j9Var2.u = 1.0f - f24;
                        z12 = this.F;
                        if (z12 && this.H) {
                            j9Var2.s = this.I;
                        } else {
                            j9Var2.s = 0L;
                        }
                        if (z12) {
                            j9Var = j9Var2;
                            f15 = f24;
                            imageReceiver2 = imageReceiver;
                            f11 = f10;
                            r72 = 0;
                            f12 = f17;
                            zArr = null;
                            long j3 = this.E;
                            canvas2 = canvas;
                            p9.i(j3, canvas2, imageReceiver2, u8Var.I(j3), j9Var);
                        } else {
                            j9Var = j9Var2;
                            canvas2 = canvas;
                            f15 = f24;
                            imageReceiver2 = imageReceiver;
                            f11 = f10;
                            r72 = 0;
                            f12 = f17;
                            zArr = null;
                            p9.i(this.E, canvas2, imageReceiver2, u8Var.H(), j9Var);
                        }
                        ImageReceiver imageReceiver5 = imageReceiver2;
                        if (f15 > 0.0f) {
                            if (p9.d == null) {
                                o20 o20Var = new o20();
                                p9.d = o20Var;
                                o20Var.a = true;
                                o20Var.b = true;
                                int w02 = org.telegram.ui.ActionBar.j6.w0(zArr, org.telegram.ui.ActionBar.j6.xj, r72);
                                int w03 = org.telegram.ui.ActionBar.j6.w0(zArr, org.telegram.ui.ActionBar.j6.q7, r72);
                                p9.d.d(i0.a.d(0.25f, w02, w03), w03, r72, r72);
                                p9.d.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                                p9.d.c.setStyle(Paint.Style.STROKE);
                                p9.d.c.setStrokeCap(Paint.Cap.ROUND);
                            }
                            p9.d.b(imageReceiver5.getImageX(), imageReceiver5.getImageY(), imageReceiver5.getImageX2(), imageReceiver5.getImageY2());
                            Paint paint2 = p9.d.c;
                            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
                            paint2.setAlpha((int) (255.0f * f15));
                            canvas2.drawCircle(f18, f19, j9Var.b() * (f7 + AndroidUtilities.dp(4.0f)), paint2);
                        }
                        e7 = f15;
                        z11 = r72;
                    }
                }
                f14 = 0.0f;
                j9Var2.f = f14;
                j9Var2.l = this.c;
                j9Var2.m = this.d;
                j9Var2.u = 1.0f - f24;
                z12 = this.F;
                if (z12) {
                }
                j9Var2.s = 0L;
                if (z12) {
                }
                ImageReceiver imageReceiver52 = imageReceiver2;
                if (f15 > 0.0f) {
                }
                e7 = f15;
                z11 = r72;
            } else {
                canvas2 = canvas;
                j9Var = j9Var2;
                lxVar = lxVar3;
                f12 = f17;
                f11 = f10;
                z11 = 0;
            }
            this.W = z11;
            i10 = z11;
            if (this.w) {
                canvas2.save();
                float f25 = 1.0f - clamp2;
                canvas2.scale(f25, f25, this.L + AndroidUtilities.dp(16.0f), this.M + AndroidUtilities.dp(16.0f));
                c(canvas2, this.L, this.M, 1.0f);
                float f26 = this.L;
                float f27 = this.M;
                if (e7 > 0.0f) {
                    float dp4 = f26 + AndroidUtilities.dp(17.0f);
                    float dp5 = f27 + AndroidUtilities.dp(17.0f);
                    Paint paint3 = lxVar.G;
                    paint3.setColor(org.telegram.ui.ActionBar.j6.l1(e7, lxVar.f(org.telegram.ui.ActionBar.j6.q7)));
                    if (i11 == 0) {
                        paint.setColor(org.telegram.ui.ActionBar.j6.l1(e7, lxVar.f(org.telegram.ui.ActionBar.j6.s8)));
                    } else {
                        paint.setColor(org.telegram.ui.ActionBar.j6.l1(e7, lxVar.f(org.telegram.ui.ActionBar.j6.M8)));
                    }
                    float interpolation = pr.k.getInterpolation(e7) * AndroidUtilities.dp(9.0f);
                    canvas2.drawCircle(dp4, dp5, AndroidUtilities.dp(2.0f) + interpolation, paint);
                    canvas2.drawCircle(dp4, dp5, interpolation, paint3);
                    textColor = lxVar.getTextColor();
                    paint3.setColor(org.telegram.ui.ActionBar.j6.l1(e7, textColor));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(dp4 - AndroidUtilities.dp(1.0f), dp5 - AndroidUtilities.dpf2(4.6f), AndroidUtilities.dp(1.0f) + dp4, AndroidUtilities.dpf2(1.6f) + dp5);
                    canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint3);
                    rectF2.set(dp4 - AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(2.6f) + dp5, dp4 + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(4.6f) + dp5);
                    canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint3);
                }
                canvas2.restore();
                i10 = z11;
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
                this.P = j9Var.n == 2 ? 0.7f : 1.0f;
            }
            float f28 = this.Q * this.P;
            frameLayout.setAlpha(f28);
            int i13 = i10;
            if (f28 <= 0.0f) {
                i13 = 4;
            }
            frameLayout.setVisibility(i13);
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
            lx lxVar = this.b0;
            m mVar = lxVar.r;
            if (parent == mVar) {
                mVar.invalidate();
            } else {
                lxVar.invalidate();
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
        k9 k9Var = this.e;
        if (k9Var != null) {
            k9Var.a();
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
                org.telegram.ui.Components.i9 i9Var = this.v;
                i9Var.j(i10, chat);
                imageReceiver.setForUserOrChat(chat, i9Var);
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
        t8 t8Var;
        lx lxVar = this.b0;
        int i10 = lxVar.f;
        u8 u8Var = lxVar.s;
        long j10 = this.E;
        int i11 = 1;
        int i12 = 0;
        boolean z10 = j10 == j3;
        if (!z10 && this.e != null) {
            u8Var.e0(j10, false);
            this.e.a();
            this.e = null;
        }
        this.E = j3;
        this.F = j3 == UserConfig.getInstance(i10).getClientUserId();
        this.G = u8Var.N(j3);
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
        org.telegram.ui.Components.i9 i9Var = this.n;
        i9Var.j(i10, chat);
        imageReceiver.setForUserOrChat(chat, i9Var);
        if (this.N) {
            return;
        }
        this.y.i(null);
        if (u8Var.N(j3)) {
            this.y.setTextSize(10);
            this.y.l(LocaleController.getString(R.string.FailedStory), false);
            this.U = false;
            return;
        }
        if (!Utilities.isNullOrEmpty(u8Var.E(j3))) {
            this.y.setTextSize(10);
            p9.a(this.y);
            this.U = true;
            return;
        }
        HashMap hashMap = (HashMap) u8Var.e.f(j3);
        if (hashMap != null && !hashMap.isEmpty()) {
            Collection values = hashMap.values();
            if (!values.isEmpty()) {
                t8Var = (t8) values.iterator().next();
                if (t8Var == null) {
                    this.y.setTextSize(10);
                    p9.a(this.y);
                    this.U = true;
                    return;
                }
                if (this.F) {
                    if (z10 && this.U && !this.N) {
                        org.telegram.ui.ActionBar.j5 j5Var = this.y;
                        b();
                        ValueAnimator valueAnimator = lxVar.j0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            lxVar.j0 = null;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        lxVar.j0 = ofFloat;
                        ofFloat.addUpdateListener(new ah.m0(i11, this, j5Var));
                        lxVar.j0.addListener(new t(i12, this, j5Var));
                        lxVar.j0.setDuration(150L);
                        this.y.setAlpha(0.0f);
                        this.y.setTranslationY(AndroidUtilities.dp(5.0f));
                        lxVar.k0 = new s(this, i12);
                    }
                    AndroidUtilities.runOnUIThread(lxVar.k0, 500L);
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
                    Drawable mutate = lxVar.getContext().getDrawable(R.drawable.verified_area).mutate();
                    Drawable mutate2 = lxVar.getContext().getDrawable(R.drawable.verified_check).mutate();
                    k kVar = new k(lxVar, mutate, mutate2, mutate, mutate2);
                    kVar.w = true;
                    this.S = kVar;
                }
                this.y.l(Emoji.replaceEmoji(trim, this.y.getPaint().getFontMetricsInt(), false), false);
                this.y.i(this.S);
                return;
            }
        }
        t8Var = null;
        if (t8Var == null) {
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        j9 j9Var = this.O;
        if (z10 && j9Var.H == null) {
            j9Var.H = new zc(this, 1.5f, 5.0f);
        }
        zc zcVar = j9Var.H;
        if (zcVar != null) {
            zcVar.c(z10);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.N || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            lx lxVar = this.b0;
            m mVar = lxVar.r;
            if (parent == mVar) {
                mVar.invalidate();
            }
            lxVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
