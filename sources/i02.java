// default package

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class i02 extends y9c {
    public final int N1;
    public final m07 O1;
    public final tk4 P1;
    public final a1b Q1;
    public final a1b R1;
    public float S1;
    public boolean T1;
    public int U1;
    public final /* synthetic */ k02 V1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i02(k02 k02Var, d dVar, long j) {
        super(dVar.getCurrentAccount(), dVar.getResourceProvider(), dVar.getParentActivity());
        this.V1 = k02Var;
        this.N1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i = cmb.Z6;
        s0(cmb.v0(i, this.J0));
        this.F1 = i;
        this.E1 = i;
        H0(0.0f);
        L(i);
        this.A1 = false;
        this.B1 = false;
        m07 m07Var = new m07(this, dVar, this.c, j);
        this.O1 = m07Var;
        m07Var.B = false;
        this.q0 = (byte) 75;
        this.v1.K.setHint(jb6.M0(2131745492, null));
        q07 q07Var = m07Var.f;
        this.p1 = q07Var;
        this.o1 = q07Var;
        this.n1.setAdapter(q07Var);
        this.n1.r1();
        pu9 pu9Var = this.n1;
        m07Var.p = pu9Var;
        pu9Var.setOnItemClickListener(new kg4(m07Var, (byte) 11));
        k69 onScrollListener = pu9Var.getOnScrollListener();
        if (onScrollListener == null) {
            pu9Var.setOnScrollListener(m07Var.D);
        } else {
            pu9Var.setOnScrollListener(new bk1(m07Var, onScrollListener, (byte) 5));
        }
        int indexOfChild = ((ViewGroup) this.n1.getParent()).indexOfChild(this.n1);
        tk4 b = m07Var.b();
        this.P1 = b;
        this.b.addView(b, indexOfChild, qoe.c(-1.0f, -1));
        a1b a = m07Var.a();
        this.Q1 = a;
        this.b.addView(a, indexOfChild, qoe.c(-1.0f, -1));
        a1b c = m07Var.c();
        this.R1 = c;
        this.b.addView(c, indexOfChild, qoe.c(-1.0f, -1));
        m07Var.e();
    }

    @Override // y9c
    public final void E0(MotionEvent motionEvent, l7 l7Var) {
        d dVar;
        int action = motionEvent.getAction();
        m07 m07Var = this.O1;
        if (action == 0) {
            this.S1 = this.x1;
            m07Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.x1 - this.S1) < this.N1 && !this.T1) {
            Activity W = gm.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                dVar = (d) launchActivity.N().getFragmentStack().get(launchActivity.N().getFragmentStack().size() - 1);
            } else {
                dVar = null;
            }
            if (dVar instanceof yv1) {
                boolean ea = ((yv1) dVar).ea();
                this.T1 = true;
                gm.d3(new lj6((Object) this, (Object) l7Var, (byte) 19), ea ? 200L : 0L);
            } else {
                this.T1 = true;
                v0(true);
                l7Var.requestFocus();
                gm.c3(new ys5(l7Var, (byte) 2));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            m07Var.i(true);
        }
    }

    @Override // y9c
    public final void G0(String str) {
        this.O1.j(str);
    }

    @Override // y9c
    public final void I0(int i) {
        super.I0(i);
        this.P1.setTranslationY(this.m1.getMeasuredHeight() + i);
        float f = i;
        this.Q1.setTranslationY(f);
        this.R1.setTranslationY(f);
    }

    @Override // y9c
    public final void L0() {
        pu9 pu9Var = this.n1;
        if (pu9Var.getChildCount() > 0) {
            super.L0();
            return;
        }
        int paddingTop = pu9Var.getVisibility() == 0 ? pu9Var.getPaddingTop() - gm.L(8.0f) : 0;
        if (this.x1 != paddingTop) {
            this.x1 = paddingTop;
            I0(paddingTop);
        }
    }

    @Override // y9c, my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        k02 k02Var = this.V1;
        i02 i02Var = k02Var.i;
        if (i02Var != null && !i02Var.O1.b) {
            k02Var.i = null;
        }
        super.dismiss();
    }

    @Override // my0, android.app.Dialog
    public final void onBackPressed() {
        w07 w07Var = this.O1.s;
        if (w07Var != null) {
            w07Var.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override // my0
    public final void p0() {
        super.p0();
        int v0 = cmb.v0(cmb.Z6, this.J0);
        if (v0 != this.U1) {
            this.U1 = v0;
            s0(v0);
        }
    }

    @Override // my0, android.app.Dialog
    public final void show() {
        m07 m07Var = this.O1;
        if (m07Var.b && this.x1 == 0) {
            this.x1 = gm.L(8.0f);
        }
        super.show();
        m07Var.b = false;
    }
}
