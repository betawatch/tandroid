package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n61 {
    public TLRPC.User a;
    public String b;

    public static TLRPC.User a(ArrayList arrayList, long j10) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.id == j10) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.k2 k2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.a.id);
        org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).U3(this.a, false, false);
        k2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01c1 A[LOOP:1: B:70:0x01bf->B:71:0x01c1, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final TLRPC.ChatFull chatFull, final u61 u61Var, final org.telegram.ui.ActionBar.x1[] x1VarArr, boolean z10) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        boolean z11;
        int size;
        String str;
        int i10;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).U3(this.a, false, false);
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (!z10 || (arrayList = chatFull.participants.participants) == null) {
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
        } else {
            int size2 = arrayList.size();
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
            for (int i11 = 0; i11 < size2; i11++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i11);
                long j10 = chatParticipant.user_id;
                if (j10 == this.a.id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
                if (j10 == org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).n && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant2 = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
            }
        }
        org.telegram.ui.Cells.f1.t("StatisticOpenProfile", 2131744914, arrayList2, R.drawable.msg_openprofile, arrayList4);
        arrayList3.add(2);
        arrayList2.add(org.telegram.messenger.cd.L0(2131744912, "StatisticSearchUserHistory"));
        arrayList4.add(Integer.valueOf(R.drawable.msg_msgbubble3));
        arrayList3.add(1);
        if (z10 && tL_chatChannelParticipant == null) {
            if (x1VarArr[0] == null) {
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, u61Var.getFragmentView().getContext(), null);
                x1VarArr[0] = x1Var;
                x1Var.r(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).g1(chatFull.id);
            tL_channels_getParticipant.participant = org.telegram.messenger.vp.m1(this.a);
            final int i12 = 0;
            ConnectionsManager.getInstance(org.telegram.messenger.d20.s0).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) { // from class: org.telegram.ui.i61
                public final /* synthetic */ n61 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i13 = 0;
                            final n61 n61Var = this.b;
                            final u61 u61Var2 = u61Var;
                            final org.telegram.ui.ActionBar.x1[] x1VarArr2 = x1VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.k61
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            n61 n61Var2 = n61Var;
                                            n61Var2.getClass();
                                            u61 u61Var3 = u61Var2;
                                            if (!u61Var3.isFinishing() && u61Var3.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.x1[] x1VarArr3 = x1VarArr2;
                                                if (x1VarArr3[0] != null) {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull3 = chatFull2;
                                                    if (tL_error2 != null) {
                                                        n61Var2.c(chatFull3, u61Var3, x1VarArr3, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = n61Var2.a.id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        n61Var2.c(chatFull3, u61Var3, x1VarArr3, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            n61 n61Var3 = n61Var;
                                            n61Var3.getClass();
                                            u61 u61Var4 = u61Var2;
                                            if (!u61Var4.isFinishing() && u61Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.x1[] x1VarArr4 = x1VarArr2;
                                                if (x1VarArr4[0] != null) {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 != null) {
                                                        n61Var3.c(chatFull4, u61Var4, x1VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).n;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        n61Var3.c(chatFull4, u61Var4, x1VarArr4, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i14 = 1;
                            final n61 n61Var2 = this.b;
                            final u61 u61Var3 = u61Var;
                            final org.telegram.ui.ActionBar.x1[] x1VarArr3 = x1VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.k61
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            n61 n61Var22 = n61Var2;
                                            n61Var22.getClass();
                                            u61 u61Var32 = u61Var3;
                                            if (!u61Var32.isFinishing() && u61Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.x1[] x1VarArr32 = x1VarArr3;
                                                if (x1VarArr32[0] != null) {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 != null) {
                                                        n61Var22.c(chatFull32, u61Var32, x1VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = n61Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        n61Var22.c(chatFull32, u61Var32, x1VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            n61 n61Var3 = n61Var2;
                                            n61Var3.getClass();
                                            u61 u61Var4 = u61Var3;
                                            if (!u61Var4.isFinishing() && u61Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.x1[] x1VarArr4 = x1VarArr3;
                                                if (x1VarArr4[0] != null) {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 != null) {
                                                        n61Var3.c(chatFull4, u61Var4, x1VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).n;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        n61Var3.c(chatFull4, u61Var4, x1VarArr4, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        if (z10 && tL_chatChannelParticipant2 == null) {
            if (x1VarArr[0] == null) {
                org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, u61Var.getFragmentView().getContext(), null);
                x1VarArr[0] = x1Var2;
                x1Var2.r(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant2.channel = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).g1(chatFull.id);
            tL_channels_getParticipant2.participant = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).i1(org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).n);
            final int i13 = 1;
            ConnectionsManager.getInstance(org.telegram.messenger.d20.s0).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) { // from class: org.telegram.ui.i61
                public final /* synthetic */ n61 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            final int i132 = 0;
                            final n61 n61Var = this.b;
                            final u61 u61Var2 = u61Var;
                            final org.telegram.ui.ActionBar.x1[] x1VarArr2 = x1VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.k61
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i132) {
                                        case 0:
                                            n61 n61Var22 = n61Var;
                                            n61Var22.getClass();
                                            u61 u61Var32 = u61Var2;
                                            if (!u61Var32.isFinishing() && u61Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.x1[] x1VarArr32 = x1VarArr2;
                                                if (x1VarArr32[0] != null) {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull2;
                                                    if (tL_error2 != null) {
                                                        n61Var22.c(chatFull32, u61Var32, x1VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = n61Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        n61Var22.c(chatFull32, u61Var32, x1VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            n61 n61Var3 = n61Var;
                                            n61Var3.getClass();
                                            u61 u61Var4 = u61Var2;
                                            if (!u61Var4.isFinishing() && u61Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.x1[] x1VarArr4 = x1VarArr2;
                                                if (x1VarArr4[0] != null) {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 != null) {
                                                        n61Var3.c(chatFull4, u61Var4, x1VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).n;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        n61Var3.c(chatFull4, u61Var4, x1VarArr4, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i14 = 1;
                            final n61 n61Var2 = this.b;
                            final u61 u61Var3 = u61Var;
                            final org.telegram.ui.ActionBar.x1[] x1VarArr3 = x1VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.k61
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            n61 n61Var22 = n61Var2;
                                            n61Var22.getClass();
                                            u61 u61Var32 = u61Var3;
                                            if (!u61Var32.isFinishing() && u61Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.x1[] x1VarArr32 = x1VarArr3;
                                                if (x1VarArr32[0] != null) {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 != null) {
                                                        n61Var22.c(chatFull32, u61Var32, x1VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = n61Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        n61Var22.c(chatFull32, u61Var32, x1VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            n61 n61Var3 = n61Var2;
                                            n61Var3.getClass();
                                            u61 u61Var4 = u61Var3;
                                            if (!u61Var4.isFinishing() && u61Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.x1[] x1VarArr4 = x1VarArr3;
                                                if (x1VarArr4[0] != null) {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 != null) {
                                                        n61Var3.c(chatFull4, u61Var4, x1VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).n;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        n61Var3.c(chatFull4, u61Var4, x1VarArr4, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var3 = x1VarArr[0];
        if (x1Var3 != null) {
            x1Var3.dismiss();
            x1VarArr[0] = null;
        }
        if (tL_chatChannelParticipant2 != null && tL_chatChannelParticipant != null && tL_chatChannelParticipant2.user_id != tL_chatChannelParticipant.user_id) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = tL_chatChannelParticipant2.channelParticipant.admin_rights;
            boolean z12 = tL_chatAdminRights != null && tL_chatAdminRights.add_admins;
            if (z12 && ((channelParticipant instanceof TLRPC.TL_channelParticipantCreator) || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit))) {
                z12 = false;
            }
            if (z12) {
                z11 = channelParticipant.admin_rights == null;
                if (z11) {
                    str = "SetAsAdmin";
                    i10 = 2131745564;
                } else {
                    str = "EditAdminRights";
                    i10 = 2131751305;
                }
                arrayList2.add(org.telegram.messenger.cd.L0(i10, str));
                arrayList4.add(Integer.valueOf(z11 ? R.drawable.msg_admins : R.drawable.msg_permissions));
                arrayList3.add(0);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u61Var.getParentActivity());
                CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
                Typeface typeface = org.telegram.messenger.i0.a;
                size = arrayList4.size();
                int[] iArr = new int[size];
                for (int i14 = 0; i14 < size; i14++) {
                    iArr[i14] = ((Integer) arrayList4.get(i14)).intValue();
                }
                final boolean z13 = z11;
                final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.j61
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i15) {
                        ArrayList arrayList5 = arrayList3;
                        int intValue = ((Integer) arrayList5.get(i15)).intValue();
                        n61 n61Var = n61.this;
                        TLRPC.ChatFull chatFull2 = chatFull;
                        u61 u61Var2 = u61Var;
                        if (intValue != 0) {
                            if (((Integer) arrayList5.get(i15)).intValue() == 2) {
                                n61Var.b(u61Var2);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatFull2.id);
                            bundle.putLong("search_from_user_id", n61Var.a.id);
                            u61Var2.presentFragment(new un(bundle));
                            return;
                        }
                        boolean[] zArr = new boolean[1];
                        long j11 = n61Var.a.id;
                        long j12 = chatFull2.id;
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                        String str2 = channelParticipant2.rank;
                        boolean z14 = z13;
                        l61 l61Var = new l61(n61Var, j11, j12, tL_chatAdminRights2, tL_chatBannedRights, str2, z14, zArr, u61Var2);
                        l61Var.X0 = new m61(tL_chatChannelParticipant4, z14, zArr);
                        u61Var2.presentFragment(l61Var);
                    }
                };
                org.telegram.ui.ActionBar.x1 x1Var4 = alertDialog$Builder.a;
                x1Var4.P = charSequenceArr;
                x1Var4.Q = iArr;
                x1Var4.M = onClickListener;
                u61Var.showDialog(x1Var4);
            }
        }
        z11 = false;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(u61Var.getParentActivity());
        CharSequence[] charSequenceArr2 = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
        Typeface typeface2 = org.telegram.messenger.i0.a;
        size = arrayList4.size();
        int[] iArr2 = new int[size];
        while (i14 < size) {
        }
        final boolean z132 = z11;
        final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant32 = tL_chatChannelParticipant;
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.j61
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i15) {
                ArrayList arrayList5 = arrayList3;
                int intValue = ((Integer) arrayList5.get(i15)).intValue();
                n61 n61Var = n61.this;
                TLRPC.ChatFull chatFull2 = chatFull;
                u61 u61Var2 = u61Var;
                if (intValue != 0) {
                    if (((Integer) arrayList5.get(i15)).intValue() == 2) {
                        n61Var.b(u61Var2);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chatFull2.id);
                    bundle.putLong("search_from_user_id", n61Var.a.id);
                    u61Var2.presentFragment(new un(bundle));
                    return;
                }
                boolean[] zArr = new boolean[1];
                long j11 = n61Var.a.id;
                long j12 = chatFull2.id;
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant32;
                TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                String str2 = channelParticipant2.rank;
                boolean z14 = z132;
                l61 l61Var = new l61(n61Var, j11, j12, tL_chatAdminRights2, tL_chatBannedRights, str2, z14, zArr, u61Var2);
                l61Var.X0 = new m61(tL_chatChannelParticipant4, z14, zArr);
                u61Var2.presentFragment(l61Var);
            }
        };
        org.telegram.ui.ActionBar.x1 x1Var42 = alertDialog$Builder2.a;
        x1Var42.P = charSequenceArr2;
        x1Var42.Q = iArr2;
        x1Var42.M = onClickListener2;
        u61Var.showDialog(x1Var42);
    }
}
