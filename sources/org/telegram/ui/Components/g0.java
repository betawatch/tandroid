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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class g0 extends cb {
    public w61 X;
    public TLRPC.TL_channelAdminLogEventsFilter Y;
    public ArrayList Z;
    public a0.i a0;
    public final boolean b0;
    public final org.telegram.ui.o20 c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public org.telegram.ui.ab g0;

    public g0(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, a0.i iVar, boolean z10) {
        super(n2Var.getContext(), n2Var, false, true, 2, n2Var.getResourceProvider());
        this.Y = new TLRPC.TL_channelAdminLogEventsFilter();
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.v = 0.35f;
        fixNavigationBar();
        int i10 = org.telegram.ui.ActionBar.i6.i5;
        setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i10, this.resourcesProvider));
        I();
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
        jVar.o(tr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.d.setOnItemClickListener(new s(this, 1));
        org.telegram.ui.o20 o20Var = new org.telegram.ui.o20(getContext(), this.resourcesProvider, (zl0) null);
        this.c0 = o20Var;
        o20Var.setClickable(true);
        o20Var.setOrientation(1);
        o20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        o20Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i10, this.resourcesProvider));
        ci.d dVar = new ci.d(getContext(), this.resourcesProvider, true);
        dVar.e();
        dVar.g(LocaleController.getString(R.string.EventLogFilterApply), false, true);
        dVar.setOnClickListener(new f0(this, 0));
        o20Var.addView(dVar, w7.z5.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(o20Var, w7.z5.f(-2.0f, 87, i11, 0, i11, 0));
        zl0 zl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(68.0f));
        this.d.r1();
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
    public static void N(g0 g0Var, View view, int i10, float f7) {
        boolean z10;
        ArrayList arrayList;
        h61 G = g0Var.X.G(i10 - 1);
        if (G == null) {
            return;
        }
        int i11 = G.a;
        if (i11 == 41 || i11 == 35) {
            if (i11 == 41) {
                if (LocaleController.isRTL) {
                }
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                if (!z10) {
                    a2Var.c(!a2Var.b(), true);
                }
                switch (G.d) {
                    case 2:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = g0Var.Y;
                            boolean b10 = a2Var.b();
                            tL_channelAdminLogEventsFilter.edit_rank = b10;
                            tL_channelAdminLogEventsFilter.leave = b10;
                            tL_channelAdminLogEventsFilter.join = b10;
                            tL_channelAdminLogEventsFilter.invite = b10;
                            tL_channelAdminLogEventsFilter.demote = b10;
                            tL_channelAdminLogEventsFilter.promote = b10;
                            if (g0Var.b0) {
                                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = g0Var.Y;
                                boolean b11 = a2Var.b();
                                tL_channelAdminLogEventsFilter2.unban = b11;
                                tL_channelAdminLogEventsFilter2.unkick = b11;
                                tL_channelAdminLogEventsFilter2.ban = b11;
                                tL_channelAdminLogEventsFilter2.kick = b11;
                                break;
                            }
                        } else {
                            g0Var.d0 = !g0Var.d0;
                            break;
                        }
                        break;
                    case 3:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = g0Var.Y;
                        boolean b12 = a2Var.b();
                        tL_channelAdminLogEventsFilter3.demote = b12;
                        tL_channelAdminLogEventsFilter3.promote = b12;
                        break;
                    case 4:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = g0Var.Y;
                        boolean b13 = a2Var.b();
                        tL_channelAdminLogEventsFilter4.unban = b13;
                        tL_channelAdminLogEventsFilter4.unkick = b13;
                        tL_channelAdminLogEventsFilter4.ban = b13;
                        tL_channelAdminLogEventsFilter4.kick = b13;
                        break;
                    case 5:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = g0Var.Y;
                        boolean b14 = a2Var.b();
                        tL_channelAdminLogEventsFilter5.join = b14;
                        tL_channelAdminLogEventsFilter5.invite = b14;
                        break;
                    case 6:
                        g0Var.Y.leave = a2Var.b();
                        break;
                    case 7:
                        g0Var.Y.edit_rank = a2Var.b();
                        break;
                    case 8:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = g0Var.Y;
                            boolean b15 = a2Var.b();
                            tL_channelAdminLogEventsFilter6.group_call = b15;
                            tL_channelAdminLogEventsFilter6.invites = b15;
                            tL_channelAdminLogEventsFilter6.settings = b15;
                            tL_channelAdminLogEventsFilter6.info = b15;
                            break;
                        } else {
                            g0Var.e0 = !g0Var.e0;
                            break;
                        }
                    case 9:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = g0Var.Y;
                        boolean b16 = a2Var.b();
                        tL_channelAdminLogEventsFilter7.settings = b16;
                        tL_channelAdminLogEventsFilter7.info = b16;
                        break;
                    case 10:
                        g0Var.Y.invites = a2Var.b();
                        break;
                    case 11:
                        g0Var.Y.group_call = a2Var.b();
                        break;
                    case 12:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter8 = g0Var.Y;
                            boolean b17 = a2Var.b();
                            tL_channelAdminLogEventsFilter8.pinned = b17;
                            tL_channelAdminLogEventsFilter8.edit = b17;
                            tL_channelAdminLogEventsFilter8.delete = b17;
                            break;
                        } else {
                            g0Var.f0 = !g0Var.f0;
                            break;
                        }
                    case 13:
                        g0Var.Y.delete = a2Var.b();
                        break;
                    case 14:
                        g0Var.Y.edit = a2Var.b();
                        break;
                    case 15:
                        g0Var.Y.pinned = a2Var.b();
                        break;
                    case 16:
                        if (g0Var.a0 == null) {
                            g0Var.a0 = new a0.i();
                        }
                        g0Var.a0.b();
                        if (a2Var.b() && (arrayList = g0Var.Z) != null) {
                            int size = arrayList.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = arrayList.get(i12);
                                i12++;
                                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) obj).peer);
                                g0Var.a0.k(MessagesController.getInstance(g0Var.currentAccount).getUser(Long.valueOf(peerDialogId)), peerDialogId);
                            }
                            break;
                        }
                        break;
                }
                g0Var.X.N(true);
            }
            z10 = false;
            org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) view;
            if (!z10) {
            }
            switch (G.d) {
            }
            g0Var.X.N(true);
        }
        int i13 = G.d;
        if (i13 < 0) {
            org.telegram.ui.Cells.a2 a2Var3 = (org.telegram.ui.Cells.a2) view;
            int i14 = (-i13) - 1;
            if (i14 < 0 || i14 >= g0Var.Z.size()) {
                return;
            }
            long peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) g0Var.Z.get(i14)).peer);
            TLRPC.User user = MessagesController.getInstance(g0Var.currentAccount).getUser(Long.valueOf(peerDialogId2));
            if (g0Var.a0 == null) {
                g0Var.a0 = new a0.i();
            }
            if (g0Var.a0.d(peerDialogId2)) {
                g0Var.a0.l(peerDialogId2);
                a2Var3.c(false, true);
            } else {
                g0Var.a0.k(user, peerDialogId2);
                a2Var3.c(true, true);
            }
            g0Var.X.N(true);
        }
    }

    public final void O(ArrayList arrayList, w61 w61Var) {
        if (this.Y == null) {
            return;
        }
        arrayList.add(h61.C(null));
        com.google.android.gms.internal.vision.e2.n(R.string.EventLogFilterByActions, arrayList);
        boolean z10 = this.b0;
        int i10 = 0;
        int i11 = 2;
        h61 A = h61.A(P(0), LocaleController.getString(z10 ? R.string.EventLogFilterSectionMembers : R.string.EventLogFilterSectionSubscribers), 2);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.Y;
        int i12 = 1;
        A.L(tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote || (z10 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) || tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join || tL_channelAdminLogEventsFilter.leave || tL_channelAdminLogEventsFilter.edit_rank);
        A.f = !this.d0;
        A.D = new ci.n4(this, i10, 6);
        arrayList.add(A);
        if (this.d0) {
            h61 z11 = h61.z(3, LocaleController.getString(R.string.EventLogFilterSectionAdmin));
            z11.i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.Y;
            z11.L(tL_channelAdminLogEventsFilter2.promote || tL_channelAdminLogEventsFilter2.demote);
            arrayList.add(z11);
            if (z10) {
                h61 z12 = h61.z(4, LocaleController.getString(R.string.EventLogFilterNewRestrictions));
                z12.i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.Y;
                z12.L(tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban);
                arrayList.add(z12);
            }
            h61 z13 = h61.z(5, LocaleController.getString(z10 ? R.string.EventLogFilterNewMembers : R.string.EventLogFilterNewSubscribers));
            z13.i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = this.Y;
            z13.L(tL_channelAdminLogEventsFilter4.invite || tL_channelAdminLogEventsFilter4.join);
            arrayList.add(z13);
            h61 z14 = h61.z(6, LocaleController.getString(z10 ? R.string.EventLogFilterLeavingMembers2 : R.string.EventLogFilterLeavingSubscribers2));
            z14.i = 1;
            z14.L(this.Y.leave);
            arrayList.add(z14);
            if (z10) {
                h61 z15 = h61.z(7, LocaleController.getString(R.string.EventLogFilterMembersRank));
                z15.i = 1;
                z15.L(this.Y.edit_rank);
                arrayList.add(z15);
            }
        }
        h61 A2 = h61.A(P(1), LocaleController.getString(z10 ? R.string.EventLogFilterSectionGroupSettings : R.string.EventLogFilterSectionChannelSettings), 8);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = this.Y;
        A2.L(tL_channelAdminLogEventsFilter5.info || tL_channelAdminLogEventsFilter5.settings || tL_channelAdminLogEventsFilter5.invites || tL_channelAdminLogEventsFilter5.group_call);
        A2.f = !this.e0;
        A2.D = new ci.n4(this, i12, 6);
        arrayList.add(A2);
        if (this.e0) {
            h61 z16 = h61.z(9, LocaleController.getString(z10 ? R.string.EventLogFilterGroupInfo : R.string.EventLogFilterChannelInfo));
            z16.i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = this.Y;
            z16.L(tL_channelAdminLogEventsFilter6.info || tL_channelAdminLogEventsFilter6.settings);
            arrayList.add(z16);
            h61 z17 = h61.z(10, LocaleController.getString(R.string.EventLogFilterInvites));
            z17.i = 1;
            z17.L(this.Y.invites);
            arrayList.add(z17);
            h61 z18 = h61.z(11, LocaleController.getString(R.string.EventLogFilterCalls));
            z18.i = 1;
            z18.L(this.Y.group_call);
            arrayList.add(z18);
        }
        h61 A3 = h61.A(P(2), LocaleController.getString(R.string.EventLogFilterSectionMessages), 12);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = this.Y;
        A3.L(tL_channelAdminLogEventsFilter7.delete || tL_channelAdminLogEventsFilter7.edit || tL_channelAdminLogEventsFilter7.pinned);
        A3.f = !this.f0;
        A3.D = new ci.n4(this, i11, 6);
        arrayList.add(A3);
        if (this.f0) {
            h61 z19 = h61.z(13, LocaleController.getString(R.string.EventLogFilterDeletedMessages));
            z19.i = 1;
            z19.L(this.Y.delete);
            arrayList.add(z19);
            h61 z20 = h61.z(14, LocaleController.getString(R.string.EventLogFilterEditedMessages));
            z20.i = 1;
            z20.L(this.Y.edit);
            arrayList.add(z20);
            h61 z21 = h61.z(15, LocaleController.getString(R.string.EventLogFilterPinnedMessages));
            z21.i = 1;
            z21.L(this.Y.pinned);
            arrayList.add(z21);
        }
        arrayList.add(h61.C(null));
        com.google.android.gms.internal.vision.e2.n(R.string.EventLogFilterByAdmins, arrayList);
        h61 z22 = h61.z(16, LocaleController.getString(R.string.EventLogFilterByAdminsAll));
        a0.i iVar = this.a0;
        int m10 = iVar == null ? 0 : iVar.m();
        ArrayList arrayList2 = this.Z;
        z22.L(m10 >= (arrayList2 == null ? 0 : arrayList2.size()));
        arrayList.add(z22);
        if (this.Z != null) {
            for (int i13 = 0; i13 < this.Z.size(); i13++) {
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) this.Z.get(i13)).peer);
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                h61 h61Var = new h61(37);
                h61Var.d = (-1) - i13;
                h61Var.G = user;
                h61Var.i = 1;
                a0.i iVar2 = this.a0;
                h61Var.L(iVar2 != null && iVar2.d(peerDialogId));
                arrayList.add(h61Var);
            }
        }
    }

    public final String P(int i10) {
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

    public final void Q(ArrayList arrayList) {
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
        w61 w61Var = this.X;
        if (w61Var != null) {
            w61Var.N(true);
        }
    }

    @Override // org.telegram.ui.Components.cb, org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return !this.d.canScrollVertically(-1);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onSmoothContainerViewLayout(float f7) {
        super.onSmoothContainerViewLayout(f7);
        this.c0.setTranslationY(-f7);
    }

    @Override // org.telegram.ui.Components.cb
    public final yl0 v(zl0 zl0Var) {
        w61 w61Var = new w61(zl0Var, getContext(), this.currentAccount, 0, true, new d(this, 3), this.resourcesProvider);
        this.X = w61Var;
        return w61Var;
    }

    @Override // org.telegram.ui.Components.cb
    public final CharSequence y() {
        return LocaleController.getString(R.string.EventLog);
    }
}
