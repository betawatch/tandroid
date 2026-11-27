// default package

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class g49 extends FrameLayout {
    public int E;
    public boolean F;
    public yza G;
    public final d49 H;
    public boolean I;
    public float J;
    public ValueAnimator K;
    public final d49 L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public final /* synthetic */ i49 Q;
    public final f49 a;
    public final f49 b;
    public final f49 c;
    public final ImageReceiver d;
    public w49 e;
    public cl8 f;
    public float h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g49(i49 i49Var, Context context) {
        super(context);
        this.Q = i49Var;
        this.d = new ImageReceiver(null);
        this.h = 1.0f;
        byte b = 1;
        this.y = true;
        byte b2 = 0;
        this.H = new d49(this, b2);
        this.J = 1.0f;
        this.L = new d49(this, b);
        this.P = true;
        f49 f49Var = new f49(this, context, b2);
        this.a = f49Var;
        f49 f49Var2 = new f49(this, context, b);
        this.b = f49Var2;
        f49Var.getImageReceiver().M(0);
        f49Var.getImageReceiver().v0 = false;
        f49 f49Var3 = new f49(this, context, (byte) 2);
        this.c = f49Var3;
        addView(f49Var, tre.e(34, 34, 17));
        addView(f49Var3, tre.e(34, 34, 17));
        addView(f49Var2, tre.e(34, 34, 17));
        if (i49Var.N0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        f49Var.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        f49Var2.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        f49Var2.a.M(0);
        ImageReceiver imageReceiver = f49Var2.a;
        imageReceiver.u0 = false;
        imageReceiver.v0 = false;
        f49Var3.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public final void a() {
        f49 f49Var = this.b;
        wl wlVar = f49Var.e;
        ImageReceiver imageReceiver = wlVar != null ? wlVar.k : f49Var.a;
        if (imageReceiver == null || imageReceiver.y() == null) {
            return;
        }
        i49 i49Var = this.Q;
        if (i49Var.y0 != null || this.O || !i49Var.H0) {
            imageReceiver.y().start();
        } else if (imageReceiver.y().b0 <= 2) {
            imageReceiver.y().stop();
        }
    }

    public final void b(int i) {
        if (!this.Q.k0) {
            c();
            this.n = true;
            if (this.r) {
                return;
            }
            this.b.setVisibility(0);
            this.b.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
            this.b.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
            return;
        }
        hl.r(this.H);
        if (!this.r) {
            if (this.n) {
                return;
            }
            this.J = 0.0f;
            this.b.setScaleX(0.0f);
            this.b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new b49(this, (byte) 1));
            this.K.setDuration(150L);
            this.K.setInterpolator(k43.h);
            this.K.setStartDelay((long) (i * this.Q.c));
            this.K.start();
            this.n = true;
            return;
        }
        if (this.a.getImageReceiver().y() == null || this.a.getImageReceiver().y().t() || this.n) {
            if (this.a.getImageReceiver().y() != null && this.n && !this.a.getImageReceiver().y().l0 && !this.a.getImageReceiver().y().t()) {
                this.a.getImageReceiver().y().I(this.a.getImageReceiver().y().e[0] - 1, false, false);
            }
            this.b.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
            this.b.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
            return;
        }
        this.n = true;
        if (i == 0) {
            this.F = false;
            this.a.getImageReceiver().y().stop();
            this.a.getImageReceiver().y().I(0, false, false);
            this.H.run();
            return;
        }
        this.F = true;
        this.a.getImageReceiver().y().stop();
        this.a.getImageReceiver().y().I(0, false, false);
        hl.d3(this.H, i);
    }

    public final void c() {
        boolean z = this.r;
        i49 i49Var = this.Q;
        f49 f49Var = this.b;
        if (z) {
            hl.r(this.H);
            f49 f49Var2 = this.a;
            if (f49Var2.getImageReceiver().y() != null && !f49Var2.getImageReceiver().y().t()) {
                f49Var2.getImageReceiver().y().stop();
                if (i49Var.k0) {
                    f49Var2.getImageReceiver().y().I(0, false, true);
                } else {
                    f49Var2.getImageReceiver().y().I(f49Var2.getImageReceiver().y().e[0] - 1, false, true);
                }
            }
            f49Var.setVisibility(4);
            f49Var2.setVisibility(0);
            this.w = false;
            f49Var.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
            f49Var.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
        } else {
            f49Var.animate().cancel();
            if (i49Var.O0) {
                f49Var.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
                f49Var.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
            } else {
                f49Var.setScaleY(0.0f);
                f49Var.setScaleX(0.0f);
            }
        }
        this.n = false;
    }

    public final void d(int i, w49 w49Var) {
        i49 i49Var = this.Q;
        vnb vnbVar = i49Var.l0;
        byte b = i49Var.N0;
        f(w49Var, false);
        w49 w49Var2 = this.e;
        if (w49Var2 != null && w49Var2.equals(w49Var)) {
            this.E = i;
            e(w49Var);
            return;
        }
        boolean p = yac.h(i49Var.K).p();
        boolean z = (b == 3 && !p) || (b == 5 && w49Var.d && !p);
        this.I = z;
        f49 f49Var = this.b;
        if (z && this.f == null) {
            cl8 cl8Var = new cl8(1, null, getContext());
            this.f = cl8Var;
            cl8Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.f.setImageReceiver(f49Var.getImageReceiver());
            addView(this.f, tre.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        cl8 cl8Var2 = this.f;
        if (cl8Var2 != null) {
            cl8Var2.setVisibility(this.I ? 0 : 8);
        }
        c();
        this.e = w49Var;
        this.r = w49Var.a || (w49Var.f != null && ((i49Var.n() || i49Var.H0) && i86.e(8200)));
        if (b == 4 || this.e.b) {
            this.r = false;
        }
        w49 w49Var3 = this.e;
        boolean z2 = w49Var3.a;
        f49 f49Var2 = this.c;
        f49 f49Var3 = this.a;
        if (z2 || w49Var3.f != null) {
            e(w49Var);
            f49Var2.setAnimatedEmojiDrawable(null);
            if (f49Var3.getImageReceiver().y() != null) {
                f49Var3.getImageReceiver().y().I(0, false, false);
            }
            cl8 cl8Var3 = this.f;
            if (cl8Var3 != null) {
                cl8Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            f49Var2.getImageReceiver().f();
            f49Var.getImageReceiver().f();
            wl wlVar = new wl(4, i49Var.K, this.e.g);
            wl wlVar2 = new wl(3, i49Var.K, this.e.g);
            if (b == 1 || b == 2 || b == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                wlVar.setColorFilter(new PorterDuffColorFilter(-1, mode));
                wlVar2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i2 = aob.v6;
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                yob.x(this, wlVar, i2, vnbVar, mode2);
                yob.x(this, wlVar2, i2, vnbVar, mode2);
            }
            f49Var2.setAnimatedEmojiDrawable(wlVar);
            f49Var.setAnimatedEmojiDrawable(wlVar2);
            cl8 cl8Var4 = this.f;
            if (cl8Var4 != null) {
                cl8Var4.setAnimatedEmojiDrawable(wlVar2);
            }
        }
        setFocusable(true);
        boolean z3 = this.r;
        this.s = z3;
        if (z3) {
            this.w = false;
            f49Var3.setVisibility(0);
            f49Var.setVisibility(8);
        } else {
            f49Var3.setVisibility(8);
            f49Var.setVisibility(0);
            this.w = true;
        }
        ViewGroup.LayoutParams layoutParams = f49Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = f49Var.getLayoutParams();
        int L = hl.L(34.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        ViewGroup.LayoutParams layoutParams3 = f49Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = f49Var3.getLayoutParams();
        int L2 = hl.L(34.0f);
        layoutParams4.height = L2;
        layoutParams3.width = L2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        nl nlVar;
        if (this.x && this.y) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - hl.L(1.0f);
            w49 w49Var = this.e;
            i49 i49Var = this.Q;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (w49Var == null || !w49Var.a) ? i49Var.I0 : i49Var.J0);
        }
        wl wlVar = this.b.e;
        if (wlVar != null && (nlVar = wlVar.k) != null) {
            if (this.E == 0) {
                nlVar.r0(hl.L(6.0f), 0, 0, hl.L(6.0f));
            } else {
                nlVar.q0(this.x ? hl.L(6.0f) : 0);
            }
        }
        w49 w49Var2 = this.e;
        if (w49Var2 != null && w49Var2.a && this.G != null && i86.e(8200) && i86.e(131072)) {
            RectF rectF = hl.P;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            b29 y = this.a.getImageReceiver().y();
            this.G.j = (int) (r2.b.size() * ((y == null || (i = y.b0) <= 30) ? 0.0f : Utilities.l((i - 30) / 30.0f)));
            this.G.g(rectF);
            this.G.d();
            this.G.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    public final void e(w49 w49Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        f49 f49Var;
        ggb ggbVar;
        ?? r14;
        TLRPC.Document document;
        i49 i49Var = this.Q;
        byte b = i49Var.N0;
        f49 f49Var2 = this.a;
        f49 f49Var3 = this.b;
        if (w49Var != null && w49Var.a) {
            f49Var2.getImageReceiver().g0(new b29(R.raw.star_reaction, hl.L(30.0f), hl.L(30.0f)));
            f49Var3.getImageReceiver().g0(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.G == null) {
                this.G = new yza(1, xea.o() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (b == 4 && w49Var != null && w49Var.f != null) {
            f49Var2.getImageReceiver().g0(pv3.g(w49Var.f));
            f49Var3.getImageReceiver().g0(pv3.g(w49Var.f));
            return;
        }
        w49 w49Var2 = this.e;
        if (w49Var2.b) {
            uc7 s1 = uc7.s1(i49Var.K);
            long j = this.e.g;
            if (s1.X4 != null) {
                for (int i = 0; i < s1.X4.documents.size(); i++) {
                    if (s1.X4.documents.get(i).id == j) {
                        document = s1.X4.documents.get(i);
                        break;
                    }
                }
            }
            document = null;
            f49Var3.getImageReceiver().Z(jn5.b(document), "60_60_firstframe", null, null, this.r ? null : lp3.f(document, aob.m6, 0.2f, null), 0L, "tgs", this.e, 0);
            return;
        }
        if (w49Var2.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) ls6.d0(i49Var.K).r.get(this.e.f);
            if (tL_availableReaction2 != null) {
                ggb f = lp3.f(tL_availableReaction2.activate_animation, aob.m6, 0.2f, null);
                if (!i86.e(8200) || b == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    f49Var = f49Var2;
                    boolean z = false;
                    ggbVar = f;
                    if (xea.o() <= 0 || b == 4) {
                        f49Var3.getImageReceiver().Z(jn5.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : ggbVar, 0L, "tgs", this.e, 0);
                        r14 = z;
                    } else {
                        f49Var.getImageReceiver().Z(jn5.b(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, ggbVar, 0L, "tgs", w49Var, 0);
                        f49Var3.getImageReceiver().Z(jn5.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : ggbVar, 0L, "tgs", this.e, 0);
                        r14 = z;
                    }
                } else {
                    ggbVar = f;
                    f49Var = f49Var2;
                    r14 = 0;
                    tL_availableReaction = tL_availableReaction2;
                    f49Var2.getImageReceiver().Z(jn5.b(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, ggbVar, 0L, "tgs", w49Var, 0);
                    f49Var3.getImageReceiver().Z(jn5.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.r ? null : ggbVar, 0L, "tgs", this.e, 0);
                }
                if (f49Var.getImageReceiver().y() != null) {
                    f49Var.getImageReceiver().y().I(r14, r14, true);
                }
                this.c.getImageReceiver().Z(jn5.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, ggbVar, 0L, "tgs", w49Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.v0 = r14;
                ls6.d0(i49Var.K);
                ls6.n1(imageReceiver, jn5.b(tL_availableReaction.around_animation), s49.a());
            }
            cl8 cl8Var = this.f;
            if (cl8Var != null) {
                cl8Var.setImageReceiver(f49Var3.getImageReceiver());
            }
        }
    }

    public final void f(w49 w49Var, boolean z) {
        boolean z2 = this.x;
        boolean contains = this.Q.e0.contains(w49Var);
        this.x = contains;
        if (contains != z2) {
            f49 f49Var = this.b;
            f49 f49Var2 = this.a;
            if (z) {
                ViewPropertyAnimator duration = f49Var.animate().scaleX(this.J * (this.x ? 0.76f : 1.0f)).scaleY(this.J * (this.x ? 0.76f : 1.0f)).setDuration(240L);
                k43 k43Var = k43.h;
                duration.setInterpolator(k43Var).start();
                f49Var2.animate().scaleX(this.J * (this.x ? 0.76f : 1.0f)).scaleY(this.J * (this.x ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(k43Var).start();
            } else {
                f49Var.setScaleX(this.J * (contains ? 0.76f : 1.0f));
                f49Var.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
                f49Var2.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
                f49Var2.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
        this.d.I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.K();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        w49 w49Var = this.e;
        if (w49Var != null) {
            String str = w49Var.f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
            } else {
                accessibilityNodeInfo.setText(ob6.M0(2131754886, null));
                accessibilityNodeInfo.setEnabled(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        byte b;
        h49 h49Var;
        if (this.P) {
            i49 i49Var = this.Q;
            if (i49Var.R == null) {
                int action = motionEvent.getAction();
                d49 d49Var = this.L;
                if (action == 0) {
                    this.O = true;
                    this.M = motionEvent.getX();
                    this.N = motionEvent.getY();
                    if (this.h == 1.0f && !this.I && (b = i49Var.N0) != 3 && b != 4 && b != 5 && ((h49Var = i49Var.h0) == null || h49Var.j())) {
                        hl.d3(d49Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                byte b2 = 2;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.M - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.N - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.O && ((i49Var.m0 == null || i49Var.o0 > 0.8f) && i49Var.h0 != null)) {
                    i49Var.s0 = true;
                    if (System.currentTimeMillis() - i49Var.t0 > 300) {
                        i49Var.t0 = System.currentTimeMillis();
                        i49Var.h0.e(this, this.e, i49Var.o0 > 0.8f, false);
                    }
                }
                if (!i49Var.s0 && i49Var.m0 != null) {
                    i49Var.p0 = 0.0f;
                    float f = i49Var.o0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    i49Var.R = ofFloat;
                    ofFloat.addUpdateListener(new w39(i49Var, f));
                    i49Var.R.addListener(new rw7(i49Var, b2));
                    i49Var.R.setDuration(150L);
                    i49Var.R.setInterpolator(k43.f);
                    i49Var.R.start();
                }
                hl.r(d49Var);
                this.O = false;
                return true;
            }
        }
        return false;
    }
}
