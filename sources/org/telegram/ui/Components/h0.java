package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class h0 extends bb {
    public v51 X;
    public TLRPC.TL_channelAdminLogEventsFilter Y;
    public ArrayList Z;
    public a0.i a0;
    public final boolean b0;
    public final org.telegram.ui.o20 c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public org.telegram.ui.ya g0;

    public h0(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, a0.i iVar, boolean z10) {
        super(n2Var.getContext(), n2Var, false, true, 2, n2Var.getResourceProvider());
        this.Y = new TLRPC.TL_channelAdminLogEventsFilter();
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.v = 0.35f;
        fixNavigationBar();
        int i10 = org.telegram.ui.ActionBar.j6.i5;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider));
        K();
        this.y = true;
        if (tL_channelAdminLogEventsFilter != null) {
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.Y;
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
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.Y;
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
        if (iVar != null) {
            this.a0 = iVar.clone();
        }
        this.b0 = z10;
        this.X.N(false);
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(pr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.d.setOnItemClickListener(new t(this, 1));
        org.telegram.ui.o20 o20Var = new org.telegram.ui.o20(getContext(), this.resourcesProvider, (ll0) null);
        this.c0 = o20Var;
        o20Var.setClickable(true);
        o20Var.setOrientation(1);
        o20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        o20Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider));
        di.d dVar = new di.d(getContext(), this.resourcesProvider, true);
        dVar.e();
        dVar.g(LocaleController.getString(R.string.EventLogFilterApply), false, true);
        dVar.setOnClickListener(new g0(this, 0));
        o20Var.addView(dVar, w7.x5.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(o20Var, w7.x5.f(-2.0f, 87, i11, 0, i11, 0));
        ll0 ll0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(68.0f));
        this.d.o1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0037, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void P(h0 h0Var, View view, int i10, float f7) {
        boolean z10;
        ArrayList arrayList;
        h51 G = h0Var.X.G(i10 - 1);
        if (G == null) {
            return;
        }
        int i11 = G.a;
        if (i11 == 41 || i11 == 35) {
            if (i11 == 41) {
                if (LocaleController.isRTL) {
                }
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                if (!z10) {
                    z1Var.c(!z1Var.b(), true);
                }
                switch (G.d) {
                    case 2:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = h0Var.Y;
                            boolean b10 = z1Var.b();
                            tL_channelAdminLogEventsFilter.edit_rank = b10;
                            tL_channelAdminLogEventsFilter.leave = b10;
                            tL_channelAdminLogEventsFilter.join = b10;
                            tL_channelAdminLogEventsFilter.invite = b10;
                            tL_channelAdminLogEventsFilter.demote = b10;
                            tL_channelAdminLogEventsFilter.promote = b10;
                            if (h0Var.b0) {
                                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = h0Var.Y;
                                boolean b11 = z1Var.b();
                                tL_channelAdminLogEventsFilter2.unban = b11;
                                tL_channelAdminLogEventsFilter2.unkick = b11;
                                tL_channelAdminLogEventsFilter2.ban = b11;
                                tL_channelAdminLogEventsFilter2.kick = b11;
                                break;
                            }
                        } else {
                            h0Var.d0 = !h0Var.d0;
                            break;
                        }
                        break;
                    case 3:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = h0Var.Y;
                        boolean b12 = z1Var.b();
                        tL_channelAdminLogEventsFilter3.demote = b12;
                        tL_channelAdminLogEventsFilter3.promote = b12;
                        break;
                    case 4:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = h0Var.Y;
                        boolean b13 = z1Var.b();
                        tL_channelAdminLogEventsFilter4.unban = b13;
                        tL_channelAdminLogEventsFilter4.unkick = b13;
                        tL_channelAdminLogEventsFilter4.ban = b13;
                        tL_channelAdminLogEventsFilter4.kick = b13;
                        break;
                    case 5:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = h0Var.Y;
                        boolean b14 = z1Var.b();
                        tL_channelAdminLogEventsFilter5.join = b14;
                        tL_channelAdminLogEventsFilter5.invite = b14;
                        break;
                    case 6:
                        h0Var.Y.leave = z1Var.b();
                        break;
                    case 7:
                        h0Var.Y.edit_rank = z1Var.b();
                        break;
                    case 8:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = h0Var.Y;
                            boolean b15 = z1Var.b();
                            tL_channelAdminLogEventsFilter6.group_call = b15;
                            tL_channelAdminLogEventsFilter6.invites = b15;
                            tL_channelAdminLogEventsFilter6.settings = b15;
                            tL_channelAdminLogEventsFilter6.info = b15;
                            break;
                        } else {
                            h0Var.e0 = !h0Var.e0;
                            break;
                        }
                    case 9:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = h0Var.Y;
                        boolean b16 = z1Var.b();
                        tL_channelAdminLogEventsFilter7.settings = b16;
                        tL_channelAdminLogEventsFilter7.info = b16;
                        break;
                    case 10:
                        h0Var.Y.invites = z1Var.b();
                        break;
                    case 11:
                        h0Var.Y.group_call = z1Var.b();
                        break;
                    case 12:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter8 = h0Var.Y;
                            boolean b17 = z1Var.b();
                            tL_channelAdminLogEventsFilter8.pinned = b17;
                            tL_channelAdminLogEventsFilter8.edit = b17;
                            tL_channelAdminLogEventsFilter8.delete = b17;
                            break;
                        } else {
                            h0Var.f0 = !h0Var.f0;
                            break;
                        }
                    case 13:
                        h0Var.Y.delete = z1Var.b();
                        break;
                    case 14:
                        h0Var.Y.edit = z1Var.b();
                        break;
                    case 15:
                        h0Var.Y.pinned = z1Var.b();
                        break;
                    case 16:
                        if (h0Var.a0 == null) {
                            h0Var.a0 = new a0.i();
                        }
                        h0Var.a0.b();
                        if (z1Var.b() && (arrayList = h0Var.Z) != null) {
                            int size = arrayList.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = arrayList.get(i12);
                                i12++;
                                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) obj).peer);
                                h0Var.a0.k(MessagesController.getInstance(h0Var.currentAccount).getUser(Long.valueOf(peerDialogId)), peerDialogId);
                            }
                            break;
                        }
                        break;
                }
                h0Var.X.N(true);
            }
            z10 = false;
            org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
            if (!z10) {
            }
            switch (G.d) {
            }
            h0Var.X.N(true);
        }
        int i13 = G.d;
        if (i13 < 0) {
            org.telegram.ui.Cells.z1 z1Var3 = (org.telegram.ui.Cells.z1) view;
            int i14 = (-i13) - 1;
            if (i14 < 0 || i14 >= h0Var.Z.size()) {
                return;
            }
            long peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) h0Var.Z.get(i14)).peer);
            TLRPC.User user = MessagesController.getInstance(h0Var.currentAccount).getUser(Long.valueOf(peerDialogId2));
            if (h0Var.a0 == null) {
                h0Var.a0 = new a0.i();
            }
            if (h0Var.a0.d(peerDialogId2)) {
                h0Var.a0.l(peerDialogId2);
                z1Var3.c(false, true);
            } else {
                h0Var.a0.k(user, peerDialogId2);
                z1Var3.c(true, true);
            }
            h0Var.X.N(true);
        }
    }

    public final void Q(ArrayList arrayList, v51 v51Var) {
        if (this.Y == null) {
            return;
        }
        arrayList.add(h51.B(null));
        i2.g.p(R.string.EventLogFilterByActions, arrayList);
        boolean z10 = this.b0;
        int i10 = 0;
        int i11 = 2;
        h51 z11 = h51.z(R(0), LocaleController.getString(z10 ? R.string.EventLogFilterSectionMembers : R.string.EventLogFilterSectionSubscribers), 2);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.Y;
        int i12 = 1;
        z11.K(tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote || (z10 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) || tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join || tL_channelAdminLogEventsFilter.leave || tL_channelAdminLogEventsFilter.edit_rank);
        z11.f = !this.d0;
        z11.D = new di.o4(this, i10, 6);
        arrayList.add(z11);
        if (this.d0) {
            h51 y3 = h51.y(3, LocaleController.getString(R.string.EventLogFilterSectionAdmin));
            y3.i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.Y;
            y3.K(tL_channelAdminLogEventsFilter2.promote || tL_channelAdminLogEventsFilter2.demote);
            arrayList.add(y3);
            if (z10) {
                h51 y10 = h51.y(4, LocaleController.getString(R.string.EventLogFilterNewRestrictions));
                y10.i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.Y;
                y10.K(tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban);
                arrayList.add(y10);
            }
            h51 y11 = h51.y(5, LocaleController.getString(z10 ? R.string.EventLogFilterNewMembers : R.string.EventLogFilterNewSubscribers));
            y11.i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = this.Y;
            y11.K(tL_channelAdminLogEventsFilter4.invite || tL_channelAdminLogEventsFilter4.join);
            arrayList.add(y11);
            h51 y12 = h51.y(6, LocaleController.getString(z10 ? R.string.EventLogFilterLeavingMembers2 : R.string.EventLogFilterLeavingSubscribers2));
            y12.i = 1;
            y12.K(this.Y.leave);
            arrayList.add(y12);
            if (z10) {
                h51 y13 = h51.y(7, LocaleController.getString(R.string.EventLogFilterMembersRank));
                y13.i = 1;
                y13.K(this.Y.edit_rank);
                arrayList.add(y13);
            }
        }
        h51 z12 = h51.z(R(1), LocaleController.getString(z10 ? R.string.EventLogFilterSectionGroupSettings : R.string.EventLogFilterSectionChannelSettings), 8);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = this.Y;
        z12.K(tL_channelAdminLogEventsFilter5.info || tL_channelAdminLogEventsFilter5.settings || tL_channelAdminLogEventsFilter5.invites || tL_channelAdminLogEventsFilter5.group_call);
        z12.f = !this.e0;
        z12.D = new di.o4(this, i12, 6);
        arrayList.add(z12);
        if (this.e0) {
            h51 y14 = h51.y(9, LocaleController.getString(z10 ? R.string.EventLogFilterGroupInfo : R.string.EventLogFilterChannelInfo));
            y14.i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = this.Y;
            y14.K(tL_channelAdminLogEventsFilter6.info || tL_channelAdminLogEventsFilter6.settings);
            arrayList.add(y14);
            h51 y15 = h51.y(10, LocaleController.getString(R.string.EventLogFilterInvites));
            y15.i = 1;
            y15.K(this.Y.invites);
            arrayList.add(y15);
            h51 y16 = h51.y(11, LocaleController.getString(R.string.EventLogFilterCalls));
            y16.i = 1;
            y16.K(this.Y.group_call);
            arrayList.add(y16);
        }
        h51 z13 = h51.z(R(2), LocaleController.getString(R.string.EventLogFilterSectionMessages), 12);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = this.Y;
        z13.K(tL_channelAdminLogEventsFilter7.delete || tL_channelAdminLogEventsFilter7.edit || tL_channelAdminLogEventsFilter7.pinned);
        z13.f = !this.f0;
        z13.D = new di.o4(this, i11, 6);
        arrayList.add(z13);
        if (this.f0) {
            h51 y17 = h51.y(13, LocaleController.getString(R.string.EventLogFilterDeletedMessages));
            y17.i = 1;
            y17.K(this.Y.delete);
            arrayList.add(y17);
            h51 y18 = h51.y(14, LocaleController.getString(R.string.EventLogFilterEditedMessages));
            y18.i = 1;
            y18.K(this.Y.edit);
            arrayList.add(y18);
            h51 y19 = h51.y(15, LocaleController.getString(R.string.EventLogFilterPinnedMessages));
            y19.i = 1;
            y19.K(this.Y.pinned);
            arrayList.add(y19);
        }
        arrayList.add(h51.B(null));
        i2.g.p(R.string.EventLogFilterByAdmins, arrayList);
        h51 y20 = h51.y(16, LocaleController.getString(R.string.EventLogFilterByAdminsAll));
        a0.i iVar = this.a0;
        int m10 = iVar == null ? 0 : iVar.m();
        ArrayList arrayList2 = this.Z;
        y20.K(m10 >= (arrayList2 == null ? 0 : arrayList2.size()));
        arrayList.add(y20);
        if (this.Z != null) {
            for (int i13 = 0; i13 < this.Z.size(); i13++) {
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) this.Z.get(i13)).peer);
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                h51 h51Var = new h51(37);
                h51Var.d = (-1) - i13;
                h51Var.G = user;
                h51Var.i = 1;
                a0.i iVar2 = this.a0;
                h51Var.K(iVar2 != null && iVar2.d(peerDialogId));
                arrayList.add(h51Var);
            }
        }
    }

    public final String R(int i10) {
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.Y;
            int i11 = (tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote) ? 1 : 0;
            boolean z10 = this.b0;
            sb2.append(i11 + ((z10 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) ? 1 : 0) + ((tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join) ? 1 : 0) + (tL_channelAdminLogEventsFilter.leave ? 1 : 0) + (tL_channelAdminLogEventsFilter.edit_rank ? 1 : 0));
            sb2.append("/");
            sb2.append(z10 ? 5 : 3);
            return sb2.toString();
        }
        if (i10 != 1) {
            StringBuilder sb3 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.Y;
            sb3.append((tL_channelAdminLogEventsFilter2.delete ? 1 : 0) + (tL_channelAdminLogEventsFilter2.edit ? 1 : 0) + (tL_channelAdminLogEventsFilter2.pinned ? 1 : 0));
            sb3.append("/3");
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.Y;
        sb4.append(((tL_channelAdminLogEventsFilter3.info || tL_channelAdminLogEventsFilter3.settings) ? 1 : 0) + (tL_channelAdminLogEventsFilter3.invites ? 1 : 0) + (tL_channelAdminLogEventsFilter3.group_call ? 1 : 0));
        sb4.append("/3");
        return sb4.toString();
    }

    public final void S(ArrayList arrayList) {
        this.Z = arrayList;
        if (arrayList != null && this.a0 == null) {
            this.a0 = new a0.i();
            ArrayList arrayList2 = this.Z;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) obj).peer);
                this.a0.k(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)), peerDialogId);
            }
        }
        v51 v51Var = this.X;
        if (v51Var != null) {
            v51Var.N(true);
        }
    }

    @Override // org.telegram.ui.Components.bb, org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return !this.d.canScrollVertically(-1);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onSmoothContainerViewLayout(float f7) {
        super.onSmoothContainerViewLayout(f7);
        this.c0.setTranslationY(-f7);
    }

    @Override // org.telegram.ui.Components.bb
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(ll0Var, getContext(), this.currentAccount, 0, true, new d(this, 3), this.resourcesProvider);
        this.X = v51Var;
        return v51Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.EventLog);
    }
}
