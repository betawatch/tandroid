package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lb1 extends org.telegram.ui.Components.w71 implements y00 {
    public final FrameLayout V;
    public final org.telegram.ui.Components.tk0 W;
    public final s4.a0 a0;
    public final jb1 b0;
    public t11 c0;
    public String d0;
    public final ArrayList e0;
    public final ArrayList f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public boolean n0;
    public boolean o0;
    public final org.telegram.ui.Components.dw0 p0;
    public final org.telegram.ui.Components.wj0 q0;
    public boolean r0;
    public final mg.s s0;
    public final z01 t0;
    public final ArrayList u0;
    public final /* synthetic */ pb1 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb1(pb1 pb1Var, Context context) {
        super(context, null);
        this.v0 = pb1Var;
        this.d0 = "empty";
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        this.u0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        this.t0 = new z01(this, 5);
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.W = tk0Var;
        jb1 jb1Var = new jb1(this);
        this.b0 = jb1Var;
        tk0Var.setAdapter(jb1Var);
        s4.a0 a0Var = new s4.a0();
        this.a0 = a0Var;
        tk0Var.setLayoutManager(a0Var);
        tk0Var.setOnItemClickListener(new kz0(this, 10));
        tk0Var.setOnScrollListener(new w41(this, 4));
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        zzVar.setViewType(7);
        zzVar.x = false;
        zzVar.setUseHeaderOffset(true);
        org.telegram.ui.Components.dw0 dw0Var = new org.telegram.ui.Components.dw0(context, zzVar, 1, null);
        this.p0 = dw0Var;
        dw0Var.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
        dw0Var.e.setVisibility(8);
        dw0Var.setVisibility(8);
        dw0Var.addView(zzVar, 0);
        dw0Var.setAnimateLayoutChange(true);
        tk0Var.setEmptyView(dw0Var);
        tk0Var.W1 = true;
        tk0Var.X1 = 0;
        frameLayout.addView(dw0Var);
        frameLayout.addView(tk0Var);
        N();
        org.telegram.ui.Components.wj0 wj0Var = new org.telegram.ui.Components.wj0(tk0Var, true);
        this.q0 = wj0Var;
        tk0Var.setItemsEnterAnimator(wj0Var);
        mg.s sVar = new mg.s(this);
        this.s0 = sVar;
        setAdapter(sVar);
    }

    public final void L(String str) {
        int i10;
        if (this.r0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        pb1 pb1Var = this.v0;
        tL_messages_search.peer = pb1Var.getMessagesController().i1(-pb1Var.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.f0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((org.telegram.messenger.jj) i0.a.g(1, arrayList)).f1();
        }
        this.r0 = true;
        i10 = ((org.telegram.ui.ActionBar.k2) pb1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new ul0(17, this, str));
    }

    public final void M(View view, int i10, String str, boolean z10) {
        this.d0 = str;
        FrameLayout frameLayout = this.V;
        pb1 pb1Var = this.v0;
        int i11 = 0;
        if (view != frameLayout) {
            if (view instanceof z00) {
                z00 z00Var = (z00) view;
                z00Var.c.b(0, false);
                z00Var.h(-pb1Var.a, 0L, 0L, 0L, zf.g0.j3[((ib1) ((ArrayList) this.s0.b).get(i10)).b], false, str, z10);
                return;
            }
            if (view instanceof org.telegram.ui.Components.gm0) {
                org.telegram.ui.Components.gm0 gm0Var = (org.telegram.ui.Components.gm0) view;
                gm0Var.a.b(0, false);
                gm0Var.K = str;
                gm0Var.d(false);
                return;
            }
            return;
        }
        t11 t11Var = this.c0;
        if (t11Var != null) {
            org.telegram.messenger.i0.r(t11Var);
            this.c0 = null;
        }
        this.r0 = false;
        this.o0 = false;
        ArrayList arrayList = this.e0;
        arrayList.clear();
        this.f0.clear();
        N();
        if (!TextUtils.isEmpty(str)) {
            N();
            this.n0 = true;
            this.p0.e(true, true);
            t11 t11Var2 = new t11(13, this, str);
            this.c0 = t11Var2;
            org.telegram.messenger.i0.h3(t11Var2, 200L);
            return;
        }
        this.n0 = false;
        arrayList.clear();
        while (true) {
            ArrayList arrayList2 = pb1Var.b;
            if (i11 >= arrayList2.size()) {
                N();
                return;
            }
            if (((hb1) arrayList2.get(i11)).c != null) {
                arrayList.add(((hb1) arrayList2.get(i11)).c);
                ((hb1) arrayList2.get(i11)).c.searchQuery = null;
            }
            i11++;
        }
    }

    public final void N() {
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = 0;
        ArrayList arrayList = this.e0;
        if (!arrayList.isEmpty()) {
            int i10 = this.m0;
            int i11 = i10 + 1;
            this.m0 = i11;
            this.g0 = i10;
            this.h0 = i11;
            int size = arrayList.size() + i11;
            this.m0 = size;
            this.i0 = size;
        }
        ArrayList arrayList2 = this.f0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.m0;
            int i13 = i12 + 1;
            this.m0 = i13;
            this.j0 = i12;
            this.k0 = i13;
            int size2 = arrayList2.size() + i13;
            this.m0 = size2;
            this.l0 = size2;
        }
        this.b0.f();
    }

    @Override // org.telegram.ui.y00
    public final void a() {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.k2) this.v0).actionBar;
        lVar.O(null, null);
    }

    @Override // org.telegram.ui.y00
    public final boolean b(s00 s00Var) {
        if (s00Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.u0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i10);
            if (jjVar != null && jjVar.f1() == s00Var.b && org.telegram.messenger.jj.B0(jjVar.k) == s00Var.a) {
                return true;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.y00
    public final void c(org.telegram.messenger.jj jjVar) {
        int i10;
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.jj.B0(jjVar.k);
        boolean C = org.telegram.messenger.o5.C(B0);
        pb1 pb1Var = this.v0;
        if (C) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.o5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            i10 = ((org.telegram.ui.ActionBar.k2) pb1Var).currentAccount;
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(org.telegram.messenger.c.a(i10).a).L0(Long.valueOf(-B0));
            if (L0 != null && L0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -L0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", jjVar.f1());
        pb1Var.presentFragment(new un(bundle));
    }

    @Override // org.telegram.ui.y00
    public final void e(org.telegram.messenger.jj jjVar, View view, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        ArrayList arrayList = this.u0;
        if (!arrayList.remove(jjVar)) {
            arrayList.add(jjVar);
        }
        if (arrayList.isEmpty()) {
            lVar = ((org.telegram.ui.ActionBar.k2) this.v0).actionBar;
            lVar.t();
        }
    }

    @Override // org.telegram.ui.y00
    public final boolean f() {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.k2) this.v0).actionBar;
        return lVar.u();
    }
}
