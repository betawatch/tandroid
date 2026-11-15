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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class a60 extends e51 implements org.telegram.messenger.is {
    public final a0.h O1;
    public final z50 P1;
    public final org.telegram.ui.ActionBar.l1 Q1;
    public final v50 R1;
    public int S1;
    public int T1;
    public int U1;
    public int V1;
    public int W1;
    public int X1;
    public AnimatorSet Y1;
    public final ArrayList Z1;
    public final a0.h a2;
    public boolean b2;
    public float c2;
    public ValueAnimator d2;
    public f20 e2;
    public int f2;
    public org.telegram.ui.r40 g2;
    public org.telegram.ui.zr h2;
    public ArrayList i2;
    public int j2;
    public final float k2;
    public final org.telegram.ui.ActionBar.e2 l2;
    public final androidx.mediarouter.app.w m2;
    public int n2;
    public final t00 o2;
    public int p2;
    public final long q2;
    public boolean r2;
    public float s2;
    public boolean t2;
    public TLRPC.TL_chatInviteExported u2;

    public a60(Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, context, e6Var);
        this.Z1 = new ArrayList();
        this.a2 = new a0.h();
        this.c2 = 0.0f;
        this.m2 = new androidx.mediarouter.app.w(this, 11);
        this.O1 = hVar;
        this.B1 = false;
        this.l2 = e2Var;
        this.q2 = j3;
        O();
        this.w1.K.setHint(org.telegram.messenger.hd.M0(2131745770, null));
        this.k2 = ViewConfiguration.get(context).getScaledTouchSlop();
        v50 v50Var = new v50(this);
        this.R1 = v50Var;
        this.p1 = v50Var;
        di.c1 c1Var = this.o1;
        t50 t50Var = new t50(this);
        this.q1 = t50Var;
        c1Var.setAdapter(t50Var);
        this.u1.e(false, false);
        this.u1.setVisibility(8);
        ArrayList arrayList = org.telegram.messenger.g5.r(i7).f0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User a22 = org.telegram.messenger.np.s1(this.a).a2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i10)).user_id));
            if (a22 != null && !a22.self && !a22.deleted) {
                this.Z1.add(a22);
            }
        }
        z50 z50Var = new z50(this, context);
        this.P1 = z50Var;
        this.o1.setOnItemClickListener(new org.telegram.ui.mb(this, j3, e2Var, hVar, context));
        di.c1 c1Var2 = this.o1;
        r50 r50Var = new r50();
        r50Var.o = er.f;
        r50Var.e = 150L;
        r50Var.c = 150L;
        r50Var.d = 150L;
        this.f0 = false;
        c1Var2.setItemAnimator(r50Var);
        T0();
        org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(this, context, 1);
        this.Q1 = l1Var;
        l1Var.setVisibility(8);
        l1Var.setClipChildren(false);
        l1Var.addView(z50Var);
        this.b.addView(l1Var);
        t00 t00Var = new t00(context, e6Var, false);
        this.o2 = t00Var;
        t00Var.setImageResource(R.drawable.floating_check);
        t00Var.setOnClickListener(new di.v2(this, context, j3, 4));
        t00Var.e(false, false);
        t00Var.setContentDescription(org.telegram.messenger.hd.M0(2131748250, null));
        this.b.addView(t00Var, t00.b());
        ((ViewGroup.MarginLayoutParams) this.u1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
        ((ViewGroup.MarginLayoutParams) this.u1.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(4.0f);
        ((ViewGroup.MarginLayoutParams) this.u1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(4.0f);
    }

    @Override // org.telegram.ui.Components.e51
    public final c51 I0(Context context) {
        return new q50(this, context);
    }

    @Override // org.telegram.ui.Components.e51
    public final void J0(MotionEvent motionEvent, ah.i iVar) {
        org.telegram.ui.ActionBar.e2 e2Var;
        if (motionEvent.getAction() == 0) {
            this.s2 = this.y1;
            return;
        }
        if (motionEvent.getAction() != 1 || Math.abs(this.y1 - this.s2) >= this.k2 || this.r2) {
            return;
        }
        Activity W = org.telegram.messenger.g0.W(getContext());
        if (W instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) W;
            e2Var = (org.telegram.ui.ActionBar.e2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
        } else {
            e2Var = null;
        }
        if (e2Var instanceof org.telegram.ui.an) {
            boolean sa2 = ((org.telegram.ui.an) e2Var).sa();
            this.r2 = true;
            org.telegram.messenger.g0.i3(new vs(19, this, iVar), sa2 ? 200L : 0L);
        } else {
            this.r2 = true;
            A0(true);
            iVar.requestFocus();
            org.telegram.messenger.g0.h3(new ht(iVar, 3));
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void L() {
        super.L();
        if (this.r2) {
            Activity W = org.telegram.messenger.g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
                if (e2Var instanceof org.telegram.ui.an) {
                    ((org.telegram.ui.an) e2Var).wa(true, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.e51
    public final void L0(String str) {
        v50 v50Var = this.R1;
        if (v50Var.h != null) {
            Utilities.g.a(v50Var.h);
            v50Var.h = null;
        }
        v50Var.c.clear();
        v50Var.d.clear();
        v50Var.e.f(null, null);
        v50Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        v50Var.f();
        if (TextUtils.isEmpty(str)) {
            v4.h0 adapter = v50Var.n.o1.getAdapter();
            a60 a60Var = v50Var.n;
            tj0 tj0Var = a60Var.q1;
            if (adapter != tj0Var) {
                a60Var.o1.setAdapter(tj0Var);
                return;
            }
            return;
        }
        v4.h0 adapter2 = v50Var.n.o1.getAdapter();
        a60 a60Var2 = v50Var.n;
        tj0 tj0Var2 = a60Var2.p1;
        if (adapter2 != tj0Var2) {
            a60Var2.o1.setAdapter(tj0Var2);
        }
        v50Var.n.u1.e(true, false);
        org.telegram.messenger.p5 p5Var = Utilities.g;
        u50 u50Var = new u50(v50Var, str, 0);
        v50Var.h = u50Var;
        p5Var.d(u50Var, 300L);
    }

    public boolean R0() {
        return true;
    }

    public final void S0(boolean z10) {
        boolean z11 = true;
        boolean z12 = this.a2.m() > 0;
        if (this.b2 != z12) {
            ValueAnimator valueAnimator = this.d2;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.d2.cancel();
            }
            this.b2 = z12;
            org.telegram.ui.ActionBar.l1 l1Var = this.Q1;
            if (z12) {
                l1Var.setVisibility(0);
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c2, z12 ? 1.0f : 0.0f);
                this.d2 = ofFloat;
                ofFloat.addUpdateListener(new c6(this, 27));
                this.d2.addListener(new org.telegram.ui.nn(14, this, z12));
                this.d2.setDuration(150L);
                this.d2.start();
            } else {
                this.c2 = z12 ? 1.0f : 0.0f;
                this.b.invalidate();
                if (!z12) {
                    l1Var.setVisibility(8);
                }
            }
            if (!this.b2 && this.h2 == null) {
                z11 = false;
            }
            this.o2.e(z11, z10);
        }
    }

    public final void T0() {
        this.T1 = -1;
        this.U1 = -1;
        this.S1 = -1;
        this.V1 = -1;
        boolean z10 = true;
        this.X1 = 1;
        if (this.h2 == null) {
            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(this.a);
            long j3 = this.q2;
            TLRPC.Chat M0 = s12.M0(Long.valueOf(j3));
            TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(this.a).N0(j3);
            if ((M0 == null || TextUtils.isEmpty(org.telegram.messenger.t3.K(M0, false))) && (N0 == null || N0.exported_invite == null)) {
                z10 = R0();
            }
            if (z10) {
                int i7 = this.X1;
                this.X1 = i7 + 1;
                this.S1 = i7;
            }
            ArrayList arrayList = this.Z1;
            if (arrayList.size() != 0) {
                int i10 = this.X1;
                this.T1 = i10;
                int size = arrayList.size() + i10;
                this.X1 = size;
                this.U1 = size;
            } else {
                int i11 = this.X1;
                this.X1 = i11 + 1;
                this.V1 = i11;
            }
        } else if (this.i2.size() != 0) {
            int i12 = this.X1;
            this.T1 = i12;
            int size2 = this.i2.size() + i12;
            this.X1 = size2;
            this.U1 = size2;
        } else {
            int i13 = this.X1;
            this.X1 = i13 + 1;
            this.V1 = i13;
        }
        int i14 = this.X1;
        this.X1 = i14 + 1;
        this.W1 = i14;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.s && this.h2 != null && this.i2.isEmpty()) {
            this.i2 = new ArrayList(org.telegram.messenger.np.s1(this.a).F);
            this.q1.f();
        }
    }

    @Override // org.telegram.ui.Components.e51, org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.s);
    }
}
