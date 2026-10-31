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
import org.telegram.ui.pb1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class sn extends FrameLayout implements fe.e, org.telegram.messenger.us, org.telegram.ui.ActionBar.k6 {
    public final ImageView D;
    public final ImageView E;
    public final f11 F;
    public final org.telegram.ui.un G;
    public final qv0[] H;
    public final r8 I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public qv0 N;
    public int O;
    public int P;
    public AnimatorSet Q;
    public final boolean[] R;
    public final boolean[] S;
    public final boolean T;
    public int U;
    public int V;
    public CharSequence W;
    public final fe.b a;
    public int a0;
    public boolean b;
    public Integer b0;
    public Integer c;
    public final rt0 c0;
    public final int d;
    public final org.telegram.ui.ActionBar.p6 d0;
    public final on e;
    public boolean e0;
    public final boolean f;
    public final d5 f0;
    public final d5 g0;
    public final org.telegram.ui.kl h;
    public final dc h0;
    public final ln i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final AtomicReference n;
    public boolean n0;
    public boolean o0;
    public String p0;
    public String q0;
    public final org.telegram.ui.kl r;
    public Drawable r0;
    public final f6 s;
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
    public org.telegram.ui.ActionBar.l z0;

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0106, code lost:
    
        if (r3 != 6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02cf, code lost:
    
        if (r0.u4 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00f8, code lost:
    
        if (r3.u4 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0341 A[EDGE_INSN: B:65:0x0341->B:73:0x0341 BREAK  A[LOOP:0: B:56:0x032f->B:62:0x033b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010f  */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sn(Context context, org.telegram.ui.ActionBar.k2 k2Var, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        boolean z11;
        int i10;
        int i11;
        ?? r72;
        TLRPC.Chat chat;
        int i12;
        qv0[] qv0VarArr;
        int i13;
        gr grVar = gr.h;
        this.a = new fe.b(0, this, grVar, 320L, false);
        this.d = 42;
        AtomicReference atomicReference = new AtomicReference();
        this.n = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.w = atomicReference2;
        qv0[] qv0VarArr2 = new qv0[6];
        this.H = qv0VarArr2;
        this.I = new r8((org.telegram.ui.ActionBar.p6) null);
        this.J = org.telegram.messenger.d20.s0;
        this.K = true;
        this.L = org.telegram.messenger.i0.L(8.0f);
        this.M = 0;
        this.O = -1;
        this.P = -1;
        this.R = new boolean[1];
        this.S = new boolean[1];
        this.U = -1;
        this.a0 = -1;
        this.e0 = false;
        this.h0 = new dc(this);
        this.i0 = new ln(this, 2);
        this.n0 = false;
        this.o0 = false;
        this.p0 = null;
        this.q0 = null;
        this.d0 = p6Var;
        boolean z12 = k2Var instanceof org.telegram.ui.un;
        if (z12) {
            this.G = (org.telegram.ui.un) k2Var;
        }
        org.telegram.ui.un unVar = this.G;
        boolean z13 = unVar != null && ((i13 = unVar.f4) == 0 || i13 == 8) && !org.telegram.messenger.h20.z(unVar.j()) && (this.G.j() == null || this.G.j().id != 489000);
        on onVar = new on(this, context, k2Var, z13, p6Var);
        this.e = onVar;
        if (z12 || (k2Var instanceof pb1)) {
            org.telegram.ui.un unVar2 = this.G;
            if (unVar2 == null || ((i10 = unVar2.f4) != 5 && i10 != 9 && i10 != 6 && i10 != 8 && !org.telegram.messenger.h20.u(unVar2.f))) {
                this.c0 = new rt0(k2Var);
            }
            org.telegram.ui.un unVar3 = this.G;
            if (unVar3 != null) {
                if (unVar3.T9()) {
                    org.telegram.ui.un unVar4 = this.G;
                    if (unVar4.l4 != null) {
                    }
                    z11 = true;
                    this.f = z11;
                    if (z11) {
                        onVar.setVisibility(8);
                    }
                }
                int i14 = this.G.f4;
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
        onVar.setContentDescription(org.telegram.messenger.cd.L0(2131754798, null));
        onVar.setRoundRadius(org.telegram.messenger.i0.L(21.0f));
        addView(onVar);
        if (z13) {
            org.telegram.ui.un unVar5 = this.G;
            TLRPC.Chat chat2 = unVar5 != null ? unVar5.e : null;
            if (chat2 != null && chat2.linked_community_id != 0) {
                w7.e6.b(onVar, 0.05f, 1.2f);
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
        org.telegram.ui.kl klVar = new org.telegram.ui.kl(context, atomicReference);
        this.h = klVar;
        klVar.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.a7.Y(klVar, org.telegram.ui.ActionBar.t6.A8, p6Var);
        klVar.setTextSize(18);
        klVar.setGravity(3);
        klVar.setTypeface(org.telegram.messenger.i0.o());
        klVar.setLeftDrawableTopPadding(-org.telegram.messenger.i0.L(1.3f));
        klVar.setCanHideRightDrawable(false);
        klVar.setRightDrawableOutside(true);
        klVar.setPadding(0, org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(12.0f));
        addView(klVar);
        if (o()) {
            f6 f6Var = new f6(context, true, true, true);
            this.s = f6Var;
            f6Var.b(0.3f, 320L, grVar);
            f6Var.setEllipsizeByGradient(true);
            int i16 = org.telegram.ui.ActionBar.t6.B8;
            org.telegram.ui.ActionBar.a7.Z(f6Var, i16, p6Var);
            f6Var.setTag(Integer.valueOf(i16));
            f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
            f6Var.setGravity(3);
            f6Var.setPadding(0, 0, org.telegram.messenger.i0.L(10.0f), 0);
            f6Var.setTranslationY(-org.telegram.messenger.i0.L(1.0f));
            addView(f6Var);
        } else {
            org.telegram.ui.kl klVar2 = new org.telegram.ui.kl(context, atomicReference2);
            this.r = klVar2;
            klVar2.setEllipsizeByGradient(true);
            int i17 = org.telegram.ui.ActionBar.t6.B8;
            org.telegram.ui.ActionBar.a7.Y(klVar2, i17, p6Var);
            klVar2.setTag(Integer.valueOf(i17));
            klVar2.setTextSize(14);
            klVar2.setGravity(3);
            klVar2.setPadding(0, 0, org.telegram.messenger.i0.L(10.0f), 0);
            addView(klVar2);
        }
        if (this.G != null) {
            ImageView imageView = new ImageView(context);
            this.y = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setVisibility(8);
            imageView.setImageDrawable(new yg.c());
            addView(imageView);
            ImageView imageView2 = new ImageView(context);
            this.x = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setVisibility(8);
            f11 f11Var = new f11(context, p6Var);
            this.F = f11Var;
            imageView2.setImageDrawable(f11Var);
            f11Var.k = true;
            f11Var.b.setColor(0);
            addView(imageView2);
            this.T = z10;
            imageView2.setOnClickListener(new org.telegram.ui.ud(25, this, p6Var));
            if (z10) {
                imageView2.setContentDescription(org.telegram.messenger.cd.L0(2131745526, null));
            } else {
                imageView2.setContentDescription(org.telegram.messenger.cd.L0(2131754925, null));
            }
            ImageView imageView3 = new ImageView(context);
            this.D = imageView3;
            imageView3.setImageResource(R.drawable.star_small_outline);
            org.telegram.ui.ActionBar.a7.t(imageView3, org.telegram.ui.ActionBar.t6.s8, p6Var, PorterDuff.Mode.SRC_IN);
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
        org.telegram.ui.un unVar6 = this.G;
        if (unVar6 != null && ((i11 = unVar6.f4) == 0 || i11 == 8 || i11 == 3)) {
            if (unVar6.T9()) {
                org.telegram.ui.un unVar7 = this.G;
                if (!unVar7.v4) {
                }
            }
            if (!org.telegram.messenger.h20.z(this.G.j()) && (this.G.j() == null || this.G.j().id != 489000)) {
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
                chat = this.G.e;
                qv0VarArr2[0] = new y41(r72);
                qv0VarArr2[r72] = new ip(r72);
                qv0VarArr2[2] = new eo0(r72);
                qv0VarArr2[3] = new lf0(p6Var, false);
                qv0VarArr2[4] = new hl0(r72);
                qv0VarArr2[5] = new ip();
                i12 = 0;
                while (true) {
                    qv0VarArr = this.H;
                    if (i12 < qv0VarArr.length) {
                        break;
                    }
                    qv0VarArr[i12].c(chat != null ? r72 : false);
                    i12++;
                }
            }
            r72 = 1;
            chat = this.G.e;
            qv0VarArr2[0] = new y41(r72);
            qv0VarArr2[r72] = new ip(r72);
            qv0VarArr2[2] = new eo0(r72);
            qv0VarArr2[3] = new lf0(p6Var, false);
            qv0VarArr2[4] = new hl0(r72);
            qv0VarArr2[5] = new ip();
            i12 = 0;
            while (true) {
                qv0VarArr = this.H;
                if (i12 < qv0VarArr.length) {
                }
                qv0VarArr[i12].c(chat != null ? r72 : false);
                i12++;
            }
        }
        this.f0 = new d5(org.telegram.messenger.i0.L(24.0f), this.h);
        this.g0 = new d5(org.telegram.messenger.i0.L(17.0f), this.h);
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.un unVar = this.G;
        org.telegram.ui.kl klVar = this.r;
        if (klVar == null) {
            return;
        }
        int i10 = 0;
        qv0[] qv0VarArr = this.H;
        if (!z10) {
            this.N = null;
            klVar.setLeftDrawable((Drawable) null);
            klVar.g(null, null);
            while (i10 < qv0VarArr.length) {
                qv0 qv0Var = qv0VarArr[i10];
                if (qv0Var != null) {
                    qv0Var.e();
                }
                i10++;
            }
            return;
        }
        try {
            int intValue = org.telegram.messenger.vp.r1(this.J).D1(unVar.a(), unVar.r4).intValue();
            qv0 qv0Var2 = qv0VarArr[intValue];
            if (qv0Var2 == null) {
                return;
            }
            org.telegram.ui.ActionBar.p6 p6Var = this.d0;
            if (intValue == 5) {
                klVar.g(qv0Var2, "**oo**");
                qv0VarArr[intValue].b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.pa, p6Var));
                klVar.setLeftDrawable((Drawable) null);
            } else {
                klVar.g(null, null);
                qv0VarArr[intValue].b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.pa, p6Var));
                klVar.setLeftDrawable(qv0VarArr[intValue]);
            }
            this.N = qv0VarArr[intValue];
            while (i10 < qv0VarArr.length) {
                qv0 qv0Var3 = qv0VarArr[i10];
                if (qv0Var3 != null) {
                    if (i10 == intValue) {
                        qv0Var3.d();
                    } else {
                        qv0Var3.e();
                    }
                }
                i10++;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public boolean a() {
        return false;
    }

    public final void b() {
        TLRPC.User user;
        int L;
        org.telegram.ui.un unVar = this.G;
        if (unVar == null) {
            return;
        }
        TLRPC.User j10 = unVar.j();
        TLRPC.Chat chat = unVar.e;
        if (unVar.f4 == 3) {
            long V8 = unVar.V8();
            if (V8 >= 0) {
                user = unVar.getMessagesController().Z1(Long.valueOf(V8));
                chat = null;
            } else {
                chat = unVar.getMessagesController().L0(Long.valueOf(-V8));
                user = null;
            }
        } else {
            user = j10;
        }
        r8 r8Var = this.I;
        on onVar = this.e;
        if (user == null) {
            if (!org.telegram.messenger.w3.p0(chat)) {
                if (chat != null) {
                    r8Var.p = 1.0f;
                    r8Var.q(chat);
                    if (onVar != null) {
                        onVar.setAnimatedEmojiDrawable(null);
                        onVar.e(chat, r8Var);
                        if (chat.forum) {
                            L = org.telegram.messenger.i0.L(org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).O1().K(-chat.id) ? 11.0f : 16.0f);
                        } else {
                            L = org.telegram.messenger.i0.L(21.0f);
                        }
                        onVar.setRoundRadius(L);
                        return;
                    }
                    return;
                }
                return;
            }
            long b10 = unVar.b();
            int i10 = this.J;
            if (!org.telegram.messenger.w3.A(i10, chat, 24) || b10 == 0) {
                onVar.setAnimatedEmojiDrawable(null);
                gg.e.o(i10, chat, r8Var, onVar);
            } else if (b10 > 0) {
                TLRPC.User Z1 = unVar.getMessagesController().Z1(Long.valueOf(b10));
                r8Var.r(Z1);
                onVar.setAnimatedEmojiDrawable(null);
                onVar.e(Z1, r8Var);
            } else {
                TLRPC.Chat L0 = unVar.getMessagesController().L0(Long.valueOf(-b10));
                r8Var.q(L0);
                onVar.setAnimatedEmojiDrawable(null);
                onVar.e(L0, r8Var);
            }
            onVar.setRoundRadius(org.telegram.messenger.i0.L(21.0f));
            return;
        }
        r8Var.r(user);
        if (org.telegram.messenger.h20.z(user)) {
            r8Var.p = 0.8f;
            r8Var.g(12);
            if (onVar != null) {
                onVar.setAnimatedEmojiDrawable(null);
                onVar.j(null, null, r8Var, user);
                return;
            }
            return;
        }
        if (org.telegram.messenger.h20.s(user)) {
            r8Var.p = 0.8f;
            r8Var.g(21);
            if (onVar != null) {
                onVar.setAnimatedEmojiDrawable(null);
                onVar.j(null, null, r8Var, user);
                return;
            }
            return;
        }
        if (org.telegram.messenger.h20.B(user) && unVar.f4 == 3) {
            r8Var.p = 0.8f;
            r8Var.g(22);
            if (onVar != null) {
                onVar.setAnimatedEmojiDrawable(null);
                onVar.j(null, null, r8Var, user);
                return;
            }
            return;
        }
        if (!org.telegram.messenger.h20.B(user)) {
            r8Var.p = 1.0f;
            if (onVar != null) {
                onVar.setAnimatedEmojiDrawable(null);
                onVar.a.j0(user, r8Var, null, true, 3, false);
                return;
            }
            return;
        }
        r8Var.p = 0.8f;
        r8Var.g(1);
        if (onVar != null) {
            onVar.setAnimatedEmojiDrawable(null);
            onVar.j(null, null, r8Var, user);
        }
    }

    public final d5 c(long j10) {
        if (j10 == 0) {
            return null;
        }
        d5 d5Var = this.g0;
        d5Var.j(j10, false);
        d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, this.d0)));
        int L = org.telegram.messenger.i0.L(1.0f);
        d5Var.I = 0;
        d5Var.J = L;
        return d5Var;
    }

    public boolean d() {
        return false;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.T1) {
            int connectionState = ConnectionsManager.getInstance(this.J).getConnectionState();
            if (this.V != connectionState) {
                this.V = connectionState;
                l();
                return;
            }
            return;
        }
        if (i10 != org.telegram.messenger.zs.i4) {
            if (i10 == org.telegram.messenger.zs.g3) {
                n(true);
            }
        } else {
            org.telegram.ui.kl klVar = this.h;
            if (klVar != null) {
                klVar.invalidate();
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
        float a2 = this.h0.a(0.02f);
        canvas.scale(a2, a2, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f));
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
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-org.telegram.messenger.i0.L(3.0f), -org.telegram.messenger.i0.L(3.0f));
                canvas.saveLayer(rectF, null);
                boolean drawChild = super.drawChild(canvas, view, j10);
                if (z11) {
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - org.telegram.messenger.i0.N(0.33f), imageView.getScaleX() * org.telegram.messenger.i0.N(12.0f), org.telegram.ui.ActionBar.t6.Cm);
                }
                if (z10) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * org.telegram.messenger.i0.N(7.66f), org.telegram.ui.ActionBar.t6.Cm);
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
        org.telegram.ui.un unVar;
        TLRPC.Chat chat;
        ImageReceiver imageReceiver;
        String str;
        org.telegram.messenger.hc D;
        boolean z13;
        hg hgVar;
        Drawable t10;
        TLRPC.User Z1;
        on onVar = this.e;
        if (z10) {
            if (!org.telegram.messenger.i0.Q1()) {
                Point point = org.telegram.messenger.i0.q;
                if (point.x <= point.y) {
                }
            }
            z12 = false;
            unVar = this.G;
            TLRPC.User j10 = unVar.j();
            chat = unVar.e;
            boolean z14 = chat == null && chat.monoforum;
            if (chat != null && chat.monoforum) {
                chat = unVar.getMessagesController().L0(Long.valueOf(chat.linked_monoforum_id));
                if (chat != null) {
                    return;
                }
                if (unVar.a9() != 0 && (Z1 = unVar.getMessagesController().Z1(Long.valueOf(unVar.a9()))) != null) {
                    chat = null;
                    j10 = Z1;
                }
            }
            imageReceiver = onVar.getImageReceiver();
            str = imageReceiver.Q;
            D = org.telegram.messenger.hc.D();
            if (str != null && !D.J(str, false)) {
                t10 = imageReceiver.t();
                if ((t10 instanceof BitmapDrawable) && !(t10 instanceof s5)) {
                    D.O((BitmapDrawable) t10, str, false);
                }
            }
            if (!unVar.u4) {
                if (chat == null) {
                    return;
                }
                unVar.presentFragment(ProfileActivity.z4(-chat.id), z11);
                return;
            }
            rt0 rt0Var = this.c0;
            if (j10 == null) {
                boolean z15 = z12;
                if (chat != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    if (unVar.f4 == 3) {
                        bundle.putLong("topic_id", unVar.V8());
                    } else if (unVar.v4) {
                        bundle.putLong("topic_id", unVar.l4.f1());
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, rt0Var);
                    if (!z14) {
                        profileActivity.Z4(unVar.p8);
                    }
                    profileActivity.f5(z15 ? 2 : 1);
                    unVar.presentFragment(profileActivity, z11);
                    return;
                }
                return;
            }
            if (j10.id == 489000) {
                return;
            }
            Bundle bundle2 = new Bundle();
            if (org.telegram.messenger.h20.B(j10)) {
                org.telegram.ui.ActionBar.k2 k2Var = rt0Var.x;
                int[] iArr = rt0Var.c;
                int i10 = 0;
                while (true) {
                    if (i10 < iArr.length) {
                        if (iArr[i10] > 0) {
                            break;
                        } else {
                            i10++;
                        }
                    } else if (!rt0Var.f && (k2Var == null || rt0Var.r != k2Var.getUserConfig().e() || rt0Var.s != 0 || !k2Var.getMessagesController().F1().e())) {
                        return;
                    }
                }
                bundle2.putLong("dialog_id", unVar.a());
                if (unVar.f4 == 3) {
                    bundle2.putLong("topic_id", unVar.V8());
                }
                n90 n90Var = new n90(bundle2, rt0Var);
                n90Var.c = unVar.p8;
                unVar.presentFragment(n90Var, z11);
                return;
            }
            if (unVar.f4 == 3) {
                z13 = z12;
                long V8 = unVar.V8();
                bundle2.putBoolean("saved", true);
                if (V8 >= 0) {
                    bundle2.putLong("user_id", V8);
                } else {
                    bundle2.putLong("chat_id", -V8);
                }
            } else {
                z13 = z12;
                bundle2.putLong("user_id", j10.id);
                if (this.x != null && !z14) {
                    bundle2.putLong("dialog_id", unVar.a());
                }
            }
            if (org.telegram.messenger.h20.u(j10)) {
                bundle2.putLong("topic_id", unVar.b());
            }
            org.telegram.ui.ActionBar.m0 m0Var = unVar.Y1;
            bundle2.putBoolean("reportSpam", (m0Var == null || (hgVar = unVar.a1) == null || !hgVar.d(m0Var) || unVar.b2.getVisibility() == 8) ? false : true);
            bundle2.putInt("actionBarColor", org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, this.d0));
            ProfileActivity profileActivity2 = new ProfileActivity(bundle2, rt0Var);
            if (!z14) {
                profileActivity2.g5(unVar.q8, unVar.r8, unVar.s8);
            }
            profileActivity2.f5(z13 ? 2 : 1);
            unVar.presentFragment(profileActivity2, z11);
            return;
        }
        z12 = z10;
        unVar = this.G;
        TLRPC.User j102 = unVar.j();
        chat = unVar.e;
        if (chat == null) {
        }
        if (chat != null) {
            chat = unVar.getMessagesController().L0(Long.valueOf(chat.linked_monoforum_id));
            if (chat != null) {
            }
        }
        imageReceiver = onVar.getImageReceiver();
        str = imageReceiver.Q;
        D = org.telegram.messenger.hc.D();
        if (str != null) {
            t10 = imageReceiver.t();
            if (t10 instanceof BitmapDrawable) {
                D.O((BitmapDrawable) t10, str, false);
            }
        }
        if (!unVar.u4) {
        }
    }

    public final void g(int i10, boolean z10) {
        f11 f11Var = this.F;
        if (f11Var == null) {
            return;
        }
        boolean z11 = this.m0;
        if (i10 != 0 || this.T) {
            fe.b bVar = this.a;
            if (z11) {
                bVar.a(false, z10);
            } else {
                bVar.a(true, z10);
                f11Var.b(i10);
            }
        }
    }

    public g9 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.a0;
    }

    public int getLeftPadding() {
        return this.L;
    }

    public rt0 getSharedMediaPreloader() {
        return this.c0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.kl klVar = this.r;
        return klVar != null ? klVar.getTextPaint() : this.s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.kl klVar = this.r;
        if (klVar != null) {
            return klVar;
        }
        f6 f6Var = this.s;
        if (f6Var != null) {
            return f6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.x;
    }

    public org.telegram.ui.ActionBar.u5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        org.telegram.ui.kl klVar = this.h;
        float max = klVar != null ? Math.max(0.0f, klVar.getExactWidthIncludeDrawables()) : 0.0f;
        org.telegram.ui.kl klVar2 = this.r;
        if (klVar2 != null) {
            max = Math.max(max, klVar2.getExactWidthIncludeDrawables());
        }
        on onVar = this.e;
        return (int) (max + ((onVar == null || onVar.getVisibility() != 0) ? org.telegram.messenger.i0.L(34.0f) : org.telegram.messenger.i0.L(70.0f)));
    }

    public final void h(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.EmojiStatus emojiStatus, boolean z14) {
        if (charSequence != null) {
            charSequence = org.telegram.messenger.k6.m(charSequence, this.h.getPaint().getFontMetricsInt(), false, null, 0);
        }
        this.h.k(charSequence);
        this.o0 = false;
        if (z10 || z11) {
            this.o0 = true;
            if (!(this.h.getRightDrawable() instanceof kl0)) {
                kl0 kl0Var = new kl0(!z10 ? 1 : 0);
                kl0Var.b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, this.d0));
                this.h.j(kl0Var);
                this.q0 = org.telegram.messenger.cd.L0(2131745879, null);
                this.n0 = true;
            }
        } else if (z12) {
            Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
            this.s0 = mutate;
            int i10 = org.telegram.ui.ActionBar.t6.ni;
            org.telegram.ui.ActionBar.p6 p6Var = this.d0;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.a7.y(this, mutate, i10, p6Var, mode);
            Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
            this.t0 = mutate2;
            org.telegram.ui.ActionBar.a7.y(this, mutate2, org.telegram.ui.ActionBar.t6.oi, this.d0, mode);
            this.h.j(new eq(this.s0, this.t0));
            this.n0 = true;
            this.q0 = org.telegram.messenger.cd.L0(2131754739, null);
        } else if (this.h.getRightDrawable() instanceof kl0) {
            this.h.j(null);
            this.n0 = false;
            this.q0 = null;
        }
        if (z13 || org.telegram.messenger.o5.f(emojiStatus) != 0) {
            if ((this.h.getRightDrawable() instanceof e5) && (((e5) this.h.getRightDrawable()).a instanceof f5)) {
                ((f5) ((e5) this.h.getRightDrawable()).a).n(this.h);
            }
            if (org.telegram.messenger.o5.f(emojiStatus) != 0) {
                this.f0.j(org.telegram.messenger.o5.f(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = org.telegram.messenger.w0.b.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.r0 = mutate3;
                org.telegram.ui.ActionBar.a7.y(this, mutate3, org.telegram.ui.ActionBar.t6.ni, this.d0, PorterDuff.Mode.MULTIPLY);
                this.f0.g(this.r0, z14);
            } else {
                this.f0.g(null, z14);
            }
            this.f0.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, this.d0)));
            this.h.i(this.f0);
            this.n0 = false;
            this.p0 = org.telegram.messenger.cd.L0(2131754802, null);
        } else {
            this.h.i(null);
            this.p0 = null;
        }
        org.telegram.ui.ActionBar.l lVar = this.z0;
        if (lVar != null) {
            lVar.h(z14);
        }
    }

    public final void i(int i10, int i11) {
        org.telegram.ui.kl klVar = this.h;
        org.telegram.ui.ActionBar.a7.r(klVar);
        org.telegram.ui.kl klVar2 = this.r;
        org.telegram.ui.ActionBar.a7.r(klVar2);
        klVar.setTextColor(i10);
        klVar2.setTextColor(i11);
        klVar2.setTag(Integer.valueOf(i11));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.kl klVar = this.h;
        klVar.setLeftDrawable(drawable);
        if (!this.n0 && !this.o0) {
            if (drawable2 != null) {
                this.q0 = org.telegram.messenger.cd.L0(2131747917, null);
            } else {
                this.q0 = null;
            }
            klVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.l lVar = this.z0;
        if (lVar != null) {
            lVar.h(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        r8 r8Var = this.I;
        r8Var.r(user);
        boolean z11 = org.telegram.messenger.h20.z(user);
        on onVar = this.e;
        if (z11) {
            r8Var.g(12);
            r8Var.p = 0.8f;
            if (onVar != null) {
                onVar.j(null, null, r8Var, user);
                return;
            }
            return;
        }
        if (org.telegram.messenger.h20.s(user)) {
            r8Var.g(21);
            r8Var.p = 0.8f;
            if (onVar != null) {
                onVar.j(null, null, r8Var, user);
                return;
            }
            return;
        }
        if (!org.telegram.messenger.h20.B(user) || z10) {
            r8Var.p = 1.0f;
            if (onVar != null) {
                onVar.e(user, r8Var);
                return;
            }
            return;
        }
        r8Var.g(1);
        r8Var.p = 0.8f;
        if (onVar != null) {
            onVar.j(null, null, r8Var, user);
        }
    }

    public final void l() {
        int i10 = this.V;
        String L0 = i10 == 2 ? org.telegram.messenger.cd.L0(2131743238, null) : i10 == 1 ? org.telegram.messenger.cd.L0(2131751809, null) : i10 == 5 ? org.telegram.messenger.cd.L0(2131743836, null) : i10 == 4 ? org.telegram.messenger.cd.L0(2131751807, null) : null;
        org.telegram.ui.ActionBar.p6 p6Var = this.d0;
        f6 f6Var = this.s;
        org.telegram.ui.kl klVar = this.r;
        if (L0 == null) {
            CharSequence charSequence = this.W;
            if (charSequence != null) {
                if (klVar != null) {
                    klVar.k(charSequence);
                    this.W = null;
                    Integer num = this.b0;
                    if (num != null) {
                        klVar.setTextColor(num.intValue());
                    } else {
                        int i11 = this.a0;
                        if (i11 >= 0) {
                            org.telegram.ui.ActionBar.a7.Y(klVar, i11, p6Var);
                            klVar.setTag(Integer.valueOf(this.a0));
                        }
                    }
                } else if (f6Var != null) {
                    f6Var.c(charSequence, !org.telegram.messenger.cd.X, true);
                    this.W = null;
                    Integer num2 = this.b0;
                    if (num2 != null) {
                        f6Var.setTextColor(num2.intValue());
                    } else {
                        int i12 = this.a0;
                        if (i12 >= 0) {
                            org.telegram.ui.ActionBar.a7.Z(f6Var, i12, p6Var);
                            f6Var.setTag(Integer.valueOf(this.a0));
                        }
                    }
                }
            }
        } else if (klVar != null) {
            if (this.W == null) {
                this.W = klVar.getText();
            }
            klVar.k(L0);
            Integer num3 = this.b0;
            if (num3 != null) {
                klVar.setTextColor(num3.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.t6.B8;
                org.telegram.ui.ActionBar.a7.Y(klVar, i13, p6Var);
                klVar.setTag(Integer.valueOf(i13));
            }
        } else if (f6Var != null) {
            if (this.W == null) {
                this.W = f6Var.getText();
            }
            f6Var.c(L0, !org.telegram.messenger.cd.X, true);
            Integer num4 = this.b0;
            if (num4 != null) {
                f6Var.setTextColor(num4.intValue());
            } else {
                int i14 = org.telegram.ui.ActionBar.t6.B8;
                org.telegram.ui.ActionBar.a7.Z(f6Var, i14, p6Var);
                f6Var.setTag(Integer.valueOf(i14));
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.z0;
        if (lVar != null) {
            lVar.h(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.un unVar = this.G;
        if (unVar == null) {
            return;
        }
        this.U = 0;
        TLRPC.ChatFull chatFull = unVar.p8;
        if (chatFull == null) {
            return;
        }
        int i10 = this.J;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z10 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (!z10 || chatFull.participants_count <= 200) {
                return;
            }
            this.U = chatFull.online_count;
            return;
        }
        for (int i11 = 0; i11 < chatFull.participants.participants.size(); i11++) {
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(chatFull.participants.participants.get(i11).user_id));
            if (Z1 != null && (userStatus = Z1.status) != null && ((userStatus.expires > currentTime || Z1.id == org.telegram.messenger.d20.i(i10).e()) && Z1.status.expires > 10000)) {
                this.U++;
            }
        }
    }

    public final void n(boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        String G;
        TLRPC.ChatParticipants chatParticipants;
        int i12;
        String S;
        int i13;
        int i14;
        int i15;
        ArrayList l4;
        int i16;
        org.telegram.ui.ActionBar.p6 p6Var = this.d0;
        boolean[] zArr = this.R;
        f6 f6Var = this.s;
        org.telegram.ui.kl klVar = this.r;
        org.telegram.ui.kl klVar2 = this.h;
        int i17 = this.J;
        org.telegram.ui.un unVar = this.G;
        if (unVar == null) {
            return;
        }
        if (unVar.f4 == 6) {
            String str = unVar.d4.link;
            ag.s0[] s0VarArr = ag.s0.e;
            if (str.startsWith("https://")) {
                str = str.substring(8);
            }
            setSubtitle(str);
            return;
        }
        TLRPC.User j10 = unVar.j();
        TLRPC.Chat chat = unVar.e;
        boolean z13 = org.telegram.messenger.h20.B(j10) && unVar.f4 == 0 && unVar.getMessagesController().F1().c() >= 3 && (this.u0 || org.telegram.messenger.vp.d1().getInt("savedmsgschatshint", 0) < 3);
        if (((org.telegram.messenger.h20.B(j10) && !z13) || org.telegram.messenger.h20.z(j10) || ((j10 != null && j10.id == 489000) || ((i10 = unVar.f4) != 0 && i10 != 8))) && unVar.f4 != 3) {
            if (getSubtitleTextView().getVisibility() != 8) {
                getSubtitleTextView().setVisibility(8);
                return;
            }
            return;
        }
        if (z13) {
            if (getSubtitleTextView().getVisibility() != 0) {
                i16 = 0;
                getSubtitleTextView().setVisibility(0);
            } else {
                i16 = 0;
            }
            if (!this.u0) {
                org.telegram.messenger.vp.d1().edit().putInt("savedmsgschatshint", org.telegram.messenger.vp.d1().getInt("savedmsgschatshint", i16) + 1).apply();
                this.u0 = true;
            }
        }
        CharSequence C1 = org.telegram.messenger.vp.r1(i17).C1(unVar.a(), unVar.r4, false);
        CharSequence charSequence = "";
        if (C1 != null) {
            C1 = TextUtils.replace(C1, new String[]{"..."}, new String[]{""});
        }
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        boolean z14 = z13;
        if (C1 != null && C1.length() != 0 && (!org.telegram.messenger.w3.T(chat) || chat.megagroup)) {
            if (unVar.T9() && klVar2.getTag() != null) {
                klVar2.setTag(null);
                getSubtitleTextView().setVisibility(0);
                AnimatorSet animatorSet = this.Q;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.Q = null;
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.Q = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(klVar2, (Property<org.telegram.ui.kl, Float>) property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 1.0f));
                    this.Q.addListener(new rn(this, 1));
                    this.Q.setDuration(180L);
                    this.Q.start();
                } else {
                    klVar2.setTranslationY(0.0f);
                    getSubtitleTextView().setAlpha(1.0f);
                }
            }
            Integer D1 = org.telegram.messenger.vp.r1(i17).D1(unVar.a(), unVar.r4);
            charSequence = (D1 == null || D1.intValue() != 5) ? C1 : org.telegram.messenger.k6.m(C1, getSubtitlePaint().getFontMetricsInt(), false, null, 0);
            setTypingAnimation(true);
            z12 = true;
        } else {
            if (unVar.T9() && !unVar.v4) {
                if (klVar2.getTag() != null) {
                    return;
                }
                klVar2.setTag(1);
                AnimatorSet animatorSet3 = this.Q;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.Q = null;
                }
                if (!z10) {
                    klVar2.setTranslationY(org.telegram.messenger.i0.L(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                } else {
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.Q = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(klVar2, (Property<org.telegram.ui.kl, Float>) property2, org.telegram.messenger.i0.L(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 0.0f));
                    this.Q.addListener(new rn(this, 0));
                    this.Q.setDuration(180L);
                    this.Q.start();
                    return;
                }
            }
            setTypingAnimation(false);
            int i18 = unVar.f4;
            if (i18 != 8) {
                if (i18 == 3) {
                    org.telegram.messenger.gw F1 = unVar.getMessagesController().F1();
                    long V8 = unVar.V8();
                    ArrayList arrayList = F1.j;
                    int i19 = 0;
                    while (true) {
                        if (i19 >= arrayList.size()) {
                            i15 = 0;
                            break;
                        }
                        org.telegram.messenger.fw fwVar = (org.telegram.messenger.fw) arrayList.get(i19);
                        if (fwVar.a == V8) {
                            i15 = fwVar.e;
                            break;
                        }
                        i19++;
                    }
                    charSequence = org.telegram.messenger.cd.G(Math.max(1, i15), "SavedMessagesCount", new Object[0]);
                } else {
                    if (unVar.v4 && chat != null) {
                        TLRPC.TL_forumTopic f7 = org.telegram.messenger.vp.r1(i17).r7.f(chat.id, unVar.b());
                        if (f7 != null) {
                            i13 = 1;
                            i14 = f7.totalMessagesCount - 1;
                        } else {
                            i13 = 1;
                            i14 = 0;
                        }
                        if (i14 > 0) {
                            Object[] objArr = new Object[i13];
                            objArr[0] = Integer.valueOf(i14);
                            G = org.telegram.messenger.cd.G(i14, "messages", objArr);
                        } else {
                            Object[] objArr2 = new Object[i13];
                            objArr2[0] = chat.title;
                            G = org.telegram.messenger.cd.a0(null, null, 2131744035, objArr2);
                        }
                    } else if (chat != null) {
                        TLRPC.ChatFull chatFull = unVar.p8;
                        int i20 = this.U;
                        if (org.telegram.messenger.w3.T(chat)) {
                            if (chatFull == null || (i12 = chatFull.participants_count) == 0) {
                                G = chat.megagroup ? chatFull == null ? org.telegram.messenger.cd.L0(2131748789, null).toLowerCase() : chat.has_geo ? org.telegram.messenger.cd.L0(2131748657, null).toLowerCase() : org.telegram.messenger.w3.t0(chat) ? org.telegram.messenger.cd.L0(2131748653, null).toLowerCase() : org.telegram.messenger.cd.L0(2131748656, null).toLowerCase() : org.telegram.messenger.w3.t0(chat) ? org.telegram.messenger.cd.L0(2131752318, null).toLowerCase() : org.telegram.messenger.cd.L0(2131752329, null).toLowerCase();
                            } else if (chat.megagroup) {
                                G = i20 > 1 ? a1.g.C(org.telegram.messenger.cd.G(i12, "Members", new Object[0]), ", ", org.telegram.messenger.cd.G(Math.min(i20, chatFull.participants_count), "OnlineCount", new Object[0])) : org.telegram.messenger.cd.G(i12, "Members", new Object[0]);
                            } else {
                                int[] iArr = new int[1];
                                boolean C12 = org.telegram.messenger.i0.C1();
                                int i21 = chatFull.participants_count;
                                if (C12) {
                                    iArr[0] = i21;
                                    S = String.valueOf(i21);
                                } else {
                                    S = org.telegram.messenger.cd.S(iArr, i21);
                                }
                                G = chat.megagroup ? org.telegram.messenger.cd.G(iArr[0], "Members", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S) : org.telegram.messenger.cd.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                            }
                        } else if (org.telegram.messenger.w3.k0(chat)) {
                            G = org.telegram.messenger.cd.L0(2131742854, null);
                        } else if (org.telegram.messenger.w3.l0(chat)) {
                            G = org.telegram.messenger.cd.L0(2131742860, null);
                        } else {
                            int i22 = chat.participants_count;
                            if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                i22 = chatParticipants.participants.size();
                            }
                            G = (i20 <= 1 || i22 == 0) ? org.telegram.messenger.cd.G(i22, "Members", new Object[0]) : a1.g.C(org.telegram.messenger.cd.G(i22, "Members", new Object[0]), ", ", org.telegram.messenger.cd.G(i20, "OnlineCount", new Object[0]));
                        }
                    } else {
                        if (j10 != null) {
                            TLRPC.User Z1 = org.telegram.messenger.vp.r1(i17).Z1(Long.valueOf(j10.id));
                            if (Z1 != null) {
                                j10 = Z1;
                            }
                            if (!org.telegram.messenger.h20.z(j10)) {
                                long j11 = j10.id;
                                if (j11 != 489000) {
                                    if (j11 == org.telegram.messenger.d20.i(i17).e()) {
                                        charSequence = z14 ? org.telegram.messenger.i0.G2(org.telegram.messenger.cd.L0(2131745909, null), false) : org.telegram.messenger.cd.L0(2131752189, null);
                                    } else {
                                        long j12 = j10.id;
                                        if (j12 == 333000 || j12 == 777000 || j12 == 42777) {
                                            z11 = false;
                                            charSequence = org.telegram.messenger.cd.L0(2131745578, null);
                                        } else if (org.telegram.messenger.vp.E2(j10)) {
                                            charSequence = org.telegram.messenger.cd.L0(2131744351, null);
                                        } else {
                                            boolean z15 = j10.bot;
                                            if (z15 && (i11 = j10.bot_active_users) != 0) {
                                                charSequence = org.telegram.messenger.cd.H(',', "BotUsers", i11);
                                            } else if (z15) {
                                                charSequence = org.telegram.messenger.h20.d(j10);
                                            } else {
                                                zArr[0] = false;
                                                charSequence = org.telegram.messenger.cd.d0(i17, j10, zArr, this.e0 ? this.S : null);
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
            } else if (unVar.h4) {
                charSequence = org.telegram.messenger.cd.L0(2131752219, null);
                z12 = false;
            } else {
                if (unVar.b() == 0) {
                    org.telegram.messenger.x00 x00Var = unVar.getMessagesController().r7;
                    long j13 = -unVar.a();
                    int size = (!x00Var.e(j13) || (l4 = x00Var.l(j13)) == null) ? 0 : l4.size();
                    G = size > 0 ? org.telegram.messenger.cd.H(',', "Chats", size) : org.telegram.messenger.cd.L0(2131752219, null);
                } else {
                    TLRPC.TL_forumTopic f10 = org.telegram.messenger.vp.r1(i17).r7.f(chat.id, unVar.b());
                    int i23 = f10 != null ? f10.totalMessagesCount : 0;
                    G = i23 > 0 ? org.telegram.messenger.cd.G(i23, "messages", Integer.valueOf(i23)) : org.telegram.messenger.cd.a0(null, null, 2131744035, gg.e.i(i17, chat, false));
                }
                charSequence = G;
                z12 = false;
            }
        }
        this.a0 = z12 ? org.telegram.ui.ActionBar.t6.pa : org.telegram.ui.ActionBar.t6.B8;
        if (this.W != null) {
            this.W = charSequence;
        } else if (klVar != null) {
            klVar.k(charSequence);
            Integer num = this.b0;
            if (num == null) {
                org.telegram.ui.ActionBar.a7.Y(klVar, this.a0, p6Var);
                klVar.setTag(Integer.valueOf(this.a0));
            } else {
                klVar.setTextColor(num.intValue());
            }
        } else {
            f6Var.c(charSequence, z10, true);
            Integer num2 = this.b0;
            if (num2 == null) {
                org.telegram.ui.ActionBar.a7.Z(f6Var, this.a0, p6Var);
                f6Var.setTag(Integer.valueOf(this.a0));
            } else {
                f6Var.setTextColor(num2.intValue());
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.z0;
        if (lVar != null) {
            lVar.h(z10);
        }
    }

    public boolean o() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.un unVar = this.G;
        if (unVar != null) {
            int i10 = this.J;
            org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.T1);
            org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
            if (unVar.f4 == 3) {
                org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.g3);
            }
            this.V = ConnectionsManager.getInstance(i10).getConnectionState();
            l();
        }
        d5 d5Var = this.f0;
        if (d5Var != null) {
            d5Var.a();
        }
        d5 d5Var2 = this.g0;
        if (d5Var2 != null) {
            d5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.un unVar = this.G;
        if (unVar != null) {
            int i10 = this.J;
            org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.T1);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
            if (unVar.f4 == 3) {
                org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.g3);
            }
        }
        d5 d5Var = this.f0;
        if (d5Var != null) {
            d5Var.b();
        }
        d5 d5Var2 = this.g0;
        if (d5Var2 != null) {
            d5Var2.b();
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
        org.telegram.ui.kl klVar = this.r;
        if (klVar != null) {
            sb2.append(klVar.getText());
        } else {
            f6 f6Var = this.s;
            if (f6Var != null) {
                sb2.append(f6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.cd.L0(2131747802, null)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        on onVar = this.e;
        int measuredHeight = (((currentActionBarHeight - onVar.getMeasuredHeight()) - 2) / 2) + (this.K ? org.telegram.messenger.i0.m : 0);
        int L = org.telegram.messenger.i0.L(this.l0 ? 23.66f : 24.0f) + measuredHeight;
        int i14 = this.L + 1;
        int i15 = measuredHeight + 1;
        onVar.layout(i14, i15, onVar.getMeasuredWidth() + i14, onVar.getMeasuredHeight() + i15);
        int L2 = this.L + org.telegram.messenger.i0.L(onVar.getVisibility() == 0 ? this.l0 ? 49.66f : 55.0f : this.l0 ? 13.0f : 1.0f) + this.M;
        org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) this.n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.kl klVar = this.h;
        if (visibility != 8) {
            klVar.layout(L2, (org.telegram.messenger.i0.L(1.66f) + measuredHeight) - klVar.getPaddingTop(), klVar.getMeasuredWidth() + L2, klVar.getPaddingBottom() + ((org.telegram.messenger.i0.L(1.66f) + (klVar.getTextHeight() + measuredHeight)) - klVar.getPaddingTop()));
            if (u5Var != null) {
                u5Var.layout(L2, org.telegram.messenger.i0.L(1.66f) + measuredHeight, u5Var.getMeasuredWidth() + L2, org.telegram.messenger.i0.L(1.66f) + u5Var.getTextHeight() + measuredHeight);
            }
        } else {
            klVar.layout(L2, (org.telegram.messenger.i0.L(11.0f) + measuredHeight) - klVar.getPaddingTop(), klVar.getMeasuredWidth() + L2, klVar.getPaddingBottom() + ((org.telegram.messenger.i0.L(11.0f) + (klVar.getTextHeight() + measuredHeight)) - klVar.getPaddingTop()));
            if (u5Var != null) {
                u5Var.layout(L2, org.telegram.messenger.i0.L(10.0f) + measuredHeight, u5Var.getMeasuredWidth() + L2, org.telegram.messenger.i0.L(10.0f) + u5Var.getTextHeight() + measuredHeight);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.layout(org.telegram.messenger.i0.L(29.0f) + this.L, org.telegram.messenger.i0.L(27.33f) + measuredHeight, imageView.getMeasuredWidth() + org.telegram.messenger.i0.L(29.0f) + this.L, imageView.getMeasuredHeight() + org.telegram.messenger.i0.L(27.33f) + measuredHeight);
        }
        ImageView imageView2 = this.x;
        if (imageView2 != null) {
            imageView2.layout(org.telegram.messenger.i0.L(19.333f) + this.L, measuredHeight - org.telegram.messenger.i0.L(8.0f), imageView2.getMeasuredWidth() + org.telegram.messenger.i0.L(19.333f) + this.L, imageView2.getMeasuredHeight() + (measuredHeight - org.telegram.messenger.i0.L(8.0f)));
        }
        ImageView imageView3 = this.D;
        if (imageView3 != null) {
            imageView3.layout(org.telegram.messenger.i0.L(28.0f) + this.L, org.telegram.messenger.i0.L(24.0f) + measuredHeight, imageView3.getMeasuredWidth() + org.telegram.messenger.i0.L(28.0f) + this.L, imageView3.getMeasuredHeight() + org.telegram.messenger.i0.L(24.0f) + measuredHeight);
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.layout(org.telegram.messenger.i0.L(28.0f) + this.L, org.telegram.messenger.i0.L(24.0f) + measuredHeight, imageView4.getMeasuredWidth() + org.telegram.messenger.i0.L(28.0f) + this.L, imageView4.getMeasuredHeight() + org.telegram.messenger.i0.L(24.0f) + measuredHeight);
        }
        org.telegram.ui.kl klVar2 = this.r;
        if (klVar2 != null) {
            klVar2.layout(L2, L, klVar2.getMeasuredWidth() + L2, klVar2.getTextHeight() + L);
        } else {
            f6 f6Var = this.s;
            if (f6Var != null) {
                f6Var.layout(L2, L, f6Var.getMeasuredWidth() + L2, f6Var.getTextHeight() + L);
            }
        }
        org.telegram.ui.ActionBar.u5 u5Var2 = (org.telegram.ui.ActionBar.u5) this.w.get();
        if (u5Var2 != null) {
            u5Var2.layout(L2, L, u5Var2.getMeasuredWidth() + L2, u5Var2.getTextHeight() + L);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        on onVar = this.e;
        int L = size - org.telegram.messenger.i0.L((onVar.getVisibility() == 0 ? 54 : 0) + 16);
        float f7 = this.d;
        onVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f7) - 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f7) - 2, TLObject.FLAG_30));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_31);
        org.telegram.ui.kl klVar = this.h;
        klVar.measure(makeMeasureSpec, makeMeasureSpec2);
        f6 f6Var = this.s;
        org.telegram.ui.kl klVar2 = this.r;
        if (klVar2 != null) {
            klVar2.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_31));
        } else if (f6Var != null) {
            f6Var.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_31));
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(14.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(14.0f), TLObject.FLAG_30));
        }
        ImageView imageView2 = this.x;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(34.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(34.0f), TLObject.FLAG_30));
        }
        ImageView imageView3 = this.D;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_30));
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i11));
        int i12 = this.O;
        AtomicReference atomicReference = this.n;
        if (i12 != -1 && i12 != size && i12 > size) {
            this.P = i12;
            View view = (org.telegram.ui.ActionBar.u5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(getContext());
            atomicReference.set(u5Var);
            int i13 = org.telegram.ui.ActionBar.t6.A8;
            org.telegram.ui.ActionBar.p6 p6Var = this.d0;
            org.telegram.ui.ActionBar.a7.Y(u5Var, i13, p6Var);
            u5Var.setTextSizePx(org.telegram.messenger.i0.L(this.l0 ? 17.5f : 18.0f));
            u5Var.setGravity(3);
            u5Var.setTypeface(org.telegram.messenger.i0.o());
            u5Var.setLeftDrawableTopPadding(-org.telegram.messenger.i0.L(1.3f));
            u5Var.i(klVar.getRightDrawable());
            u5Var.j(klVar.getRightDrawable2());
            u5Var.setRightDrawableOutside(klVar.getRightDrawableOutside());
            u5Var.setLeftDrawable(klVar.getLeftDrawable());
            u5Var.l(klVar.getText(), false);
            ViewPropertyAnimator duration = u5Var.animate().alpha(0.0f).setDuration(350L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).withEndAction(new ln(this, 0)).start();
            addView(u5Var);
            AtomicReference atomicReference2 = this.w;
            View view2 = (org.telegram.ui.ActionBar.u5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(getContext());
            atomicReference2.set(u5Var2);
            int i14 = org.telegram.ui.ActionBar.t6.B8;
            org.telegram.ui.ActionBar.a7.Y(u5Var2, i14, p6Var);
            u5Var2.setTag(Integer.valueOf(i14));
            u5Var2.setTextSizePx(org.telegram.messenger.i0.L(this.l0 ? 13.5f : 14.0f));
            u5Var2.setGravity(3);
            if (klVar2 != null) {
                u5Var2.l(klVar2.getText(), false);
            } else if (f6Var != null) {
                u5Var2.l(f6Var.getText(), false);
            }
            u5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).withEndAction(new ln(this, 1)).start();
            addView(u5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.u5 u5Var3 = (org.telegram.ui.ActionBar.u5) atomicReference.get();
        if (u5Var3 != null) {
            u5Var3.measure(org.telegram.messenger.z20.c((onVar.getVisibility() == 0 ? 54 : 0) + 16, this.P, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), TLObject.FLAG_31));
        }
        this.O = size;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        dc dcVar = this.h0;
        ln lnVar = this.i0;
        if (action == 0 && a()) {
            this.j0 = true;
            dcVar.c(true);
            org.telegram.messenger.i0.r(lnVar);
            org.telegram.messenger.i0.h3(lnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.j0) {
            dcVar.c(false);
            this.j0 = false;
            if (isClickable()) {
                e(false, false);
            }
            org.telegram.messenger.i0.r(lnVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final PorterDuffColorFilter p() {
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, this.d0);
        if (this.v0 == null || w02 != this.x0) {
            this.x0 = w02;
            this.v0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        return this.v0;
    }

    public void setActionBar(org.telegram.ui.ActionBar.l lVar) {
        this.z0 = lVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        r8 r8Var = this.I;
        r8Var.q(chat);
        on onVar = this.e;
        if (onVar != null) {
            onVar.e(chat, r8Var);
            onVar.setRoundRadius(org.telegram.messenger.i0.L(org.telegram.messenger.w3.c0(chat) ? (chat == null || !org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).O1().K(-chat.id)) ? 16.0f : 11.0f : 21.0f));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setVisibility((!z10 || this.f) ? 8 : 0);
        }
    }

    public void setLeftPadding(int i10) {
        this.L = i10;
    }

    public void setOccupyStatusBar(boolean z10) {
        this.K = z10;
    }

    public void setOverrideSubtitleColor(Integer num) {
        this.b0 = num;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.h0.c(z10);
    }

    public void setRightAvatarPadding(int i10) {
        this.M = i10;
    }

    public void setStoriesForceState(Integer num) {
        this.c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.W == null) {
            org.telegram.ui.kl klVar = this.r;
            if (klVar != null) {
                klVar.k(charSequence);
            } else {
                f6 f6Var = this.s;
                if (f6Var != null) {
                    f6Var.setText(charSequence);
                }
            }
        } else {
            this.W = charSequence;
        }
        org.telegram.ui.ActionBar.l lVar = this.z0;
        if (lVar != null) {
            lVar.h(true);
        }
    }

    public void setTitle(CharSequence charSequence) {
        h(charSequence, false, false, false, false, null, false);
    }

    public void setUserAvatar(TLRPC.User user) {
        k(user, false);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        qv0 qv0Var = this.N;
        org.telegram.ui.ActionBar.p6 p6Var = this.d0;
        if (qv0Var != null) {
            qv0Var.b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.pa, p6Var));
        }
        Drawable drawable = this.r0;
        if (drawable != null) {
            drawable.setColorFilter(p());
        }
        d5 d5Var = this.g0;
        if (d5Var != null) {
            d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, p6Var)));
        }
        d5 d5Var2 = this.f0;
        if (d5Var2 != null) {
            d5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, p6Var)));
        }
        Drawable drawable2 = this.s0;
        if (drawable2 != null) {
            drawable2.setColorFilter(p());
        }
        if (this.t0 != null) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.oi, p6Var);
            if (this.w0 == null || w02 != this.y0) {
                this.y0 = w02;
                this.w0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
            }
            this.t0.setColorFilter(this.w0);
        }
        org.telegram.ui.kl klVar = this.h;
        if (klVar != null) {
            try {
                if (klVar.getRightDrawable2() instanceof kl0) {
                    ((kl0) klVar.getRightDrawable2()).b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, p6Var));
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        invalidate();
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        ImageView imageView;
        if (i10 != 0 || (imageView = this.x) == null) {
            return;
        }
        imageView.setAlpha(f7);
        float f11 = 0.85f * f7;
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        imageView.setVisibility(f7 > 0.0f ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void f() {
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
