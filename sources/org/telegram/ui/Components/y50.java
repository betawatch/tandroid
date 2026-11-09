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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class y50 extends c51 implements org.telegram.messenger.ls {
    public final a0.h K1;
    public final x50 L1;
    public final org.telegram.ui.ActionBar.m1 M1;
    public final t50 N1;
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
    public d20 a2;
    public int b2;
    public org.telegram.ui.t40 c2;
    public org.telegram.ui.yr d2;
    public ArrayList e2;
    public int f2;
    public final float g2;
    public final org.telegram.ui.ActionBar.f2 h2;
    public final androidx.mediarouter.app.w i2;
    public int j2;
    public final q00 k2;
    public int l2;
    public final long m2;
    public boolean n2;
    public float o2;
    public boolean p2;
    public TLRPC.TL_chatInviteExported q2;

    public y50(Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i7, context, g6Var);
        this.V1 = new ArrayList();
        this.W1 = new a0.h();
        this.Y1 = 0.0f;
        this.i2 = new androidx.mediarouter.app.w(this, 11);
        this.K1 = hVar;
        this.x1 = false;
        this.h2 = f2Var;
        this.m2 = j3;
        N();
        this.s1.J.setHint(org.telegram.messenger.id.M0(2131745770, null));
        this.g2 = ViewConfiguration.get(context).getScaledTouchSlop();
        t50 t50Var = new t50(this);
        this.N1 = t50Var;
        this.l1 = t50Var;
        bi.q1 q1Var = this.k1;
        r50 r50Var = new r50(this);
        this.m1 = r50Var;
        q1Var.setAdapter(r50Var);
        this.q1.e(false, false);
        this.q1.setVisibility(8);
        ArrayList arrayList = org.telegram.messenger.g5.r(i7).e0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i10)).user_id));
            if (a22 != null && !a22.self && !a22.deleted) {
                this.V1.add(a22);
            }
        }
        x50 x50Var = new x50(this, context);
        this.L1 = x50Var;
        this.k1.setOnItemClickListener(new org.telegram.ui.nb(this, j3, f2Var, hVar, context));
        bi.q1 q1Var2 = this.k1;
        p50 p50Var = new p50();
        p50Var.o = xq.f;
        p50Var.e = 150L;
        p50Var.c = 150L;
        p50Var.d = 150L;
        this.e0 = false;
        q1Var2.setItemAnimator(p50Var);
        T0();
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(this, context, 1);
        this.M1 = m1Var;
        m1Var.setVisibility(8);
        m1Var.setClipChildren(false);
        m1Var.addView(x50Var);
        this.b.addView(m1Var);
        q00 q00Var = new q00(context, g6Var, false);
        this.k2 = q00Var;
        q00Var.setImageResource(R.drawable.floating_check);
        q00Var.setOnClickListener(new bi.p3(this, context, j3, 4));
        q00Var.e(false, false);
        q00Var.setContentDescription(org.telegram.messenger.id.M0(2131748250, null));
        this.b.addView(q00Var, q00.b());
        ((ViewGroup.MarginLayoutParams) this.q1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
        ((ViewGroup.MarginLayoutParams) this.q1.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(4.0f);
        ((ViewGroup.MarginLayoutParams) this.q1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(4.0f);
    }

    @Override // org.telegram.ui.Components.c51
    public final a51 I0(Context context) {
        return new o50(this, context);
    }

    @Override // org.telegram.ui.Components.c51
    public final void J0(MotionEvent motionEvent, ah.i iVar) {
        org.telegram.ui.ActionBar.f2 f2Var;
        if (motionEvent.getAction() == 0) {
            this.o2 = this.u1;
            return;
        }
        if (motionEvent.getAction() != 1 || Math.abs(this.u1 - this.o2) >= this.g2 || this.n2) {
            return;
        }
        Activity W = org.telegram.messenger.g0.W(getContext());
        if (W instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) W;
            f2Var = (org.telegram.ui.ActionBar.f2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
        } else {
            f2Var = null;
        }
        if (f2Var instanceof org.telegram.ui.cn) {
            boolean ra2 = ((org.telegram.ui.cn) f2Var).ra();
            this.n2 = true;
            org.telegram.messenger.g0.i3(new fq(25, this, iVar), ra2 ? 200L : 0L);
        } else {
            this.n2 = true;
            A0(true);
            iVar.requestFocus();
            org.telegram.messenger.g0.h3(new bt(iVar, 3));
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void K() {
        super.K();
        if (this.n2) {
            Activity W = org.telegram.messenger.g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
                if (f2Var instanceof org.telegram.ui.cn) {
                    ((org.telegram.ui.cn) f2Var).va(true, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.c51
    public final void L0(String str) {
        t50 t50Var = this.N1;
        if (t50Var.h != null) {
            Utilities.g.a(t50Var.h);
            t50Var.h = null;
        }
        t50Var.c.clear();
        t50Var.d.clear();
        t50Var.e.f(null, null);
        t50Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        t50Var.f();
        if (TextUtils.isEmpty(str)) {
            v4.g0 adapter = t50Var.n.k1.getAdapter();
            y50 y50Var = t50Var.n;
            pj0 pj0Var = y50Var.m1;
            if (adapter != pj0Var) {
                y50Var.k1.setAdapter(pj0Var);
                return;
            }
            return;
        }
        v4.g0 adapter2 = t50Var.n.k1.getAdapter();
        y50 y50Var2 = t50Var.n;
        pj0 pj0Var2 = y50Var2.l1;
        if (adapter2 != pj0Var2) {
            y50Var2.k1.setAdapter(pj0Var2);
        }
        t50Var.n.q1.e(true, false);
        org.telegram.messenger.p5 p5Var = Utilities.g;
        s50 s50Var = new s50(t50Var, str, 0);
        t50Var.h = s50Var;
        p5Var.d(s50Var, 300L);
    }

    public boolean R0() {
        return true;
    }

    public final void S0(boolean z9) {
        boolean z10 = true;
        boolean z11 = this.W1.m() > 0;
        if (this.X1 != z11) {
            ValueAnimator valueAnimator = this.Z1;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.Z1.cancel();
            }
            this.X1 = z11;
            org.telegram.ui.ActionBar.m1 m1Var = this.M1;
            if (z11) {
                m1Var.setVisibility(0);
            }
            if (z9) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Y1, z11 ? 1.0f : 0.0f);
                this.Z1 = ofFloat;
                ofFloat.addUpdateListener(new e6(this, 27));
                this.Z1.addListener(new t9(13, this, z11));
                this.Z1.setDuration(150L);
                this.Z1.start();
            } else {
                this.Y1 = z11 ? 1.0f : 0.0f;
                this.b.invalidate();
                if (!z11) {
                    m1Var.setVisibility(8);
                }
            }
            if (!this.X1 && this.d2 == null) {
                z10 = false;
            }
            this.k2.e(z10, z9);
        }
    }

    public final void T0() {
        this.P1 = -1;
        this.Q1 = -1;
        this.O1 = -1;
        this.R1 = -1;
        boolean z9 = true;
        this.T1 = 1;
        if (this.d2 == null) {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.a);
            long j3 = this.m2;
            TLRPC.Chat M0 = s12.M0(Long.valueOf(j3));
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(this.a).N0(j3);
            if ((M0 == null || TextUtils.isEmpty(org.telegram.messenger.t3.K(M0, false))) && (N0 == null || N0.exported_invite == null)) {
                z9 = R0();
            }
            if (z9) {
                int i7 = this.T1;
                this.T1 = i7 + 1;
                this.O1 = i7;
            }
            ArrayList arrayList = this.V1;
            if (arrayList.size() != 0) {
                int i10 = this.T1;
                this.P1 = i10;
                int size = arrayList.size() + i10;
                this.T1 = size;
                this.Q1 = size;
            } else {
                int i11 = this.T1;
                this.T1 = i11 + 1;
                this.R1 = i11;
            }
        } else if (this.e2.size() != 0) {
            int i12 = this.T1;
            this.P1 = i12;
            int size2 = this.e2.size() + i12;
            this.T1 = size2;
            this.Q1 = size2;
        } else {
            int i13 = this.T1;
            this.T1 = i13 + 1;
            this.R1 = i13;
        }
        int i14 = this.T1;
        this.T1 = i14 + 1;
        this.S1 = i14;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.s && this.d2 != null && this.e2.isEmpty()) {
            this.e2 = new ArrayList(org.telegram.messenger.qp.s1(this.a).E);
            this.m1.f();
        }
    }

    @Override // org.telegram.ui.Components.c51, org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.s);
    }
}
