package nh;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.oc;
import org.telegram.ui.dy;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class r0 {
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

    public static int b(int i9, long j10) {
        TLRPC.Chat chat;
        long j11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        if (j10 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
            if (user2 == null) {
                return 0;
            }
            j11 = user2.linked_community_id;
            user = user2;
            chat = null;
        } else {
            chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
            if (chat == null) {
                return 0;
            }
            j11 = chat.linked_community_id;
            user = null;
        }
        if (j11 != 0 && (chatFull = MessagesController.getInstance(i9).getChatFull(j11)) != null && (arrayList = chatFull.linked_peers) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                i10++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (DialogObject.getPeerDialogId(communityPeer2.peer) == j10) {
                    return c(communityPeer2, chat, user, user != null ? MessagesController.getInstance(i9).getDialog(user.id) : null);
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

    public static void d(o2 o2Var, long j10, int i9) {
        b5 b5Var;
        qn qnVar;
        int i10;
        List list = null;
        if (AndroidUtilities.isTablet()) {
            b5Var = null;
            qnVar = null;
        } else {
            b5Var = o2Var.getParentLayout();
            if (b5Var != null) {
                List fragmentStack = b5Var.getFragmentStack();
                i10 = fragmentStack.size() - 2;
                while (i10 >= 0) {
                    o2 o2Var2 = (o2) fragmentStack.get(i10);
                    if (o2Var2 instanceof qn) {
                        qnVar = (qn) o2Var2;
                        if (qnVar.a() == j10) {
                            list = fragmentStack;
                            break;
                        }
                    }
                    i10--;
                }
                qnVar = null;
                list = fragmentStack;
            } else {
                qnVar = null;
            }
        }
        i10 = -1;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(j10, o2Var.getCurrentAccount());
        if (i10 == -1) {
            if (!(o2Var instanceof dy)) {
                o2Var.finishFragment();
            }
            f(oc.X(), i9, isChannelAndNotMegaGroup);
            return;
        }
        for (int size = list.size() - 2; size > i10; size--) {
            ((ActionBarLayout) b5Var).a0((o2) list.get(size), false);
        }
        o2Var.finishFragment();
        AndroidUtilities.runOnUIThread(new m0(i9, qnVar, isChannelAndNotMegaGroup), 250L);
    }

    public static void e(final c2[] c2VarArr, o2 o2Var, final int i9, TLRPC.Chat chat) {
        if (c2VarArr[0] != null) {
            return;
        }
        final int fetchChatsToAddToCommunity = MessagesController.getInstance(i9).fetchChatsToAddToCommunity(new gh.j0(c2VarArr, o2Var, i9, chat));
        ConnectionsManager.getInstance(i9).bindRequestToGuid(fetchChatsToAddToCommunity, o2Var.getClassGuid());
        c2 c2Var = new c2(o2Var.getContext(), 3, null);
        c2VarArr[0] = c2Var;
        c2Var.q(500L);
        c2VarArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: nh.k0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ConnectionsManager.getInstance(i9).cancelRequest(fetchChatsToAddToCommunity, true);
                c2VarArr[0] = null;
            }
        });
    }

    public static void f(oc ocVar, int i9, boolean z10) {
        String string;
        int i10 = i9 == 2 ? R.raw.timer_toast : R.raw.contact_check;
        int i11 = i9 == 2 ? 24 : 36;
        if (i9 == 0) {
            string = LocaleController.getString(R.string.CommunityCommunityCreated);
        } else if (i9 == 1) {
            string = LocaleController.getString(z10 ? R.string.CommunityCommunityJoinedChannel : R.string.CommunityCommunityJoinedGroup);
        } else {
            string = LocaleController.getString(R.string.CommunityCommunityPending);
        }
        ocVar.G(i10, i11, string).j();
    }
}
