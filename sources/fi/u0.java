package fi;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import ei.h1;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.xc;
import org.telegram.ui.qy;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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

    public static void d(m2 m2Var, long j3, int i10) {
        b5 b5Var;
        wn wnVar;
        int i11;
        List list = null;
        if (AndroidUtilities.isTablet()) {
            b5Var = null;
            wnVar = null;
        } else {
            b5Var = m2Var.getParentLayout();
            if (b5Var != null) {
                List fragmentStack = b5Var.getFragmentStack();
                i11 = fragmentStack.size() - 2;
                while (i11 >= 0) {
                    m2 m2Var2 = (m2) fragmentStack.get(i11);
                    if (m2Var2 instanceof wn) {
                        wnVar = (wn) m2Var2;
                        if (wnVar.a() == j3) {
                            list = fragmentStack;
                            break;
                        }
                    }
                    i11--;
                }
                wnVar = null;
                list = fragmentStack;
            } else {
                wnVar = null;
            }
        }
        i11 = -1;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(j3, m2Var.getCurrentAccount());
        if (i11 == -1) {
            if (!(m2Var instanceof qy)) {
                m2Var.finishFragment();
            }
            f(xc.X(), i10, isChannelAndNotMegaGroup);
            return;
        }
        for (int size = list.size() - 2; size > i11; size--) {
            ((ActionBarLayout) b5Var).a0((m2) list.get(size), false);
        }
        m2Var.finishFragment();
        AndroidUtilities.runOnUIThread(new p0(i10, wnVar, isChannelAndNotMegaGroup), 250L);
    }

    public static void e(final a2[] a2VarArr, m2 m2Var, final int i10, TLRPC.Chat chat) {
        if (a2VarArr[0] != null) {
            return;
        }
        final int fetchChatsToAddToCommunity = MessagesController.getInstance(i10).fetchChatsToAddToCommunity(new h1(a2VarArr, m2Var, i10, chat, 1));
        ConnectionsManager.getInstance(i10).bindRequestToGuid(fetchChatsToAddToCommunity, m2Var.getClassGuid());
        a2 a2Var = new a2(m2Var.getContext(), 3, null);
        a2VarArr[0] = a2Var;
        a2Var.q(500L);
        a2VarArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: fi.l0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ConnectionsManager.getInstance(i10).cancelRequest(fetchChatsToAddToCommunity, true);
                a2VarArr[0] = null;
            }
        });
    }

    public static void f(xc xcVar, int i10, boolean z10) {
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
        xcVar.G(i11, i12, string).j();
    }
}
