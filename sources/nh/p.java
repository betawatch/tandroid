package nh;

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
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.rc;
import org.telegram.ui.gx;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class p extends FrameLayout {
    public long B;
    public boolean C;
    public boolean D;
    public boolean E;
    public long F;
    public float G;
    public float H;
    public float I;
    public float J;
    public boolean K;
    public final i7 L;
    public float M;
    public float N;
    public kj0 O;
    public g P;
    public final float Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final org.telegram.ui.Components.z5 U;
    public final /* synthetic */ gx V;
    public boolean a;
    public int b;
    public boolean c;
    public boolean d;
    public j7 e;
    public TLRPC.User f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.z8 n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public final org.telegram.ui.Components.z8 v;
    public boolean w;
    public final FrameLayout x;
    public org.telegram.ui.ActionBar.k5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(gx gxVar, Context context) {
        super(context);
        this.V = gxVar;
        this.n = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.v = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        this.w = true;
        i7 i7Var = new i7(null, true);
        this.L = i7Var;
        this.M = 1.0f;
        this.N = 1.0f;
        this.Q = 1.0f;
        this.U = new org.telegram.ui.Components.z5(this, 0L, 350L, nr.h);
        i7Var.o = gxVar.b == 1;
        i7Var.D = true;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.x = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.K) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, k7.b6.c(-2.0f, -1));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClipInParent(boolean z4) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).setClipChildren(z4);
        }
        if (getParent() == null || getParent().getParent() == null || getParent().getParent().getParent() == null) {
            return;
        }
        ((ViewGroup) getParent().getParent().getParent()).setClipChildren(z4);
    }

    public final void b() {
        int textColor;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
        this.y = k5Var;
        k5Var.setTypeface(AndroidUtilities.bold());
        this.y.setGravity(17);
        this.y.setTextSize(11);
        org.telegram.ui.ActionBar.k5 k5Var2 = this.y;
        textColor = this.V.getTextColor();
        k5Var2.setTextColor(textColor);
        NotificationCenter.listenEmojiLoading(this.y);
        this.y.setMaxLines(1);
        this.x.addView(this.y, k7.b6.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.r.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        this.s.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f10, float f11, float f12) {
        gx gxVar = this.V;
        int i10 = gxVar.b;
        Paint paint = gxVar.D;
        t6 t6Var = gxVar.s;
        Paint paint2 = gxVar.E;
        Drawable drawable = gxVar.c;
        if (this.C && !t6Var.I(this.B) && Utilities.isNullOrEmpty(t6Var.E(this.B))) {
            float dp = f10 + AndroidUtilities.dp(16.0f);
            float dp2 = f11 + AndroidUtilities.dp(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(f12, gxVar.f(org.telegram.ui.ActionBar.j6.hl)));
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.j6.l1(f12, gxVar.f(org.telegram.ui.ActionBar.j6.s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.j6.l1(f12, gxVar.f(org.telegram.ui.ActionBar.j6.M8)));
            }
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(11.0f), paint2);
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(9.0f), paint);
            int f13 = gxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.j6.s8 : org.telegram.ui.ActionBar.j6.M8);
            if (f13 != gxVar.e) {
                gxVar.e = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.setBounds((int) (dp - (drawable.getIntrinsicWidth() / 2.0f)), (int) (dp2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + dp), (int) ((drawable.getIntrinsicHeight() / 2.0f) + dp2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f10, float f11, float f12, boolean z4) {
        float f13 = this.G;
        gx gxVar = this.V;
        if (f13 != f10 || this.H != f11 || 0.0f != f12 || this.S != z4) {
            this.S = z4;
            this.G = f10;
            this.H = f11;
            invalidate();
            gxVar.h.invalidate();
        }
        float clamp = this.K ? 0.0f : 1.0f - Utilities.clamp(gxVar.K / gxVar.y0, 1.0f, 0.0f);
        this.N = clamp;
        float f14 = clamp * this.M;
        FrameLayout frameLayout = this.x;
        frameLayout.setAlpha(f14);
        frameLayout.setVisibility(f14 > 0.0f ? 0 : 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ImageReceiver imageReceiver;
        float f11;
        Canvas canvas2;
        i7 i7Var;
        float f12;
        float f13;
        float size;
        boolean z4;
        float f14;
        gx gxVar;
        boolean z10;
        int textColor;
        gx gxVar2;
        float f15;
        boolean z11;
        float f16;
        ImageReceiver imageReceiver2;
        boolean[] zArr;
        kj0 kj0Var;
        float dp = AndroidUtilities.dp(48.0f);
        float dp2 = AndroidUtilities.dp(26.33f);
        float dp3 = AndroidUtilities.dp(8.0f);
        gx gxVar3 = this.V;
        int i10 = gxVar3.b;
        t6 t6Var = gxVar3.s;
        Paint paint = gxVar3.E;
        float clamp = Utilities.clamp(gxVar3.k0 / 0.5f, 1.0f, 0.0f) * dp3;
        if (this.S) {
            clamp += Utilities.clamp((gxVar3.k0 - 0.5f) / 0.5f, 1.0f, 0.0f) * AndroidUtilities.dp(16.0f);
        }
        float lerp = AndroidUtilities.lerp(dp + clamp, dp2, this.G);
        float f17 = lerp / 2.0f;
        float measuredWidth = (getMeasuredWidth() / 2.0f) - f17;
        float lerp2 = AndroidUtilities.lerp(measuredWidth, 0.0f, this.G);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) / 2.0f, this.G);
        float clamp2 = Utilities.clamp(this.G / 0.5f, 1.0f, 0.0f);
        i7 i7Var2 = this.L;
        i7Var2.a = true;
        RectF rectF = i7Var2.F;
        if (!i7Var2.p) {
            i7Var2.e = 1.0f - gxVar3.a0;
        }
        float f18 = lerp3 + lerp;
        rectF.set(lerp2, lerp3, lerp2 + lerp, f18);
        i7Var2.G = AndroidUtilities.dpf2(1.33f) * this.G;
        ImageReceiver imageReceiver3 = this.r;
        imageReceiver3.setAlpha(1.0f);
        imageReceiver3.setRoundRadius((int) f17);
        float f19 = lerp2 + f17;
        this.I = f19;
        float f20 = lerp3 + f17;
        this.J = f20;
        if (i10 == 0) {
            f10 = f17;
            paint.setColor(gxVar3.f(org.telegram.ui.ActionBar.j6.s8));
        } else {
            f10 = f17;
            paint.setColor(gxVar3.f(org.telegram.ui.ActionBar.j6.M8));
        }
        if (this.G != 0.0f) {
            imageReceiver = imageReceiver3;
            f11 = lerp2;
            canvas.drawCircle(this.I, this.J, AndroidUtilities.dpf2(1.5f) + f10, paint);
        } else {
            imageReceiver = imageReceiver3;
            f11 = lerp2;
        }
        canvas.save();
        float f21 = this.I;
        float f22 = this.J;
        float f23 = this.Q;
        canvas.scale(f23, f23, f21, f22);
        if (this.O == null) {
            this.O = gxVar3.n;
        }
        ArrayList arrayList = (ArrayList) t6Var.c.f(this.B);
        boolean z12 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z12 || (this.T && (kj0Var = this.O) != null && kj0Var.f < 0.98f)) {
            canvas2 = canvas;
            i7Var = i7Var2;
            ImageReceiver imageReceiver4 = imageReceiver;
            f12 = f11;
            f13 = f18;
            if (z12) {
                float f24 = 0.0f;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    f24 += ((s6) arrayList.get(i11)).h;
                }
                size = (t6Var.d + f24) / (arrayList.size() + r4);
                z4 = ((s6) kh.a2.i(1, arrayList)).D;
                gxVar3.j0 = z4;
            } else {
                z4 = gxVar3.j0;
                size = 1.0f;
            }
            invalidate();
            if (this.O == null) {
                kj0 kj0Var2 = gxVar3.n;
                if (kj0Var2 != null) {
                    this.O = kj0Var2;
                } else {
                    kj0 kj0Var3 = new kj0(this);
                    this.O = kj0Var3;
                    gxVar3.n = kj0Var3;
                    kj0Var3.d(null, true, false);
                }
            }
            if (this.w) {
                canvas2.save();
                canvas2.scale(i7Var.b(), i7Var.b(), rectF.centerX(), rectF.centerY());
                imageReceiver4.setImageCoords(rectF);
                imageReceiver4.draw(canvas2);
                canvas2.restore();
            }
            this.O.q = 0;
            Paint o10 = z4 ? m7.o(imageReceiver4) : m7.t(imageReceiver4, true);
            o10.setAlpha(255);
            kj0 kj0Var4 = this.O;
            kj0Var4.t = o10;
            kj0Var4.f((int) (imageReceiver4.getImageX() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageY() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageX2() + AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageY2() + AndroidUtilities.dp(3.0f)));
            this.O.e(Utilities.clamp(size, 1.0f, 0.0f), this.T);
            if (imageReceiver4.getVisible()) {
                this.O.a(canvas2);
            }
            this.T = true;
            invalidate();
        } else {
            float e = this.U.e(this.D);
            if (this.w) {
                if (this.T) {
                    i7Var2.p = true;
                    i7Var2.e = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new dg.o1(this, 20));
                    ofFloat.addListener(new cg.l0(this, 16));
                    gxVar2 = gxVar3;
                    ofFloat.setDuration(100L);
                    ofFloat.start();
                } else {
                    gxVar2 = gxVar3;
                }
                float f25 = e * i7Var2.e;
                i7Var2.b = !this.T;
                gxVar = gxVar2;
                if (!this.c && gxVar.k0 <= 0.0f) {
                    if (AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(16.0f), nr.g.getInterpolation(this.G)) < (AndroidUtilities.dpf2(3.5f) + f10) * 2.0f) {
                        f15 = ((float) Math.toDegrees(Math.acos((r1 / 2.0f) / r4))) * 2.0f;
                        i7Var2.f = f15;
                        i7Var2.l = this.c;
                        i7Var2.m = this.d;
                        i7Var2.u = 1.0f - f25;
                        z11 = this.C;
                        if (z11 && this.E) {
                            i7Var2.s = this.F;
                        } else {
                            i7Var2.s = 0L;
                        }
                        if (z11) {
                            i7Var = i7Var2;
                            f16 = f25;
                            imageReceiver2 = imageReceiver;
                            f12 = f11;
                            z10 = false;
                            f13 = f18;
                            zArr = null;
                            long j10 = this.B;
                            canvas2 = canvas;
                            m7.i(j10, canvas2, imageReceiver2, t6Var.I(j10), i7Var);
                        } else {
                            i7Var = i7Var2;
                            f16 = f25;
                            imageReceiver2 = imageReceiver;
                            f12 = f11;
                            z10 = false;
                            f13 = f18;
                            zArr = null;
                            canvas2 = canvas;
                            m7.i(this.B, canvas2, imageReceiver2, t6Var.H(), i7Var);
                        }
                        ImageReceiver imageReceiver5 = imageReceiver2;
                        if (f16 > 0.0f) {
                            if (m7.d == null) {
                                p20 p20Var = new p20();
                                m7.d = p20Var;
                                p20Var.a = true;
                                p20Var.b = true;
                                int w02 = org.telegram.ui.ActionBar.j6.w0(zArr, org.telegram.ui.ActionBar.j6.xj, z10);
                                int w03 = org.telegram.ui.ActionBar.j6.w0(zArr, org.telegram.ui.ActionBar.j6.q7, z10);
                                m7.d.d(i0.a.d(0.25f, w02, w03), w03, z10 ? 1 : 0, z10 ? 1 : 0);
                                m7.d.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                                m7.d.c.setStyle(Paint.Style.STROKE);
                                m7.d.c.setStrokeCap(Paint.Cap.ROUND);
                            }
                            m7.d.b(imageReceiver5.getImageX(), imageReceiver5.getImageY(), imageReceiver5.getImageX2(), imageReceiver5.getImageY2());
                            Paint paint2 = m7.d.c;
                            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
                            paint2.setAlpha((int) (255.0f * f16));
                            canvas2.drawCircle(f19, f20, i7Var.b() * (f10 + AndroidUtilities.dp(4.0f)), paint2);
                        }
                        e = f16;
                    }
                }
                f15 = 0.0f;
                i7Var2.f = f15;
                i7Var2.l = this.c;
                i7Var2.m = this.d;
                i7Var2.u = 1.0f - f25;
                z11 = this.C;
                if (z11) {
                }
                i7Var2.s = 0L;
                if (z11) {
                }
                ImageReceiver imageReceiver52 = imageReceiver2;
                if (f16 > 0.0f) {
                }
                e = f16;
            } else {
                canvas2 = canvas;
                i7Var = i7Var2;
                gxVar = gxVar3;
                f13 = f18;
                f12 = f11;
                z10 = false;
            }
            this.T = z10;
            if (this.w) {
                canvas2.save();
                float f26 = 1.0f - clamp2;
                canvas2.scale(f26, f26, this.I + AndroidUtilities.dp(16.0f), this.J + AndroidUtilities.dp(16.0f));
                c(canvas2, this.I, this.J, 1.0f);
                float f27 = this.I;
                float f28 = this.J;
                if (e > 0.0f) {
                    float dp4 = f27 + AndroidUtilities.dp(17.0f);
                    float dp5 = f28 + AndroidUtilities.dp(17.0f);
                    Paint paint3 = gxVar.D;
                    paint3.setColor(org.telegram.ui.ActionBar.j6.l1(e, gxVar.f(org.telegram.ui.ActionBar.j6.q7)));
                    if (i10 == 0) {
                        paint.setColor(org.telegram.ui.ActionBar.j6.l1(e, gxVar.f(org.telegram.ui.ActionBar.j6.s8)));
                    } else {
                        paint.setColor(org.telegram.ui.ActionBar.j6.l1(e, gxVar.f(org.telegram.ui.ActionBar.j6.M8)));
                    }
                    float interpolation = nr.k.getInterpolation(e) * AndroidUtilities.dp(9.0f);
                    canvas2.drawCircle(dp4, dp5, AndroidUtilities.dp(2.0f) + interpolation, paint);
                    canvas2.drawCircle(dp4, dp5, interpolation, paint3);
                    textColor = gxVar.getTextColor();
                    paint3.setColor(org.telegram.ui.ActionBar.j6.l1(e, textColor));
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
        if (!this.E || this.H <= 0.0f) {
            f14 = f12;
        } else {
            ImageReceiver imageReceiver6 = this.s;
            f14 = f12;
            imageReceiver6.setImageCoords(f14, lerp3, lerp, lerp);
            imageReceiver6.setAlpha(this.H);
            imageReceiver6.draw(canvas2);
        }
        float dp6 = ((1.0f - this.G) * AndroidUtilities.dp(7.0f)) + f13;
        FrameLayout frameLayout = this.x;
        frameLayout.setTranslationY(dp6);
        frameLayout.setTranslationX(f14 - measuredWidth);
        if (!this.K) {
            if (this.C) {
                this.M = 1.0f;
            } else {
                this.M = i7Var.n == 2 ? 0.7f : 1.0f;
            }
            float f29 = this.N * this.M;
            frameLayout.setAlpha(f29);
            frameLayout.setVisibility(f29 > 0.0f ? 0 : 4);
        }
        super.dispatchDraw(canvas);
    }

    public float getCy() {
        float dp = AndroidUtilities.dp(48.0f);
        float dp2 = AndroidUtilities.dp(26.33f);
        return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) / 2.0f, this.V.W) + (AndroidUtilities.lerp(dp, dp2, this.G) / 2.0f);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.K || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            gx gxVar = this.V;
            i iVar = gxVar.r;
            if (parent == iVar) {
                iVar.invalidate();
            } else {
                gxVar.invalidate();
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
        this.L.g();
        j7 j7Var = this.e;
        if (j7Var != null) {
            j7Var.a();
            this.e = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.K ? AndroidUtilities.dp(70.0f) : this.V.J, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCrossfadeTo(long j10) {
        TLRPC.Chat chat;
        int i10 = this.V.f;
        if (this.F != j10) {
            this.F = j10;
            boolean z4 = j10 != -1;
            this.E = z4;
            ImageReceiver imageReceiver = this.s;
            if (!z4) {
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
                org.telegram.ui.Components.z8 z8Var = this.v;
                z8Var.j(i10, chat);
                imageReceiver.setForUserOrChat(chat, z8Var);
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
        s6 s6Var;
        gx gxVar = this.V;
        int i10 = gxVar.f;
        t6 t6Var = gxVar.s;
        long j11 = this.B;
        int i11 = 0;
        boolean z4 = j11 == j10;
        if (!z4 && this.e != null) {
            t6Var.e0(j11, false);
            this.e.a();
            this.e = null;
        }
        this.B = j10;
        this.C = j10 == UserConfig.getInstance(i10).getClientUserId();
        this.D = t6Var.N(j10);
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
        org.telegram.ui.Components.z8 z8Var = this.n;
        z8Var.j(i10, chat);
        imageReceiver.setForUserOrChat(chat, z8Var);
        if (this.K) {
            return;
        }
        this.y.i(null);
        if (t6Var.N(j10)) {
            this.y.setTextSize(10);
            this.y.l(LocaleController.getString(R.string.FailedStory), false);
            this.R = false;
            return;
        }
        if (!Utilities.isNullOrEmpty(t6Var.E(j10))) {
            this.y.setTextSize(10);
            m7.a(this.y);
            this.R = true;
            return;
        }
        HashMap hashMap = (HashMap) t6Var.e.f(j10);
        if (hashMap != null && !hashMap.isEmpty()) {
            Collection values = hashMap.values();
            if (!values.isEmpty()) {
                s6Var = (s6) values.iterator().next();
                if (s6Var == null) {
                    this.y.setTextSize(10);
                    m7.a(this.y);
                    this.R = true;
                    return;
                }
                if (this.C) {
                    if (z4 && this.R && !this.K) {
                        org.telegram.ui.ActionBar.k5 k5Var = this.y;
                        b();
                        ValueAnimator valueAnimator = gxVar.g0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            gxVar.g0 = null;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        gxVar.g0 = ofFloat;
                        ofFloat.addUpdateListener(new ag.a(6, this, k5Var));
                        gxVar.g0.addListener(new dg.y2(5, this, k5Var));
                        gxVar.g0.setDuration(150L);
                        this.y.setAlpha(0.0f);
                        this.y.setTranslationY(AndroidUtilities.dp(5.0f));
                        gxVar.h0 = new o(this, i11);
                    }
                    AndroidUtilities.runOnUIThread(gxVar.h0, 500L);
                    this.R = false;
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
                if (this.P == null) {
                    Drawable mutate = gxVar.getContext().getDrawable(R.drawable.verified_area).mutate();
                    Drawable mutate2 = gxVar.getContext().getDrawable(R.drawable.verified_check).mutate();
                    g gVar = new g(gxVar, mutate, mutate2, mutate, mutate2);
                    gVar.w = true;
                    this.P = gVar;
                }
                this.y.l(Emoji.replaceEmoji(trim, this.y.getPaint().getFontMetricsInt(), false), false);
                this.y.i(this.P);
                return;
            }
        }
        s6Var = null;
        if (s6Var == null) {
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        super.setPressed(z4);
        i7 i7Var = this.L;
        if (z4 && i7Var.H == null) {
            i7Var.H = new rc(this, 1.5f, 5.0f);
        }
        rc rcVar = i7Var.H;
        if (rcVar != null) {
            rcVar.c(z4);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.K || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            gx gxVar = this.V;
            i iVar = gxVar.r;
            if (parent == iVar) {
                iVar.invalidate();
            }
            gxVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
