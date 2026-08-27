package jh;

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
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.si0;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class o extends FrameLayout {
    public long A;
    public boolean B;
    public boolean C;
    public boolean D;
    public long E;
    public float F;
    public float G;
    public float H;
    public float I;
    public boolean J;
    public final h7 K;
    public float L;
    public float M;
    public si0 N;
    public f O;
    public final float P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final org.telegram.ui.Components.y5 T;
    public final /* synthetic */ yw U;
    public boolean a;
    public int b;
    public boolean c;
    public boolean d;
    public i7 e;
    public TLRPC.User f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.y8 n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public final org.telegram.ui.Components.y8 v;
    public boolean w;
    public final FrameLayout x;
    public org.telegram.ui.ActionBar.h5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yw ywVar, Context context) {
        super(context);
        this.U = ywVar;
        this.n = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.v = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        this.w = true;
        h7 h7Var = new h7(null, true);
        this.K = h7Var;
        this.L = 1.0f;
        this.M = 1.0f;
        this.P = 1.0f;
        this.T = new org.telegram.ui.Components.y5(this, 0L, 350L, er.h);
        h7Var.o = ywVar.b == 1;
        h7Var.D = true;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.x = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.J) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, h7.z5.c(-2.0f, -1));
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
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        this.y = h5Var;
        h5Var.setTypeface(AndroidUtilities.bold());
        this.y.setGravity(17);
        this.y.setTextSize(11);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.y;
        textColor = this.U.getTextColor();
        h5Var2.setTextColor(textColor);
        NotificationCenter.listenEmojiLoading(this.y);
        this.y.setMaxLines(1);
        this.x.addView(this.y, h7.z5.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.r.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        this.s.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f10, float f11, float f12) {
        yw ywVar = this.U;
        int i10 = ywVar.b;
        Paint paint = ywVar.C;
        s6 s6Var = ywVar.s;
        Paint paint2 = ywVar.D;
        Drawable drawable = ywVar.c;
        if (this.B && !s6Var.I(this.A) && Utilities.isNullOrEmpty(s6Var.E(this.A))) {
            float dp = f10 + AndroidUtilities.dp(16.0f);
            float dp2 = f11 + AndroidUtilities.dp(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.g6.l1(f12, ywVar.f(org.telegram.ui.ActionBar.g6.hl)));
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.g6.l1(f12, ywVar.f(org.telegram.ui.ActionBar.g6.s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.g6.l1(f12, ywVar.f(org.telegram.ui.ActionBar.g6.M8)));
            }
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(11.0f), paint2);
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(9.0f), paint);
            int f13 = ywVar.f(i10 == 0 ? org.telegram.ui.ActionBar.g6.s8 : org.telegram.ui.ActionBar.g6.M8);
            if (f13 != ywVar.e) {
                ywVar.e = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.setBounds((int) (dp - (drawable.getIntrinsicWidth() / 2.0f)), (int) (dp2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + dp), (int) ((drawable.getIntrinsicHeight() / 2.0f) + dp2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f10, float f11, float f12, boolean z10) {
        float f13 = this.F;
        yw ywVar = this.U;
        if (f13 != f10 || this.G != f11 || 0.0f != f12 || this.R != z10) {
            this.R = z10;
            this.F = f10;
            this.G = f11;
            invalidate();
            ywVar.h.invalidate();
        }
        float clamp = this.J ? 0.0f : 1.0f - Utilities.clamp(ywVar.J / ywVar.x0, 1.0f, 0.0f);
        this.M = clamp;
        float f14 = clamp * this.L;
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
        h7 h7Var;
        float f12;
        float f13;
        float size;
        boolean z10;
        float f14;
        yw ywVar;
        boolean z11;
        int textColor;
        yw ywVar2;
        float f15;
        boolean z12;
        float f16;
        ImageReceiver imageReceiver2;
        boolean[] zArr;
        si0 si0Var;
        float dp = AndroidUtilities.dp(48.0f);
        float dp2 = AndroidUtilities.dp(26.33f);
        float dp3 = AndroidUtilities.dp(8.0f);
        yw ywVar3 = this.U;
        int i10 = ywVar3.b;
        s6 s6Var = ywVar3.s;
        Paint paint = ywVar3.D;
        float clamp = Utilities.clamp(ywVar3.j0 / 0.5f, 1.0f, 0.0f) * dp3;
        if (this.R) {
            clamp += Utilities.clamp((ywVar3.j0 - 0.5f) / 0.5f, 1.0f, 0.0f) * AndroidUtilities.dp(16.0f);
        }
        float lerp = AndroidUtilities.lerp(dp + clamp, dp2, this.F);
        float f17 = lerp / 2.0f;
        float measuredWidth = (getMeasuredWidth() / 2.0f) - f17;
        float lerp2 = AndroidUtilities.lerp(measuredWidth, 0.0f, this.F);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) / 2.0f, this.F);
        float clamp2 = Utilities.clamp(this.F / 0.5f, 1.0f, 0.0f);
        h7 h7Var2 = this.K;
        h7Var2.a = true;
        RectF rectF = h7Var2.F;
        if (!h7Var2.p) {
            h7Var2.e = 1.0f - ywVar3.W;
        }
        float f18 = lerp3 + lerp;
        rectF.set(lerp2, lerp3, lerp2 + lerp, f18);
        h7Var2.G = AndroidUtilities.dpf2(1.33f) * this.F;
        ImageReceiver imageReceiver3 = this.r;
        imageReceiver3.setAlpha(1.0f);
        imageReceiver3.setRoundRadius((int) f17);
        float f19 = lerp2 + f17;
        this.H = f19;
        float f20 = lerp3 + f17;
        this.I = f20;
        if (i10 == 0) {
            f10 = f17;
            paint.setColor(ywVar3.f(org.telegram.ui.ActionBar.g6.s8));
        } else {
            f10 = f17;
            paint.setColor(ywVar3.f(org.telegram.ui.ActionBar.g6.M8));
        }
        if (this.F != 0.0f) {
            imageReceiver = imageReceiver3;
            f11 = lerp2;
            canvas.drawCircle(this.H, this.I, AndroidUtilities.dpf2(1.5f) + f10, paint);
        } else {
            imageReceiver = imageReceiver3;
            f11 = lerp2;
        }
        canvas.save();
        float f21 = this.H;
        float f22 = this.I;
        float f23 = this.P;
        canvas.scale(f23, f23, f21, f22);
        if (this.N == null) {
            this.N = ywVar3.n;
        }
        ArrayList arrayList = (ArrayList) s6Var.c.f(this.A);
        boolean z13 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z13 || (this.S && (si0Var = this.N) != null && si0Var.f < 0.98f)) {
            canvas2 = canvas;
            h7Var = h7Var2;
            ImageReceiver imageReceiver4 = imageReceiver;
            f12 = f11;
            f13 = f18;
            if (z13) {
                float f24 = 0.0f;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    f24 += ((r6) arrayList.get(i11)).h;
                }
                size = (s6Var.d + f24) / (arrayList.size() + r4);
                z10 = ((r6) i0.a.i(1, arrayList)).C;
                ywVar3.i0 = z10;
            } else {
                z10 = ywVar3.i0;
                size = 1.0f;
            }
            invalidate();
            if (this.N == null) {
                si0 si0Var2 = ywVar3.n;
                if (si0Var2 != null) {
                    this.N = si0Var2;
                } else {
                    si0 si0Var3 = new si0(this);
                    this.N = si0Var3;
                    ywVar3.n = si0Var3;
                    si0Var3.d(null, true, false);
                }
            }
            if (this.w) {
                canvas2.save();
                canvas2.scale(h7Var.b(), h7Var.b(), rectF.centerX(), rectF.centerY());
                imageReceiver4.setImageCoords(rectF);
                imageReceiver4.draw(canvas2);
                canvas2.restore();
            }
            this.N.q = 0;
            Paint o10 = z10 ? l7.o(imageReceiver4) : l7.t(imageReceiver4, true);
            o10.setAlpha(255);
            si0 si0Var4 = this.N;
            si0Var4.t = o10;
            si0Var4.f((int) (imageReceiver4.getImageX() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageY() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageX2() + AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageY2() + AndroidUtilities.dp(3.0f)));
            this.N.e(Utilities.clamp(size, 1.0f, 0.0f), this.S);
            if (imageReceiver4.getVisible()) {
                this.N.a(canvas2);
            }
            this.S = true;
            invalidate();
        } else {
            float e9 = this.T.e(this.C);
            if (this.w) {
                if (this.S) {
                    h7Var2.p = true;
                    h7Var2.e = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ag.u(this, 14));
                    ofFloat.addListener(new ag.r1(this, 12));
                    ywVar2 = ywVar3;
                    ofFloat.setDuration(100L);
                    ofFloat.start();
                } else {
                    ywVar2 = ywVar3;
                }
                float f25 = e9 * h7Var2.e;
                h7Var2.b = !this.S;
                ywVar = ywVar2;
                if (!this.c && ywVar.j0 <= 0.0f) {
                    if (AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(16.0f), er.g.getInterpolation(this.F)) < (AndroidUtilities.dpf2(3.5f) + f10) * 2.0f) {
                        f15 = ((float) Math.toDegrees(Math.acos((r1 / 2.0f) / r4))) * 2.0f;
                        h7Var2.f = f15;
                        h7Var2.l = this.c;
                        h7Var2.m = this.d;
                        h7Var2.u = 1.0f - f25;
                        z12 = this.B;
                        if (z12 && this.D) {
                            h7Var2.s = this.E;
                        } else {
                            h7Var2.s = 0L;
                        }
                        if (z12) {
                            h7Var = h7Var2;
                            f16 = f25;
                            imageReceiver2 = imageReceiver;
                            f12 = f11;
                            z11 = false;
                            f13 = f18;
                            zArr = null;
                            long j10 = this.A;
                            canvas2 = canvas;
                            l7.i(j10, canvas2, imageReceiver2, s6Var.I(j10), h7Var);
                        } else {
                            h7Var = h7Var2;
                            f16 = f25;
                            imageReceiver2 = imageReceiver;
                            f12 = f11;
                            z11 = false;
                            f13 = f18;
                            zArr = null;
                            canvas2 = canvas;
                            l7.i(this.A, canvas2, imageReceiver2, s6Var.H(), h7Var);
                        }
                        ImageReceiver imageReceiver5 = imageReceiver2;
                        if (f16 > 0.0f) {
                            if (l7.d == null) {
                                c20 c20Var = new c20();
                                l7.d = c20Var;
                                c20Var.a = true;
                                c20Var.b = true;
                                int w02 = org.telegram.ui.ActionBar.g6.w0(zArr, org.telegram.ui.ActionBar.g6.xj, z11);
                                int w03 = org.telegram.ui.ActionBar.g6.w0(zArr, org.telegram.ui.ActionBar.g6.q7, z11);
                                l7.d.d(i0.b.d(0.25f, w02, w03), w03, z11 ? 1 : 0, z11 ? 1 : 0);
                                l7.d.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                                l7.d.c.setStyle(Paint.Style.STROKE);
                                l7.d.c.setStrokeCap(Paint.Cap.ROUND);
                            }
                            l7.d.b(imageReceiver5.getImageX(), imageReceiver5.getImageY(), imageReceiver5.getImageX2(), imageReceiver5.getImageY2());
                            Paint paint2 = l7.d.c;
                            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
                            paint2.setAlpha((int) (255.0f * f16));
                            canvas2.drawCircle(f19, f20, h7Var.b() * (f10 + AndroidUtilities.dp(4.0f)), paint2);
                        }
                        e9 = f16;
                    }
                }
                f15 = 0.0f;
                h7Var2.f = f15;
                h7Var2.l = this.c;
                h7Var2.m = this.d;
                h7Var2.u = 1.0f - f25;
                z12 = this.B;
                if (z12) {
                }
                h7Var2.s = 0L;
                if (z12) {
                }
                ImageReceiver imageReceiver52 = imageReceiver2;
                if (f16 > 0.0f) {
                }
                e9 = f16;
            } else {
                canvas2 = canvas;
                h7Var = h7Var2;
                ywVar = ywVar3;
                f13 = f18;
                f12 = f11;
                z11 = false;
            }
            this.S = z11;
            if (this.w) {
                canvas2.save();
                float f26 = 1.0f - clamp2;
                canvas2.scale(f26, f26, this.H + AndroidUtilities.dp(16.0f), this.I + AndroidUtilities.dp(16.0f));
                c(canvas2, this.H, this.I, 1.0f);
                float f27 = this.H;
                float f28 = this.I;
                if (e9 > 0.0f) {
                    float dp4 = f27 + AndroidUtilities.dp(17.0f);
                    float dp5 = f28 + AndroidUtilities.dp(17.0f);
                    Paint paint3 = ywVar.C;
                    paint3.setColor(org.telegram.ui.ActionBar.g6.l1(e9, ywVar.f(org.telegram.ui.ActionBar.g6.q7)));
                    if (i10 == 0) {
                        paint.setColor(org.telegram.ui.ActionBar.g6.l1(e9, ywVar.f(org.telegram.ui.ActionBar.g6.s8)));
                    } else {
                        paint.setColor(org.telegram.ui.ActionBar.g6.l1(e9, ywVar.f(org.telegram.ui.ActionBar.g6.M8)));
                    }
                    float interpolation = er.k.getInterpolation(e9) * AndroidUtilities.dp(9.0f);
                    canvas2.drawCircle(dp4, dp5, AndroidUtilities.dp(2.0f) + interpolation, paint);
                    canvas2.drawCircle(dp4, dp5, interpolation, paint3);
                    textColor = ywVar.getTextColor();
                    paint3.setColor(org.telegram.ui.ActionBar.g6.l1(e9, textColor));
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
        if (!this.D || this.G <= 0.0f) {
            f14 = f12;
        } else {
            ImageReceiver imageReceiver6 = this.s;
            f14 = f12;
            imageReceiver6.setImageCoords(f14, lerp3, lerp, lerp);
            imageReceiver6.setAlpha(this.G);
            imageReceiver6.draw(canvas2);
        }
        float dp6 = ((1.0f - this.F) * AndroidUtilities.dp(7.0f)) + f13;
        FrameLayout frameLayout = this.x;
        frameLayout.setTranslationY(dp6);
        frameLayout.setTranslationX(f14 - measuredWidth);
        if (!this.J) {
            if (this.B) {
                this.L = 1.0f;
            } else {
                this.L = h7Var.n == 2 ? 0.7f : 1.0f;
            }
            float f29 = this.M * this.L;
            frameLayout.setAlpha(f29);
            frameLayout.setVisibility(f29 > 0.0f ? 0 : 4);
        }
        super.dispatchDraw(canvas);
    }

    public float getCy() {
        float dp = AndroidUtilities.dp(48.0f);
        float dp2 = AndroidUtilities.dp(26.33f);
        return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) / 2.0f, this.U.V) + (AndroidUtilities.lerp(dp, dp2, this.F) / 2.0f);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.J || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            yw ywVar = this.U;
            h hVar = ywVar.r;
            if (parent == hVar) {
                hVar.invalidate();
            } else {
                ywVar.invalidate();
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
        this.K.g();
        i7 i7Var = this.e;
        if (i7Var != null) {
            i7Var.a();
            this.e = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.J ? AndroidUtilities.dp(70.0f) : this.U.I, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCrossfadeTo(long j10) {
        TLRPC.Chat chat;
        int i10 = this.U.f;
        if (this.E != j10) {
            this.E = j10;
            boolean z10 = j10 != -1;
            this.D = z10;
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
                org.telegram.ui.Components.y8 y8Var = this.v;
                y8Var.j(i10, chat);
                imageReceiver.setForUserOrChat(chat, y8Var);
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
        r6 r6Var;
        yw ywVar = this.U;
        int i10 = ywVar.f;
        s6 s6Var = ywVar.s;
        long j11 = this.A;
        int i11 = 0;
        boolean z10 = j11 == j10;
        if (!z10 && this.e != null) {
            s6Var.e0(j11, false);
            this.e.a();
            this.e = null;
        }
        this.A = j10;
        this.B = j10 == UserConfig.getInstance(i10).getClientUserId();
        this.C = s6Var.N(j10);
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
        org.telegram.ui.Components.y8 y8Var = this.n;
        y8Var.j(i10, chat);
        imageReceiver.setForUserOrChat(chat, y8Var);
        if (this.J) {
            return;
        }
        this.y.i(null);
        if (s6Var.N(j10)) {
            this.y.setTextSize(10);
            this.y.l(LocaleController.getString(R.string.FailedStory), false);
            this.Q = false;
            return;
        }
        if (!Utilities.isNullOrEmpty(s6Var.E(j10))) {
            this.y.setTextSize(10);
            l7.a(this.y);
            this.Q = true;
            return;
        }
        HashMap hashMap = (HashMap) s6Var.e.f(j10);
        if (hashMap != null && !hashMap.isEmpty()) {
            Collection values = hashMap.values();
            if (!values.isEmpty()) {
                r6Var = (r6) values.iterator().next();
                if (r6Var == null) {
                    this.y.setTextSize(10);
                    l7.a(this.y);
                    this.Q = true;
                    return;
                }
                if (this.B) {
                    if (z10 && this.Q && !this.J) {
                        org.telegram.ui.ActionBar.h5 h5Var = this.y;
                        b();
                        ValueAnimator valueAnimator = ywVar.f0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            ywVar.f0 = null;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ywVar.f0 = ofFloat;
                        int i12 = 4;
                        ofFloat.addUpdateListener(new ag.t2(i12, this, h5Var));
                        ywVar.f0.addListener(new ag.x1(i12, this, h5Var));
                        ywVar.f0.setDuration(150L);
                        this.y.setAlpha(0.0f);
                        this.y.setTranslationY(AndroidUtilities.dp(5.0f));
                        ywVar.g0 = new n(this, i11);
                    }
                    AndroidUtilities.runOnUIThread(ywVar.g0, 500L);
                    this.Q = false;
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
                if (this.O == null) {
                    Drawable mutate = ywVar.getContext().getDrawable(R.drawable.verified_area).mutate();
                    Drawable mutate2 = ywVar.getContext().getDrawable(R.drawable.verified_check).mutate();
                    f fVar = new f(ywVar, mutate, mutate2, mutate, mutate2);
                    fVar.w = true;
                    this.O = fVar;
                }
                this.y.l(Emoji.replaceEmoji(trim, this.y.getPaint().getFontMetricsInt(), false), false);
                this.y.i(this.O);
                return;
            }
        }
        r6Var = null;
        if (r6Var == null) {
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        h7 h7Var = this.K;
        if (z10 && h7Var.H == null) {
            h7Var.H = new nc(this, 1.5f, 5.0f);
        }
        nc ncVar = h7Var.H;
        if (ncVar != null) {
            ncVar.c(z10);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.J || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            yw ywVar = this.U;
            h hVar = ywVar.r;
            if (parent == hVar) {
                hVar.invalidate();
            }
            ywVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
