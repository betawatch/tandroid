package oh;

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
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ i(o oVar, int i10) {
        this.a = i10;
        this.b = oVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                o oVar = this.b;
                oVar.getClass();
                if (tL_error != null) {
                    mc.a0(oVar).d0(tL_error, false);
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                o oVar2 = this.b;
                n nVar = oVar2.r;
                n41 n41Var = new n41(-4);
                n41Var.d = 140;
                n41Var.c = nVar;
                n41Var.z = -1;
                arrayList2.add(n41Var);
                int i10 = 0;
                if (ChatObject.canUserDoAdminAction(oVar2.D, 1)) {
                    n41 c10 = n41.c(141, R.drawable.outline_profile_photo, LocaleController.getString(ChatObject.hasPhoto(oVar2.D) ? R.string.CommunitySettingsChangePhoto : R.string.CommunitySettingsSetPhoto));
                    c10.q = true;
                    arrayList2.add(c10);
                    arrayList2.add(n41.D(2, AndroidUtilities.dp(14.0f)));
                    arrayList2.add(n41.s(0, LocaleController.getString(R.string.CommunitySectionCommunityName)));
                    arrayList2.add(n41.j(7, oVar2.n));
                    arrayList2.add(n41.D(1, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.canBlockUsers(oVar2.D)) {
                    arrayList2.add(n41.s(3, LocaleController.getString(R.string.CommunitySectionWhoCanAddChats)));
                    n41 x8 = n41.x(ImageReceiver.DEFAULT_CROSSFADE_DURATION, LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembers), LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembersInfo));
                    x8.K(oVar2.h);
                    arrayList2.add(x8);
                    n41 x10 = n41.x(151, LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdmins), LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdminsInfo));
                    x10.K(!oVar2.h);
                    arrayList2.add(x10);
                    arrayList2.add(n41.D(4, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.hasAdminRights(oVar2.D)) {
                    int i11 = R.drawable.msg_admins;
                    String string = LocaleController.getString(R.string.CommunityAdministrators);
                    TLRPC.ChatFull chatFull = oVar2.E;
                    arrayList2.add(n41.d(142, i11, string, chatFull != null ? Integer.toString(chatFull.admins_count) : ""));
                    int i12 = R.drawable.community_requests_outline_24;
                    String string2 = LocaleController.getString(R.string.CommunityPendingRequests);
                    TLRPC.ChatFull chatFull2 = oVar2.E;
                    arrayList2.add(n41.d(143, i12, string2, chatFull2 != null ? Integer.toString(chatFull2.requests_pending) : ""));
                    int i13 = R.drawable.msg_user_remove;
                    String string3 = LocaleController.getString(R.string.CommunityRemovedUsers);
                    TLRPC.ChatFull chatFull3 = oVar2.E;
                    arrayList2.add(n41.d(144, i13, string3, chatFull3 != null ? Integer.toString(chatFull3.kicked_count) : ""));
                }
                arrayList2.add(n41.D(5, AndroidUtilities.dp(14.0f)));
                n41 c11 = n41.c(146, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityMenuAddChat));
                c11.q = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = oVar2.E;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                        i10++;
                        arrayList2.add(n41.v(oVar2.getMessagesController().getUserOrChat(DialogObject.getPeerDialogId(communityPeer.peer))));
                    }
                    break;
                }
                break;
        }
    }
}
