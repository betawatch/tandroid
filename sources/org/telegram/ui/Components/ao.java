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
import org.telegram.ui.y91;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class ao extends FrameLayout implements te.b, org.telegram.messenger.fs, org.telegram.ui.ActionBar.c6 {
    public org.telegram.ui.ActionBar.k A0;
    public final ImageView E;
    public final ImageView F;
    public final k01 G;
    public final org.telegram.ui.bn H;
    public final yu0[] I;
    public final b9 J;
    public final int K;
    public boolean L;
    public int M;
    public int N;
    public yu0 O;
    public int P;
    public int Q;
    public AnimatorSet R;
    public final boolean[] S;
    public final boolean[] T;
    public final boolean U;
    public int V;
    public int W;
    public final te.a a;
    public CharSequence a0;
    public boolean b;
    public int b0;
    public Integer c;
    public Integer c0;
    public final int d;
    public final ys0 d0;
    public final wn e;
    public final org.telegram.ui.ActionBar.i6 e0;
    public final boolean f;
    public boolean f0;
    public final m5 g0;
    public final org.telegram.ui.pk h;
    public final m5 h0;
    public final mc i0;
    public final tn j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final AtomicReference n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public String q0;
    public final org.telegram.ui.pk r;
    public String r0;
    public final n6 s;
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
    public ao(Context context, org.telegram.ui.ActionBar.h2 h2Var, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        boolean z11;
        int i7;
        int i10;
        ?? r72;
        TLRPC.Chat chat;
        int i11;
        yu0[] yu0VarArr;
        int i12;
        lr lrVar = lr.h;
        this.a = new te.a(0, this, lrVar, 320L, false);
        this.d = 42;
        AtomicReference atomicReference = new AtomicReference();
        this.n = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.w = atomicReference2;
        yu0[] yu0VarArr2 = new yu0[6];
        this.I = yu0VarArr2;
        this.J = new b9((org.telegram.ui.ActionBar.i6) null);
        this.K = org.telegram.messenger.j10.t0;
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
        this.i0 = new mc(this);
        this.j0 = new tn(this, 2);
        this.o0 = false;
        this.p0 = false;
        this.q0 = null;
        this.r0 = null;
        this.e0 = i6Var;
        boolean z12 = h2Var instanceof org.telegram.ui.bn;
        if (z12) {
            this.H = (org.telegram.ui.bn) h2Var;
        }
        org.telegram.ui.bn bnVar = this.H;
        boolean z13 = bnVar != null && ((i12 = bnVar.g4) == 0 || i12 == 8) && !org.telegram.messenger.o10.A(bnVar.j()) && (this.H.j() == null || this.H.j().id != 489000);
        wn wnVar = new wn(this, context, h2Var, z13, i6Var);
        this.e = wnVar;
        int i13 = 5;
        if (z12 || (h2Var instanceof y91)) {
            org.telegram.ui.bn bnVar2 = this.H;
            if (bnVar2 == null || ((i7 = bnVar2.g4) != 5 && i7 != 9 && i7 != 6 && i7 != 8 && !org.telegram.messenger.o10.v(bnVar2.f))) {
                this.d0 = new ys0(h2Var);
            }
            org.telegram.ui.bn bnVar3 = this.H;
            if (bnVar3 != null) {
                if (bnVar3.fa()) {
                    org.telegram.ui.bn bnVar4 = this.H;
                    if (bnVar4.m4 != null) {
                    }
                    z11 = true;
                    this.f = z11;
                    if (z11) {
                        wnVar.setVisibility(8);
                    }
                }
                int i14 = this.H.g4;
                if (i14 != 2) {
                    if (i14 != 5) {
                        if (i14 != 9) {
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
        wnVar.setContentDescription(org.telegram.messenger.gd.M0(2131754798, null));
        wnVar.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        addView(wnVar);
        if (z13) {
            org.telegram.ui.bn bnVar5 = this.H;
            TLRPC.Chat chat2 = bnVar5 != null ? bnVar5.e : null;
            if (chat2 != null && chat2.linked_community_id != 0) {
                c8.ra.b(wnVar, 0.05f, 1.2f);
            }
            final int i15 = 0;
            wnVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vn
                public final /* synthetic */ ao b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            ao aoVar = this.b;
                            if (!aoVar.d()) {
                                aoVar.e(true, false);
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
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(context, atomicReference);
        this.h = pkVar;
        pkVar.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.u6.X(pkVar, org.telegram.ui.ActionBar.n6.A8, i6Var);
        pkVar.setTextSize(18);
        pkVar.setGravity(3);
        pkVar.setTypeface(org.telegram.messenger.g0.o());
        pkVar.setLeftDrawableTopPadding(-org.telegram.messenger.g0.L(1.3f));
        pkVar.setCanHideRightDrawable(false);
        pkVar.setRightDrawableOutside(true);
        pkVar.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(12.0f));
        addView(pkVar);
        if (o()) {
            n6 n6Var = new n6(context, true, true, true);
            this.s = n6Var;
            n6Var.b(0.3f, 320L, lrVar);
            n6Var.setEllipsizeByGradient(true);
            int i16 = org.telegram.ui.ActionBar.n6.B8;
            org.telegram.ui.ActionBar.u6.Y(n6Var, i16, i6Var);
            n6Var.setTag(Integer.valueOf(i16));
            n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            n6Var.setGravity(3);
            n6Var.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
            n6Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
            addView(n6Var);
        } else {
            org.telegram.ui.pk pkVar2 = new org.telegram.ui.pk(context, atomicReference2);
            this.r = pkVar2;
            pkVar2.setEllipsizeByGradient(true);
            int i17 = org.telegram.ui.ActionBar.n6.B8;
            org.telegram.ui.ActionBar.u6.X(pkVar2, i17, i6Var);
            pkVar2.setTag(Integer.valueOf(i17));
            pkVar2.setTextSize(14);
            pkVar2.setGravity(3);
            pkVar2.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
            addView(pkVar2);
        }
        if (this.H != null) {
            ImageView imageView = new ImageView(context);
            this.y = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setVisibility(8);
            imageView.setImageDrawable(new ih.c());
            addView(imageView);
            ImageView imageView2 = new ImageView(context);
            this.x = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setVisibility(8);
            k01 k01Var = new k01(context, i6Var);
            this.G = k01Var;
            imageView2.setImageDrawable(k01Var);
            k01Var.k = true;
            k01Var.b.setColor(0);
            addView(imageView2);
            this.U = z10;
            imageView2.setOnClickListener(new y7(i13, this, i6Var));
            if (z10) {
                imageView2.setContentDescription(org.telegram.messenger.gd.M0(2131745314, null));
            } else {
                imageView2.setContentDescription(org.telegram.messenger.gd.M0(2131754925, null));
            }
            ImageView imageView3 = new ImageView(context);
            this.E = imageView3;
            imageView3.setImageResource(R.drawable.star_small_outline);
            org.telegram.ui.ActionBar.u6.s(imageView3, org.telegram.ui.ActionBar.n6.s8, i6Var, PorterDuff.Mode.SRC_IN);
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
        org.telegram.ui.bn bnVar6 = this.H;
        if (bnVar6 != null && ((i10 = bnVar6.g4) == 0 || i10 == 8 || i10 == 3)) {
            if (bnVar6.fa()) {
                org.telegram.ui.bn bnVar7 = this.H;
                if (!bnVar7.x4) {
                }
            }
            if (!org.telegram.messenger.o10.A(this.H.j()) && (this.H.j() == null || this.H.j().id != 489000)) {
                r72 = 1;
                final char c10 = 1 == true ? 1 : 0;
                setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vn
                    public final /* synthetic */ ao b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (c10) {
                            case 0:
                                ao aoVar = this.b;
                                if (!aoVar.d()) {
                                    aoVar.e(true, false);
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
                yu0VarArr2[0] = new j41(r72);
                yu0VarArr2[r72] = new qp(r72);
                yu0VarArr2[2] = new qn0(r72);
                yu0VarArr2[3] = new ve0(i6Var, false);
                yu0VarArr2[4] = new qk0(r72);
                yu0VarArr2[5] = new qp();
                i11 = 0;
                while (true) {
                    yu0VarArr = this.I;
                    if (i11 < yu0VarArr.length) {
                        break;
                    }
                    yu0VarArr[i11].c(chat != null ? r72 : false);
                    i11++;
                }
            }
            r72 = 1;
            chat = this.H.e;
            yu0VarArr2[0] = new j41(r72);
            yu0VarArr2[r72] = new qp(r72);
            yu0VarArr2[2] = new qn0(r72);
            yu0VarArr2[3] = new ve0(i6Var, false);
            yu0VarArr2[4] = new qk0(r72);
            yu0VarArr2[5] = new qp();
            i11 = 0;
            while (true) {
                yu0VarArr = this.I;
                if (i11 < yu0VarArr.length) {
                }
                yu0VarArr[i11].c(chat != null ? r72 : false);
                i11++;
            }
        }
        this.g0 = new m5(org.telegram.messenger.g0.L(24.0f), this.h);
        this.h0 = new m5(org.telegram.messenger.g0.L(17.0f), this.h);
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.bn bnVar = this.H;
        org.telegram.ui.pk pkVar = this.r;
        if (pkVar == null) {
            return;
        }
        int i7 = 0;
        yu0[] yu0VarArr = this.I;
        if (!z10) {
            this.O = null;
            pkVar.setLeftDrawable((Drawable) null);
            pkVar.g(null, null);
            while (i7 < yu0VarArr.length) {
                yu0 yu0Var = yu0VarArr[i7];
                if (yu0Var != null) {
                    yu0Var.e();
                }
                i7++;
            }
            return;
        }
        try {
            int intValue = org.telegram.messenger.mp.u1(this.K).G1(bnVar.a(), bnVar.s4).intValue();
            yu0 yu0Var2 = yu0VarArr[intValue];
            if (yu0Var2 == null) {
                return;
            }
            org.telegram.ui.ActionBar.i6 i6Var = this.e0;
            if (intValue == 5) {
                pkVar.g(yu0Var2, "**oo**");
                yu0VarArr[intValue].b(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.pa, i6Var));
                pkVar.setLeftDrawable((Drawable) null);
            } else {
                pkVar.g(null, null);
                yu0VarArr[intValue].b(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.pa, i6Var));
                pkVar.setLeftDrawable(yu0VarArr[intValue]);
            }
            this.O = yu0VarArr[intValue];
            while (i7 < yu0VarArr.length) {
                yu0 yu0Var3 = yu0VarArr[i7];
                if (yu0Var3 != null) {
                    if (i7 == intValue) {
                        yu0Var3.d();
                    } else {
                        yu0Var3.e();
                    }
                }
                i7++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        ImageView imageView;
        if (i7 != 0 || (imageView = this.x) == null) {
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
        org.telegram.ui.bn bnVar = this.H;
        if (bnVar == null) {
            return;
        }
        TLRPC.User j3 = bnVar.j();
        TLRPC.Chat chat = bnVar.e;
        if (bnVar.g4 == 3) {
            long e92 = bnVar.e9();
            if (e92 >= 0) {
                user = bnVar.getMessagesController().c2(Long.valueOf(e92));
                chat = null;
            } else {
                chat = bnVar.getMessagesController().O0(Long.valueOf(-e92));
                user = null;
            }
        } else {
            user = j3;
        }
        b9 b9Var = this.J;
        wn wnVar = this.e;
        if (user == null) {
            if (!org.telegram.messenger.v3.p0(chat)) {
                if (chat != null) {
                    b9Var.p = 1.0f;
                    b9Var.q(chat);
                    if (wnVar != null) {
                        wnVar.setAnimatedEmojiDrawable(null);
                        wnVar.f(chat, b9Var);
                        if (chat.forum) {
                            L = org.telegram.messenger.g0.L(org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).R1().K(-chat.id) ? 11.0f : 16.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(21.0f);
                        }
                        wnVar.setRoundRadius(L);
                        return;
                    }
                    return;
                }
                return;
            }
            long d = bnVar.d();
            int i7 = this.K;
            if (!org.telegram.messenger.v3.A(i7, chat, 24) || d == 0) {
                wnVar.setAnimatedEmojiDrawable(null);
                qg.c.p(i7, chat, b9Var, wnVar);
            } else if (d > 0) {
                TLRPC.User c22 = bnVar.getMessagesController().c2(Long.valueOf(d));
                b9Var.r(c22);
                wnVar.setAnimatedEmojiDrawable(null);
                wnVar.f(c22, b9Var);
            } else {
                TLRPC.Chat O0 = bnVar.getMessagesController().O0(Long.valueOf(-d));
                b9Var.q(O0);
                wnVar.setAnimatedEmojiDrawable(null);
                wnVar.f(O0, b9Var);
            }
            wnVar.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
            return;
        }
        b9Var.r(user);
        if (org.telegram.messenger.o10.A(user)) {
            b9Var.p = 0.8f;
            b9Var.g(12);
            if (wnVar != null) {
                wnVar.setAnimatedEmojiDrawable(null);
                wnVar.j(null, null, b9Var, user);
                return;
            }
            return;
        }
        if (org.telegram.messenger.o10.t(user)) {
            b9Var.p = 0.8f;
            b9Var.g(21);
            if (wnVar != null) {
                wnVar.setAnimatedEmojiDrawable(null);
                wnVar.j(null, null, b9Var, user);
                return;
            }
            return;
        }
        if (org.telegram.messenger.o10.C(user) && bnVar.g4 == 3) {
            b9Var.p = 0.8f;
            b9Var.g(22);
            if (wnVar != null) {
                wnVar.setAnimatedEmojiDrawable(null);
                wnVar.j(null, null, b9Var, user);
                return;
            }
            return;
        }
        if (!org.telegram.messenger.o10.C(user)) {
            b9Var.p = 1.0f;
            if (wnVar != null) {
                wnVar.setAnimatedEmojiDrawable(null);
                wnVar.a.j0(user, b9Var, null, true, 3, false);
                return;
            }
            return;
        }
        b9Var.p = 0.8f;
        b9Var.g(1);
        if (wnVar != null) {
            wnVar.setAnimatedEmojiDrawable(null);
            wnVar.j(null, null, b9Var, user);
        }
    }

    public final m5 c(long j3) {
        if (j3 == 0) {
            return null;
        }
        m5 m5Var = this.h0;
        m5Var.j(j3, false);
        m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.qi, this.e0)));
        int L = org.telegram.messenger.g0.L(1.0f);
        m5Var.J = 0;
        m5Var.K = L;
        return m5Var;
    }

    public boolean d() {
        return false;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.T1) {
            int connectionState = ConnectionsManager.getInstance(this.K).getConnectionState();
            if (this.W != connectionState) {
                this.W = connectionState;
                l();
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.ks.k4) {
            if (i7 == org.telegram.messenger.ks.i3) {
                n(true);
            }
        } else {
            org.telegram.ui.pk pkVar = this.h;
            if (pkVar != null) {
                pkVar.invalidate();
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
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
                boolean drawChild = super.drawChild(canvas, view, j3);
                if (z11) {
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - org.telegram.messenger.g0.N(0.33f), imageView.getScaleX() * org.telegram.messenger.g0.N(12.0f), org.telegram.ui.ActionBar.n6.Fm);
                }
                if (z10) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * org.telegram.messenger.g0.N(7.66f), org.telegram.ui.ActionBar.n6.Fm);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
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
        org.telegram.ui.bn bnVar;
        TLRPC.Chat chat;
        ImageReceiver imageReceiver;
        String str;
        org.telegram.messenger.ec D;
        boolean z13;
        ah ahVar;
        Drawable t6;
        TLRPC.User c22;
        wn wnVar = this.e;
        if (z10) {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x <= point.y) {
                }
            }
            z12 = false;
            bnVar = this.H;
            TLRPC.User j3 = bnVar.j();
            chat = bnVar.e;
            boolean z14 = chat == null && chat.monoforum;
            if (chat != null && chat.monoforum) {
                chat = bnVar.getMessagesController().O0(Long.valueOf(chat.linked_monoforum_id));
                if (chat != null) {
                    return;
                }
                if (bnVar.j9() != 0 && (c22 = bnVar.getMessagesController().c2(Long.valueOf(bnVar.j9()))) != null) {
                    chat = null;
                    j3 = c22;
                }
            }
            imageReceiver = wnVar.getImageReceiver();
            str = imageReceiver.R;
            D = org.telegram.messenger.ec.D();
            if (str != null && !D.J(str, false)) {
                t6 = imageReceiver.t();
                if ((t6 instanceof BitmapDrawable) && !(t6 instanceof b6)) {
                    D.O((BitmapDrawable) t6, str, false);
                }
            }
            if (!bnVar.v4) {
                if (chat == null) {
                    return;
                }
                bnVar.presentFragment(ProfileActivity.D4(-chat.id), z11);
                return;
            }
            ys0 ys0Var = this.d0;
            if (j3 == null) {
                boolean z15 = z12;
                if (chat != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    if (bnVar.g4 == 3) {
                        bundle.putLong("topic_id", bnVar.e9());
                    } else if (bnVar.x4) {
                        bundle.putLong("topic_id", bnVar.m4.e1());
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, ys0Var);
                    if (!z14) {
                        profileActivity.d5(bnVar.r8);
                    }
                    profileActivity.j5(z15 ? 2 : 1);
                    bnVar.presentFragment(profileActivity, z11);
                    return;
                }
                return;
            }
            if (j3.id == 489000) {
                return;
            }
            Bundle bundle2 = new Bundle();
            if (org.telegram.messenger.o10.C(j3)) {
                org.telegram.ui.ActionBar.h2 h2Var = ys0Var.x;
                int[] iArr = ys0Var.c;
                int i7 = 0;
                while (true) {
                    if (i7 < iArr.length) {
                        if (iArr[i7] > 0) {
                            break;
                        } else {
                            i7++;
                        }
                    } else if (!ys0Var.f && (h2Var == null || ys0Var.r != h2Var.getUserConfig().e() || ys0Var.s != 0 || !h2Var.getMessagesController().I1().e())) {
                        return;
                    }
                }
                bundle2.putLong("dialog_id", bnVar.a());
                if (bnVar.g4 == 3) {
                    bundle2.putLong("topic_id", bnVar.e9());
                }
                i90 i90Var = new i90(bundle2, ys0Var);
                i90Var.c = bnVar.r8;
                bnVar.presentFragment(i90Var, z11);
                return;
            }
            if (bnVar.g4 == 3) {
                z13 = z12;
                long e92 = bnVar.e9();
                bundle2.putBoolean("saved", true);
                if (e92 >= 0) {
                    bundle2.putLong("user_id", e92);
                } else {
                    bundle2.putLong("chat_id", -e92);
                }
            } else {
                z13 = z12;
                bundle2.putLong("user_id", j3.id);
                if (this.x != null && !z14) {
                    bundle2.putLong("dialog_id", bnVar.a());
                }
            }
            if (org.telegram.messenger.o10.v(j3)) {
                bundle2.putLong("topic_id", bnVar.d());
            }
            ai.l0 l0Var = bnVar.Z1;
            bundle2.putBoolean("reportSpam", (l0Var == null || (ahVar = bnVar.b1) == null || !ahVar.e(l0Var) || bnVar.c2.getVisibility() == 8) ? false : true);
            bundle2.putInt("actionBarColor", org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.s8, this.e0));
            ProfileActivity profileActivity2 = new ProfileActivity(bundle2, ys0Var);
            if (!z14) {
                profileActivity2.k5(bnVar.s8, bnVar.t8, bnVar.u8);
            }
            profileActivity2.j5(z13 ? 2 : 1);
            bnVar.presentFragment(profileActivity2, z11);
            return;
        }
        z12 = z10;
        bnVar = this.H;
        TLRPC.User j32 = bnVar.j();
        chat = bnVar.e;
        if (chat == null) {
        }
        if (chat != null) {
            chat = bnVar.getMessagesController().O0(Long.valueOf(chat.linked_monoforum_id));
            if (chat != null) {
            }
        }
        imageReceiver = wnVar.getImageReceiver();
        str = imageReceiver.R;
        D = org.telegram.messenger.ec.D();
        if (str != null) {
            t6 = imageReceiver.t();
            if (t6 instanceof BitmapDrawable) {
                D.O((BitmapDrawable) t6, str, false);
            }
        }
        if (!bnVar.v4) {
        }
    }

    public final void g(int i7, boolean z10) {
        k01 k01Var = this.G;
        if (k01Var == null) {
            return;
        }
        boolean z11 = this.n0;
        if (i7 != 0 || this.U) {
            te.a aVar = this.a;
            if (z11) {
                aVar.a(false, z10);
            } else {
                aVar.a(true, z10);
                k01Var.b(i7);
            }
        }
    }

    public q9 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.b0;
    }

    public int getLeftPadding() {
        return this.M;
    }

    public ys0 getSharedMediaPreloader() {
        return this.d0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.pk pkVar = this.r;
        return pkVar != null ? pkVar.getTextPaint() : this.s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.pk pkVar = this.r;
        if (pkVar != null) {
            return pkVar;
        }
        n6 n6Var = this.s;
        if (n6Var != null) {
            return n6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.x;
    }

    public org.telegram.ui.ActionBar.n5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        org.telegram.ui.pk pkVar = this.h;
        float max = pkVar != null ? Math.max(0.0f, pkVar.getExactWidthIncludeDrawables()) : 0.0f;
        org.telegram.ui.pk pkVar2 = this.r;
        if (pkVar2 != null) {
            max = Math.max(max, pkVar2.getExactWidthIncludeDrawables());
        }
        wn wnVar = this.e;
        return (int) (max + ((wnVar == null || wnVar.getVisibility() != 0) ? org.telegram.messenger.g0.L(34.0f) : org.telegram.messenger.g0.L(70.0f)));
    }

    public final void h(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.EmojiStatus emojiStatus, boolean z14) {
        if (charSequence != null) {
            charSequence = org.telegram.messenger.j6.m(charSequence, this.h.getPaint().getFontMetricsInt(), false, null, 0);
        }
        this.h.k(charSequence);
        this.p0 = false;
        if (z10 || z11) {
            this.p0 = true;
            if (!(this.h.getRightDrawable() instanceof tk0)) {
                tk0 tk0Var = new tk0(!z10 ? 1 : 0);
                tk0Var.b(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.B8, this.e0));
                this.h.j(tk0Var);
                this.r0 = org.telegram.messenger.gd.M0(2131745667, null);
                this.o0 = true;
            }
        } else if (z12) {
            Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
            this.t0 = mutate;
            int i7 = org.telegram.ui.ActionBar.n6.qi;
            org.telegram.ui.ActionBar.i6 i6Var = this.e0;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.u6.x(this, mutate, i7, i6Var, mode);
            Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
            this.u0 = mutate2;
            org.telegram.ui.ActionBar.u6.x(this, mutate2, org.telegram.ui.ActionBar.n6.ri, this.e0, mode);
            this.h.j(new mq(this.t0, this.u0));
            this.o0 = true;
            this.r0 = org.telegram.messenger.gd.M0(2131754739, null);
        } else if (this.h.getRightDrawable() instanceof tk0) {
            this.h.j(null);
            this.o0 = false;
            this.r0 = null;
        }
        if (z13 || org.telegram.messenger.n5.f(emojiStatus) != 0) {
            if ((this.h.getRightDrawable() instanceof n5) && (((n5) this.h.getRightDrawable()).a instanceof o5)) {
                ((o5) ((n5) this.h.getRightDrawable()).a).n(this.h);
            }
            if (org.telegram.messenger.n5.f(emojiStatus) != 0) {
                this.g0.j(org.telegram.messenger.n5.f(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = org.telegram.messenger.t0.b.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.s0 = mutate3;
                org.telegram.ui.ActionBar.u6.x(this, mutate3, org.telegram.ui.ActionBar.n6.qi, this.e0, PorterDuff.Mode.MULTIPLY);
                this.g0.g(this.s0, z14);
            } else {
                this.g0.g(null, z14);
            }
            this.g0.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.qi, this.e0)));
            this.h.i(this.g0);
            this.o0 = false;
            this.q0 = org.telegram.messenger.gd.M0(2131754802, null);
        } else {
            this.h.i(null);
            this.q0 = null;
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.k(z14);
        }
    }

    public final void i(int i7, int i10) {
        org.telegram.ui.pk pkVar = this.h;
        org.telegram.ui.ActionBar.u6.q(pkVar);
        org.telegram.ui.pk pkVar2 = this.r;
        org.telegram.ui.ActionBar.u6.q(pkVar2);
        pkVar.setTextColor(i7);
        pkVar2.setTextColor(i10);
        pkVar2.setTag(Integer.valueOf(i10));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.pk pkVar = this.h;
        pkVar.setLeftDrawable(drawable);
        if (!this.o0 && !this.p0) {
            if (drawable2 != null) {
                this.r0 = org.telegram.messenger.gd.M0(2131747708, null);
            } else {
                this.r0 = null;
            }
            pkVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.k(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        b9 b9Var = this.J;
        b9Var.r(user);
        boolean A = org.telegram.messenger.o10.A(user);
        wn wnVar = this.e;
        if (A) {
            b9Var.g(12);
            b9Var.p = 0.8f;
            if (wnVar != null) {
                wnVar.j(null, null, b9Var, user);
                return;
            }
            return;
        }
        if (org.telegram.messenger.o10.t(user)) {
            b9Var.g(21);
            b9Var.p = 0.8f;
            if (wnVar != null) {
                wnVar.j(null, null, b9Var, user);
                return;
            }
            return;
        }
        if (!org.telegram.messenger.o10.C(user) || z10) {
            b9Var.p = 1.0f;
            if (wnVar != null) {
                wnVar.f(user, b9Var);
                return;
            }
            return;
        }
        b9Var.g(1);
        b9Var.p = 0.8f;
        if (wnVar != null) {
            wnVar.j(null, null, b9Var, user);
        }
    }

    public final void l() {
        int i7 = this.W;
        String M0 = i7 == 2 ? org.telegram.messenger.gd.M0(2131742975, null) : i7 == 1 ? org.telegram.messenger.gd.M0(2131751798, null) : i7 == 5 ? org.telegram.messenger.gd.M0(2131743573, null) : i7 == 4 ? org.telegram.messenger.gd.M0(2131751796, null) : null;
        org.telegram.ui.ActionBar.i6 i6Var = this.e0;
        n6 n6Var = this.s;
        org.telegram.ui.pk pkVar = this.r;
        if (M0 == null) {
            CharSequence charSequence = this.a0;
            if (charSequence != null) {
                if (pkVar != null) {
                    pkVar.k(charSequence);
                    this.a0 = null;
                    Integer num = this.c0;
                    if (num != null) {
                        pkVar.setTextColor(num.intValue());
                    } else {
                        int i10 = this.b0;
                        if (i10 >= 0) {
                            org.telegram.ui.ActionBar.u6.X(pkVar, i10, i6Var);
                            pkVar.setTag(Integer.valueOf(this.b0));
                        }
                    }
                } else if (n6Var != null) {
                    n6Var.c(charSequence, !org.telegram.messenger.gd.a0, true);
                    this.a0 = null;
                    Integer num2 = this.c0;
                    if (num2 != null) {
                        n6Var.setTextColor(num2.intValue());
                    } else {
                        int i11 = this.b0;
                        if (i11 >= 0) {
                            org.telegram.ui.ActionBar.u6.Y(n6Var, i11, i6Var);
                            n6Var.setTag(Integer.valueOf(this.b0));
                        }
                    }
                }
            }
        } else if (pkVar != null) {
            if (this.a0 == null) {
                this.a0 = pkVar.getText();
            }
            pkVar.k(M0);
            Integer num3 = this.c0;
            if (num3 != null) {
                pkVar.setTextColor(num3.intValue());
            } else {
                int i12 = org.telegram.ui.ActionBar.n6.B8;
                org.telegram.ui.ActionBar.u6.X(pkVar, i12, i6Var);
                pkVar.setTag(Integer.valueOf(i12));
            }
        } else if (n6Var != null) {
            if (this.a0 == null) {
                this.a0 = n6Var.getText();
            }
            n6Var.c(M0, !org.telegram.messenger.gd.a0, true);
            Integer num4 = this.c0;
            if (num4 != null) {
                n6Var.setTextColor(num4.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.n6.B8;
                org.telegram.ui.ActionBar.u6.Y(n6Var, i13, i6Var);
                n6Var.setTag(Integer.valueOf(i13));
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.k(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.bn bnVar = this.H;
        if (bnVar == null) {
            return;
        }
        this.V = 0;
        TLRPC.ChatFull chatFull = bnVar.r8;
        if (chatFull == null) {
            return;
        }
        int i7 = this.K;
        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z10 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (!z10 || chatFull.participants_count <= 200) {
                return;
            }
            this.V = chatFull.online_count;
            return;
        }
        for (int i10 = 0; i10 < chatFull.participants.participants.size(); i10++) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(chatFull.participants.participants.get(i10).user_id));
            if (c22 != null && (userStatus = c22.status) != null && ((userStatus.expires > currentTime || c22.id == org.telegram.messenger.j10.i(i7).e()) && c22.status.expires > 10000)) {
                this.V++;
            }
        }
    }

    public final void n(boolean z10) {
        int i7;
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
        org.telegram.ui.ActionBar.i6 i6Var = this.e0;
        boolean[] zArr = this.S;
        n6 n6Var = this.s;
        org.telegram.ui.pk pkVar = this.r;
        org.telegram.ui.pk pkVar2 = this.h;
        int i16 = this.K;
        org.telegram.ui.bn bnVar = this.H;
        if (bnVar == null) {
            return;
        }
        if (bnVar.g4 == 6) {
            String str = bnVar.e4.link;
            kg.y[] yVarArr = kg.y.e;
            if (str.startsWith("https://")) {
                str = str.substring(8);
            }
            setSubtitle(str);
            return;
        }
        TLRPC.User j3 = bnVar.j();
        TLRPC.Chat chat = bnVar.e;
        boolean z13 = org.telegram.messenger.o10.C(j3) && bnVar.g4 == 0 && bnVar.getMessagesController().I1().c() >= 3 && (this.v0 || org.telegram.messenger.mp.g1().getInt("savedmsgschatshint", 0) < 3);
        if (((org.telegram.messenger.o10.C(j3) && !z13) || org.telegram.messenger.o10.A(j3) || ((j3 != null && j3.id == 489000) || ((i7 = bnVar.g4) != 0 && i7 != 8))) && bnVar.g4 != 3) {
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
                org.telegram.messenger.mp.g1().edit().putInt("savedmsgschatshint", org.telegram.messenger.mp.g1().getInt("savedmsgschatshint", i15) + 1).apply();
                this.v0 = true;
            }
        }
        CharSequence F1 = org.telegram.messenger.mp.u1(i16).F1(bnVar.a(), bnVar.s4, false);
        CharSequence charSequence = "";
        if (F1 != null) {
            F1 = TextUtils.replace(F1, new String[]{"..."}, new String[]{""});
        }
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        boolean z14 = z13;
        if (F1 != null && F1.length() != 0 && (!org.telegram.messenger.v3.T(chat) || chat.megagroup)) {
            if (bnVar.fa() && pkVar2.getTag() != null) {
                pkVar2.setTag(null);
                getSubtitleTextView().setVisibility(0);
                AnimatorSet animatorSet = this.R;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.R = null;
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.R = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(pkVar2, (Property<org.telegram.ui.pk, Float>) property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 1.0f));
                    this.R.addListener(new zn(this, 1));
                    this.R.setDuration(180L);
                    this.R.start();
                } else {
                    pkVar2.setTranslationY(0.0f);
                    getSubtitleTextView().setAlpha(1.0f);
                }
            }
            Integer G1 = org.telegram.messenger.mp.u1(i16).G1(bnVar.a(), bnVar.s4);
            charSequence = (G1 == null || G1.intValue() != 5) ? F1 : org.telegram.messenger.j6.m(F1, getSubtitlePaint().getFontMetricsInt(), false, null, 0);
            setTypingAnimation(true);
            z12 = true;
        } else {
            if (bnVar.fa() && !bnVar.x4) {
                if (pkVar2.getTag() != null) {
                    return;
                }
                pkVar2.setTag(1);
                AnimatorSet animatorSet3 = this.R;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.R = null;
                }
                if (!z10) {
                    pkVar2.setTranslationY(org.telegram.messenger.g0.L(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                } else {
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.R = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(pkVar2, (Property<org.telegram.ui.pk, Float>) property2, org.telegram.messenger.g0.L(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 0.0f));
                    this.R.addListener(new zn(this, 0));
                    this.R.setDuration(180L);
                    this.R.start();
                    return;
                }
            }
            setTypingAnimation(false);
            int i17 = bnVar.g4;
            if (i17 != 8) {
                if (i17 == 3) {
                    org.telegram.messenger.pv I1 = bnVar.getMessagesController().I1();
                    long e92 = bnVar.e9();
                    ArrayList arrayList = I1.j;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= arrayList.size()) {
                            i14 = 0;
                            break;
                        }
                        org.telegram.messenger.ov ovVar = (org.telegram.messenger.ov) arrayList.get(i18);
                        if (ovVar.a == e92) {
                            i14 = ovVar.e;
                            break;
                        }
                        i18++;
                    }
                    charSequence = org.telegram.messenger.gd.G(Math.max(1, i14), "SavedMessagesCount", new Object[0]);
                } else {
                    if (bnVar.x4 && chat != null) {
                        TLRPC.TL_forumTopic f10 = org.telegram.messenger.mp.u1(i16).t7.f(chat.id, bnVar.d());
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
                            G = org.telegram.messenger.gd.G(i13, "messages", objArr);
                        } else {
                            Object[] objArr2 = new Object[i12];
                            objArr2[0] = chat.title;
                            G = org.telegram.messenger.gd.a0(null, null, 2131743775, objArr2);
                        }
                    } else if (chat != null) {
                        TLRPC.ChatFull chatFull = bnVar.r8;
                        int i19 = this.V;
                        if (org.telegram.messenger.v3.T(chat)) {
                            if (chatFull == null || (i11 = chatFull.participants_count) == 0) {
                                G = chat.megagroup ? chatFull == null ? org.telegram.messenger.gd.M0(2131748587, null).toLowerCase() : chat.has_geo ? org.telegram.messenger.gd.M0(2131748450, null).toLowerCase() : org.telegram.messenger.v3.t0(chat) ? org.telegram.messenger.gd.M0(2131748446, null).toLowerCase() : org.telegram.messenger.gd.M0(2131748449, null).toLowerCase() : org.telegram.messenger.v3.t0(chat) ? org.telegram.messenger.gd.M0(2131752307, null).toLowerCase() : org.telegram.messenger.gd.M0(2131752318, null).toLowerCase();
                            } else if (chat.megagroup) {
                                G = i19 > 1 ? a8.p0.E(org.telegram.messenger.gd.G(i11, "Members", new Object[0]), ", ", org.telegram.messenger.gd.G(Math.min(i19, chatFull.participants_count), "OnlineCount", new Object[0])) : org.telegram.messenger.gd.G(i11, "Members", new Object[0]);
                            } else {
                                int[] iArr = new int[1];
                                boolean C1 = org.telegram.messenger.g0.C1();
                                int i20 = chatFull.participants_count;
                                if (C1) {
                                    iArr[0] = i20;
                                    S = String.valueOf(i20);
                                } else {
                                    S = org.telegram.messenger.gd.S(iArr, i20);
                                }
                                G = chat.megagroup ? org.telegram.messenger.gd.G(iArr[0], "Members", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S) : org.telegram.messenger.gd.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                            }
                        } else if (org.telegram.messenger.v3.k0(chat)) {
                            G = org.telegram.messenger.gd.M0(2131742571, null);
                        } else if (org.telegram.messenger.v3.l0(chat)) {
                            G = org.telegram.messenger.gd.M0(2131742577, null);
                        } else {
                            int i21 = chat.participants_count;
                            if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                i21 = chatParticipants.participants.size();
                            }
                            G = (i19 <= 1 || i21 == 0) ? org.telegram.messenger.gd.G(i21, "Members", new Object[0]) : a8.p0.E(org.telegram.messenger.gd.G(i21, "Members", new Object[0]), ", ", org.telegram.messenger.gd.G(i19, "OnlineCount", new Object[0]));
                        }
                    } else {
                        if (j3 != null) {
                            TLRPC.User c22 = org.telegram.messenger.mp.u1(i16).c2(Long.valueOf(j3.id));
                            if (c22 != null) {
                                j3 = c22;
                            }
                            if (!org.telegram.messenger.o10.A(j3)) {
                                long j10 = j3.id;
                                if (j10 != 489000) {
                                    if (j10 == org.telegram.messenger.j10.i(i16).e()) {
                                        charSequence = z14 ? org.telegram.messenger.g0.H2(org.telegram.messenger.gd.M0(2131745697, null), false) : org.telegram.messenger.gd.M0(2131752178, null);
                                    } else {
                                        long j11 = j3.id;
                                        if (j11 == 333000 || j11 == 777000 || j11 == 42777) {
                                            z11 = false;
                                            charSequence = org.telegram.messenger.gd.M0(2131745366, null);
                                        } else if (org.telegram.messenger.mp.L2(j3)) {
                                            charSequence = org.telegram.messenger.gd.M0(2131744090, null);
                                        } else {
                                            boolean z15 = j3.bot;
                                            if (z15 && (i10 = j3.bot_active_users) != 0) {
                                                charSequence = org.telegram.messenger.gd.H(',', "BotUsers", i10);
                                            } else if (z15) {
                                                charSequence = org.telegram.messenger.o10.e(j3);
                                            } else {
                                                zArr[0] = false;
                                                charSequence = org.telegram.messenger.gd.d0(i16, j3, zArr, this.f0 ? this.T : null);
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
            } else if (bnVar.i4) {
                charSequence = org.telegram.messenger.gd.M0(2131752208, null);
                z12 = false;
            } else {
                if (bnVar.d() == 0) {
                    org.telegram.messenger.e00 e00Var = bnVar.getMessagesController().t7;
                    long j12 = -bnVar.a();
                    int size = (!e00Var.e(j12) || (l10 = e00Var.l(j12)) == null) ? 0 : l10.size();
                    G = size > 0 ? org.telegram.messenger.gd.H(',', "Chats", size) : org.telegram.messenger.gd.M0(2131752208, null);
                } else {
                    TLRPC.TL_forumTopic f11 = org.telegram.messenger.mp.u1(i16).t7.f(chat.id, bnVar.d());
                    int i22 = f11 != null ? f11.totalMessagesCount : 0;
                    G = i22 > 0 ? org.telegram.messenger.gd.G(i22, "messages", Integer.valueOf(i22)) : org.telegram.messenger.gd.a0(null, null, 2131743775, qg.c.j(i16, chat, false));
                }
                charSequence = G;
                z12 = false;
            }
        }
        this.b0 = z12 ? org.telegram.ui.ActionBar.n6.pa : org.telegram.ui.ActionBar.n6.B8;
        if (this.a0 != null) {
            this.a0 = charSequence;
        } else if (pkVar != null) {
            pkVar.k(charSequence);
            Integer num = this.c0;
            if (num == null) {
                org.telegram.ui.ActionBar.u6.X(pkVar, this.b0, i6Var);
                pkVar.setTag(Integer.valueOf(this.b0));
            } else {
                pkVar.setTextColor(num.intValue());
            }
        } else {
            n6Var.c(charSequence, z10, true);
            Integer num2 = this.c0;
            if (num2 == null) {
                org.telegram.ui.ActionBar.u6.Y(n6Var, this.b0, i6Var);
                n6Var.setTag(Integer.valueOf(this.b0));
            } else {
                n6Var.setTextColor(num2.intValue());
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.k(z10);
        }
    }

    public boolean o() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.bn bnVar = this.H;
        if (bnVar != null) {
            int i7 = this.K;
            org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.T1);
            org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.k4);
            if (bnVar.g4 == 3) {
                org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.i3);
            }
            this.W = ConnectionsManager.getInstance(i7).getConnectionState();
            l();
        }
        m5 m5Var = this.g0;
        if (m5Var != null) {
            m5Var.a();
        }
        m5 m5Var2 = this.h0;
        if (m5Var2 != null) {
            m5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.bn bnVar = this.H;
        if (bnVar != null) {
            int i7 = this.K;
            org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.T1);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.k4);
            if (bnVar.g4 == 3) {
                org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.i3);
            }
        }
        m5 m5Var = this.g0;
        if (m5Var != null) {
            m5Var.b();
        }
        m5 m5Var2 = this.h0;
        if (m5Var2 != null) {
            m5Var2.b();
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
        org.telegram.ui.pk pkVar = this.r;
        if (pkVar != null) {
            sb2.append(pkVar.getText());
        } else {
            n6 n6Var = this.s;
            if (n6Var != null) {
                sb2.append(n6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.gd.M0(2131747593, null)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        wn wnVar = this.e;
        int measuredHeight = (((currentActionBarHeight - wnVar.getMeasuredHeight()) - 2) / 2) + (this.L ? org.telegram.messenger.g0.m : 0);
        int L = org.telegram.messenger.g0.L(this.m0 ? 23.66f : 24.0f) + measuredHeight;
        int i13 = this.M + 1;
        int i14 = measuredHeight + 1;
        wnVar.layout(i13, i14, wnVar.getMeasuredWidth() + i13, wnVar.getMeasuredHeight() + i14);
        int L2 = this.M + org.telegram.messenger.g0.L(wnVar.getVisibility() == 0 ? this.m0 ? 49.66f : 55.0f : this.m0 ? 13.0f : 1.0f) + this.N;
        org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) this.n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.pk pkVar = this.h;
        if (visibility != 8) {
            pkVar.layout(L2, (org.telegram.messenger.g0.L(1.66f) + measuredHeight) - pkVar.getPaddingTop(), pkVar.getMeasuredWidth() + L2, pkVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.66f) + (pkVar.getTextHeight() + measuredHeight)) - pkVar.getPaddingTop()));
            if (n5Var != null) {
                n5Var.layout(L2, org.telegram.messenger.g0.L(1.66f) + measuredHeight, n5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(1.66f) + n5Var.getTextHeight() + measuredHeight);
            }
        } else {
            pkVar.layout(L2, (org.telegram.messenger.g0.L(11.0f) + measuredHeight) - pkVar.getPaddingTop(), pkVar.getMeasuredWidth() + L2, pkVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (pkVar.getTextHeight() + measuredHeight)) - pkVar.getPaddingTop()));
            if (n5Var != null) {
                n5Var.layout(L2, org.telegram.messenger.g0.L(10.0f) + measuredHeight, n5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(10.0f) + n5Var.getTextHeight() + measuredHeight);
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
        org.telegram.ui.pk pkVar2 = this.r;
        if (pkVar2 != null) {
            pkVar2.layout(L2, L, pkVar2.getMeasuredWidth() + L2, pkVar2.getTextHeight() + L);
        } else {
            n6 n6Var = this.s;
            if (n6Var != null) {
                n6Var.layout(L2, L, n6Var.getMeasuredWidth() + L2, n6Var.getTextHeight() + L);
            }
        }
        org.telegram.ui.ActionBar.n5 n5Var2 = (org.telegram.ui.ActionBar.n5) this.w.get();
        if (n5Var2 != null) {
            n5Var2.layout(L2, L, n5Var2.getMeasuredWidth() + L2, n5Var2.getTextHeight() + L);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        wn wnVar = this.e;
        int L = size - org.telegram.messenger.g0.L((wnVar.getVisibility() == 0 ? 54 : 0) + 16);
        float f10 = this.d;
        wnVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) - 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) - 2, TLObject.FLAG_30));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_31);
        org.telegram.ui.pk pkVar = this.h;
        pkVar.measure(makeMeasureSpec, makeMeasureSpec2);
        n6 n6Var = this.s;
        org.telegram.ui.pk pkVar2 = this.r;
        if (pkVar2 != null) {
            pkVar2.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
        } else if (n6Var != null) {
            n6Var.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
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
            View view = (org.telegram.ui.ActionBar.n5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(getContext());
            atomicReference.set(n5Var);
            int i12 = org.telegram.ui.ActionBar.n6.A8;
            org.telegram.ui.ActionBar.i6 i6Var = this.e0;
            org.telegram.ui.ActionBar.u6.X(n5Var, i12, i6Var);
            n5Var.setTextSizePx(org.telegram.messenger.g0.L(this.m0 ? 17.5f : 18.0f));
            n5Var.setGravity(3);
            n5Var.setTypeface(org.telegram.messenger.g0.o());
            n5Var.setLeftDrawableTopPadding(-org.telegram.messenger.g0.L(1.3f));
            n5Var.i(pkVar.getRightDrawable());
            n5Var.j(pkVar.getRightDrawable2());
            n5Var.setRightDrawableOutside(pkVar.getRightDrawableOutside());
            n5Var.setLeftDrawable(pkVar.getLeftDrawable());
            n5Var.l(pkVar.getText(), false);
            ViewPropertyAnimator duration = n5Var.animate().alpha(0.0f).setDuration(350L);
            lr lrVar = lr.h;
            duration.setInterpolator(lrVar).withEndAction(new tn(this, 0)).start();
            addView(n5Var);
            AtomicReference atomicReference2 = this.w;
            View view2 = (org.telegram.ui.ActionBar.n5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(getContext());
            atomicReference2.set(n5Var2);
            int i13 = org.telegram.ui.ActionBar.n6.B8;
            org.telegram.ui.ActionBar.u6.X(n5Var2, i13, i6Var);
            n5Var2.setTag(Integer.valueOf(i13));
            n5Var2.setTextSizePx(org.telegram.messenger.g0.L(this.m0 ? 13.5f : 14.0f));
            n5Var2.setGravity(3);
            if (pkVar2 != null) {
                n5Var2.l(pkVar2.getText(), false);
            } else if (n6Var != null) {
                n5Var2.l(n6Var.getText(), false);
            }
            n5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(lrVar).withEndAction(new tn(this, 1)).start();
            addView(n5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.n5 n5Var3 = (org.telegram.ui.ActionBar.n5) atomicReference.get();
        if (n5Var3 != null) {
            n5Var3.measure(org.telegram.messenger.n10.c((wnVar.getVisibility() == 0 ? 54 : 0) + 16, this.Q, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_31));
        }
        this.P = size;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        mc mcVar = this.i0;
        tn tnVar = this.j0;
        if (action == 0 && a()) {
            this.k0 = true;
            mcVar.c(true);
            org.telegram.messenger.g0.r(tnVar);
            org.telegram.messenger.g0.h3(tnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.k0) {
            mcVar.c(false);
            this.k0 = false;
            if (isClickable() && motionEvent.getAction() == 1) {
                e(false, false);
            }
            org.telegram.messenger.g0.r(tnVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final PorterDuffColorFilter p() {
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.qi, this.e0);
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
        b9 b9Var = this.J;
        b9Var.q(chat);
        wn wnVar = this.e;
        if (wnVar != null) {
            wnVar.f(chat, b9Var);
            wnVar.setRoundRadius(org.telegram.messenger.g0.L(org.telegram.messenger.v3.c0(chat) ? (chat == null || !org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).R1().K(-chat.id)) ? 16.0f : 11.0f : 21.0f));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setVisibility((!z10 || this.f) ? 8 : 0);
        }
    }

    public void setLeftPadding(int i7) {
        this.M = i7;
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

    public void setRightAvatarPadding(int i7) {
        this.N = i7;
    }

    public void setStoriesForceState(Integer num) {
        this.c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.a0 == null) {
            org.telegram.ui.pk pkVar = this.r;
            if (pkVar != null) {
                pkVar.k(charSequence);
            } else {
                n6 n6Var = this.s;
                if (n6Var != null) {
                    n6Var.setText(charSequence);
                }
            }
        } else {
            this.a0 = charSequence;
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.k(true);
        }
    }

    public void setTitle(CharSequence charSequence) {
        h(charSequence, false, false, false, false, null, false);
    }

    public void setUserAvatar(TLRPC.User user) {
        k(user, false);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        yu0 yu0Var = this.O;
        org.telegram.ui.ActionBar.i6 i6Var = this.e0;
        if (yu0Var != null) {
            yu0Var.b(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.pa, i6Var));
        }
        Drawable drawable = this.s0;
        if (drawable != null) {
            drawable.setColorFilter(p());
        }
        m5 m5Var = this.h0;
        if (m5Var != null) {
            m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.qi, i6Var)));
        }
        m5 m5Var2 = this.g0;
        if (m5Var2 != null) {
            m5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.qi, i6Var)));
        }
        Drawable drawable2 = this.t0;
        if (drawable2 != null) {
            drawable2.setColorFilter(p());
        }
        if (this.u0 != null) {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.ri, i6Var);
            if (this.x0 == null || w02 != this.z0) {
                this.z0 = w02;
                this.x0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
            }
            this.u0.setColorFilter(this.x0);
        }
        org.telegram.ui.pk pkVar = this.h;
        if (pkVar != null) {
            try {
                if (pkVar.getRightDrawable2() instanceof tk0) {
                    ((tk0) pkVar.getRightDrawable2()).b(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.B8, i6Var));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void f() {
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
