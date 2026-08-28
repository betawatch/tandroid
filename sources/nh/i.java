package nh;

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
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ i(o oVar, int i9) {
        this.a = i9;
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
                    oc.a0(oVar).d0(tL_error, false);
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                o oVar2 = this.b;
                n nVar = oVar2.r;
                l41 l41Var = new l41(-4);
                l41Var.d = 140;
                l41Var.c = nVar;
                l41Var.z = -1;
                arrayList2.add(l41Var);
                int i9 = 0;
                if (ChatObject.canUserDoAdminAction(oVar2.D, 1)) {
                    l41 c10 = l41.c(141, R.drawable.outline_profile_photo, LocaleController.getString(ChatObject.hasPhoto(oVar2.D) ? R.string.CommunitySettingsChangePhoto : R.string.CommunitySettingsSetPhoto));
                    c10.q = true;
                    arrayList2.add(c10);
                    arrayList2.add(l41.D(2, AndroidUtilities.dp(14.0f)));
                    arrayList2.add(l41.s(0, LocaleController.getString(R.string.CommunitySectionCommunityName)));
                    arrayList2.add(l41.j(7, oVar2.n));
                    arrayList2.add(l41.D(1, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.canBlockUsers(oVar2.D)) {
                    arrayList2.add(l41.s(3, LocaleController.getString(R.string.CommunitySectionWhoCanAddChats)));
                    l41 x10 = l41.x(ImageReceiver.DEFAULT_CROSSFADE_DURATION, LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembers), LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembersInfo));
                    x10.K(oVar2.h);
                    arrayList2.add(x10);
                    l41 x11 = l41.x(151, LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdmins), LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdminsInfo));
                    x11.K(!oVar2.h);
                    arrayList2.add(x11);
                    arrayList2.add(l41.D(4, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.hasAdminRights(oVar2.D)) {
                    int i10 = R.drawable.msg_admins;
                    String string = LocaleController.getString(R.string.CommunityAdministrators);
                    TLRPC.ChatFull chatFull = oVar2.E;
                    arrayList2.add(l41.d(142, i10, string, chatFull != null ? Integer.toString(chatFull.admins_count) : ""));
                    int i11 = R.drawable.community_requests_outline_24;
                    String string2 = LocaleController.getString(R.string.CommunityPendingRequests);
                    TLRPC.ChatFull chatFull2 = oVar2.E;
                    arrayList2.add(l41.d(143, i11, string2, chatFull2 != null ? Integer.toString(chatFull2.requests_pending) : ""));
                    int i12 = R.drawable.msg_user_remove;
                    String string3 = LocaleController.getString(R.string.CommunityRemovedUsers);
                    TLRPC.ChatFull chatFull3 = oVar2.E;
                    arrayList2.add(l41.d(144, i12, string3, chatFull3 != null ? Integer.toString(chatFull3.kicked_count) : ""));
                }
                arrayList2.add(l41.D(5, AndroidUtilities.dp(14.0f)));
                l41 c11 = l41.c(146, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityMenuAddChat));
                c11.q = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = oVar2.E;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i9 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i9);
                        i9++;
                        arrayList2.add(l41.v(oVar2.getMessagesController().getUserOrChat(DialogObject.getPeerDialogId(communityPeer.peer))));
                    }
                    break;
                }
                break;
        }
    }
}
