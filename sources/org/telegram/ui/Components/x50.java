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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class x50 extends c51 implements org.telegram.messenger.ls {
    public final a0.h N1;
    public final w50 O1;
    public final org.telegram.ui.ActionBar.m1 P1;
    public final s50 Q1;
    public int R1;
    public int S1;
    public int T1;
    public int U1;
    public int V1;
    public int W1;
    public AnimatorSet X1;
    public final ArrayList Y1;
    public final a0.h Z1;
    public boolean a2;
    public float b2;
    public ValueAnimator c2;
    public c20 d2;
    public int e2;
    public org.telegram.ui.u40 f2;
    public org.telegram.ui.zr g2;
    public ArrayList h2;
    public int i2;
    public final float j2;
    public final org.telegram.ui.ActionBar.f2 k2;
    public final androidx.mediarouter.app.w l2;
    public int m2;
    public final p00 n2;
    public int o2;
    public final long p2;
    public boolean q2;
    public float r2;
    public boolean s2;
    public TLRPC.TL_chatInviteExported t2;

    public x50(Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var);
        this.Y1 = new ArrayList();
        this.Z1 = new a0.h();
        this.b2 = 0.0f;
        this.l2 = new androidx.mediarouter.app.w(this, 11);
        this.N1 = hVar;
        this.A1 = false;
        this.k2 = f2Var;
        this.p2 = j3;
        N();
        this.v1.J.setHint(org.telegram.messenger.id.M0(2131745770, null));
        this.j2 = ViewConfiguration.get(context).getScaledTouchSlop();
        s50 s50Var = new s50(this);
        this.Q1 = s50Var;
        this.o1 = s50Var;
        bi.q1 q1Var = this.n1;
        q50 q50Var = new q50(this);
        this.p1 = q50Var;
        q1Var.setAdapter(q50Var);
        this.t1.e(false, false);
        this.t1.setVisibility(8);
        ArrayList arrayList = org.telegram.messenger.g5.r(i7).e0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i10)).user_id));
            if (a22 != null && !a22.self && !a22.deleted) {
                this.Y1.add(a22);
            }
        }
        w50 w50Var = new w50(this, context);
        this.O1 = w50Var;
        this.n1.setOnItemClickListener(new org.telegram.ui.nb(this, j3, f2Var, hVar, context));
        bi.q1 q1Var2 = this.n1;
        o50 o50Var = new o50();
        o50Var.o = wq.f;
        o50Var.e = 150L;
        o50Var.c = 150L;
        o50Var.d = 150L;
        this.e0 = false;
        q1Var2.setItemAnimator(o50Var);
        T0();
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(this, context, 1);
        this.P1 = m1Var;
        m1Var.setVisibility(8);
        m1Var.setClipChildren(false);
        m1Var.addView(w50Var);
        this.b.addView(m1Var);
        p00 p00Var = new p00(context, h6Var, false);
        this.n2 = p00Var;
        p00Var.setImageResource(R.drawable.floating_check);
        p00Var.setOnClickListener(new bi.p3(this, context, j3, 4));
        p00Var.e(false, false);
        p00Var.setContentDescription(org.telegram.messenger.id.M0(2131748250, null));
        this.b.addView(p00Var, p00.b());
        ((ViewGroup.MarginLayoutParams) this.t1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
        ((ViewGroup.MarginLayoutParams) this.t1.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(4.0f);
        ((ViewGroup.MarginLayoutParams) this.t1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(4.0f);
    }

    @Override // org.telegram.ui.Components.c51
    public final a51 I0(Context context) {
        return new n50(this, context);
    }

    @Override // org.telegram.ui.Components.c51
    public final void J0(MotionEvent motionEvent, ah.i iVar) {
        org.telegram.ui.ActionBar.f2 f2Var;
        if (motionEvent.getAction() == 0) {
            this.r2 = this.x1;
            return;
        }
        if (motionEvent.getAction() != 1 || Math.abs(this.x1 - this.r2) >= this.j2 || this.q2) {
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
            this.q2 = true;
            org.telegram.messenger.g0.i3(new ro(26, this, iVar), ra2 ? 200L : 0L);
        } else {
            this.q2 = true;
            A0(true);
            iVar.requestFocus();
            org.telegram.messenger.g0.h3(new at(iVar, 3));
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void K() {
        super.K();
        if (this.q2) {
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
        s50 s50Var = this.Q1;
        if (s50Var.h != null) {
            Utilities.g.a(s50Var.h);
            s50Var.h = null;
        }
        s50Var.c.clear();
        s50Var.d.clear();
        s50Var.e.f(null, null);
        s50Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        s50Var.f();
        if (TextUtils.isEmpty(str)) {
            v4.g0 adapter = s50Var.n.n1.getAdapter();
            x50 x50Var = s50Var.n;
            oj0 oj0Var = x50Var.p1;
            if (adapter != oj0Var) {
                x50Var.n1.setAdapter(oj0Var);
                return;
            }
            return;
        }
        v4.g0 adapter2 = s50Var.n.n1.getAdapter();
        x50 x50Var2 = s50Var.n;
        oj0 oj0Var2 = x50Var2.o1;
        if (adapter2 != oj0Var2) {
            x50Var2.n1.setAdapter(oj0Var2);
        }
        s50Var.n.t1.e(true, false);
        org.telegram.messenger.p5 p5Var = Utilities.g;
        r50 r50Var = new r50(s50Var, str, 0);
        s50Var.h = r50Var;
        p5Var.d(r50Var, 300L);
    }

    public boolean R0() {
        return true;
    }

    public final void S0(boolean z9) {
        boolean z10 = true;
        boolean z11 = this.Z1.m() > 0;
        if (this.a2 != z11) {
            ValueAnimator valueAnimator = this.c2;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.c2.cancel();
            }
            this.a2 = z11;
            org.telegram.ui.ActionBar.m1 m1Var = this.P1;
            if (z11) {
                m1Var.setVisibility(0);
            }
            if (z9) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b2, z11 ? 1.0f : 0.0f);
                this.c2 = ofFloat;
                ofFloat.addUpdateListener(new d6(this, 27));
                this.c2.addListener(new s9(13, this, z11));
                this.c2.setDuration(150L);
                this.c2.start();
            } else {
                this.b2 = z11 ? 1.0f : 0.0f;
                this.b.invalidate();
                if (!z11) {
                    m1Var.setVisibility(8);
                }
            }
            if (!this.a2 && this.g2 == null) {
                z10 = false;
            }
            this.n2.e(z10, z9);
        }
    }

    public final void T0() {
        this.S1 = -1;
        this.T1 = -1;
        this.R1 = -1;
        this.U1 = -1;
        boolean z9 = true;
        this.W1 = 1;
        if (this.g2 == null) {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.a);
            long j3 = this.p2;
            TLRPC.Chat M0 = s12.M0(Long.valueOf(j3));
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(this.a).N0(j3);
            if ((M0 == null || TextUtils.isEmpty(org.telegram.messenger.t3.K(M0, false))) && (N0 == null || N0.exported_invite == null)) {
                z9 = R0();
            }
            if (z9) {
                int i7 = this.W1;
                this.W1 = i7 + 1;
                this.R1 = i7;
            }
            ArrayList arrayList = this.Y1;
            if (arrayList.size() != 0) {
                int i10 = this.W1;
                this.S1 = i10;
                int size = arrayList.size() + i10;
                this.W1 = size;
                this.T1 = size;
            } else {
                int i11 = this.W1;
                this.W1 = i11 + 1;
                this.U1 = i11;
            }
        } else if (this.h2.size() != 0) {
            int i12 = this.W1;
            this.S1 = i12;
            int size2 = this.h2.size() + i12;
            this.W1 = size2;
            this.T1 = size2;
        } else {
            int i13 = this.W1;
            this.W1 = i13 + 1;
            this.U1 = i13;
        }
        int i14 = this.W1;
        this.W1 = i14 + 1;
        this.V1 = i14;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.s && this.g2 != null && this.h2.isEmpty()) {
            this.h2 = new ArrayList(org.telegram.messenger.qp.s1(this.a).E);
            this.p1.f();
        }
    }

    @Override // org.telegram.ui.Components.c51, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.s);
    }
}
