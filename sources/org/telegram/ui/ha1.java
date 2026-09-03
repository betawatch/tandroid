package org.telegram.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ha1 {
    public TLRPC.User a;
    public String b;

    public static TLRPC.User a(long j10, ArrayList arrayList) {
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

    public final void b(org.telegram.ui.ActionBar.p2 p2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.a.id);
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.a, false);
        p2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final TLRPC.ChatFull chatFull, final oa1 oa1Var, final org.telegram.ui.ActionBar.d2[] d2VarArr, boolean z4) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        String str;
        int i10;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        boolean z10 = false;
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.a, false);
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (!z4 || (arrayList = chatFull.participants.participants) == null) {
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
        } else {
            int size = arrayList.size();
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i11);
                long j10 = chatParticipant.user_id;
                if (j10 == this.a.id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
                if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant2 = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
            }
        }
        arrayList2.add(LocaleController.getString("StatisticOpenProfile", R.string.StatisticOpenProfile));
        b.h(R.drawable.msg_openprofile, 2, arrayList4, arrayList3);
        arrayList2.add(LocaleController.getString("StatisticSearchUserHistory", R.string.StatisticSearchUserHistory));
        b.h(R.drawable.msg_msgbubble3, 1, arrayList4, arrayList3);
        if (z4 && tL_chatChannelParticipant == null) {
            if (d2VarArr[0] == null) {
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(oa1Var.getFragmentView().getContext(), 3, null);
                d2VarArr[0] = d2Var;
                d2Var.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.id);
            tL_channels_getParticipant.participant = MessagesController.getInputPeer(this.a);
            final int i12 = 0;
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) { // from class: org.telegram.ui.ca1
                public final /* synthetic */ ha1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i13 = 0;
                            final ha1 ha1Var = this.b;
                            final oa1 oa1Var2 = oa1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr2 = d2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ea1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            oa1 oa1Var3 = oa1Var2;
                                            if (!oa1Var3.isFinishing() && oa1Var3.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr3 = d2VarArr2;
                                                if (d2VarArr3[0] != null) {
                                                    ha1 ha1Var2 = ha1Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull3 = chatFull2;
                                                    if (tL_error2 != null) {
                                                        ha1Var2.c(chatFull3, oa1Var3, d2VarArr3, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = ha1Var2.a.id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ha1Var2.c(chatFull3, oa1Var3, d2VarArr3, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            oa1 oa1Var4 = oa1Var2;
                                            if (!oa1Var4.isFinishing() && oa1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr2;
                                                if (d2VarArr4[0] != null) {
                                                    ha1 ha1Var3 = ha1Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 != null) {
                                                        ha1Var3.c(chatFull4, oa1Var4, d2VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ha1Var3.c(chatFull4, oa1Var4, d2VarArr4, true);
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
                            final ha1 ha1Var2 = this.b;
                            final oa1 oa1Var3 = oa1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr3 = d2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ea1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            oa1 oa1Var32 = oa1Var3;
                                            if (!oa1Var32.isFinishing() && oa1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr32 = d2VarArr3;
                                                if (d2VarArr32[0] != null) {
                                                    ha1 ha1Var22 = ha1Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 != null) {
                                                        ha1Var22.c(chatFull32, oa1Var32, d2VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = ha1Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ha1Var22.c(chatFull32, oa1Var32, d2VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            oa1 oa1Var4 = oa1Var3;
                                            if (!oa1Var4.isFinishing() && oa1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr3;
                                                if (d2VarArr4[0] != null) {
                                                    ha1 ha1Var3 = ha1Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 != null) {
                                                        ha1Var3.c(chatFull4, oa1Var4, d2VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ha1Var3.c(chatFull4, oa1Var4, d2VarArr4, true);
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
        if (z4 && tL_chatChannelParticipant2 == null) {
            if (d2VarArr[0] == null) {
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(oa1Var.getFragmentView().getContext(), 3, null);
                d2VarArr[0] = d2Var2;
                d2Var2.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant2.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.id);
            tL_channels_getParticipant2.participant = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(UserConfig.getInstance(UserConfig.selectedAccount).clientUserId);
            final int i13 = 1;
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) { // from class: org.telegram.ui.ca1
                public final /* synthetic */ ha1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            final int i132 = 0;
                            final ha1 ha1Var = this.b;
                            final oa1 oa1Var2 = oa1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr2 = d2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ea1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i132) {
                                        case 0:
                                            oa1 oa1Var32 = oa1Var2;
                                            if (!oa1Var32.isFinishing() && oa1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr32 = d2VarArr2;
                                                if (d2VarArr32[0] != null) {
                                                    ha1 ha1Var22 = ha1Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull2;
                                                    if (tL_error2 != null) {
                                                        ha1Var22.c(chatFull32, oa1Var32, d2VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = ha1Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ha1Var22.c(chatFull32, oa1Var32, d2VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            oa1 oa1Var4 = oa1Var2;
                                            if (!oa1Var4.isFinishing() && oa1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr2;
                                                if (d2VarArr4[0] != null) {
                                                    ha1 ha1Var3 = ha1Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 != null) {
                                                        ha1Var3.c(chatFull4, oa1Var4, d2VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ha1Var3.c(chatFull4, oa1Var4, d2VarArr4, true);
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
                            final ha1 ha1Var2 = this.b;
                            final oa1 oa1Var3 = oa1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr3 = d2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ea1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            oa1 oa1Var32 = oa1Var3;
                                            if (!oa1Var32.isFinishing() && oa1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr32 = d2VarArr3;
                                                if (d2VarArr32[0] != null) {
                                                    ha1 ha1Var22 = ha1Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 != null) {
                                                        ha1Var22.c(chatFull32, oa1Var32, d2VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = ha1Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ha1Var22.c(chatFull32, oa1Var32, d2VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            oa1 oa1Var4 = oa1Var3;
                                            if (!oa1Var4.isFinishing() && oa1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr3;
                                                if (d2VarArr4[0] != null) {
                                                    ha1 ha1Var3 = ha1Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 != null) {
                                                        ha1Var3.c(chatFull4, oa1Var4, d2VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ha1Var3.c(chatFull4, oa1Var4, d2VarArr4, true);
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
        org.telegram.ui.ActionBar.d2 d2Var3 = d2VarArr[0];
        if (d2Var3 != null) {
            d2Var3.dismiss();
            d2VarArr[0] = null;
        }
        if (tL_chatChannelParticipant2 != null && tL_chatChannelParticipant != null && tL_chatChannelParticipant2.user_id != tL_chatChannelParticipant.user_id) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = tL_chatChannelParticipant2.channelParticipant.admin_rights;
            boolean z11 = tL_chatAdminRights != null && tL_chatAdminRights.add_admins;
            if (z11 && ((channelParticipant instanceof TLRPC.TL_channelParticipantCreator) || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit))) {
                z11 = false;
            }
            if (z11) {
                boolean z12 = channelParticipant.admin_rights == null;
                if (z12) {
                    str = "SetAsAdmin";
                    i10 = R.string.SetAsAdmin;
                } else {
                    str = "EditAdminRights";
                    i10 = R.string.EditAdminRights;
                }
                arrayList2.add(LocaleController.getString(str, i10));
                b.h(z12 ? R.drawable.msg_admins : R.drawable.msg_permissions, 0, arrayList4, arrayList3);
                z10 = z12;
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oa1Var.getParentActivity());
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
        int[] intArray = AndroidUtilities.toIntArray(arrayList4);
        final boolean z13 = z10;
        final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.da1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i14) {
                ArrayList arrayList5 = arrayList3;
                int intValue = ((Integer) arrayList5.get(i14)).intValue();
                ha1 ha1Var = ha1.this;
                TLRPC.ChatFull chatFull2 = chatFull;
                oa1 oa1Var2 = oa1Var;
                if (intValue != 0) {
                    if (((Integer) arrayList5.get(i14)).intValue() == 2) {
                        ha1Var.b(oa1Var2);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chatFull2.id);
                    bundle.putLong("search_from_user_id", ha1Var.a.id);
                    oa1Var2.presentFragment(new zn(bundle));
                    return;
                }
                boolean[] zArr = new boolean[1];
                long j11 = ha1Var.a.id;
                long j12 = chatFull2.id;
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                String str2 = channelParticipant2.rank;
                boolean z14 = z13;
                fa1 fa1Var = new fa1(ha1Var, j11, j12, tL_chatAdminRights2, tL_chatBannedRights, str2, z14, zArr, oa1Var2);
                fa1Var.U0 = new ga1(tL_chatChannelParticipant4, z14, zArr);
                oa1Var2.presentFragment(fa1Var);
            }
        };
        org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder.a;
        d2Var4.M = charSequenceArr;
        d2Var4.N = intArray;
        d2Var4.J = onClickListener;
        oa1Var.showDialog(d2Var4);
    }
}
