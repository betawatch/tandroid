// default package

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nxa {
    public TLRPC.User a;
    public String b;

    public static TLRPC.User a(ArrayList arrayList, long j) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.id == j) {
                return user;
            }
        }
        return null;
    }

    public final void b(d dVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.a.id);
        na7.q1(y6c.t0).a4(this.a, false, false);
        dVar.presentFragment(new ProfileActivity(bundle, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01be A[LOOP:1: B:70:0x01bc->B:71:0x01be, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final TLRPC.ChatFull chatFull, final uxa uxaVar, final hd[] hdVarArr, boolean z) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        boolean z2;
        int size;
        String str;
        int i;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        na7.q1(y6c.t0).a4(this.a, false, false);
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (!z || (arrayList = chatFull.participants.participants) == null) {
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
        } else {
            int size2 = arrayList.size();
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
            for (int i2 = 0; i2 < size2; i2++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i2);
                long j = chatParticipant.user_id;
                if (j == this.a.id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
                if (j == y6c.h(y6c.t0).n && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant2 = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
            }
        }
        b00.r("StatisticOpenProfile", 2131744659, arrayList2, R.drawable.msg_openprofile, arrayList4);
        arrayList3.add(2);
        arrayList2.add(k96.M0(2131744657, "StatisticSearchUserHistory"));
        arrayList4.add(Integer.valueOf(R.drawable.msg_msgbubble3));
        arrayList3.add(1);
        if (z) {
            if (tL_chatChannelParticipant == null) {
                if (hdVarArr[0] == null) {
                    hd hdVar = new hd(3, null, uxaVar.getFragmentView().getContext());
                    hdVarArr[0] = hdVar;
                    hdVar.q(300L);
                }
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = na7.q1(y6c.t0).f1(chatFull.id);
                tL_channels_getParticipant.participant = na7.l1(this.a);
                final byte b = 0;
                ConnectionsManager.getInstance(y6c.t0).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) { // from class: ixa
                    public final /* synthetic */ nxa b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (b) {
                            case 0:
                                final byte b2 = 0;
                                final nxa nxaVar = this.b;
                                final uxa uxaVar2 = uxaVar;
                                final hd[] hdVarArr2 = hdVarArr;
                                final TLRPC.ChatFull chatFull2 = chatFull;
                                gl.c3(new Runnable() { // from class: kxa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b3 = b2;
                                        TLRPC.ChatFull chatFull3 = chatFull2;
                                        TLObject tLObject2 = tLObject;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        hd[] hdVarArr3 = hdVarArr2;
                                        uxa uxaVar3 = uxaVar2;
                                        nxa nxaVar2 = nxaVar;
                                        switch (b3) {
                                            case 0:
                                                if (!uxaVar3.isFinishing() && uxaVar3.getFragmentView() != null && hdVarArr3[0] != null) {
                                                    if (tL_error2 != null) {
                                                        nxaVar2.c(chatFull3, uxaVar3, hdVarArr3, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant3.user_id = nxaVar2.a.id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        nxaVar2.c(chatFull3, uxaVar3, hdVarArr3, true);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                if (!uxaVar3.isFinishing() && uxaVar3.getFragmentView() != null && hdVarArr3[0] != null) {
                                                    if (tL_error2 != null) {
                                                        nxaVar2.c(chatFull3, uxaVar3, hdVarArr3, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant4.user_id = y6c.h(y6c.t0).n;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        nxaVar2.c(chatFull3, uxaVar3, hdVarArr3, true);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final byte b3 = 1;
                                final nxa nxaVar2 = this.b;
                                final uxa uxaVar3 = uxaVar;
                                final hd[] hdVarArr3 = hdVarArr;
                                final TLRPC.ChatFull chatFull3 = chatFull;
                                gl.c3(new Runnable() { // from class: kxa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b32 = b3;
                                        TLRPC.ChatFull chatFull32 = chatFull3;
                                        TLObject tLObject2 = tLObject;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        hd[] hdVarArr32 = hdVarArr3;
                                        uxa uxaVar32 = uxaVar3;
                                        nxa nxaVar22 = nxaVar2;
                                        switch (b32) {
                                            case 0:
                                                if (!uxaVar32.isFinishing() && uxaVar32.getFragmentView() != null && hdVarArr32[0] != null) {
                                                    if (tL_error2 != null) {
                                                        nxaVar22.c(chatFull32, uxaVar32, hdVarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant3.user_id = nxaVar22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        nxaVar22.c(chatFull32, uxaVar32, hdVarArr32, true);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                if (!uxaVar32.isFinishing() && uxaVar32.getFragmentView() != null && hdVarArr32[0] != null) {
                                                    if (tL_error2 != null) {
                                                        nxaVar22.c(chatFull32, uxaVar32, hdVarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant4.user_id = y6c.h(y6c.t0).n;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        nxaVar22.c(chatFull32, uxaVar32, hdVarArr32, true);
                                                        break;
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
            if (tL_chatChannelParticipant2 == null) {
                if (hdVarArr[0] == null) {
                    hd hdVar2 = new hd(3, null, uxaVar.getFragmentView().getContext());
                    hdVarArr[0] = hdVar2;
                    hdVar2.q(300L);
                }
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant2.channel = na7.q1(y6c.t0).f1(chatFull.id);
                tL_channels_getParticipant2.participant = na7.q1(y6c.t0).h1(y6c.h(y6c.t0).n);
                final byte b2 = 1;
                ConnectionsManager.getInstance(y6c.t0).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) { // from class: ixa
                    public final /* synthetic */ nxa b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (b2) {
                            case 0:
                                final byte b22 = 0;
                                final nxa nxaVar = this.b;
                                final uxa uxaVar2 = uxaVar;
                                final hd[] hdVarArr2 = hdVarArr;
                                final TLRPC.ChatFull chatFull2 = chatFull;
                                gl.c3(new Runnable() { // from class: kxa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b32 = b22;
                                        TLRPC.ChatFull chatFull32 = chatFull2;
                                        TLObject tLObject2 = tLObject;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        hd[] hdVarArr32 = hdVarArr2;
                                        uxa uxaVar32 = uxaVar2;
                                        nxa nxaVar22 = nxaVar;
                                        switch (b32) {
                                            case 0:
                                                if (!uxaVar32.isFinishing() && uxaVar32.getFragmentView() != null && hdVarArr32[0] != null) {
                                                    if (tL_error2 != null) {
                                                        nxaVar22.c(chatFull32, uxaVar32, hdVarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant3.user_id = nxaVar22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        nxaVar22.c(chatFull32, uxaVar32, hdVarArr32, true);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                if (!uxaVar32.isFinishing() && uxaVar32.getFragmentView() != null && hdVarArr32[0] != null) {
                                                    if (tL_error2 != null) {
                                                        nxaVar22.c(chatFull32, uxaVar32, hdVarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant4.user_id = y6c.h(y6c.t0).n;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        nxaVar22.c(chatFull32, uxaVar32, hdVarArr32, true);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final byte b3 = 1;
                                final nxa nxaVar2 = this.b;
                                final uxa uxaVar3 = uxaVar;
                                final hd[] hdVarArr3 = hdVarArr;
                                final TLRPC.ChatFull chatFull3 = chatFull;
                                gl.c3(new Runnable() { // from class: kxa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b32 = b3;
                                        TLRPC.ChatFull chatFull32 = chatFull3;
                                        TLObject tLObject2 = tLObject;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        hd[] hdVarArr32 = hdVarArr3;
                                        uxa uxaVar32 = uxaVar3;
                                        nxa nxaVar22 = nxaVar2;
                                        switch (b32) {
                                            case 0:
                                                if (!uxaVar32.isFinishing() && uxaVar32.getFragmentView() != null && hdVarArr32[0] != null) {
                                                    if (tL_error2 != null) {
                                                        nxaVar22.c(chatFull32, uxaVar32, hdVarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant3.user_id = nxaVar22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        nxaVar22.c(chatFull32, uxaVar32, hdVarArr32, true);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                if (!uxaVar32.isFinishing() && uxaVar32.getFragmentView() != null && hdVarArr32[0] != null) {
                                                    if (tL_error2 != null) {
                                                        nxaVar22.c(chatFull32, uxaVar32, hdVarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant4.user_id = y6c.h(y6c.t0).n;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        nxaVar22.c(chatFull32, uxaVar32, hdVarArr32, true);
                                                        break;
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
        }
        hd hdVar3 = hdVarArr[0];
        if (hdVar3 != null) {
            hdVar3.dismiss();
            hdVarArr[0] = null;
        }
        if (tL_chatChannelParticipant2 != null && tL_chatChannelParticipant != null && tL_chatChannelParticipant2.user_id != tL_chatChannelParticipant.user_id) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = tL_chatChannelParticipant2.channelParticipant.admin_rights;
            boolean z3 = tL_chatAdminRights != null && tL_chatAdminRights.add_admins;
            if (z3 && ((channelParticipant instanceof TLRPC.TL_channelParticipantCreator) || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit))) {
                z3 = false;
            }
            if (z3) {
                z2 = channelParticipant.admin_rights == null;
                if (z2) {
                    str = "SetAsAdmin";
                    i = 2131745355;
                } else {
                    str = "EditAdminRights";
                    i = 2131751292;
                }
                arrayList2.add(k96.M0(i, str));
                arrayList4.add(Integer.valueOf(z2 ? R.drawable.msg_admins : R.drawable.msg_permissions));
                arrayList3.add(0);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uxaVar.getParentActivity());
                CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
                Typeface typeface = gl.a;
                size = arrayList4.size();
                int[] iArr = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr[i3] = ((Integer) arrayList4.get(i3)).intValue();
                }
                final boolean z4 = z2;
                final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: jxa
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        ArrayList arrayList5 = arrayList3;
                        int intValue = ((Integer) arrayList5.get(i4)).intValue();
                        nxa nxaVar = nxa.this;
                        TLRPC.ChatFull chatFull2 = chatFull;
                        uxa uxaVar2 = uxaVar;
                        if (intValue != 0) {
                            if (((Integer) arrayList5.get(i4)).intValue() == 2) {
                                nxaVar.b(uxaVar2);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatFull2.id);
                            bundle.putLong("search_from_user_id", nxaVar.a.id);
                            uxaVar2.presentFragment(new mu1(bundle));
                            return;
                        }
                        boolean[] zArr = new boolean[1];
                        long j2 = nxaVar.a.id;
                        long j3 = chatFull2.id;
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                        String str2 = channelParticipant2.rank;
                        boolean z5 = z4;
                        lxa lxaVar = new lxa(nxaVar, j2, j3, tL_chatAdminRights2, tL_chatBannedRights, str2, z5, zArr, uxaVar2);
                        lxaVar.Y0 = new mxa(tL_chatChannelParticipant4, z5, zArr);
                        uxaVar2.presentFragment(lxaVar);
                    }
                };
                hd hdVar4 = alertDialog$Builder.a;
                hdVar4.Q = charSequenceArr;
                hdVar4.R = iArr;
                hdVar4.N = onClickListener;
                uxaVar.showDialog(hdVar4);
            }
        }
        z2 = false;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(uxaVar.getParentActivity());
        CharSequence[] charSequenceArr2 = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
        Typeface typeface2 = gl.a;
        size = arrayList4.size();
        int[] iArr2 = new int[size];
        while (i3 < size) {
        }
        final boolean z42 = z2;
        final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant32 = tL_chatChannelParticipant;
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: jxa
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                ArrayList arrayList5 = arrayList3;
                int intValue = ((Integer) arrayList5.get(i4)).intValue();
                nxa nxaVar = nxa.this;
                TLRPC.ChatFull chatFull2 = chatFull;
                uxa uxaVar2 = uxaVar;
                if (intValue != 0) {
                    if (((Integer) arrayList5.get(i4)).intValue() == 2) {
                        nxaVar.b(uxaVar2);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chatFull2.id);
                    bundle.putLong("search_from_user_id", nxaVar.a.id);
                    uxaVar2.presentFragment(new mu1(bundle));
                    return;
                }
                boolean[] zArr = new boolean[1];
                long j2 = nxaVar.a.id;
                long j3 = chatFull2.id;
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant32;
                TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                String str2 = channelParticipant2.rank;
                boolean z5 = z42;
                lxa lxaVar = new lxa(nxaVar, j2, j3, tL_chatAdminRights2, tL_chatBannedRights, str2, z5, zArr, uxaVar2);
                lxaVar.Y0 = new mxa(tL_chatChannelParticipant4, z5, zArr);
                uxaVar2.presentFragment(lxaVar);
            }
        };
        hd hdVar42 = alertDialog$Builder2.a;
        hdVar42.Q = charSequenceArr2;
        hdVar42.R = iArr2;
        hdVar42.N = onClickListener2;
        uxaVar.showDialog(hdVar42);
    }
}
