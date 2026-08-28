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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g0 extends sa {
    public z41 T;
    public TLRPC.TL_channelAdminLogEventsFilter U;
    public ArrayList V;
    public a0.h W;
    public final boolean X;
    public final fg.a Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public org.telegram.ui.ta c0;

    public g0(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, a0.h hVar, boolean z10) {
        super(o2Var.getContext(), o2Var, false, false, false, false, true, 2, o2Var.getResourceProvider());
        this.U = new TLRPC.TL_channelAdminLogEventsFilter();
        this.Z = false;
        this.a0 = false;
        this.b0 = false;
        this.v = 0.35f;
        fixNavigationBar();
        int i9 = org.telegram.ui.ActionBar.f6.i5;
        setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i9, this.resourcesProvider));
        J();
        this.y = true;
        if (tL_channelAdminLogEventsFilter != null) {
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.U;
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
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.U;
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
            this.W = hVar.clone();
        }
        this.X = z10;
        this.T.N(false);
        f2.n nVar = new f2.n();
        nVar.m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        this.d.setOnItemClickListener(new s(this, 1));
        fg.a aVar = new fg.a(getContext(), this.resourcesProvider, (wk0) null);
        this.Y = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i9, this.resourcesProvider));
        kh.d dVar = new kh.d(getContext(), this.resourcesProvider, true);
        dVar.e();
        dVar.g(LocaleController.getString(R.string.EventLogFilterApply), false, true);
        dVar.setOnClickListener(new f0(this, 0));
        aVar.addView(dVar, g7.e6.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i10 = this.backgroundPaddingLeft;
        viewGroup.addView(aVar, g7.e6.f(-2.0f, 87, i10, 0, i10, 0));
        wk0 wk0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
        this.d.p1();
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
    public static void O(g0 g0Var, View view, int i9, float f10) {
        boolean z10;
        ArrayList arrayList;
        l41 G = g0Var.T.G(i9 - 1);
        if (G == null) {
            return;
        }
        int i10 = G.a;
        if (i10 == 41 || i10 == 35) {
            if (i10 == 41) {
                if (LocaleController.isRTL) {
                }
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                if (!z10) {
                    z1Var.c(!z1Var.b(), true);
                }
                switch (G.d) {
                    case 2:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = g0Var.U;
                            boolean b10 = z1Var.b();
                            tL_channelAdminLogEventsFilter.edit_rank = b10;
                            tL_channelAdminLogEventsFilter.leave = b10;
                            tL_channelAdminLogEventsFilter.join = b10;
                            tL_channelAdminLogEventsFilter.invite = b10;
                            tL_channelAdminLogEventsFilter.demote = b10;
                            tL_channelAdminLogEventsFilter.promote = b10;
                            if (g0Var.X) {
                                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = g0Var.U;
                                boolean b11 = z1Var.b();
                                tL_channelAdminLogEventsFilter2.unban = b11;
                                tL_channelAdminLogEventsFilter2.unkick = b11;
                                tL_channelAdminLogEventsFilter2.ban = b11;
                                tL_channelAdminLogEventsFilter2.kick = b11;
                                break;
                            }
                        } else {
                            g0Var.Z = !g0Var.Z;
                            break;
                        }
                        break;
                    case 3:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = g0Var.U;
                        boolean b12 = z1Var.b();
                        tL_channelAdminLogEventsFilter3.demote = b12;
                        tL_channelAdminLogEventsFilter3.promote = b12;
                        break;
                    case 4:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = g0Var.U;
                        boolean b13 = z1Var.b();
                        tL_channelAdminLogEventsFilter4.unban = b13;
                        tL_channelAdminLogEventsFilter4.unkick = b13;
                        tL_channelAdminLogEventsFilter4.ban = b13;
                        tL_channelAdminLogEventsFilter4.kick = b13;
                        break;
                    case 5:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = g0Var.U;
                        boolean b14 = z1Var.b();
                        tL_channelAdminLogEventsFilter5.join = b14;
                        tL_channelAdminLogEventsFilter5.invite = b14;
                        break;
                    case 6:
                        g0Var.U.leave = z1Var.b();
                        break;
                    case 7:
                        g0Var.U.edit_rank = z1Var.b();
                        break;
                    case 8:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = g0Var.U;
                            boolean b15 = z1Var.b();
                            tL_channelAdminLogEventsFilter6.group_call = b15;
                            tL_channelAdminLogEventsFilter6.invites = b15;
                            tL_channelAdminLogEventsFilter6.settings = b15;
                            tL_channelAdminLogEventsFilter6.info = b15;
                            break;
                        } else {
                            g0Var.a0 = !g0Var.a0;
                            break;
                        }
                    case 9:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = g0Var.U;
                        boolean b16 = z1Var.b();
                        tL_channelAdminLogEventsFilter7.settings = b16;
                        tL_channelAdminLogEventsFilter7.info = b16;
                        break;
                    case 10:
                        g0Var.U.invites = z1Var.b();
                        break;
                    case 11:
                        g0Var.U.group_call = z1Var.b();
                        break;
                    case 12:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter8 = g0Var.U;
                            boolean b17 = z1Var.b();
                            tL_channelAdminLogEventsFilter8.pinned = b17;
                            tL_channelAdminLogEventsFilter8.edit = b17;
                            tL_channelAdminLogEventsFilter8.delete = b17;
                            break;
                        } else {
                            g0Var.b0 = !g0Var.b0;
                            break;
                        }
                    case 13:
                        g0Var.U.delete = z1Var.b();
                        break;
                    case 14:
                        g0Var.U.edit = z1Var.b();
                        break;
                    case 15:
                        g0Var.U.pinned = z1Var.b();
                        break;
                    case 16:
                        if (g0Var.W == null) {
                            g0Var.W = new a0.h();
                        }
                        g0Var.W.b();
                        if (z1Var.b() && (arrayList = g0Var.V) != null) {
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) obj).peer);
                                g0Var.W.k(MessagesController.getInstance(g0Var.currentAccount).getUser(Long.valueOf(peerDialogId)), peerDialogId);
                            }
                            break;
                        }
                        break;
                }
                g0Var.T.N(true);
            }
            z10 = false;
            org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
            if (!z10) {
            }
            switch (G.d) {
            }
            g0Var.T.N(true);
        }
        int i12 = G.d;
        if (i12 < 0) {
            org.telegram.ui.Cells.z1 z1Var3 = (org.telegram.ui.Cells.z1) view;
            int i13 = (-i12) - 1;
            if (i13 < 0 || i13 >= g0Var.V.size()) {
                return;
            }
            long peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) g0Var.V.get(i13)).peer);
            TLRPC.User user = MessagesController.getInstance(g0Var.currentAccount).getUser(Long.valueOf(peerDialogId2));
            if (g0Var.W == null) {
                g0Var.W = new a0.h();
            }
            if (g0Var.W.d(peerDialogId2)) {
                g0Var.W.l(peerDialogId2);
                z1Var3.c(false, true);
            } else {
                g0Var.W.k(user, peerDialogId2);
                z1Var3.c(true, true);
            }
            g0Var.T.N(true);
        }
    }

    public final void P(ArrayList arrayList, z41 z41Var) {
        if (this.U == null) {
            return;
        }
        arrayList.add(l41.B(null));
        org.telegram.ui.Cells.j2.l(R.string.EventLogFilterByActions, arrayList);
        boolean z10 = this.X;
        int i9 = 0;
        int i10 = 2;
        l41 z11 = l41.z(Q(0), LocaleController.getString(z10 ? R.string.EventLogFilterSectionMembers : R.string.EventLogFilterSectionSubscribers), 2);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.U;
        int i11 = 1;
        z11.K(tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote || (z10 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) || tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join || tL_channelAdminLogEventsFilter.leave || tL_channelAdminLogEventsFilter.edit_rank);
        z11.f = !this.Z;
        z11.D = new gh.z0(this, i9, 5);
        arrayList.add(z11);
        if (this.Z) {
            l41 y10 = l41.y(3, LocaleController.getString(R.string.EventLogFilterSectionAdmin));
            y10.i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.U;
            y10.K(tL_channelAdminLogEventsFilter2.promote || tL_channelAdminLogEventsFilter2.demote);
            arrayList.add(y10);
            if (z10) {
                l41 y11 = l41.y(4, LocaleController.getString(R.string.EventLogFilterNewRestrictions));
                y11.i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.U;
                y11.K(tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban);
                arrayList.add(y11);
            }
            l41 y12 = l41.y(5, LocaleController.getString(z10 ? R.string.EventLogFilterNewMembers : R.string.EventLogFilterNewSubscribers));
            y12.i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = this.U;
            y12.K(tL_channelAdminLogEventsFilter4.invite || tL_channelAdminLogEventsFilter4.join);
            arrayList.add(y12);
            l41 y13 = l41.y(6, LocaleController.getString(z10 ? R.string.EventLogFilterLeavingMembers2 : R.string.EventLogFilterLeavingSubscribers2));
            y13.i = 1;
            y13.K(this.U.leave);
            arrayList.add(y13);
            if (z10) {
                l41 y14 = l41.y(7, LocaleController.getString(R.string.EventLogFilterMembersRank));
                y14.i = 1;
                y14.K(this.U.edit_rank);
                arrayList.add(y14);
            }
        }
        l41 z12 = l41.z(Q(1), LocaleController.getString(z10 ? R.string.EventLogFilterSectionGroupSettings : R.string.EventLogFilterSectionChannelSettings), 8);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = this.U;
        z12.K(tL_channelAdminLogEventsFilter5.info || tL_channelAdminLogEventsFilter5.settings || tL_channelAdminLogEventsFilter5.invites || tL_channelAdminLogEventsFilter5.group_call);
        z12.f = !this.a0;
        z12.D = new gh.z0(this, i11, 5);
        arrayList.add(z12);
        if (this.a0) {
            l41 y15 = l41.y(9, LocaleController.getString(z10 ? R.string.EventLogFilterGroupInfo : R.string.EventLogFilterChannelInfo));
            y15.i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = this.U;
            y15.K(tL_channelAdminLogEventsFilter6.info || tL_channelAdminLogEventsFilter6.settings);
            arrayList.add(y15);
            l41 y16 = l41.y(10, LocaleController.getString(R.string.EventLogFilterInvites));
            y16.i = 1;
            y16.K(this.U.invites);
            arrayList.add(y16);
            l41 y17 = l41.y(11, LocaleController.getString(R.string.EventLogFilterCalls));
            y17.i = 1;
            y17.K(this.U.group_call);
            arrayList.add(y17);
        }
        l41 z13 = l41.z(Q(2), LocaleController.getString(R.string.EventLogFilterSectionMessages), 12);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = this.U;
        z13.K(tL_channelAdminLogEventsFilter7.delete || tL_channelAdminLogEventsFilter7.edit || tL_channelAdminLogEventsFilter7.pinned);
        z13.f = !this.b0;
        z13.D = new gh.z0(this, i10, 5);
        arrayList.add(z13);
        if (this.b0) {
            l41 y18 = l41.y(13, LocaleController.getString(R.string.EventLogFilterDeletedMessages));
            y18.i = 1;
            y18.K(this.U.delete);
            arrayList.add(y18);
            l41 y19 = l41.y(14, LocaleController.getString(R.string.EventLogFilterEditedMessages));
            y19.i = 1;
            y19.K(this.U.edit);
            arrayList.add(y19);
            l41 y20 = l41.y(15, LocaleController.getString(R.string.EventLogFilterPinnedMessages));
            y20.i = 1;
            y20.K(this.U.pinned);
            arrayList.add(y20);
        }
        arrayList.add(l41.B(null));
        org.telegram.ui.Cells.j2.l(R.string.EventLogFilterByAdmins, arrayList);
        l41 y21 = l41.y(16, LocaleController.getString(R.string.EventLogFilterByAdminsAll));
        a0.h hVar = this.W;
        int m10 = hVar == null ? 0 : hVar.m();
        ArrayList arrayList2 = this.V;
        y21.K(m10 >= (arrayList2 == null ? 0 : arrayList2.size()));
        arrayList.add(y21);
        if (this.V != null) {
            for (int i12 = 0; i12 < this.V.size(); i12++) {
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) this.V.get(i12)).peer);
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                l41 l41Var = new l41(37);
                l41Var.d = (-1) - i12;
                l41Var.G = user;
                l41Var.i = 1;
                a0.h hVar2 = this.W;
                l41Var.K(hVar2 != null && hVar2.d(peerDialogId));
                arrayList.add(l41Var);
            }
        }
    }

    public final String Q(int i9) {
        if (i9 == 0) {
            StringBuilder sb2 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.U;
            int i10 = (tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote) ? 1 : 0;
            boolean z10 = this.X;
            sb2.append(i10 + ((z10 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) ? 1 : 0) + ((tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join) ? 1 : 0) + (tL_channelAdminLogEventsFilter.leave ? 1 : 0) + (tL_channelAdminLogEventsFilter.edit_rank ? 1 : 0));
            sb2.append("/");
            sb2.append(z10 ? 5 : 3);
            return sb2.toString();
        }
        if (i9 != 1) {
            StringBuilder sb3 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.U;
            sb3.append((tL_channelAdminLogEventsFilter2.delete ? 1 : 0) + (tL_channelAdminLogEventsFilter2.edit ? 1 : 0) + (tL_channelAdminLogEventsFilter2.pinned ? 1 : 0));
            sb3.append("/3");
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.U;
        sb4.append(((tL_channelAdminLogEventsFilter3.info || tL_channelAdminLogEventsFilter3.settings) ? 1 : 0) + (tL_channelAdminLogEventsFilter3.invites ? 1 : 0) + (tL_channelAdminLogEventsFilter3.group_call ? 1 : 0));
        sb4.append("/3");
        return sb4.toString();
    }

    public final void R(ArrayList arrayList) {
        this.V = arrayList;
        if (arrayList != null && this.W == null) {
            this.W = new a0.h();
            ArrayList arrayList2 = this.V;
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) obj).peer);
                this.W.k(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)), peerDialogId);
            }
        }
        z41 z41Var = this.T;
        if (z41Var != null) {
            z41Var.N(true);
        }
    }

    @Override // org.telegram.ui.Components.sa, org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return !this.d.canScrollVertically(-1);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onSmoothContainerViewLayout(float f10) {
        super.onSmoothContainerViewLayout(f10);
        this.Y.setTranslationY(-f10);
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.currentAccount, 0, true, new d(this, 3), this.resourcesProvider);
        this.T = z41Var;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.EventLog);
    }
}
