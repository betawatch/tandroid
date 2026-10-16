package gi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ i(p pVar, int i10) {
        this.a = i10;
        this.b = pVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                p pVar = this.b;
                pVar.getClass();
                if (tL_error != null) {
                    zc.a0(pVar).f0(tL_error, false);
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                p pVar2 = this.b;
                n nVar = pVar2.r;
                m61 m61Var = new m61(-4);
                m61Var.d = 140;
                m61Var.c = nVar;
                m61Var.z = -1;
                arrayList2.add(m61Var);
                int i10 = 0;
                if (ChatObject.canUserDoAdminAction(pVar2.H, 1)) {
                    m61 c10 = m61.c(141, R.drawable.outline_profile_photo, LocaleController.getString(ChatObject.hasPhoto(pVar2.H) ? R.string.CommunitySettingsChangePhoto : R.string.CommunitySettingsSetPhoto));
                    c10.q = true;
                    arrayList2.add(c10);
                    arrayList2.add(m61.D(2, AndroidUtilities.dp(14.0f)));
                    arrayList2.add(m61.s(0, LocaleController.getString(R.string.CommunitySectionCommunityName)));
                    arrayList2.add(m61.j(7, pVar2.n));
                    arrayList2.add(m61.D(1, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.canBlockUsers(pVar2.H)) {
                    arrayList2.add(m61.s(3, LocaleController.getString(R.string.CommunitySectionWhoCanAddChats)));
                    m61 x10 = m61.x(ImageReceiver.DEFAULT_CROSSFADE_DURATION, LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembers), LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembersInfo));
                    x10.K(pVar2.h);
                    arrayList2.add(x10);
                    m61 x11 = m61.x(151, LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdmins), LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdminsInfo));
                    x11.K(!pVar2.h);
                    arrayList2.add(x11);
                    arrayList2.add(m61.D(4, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.hasAdminRights(pVar2.H)) {
                    int i11 = R.drawable.msg_admins;
                    String string = LocaleController.getString(R.string.CommunityAdministrators);
                    TLRPC.ChatFull chatFull = pVar2.I;
                    arrayList2.add(m61.d(142, i11, string, chatFull != null ? Integer.toString(chatFull.admins_count) : ""));
                    int i12 = R.drawable.community_requests_outline_24;
                    String string2 = LocaleController.getString(R.string.CommunityPendingRequests);
                    TLRPC.ChatFull chatFull2 = pVar2.I;
                    arrayList2.add(m61.d(143, i12, string2, chatFull2 != null ? Integer.toString(chatFull2.requests_pending) : ""));
                    int i13 = R.drawable.msg_user_remove;
                    String string3 = LocaleController.getString(R.string.CommunityRemovedUsers);
                    TLRPC.ChatFull chatFull3 = pVar2.I;
                    arrayList2.add(m61.d(144, i13, string3, chatFull3 != null ? Integer.toString(chatFull3.kicked_count) : ""));
                }
                arrayList2.add(m61.D(5, AndroidUtilities.dp(14.0f)));
                m61 c11 = m61.c(146, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityMenuAddChat));
                c11.q = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = pVar2.I;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                        i10++;
                        arrayList2.add(m61.v(pVar2.getMessagesController().getUserOrChat(DialogObject.getPeerDialogId(communityPeer.peer))));
                    }
                    break;
                }
                break;
        }
    }
}
