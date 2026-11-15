package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q91 extends org.telegram.ui.Components.w61 implements yz {
    public final FrameLayout W;
    public final org.telegram.ui.Components.uj0 a0;
    public final v4.b0 b0;
    public final o91 c0;
    public fy0 d0;
    public String e0;
    public final ArrayList f0;
    public final ArrayList g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public boolean o0;
    public boolean p0;
    public final org.telegram.ui.Components.cv0 q0;
    public final org.telegram.ui.Components.xi0 r0;
    public boolean s0;
    public final di.f4 t0;
    public final ur0 u0;
    public final ArrayList v0;
    public final /* synthetic */ u91 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q91(u91 u91Var, Context context) {
        super(context, null);
        this.w0 = u91Var;
        this.e0 = "empty";
        this.f0 = new ArrayList();
        this.g0 = new ArrayList();
        this.v0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        this.u0 = new ur0(this, 6);
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.a0 = uj0Var;
        o91 o91Var = new o91(this);
        this.c0 = o91Var;
        uj0Var.setAdapter(o91Var);
        v4.b0 b0Var = new v4.b0();
        this.b0 = b0Var;
        uj0Var.setLayoutManager(b0Var);
        uj0Var.setOnItemClickListener(new ux0(this, 10));
        uj0Var.setOnScrollListener(new y11(this, 5));
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        pzVar.setViewType(7);
        pzVar.x = false;
        pzVar.setUseHeaderOffset(true);
        org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(context, pzVar, 1, null);
        this.q0 = cv0Var;
        cv0Var.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
        cv0Var.e.setVisibility(8);
        cv0Var.setVisibility(8);
        cv0Var.addView(pzVar, 0);
        cv0Var.setAnimateLayoutChange(true);
        uj0Var.setEmptyView(cv0Var);
        uj0Var.X1 = true;
        uj0Var.Y1 = 0;
        frameLayout.addView(cv0Var);
        frameLayout.addView(uj0Var);
        L();
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(uj0Var, true);
        this.r0 = xi0Var;
        uj0Var.setItemsEnterAnimator(xi0Var);
        di.f4 f4Var = new di.f4(this);
        this.t0 = f4Var;
        setAdapter(f4Var);
    }

    public final void J(String str) {
        int i7;
        if (this.s0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        u91 u91Var = this.w0;
        tL_messages_search.peer = u91Var.getMessagesController().j1(-u91Var.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.g0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((org.telegram.messenger.gj) i5.c.h(1, arrayList)).e1();
        }
        this.s0 = true;
        i7 = ((org.telegram.ui.ActionBar.e2) u91Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_search, new a31(5, this, str));
    }

    public final void K(View view, int i7, String str, boolean z10) {
        this.e0 = str;
        FrameLayout frameLayout = this.W;
        u91 u91Var = this.w0;
        int i10 = 0;
        if (view != frameLayout) {
            if (view instanceof zz) {
                zz zzVar = (zz) view;
                zzVar.c.b(0, false);
                zzVar.h(-u91Var.a, 0L, 0L, 0L, jg.q0.k3[((n91) ((ArrayList) this.t0.b).get(i7)).b], false, str, z10);
                return;
            }
            if (view instanceof org.telegram.ui.Components.il0) {
                org.telegram.ui.Components.il0 il0Var = (org.telegram.ui.Components.il0) view;
                il0Var.a.b(0, false);
                il0Var.L = str;
                il0Var.d(false);
                return;
            }
            return;
        }
        fy0 fy0Var = this.d0;
        if (fy0Var != null) {
            org.telegram.messenger.g0.r(fy0Var);
            this.d0 = null;
        }
        this.s0 = false;
        this.p0 = false;
        ArrayList arrayList = this.f0;
        arrayList.clear();
        this.g0.clear();
        L();
        if (!TextUtils.isEmpty(str)) {
            L();
            this.o0 = true;
            this.q0.e(true, true);
            fy0 fy0Var2 = new fy0(17, this, str);
            this.d0 = fy0Var2;
            org.telegram.messenger.g0.i3(fy0Var2, 200L);
            return;
        }
        this.o0 = false;
        arrayList.clear();
        while (true) {
            ArrayList arrayList2 = u91Var.b;
            if (i10 >= arrayList2.size()) {
                L();
                return;
            }
            if (((m91) arrayList2.get(i10)).c != null) {
                arrayList.add(((m91) arrayList2.get(i10)).c);
                ((m91) arrayList2.get(i10)).c.searchQuery = null;
            }
            i10++;
        }
    }

    public final void L() {
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = 0;
        ArrayList arrayList = this.f0;
        if (!arrayList.isEmpty()) {
            int i7 = this.n0;
            int i10 = i7 + 1;
            this.n0 = i10;
            this.h0 = i7;
            this.i0 = i10;
            int size = arrayList.size() + i10;
            this.n0 = size;
            this.j0 = size;
        }
        ArrayList arrayList2 = this.g0;
        if (!arrayList2.isEmpty()) {
            int i11 = this.n0;
            int i12 = i11 + 1;
            this.n0 = i12;
            this.k0 = i11;
            this.l0 = i12;
            int size2 = arrayList2.size() + i12;
            this.n0 = size2;
            this.m0 = size2;
        }
        this.c0.f();
    }

    @Override // org.telegram.ui.yz
    public final void M(org.telegram.messenger.gj gjVar, View view, int i7) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.v0;
        if (!arrayList.remove(gjVar)) {
            arrayList.add(gjVar);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.e2) this.w0).actionBar;
            kVar.w();
        }
    }

    @Override // org.telegram.ui.yz
    public final boolean g0() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.e2) this.w0).actionBar;
        return kVar.x();
    }

    @Override // org.telegram.ui.yz
    public final void j() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.e2) this.w0).actionBar;
        kVar.R(null, null);
    }

    @Override // org.telegram.ui.yz
    public final boolean l(sz szVar) {
        if (szVar == null) {
            return false;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.v0;
            if (i7 >= arrayList.size()) {
                return false;
            }
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
            if (gjVar != null && gjVar.e1() == szVar.b && org.telegram.messenger.gj.B0(gjVar.k) == szVar.a) {
                return true;
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.yz
    public final void y(org.telegram.messenger.gj gjVar) {
        int i7;
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.gj.B0(gjVar.k);
        boolean C = org.telegram.messenger.m5.C(B0);
        u91 u91Var = this.w0;
        if (C) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.m5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            i7 = ((org.telegram.ui.ActionBar.e2) u91Var).currentAccount;
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(org.telegram.messenger.c.a(i7).a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", gjVar.e1());
        u91Var.presentFragment(new an(bundle));
    }
}
