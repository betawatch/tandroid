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
import org.telegram.ui.u91;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class sn extends FrameLayout implements te.b, org.telegram.messenger.is, org.telegram.ui.ActionBar.z5 {
    public org.telegram.ui.ActionBar.k A0;
    public final ImageView E;
    public final ImageView F;
    public final c01 G;
    public final org.telegram.ui.an H;
    public final qu0[] I;
    public final t8 J;
    public final int K;
    public boolean L;
    public int M;
    public int N;
    public qu0 O;
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
    public final qs0 d0;
    public final on e;
    public final org.telegram.ui.ActionBar.e6 e0;
    public final boolean f;
    public boolean f0;
    public final e5 g0;
    public final org.telegram.ui.ok h;
    public final e5 h0;
    public final dc i0;
    public final ln j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final AtomicReference n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public String q0;
    public final org.telegram.ui.ok r;
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
    public sn(Context context, org.telegram.ui.ActionBar.e2 e2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z11;
        int i7;
        int i10;
        ?? r72;
        TLRPC.Chat chat;
        int i11;
        qu0[] qu0VarArr;
        int i12;
        er erVar = er.h;
        this.a = new te.a(0, this, erVar, 320L, false);
        this.d = 42;
        AtomicReference atomicReference = new AtomicReference();
        this.n = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.w = atomicReference2;
        qu0[] qu0VarArr2 = new qu0[6];
        this.I = qu0VarArr2;
        this.J = new t8((org.telegram.ui.ActionBar.e6) null);
        this.K = org.telegram.messenger.m10.t0;
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
        this.i0 = new dc(this);
        this.j0 = new ln(this, 2);
        this.o0 = false;
        this.p0 = false;
        this.q0 = null;
        this.r0 = null;
        this.e0 = e6Var;
        boolean z12 = e2Var instanceof org.telegram.ui.an;
        if (z12) {
            this.H = (org.telegram.ui.an) e2Var;
        }
        org.telegram.ui.an anVar = this.H;
        boolean z13 = anVar != null && ((i12 = anVar.g4) == 0 || i12 == 8) && !org.telegram.messenger.q10.z(anVar.j()) && (this.H.j() == null || this.H.j().id != 489000);
        on onVar = new on(this, context, e2Var, z13, e6Var);
        this.e = onVar;
        int i13 = 9;
        if (z12 || (e2Var instanceof u91)) {
            org.telegram.ui.an anVar2 = this.H;
            if (anVar2 == null || ((i7 = anVar2.g4) != 5 && i7 != 9 && i7 != 6 && i7 != 8 && !org.telegram.messenger.q10.u(anVar2.f))) {
                this.d0 = new qs0(e2Var);
            }
            org.telegram.ui.an anVar3 = this.H;
            if (anVar3 != null) {
                if (anVar3.fa()) {
                    org.telegram.ui.an anVar4 = this.H;
                    if (anVar4.m4 != null) {
                    }
                    z11 = true;
                    this.f = z11;
                    if (z11) {
                        onVar.setVisibility(8);
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
        onVar.setContentDescription(org.telegram.messenger.hd.M0(2131754798, null));
        onVar.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        addView(onVar);
        if (z13) {
            org.telegram.ui.an anVar5 = this.H;
            TLRPC.Chat chat2 = anVar5 != null ? anVar5.e : null;
            if (chat2 != null && chat2.linked_community_id != 0) {
                c8.na.b(onVar, 0.05f, 1.2f);
            }
            final int i15 = 0;
            onVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nn
                public final /* synthetic */ sn b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            sn snVar = this.b;
                            if (!snVar.d()) {
                                snVar.e(true, false);
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
        org.telegram.ui.ok okVar = new org.telegram.ui.ok(context, atomicReference);
        this.h = okVar;
        okVar.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.q6.X(okVar, org.telegram.ui.ActionBar.j6.A8, e6Var);
        okVar.setTextSize(18);
        okVar.setGravity(3);
        okVar.setTypeface(org.telegram.messenger.g0.o());
        okVar.setLeftDrawableTopPadding(-org.telegram.messenger.g0.L(1.3f));
        okVar.setCanHideRightDrawable(false);
        okVar.setRightDrawableOutside(true);
        okVar.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(12.0f));
        addView(okVar);
        if (o()) {
            h6 h6Var = new h6(context, true, true, true);
            this.s = h6Var;
            h6Var.b(0.3f, 320L, erVar);
            h6Var.setEllipsizeByGradient(true);
            int i16 = org.telegram.ui.ActionBar.j6.B8;
            org.telegram.ui.ActionBar.q6.Y(h6Var, i16, e6Var);
            h6Var.setTag(Integer.valueOf(i16));
            h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            h6Var.setGravity(3);
            h6Var.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
            h6Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
            addView(h6Var);
        } else {
            org.telegram.ui.ok okVar2 = new org.telegram.ui.ok(context, atomicReference2);
            this.r = okVar2;
            okVar2.setEllipsizeByGradient(true);
            int i17 = org.telegram.ui.ActionBar.j6.B8;
            org.telegram.ui.ActionBar.q6.X(okVar2, i17, e6Var);
            okVar2.setTag(Integer.valueOf(i17));
            okVar2.setTextSize(14);
            okVar2.setGravity(3);
            okVar2.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
            addView(okVar2);
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
            c01 c01Var = new c01(context, e6Var);
            this.G = c01Var;
            imageView2.setImageDrawable(c01Var);
            c01Var.k = true;
            c01Var.b.setColor(0);
            addView(imageView2);
            this.U = z10;
            imageView2.setOnClickListener(new n2(i13, this, e6Var));
            if (z10) {
                imageView2.setContentDescription(org.telegram.messenger.hd.M0(2131745509, null));
            } else {
                imageView2.setContentDescription(org.telegram.messenger.hd.M0(2131754925, null));
            }
            ImageView imageView3 = new ImageView(context);
            this.E = imageView3;
            imageView3.setImageResource(R.drawable.star_small_outline);
            org.telegram.ui.ActionBar.q6.s(imageView3, org.telegram.ui.ActionBar.j6.s8, e6Var, PorterDuff.Mode.SRC_IN);
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
        org.telegram.ui.an anVar6 = this.H;
        if (anVar6 != null && ((i10 = anVar6.g4) == 0 || i10 == 8 || i10 == 3)) {
            if (anVar6.fa()) {
                org.telegram.ui.an anVar7 = this.H;
                if (!anVar7.w4) {
                }
            }
            if (!org.telegram.messenger.q10.z(this.H.j()) && (this.H.j() == null || this.H.j().id != 489000)) {
                r72 = 1;
                final char c10 = 1 == true ? 1 : 0;
                setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nn
                    public final /* synthetic */ sn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (c10) {
                            case 0:
                                sn snVar = this.b;
                                if (!snVar.d()) {
                                    snVar.e(true, false);
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
                qu0VarArr2[0] = new z31(r72);
                qu0VarArr2[r72] = new jp(r72);
                qu0VarArr2[2] = new hn0(r72);
                qu0VarArr2[3] = new le0(e6Var, false);
                qu0VarArr2[4] = new ik0(r72);
                qu0VarArr2[5] = new jp();
                i11 = 0;
                while (true) {
                    qu0VarArr = this.I;
                    if (i11 < qu0VarArr.length) {
                        break;
                    }
                    qu0VarArr[i11].c(chat != null ? r72 : false);
                    i11++;
                }
            }
            r72 = 1;
            chat = this.H.e;
            qu0VarArr2[0] = new z31(r72);
            qu0VarArr2[r72] = new jp(r72);
            qu0VarArr2[2] = new hn0(r72);
            qu0VarArr2[3] = new le0(e6Var, false);
            qu0VarArr2[4] = new ik0(r72);
            qu0VarArr2[5] = new jp();
            i11 = 0;
            while (true) {
                qu0VarArr = this.I;
                if (i11 < qu0VarArr.length) {
                }
                qu0VarArr[i11].c(chat != null ? r72 : false);
                i11++;
            }
        }
        this.g0 = new e5(org.telegram.messenger.g0.L(24.0f), this.h);
        this.h0 = new e5(org.telegram.messenger.g0.L(17.0f), this.h);
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.an anVar = this.H;
        org.telegram.ui.ok okVar = this.r;
        if (okVar == null) {
            return;
        }
        int i7 = 0;
        qu0[] qu0VarArr = this.I;
        if (!z10) {
            this.O = null;
            okVar.setLeftDrawable((Drawable) null);
            okVar.g(null, null);
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
            int intValue = org.telegram.messenger.np.s1(this.K).E1(anVar.a(), anVar.s4).intValue();
            qu0 qu0Var2 = qu0VarArr[intValue];
            if (qu0Var2 == null) {
                return;
            }
            org.telegram.ui.ActionBar.e6 e6Var = this.e0;
            if (intValue == 5) {
                okVar.g(qu0Var2, "**oo**");
                qu0VarArr[intValue].b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.pa, e6Var));
                okVar.setLeftDrawable((Drawable) null);
            } else {
                okVar.g(null, null);
                qu0VarArr[intValue].b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.pa, e6Var));
                okVar.setLeftDrawable(qu0VarArr[intValue]);
            }
            this.O = qu0VarArr[intValue];
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
    public final void G(int i7, float f10, float f11, te.c cVar) {
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
        org.telegram.ui.an anVar = this.H;
        if (anVar == null) {
            return;
        }
        TLRPC.User j3 = anVar.j();
        TLRPC.Chat chat = anVar.e;
        if (anVar.g4 == 3) {
            long e92 = anVar.e9();
            if (e92 >= 0) {
                user = anVar.getMessagesController().a2(Long.valueOf(e92));
                chat = null;
            } else {
                chat = anVar.getMessagesController().M0(Long.valueOf(-e92));
                user = null;
            }
        } else {
            user = j3;
        }
        t8 t8Var = this.J;
        on onVar = this.e;
        if (user == null) {
            if (!org.telegram.messenger.t3.p0(chat)) {
                if (chat != null) {
                    t8Var.p = 1.0f;
                    t8Var.q(chat);
                    if (onVar != null) {
                        onVar.setAnimatedEmojiDrawable(null);
                        onVar.f(chat, t8Var);
                        if (chat.forum) {
                            L = org.telegram.messenger.g0.L(org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).P1().K(-chat.id) ? 11.0f : 16.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(21.0f);
                        }
                        onVar.setRoundRadius(L);
                        return;
                    }
                    return;
                }
                return;
            }
            long b10 = anVar.b();
            int i7 = this.K;
            if (!org.telegram.messenger.t3.A(i7, chat, 24) || b10 == 0) {
                onVar.setAnimatedEmojiDrawable(null);
                qg.c.o(i7, chat, t8Var, onVar);
            } else if (b10 > 0) {
                TLRPC.User a22 = anVar.getMessagesController().a2(Long.valueOf(b10));
                t8Var.r(a22);
                onVar.setAnimatedEmojiDrawable(null);
                onVar.f(a22, t8Var);
            } else {
                TLRPC.Chat M0 = anVar.getMessagesController().M0(Long.valueOf(-b10));
                t8Var.q(M0);
                onVar.setAnimatedEmojiDrawable(null);
                onVar.f(M0, t8Var);
            }
            onVar.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
            return;
        }
        t8Var.r(user);
        if (org.telegram.messenger.q10.z(user)) {
            t8Var.p = 0.8f;
            t8Var.g(12);
            if (onVar != null) {
                onVar.setAnimatedEmojiDrawable(null);
                onVar.j(null, null, t8Var, user);
                return;
            }
            return;
        }
        if (org.telegram.messenger.q10.s(user)) {
            t8Var.p = 0.8f;
            t8Var.g(21);
            if (onVar != null) {
                onVar.setAnimatedEmojiDrawable(null);
                onVar.j(null, null, t8Var, user);
                return;
            }
            return;
        }
        if (org.telegram.messenger.q10.B(user) && anVar.g4 == 3) {
            t8Var.p = 0.8f;
            t8Var.g(22);
            if (onVar != null) {
                onVar.setAnimatedEmojiDrawable(null);
                onVar.j(null, null, t8Var, user);
                return;
            }
            return;
        }
        if (!org.telegram.messenger.q10.B(user)) {
            t8Var.p = 1.0f;
            if (onVar != null) {
                onVar.setAnimatedEmojiDrawable(null);
                onVar.a.j0(user, t8Var, null, true, 3, false);
                return;
            }
            return;
        }
        t8Var.p = 0.8f;
        t8Var.g(1);
        if (onVar != null) {
            onVar.setAnimatedEmojiDrawable(null);
            onVar.j(null, null, t8Var, user);
        }
    }

    public final e5 c(long j3) {
        if (j3 == 0) {
            return null;
        }
        e5 e5Var = this.h0;
        e5Var.j(j3, false);
        e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.qi, this.e0)));
        int L = org.telegram.messenger.g0.L(1.0f);
        e5Var.J = 0;
        e5Var.K = L;
        return e5Var;
    }

    public boolean d() {
        return false;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.T1) {
            int connectionState = ConnectionsManager.getInstance(this.K).getConnectionState();
            if (this.W != connectionState) {
                this.W = connectionState;
                l();
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.ns.i4) {
            if (i7 == org.telegram.messenger.ns.g3) {
                n(true);
            }
        } else {
            org.telegram.ui.ok okVar = this.h;
            if (okVar != null) {
                okVar.invalidate();
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
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - org.telegram.messenger.g0.N(0.33f), imageView.getScaleX() * org.telegram.messenger.g0.N(12.0f), org.telegram.ui.ActionBar.j6.Fm);
                }
                if (z10) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * org.telegram.messenger.g0.N(7.66f), org.telegram.ui.ActionBar.j6.Fm);
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
        org.telegram.ui.an anVar;
        TLRPC.Chat chat;
        ImageReceiver imageReceiver;
        String str;
        org.telegram.messenger.fc D;
        boolean z13;
        rg rgVar;
        Drawable t6;
        TLRPC.User a22;
        on onVar = this.e;
        if (z10) {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x <= point.y) {
                }
            }
            z12 = false;
            anVar = this.H;
            TLRPC.User j3 = anVar.j();
            chat = anVar.e;
            boolean z14 = chat == null && chat.monoforum;
            if (chat != null && chat.monoforum) {
                chat = anVar.getMessagesController().M0(Long.valueOf(chat.linked_monoforum_id));
                if (chat != null) {
                    return;
                }
                if (anVar.j9() != 0 && (a22 = anVar.getMessagesController().a2(Long.valueOf(anVar.j9()))) != null) {
                    chat = null;
                    j3 = a22;
                }
            }
            imageReceiver = onVar.getImageReceiver();
            str = imageReceiver.R;
            D = org.telegram.messenger.fc.D();
            if (str != null && !D.J(str, false)) {
                t6 = imageReceiver.t();
                if ((t6 instanceof BitmapDrawable) && !(t6 instanceof t5)) {
                    D.O((BitmapDrawable) t6, str, false);
                }
            }
            if (!anVar.v4) {
                if (chat == null) {
                    return;
                }
                anVar.presentFragment(ProfileActivity.C4(-chat.id), z11);
                return;
            }
            qs0 qs0Var = this.d0;
            if (j3 == null) {
                boolean z15 = z12;
                if (chat != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    if (anVar.g4 == 3) {
                        bundle.putLong("topic_id", anVar.e9());
                    } else if (anVar.w4) {
                        bundle.putLong("topic_id", anVar.m4.e1());
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, qs0Var);
                    if (!z14) {
                        profileActivity.c5(anVar.q8);
                    }
                    profileActivity.i5(z15 ? 2 : 1);
                    anVar.presentFragment(profileActivity, z11);
                    return;
                }
                return;
            }
            if (j3.id == 489000) {
                return;
            }
            Bundle bundle2 = new Bundle();
            if (org.telegram.messenger.q10.B(j3)) {
                org.telegram.ui.ActionBar.e2 e2Var = qs0Var.x;
                int[] iArr = qs0Var.c;
                int i7 = 0;
                while (true) {
                    if (i7 < iArr.length) {
                        if (iArr[i7] > 0) {
                            break;
                        } else {
                            i7++;
                        }
                    } else if (!qs0Var.f && (e2Var == null || qs0Var.r != e2Var.getUserConfig().e() || qs0Var.s != 0 || !e2Var.getMessagesController().G1().e())) {
                        return;
                    }
                }
                bundle2.putLong("dialog_id", anVar.a());
                if (anVar.g4 == 3) {
                    bundle2.putLong("topic_id", anVar.e9());
                }
                x80 x80Var = new x80(bundle2, qs0Var);
                x80Var.c = anVar.q8;
                anVar.presentFragment(x80Var, z11);
                return;
            }
            if (anVar.g4 == 3) {
                z13 = z12;
                long e92 = anVar.e9();
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
                    bundle2.putLong("dialog_id", anVar.a());
                }
            }
            if (org.telegram.messenger.q10.u(j3)) {
                bundle2.putLong("topic_id", anVar.b());
            }
            ai.k0 k0Var = anVar.Z1;
            bundle2.putBoolean("reportSpam", (k0Var == null || (rgVar = anVar.b1) == null || !rgVar.d(k0Var) || anVar.c2.getVisibility() == 8) ? false : true);
            bundle2.putInt("actionBarColor", org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.s8, this.e0));
            ProfileActivity profileActivity2 = new ProfileActivity(bundle2, qs0Var);
            if (!z14) {
                profileActivity2.j5(anVar.r8, anVar.s8, anVar.t8);
            }
            profileActivity2.i5(z13 ? 2 : 1);
            anVar.presentFragment(profileActivity2, z11);
            return;
        }
        z12 = z10;
        anVar = this.H;
        TLRPC.User j32 = anVar.j();
        chat = anVar.e;
        if (chat == null) {
        }
        if (chat != null) {
            chat = anVar.getMessagesController().M0(Long.valueOf(chat.linked_monoforum_id));
            if (chat != null) {
            }
        }
        imageReceiver = onVar.getImageReceiver();
        str = imageReceiver.R;
        D = org.telegram.messenger.fc.D();
        if (str != null) {
            t6 = imageReceiver.t();
            if (t6 instanceof BitmapDrawable) {
                D.O((BitmapDrawable) t6, str, false);
            }
        }
        if (!anVar.v4) {
        }
    }

    public final void g(int i7, boolean z10) {
        c01 c01Var = this.G;
        if (c01Var == null) {
            return;
        }
        boolean z11 = this.n0;
        if (i7 != 0 || this.U) {
            te.a aVar = this.a;
            if (z11) {
                aVar.a(false, z10);
            } else {
                aVar.a(true, z10);
                c01Var.b(i7);
            }
        }
    }

    public i9 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.b0;
    }

    public int getLeftPadding() {
        return this.M;
    }

    public qs0 getSharedMediaPreloader() {
        return this.d0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.ok okVar = this.r;
        return okVar != null ? okVar.getTextPaint() : this.s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.ok okVar = this.r;
        if (okVar != null) {
            return okVar;
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

    public org.telegram.ui.ActionBar.j5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        org.telegram.ui.ok okVar = this.h;
        float max = okVar != null ? Math.max(0.0f, okVar.getExactWidthIncludeDrawables()) : 0.0f;
        org.telegram.ui.ok okVar2 = this.r;
        if (okVar2 != null) {
            max = Math.max(max, okVar2.getExactWidthIncludeDrawables());
        }
        on onVar = this.e;
        return (int) (max + ((onVar == null || onVar.getVisibility() != 0) ? org.telegram.messenger.g0.L(34.0f) : org.telegram.messenger.g0.L(70.0f)));
    }

    public final void h(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.EmojiStatus emojiStatus, boolean z14) {
        if (charSequence != null) {
            charSequence = org.telegram.messenger.j6.m(charSequence, this.h.getPaint().getFontMetricsInt(), false, null, 0);
        }
        this.h.k(charSequence);
        this.p0 = false;
        if (z10 || z11) {
            this.p0 = true;
            if (!(this.h.getRightDrawable() instanceof lk0)) {
                lk0 lk0Var = new lk0(!z10 ? 1 : 0);
                lk0Var.b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B8, this.e0));
                this.h.j(lk0Var);
                this.r0 = org.telegram.messenger.hd.M0(2131745862, null);
                this.o0 = true;
            }
        } else if (z12) {
            Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
            this.t0 = mutate;
            int i7 = org.telegram.ui.ActionBar.j6.qi;
            org.telegram.ui.ActionBar.e6 e6Var = this.e0;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.q6.x(this, mutate, i7, e6Var, mode);
            Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
            this.u0 = mutate2;
            org.telegram.ui.ActionBar.q6.x(this, mutate2, org.telegram.ui.ActionBar.j6.ri, this.e0, mode);
            this.h.j(new fq(this.t0, this.u0));
            this.o0 = true;
            this.r0 = org.telegram.messenger.hd.M0(2131754739, null);
        } else if (this.h.getRightDrawable() instanceof lk0) {
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
                org.telegram.ui.ActionBar.q6.x(this, mutate3, org.telegram.ui.ActionBar.j6.qi, this.e0, PorterDuff.Mode.MULTIPLY);
                this.g0.g(this.s0, z14);
            } else {
                this.g0.g(null, z14);
            }
            this.g0.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.qi, this.e0)));
            this.h.i(this.g0);
            this.o0 = false;
            this.q0 = org.telegram.messenger.hd.M0(2131754802, null);
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
        org.telegram.ui.ok okVar = this.h;
        org.telegram.ui.ActionBar.q6.q(okVar);
        org.telegram.ui.ok okVar2 = this.r;
        org.telegram.ui.ActionBar.q6.q(okVar2);
        okVar.setTextColor(i7);
        okVar2.setTextColor(i10);
        okVar2.setTag(Integer.valueOf(i10));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.ok okVar = this.h;
        okVar.setLeftDrawable(drawable);
        if (!this.o0 && !this.p0) {
            if (drawable2 != null) {
                this.r0 = org.telegram.messenger.hd.M0(2131747901, null);
            } else {
                this.r0 = null;
            }
            okVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.k(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        t8 t8Var = this.J;
        t8Var.r(user);
        boolean z11 = org.telegram.messenger.q10.z(user);
        on onVar = this.e;
        if (z11) {
            t8Var.g(12);
            t8Var.p = 0.8f;
            if (onVar != null) {
                onVar.j(null, null, t8Var, user);
                return;
            }
            return;
        }
        if (org.telegram.messenger.q10.s(user)) {
            t8Var.g(21);
            t8Var.p = 0.8f;
            if (onVar != null) {
                onVar.j(null, null, t8Var, user);
                return;
            }
            return;
        }
        if (!org.telegram.messenger.q10.B(user) || z10) {
            t8Var.p = 1.0f;
            if (onVar != null) {
                onVar.f(user, t8Var);
                return;
            }
            return;
        }
        t8Var.g(1);
        t8Var.p = 0.8f;
        if (onVar != null) {
            onVar.j(null, null, t8Var, user);
        }
    }

    public final void l() {
        int i7 = this.W;
        String M0 = i7 == 2 ? org.telegram.messenger.hd.M0(2131743212, null) : i7 == 1 ? org.telegram.messenger.hd.M0(2131751809, null) : i7 == 5 ? org.telegram.messenger.hd.M0(2131743810, null) : i7 == 4 ? org.telegram.messenger.hd.M0(2131751807, null) : null;
        org.telegram.ui.ActionBar.e6 e6Var = this.e0;
        h6 h6Var = this.s;
        org.telegram.ui.ok okVar = this.r;
        if (M0 == null) {
            CharSequence charSequence = this.a0;
            if (charSequence != null) {
                if (okVar != null) {
                    okVar.k(charSequence);
                    this.a0 = null;
                    Integer num = this.c0;
                    if (num != null) {
                        okVar.setTextColor(num.intValue());
                    } else {
                        int i10 = this.b0;
                        if (i10 >= 0) {
                            org.telegram.ui.ActionBar.q6.X(okVar, i10, e6Var);
                            okVar.setTag(Integer.valueOf(this.b0));
                        }
                    }
                } else if (h6Var != null) {
                    h6Var.c(charSequence, !org.telegram.messenger.hd.a0, true);
                    this.a0 = null;
                    Integer num2 = this.c0;
                    if (num2 != null) {
                        h6Var.setTextColor(num2.intValue());
                    } else {
                        int i11 = this.b0;
                        if (i11 >= 0) {
                            org.telegram.ui.ActionBar.q6.Y(h6Var, i11, e6Var);
                            h6Var.setTag(Integer.valueOf(this.b0));
                        }
                    }
                }
            }
        } else if (okVar != null) {
            if (this.a0 == null) {
                this.a0 = okVar.getText();
            }
            okVar.k(M0);
            Integer num3 = this.c0;
            if (num3 != null) {
                okVar.setTextColor(num3.intValue());
            } else {
                int i12 = org.telegram.ui.ActionBar.j6.B8;
                org.telegram.ui.ActionBar.q6.X(okVar, i12, e6Var);
                okVar.setTag(Integer.valueOf(i12));
            }
        } else if (h6Var != null) {
            if (this.a0 == null) {
                this.a0 = h6Var.getText();
            }
            h6Var.c(M0, !org.telegram.messenger.hd.a0, true);
            Integer num4 = this.c0;
            if (num4 != null) {
                h6Var.setTextColor(num4.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.j6.B8;
                org.telegram.ui.ActionBar.q6.Y(h6Var, i13, e6Var);
                h6Var.setTag(Integer.valueOf(i13));
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
        org.telegram.ui.an anVar = this.H;
        if (anVar == null) {
            return;
        }
        this.V = 0;
        TLRPC.ChatFull chatFull = anVar.q8;
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
            TLRPC.User a22 = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(chatFull.participants.participants.get(i10).user_id));
            if (a22 != null && (userStatus = a22.status) != null && ((userStatus.expires > currentTime || a22.id == org.telegram.messenger.m10.i(i7).e()) && a22.status.expires > 10000)) {
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
        org.telegram.ui.ActionBar.e6 e6Var = this.e0;
        boolean[] zArr = this.S;
        h6 h6Var = this.s;
        org.telegram.ui.ok okVar = this.r;
        org.telegram.ui.ok okVar2 = this.h;
        int i16 = this.K;
        org.telegram.ui.an anVar = this.H;
        if (anVar == null) {
            return;
        }
        if (anVar.g4 == 6) {
            String str = anVar.e4.link;
            kg.y[] yVarArr = kg.y.e;
            if (str.startsWith("https://")) {
                str = str.substring(8);
            }
            setSubtitle(str);
            return;
        }
        TLRPC.User j3 = anVar.j();
        TLRPC.Chat chat = anVar.e;
        boolean z13 = org.telegram.messenger.q10.B(j3) && anVar.g4 == 0 && anVar.getMessagesController().G1().c() >= 3 && (this.v0 || org.telegram.messenger.np.e1().getInt("savedmsgschatshint", 0) < 3);
        if (((org.telegram.messenger.q10.B(j3) && !z13) || org.telegram.messenger.q10.z(j3) || ((j3 != null && j3.id == 489000) || ((i7 = anVar.g4) != 0 && i7 != 8))) && anVar.g4 != 3) {
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
                org.telegram.messenger.np.e1().edit().putInt("savedmsgschatshint", org.telegram.messenger.np.e1().getInt("savedmsgschatshint", i15) + 1).apply();
                this.v0 = true;
            }
        }
        CharSequence D1 = org.telegram.messenger.np.s1(i16).D1(anVar.a(), anVar.s4, false);
        CharSequence charSequence = "";
        if (D1 != null) {
            D1 = TextUtils.replace(D1, new String[]{"..."}, new String[]{""});
        }
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        boolean z14 = z13;
        if (D1 != null && D1.length() != 0 && (!org.telegram.messenger.t3.T(chat) || chat.megagroup)) {
            if (anVar.fa() && okVar2.getTag() != null) {
                okVar2.setTag(null);
                getSubtitleTextView().setVisibility(0);
                AnimatorSet animatorSet = this.R;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.R = null;
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.R = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(okVar2, (Property<org.telegram.ui.ok, Float>) property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 1.0f));
                    this.R.addListener(new rn(this, 1));
                    this.R.setDuration(180L);
                    this.R.start();
                } else {
                    okVar2.setTranslationY(0.0f);
                    getSubtitleTextView().setAlpha(1.0f);
                }
            }
            Integer E1 = org.telegram.messenger.np.s1(i16).E1(anVar.a(), anVar.s4);
            charSequence = (E1 == null || E1.intValue() != 5) ? D1 : org.telegram.messenger.j6.m(D1, getSubtitlePaint().getFontMetricsInt(), false, null, 0);
            setTypingAnimation(true);
            z12 = true;
        } else {
            if (anVar.fa() && !anVar.w4) {
                if (okVar2.getTag() != null) {
                    return;
                }
                okVar2.setTag(1);
                AnimatorSet animatorSet3 = this.R;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.R = null;
                }
                if (!z10) {
                    okVar2.setTranslationY(org.telegram.messenger.g0.L(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                } else {
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.R = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(okVar2, (Property<org.telegram.ui.ok, Float>) property2, org.telegram.messenger.g0.L(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 0.0f));
                    this.R.addListener(new rn(this, 0));
                    this.R.setDuration(180L);
                    this.R.start();
                    return;
                }
            }
            setTypingAnimation(false);
            int i17 = anVar.g4;
            if (i17 != 8) {
                if (i17 == 3) {
                    org.telegram.messenger.tv G1 = anVar.getMessagesController().G1();
                    long e92 = anVar.e9();
                    ArrayList arrayList = G1.j;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= arrayList.size()) {
                            i14 = 0;
                            break;
                        }
                        org.telegram.messenger.sv svVar = (org.telegram.messenger.sv) arrayList.get(i18);
                        if (svVar.a == e92) {
                            i14 = svVar.e;
                            break;
                        }
                        i18++;
                    }
                    charSequence = org.telegram.messenger.hd.G(Math.max(1, i14), "SavedMessagesCount", new Object[0]);
                } else {
                    if (anVar.w4 && chat != null) {
                        TLRPC.TL_forumTopic f10 = org.telegram.messenger.np.s1(i16).r7.f(chat.id, anVar.b());
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
                            G = org.telegram.messenger.hd.a0(null, null, 2131744010, objArr2);
                        }
                    } else if (chat != null) {
                        TLRPC.ChatFull chatFull = anVar.q8;
                        int i19 = this.V;
                        if (org.telegram.messenger.t3.T(chat)) {
                            if (chatFull == null || (i11 = chatFull.participants_count) == 0) {
                                G = chat.megagroup ? chatFull == null ? org.telegram.messenger.hd.M0(2131748779, null).toLowerCase() : chat.has_geo ? org.telegram.messenger.hd.M0(2131748642, null).toLowerCase() : org.telegram.messenger.t3.t0(chat) ? org.telegram.messenger.hd.M0(2131748638, null).toLowerCase() : org.telegram.messenger.hd.M0(2131748641, null).toLowerCase() : org.telegram.messenger.t3.t0(chat) ? org.telegram.messenger.hd.M0(2131752318, null).toLowerCase() : org.telegram.messenger.hd.M0(2131752329, null).toLowerCase();
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
                        } else if (org.telegram.messenger.t3.k0(chat)) {
                            G = org.telegram.messenger.hd.M0(2131742829, null);
                        } else if (org.telegram.messenger.t3.l0(chat)) {
                            G = org.telegram.messenger.hd.M0(2131742835, null);
                        } else {
                            int i21 = chat.participants_count;
                            if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                i21 = chatParticipants.participants.size();
                            }
                            G = (i19 <= 1 || i21 == 0) ? org.telegram.messenger.hd.G(i21, "Members", new Object[0]) : a8.p0.E(org.telegram.messenger.hd.G(i21, "Members", new Object[0]), ", ", org.telegram.messenger.hd.G(i19, "OnlineCount", new Object[0]));
                        }
                    } else {
                        if (j3 != null) {
                            TLRPC.User a22 = org.telegram.messenger.np.s1(i16).a2(Long.valueOf(j3.id));
                            if (a22 != null) {
                                j3 = a22;
                            }
                            if (!org.telegram.messenger.q10.z(j3)) {
                                long j10 = j3.id;
                                if (j10 != 489000) {
                                    if (j10 == org.telegram.messenger.m10.i(i16).e()) {
                                        charSequence = z14 ? org.telegram.messenger.g0.H2(org.telegram.messenger.hd.M0(2131745892, null), false) : org.telegram.messenger.hd.M0(2131752189, null);
                                    } else {
                                        long j11 = j3.id;
                                        if (j11 == 333000 || j11 == 777000 || j11 == 42777) {
                                            z11 = false;
                                            charSequence = org.telegram.messenger.hd.M0(2131745561, null);
                                        } else if (org.telegram.messenger.np.F2(j3)) {
                                            charSequence = org.telegram.messenger.hd.M0(2131744325, null);
                                        } else {
                                            boolean z15 = j3.bot;
                                            if (z15 && (i10 = j3.bot_active_users) != 0) {
                                                charSequence = org.telegram.messenger.hd.H(',', "BotUsers", i10);
                                            } else if (z15) {
                                                charSequence = org.telegram.messenger.q10.d(j3);
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
            } else if (anVar.i4) {
                charSequence = org.telegram.messenger.hd.M0(2131752219, null);
                z12 = false;
            } else {
                if (anVar.b() == 0) {
                    org.telegram.messenger.h00 h00Var = anVar.getMessagesController().r7;
                    long j12 = -anVar.a();
                    int size = (!h00Var.e(j12) || (l10 = h00Var.l(j12)) == null) ? 0 : l10.size();
                    G = size > 0 ? org.telegram.messenger.hd.H(',', "Chats", size) : org.telegram.messenger.hd.M0(2131752219, null);
                } else {
                    TLRPC.TL_forumTopic f11 = org.telegram.messenger.np.s1(i16).r7.f(chat.id, anVar.b());
                    int i22 = f11 != null ? f11.totalMessagesCount : 0;
                    G = i22 > 0 ? org.telegram.messenger.hd.G(i22, "messages", Integer.valueOf(i22)) : org.telegram.messenger.hd.a0(null, null, 2131744010, qg.c.i(i16, chat, false));
                }
                charSequence = G;
                z12 = false;
            }
        }
        this.b0 = z12 ? org.telegram.ui.ActionBar.j6.pa : org.telegram.ui.ActionBar.j6.B8;
        if (this.a0 != null) {
            this.a0 = charSequence;
        } else if (okVar != null) {
            okVar.k(charSequence);
            Integer num = this.c0;
            if (num == null) {
                org.telegram.ui.ActionBar.q6.X(okVar, this.b0, e6Var);
                okVar.setTag(Integer.valueOf(this.b0));
            } else {
                okVar.setTextColor(num.intValue());
            }
        } else {
            h6Var.c(charSequence, z10, true);
            Integer num2 = this.c0;
            if (num2 == null) {
                org.telegram.ui.ActionBar.q6.Y(h6Var, this.b0, e6Var);
                h6Var.setTag(Integer.valueOf(this.b0));
            } else {
                h6Var.setTextColor(num2.intValue());
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
        org.telegram.ui.an anVar = this.H;
        if (anVar != null) {
            int i7 = this.K;
            org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.T1);
            org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.i4);
            if (anVar.g4 == 3) {
                org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.g3);
            }
            this.W = ConnectionsManager.getInstance(i7).getConnectionState();
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
        org.telegram.ui.an anVar = this.H;
        if (anVar != null) {
            int i7 = this.K;
            org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.T1);
            org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.i4);
            if (anVar.g4 == 3) {
                org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.g3);
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
        org.telegram.ui.ok okVar = this.r;
        if (okVar != null) {
            sb2.append(okVar.getText());
        } else {
            h6 h6Var = this.s;
            if (h6Var != null) {
                sb2.append(h6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.hd.M0(2131747786, null)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        on onVar = this.e;
        int measuredHeight = (((currentActionBarHeight - onVar.getMeasuredHeight()) - 2) / 2) + (this.L ? org.telegram.messenger.g0.m : 0);
        int L = org.telegram.messenger.g0.L(this.m0 ? 23.66f : 24.0f) + measuredHeight;
        int i13 = this.M + 1;
        int i14 = measuredHeight + 1;
        onVar.layout(i13, i14, onVar.getMeasuredWidth() + i13, onVar.getMeasuredHeight() + i14);
        int L2 = this.M + org.telegram.messenger.g0.L(onVar.getVisibility() == 0 ? this.m0 ? 49.66f : 55.0f : this.m0 ? 13.0f : 1.0f) + this.N;
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.ok okVar = this.h;
        if (visibility != 8) {
            okVar.layout(L2, (org.telegram.messenger.g0.L(1.66f) + measuredHeight) - okVar.getPaddingTop(), okVar.getMeasuredWidth() + L2, okVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.66f) + (okVar.getTextHeight() + measuredHeight)) - okVar.getPaddingTop()));
            if (j5Var != null) {
                j5Var.layout(L2, org.telegram.messenger.g0.L(1.66f) + measuredHeight, j5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(1.66f) + j5Var.getTextHeight() + measuredHeight);
            }
        } else {
            okVar.layout(L2, (org.telegram.messenger.g0.L(11.0f) + measuredHeight) - okVar.getPaddingTop(), okVar.getMeasuredWidth() + L2, okVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (okVar.getTextHeight() + measuredHeight)) - okVar.getPaddingTop()));
            if (j5Var != null) {
                j5Var.layout(L2, org.telegram.messenger.g0.L(10.0f) + measuredHeight, j5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(10.0f) + j5Var.getTextHeight() + measuredHeight);
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
        org.telegram.ui.ok okVar2 = this.r;
        if (okVar2 != null) {
            okVar2.layout(L2, L, okVar2.getMeasuredWidth() + L2, okVar2.getTextHeight() + L);
        } else {
            h6 h6Var = this.s;
            if (h6Var != null) {
                h6Var.layout(L2, L, h6Var.getMeasuredWidth() + L2, h6Var.getTextHeight() + L);
            }
        }
        org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) this.w.get();
        if (j5Var2 != null) {
            j5Var2.layout(L2, L, j5Var2.getMeasuredWidth() + L2, j5Var2.getTextHeight() + L);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        on onVar = this.e;
        int L = size - org.telegram.messenger.g0.L((onVar.getVisibility() == 0 ? 54 : 0) + 16);
        float f10 = this.d;
        onVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) - 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) - 2, TLObject.FLAG_30));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_31);
        org.telegram.ui.ok okVar = this.h;
        okVar.measure(makeMeasureSpec, makeMeasureSpec2);
        h6 h6Var = this.s;
        org.telegram.ui.ok okVar2 = this.r;
        if (okVar2 != null) {
            okVar2.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
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
            View view = (org.telegram.ui.ActionBar.j5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
            atomicReference.set(j5Var);
            int i12 = org.telegram.ui.ActionBar.j6.A8;
            org.telegram.ui.ActionBar.e6 e6Var = this.e0;
            org.telegram.ui.ActionBar.q6.X(j5Var, i12, e6Var);
            j5Var.setTextSizePx(org.telegram.messenger.g0.L(this.m0 ? 17.5f : 18.0f));
            j5Var.setGravity(3);
            j5Var.setTypeface(org.telegram.messenger.g0.o());
            j5Var.setLeftDrawableTopPadding(-org.telegram.messenger.g0.L(1.3f));
            j5Var.i(okVar.getRightDrawable());
            j5Var.j(okVar.getRightDrawable2());
            j5Var.setRightDrawableOutside(okVar.getRightDrawableOutside());
            j5Var.setLeftDrawable(okVar.getLeftDrawable());
            j5Var.l(okVar.getText(), false);
            ViewPropertyAnimator duration = j5Var.animate().alpha(0.0f).setDuration(350L);
            er erVar = er.h;
            duration.setInterpolator(erVar).withEndAction(new ln(this, 0)).start();
            addView(j5Var);
            AtomicReference atomicReference2 = this.w;
            View view2 = (org.telegram.ui.ActionBar.j5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(getContext());
            atomicReference2.set(j5Var2);
            int i13 = org.telegram.ui.ActionBar.j6.B8;
            org.telegram.ui.ActionBar.q6.X(j5Var2, i13, e6Var);
            j5Var2.setTag(Integer.valueOf(i13));
            j5Var2.setTextSizePx(org.telegram.messenger.g0.L(this.m0 ? 13.5f : 14.0f));
            j5Var2.setGravity(3);
            if (okVar2 != null) {
                j5Var2.l(okVar2.getText(), false);
            } else if (h6Var != null) {
                j5Var2.l(h6Var.getText(), false);
            }
            j5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(erVar).withEndAction(new ln(this, 1)).start();
            addView(j5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.j5 j5Var3 = (org.telegram.ui.ActionBar.j5) atomicReference.get();
        if (j5Var3 != null) {
            j5Var3.measure(org.telegram.messenger.i20.c((onVar.getVisibility() == 0 ? 54 : 0) + 16, this.Q, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_31));
        }
        this.P = size;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        dc dcVar = this.i0;
        ln lnVar = this.j0;
        if (action == 0 && a()) {
            this.k0 = true;
            dcVar.c(true);
            org.telegram.messenger.g0.r(lnVar);
            org.telegram.messenger.g0.i3(lnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.k0) {
            dcVar.c(false);
            this.k0 = false;
            if (isClickable() && motionEvent.getAction() == 1) {
                e(false, false);
            }
            org.telegram.messenger.g0.r(lnVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final PorterDuffColorFilter p() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.qi, this.e0);
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
        t8 t8Var = this.J;
        t8Var.q(chat);
        on onVar = this.e;
        if (onVar != null) {
            onVar.f(chat, t8Var);
            onVar.setRoundRadius(org.telegram.messenger.g0.L(org.telegram.messenger.t3.c0(chat) ? (chat == null || !org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).P1().K(-chat.id)) ? 16.0f : 11.0f : 21.0f));
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
            org.telegram.ui.ok okVar = this.r;
            if (okVar != null) {
                okVar.k(charSequence);
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
            kVar.k(true);
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
        qu0 qu0Var = this.O;
        org.telegram.ui.ActionBar.e6 e6Var = this.e0;
        if (qu0Var != null) {
            qu0Var.b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.pa, e6Var));
        }
        Drawable drawable = this.s0;
        if (drawable != null) {
            drawable.setColorFilter(p());
        }
        e5 e5Var = this.h0;
        if (e5Var != null) {
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.qi, e6Var)));
        }
        e5 e5Var2 = this.g0;
        if (e5Var2 != null) {
            e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.qi, e6Var)));
        }
        Drawable drawable2 = this.t0;
        if (drawable2 != null) {
            drawable2.setColorFilter(p());
        }
        if (this.u0 != null) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.ri, e6Var);
            if (this.x0 == null || w02 != this.z0) {
                this.z0 = w02;
                this.x0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
            }
            this.u0.setColorFilter(this.x0);
        }
        org.telegram.ui.ok okVar = this.h;
        if (okVar != null) {
            try {
                if (okVar.getRightDrawable2() instanceof lk0) {
                    ((lk0) okVar.getRightDrawable2()).b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B8, e6Var));
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

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }
}
