// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class it5 extends y9c implements jm7 {
    public final vh6 N1;
    public final ht5 O1;
    public final xd P1;
    public final et5 Q1;
    public int R1;
    public int S1;
    public int T1;
    public int U1;
    public int V1;
    public int W1;
    public AnimatorSet X1;
    public final ArrayList Y1;
    public final vh6 Z1;
    public boolean a2;
    public float b2;
    public ValueAnimator c2;
    public wc5 d2;
    public int e2;
    public ic5 f2;
    public yu3 g2;
    public ArrayList h2;
    public int i2;
    public final float j2;
    public final d k2;
    public final g6 l2;
    public int m2;
    public final wp4 n2;
    public int o2;
    public final long p2;
    public boolean q2;
    public float r2;
    public boolean s2;
    public TLRPC.TL_chatInviteExported t2;

    public it5(Context context, int i, vh6 vh6Var, long j, d dVar, ylb ylbVar) {
        super(i, ylbVar, context);
        this.Y1 = new ArrayList();
        this.Z1 = new vh6();
        this.b2 = 0.0f;
        this.l2 = new g6(this, (byte) 7);
        this.N1 = vh6Var;
        this.A1 = false;
        this.k2 = dVar;
        this.p2 = j;
        J();
        this.v1.K.setHint(jb6.M0(2131745504, null));
        this.j2 = ViewConfiguration.get(context).getScaledTouchSlop();
        et5 et5Var = new et5(this);
        this.Q1 = et5Var;
        this.o1 = et5Var;
        pu9 pu9Var = this.n1;
        bt5 bt5Var = new bt5(this);
        this.p1 = bt5Var;
        pu9Var.setAdapter(bt5Var);
        this.t1.e(false, false);
        this.t1.setVisibility(8);
        ArrayList arrayList = bw2.r(i).f0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC.User W1 = oc7.r1(this.a).W1(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i2)).user_id));
            if (W1 != null && !W1.self && !W1.deleted) {
                this.Y1.add(W1);
            }
        }
        ht5 ht5Var = new ht5(this, context);
        this.O1 = ht5Var;
        this.n1.setOnItemClickListener(new oh1(this, j, dVar, vh6Var, context));
        pu9 pu9Var2 = this.n1;
        at5 at5Var = new at5();
        at5Var.o = d53.f;
        at5Var.e = (short) 150;
        at5Var.c = (short) 150;
        at5Var.d = (short) 150;
        this.f0 = false;
        pu9Var2.setItemAnimator(at5Var);
        O0();
        xd xdVar = new xd(this, context, (byte) 3);
        this.P1 = xdVar;
        xdVar.setVisibility(8);
        xdVar.setClipChildren(false);
        xdVar.addView(ht5Var);
        this.b.addView(xdVar);
        wp4 wp4Var = new wp4(ylbVar, context, false);
        this.n2 = wp4Var;
        wp4Var.setImageResource(R.drawable.floating_check);
        wp4Var.setOnClickListener(new fh(this, context, j, (byte) 4));
        wp4Var.e(false, false);
        wp4Var.setContentDescription(jb6.M0(2131747984, null));
        this.b.addView(wp4Var, wp4.b());
        ((ViewGroup.MarginLayoutParams) this.t1.getLayoutParams()).topMargin = gm.L(20.0f);
        ((ViewGroup.MarginLayoutParams) this.t1.getLayoutParams()).leftMargin = gm.L(4.0f);
        ((ViewGroup.MarginLayoutParams) this.t1.getLayoutParams()).rightMargin = gm.L(4.0f);
    }

    @Override // y9c
    public final w9c D0(Context context) {
        return new zs5(this, context);
    }

    @Override // y9c
    public final void E0(MotionEvent motionEvent, l7 l7Var) {
        d dVar;
        if (motionEvent.getAction() == 0) {
            this.r2 = this.x1;
            return;
        }
        if (motionEvent.getAction() != 1 || Math.abs(this.x1 - this.r2) >= this.j2 || this.q2) {
            return;
        }
        Activity W = gm.W(getContext());
        if (W instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) W;
            dVar = (d) launchActivity.N().getFragmentStack().get(launchActivity.N().getFragmentStack().size() - 1);
        } else {
            dVar = null;
        }
        if (dVar instanceof yv1) {
            boolean ea = ((yv1) dVar).ea();
            this.q2 = true;
            gm.d3(new fd5(this, l7Var, (byte) 16), ea ? 200L : 0L);
        } else {
            this.q2 = true;
            v0(true);
            l7Var.requestFocus();
            gm.c3(new ys5(l7Var, (byte) 0));
        }
    }

    @Override // y9c
    public final void G0(String str) {
        et5 et5Var = this.Q1;
        if (et5Var.h != null) {
            Utilities.g.a(et5Var.h);
            et5Var.h = null;
        }
        et5Var.c.clear();
        et5Var.d.clear();
        et5Var.e.f(null, null);
        et5Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        et5Var.f();
        boolean isEmpty = TextUtils.isEmpty(str);
        pu9 pu9Var = et5Var.n.n1;
        if (isEmpty) {
            y59 adapter = pu9Var.getAdapter();
            it5 it5Var = et5Var.n;
            q59 q59Var = it5Var.p1;
            if (adapter != q59Var) {
                it5Var.n1.setAdapter(q59Var);
                return;
            }
            return;
        }
        y59 adapter2 = pu9Var.getAdapter();
        it5 it5Var2 = et5Var.n;
        q59 q59Var2 = it5Var2.o1;
        if (adapter2 != q59Var2) {
            it5Var2.n1.setAdapter(q59Var2);
        }
        et5Var.n.t1.e(true, false);
        mp3 mp3Var = Utilities.g;
        ct5 ct5Var = new ct5(et5Var, str, (byte) 0);
        et5Var.h = ct5Var;
        mp3Var.d(ct5Var, 300L);
    }

    @Override // my0
    public final void H() {
        super.H();
        if (this.q2) {
            Activity W = gm.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                d dVar = (d) launchActivity.N().getFragmentStack().get(launchActivity.N().getFragmentStack().size() - 1);
                if (dVar instanceof yv1) {
                    ((yv1) dVar).ia(true, true);
                }
            }
        }
    }

    public boolean M0() {
        return true;
    }

    public final void N0(boolean z) {
        boolean z2 = true;
        boolean z3 = this.Z1.m() > 0;
        if (this.a2 != z3) {
            ValueAnimator valueAnimator = this.c2;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.c2.cancel();
            }
            this.a2 = z3;
            xd xdVar = this.P1;
            if (z3) {
                xdVar.setVisibility(0);
            }
            if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b2, z3 ? 1.0f : 0.0f);
                this.c2 = ofFloat;
                ofFloat.addUpdateListener(new fh4(this, (byte) 13));
                this.c2.addListener(new jf4((byte) 9, this, z3));
                this.c2.setDuration(150L);
                this.c2.start();
            } else {
                this.b2 = z3 ? 1.0f : 0.0f;
                this.b.invalidate();
                if (!z3) {
                    xdVar.setVisibility(8);
                }
            }
            if (!this.a2 && this.g2 == null) {
                z2 = false;
            }
            this.n2.e(z2, z);
        }
    }

    public final void O0() {
        int i;
        this.S1 = -1;
        this.T1 = -1;
        this.R1 = -1;
        this.U1 = -1;
        boolean z = true;
        this.W1 = 1;
        if (this.g2 == null) {
            oc7 r1 = oc7.r1(this.a);
            long j = this.p2;
            TLRPC.Chat L0 = r1.L0(Long.valueOf(j));
            TLRPC.ChatFull M0 = oc7.r1(this.a).M0(j);
            if ((L0 == null || TextUtils.isEmpty(sd2.K(L0, false))) && (M0 == null || M0.exported_invite == null)) {
                z = M0();
            }
            if (z) {
                int i2 = this.W1;
                this.W1 = i2 + 1;
                this.R1 = i2;
            }
            ArrayList arrayList = this.Y1;
            int size = arrayList.size();
            int i3 = this.W1;
            if (size != 0) {
                this.S1 = i3;
                i = arrayList.size() + i3;
                this.W1 = i;
                this.T1 = i;
            } else {
                i = i3 + 1;
                this.W1 = i;
                this.U1 = i3;
            }
        } else {
            int size2 = this.h2.size();
            int i4 = this.W1;
            if (size2 != 0) {
                this.S1 = i4;
                i = this.h2.size() + i4;
                this.W1 = i;
                this.T1 = i;
            } else {
                i = i4 + 1;
                this.W1 = i;
                this.U1 = i4;
            }
        }
        this.W1 = i + 1;
        this.V1 = i;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.r && this.g2 != null && this.h2.isEmpty()) {
            this.h2 = new ArrayList(oc7.r1(this.a).F);
            this.p1.f();
        }
    }

    @Override // y9c, my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        super.dismiss();
        nm7.f(this.a).n(this, nm7.r);
    }
}
