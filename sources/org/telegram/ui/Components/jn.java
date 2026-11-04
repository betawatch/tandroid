package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m91;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class jn extends FrameLayout implements qe.b, org.telegram.messenger.cs, org.telegram.ui.ActionBar.z5 {
    public org.telegram.ui.ActionBar.k A0;
    public final ImageView E;
    public final ImageView F;
    public final zz0 G;
    public final org.telegram.ui.wm H;
    public final nu0[] I;
    public final u8 J;
    public final int K;
    public boolean L;
    public int M;
    public int N;
    public nu0 O;
    public int P;
    public int Q;
    public AnimatorSet R;
    public final boolean[] S;
    public final boolean[] T;
    public final boolean U;
    public int V;
    public int W;
    public final qe.a a;
    public CharSequence a0;
    public boolean b;
    public int b0;
    public Integer c;
    public Integer c0;
    public final int d;
    public final os0 d0;
    public final fn e;
    public final org.telegram.ui.ActionBar.e6 e0;
    public final boolean f;
    public boolean f0;
    public final e5 g0;
    public final org.telegram.ui.kk h;
    public final e5 h0;
    public final gc i0;
    public final cn j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final AtomicReference n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public String q0;
    public final org.telegram.ui.kk r;
    public String r0;
    public final h6 s;
    public Drawable s0;
    public Drawable t0;
    public Drawable u0;
    public boolean v0;
    public final AtomicReference w;
    public PorterDuffColorFilter w0;
    public final ImageView x;
    public PorterDuffColorFilter x0;
    public final ImageView y;
    public int y0;
    public int z0;

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0106, code lost:
    
        if (r3 != 6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02cd, code lost:
    
        if (r0.v4 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00f8, code lost:
    
        if (r3.v4 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x033f A[EDGE_INSN: B:65:0x033f->B:73:0x033f BREAK  A[LOOP:0: B:56:0x032d->B:62:0x0339], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010f  */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jn(Context context, org.telegram.ui.ActionBar.d2 d2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z11;
        int i3;
        int i10;
        ?? r72;
        TLRPC.Chat chat;
        int i11;
        nu0[] nu0VarArr;
        int i12;
        xq xqVar = xq.h;
        this.a = new qe.a(0, this, xqVar, 320L, false);
        this.d = 42;
        AtomicReference atomicReference = new AtomicReference();
        this.n = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.w = atomicReference2;
        nu0[] nu0VarArr2 = new nu0[6];
        this.I = nu0VarArr2;
        this.J = new u8((org.telegram.ui.ActionBar.e6) null);
        this.K = org.telegram.messenger.h10.t0;
        this.L = true;
        this.M = org.telegram.messenger.g0.L(8.0f);
        this.N = 0;
        this.P = -1;
        this.Q = -1;
        this.S = new boolean[1];
        this.T = new boolean[1];
        this.V = -1;
        this.b0 = -1;
        this.f0 = false;
        this.i0 = new gc(this);
        this.j0 = new cn(this, 2);
        this.o0 = false;
        this.p0 = false;
        this.q0 = null;
        this.r0 = null;
        this.e0 = e6Var;
        boolean z12 = d2Var instanceof org.telegram.ui.wm;
        if (z12) {
            this.H = (org.telegram.ui.wm) d2Var;
        }
        org.telegram.ui.wm wmVar = this.H;
        boolean z13 = wmVar != null && ((i12 = wmVar.g4) == 0 || i12 == 8) && !org.telegram.messenger.l10.z(wmVar.j()) && (this.H.j() == null || this.H.j().id != 489000);
        fn fnVar = new fn(this, context, d2Var, z13, e6Var);
        this.e = fnVar;
        if (z12 || (d2Var instanceof m91)) {
            org.telegram.ui.wm wmVar2 = this.H;
            if (wmVar2 == null || ((i3 = wmVar2.g4) != 5 && i3 != 9 && i3 != 6 && i3 != 8 && !org.telegram.messenger.l10.u(wmVar2.f))) {
                this.d0 = new os0(d2Var);
            }
            org.telegram.ui.wm wmVar3 = this.H;
            if (wmVar3 != null) {
                if (wmVar3.da()) {
                    org.telegram.ui.wm wmVar4 = this.H;
                    if (wmVar4.m4 != null) {
                    }
                    z11 = true;
                    this.f = z11;
                    if (z11) {
                        fnVar.setVisibility(8);
                    }
                }
                int i13 = this.H.g4;
                if (i13 != 2) {
                    if (i13 != 5) {
                        if (i13 != 9) {
                        }
                    }
                }
                z11 = true;
                this.f = z11;
                if (z11) {
                }
            }
            z11 = false;
            this.f = z11;
            if (z11) {
            }
        }
        fnVar.setContentDescription(org.telegram.messenger.bd.M0(2131754798, null));
        fnVar.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        addView(fnVar);
        if (z13) {
            org.telegram.ui.wm wmVar5 = this.H;
            TLRPC.Chat chat2 = wmVar5 != null ? wmVar5.e : null;
            if (chat2 != null && chat2.linked_community_id != 0) {
                b8.pf.b(fnVar, 0.05f, 1.2f);
            }
            final int i14 = 0;
            fnVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.en
                public final /* synthetic */ jn b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            jn jnVar = this.b;
                            if (!jnVar.d()) {
                                jnVar.e(true, false);
                                break;
                            }
                            break;
                        default:
                            this.b.e(false, false);
                            break;
                    }
                }
            });
        }
        org.telegram.ui.kk kkVar = new org.telegram.ui.kk(context, atomicReference);
        this.h = kkVar;
        kkVar.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.r6.Y(kkVar, org.telegram.ui.ActionBar.k6.A8, e6Var);
        kkVar.setTextSize(18);
        kkVar.setGravity(3);
        kkVar.setTypeface(org.telegram.messenger.g0.o());
        kkVar.setLeftDrawableTopPadding(-org.telegram.messenger.g0.L(1.3f));
        kkVar.setCanHideRightDrawable(false);
        kkVar.setRightDrawableOutside(true);
        kkVar.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(12.0f));
        addView(kkVar);
        if (o()) {
            h6 h6Var = new h6(context, true, true, true);
            this.s = h6Var;
            h6Var.b(0.3f, 320L, xqVar);
            h6Var.setEllipsizeByGradient(true);
            int i15 = org.telegram.ui.ActionBar.k6.B8;
            org.telegram.ui.ActionBar.r6.Z(h6Var, i15, e6Var);
            h6Var.setTag(Integer.valueOf(i15));
            h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            h6Var.setGravity(3);
            h6Var.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
            h6Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
            addView(h6Var);
        } else {
            org.telegram.ui.kk kkVar2 = new org.telegram.ui.kk(context, atomicReference2);
            this.r = kkVar2;
            kkVar2.setEllipsizeByGradient(true);
            int i16 = org.telegram.ui.ActionBar.k6.B8;
            org.telegram.ui.ActionBar.r6.Y(kkVar2, i16, e6Var);
            kkVar2.setTag(Integer.valueOf(i16));
            kkVar2.setTextSize(14);
            kkVar2.setGravity(3);
            kkVar2.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
            addView(kkVar2);
        }
        if (this.H != null) {
            ImageView imageView = new ImageView(context);
            this.y = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setVisibility(8);
            imageView.setImageDrawable(new jh.c());
            addView(imageView);
            ImageView imageView2 = new ImageView(context);
            this.x = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setVisibility(8);
            zz0 zz0Var = new zz0(context, e6Var);
            this.G = zz0Var;
            imageView2.setImageDrawable(zz0Var);
            zz0Var.k = true;
            zz0Var.b.setColor(0);
            addView(imageView2);
            this.U = z10;
            imageView2.setOnClickListener(new q2(8, this, e6Var));
            if (z10) {
                imageView2.setContentDescription(org.telegram.messenger.bd.M0(2131745519, null));
            } else {
                imageView2.setContentDescription(org.telegram.messenger.bd.M0(2131754925, null));
            }
            ImageView imageView3 = new ImageView(context);
            this.E = imageView3;
            imageView3.setImageResource(R.drawable.star_small_outline);
            org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.s8, e6Var, PorterDuff.Mode.SRC_IN);
            imageView3.setAlpha(0.0f);
            imageView3.setVisibility(4);
            imageView3.setScaleY(0.0f);
            imageView3.setScaleX(0.0f);
            addView(imageView3);
            ImageView imageView4 = new ImageView(context);
            this.F = imageView4;
            imageView4.setImageResource(R.drawable.star_small_inner);
            imageView4.setAlpha(0.0f);
            imageView4.setVisibility(4);
            imageView4.setScaleY(0.0f);
            imageView4.setScaleX(0.0f);
            addView(imageView4);
        }
        org.telegram.ui.wm wmVar6 = this.H;
        if (wmVar6 != null && ((i10 = wmVar6.g4) == 0 || i10 == 8 || i10 == 3)) {
            if (wmVar6.da()) {
                org.telegram.ui.wm wmVar7 = this.H;
                if (!wmVar7.w4) {
                }
            }
            if (!org.telegram.messenger.l10.z(this.H.j()) && (this.H.j() == null || this.H.j().id != 489000)) {
                r72 = 1;
                final char c2 = 1 == true ? 1 : 0;
                setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.en
                    public final /* synthetic */ jn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (c2) {
                            case 0:
                                jn jnVar = this.b;
                                if (!jnVar.d()) {
                                    jnVar.e(true, false);
                                    break;
                                }
                                break;
                            default:
                                this.b.e(false, false);
                                break;
                        }
                    }
                });
                chat = this.H.e;
                nu0VarArr2[0] = new p31(r72);
                nu0VarArr2[r72] = new ap(r72);
                nu0VarArr2[2] = new gn0(r72);
                nu0VarArr2[3] = new ke0(e6Var, false);
                nu0VarArr2[4] = new hk0(r72);
                nu0VarArr2[5] = new ap();
                i11 = 0;
                while (true) {
                    nu0VarArr = this.I;
                    if (i11 < nu0VarArr.length) {
                        break;
                    }
                    nu0VarArr[i11].c(chat != null ? r72 : false);
                    i11++;
                }
            }
            r72 = 1;
            chat = this.H.e;
            nu0VarArr2[0] = new p31(r72);
            nu0VarArr2[r72] = new ap(r72);
            nu0VarArr2[2] = new gn0(r72);
            nu0VarArr2[3] = new ke0(e6Var, false);
            nu0VarArr2[4] = new hk0(r72);
            nu0VarArr2[5] = new ap();
            i11 = 0;
            while (true) {
                nu0VarArr = this.I;
                if (i11 < nu0VarArr.length) {
                }
                nu0VarArr[i11].c(chat != null ? r72 : false);
                i11++;
            }
        }
        this.g0 = new e5(org.telegram.messenger.g0.L(24.0f), this.h);
        this.h0 = new e5(org.telegram.messenger.g0.L(17.0f), this.h);
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.wm wmVar = this.H;
        org.telegram.ui.kk kkVar = this.r;
        if (kkVar == null) {
            return;
        }
        int i3 = 0;
        nu0[] nu0VarArr = this.I;
        if (!z10) {
            this.O = null;
            kkVar.setLeftDrawable((Drawable) null);
            kkVar.g(null, null);
            while (i3 < nu0VarArr.length) {
                nu0 nu0Var = nu0VarArr[i3];
                if (nu0Var != null) {
                    nu0Var.e();
                }
                i3++;
            }
            return;
        }
        try {
            int intValue = org.telegram.messenger.hp.s1(this.K).E1(wmVar.a(), wmVar.s4).intValue();
            nu0 nu0Var2 = nu0VarArr[intValue];
            if (nu0Var2 == null) {
                return;
            }
            org.telegram.ui.ActionBar.e6 e6Var = this.e0;
            if (intValue == 5) {
                kkVar.g(nu0Var2, "**oo**");
                nu0VarArr[intValue].b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.pa, e6Var));
                kkVar.setLeftDrawable((Drawable) null);
            } else {
                kkVar.g(null, null);
                nu0VarArr[intValue].b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.pa, e6Var));
                kkVar.setLeftDrawable(nu0VarArr[intValue]);
            }
            this.O = nu0VarArr[intValue];
            while (i3 < nu0VarArr.length) {
                nu0 nu0Var3 = nu0VarArr[i3];
                if (nu0Var3 != null) {
                    if (i3 == intValue) {
                        nu0Var3.d();
                    } else {
                        nu0Var3.e();
                    }
                }
                i3++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        ImageView imageView;
        if (i3 != 0 || (imageView = this.x) == null) {
            return;
        }
        imageView.setAlpha(f10);
        float f12 = 0.85f * f10;
        imageView.setScaleX(f12);
        imageView.setScaleY(f12);
        imageView.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    public boolean a() {
        return false;
    }

    public final void b() {
        TLRPC.User user;
        int L;
        org.telegram.ui.wm wmVar = this.H;
        if (wmVar == null) {
            return;
        }
        TLRPC.User j10 = wmVar.j();
        TLRPC.Chat chat = wmVar.e;
        if (wmVar.g4 == 3) {
            long c92 = wmVar.c9();
            if (c92 >= 0) {
                user = wmVar.getMessagesController().a2(Long.valueOf(c92));
                chat = null;
            } else {
                chat = wmVar.getMessagesController().M0(Long.valueOf(-c92));
                user = null;
            }
        } else {
            user = j10;
        }
        u8 u8Var = this.J;
        fn fnVar = this.e;
        if (user == null) {
            if (!org.telegram.messenger.t3.p0(chat)) {
                if (chat != null) {
                    u8Var.p = 1.0f;
                    u8Var.q(chat);
                    if (fnVar != null) {
                        fnVar.setAnimatedEmojiDrawable(null);
                        fnVar.e(chat, u8Var);
                        if (chat.forum) {
                            L = org.telegram.messenger.g0.L(org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).P1().K(-chat.id) ? 11.0f : 16.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(21.0f);
                        }
                        fnVar.setRoundRadius(L);
                        return;
                    }
                    return;
                }
                return;
            }
            long b10 = wmVar.b();
            int i3 = this.K;
            if (!org.telegram.messenger.t3.A(i3, chat, 24) || b10 == 0) {
                fnVar.setAnimatedEmojiDrawable(null);
                rg.c.o(i3, chat, u8Var, fnVar);
            } else if (b10 > 0) {
                TLRPC.User a22 = wmVar.getMessagesController().a2(Long.valueOf(b10));
                u8Var.r(a22);
                fnVar.setAnimatedEmojiDrawable(null);
                fnVar.e(a22, u8Var);
            } else {
                TLRPC.Chat M0 = wmVar.getMessagesController().M0(Long.valueOf(-b10));
                u8Var.q(M0);
                fnVar.setAnimatedEmojiDrawable(null);
                fnVar.e(M0, u8Var);
            }
            fnVar.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
            return;
        }
        u8Var.r(user);
        if (org.telegram.messenger.l10.z(user)) {
            u8Var.p = 0.8f;
            u8Var.g(12);
            if (fnVar != null) {
                fnVar.setAnimatedEmojiDrawable(null);
                fnVar.j(null, null, u8Var, user);
                return;
            }
            return;
        }
        if (org.telegram.messenger.l10.s(user)) {
            u8Var.p = 0.8f;
            u8Var.g(21);
            if (fnVar != null) {
                fnVar.setAnimatedEmojiDrawable(null);
                fnVar.j(null, null, u8Var, user);
                return;
            }
            return;
        }
        if (org.telegram.messenger.l10.B(user) && wmVar.g4 == 3) {
            u8Var.p = 0.8f;
            u8Var.g(22);
            if (fnVar != null) {
                fnVar.setAnimatedEmojiDrawable(null);
                fnVar.j(null, null, u8Var, user);
                return;
            }
            return;
        }
        if (!org.telegram.messenger.l10.B(user)) {
            u8Var.p = 1.0f;
            if (fnVar != null) {
                fnVar.setAnimatedEmojiDrawable(null);
                fnVar.a.j0(user, u8Var, null, true, 3, false);
                return;
            }
            return;
        }
        u8Var.p = 0.8f;
        u8Var.g(1);
        if (fnVar != null) {
            fnVar.setAnimatedEmojiDrawable(null);
            fnVar.j(null, null, u8Var, user);
        }
    }

    public final e5 c(long j10) {
        if (j10 == 0) {
            return null;
        }
        e5 e5Var = this.h0;
        e5Var.j(j10, false);
        e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ni, this.e0)));
        int L = org.telegram.messenger.g0.L(1.0f);
        e5Var.J = 0;
        e5Var.K = L;
        return e5Var;
    }

    public boolean d() {
        return false;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.T1) {
            int connectionState = ConnectionsManager.getInstance(this.K).getConnectionState();
            if (this.W != connectionState) {
                this.W = connectionState;
                l();
                return;
            }
            return;
        }
        if (i3 != org.telegram.messenger.hs.i4) {
            if (i3 == org.telegram.messenger.hs.g3) {
                n(true);
            }
        } else {
            org.telegram.ui.kk kkVar = this.h;
            if (kkVar != null) {
                kkVar.invalidate();
            }
            if (getSubtitleTextView() != null) {
                getSubtitleTextView().invalidate();
            }
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a10 = this.i0.a(0.02f);
        canvas.scale(a10, a10, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.l0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.e) {
            boolean z10 = false;
            ImageView imageView = this.x;
            boolean z11 = imageView != null && imageView.getVisibility() == 0;
            ImageView imageView2 = this.y;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                z10 = true;
            }
            if (z11 || z10) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-org.telegram.messenger.g0.L(3.0f), -org.telegram.messenger.g0.L(3.0f));
                canvas.saveLayer(rectF, null);
                boolean drawChild = super.drawChild(canvas, view, j10);
                if (z11) {
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - org.telegram.messenger.g0.N(0.33f), imageView.getScaleX() * org.telegram.messenger.g0.N(12.0f), org.telegram.ui.ActionBar.k6.Cm);
                }
                if (z10) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * org.telegram.messenger.g0.N(7.66f), org.telegram.ui.ActionBar.k6.Cm);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r2.getImageReceiver().L() != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.wm wmVar;
        TLRPC.Chat chat;
        ImageReceiver imageReceiver;
        String str;
        org.telegram.messenger.zb D;
        boolean z13;
        jg jgVar;
        Drawable t10;
        TLRPC.User a22;
        fn fnVar = this.e;
        if (z10) {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x <= point.y) {
                }
            }
            z12 = false;
            wmVar = this.H;
            TLRPC.User j10 = wmVar.j();
            chat = wmVar.e;
            boolean z14 = chat == null && chat.monoforum;
            if (chat != null && chat.monoforum) {
                chat = wmVar.getMessagesController().M0(Long.valueOf(chat.linked_monoforum_id));
                if (chat != null) {
                    return;
                }
                if (wmVar.h9() != 0 && (a22 = wmVar.getMessagesController().a2(Long.valueOf(wmVar.h9()))) != null) {
                    chat = null;
                    j10 = a22;
                }
            }
            imageReceiver = fnVar.getImageReceiver();
            str = imageReceiver.R;
            D = org.telegram.messenger.zb.D();
            if (str != null && !D.J(str, false)) {
                t10 = imageReceiver.t();
                if ((t10 instanceof BitmapDrawable) && !(t10 instanceof t5)) {
                    D.O((BitmapDrawable) t10, str, false);
                }
            }
            if (!wmVar.v4) {
                if (chat == null) {
                    return;
                }
                wmVar.presentFragment(ProfileActivity.A4(-chat.id), z11);
                return;
            }
            os0 os0Var = this.d0;
            if (j10 == null) {
                boolean z15 = z12;
                if (chat != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    if (wmVar.g4 == 3) {
                        bundle.putLong("topic_id", wmVar.c9());
                    } else if (wmVar.w4) {
                        bundle.putLong("topic_id", wmVar.m4.f1());
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, os0Var);
                    if (!z14) {
                        profileActivity.a5(wmVar.q8);
                    }
                    profileActivity.g5(z15 ? 2 : 1);
                    wmVar.presentFragment(profileActivity, z11);
                    return;
                }
                return;
            }
            if (j10.id == 489000) {
                return;
            }
            Bundle bundle2 = new Bundle();
            if (org.telegram.messenger.l10.B(j10)) {
                org.telegram.ui.ActionBar.d2 d2Var = os0Var.x;
                int[] iArr = os0Var.c;
                int i3 = 0;
                while (true) {
                    if (i3 < iArr.length) {
                        if (iArr[i3] > 0) {
                            break;
                        } else {
                            i3++;
                        }
                    } else if (!os0Var.f && (d2Var == null || os0Var.r != d2Var.getUserConfig().e() || os0Var.s != 0 || !d2Var.getMessagesController().G1().e())) {
                        return;
                    }
                }
                bundle2.putLong("dialog_id", wmVar.a());
                if (wmVar.g4 == 3) {
                    bundle2.putLong("topic_id", wmVar.c9());
                }
                r80 r80Var = new r80(bundle2, os0Var);
                r80Var.c = wmVar.q8;
                wmVar.presentFragment(r80Var, z11);
                return;
            }
            if (wmVar.g4 == 3) {
                z13 = z12;
                long c92 = wmVar.c9();
                bundle2.putBoolean("saved", true);
                if (c92 >= 0) {
                    bundle2.putLong("user_id", c92);
                } else {
                    bundle2.putLong("chat_id", -c92);
                }
            } else {
                z13 = z12;
                bundle2.putLong("user_id", j10.id);
                if (this.x != null && !z14) {
                    bundle2.putLong("dialog_id", wmVar.a());
                }
            }
            if (org.telegram.messenger.l10.u(j10)) {
                bundle2.putLong("topic_id", wmVar.b());
            }
            org.telegram.ui.ActionBar.k0 k0Var = wmVar.Z1;
            bundle2.putBoolean("reportSpam", (k0Var == null || (jgVar = wmVar.b1) == null || !jgVar.d(k0Var) || wmVar.c2.getVisibility() == 8) ? false : true);
            bundle2.putInt("actionBarColor", org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, this.e0));
            ProfileActivity profileActivity2 = new ProfileActivity(bundle2, os0Var);
            if (!z14) {
                profileActivity2.h5(wmVar.r8, wmVar.s8, wmVar.t8);
            }
            profileActivity2.g5(z13 ? 2 : 1);
            wmVar.presentFragment(profileActivity2, z11);
            return;
        }
        z12 = z10;
        wmVar = this.H;
        TLRPC.User j102 = wmVar.j();
        chat = wmVar.e;
        if (chat == null) {
        }
        if (chat != null) {
            chat = wmVar.getMessagesController().M0(Long.valueOf(chat.linked_monoforum_id));
            if (chat != null) {
            }
        }
        imageReceiver = fnVar.getImageReceiver();
        str = imageReceiver.R;
        D = org.telegram.messenger.zb.D();
        if (str != null) {
            t10 = imageReceiver.t();
            if (t10 instanceof BitmapDrawable) {
                D.O((BitmapDrawable) t10, str, false);
            }
        }
        if (!wmVar.v4) {
        }
    }

    public final void g(int i3, boolean z10) {
        zz0 zz0Var = this.G;
        if (zz0Var == null) {
            return;
        }
        boolean z11 = this.n0;
        if (i3 != 0 || this.U) {
            qe.a aVar = this.a;
            if (z11) {
                aVar.a(false, z10);
            } else {
                aVar.a(true, z10);
                zz0Var.b(i3);
            }
        }
    }

    public k9 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.b0;
    }

    public int getLeftPadding() {
        return this.M;
    }

    public os0 getSharedMediaPreloader() {
        return this.d0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.kk kkVar = this.r;
        return kkVar != null ? kkVar.getTextPaint() : this.s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.kk kkVar = this.r;
        if (kkVar != null) {
            return kkVar;
        }
        h6 h6Var = this.s;
        if (h6Var != null) {
            return h6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.x;
    }

    public org.telegram.ui.ActionBar.k5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        org.telegram.ui.kk kkVar = this.h;
        float max = kkVar != null ? Math.max(0.0f, kkVar.getExactWidthIncludeDrawables()) : 0.0f;
        org.telegram.ui.kk kkVar2 = this.r;
        if (kkVar2 != null) {
            max = Math.max(max, kkVar2.getExactWidthIncludeDrawables());
        }
        fn fnVar = this.e;
        return (int) (max + ((fnVar == null || fnVar.getVisibility() != 0) ? org.telegram.messenger.g0.L(34.0f) : org.telegram.messenger.g0.L(70.0f)));
    }

    public final void h(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.EmojiStatus emojiStatus, boolean z14) {
        if (charSequence != null) {
            charSequence = org.telegram.messenger.i6.m(charSequence, this.h.getPaint().getFontMetricsInt(), false, null, 0);
        }
        this.h.k(charSequence);
        this.p0 = false;
        if (z10 || z11) {
            this.p0 = true;
            if (!(this.h.getRightDrawable() instanceof kk0)) {
                kk0 kk0Var = new kk0(!z10 ? 1 : 0);
                kk0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, this.e0));
                this.h.j(kk0Var);
                this.r0 = org.telegram.messenger.bd.M0(2131745872, null);
                this.o0 = true;
            }
        } else if (z12) {
            Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
            this.t0 = mutate;
            int i3 = org.telegram.ui.ActionBar.k6.ni;
            org.telegram.ui.ActionBar.e6 e6Var = this.e0;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.y(this, mutate, i3, e6Var, mode);
            Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
            this.u0 = mutate2;
            org.telegram.ui.ActionBar.r6.y(this, mutate2, org.telegram.ui.ActionBar.k6.oi, this.e0, mode);
            this.h.j(new xp(this.t0, this.u0));
            this.o0 = true;
            this.r0 = org.telegram.messenger.bd.M0(2131754739, null);
        } else if (this.h.getRightDrawable() instanceof kk0) {
            this.h.j(null);
            this.o0 = false;
            this.r0 = null;
        }
        if (z13 || org.telegram.messenger.m5.f(emojiStatus) != 0) {
            if ((this.h.getRightDrawable() instanceof f5) && (((f5) this.h.getRightDrawable()).a instanceof g5)) {
                ((g5) ((f5) this.h.getRightDrawable()).a).n(this.h);
            }
            if (org.telegram.messenger.m5.f(emojiStatus) != 0) {
                this.g0.j(org.telegram.messenger.m5.f(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = org.telegram.messenger.t0.b.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.s0 = mutate3;
                org.telegram.ui.ActionBar.r6.y(this, mutate3, org.telegram.ui.ActionBar.k6.ni, this.e0, PorterDuff.Mode.MULTIPLY);
                this.g0.g(this.s0, z14);
            } else {
                this.g0.g(null, z14);
            }
            this.g0.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ni, this.e0)));
            this.h.i(this.g0);
            this.o0 = false;
            this.q0 = org.telegram.messenger.bd.M0(2131754802, null);
        } else {
            this.h.i(null);
            this.q0 = null;
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.h(z14);
        }
    }

    public final void i(int i3, int i10) {
        org.telegram.ui.kk kkVar = this.h;
        org.telegram.ui.ActionBar.r6.r(kkVar);
        org.telegram.ui.kk kkVar2 = this.r;
        org.telegram.ui.ActionBar.r6.r(kkVar2);
        kkVar.setTextColor(i3);
        kkVar2.setTextColor(i10);
        kkVar2.setTag(Integer.valueOf(i10));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.kk kkVar = this.h;
        kkVar.setLeftDrawable(drawable);
        if (!this.o0 && !this.p0) {
            if (drawable2 != null) {
                this.r0 = org.telegram.messenger.bd.M0(2131747909, null);
            } else {
                this.r0 = null;
            }
            kkVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.h(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        u8 u8Var = this.J;
        u8Var.r(user);
        boolean z11 = org.telegram.messenger.l10.z(user);
        fn fnVar = this.e;
        if (z11) {
            u8Var.g(12);
            u8Var.p = 0.8f;
            if (fnVar != null) {
                fnVar.j(null, null, u8Var, user);
                return;
            }
            return;
        }
        if (org.telegram.messenger.l10.s(user)) {
            u8Var.g(21);
            u8Var.p = 0.8f;
            if (fnVar != null) {
                fnVar.j(null, null, u8Var, user);
                return;
            }
            return;
        }
        if (!org.telegram.messenger.l10.B(user) || z10) {
            u8Var.p = 1.0f;
            if (fnVar != null) {
                fnVar.e(user, u8Var);
                return;
            }
            return;
        }
        u8Var.g(1);
        u8Var.p = 0.8f;
        if (fnVar != null) {
            fnVar.j(null, null, u8Var, user);
        }
    }

    public final void l() {
        int i3 = this.W;
        String M0 = i3 == 2 ? org.telegram.messenger.bd.M0(2131743222, null) : i3 == 1 ? org.telegram.messenger.bd.M0(2131751809, null) : i3 == 5 ? org.telegram.messenger.bd.M0(2131743820, null) : i3 == 4 ? org.telegram.messenger.bd.M0(2131751807, null) : null;
        org.telegram.ui.ActionBar.e6 e6Var = this.e0;
        h6 h6Var = this.s;
        org.telegram.ui.kk kkVar = this.r;
        if (M0 == null) {
            CharSequence charSequence = this.a0;
            if (charSequence != null) {
                if (kkVar != null) {
                    kkVar.k(charSequence);
                    this.a0 = null;
                    Integer num = this.c0;
                    if (num != null) {
                        kkVar.setTextColor(num.intValue());
                    } else {
                        int i10 = this.b0;
                        if (i10 >= 0) {
                            org.telegram.ui.ActionBar.r6.Y(kkVar, i10, e6Var);
                            kkVar.setTag(Integer.valueOf(this.b0));
                        }
                    }
                } else if (h6Var != null) {
                    h6Var.c(charSequence, !org.telegram.messenger.bd.a0, true);
                    this.a0 = null;
                    Integer num2 = this.c0;
                    if (num2 != null) {
                        h6Var.setTextColor(num2.intValue());
                    } else {
                        int i11 = this.b0;
                        if (i11 >= 0) {
                            org.telegram.ui.ActionBar.r6.Z(h6Var, i11, e6Var);
                            h6Var.setTag(Integer.valueOf(this.b0));
                        }
                    }
                }
            }
        } else if (kkVar != null) {
            if (this.a0 == null) {
                this.a0 = kkVar.getText();
            }
            kkVar.k(M0);
            Integer num3 = this.c0;
            if (num3 != null) {
                kkVar.setTextColor(num3.intValue());
            } else {
                int i12 = org.telegram.ui.ActionBar.k6.B8;
                org.telegram.ui.ActionBar.r6.Y(kkVar, i12, e6Var);
                kkVar.setTag(Integer.valueOf(i12));
            }
        } else if (h6Var != null) {
            if (this.a0 == null) {
                this.a0 = h6Var.getText();
            }
            h6Var.c(M0, !org.telegram.messenger.bd.a0, true);
            Integer num4 = this.c0;
            if (num4 != null) {
                h6Var.setTextColor(num4.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.k6.B8;
                org.telegram.ui.ActionBar.r6.Z(h6Var, i13, e6Var);
                h6Var.setTag(Integer.valueOf(i13));
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.h(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.wm wmVar = this.H;
        if (wmVar == null) {
            return;
        }
        this.V = 0;
        TLRPC.ChatFull chatFull = wmVar.q8;
        if (chatFull == null) {
            return;
        }
        int i3 = this.K;
        int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z10 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (!z10 || chatFull.participants_count <= 200) {
                return;
            }
            this.V = chatFull.online_count;
            return;
        }
        for (int i10 = 0; i10 < chatFull.participants.participants.size(); i10++) {
            TLRPC.User a22 = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(chatFull.participants.participants.get(i10).user_id));
            if (a22 != null && (userStatus = a22.status) != null && ((userStatus.expires > currentTime || a22.id == org.telegram.messenger.h10.i(i3).e()) && a22.status.expires > 10000)) {
                this.V++;
            }
        }
    }

    public final void n(boolean z10) {
        int i3;
        boolean z11;
        boolean z12;
        int i10;
        String G;
        TLRPC.ChatParticipants chatParticipants;
        int i11;
        String S;
        int i12;
        int i13;
        int i14;
        ArrayList l10;
        int i15;
        org.telegram.ui.ActionBar.e6 e6Var = this.e0;
        boolean[] zArr = this.S;
        h6 h6Var = this.s;
        org.telegram.ui.kk kkVar = this.r;
        org.telegram.ui.kk kkVar2 = this.h;
        int i16 = this.K;
        org.telegram.ui.wm wmVar = this.H;
        if (wmVar == null) {
            return;
        }
        if (wmVar.g4 == 6) {
            String str = wmVar.e4.link;
            lg.z[] zVarArr = lg.z.e;
            if (str.startsWith("https://")) {
                str = str.substring(8);
            }
            setSubtitle(str);
            return;
        }
        TLRPC.User j10 = wmVar.j();
        TLRPC.Chat chat = wmVar.e;
        boolean z13 = org.telegram.messenger.l10.B(j10) && wmVar.g4 == 0 && wmVar.getMessagesController().G1().c() >= 3 && (this.v0 || org.telegram.messenger.hp.e1().getInt("savedmsgschatshint", 0) < 3);
        if (((org.telegram.messenger.l10.B(j10) && !z13) || org.telegram.messenger.l10.z(j10) || ((j10 != null && j10.id == 489000) || ((i3 = wmVar.g4) != 0 && i3 != 8))) && wmVar.g4 != 3) {
            if (getSubtitleTextView().getVisibility() != 8) {
                getSubtitleTextView().setVisibility(8);
                return;
            }
            return;
        }
        if (z13) {
            if (getSubtitleTextView().getVisibility() != 0) {
                i15 = 0;
                getSubtitleTextView().setVisibility(0);
            } else {
                i15 = 0;
            }
            if (!this.v0) {
                org.telegram.messenger.hp.e1().edit().putInt("savedmsgschatshint", org.telegram.messenger.hp.e1().getInt("savedmsgschatshint", i15) + 1).apply();
                this.v0 = true;
            }
        }
        CharSequence D1 = org.telegram.messenger.hp.s1(i16).D1(wmVar.a(), wmVar.s4, false);
        CharSequence charSequence = "";
        if (D1 != null) {
            D1 = TextUtils.replace(D1, new String[]{"..."}, new String[]{""});
        }
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        boolean z14 = z13;
        if (D1 != null && D1.length() != 0 && (!org.telegram.messenger.t3.T(chat) || chat.megagroup)) {
            if (wmVar.da() && kkVar2.getTag() != null) {
                kkVar2.setTag(null);
                getSubtitleTextView().setVisibility(0);
                AnimatorSet animatorSet = this.R;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.R = null;
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.R = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(kkVar2, (Property<org.telegram.ui.kk, Float>) property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 1.0f));
                    this.R.addListener(new in(this, 1));
                    this.R.setDuration(180L);
                    this.R.start();
                } else {
                    kkVar2.setTranslationY(0.0f);
                    getSubtitleTextView().setAlpha(1.0f);
                }
            }
            Integer E1 = org.telegram.messenger.hp.s1(i16).E1(wmVar.a(), wmVar.s4);
            charSequence = (E1 == null || E1.intValue() != 5) ? D1 : org.telegram.messenger.i6.m(D1, getSubtitlePaint().getFontMetricsInt(), false, null, 0);
            setTypingAnimation(true);
            z12 = true;
        } else {
            if (wmVar.da() && !wmVar.w4) {
                if (kkVar2.getTag() != null) {
                    return;
                }
                kkVar2.setTag(1);
                AnimatorSet animatorSet3 = this.R;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.R = null;
                }
                if (!z10) {
                    kkVar2.setTranslationY(org.telegram.messenger.g0.L(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                } else {
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.R = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(kkVar2, (Property<org.telegram.ui.kk, Float>) property2, org.telegram.messenger.g0.L(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 0.0f));
                    this.R.addListener(new in(this, 0));
                    this.R.setDuration(180L);
                    this.R.start();
                    return;
                }
            }
            setTypingAnimation(false);
            int i17 = wmVar.g4;
            if (i17 != 8) {
                if (i17 == 3) {
                    org.telegram.messenger.nv G1 = wmVar.getMessagesController().G1();
                    long c92 = wmVar.c9();
                    ArrayList arrayList = G1.j;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= arrayList.size()) {
                            i14 = 0;
                            break;
                        }
                        org.telegram.messenger.mv mvVar = (org.telegram.messenger.mv) arrayList.get(i18);
                        if (mvVar.a == c92) {
                            i14 = mvVar.e;
                            break;
                        }
                        i18++;
                    }
                    charSequence = org.telegram.messenger.bd.G(Math.max(1, i14), "SavedMessagesCount", new Object[0]);
                } else {
                    if (wmVar.w4 && chat != null) {
                        TLRPC.TL_forumTopic f10 = org.telegram.messenger.hp.s1(i16).q7.f(chat.id, wmVar.b());
                        if (f10 != null) {
                            i12 = 1;
                            i13 = f10.totalMessagesCount - 1;
                        } else {
                            i12 = 1;
                            i13 = 0;
                        }
                        if (i13 > 0) {
                            Object[] objArr = new Object[i12];
                            objArr[0] = Integer.valueOf(i13);
                            G = org.telegram.messenger.bd.G(i13, "messages", objArr);
                        } else {
                            Object[] objArr2 = new Object[i12];
                            objArr2[0] = chat.title;
                            G = org.telegram.messenger.bd.a0(null, null, 2131744020, objArr2);
                        }
                    } else if (chat != null) {
                        TLRPC.ChatFull chatFull = wmVar.q8;
                        int i19 = this.V;
                        if (org.telegram.messenger.t3.T(chat)) {
                            if (chatFull == null || (i11 = chatFull.participants_count) == 0) {
                                G = chat.megagroup ? chatFull == null ? org.telegram.messenger.bd.M0(2131748787, null).toLowerCase() : chat.has_geo ? org.telegram.messenger.bd.M0(2131748650, null).toLowerCase() : org.telegram.messenger.t3.t0(chat) ? org.telegram.messenger.bd.M0(2131748646, null).toLowerCase() : org.telegram.messenger.bd.M0(2131748649, null).toLowerCase() : org.telegram.messenger.t3.t0(chat) ? org.telegram.messenger.bd.M0(2131752318, null).toLowerCase() : org.telegram.messenger.bd.M0(2131752329, null).toLowerCase();
                            } else if (chat.megagroup) {
                                G = i19 > 1 ? a1.g.C(org.telegram.messenger.bd.G(i11, "Members", new Object[0]), ", ", org.telegram.messenger.bd.G(Math.min(i19, chatFull.participants_count), "OnlineCount", new Object[0])) : org.telegram.messenger.bd.G(i11, "Members", new Object[0]);
                            } else {
                                int[] iArr = new int[1];
                                boolean C1 = org.telegram.messenger.g0.C1();
                                int i20 = chatFull.participants_count;
                                if (C1) {
                                    iArr[0] = i20;
                                    S = String.valueOf(i20);
                                } else {
                                    S = org.telegram.messenger.bd.S(iArr, i20);
                                }
                                G = chat.megagroup ? org.telegram.messenger.bd.G(iArr[0], "Members", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S) : org.telegram.messenger.bd.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                            }
                        } else if (org.telegram.messenger.t3.k0(chat)) {
                            G = org.telegram.messenger.bd.M0(2131742839, null);
                        } else if (org.telegram.messenger.t3.l0(chat)) {
                            G = org.telegram.messenger.bd.M0(2131742845, null);
                        } else {
                            int i21 = chat.participants_count;
                            if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                i21 = chatParticipants.participants.size();
                            }
                            G = (i19 <= 1 || i21 == 0) ? org.telegram.messenger.bd.G(i21, "Members", new Object[0]) : a1.g.C(org.telegram.messenger.bd.G(i21, "Members", new Object[0]), ", ", org.telegram.messenger.bd.G(i19, "OnlineCount", new Object[0]));
                        }
                    } else {
                        if (j10 != null) {
                            TLRPC.User a22 = org.telegram.messenger.hp.s1(i16).a2(Long.valueOf(j10.id));
                            if (a22 != null) {
                                j10 = a22;
                            }
                            if (!org.telegram.messenger.l10.z(j10)) {
                                long j11 = j10.id;
                                if (j11 != 489000) {
                                    if (j11 == org.telegram.messenger.h10.i(i16).e()) {
                                        charSequence = z14 ? org.telegram.messenger.g0.H2(org.telegram.messenger.bd.M0(2131745902, null), false) : org.telegram.messenger.bd.M0(2131752189, null);
                                    } else {
                                        long j12 = j10.id;
                                        if (j12 == 333000 || j12 == 777000 || j12 == 42777) {
                                            z11 = false;
                                            charSequence = org.telegram.messenger.bd.M0(2131745571, null);
                                        } else if (org.telegram.messenger.hp.F2(j10)) {
                                            charSequence = org.telegram.messenger.bd.M0(2131744335, null);
                                        } else {
                                            boolean z15 = j10.bot;
                                            if (z15 && (i10 = j10.bot_active_users) != 0) {
                                                charSequence = org.telegram.messenger.bd.H(',', "BotUsers", i10);
                                            } else if (z15) {
                                                charSequence = org.telegram.messenger.l10.d(j10);
                                            } else {
                                                zArr[0] = false;
                                                charSequence = org.telegram.messenger.bd.d0(i16, j10, zArr, this.f0 ? this.T : null);
                                                z12 = zArr[0];
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            z11 = false;
                        }
                        z12 = z11;
                    }
                    charSequence = G;
                }
                z12 = false;
            } else if (wmVar.i4) {
                charSequence = org.telegram.messenger.bd.M0(2131752219, null);
                z12 = false;
            } else {
                if (wmVar.b() == 0) {
                    org.telegram.messenger.c00 c00Var = wmVar.getMessagesController().q7;
                    long j13 = -wmVar.a();
                    int size = (!c00Var.e(j13) || (l10 = c00Var.l(j13)) == null) ? 0 : l10.size();
                    G = size > 0 ? org.telegram.messenger.bd.H(',', "Chats", size) : org.telegram.messenger.bd.M0(2131752219, null);
                } else {
                    TLRPC.TL_forumTopic f11 = org.telegram.messenger.hp.s1(i16).q7.f(chat.id, wmVar.b());
                    int i22 = f11 != null ? f11.totalMessagesCount : 0;
                    G = i22 > 0 ? org.telegram.messenger.bd.G(i22, "messages", Integer.valueOf(i22)) : org.telegram.messenger.bd.a0(null, null, 2131744020, rg.c.i(i16, chat, false));
                }
                charSequence = G;
                z12 = false;
            }
        }
        this.b0 = z12 ? org.telegram.ui.ActionBar.k6.pa : org.telegram.ui.ActionBar.k6.B8;
        if (this.a0 != null) {
            this.a0 = charSequence;
        } else if (kkVar != null) {
            kkVar.k(charSequence);
            Integer num = this.c0;
            if (num == null) {
                org.telegram.ui.ActionBar.r6.Y(kkVar, this.b0, e6Var);
                kkVar.setTag(Integer.valueOf(this.b0));
            } else {
                kkVar.setTextColor(num.intValue());
            }
        } else {
            h6Var.c(charSequence, z10, true);
            Integer num2 = this.c0;
            if (num2 == null) {
                org.telegram.ui.ActionBar.r6.Z(h6Var, this.b0, e6Var);
                h6Var.setTag(Integer.valueOf(this.b0));
            } else {
                h6Var.setTextColor(num2.intValue());
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.h(z10);
        }
    }

    public boolean o() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.wm wmVar = this.H;
        if (wmVar != null) {
            int i3 = this.K;
            org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.T1);
            org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
            if (wmVar.g4 == 3) {
                org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.g3);
            }
            this.W = ConnectionsManager.getInstance(i3).getConnectionState();
            l();
        }
        e5 e5Var = this.g0;
        if (e5Var != null) {
            e5Var.a();
        }
        e5 e5Var2 = this.h0;
        if (e5Var2 != null) {
            e5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.wm wmVar = this.H;
        if (wmVar != null) {
            int i3 = this.K;
            org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.T1);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
            if (wmVar.g4 == 3) {
                org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.g3);
            }
        }
        e5 e5Var = this.g0;
        if (e5Var != null) {
            e5Var.b();
        }
        e5 e5Var2 = this.h0;
        if (e5Var2 != null) {
            e5Var2.b();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h.getText());
        if (this.q0 != null) {
            sb2.append(", ");
            sb2.append(this.q0);
        }
        if (this.r0 != null) {
            sb2.append(", ");
            sb2.append(this.r0);
        }
        sb2.append("\n");
        org.telegram.ui.kk kkVar = this.r;
        if (kkVar != null) {
            sb2.append(kkVar.getText());
        } else {
            h6 h6Var = this.s;
            if (h6Var != null) {
                sb2.append(h6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.bd.M0(2131747794, null)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        fn fnVar = this.e;
        int measuredHeight = (((currentActionBarHeight - fnVar.getMeasuredHeight()) - 2) / 2) + (this.L ? org.telegram.messenger.g0.m : 0);
        int L = org.telegram.messenger.g0.L(this.m0 ? 23.66f : 24.0f) + measuredHeight;
        int i13 = this.M + 1;
        int i14 = measuredHeight + 1;
        fnVar.layout(i13, i14, fnVar.getMeasuredWidth() + i13, fnVar.getMeasuredHeight() + i14);
        int L2 = this.M + org.telegram.messenger.g0.L(fnVar.getVisibility() == 0 ? this.m0 ? 49.66f : 55.0f : this.m0 ? 13.0f : 1.0f) + this.N;
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) this.n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.kk kkVar = this.h;
        if (visibility != 8) {
            kkVar.layout(L2, (org.telegram.messenger.g0.L(1.66f) + measuredHeight) - kkVar.getPaddingTop(), kkVar.getMeasuredWidth() + L2, kkVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.66f) + (kkVar.getTextHeight() + measuredHeight)) - kkVar.getPaddingTop()));
            if (k5Var != null) {
                k5Var.layout(L2, org.telegram.messenger.g0.L(1.66f) + measuredHeight, k5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(1.66f) + k5Var.getTextHeight() + measuredHeight);
            }
        } else {
            kkVar.layout(L2, (org.telegram.messenger.g0.L(11.0f) + measuredHeight) - kkVar.getPaddingTop(), kkVar.getMeasuredWidth() + L2, kkVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (kkVar.getTextHeight() + measuredHeight)) - kkVar.getPaddingTop()));
            if (k5Var != null) {
                k5Var.layout(L2, org.telegram.messenger.g0.L(10.0f) + measuredHeight, k5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(10.0f) + k5Var.getTextHeight() + measuredHeight);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.layout(org.telegram.messenger.g0.L(29.0f) + this.M, org.telegram.messenger.g0.L(27.33f) + measuredHeight, imageView.getMeasuredWidth() + org.telegram.messenger.g0.L(29.0f) + this.M, imageView.getMeasuredHeight() + org.telegram.messenger.g0.L(27.33f) + measuredHeight);
        }
        ImageView imageView2 = this.x;
        if (imageView2 != null) {
            imageView2.layout(org.telegram.messenger.g0.L(19.333f) + this.M, measuredHeight - org.telegram.messenger.g0.L(8.0f), imageView2.getMeasuredWidth() + org.telegram.messenger.g0.L(19.333f) + this.M, imageView2.getMeasuredHeight() + (measuredHeight - org.telegram.messenger.g0.L(8.0f)));
        }
        ImageView imageView3 = this.E;
        if (imageView3 != null) {
            imageView3.layout(org.telegram.messenger.g0.L(28.0f) + this.M, org.telegram.messenger.g0.L(24.0f) + measuredHeight, imageView3.getMeasuredWidth() + org.telegram.messenger.g0.L(28.0f) + this.M, imageView3.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f) + measuredHeight);
        }
        ImageView imageView4 = this.F;
        if (imageView4 != null) {
            imageView4.layout(org.telegram.messenger.g0.L(28.0f) + this.M, org.telegram.messenger.g0.L(24.0f) + measuredHeight, imageView4.getMeasuredWidth() + org.telegram.messenger.g0.L(28.0f) + this.M, imageView4.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f) + measuredHeight);
        }
        org.telegram.ui.kk kkVar2 = this.r;
        if (kkVar2 != null) {
            kkVar2.layout(L2, L, kkVar2.getMeasuredWidth() + L2, kkVar2.getTextHeight() + L);
        } else {
            h6 h6Var = this.s;
            if (h6Var != null) {
                h6Var.layout(L2, L, h6Var.getMeasuredWidth() + L2, h6Var.getTextHeight() + L);
            }
        }
        org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) this.w.get();
        if (k5Var2 != null) {
            k5Var2.layout(L2, L, k5Var2.getMeasuredWidth() + L2, k5Var2.getTextHeight() + L);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        fn fnVar = this.e;
        int L = size - org.telegram.messenger.g0.L((fnVar.getVisibility() == 0 ? 54 : 0) + 16);
        float f10 = this.d;
        fnVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) - 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) - 2, TLObject.FLAG_30));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_31);
        org.telegram.ui.kk kkVar = this.h;
        kkVar.measure(makeMeasureSpec, makeMeasureSpec2);
        h6 h6Var = this.s;
        org.telegram.ui.kk kkVar2 = this.r;
        if (kkVar2 != null) {
            kkVar2.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
        } else if (h6Var != null) {
            h6Var.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(14.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(14.0f), TLObject.FLAG_30));
        }
        ImageView imageView2 = this.x;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(34.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(34.0f), TLObject.FLAG_30));
        }
        ImageView imageView3 = this.E;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        }
        ImageView imageView4 = this.F;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i10));
        int i11 = this.P;
        AtomicReference atomicReference = this.n;
        if (i11 != -1 && i11 != size && i11 > size) {
            this.Q = i11;
            View view = (org.telegram.ui.ActionBar.k5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
            atomicReference.set(k5Var);
            int i12 = org.telegram.ui.ActionBar.k6.A8;
            org.telegram.ui.ActionBar.e6 e6Var = this.e0;
            org.telegram.ui.ActionBar.r6.Y(k5Var, i12, e6Var);
            k5Var.setTextSizePx(org.telegram.messenger.g0.L(this.m0 ? 17.5f : 18.0f));
            k5Var.setGravity(3);
            k5Var.setTypeface(org.telegram.messenger.g0.o());
            k5Var.setLeftDrawableTopPadding(-org.telegram.messenger.g0.L(1.3f));
            k5Var.i(kkVar.getRightDrawable());
            k5Var.j(kkVar.getRightDrawable2());
            k5Var.setRightDrawableOutside(kkVar.getRightDrawableOutside());
            k5Var.setLeftDrawable(kkVar.getLeftDrawable());
            k5Var.l(kkVar.getText(), false);
            ViewPropertyAnimator duration = k5Var.animate().alpha(0.0f).setDuration(350L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).withEndAction(new cn(this, 0)).start();
            addView(k5Var);
            AtomicReference atomicReference2 = this.w;
            View view2 = (org.telegram.ui.ActionBar.k5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(getContext());
            atomicReference2.set(k5Var2);
            int i13 = org.telegram.ui.ActionBar.k6.B8;
            org.telegram.ui.ActionBar.r6.Y(k5Var2, i13, e6Var);
            k5Var2.setTag(Integer.valueOf(i13));
            k5Var2.setTextSizePx(org.telegram.messenger.g0.L(this.m0 ? 13.5f : 14.0f));
            k5Var2.setGravity(3);
            if (kkVar2 != null) {
                k5Var2.l(kkVar2.getText(), false);
            } else if (h6Var != null) {
                k5Var2.l(h6Var.getText(), false);
            }
            k5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(xqVar).withEndAction(new cn(this, 1)).start();
            addView(k5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.k5 k5Var3 = (org.telegram.ui.ActionBar.k5) atomicReference.get();
        if (k5Var3 != null) {
            k5Var3.measure(org.telegram.messenger.camera.q.c((fnVar.getVisibility() == 0 ? 54 : 0) + 16, this.Q, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_31));
        }
        this.P = size;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        gc gcVar = this.i0;
        cn cnVar = this.j0;
        if (action == 0 && a()) {
            this.k0 = true;
            gcVar.c(true);
            org.telegram.messenger.g0.r(cnVar);
            org.telegram.messenger.g0.i3(cnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.k0) {
            gcVar.c(false);
            this.k0 = false;
            if (isClickable()) {
                e(false, false);
            }
            org.telegram.messenger.g0.r(cnVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final PorterDuffColorFilter p() {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ni, this.e0);
        if (this.w0 == null || w02 != this.y0) {
            this.y0 = w02;
            this.w0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        return this.w0;
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.A0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        u8 u8Var = this.J;
        u8Var.q(chat);
        fn fnVar = this.e;
        if (fnVar != null) {
            fnVar.e(chat, u8Var);
            fnVar.setRoundRadius(org.telegram.messenger.g0.L(org.telegram.messenger.t3.c0(chat) ? (chat == null || !org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).P1().K(-chat.id)) ? 16.0f : 11.0f : 21.0f));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setVisibility((!z10 || this.f) ? 8 : 0);
        }
    }

    public void setLeftPadding(int i3) {
        this.M = i3;
    }

    public void setOccupyStatusBar(boolean z10) {
        this.L = z10;
    }

    public void setOverrideSubtitleColor(Integer num) {
        this.c0 = num;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.i0.c(z10);
    }

    public void setRightAvatarPadding(int i3) {
        this.N = i3;
    }

    public void setStoriesForceState(Integer num) {
        this.c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.a0 == null) {
            org.telegram.ui.kk kkVar = this.r;
            if (kkVar != null) {
                kkVar.k(charSequence);
            } else {
                h6 h6Var = this.s;
                if (h6Var != null) {
                    h6Var.setText(charSequence);
                }
            }
        } else {
            this.a0 = charSequence;
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.h(true);
        }
    }

    public void setTitle(CharSequence charSequence) {
        h(charSequence, false, false, false, false, null, false);
    }

    public void setUserAvatar(TLRPC.User user) {
        k(user, false);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        nu0 nu0Var = this.O;
        org.telegram.ui.ActionBar.e6 e6Var = this.e0;
        if (nu0Var != null) {
            nu0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.pa, e6Var));
        }
        Drawable drawable = this.s0;
        if (drawable != null) {
            drawable.setColorFilter(p());
        }
        e5 e5Var = this.h0;
        if (e5Var != null) {
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ni, e6Var)));
        }
        e5 e5Var2 = this.g0;
        if (e5Var2 != null) {
            e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ni, e6Var)));
        }
        Drawable drawable2 = this.t0;
        if (drawable2 != null) {
            drawable2.setColorFilter(p());
        }
        if (this.u0 != null) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.oi, e6Var);
            if (this.x0 == null || w02 != this.z0) {
                this.z0 = w02;
                this.x0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
            }
            this.u0.setColorFilter(this.x0);
        }
        org.telegram.ui.kk kkVar = this.h;
        if (kkVar != null) {
            try {
                if (kkVar.getRightDrawable2() instanceof kk0) {
                    ((kk0) kkVar.getRightDrawable2()).b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, e6Var));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void f() {
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}
