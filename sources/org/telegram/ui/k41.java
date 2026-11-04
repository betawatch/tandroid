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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k41 {
    public TLRPC.User a;
    public String b;

    public static TLRPC.User a(ArrayList arrayList, long j10) {
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.id == j10) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.d2 d2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.a.id);
        org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).X3(this.a, false, false);
        d2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01c1 A[LOOP:1: B:70:0x01bf->B:71:0x01c1, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final TLRPC.ChatFull chatFull, final r41 r41Var, final org.telegram.ui.ActionBar.s1[] s1VarArr, boolean z10) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        boolean z11;
        int size;
        String str;
        int i3;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).X3(this.a, false, false);
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
            for (int i10 = 0; i10 < size2; i10++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i10);
                long j10 = chatParticipant.user_id;
                if (j10 == this.a.id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
                if (j10 == org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).n && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant2 = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
            }
        }
        org.telegram.ui.Cells.f1.x("StatisticOpenProfile", 2131744906, arrayList2, R.drawable.msg_openprofile, arrayList4);
        arrayList3.add(2);
        arrayList2.add(org.telegram.messenger.bd.M0(2131744904, "StatisticSearchUserHistory"));
        arrayList4.add(Integer.valueOf(R.drawable.msg_msgbubble3));
        arrayList3.add(1);
        if (z10 && tL_chatChannelParticipant == null) {
            if (s1VarArr[0] == null) {
                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, r41Var.getFragmentView().getContext(), null);
                s1VarArr[0] = s1Var;
                s1Var.r(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).h1(chatFull.id);
            tL_channels_getParticipant.participant = org.telegram.messenger.hp.n1(this.a);
            final int i11 = 0;
            ConnectionsManager.getInstance(org.telegram.messenger.h10.t0).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) { // from class: org.telegram.ui.f41
                public final /* synthetic */ k41 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            final int i12 = 0;
                            final k41 k41Var = this.b;
                            final r41 r41Var2 = r41Var;
                            final org.telegram.ui.ActionBar.s1[] s1VarArr2 = s1VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.h41
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            k41 k41Var2 = k41Var;
                                            k41Var2.getClass();
                                            r41 r41Var3 = r41Var2;
                                            if (!r41Var3.isFinishing() && r41Var3.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.s1[] s1VarArr3 = s1VarArr2;
                                                if (s1VarArr3[0] != null) {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull3 = chatFull2;
                                                    if (tL_error2 != null) {
                                                        k41Var2.c(chatFull3, r41Var3, s1VarArr3, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = k41Var2.a.id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        k41Var2.c(chatFull3, r41Var3, s1VarArr3, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            k41 k41Var3 = k41Var;
                                            k41Var3.getClass();
                                            r41 r41Var4 = r41Var2;
                                            if (!r41Var4.isFinishing() && r41Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.s1[] s1VarArr4 = s1VarArr2;
                                                if (s1VarArr4[0] != null) {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 != null) {
                                                        k41Var3.c(chatFull4, r41Var4, s1VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).n;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        k41Var3.c(chatFull4, r41Var4, s1VarArr4, true);
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
                            final int i13 = 1;
                            final k41 k41Var2 = this.b;
                            final r41 r41Var3 = r41Var;
                            final org.telegram.ui.ActionBar.s1[] s1VarArr3 = s1VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.h41
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            k41 k41Var22 = k41Var2;
                                            k41Var22.getClass();
                                            r41 r41Var32 = r41Var3;
                                            if (!r41Var32.isFinishing() && r41Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.s1[] s1VarArr32 = s1VarArr3;
                                                if (s1VarArr32[0] != null) {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 != null) {
                                                        k41Var22.c(chatFull32, r41Var32, s1VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = k41Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        k41Var22.c(chatFull32, r41Var32, s1VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            k41 k41Var3 = k41Var2;
                                            k41Var3.getClass();
                                            r41 r41Var4 = r41Var3;
                                            if (!r41Var4.isFinishing() && r41Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.s1[] s1VarArr4 = s1VarArr3;
                                                if (s1VarArr4[0] != null) {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 != null) {
                                                        k41Var3.c(chatFull4, r41Var4, s1VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).n;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        k41Var3.c(chatFull4, r41Var4, s1VarArr4, true);
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
            if (s1VarArr[0] == null) {
                org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(3, r41Var.getFragmentView().getContext(), null);
                s1VarArr[0] = s1Var2;
                s1Var2.r(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant2.channel = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).h1(chatFull.id);
            tL_channels_getParticipant2.participant = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).j1(org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).n);
            final int i12 = 1;
            ConnectionsManager.getInstance(org.telegram.messenger.h10.t0).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) { // from class: org.telegram.ui.f41
                public final /* synthetic */ k41 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i122 = 0;
                            final k41 k41Var = this.b;
                            final r41 r41Var2 = r41Var;
                            final org.telegram.ui.ActionBar.s1[] s1VarArr2 = s1VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.h41
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i122) {
                                        case 0:
                                            k41 k41Var22 = k41Var;
                                            k41Var22.getClass();
                                            r41 r41Var32 = r41Var2;
                                            if (!r41Var32.isFinishing() && r41Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.s1[] s1VarArr32 = s1VarArr2;
                                                if (s1VarArr32[0] != null) {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull2;
                                                    if (tL_error2 != null) {
                                                        k41Var22.c(chatFull32, r41Var32, s1VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = k41Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        k41Var22.c(chatFull32, r41Var32, s1VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            k41 k41Var3 = k41Var;
                                            k41Var3.getClass();
                                            r41 r41Var4 = r41Var2;
                                            if (!r41Var4.isFinishing() && r41Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.s1[] s1VarArr4 = s1VarArr2;
                                                if (s1VarArr4[0] != null) {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 != null) {
                                                        k41Var3.c(chatFull4, r41Var4, s1VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).n;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        k41Var3.c(chatFull4, r41Var4, s1VarArr4, true);
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
                            final int i13 = 1;
                            final k41 k41Var2 = this.b;
                            final r41 r41Var3 = r41Var;
                            final org.telegram.ui.ActionBar.s1[] s1VarArr3 = s1VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.h41
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            k41 k41Var22 = k41Var2;
                                            k41Var22.getClass();
                                            r41 r41Var32 = r41Var3;
                                            if (!r41Var32.isFinishing() && r41Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.s1[] s1VarArr32 = s1VarArr3;
                                                if (s1VarArr32[0] != null) {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 != null) {
                                                        k41Var22.c(chatFull32, r41Var32, s1VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = k41Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        k41Var22.c(chatFull32, r41Var32, s1VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            k41 k41Var3 = k41Var2;
                                            k41Var3.getClass();
                                            r41 r41Var4 = r41Var3;
                                            if (!r41Var4.isFinishing() && r41Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.s1[] s1VarArr4 = s1VarArr3;
                                                if (s1VarArr4[0] != null) {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 != null) {
                                                        k41Var3.c(chatFull4, r41Var4, s1VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).n;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        k41Var3.c(chatFull4, r41Var4, s1VarArr4, true);
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
        org.telegram.ui.ActionBar.s1 s1Var3 = s1VarArr[0];
        if (s1Var3 != null) {
            s1Var3.dismiss();
            s1VarArr[0] = null;
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
                    i3 = 2131745557;
                } else {
                    str = "EditAdminRights";
                    i3 = 2131751305;
                }
                arrayList2.add(org.telegram.messenger.bd.M0(i3, str));
                arrayList4.add(Integer.valueOf(z11 ? R.drawable.msg_admins : R.drawable.msg_permissions));
                arrayList3.add(0);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r41Var.getParentActivity());
                CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
                Typeface typeface = org.telegram.messenger.g0.a;
                size = arrayList4.size();
                int[] iArr = new int[size];
                for (int i13 = 0; i13 < size; i13++) {
                    iArr[i13] = ((Integer) arrayList4.get(i13)).intValue();
                }
                final boolean z13 = z11;
                final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.g41
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i14) {
                        ArrayList arrayList5 = arrayList3;
                        int intValue = ((Integer) arrayList5.get(i14)).intValue();
                        k41 k41Var = k41.this;
                        TLRPC.ChatFull chatFull2 = chatFull;
                        r41 r41Var2 = r41Var;
                        if (intValue != 0) {
                            if (((Integer) arrayList5.get(i14)).intValue() == 2) {
                                k41Var.b(r41Var2);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatFull2.id);
                            bundle.putLong("search_from_user_id", k41Var.a.id);
                            r41Var2.presentFragment(new wm(bundle));
                            return;
                        }
                        boolean[] zArr = new boolean[1];
                        long j11 = k41Var.a.id;
                        long j12 = chatFull2.id;
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                        String str2 = channelParticipant2.rank;
                        boolean z14 = z13;
                        i41 i41Var = new i41(k41Var, j11, j12, tL_chatAdminRights2, tL_chatBannedRights, str2, z14, zArr, r41Var2);
                        i41Var.Y0 = new j41(tL_chatChannelParticipant4, z14, zArr);
                        r41Var2.presentFragment(i41Var);
                    }
                };
                org.telegram.ui.ActionBar.s1 s1Var4 = alertDialog$Builder.a;
                s1Var4.Q = charSequenceArr;
                s1Var4.R = iArr;
                s1Var4.N = onClickListener;
                r41Var.showDialog(s1Var4);
            }
        }
        z11 = false;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(r41Var.getParentActivity());
        CharSequence[] charSequenceArr2 = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
        Typeface typeface2 = org.telegram.messenger.g0.a;
        size = arrayList4.size();
        int[] iArr2 = new int[size];
        while (i13 < size) {
        }
        final boolean z132 = z11;
        final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant32 = tL_chatChannelParticipant;
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.g41
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i14) {
                ArrayList arrayList5 = arrayList3;
                int intValue = ((Integer) arrayList5.get(i14)).intValue();
                k41 k41Var = k41.this;
                TLRPC.ChatFull chatFull2 = chatFull;
                r41 r41Var2 = r41Var;
                if (intValue != 0) {
                    if (((Integer) arrayList5.get(i14)).intValue() == 2) {
                        k41Var.b(r41Var2);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chatFull2.id);
                    bundle.putLong("search_from_user_id", k41Var.a.id);
                    r41Var2.presentFragment(new wm(bundle));
                    return;
                }
                boolean[] zArr = new boolean[1];
                long j11 = k41Var.a.id;
                long j12 = chatFull2.id;
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant32;
                TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                String str2 = channelParticipant2.rank;
                boolean z14 = z132;
                i41 i41Var = new i41(k41Var, j11, j12, tL_chatAdminRights2, tL_chatBannedRights, str2, z14, zArr, r41Var2);
                i41Var.Y0 = new j41(tL_chatChannelParticipant4, z14, zArr);
                r41Var2.presentFragment(i41Var);
            }
        };
        org.telegram.ui.ActionBar.s1 s1Var42 = alertDialog$Builder2.a;
        s1Var42.Q = charSequenceArr2;
        s1Var42.R = iArr2;
        s1Var42.N = onClickListener2;
        r41Var.showDialog(s1Var42);
    }
}
