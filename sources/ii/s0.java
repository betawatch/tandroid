package ii;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import bi.v0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.wc;
import org.telegram.ui.ey;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public abstract class s0 {
    public static SpannableStringBuilder a(MessageObject messageObject, String str, String str2, boolean z10, boolean z11) {
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        boolean z12 = DialogObject.getPeerDialogId(message.peer_id) == DialogObject.getPeerDialogId(message.from_id);
        boolean z13 = tL_messageActionChangeCommunity.community_id == 0;
        if (z12) {
            if (z13) {
                return AndroidUtilities.replaceTags(LocaleController.getString(z11 ? R.string.CommunityServiceMessageBotRemovedUnknown : z10 ? R.string.CommunityServiceMessageChannelRemovedUnknown : R.string.CommunityServiceMessageGroupRemovedUnknown));
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(z11 ? R.string.CommunityServiceMessageBotAddedUnknown : z10 ? R.string.CommunityServiceMessageChannelAddedUnknown : R.string.CommunityServiceMessageGroupAddedUnknown, str));
        }
        if (messageObject.isOut()) {
            if (z13) {
                return AndroidUtilities.replaceTags(LocaleController.getString(z11 ? R.string.CommunityServiceMessageBotYouRemoved : z10 ? R.string.CommunityServiceMessageChannelYouRemoved : R.string.CommunityServiceMessageGroupYouRemoved));
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(z11 ? R.string.CommunityServiceMessageBotYouAdded : z10 ? R.string.CommunityServiceMessageChannelYouAdded : R.string.CommunityServiceMessageGroupYouAdded, str));
        }
        if (z13) {
            return AndroidUtilities.replaceTags(LocaleController.formatString(z11 ? R.string.CommunityServiceMessageBotRemoved : z10 ? R.string.CommunityServiceMessageChannelRemoved : R.string.CommunityServiceMessageGroupRemoved, str2));
        }
        return AndroidUtilities.replaceTags(LocaleController.formatString(z11 ? R.string.CommunityServiceMessageBotAdded : z10 ? R.string.CommunityServiceMessageChannelAdded : R.string.CommunityServiceMessageGroupAdded, str2, str));
    }

    public static int b(int i10, long j10) {
        TLRPC.Chat chat;
        long j11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        if (j10 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            if (user2 == null) {
                return 0;
            }
            j11 = user2.linked_community_id;
            user = user2;
            chat = null;
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat == null) {
                return 0;
            }
            j11 = chat.linked_community_id;
            user = null;
        }
        if (j11 != 0 && (chatFull = MessagesController.getInstance(i10).getChatFull(j11)) != null && (arrayList = chatFull.linked_peers) != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                i11++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (DialogObject.getPeerDialogId(communityPeer2.peer) == j10) {
                    return c(communityPeer2, chat, user, user != null ? MessagesController.getInstance(i10).getDialog(user.id) : null);
                }
            }
        }
        return 0;
    }

    public static int c(TL_communities.CommunityPeer communityPeer, TLRPC.Chat chat, TLRPC.User user, TLRPC.Dialog dialog) {
        if (communityPeer == null) {
            return 0;
        }
        if (user != null) {
            return dialog != null ? 1 : 2;
        }
        if (chat == null) {
            return 0;
        }
        if (ChatObject.isInChat(chat)) {
            return 1;
        }
        if (ChatObject.isPublic(chat) || communityPeer.can_view_history) {
            return 2;
        }
        return ChatObject.isCommunityPeerHidden(communityPeer) ? 4 : 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(r2 r2Var, long j10, int i10) {
        j5 j5Var;
        wn wnVar;
        int i11;
        List list = null;
        if (AndroidUtilities.isTablet()) {
            j5Var = null;
            wnVar = null;
        } else {
            j5Var = r2Var.getParentLayout();
            if (j5Var != null) {
                List fragmentStack = j5Var.getFragmentStack();
                i11 = fragmentStack.size() - 2;
                while (true) {
                    if (i11 < 0) {
                        wnVar = null;
                        i11 = -1;
                        break;
                    }
                    r2 r2Var2 = (r2) fragmentStack.get(i11);
                    if (r2Var2 instanceof wn) {
                        wnVar = (wn) r2Var2;
                        if (wnVar.a() == j10) {
                            break;
                        }
                    }
                    i11--;
                }
                list = fragmentStack;
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(j10, r2Var.getCurrentAccount());
                if (i11 != -1) {
                    if (!(r2Var instanceof ey)) {
                        r2Var.finishFragment();
                    }
                    f(wc.Y(), i10, isChannelAndNotMegaGroup);
                    return;
                }
                for (int size = list.size() - 2; size > i11; size--) {
                    ((ActionBarLayout) j5Var).c0((r2) list.get(size), false);
                }
                r2Var.finishFragment();
                AndroidUtilities.runOnUIThread(new n0(i10, wnVar, isChannelAndNotMegaGroup), 250L);
                return;
            }
            wnVar = null;
        }
        i11 = -1;
        boolean isChannelAndNotMegaGroup2 = ChatObject.isChannelAndNotMegaGroup(j10, r2Var.getCurrentAccount());
        if (i11 != -1) {
        }
    }

    public static void e(final e2[] e2VarArr, r2 r2Var, final int i10, TLRPC.Chat chat) {
        if (e2VarArr[0] != null) {
            return;
        }
        final int fetchChatsToAddToCommunity = MessagesController.getInstance(i10).fetchChatsToAddToCommunity(new v0(e2VarArr, r2Var, i10, chat));
        ConnectionsManager.getInstance(i10).bindRequestToGuid(fetchChatsToAddToCommunity, r2Var.getClassGuid());
        e2 e2Var = new e2(r2Var.getContext(), 3, null);
        e2VarArr[0] = e2Var;
        e2Var.r(500L);
        e2VarArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ii.k0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ConnectionsManager.getInstance(i10).cancelRequest(fetchChatsToAddToCommunity, true);
                e2VarArr[0] = null;
            }
        });
    }

    public static void f(wc wcVar, int i10, boolean z10) {
        String string;
        int i11 = i10 == 2 ? R.raw.timer_toast : R.raw.contact_check;
        int i12 = i10 == 2 ? 24 : 36;
        if (i10 == 0) {
            string = LocaleController.getString(R.string.CommunityCommunityCreated);
        } else if (i10 == 1) {
            string = LocaleController.getString(z10 ? R.string.CommunityCommunityJoinedChannel : R.string.CommunityCommunityJoinedGroup);
        } else {
            string = LocaleController.getString(R.string.CommunityCommunityPending);
        }
        wcVar.G(i11, i12, string).j();
    }
}
