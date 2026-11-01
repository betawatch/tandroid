package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jb1 extends org.telegram.ui.Components.x71 implements x00 {
    public final FrameLayout V;
    public final org.telegram.ui.Components.uk0 W;
    public final s4.a0 a0;
    public final hb1 b0;
    public y01 c0;
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
    public final org.telegram.ui.Components.ew0 p0;
    public final org.telegram.ui.Components.xj0 q0;
    public boolean r0;
    public final mg.s s0;
    public final gt0 t0;
    public final ArrayList u0;
    public final /* synthetic */ nb1 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb1(nb1 nb1Var, Context context) {
        super(context, null);
        this.v0 = nb1Var;
        this.d0 = "empty";
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        this.u0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        this.t0 = new gt0(this, 6);
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.W = uk0Var;
        hb1 hb1Var = new hb1(this);
        this.b0 = hb1Var;
        uk0Var.setAdapter(hb1Var);
        s4.a0 a0Var = new s4.a0();
        this.a0 = a0Var;
        uk0Var.setLayoutManager(a0Var);
        uk0Var.setOnItemClickListener(new jz0(this, 10));
        uk0Var.setOnScrollListener(new u41(this, 4));
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        zzVar.setViewType(7);
        zzVar.x = false;
        zzVar.setUseHeaderOffset(true);
        org.telegram.ui.Components.ew0 ew0Var = new org.telegram.ui.Components.ew0(context, zzVar, 1, null);
        this.p0 = ew0Var;
        ew0Var.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
        ew0Var.e.setVisibility(8);
        ew0Var.setVisibility(8);
        ew0Var.addView(zzVar, 0);
        ew0Var.setAnimateLayoutChange(true);
        uk0Var.setEmptyView(ew0Var);
        uk0Var.W1 = true;
        uk0Var.X1 = 0;
        frameLayout.addView(ew0Var);
        frameLayout.addView(uk0Var);
        N();
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(uk0Var, true);
        this.q0 = xj0Var;
        uk0Var.setItemsEnterAnimator(xj0Var);
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
        nb1 nb1Var = this.v0;
        tL_messages_search.peer = nb1Var.getMessagesController().i1(-nb1Var.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.f0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((org.telegram.messenger.kj) i0.a.g(1, arrayList)).f1();
        }
        this.r0 = true;
        i10 = ((org.telegram.ui.ActionBar.k2) nb1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new sl0(17, this, str));
    }

    public final void M(View view, int i10, String str, boolean z10) {
        this.d0 = str;
        FrameLayout frameLayout = this.V;
        nb1 nb1Var = this.v0;
        int i11 = 0;
        if (view != frameLayout) {
            if (view instanceof y00) {
                y00 y00Var = (y00) view;
                y00Var.c.b(0, false);
                y00Var.h(-nb1Var.a, 0L, 0L, 0L, zf.g0.j3[((gb1) ((ArrayList) this.s0.b).get(i10)).b], false, str, z10);
                return;
            }
            if (view instanceof org.telegram.ui.Components.hm0) {
                org.telegram.ui.Components.hm0 hm0Var = (org.telegram.ui.Components.hm0) view;
                hm0Var.a.b(0, false);
                hm0Var.K = str;
                hm0Var.d(false);
                return;
            }
            return;
        }
        y01 y01Var = this.c0;
        if (y01Var != null) {
            org.telegram.messenger.i0.r(y01Var);
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
            y01 y01Var2 = new y01(14, this, str);
            this.c0 = y01Var2;
            org.telegram.messenger.i0.h3(y01Var2, 200L);
            return;
        }
        this.n0 = false;
        arrayList.clear();
        while (true) {
            ArrayList arrayList2 = nb1Var.b;
            if (i11 >= arrayList2.size()) {
                N();
                return;
            }
            if (((fb1) arrayList2.get(i11)).c != null) {
                arrayList.add(((fb1) arrayList2.get(i11)).c);
                ((fb1) arrayList2.get(i11)).c.searchQuery = null;
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

    @Override // org.telegram.ui.x00
    public final void a() {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.k2) this.v0).actionBar;
        lVar.O(null, null);
    }

    @Override // org.telegram.ui.x00
    public final boolean b(r00 r00Var) {
        if (r00Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.u0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i10);
            if (kjVar != null && kjVar.f1() == r00Var.b && org.telegram.messenger.kj.B0(kjVar.k) == r00Var.a) {
                return true;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.x00
    public final void c(org.telegram.messenger.kj kjVar) {
        int i10;
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.kj.B0(kjVar.k);
        boolean C = org.telegram.messenger.o5.C(B0);
        nb1 nb1Var = this.v0;
        if (C) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.o5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            i10 = ((org.telegram.ui.ActionBar.k2) nb1Var).currentAccount;
            TLRPC.Chat L0 = org.telegram.messenger.wp.r1(org.telegram.messenger.c.a(i10).a).L0(Long.valueOf(-B0));
            if (L0 != null && L0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -L0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", kjVar.f1());
        nb1Var.presentFragment(new un(bundle));
    }

    @Override // org.telegram.ui.x00
    public final void e(org.telegram.messenger.kj kjVar, View view, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        ArrayList arrayList = this.u0;
        if (!arrayList.remove(kjVar)) {
            arrayList.add(kjVar);
        }
        if (arrayList.isEmpty()) {
            lVar = ((org.telegram.ui.ActionBar.k2) this.v0).actionBar;
            lVar.t();
        }
    }

    @Override // org.telegram.ui.x00
    public final boolean f() {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.k2) this.v0).actionBar;
        return lVar.u();
    }
}
