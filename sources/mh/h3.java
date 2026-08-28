package mh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.y4;
import org.telegram.ui.fe1;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ h3(int i9, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.f3 f3Var, b6 b6Var) {
        this.b = i9;
        this.d = connectedbotstarref;
        this.e = f3Var;
        this.f = context;
        this.c = j10;
        this.g = b6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i9;
        SpannableStringBuilder replaceTags;
        int i10 = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj4;
                Context context = (Context) obj3;
                b6 b6Var = (b6) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i11 = this.b;
                long j10 = this.c;
                if (connectedbotstarref2 != null) {
                    f3Var.dismiss();
                    u3.G0(context, i11, connectedbotstarref2, j10, b6Var);
                    break;
                } else {
                    TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i11).loadFullUser(user, 0, true, new f3(f3Var, context, i11, j10, b6Var, 1));
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                we1 we1Var = ((fe1) obj5).b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                if (i12 == this.b) {
                    boolean isEmpty = tL_messages_invitedUsers.missing_invitees.isEmpty();
                    long j11 = this.c;
                    if (!isEmpty) {
                        TLRPC.Chat chat = we1Var.getMessagesController().getChat(Long.valueOf(j11));
                        i9 = ((org.telegram.ui.ActionBar.o2) we1Var).currentAccount;
                        y4.f(i9, chat, tL_messages_invitedUsers);
                        break;
                    } else {
                        oc a02 = oc.a0(we1Var);
                        TLRPC.Chat chat2 = we1Var.getMessagesController().getChat(Long.valueOf(j11));
                        a02.getClass();
                        if (arrayList.size() == 0) {
                            replaceTags = null;
                        } else if (arrayList.size() != 1) {
                            replaceTags = ChatObject.isChannelAndNotMegaGroup(chat2) ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddedMembersToChannel", arrayList.size(), new Object[0])) : AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddedSubscribersToChannel", arrayList.size(), new Object[0]));
                        } else if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, "**" + UserObject.getFirstName((TLRPC.User) arrayList.get(0)) + "**"));
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, "**" + UserObject.getFirstName((TLRPC.User) arrayList.get(0)) + "**"));
                        }
                        a02.V(arrayList, replaceTags, null, null).j();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ h3(fe1 fe1Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i9, ArrayList arrayList, long j10) {
        this.d = fe1Var;
        this.e = tL_messages_invitedUsers;
        this.f = iArr;
        this.b = i9;
        this.g = arrayList;
        this.c = j10;
    }
}
