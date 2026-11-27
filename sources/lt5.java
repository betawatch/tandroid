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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class lt5 extends xbc implements fn7 {
    public final zh6 N1;
    public final kt5 O1;
    public final yc P1;
    public final ht5 Q1;
    public int R1;
    public int S1;
    public int T1;
    public int U1;
    public int V1;
    public int W1;
    public AnimatorSet X1;
    public final ArrayList Y1;
    public final zh6 Z1;
    public boolean a2;
    public float b2;
    public ValueAnimator c2;
    public zc5 d2;
    public int e2;
    public lc5 f2;
    public lu3 g2;
    public ArrayList h2;
    public int i2;
    public final float j2;
    public final e k2;
    public final h6 l2;
    public int m2;
    public final zp4 n2;
    public int o2;
    public final long p2;
    public boolean q2;
    public float r2;
    public boolean s2;
    public TLRPC.TL_chatInviteExported t2;

    public lt5(Context context, int i, zh6 zh6Var, long j, e eVar, vnb vnbVar) {
        super(i, vnbVar, context);
        this.Y1 = new ArrayList();
        this.Z1 = new zh6();
        this.b2 = 0.0f;
        this.l2 = new h6(this, (byte) 7);
        this.N1 = zh6Var;
        this.A1 = false;
        this.k2 = eVar;
        this.p2 = j;
        J();
        this.v1.L.setHint(ob6.M0(2131745498, null));
        this.j2 = ViewConfiguration.get(context).getScaledTouchSlop();
        ht5 ht5Var = new ht5(this);
        this.Q1 = ht5Var;
        this.o1 = ht5Var;
        gw9 gw9Var = this.n1;
        ft5 ft5Var = new ft5(this);
        this.p1 = ft5Var;
        gw9Var.setAdapter(ft5Var);
        this.t1.e(false, false);
        this.t1.setVisibility(8);
        ArrayList arrayList = lv2.r(i).f0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC.User X1 = uc7.s1(this.a).X1(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i2)).user_id));
            if (X1 != null && !X1.self && !X1.deleted) {
                this.Y1.add(X1);
            }
        }
        kt5 kt5Var = new kt5(this, context);
        this.O1 = kt5Var;
        this.n1.setOnItemClickListener(new pg1(this, j, eVar, zh6Var, context));
        gw9 gw9Var2 = this.n1;
        et5 et5Var = new et5();
        et5Var.o = k43.f;
        et5Var.e = (short) 150;
        et5Var.c = (short) 150;
        et5Var.d = (short) 150;
        this.f0 = false;
        gw9Var2.setItemAnimator(et5Var);
        P0();
        yc ycVar = new yc(this, context, (byte) 3);
        this.P1 = ycVar;
        ycVar.setVisibility(8);
        ycVar.setClipChildren(false);
        ycVar.addView(kt5Var);
        this.b.addView(ycVar);
        zp4 zp4Var = new zp4(vnbVar, context, false);
        this.n2 = zp4Var;
        zp4Var.setImageResource(R.drawable.floating_check);
        zp4Var.setOnClickListener(new dg(this, context, j, (byte) 4));
        zp4Var.e(false, false);
        zp4Var.setContentDescription(ob6.M0(2131747981, null));
        this.b.addView(zp4Var, zp4.b());
        ((ViewGroup.MarginLayoutParams) this.t1.getLayoutParams()).topMargin = hl.L(20.0f);
        ((ViewGroup.MarginLayoutParams) this.t1.getLayoutParams()).leftMargin = hl.L(4.0f);
        ((ViewGroup.MarginLayoutParams) this.t1.getLayoutParams()).rightMargin = hl.L(4.0f);
    }

    @Override // xbc
    public final vbc E0(Context context) {
        return new dt5(this, context);
    }

    @Override // xbc
    public final void F0(MotionEvent motionEvent, m7 m7Var) {
        e eVar;
        if (motionEvent.getAction() == 0) {
            this.r2 = this.x1;
            return;
        }
        if (motionEvent.getAction() != 1 || Math.abs(this.x1 - this.r2) >= this.j2 || this.q2) {
            return;
        }
        Activity W = hl.W(getContext());
        if (W instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) W;
            eVar = (e) launchActivity.N().getFragmentStack().get(launchActivity.N().getFragmentStack().size() - 1);
        } else {
            eVar = null;
        }
        if (eVar instanceof zu1) {
            boolean fa = ((zu1) eVar).fa();
            this.q2 = true;
            hl.d3(new tg5(this, m7Var, (byte) 12), fa ? 200L : 0L);
        } else {
            this.q2 = true;
            w0(true);
            m7Var.requestFocus();
            hl.c3(new ct5(m7Var, (byte) 0));
        }
    }

    @Override // nx0
    public final void H() {
        super.H();
        if (this.q2) {
            Activity W = hl.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                e eVar = (e) launchActivity.N().getFragmentStack().get(launchActivity.N().getFragmentStack().size() - 1);
                if (eVar instanceof zu1) {
                    ((zu1) eVar).ja(true, true);
                }
            }
        }
    }

    @Override // xbc
    public final void H0(String str) {
        ht5 ht5Var = this.Q1;
        if (ht5Var.h != null) {
            Utilities.g.a(ht5Var.h);
            ht5Var.h = null;
        }
        ht5Var.c.clear();
        ht5Var.d.clear();
        ht5Var.e.f(null, null);
        ht5Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        ht5Var.f();
        boolean isEmpty = TextUtils.isEmpty(str);
        gw9 gw9Var = ht5Var.n.n1;
        if (isEmpty) {
            j79 adapter = gw9Var.getAdapter();
            lt5 lt5Var = ht5Var.n;
            c79 c79Var = lt5Var.p1;
            if (adapter != c79Var) {
                lt5Var.n1.setAdapter(c79Var);
                return;
            }
            return;
        }
        j79 adapter2 = gw9Var.getAdapter();
        lt5 lt5Var2 = ht5Var.n;
        c79 c79Var2 = lt5Var2.o1;
        if (adapter2 != c79Var2) {
            lt5Var2.n1.setAdapter(c79Var2);
        }
        ht5Var.n.t1.e(true, false);
        to3 to3Var = Utilities.g;
        gt5 gt5Var = new gt5(ht5Var, str, (byte) 0);
        ht5Var.h = gt5Var;
        to3Var.d(gt5Var, 300L);
    }

    public boolean N0() {
        return true;
    }

    public final void O0(boolean z) {
        boolean z2 = true;
        boolean z3 = this.Z1.m() > 0;
        if (this.a2 != z3) {
            ValueAnimator valueAnimator = this.c2;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.c2.cancel();
            }
            this.a2 = z3;
            yc ycVar = this.P1;
            if (z3) {
                ycVar.setVisibility(0);
            }
            if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b2, z3 ? 1.0f : 0.0f);
                this.c2 = ofFloat;
                ofFloat.addUpdateListener(new ch4(this, (byte) 13));
                this.c2.addListener(new gf4((byte) 9, this, z3));
                this.c2.setDuration(150L);
                this.c2.start();
            } else {
                this.b2 = z3 ? 1.0f : 0.0f;
                this.b.invalidate();
                if (!z3) {
                    ycVar.setVisibility(8);
                }
            }
            if (!this.a2 && this.g2 == null) {
                z2 = false;
            }
            this.n2.e(z2, z);
        }
    }

    public final void P0() {
        int i;
        this.S1 = -1;
        this.T1 = -1;
        this.R1 = -1;
        this.U1 = -1;
        boolean z = true;
        this.W1 = 1;
        if (this.g2 == null) {
            uc7 s1 = uc7.s1(this.a);
            long j = this.p2;
            TLRPC.Chat M0 = s1.M0(Long.valueOf(j));
            TLRPC.ChatFull N0 = uc7.s1(this.a).N0(j);
            if ((M0 == null || TextUtils.isEmpty(xc2.K(M0, false))) && (N0 == null || N0.exported_invite == null)) {
                z = N0();
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

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.r && this.g2 != null && this.h2.isEmpty()) {
            this.h2 = new ArrayList(uc7.s1(this.a).F);
            this.p1.f();
        }
    }

    @Override // xbc, nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        jn7.f(this.a).n(this, jn7.r);
    }
}
