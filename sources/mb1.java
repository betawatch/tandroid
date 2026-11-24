// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.z;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class mb1 extends ib1 {
    public boolean S0;
    public final ImageView T0;
    public boolean U0;
    public final ImageView V0;
    public final hb1 W0;
    public cs5 X0;
    public final gc Y0;
    public final ImageView Z0;
    public je5 a1;
    public int b1;
    public final int[] c1;
    public final je5 d1;
    public final Runnable e1;
    public final RectF f1;
    public final Drawable g1;
    public final gn h1;
    public final n41 i1;
    public il0 j1;
    public final lm k1;
    public final lm l1;
    public final lm m1;
    public boolean n1;
    public boolean o1;
    public final jb1 p1;
    public boolean q1;
    public p8c r1;
    public boolean s1;

    public mb1(Context context, z zVar, cja cjaVar, FrameLayout frameLayout, wjb wjbVar, sl0 sl0Var, Runnable runnable) {
        super(context, zVar, cjaVar, frameLayout, wjbVar, sl0Var);
        float f;
        float f2;
        this.b1 = 0;
        byte b = 3;
        this.c1 = new int[]{ConnectionsManager.DEFAULT_DATACENTER_ID, 3, 10, 30, 0};
        this.f1 = new RectF();
        gn gnVar = new gn(false, false, false);
        this.h1 = gnVar;
        this.i1 = new n41(this);
        s33 s33Var = s33.h;
        this.k1 = new lm(this, 0L, 350L, s33Var);
        this.l1 = new lm(this, 0L, 350L, s33Var);
        this.m1 = new lm(this, 0L, 350L, s33Var);
        this.p1 = new jb1(this, (byte) 0);
        this.e1 = runnable;
        gnVar.w(gl.L(14.0f));
        gnVar.N = gl.q.x;
        gnVar.u(-1);
        boolean z = this instanceof z78;
        if (z) {
            gnVar.t(k96.M0(2131748133, null), true, true);
            this.g1 = context.getResources().getDrawable(R.drawable.menu_link_below);
        } else {
            gnVar.t(k96.M0(2131748132, null), true, true);
            this.g1 = context.getResources().getDrawable(R.drawable.menu_link_above);
        }
        ImageView imageView = new ImageView(context);
        this.T0 = imageView;
        imageView.setImageResource(R.drawable.filled_add_photo);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(bkb.f0(1090519039, 1, gl.L(18.0f)));
        C(false);
        int i = (z ? 48 : 80) | 3;
        float f3 = z ? 6.0f : 0.0f;
        if (z) {
            f2 = 0.0f;
            f = 0.0f;
        } else {
            f = 6.0f;
            f2 = 0.0f;
        }
        float f4 = f2;
        addView(imageView, nme.d(44, 44.0f, i, 14.0f, f3, 0.0f, f));
        ImageView imageView2 = new ImageView(context);
        this.V0 = imageView2;
        hb1 hb1Var = new hb1(5);
        this.W0 = hb1Var;
        imageView2.setImageDrawable(hb1Var);
        imageView2.setBackground(bkb.f0(1090519039, 1, gl.L(18.0f)));
        imageView2.setScaleType(scaleType);
        E(false, false);
        addView(imageView2, nme.d(44, 44.0f, (z ? 48 : 80) | 5, 0.0f, z ? 6.0f : f4, 10.0f, z ? f4 : 6.0f));
        je5 je5Var = new je5(context, z ? 1 : 3);
        this.d1 = je5Var;
        je5Var.q(12.0f);
        je5Var.setPadding(gl.L(12.0f), gl.L(z ? 8.0f : f4), gl.L(12.0f), gl.L(z ? f4 : 8.0f));
        je5Var.n(1.0f, -21.0f);
        je5Var.p(true);
        addView(je5Var, nme.e(-1, 80, (z ? 48 : 80) | 5));
        ImageView imageView3 = new ImageView(context);
        this.Z0 = imageView3;
        gc gcVar = new gc(context);
        this.Y0 = gcVar;
        imageView3.setImageDrawable(gcVar);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(bkb.f0(1090519039, 1, gl.L(16.0f)));
        addView(imageView3, nme.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(k96.M0(2131755006, null));
        ote.a(imageView3);
        this.f.getEditText().addTextChangedListener(new b7(this, b));
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new x91(this, (byte) 2));
        imageView2.setOnClickListener(new kb1((Object) this, (Object) zVar, (byte) 0));
    }

    public abstract void A();

    public abstract void B();

    public final void C(boolean z) {
        this.S0 = z;
        ImageView imageView = this.T0;
        imageView.animate().cancel();
        int i = 0;
        imageView.setVisibility(z ? 0 : 8);
        imageView.setAlpha(z ? 1.0f : 0.0f);
        imageView.setTranslationX(z ? 0.0f : gl.L(-8.0f));
        cb1 cb1Var = this.f;
        cb1Var.getEditText().setTranslationX(gl.U1(this.o0, getEditTextLeft() + gl.L(-26.0f), gl.L(2.0f)));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cb1Var.getLayoutParams();
        if (this.S0 && this.U0) {
            i = 33;
        }
        marginLayoutParams.rightMargin = gl.L(32 + i);
        cb1Var.setLayoutParams(marginLayoutParams);
    }

    public final void D(boolean z, boolean z2) {
        if (this.n1 == z && z2) {
            return;
        }
        this.n1 = z;
        if (!z2) {
            this.l1.f(z, true);
        }
        invalidate();
    }

    public final void E(boolean z, boolean z2) {
        this.U0 = z;
        ImageView imageView = this.V0;
        imageView.animate().cancel();
        int i = 0;
        if (z2) {
            imageView.setVisibility(0);
            imageView.animate().alpha(z ? 1.0f : 0.0f).translationX(z ? 0.0f : gl.L(8.0f)).withEndAction(new lb1(this, z, (byte) 1)).start();
        } else {
            imageView.setVisibility(z ? 0 : 8);
            imageView.setAlpha(z ? 1.0f : 0.0f);
            imageView.setTranslationX(z ? 0.0f : gl.L(8.0f));
        }
        cb1 cb1Var = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cb1Var.getLayoutParams();
        if (this.S0 && this.U0) {
            i = 33;
        }
        marginLayoutParams.rightMargin = gl.L(32 + i);
        cb1Var.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z) {
        if (this.s1 != z) {
            if (z) {
                na7.q1(this.V).O1().b();
            }
            this.s1 = z;
            ImageView imageView = this.Z0;
            imageView.setVisibility(0);
            imageView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.6f).scaleY(z ? 1.0f : 0.6f).setInterpolator(s33.h).setDuration(420L).withEndAction(new lb1(this, z, (byte) 0)).start();
            if (!z) {
                je5 je5Var = this.a1;
                if (je5Var != null) {
                    je5Var.f(true);
                    this.a1 = null;
                    return;
                }
                return;
            }
            gc gcVar = this.Y0;
            Objects.requireNonNull(gcVar);
            imageView.postDelayed(new fc(gcVar, (byte) 1), 220L);
            je5 je5Var2 = this.a1;
            if (je5Var2 != null) {
                je5Var2.f(true);
                this.a1 = null;
            }
            if (na7.c1().getInt("aihintshown", 0) < 3) {
                je5 je5Var3 = new je5(getContext(), 3);
                this.a1 = je5Var3;
                je5Var3.p(true);
                this.a1.t(k96.M0(2131754992, null));
                this.a1.o(1.0f, ((-imageView.getWidth()) / 2.0f) + gl.L(4.0f));
                addView(this.a1, nme.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                je5 je5Var4 = this.a1;
                je5Var4.r0 = new q21(this, je5Var3, (byte) 14);
                je5Var4.d = 4000L;
                je5Var4.v();
                na7.c1().edit().putInt("aihintshown", na7.c1().getInt("aihintshown", 0) + 1).apply();
            }
        }
    }

    public abstract boolean G();

    public final void H(wjb wjbVar) {
        this.a = wjbVar;
        this.h.setColorFilter(new PorterDuffColorFilter(bkb.w0(null, bkb.T5, false), PorterDuff.Mode.SRC_IN));
        int L = gl.L(16.0f);
        int i = bkb.pg;
        ShapeDrawable K = bkb.K(L, bkb.v0(i, wjbVar));
        fm2 fm2Var = this.n;
        fm2Var.a = K;
        fm2Var.invalidateSelf();
        this.W0.e(-1, bkb.v0(i, wjbVar), -1);
    }

    @Override // ib1
    public final int a() {
        return 0;
    }

    @Override // ib1
    public final void c(boolean z) {
        int i = (z || !this.U0) ? 8 : 0;
        ImageView imageView = this.V0;
        imageView.setVisibility(i);
        int i2 = (z || !this.S0) ? 8 : 0;
        ImageView imageView2 = this.T0;
        imageView2.setVisibility(i2);
        if (z) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
    }

    @Override // ib1
    public final void d(boolean z) {
        if (!z) {
            this.V0.setVisibility(this.U0 ? 0 : 8);
            this.T0.setVisibility(this.S0 ? 0 : 8);
        }
        je5 je5Var = this.d1;
        if (je5Var != null) {
            je5Var.f(true);
        }
    }

    @Override // ib1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        super.dispatchDraw(canvas);
        RectF rectF = this.A0;
        ImageView imageView = this.Z0;
        if (imageView != null) {
            imageView.setTranslationX(-gl.L((1.0f - this.o0) * 4.0f));
            if (this instanceof z78) {
                f2 = rectF.bottom - gl.L(44.0f);
                i = 1;
            } else {
                f2 = rectF.top;
                i = -1;
            }
            imageView.setTranslationY((Utilities.l((-this.k1.e(false, this.f.getEditText().getLineCount())) + 4.0f) * gl.L(3.0f) * i) + f2);
        }
        float f3 = this.l1.f(this.n1, !G());
        float d = this.m1.d(this.o1);
        if (f3 > 0.0f) {
            float a = this.i1.a(0.03f);
            int L = gl.L((1.0f - this.o0) * 4.0f);
            boolean z = this instanceof z78;
            gn gnVar = this.h1;
            RectF rectF2 = this.f1;
            if (z) {
                f = 1.0f;
                rectF2.set(gl.L(7.0f) + L, rectF.bottom + gl.L(10.0f), de9.v(gnVar.c(), gl.L(11.0f), d, gl.L(44.0f) + L), rectF.bottom + gl.L(42.0f));
            } else {
                f = 1.0f;
                rectF2.set(gl.L(7.0f) + L, rectF.top - gl.L(42.0f), de9.v(gnVar.c(), gl.L(11.0f), d, gl.L(44.0f) + L), rectF.top - gl.L(10.0f));
            }
            if (f3 < f) {
                canvas.saveLayerAlpha(rectF2, (int) (f3 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a, a, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            kl0 kl0Var = this.h0;
            if (kl0Var != null) {
                if (this.j1 == null) {
                    il0 c = kl0Var.c(this, null, false);
                    c.p(nod.i(this.a));
                    c.q(gl.L(5.0f));
                    c.r(gl.L(16.0f));
                    this.j1 = c;
                }
                Rect rect = gl.Q;
                rectF2.round(rect);
                rect.inset(-gl.L(5.0f), -gl.L(5.0f));
                this.j1.setBounds(rect);
                this.j1.draw(canvas);
            }
            int L2 = (int) (rectF2.left + gl.L(9.0f));
            int centerY = (int) (rectF2.centerY() - gl.L(10.0f));
            int L3 = (int) (rectF2.left + gl.L(29.0f));
            int centerY2 = (int) (rectF2.centerY() + gl.L(10.0f));
            Drawable drawable = this.g1;
            drawable.setBounds(L2, centerY, L3, centerY2);
            drawable.draw(canvas);
            gnVar.o(rectF2.left + gl.L(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            gnVar.C = (int) (d * 255.0f);
            gnVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override // ib1, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        RectF rectF = this.f1;
        lm lmVar = this.l1;
        n41 n41Var = this.i1;
        if (action == 0) {
            n41Var.c(lmVar.c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2) {
            if (n41Var.i && (lmVar.c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                n41Var.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && n41Var.i) {
            if (motionEvent.getAction() == 1) {
                A();
                this.h1.t(k96.M0(this instanceof z78 ? 2131748133 : 2131748132, null), true, true);
            }
            n41Var.c(false);
            return true;
        }
        return n41Var.i || super.dispatchTouchEvent(motionEvent);
    }

    @Override // ib1
    public final boolean f(View view) {
        return view != this.d1;
    }

    @Override // ib1
    public int getCaptionDefaultLimit() {
        return na7.q1(this.V).k4.g1.f();
    }

    @Override // ib1
    public int getCaptionLimit() {
        return y6c.h(this.V).p() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    @Override // ib1
    public int getCaptionPremiumLimit() {
        return na7.q1(this.V).k4.h1.f();
    }

    @Override // ib1
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override // ib1
    public int getEditTextLeft() {
        if (this.S0) {
            return gl.L(31.0f);
        }
        return 0;
    }

    @Override // ib1
    public int getEditTextStyle() {
        return 3;
    }

    @Override // ib1
    public final void r(int i) {
        this.d1.setTranslationY(((-Math.min(gl.L(34.0f), i)) - gl.L(10.0f)) * (this instanceof z78 ? -1.0f : 1.0f));
    }

    @Override // ib1
    public final void s(int i, int i2) {
        CharSequence text = getText();
        F((i2 <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) ? false : true);
        if (this.s1) {
            if ((i < 3) != (i2 < 3)) {
                invalidate();
            }
        }
    }

    public void setIsVideo(boolean z) {
        this.q1 = z;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.T0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(p8c p8cVar) {
        this.r1 = p8cVar;
    }

    @Override // ib1
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i) {
        this.b1 = i;
        this.W0.d(i == Integer.MAX_VALUE ? 1 : Math.max(1, i), this.b1 > 0, true);
        je5 je5Var = this.d1;
        if (je5Var != null) {
            je5Var.f(true);
        }
    }

    @Override // ib1
    public final void t() {
        Runnable runnable = this.e1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // ib1
    public void u(float f) {
        float f2 = 1.0f - f;
        this.V0.setAlpha(f2);
        this.T0.setAlpha(f2);
    }

    @Override // ib1
    public void x(int i) {
        boolean z = this.m0;
        super.x(i);
        if (z || !this.M.c()) {
            return;
        }
        B();
    }

    public final void z() {
        boolean z;
        jb1 jb1Var = this.p1;
        gl.r(jb1Var);
        if (na7.q1(this.V).X3.getInt("movecaptionhint", 0) >= 24) {
            boolean z2 = w01.a;
            z = false;
        } else {
            z = true;
        }
        this.o1 = z;
        if (z) {
            SharedPreferences sharedPreferences = na7.q1(this.V).X3;
            sharedPreferences.edit().putInt("movecaptionhint", sharedPreferences.getInt("movecaptionhint", 0) + 1).apply();
            invalidate();
            gl.e3(jb1Var, 5000L);
        }
    }
}
