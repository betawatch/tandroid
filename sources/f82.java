// default package

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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class f82 extends FrameLayout implements s84, fn7, snb {
    public a A0;
    public final ImageView E;
    public final ImageView F;
    public final rsb G;
    public final zu1 H;
    public final d2b[] I;
    public final rb0 J;
    public final int K;
    public boolean L;
    public int M;
    public int N;
    public d2b O;
    public int P;
    public int Q;
    public AnimatorSet R;
    public final boolean[] S;
    public final boolean[] T;
    public final boolean U;
    public int V;
    public int W;
    public final fm0 a;
    public CharSequence a0;
    public boolean b;
    public int b0;
    public Integer c;
    public Integer c0;
    public final byte d;
    public final wia d0;
    public final b82 e;
    public final vnb e0;
    public final boolean f;
    public boolean f0;
    public final ul g0;
    public final ns1 h;
    public final ul h0;
    public final v41 i0;
    public final x72 j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final AtomicReference n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public String q0;
    public final ns1 r;
    public String r0;
    public final in s;
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

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0104, code lost:
    
        if (r3 != 6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02cd, code lost:
    
        if (r0.v4 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00f6, code lost:
    
        if (r3.v4 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x033e A[EDGE_INSN: B:65:0x033e->B:73:0x033e BREAK  A[LOOP:0: B:56:0x032c->B:62:0x0338], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f82(Context context, e eVar, boolean z, vnb vnbVar) {
        super(context);
        boolean z2;
        int i;
        int i2;
        ?? r7;
        TLRPC.Chat chat;
        int i3;
        d2b[] d2bVarArr;
        int i4;
        k43 k43Var = k43.h;
        this.a = new fm0(0, this, k43Var, 320L, false);
        this.d = (byte) 42;
        AtomicReference atomicReference = new AtomicReference();
        this.n = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.w = atomicReference2;
        d2b[] d2bVarArr2 = new d2b[6];
        this.I = d2bVarArr2;
        this.J = new rb0((vnb) null);
        this.K = yac.t0;
        this.L = true;
        this.M = hl.L(8.0f);
        this.N = 0;
        this.P = -1;
        this.Q = -1;
        this.S = new boolean[1];
        this.T = new boolean[1];
        this.V = -1;
        this.b0 = -1;
        this.f0 = false;
        this.i0 = new v41(this);
        this.j0 = new x72(this, (byte) 2);
        this.o0 = false;
        this.p0 = false;
        this.q0 = null;
        this.r0 = null;
        this.e0 = vnbVar;
        boolean z3 = eVar instanceof zu1;
        if (z3) {
            this.H = (zu1) eVar;
        }
        zu1 zu1Var = this.H;
        boolean z4 = zu1Var != null && ((i4 = zu1Var.g4) == 0 || i4 == 8) && !lbc.B(zu1Var.h()) && (this.H.h() == null || this.H.h().id != 489000);
        b82 b82Var = new b82(this, context, eVar, z4, vnbVar);
        this.e = b82Var;
        if (z3 || (eVar instanceof tzb)) {
            zu1 zu1Var2 = this.H;
            if (zu1Var2 == null || ((i = zu1Var2.g4) != 5 && i != 9 && i != 6 && i != 8 && !lbc.w(zu1Var2.f))) {
                this.d0 = new wia(eVar);
            }
            zu1 zu1Var3 = this.H;
            if (zu1Var3 != null) {
                if (zu1Var3.k8()) {
                    zu1 zu1Var4 = this.H;
                    if (zu1Var4.m4 != null) {
                    }
                    z2 = true;
                    this.f = z2;
                    if (z2) {
                        b82Var.setVisibility(8);
                    }
                }
                int i5 = this.H.g4;
                if (i5 != 2) {
                    if (i5 != 5) {
                        if (i5 != 9) {
                        }
                    }
                }
                z2 = true;
                this.f = z2;
                if (z2) {
                }
            }
            z2 = false;
            this.f = z2;
            if (z2) {
            }
        }
        b82Var.setContentDescription(ob6.M0(2131754793, null));
        b82Var.setRoundRadius(hl.L(21.0f));
        addView(b82Var);
        if (z4) {
            zu1 zu1Var5 = this.H;
            TLRPC.Chat chat2 = zu1Var5 != null ? zu1Var5.e : null;
            if (chat2 != null && chat2.linked_community_id != 0) {
                iye.b(b82Var, 0.05f, 1.2f);
            }
            final byte b = 0;
            b82Var.setOnClickListener(new View.OnClickListener(this) { // from class: z72
                public final /* synthetic */ f82 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b2 = b;
                    f82 f82Var = this.b;
                    switch (b2) {
                        case 0:
                            if (!f82Var.d()) {
                                f82Var.e(true, false);
                                break;
                            }
                            break;
                        default:
                            f82Var.e(false, false);
                            break;
                    }
                }
            });
        }
        ns1 ns1Var = new ns1(context, atomicReference);
        this.h = ns1Var;
        ns1Var.setEllipsizeByGradient(true);
        yob.W(ns1Var, aob.A8, vnbVar);
        ns1Var.setTextSize(18);
        ns1Var.setGravity(3);
        ns1Var.setTypeface(hl.o());
        ns1Var.setLeftDrawableTopPadding(-hl.L(1.3f));
        ns1Var.setCanHideRightDrawable(false);
        ns1Var.setRightDrawableOutside(true);
        ns1Var.setPadding(0, hl.L(6.0f), 0, hl.L(12.0f));
        addView(ns1Var);
        if (o()) {
            in inVar = new in(context, true, true, true);
            this.s = inVar;
            inVar.b(0.3f, 320L, k43Var);
            inVar.setEllipsizeByGradient(true);
            int i6 = aob.B8;
            yob.U(inVar, i6, vnbVar);
            inVar.setTag(Integer.valueOf(i6));
            inVar.setTextSize(hl.L(14.0f));
            inVar.setGravity(3);
            inVar.setPadding(0, 0, hl.L(10.0f), 0);
            inVar.setTranslationY(-hl.L(1.0f));
            addView(inVar);
        } else {
            ns1 ns1Var2 = new ns1(context, atomicReference2);
            this.r = ns1Var2;
            ns1Var2.setEllipsizeByGradient(true);
            int i7 = aob.B8;
            yob.W(ns1Var2, i7, vnbVar);
            ns1Var2.setTag(Integer.valueOf(i7));
            ns1Var2.setTextSize(14);
            ns1Var2.setGravity(3);
            ns1Var2.setPadding(0, 0, hl.L(10.0f), 0);
            addView(ns1Var2);
        }
        if (this.H != null) {
            ImageView imageView = new ImageView(context);
            this.y = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setVisibility(8);
            imageView.setImageDrawable(new tk0());
            addView(imageView);
            ImageView imageView2 = new ImageView(context);
            this.x = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setVisibility(8);
            rsb rsbVar = new rsb(context, vnbVar);
            this.G = rsbVar;
            imageView2.setImageDrawable(rsbVar);
            rsbVar.k = true;
            rsbVar.b.setColor(0);
            addView(imageView2);
            this.U = z;
            imageView2.setOnClickListener(new sb1((Object) this, (Object) vnbVar, (byte) 13));
            if (z) {
                imageView2.setContentDescription(ob6.M0(2131745237, null));
            } else {
                imageView2.setContentDescription(ob6.M0(2131754921, null));
            }
            ImageView imageView3 = new ImageView(context);
            this.E = imageView3;
            imageView3.setImageResource(R.drawable.star_small_outline);
            yob.s(imageView3, aob.s8, vnbVar, PorterDuff.Mode.SRC_IN);
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
        zu1 zu1Var6 = this.H;
        if (zu1Var6 != null && ((i2 = zu1Var6.g4) == 0 || i2 == 8 || i2 == 3)) {
            if (zu1Var6.k8()) {
                zu1 zu1Var7 = this.H;
                if (!zu1Var7.x4) {
                }
            }
            if (!lbc.B(this.H.h()) && (this.H.h() == null || this.H.h().id != 489000)) {
                r7 = 1;
                final char c = 1 == true ? 1 : 0;
                setOnClickListener(new View.OnClickListener(this) { // from class: z72
                    public final /* synthetic */ f82 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b2 = c;
                        f82 f82Var = this.b;
                        switch (b2) {
                            case 0:
                                if (!f82Var.d()) {
                                    f82Var.e(true, false);
                                    break;
                                }
                                break;
                            default:
                                f82Var.e(false, false);
                                break;
                        }
                    }
                });
                chat = this.H.e;
                d2bVarArr2[0] = new z7c(r7);
                d2bVarArr2[r7] = new hh2(r7);
                d2bVarArr2[2] = new e8a(r7);
                d2bVarArr2[3] = new pg8(vnbVar, false);
                d2bVarArr2[4] = new cn9(r7);
                d2bVarArr2[5] = new hh2();
                i3 = 0;
                while (true) {
                    d2bVarArr = this.I;
                    if (i3 < d2bVarArr.length) {
                        break;
                    }
                    d2bVarArr[i3].c(chat != null ? r7 : false);
                    i3++;
                }
            }
            r7 = 1;
            chat = this.H.e;
            d2bVarArr2[0] = new z7c(r7);
            d2bVarArr2[r7] = new hh2(r7);
            d2bVarArr2[2] = new e8a(r7);
            d2bVarArr2[3] = new pg8(vnbVar, false);
            d2bVarArr2[4] = new cn9(r7);
            d2bVarArr2[5] = new hh2();
            i3 = 0;
            while (true) {
                d2bVarArr = this.I;
                if (i3 < d2bVarArr.length) {
                }
                d2bVarArr[i3].c(chat != null ? r7 : false);
                i3++;
            }
        }
        this.g0 = new ul(hl.L(24.0f), this.h);
        this.h0 = new ul(hl.L(17.0f), this.h);
    }

    private void setTypingAnimation(boolean z) {
        zu1 zu1Var = this.H;
        ns1 ns1Var = this.r;
        if (ns1Var != null) {
            int i = 0;
            d2b[] d2bVarArr = this.I;
            if (!z) {
                this.O = null;
                ns1Var.setLeftDrawable((Drawable) null);
                ns1Var.g(null, null);
                while (i < d2bVarArr.length) {
                    d2b d2bVar = d2bVarArr[i];
                    if (d2bVar != null) {
                        d2bVar.e();
                    }
                    i++;
                }
                return;
            }
            try {
                int intValue = uc7.s1(this.K).D1(zu1Var.a(), zu1Var.s4).intValue();
                d2b d2bVar2 = d2bVarArr[intValue];
                if (d2bVar2 != null) {
                    vnb vnbVar = this.e0;
                    if (intValue == 5) {
                        ns1Var.g(d2bVar2, "**oo**");
                        d2bVarArr[intValue].b(aob.v0(aob.pa, vnbVar));
                        ns1Var.setLeftDrawable((Drawable) null);
                    } else {
                        ns1Var.g(null, null);
                        d2bVarArr[intValue].b(aob.v0(aob.pa, vnbVar));
                        ns1Var.setLeftDrawable(d2bVarArr[intValue]);
                    }
                    this.O = d2bVarArr[intValue];
                    while (i < d2bVarArr.length) {
                        d2b d2bVar3 = d2bVarArr[i];
                        if (d2bVar3 != null) {
                            if (i == intValue) {
                                d2bVar3.d();
                            } else {
                                d2bVar3.e();
                            }
                        }
                        i++;
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public boolean a() {
        return false;
    }

    public final void b() {
        TLRPC.User user;
        int L;
        zu1 zu1Var = this.H;
        if (zu1Var != null) {
            TLRPC.User h = zu1Var.h();
            TLRPC.Chat chat = zu1Var.e;
            if (zu1Var.g4 == 3) {
                long f7 = zu1Var.f7();
                if (f7 >= 0) {
                    user = zu1Var.getMessagesController().X1(Long.valueOf(f7));
                    chat = null;
                } else {
                    chat = zu1Var.getMessagesController().M0(Long.valueOf(-f7));
                    user = null;
                }
            } else {
                user = h;
            }
            rb0 rb0Var = this.J;
            b82 b82Var = this.e;
            if (user == null) {
                if (!xc2.p0(chat)) {
                    if (chat != null) {
                        rb0Var.p = 1.0f;
                        rb0Var.p(chat);
                        if (b82Var != null) {
                            b82Var.setAnimatedEmojiDrawable(null);
                            b82Var.f(chat, rb0Var);
                            if (chat.forum) {
                                L = hl.L(uc7.s1(yac.t0).O1().J(-chat.id) ? 11.0f : 16.0f);
                            } else {
                                L = hl.L(21.0f);
                            }
                            b82Var.setRoundRadius(L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                long c = zu1Var.c();
                int i = this.K;
                if (!xc2.A(i, chat, 24) || c == 0) {
                    b82Var.setAnimatedEmojiDrawable(null);
                    ro4.o(i, chat, rb0Var, b82Var);
                } else if (c > 0) {
                    TLRPC.User X1 = zu1Var.getMessagesController().X1(Long.valueOf(c));
                    rb0Var.q(X1);
                    b82Var.setAnimatedEmojiDrawable(null);
                    b82Var.f(X1, rb0Var);
                } else {
                    TLRPC.Chat M0 = zu1Var.getMessagesController().M0(Long.valueOf(-c));
                    rb0Var.p(M0);
                    b82Var.setAnimatedEmojiDrawable(null);
                    b82Var.f(M0, rb0Var);
                }
                b82Var.setRoundRadius(hl.L(21.0f));
                return;
            }
            rb0Var.q(user);
            if (lbc.B(user)) {
                rb0Var.p = 0.8f;
                rb0Var.f(12);
                if (b82Var != null) {
                    b82Var.setAnimatedEmojiDrawable(null);
                    b82Var.m(null, null, rb0Var, user);
                    return;
                }
                return;
            }
            if (lbc.u(user)) {
                rb0Var.p = 0.8f;
                rb0Var.f(21);
                if (b82Var != null) {
                    b82Var.setAnimatedEmojiDrawable(null);
                    b82Var.m(null, null, rb0Var, user);
                    return;
                }
                return;
            }
            if (lbc.D(user) && zu1Var.g4 == 3) {
                rb0Var.p = 0.8f;
                rb0Var.f(22);
                if (b82Var != null) {
                    b82Var.setAnimatedEmojiDrawable(null);
                    b82Var.m(null, null, rb0Var, user);
                    return;
                }
                return;
            }
            if (!lbc.D(user)) {
                rb0Var.p = 1.0f;
                if (b82Var != null) {
                    b82Var.setAnimatedEmojiDrawable(null);
                    b82Var.a.V(user, rb0Var, null, true, 3, false);
                    return;
                }
                return;
            }
            rb0Var.p = 0.8f;
            rb0Var.f(1);
            if (b82Var != null) {
                b82Var.setAnimatedEmojiDrawable(null);
                b82Var.m(null, null, rb0Var, user);
            }
        }
    }

    public final ul c(long j) {
        if (j == 0) {
            return null;
        }
        ul ulVar = this.h0;
        ulVar.j(j, false);
        ulVar.k(Integer.valueOf(aob.v0(aob.qi, this.e0)));
        int L = hl.L(1.0f);
        ulVar.J = 0;
        ulVar.K = L;
        return ulVar;
    }

    public boolean d() {
        return false;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.T1) {
            int connectionState = ConnectionsManager.getInstance(this.K).getConnectionState();
            if (this.W != connectionState) {
                this.W = connectionState;
                l();
                return;
            }
            return;
        }
        if (i != jn7.l4) {
            if (i == jn7.i3) {
                n(true);
            }
        } else {
            ns1 ns1Var = this.h;
            if (ns1Var != null) {
                ns1Var.invalidate();
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
        float a = this.i0.a(0.02f);
        canvas.scale(a, a, getPivotX(), getHeight() - (a.getCurrentActionBarHeight() / 2.0f));
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
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.e) {
            boolean z = false;
            ImageView imageView = this.x;
            boolean z2 = imageView != null && imageView.getVisibility() == 0;
            ImageView imageView2 = this.y;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                z = true;
            }
            if (z2 || z) {
                RectF rectF = hl.P;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-hl.L(3.0f), -hl.L(3.0f));
                canvas.saveLayer(rectF, null);
                boolean drawChild = super.drawChild(canvas, view, j);
                if (z2) {
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - hl.N(0.33f), imageView.getScaleX() * hl.N(12.0f), aob.Gm);
                }
                if (z) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * hl.N(7.66f), aob.Gm);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r2.getImageReceiver().E() != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(boolean z, boolean z2) {
        boolean z3;
        zu1 zu1Var;
        TLRPC.Chat chat;
        ImageReceiver imageReceiver;
        String str;
        in5 z4;
        long j;
        wz1 wz1Var;
        Drawable t;
        TLRPC.User X1;
        b82 b82Var = this.e;
        if (z) {
            if (!hl.O1()) {
                Point point = hl.q;
                if (point.x <= point.y) {
                }
            }
            z3 = false;
            zu1Var = this.H;
            TLRPC.User h = zu1Var.h();
            chat = zu1Var.e;
            boolean z5 = chat == null && chat.monoforum;
            if (chat != null && chat.monoforum) {
                chat = zu1Var.getMessagesController().M0(Long.valueOf(chat.linked_monoforum_id));
                if (chat != null) {
                    return;
                }
                if (zu1Var.k7() != 0 && (X1 = zu1Var.getMessagesController().X1(Long.valueOf(zu1Var.k7()))) != null) {
                    chat = null;
                    h = X1;
                }
            }
            imageReceiver = b82Var.getImageReceiver();
            str = imageReceiver.R;
            z4 = in5.z();
            if (str != null && !z4.F(str, false)) {
                t = imageReceiver.t();
                if ((t instanceof BitmapDrawable) && !(t instanceof lm)) {
                    z4.K((BitmapDrawable) t, str, false);
                }
            }
            if (!zu1Var.v4) {
                if (chat != null) {
                    zu1Var.presentFragment(ProfileActivity.Q2(-chat.id), z2);
                    return;
                }
                return;
            }
            wia wiaVar = this.d0;
            if (h == null) {
                boolean z6 = z3;
                if (chat != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    if (zu1Var.g4 == 3) {
                        bundle.putLong("topic_id", zu1Var.f7());
                    } else if (zu1Var.x4) {
                        bundle.putLong("topic_id", zu1Var.m4.e1());
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, wiaVar);
                    if (!z5) {
                        profileActivity.r3(zu1Var.r8);
                    }
                    profileActivity.y3(z6 ? 2 : 1);
                    zu1Var.presentFragment(profileActivity, z2);
                    return;
                }
                return;
            }
            if (h.id != 489000) {
                Bundle bundle2 = new Bundle();
                if (lbc.D(h)) {
                    e eVar = wiaVar.x;
                    int[] iArr = wiaVar.c;
                    int i = 0;
                    while (true) {
                        if (i < iArr.length) {
                            if (iArr[i] > 0) {
                                break;
                            } else {
                                i++;
                            }
                        } else if (!wiaVar.f && (eVar == null || wiaVar.r != eVar.getUserConfig().e() || wiaVar.s != 0 || !eVar.getMessagesController().F1().e())) {
                            return;
                        }
                    }
                    bundle2.putLong("dialog_id", zu1Var.a());
                    if (zu1Var.g4 == 3) {
                        bundle2.putLong("topic_id", zu1Var.f7());
                    }
                    em6 em6Var = new em6(bundle2, wiaVar);
                    em6Var.c = zu1Var.r8;
                    zu1Var.presentFragment(em6Var, z2);
                    return;
                }
                if (zu1Var.g4 != 0 || z5 || lbc.w(h)) {
                    j = 0;
                } else {
                    j = 0;
                    rr0 e0 = rr0.e0(zu1Var.getCurrentAccount(), h.id);
                    if (e0 != null) {
                        zu1Var.presentFragment(e0, z2);
                        return;
                    }
                }
                boolean z7 = z3;
                if (zu1Var.g4 == 3) {
                    long f7 = zu1Var.f7();
                    bundle2.putBoolean("saved", true);
                    if (f7 >= j) {
                        bundle2.putLong("user_id", f7);
                    } else {
                        bundle2.putLong("chat_id", -f7);
                    }
                } else {
                    bundle2.putLong("user_id", h.id);
                    if (this.x != null && !z5) {
                        bundle2.putLong("dialog_id", zu1Var.a());
                    }
                }
                if (lbc.w(h)) {
                    bundle2.putLong("topic_id", zu1Var.c());
                }
                l7 l7Var = zu1Var.Z1;
                bundle2.putBoolean("reportSpam", (l7Var == null || (wz1Var = zu1Var.b1) == null || !wz1Var.d(l7Var) || zu1Var.c2.getVisibility() == 8) ? false : true);
                bundle2.putInt("actionBarColor", aob.v0(aob.s8, this.e0));
                ProfileActivity profileActivity2 = new ProfileActivity(bundle2, wiaVar);
                if (!z5) {
                    profileActivity2.z3(zu1Var.s8, zu1Var.t8, zu1Var.u8);
                }
                profileActivity2.y3(z7 ? 2 : 1);
                zu1Var.presentFragment(profileActivity2, z2);
                return;
            }
            return;
        }
        z3 = z;
        zu1Var = this.H;
        TLRPC.User h2 = zu1Var.h();
        chat = zu1Var.e;
        if (chat == null) {
        }
        if (chat != null) {
            chat = zu1Var.getMessagesController().M0(Long.valueOf(chat.linked_monoforum_id));
            if (chat != null) {
            }
        }
        imageReceiver = b82Var.getImageReceiver();
        str = imageReceiver.R;
        z4 = in5.z();
        if (str != null) {
            t = imageReceiver.t();
            if (t instanceof BitmapDrawable) {
                z4.K((BitmapDrawable) t, str, false);
            }
        }
        if (!zu1Var.v4) {
        }
    }

    public final void g(int i, boolean z) {
        rsb rsbVar = this.G;
        if (rsbVar != null) {
            boolean z2 = this.n0;
            if (i != 0 || this.U) {
                fm0 fm0Var = this.a;
                if (z2) {
                    fm0Var.a(false, z);
                } else {
                    fm0Var.a(true, z);
                    rsbVar.b(i);
                }
            }
        }
    }

    public de0 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.b0;
    }

    public int getLeftPadding() {
        return this.M;
    }

    public wia getSharedMediaPreloader() {
        return this.d0;
    }

    public TextPaint getSubtitlePaint() {
        ns1 ns1Var = this.r;
        return ns1Var != null ? ns1Var.getTextPaint() : this.s.getPaint();
    }

    public View getSubtitleTextView() {
        ns1 ns1Var = this.r;
        if (ns1Var != null) {
            return ns1Var;
        }
        in inVar = this.s;
        if (inVar != null) {
            return inVar;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.x;
    }

    public ema getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        ns1 ns1Var = this.h;
        float max = ns1Var != null ? Math.max(0.0f, ns1Var.getExactWidthIncludeDrawables()) : 0.0f;
        ns1 ns1Var2 = this.r;
        if (ns1Var2 != null) {
            max = Math.max(max, ns1Var2.getExactWidthIncludeDrawables());
        }
        b82 b82Var = this.e;
        return (int) (max + ((b82Var == null || b82Var.getVisibility() != 0) ? hl.L(34.0f) : hl.L(70.0f)));
    }

    public final void h(CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, TLRPC.EmojiStatus emojiStatus, boolean z6) {
        if (charSequence != null) {
            charSequence = pv3.m(charSequence, this.h.getPaint().getFontMetricsInt(), false, null, 0);
        }
        this.h.k(charSequence);
        this.p0 = false;
        if (z || z2 || z3) {
            this.p0 = true;
            int i = z ? 0 : z2 ? 1 : 2;
            if (!(this.h.getRightDrawable2() instanceof yt9) || ((yt9) this.h.getRightDrawable2()).f != i) {
                yt9 yt9Var = new yt9(i);
                yt9Var.b(aob.v0(i == 2 ? aob.p7 : aob.B8, this.e0));
                this.h.j(yt9Var);
                this.r0 = ob6.M0(i == 2 ? 2131745000 : 2131745590, null);
                this.o0 = true;
            }
        } else if (z4) {
            Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
            this.t0 = mutate;
            int i2 = aob.qi;
            vnb vnbVar = this.e0;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            yob.x(this, mutate, i2, vnbVar, mode);
            Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
            this.u0 = mutate2;
            yob.x(this, mutate2, aob.ri, this.e0, mode);
            this.h.j(new zm2(this.t0, this.u0));
            this.o0 = true;
            this.r0 = ob6.M0(2131754734, null);
        } else if (this.h.getRightDrawable2() instanceof yt9) {
            this.h.j(null);
            this.o0 = false;
            this.r0 = null;
        }
        if (z5 || wf3.f(emojiStatus) != 0) {
            if ((this.h.getRightDrawable() instanceof vl) && (((vl) this.h.getRightDrawable()).a instanceof wl)) {
                ((wl) ((vl) this.h.getRightDrawable()).a).o(this.h);
            }
            if (wf3.f(emojiStatus) != 0) {
                this.g0.j(wf3.f(emojiStatus), z6);
            } else if (z5) {
                Drawable mutate3 = org.telegram.messenger.a.b.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.s0 = mutate3;
                yob.x(this, mutate3, aob.qi, this.e0, PorterDuff.Mode.MULTIPLY);
                this.g0.g(this.s0, z6);
            } else {
                this.g0.g(null, z6);
            }
            this.g0.k(Integer.valueOf(aob.v0(aob.qi, this.e0)));
            this.h.i(this.g0);
            this.o0 = false;
            this.q0 = ob6.M0(2131754797, null);
        } else {
            this.h.i(null);
            this.q0 = null;
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.l(z6);
        }
    }

    public final void i(int i, int i2) {
        ns1 ns1Var = this.h;
        yob.q(ns1Var);
        ns1 ns1Var2 = this.r;
        yob.q(ns1Var2);
        ns1Var.setTextColor(i);
        ns1Var2.setTextColor(i2);
        ns1Var2.setTag(Integer.valueOf(i2));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        ns1 ns1Var = this.h;
        ns1Var.setLeftDrawable(drawable);
        if (!this.o0 && !this.p0) {
            if (drawable2 != null) {
                this.r0 = ob6.M0(2131747628, null);
            } else {
                this.r0 = null;
            }
            ns1Var.j(drawable2);
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.l(true);
        }
    }

    public final void k(TLRPC.User user, boolean z) {
        rb0 rb0Var = this.J;
        rb0Var.q(user);
        boolean B = lbc.B(user);
        b82 b82Var = this.e;
        if (B) {
            rb0Var.f(12);
            rb0Var.p = 0.8f;
            if (b82Var != null) {
                b82Var.m(null, null, rb0Var, user);
                return;
            }
            return;
        }
        if (lbc.u(user)) {
            rb0Var.f(21);
            rb0Var.p = 0.8f;
            if (b82Var != null) {
                b82Var.m(null, null, rb0Var, user);
                return;
            }
            return;
        }
        if (!lbc.D(user) || z) {
            rb0Var.p = 1.0f;
            if (b82Var != null) {
                b82Var.f(user, rb0Var);
                return;
            }
            return;
        }
        rb0Var.f(1);
        rb0Var.p = 0.8f;
        if (b82Var != null) {
            b82Var.m(null, null, rb0Var, user);
        }
    }

    public final void l() {
        int i = this.W;
        String M0 = i == 2 ? ob6.M0(2131742864, null) : i == 1 ? ob6.M0(2131751774, null) : i == 5 ? ob6.M0(2131743465, null) : i == 4 ? ob6.M0(2131751772, null) : null;
        vnb vnbVar = this.e0;
        in inVar = this.s;
        ns1 ns1Var = this.r;
        if (M0 == null) {
            CharSequence charSequence = this.a0;
            if (charSequence != null) {
                if (ns1Var != null) {
                    ns1Var.k(charSequence);
                    this.a0 = null;
                    Integer num = this.c0;
                    if (num != null) {
                        ns1Var.setTextColor(num.intValue());
                    } else {
                        int i2 = this.b0;
                        if (i2 >= 0) {
                            yob.W(ns1Var, i2, vnbVar);
                            ns1Var.setTag(Integer.valueOf(this.b0));
                        }
                    }
                } else if (inVar != null) {
                    inVar.c(charSequence, !ob6.a0, true);
                    this.a0 = null;
                    Integer num2 = this.c0;
                    if (num2 != null) {
                        inVar.setTextColor(num2.intValue());
                    } else {
                        int i3 = this.b0;
                        if (i3 >= 0) {
                            yob.U(inVar, i3, vnbVar);
                            inVar.setTag(Integer.valueOf(this.b0));
                        }
                    }
                }
            }
        } else if (ns1Var != null) {
            if (this.a0 == null) {
                this.a0 = ns1Var.getText();
            }
            ns1Var.k(M0);
            Integer num3 = this.c0;
            if (num3 != null) {
                ns1Var.setTextColor(num3.intValue());
            } else {
                int i4 = aob.B8;
                yob.W(ns1Var, i4, vnbVar);
                ns1Var.setTag(Integer.valueOf(i4));
            }
        } else if (inVar != null) {
            if (this.a0 == null) {
                this.a0 = inVar.getText();
            }
            inVar.c(M0, !ob6.a0, true);
            Integer num4 = this.c0;
            if (num4 != null) {
                inVar.setTextColor(num4.intValue());
            } else {
                int i5 = aob.B8;
                yob.U(inVar, i5, vnbVar);
                inVar.setTag(Integer.valueOf(i5));
            }
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.l(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z;
        zu1 zu1Var = this.H;
        if (zu1Var != null) {
            this.V = 0;
            TLRPC.ChatFull chatFull = zu1Var.r8;
            if (chatFull != null) {
                int i = this.K;
                int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
                if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
                    if (!z || chatFull.participants_count <= 200) {
                        return;
                    }
                    this.V = chatFull.online_count;
                    return;
                }
                for (int i2 = 0; i2 < chatFull.participants.participants.size(); i2++) {
                    TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(chatFull.participants.participants.get(i2).user_id));
                    if (X1 != null && (userStatus = X1.status) != null && ((userStatus.expires > currentTime || X1.id == yac.h(i).e()) && X1.status.expires > 10000)) {
                        this.V++;
                    }
                }
            }
        }
    }

    public final void n(boolean z) {
        int i;
        boolean z2;
        boolean z3;
        String G;
        TLRPC.ChatParticipants chatParticipants;
        int i2;
        String S;
        int i3;
        int i4;
        int i5;
        ArrayList l;
        int i6;
        vnb vnbVar = this.e0;
        boolean[] zArr = this.S;
        in inVar = this.s;
        ns1 ns1Var = this.r;
        ns1 ns1Var2 = this.h;
        int i7 = this.K;
        zu1 zu1Var = this.H;
        if (zu1Var != null) {
            if (zu1Var.g4 == 6) {
                String str = zu1Var.e4.link;
                r41[] r41VarArr = r41.e;
                if (str.startsWith("https://")) {
                    str = str.substring(8);
                }
                setSubtitle(str);
                return;
            }
            TLRPC.User h = zu1Var.h();
            TLRPC.Chat chat = zu1Var.e;
            boolean z4 = lbc.D(h) && zu1Var.g4 == 0 && zu1Var.getMessagesController().F1().c() >= 3 && (this.v0 || uc7.e1().getInt("savedmsgschatshint", 0) < 3);
            if (((lbc.D(h) && !z4) || lbc.B(h) || ((h != null && h.id == 489000) || ((i = zu1Var.g4) != 0 && i != 8))) && zu1Var.g4 != 3) {
                if (getSubtitleTextView().getVisibility() != 8) {
                    getSubtitleTextView().setVisibility(8);
                    return;
                }
                return;
            }
            if (z4) {
                if (getSubtitleTextView().getVisibility() != 0) {
                    i6 = 0;
                    getSubtitleTextView().setVisibility(0);
                } else {
                    i6 = 0;
                }
                if (!this.v0) {
                    uc7.e1().edit().putInt("savedmsgschatshint", uc7.e1().getInt("savedmsgschatshint", i6) + 1).apply();
                    this.v0 = true;
                }
            }
            CharSequence C1 = uc7.s1(i7).C1(zu1Var.a(), zu1Var.s4, false);
            CharSequence charSequence = "";
            if (C1 != null) {
                C1 = TextUtils.replace(C1, new String[]{"..."}, new String[]{""});
            }
            Property property = View.ALPHA;
            Property property2 = View.TRANSLATION_Y;
            boolean z5 = z4;
            if (C1 != null && C1.length() != 0 && (!xc2.T(chat) || chat.megagroup)) {
                if (zu1Var.k8() && ns1Var2.getTag() != null) {
                    ns1Var2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.R = null;
                    }
                    if (z) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.R = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(ns1Var2, (Property<ns1, Float>) property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 1.0f));
                        this.R.addListener(new e82(this, (byte) 1));
                        this.R.setDuration(180L);
                        this.R.start();
                    } else {
                        ns1Var2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer D1 = uc7.s1(i7).D1(zu1Var.a(), zu1Var.s4);
                charSequence = (D1 == null || D1.intValue() != 5) ? C1 : pv3.m(C1, getSubtitlePaint().getFontMetricsInt(), false, null, 0);
                setTypingAnimation(true);
                z3 = true;
            } else {
                if (zu1Var.k8() && !zu1Var.x4) {
                    if (ns1Var2.getTag() == null) {
                        ns1Var2.setTag(1);
                        AnimatorSet animatorSet3 = this.R;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.R = null;
                        }
                        if (!z) {
                            ns1Var2.setTranslationY(hl.L(9.7f));
                            getSubtitleTextView().setAlpha(0.0f);
                            getSubtitleTextView().setVisibility(4);
                            return;
                        } else {
                            AnimatorSet animatorSet4 = new AnimatorSet();
                            this.R = animatorSet4;
                            animatorSet4.playTogether(ObjectAnimator.ofFloat(ns1Var2, (Property<ns1, Float>) property2, hl.L(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 0.0f));
                            this.R.addListener(new e82(this, (byte) 0));
                            this.R.setDuration(180L);
                            this.R.start();
                            return;
                        }
                    }
                    return;
                }
                setTypingAnimation(false);
                int i8 = zu1Var.g4;
                if (i8 != 8) {
                    if (i8 == 3) {
                        nt9 F1 = zu1Var.getMessagesController().F1();
                        long f7 = zu1Var.f7();
                        ArrayList arrayList = F1.j;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= arrayList.size()) {
                                i5 = 0;
                                break;
                            }
                            mt9 mt9Var = (mt9) arrayList.get(i9);
                            if (mt9Var.a == f7) {
                                i5 = mt9Var.e;
                                break;
                            }
                            i9++;
                        }
                        charSequence = ob6.G(Math.max(1, i5), "SavedMessagesCount", new Object[0]);
                    } else {
                        if (zu1Var.x4 && chat != null) {
                            TLRPC.TL_forumTopic f = uc7.s1(i7).g4.f(chat.id, zu1Var.c());
                            if (f != null) {
                                i3 = 1;
                                i4 = f.totalMessagesCount - 1;
                            } else {
                                i3 = 1;
                                i4 = 0;
                            }
                            if (i4 > 0) {
                                Object[] objArr = new Object[i3];
                                objArr[0] = Integer.valueOf(i4);
                                G = ob6.G(i4, "messages", objArr);
                            } else {
                                Object[] objArr2 = new Object[i3];
                                objArr2[0] = chat.title;
                                G = ob6.a0(null, null, 2131743667, objArr2);
                            }
                        } else if (chat != null) {
                            TLRPC.ChatFull chatFull = zu1Var.r8;
                            int i10 = this.V;
                            if (xc2.T(chat)) {
                                if (chatFull == null || (i2 = chatFull.participants_count) == 0) {
                                    G = chat.megagroup ? chatFull == null ? ob6.M0(2131748533, null).toLowerCase() : chat.has_geo ? ob6.M0(2131748396, null).toLowerCase() : xc2.t0(chat) ? ob6.M0(2131748392, null).toLowerCase() : ob6.M0(2131748395, null).toLowerCase() : xc2.t0(chat) ? ob6.M0(2131752288, null).toLowerCase() : ob6.M0(2131752299, null).toLowerCase();
                                } else if (chat.megagroup) {
                                    G = i10 > 1 ? qd4.y(ob6.G(i2, "Members", new Object[0]), ", ", ob6.G(Math.min(i10, chatFull.participants_count), "OnlineCount", new Object[0])) : ob6.G(i2, "Members", new Object[0]);
                                } else {
                                    int[] iArr = new int[1];
                                    boolean A1 = hl.A1();
                                    int i11 = chatFull.participants_count;
                                    if (A1) {
                                        iArr[0] = i11;
                                        S = String.valueOf(i11);
                                    } else {
                                        S = ob6.S(iArr, i11);
                                    }
                                    G = chat.megagroup ? ob6.G(iArr[0], "Members", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S) : ob6.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                                }
                            } else if (xc2.k0(chat)) {
                                G = ob6.M0(2131742460, null);
                            } else if (xc2.l0(chat)) {
                                G = ob6.M0(2131742466, null);
                            } else {
                                int i12 = chat.participants_count;
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                    i12 = chatParticipants.participants.size();
                                }
                                G = (i10 <= 1 || i12 == 0) ? ob6.G(i12, "Members", new Object[0]) : qd4.y(ob6.G(i12, "Members", new Object[0]), ", ", ob6.G(i10, "OnlineCount", new Object[0]));
                            }
                        } else {
                            if (h != null) {
                                TLRPC.User X1 = uc7.s1(i7).X1(Long.valueOf(h.id));
                                if (X1 != null) {
                                    h = X1;
                                }
                                if (!lbc.B(h)) {
                                    long j = h.id;
                                    if (j != 489000) {
                                        if (j == yac.h(i7).e()) {
                                            charSequence = z5 ? hl.D2(ob6.M0(2131745620, null), false) : ob6.M0(2131752154, null);
                                        } else {
                                            long j2 = h.id;
                                            if (j2 == 333000 || j2 == 777000 || j2 == 42777) {
                                                z2 = false;
                                                charSequence = ob6.M0(2131745289, null);
                                            } else if (uc7.K2(h)) {
                                                charSequence = ob6.M0(2131743978, null);
                                            } else if (h.bot) {
                                                int i13 = h.bot_active_users;
                                                charSequence = i13 != 0 ? ob6.H(',', "BotUsers", i13) : lbc.e(h);
                                            } else {
                                                zArr[0] = false;
                                                charSequence = ob6.d0(i7, h, zArr, this.f0 ? this.T : null);
                                                z3 = zArr[0];
                                            }
                                        }
                                    }
                                }
                            } else {
                                z2 = false;
                            }
                            z3 = z2;
                        }
                        charSequence = G;
                    }
                    z3 = false;
                } else if (zu1Var.i4) {
                    charSequence = ob6.M0(2131752184, null);
                    z3 = false;
                } else {
                    if (zu1Var.c() == 0) {
                        qyb qybVar = zu1Var.getMessagesController().g4;
                        long j3 = -zu1Var.a();
                        int size = (!qybVar.e(j3) || (l = qybVar.l(j3)) == null) ? 0 : l.size();
                        G = size > 0 ? ob6.H(',', "Chats", size) : ob6.M0(2131752184, null);
                    } else {
                        TLRPC.TL_forumTopic f2 = uc7.s1(i7).g4.f(chat.id, zu1Var.c());
                        int i14 = f2 != null ? f2.totalMessagesCount : 0;
                        G = i14 > 0 ? ob6.G(i14, "messages", Integer.valueOf(i14)) : ob6.a0(null, null, 2131743667, ro4.j(i7, chat, false));
                    }
                    charSequence = G;
                    z3 = false;
                }
            }
            this.b0 = z3 ? aob.pa : aob.B8;
            if (this.a0 != null) {
                this.a0 = charSequence;
            } else if (ns1Var != null) {
                ns1Var.k(charSequence);
                Integer num = this.c0;
                if (num == null) {
                    yob.W(ns1Var, this.b0, vnbVar);
                    ns1Var.setTag(Integer.valueOf(this.b0));
                } else {
                    ns1Var.setTextColor(num.intValue());
                }
            } else {
                inVar.c(charSequence, z, true);
                Integer num2 = this.c0;
                if (num2 == null) {
                    yob.U(inVar, this.b0, vnbVar);
                    inVar.setTag(Integer.valueOf(this.b0));
                } else {
                    inVar.setTextColor(num2.intValue());
                }
            }
            a aVar = this.A0;
            if (aVar != null) {
                aVar.l(z);
            }
        }
    }

    public boolean o() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        zu1 zu1Var = this.H;
        if (zu1Var != null) {
            int i = this.K;
            jn7.f(i).b(this, jn7.T1);
            jn7.e().b(this, jn7.l4);
            if (zu1Var.g4 == 3) {
                jn7.f(i).b(this, jn7.i3);
            }
            this.W = ConnectionsManager.getInstance(i).getConnectionState();
            l();
        }
        ul ulVar = this.g0;
        if (ulVar != null) {
            ulVar.a();
        }
        ul ulVar2 = this.h0;
        if (ulVar2 != null) {
            ulVar2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zu1 zu1Var = this.H;
        if (zu1Var != null) {
            int i = this.K;
            jn7.f(i).n(this, jn7.T1);
            jn7.e().n(this, jn7.l4);
            if (zu1Var.g4 == 3) {
                jn7.f(i).n(this, jn7.i3);
            }
        }
        ul ulVar = this.g0;
        if (ulVar != null) {
            ulVar.b();
        }
        ul ulVar2 = this.h0;
        if (ulVar2 != null) {
            ulVar2.b();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.getText());
        if (this.q0 != null) {
            sb.append(", ");
            sb.append(this.q0);
        }
        if (this.r0 != null) {
            sb.append(", ");
            sb.append(this.r0);
        }
        sb.append("\n");
        ns1 ns1Var = this.r;
        if (ns1Var != null) {
            sb.append(ns1Var.getText());
        } else {
            in inVar = this.s;
            if (inVar != null) {
                sb.append(inVar.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, ob6.M0(2131747513, null)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        b82 b82Var = this.e;
        int measuredHeight = (((currentActionBarHeight - b82Var.getMeasuredHeight()) - 2) / 2) + (this.L ? hl.m : 0);
        int L = hl.L(this.m0 ? 23.66f : 24.0f) + measuredHeight;
        int i5 = this.M + 1;
        int i6 = measuredHeight + 1;
        b82Var.layout(i5, i6, b82Var.getMeasuredWidth() + i5, b82Var.getMeasuredHeight() + i6);
        int i7 = this.M;
        int visibility = b82Var.getVisibility();
        boolean z2 = this.m0;
        int L2 = i7 + hl.L(visibility == 0 ? z2 ? 49.66f : 55.0f : z2 ? 13.0f : 1.0f) + this.N;
        ema emaVar = (ema) this.n.get();
        int visibility2 = getSubtitleTextView().getVisibility();
        ns1 ns1Var = this.h;
        if (visibility2 != 8) {
            ns1Var.layout(L2, (hl.L(1.66f) + measuredHeight) - ns1Var.getPaddingTop(), ns1Var.getMeasuredWidth() + L2, ns1Var.getPaddingBottom() + ((hl.L(1.66f) + (ns1Var.getTextHeight() + measuredHeight)) - ns1Var.getPaddingTop()));
            if (emaVar != null) {
                emaVar.layout(L2, hl.L(1.66f) + measuredHeight, emaVar.getMeasuredWidth() + L2, hl.L(1.66f) + emaVar.getTextHeight() + measuredHeight);
            }
        } else {
            ns1Var.layout(L2, (hl.L(11.0f) + measuredHeight) - ns1Var.getPaddingTop(), ns1Var.getMeasuredWidth() + L2, ns1Var.getPaddingBottom() + ((hl.L(11.0f) + (ns1Var.getTextHeight() + measuredHeight)) - ns1Var.getPaddingTop()));
            if (emaVar != null) {
                emaVar.layout(L2, hl.L(10.0f) + measuredHeight, emaVar.getMeasuredWidth() + L2, hl.L(10.0f) + emaVar.getTextHeight() + measuredHeight);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.layout(hl.L(29.0f) + this.M, hl.L(27.33f) + measuredHeight, imageView.getMeasuredWidth() + hl.L(29.0f) + this.M, imageView.getMeasuredHeight() + hl.L(27.33f) + measuredHeight);
        }
        ImageView imageView2 = this.x;
        if (imageView2 != null) {
            imageView2.layout(hl.L(19.333f) + this.M, measuredHeight - hl.L(8.0f), imageView2.getMeasuredWidth() + hl.L(19.333f) + this.M, imageView2.getMeasuredHeight() + (measuredHeight - hl.L(8.0f)));
        }
        ImageView imageView3 = this.E;
        if (imageView3 != null) {
            imageView3.layout(hl.L(28.0f) + this.M, hl.L(24.0f) + measuredHeight, imageView3.getMeasuredWidth() + hl.L(28.0f) + this.M, imageView3.getMeasuredHeight() + hl.L(24.0f) + measuredHeight);
        }
        ImageView imageView4 = this.F;
        if (imageView4 != null) {
            imageView4.layout(hl.L(28.0f) + this.M, hl.L(24.0f) + measuredHeight, imageView4.getMeasuredWidth() + hl.L(28.0f) + this.M, imageView4.getMeasuredHeight() + hl.L(24.0f) + measuredHeight);
        }
        ns1 ns1Var2 = this.r;
        if (ns1Var2 != null) {
            ns1Var2.layout(L2, L, ns1Var2.getMeasuredWidth() + L2, ns1Var2.getTextHeight() + L);
        } else {
            in inVar = this.s;
            if (inVar != null) {
                inVar.layout(L2, L, inVar.getMeasuredWidth() + L2, inVar.getTextHeight() + L);
            }
        }
        ema emaVar2 = (ema) this.w.get();
        if (emaVar2 != null) {
            emaVar2.layout(L2, L, emaVar2.getMeasuredWidth() + L2, emaVar2.getTextHeight() + L);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        b82 b82Var = this.e;
        int L = size - hl.L((b82Var.getVisibility() == 0 ? 54 : 0) + 16);
        float f = this.d;
        b82Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(f) - 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(f) - 2, TLObject.FLAG_30));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), TLObject.FLAG_31);
        ns1 ns1Var = this.h;
        ns1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        in inVar = this.s;
        ns1 ns1Var2 = this.r;
        if (ns1Var2 != null) {
            ns1Var2.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_31));
        } else if (inVar != null) {
            inVar.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_31));
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(hl.L(14.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(14.0f), TLObject.FLAG_30));
        }
        ImageView imageView2 = this.x;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(hl.L(34.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(34.0f), TLObject.FLAG_30));
        }
        ImageView imageView3 = this.E;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
        }
        ImageView imageView4 = this.F;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
        int i3 = this.P;
        AtomicReference atomicReference = this.n;
        if (i3 != -1 && i3 != size && i3 > size) {
            this.Q = i3;
            View view = (ema) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            ema emaVar = new ema(getContext());
            atomicReference.set(emaVar);
            int i4 = aob.A8;
            vnb vnbVar = this.e0;
            yob.W(emaVar, i4, vnbVar);
            emaVar.setTextSizePx(hl.L(this.m0 ? 17.5f : 18.0f));
            emaVar.setGravity(3);
            emaVar.setTypeface(hl.o());
            emaVar.setLeftDrawableTopPadding(-hl.L(1.3f));
            emaVar.i(ns1Var.getRightDrawable());
            emaVar.j(ns1Var.getRightDrawable2());
            emaVar.setRightDrawableOutside(ns1Var.getRightDrawableOutside());
            emaVar.setLeftDrawable(ns1Var.getLeftDrawable());
            emaVar.l(ns1Var.getText(), false);
            ViewPropertyAnimator duration = emaVar.animate().alpha(0.0f).setDuration(350L);
            k43 k43Var = k43.h;
            duration.setInterpolator(k43Var).withEndAction(new x72(this, (byte) 0)).start();
            addView(emaVar);
            AtomicReference atomicReference2 = this.w;
            View view2 = (ema) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            ema emaVar2 = new ema(getContext());
            atomicReference2.set(emaVar2);
            int i5 = aob.B8;
            yob.W(emaVar2, i5, vnbVar);
            emaVar2.setTag(Integer.valueOf(i5));
            emaVar2.setTextSizePx(hl.L(this.m0 ? 13.5f : 14.0f));
            emaVar2.setGravity(3);
            if (ns1Var2 != null) {
                emaVar2.l(ns1Var2.getText(), false);
            } else if (inVar != null) {
                emaVar2.l(inVar.getText(), false);
            }
            emaVar2.animate().alpha(0.0f).setDuration(350L).setInterpolator(k43Var).withEndAction(new x72(this, (byte) 1)).start();
            addView(emaVar2);
            setClipChildren(false);
        }
        ema emaVar3 = (ema) atomicReference.get();
        if (emaVar3 != null) {
            emaVar3.measure(ik8.f((b82Var.getVisibility() == 0 ? 54 : 0) + 16, this.Q, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(24.0f), TLObject.FLAG_31));
        }
        this.P = size;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        v41 v41Var = this.i0;
        x72 x72Var = this.j0;
        if (action == 0 && a()) {
            this.k0 = true;
            v41Var.c(true);
            hl.r(x72Var);
            hl.d3(x72Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.k0) {
            v41Var.c(false);
            this.k0 = false;
            if (isClickable() && motionEvent.getAction() == 1) {
                e(false, false);
            }
            hl.r(x72Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBar(a aVar) {
        this.A0 = aVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        rb0 rb0Var = this.J;
        rb0Var.p(chat);
        b82 b82Var = this.e;
        if (b82Var != null) {
            b82Var.f(chat, rb0Var);
            b82Var.setRoundRadius(hl.L(xc2.c0(chat) ? (chat == null || !uc7.s1(yac.t0).O1().J(-chat.id)) ? 16.0f : 11.0f : 21.0f));
        }
    }

    public void setCommunityItemVisible(boolean z) {
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setVisibility((!z || this.f) ? 8 : 0);
        }
    }

    public void setLeftPadding(int i) {
        this.M = i;
    }

    public void setOccupyStatusBar(boolean z) {
        this.L = z;
    }

    public void setOverrideSubtitleColor(Integer num) {
        this.c0 = num;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.i0.c(z);
    }

    public void setRightAvatarPadding(int i) {
        this.N = i;
    }

    public void setStoriesForceState(Integer num) {
        this.c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.a0 == null) {
            ns1 ns1Var = this.r;
            if (ns1Var != null) {
                ns1Var.k(charSequence);
            } else {
                in inVar = this.s;
                if (inVar != null) {
                    inVar.setText(charSequence);
                }
            }
        } else {
            this.a0 = charSequence;
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.l(true);
        }
    }

    public void setTitle(CharSequence charSequence) {
        h(charSequence, false, false, false, false, false, null, false);
    }

    public void setUserAvatar(TLRPC.User user) {
        k(user, false);
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        ImageView imageView;
        if (i != 0 || (imageView = this.x) == null) {
            return;
        }
        imageView.setAlpha(f);
        float f3 = 0.85f * f;
        imageView.setScaleX(f3);
        imageView.setScaleY(f3);
        imageView.setVisibility(f > 0.0f ? 0 : 8);
    }

    @Override // snb
    public final void updateColors() {
        d2b d2bVar = this.O;
        vnb vnbVar = this.e0;
        if (d2bVar != null) {
            d2bVar.b(aob.v0(aob.pa, vnbVar));
        }
        Drawable drawable = this.s0;
        if (drawable != null) {
            int v0 = aob.v0(aob.qi, vnbVar);
            PorterDuffColorFilter porterDuffColorFilter = this.w0;
            if (porterDuffColorFilter == null || v0 != this.y0) {
                this.y0 = v0;
                porterDuffColorFilter = new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY);
                this.w0 = porterDuffColorFilter;
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
        ul ulVar = this.h0;
        if (ulVar != null) {
            ulVar.k(Integer.valueOf(aob.v0(aob.qi, vnbVar)));
        }
        ul ulVar2 = this.g0;
        if (ulVar2 != null) {
            ulVar2.k(Integer.valueOf(aob.v0(aob.qi, vnbVar)));
        }
        Drawable drawable2 = this.t0;
        if (drawable2 != null) {
            int v02 = aob.v0(aob.qi, vnbVar);
            PorterDuffColorFilter porterDuffColorFilter2 = this.w0;
            if (porterDuffColorFilter2 == null || v02 != this.y0) {
                this.y0 = v02;
                porterDuffColorFilter2 = new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY);
                this.w0 = porterDuffColorFilter2;
            }
            drawable2.setColorFilter(porterDuffColorFilter2);
        }
        if (this.u0 != null) {
            int v03 = aob.v0(aob.ri, vnbVar);
            PorterDuffColorFilter porterDuffColorFilter3 = this.x0;
            if (porterDuffColorFilter3 == null || v03 != this.z0) {
                this.z0 = v03;
                porterDuffColorFilter3 = new PorterDuffColorFilter(v03, PorterDuff.Mode.MULTIPLY);
                this.x0 = porterDuffColorFilter3;
            }
            this.u0.setColorFilter(porterDuffColorFilter3);
        }
        ns1 ns1Var = this.h;
        if (ns1Var != null) {
            try {
                if (ns1Var.getRightDrawable2() instanceof yt9) {
                    yt9 yt9Var = (yt9) ns1Var.getRightDrawable2();
                    yt9Var.b(aob.v0(yt9Var.f == 2 ? aob.p7 : aob.B8, vnbVar));
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        invalidate();
    }

    public void f() {
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
