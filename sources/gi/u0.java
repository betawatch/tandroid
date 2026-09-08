package gi;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import fi.h1;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public abstract class u0 {
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

    public static int b(int i10, long j3) {
        TLRPC.Chat chat;
        long j10;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        if (j3 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            if (user2 == null) {
                return 0;
            }
            j10 = user2.linked_community_id;
            user = user2;
            chat = null;
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            if (chat == null) {
                return 0;
            }
            j10 = chat.linked_community_id;
            user = null;
        }
        if (j10 != 0 && (chatFull = MessagesController.getInstance(i10).getChatFull(j10)) != null && (arrayList = chatFull.linked_peers) != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                i11++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (DialogObject.getPeerDialogId(communityPeer2.peer) == j3) {
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

    public static void d(n2 n2Var, long j3, int i10) {
        d5 d5Var;
        co coVar;
        int i11;
        List list = null;
        if (AndroidUtilities.isTablet()) {
            d5Var = null;
            coVar = null;
        } else {
            d5Var = n2Var.getParentLayout();
            if (d5Var != null) {
                List fragmentStack = d5Var.getFragmentStack();
                i11 = fragmentStack.size() - 2;
                while (i11 >= 0) {
                    n2 n2Var2 = (n2) fragmentStack.get(i11);
                    if (n2Var2 instanceof co) {
                        coVar = (co) n2Var2;
                        if (coVar.a() == j3) {
                            list = fragmentStack;
                            break;
                        }
                    }
                    i11--;
                }
                coVar = null;
                list = fragmentStack;
            } else {
                coVar = null;
            }
        }
        i11 = -1;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(j3, n2Var.getCurrentAccount());
        if (i11 == -1) {
            if (!(n2Var instanceof uy)) {
                n2Var.finishFragment();
            }
            f(yc.X(), i10, isChannelAndNotMegaGroup);
            return;
        }
        for (int size = list.size() - 2; size > i11; size--) {
            ((ActionBarLayout) d5Var).a0((n2) list.get(size), false);
        }
        n2Var.finishFragment();
        AndroidUtilities.runOnUIThread(new p0(i10, coVar, isChannelAndNotMegaGroup), 250L);
    }

    public static void e(final b2[] b2VarArr, n2 n2Var, final int i10, TLRPC.Chat chat) {
        if (b2VarArr[0] != null) {
            return;
        }
        final int fetchChatsToAddToCommunity = MessagesController.getInstance(i10).fetchChatsToAddToCommunity(new h1(b2VarArr, n2Var, i10, chat, 1));
        ConnectionsManager.getInstance(i10).bindRequestToGuid(fetchChatsToAddToCommunity, n2Var.getClassGuid());
        b2 b2Var = new b2(n2Var.getContext(), 3, null);
        b2VarArr[0] = b2Var;
        b2Var.q(500L);
        b2VarArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: gi.l0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ConnectionsManager.getInstance(i10).cancelRequest(fetchChatsToAddToCommunity, true);
                b2VarArr[0] = null;
            }
        });
    }

    public static void f(yc ycVar, int i10, boolean z10) {
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
        ycVar.G(i11, i12, string).j();
    }
}
