package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class g0 extends bb {
    public j71 X;
    public TLRPC.TL_channelAdminLogEventsFilter Y;
    public ArrayList Z;
    public a0.h a0;
    public final boolean b0;
    public final bi.sc c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public org.telegram.ui.ab g0;
    public int h0;

    public g0(org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, a0.h hVar, boolean z10) {
        super(r2Var.getContext(), r2Var, false, true, 2, r2Var.getResourceProvider());
        this.Y = new TLRPC.TL_channelAdminLogEventsFilter();
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.v = 0.35f;
        fixNavigationBar();
        int i10 = org.telegram.ui.ActionBar.y6.i5;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, this.resourcesProvider);
        this.h0 = w02;
        setBackgroundColor(w02);
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
        if (hVar != null) {
            this.a0 = hVar.clone();
        }
        this.b0 = z10;
        this.X.O(false);
        s4.l lVar = new s4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.d.setOnItemClickListener(new s(this, 1));
        bi.sc scVar = new bi.sc(getContext(), this.resourcesProvider, (mm0) null);
        this.c0 = scVar;
        scVar.setClickable(true);
        scVar.setOrientation(1);
        scVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        org.telegram.ui.ActionBar.f7.i(i10, scVar, this.resourcesProvider);
        fi.d dVar = new fi.d(getContext(), this.resourcesProvider, true);
        dVar.f();
        dVar.i(LocaleController.getString(R.string.EventLogFilterApply), false, true);
        dVar.setOnClickListener(new f0(this, 0));
        scVar.addView(dVar, gb1.u(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(scVar, gb1.j(-2.0f, 87, i11, 0, i11, 0));
        mm0 mm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(68.0f));
        this.d.u1();
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
    public static void P(g0 g0Var, View view, int i10, float f7) {
        boolean z10;
        ArrayList arrayList;
        t61 G = g0Var.X.G(i10 - 1);
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
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = g0Var.Y;
                            boolean b10 = y1Var.b();
                            tL_channelAdminLogEventsFilter.edit_rank = b10;
                            tL_channelAdminLogEventsFilter.leave = b10;
                            tL_channelAdminLogEventsFilter.join = b10;
                            tL_channelAdminLogEventsFilter.invite = b10;
                            tL_channelAdminLogEventsFilter.demote = b10;
                            tL_channelAdminLogEventsFilter.promote = b10;
                            if (g0Var.b0) {
                                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = g0Var.Y;
                                boolean b11 = y1Var.b();
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
                        boolean b12 = y1Var.b();
                        tL_channelAdminLogEventsFilter3.demote = b12;
                        tL_channelAdminLogEventsFilter3.promote = b12;
                        break;
                    case 4:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = g0Var.Y;
                        boolean b13 = y1Var.b();
                        tL_channelAdminLogEventsFilter4.unban = b13;
                        tL_channelAdminLogEventsFilter4.unkick = b13;
                        tL_channelAdminLogEventsFilter4.ban = b13;
                        tL_channelAdminLogEventsFilter4.kick = b13;
                        break;
                    case 5:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = g0Var.Y;
                        boolean b14 = y1Var.b();
                        tL_channelAdminLogEventsFilter5.join = b14;
                        tL_channelAdminLogEventsFilter5.invite = b14;
                        break;
                    case 6:
                        g0Var.Y.leave = y1Var.b();
                        break;
                    case 7:
                        g0Var.Y.edit_rank = y1Var.b();
                        break;
                    case 8:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = g0Var.Y;
                            boolean b15 = y1Var.b();
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
                        boolean b16 = y1Var.b();
                        tL_channelAdminLogEventsFilter7.settings = b16;
                        tL_channelAdminLogEventsFilter7.info = b16;
                        break;
                    case 10:
                        g0Var.Y.invites = y1Var.b();
                        break;
                    case 11:
                        g0Var.Y.group_call = y1Var.b();
                        break;
                    case 12:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter8 = g0Var.Y;
                            boolean b17 = y1Var.b();
                            tL_channelAdminLogEventsFilter8.pinned = b17;
                            tL_channelAdminLogEventsFilter8.edit = b17;
                            tL_channelAdminLogEventsFilter8.delete = b17;
                            break;
                        } else {
                            g0Var.f0 = !g0Var.f0;
                            break;
                        }
                    case 13:
                        g0Var.Y.delete = y1Var.b();
                        break;
                    case 14:
                        g0Var.Y.edit = y1Var.b();
                        break;
                    case 15:
                        g0Var.Y.pinned = y1Var.b();
                        break;
                    case 16:
                        if (g0Var.a0 == null) {
                            g0Var.a0 = new a0.h();
                        }
                        g0Var.a0.b();
                        if (y1Var.b() && (arrayList = g0Var.Z) != null) {
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
                g0Var.X.O(true);
            }
            z10 = false;
            org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
            if (!z10) {
            }
            switch (G.d) {
            }
            g0Var.X.O(true);
        }
        int i13 = G.d;
        if (i13 < 0) {
            org.telegram.ui.Cells.y1 y1Var3 = (org.telegram.ui.Cells.y1) view;
            int i14 = (-i13) - 1;
            if (i14 < 0 || i14 >= g0Var.Z.size()) {
                return;
            }
            long peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) g0Var.Z.get(i14)).peer);
            TLRPC.User user = MessagesController.getInstance(g0Var.currentAccount).getUser(Long.valueOf(peerDialogId2));
            if (g0Var.a0 == null) {
                g0Var.a0 = new a0.h();
            }
            if (g0Var.a0.d(peerDialogId2)) {
                g0Var.a0.l(peerDialogId2);
                y1Var3.c(false, true);
            } else {
                g0Var.a0.k(user, peerDialogId2);
                y1Var3.c(true, true);
            }
            g0Var.X.O(true);
        }
    }

    public final void Q(ArrayList arrayList, j71 j71Var) {
        if (this.Y == null) {
            return;
        }
        arrayList.add(t61.C(null));
        ic.a.p(R.string.EventLogFilterByActions, arrayList);
        boolean z10 = this.b0;
        int i10 = 0;
        int i11 = 2;
        t61 A = t61.A(R(0), LocaleController.getString(z10 ? R.string.EventLogFilterSectionMembers : R.string.EventLogFilterSectionSubscribers), 2);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.Y;
        int i12 = 1;
        A.L(tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote || (z10 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) || tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join || tL_channelAdminLogEventsFilter.leave || tL_channelAdminLogEventsFilter.edit_rank);
        A.f = !this.d0;
        A.D = new ai.w(this, i10, 10);
        arrayList.add(A);
        if (this.d0) {
            t61 z11 = t61.z(3, LocaleController.getString(R.string.EventLogFilterSectionAdmin));
            z11.i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.Y;
            z11.L(tL_channelAdminLogEventsFilter2.promote || tL_channelAdminLogEventsFilter2.demote);
            arrayList.add(z11);
            if (z10) {
                t61 z12 = t61.z(4, LocaleController.getString(R.string.EventLogFilterNewRestrictions));
                z12.i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.Y;
                z12.L(tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban);
                arrayList.add(z12);
            }
            t61 z13 = t61.z(5, LocaleController.getString(z10 ? R.string.EventLogFilterNewMembers : R.string.EventLogFilterNewSubscribers));
            z13.i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = this.Y;
            z13.L(tL_channelAdminLogEventsFilter4.invite || tL_channelAdminLogEventsFilter4.join);
            arrayList.add(z13);
            t61 z14 = t61.z(6, LocaleController.getString(z10 ? R.string.EventLogFilterLeavingMembers2 : R.string.EventLogFilterLeavingSubscribers2));
            z14.i = 1;
            z14.L(this.Y.leave);
            arrayList.add(z14);
            if (z10) {
                t61 z15 = t61.z(7, LocaleController.getString(R.string.EventLogFilterMembersRank));
                z15.i = 1;
                z15.L(this.Y.edit_rank);
                arrayList.add(z15);
            }
        }
        t61 A2 = t61.A(R(1), LocaleController.getString(z10 ? R.string.EventLogFilterSectionGroupSettings : R.string.EventLogFilterSectionChannelSettings), 8);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = this.Y;
        A2.L(tL_channelAdminLogEventsFilter5.info || tL_channelAdminLogEventsFilter5.settings || tL_channelAdminLogEventsFilter5.invites || tL_channelAdminLogEventsFilter5.group_call);
        A2.f = !this.e0;
        A2.D = new ai.w(this, i12, 10);
        arrayList.add(A2);
        if (this.e0) {
            t61 z16 = t61.z(9, LocaleController.getString(z10 ? R.string.EventLogFilterGroupInfo : R.string.EventLogFilterChannelInfo));
            z16.i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = this.Y;
            z16.L(tL_channelAdminLogEventsFilter6.info || tL_channelAdminLogEventsFilter6.settings);
            arrayList.add(z16);
            t61 z17 = t61.z(10, LocaleController.getString(R.string.EventLogFilterInvites));
            z17.i = 1;
            z17.L(this.Y.invites);
            arrayList.add(z17);
            t61 z18 = t61.z(11, LocaleController.getString(R.string.EventLogFilterCalls));
            z18.i = 1;
            z18.L(this.Y.group_call);
            arrayList.add(z18);
        }
        t61 A3 = t61.A(R(2), LocaleController.getString(R.string.EventLogFilterSectionMessages), 12);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = this.Y;
        A3.L(tL_channelAdminLogEventsFilter7.delete || tL_channelAdminLogEventsFilter7.edit || tL_channelAdminLogEventsFilter7.pinned);
        A3.f = !this.f0;
        A3.D = new ai.w(this, i11, 10);
        arrayList.add(A3);
        if (this.f0) {
            t61 z19 = t61.z(13, LocaleController.getString(R.string.EventLogFilterDeletedMessages));
            z19.i = 1;
            z19.L(this.Y.delete);
            arrayList.add(z19);
            t61 z20 = t61.z(14, LocaleController.getString(R.string.EventLogFilterEditedMessages));
            z20.i = 1;
            z20.L(this.Y.edit);
            arrayList.add(z20);
            t61 z21 = t61.z(15, LocaleController.getString(R.string.EventLogFilterPinnedMessages));
            z21.i = 1;
            z21.L(this.Y.pinned);
            arrayList.add(z21);
        }
        arrayList.add(t61.C(null));
        ic.a.p(R.string.EventLogFilterByAdmins, arrayList);
        t61 z22 = t61.z(16, LocaleController.getString(R.string.EventLogFilterByAdminsAll));
        a0.h hVar = this.a0;
        int m10 = hVar == null ? 0 : hVar.m();
        ArrayList arrayList2 = this.Z;
        z22.L(m10 >= (arrayList2 == null ? 0 : arrayList2.size()));
        arrayList.add(z22);
        if (this.Z != null) {
            for (int i13 = 0; i13 < this.Z.size(); i13++) {
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) this.Z.get(i13)).peer);
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                t61 t61Var = new t61(37);
                t61Var.d = (-1) - i13;
                t61Var.G = user;
                t61Var.i = 1;
                a0.h hVar2 = this.a0;
                t61Var.L(hVar2 != null && hVar2.d(peerDialogId));
                arrayList.add(t61Var);
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
            this.a0 = new a0.h();
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
        j71 j71Var = this.X;
        if (j71Var != null) {
            j71Var.O(true);
        }
    }

    @Override // org.telegram.ui.Components.bb, org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithSwipe() {
        return !this.d.canScrollVertically(-1);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onSmoothContainerViewLayout(float f7) {
        super.onSmoothContainerViewLayout(f7);
        this.c0.setTranslationY(-f7);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.i5, this.resourcesProvider);
            if (w02 != this.h0) {
                this.h0 = w02;
                setBackgroundColor(w02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(mm0Var, getContext(), this.currentAccount, 0, true, new d(this, 3), this.resourcesProvider);
        this.X = j71Var;
        return j71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.EventLog);
    }
}
