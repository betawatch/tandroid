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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class j60 extends o51 implements org.telegram.messenger.fs {
    public final a0.h O1;
    public final i60 P1;
    public final org.telegram.ui.ActionBar.m1 Q1;
    public final d60 R1;
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
    public m20 e2;
    public int f2;
    public org.telegram.ui.u40 g2;
    public org.telegram.ui.zr h2;
    public ArrayList i2;
    public int j2;
    public final float k2;
    public final org.telegram.ui.ActionBar.h2 l2;
    public final androidx.mediarouter.app.w m2;
    public int n2;
    public final a10 o2;
    public int p2;
    public final long q2;
    public boolean r2;
    public float s2;
    public boolean t2;
    public TLRPC.TL_chatInviteExported u2;

    public j60(Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var);
        this.Z1 = new ArrayList();
        this.a2 = new a0.h();
        this.c2 = 0.0f;
        this.m2 = new androidx.mediarouter.app.w(this, 11);
        this.O1 = hVar;
        this.B1 = false;
        this.l2 = h2Var;
        this.q2 = j3;
        O();
        this.w1.K.setHint(org.telegram.messenger.gd.M0(2131745575, null));
        this.k2 = ViewConfiguration.get(context).getScaledTouchSlop();
        d60 d60Var = new d60(this);
        this.R1 = d60Var;
        this.p1 = d60Var;
        di.b1 b1Var = this.o1;
        b60 b60Var = new b60(this);
        this.q1 = b60Var;
        b1Var.setAdapter(b60Var);
        this.u1.e(false, false);
        this.u1.setVisibility(8);
        ArrayList arrayList = org.telegram.messenger.i5.r(i7).f0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(this.a).c2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i10)).user_id));
            if (c22 != null && !c22.self && !c22.deleted) {
                this.Z1.add(c22);
            }
        }
        i60 i60Var = new i60(this, context);
        this.P1 = i60Var;
        this.o1.setOnItemClickListener(new org.telegram.ui.mb(this, j3, h2Var, hVar, context));
        di.b1 b1Var2 = this.o1;
        z50 z50Var = new z50();
        z50Var.o = lr.f;
        z50Var.e = 150L;
        z50Var.c = 150L;
        z50Var.d = 150L;
        this.f0 = false;
        b1Var2.setItemAnimator(z50Var);
        U0();
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(this, context, 1);
        this.Q1 = m1Var;
        m1Var.setVisibility(8);
        m1Var.setClipChildren(false);
        m1Var.addView(i60Var);
        this.b.addView(m1Var);
        a10 a10Var = new a10(context, i6Var, false);
        this.o2 = a10Var;
        a10Var.setImageResource(R.drawable.floating_check);
        a10Var.setOnClickListener(new di.d3(this, context, j3, 4));
        a10Var.e(false, false);
        a10Var.setContentDescription(org.telegram.messenger.gd.M0(2131748058, null));
        this.b.addView(a10Var, a10.b());
        ((ViewGroup.MarginLayoutParams) this.u1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
        ((ViewGroup.MarginLayoutParams) this.u1.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(4.0f);
        ((ViewGroup.MarginLayoutParams) this.u1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(4.0f);
    }

    @Override // org.telegram.ui.Components.o51
    public final m51 J0(Context context) {
        return new y50(this, context);
    }

    @Override // org.telegram.ui.Components.o51
    public final void K0(MotionEvent motionEvent, ah.i iVar) {
        org.telegram.ui.ActionBar.h2 h2Var;
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
            h2Var = (org.telegram.ui.ActionBar.h2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
        } else {
            h2Var = null;
        }
        if (h2Var instanceof org.telegram.ui.bn) {
            boolean sa2 = ((org.telegram.ui.bn) h2Var).sa();
            this.r2 = true;
            org.telegram.messenger.g0.h3(new dw(15, this, iVar), sa2 ? 200L : 0L);
        } else {
            this.r2 = true;
            A0(true);
            iVar.requestFocus();
            org.telegram.messenger.g0.g3(new i(iVar, 4));
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void L() {
        super.L();
        if (this.r2) {
            Activity W = org.telegram.messenger.g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
                if (h2Var instanceof org.telegram.ui.bn) {
                    ((org.telegram.ui.bn) h2Var).wa(true, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.o51
    public final void M0(String str) {
        d60 d60Var = this.R1;
        if (d60Var.h != null) {
            Utilities.g.a(d60Var.h);
            d60Var.h = null;
        }
        d60Var.c.clear();
        d60Var.d.clear();
        d60Var.e.f(null, null);
        d60Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        d60Var.f();
        if (TextUtils.isEmpty(str)) {
            v4.i0 adapter = d60Var.n.o1.getAdapter();
            j60 j60Var = d60Var.n;
            bk0 bk0Var = j60Var.q1;
            if (adapter != bk0Var) {
                j60Var.o1.setAdapter(bk0Var);
                return;
            }
            return;
        }
        v4.i0 adapter2 = d60Var.n.o1.getAdapter();
        j60 j60Var2 = d60Var.n;
        bk0 bk0Var2 = j60Var2.p1;
        if (adapter2 != bk0Var2) {
            j60Var2.o1.setAdapter(bk0Var2);
        }
        d60Var.n.u1.e(true, false);
        org.telegram.messenger.q5 q5Var = Utilities.g;
        c60 c60Var = new c60(d60Var, str, 0);
        d60Var.h = c60Var;
        q5Var.d(c60Var, 300L);
    }

    public boolean S0() {
        return true;
    }

    public final void T0(boolean z10) {
        boolean z11 = true;
        boolean z12 = this.a2.m() > 0;
        if (this.b2 != z12) {
            ValueAnimator valueAnimator = this.d2;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.d2.cancel();
            }
            this.b2 = z12;
            org.telegram.ui.ActionBar.m1 m1Var = this.Q1;
            if (z12) {
                m1Var.setVisibility(0);
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c2, z12 ? 1.0f : 0.0f);
                this.d2 = ofFloat;
                ofFloat.addUpdateListener(new w(this, 29));
                this.d2.addListener(new org.telegram.ui.on(14, this, z12));
                this.d2.setDuration(150L);
                this.d2.start();
            } else {
                this.c2 = z12 ? 1.0f : 0.0f;
                this.b.invalidate();
                if (!z12) {
                    m1Var.setVisibility(8);
                }
            }
            if (!this.b2 && this.h2 == null) {
                z11 = false;
            }
            this.o2.e(z11, z10);
        }
    }

    public final void U0() {
        this.T1 = -1;
        this.U1 = -1;
        this.S1 = -1;
        this.V1 = -1;
        boolean z10 = true;
        this.X1 = 1;
        if (this.h2 == null) {
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(this.a);
            long j3 = this.q2;
            TLRPC.Chat O0 = u12.O0(Long.valueOf(j3));
            TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(this.a).P0(j3);
            if ((O0 == null || TextUtils.isEmpty(org.telegram.messenger.v3.K(O0, false))) && (P0 == null || P0.exported_invite == null)) {
                z10 = S0();
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

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.s && this.h2 != null && this.i2.isEmpty()) {
            this.i2 = new ArrayList(org.telegram.messenger.mp.u1(this.a).F);
            this.q1.f();
        }
    }

    @Override // org.telegram.ui.Components.o51, org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.s);
    }
}
