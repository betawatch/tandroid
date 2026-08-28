package gh;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.x60;
import org.telegram.ui.a00;
import org.telegram.ui.ke;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ p2(k5 k5Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        this.a = 0;
        this.d = k5Var;
        this.c = tLObject;
        this.e = str;
        this.f = inputSavedStarGift;
        this.h = tL_error;
        this.b = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0170  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j10;
        boolean z10;
        TLRPC.Chat chat;
        TLRPC.User user;
        int i9 = this.a;
        int i10 = 1;
        Object obj = this.f;
        Object obj2 = this.h;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (i9) {
            case 0:
                k5.g0((k5) obj5, (TLObject) obj4, (String) obj3, (TL_stars.InputSavedStarGift) obj, (TLRPC.TL_error) obj2, this.b);
                break;
            case 1:
                ((boolean[]) obj3)[0] = true;
                ((v7) obj5).g(this.b, (TLObject) obj4, (TLRPC.TL_textWithEntities) obj, (Utilities.Callback2) obj2);
                break;
            case 2:
                ((boolean[]) obj4)[0] = true;
                ((v7) obj5).h((TLRPC.TL_payments_paymentFormStarGift) obj3, (TL_stars.StarGift) obj, this.b, null, true, (Utilities.Callback2) obj2);
                break;
            case 3:
                ih.o7 o7Var = (ih.o7) obj5;
                TLObject tLObject = (TLObject) obj4;
                View view = (View) obj3;
                ih.l7 l7Var = (ih.l7) obj;
                MessagesController messagesController = (MessagesController) obj2;
                long j11 = this.b;
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    MessagesController.getInstance(o7Var.a).putUsers(tL_stories_peerStories.users, false);
                    MessagesController.getInstance(o7Var.a).putChats(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    if (!peerStories.stories.isEmpty()) {
                        MessagesController.getInstance(o7Var.a).getStoriesController().a0(j11, peerStories);
                        j10 = j11;
                        ih.p7.n(peerStories, new e2(o7Var, view, j11, l7Var, 11));
                        z10 = false;
                        if (j10 > 0 && (user = messagesController.getUser(Long.valueOf(j10))) != null) {
                            user.stories_unavailable = true;
                            MessagesStorage.getInstance(o7Var.a).putUsersAndChats(Collections.singletonList(user), null, false, true);
                            messagesController.putUser(user, false);
                        }
                        if (j10 < 0 && (chat = messagesController.getChat(Long.valueOf(-j10))) != null) {
                            chat.stories_unavailable = true;
                            MessagesStorage.getInstance(o7Var.a).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                            messagesController.putChat(chat, false);
                        }
                        if (!z10) {
                            view.invalidate();
                            MessagesController.getInstance(o7Var.a).getStoriesController().e0(j10, false);
                            break;
                        }
                    }
                }
                j10 = j11;
                z10 = true;
                if (j10 > 0) {
                    user.stories_unavailable = true;
                    MessagesStorage.getInstance(o7Var.a).putUsersAndChats(Collections.singletonList(user), null, false, true);
                    messagesController.putUser(user, false);
                }
                if (j10 < 0) {
                    chat.stories_unavailable = true;
                    MessagesStorage.getInstance(o7Var.a).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                    messagesController.putChat(chat, false);
                }
                if (!z10) {
                }
                break;
            case 4:
                ((ConnectionsManager) obj5).lambda$sendRequestInternal$7((RequestDelegate) obj3, (TLObject) obj4, (TLRPC.TL_error) obj2, (RequestDelegateTimestamp) obj, this.b);
                break;
            case 5:
                qn qnVar = (qn) obj5;
                ll0 ll0Var = (ll0) obj2;
                ((x60) obj4).n0 = true;
                Activity parentActivity = qnVar.getParentActivity();
                long j12 = ((TLRPC.TL_messageEntityFormattedDate) obj3).date;
                long j13 = this.b;
                c3.g gVar = new c3.g(qnVar, (ArrayList) obj, j13, ll0Var, 3);
                ke keVar = new ke(ll0Var, i10);
                Pattern pattern = org.telegram.ui.Components.y4.a;
                org.telegram.ui.Components.y4.K(parentActivity, j13, j12, 0, true, gVar, keVar, new org.telegram.ui.Components.w4(null), null);
                break;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Runnable runnable = (Runnable) obj;
                if (o2Var.getContext() != null) {
                    if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                        TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject2;
                        o2Var.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                        o2Var.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                        new a00(o2Var, dialogFilter, tL_chatlists_exportedInvites.invites).show();
                    } else if (tL_error == null || !"FILTER_ID_INVALID".equals(tL_error.text) || dialogFilter.isDefault()) {
                        ll.p(R.string.UnknownError, oc.a0(o2Var), null);
                    } else {
                        new a00(o2Var, dialogFilter, null).show();
                    }
                    if (runnable != null) {
                        AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 200 - (System.currentTimeMillis() - this.b)));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ p2(v7 v7Var, boolean[] zArr, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.a = 1;
        this.d = v7Var;
        this.e = zArr;
        this.b = j10;
        this.c = tLObject;
        this.f = tL_textWithEntities;
        this.h = callback2;
    }

    public /* synthetic */ p2(v7 v7Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, Utilities.Callback2 callback2) {
        this.a = 2;
        this.d = v7Var;
        this.c = zArr;
        this.e = tL_payments_paymentFormStarGift;
        this.f = starGift;
        this.b = j10;
        this.h = callback2;
    }

    public /* synthetic */ p2(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i9) {
        this.a = i9;
        this.d = obj;
        this.c = obj2;
        this.b = j10;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ p2(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        this.a = 4;
        this.d = connectionsManager;
        this.e = requestDelegate;
        this.c = tLObject;
        this.h = tL_error;
        this.f = requestDelegateTimestamp;
        this.b = j10;
    }

    public /* synthetic */ p2(org.telegram.ui.ActionBar.o2 o2Var, TLObject tLObject, MessagesController.DialogFilter dialogFilter, TLRPC.TL_error tL_error, Runnable runnable, long j10) {
        this.a = 6;
        this.d = o2Var;
        this.c = tLObject;
        this.e = dialogFilter;
        this.h = tL_error;
        this.f = runnable;
        this.b = j10;
    }
}
