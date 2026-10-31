package org.telegram.ui.Components;

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
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class m60 extends e61 implements org.telegram.messenger.us {
    public final a0.h K1;
    public final l60 L1;
    public final org.telegram.ui.ActionBar.p1 M1;
    public final i60 N1;
    public int O1;
    public int P1;
    public int Q1;
    public int R1;
    public int S1;
    public int T1;
    public AnimatorSet U1;
    public final ArrayList V1;
    public final a0.h W1;
    public boolean X1;
    public float Y1;
    public ValueAnimator Z1;
    public s20 a2;
    public int b2;
    public org.telegram.ui.q50 c2;
    public org.telegram.ui.tt d2;
    public ArrayList e2;
    public int f2;
    public final float g2;
    public final org.telegram.ui.ActionBar.k2 h2;
    public final androidx.mediarouter.app.w i2;
    public int j2;
    public final f10 k2;
    public int l2;
    public final long m2;
    public boolean n2;
    public float o2;
    public boolean p2;
    public TLRPC.TL_chatInviteExported q2;

    public m60(Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, context, p6Var);
        this.V1 = new ArrayList();
        this.W1 = new a0.h();
        this.Y1 = 0.0f;
        this.i2 = new androidx.mediarouter.app.w(this, 11);
        this.K1 = hVar;
        this.x1 = false;
        this.h2 = k2Var;
        this.m2 = j10;
        O();
        this.s1.J.setHint(org.telegram.messenger.cd.L0(2131745787, null));
        this.g2 = ViewConfiguration.get(context).getScaledTouchSlop();
        i60 i60Var = new i60(this);
        this.N1 = i60Var;
        this.l1 = i60Var;
        ag.b1 b1Var = this.k1;
        g60 g60Var = new g60(this);
        this.m1 = g60Var;
        b1Var.setAdapter(g60Var);
        this.q1.e(false, false);
        this.q1.setVisibility(8);
        ArrayList arrayList = org.telegram.messenger.i5.r(i10).e0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.a).Z1(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i11)).user_id));
            if (Z1 != null && !Z1.self && !Z1.deleted) {
                this.V1.add(Z1);
            }
        }
        l60 l60Var = new l60(this, context);
        this.L1 = l60Var;
        this.k1.setOnItemClickListener(new org.telegram.ui.tb(this, j10, k2Var, hVar, context));
        ag.b1 b1Var2 = this.k1;
        e60 e60Var = new e60();
        e60Var.o = gr.f;
        e60Var.e = 150L;
        e60Var.c = 150L;
        e60Var.d = 150L;
        this.e0 = false;
        b1Var2.setItemAnimator(e60Var);
        T0();
        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(this, context, 1);
        this.M1 = p1Var;
        p1Var.setVisibility(8);
        p1Var.setClipChildren(false);
        p1Var.addView(l60Var);
        this.b.addView(p1Var);
        f10 f10Var = new f10(context, p6Var, false);
        this.k2 = f10Var;
        f10Var.setImageResource(R.drawable.floating_check);
        f10Var.setOnClickListener(new org.telegram.ui.zn(this, context, j10, 3));
        f10Var.e(false, false);
        f10Var.setContentDescription(org.telegram.messenger.cd.L0(2131748267, null));
        this.b.addView(f10Var, f10.b());
        ((ViewGroup.MarginLayoutParams) this.q1.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(20.0f);
        ((ViewGroup.MarginLayoutParams) this.q1.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(4.0f);
        ((ViewGroup.MarginLayoutParams) this.q1.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(4.0f);
    }

    @Override // org.telegram.ui.Components.e61
    public final c61 I0(Context context) {
        return new d60(this, context);
    }

    @Override // org.telegram.ui.Components.e61
    public final void J0(MotionEvent motionEvent, org.telegram.ui.ActionBar.n0 n0Var) {
        org.telegram.ui.ActionBar.k2 k2Var;
        if (motionEvent.getAction() == 0) {
            this.o2 = this.u1;
            return;
        }
        if (motionEvent.getAction() != 1 || Math.abs(this.u1 - this.o2) >= this.g2 || this.n2) {
            return;
        }
        Activity W = org.telegram.messenger.i0.W(getContext());
        if (W instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) W;
            k2Var = (org.telegram.ui.ActionBar.k2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
        } else {
            k2Var = null;
        }
        if (k2Var instanceof org.telegram.ui.un) {
            boolean fa2 = ((org.telegram.ui.un) k2Var).fa();
            this.n2 = true;
            org.telegram.messenger.i0.h3(new at(19, this, n0Var), fa2 ? 200L : 0L);
        } else {
            this.n2 = true;
            A0(true);
            n0Var.requestFocus();
            org.telegram.messenger.i0.g3(new ot(n0Var, 3));
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void L() {
        super.L();
        if (this.n2) {
            Activity W = org.telegram.messenger.i0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
                if (k2Var instanceof org.telegram.ui.un) {
                    ((org.telegram.ui.un) k2Var).ja(true, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.e61
    public final void L0(String str) {
        i60 i60Var = this.N1;
        if (i60Var.h != null) {
            Utilities.g.a(i60Var.h);
            i60Var.h = null;
        }
        i60Var.c.clear();
        i60Var.d.clear();
        i60Var.e.f(null, null);
        i60Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        i60Var.f();
        if (TextUtils.isEmpty(str)) {
            s4.g0 adapter = i60Var.n.k1.getAdapter();
            m60 m60Var = i60Var.n;
            sk0 sk0Var = m60Var.m1;
            if (adapter != sk0Var) {
                m60Var.k1.setAdapter(sk0Var);
                return;
            }
            return;
        }
        s4.g0 adapter2 = i60Var.n.k1.getAdapter();
        m60 m60Var2 = i60Var.n;
        sk0 sk0Var2 = m60Var2.l1;
        if (adapter2 != sk0Var2) {
            m60Var2.k1.setAdapter(sk0Var2);
        }
        i60Var.n.q1.e(true, false);
        org.telegram.messenger.r5 r5Var = Utilities.g;
        h60 h60Var = new h60(i60Var, str, 0);
        i60Var.h = h60Var;
        r5Var.d(h60Var, 300L);
    }

    public boolean R0() {
        return true;
    }

    public final void S0(boolean z10) {
        boolean z11 = true;
        boolean z12 = this.W1.m() > 0;
        if (this.X1 != z12) {
            ValueAnimator valueAnimator = this.Z1;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.Z1.cancel();
            }
            this.X1 = z12;
            org.telegram.ui.ActionBar.p1 p1Var = this.M1;
            if (z12) {
                p1Var.setVisibility(0);
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Y1, z12 ? 1.0f : 0.0f);
                this.Z1 = ofFloat;
                ofFloat.addUpdateListener(new a6(this, 27));
                this.Z1.addListener(new eg.m(29, this, z12));
                this.Z1.setDuration(150L);
                this.Z1.start();
            } else {
                this.Y1 = z12 ? 1.0f : 0.0f;
                this.b.invalidate();
                if (!z12) {
                    p1Var.setVisibility(8);
                }
            }
            if (!this.X1 && this.d2 == null) {
                z11 = false;
            }
            this.k2.e(z11, z10);
        }
    }

    public final void T0() {
        this.P1 = -1;
        this.Q1 = -1;
        this.O1 = -1;
        this.R1 = -1;
        boolean z10 = true;
        this.T1 = 1;
        if (this.d2 == null) {
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(this.a);
            long j10 = this.m2;
            TLRPC.Chat L0 = r12.L0(Long.valueOf(j10));
            TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(this.a).M0(j10);
            if ((L0 == null || TextUtils.isEmpty(org.telegram.messenger.w3.K(L0, false))) && (M0 == null || M0.exported_invite == null)) {
                z10 = R0();
            }
            if (z10) {
                int i10 = this.T1;
                this.T1 = i10 + 1;
                this.O1 = i10;
            }
            ArrayList arrayList = this.V1;
            if (arrayList.size() != 0) {
                int i11 = this.T1;
                this.P1 = i11;
                int size = arrayList.size() + i11;
                this.T1 = size;
                this.Q1 = size;
            } else {
                int i12 = this.T1;
                this.T1 = i12 + 1;
                this.R1 = i12;
            }
        } else if (this.e2.size() != 0) {
            int i13 = this.T1;
            this.P1 = i13;
            int size2 = this.e2.size() + i13;
            this.T1 = size2;
            this.Q1 = size2;
        } else {
            int i14 = this.T1;
            this.T1 = i14 + 1;
            this.R1 = i14;
        }
        int i15 = this.T1;
        this.T1 = i15 + 1;
        this.S1 = i15;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.s && this.d2 != null && this.e2.isEmpty()) {
            this.e2 = new ArrayList(org.telegram.messenger.vp.r1(this.a).E);
            this.m1.f();
        }
    }

    @Override // org.telegram.ui.Components.e61, org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.s);
    }
}
