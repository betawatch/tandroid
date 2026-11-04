package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g0 extends ma {
    public f41 Q1;
    public TLRPC.TL_channelAdminLogEventsFilter R1;
    public ArrayList S1;
    public a0.h T1;
    public final boolean U1;
    public final bh.a V1;
    public boolean W1;
    public boolean X1;
    public boolean Y1;
    public org.telegram.ui.qa Z1;
    public int a2;

    public g0(org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, a0.h hVar, boolean z10) {
        super(d2Var.getContext(), d2Var, false, true, 2, d2Var.getResourceProvider());
        this.R1 = new TLRPC.TL_channelAdminLogEventsFilter();
        int i3 = 0;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = false;
        this.s1 = 0.35f;
        N();
        int i10 = org.telegram.ui.ActionBar.k6.i5;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, this.J0);
        this.a2 = w02;
        v0(w02);
        Y0();
        int i11 = 1;
        this.v1 = true;
        if (tL_channelAdminLogEventsFilter != null) {
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.R1;
            tL_channelAdminLogEventsFilter2.join = tL_channelAdminLogEventsFilter.join;
            tL_channelAdminLogEventsFilter2.leave = tL_channelAdminLogEventsFilter.leave;
            tL_channelAdminLogEventsFilter2.edit_rank = tL_channelAdminLogEventsFilter.edit_rank;
            tL_channelAdminLogEventsFilter2.invite = tL_channelAdminLogEventsFilter.invite;
            tL_channelAdminLogEventsFilter2.ban = tL_channelAdminLogEventsFilter.ban;
            tL_channelAdminLogEventsFilter2.unban = tL_channelAdminLogEventsFilter.unban;
            tL_channelAdminLogEventsFilter2.kick = tL_channelAdminLogEventsFilter.kick;
            tL_channelAdminLogEventsFilter2.unkick = tL_channelAdminLogEventsFilter.unkick;
            tL_channelAdminLogEventsFilter2.promote = tL_channelAdminLogEventsFilter.promote;
            tL_channelAdminLogEventsFilter2.demote = tL_channelAdminLogEventsFilter.demote;
            tL_channelAdminLogEventsFilter2.info = tL_channelAdminLogEventsFilter.info;
            tL_channelAdminLogEventsFilter2.settings = tL_channelAdminLogEventsFilter.settings;
            tL_channelAdminLogEventsFilter2.pinned = tL_channelAdminLogEventsFilter.pinned;
            tL_channelAdminLogEventsFilter2.edit = tL_channelAdminLogEventsFilter.edit;
            tL_channelAdminLogEventsFilter2.delete = tL_channelAdminLogEventsFilter.delete;
            tL_channelAdminLogEventsFilter2.group_call = tL_channelAdminLogEventsFilter.group_call;
            tL_channelAdminLogEventsFilter2.invites = tL_channelAdminLogEventsFilter.invites;
        } else {
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.R1;
            tL_channelAdminLogEventsFilter3.join = true;
            tL_channelAdminLogEventsFilter3.leave = true;
            tL_channelAdminLogEventsFilter3.edit_rank = true;
            tL_channelAdminLogEventsFilter3.invite = true;
            tL_channelAdminLogEventsFilter3.ban = true;
            tL_channelAdminLogEventsFilter3.unban = true;
            tL_channelAdminLogEventsFilter3.kick = true;
            tL_channelAdminLogEventsFilter3.unkick = true;
            tL_channelAdminLogEventsFilter3.promote = true;
            tL_channelAdminLogEventsFilter3.demote = true;
            tL_channelAdminLogEventsFilter3.info = true;
            tL_channelAdminLogEventsFilter3.settings = true;
            tL_channelAdminLogEventsFilter3.pinned = true;
            tL_channelAdminLogEventsFilter3.edit = true;
            tL_channelAdminLogEventsFilter3.delete = true;
            tL_channelAdminLogEventsFilter3.group_call = true;
            tL_channelAdminLogEventsFilter3.invites = true;
        }
        if (hVar != null) {
            this.T1 = hVar.clone();
        }
        this.U1 = z10;
        this.Q1.O(false);
        u4.k kVar = new u4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.l1.setItemAnimator(kVar);
        this.l1.setOnItemClickListener(new t(this, i11));
        bh.a aVar = new bh.a(getContext(), this.J0, (tj0) null);
        this.V1 = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.r6.i(i10, aVar, this.J0);
        gi.d dVar = new gi.d(getContext(), this.J0, true);
        dVar.f();
        dVar.i(org.telegram.messenger.bd.M0(2131751004, null), false, true);
        dVar.setOnClickListener(new f0(this, i3));
        aVar.addView(dVar, b8.mf.r(-1, 48, 87));
        ViewGroup viewGroup = this.b;
        int i12 = this.u0;
        viewGroup.addView(aVar, b8.mf.f(-2.0f, -1, 87, i12, 0, i12, 0));
        tj0 tj0Var = this.l1;
        int i13 = this.u0;
        tj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(68.0f));
        this.l1.r1();
    }

    @Override // org.telegram.ui.Components.ma, org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return !this.l1.canScrollVertically(-1);
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.a, 0, true, new e(this, 3), this.J0);
        this.Q1 = f41Var;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return org.telegram.messenger.bd.M0(2131751080, null);
    }

    public final String d1(int i3) {
        if (i3 == 0) {
            StringBuilder sb2 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.R1;
            int i10 = (tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote) ? 1 : 0;
            boolean z10 = this.U1;
            sb2.append(i10 + ((z10 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) ? 1 : 0) + ((tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join) ? 1 : 0) + (tL_channelAdminLogEventsFilter.leave ? 1 : 0) + (tL_channelAdminLogEventsFilter.edit_rank ? 1 : 0));
            sb2.append("/");
            sb2.append(z10 ? 5 : 3);
            return sb2.toString();
        }
        if (i3 != 1) {
            StringBuilder sb3 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.R1;
            sb3.append((tL_channelAdminLogEventsFilter2.delete ? 1 : 0) + (tL_channelAdminLogEventsFilter2.edit ? 1 : 0) + (tL_channelAdminLogEventsFilter2.pinned ? 1 : 0));
            sb3.append("/3");
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.R1;
        sb4.append(((tL_channelAdminLogEventsFilter3.info || tL_channelAdminLogEventsFilter3.settings) ? 1 : 0) + (tL_channelAdminLogEventsFilter3.invites ? 1 : 0) + (tL_channelAdminLogEventsFilter3.group_call ? 1 : 0));
        sb4.append("/3");
        return sb4.toString();
    }

    public final void e1(ArrayList arrayList) {
        this.S1 = arrayList;
        if (arrayList != null && this.T1 == null) {
            this.T1 = new a0.h();
            ArrayList arrayList2 = this.S1;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                long o10 = org.telegram.messenger.m5.o(((TLRPC.ChannelParticipant) obj).peer);
                this.T1.k(org.telegram.messenger.hp.s1(this.a).a2(Long.valueOf(o10)), o10);
            }
        }
        f41 f41Var = this.Q1;
        if (f41Var != null) {
            f41Var.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void q0(float f10) {
        super.q0(f10);
        this.V1.setTranslationY(-f10);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, this.J0);
            if (w02 != this.a2) {
                this.a2 = w02;
                v0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
