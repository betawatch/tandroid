package bi;

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
import org.telegram.messenger.sk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
import org.telegram.ui.w00;
import org.telegram.ui.ye;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ q9(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = j10;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01b6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        TLRPC.Chat chat;
        TLRPC.User user;
        int i10 = this.a;
        int i11 = 1;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.b;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                r9 r9Var = (r9) obj5;
                TLObject tLObject = (TLObject) obj4;
                View view = (View) obj3;
                m9 m9Var = (m9) obj2;
                MessagesController messagesController = (MessagesController) obj;
                long j10 = this.c;
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    MessagesController.getInstance(r9Var.a).putUsers(tL_stories_peerStories.users, false);
                    MessagesController.getInstance(r9Var.a).putChats(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    if (!peerStories.stories.isEmpty()) {
                        MessagesController.getInstance(r9Var.a).getStoriesController().a0(j10, peerStories);
                        s9.n(peerStories, new b8(r9Var, view, j10, m9Var, 3));
                        z10 = false;
                        if (j10 > 0 && (user = messagesController.getUser(Long.valueOf(j10))) != null) {
                            user.stories_unavailable = true;
                            MessagesStorage.getInstance(r9Var.a).putUsersAndChats(Collections.singletonList(user), null, false, true);
                            messagesController.putUser(user, false);
                        }
                        if (j10 < 0 && (chat = messagesController.getChat(Long.valueOf(-j10))) != null) {
                            chat.stories_unavailable = true;
                            MessagesStorage.getInstance(r9Var.a).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                            messagesController.putChat(chat, false);
                        }
                        if (!z10) {
                            view.invalidate();
                            MessagesController.getInstance(r9Var.a).getStoriesController().e0(j10, false);
                            break;
                        }
                    }
                }
                z10 = true;
                if (j10 > 0) {
                    user.stories_unavailable = true;
                    MessagesStorage.getInstance(r9Var.a).putUsersAndChats(Collections.singletonList(user), null, false, true);
                    messagesController.putUser(user, false);
                }
                if (j10 < 0) {
                    chat.stories_unavailable = true;
                    MessagesStorage.getInstance(r9Var.a).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                    messagesController.putChat(chat, false);
                }
                if (!z10) {
                }
                break;
            case 1:
                ((ConnectionsManager) obj5).lambda$sendRequestInternal$7((RequestDelegate) obj3, (TLObject) obj4, (TLRPC.TL_error) obj2, (RequestDelegateTimestamp) obj, this.c);
                break;
            case 2:
                fo foVar = (fo) obj5;
                cn0 cn0Var = (cn0) obj;
                ((l80) obj4).n0 = true;
                Activity parentActivity = foVar.getParentActivity();
                long j11 = ((TLRPC.TL_messageEntityFormattedDate) obj3).date;
                long j12 = this.c;
                di.w6 w6Var = new di.w6(foVar, (ArrayList) obj2, j12, cn0Var, 1);
                ye yeVar = new ye(cn0Var, i11);
                Pattern pattern = org.telegram.ui.Components.g5.a;
                org.telegram.ui.Components.g5.J(parentActivity, j12, j11, 0, true, w6Var, yeVar, new org.telegram.ui.Components.e5(null), null);
                break;
            case 3:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Runnable runnable = (Runnable) obj;
                if (m2Var.getContext() != null) {
                    if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                        TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject2;
                        m2Var.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                        m2Var.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                        new w00(m2Var, dialogFilter, tL_chatlists_exportedInvites.invites).show();
                    } else if (tL_error == null || !"FILTER_ID_INVALID".equals(tL_error.text) || dialogFilter.isDefault()) {
                        sk.q(R.string.UnknownError, zc.a0(m2Var), null);
                    } else {
                        new w00(m2Var, dialogFilter, null).show();
                    }
                    if (runnable != null) {
                        AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 200 - (System.currentTimeMillis() - this.c)));
                        break;
                    }
                }
                break;
            case 4:
                zh.r3.i0((zh.r3) obj5, (TLObject) obj4, (String) obj3, (TL_stars.InputSavedStarGift) obj2, (TLRPC.TL_error) obj, this.c);
                break;
            case 5:
                ((boolean[]) obj3)[0] = true;
                ((zh.n5) obj5).g(this.c, (TLObject) obj4, (TLRPC.TL_textWithEntities) obj2, (Utilities.Callback2) obj);
                break;
            default:
                ((boolean[]) obj4)[0] = true;
                ((zh.n5) obj5).h((TLRPC.TL_payments_paymentFormStarGift) obj3, (TL_stars.StarGift) obj2, this.c, null, true, (Utilities.Callback2) obj);
                break;
        }
    }

    public /* synthetic */ q9(Object obj, TLObject tLObject, Object obj2, TLObject tLObject2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = tLObject;
        this.e = obj2;
        this.f = tLObject2;
        this.h = obj3;
        this.c = j10;
    }

    public /* synthetic */ q9(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        this.a = 1;
        this.d = connectionsManager;
        this.e = requestDelegate;
        this.b = tLObject;
        this.f = tL_error;
        this.h = requestDelegateTimestamp;
        this.c = j10;
    }

    public /* synthetic */ q9(zh.n5 n5Var, boolean[] zArr, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.a = 5;
        this.d = n5Var;
        this.e = zArr;
        this.c = j10;
        this.b = tLObject;
        this.f = tL_textWithEntities;
        this.h = callback2;
    }

    public /* synthetic */ q9(zh.n5 n5Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, Utilities.Callback2 callback2) {
        this.a = 6;
        this.d = n5Var;
        this.b = zArr;
        this.e = tL_payments_paymentFormStarGift;
        this.f = starGift;
        this.c = j10;
        this.h = callback2;
    }
}
