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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class kn extends FrameLayout implements te.b, org.telegram.messenger.ls, org.telegram.ui.ActionBar.b6 {
    public final ImageView D;
    public final ImageView E;
    public final b01 F;
    public final org.telegram.ui.cn G;
    public final qu0[] H;
    public final w8 I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public qu0 N;
    public int O;
    public int P;
    public AnimatorSet Q;
    public final boolean[] R;
    public final boolean[] S;
    public final boolean T;
    public int U;
    public int V;
    public CharSequence W;
    public final te.a a;
    public int a0;
    public boolean b;
    public Integer b0;
    public Integer c;
    public final rs0 c0;
    public final int d;
    public final org.telegram.ui.ActionBar.g6 d0;
    public final gn e;
    public boolean e0;
    public final boolean f;
    public final g5 f0;
    public final g5 g0;
    public final org.telegram.ui.qk h;
    public final ic h0;
    public final dn i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final AtomicReference n;
    public boolean n0;
    public boolean o0;
    public String p0;
    public String q0;
    public final org.telegram.ui.qk r;
    public Drawable r0;
    public final j6 s;
    public Drawable s0;
    public Drawable t0;
    public boolean u0;
    public PorterDuffColorFilter v0;
    public final AtomicReference w;
    public PorterDuffColorFilter w0;
    public final ImageView x;
    public int x0;
    public final ImageView y;
    public int y0;
    public org.telegram.ui.ActionBar.k z0;

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0106, code lost:
    
        if (r3 != 6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02ce, code lost:
    
        if (r0.u4 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00f8, code lost:
    
        if (r3.u4 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0340 A[EDGE_INSN: B:65:0x0340->B:73:0x0340 BREAK  A[LOOP:0: B:56:0x032e->B:62:0x033a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010f  */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kn(Context context, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        boolean z10;
        int i7;
        int i10;
        ?? r72;
        TLRPC.Chat chat;
        int i11;
        qu0[] qu0VarArr;
        int i12;
        xq xqVar = xq.h;
        this.a = new te.a(0, this, xqVar, 320L, false);
        this.d = 42;
        AtomicReference atomicReference = new AtomicReference();
        this.n = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.w = atomicReference2;
        qu0[] qu0VarArr2 = new qu0[6];
        this.H = qu0VarArr2;
        this.I = new w8((org.telegram.ui.ActionBar.g6) null);
        this.J = org.telegram.messenger.p10.s0;
        this.K = true;
        this.L = org.telegram.messenger.g0.L(8.0f);
        this.M = 0;
        this.O = -1;
        this.P = -1;
        this.R = new boolean[1];
        this.S = new boolean[1];
        this.U = -1;
        this.a0 = -1;
        this.e0 = false;
        this.h0 = new ic(this);
        this.i0 = new dn(this, 2);
        this.n0 = false;
        this.o0 = false;
        this.p0 = null;
        this.q0 = null;
        this.d0 = g6Var;
        boolean z11 = f2Var instanceof org.telegram.ui.cn;
        if (z11) {
            this.G = (org.telegram.ui.cn) f2Var;
        }
        org.telegram.ui.cn cnVar = this.G;
        boolean z12 = cnVar != null && ((i12 = cnVar.f4) == 0 || i12 == 8) && !org.telegram.messenger.t10.z(cnVar.j()) && (this.G.j() == null || this.G.j().id != 489000);
        gn gnVar = new gn(this, context, f2Var, z12, g6Var);
        this.e = gnVar;
        if (z11 || (f2Var instanceof y91)) {
            org.telegram.ui.cn cnVar2 = this.G;
            if (cnVar2 == null || ((i7 = cnVar2.f4) != 5 && i7 != 9 && i7 != 6 && i7 != 8 && !org.telegram.messenger.t10.u(cnVar2.f))) {
                this.c0 = new rs0(f2Var);
            }
            org.telegram.ui.cn cnVar3 = this.G;
            if (cnVar3 != null) {
                if (cnVar3.ea()) {
                    org.telegram.ui.cn cnVar4 = this.G;
                    if (cnVar4.l4 != null) {
                    }
                    z10 = true;
                    this.f = z10;
                    if (z10) {
                        gnVar.setVisibility(8);
                    }
                }
                int i13 = this.G.f4;
                if (i13 != 2) {
                    if (i13 != 5) {
                        if (i13 != 9) {
                        }
                    }
                }
                z10 = true;
                this.f = z10;
                if (z10) {
                }
            }
            z10 = false;
            this.f = z10;
            if (z10) {
            }
        }
        gnVar.setContentDescription(org.telegram.messenger.id.M0(2131754798, null));
        gnVar.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        addView(gnVar);
        if (z12) {
            org.telegram.ui.cn cnVar5 = this.G;
            TLRPC.Chat chat2 = cnVar5 != null ? cnVar5.e : null;
            if (chat2 != null && chat2.linked_community_id != 0) {
                c8.ka.b(gnVar, 0.05f, 1.2f);
            }
            final int i14 = 0;
            gnVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fn
                public final /* synthetic */ kn b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            kn knVar = this.b;
                            if (!knVar.d()) {
                                knVar.e(true, false);
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
        org.telegram.ui.qk qkVar = new org.telegram.ui.qk(context, atomicReference);
        this.h = qkVar;
        qkVar.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.s6.X(qkVar, org.telegram.ui.ActionBar.l6.A8, g6Var);
        qkVar.setTextSize(18);
        qkVar.setGravity(3);
        qkVar.setTypeface(org.telegram.messenger.g0.o());
        qkVar.setLeftDrawableTopPadding(-org.telegram.messenger.g0.L(1.3f));
        qkVar.setCanHideRightDrawable(false);
        qkVar.setRightDrawableOutside(true);
        qkVar.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(12.0f));
        addView(qkVar);
        if (o()) {
            j6 j6Var = new j6(context, true, true, true);
            this.s = j6Var;
            j6Var.b(0.3f, 320L, xqVar);
            j6Var.setEllipsizeByGradient(true);
            int i15 = org.telegram.ui.ActionBar.l6.B8;
            org.telegram.ui.ActionBar.s6.Y(j6Var, i15, g6Var);
            j6Var.setTag(Integer.valueOf(i15));
            j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            j6Var.setGravity(3);
            j6Var.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
            j6Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
            addView(j6Var);
        } else {
            org.telegram.ui.qk qkVar2 = new org.telegram.ui.qk(context, atomicReference2);
            this.r = qkVar2;
            qkVar2.setEllipsizeByGradient(true);
            int i16 = org.telegram.ui.ActionBar.l6.B8;
            org.telegram.ui.ActionBar.s6.X(qkVar2, i16, g6Var);
            qkVar2.setTag(Integer.valueOf(i16));
            qkVar2.setTextSize(14);
            qkVar2.setGravity(3);
            qkVar2.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
            addView(qkVar2);
        }
        if (this.G != null) {
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
            b01 b01Var = new b01(context, g6Var);
            this.F = b01Var;
            imageView2.setImageDrawable(b01Var);
            b01Var.k = true;
            b01Var.b.setColor(0);
            addView(imageView2);
            this.T = z9;
            imageView2.setOnClickListener(new lk(2, this, g6Var));
            if (z9) {
                imageView2.setContentDescription(org.telegram.messenger.id.M0(2131745509, null));
            } else {
                imageView2.setContentDescription(org.telegram.messenger.id.M0(2131754925, null));
            }
            ImageView imageView3 = new ImageView(context);
            this.D = imageView3;
            imageView3.setImageResource(R.drawable.star_small_outline);
            org.telegram.ui.ActionBar.s6.s(imageView3, org.telegram.ui.ActionBar.l6.s8, g6Var, PorterDuff.Mode.SRC_IN);
            imageView3.setAlpha(0.0f);
            imageView3.setVisibility(4);
            imageView3.setScaleY(0.0f);
            imageView3.setScaleX(0.0f);
            addView(imageView3);
            ImageView imageView4 = new ImageView(context);
            this.E = imageView4;
            imageView4.setImageResource(R.drawable.star_small_inner);
            imageView4.setAlpha(0.0f);
            imageView4.setVisibility(4);
            imageView4.setScaleY(0.0f);
            imageView4.setScaleX(0.0f);
            addView(imageView4);
        }
        org.telegram.ui.cn cnVar6 = this.G;
        if (cnVar6 != null && ((i10 = cnVar6.f4) == 0 || i10 == 8 || i10 == 3)) {
            if (cnVar6.ea()) {
                org.telegram.ui.cn cnVar7 = this.G;
                if (!cnVar7.v4) {
                }
            }
            if (!org.telegram.messenger.t10.z(this.G.j()) && (this.G.j() == null || this.G.j().id != 489000)) {
                r72 = 1;
                final char c10 = 1 == true ? 1 : 0;
                setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fn
                    public final /* synthetic */ kn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (c10) {
                            case 0:
                                kn knVar = this.b;
                                if (!knVar.d()) {
                                    knVar.e(true, false);
                                    break;
                                }
                                break;
                            default:
                                this.b.e(false, false);
                                break;
                        }
                    }
                });
                chat = this.G.e;
                qu0VarArr2[0] = new w31(r72);
                qu0VarArr2[r72] = new ap(r72);
                qu0VarArr2[2] = new en0(r72);
                qu0VarArr2[3] = new je0(g6Var, false);
                qu0VarArr2[4] = new ek0(r72);
                qu0VarArr2[5] = new ap();
                i11 = 0;
                while (true) {
                    qu0VarArr = this.H;
                    if (i11 < qu0VarArr.length) {
                        break;
                    }
                    qu0VarArr[i11].c(chat != null ? r72 : false);
                    i11++;
                }
            }
            r72 = 1;
            chat = this.G.e;
            qu0VarArr2[0] = new w31(r72);
            qu0VarArr2[r72] = new ap(r72);
            qu0VarArr2[2] = new en0(r72);
            qu0VarArr2[3] = new je0(g6Var, false);
            qu0VarArr2[4] = new ek0(r72);
            qu0VarArr2[5] = new ap();
            i11 = 0;
            while (true) {
                qu0VarArr = this.H;
                if (i11 < qu0VarArr.length) {
                }
                qu0VarArr[i11].c(chat != null ? r72 : false);
                i11++;
            }
        }
        this.f0 = new g5(org.telegram.messenger.g0.L(24.0f), this.h);
        this.g0 = new g5(org.telegram.messenger.g0.L(17.0f), this.h);
    }

    private void setTypingAnimation(boolean z9) {
        org.telegram.ui.cn cnVar = this.G;
        org.telegram.ui.qk qkVar = this.r;
        if (qkVar == null) {
            return;
        }
        int i7 = 0;
        qu0[] qu0VarArr = this.H;
        if (!z9) {
            this.N = null;
            qkVar.setLeftDrawable((Drawable) null);
            qkVar.g(null, null);
            while (i7 < qu0VarArr.length) {
                qu0 qu0Var = qu0VarArr[i7];
                if (qu0Var != null) {
                    qu0Var.e();
                }
                i7++;
            }
            return;
        }
        try {
            int intValue = org.telegram.messenger.qp.s1(this.J).E1(cnVar.a(), cnVar.r4).intValue();
            qu0 qu0Var2 = qu0VarArr[intValue];
            if (qu0Var2 == null) {
                return;
            }
            org.telegram.ui.ActionBar.g6 g6Var = this.d0;
            if (intValue == 5) {
                qkVar.g(qu0Var2, "**oo**");
                qu0VarArr[intValue].b(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.pa, g6Var));
                qkVar.setLeftDrawable((Drawable) null);
            } else {
                qkVar.g(null, null);
                qu0VarArr[intValue].b(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.pa, g6Var));
                qkVar.setLeftDrawable(qu0VarArr[intValue]);
            }
            this.N = qu0VarArr[intValue];
            while (i7 < qu0VarArr.length) {
                qu0 qu0Var3 = qu0VarArr[i7];
                if (qu0Var3 != null) {
                    if (i7 == intValue) {
                        qu0Var3.d();
                    } else {
                        qu0Var3.e();
                    }
                }
                i7++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
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
        org.telegram.ui.cn cnVar = this.G;
        if (cnVar == null) {
            return;
        }
        TLRPC.User j3 = cnVar.j();
        TLRPC.Chat chat = cnVar.e;
        if (cnVar.f4 == 3) {
            long d92 = cnVar.d9();
            if (d92 >= 0) {
                user = cnVar.getMessagesController().a2(Long.valueOf(d92));
                chat = null;
            } else {
                chat = cnVar.getMessagesController().M0(Long.valueOf(-d92));
                user = null;
            }
        } else {
            user = j3;
        }
        w8 w8Var = this.I;
        gn gnVar = this.e;
        if (user == null) {
            if (!org.telegram.messenger.t3.p0(chat)) {
                if (chat != null) {
                    w8Var.p = 1.0f;
                    w8Var.q(chat);
                    if (gnVar != null) {
                        gnVar.setAnimatedEmojiDrawable(null);
                        gnVar.e(chat, w8Var);
                        if (chat.forum) {
                            L = org.telegram.messenger.g0.L(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).P1().K(-chat.id) ? 11.0f : 16.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(21.0f);
                        }
                        gnVar.setRoundRadius(L);
                        return;
                    }
                    return;
                }
                return;
            }
            long b10 = cnVar.b();
            int i7 = this.J;
            if (!org.telegram.messenger.t3.A(i7, chat, 24) || b10 == 0) {
                gnVar.setAnimatedEmojiDrawable(null);
                qg.d.o(i7, chat, w8Var, gnVar);
            } else if (b10 > 0) {
                TLRPC.User a22 = cnVar.getMessagesController().a2(Long.valueOf(b10));
                w8Var.r(a22);
                gnVar.setAnimatedEmojiDrawable(null);
                gnVar.e(a22, w8Var);
            } else {
                TLRPC.Chat M0 = cnVar.getMessagesController().M0(Long.valueOf(-b10));
                w8Var.q(M0);
                gnVar.setAnimatedEmojiDrawable(null);
                gnVar.e(M0, w8Var);
            }
            gnVar.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
            return;
        }
        w8Var.r(user);
        if (org.telegram.messenger.t10.z(user)) {
            w8Var.p = 0.8f;
            w8Var.g(12);
            if (gnVar != null) {
                gnVar.setAnimatedEmojiDrawable(null);
                gnVar.j(null, null, w8Var, user);
                return;
            }
            return;
        }
        if (org.telegram.messenger.t10.s(user)) {
            w8Var.p = 0.8f;
            w8Var.g(21);
            if (gnVar != null) {
                gnVar.setAnimatedEmojiDrawable(null);
                gnVar.j(null, null, w8Var, user);
                return;
            }
            return;
        }
        if (org.telegram.messenger.t10.B(user) && cnVar.f4 == 3) {
            w8Var.p = 0.8f;
            w8Var.g(22);
            if (gnVar != null) {
                gnVar.setAnimatedEmojiDrawable(null);
                gnVar.j(null, null, w8Var, user);
                return;
            }
            return;
        }
        if (!org.telegram.messenger.t10.B(user)) {
            w8Var.p = 1.0f;
            if (gnVar != null) {
                gnVar.setAnimatedEmojiDrawable(null);
                gnVar.a.j0(user, w8Var, null, true, 3, false);
                return;
            }
            return;
        }
        w8Var.p = 0.8f;
        w8Var.g(1);
        if (gnVar != null) {
            gnVar.setAnimatedEmojiDrawable(null);
            gnVar.j(null, null, w8Var, user);
        }
    }

    public final g5 c(long j3) {
        if (j3 == 0) {
            return null;
        }
        g5 g5Var = this.g0;
        g5Var.j(j3, false);
        g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.ni, this.d0)));
        int L = org.telegram.messenger.g0.L(1.0f);
        g5Var.I = 0;
        g5Var.J = L;
        return g5Var;
    }

    public boolean d() {
        return false;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.T1) {
            int connectionState = ConnectionsManager.getInstance(this.J).getConnectionState();
            if (this.V != connectionState) {
                this.V = connectionState;
                l();
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.qs.i4) {
            if (i7 == org.telegram.messenger.qs.g3) {
                n(true);
            }
        } else {
            org.telegram.ui.qk qkVar = this.h;
            if (qkVar != null) {
                qkVar.invalidate();
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
        float a10 = this.h0.a(0.02f);
        canvas.scale(a10, a10, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.k0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.e) {
            boolean z9 = false;
            ImageView imageView = this.x;
            boolean z10 = imageView != null && imageView.getVisibility() == 0;
            ImageView imageView2 = this.y;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                z9 = true;
            }
            if (z10 || z9) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-org.telegram.messenger.g0.L(3.0f), -org.telegram.messenger.g0.L(3.0f));
                canvas.saveLayer(rectF, null);
                boolean drawChild = super.drawChild(canvas, view, j3);
                if (z10) {
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - org.telegram.messenger.g0.N(0.33f), imageView.getScaleX() * org.telegram.messenger.g0.N(12.0f), org.telegram.ui.ActionBar.l6.Cm);
                }
                if (z9) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * org.telegram.messenger.g0.N(7.66f), org.telegram.ui.ActionBar.l6.Cm);
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
    public final void e(boolean z9, boolean z10) {
        boolean z11;
        org.telegram.ui.cn cnVar;
        TLRPC.Chat chat;
        ImageReceiver imageReceiver;
        String str;
        org.telegram.messenger.gc D;
        boolean z12;
        lg lgVar;
        Drawable t6;
        TLRPC.User a22;
        gn gnVar = this.e;
        if (z9) {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x <= point.y) {
                }
            }
            z11 = false;
            cnVar = this.G;
            TLRPC.User j3 = cnVar.j();
            chat = cnVar.e;
            boolean z13 = chat == null && chat.monoforum;
            if (chat != null && chat.monoforum) {
                chat = cnVar.getMessagesController().M0(Long.valueOf(chat.linked_monoforum_id));
                if (chat != null) {
                    return;
                }
                if (cnVar.i9() != 0 && (a22 = cnVar.getMessagesController().a2(Long.valueOf(cnVar.i9()))) != null) {
                    chat = null;
                    j3 = a22;
                }
            }
            imageReceiver = gnVar.getImageReceiver();
            str = imageReceiver.Q;
            D = org.telegram.messenger.gc.D();
            if (str != null && !D.J(str, false)) {
                t6 = imageReceiver.t();
                if ((t6 instanceof BitmapDrawable) && !(t6 instanceof v5)) {
                    D.O((BitmapDrawable) t6, str, false);
                }
            }
            if (!cnVar.u4) {
                if (chat == null) {
                    return;
                }
                cnVar.presentFragment(ProfileActivity.D4(-chat.id), z10);
                return;
            }
            rs0 rs0Var = this.c0;
            if (j3 == null) {
                boolean z14 = z11;
                if (chat != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    if (cnVar.f4 == 3) {
                        bundle.putLong("topic_id", cnVar.d9());
                    } else if (cnVar.v4) {
                        bundle.putLong("topic_id", cnVar.l4.e1());
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, rs0Var);
                    if (!z13) {
                        profileActivity.d5(cnVar.p8);
                    }
                    profileActivity.j5(z14 ? 2 : 1);
                    cnVar.presentFragment(profileActivity, z10);
                    return;
                }
                return;
            }
            if (j3.id == 489000) {
                return;
            }
            Bundle bundle2 = new Bundle();
            if (org.telegram.messenger.t10.B(j3)) {
                org.telegram.ui.ActionBar.f2 f2Var = rs0Var.x;
                int[] iArr = rs0Var.c;
                int i7 = 0;
                while (true) {
                    if (i7 < iArr.length) {
                        if (iArr[i7] > 0) {
                            break;
                        } else {
                            i7++;
                        }
                    } else if (!rs0Var.f && (f2Var == null || rs0Var.r != f2Var.getUserConfig().e() || rs0Var.s != 0 || !f2Var.getMessagesController().G1().e())) {
                        return;
                    }
                }
                bundle2.putLong("dialog_id", cnVar.a());
                if (cnVar.f4 == 3) {
                    bundle2.putLong("topic_id", cnVar.d9());
                }
                v80 v80Var = new v80(bundle2, rs0Var);
                v80Var.c = cnVar.p8;
                cnVar.presentFragment(v80Var, z10);
                return;
            }
            if (cnVar.f4 == 3) {
                z12 = z11;
                long d92 = cnVar.d9();
                bundle2.putBoolean("saved", true);
                if (d92 >= 0) {
                    bundle2.putLong("user_id", d92);
                } else {
                    bundle2.putLong("chat_id", -d92);
                }
            } else {
                z12 = z11;
                bundle2.putLong("user_id", j3.id);
                if (this.x != null && !z13) {
                    bundle2.putLong("dialog_id", cnVar.a());
                }
            }
            if (org.telegram.messenger.t10.u(j3)) {
                bundle2.putLong("topic_id", cnVar.b());
            }
            org.telegram.ui.ActionBar.l0 l0Var = cnVar.Y1;
            bundle2.putBoolean("reportSpam", (l0Var == null || (lgVar = cnVar.a1) == null || !lgVar.d(l0Var) || cnVar.b2.getVisibility() == 8) ? false : true);
            bundle2.putInt("actionBarColor", org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.s8, this.d0));
            ProfileActivity profileActivity2 = new ProfileActivity(bundle2, rs0Var);
            if (!z13) {
                profileActivity2.k5(cnVar.q8, cnVar.r8, cnVar.s8);
            }
            profileActivity2.j5(z12 ? 2 : 1);
            cnVar.presentFragment(profileActivity2, z10);
            return;
        }
        z11 = z9;
        cnVar = this.G;
        TLRPC.User j32 = cnVar.j();
        chat = cnVar.e;
        if (chat == null) {
        }
        if (chat != null) {
            chat = cnVar.getMessagesController().M0(Long.valueOf(chat.linked_monoforum_id));
            if (chat != null) {
            }
        }
        imageReceiver = gnVar.getImageReceiver();
        str = imageReceiver.Q;
        D = org.telegram.messenger.gc.D();
        if (str != null) {
            t6 = imageReceiver.t();
            if (t6 instanceof BitmapDrawable) {
                D.O((BitmapDrawable) t6, str, false);
            }
        }
        if (!cnVar.u4) {
        }
    }

    public final void g(int i7, boolean z9) {
        b01 b01Var = this.F;
        if (b01Var == null) {
            return;
        }
        boolean z10 = this.m0;
        if (i7 != 0 || this.T) {
            te.a aVar = this.a;
            if (z10) {
                aVar.a(false, z9);
            } else {
                aVar.a(true, z9);
                b01Var.b(i7);
            }
        }
    }

    public l9 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.a0;
    }

    public int getLeftPadding() {
        return this.L;
    }

    public rs0 getSharedMediaPreloader() {
        return this.c0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.qk qkVar = this.r;
        return qkVar != null ? qkVar.getTextPaint() : this.s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.qk qkVar = this.r;
        if (qkVar != null) {
            return qkVar;
        }
        j6 j6Var = this.s;
        if (j6Var != null) {
            return j6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.x;
    }

    public org.telegram.ui.ActionBar.l5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        org.telegram.ui.qk qkVar = this.h;
        float max = qkVar != null ? Math.max(0.0f, qkVar.getExactWidthIncludeDrawables()) : 0.0f;
        org.telegram.ui.qk qkVar2 = this.r;
        if (qkVar2 != null) {
            max = Math.max(max, qkVar2.getExactWidthIncludeDrawables());
        }
        gn gnVar = this.e;
        return (int) (max + ((gnVar == null || gnVar.getVisibility() != 0) ? org.telegram.messenger.g0.L(34.0f) : org.telegram.messenger.g0.L(70.0f)));
    }

    public final void h(CharSequence charSequence, boolean z9, boolean z10, boolean z11, boolean z12, TLRPC.EmojiStatus emojiStatus, boolean z13) {
        if (charSequence != null) {
            charSequence = org.telegram.messenger.i6.m(charSequence, this.h.getPaint().getFontMetricsInt(), false, null, 0);
        }
        this.h.k(charSequence);
        this.o0 = false;
        if (z9 || z10) {
            this.o0 = true;
            if (!(this.h.getRightDrawable() instanceof hk0)) {
                hk0 hk0Var = new hk0(!z9 ? 1 : 0);
                hk0Var.b(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.B8, this.d0));
                this.h.j(hk0Var);
                this.q0 = org.telegram.messenger.id.M0(2131745862, null);
                this.n0 = true;
            }
        } else if (z11) {
            Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
            this.s0 = mutate;
            int i7 = org.telegram.ui.ActionBar.l6.ni;
            org.telegram.ui.ActionBar.g6 g6Var = this.d0;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.s6.x(this, mutate, i7, g6Var, mode);
            Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
            this.t0 = mutate2;
            org.telegram.ui.ActionBar.s6.x(this, mutate2, org.telegram.ui.ActionBar.l6.oi, this.d0, mode);
            this.h.j(new xp(this.s0, this.t0));
            this.n0 = true;
            this.q0 = org.telegram.messenger.id.M0(2131754739, null);
        } else if (this.h.getRightDrawable() instanceof hk0) {
            this.h.j(null);
            this.n0 = false;
            this.q0 = null;
        }
        if (z12 || org.telegram.messenger.m5.f(emojiStatus) != 0) {
            if ((this.h.getRightDrawable() instanceof h5) && (((h5) this.h.getRightDrawable()).a instanceof i5)) {
                ((i5) ((h5) this.h.getRightDrawable()).a).n(this.h);
            }
            if (org.telegram.messenger.m5.f(emojiStatus) != 0) {
                this.f0.j(org.telegram.messenger.m5.f(emojiStatus), z13);
            } else if (z12) {
                Drawable mutate3 = org.telegram.messenger.t0.b.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.r0 = mutate3;
                org.telegram.ui.ActionBar.s6.x(this, mutate3, org.telegram.ui.ActionBar.l6.ni, this.d0, PorterDuff.Mode.MULTIPLY);
                this.f0.g(this.r0, z13);
            } else {
                this.f0.g(null, z13);
            }
            this.f0.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.ni, this.d0)));
            this.h.i(this.f0);
            this.n0 = false;
            this.p0 = org.telegram.messenger.id.M0(2131754802, null);
        } else {
            this.h.i(null);
            this.p0 = null;
        }
        org.telegram.ui.ActionBar.k kVar = this.z0;
        if (kVar != null) {
            kVar.i(z13);
        }
    }

    public final void i(int i7, int i10) {
        org.telegram.ui.qk qkVar = this.h;
        org.telegram.ui.ActionBar.s6.q(qkVar);
        org.telegram.ui.qk qkVar2 = this.r;
        org.telegram.ui.ActionBar.s6.q(qkVar2);
        qkVar.setTextColor(i7);
        qkVar2.setTextColor(i10);
        qkVar2.setTag(Integer.valueOf(i10));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.qk qkVar = this.h;
        qkVar.setLeftDrawable(drawable);
        if (!this.n0 && !this.o0) {
            if (drawable2 != null) {
                this.q0 = org.telegram.messenger.id.M0(2131747901, null);
            } else {
                this.q0 = null;
            }
            qkVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.z0;
        if (kVar != null) {
            kVar.i(true);
        }
    }

    public final void k(TLRPC.User user, boolean z9) {
        w8 w8Var = this.I;
        w8Var.r(user);
        boolean z10 = org.telegram.messenger.t10.z(user);
        gn gnVar = this.e;
        if (z10) {
            w8Var.g(12);
            w8Var.p = 0.8f;
            if (gnVar != null) {
                gnVar.j(null, null, w8Var, user);
                return;
            }
            return;
        }
        if (org.telegram.messenger.t10.s(user)) {
            w8Var.g(21);
            w8Var.p = 0.8f;
            if (gnVar != null) {
                gnVar.j(null, null, w8Var, user);
                return;
            }
            return;
        }
        if (!org.telegram.messenger.t10.B(user) || z9) {
            w8Var.p = 1.0f;
            if (gnVar != null) {
                gnVar.e(user, w8Var);
                return;
            }
            return;
        }
        w8Var.g(1);
        w8Var.p = 0.8f;
        if (gnVar != null) {
            gnVar.j(null, null, w8Var, user);
        }
    }

    public final void l() {
        int i7 = this.V;
        String M0 = i7 == 2 ? org.telegram.messenger.id.M0(2131743212, null) : i7 == 1 ? org.telegram.messenger.id.M0(2131751809, null) : i7 == 5 ? org.telegram.messenger.id.M0(2131743810, null) : i7 == 4 ? org.telegram.messenger.id.M0(2131751807, null) : null;
        org.telegram.ui.ActionBar.g6 g6Var = this.d0;
        j6 j6Var = this.s;
        org.telegram.ui.qk qkVar = this.r;
        if (M0 == null) {
            CharSequence charSequence = this.W;
            if (charSequence != null) {
                if (qkVar != null) {
                    qkVar.k(charSequence);
                    this.W = null;
                    Integer num = this.b0;
                    if (num != null) {
                        qkVar.setTextColor(num.intValue());
                    } else {
                        int i10 = this.a0;
                        if (i10 >= 0) {
                            org.telegram.ui.ActionBar.s6.X(qkVar, i10, g6Var);
                            qkVar.setTag(Integer.valueOf(this.a0));
                        }
                    }
                } else if (j6Var != null) {
                    j6Var.c(charSequence, !org.telegram.messenger.id.a0, true);
                    this.W = null;
                    Integer num2 = this.b0;
                    if (num2 != null) {
                        j6Var.setTextColor(num2.intValue());
                    } else {
                        int i11 = this.a0;
                        if (i11 >= 0) {
                            org.telegram.ui.ActionBar.s6.Y(j6Var, i11, g6Var);
                            j6Var.setTag(Integer.valueOf(this.a0));
                        }
                    }
                }
            }
        } else if (qkVar != null) {
            if (this.W == null) {
                this.W = qkVar.getText();
            }
            qkVar.k(M0);
            Integer num3 = this.b0;
            if (num3 != null) {
                qkVar.setTextColor(num3.intValue());
            } else {
                int i12 = org.telegram.ui.ActionBar.l6.B8;
                org.telegram.ui.ActionBar.s6.X(qkVar, i12, g6Var);
                qkVar.setTag(Integer.valueOf(i12));
            }
        } else if (j6Var != null) {
            if (this.W == null) {
                this.W = j6Var.getText();
            }
            j6Var.c(M0, !org.telegram.messenger.id.a0, true);
            Integer num4 = this.b0;
            if (num4 != null) {
                j6Var.setTextColor(num4.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.l6.B8;
                org.telegram.ui.ActionBar.s6.Y(j6Var, i13, g6Var);
                j6Var.setTag(Integer.valueOf(i13));
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.z0;
        if (kVar != null) {
            kVar.i(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z9;
        org.telegram.ui.cn cnVar = this.G;
        if (cnVar == null) {
            return;
        }
        this.U = 0;
        TLRPC.ChatFull chatFull = cnVar.p8;
        if (chatFull == null) {
            return;
        }
        int i7 = this.J;
        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z9 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (!z9 || chatFull.participants_count <= 200) {
                return;
            }
            this.U = chatFull.online_count;
            return;
        }
        for (int i10 = 0; i10 < chatFull.participants.participants.size(); i10++) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(chatFull.participants.participants.get(i10).user_id));
            if (a22 != null && (userStatus = a22.status) != null && ((userStatus.expires > currentTime || a22.id == org.telegram.messenger.p10.i(i7).e()) && a22.status.expires > 10000)) {
                this.U++;
            }
        }
    }

    public final void n(boolean z9) {
        int i7;
        boolean z10;
        boolean z11;
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
        org.telegram.ui.ActionBar.g6 g6Var = this.d0;
        boolean[] zArr = this.R;
        j6 j6Var = this.s;
        org.telegram.ui.qk qkVar = this.r;
        org.telegram.ui.qk qkVar2 = this.h;
        int i16 = this.J;
        org.telegram.ui.cn cnVar = this.G;
        if (cnVar == null) {
            return;
        }
        if (cnVar.f4 == 6) {
            String str = cnVar.d4.link;
            kg.y[] yVarArr = kg.y.e;
            if (str.startsWith("https://")) {
                str = str.substring(8);
            }
            setSubtitle(str);
            return;
        }
        TLRPC.User j3 = cnVar.j();
        TLRPC.Chat chat = cnVar.e;
        boolean z12 = org.telegram.messenger.t10.B(j3) && cnVar.f4 == 0 && cnVar.getMessagesController().G1().c() >= 3 && (this.u0 || org.telegram.messenger.qp.e1().getInt("savedmsgschatshint", 0) < 3);
        if (((org.telegram.messenger.t10.B(j3) && !z12) || org.telegram.messenger.t10.z(j3) || ((j3 != null && j3.id == 489000) || ((i7 = cnVar.f4) != 0 && i7 != 8))) && cnVar.f4 != 3) {
            if (getSubtitleTextView().getVisibility() != 8) {
                getSubtitleTextView().setVisibility(8);
                return;
            }
            return;
        }
        if (z12) {
            if (getSubtitleTextView().getVisibility() != 0) {
                i15 = 0;
                getSubtitleTextView().setVisibility(0);
            } else {
                i15 = 0;
            }
            if (!this.u0) {
                org.telegram.messenger.qp.e1().edit().putInt("savedmsgschatshint", org.telegram.messenger.qp.e1().getInt("savedmsgschatshint", i15) + 1).apply();
                this.u0 = true;
            }
        }
        CharSequence D1 = org.telegram.messenger.qp.s1(i16).D1(cnVar.a(), cnVar.r4, false);
        CharSequence charSequence = "";
        if (D1 != null) {
            D1 = TextUtils.replace(D1, new String[]{"..."}, new String[]{""});
        }
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        boolean z13 = z12;
        if (D1 != null && D1.length() != 0 && (!org.telegram.messenger.t3.T(chat) || chat.megagroup)) {
            if (cnVar.ea() && qkVar2.getTag() != null) {
                qkVar2.setTag(null);
                getSubtitleTextView().setVisibility(0);
                AnimatorSet animatorSet = this.Q;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.Q = null;
                }
                if (z9) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.Q = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(qkVar2, (Property<org.telegram.ui.qk, Float>) property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 1.0f));
                    this.Q.addListener(new jn(this, 1));
                    this.Q.setDuration(180L);
                    this.Q.start();
                } else {
                    qkVar2.setTranslationY(0.0f);
                    getSubtitleTextView().setAlpha(1.0f);
                }
            }
            Integer E1 = org.telegram.messenger.qp.s1(i16).E1(cnVar.a(), cnVar.r4);
            charSequence = (E1 == null || E1.intValue() != 5) ? D1 : org.telegram.messenger.i6.m(D1, getSubtitlePaint().getFontMetricsInt(), false, null, 0);
            setTypingAnimation(true);
            z11 = true;
        } else {
            if (cnVar.ea() && !cnVar.v4) {
                if (qkVar2.getTag() != null) {
                    return;
                }
                qkVar2.setTag(1);
                AnimatorSet animatorSet3 = this.Q;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.Q = null;
                }
                if (!z9) {
                    qkVar2.setTranslationY(org.telegram.messenger.g0.L(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                } else {
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.Q = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(qkVar2, (Property<org.telegram.ui.qk, Float>) property2, org.telegram.messenger.g0.L(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 0.0f));
                    this.Q.addListener(new jn(this, 0));
                    this.Q.setDuration(180L);
                    this.Q.start();
                    return;
                }
            }
            setTypingAnimation(false);
            int i17 = cnVar.f4;
            if (i17 != 8) {
                if (i17 == 3) {
                    org.telegram.messenger.vv G1 = cnVar.getMessagesController().G1();
                    long d92 = cnVar.d9();
                    ArrayList arrayList = G1.j;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= arrayList.size()) {
                            i14 = 0;
                            break;
                        }
                        org.telegram.messenger.uv uvVar = (org.telegram.messenger.uv) arrayList.get(i18);
                        if (uvVar.a == d92) {
                            i14 = uvVar.e;
                            break;
                        }
                        i18++;
                    }
                    charSequence = org.telegram.messenger.id.G(Math.max(1, i14), "SavedMessagesCount", new Object[0]);
                } else {
                    if (cnVar.v4 && chat != null) {
                        TLRPC.TL_forumTopic f10 = org.telegram.messenger.qp.s1(i16).q7.f(chat.id, cnVar.b());
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
                            G = org.telegram.messenger.id.G(i13, "messages", objArr);
                        } else {
                            Object[] objArr2 = new Object[i12];
                            objArr2[0] = chat.title;
                            G = org.telegram.messenger.id.a0(null, null, 2131744010, objArr2);
                        }
                    } else if (chat != null) {
                        TLRPC.ChatFull chatFull = cnVar.p8;
                        int i19 = this.U;
                        if (org.telegram.messenger.t3.T(chat)) {
                            if (chatFull == null || (i11 = chatFull.participants_count) == 0) {
                                G = chat.megagroup ? chatFull == null ? org.telegram.messenger.id.M0(2131748779, null).toLowerCase() : chat.has_geo ? org.telegram.messenger.id.M0(2131748642, null).toLowerCase() : org.telegram.messenger.t3.t0(chat) ? org.telegram.messenger.id.M0(2131748638, null).toLowerCase() : org.telegram.messenger.id.M0(2131748641, null).toLowerCase() : org.telegram.messenger.t3.t0(chat) ? org.telegram.messenger.id.M0(2131752318, null).toLowerCase() : org.telegram.messenger.id.M0(2131752329, null).toLowerCase();
                            } else if (chat.megagroup) {
                                G = i19 > 1 ? a8.p0.D(org.telegram.messenger.id.G(i11, "Members", new Object[0]), ", ", org.telegram.messenger.id.G(Math.min(i19, chatFull.participants_count), "OnlineCount", new Object[0])) : org.telegram.messenger.id.G(i11, "Members", new Object[0]);
                            } else {
                                int[] iArr = new int[1];
                                boolean C1 = org.telegram.messenger.g0.C1();
                                int i20 = chatFull.participants_count;
                                if (C1) {
                                    iArr[0] = i20;
                                    S = String.valueOf(i20);
                                } else {
                                    S = org.telegram.messenger.id.S(iArr, i20);
                                }
                                G = chat.megagroup ? org.telegram.messenger.id.G(iArr[0], "Members", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S) : org.telegram.messenger.id.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                            }
                        } else if (org.telegram.messenger.t3.k0(chat)) {
                            G = org.telegram.messenger.id.M0(2131742829, null);
                        } else if (org.telegram.messenger.t3.l0(chat)) {
                            G = org.telegram.messenger.id.M0(2131742835, null);
                        } else {
                            int i21 = chat.participants_count;
                            if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                i21 = chatParticipants.participants.size();
                            }
                            G = (i19 <= 1 || i21 == 0) ? org.telegram.messenger.id.G(i21, "Members", new Object[0]) : a8.p0.D(org.telegram.messenger.id.G(i21, "Members", new Object[0]), ", ", org.telegram.messenger.id.G(i19, "OnlineCount", new Object[0]));
                        }
                    } else {
                        if (j3 != null) {
                            TLRPC.User a22 = org.telegram.messenger.qp.s1(i16).a2(Long.valueOf(j3.id));
                            if (a22 != null) {
                                j3 = a22;
                            }
                            if (!org.telegram.messenger.t10.z(j3)) {
                                long j10 = j3.id;
                                if (j10 != 489000) {
                                    if (j10 == org.telegram.messenger.p10.i(i16).e()) {
                                        charSequence = z13 ? org.telegram.messenger.g0.H2(org.telegram.messenger.id.M0(2131745892, null), false) : org.telegram.messenger.id.M0(2131752189, null);
                                    } else {
                                        long j11 = j3.id;
                                        if (j11 == 333000 || j11 == 777000 || j11 == 42777) {
                                            z10 = false;
                                            charSequence = org.telegram.messenger.id.M0(2131745561, null);
                                        } else if (org.telegram.messenger.qp.F2(j3)) {
                                            charSequence = org.telegram.messenger.id.M0(2131744325, null);
                                        } else {
                                            boolean z14 = j3.bot;
                                            if (z14 && (i10 = j3.bot_active_users) != 0) {
                                                charSequence = org.telegram.messenger.id.H(',', "BotUsers", i10);
                                            } else if (z14) {
                                                charSequence = org.telegram.messenger.t10.d(j3);
                                            } else {
                                                zArr[0] = false;
                                                charSequence = org.telegram.messenger.id.d0(i16, j3, zArr, this.e0 ? this.S : null);
                                                z11 = zArr[0];
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            z10 = false;
                        }
                        z11 = z10;
                    }
                    charSequence = G;
                }
                z11 = false;
            } else if (cnVar.h4) {
                charSequence = org.telegram.messenger.id.M0(2131752219, null);
                z11 = false;
            } else {
                if (cnVar.b() == 0) {
                    org.telegram.messenger.k00 k00Var = cnVar.getMessagesController().q7;
                    long j12 = -cnVar.a();
                    int size = (!k00Var.e(j12) || (l10 = k00Var.l(j12)) == null) ? 0 : l10.size();
                    G = size > 0 ? org.telegram.messenger.id.H(',', "Chats", size) : org.telegram.messenger.id.M0(2131752219, null);
                } else {
                    TLRPC.TL_forumTopic f11 = org.telegram.messenger.qp.s1(i16).q7.f(chat.id, cnVar.b());
                    int i22 = f11 != null ? f11.totalMessagesCount : 0;
                    G = i22 > 0 ? org.telegram.messenger.id.G(i22, "messages", Integer.valueOf(i22)) : org.telegram.messenger.id.a0(null, null, 2131744010, qg.d.i(i16, chat, false));
                }
                charSequence = G;
                z11 = false;
            }
        }
        this.a0 = z11 ? org.telegram.ui.ActionBar.l6.pa : org.telegram.ui.ActionBar.l6.B8;
        if (this.W != null) {
            this.W = charSequence;
        } else if (qkVar != null) {
            qkVar.k(charSequence);
            Integer num = this.b0;
            if (num == null) {
                org.telegram.ui.ActionBar.s6.X(qkVar, this.a0, g6Var);
                qkVar.setTag(Integer.valueOf(this.a0));
            } else {
                qkVar.setTextColor(num.intValue());
            }
        } else {
            j6Var.c(charSequence, z9, true);
            Integer num2 = this.b0;
            if (num2 == null) {
                org.telegram.ui.ActionBar.s6.Y(j6Var, this.a0, g6Var);
                j6Var.setTag(Integer.valueOf(this.a0));
            } else {
                j6Var.setTextColor(num2.intValue());
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.z0;
        if (kVar != null) {
            kVar.i(z9);
        }
    }

    public boolean o() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.cn cnVar = this.G;
        if (cnVar != null) {
            int i7 = this.J;
            org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.T1);
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
            if (cnVar.f4 == 3) {
                org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.g3);
            }
            this.V = ConnectionsManager.getInstance(i7).getConnectionState();
            l();
        }
        g5 g5Var = this.f0;
        if (g5Var != null) {
            g5Var.a();
        }
        g5 g5Var2 = this.g0;
        if (g5Var2 != null) {
            g5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.cn cnVar = this.G;
        if (cnVar != null) {
            int i7 = this.J;
            org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.T1);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
            if (cnVar.f4 == 3) {
                org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.g3);
            }
        }
        g5 g5Var = this.f0;
        if (g5Var != null) {
            g5Var.b();
        }
        g5 g5Var2 = this.g0;
        if (g5Var2 != null) {
            g5Var2.b();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h.getText());
        if (this.p0 != null) {
            sb2.append(", ");
            sb2.append(this.p0);
        }
        if (this.q0 != null) {
            sb2.append(", ");
            sb2.append(this.q0);
        }
        sb2.append("\n");
        org.telegram.ui.qk qkVar = this.r;
        if (qkVar != null) {
            sb2.append(qkVar.getText());
        } else {
            j6 j6Var = this.s;
            if (j6Var != null) {
                sb2.append(j6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.id.M0(2131747786, null)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        gn gnVar = this.e;
        int measuredHeight = (((currentActionBarHeight - gnVar.getMeasuredHeight()) - 2) / 2) + (this.K ? org.telegram.messenger.g0.m : 0);
        int L = org.telegram.messenger.g0.L(this.l0 ? 23.66f : 24.0f) + measuredHeight;
        int i13 = this.L + 1;
        int i14 = measuredHeight + 1;
        gnVar.layout(i13, i14, gnVar.getMeasuredWidth() + i13, gnVar.getMeasuredHeight() + i14);
        int L2 = this.L + org.telegram.messenger.g0.L(gnVar.getVisibility() == 0 ? this.l0 ? 49.66f : 55.0f : this.l0 ? 13.0f : 1.0f) + this.M;
        org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) this.n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.qk qkVar = this.h;
        if (visibility != 8) {
            qkVar.layout(L2, (org.telegram.messenger.g0.L(1.66f) + measuredHeight) - qkVar.getPaddingTop(), qkVar.getMeasuredWidth() + L2, qkVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.66f) + (qkVar.getTextHeight() + measuredHeight)) - qkVar.getPaddingTop()));
            if (l5Var != null) {
                l5Var.layout(L2, org.telegram.messenger.g0.L(1.66f) + measuredHeight, l5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(1.66f) + l5Var.getTextHeight() + measuredHeight);
            }
        } else {
            qkVar.layout(L2, (org.telegram.messenger.g0.L(11.0f) + measuredHeight) - qkVar.getPaddingTop(), qkVar.getMeasuredWidth() + L2, qkVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (qkVar.getTextHeight() + measuredHeight)) - qkVar.getPaddingTop()));
            if (l5Var != null) {
                l5Var.layout(L2, org.telegram.messenger.g0.L(10.0f) + measuredHeight, l5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(10.0f) + l5Var.getTextHeight() + measuredHeight);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.layout(org.telegram.messenger.g0.L(29.0f) + this.L, org.telegram.messenger.g0.L(27.33f) + measuredHeight, imageView.getMeasuredWidth() + org.telegram.messenger.g0.L(29.0f) + this.L, imageView.getMeasuredHeight() + org.telegram.messenger.g0.L(27.33f) + measuredHeight);
        }
        ImageView imageView2 = this.x;
        if (imageView2 != null) {
            imageView2.layout(org.telegram.messenger.g0.L(19.333f) + this.L, measuredHeight - org.telegram.messenger.g0.L(8.0f), imageView2.getMeasuredWidth() + org.telegram.messenger.g0.L(19.333f) + this.L, imageView2.getMeasuredHeight() + (measuredHeight - org.telegram.messenger.g0.L(8.0f)));
        }
        ImageView imageView3 = this.D;
        if (imageView3 != null) {
            imageView3.layout(org.telegram.messenger.g0.L(28.0f) + this.L, org.telegram.messenger.g0.L(24.0f) + measuredHeight, imageView3.getMeasuredWidth() + org.telegram.messenger.g0.L(28.0f) + this.L, imageView3.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f) + measuredHeight);
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.layout(org.telegram.messenger.g0.L(28.0f) + this.L, org.telegram.messenger.g0.L(24.0f) + measuredHeight, imageView4.getMeasuredWidth() + org.telegram.messenger.g0.L(28.0f) + this.L, imageView4.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f) + measuredHeight);
        }
        org.telegram.ui.qk qkVar2 = this.r;
        if (qkVar2 != null) {
            qkVar2.layout(L2, L, qkVar2.getMeasuredWidth() + L2, qkVar2.getTextHeight() + L);
        } else {
            j6 j6Var = this.s;
            if (j6Var != null) {
                j6Var.layout(L2, L, j6Var.getMeasuredWidth() + L2, j6Var.getTextHeight() + L);
            }
        }
        org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) this.w.get();
        if (l5Var2 != null) {
            l5Var2.layout(L2, L, l5Var2.getMeasuredWidth() + L2, l5Var2.getTextHeight() + L);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        gn gnVar = this.e;
        int L = size - org.telegram.messenger.g0.L((gnVar.getVisibility() == 0 ? 54 : 0) + 16);
        float f10 = this.d;
        gnVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) - 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) - 2, TLObject.FLAG_30));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_31);
        org.telegram.ui.qk qkVar = this.h;
        qkVar.measure(makeMeasureSpec, makeMeasureSpec2);
        j6 j6Var = this.s;
        org.telegram.ui.qk qkVar2 = this.r;
        if (qkVar2 != null) {
            qkVar2.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
        } else if (j6Var != null) {
            j6Var.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(14.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(14.0f), TLObject.FLAG_30));
        }
        ImageView imageView2 = this.x;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(34.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(34.0f), TLObject.FLAG_30));
        }
        ImageView imageView3 = this.D;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i10));
        int i11 = this.O;
        AtomicReference atomicReference = this.n;
        if (i11 != -1 && i11 != size && i11 > size) {
            this.P = i11;
            View view = (org.telegram.ui.ActionBar.l5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
            atomicReference.set(l5Var);
            int i12 = org.telegram.ui.ActionBar.l6.A8;
            org.telegram.ui.ActionBar.g6 g6Var = this.d0;
            org.telegram.ui.ActionBar.s6.X(l5Var, i12, g6Var);
            l5Var.setTextSizePx(org.telegram.messenger.g0.L(this.l0 ? 17.5f : 18.0f));
            l5Var.setGravity(3);
            l5Var.setTypeface(org.telegram.messenger.g0.o());
            l5Var.setLeftDrawableTopPadding(-org.telegram.messenger.g0.L(1.3f));
            l5Var.i(qkVar.getRightDrawable());
            l5Var.j(qkVar.getRightDrawable2());
            l5Var.setRightDrawableOutside(qkVar.getRightDrawableOutside());
            l5Var.setLeftDrawable(qkVar.getLeftDrawable());
            l5Var.l(qkVar.getText(), false);
            ViewPropertyAnimator duration = l5Var.animate().alpha(0.0f).setDuration(350L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).withEndAction(new dn(this, 0)).start();
            addView(l5Var);
            AtomicReference atomicReference2 = this.w;
            View view2 = (org.telegram.ui.ActionBar.l5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(getContext());
            atomicReference2.set(l5Var2);
            int i13 = org.telegram.ui.ActionBar.l6.B8;
            org.telegram.ui.ActionBar.s6.X(l5Var2, i13, g6Var);
            l5Var2.setTag(Integer.valueOf(i13));
            l5Var2.setTextSizePx(org.telegram.messenger.g0.L(this.l0 ? 13.5f : 14.0f));
            l5Var2.setGravity(3);
            if (qkVar2 != null) {
                l5Var2.l(qkVar2.getText(), false);
            } else if (j6Var != null) {
                l5Var2.l(j6Var.getText(), false);
            }
            l5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(xqVar).withEndAction(new dn(this, 1)).start();
            addView(l5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.l5 l5Var3 = (org.telegram.ui.ActionBar.l5) atomicReference.get();
        if (l5Var3 != null) {
            l5Var3.measure(org.telegram.messenger.camera.q.c((gnVar.getVisibility() == 0 ? 54 : 0) + 16, this.P, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_31));
        }
        this.O = size;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ic icVar = this.h0;
        dn dnVar = this.i0;
        if (action == 0 && a()) {
            this.j0 = true;
            icVar.c(true);
            org.telegram.messenger.g0.r(dnVar);
            org.telegram.messenger.g0.i3(dnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.j0) {
            icVar.c(false);
            this.j0 = false;
            if (isClickable() && motionEvent.getAction() == 1) {
                e(false, false);
            }
            org.telegram.messenger.g0.r(dnVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final PorterDuffColorFilter p() {
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.ni, this.d0);
        if (this.v0 == null || w02 != this.x0) {
            this.x0 = w02;
            this.v0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        return this.v0;
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.z0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        w8 w8Var = this.I;
        w8Var.q(chat);
        gn gnVar = this.e;
        if (gnVar != null) {
            gnVar.e(chat, w8Var);
            gnVar.setRoundRadius(org.telegram.messenger.g0.L(org.telegram.messenger.t3.c0(chat) ? (chat == null || !org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).P1().K(-chat.id)) ? 16.0f : 11.0f : 21.0f));
        }
    }

    public void setCommunityItemVisible(boolean z9) {
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setVisibility((!z9 || this.f) ? 8 : 0);
        }
    }

    public void setLeftPadding(int i7) {
        this.L = i7;
    }

    public void setOccupyStatusBar(boolean z9) {
        this.K = z9;
    }

    public void setOverrideSubtitleColor(Integer num) {
        this.b0 = num;
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        this.h0.c(z9);
    }

    public void setRightAvatarPadding(int i7) {
        this.M = i7;
    }

    public void setStoriesForceState(Integer num) {
        this.c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.W == null) {
            org.telegram.ui.qk qkVar = this.r;
            if (qkVar != null) {
                qkVar.k(charSequence);
            } else {
                j6 j6Var = this.s;
                if (j6Var != null) {
                    j6Var.setText(charSequence);
                }
            }
        } else {
            this.W = charSequence;
        }
        org.telegram.ui.ActionBar.k kVar = this.z0;
        if (kVar != null) {
            kVar.i(true);
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
        qu0 qu0Var = this.N;
        org.telegram.ui.ActionBar.g6 g6Var = this.d0;
        if (qu0Var != null) {
            qu0Var.b(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.pa, g6Var));
        }
        Drawable drawable = this.r0;
        if (drawable != null) {
            drawable.setColorFilter(p());
        }
        g5 g5Var = this.g0;
        if (g5Var != null) {
            g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.ni, g6Var)));
        }
        g5 g5Var2 = this.f0;
        if (g5Var2 != null) {
            g5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.ni, g6Var)));
        }
        Drawable drawable2 = this.s0;
        if (drawable2 != null) {
            drawable2.setColorFilter(p());
        }
        if (this.t0 != null) {
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.oi, g6Var);
            if (this.w0 == null || w02 != this.y0) {
                this.y0 = w02;
                this.w0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
            }
            this.t0.setColorFilter(this.w0);
        }
        org.telegram.ui.qk qkVar = this.h;
        if (qkVar != null) {
            try {
                if (qkVar.getRightDrawable2() instanceof hk0) {
                    ((hk0) qkVar.getRightDrawable2()).b(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.B8, g6Var));
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
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
