// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class dc0 extends FrameLayout implements fn7 {
    public static final /* synthetic */ int G = 0;
    public ac0 E;
    public boolean F;
    public final OvershootInterpolator a;
    public final zc b;
    public final vb0 c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final wb0 e;
    public final vnb f;
    public final nz4 h;
    public AnimatorSet n;
    public boolean r;
    public ec0[] s;
    public final View w;
    public boolean x;
    public String y;

    public dc0(Context context, vnb vnbVar, wb0 wb0Var) {
        super(context);
        this.a = new OvershootInterpolator(1.02f);
        nz4 nz4Var = new nz4();
        this.h = nz4Var;
        ll0 ll0Var = new ll0(nz4Var, nz4Var, nz4Var);
        this.e = wb0Var;
        this.f = vnbVar;
        ll0Var.h = new yic(this);
        ll0Var.i = this;
        View view = new View(context);
        this.w = view;
        view.setOnClickListener(new k1(this, (byte) 15));
        addView(view, tre.c(-1.0f, -1));
        zc zcVar = new zc((byte) 2, context, (Object) this);
        this.b = zcVar;
        addView(zcVar, tre.c(-1.0f, -1));
        vb0 vb0Var = new vb0(context, vnbVar);
        this.c = vb0Var;
        float L = hl.L(12.0f);
        yi yiVar = yhc.a;
        vb0Var.setOutlineProvider(new whc(0, L));
        vb0Var.setElevation(hl.L(4.0f));
        vb0Var.setClipToOutline(true);
        zcVar.addView(vb0Var, tre.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            vb0Var.setOutlineSpotShadowColor(TLObject.FLAG_31);
            vb0Var.setOutlineAmbientShadowColor(TLObject.FLAG_31);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, vnbVar, context);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        jl0 c = ll0Var.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c.p(dtd.k(vnbVar));
        c.q(hl.L(8.0f));
        c.S.e = true;
        c.r(hl.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c);
        zcVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, tre.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(yb0 yb0Var) {
        this.s = yb0Var.i;
        byte b = 0;
        boolean z = yb0Var.c != null;
        vb0 vb0Var = this.c;
        vb0Var.c = z;
        vb0Var.invalidate();
        this.y = yb0Var.f;
        ac0 ac0Var = this.E;
        if (ac0Var != null) {
            if (ac0Var.g) {
                ac0Var.g = false;
                ac0Var.b.n(ac0Var.a, ac0Var.e);
            }
            this.E = null;
        }
        ac0 ac0Var2 = yb0Var.j;
        if (ac0Var2 != null) {
            this.E = ac0Var2;
            cc0 cc0Var = new cc0(this, yb0Var, b);
            if (!ac0Var2.g) {
                ac0Var2.g = true;
                ac0Var2.f = cc0Var;
                ac0Var2.b.a(ac0Var2.a, ac0Var2.e);
                ac0Var2.a();
            }
        }
        int i = yac.t0;
        jn5 jn5Var = yb0Var.c;
        String str = yb0Var.e;
        jn5 jn5Var2 = yb0Var.a;
        jn5 jn5Var3 = yb0Var.b;
        String str2 = yb0Var.d;
        BitmapDrawable bitmapDrawable = yb0Var.g;
        Object obj = yb0Var.h;
        de0 de0Var = (de0) vb0Var.d;
        de0Var.getImageReceiver().d = i;
        de0Var.getImageReceiver().Y(jn5Var, str, jn5Var2, null, jn5Var3, str2, bitmapDrawable, 0L, null, obj, 1);
        de0Var.e();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i2 = 0;
        while (true) {
            ec0[] ec0VarArr = this.s;
            if (i2 >= ec0VarArr.length) {
                b(true);
                return;
            }
            ec0 ec0Var = ec0VarArr[i2];
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            b8 c = s7.c(i2 == 0, i2 == this.s.length - 1, actionBarPopupWindow$ActionBarPopupWindowLayout2, ec0Var.c, ob6.M0(ec0Var.b, ec0Var.a), false, this.f);
            c.setTag(Integer.valueOf(i2));
            c.setOnClickListener(new t(this, ec0Var, (byte) 23));
            i2++;
            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        }
    }

    public final void b(final boolean z) {
        if (this.r == z) {
            return;
        }
        this.r = z;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(z ? this.a : k43.h);
        final byte b = 0;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: bc0
            public final /* synthetic */ dc0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b2 = b;
                boolean z2 = z;
                dc0 dc0Var = this.b;
                switch (b2) {
                    case 0:
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = dc0Var.d;
                        zc zcVar = dc0Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z2) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a = ete.a(floatValue, 0.0f, 1.0f);
                        float f = (0.3f * floatValue) + 0.7f;
                        zcVar.setScaleX(f);
                        zcVar.setScaleY(f);
                        zcVar.setAlpha(a);
                        float f2 = 1.0f - floatValue;
                        dc0Var.c.setTranslationY(hl.L(40.0f) * f2);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-hl.L(70.0f)) * f2);
                        float f3 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f3);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f3);
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z2) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        dc0Var.w.setAlpha(floatValue2);
                        dc0Var.invalidate();
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        final byte b2 = 1;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: bc0
            public final /* synthetic */ dc0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b22 = b2;
                boolean z2 = z;
                dc0 dc0Var = this.b;
                switch (b22) {
                    case 0:
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = dc0Var.d;
                        zc zcVar = dc0Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z2) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a = ete.a(floatValue, 0.0f, 1.0f);
                        float f = (0.3f * floatValue) + 0.7f;
                        zcVar.setScaleX(f);
                        zcVar.setScaleY(f);
                        zcVar.setAlpha(a);
                        float f2 = 1.0f - floatValue;
                        dc0Var.c.setTranslationY(hl.L(40.0f) * f2);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-hl.L(70.0f)) * f2);
                        float f3 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f3);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f3);
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z2) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        dc0Var.w.setAlpha(floatValue2);
                        dc0Var.invalidate();
                        break;
                }
            }
        });
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n = animatorSet2;
        animatorSet2.setDuration(z ? 190L : 150L);
        this.n.playTogether(ofFloat, ofFloat2);
        this.n.addListener(new z7((byte) 4, (Object) this, z));
        this.n.start();
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        vb0 vb0Var = this.c;
        boolean z = vb0Var.c;
        RadialProgress2 radialProgress2 = (RadialProgress2) vb0Var.e;
        if (!z || TextUtils.isEmpty(this.y)) {
            return;
        }
        if (i == jn7.Y1) {
            if (TextUtils.equals((String) objArr[0], this.y)) {
                radialProgress2.o(true, 1.0f);
            }
        } else if (i == jn7.X1 && TextUtils.equals((String) objArr[0], this.y)) {
            radialProgress2.o(true, Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() != 4 && keyEvent.getKeyCode() != 111) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (getKeyDispatcherState() == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
            if (keyDispatcherState2 != null) {
                keyDispatcherState2.startTracking(keyEvent, this);
            }
            return true;
        }
        if (keyEvent.getAction() != 1 || (keyDispatcherState = getKeyDispatcherState()) == null || !keyDispatcherState.isTracking(keyEvent) || keyEvent.isCanceled()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b(false);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(yac.t0).b(this, jn7.Y1);
        jn7.f(yac.t0).b(this, jn7.X1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(yac.t0).n(this, jn7.Y1);
        jn7.f(yac.t0).n(this, jn7.X1);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != 0 && i2 != 0 && this.r) {
            this.w.setBackground(null);
            hl.c3(new pz(this, (byte) 5));
        }
        uk0.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
