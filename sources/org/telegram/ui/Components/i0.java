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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i0 extends xa {
    public k51 T;
    public TLRPC.TL_channelAdminLogEventsFilter U;
    public ArrayList V;
    public a0.h W;
    public final boolean X;
    public final ig.a Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public org.telegram.ui.sa c0;

    public i0(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, a0.h hVar, boolean z10) {
        super(o2Var.getContext(), o2Var, false, false, false, false, true, 2, o2Var.getResourceProvider());
        this.U = new TLRPC.TL_channelAdminLogEventsFilter();
        this.Z = false;
        this.a0 = false;
        this.b0 = false;
        this.v = 0.35f;
        fixNavigationBar();
        int i10 = org.telegram.ui.ActionBar.g6.i5;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider));
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
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.d.setOnItemClickListener(new u(this, 1));
        ig.a aVar = new ig.a(getContext(), this.resourcesProvider, (jl0) null);
        this.Y = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider));
        nh.d dVar = new nh.d(getContext(), this.resourcesProvider, true);
        dVar.e();
        dVar.g(LocaleController.getString(R.string.EventLogFilterApply), false, true);
        dVar.setOnClickListener(new h0(this, 0));
        aVar.addView(dVar, i7.f6.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(aVar, i7.f6.f(-2.0f, 87, i11, 0, i11, 0));
        jl0 jl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(68.0f));
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
    public static void P(i0 i0Var, View view, int i10, float f9) {
        boolean z10;
        ArrayList arrayList;
        w41 G = i0Var.T.G(i10 - 1);
        if (G == null) {
            return;
        }
        int i11 = G.a;
        if (i11 == 41 || i11 == 35) {
            if (i11 == 41) {
                if (LocaleController.isRTL) {
                }
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                if (!z10) {
                    y1Var.c(!y1Var.b(), true);
                }
                switch (G.d) {
                    case 2:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = i0Var.U;
                            boolean b10 = y1Var.b();
                            tL_channelAdminLogEventsFilter.edit_rank = b10;
                            tL_channelAdminLogEventsFilter.leave = b10;
                            tL_channelAdminLogEventsFilter.join = b10;
                            tL_channelAdminLogEventsFilter.invite = b10;
                            tL_channelAdminLogEventsFilter.demote = b10;
                            tL_channelAdminLogEventsFilter.promote = b10;
                            if (i0Var.X) {
                                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = i0Var.U;
                                boolean b11 = y1Var.b();
                                tL_channelAdminLogEventsFilter2.unban = b11;
                                tL_channelAdminLogEventsFilter2.unkick = b11;
                                tL_channelAdminLogEventsFilter2.ban = b11;
                                tL_channelAdminLogEventsFilter2.kick = b11;
                                break;
                            }
                        } else {
                            i0Var.Z = !i0Var.Z;
                            break;
                        }
                        break;
                    case 3:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = i0Var.U;
                        boolean b12 = y1Var.b();
                        tL_channelAdminLogEventsFilter3.demote = b12;
                        tL_channelAdminLogEventsFilter3.promote = b12;
                        break;
                    case 4:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = i0Var.U;
                        boolean b13 = y1Var.b();
                        tL_channelAdminLogEventsFilter4.unban = b13;
                        tL_channelAdminLogEventsFilter4.unkick = b13;
                        tL_channelAdminLogEventsFilter4.ban = b13;
                        tL_channelAdminLogEventsFilter4.kick = b13;
                        break;
                    case 5:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = i0Var.U;
                        boolean b14 = y1Var.b();
                        tL_channelAdminLogEventsFilter5.join = b14;
                        tL_channelAdminLogEventsFilter5.invite = b14;
                        break;
                    case 6:
                        i0Var.U.leave = y1Var.b();
                        break;
                    case 7:
                        i0Var.U.edit_rank = y1Var.b();
                        break;
                    case 8:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = i0Var.U;
                            boolean b15 = y1Var.b();
                            tL_channelAdminLogEventsFilter6.group_call = b15;
                            tL_channelAdminLogEventsFilter6.invites = b15;
                            tL_channelAdminLogEventsFilter6.settings = b15;
                            tL_channelAdminLogEventsFilter6.info = b15;
                            break;
                        } else {
                            i0Var.a0 = !i0Var.a0;
                            break;
                        }
                    case 9:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = i0Var.U;
                        boolean b16 = y1Var.b();
                        tL_channelAdminLogEventsFilter7.settings = b16;
                        tL_channelAdminLogEventsFilter7.info = b16;
                        break;
                    case 10:
                        i0Var.U.invites = y1Var.b();
                        break;
                    case 11:
                        i0Var.U.group_call = y1Var.b();
                        break;
                    case 12:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter8 = i0Var.U;
                            boolean b17 = y1Var.b();
                            tL_channelAdminLogEventsFilter8.pinned = b17;
                            tL_channelAdminLogEventsFilter8.edit = b17;
                            tL_channelAdminLogEventsFilter8.delete = b17;
                            break;
                        } else {
                            i0Var.b0 = !i0Var.b0;
                            break;
                        }
                    case 13:
                        i0Var.U.delete = y1Var.b();
                        break;
                    case 14:
                        i0Var.U.edit = y1Var.b();
                        break;
                    case 15:
                        i0Var.U.pinned = y1Var.b();
                        break;
                    case 16:
                        if (i0Var.W == null) {
                            i0Var.W = new a0.h();
                        }
                        i0Var.W.b();
                        if (y1Var.b() && (arrayList = i0Var.V) != null) {
                            int size = arrayList.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = arrayList.get(i12);
                                i12++;
                                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) obj).peer);
                                i0Var.W.k(MessagesController.getInstance(i0Var.currentAccount).getUser(Long.valueOf(peerDialogId)), peerDialogId);
                            }
                            break;
                        }
                        break;
                }
                i0Var.T.N(true);
            }
            z10 = false;
            org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
            if (!z10) {
            }
            switch (G.d) {
            }
            i0Var.T.N(true);
        }
        int i13 = G.d;
        if (i13 < 0) {
            org.telegram.ui.Cells.y1 y1Var3 = (org.telegram.ui.Cells.y1) view;
            int i14 = (-i13) - 1;
            if (i14 < 0 || i14 >= i0Var.V.size()) {
                return;
            }
            long peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) i0Var.V.get(i14)).peer);
            TLRPC.User user = MessagesController.getInstance(i0Var.currentAccount).getUser(Long.valueOf(peerDialogId2));
            if (i0Var.W == null) {
                i0Var.W = new a0.h();
            }
            if (i0Var.W.d(peerDialogId2)) {
                i0Var.W.l(peerDialogId2);
                y1Var3.c(false, true);
            } else {
                i0Var.W.k(user, peerDialogId2);
                y1Var3.c(true, true);
            }
            i0Var.T.N(true);
        }
    }

    public final void Q(ArrayList arrayList, k51 k51Var) {
        if (this.U == null) {
            return;
        }
        arrayList.add(w41.B(null));
        org.telegram.ui.th.p(R.string.EventLogFilterByActions, arrayList);
        boolean z10 = this.X;
        int i10 = 0;
        int i11 = 2;
        w41 z11 = w41.z(R(0), LocaleController.getString(z10 ? R.string.EventLogFilterSectionMembers : R.string.EventLogFilterSectionSubscribers), 2);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.U;
        int i12 = 1;
        z11.K(tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote || (z10 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) || tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join || tL_channelAdminLogEventsFilter.leave || tL_channelAdminLogEventsFilter.edit_rank);
        z11.f = !this.Z;
        z11.D = new jh.y0(this, i10, 5);
        arrayList.add(z11);
        if (this.Z) {
            w41 y8 = w41.y(3, LocaleController.getString(R.string.EventLogFilterSectionAdmin));
            y8.i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.U;
            y8.K(tL_channelAdminLogEventsFilter2.promote || tL_channelAdminLogEventsFilter2.demote);
            arrayList.add(y8);
            if (z10) {
                w41 y10 = w41.y(4, LocaleController.getString(R.string.EventLogFilterNewRestrictions));
                y10.i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.U;
                y10.K(tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban);
                arrayList.add(y10);
            }
            w41 y11 = w41.y(5, LocaleController.getString(z10 ? R.string.EventLogFilterNewMembers : R.string.EventLogFilterNewSubscribers));
            y11.i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = this.U;
            y11.K(tL_channelAdminLogEventsFilter4.invite || tL_channelAdminLogEventsFilter4.join);
            arrayList.add(y11);
            w41 y12 = w41.y(6, LocaleController.getString(z10 ? R.string.EventLogFilterLeavingMembers2 : R.string.EventLogFilterLeavingSubscribers2));
            y12.i = 1;
            y12.K(this.U.leave);
            arrayList.add(y12);
            if (z10) {
                w41 y13 = w41.y(7, LocaleController.getString(R.string.EventLogFilterMembersRank));
                y13.i = 1;
                y13.K(this.U.edit_rank);
                arrayList.add(y13);
            }
        }
        w41 z12 = w41.z(R(1), LocaleController.getString(z10 ? R.string.EventLogFilterSectionGroupSettings : R.string.EventLogFilterSectionChannelSettings), 8);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = this.U;
        z12.K(tL_channelAdminLogEventsFilter5.info || tL_channelAdminLogEventsFilter5.settings || tL_channelAdminLogEventsFilter5.invites || tL_channelAdminLogEventsFilter5.group_call);
        z12.f = !this.a0;
        z12.D = new jh.y0(this, i12, 5);
        arrayList.add(z12);
        if (this.a0) {
            w41 y14 = w41.y(9, LocaleController.getString(z10 ? R.string.EventLogFilterGroupInfo : R.string.EventLogFilterChannelInfo));
            y14.i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = this.U;
            y14.K(tL_channelAdminLogEventsFilter6.info || tL_channelAdminLogEventsFilter6.settings);
            arrayList.add(y14);
            w41 y15 = w41.y(10, LocaleController.getString(R.string.EventLogFilterInvites));
            y15.i = 1;
            y15.K(this.U.invites);
            arrayList.add(y15);
            w41 y16 = w41.y(11, LocaleController.getString(R.string.EventLogFilterCalls));
            y16.i = 1;
            y16.K(this.U.group_call);
            arrayList.add(y16);
        }
        w41 z13 = w41.z(R(2), LocaleController.getString(R.string.EventLogFilterSectionMessages), 12);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = this.U;
        z13.K(tL_channelAdminLogEventsFilter7.delete || tL_channelAdminLogEventsFilter7.edit || tL_channelAdminLogEventsFilter7.pinned);
        z13.f = !this.b0;
        z13.D = new jh.y0(this, i11, 5);
        arrayList.add(z13);
        if (this.b0) {
            w41 y17 = w41.y(13, LocaleController.getString(R.string.EventLogFilterDeletedMessages));
            y17.i = 1;
            y17.K(this.U.delete);
            arrayList.add(y17);
            w41 y18 = w41.y(14, LocaleController.getString(R.string.EventLogFilterEditedMessages));
            y18.i = 1;
            y18.K(this.U.edit);
            arrayList.add(y18);
            w41 y19 = w41.y(15, LocaleController.getString(R.string.EventLogFilterPinnedMessages));
            y19.i = 1;
            y19.K(this.U.pinned);
            arrayList.add(y19);
        }
        arrayList.add(w41.B(null));
        org.telegram.ui.th.p(R.string.EventLogFilterByAdmins, arrayList);
        w41 y20 = w41.y(16, LocaleController.getString(R.string.EventLogFilterByAdminsAll));
        a0.h hVar = this.W;
        int m10 = hVar == null ? 0 : hVar.m();
        ArrayList arrayList2 = this.V;
        y20.K(m10 >= (arrayList2 == null ? 0 : arrayList2.size()));
        arrayList.add(y20);
        if (this.V != null) {
            for (int i13 = 0; i13 < this.V.size(); i13++) {
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) this.V.get(i13)).peer);
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                w41 w41Var = new w41(37);
                w41Var.d = (-1) - i13;
                w41Var.G = user;
                w41Var.i = 1;
                a0.h hVar2 = this.W;
                w41Var.K(hVar2 != null && hVar2.d(peerDialogId));
                arrayList.add(w41Var);
            }
        }
    }

    public final String R(int i10) {
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.U;
            int i11 = (tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote) ? 1 : 0;
            boolean z10 = this.X;
            sb2.append(i11 + ((z10 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) ? 1 : 0) + ((tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join) ? 1 : 0) + (tL_channelAdminLogEventsFilter.leave ? 1 : 0) + (tL_channelAdminLogEventsFilter.edit_rank ? 1 : 0));
            sb2.append("/");
            sb2.append(z10 ? 5 : 3);
            return sb2.toString();
        }
        if (i10 != 1) {
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

    public final void S(ArrayList arrayList) {
        this.V = arrayList;
        if (arrayList != null && this.W == null) {
            this.W = new a0.h();
            ArrayList arrayList2 = this.V;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) obj).peer);
                this.W.k(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)), peerDialogId);
            }
        }
        k51 k51Var = this.T;
        if (k51Var != null) {
            k51Var.N(true);
        }
    }

    @Override // org.telegram.ui.Components.xa, org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return !this.d.canScrollVertically(-1);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onSmoothContainerViewLayout(float f9) {
        super.onSmoothContainerViewLayout(f9);
        this.Y.setTranslationY(-f9);
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(jl0Var, getContext(), this.currentAccount, 0, true, new d(this, 3), this.resourcesProvider);
        this.T = k51Var;
        return k51Var;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        return LocaleController.getString(R.string.EventLog);
    }
}
