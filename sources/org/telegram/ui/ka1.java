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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ka1 {
    public TLRPC.User a;
    public String b;

    public static TLRPC.User a(long j3, ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.id == j3) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.n2 n2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.a.id);
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.a, false);
        n2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final TLRPC.ChatFull chatFull, final ra1 ra1Var, final org.telegram.ui.ActionBar.b2[] b2VarArr, boolean z10) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        String str;
        int i10;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        boolean z11 = false;
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.a, false);
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (!z10 || (arrayList = chatFull.participants.participants) == null) {
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
        } else {
            int size = arrayList.size();
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i11);
                long j3 = chatParticipant.user_id;
                if (j3 == this.a.id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
                if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant2 = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
            }
        }
        arrayList2.add(LocaleController.getString("StatisticOpenProfile", R.string.StatisticOpenProfile));
        org.telegram.ui.Cells.q3.n(R.drawable.msg_openprofile, 2, arrayList4, arrayList3);
        arrayList2.add(LocaleController.getString("StatisticSearchUserHistory", R.string.StatisticSearchUserHistory));
        org.telegram.ui.Cells.q3.n(R.drawable.msg_msgbubble3, 1, arrayList4, arrayList3);
        if (z10 && tL_chatChannelParticipant == null) {
            if (b2VarArr[0] == null) {
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ra1Var.getFragmentView().getContext(), 3, null);
                b2VarArr[0] = b2Var;
                b2Var.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.id);
            tL_channels_getParticipant.participant = MessagesController.getInputPeer(this.a);
            final int i12 = 0;
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) { // from class: org.telegram.ui.fa1
                public final /* synthetic */ ka1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i13 = 0;
                            final ka1 ka1Var = this.b;
                            final ra1 ra1Var2 = ra1Var;
                            final org.telegram.ui.ActionBar.b2[] b2VarArr2 = b2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ha1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            ra1 ra1Var3 = ra1Var2;
                                            if (!ra1Var3.isFinishing() && ra1Var3.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr3 = b2VarArr2;
                                                if (b2VarArr3[0] != null) {
                                                    ka1 ka1Var2 = ka1Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull3 = chatFull2;
                                                    if (tL_error2 != null) {
                                                        ka1Var2.c(chatFull3, ra1Var3, b2VarArr3, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = ka1Var2.a.id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ka1Var2.c(chatFull3, ra1Var3, b2VarArr3, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            ra1 ra1Var4 = ra1Var2;
                                            if (!ra1Var4.isFinishing() && ra1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr4 = b2VarArr2;
                                                if (b2VarArr4[0] != null) {
                                                    ka1 ka1Var3 = ka1Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 != null) {
                                                        ka1Var3.c(chatFull4, ra1Var4, b2VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ka1Var3.c(chatFull4, ra1Var4, b2VarArr4, true);
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
                            final ka1 ka1Var2 = this.b;
                            final ra1 ra1Var3 = ra1Var;
                            final org.telegram.ui.ActionBar.b2[] b2VarArr3 = b2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ha1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            ra1 ra1Var32 = ra1Var3;
                                            if (!ra1Var32.isFinishing() && ra1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr32 = b2VarArr3;
                                                if (b2VarArr32[0] != null) {
                                                    ka1 ka1Var22 = ka1Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 != null) {
                                                        ka1Var22.c(chatFull32, ra1Var32, b2VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = ka1Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ka1Var22.c(chatFull32, ra1Var32, b2VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            ra1 ra1Var4 = ra1Var3;
                                            if (!ra1Var4.isFinishing() && ra1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr4 = b2VarArr3;
                                                if (b2VarArr4[0] != null) {
                                                    ka1 ka1Var3 = ka1Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 != null) {
                                                        ka1Var3.c(chatFull4, ra1Var4, b2VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ka1Var3.c(chatFull4, ra1Var4, b2VarArr4, true);
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
            if (b2VarArr[0] == null) {
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(ra1Var.getFragmentView().getContext(), 3, null);
                b2VarArr[0] = b2Var2;
                b2Var2.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant2.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.id);
            tL_channels_getParticipant2.participant = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(UserConfig.getInstance(UserConfig.selectedAccount).clientUserId);
            final int i13 = 1;
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) { // from class: org.telegram.ui.fa1
                public final /* synthetic */ ka1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            final int i132 = 0;
                            final ka1 ka1Var = this.b;
                            final ra1 ra1Var2 = ra1Var;
                            final org.telegram.ui.ActionBar.b2[] b2VarArr2 = b2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ha1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i132) {
                                        case 0:
                                            ra1 ra1Var32 = ra1Var2;
                                            if (!ra1Var32.isFinishing() && ra1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr32 = b2VarArr2;
                                                if (b2VarArr32[0] != null) {
                                                    ka1 ka1Var22 = ka1Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull2;
                                                    if (tL_error2 != null) {
                                                        ka1Var22.c(chatFull32, ra1Var32, b2VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = ka1Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ka1Var22.c(chatFull32, ra1Var32, b2VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            ra1 ra1Var4 = ra1Var2;
                                            if (!ra1Var4.isFinishing() && ra1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr4 = b2VarArr2;
                                                if (b2VarArr4[0] != null) {
                                                    ka1 ka1Var3 = ka1Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 != null) {
                                                        ka1Var3.c(chatFull4, ra1Var4, b2VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ka1Var3.c(chatFull4, ra1Var4, b2VarArr4, true);
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
                            final ka1 ka1Var2 = this.b;
                            final ra1 ra1Var3 = ra1Var;
                            final org.telegram.ui.ActionBar.b2[] b2VarArr3 = b2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ha1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            ra1 ra1Var32 = ra1Var3;
                                            if (!ra1Var32.isFinishing() && ra1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr32 = b2VarArr3;
                                                if (b2VarArr32[0] != null) {
                                                    ka1 ka1Var22 = ka1Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 != null) {
                                                        ka1Var22.c(chatFull32, ra1Var32, b2VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = ka1Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ka1Var22.c(chatFull32, ra1Var32, b2VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            ra1 ra1Var4 = ra1Var3;
                                            if (!ra1Var4.isFinishing() && ra1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr4 = b2VarArr3;
                                                if (b2VarArr4[0] != null) {
                                                    ka1 ka1Var3 = ka1Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 != null) {
                                                        ka1Var3.c(chatFull4, ra1Var4, b2VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ka1Var3.c(chatFull4, ra1Var4, b2VarArr4, true);
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
        org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr[0];
        if (b2Var3 != null) {
            b2Var3.dismiss();
            b2VarArr[0] = null;
        }
        if (tL_chatChannelParticipant2 != null && tL_chatChannelParticipant != null && tL_chatChannelParticipant2.user_id != tL_chatChannelParticipant.user_id) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = tL_chatChannelParticipant2.channelParticipant.admin_rights;
            boolean z12 = tL_chatAdminRights != null && tL_chatAdminRights.add_admins;
            if (z12 && ((channelParticipant instanceof TLRPC.TL_channelParticipantCreator) || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit))) {
                z12 = false;
            }
            if (z12) {
                boolean z13 = channelParticipant.admin_rights == null;
                if (z13) {
                    str = "SetAsAdmin";
                    i10 = R.string.SetAsAdmin;
                } else {
                    str = "EditAdminRights";
                    i10 = R.string.EditAdminRights;
                }
                arrayList2.add(LocaleController.getString(str, i10));
                org.telegram.ui.Cells.q3.n(z13 ? R.drawable.msg_admins : R.drawable.msg_permissions, 0, arrayList4, arrayList3);
                z11 = z13;
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ra1Var.getParentActivity());
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
        int[] intArray = AndroidUtilities.toIntArray(arrayList4);
        final boolean z14 = z11;
        final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.ga1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i14) {
                ArrayList arrayList5 = arrayList3;
                int intValue = ((Integer) arrayList5.get(i14)).intValue();
                ka1 ka1Var = ka1.this;
                TLRPC.ChatFull chatFull2 = chatFull;
                ra1 ra1Var2 = ra1Var;
                if (intValue != 0) {
                    if (((Integer) arrayList5.get(i14)).intValue() == 2) {
                        ka1Var.b(ra1Var2);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chatFull2.id);
                    bundle.putLong("search_from_user_id", ka1Var.a.id);
                    ra1Var2.presentFragment(new xn(bundle));
                    return;
                }
                boolean[] zArr = new boolean[1];
                long j10 = ka1Var.a.id;
                long j11 = chatFull2.id;
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                String str2 = channelParticipant2.rank;
                boolean z15 = z14;
                ia1 ia1Var = new ia1(ka1Var, j10, j11, tL_chatAdminRights2, tL_chatBannedRights, str2, z15, zArr, ra1Var2);
                ia1Var.X0 = new ja1(tL_chatChannelParticipant4, z15, zArr);
                ra1Var2.presentFragment(ia1Var);
            }
        };
        org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder.a;
        b2Var4.P = charSequenceArr;
        b2Var4.Q = intArray;
        b2Var4.M = onClickListener;
        ra1Var.showDialog(b2Var4);
    }
}
