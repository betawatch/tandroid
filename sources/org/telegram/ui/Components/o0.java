package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class o0 extends sa {
    public z41 T1;
    public TLRPC.TL_channelAdminLogEventsFilter U1;
    public ArrayList V1;
    public a0.h W1;
    public final boolean X1;
    public final ah.a Y1;
    public boolean Z1;
    public boolean a2;
    public boolean b2;
    public org.telegram.ui.ra c2;
    public int d2;

    public o0(org.telegram.ui.ActionBar.h2 h2Var, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, a0.h hVar, boolean z10) {
        super(h2Var.getContext(), h2Var, false, true, 2, h2Var.getResourceProvider());
        this.U1 = new TLRPC.TL_channelAdminLogEventsFilter();
        int i7 = 0;
        this.Z1 = false;
        this.a2 = false;
        this.b2 = false;
        this.v1 = 0.35f;
        O();
        int i10 = org.telegram.ui.ActionBar.n6.i5;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i10, this.J0);
        this.d2 = w02;
        v0(w02);
        Z0();
        int i11 = 1;
        this.y1 = true;
        if (tL_channelAdminLogEventsFilter != null) {
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.U1;
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
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.U1;
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
            this.W1 = hVar.clone();
        }
        this.X1 = z10;
        this.T1.O(false);
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(lr.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        this.o1.setOnItemClickListener(new b0(this, i11));
        ah.a aVar = new ah.a(getContext(), this.J0, (ck0) null);
        this.Y1 = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.u6.h(i10, aVar, this.J0);
        hi.d dVar = new hi.d(getContext(), this.J0, true);
        dVar.f();
        dVar.i(org.telegram.messenger.gd.M0(2131750992, null), false, true);
        dVar.setOnClickListener(new n0(this, i7));
        aVar.addView(dVar, c8.ma.r(-1, 48, 87));
        ViewGroup viewGroup = this.b;
        int i12 = this.u0;
        viewGroup.addView(aVar, c8.ma.f(-2.0f, -1, 87, i12, 0, i12, 0));
        ck0 ck0Var = this.o1;
        int i13 = this.u0;
        ck0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(68.0f));
        this.o1.r1();
    }

    @Override // org.telegram.ui.Components.sa, org.telegram.ui.ActionBar.x2
    public final boolean G() {
        return !this.o1.canScrollVertically(-1);
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(ck0Var, getContext(), this.a, 0, true, new d(this, 3), this.J0);
        this.T1 = z41Var;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return org.telegram.messenger.gd.M0(2131751068, null);
    }

    public final String e1(int i7) {
        if (i7 == 0) {
            StringBuilder sb2 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.U1;
            int i10 = (tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote) ? 1 : 0;
            boolean z10 = this.X1;
            sb2.append(i10 + ((z10 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) ? 1 : 0) + ((tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join) ? 1 : 0) + (tL_channelAdminLogEventsFilter.leave ? 1 : 0) + (tL_channelAdminLogEventsFilter.edit_rank ? 1 : 0));
            sb2.append("/");
            sb2.append(z10 ? 5 : 3);
            return sb2.toString();
        }
        if (i7 != 1) {
            StringBuilder sb3 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.U1;
            sb3.append((tL_channelAdminLogEventsFilter2.delete ? 1 : 0) + (tL_channelAdminLogEventsFilter2.edit ? 1 : 0) + (tL_channelAdminLogEventsFilter2.pinned ? 1 : 0));
            sb3.append("/3");
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.U1;
        sb4.append(((tL_channelAdminLogEventsFilter3.info || tL_channelAdminLogEventsFilter3.settings) ? 1 : 0) + (tL_channelAdminLogEventsFilter3.invites ? 1 : 0) + (tL_channelAdminLogEventsFilter3.group_call ? 1 : 0));
        sb4.append("/3");
        return sb4.toString();
    }

    public final void f1(ArrayList arrayList) {
        this.V1 = arrayList;
        if (arrayList != null && this.W1 == null) {
            this.W1 = new a0.h();
            ArrayList arrayList2 = this.V1;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                long o4 = org.telegram.messenger.n5.o(((TLRPC.ChannelParticipant) obj).peer);
                this.W1.k(org.telegram.messenger.mp.u1(this.a).c2(Long.valueOf(o4)), o4);
            }
        }
        z41 z41Var = this.T1;
        if (z41Var != null) {
            z41Var.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void q0(float f10) {
        super.q0(f10);
        this.Y1.setTranslationY(-f10);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i5, this.J0);
            if (w02 != this.d2) {
                this.d2 = w02;
                v0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
