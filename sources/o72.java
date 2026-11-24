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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class o72 extends FrameLayout implements x74, gk7, tjb {
    public a A0;
    public final ImageView E;
    public final ImageView F;
    public final rob G;
    public final mu1 H;
    public final bya[] I;
    public final pb0 J;
    public final int K;
    public boolean L;
    public int M;
    public int N;
    public bya O;
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
    public final ffa d0;
    public final k72 e;
    public final wjb e0;
    public final boolean f;
    public boolean f0;
    public final tl g0;
    public final zr1 h;
    public final tl h0;
    public final n41 i0;
    public final g72 j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final AtomicReference n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public String q0;
    public final zr1 r;
    public String r0;
    public final hn s;
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
    public o72(Context context, d dVar, boolean z, wjb wjbVar) {
        super(context);
        boolean z2;
        int i;
        int i2;
        ?? r7;
        TLRPC.Chat chat;
        int i3;
        bya[] byaVarArr;
        int i4;
        s33 s33Var = s33.h;
        this.a = new fm0(0, this, s33Var, 320L, false);
        this.d = (byte) 42;
        AtomicReference atomicReference = new AtomicReference();
        this.n = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.w = atomicReference2;
        bya[] byaVarArr2 = new bya[6];
        this.I = byaVarArr2;
        this.J = new pb0((wjb) null);
        this.K = y6c.t0;
        this.L = true;
        this.M = gl.L(8.0f);
        this.N = 0;
        this.P = -1;
        this.Q = -1;
        this.S = new boolean[1];
        this.T = new boolean[1];
        this.V = -1;
        this.b0 = -1;
        this.f0 = false;
        this.i0 = new n41(this);
        this.j0 = new g72(this, (byte) 2);
        this.o0 = false;
        this.p0 = false;
        this.q0 = null;
        this.r0 = null;
        this.e0 = wjbVar;
        boolean z3 = dVar instanceof mu1;
        if (z3) {
            this.H = (mu1) dVar;
        }
        mu1 mu1Var = this.H;
        boolean z4 = mu1Var != null && ((i4 = mu1Var.g4) == 0 || i4 == 8) && !l7c.B(mu1Var.h()) && (this.H.h() == null || this.H.h().id != 489000);
        k72 k72Var = new k72(this, context, dVar, z4, wjbVar);
        this.e = k72Var;
        if (z3 || (dVar instanceof qvb)) {
            mu1 mu1Var2 = this.H;
            if (mu1Var2 == null || ((i = mu1Var2.g4) != 5 && i != 9 && i != 6 && i != 8 && !l7c.w(mu1Var2.f))) {
                this.d0 = new ffa(dVar);
            }
            mu1 mu1Var3 = this.H;
            if (mu1Var3 != null) {
                if (mu1Var3.a8()) {
                    mu1 mu1Var4 = this.H;
                    if (mu1Var4.m4 != null) {
                    }
                    z2 = true;
                    this.f = z2;
                    if (z2) {
                        k72Var.setVisibility(8);
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
        k72Var.setContentDescription(k96.M0(2131754797, null));
        k72Var.setRoundRadius(gl.L(21.0f));
        addView(k72Var);
        if (z4) {
            mu1 mu1Var5 = this.H;
            TLRPC.Chat chat2 = mu1Var5 != null ? mu1Var5.e : null;
            if (chat2 != null && chat2.linked_community_id != 0) {
                ote.b(k72Var, 0.05f, 1.2f);
            }
            final byte b = 0;
            k72Var.setOnClickListener(new View.OnClickListener(this) { // from class: i72
                public final /* synthetic */ o72 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b2 = b;
                    o72 o72Var = this.b;
                    switch (b2) {
                        case 0:
                            if (!o72Var.d()) {
                                o72Var.e(true, false);
                                break;
                            }
                            break;
                        default:
                            o72Var.e(false, false);
                            break;
                    }
                }
            });
        }
        zr1 zr1Var = new zr1(context, atomicReference);
        this.h = zr1Var;
        zr1Var.setEllipsizeByGradient(true);
        zkb.W(zr1Var, bkb.z8, wjbVar);
        zr1Var.setTextSize(18);
        zr1Var.setGravity(3);
        zr1Var.setTypeface(gl.o());
        zr1Var.setLeftDrawableTopPadding(-gl.L(1.3f));
        zr1Var.setCanHideRightDrawable(false);
        zr1Var.setRightDrawableOutside(true);
        zr1Var.setPadding(0, gl.L(6.0f), 0, gl.L(12.0f));
        addView(zr1Var);
        if (o()) {
            hn hnVar = new hn(context, true, true, true);
            this.s = hnVar;
            hnVar.b(0.3f, 320L, s33Var);
            hnVar.setEllipsizeByGradient(true);
            int i6 = bkb.A8;
            zkb.U(hnVar, i6, wjbVar);
            hnVar.setTag(Integer.valueOf(i6));
            hnVar.setTextSize(gl.L(14.0f));
            hnVar.setGravity(3);
            hnVar.setPadding(0, 0, gl.L(10.0f), 0);
            hnVar.setTranslationY(-gl.L(1.0f));
            addView(hnVar);
        } else {
            zr1 zr1Var2 = new zr1(context, atomicReference2);
            this.r = zr1Var2;
            zr1Var2.setEllipsizeByGradient(true);
            int i7 = bkb.A8;
            zkb.W(zr1Var2, i7, wjbVar);
            zr1Var2.setTag(Integer.valueOf(i7));
            zr1Var2.setTextSize(14);
            zr1Var2.setGravity(3);
            zr1Var2.setPadding(0, 0, gl.L(10.0f), 0);
            addView(zr1Var2);
        }
        if (this.H != null) {
            ImageView imageView = new ImageView(context);
            this.y = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setVisibility(8);
            imageView.setImageDrawable(new sk0());
            addView(imageView);
            ImageView imageView2 = new ImageView(context);
            this.x = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setVisibility(8);
            rob robVar = new rob(context, wjbVar);
            this.G = robVar;
            imageView2.setImageDrawable(robVar);
            robVar.k = true;
            robVar.b.setColor(0);
            addView(imageView2);
            this.U = z;
            imageView2.setOnClickListener(new kb1((Object) this, (Object) wjbVar, (byte) 11));
            if (z) {
                imageView2.setContentDescription(k96.M0(2131745317, null));
            } else {
                imageView2.setContentDescription(k96.M0(2131754925, null));
            }
            ImageView imageView3 = new ImageView(context);
            this.E = imageView3;
            imageView3.setImageResource(R.drawable.star_small_outline);
            zkb.s(imageView3, bkb.r8, wjbVar, PorterDuff.Mode.SRC_IN);
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
        mu1 mu1Var6 = this.H;
        if (mu1Var6 != null && ((i2 = mu1Var6.g4) == 0 || i2 == 8 || i2 == 3)) {
            if (mu1Var6.a8()) {
                mu1 mu1Var7 = this.H;
                if (!mu1Var7.x4) {
                }
            }
            if (!l7c.B(this.H.h()) && (this.H.h() == null || this.H.h().id != 489000)) {
                r7 = 1;
                final char c = 1 == true ? 1 : 0;
                setOnClickListener(new View.OnClickListener(this) { // from class: i72
                    public final /* synthetic */ o72 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b2 = c;
                        o72 o72Var = this.b;
                        switch (b2) {
                            case 0:
                                if (!o72Var.d()) {
                                    o72Var.e(true, false);
                                    break;
                                }
                                break;
                            default:
                                o72Var.e(false, false);
                                break;
                        }
                    }
                });
                chat = this.H.e;
                byaVarArr2[0] = new a4c(r7);
                byaVarArr2[r7] = new pg2(r7);
                byaVarArr2[2] = new m4a(r7);
                byaVarArr2[3] = new bd8(wjbVar, false);
                byaVarArr2[4] = new oj9(r7);
                byaVarArr2[5] = new pg2();
                i3 = 0;
                while (true) {
                    byaVarArr = this.I;
                    if (i3 < byaVarArr.length) {
                        break;
                    }
                    byaVarArr[i3].c(chat != null ? r7 : false);
                    i3++;
                }
            }
            r7 = 1;
            chat = this.H.e;
            byaVarArr2[0] = new a4c(r7);
            byaVarArr2[r7] = new pg2(r7);
            byaVarArr2[2] = new m4a(r7);
            byaVarArr2[3] = new bd8(wjbVar, false);
            byaVarArr2[4] = new oj9(r7);
            byaVarArr2[5] = new pg2();
            i3 = 0;
            while (true) {
                byaVarArr = this.I;
                if (i3 < byaVarArr.length) {
                }
                byaVarArr[i3].c(chat != null ? r7 : false);
                i3++;
            }
        }
        this.g0 = new tl(gl.L(24.0f), this.h);
        this.h0 = new tl(gl.L(17.0f), this.h);
    }

    private void setTypingAnimation(boolean z) {
        mu1 mu1Var = this.H;
        zr1 zr1Var = this.r;
        if (zr1Var != null) {
            int i = 0;
            bya[] byaVarArr = this.I;
            if (!z) {
                this.O = null;
                zr1Var.setLeftDrawable((Drawable) null);
                zr1Var.g(null, null);
                while (i < byaVarArr.length) {
                    bya byaVar = byaVarArr[i];
                    if (byaVar != null) {
                        byaVar.e();
                    }
                    i++;
                }
                return;
            }
            try {
                int intValue = na7.q1(this.K).B1(mu1Var.a(), mu1Var.s4).intValue();
                bya byaVar2 = byaVarArr[intValue];
                if (byaVar2 != null) {
                    wjb wjbVar = this.e0;
                    if (intValue == 5) {
                        zr1Var.g(byaVar2, "**oo**");
                        byaVarArr[intValue].b(bkb.v0(bkb.oa, wjbVar));
                        zr1Var.setLeftDrawable((Drawable) null);
                    } else {
                        zr1Var.g(null, null);
                        byaVarArr[intValue].b(bkb.v0(bkb.oa, wjbVar));
                        zr1Var.setLeftDrawable(byaVarArr[intValue]);
                    }
                    this.O = byaVarArr[intValue];
                    while (i < byaVarArr.length) {
                        bya byaVar3 = byaVarArr[i];
                        if (byaVar3 != null) {
                            if (i == intValue) {
                                byaVar3.d();
                            } else {
                                byaVar3.e();
                            }
                        }
                        i++;
                    }
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public boolean a() {
        return false;
    }

    public final void b() {
        TLRPC.User user;
        int L;
        mu1 mu1Var = this.H;
        if (mu1Var != null) {
            TLRPC.User h = mu1Var.h();
            TLRPC.Chat chat = mu1Var.e;
            if (mu1Var.g4 == 3) {
                long X6 = mu1Var.X6();
                if (X6 >= 0) {
                    user = mu1Var.getMessagesController().V1(Long.valueOf(X6));
                    chat = null;
                } else {
                    chat = mu1Var.getMessagesController().K0(Long.valueOf(-X6));
                    user = null;
                }
            } else {
                user = h;
            }
            pb0 pb0Var = this.J;
            k72 k72Var = this.e;
            if (user == null) {
                if (!hc2.p0(chat)) {
                    if (chat != null) {
                        pb0Var.p = 1.0f;
                        pb0Var.p(chat);
                        if (k72Var != null) {
                            k72Var.setAnimatedEmojiDrawable(null);
                            k72Var.f(chat, pb0Var);
                            if (chat.forum) {
                                L = gl.L(na7.q1(y6c.t0).M1().J(-chat.id) ? 11.0f : 16.0f);
                            } else {
                                L = gl.L(21.0f);
                            }
                            k72Var.setRoundRadius(L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                long d = mu1Var.d();
                int i = this.K;
                if (!hc2.A(i, chat, 24) || d == 0) {
                    k72Var.setAnimatedEmojiDrawable(null);
                    mm4.o(i, chat, pb0Var, k72Var);
                } else if (d > 0) {
                    TLRPC.User V1 = mu1Var.getMessagesController().V1(Long.valueOf(d));
                    pb0Var.q(V1);
                    k72Var.setAnimatedEmojiDrawable(null);
                    k72Var.f(V1, pb0Var);
                } else {
                    TLRPC.Chat K0 = mu1Var.getMessagesController().K0(Long.valueOf(-d));
                    pb0Var.p(K0);
                    k72Var.setAnimatedEmojiDrawable(null);
                    k72Var.f(K0, pb0Var);
                }
                k72Var.setRoundRadius(gl.L(21.0f));
                return;
            }
            pb0Var.q(user);
            if (l7c.B(user)) {
                pb0Var.p = 0.8f;
                pb0Var.f(12);
                if (k72Var != null) {
                    k72Var.setAnimatedEmojiDrawable(null);
                    k72Var.m(null, null, pb0Var, user);
                    return;
                }
                return;
            }
            if (l7c.u(user)) {
                pb0Var.p = 0.8f;
                pb0Var.f(21);
                if (k72Var != null) {
                    k72Var.setAnimatedEmojiDrawable(null);
                    k72Var.m(null, null, pb0Var, user);
                    return;
                }
                return;
            }
            if (l7c.D(user) && mu1Var.g4 == 3) {
                pb0Var.p = 0.8f;
                pb0Var.f(22);
                if (k72Var != null) {
                    k72Var.setAnimatedEmojiDrawable(null);
                    k72Var.m(null, null, pb0Var, user);
                    return;
                }
                return;
            }
            if (!l7c.D(user)) {
                pb0Var.p = 1.0f;
                if (k72Var != null) {
                    k72Var.setAnimatedEmojiDrawable(null);
                    k72Var.a.V(user, pb0Var, null, true, 3, false);
                    return;
                }
                return;
            }
            pb0Var.p = 0.8f;
            pb0Var.f(1);
            if (k72Var != null) {
                k72Var.setAnimatedEmojiDrawable(null);
                k72Var.m(null, null, pb0Var, user);
            }
        }
    }

    public final tl c(long j) {
        if (j == 0) {
            return null;
        }
        tl tlVar = this.h0;
        tlVar.j(j, false);
        tlVar.k(Integer.valueOf(bkb.v0(bkb.pi, this.e0)));
        int L = gl.L(1.0f);
        tlVar.J = 0;
        tlVar.K = L;
        return tlVar;
    }

    public boolean d() {
        return false;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.S1) {
            int connectionState = ConnectionsManager.getInstance(this.K).getConnectionState();
            if (this.W != connectionState) {
                this.W = connectionState;
                l();
                return;
            }
            return;
        }
        if (i != kk7.k4) {
            if (i == kk7.h3) {
                n(true);
            }
        } else {
            zr1 zr1Var = this.h;
            if (zr1Var != null) {
                zr1Var.invalidate();
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
                RectF rectF = gl.P;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-gl.L(3.0f), -gl.L(3.0f));
                canvas.saveLayer(rectF, null);
                boolean drawChild = super.drawChild(canvas, view, j);
                if (z2) {
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - gl.N(0.33f), imageView.getScaleX() * gl.N(12.0f), bkb.Fm);
                }
                if (z) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * gl.N(7.66f), bkb.Fm);
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
        mu1 mu1Var;
        TLRPC.Chat chat;
        ImageReceiver imageReceiver;
        String str;
        fl5 z4;
        ez1 ez1Var;
        Drawable t;
        TLRPC.User V1;
        k72 k72Var = this.e;
        if (z) {
            if (!gl.O1()) {
                Point point = gl.q;
                if (point.x <= point.y) {
                }
            }
            z3 = false;
            mu1Var = this.H;
            TLRPC.User h = mu1Var.h();
            chat = mu1Var.e;
            boolean z5 = chat == null && chat.monoforum;
            if (chat != null && chat.monoforum) {
                chat = mu1Var.getMessagesController().K0(Long.valueOf(chat.linked_monoforum_id));
                if (chat != null) {
                    return;
                }
                if (mu1Var.c7() != 0 && (V1 = mu1Var.getMessagesController().V1(Long.valueOf(mu1Var.c7()))) != null) {
                    chat = null;
                    h = V1;
                }
            }
            imageReceiver = k72Var.getImageReceiver();
            str = imageReceiver.R;
            z4 = fl5.z();
            if (str != null && !z4.F(str, false)) {
                t = imageReceiver.t();
                if ((t instanceof BitmapDrawable) && !(t instanceof km)) {
                    z4.K((BitmapDrawable) t, str, false);
                }
            }
            if (!mu1Var.v4) {
                if (chat != null) {
                    mu1Var.presentFragment(ProfileActivity.P2(-chat.id), z2);
                    return;
                }
                return;
            }
            ffa ffaVar = this.d0;
            if (h == null) {
                boolean z6 = z3;
                if (chat != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    if (mu1Var.g4 == 3) {
                        bundle.putLong("topic_id", mu1Var.X6());
                    } else if (mu1Var.x4) {
                        bundle.putLong("topic_id", mu1Var.m4.e1());
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, ffaVar);
                    if (!z5) {
                        profileActivity.q3(mu1Var.r8);
                    }
                    profileActivity.x3(z6 ? 2 : 1);
                    mu1Var.presentFragment(profileActivity, z2);
                    return;
                }
                return;
            }
            if (h.id != 489000) {
                Bundle bundle2 = new Bundle();
                if (l7c.D(h)) {
                    d dVar = ffaVar.x;
                    int[] iArr = ffaVar.c;
                    int i = 0;
                    while (true) {
                        if (i < iArr.length) {
                            if (iArr[i] > 0) {
                                break;
                            } else {
                                i++;
                            }
                        } else if (!ffaVar.f && (dVar == null || ffaVar.r != dVar.getUserConfig().e() || ffaVar.s != 0 || !dVar.getMessagesController().D1().e())) {
                            return;
                        }
                    }
                    bundle2.putLong("dialog_id", mu1Var.a());
                    if (mu1Var.g4 == 3) {
                        bundle2.putLong("topic_id", mu1Var.X6());
                    }
                    zj6 zj6Var = new zj6(bundle2, ffaVar);
                    zj6Var.c = mu1Var.r8;
                    mu1Var.presentFragment(zj6Var, z2);
                    return;
                }
                boolean z7 = z3;
                if (mu1Var.g4 == 3) {
                    long X6 = mu1Var.X6();
                    bundle2.putBoolean("saved", true);
                    if (X6 >= 0) {
                        bundle2.putLong("user_id", X6);
                    } else {
                        bundle2.putLong("chat_id", -X6);
                    }
                } else {
                    bundle2.putLong("user_id", h.id);
                    if (this.x != null && !z5) {
                        bundle2.putLong("dialog_id", mu1Var.a());
                    }
                }
                if (l7c.w(h)) {
                    bundle2.putLong("topic_id", mu1Var.d());
                }
                k7 k7Var = mu1Var.Z1;
                bundle2.putBoolean("reportSpam", (k7Var == null || (ez1Var = mu1Var.b1) == null || !ez1Var.e(k7Var) || mu1Var.c2.getVisibility() == 8) ? false : true);
                bundle2.putInt("actionBarColor", bkb.v0(bkb.r8, this.e0));
                ProfileActivity profileActivity2 = new ProfileActivity(bundle2, ffaVar);
                if (!z5) {
                    profileActivity2.y3(mu1Var.s8, mu1Var.t8, mu1Var.u8);
                }
                profileActivity2.x3(z7 ? 2 : 1);
                mu1Var.presentFragment(profileActivity2, z2);
                return;
            }
            return;
        }
        z3 = z;
        mu1Var = this.H;
        TLRPC.User h2 = mu1Var.h();
        chat = mu1Var.e;
        if (chat == null) {
        }
        if (chat != null) {
            chat = mu1Var.getMessagesController().K0(Long.valueOf(chat.linked_monoforum_id));
            if (chat != null) {
            }
        }
        imageReceiver = k72Var.getImageReceiver();
        str = imageReceiver.R;
        z4 = fl5.z();
        if (str != null) {
            t = imageReceiver.t();
            if (t instanceof BitmapDrawable) {
                z4.K((BitmapDrawable) t, str, false);
            }
        }
        if (!mu1Var.v4) {
        }
    }

    public final void g(int i, boolean z) {
        rob robVar = this.G;
        if (robVar != null) {
            boolean z2 = this.n0;
            if (i != 0 || this.U) {
                fm0 fm0Var = this.a;
                if (z2) {
                    fm0Var.a(false, z);
                } else {
                    fm0Var.a(true, z);
                    robVar.b(i);
                }
            }
        }
    }

    public be0 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.b0;
    }

    public int getLeftPadding() {
        return this.M;
    }

    public ffa getSharedMediaPreloader() {
        return this.d0;
    }

    public TextPaint getSubtitlePaint() {
        zr1 zr1Var = this.r;
        return zr1Var != null ? zr1Var.getTextPaint() : this.s.getPaint();
    }

    public View getSubtitleTextView() {
        zr1 zr1Var = this.r;
        if (zr1Var != null) {
            return zr1Var;
        }
        hn hnVar = this.s;
        if (hnVar != null) {
            return hnVar;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.x;
    }

    public jia getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        zr1 zr1Var = this.h;
        float max = zr1Var != null ? Math.max(0.0f, zr1Var.getExactWidthIncludeDrawables()) : 0.0f;
        zr1 zr1Var2 = this.r;
        if (zr1Var2 != null) {
            max = Math.max(max, zr1Var2.getExactWidthIncludeDrawables());
        }
        k72 k72Var = this.e;
        return (int) (max + ((k72Var == null || k72Var.getVisibility() != 0) ? gl.L(34.0f) : gl.L(70.0f)));
    }

    public final void h(CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.EmojiStatus emojiStatus, boolean z5) {
        if (charSequence != null) {
            charSequence = vu3.m(charSequence, this.h.getPaint().getFontMetricsInt(), false, null, 0);
        }
        this.h.k(charSequence);
        this.p0 = false;
        if (z || z2) {
            this.p0 = true;
            if (!(this.h.getRightDrawable() instanceof gq9)) {
                gq9 gq9Var = new gq9(!z ? 1 : 0);
                gq9Var.b(bkb.v0(bkb.A8, this.e0));
                this.h.j(gq9Var);
                this.r0 = k96.M0(2131745670, null);
                this.o0 = true;
            }
        } else if (z3) {
            Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
            this.t0 = mutate;
            int i = bkb.pi;
            wjb wjbVar = this.e0;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            zkb.x(this, mutate, i, wjbVar, mode);
            Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
            this.u0 = mutate2;
            zkb.x(this, mutate2, bkb.qi, this.e0, mode);
            this.h.j(new fm2(this.t0, this.u0));
            this.o0 = true;
            this.r0 = k96.M0(2131754738, null);
        } else if (this.h.getRightDrawable() instanceof gq9) {
            this.h.j(null);
            this.o0 = false;
            this.r0 = null;
        }
        if (z4 || cf3.f(emojiStatus) != 0) {
            if ((this.h.getRightDrawable() instanceof ul) && (((ul) this.h.getRightDrawable()).a instanceof vl)) {
                ((vl) ((ul) this.h.getRightDrawable()).a).o(this.h);
            }
            if (cf3.f(emojiStatus) != 0) {
                this.g0.j(cf3.f(emojiStatus), z5);
            } else if (z4) {
                Drawable mutate3 = org.telegram.messenger.a.b.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.s0 = mutate3;
                zkb.x(this, mutate3, bkb.pi, this.e0, PorterDuff.Mode.MULTIPLY);
                this.g0.g(this.s0, z5);
            } else {
                this.g0.g(null, z5);
            }
            this.g0.k(Integer.valueOf(bkb.v0(bkb.pi, this.e0)));
            this.h.i(this.g0);
            this.o0 = false;
            this.q0 = k96.M0(2131754801, null);
        } else {
            this.h.i(null);
            this.q0 = null;
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.k(z5);
        }
    }

    public final void i(int i, int i2) {
        zr1 zr1Var = this.h;
        zkb.q(zr1Var);
        zr1 zr1Var2 = this.r;
        zkb.q(zr1Var2);
        zr1Var.setTextColor(i);
        zr1Var2.setTextColor(i2);
        zr1Var2.setTag(Integer.valueOf(i2));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        zr1 zr1Var = this.h;
        zr1Var.setLeftDrawable(drawable);
        if (!this.o0 && !this.p0) {
            if (drawable2 != null) {
                this.r0 = k96.M0(2131747708, null);
            } else {
                this.r0 = null;
            }
            zr1Var.j(drawable2);
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.k(true);
        }
    }

    public final void k(TLRPC.User user, boolean z) {
        pb0 pb0Var = this.J;
        pb0Var.q(user);
        boolean B = l7c.B(user);
        k72 k72Var = this.e;
        if (B) {
            pb0Var.f(12);
            pb0Var.p = 0.8f;
            if (k72Var != null) {
                k72Var.m(null, null, pb0Var, user);
                return;
            }
            return;
        }
        if (l7c.u(user)) {
            pb0Var.f(21);
            pb0Var.p = 0.8f;
            if (k72Var != null) {
                k72Var.m(null, null, pb0Var, user);
                return;
            }
            return;
        }
        if (!l7c.D(user) || z) {
            pb0Var.p = 1.0f;
            if (k72Var != null) {
                k72Var.f(user, pb0Var);
                return;
            }
            return;
        }
        pb0Var.f(1);
        pb0Var.p = 0.8f;
        if (k72Var != null) {
            k72Var.m(null, null, pb0Var, user);
        }
    }

    public final void l() {
        int i = this.W;
        String M0 = i == 2 ? k96.M0(2131742970, null) : i == 1 ? k96.M0(2131751797, null) : i == 5 ? k96.M0(2131743571, null) : i == 4 ? k96.M0(2131751795, null) : null;
        wjb wjbVar = this.e0;
        hn hnVar = this.s;
        zr1 zr1Var = this.r;
        if (M0 == null) {
            CharSequence charSequence = this.a0;
            if (charSequence != null) {
                if (zr1Var != null) {
                    zr1Var.k(charSequence);
                    this.a0 = null;
                    Integer num = this.c0;
                    if (num != null) {
                        zr1Var.setTextColor(num.intValue());
                    } else {
                        int i2 = this.b0;
                        if (i2 >= 0) {
                            zkb.W(zr1Var, i2, wjbVar);
                            zr1Var.setTag(Integer.valueOf(this.b0));
                        }
                    }
                } else if (hnVar != null) {
                    hnVar.c(charSequence, !k96.a0, true);
                    this.a0 = null;
                    Integer num2 = this.c0;
                    if (num2 != null) {
                        hnVar.setTextColor(num2.intValue());
                    } else {
                        int i3 = this.b0;
                        if (i3 >= 0) {
                            zkb.U(hnVar, i3, wjbVar);
                            hnVar.setTag(Integer.valueOf(this.b0));
                        }
                    }
                }
            }
        } else if (zr1Var != null) {
            if (this.a0 == null) {
                this.a0 = zr1Var.getText();
            }
            zr1Var.k(M0);
            Integer num3 = this.c0;
            if (num3 != null) {
                zr1Var.setTextColor(num3.intValue());
            } else {
                int i4 = bkb.A8;
                zkb.W(zr1Var, i4, wjbVar);
                zr1Var.setTag(Integer.valueOf(i4));
            }
        } else if (hnVar != null) {
            if (this.a0 == null) {
                this.a0 = hnVar.getText();
            }
            hnVar.c(M0, !k96.a0, true);
            Integer num4 = this.c0;
            if (num4 != null) {
                hnVar.setTextColor(num4.intValue());
            } else {
                int i5 = bkb.A8;
                zkb.U(hnVar, i5, wjbVar);
                hnVar.setTag(Integer.valueOf(i5));
            }
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.k(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z;
        mu1 mu1Var = this.H;
        if (mu1Var != null) {
            this.V = 0;
            TLRPC.ChatFull chatFull = mu1Var.r8;
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
                    TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(chatFull.participants.participants.get(i2).user_id));
                    if (V1 != null && (userStatus = V1.status) != null && ((userStatus.expires > currentTime || V1.id == y6c.h(i).e()) && V1.status.expires > 10000)) {
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
        wjb wjbVar = this.e0;
        boolean[] zArr = this.S;
        hn hnVar = this.s;
        zr1 zr1Var = this.r;
        zr1 zr1Var2 = this.h;
        int i7 = this.K;
        mu1 mu1Var = this.H;
        if (mu1Var != null) {
            if (mu1Var.g4 == 6) {
                String str = mu1Var.e4.link;
                j41[] j41VarArr = j41.e;
                if (str.startsWith("https://")) {
                    str = str.substring(8);
                }
                setSubtitle(str);
                return;
            }
            TLRPC.User h = mu1Var.h();
            TLRPC.Chat chat = mu1Var.e;
            boolean z4 = l7c.D(h) && mu1Var.g4 == 0 && mu1Var.getMessagesController().D1().c() >= 3 && (this.v0 || na7.c1().getInt("savedmsgschatshint", 0) < 3);
            if (((l7c.D(h) && !z4) || l7c.B(h) || ((h != null && h.id == 489000) || ((i = mu1Var.g4) != 0 && i != 8))) && mu1Var.g4 != 3) {
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
                    na7.c1().edit().putInt("savedmsgschatshint", na7.c1().getInt("savedmsgschatshint", i6) + 1).apply();
                    this.v0 = true;
                }
            }
            CharSequence A1 = na7.q1(i7).A1(mu1Var.a(), mu1Var.s4, false);
            CharSequence charSequence = "";
            if (A1 != null) {
                A1 = TextUtils.replace(A1, new String[]{"..."}, new String[]{""});
            }
            Property property = View.ALPHA;
            Property property2 = View.TRANSLATION_Y;
            boolean z5 = z4;
            if (A1 != null && A1.length() != 0 && (!hc2.T(chat) || chat.megagroup)) {
                if (mu1Var.a8() && zr1Var2.getTag() != null) {
                    zr1Var2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.R = null;
                    }
                    if (z) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.R = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(zr1Var2, (Property<zr1, Float>) property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 1.0f));
                        this.R.addListener(new n72(this, (byte) 1));
                        this.R.setDuration(180L);
                        this.R.start();
                    } else {
                        zr1Var2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer B1 = na7.q1(i7).B1(mu1Var.a(), mu1Var.s4);
                charSequence = (B1 == null || B1.intValue() != 5) ? A1 : vu3.m(A1, getSubtitlePaint().getFontMetricsInt(), false, null, 0);
                setTypingAnimation(true);
                z3 = true;
            } else {
                if (mu1Var.a8() && !mu1Var.x4) {
                    if (zr1Var2.getTag() == null) {
                        zr1Var2.setTag(1);
                        AnimatorSet animatorSet3 = this.R;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.R = null;
                        }
                        if (!z) {
                            zr1Var2.setTranslationY(gl.L(9.7f));
                            getSubtitleTextView().setAlpha(0.0f);
                            getSubtitleTextView().setVisibility(4);
                            return;
                        } else {
                            AnimatorSet animatorSet4 = new AnimatorSet();
                            this.R = animatorSet4;
                            animatorSet4.playTogether(ObjectAnimator.ofFloat(zr1Var2, (Property<zr1, Float>) property2, gl.L(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 0.0f));
                            this.R.addListener(new n72(this, (byte) 0));
                            this.R.setDuration(180L);
                            this.R.start();
                            return;
                        }
                    }
                    return;
                }
                setTypingAnimation(false);
                int i8 = mu1Var.g4;
                if (i8 != 8) {
                    if (i8 == 3) {
                        vp9 D1 = mu1Var.getMessagesController().D1();
                        long X6 = mu1Var.X6();
                        ArrayList arrayList = D1.j;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= arrayList.size()) {
                                i5 = 0;
                                break;
                            }
                            up9 up9Var = (up9) arrayList.get(i9);
                            if (up9Var.a == X6) {
                                i5 = up9Var.e;
                                break;
                            }
                            i9++;
                        }
                        charSequence = k96.G(Math.max(1, i5), "SavedMessagesCount", new Object[0]);
                    } else {
                        if (mu1Var.x4 && chat != null) {
                            TLRPC.TL_forumTopic f = na7.q1(i7).g4.f(chat.id, mu1Var.d());
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
                                G = k96.G(i4, "messages", objArr);
                            } else {
                                Object[] objArr2 = new Object[i3];
                                objArr2[0] = chat.title;
                                G = k96.a0(null, null, 2131743773, objArr2);
                            }
                        } else if (chat != null) {
                            TLRPC.ChatFull chatFull = mu1Var.r8;
                            int i10 = this.V;
                            if (hc2.T(chat)) {
                                if (chatFull == null || (i2 = chatFull.participants_count) == 0) {
                                    G = chat.megagroup ? chatFull == null ? k96.M0(2131748587, null).toLowerCase() : chat.has_geo ? k96.M0(2131748450, null).toLowerCase() : hc2.t0(chat) ? k96.M0(2131748446, null).toLowerCase() : k96.M0(2131748449, null).toLowerCase() : hc2.t0(chat) ? k96.M0(2131752306, null).toLowerCase() : k96.M0(2131752317, null).toLowerCase();
                                } else if (chat.megagroup) {
                                    G = i10 > 1 ? tb4.y(k96.G(i2, "Members", new Object[0]), ", ", k96.G(Math.min(i10, chatFull.participants_count), "OnlineCount", new Object[0])) : k96.G(i2, "Members", new Object[0]);
                                } else {
                                    int[] iArr = new int[1];
                                    boolean A12 = gl.A1();
                                    int i11 = chatFull.participants_count;
                                    if (A12) {
                                        iArr[0] = i11;
                                        S = String.valueOf(i11);
                                    } else {
                                        S = k96.S(iArr, i11);
                                    }
                                    G = chat.megagroup ? k96.G(iArr[0], "Members", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S) : k96.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                                }
                            } else if (hc2.k0(chat)) {
                                G = k96.M0(2131742566, null);
                            } else if (hc2.l0(chat)) {
                                G = k96.M0(2131742572, null);
                            } else {
                                int i12 = chat.participants_count;
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                    i12 = chatParticipants.participants.size();
                                }
                                G = (i10 <= 1 || i12 == 0) ? k96.G(i12, "Members", new Object[0]) : tb4.y(k96.G(i12, "Members", new Object[0]), ", ", k96.G(i10, "OnlineCount", new Object[0]));
                            }
                        } else {
                            if (h != null) {
                                TLRPC.User V1 = na7.q1(i7).V1(Long.valueOf(h.id));
                                if (V1 != null) {
                                    h = V1;
                                }
                                if (!l7c.B(h)) {
                                    long j = h.id;
                                    if (j != 489000) {
                                        if (j == y6c.h(i7).e()) {
                                            charSequence = z5 ? gl.D2(k96.M0(2131745700, null), false) : k96.M0(2131752177, null);
                                        } else {
                                            long j2 = h.id;
                                            if (j2 == 333000 || j2 == 777000 || j2 == 42777) {
                                                z2 = false;
                                                charSequence = k96.M0(2131745369, null);
                                            } else if (na7.E2(h)) {
                                                charSequence = k96.M0(2131744084, null);
                                            } else if (h.bot) {
                                                int i13 = h.bot_active_users;
                                                charSequence = i13 != 0 ? k96.H(',', "BotUsers", i13) : l7c.e(h);
                                            } else {
                                                zArr[0] = false;
                                                charSequence = k96.d0(i7, h, zArr, this.f0 ? this.T : null);
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
                } else if (mu1Var.i4) {
                    charSequence = k96.M0(2131752207, null);
                    z3 = false;
                } else {
                    if (mu1Var.d() == 0) {
                        pub pubVar = mu1Var.getMessagesController().g4;
                        long j3 = -mu1Var.a();
                        int size = (!pubVar.e(j3) || (l = pubVar.l(j3)) == null) ? 0 : l.size();
                        G = size > 0 ? k96.H(',', "Chats", size) : k96.M0(2131752207, null);
                    } else {
                        TLRPC.TL_forumTopic f2 = na7.q1(i7).g4.f(chat.id, mu1Var.d());
                        int i14 = f2 != null ? f2.totalMessagesCount : 0;
                        G = i14 > 0 ? k96.G(i14, "messages", Integer.valueOf(i14)) : k96.a0(null, null, 2131743773, mm4.j(i7, chat, false));
                    }
                    charSequence = G;
                    z3 = false;
                }
            }
            this.b0 = z3 ? bkb.oa : bkb.A8;
            if (this.a0 != null) {
                this.a0 = charSequence;
            } else if (zr1Var != null) {
                zr1Var.k(charSequence);
                Integer num = this.c0;
                if (num == null) {
                    zkb.W(zr1Var, this.b0, wjbVar);
                    zr1Var.setTag(Integer.valueOf(this.b0));
                } else {
                    zr1Var.setTextColor(num.intValue());
                }
            } else {
                hnVar.c(charSequence, z, true);
                Integer num2 = this.c0;
                if (num2 == null) {
                    zkb.U(hnVar, this.b0, wjbVar);
                    hnVar.setTag(Integer.valueOf(this.b0));
                } else {
                    hnVar.setTextColor(num2.intValue());
                }
            }
            a aVar = this.A0;
            if (aVar != null) {
                aVar.k(z);
            }
        }
    }

    public boolean o() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mu1 mu1Var = this.H;
        if (mu1Var != null) {
            int i = this.K;
            kk7.f(i).b(this, kk7.S1);
            kk7.e().b(this, kk7.k4);
            if (mu1Var.g4 == 3) {
                kk7.f(i).b(this, kk7.h3);
            }
            this.W = ConnectionsManager.getInstance(i).getConnectionState();
            l();
        }
        tl tlVar = this.g0;
        if (tlVar != null) {
            tlVar.a();
        }
        tl tlVar2 = this.h0;
        if (tlVar2 != null) {
            tlVar2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mu1 mu1Var = this.H;
        if (mu1Var != null) {
            int i = this.K;
            kk7.f(i).n(this, kk7.S1);
            kk7.e().n(this, kk7.k4);
            if (mu1Var.g4 == 3) {
                kk7.f(i).n(this, kk7.h3);
            }
        }
        tl tlVar = this.g0;
        if (tlVar != null) {
            tlVar.b();
        }
        tl tlVar2 = this.h0;
        if (tlVar2 != null) {
            tlVar2.b();
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
        zr1 zr1Var = this.r;
        if (zr1Var != null) {
            sb.append(zr1Var.getText());
        } else {
            hn hnVar = this.s;
            if (hnVar != null) {
                sb.append(hnVar.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, k96.M0(2131747593, null)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        k72 k72Var = this.e;
        int measuredHeight = (((currentActionBarHeight - k72Var.getMeasuredHeight()) - 2) / 2) + (this.L ? gl.m : 0);
        int L = gl.L(this.m0 ? 23.66f : 24.0f) + measuredHeight;
        int i5 = this.M + 1;
        int i6 = measuredHeight + 1;
        k72Var.layout(i5, i6, k72Var.getMeasuredWidth() + i5, k72Var.getMeasuredHeight() + i6);
        int i7 = this.M;
        int visibility = k72Var.getVisibility();
        boolean z2 = this.m0;
        int L2 = i7 + gl.L(visibility == 0 ? z2 ? 49.66f : 55.0f : z2 ? 13.0f : 1.0f) + this.N;
        jia jiaVar = (jia) this.n.get();
        int visibility2 = getSubtitleTextView().getVisibility();
        zr1 zr1Var = this.h;
        if (visibility2 != 8) {
            zr1Var.layout(L2, (gl.L(1.66f) + measuredHeight) - zr1Var.getPaddingTop(), zr1Var.getMeasuredWidth() + L2, zr1Var.getPaddingBottom() + ((gl.L(1.66f) + (zr1Var.getTextHeight() + measuredHeight)) - zr1Var.getPaddingTop()));
            if (jiaVar != null) {
                jiaVar.layout(L2, gl.L(1.66f) + measuredHeight, jiaVar.getMeasuredWidth() + L2, gl.L(1.66f) + jiaVar.getTextHeight() + measuredHeight);
            }
        } else {
            zr1Var.layout(L2, (gl.L(11.0f) + measuredHeight) - zr1Var.getPaddingTop(), zr1Var.getMeasuredWidth() + L2, zr1Var.getPaddingBottom() + ((gl.L(11.0f) + (zr1Var.getTextHeight() + measuredHeight)) - zr1Var.getPaddingTop()));
            if (jiaVar != null) {
                jiaVar.layout(L2, gl.L(10.0f) + measuredHeight, jiaVar.getMeasuredWidth() + L2, gl.L(10.0f) + jiaVar.getTextHeight() + measuredHeight);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.layout(gl.L(29.0f) + this.M, gl.L(27.33f) + measuredHeight, imageView.getMeasuredWidth() + gl.L(29.0f) + this.M, imageView.getMeasuredHeight() + gl.L(27.33f) + measuredHeight);
        }
        ImageView imageView2 = this.x;
        if (imageView2 != null) {
            imageView2.layout(gl.L(19.333f) + this.M, measuredHeight - gl.L(8.0f), imageView2.getMeasuredWidth() + gl.L(19.333f) + this.M, imageView2.getMeasuredHeight() + (measuredHeight - gl.L(8.0f)));
        }
        ImageView imageView3 = this.E;
        if (imageView3 != null) {
            imageView3.layout(gl.L(28.0f) + this.M, gl.L(24.0f) + measuredHeight, imageView3.getMeasuredWidth() + gl.L(28.0f) + this.M, imageView3.getMeasuredHeight() + gl.L(24.0f) + measuredHeight);
        }
        ImageView imageView4 = this.F;
        if (imageView4 != null) {
            imageView4.layout(gl.L(28.0f) + this.M, gl.L(24.0f) + measuredHeight, imageView4.getMeasuredWidth() + gl.L(28.0f) + this.M, imageView4.getMeasuredHeight() + gl.L(24.0f) + measuredHeight);
        }
        zr1 zr1Var2 = this.r;
        if (zr1Var2 != null) {
            zr1Var2.layout(L2, L, zr1Var2.getMeasuredWidth() + L2, zr1Var2.getTextHeight() + L);
        } else {
            hn hnVar = this.s;
            if (hnVar != null) {
                hnVar.layout(L2, L, hnVar.getMeasuredWidth() + L2, hnVar.getTextHeight() + L);
            }
        }
        jia jiaVar2 = (jia) this.w.get();
        if (jiaVar2 != null) {
            jiaVar2.layout(L2, L, jiaVar2.getMeasuredWidth() + L2, jiaVar2.getTextHeight() + L);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        k72 k72Var = this.e;
        int L = size - gl.L((k72Var.getVisibility() == 0 ? 54 : 0) + 16);
        float f = this.d;
        k72Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(f) - 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(f) - 2, TLObject.FLAG_30));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gl.L(32.0f), TLObject.FLAG_31);
        zr1 zr1Var = this.h;
        zr1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        hn hnVar = this.s;
        zr1 zr1Var2 = this.r;
        if (zr1Var2 != null) {
            zr1Var2.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_31));
        } else if (hnVar != null) {
            hnVar.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_31));
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(gl.L(14.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(14.0f), TLObject.FLAG_30));
        }
        ImageView imageView2 = this.x;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(gl.L(34.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(34.0f), TLObject.FLAG_30));
        }
        ImageView imageView3 = this.E;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_30));
        }
        ImageView imageView4 = this.F;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
        int i3 = this.P;
        AtomicReference atomicReference = this.n;
        if (i3 != -1 && i3 != size && i3 > size) {
            this.Q = i3;
            View view = (jia) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            jia jiaVar = new jia(getContext());
            atomicReference.set(jiaVar);
            int i4 = bkb.z8;
            wjb wjbVar = this.e0;
            zkb.W(jiaVar, i4, wjbVar);
            jiaVar.setTextSizePx(gl.L(this.m0 ? 17.5f : 18.0f));
            jiaVar.setGravity(3);
            jiaVar.setTypeface(gl.o());
            jiaVar.setLeftDrawableTopPadding(-gl.L(1.3f));
            jiaVar.i(zr1Var.getRightDrawable());
            jiaVar.j(zr1Var.getRightDrawable2());
            jiaVar.setRightDrawableOutside(zr1Var.getRightDrawableOutside());
            jiaVar.setLeftDrawable(zr1Var.getLeftDrawable());
            jiaVar.l(zr1Var.getText(), false);
            ViewPropertyAnimator duration = jiaVar.animate().alpha(0.0f).setDuration(350L);
            s33 s33Var = s33.h;
            duration.setInterpolator(s33Var).withEndAction(new g72(this, (byte) 0)).start();
            addView(jiaVar);
            AtomicReference atomicReference2 = this.w;
            View view2 = (jia) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            jia jiaVar2 = new jia(getContext());
            atomicReference2.set(jiaVar2);
            int i5 = bkb.A8;
            zkb.W(jiaVar2, i5, wjbVar);
            jiaVar2.setTag(Integer.valueOf(i5));
            jiaVar2.setTextSizePx(gl.L(this.m0 ? 13.5f : 14.0f));
            jiaVar2.setGravity(3);
            if (zr1Var2 != null) {
                jiaVar2.l(zr1Var2.getText(), false);
            } else if (hnVar != null) {
                jiaVar2.l(hnVar.getText(), false);
            }
            jiaVar2.animate().alpha(0.0f).setDuration(350L).setInterpolator(s33Var).withEndAction(new g72(this, (byte) 1)).start();
            addView(jiaVar2);
            setClipChildren(false);
        }
        jia jiaVar3 = (jia) atomicReference.get();
        if (jiaVar3 != null) {
            jiaVar3.measure(ug8.f((k72Var.getVisibility() == 0 ? 54 : 0) + 16, this.Q, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), TLObject.FLAG_31));
        }
        this.P = size;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        n41 n41Var = this.i0;
        g72 g72Var = this.j0;
        if (action == 0 && a()) {
            this.k0 = true;
            n41Var.c(true);
            gl.r(g72Var);
            gl.d3(g72Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.k0) {
            n41Var.c(false);
            this.k0 = false;
            if (isClickable() && motionEvent.getAction() == 1) {
                e(false, false);
            }
            gl.r(g72Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
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

    public void setActionBar(a aVar) {
        this.A0 = aVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        pb0 pb0Var = this.J;
        pb0Var.p(chat);
        k72 k72Var = this.e;
        if (k72Var != null) {
            k72Var.f(chat, pb0Var);
            k72Var.setRoundRadius(gl.L(hc2.c0(chat) ? (chat == null || !na7.q1(y6c.t0).M1().J(-chat.id)) ? 16.0f : 11.0f : 21.0f));
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
            zr1 zr1Var = this.r;
            if (zr1Var != null) {
                zr1Var.k(charSequence);
            } else {
                hn hnVar = this.s;
                if (hnVar != null) {
                    hnVar.setText(charSequence);
                }
            }
        } else {
            this.a0 = charSequence;
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.k(true);
        }
    }

    public void setTitle(CharSequence charSequence) {
        h(charSequence, false, false, false, false, null, false);
    }

    public void setUserAvatar(TLRPC.User user) {
        k(user, false);
    }

    @Override // tjb
    public final void updateColors() {
        bya byaVar = this.O;
        wjb wjbVar = this.e0;
        if (byaVar != null) {
            byaVar.b(bkb.v0(bkb.oa, wjbVar));
        }
        Drawable drawable = this.s0;
        if (drawable != null) {
            int v0 = bkb.v0(bkb.pi, wjbVar);
            PorterDuffColorFilter porterDuffColorFilter = this.w0;
            if (porterDuffColorFilter == null || v0 != this.y0) {
                this.y0 = v0;
                porterDuffColorFilter = new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY);
                this.w0 = porterDuffColorFilter;
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
        tl tlVar = this.h0;
        if (tlVar != null) {
            tlVar.k(Integer.valueOf(bkb.v0(bkb.pi, wjbVar)));
        }
        tl tlVar2 = this.g0;
        if (tlVar2 != null) {
            tlVar2.k(Integer.valueOf(bkb.v0(bkb.pi, wjbVar)));
        }
        Drawable drawable2 = this.t0;
        if (drawable2 != null) {
            int v02 = bkb.v0(bkb.pi, wjbVar);
            PorterDuffColorFilter porterDuffColorFilter2 = this.w0;
            if (porterDuffColorFilter2 == null || v02 != this.y0) {
                this.y0 = v02;
                porterDuffColorFilter2 = new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY);
                this.w0 = porterDuffColorFilter2;
            }
            drawable2.setColorFilter(porterDuffColorFilter2);
        }
        if (this.u0 != null) {
            int v03 = bkb.v0(bkb.qi, wjbVar);
            PorterDuffColorFilter porterDuffColorFilter3 = this.x0;
            if (porterDuffColorFilter3 == null || v03 != this.z0) {
                this.z0 = v03;
                porterDuffColorFilter3 = new PorterDuffColorFilter(v03, PorterDuff.Mode.MULTIPLY);
                this.x0 = porterDuffColorFilter3;
            }
            this.u0.setColorFilter(porterDuffColorFilter3);
        }
        zr1 zr1Var = this.h;
        if (zr1Var != null) {
            try {
                if (zr1Var.getRightDrawable2() instanceof gq9) {
                    ((gq9) zr1Var.getRightDrawable2()).b(bkb.v0(bkb.A8, wjbVar));
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        invalidate();
    }

    public void f() {
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // x74
    public final void F(float f, int i) {
    }
}
