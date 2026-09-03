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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h0 extends sa {
    public w51 U;
    public TLRPC.TL_channelAdminLogEventsFilter V;
    public ArrayList W;
    public a0.h X;
    public final boolean Y;
    public final kg.a Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public org.telegram.ui.ya d0;

    public h0(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, a0.h hVar, boolean z4) {
        super(p2Var.getContext(), p2Var, false, false, false, false, true, 2, p2Var.getResourceProvider());
        this.V = new TLRPC.TL_channelAdminLogEventsFilter();
        this.a0 = false;
        this.b0 = false;
        this.c0 = false;
        this.v = 0.35f;
        fixNavigationBar();
        int i10 = org.telegram.ui.ActionBar.j6.i5;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider));
        J();
        this.y = true;
        if (tL_channelAdminLogEventsFilter != null) {
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.V;
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
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.V;
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
            this.X = hVar.clone();
        }
        this.Y = z4;
        this.U.N(false);
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(mr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.d.setOnItemClickListener(new t(this, 1));
        kg.a aVar = new kg.a(getContext(), this.resourcesProvider, (rl0) null);
        this.Z = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider));
        ph.d dVar = new ph.d(getContext(), this.resourcesProvider, true);
        dVar.e();
        dVar.g(LocaleController.getString(R.string.EventLogFilterApply), false, true);
        dVar.setOnClickListener(new g0(this, 0));
        aVar.addView(dVar, k7.b6.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(aVar, k7.b6.f(-2.0f, 87, i11, 0, i11, 0));
        rl0 rl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(68.0f));
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
    public static void P(h0 h0Var, View view, int i10, float f10) {
        boolean z4;
        ArrayList arrayList;
        i51 G = h0Var.U.G(i10 - 1);
        if (G == null) {
            return;
        }
        int i11 = G.a;
        if (i11 == 41 || i11 == 35) {
            if (i11 == 41) {
                if (LocaleController.isRTL) {
                }
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                if (!z4) {
                    y1Var.c(!y1Var.b(), true);
                }
                switch (G.d) {
                    case 2:
                        if (!z4) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = h0Var.V;
                            boolean b10 = y1Var.b();
                            tL_channelAdminLogEventsFilter.edit_rank = b10;
                            tL_channelAdminLogEventsFilter.leave = b10;
                            tL_channelAdminLogEventsFilter.join = b10;
                            tL_channelAdminLogEventsFilter.invite = b10;
                            tL_channelAdminLogEventsFilter.demote = b10;
                            tL_channelAdminLogEventsFilter.promote = b10;
                            if (h0Var.Y) {
                                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = h0Var.V;
                                boolean b11 = y1Var.b();
                                tL_channelAdminLogEventsFilter2.unban = b11;
                                tL_channelAdminLogEventsFilter2.unkick = b11;
                                tL_channelAdminLogEventsFilter2.ban = b11;
                                tL_channelAdminLogEventsFilter2.kick = b11;
                                break;
                            }
                        } else {
                            h0Var.a0 = !h0Var.a0;
                            break;
                        }
                        break;
                    case 3:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = h0Var.V;
                        boolean b12 = y1Var.b();
                        tL_channelAdminLogEventsFilter3.demote = b12;
                        tL_channelAdminLogEventsFilter3.promote = b12;
                        break;
                    case 4:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = h0Var.V;
                        boolean b13 = y1Var.b();
                        tL_channelAdminLogEventsFilter4.unban = b13;
                        tL_channelAdminLogEventsFilter4.unkick = b13;
                        tL_channelAdminLogEventsFilter4.ban = b13;
                        tL_channelAdminLogEventsFilter4.kick = b13;
                        break;
                    case 5:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = h0Var.V;
                        boolean b14 = y1Var.b();
                        tL_channelAdminLogEventsFilter5.join = b14;
                        tL_channelAdminLogEventsFilter5.invite = b14;
                        break;
                    case 6:
                        h0Var.V.leave = y1Var.b();
                        break;
                    case 7:
                        h0Var.V.edit_rank = y1Var.b();
                        break;
                    case 8:
                        if (!z4) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = h0Var.V;
                            boolean b15 = y1Var.b();
                            tL_channelAdminLogEventsFilter6.group_call = b15;
                            tL_channelAdminLogEventsFilter6.invites = b15;
                            tL_channelAdminLogEventsFilter6.settings = b15;
                            tL_channelAdminLogEventsFilter6.info = b15;
                            break;
                        } else {
                            h0Var.b0 = !h0Var.b0;
                            break;
                        }
                    case 9:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = h0Var.V;
                        boolean b16 = y1Var.b();
                        tL_channelAdminLogEventsFilter7.settings = b16;
                        tL_channelAdminLogEventsFilter7.info = b16;
                        break;
                    case 10:
                        h0Var.V.invites = y1Var.b();
                        break;
                    case 11:
                        h0Var.V.group_call = y1Var.b();
                        break;
                    case 12:
                        if (!z4) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter8 = h0Var.V;
                            boolean b17 = y1Var.b();
                            tL_channelAdminLogEventsFilter8.pinned = b17;
                            tL_channelAdminLogEventsFilter8.edit = b17;
                            tL_channelAdminLogEventsFilter8.delete = b17;
                            break;
                        } else {
                            h0Var.c0 = !h0Var.c0;
                            break;
                        }
                    case 13:
                        h0Var.V.delete = y1Var.b();
                        break;
                    case 14:
                        h0Var.V.edit = y1Var.b();
                        break;
                    case 15:
                        h0Var.V.pinned = y1Var.b();
                        break;
                    case 16:
                        if (h0Var.X == null) {
                            h0Var.X = new a0.h();
                        }
                        h0Var.X.b();
                        if (y1Var.b() && (arrayList = h0Var.W) != null) {
                            int size = arrayList.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = arrayList.get(i12);
                                i12++;
                                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) obj).peer);
                                h0Var.X.k(MessagesController.getInstance(h0Var.currentAccount).getUser(Long.valueOf(peerDialogId)), peerDialogId);
                            }
                            break;
                        }
                        break;
                }
                h0Var.U.N(true);
            }
            z4 = false;
            org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
            if (!z4) {
            }
            switch (G.d) {
            }
            h0Var.U.N(true);
        }
        int i13 = G.d;
        if (i13 < 0) {
            org.telegram.ui.Cells.y1 y1Var3 = (org.telegram.ui.Cells.y1) view;
            int i14 = (-i13) - 1;
            if (i14 < 0 || i14 >= h0Var.W.size()) {
                return;
            }
            long peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) h0Var.W.get(i14)).peer);
            TLRPC.User user = MessagesController.getInstance(h0Var.currentAccount).getUser(Long.valueOf(peerDialogId2));
            if (h0Var.X == null) {
                h0Var.X = new a0.h();
            }
            if (h0Var.X.d(peerDialogId2)) {
                h0Var.X.l(peerDialogId2);
                y1Var3.c(false, true);
            } else {
                h0Var.X.k(user, peerDialogId2);
                y1Var3.c(true, true);
            }
            h0Var.U.N(true);
        }
    }

    public final void Q(ArrayList arrayList, w51 w51Var) {
        if (this.V == null) {
            return;
        }
        arrayList.add(i51.B(null));
        org.telegram.ui.ai.q(R.string.EventLogFilterByActions, arrayList);
        boolean z4 = this.Y;
        int i10 = 0;
        int i11 = 2;
        i51 z10 = i51.z(R(0), LocaleController.getString(z4 ? R.string.EventLogFilterSectionMembers : R.string.EventLogFilterSectionSubscribers), 2);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.V;
        int i12 = 1;
        z10.K(tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote || (z4 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) || tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join || tL_channelAdminLogEventsFilter.leave || tL_channelAdminLogEventsFilter.edit_rank);
        z10.f = !this.a0;
        z10.D = new lh.y0(this, i10, 3);
        arrayList.add(z10);
        if (this.a0) {
            i51 y10 = i51.y(3, LocaleController.getString(R.string.EventLogFilterSectionAdmin));
            y10.i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.V;
            y10.K(tL_channelAdminLogEventsFilter2.promote || tL_channelAdminLogEventsFilter2.demote);
            arrayList.add(y10);
            if (z4) {
                i51 y11 = i51.y(4, LocaleController.getString(R.string.EventLogFilterNewRestrictions));
                y11.i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.V;
                y11.K(tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban);
                arrayList.add(y11);
            }
            i51 y12 = i51.y(5, LocaleController.getString(z4 ? R.string.EventLogFilterNewMembers : R.string.EventLogFilterNewSubscribers));
            y12.i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = this.V;
            y12.K(tL_channelAdminLogEventsFilter4.invite || tL_channelAdminLogEventsFilter4.join);
            arrayList.add(y12);
            i51 y13 = i51.y(6, LocaleController.getString(z4 ? R.string.EventLogFilterLeavingMembers2 : R.string.EventLogFilterLeavingSubscribers2));
            y13.i = 1;
            y13.K(this.V.leave);
            arrayList.add(y13);
            if (z4) {
                i51 y14 = i51.y(7, LocaleController.getString(R.string.EventLogFilterMembersRank));
                y14.i = 1;
                y14.K(this.V.edit_rank);
                arrayList.add(y14);
            }
        }
        i51 z11 = i51.z(R(1), LocaleController.getString(z4 ? R.string.EventLogFilterSectionGroupSettings : R.string.EventLogFilterSectionChannelSettings), 8);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = this.V;
        z11.K(tL_channelAdminLogEventsFilter5.info || tL_channelAdminLogEventsFilter5.settings || tL_channelAdminLogEventsFilter5.invites || tL_channelAdminLogEventsFilter5.group_call);
        z11.f = !this.b0;
        z11.D = new lh.y0(this, i12, 3);
        arrayList.add(z11);
        if (this.b0) {
            i51 y15 = i51.y(9, LocaleController.getString(z4 ? R.string.EventLogFilterGroupInfo : R.string.EventLogFilterChannelInfo));
            y15.i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = this.V;
            y15.K(tL_channelAdminLogEventsFilter6.info || tL_channelAdminLogEventsFilter6.settings);
            arrayList.add(y15);
            i51 y16 = i51.y(10, LocaleController.getString(R.string.EventLogFilterInvites));
            y16.i = 1;
            y16.K(this.V.invites);
            arrayList.add(y16);
            i51 y17 = i51.y(11, LocaleController.getString(R.string.EventLogFilterCalls));
            y17.i = 1;
            y17.K(this.V.group_call);
            arrayList.add(y17);
        }
        i51 z12 = i51.z(R(2), LocaleController.getString(R.string.EventLogFilterSectionMessages), 12);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = this.V;
        z12.K(tL_channelAdminLogEventsFilter7.delete || tL_channelAdminLogEventsFilter7.edit || tL_channelAdminLogEventsFilter7.pinned);
        z12.f = !this.c0;
        z12.D = new lh.y0(this, i11, 3);
        arrayList.add(z12);
        if (this.c0) {
            i51 y18 = i51.y(13, LocaleController.getString(R.string.EventLogFilterDeletedMessages));
            y18.i = 1;
            y18.K(this.V.delete);
            arrayList.add(y18);
            i51 y19 = i51.y(14, LocaleController.getString(R.string.EventLogFilterEditedMessages));
            y19.i = 1;
            y19.K(this.V.edit);
            arrayList.add(y19);
            i51 y20 = i51.y(15, LocaleController.getString(R.string.EventLogFilterPinnedMessages));
            y20.i = 1;
            y20.K(this.V.pinned);
            arrayList.add(y20);
        }
        arrayList.add(i51.B(null));
        org.telegram.ui.ai.q(R.string.EventLogFilterByAdmins, arrayList);
        i51 y21 = i51.y(16, LocaleController.getString(R.string.EventLogFilterByAdminsAll));
        a0.h hVar = this.X;
        int m9 = hVar == null ? 0 : hVar.m();
        ArrayList arrayList2 = this.W;
        y21.K(m9 >= (arrayList2 == null ? 0 : arrayList2.size()));
        arrayList.add(y21);
        if (this.W != null) {
            for (int i13 = 0; i13 < this.W.size(); i13++) {
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) this.W.get(i13)).peer);
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                i51 i51Var = new i51(37);
                i51Var.d = (-1) - i13;
                i51Var.G = user;
                i51Var.i = 1;
                a0.h hVar2 = this.X;
                i51Var.K(hVar2 != null && hVar2.d(peerDialogId));
                arrayList.add(i51Var);
            }
        }
    }

    public final String R(int i10) {
        if (i10 == 0) {
            StringBuilder sb = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.V;
            int i11 = (tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote) ? 1 : 0;
            boolean z4 = this.Y;
            sb.append(i11 + ((z4 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) ? 1 : 0) + ((tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join) ? 1 : 0) + (tL_channelAdminLogEventsFilter.leave ? 1 : 0) + (tL_channelAdminLogEventsFilter.edit_rank ? 1 : 0));
            sb.append("/");
            sb.append(z4 ? 5 : 3);
            return sb.toString();
        }
        if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.V;
            sb2.append((tL_channelAdminLogEventsFilter2.delete ? 1 : 0) + (tL_channelAdminLogEventsFilter2.edit ? 1 : 0) + (tL_channelAdminLogEventsFilter2.pinned ? 1 : 0));
            sb2.append("/3");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.V;
        sb3.append(((tL_channelAdminLogEventsFilter3.info || tL_channelAdminLogEventsFilter3.settings) ? 1 : 0) + (tL_channelAdminLogEventsFilter3.invites ? 1 : 0) + (tL_channelAdminLogEventsFilter3.group_call ? 1 : 0));
        sb3.append("/3");
        return sb3.toString();
    }

    public final void S(ArrayList arrayList) {
        this.W = arrayList;
        if (arrayList != null && this.X == null) {
            this.X = new a0.h();
            ArrayList arrayList2 = this.W;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) obj).peer);
                this.X.k(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)), peerDialogId);
            }
        }
        w51 w51Var = this.U;
        if (w51Var != null) {
            w51Var.N(true);
        }
    }

    @Override // org.telegram.ui.Components.sa, org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        return !this.d.canScrollVertically(-1);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onSmoothContainerViewLayout(float f10) {
        super.onSmoothContainerViewLayout(f10);
        this.Z.setTranslationY(-f10);
    }

    @Override // org.telegram.ui.Components.sa
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(rl0Var, getContext(), this.currentAccount, 0, true, new d(this, 3), this.resourcesProvider);
        this.U = w51Var;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.EventLog);
    }
}
