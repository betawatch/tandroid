package ii;

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
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                    wc.b0(oVar).g0(tL_error, false);
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                o oVar2 = this.b;
                arrayList2.add(t61.l(140, oVar2.s));
                int i10 = 0;
                if (ChatObject.canUserDoAdminAction(oVar2.I, 1)) {
                    t61 c10 = t61.c(141, R.drawable.outline_profile_photo, LocaleController.getString(ChatObject.hasPhoto(oVar2.I) ? R.string.CommunitySettingsChangePhoto : R.string.CommunitySettingsSetPhoto));
                    c10.q = true;
                    arrayList2.add(c10);
                    arrayList2.add(t61.E(2, AndroidUtilities.dp(14.0f)));
                    arrayList2.add(t61.t(0, LocaleController.getString(R.string.CommunitySectionCommunityName)));
                    arrayList2.add(t61.j(7, oVar2.r));
                    arrayList2.add(t61.E(1, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.canBlockUsers(oVar2.I)) {
                    arrayList2.add(t61.t(3, LocaleController.getString(R.string.CommunitySectionWhoCanAddChats)));
                    t61 y3 = t61.y(ImageReceiver.DEFAULT_CROSSFADE_DURATION, LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembers), LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembersInfo));
                    y3.L(oVar2.n);
                    arrayList2.add(y3);
                    t61 y10 = t61.y(151, LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdmins), LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdminsInfo));
                    y10.L(!oVar2.n);
                    arrayList2.add(y10);
                    arrayList2.add(t61.E(4, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.hasAdminRights(oVar2.I)) {
                    int i11 = R.drawable.msg_admins;
                    String string = LocaleController.getString(R.string.CommunityAdministrators);
                    TLRPC.ChatFull chatFull = oVar2.J;
                    arrayList2.add(t61.d(142, i11, string, chatFull != null ? Integer.toString(chatFull.admins_count) : ""));
                    int i12 = R.drawable.community_requests_outline_24;
                    String string2 = LocaleController.getString(R.string.CommunityPendingRequests);
                    TLRPC.ChatFull chatFull2 = oVar2.J;
                    arrayList2.add(t61.d(143, i12, string2, chatFull2 != null ? Integer.toString(chatFull2.requests_pending) : ""));
                    int i13 = R.drawable.msg_user_remove;
                    String string3 = LocaleController.getString(R.string.CommunityRemovedUsers);
                    TLRPC.ChatFull chatFull3 = oVar2.J;
                    arrayList2.add(t61.d(144, i13, string3, chatFull3 != null ? Integer.toString(chatFull3.kicked_count) : ""));
                }
                arrayList2.add(t61.E(5, AndroidUtilities.dp(14.0f)));
                t61 c11 = t61.c(146, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityMenuAddChat));
                c11.q = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = oVar2.J;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                        i10++;
                        arrayList2.add(t61.w(oVar2.getMessagesController().getUserOrChat(DialogObject.getPeerDialogId(communityPeer.peer))));
                    }
                    break;
                }
                break;
        }
    }
}
