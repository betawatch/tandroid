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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class co extends FrameLayout implements te.b, org.telegram.messenger.gs, org.telegram.ui.ActionBar.b6 {
    public org.telegram.ui.ActionBar.k A0;
    public final ImageView E;
    public final ImageView F;
    public final l01 G;
    public final org.telegram.ui.bn H;
    public final bv0[] I;
    public final b9 J;
    public final int K;
    public boolean L;
    public int M;
    public int N;
    public bv0 O;
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
    public final bt0 d0;
    public final yn e;
    public final org.telegram.ui.ActionBar.h6 e0;
    public final boolean f;
    public boolean f0;
    public final n5 g0;
    public final org.telegram.ui.pk h;
    public final n5 h0;
    public final mc i0;
    public final vn j0;
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
    public final o6 s;
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
    public co(Context context, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        boolean z11;
        int i7;
        int i10;
        ?? r72;
        TLRPC.Chat chat;
        int i11;
        bv0[] bv0VarArr;
        int i12;
        nr nrVar = nr.h;
        this.a = new te.a(0, this, nrVar, 320L, false);
        this.d = 42;
        AtomicReference atomicReference = new AtomicReference();
        this.n = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.w = atomicReference2;
        bv0[] bv0VarArr2 = new bv0[6];
        this.I = bv0VarArr2;
        this.J = new b9((org.telegram.ui.ActionBar.h6) null);
        this.K = org.telegram.messenger.k10.t0;
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
        this.j0 = new vn(this, 2);
        this.o0 = false;
        this.p0 = false;
        this.q0 = null;
        this.r0 = null;
        this.e0 = h6Var;
        boolean z12 = g2Var instanceof org.telegram.ui.bn;
        if (z12) {
            this.H = (org.telegram.ui.bn) g2Var;
        }
        org.telegram.ui.bn bnVar = this.H;
        boolean z13 = bnVar != null && ((i12 = bnVar.g4) == 0 || i12 == 8) && !org.telegram.messenger.p10.A(bnVar.j()) && (this.H.j() == null || this.H.j().id != 489000);
        yn ynVar = new yn(this, context, g2Var, z13, h6Var);
        this.e = ynVar;
        if (z12 || (g2Var instanceof y91)) {
            org.telegram.ui.bn bnVar2 = this.H;
            if (bnVar2 == null || ((i7 = bnVar2.g4) != 5 && i7 != 9 && i7 != 6 && i7 != 8 && !org.telegram.messenger.p10.v(bnVar2.f))) {
                this.d0 = new bt0(g2Var);
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
                        ynVar.setVisibility(8);
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
        ynVar.setContentDescription(org.telegram.messenger.hd.N0(2131754797, null));
        ynVar.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        addView(ynVar);
        if (z13) {
            org.telegram.ui.bn bnVar5 = this.H;
            TLRPC.Chat chat2 = bnVar5 != null ? bnVar5.e : null;
            if (chat2 != null && chat2.linked_community_id != 0) {
                c8.ra.b(ynVar, 0.05f, 1.2f);
            }
            final int i14 = 0;
            ynVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xn
                public final /* synthetic */ co b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            co coVar = this.b;
                            if (!coVar.d()) {
                                coVar.e(true, false);
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
        org.telegram.ui.ActionBar.t6.X(pkVar, org.telegram.ui.ActionBar.m6.A8, h6Var);
        pkVar.setTextSize(18);
        pkVar.setGravity(3);
        pkVar.setTypeface(org.telegram.messenger.g0.o());
        pkVar.setLeftDrawableTopPadding(-org.telegram.messenger.g0.L(1.3f));
        pkVar.setCanHideRightDrawable(false);
        pkVar.setRightDrawableOutside(true);
        pkVar.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(12.0f));
        addView(pkVar);
        if (o()) {
            o6 o6Var = new o6(context, true, true, true);
            this.s = o6Var;
            o6Var.b(0.3f, 320L, nrVar);
            o6Var.setEllipsizeByGradient(true);
            int i15 = org.telegram.ui.ActionBar.m6.B8;
            org.telegram.ui.ActionBar.t6.Y(o6Var, i15, h6Var);
            o6Var.setTag(Integer.valueOf(i15));
            o6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            o6Var.setGravity(3);
            o6Var.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
            o6Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
            addView(o6Var);
        } else {
            org.telegram.ui.pk pkVar2 = new org.telegram.ui.pk(context, atomicReference2);
            this.r = pkVar2;
            pkVar2.setEllipsizeByGradient(true);
            int i16 = org.telegram.ui.ActionBar.m6.B8;
            org.telegram.ui.ActionBar.t6.X(pkVar2, i16, h6Var);
            pkVar2.setTag(Integer.valueOf(i16));
            pkVar2.setTextSize(14);
            pkVar2.setGravity(3);
            pkVar2.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
            addView(pkVar2);
        }
        int i17 = 4;
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
            l01 l01Var = new l01(context, h6Var);
            this.G = l01Var;
            imageView2.setImageDrawable(l01Var);
            l01Var.k = true;
            l01Var.b.setColor(0);
            addView(imageView2);
            this.U = z10;
            imageView2.setOnClickListener(new m8(i17, this, h6Var));
            if (z10) {
                imageView2.setContentDescription(org.telegram.messenger.hd.N0(2131745313, null));
            } else {
                imageView2.setContentDescription(org.telegram.messenger.hd.N0(2131754925, null));
            }
            ImageView imageView3 = new ImageView(context);
            this.E = imageView3;
            imageView3.setImageResource(R.drawable.star_small_outline);
            org.telegram.ui.ActionBar.t6.s(imageView3, org.telegram.ui.ActionBar.m6.s8, h6Var, PorterDuff.Mode.SRC_IN);
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
            if (!org.telegram.messenger.p10.A(this.H.j()) && (this.H.j() == null || this.H.j().id != 489000)) {
                r72 = 1;
                final char c10 = 1 == true ? 1 : 0;
                setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xn
                    public final /* synthetic */ co b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (c10) {
                            case 0:
                                co coVar = this.b;
                                if (!coVar.d()) {
                                    coVar.e(true, false);
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
                bv0VarArr2[0] = new m41(r72);
                bv0VarArr2[r72] = new sp(r72);
                bv0VarArr2[2] = new sn0(r72);
                bv0VarArr2[3] = new xe0(h6Var, false);
                bv0VarArr2[4] = new sk0(r72);
                bv0VarArr2[5] = new sp();
                i11 = 0;
                while (true) {
                    bv0VarArr = this.I;
                    if (i11 < bv0VarArr.length) {
                        break;
                    }
                    bv0VarArr[i11].c(chat != null ? r72 : false);
                    i11++;
                }
            }
            r72 = 1;
            chat = this.H.e;
            bv0VarArr2[0] = new m41(r72);
            bv0VarArr2[r72] = new sp(r72);
            bv0VarArr2[2] = new sn0(r72);
            bv0VarArr2[3] = new xe0(h6Var, false);
            bv0VarArr2[4] = new sk0(r72);
            bv0VarArr2[5] = new sp();
            i11 = 0;
            while (true) {
                bv0VarArr = this.I;
                if (i11 < bv0VarArr.length) {
                }
                bv0VarArr[i11].c(chat != null ? r72 : false);
                i11++;
            }
        }
        this.g0 = new n5(org.telegram.messenger.g0.L(24.0f), this.h);
        this.h0 = new n5(org.telegram.messenger.g0.L(17.0f), this.h);
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.bn bnVar = this.H;
        org.telegram.ui.pk pkVar = this.r;
        if (pkVar == null) {
            return;
        }
        int i7 = 0;
        bv0[] bv0VarArr = this.I;
        if (!z10) {
            this.O = null;
            pkVar.setLeftDrawable((Drawable) null);
            pkVar.g(null, null);
            while (i7 < bv0VarArr.length) {
                bv0 bv0Var = bv0VarArr[i7];
                if (bv0Var != null) {
                    bv0Var.e();
                }
                i7++;
            }
            return;
        }
        try {
            int intValue = org.telegram.messenger.np.u1(this.K).G1(bnVar.a(), bnVar.s4).intValue();
            bv0 bv0Var2 = bv0VarArr[intValue];
            if (bv0Var2 == null) {
                return;
            }
            org.telegram.ui.ActionBar.h6 h6Var = this.e0;
            if (intValue == 5) {
                pkVar.g(bv0Var2, "**oo**");
                bv0VarArr[intValue].b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.pa, h6Var));
                pkVar.setLeftDrawable((Drawable) null);
            } else {
                pkVar.g(null, null);
                bv0VarArr[intValue].b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.pa, h6Var));
                pkVar.setLeftDrawable(bv0VarArr[intValue]);
            }
            this.O = bv0VarArr[intValue];
            while (i7 < bv0VarArr.length) {
                bv0 bv0Var3 = bv0VarArr[i7];
                if (bv0Var3 != null) {
                    if (i7 == intValue) {
                        bv0Var3.d();
                    } else {
                        bv0Var3.e();
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
        yn ynVar = this.e;
        if (user == null) {
            if (!org.telegram.messenger.v3.p0(chat)) {
                if (chat != null) {
                    b9Var.p = 1.0f;
                    b9Var.q(chat);
                    if (ynVar != null) {
                        ynVar.setAnimatedEmojiDrawable(null);
                        ynVar.f(chat, b9Var);
                        if (chat.forum) {
                            L = org.telegram.messenger.g0.L(org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).R1().K(-chat.id) ? 11.0f : 16.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(21.0f);
                        }
                        ynVar.setRoundRadius(L);
                        return;
                    }
                    return;
                }
                return;
            }
            long d = bnVar.d();
            int i7 = this.K;
            if (!org.telegram.messenger.v3.A(i7, chat, 24) || d == 0) {
                ynVar.setAnimatedEmojiDrawable(null);
                qg.c.p(i7, chat, b9Var, ynVar);
            } else if (d > 0) {
                TLRPC.User c22 = bnVar.getMessagesController().c2(Long.valueOf(d));
                b9Var.r(c22);
                ynVar.setAnimatedEmojiDrawable(null);
                ynVar.f(c22, b9Var);
            } else {
                TLRPC.Chat O0 = bnVar.getMessagesController().O0(Long.valueOf(-d));
                b9Var.q(O0);
                ynVar.setAnimatedEmojiDrawable(null);
                ynVar.f(O0, b9Var);
            }
            ynVar.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
            return;
        }
        b9Var.r(user);
        if (org.telegram.messenger.p10.A(user)) {
            b9Var.p = 0.8f;
            b9Var.g(12);
            if (ynVar != null) {
                ynVar.setAnimatedEmojiDrawable(null);
                ynVar.j(null, null, b9Var, user);
                return;
            }
            return;
        }
        if (org.telegram.messenger.p10.t(user)) {
            b9Var.p = 0.8f;
            b9Var.g(21);
            if (ynVar != null) {
                ynVar.setAnimatedEmojiDrawable(null);
                ynVar.j(null, null, b9Var, user);
                return;
            }
            return;
        }
        if (org.telegram.messenger.p10.C(user) && bnVar.g4 == 3) {
            b9Var.p = 0.8f;
            b9Var.g(22);
            if (ynVar != null) {
                ynVar.setAnimatedEmojiDrawable(null);
                ynVar.j(null, null, b9Var, user);
                return;
            }
            return;
        }
        if (!org.telegram.messenger.p10.C(user)) {
            b9Var.p = 1.0f;
            if (ynVar != null) {
                ynVar.setAnimatedEmojiDrawable(null);
                ynVar.a.j0(user, b9Var, null, true, 3, false);
                return;
            }
            return;
        }
        b9Var.p = 0.8f;
        b9Var.g(1);
        if (ynVar != null) {
            ynVar.setAnimatedEmojiDrawable(null);
            ynVar.j(null, null, b9Var, user);
        }
    }

    public final n5 c(long j3) {
        if (j3 == 0) {
            return null;
        }
        n5 n5Var = this.h0;
        n5Var.j(j3, false);
        n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.qi, this.e0)));
        int L = org.telegram.messenger.g0.L(1.0f);
        n5Var.J = 0;
        n5Var.K = L;
        return n5Var;
    }

    public boolean d() {
        return false;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.T1) {
            int connectionState = ConnectionsManager.getInstance(this.K).getConnectionState();
            if (this.W != connectionState) {
                this.W = connectionState;
                l();
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.ls.l4) {
            if (i7 == org.telegram.messenger.ls.i3) {
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
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - org.telegram.messenger.g0.N(0.33f), imageView.getScaleX() * org.telegram.messenger.g0.N(12.0f), org.telegram.ui.ActionBar.m6.Fm);
                }
                if (z10) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * org.telegram.messenger.g0.N(7.66f), org.telegram.ui.ActionBar.m6.Fm);
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
        org.telegram.messenger.fc D;
        boolean z13;
        ch chVar;
        Drawable t6;
        TLRPC.User c22;
        yn ynVar = this.e;
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
            imageReceiver = ynVar.getImageReceiver();
            str = imageReceiver.R;
            D = org.telegram.messenger.fc.D();
            if (str != null && !D.J(str, false)) {
                t6 = imageReceiver.t();
                if ((t6 instanceof BitmapDrawable) && !(t6 instanceof c6)) {
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
            bt0 bt0Var = this.d0;
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
                    ProfileActivity profileActivity = new ProfileActivity(bundle, bt0Var);
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
            if (org.telegram.messenger.p10.C(j3)) {
                org.telegram.ui.ActionBar.g2 g2Var = bt0Var.x;
                int[] iArr = bt0Var.c;
                int i7 = 0;
                while (true) {
                    if (i7 < iArr.length) {
                        if (iArr[i7] > 0) {
                            break;
                        } else {
                            i7++;
                        }
                    } else if (!bt0Var.f && (g2Var == null || bt0Var.r != g2Var.getUserConfig().e() || bt0Var.s != 0 || !g2Var.getMessagesController().I1().e())) {
                        return;
                    }
                }
                bundle2.putLong("dialog_id", bnVar.a());
                if (bnVar.g4 == 3) {
                    bundle2.putLong("topic_id", bnVar.e9());
                }
                k90 k90Var = new k90(bundle2, bt0Var);
                k90Var.c = bnVar.r8;
                bnVar.presentFragment(k90Var, z11);
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
            if (org.telegram.messenger.p10.v(j3)) {
                bundle2.putLong("topic_id", bnVar.d());
            }
            ai.m0 m0Var = bnVar.Z1;
            bundle2.putBoolean("reportSpam", (m0Var == null || (chVar = bnVar.b1) == null || !chVar.e(m0Var) || bnVar.c2.getVisibility() == 8) ? false : true);
            bundle2.putInt("actionBarColor", org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.s8, this.e0));
            ProfileActivity profileActivity2 = new ProfileActivity(bundle2, bt0Var);
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
        imageReceiver = ynVar.getImageReceiver();
        str = imageReceiver.R;
        D = org.telegram.messenger.fc.D();
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
        l01 l01Var = this.G;
        if (l01Var == null) {
            return;
        }
        boolean z11 = this.n0;
        if (i7 != 0 || this.U) {
            te.a aVar = this.a;
            if (z11) {
                aVar.a(false, z10);
            } else {
                aVar.a(true, z10);
                l01Var.b(i7);
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

    public bt0 getSharedMediaPreloader() {
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
        o6 o6Var = this.s;
        if (o6Var != null) {
            return o6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.x;
    }

    public org.telegram.ui.ActionBar.m5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        org.telegram.ui.pk pkVar = this.h;
        float max = pkVar != null ? Math.max(0.0f, pkVar.getExactWidthIncludeDrawables()) : 0.0f;
        org.telegram.ui.pk pkVar2 = this.r;
        if (pkVar2 != null) {
            max = Math.max(max, pkVar2.getExactWidthIncludeDrawables());
        }
        yn ynVar = this.e;
        return (int) (max + ((ynVar == null || ynVar.getVisibility() != 0) ? org.telegram.messenger.g0.L(34.0f) : org.telegram.messenger.g0.L(70.0f)));
    }

    public final void h(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.EmojiStatus emojiStatus, boolean z14) {
        if (charSequence != null) {
            charSequence = org.telegram.messenger.j6.m(charSequence, this.h.getPaint().getFontMetricsInt(), false, null, 0);
        }
        this.h.k(charSequence);
        this.p0 = false;
        if (z10 || z11) {
            this.p0 = true;
            if (!(this.h.getRightDrawable() instanceof vk0)) {
                vk0 vk0Var = new vk0(!z10 ? 1 : 0);
                vk0Var.b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, this.e0));
                this.h.j(vk0Var);
                this.r0 = org.telegram.messenger.hd.N0(2131745666, null);
                this.o0 = true;
            }
        } else if (z12) {
            Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
            this.t0 = mutate;
            int i7 = org.telegram.ui.ActionBar.m6.qi;
            org.telegram.ui.ActionBar.h6 h6Var = this.e0;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.t6.x(this, mutate, i7, h6Var, mode);
            Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
            this.u0 = mutate2;
            org.telegram.ui.ActionBar.t6.x(this, mutate2, org.telegram.ui.ActionBar.m6.ri, this.e0, mode);
            this.h.j(new oq(this.t0, this.u0));
            this.o0 = true;
            this.r0 = org.telegram.messenger.hd.N0(2131754738, null);
        } else if (this.h.getRightDrawable() instanceof vk0) {
            this.h.j(null);
            this.o0 = false;
            this.r0 = null;
        }
        if (z13 || org.telegram.messenger.n5.f(emojiStatus) != 0) {
            if ((this.h.getRightDrawable() instanceof o5) && (((o5) this.h.getRightDrawable()).a instanceof p5)) {
                ((p5) ((o5) this.h.getRightDrawable()).a).n(this.h);
            }
            if (org.telegram.messenger.n5.f(emojiStatus) != 0) {
                this.g0.j(org.telegram.messenger.n5.f(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = org.telegram.messenger.t0.b.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.s0 = mutate3;
                org.telegram.ui.ActionBar.t6.x(this, mutate3, org.telegram.ui.ActionBar.m6.qi, this.e0, PorterDuff.Mode.MULTIPLY);
                this.g0.g(this.s0, z14);
            } else {
                this.g0.g(null, z14);
            }
            this.g0.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.qi, this.e0)));
            this.h.i(this.g0);
            this.o0 = false;
            this.q0 = org.telegram.messenger.hd.N0(2131754801, null);
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
        org.telegram.ui.ActionBar.t6.q(pkVar);
        org.telegram.ui.pk pkVar2 = this.r;
        org.telegram.ui.ActionBar.t6.q(pkVar2);
        pkVar.setTextColor(i7);
        pkVar2.setTextColor(i10);
        pkVar2.setTag(Integer.valueOf(i10));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.pk pkVar = this.h;
        pkVar.setLeftDrawable(drawable);
        if (!this.o0 && !this.p0) {
            if (drawable2 != null) {
                this.r0 = org.telegram.messenger.hd.N0(2131747707, null);
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
        boolean A = org.telegram.messenger.p10.A(user);
        yn ynVar = this.e;
        if (A) {
            b9Var.g(12);
            b9Var.p = 0.8f;
            if (ynVar != null) {
                ynVar.j(null, null, b9Var, user);
                return;
            }
            return;
        }
        if (org.telegram.messenger.p10.t(user)) {
            b9Var.g(21);
            b9Var.p = 0.8f;
            if (ynVar != null) {
                ynVar.j(null, null, b9Var, user);
                return;
            }
            return;
        }
        if (!org.telegram.messenger.p10.C(user) || z10) {
            b9Var.p = 1.0f;
            if (ynVar != null) {
                ynVar.f(user, b9Var);
                return;
            }
            return;
        }
        b9Var.g(1);
        b9Var.p = 0.8f;
        if (ynVar != null) {
            ynVar.j(null, null, b9Var, user);
        }
    }

    public final void l() {
        int i7 = this.W;
        String N0 = i7 == 2 ? org.telegram.messenger.hd.N0(2131742967, null) : i7 == 1 ? org.telegram.messenger.hd.N0(2131751797, null) : i7 == 5 ? org.telegram.messenger.hd.N0(2131743565, null) : i7 == 4 ? org.telegram.messenger.hd.N0(2131751795, null) : null;
        org.telegram.ui.ActionBar.h6 h6Var = this.e0;
        o6 o6Var = this.s;
        org.telegram.ui.pk pkVar = this.r;
        if (N0 == null) {
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
                            org.telegram.ui.ActionBar.t6.X(pkVar, i10, h6Var);
                            pkVar.setTag(Integer.valueOf(this.b0));
                        }
                    }
                } else if (o6Var != null) {
                    o6Var.c(charSequence, !org.telegram.messenger.hd.a0, true);
                    this.a0 = null;
                    Integer num2 = this.c0;
                    if (num2 != null) {
                        o6Var.setTextColor(num2.intValue());
                    } else {
                        int i11 = this.b0;
                        if (i11 >= 0) {
                            org.telegram.ui.ActionBar.t6.Y(o6Var, i11, h6Var);
                            o6Var.setTag(Integer.valueOf(this.b0));
                        }
                    }
                }
            }
        } else if (pkVar != null) {
            if (this.a0 == null) {
                this.a0 = pkVar.getText();
            }
            pkVar.k(N0);
            Integer num3 = this.c0;
            if (num3 != null) {
                pkVar.setTextColor(num3.intValue());
            } else {
                int i12 = org.telegram.ui.ActionBar.m6.B8;
                org.telegram.ui.ActionBar.t6.X(pkVar, i12, h6Var);
                pkVar.setTag(Integer.valueOf(i12));
            }
        } else if (o6Var != null) {
            if (this.a0 == null) {
                this.a0 = o6Var.getText();
            }
            o6Var.c(N0, !org.telegram.messenger.hd.a0, true);
            Integer num4 = this.c0;
            if (num4 != null) {
                o6Var.setTextColor(num4.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.m6.B8;
                org.telegram.ui.ActionBar.t6.Y(o6Var, i13, h6Var);
                o6Var.setTag(Integer.valueOf(i13));
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
            TLRPC.User c22 = org.telegram.messenger.np.u1(i7).c2(Long.valueOf(chatFull.participants.participants.get(i10).user_id));
            if (c22 != null && (userStatus = c22.status) != null && ((userStatus.expires > currentTime || c22.id == org.telegram.messenger.k10.i(i7).e()) && c22.status.expires > 10000)) {
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
        org.telegram.ui.ActionBar.h6 h6Var = this.e0;
        boolean[] zArr = this.S;
        o6 o6Var = this.s;
        org.telegram.ui.pk pkVar = this.r;
        org.telegram.ui.pk pkVar2 = this.h;
        int i16 = this.K;
        org.telegram.ui.bn bnVar = this.H;
        if (bnVar == null) {
            return;
        }
        if (bnVar.g4 == 6) {
            String str = bnVar.e4.link;
            kg.z[] zVarArr = kg.z.e;
            if (str.startsWith("https://")) {
                str = str.substring(8);
            }
            setSubtitle(str);
            return;
        }
        TLRPC.User j3 = bnVar.j();
        TLRPC.Chat chat = bnVar.e;
        boolean z13 = org.telegram.messenger.p10.C(j3) && bnVar.g4 == 0 && bnVar.getMessagesController().I1().c() >= 3 && (this.v0 || org.telegram.messenger.np.g1().getInt("savedmsgschatshint", 0) < 3);
        if (((org.telegram.messenger.p10.C(j3) && !z13) || org.telegram.messenger.p10.A(j3) || ((j3 != null && j3.id == 489000) || ((i7 = bnVar.g4) != 0 && i7 != 8))) && bnVar.g4 != 3) {
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
                org.telegram.messenger.np.g1().edit().putInt("savedmsgschatshint", org.telegram.messenger.np.g1().getInt("savedmsgschatshint", i15) + 1).apply();
                this.v0 = true;
            }
        }
        CharSequence F1 = org.telegram.messenger.np.u1(i16).F1(bnVar.a(), bnVar.s4, false);
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
                    this.R.addListener(new bo(this, 1));
                    this.R.setDuration(180L);
                    this.R.start();
                } else {
                    pkVar2.setTranslationY(0.0f);
                    getSubtitleTextView().setAlpha(1.0f);
                }
            }
            Integer G1 = org.telegram.messenger.np.u1(i16).G1(bnVar.a(), bnVar.s4);
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
                    this.R.addListener(new bo(this, 0));
                    this.R.setDuration(180L);
                    this.R.start();
                    return;
                }
            }
            setTypingAnimation(false);
            int i17 = bnVar.g4;
            if (i17 != 8) {
                if (i17 == 3) {
                    org.telegram.messenger.qv I1 = bnVar.getMessagesController().I1();
                    long e92 = bnVar.e9();
                    ArrayList arrayList = I1.j;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= arrayList.size()) {
                            i14 = 0;
                            break;
                        }
                        org.telegram.messenger.pv pvVar = (org.telegram.messenger.pv) arrayList.get(i18);
                        if (pvVar.a == e92) {
                            i14 = pvVar.e;
                            break;
                        }
                        i18++;
                    }
                    charSequence = org.telegram.messenger.hd.G(Math.max(1, i14), "SavedMessagesCount", new Object[0]);
                } else {
                    if (bnVar.x4 && chat != null) {
                        TLRPC.TL_forumTopic f10 = org.telegram.messenger.np.u1(i16).t7.f(chat.id, bnVar.d());
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
                            G = org.telegram.messenger.hd.G(i13, "messages", objArr);
                        } else {
                            Object[] objArr2 = new Object[i12];
                            objArr2[0] = chat.title;
                            G = org.telegram.messenger.hd.a0(null, null, 2131743767, objArr2);
                        }
                    } else if (chat != null) {
                        TLRPC.ChatFull chatFull = bnVar.r8;
                        int i19 = this.V;
                        if (org.telegram.messenger.v3.T(chat)) {
                            if (chatFull == null || (i11 = chatFull.participants_count) == 0) {
                                G = chat.megagroup ? chatFull == null ? org.telegram.messenger.hd.N0(2131748586, null).toLowerCase() : chat.has_geo ? org.telegram.messenger.hd.N0(2131748449, null).toLowerCase() : org.telegram.messenger.v3.t0(chat) ? org.telegram.messenger.hd.N0(2131748445, null).toLowerCase() : org.telegram.messenger.hd.N0(2131748448, null).toLowerCase() : org.telegram.messenger.v3.t0(chat) ? org.telegram.messenger.hd.N0(2131752306, null).toLowerCase() : org.telegram.messenger.hd.N0(2131752317, null).toLowerCase();
                            } else if (chat.megagroup) {
                                G = i19 > 1 ? a8.p0.E(org.telegram.messenger.hd.G(i11, "Members", new Object[0]), ", ", org.telegram.messenger.hd.G(Math.min(i19, chatFull.participants_count), "OnlineCount", new Object[0])) : org.telegram.messenger.hd.G(i11, "Members", new Object[0]);
                            } else {
                                int[] iArr = new int[1];
                                boolean C1 = org.telegram.messenger.g0.C1();
                                int i20 = chatFull.participants_count;
                                if (C1) {
                                    iArr[0] = i20;
                                    S = String.valueOf(i20);
                                } else {
                                    S = org.telegram.messenger.hd.S(iArr, i20);
                                }
                                G = chat.megagroup ? org.telegram.messenger.hd.G(iArr[0], "Members", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S) : org.telegram.messenger.hd.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                            }
                        } else if (org.telegram.messenger.v3.k0(chat)) {
                            G = org.telegram.messenger.hd.N0(2131742563, null);
                        } else if (org.telegram.messenger.v3.l0(chat)) {
                            G = org.telegram.messenger.hd.N0(2131742569, null);
                        } else {
                            int i21 = chat.participants_count;
                            if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                i21 = chatParticipants.participants.size();
                            }
                            G = (i19 <= 1 || i21 == 0) ? org.telegram.messenger.hd.G(i21, "Members", new Object[0]) : a8.p0.E(org.telegram.messenger.hd.G(i21, "Members", new Object[0]), ", ", org.telegram.messenger.hd.G(i19, "OnlineCount", new Object[0]));
                        }
                    } else {
                        if (j3 != null) {
                            TLRPC.User c22 = org.telegram.messenger.np.u1(i16).c2(Long.valueOf(j3.id));
                            if (c22 != null) {
                                j3 = c22;
                            }
                            if (!org.telegram.messenger.p10.A(j3)) {
                                long j10 = j3.id;
                                if (j10 != 489000) {
                                    if (j10 == org.telegram.messenger.k10.i(i16).e()) {
                                        charSequence = z14 ? org.telegram.messenger.g0.H2(org.telegram.messenger.hd.N0(2131745696, null), false) : org.telegram.messenger.hd.N0(2131752177, null);
                                    } else {
                                        long j11 = j3.id;
                                        if (j11 == 333000 || j11 == 777000 || j11 == 42777) {
                                            z11 = false;
                                            charSequence = org.telegram.messenger.hd.N0(2131745365, null);
                                        } else if (org.telegram.messenger.np.L2(j3)) {
                                            charSequence = org.telegram.messenger.hd.N0(2131744082, null);
                                        } else {
                                            boolean z15 = j3.bot;
                                            if (z15 && (i10 = j3.bot_active_users) != 0) {
                                                charSequence = org.telegram.messenger.hd.H(',', "BotUsers", i10);
                                            } else if (z15) {
                                                charSequence = org.telegram.messenger.p10.e(j3);
                                            } else {
                                                zArr[0] = false;
                                                charSequence = org.telegram.messenger.hd.d0(i16, j3, zArr, this.f0 ? this.T : null);
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
                charSequence = org.telegram.messenger.hd.N0(2131752207, null);
                z12 = false;
            } else {
                if (bnVar.d() == 0) {
                    org.telegram.messenger.f00 f00Var = bnVar.getMessagesController().t7;
                    long j12 = -bnVar.a();
                    int size = (!f00Var.e(j12) || (l10 = f00Var.l(j12)) == null) ? 0 : l10.size();
                    G = size > 0 ? org.telegram.messenger.hd.H(',', "Chats", size) : org.telegram.messenger.hd.N0(2131752207, null);
                } else {
                    TLRPC.TL_forumTopic f11 = org.telegram.messenger.np.u1(i16).t7.f(chat.id, bnVar.d());
                    int i22 = f11 != null ? f11.totalMessagesCount : 0;
                    G = i22 > 0 ? org.telegram.messenger.hd.G(i22, "messages", Integer.valueOf(i22)) : org.telegram.messenger.hd.a0(null, null, 2131743767, qg.c.j(i16, chat, false));
                }
                charSequence = G;
                z12 = false;
            }
        }
        this.b0 = z12 ? org.telegram.ui.ActionBar.m6.pa : org.telegram.ui.ActionBar.m6.B8;
        if (this.a0 != null) {
            this.a0 = charSequence;
        } else if (pkVar != null) {
            pkVar.k(charSequence);
            Integer num = this.c0;
            if (num == null) {
                org.telegram.ui.ActionBar.t6.X(pkVar, this.b0, h6Var);
                pkVar.setTag(Integer.valueOf(this.b0));
            } else {
                pkVar.setTextColor(num.intValue());
            }
        } else {
            o6Var.c(charSequence, z10, true);
            Integer num2 = this.c0;
            if (num2 == null) {
                org.telegram.ui.ActionBar.t6.Y(o6Var, this.b0, h6Var);
                o6Var.setTag(Integer.valueOf(this.b0));
            } else {
                o6Var.setTextColor(num2.intValue());
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
            org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.T1);
            org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.l4);
            if (bnVar.g4 == 3) {
                org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.i3);
            }
            this.W = ConnectionsManager.getInstance(i7).getConnectionState();
            l();
        }
        n5 n5Var = this.g0;
        if (n5Var != null) {
            n5Var.a();
        }
        n5 n5Var2 = this.h0;
        if (n5Var2 != null) {
            n5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.bn bnVar = this.H;
        if (bnVar != null) {
            int i7 = this.K;
            org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.T1);
            org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.l4);
            if (bnVar.g4 == 3) {
                org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.i3);
            }
        }
        n5 n5Var = this.g0;
        if (n5Var != null) {
            n5Var.b();
        }
        n5 n5Var2 = this.h0;
        if (n5Var2 != null) {
            n5Var2.b();
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
            o6 o6Var = this.s;
            if (o6Var != null) {
                sb2.append(o6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.hd.N0(2131747592, null)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        yn ynVar = this.e;
        int measuredHeight = (((currentActionBarHeight - ynVar.getMeasuredHeight()) - 2) / 2) + (this.L ? org.telegram.messenger.g0.m : 0);
        int L = org.telegram.messenger.g0.L(this.m0 ? 23.66f : 24.0f) + measuredHeight;
        int i13 = this.M + 1;
        int i14 = measuredHeight + 1;
        ynVar.layout(i13, i14, ynVar.getMeasuredWidth() + i13, ynVar.getMeasuredHeight() + i14);
        int L2 = this.M + org.telegram.messenger.g0.L(ynVar.getVisibility() == 0 ? this.m0 ? 49.66f : 55.0f : this.m0 ? 13.0f : 1.0f) + this.N;
        org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) this.n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.pk pkVar = this.h;
        if (visibility != 8) {
            pkVar.layout(L2, (org.telegram.messenger.g0.L(1.66f) + measuredHeight) - pkVar.getPaddingTop(), pkVar.getMeasuredWidth() + L2, pkVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.66f) + (pkVar.getTextHeight() + measuredHeight)) - pkVar.getPaddingTop()));
            if (m5Var != null) {
                m5Var.layout(L2, org.telegram.messenger.g0.L(1.66f) + measuredHeight, m5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(1.66f) + m5Var.getTextHeight() + measuredHeight);
            }
        } else {
            pkVar.layout(L2, (org.telegram.messenger.g0.L(11.0f) + measuredHeight) - pkVar.getPaddingTop(), pkVar.getMeasuredWidth() + L2, pkVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (pkVar.getTextHeight() + measuredHeight)) - pkVar.getPaddingTop()));
            if (m5Var != null) {
                m5Var.layout(L2, org.telegram.messenger.g0.L(10.0f) + measuredHeight, m5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(10.0f) + m5Var.getTextHeight() + measuredHeight);
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
            o6 o6Var = this.s;
            if (o6Var != null) {
                o6Var.layout(L2, L, o6Var.getMeasuredWidth() + L2, o6Var.getTextHeight() + L);
            }
        }
        org.telegram.ui.ActionBar.m5 m5Var2 = (org.telegram.ui.ActionBar.m5) this.w.get();
        if (m5Var2 != null) {
            m5Var2.layout(L2, L, m5Var2.getMeasuredWidth() + L2, m5Var2.getTextHeight() + L);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        yn ynVar = this.e;
        int L = size - org.telegram.messenger.g0.L((ynVar.getVisibility() == 0 ? 54 : 0) + 16);
        float f10 = this.d;
        ynVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) - 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) - 2, TLObject.FLAG_30));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_31);
        org.telegram.ui.pk pkVar = this.h;
        pkVar.measure(makeMeasureSpec, makeMeasureSpec2);
        o6 o6Var = this.s;
        org.telegram.ui.pk pkVar2 = this.r;
        if (pkVar2 != null) {
            pkVar2.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
        } else if (o6Var != null) {
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
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
            View view = (org.telegram.ui.ActionBar.m5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(getContext());
            atomicReference.set(m5Var);
            int i12 = org.telegram.ui.ActionBar.m6.A8;
            org.telegram.ui.ActionBar.h6 h6Var = this.e0;
            org.telegram.ui.ActionBar.t6.X(m5Var, i12, h6Var);
            m5Var.setTextSizePx(org.telegram.messenger.g0.L(this.m0 ? 17.5f : 18.0f));
            m5Var.setGravity(3);
            m5Var.setTypeface(org.telegram.messenger.g0.o());
            m5Var.setLeftDrawableTopPadding(-org.telegram.messenger.g0.L(1.3f));
            m5Var.i(pkVar.getRightDrawable());
            m5Var.j(pkVar.getRightDrawable2());
            m5Var.setRightDrawableOutside(pkVar.getRightDrawableOutside());
            m5Var.setLeftDrawable(pkVar.getLeftDrawable());
            m5Var.l(pkVar.getText(), false);
            ViewPropertyAnimator duration = m5Var.animate().alpha(0.0f).setDuration(350L);
            nr nrVar = nr.h;
            duration.setInterpolator(nrVar).withEndAction(new vn(this, 0)).start();
            addView(m5Var);
            AtomicReference atomicReference2 = this.w;
            View view2 = (org.telegram.ui.ActionBar.m5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(getContext());
            atomicReference2.set(m5Var2);
            int i13 = org.telegram.ui.ActionBar.m6.B8;
            org.telegram.ui.ActionBar.t6.X(m5Var2, i13, h6Var);
            m5Var2.setTag(Integer.valueOf(i13));
            m5Var2.setTextSizePx(org.telegram.messenger.g0.L(this.m0 ? 13.5f : 14.0f));
            m5Var2.setGravity(3);
            if (pkVar2 != null) {
                m5Var2.l(pkVar2.getText(), false);
            } else if (o6Var != null) {
                m5Var2.l(o6Var.getText(), false);
            }
            m5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(nrVar).withEndAction(new vn(this, 1)).start();
            addView(m5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.m5 m5Var3 = (org.telegram.ui.ActionBar.m5) atomicReference.get();
        if (m5Var3 != null) {
            m5Var3.measure(org.telegram.messenger.o10.c((ynVar.getVisibility() == 0 ? 54 : 0) + 16, this.Q, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_31));
        }
        this.P = size;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        mc mcVar = this.i0;
        vn vnVar = this.j0;
        if (action == 0 && a()) {
            this.k0 = true;
            mcVar.c(true);
            org.telegram.messenger.g0.r(vnVar);
            org.telegram.messenger.g0.h3(vnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.k0) {
            mcVar.c(false);
            this.k0 = false;
            if (isClickable() && motionEvent.getAction() == 1) {
                e(false, false);
            }
            org.telegram.messenger.g0.r(vnVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final PorterDuffColorFilter p() {
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.qi, this.e0);
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
        yn ynVar = this.e;
        if (ynVar != null) {
            ynVar.f(chat, b9Var);
            ynVar.setRoundRadius(org.telegram.messenger.g0.L(org.telegram.messenger.v3.c0(chat) ? (chat == null || !org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).R1().K(-chat.id)) ? 16.0f : 11.0f : 21.0f));
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
                o6 o6Var = this.s;
                if (o6Var != null) {
                    o6Var.setText(charSequence);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        bv0 bv0Var = this.O;
        org.telegram.ui.ActionBar.h6 h6Var = this.e0;
        if (bv0Var != null) {
            bv0Var.b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.pa, h6Var));
        }
        Drawable drawable = this.s0;
        if (drawable != null) {
            drawable.setColorFilter(p());
        }
        n5 n5Var = this.h0;
        if (n5Var != null) {
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.qi, h6Var)));
        }
        n5 n5Var2 = this.g0;
        if (n5Var2 != null) {
            n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.qi, h6Var)));
        }
        Drawable drawable2 = this.t0;
        if (drawable2 != null) {
            drawable2.setColorFilter(p());
        }
        if (this.u0 != null) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.ri, h6Var);
            if (this.x0 == null || w02 != this.z0) {
                this.z0 = w02;
                this.x0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
            }
            this.u0.setColorFilter(this.x0);
        }
        org.telegram.ui.pk pkVar = this.h;
        if (pkVar != null) {
            try {
                if (pkVar.getRightDrawable2() instanceof vk0) {
                    ((vk0) pkVar.getRightDrawable2()).b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, h6Var));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void f() {
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
