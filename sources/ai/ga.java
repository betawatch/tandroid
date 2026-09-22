package ai;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;
import org.telegram.ui.pe;
import org.telegram.ui.r00;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ga implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ ga(Object obj, Object obj2, long j3, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = j3;
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
                ha haVar = (ha) obj5;
                TLObject tLObject = (TLObject) obj4;
                View view = (View) obj3;
                ca caVar = (ca) obj2;
                MessagesController messagesController = (MessagesController) obj;
                long j3 = this.c;
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    MessagesController.getInstance(haVar.a).putUsers(tL_stories_peerStories.users, false);
                    MessagesController.getInstance(haVar.a).putChats(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    if (!peerStories.stories.isEmpty()) {
                        MessagesController.getInstance(haVar.a).getStoriesController().a0(j3, peerStories);
                        ia.n(peerStories, new p8(haVar, view, j3, caVar, 3));
                        z10 = false;
                        if (j3 > 0 && (user = messagesController.getUser(Long.valueOf(j3))) != null) {
                            user.stories_unavailable = true;
                            MessagesStorage.getInstance(haVar.a).putUsersAndChats(Collections.singletonList(user), null, false, true);
                            messagesController.putUser(user, false);
                        }
                        if (j3 < 0 && (chat = messagesController.getChat(Long.valueOf(-j3))) != null) {
                            chat.stories_unavailable = true;
                            MessagesStorage.getInstance(haVar.a).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                            messagesController.putChat(chat, false);
                        }
                        if (!z10) {
                            view.invalidate();
                            MessagesController.getInstance(haVar.a).getStoriesController().e0(j3, false);
                            break;
                        }
                    }
                }
                z10 = true;
                if (j3 > 0) {
                    user.stories_unavailable = true;
                    MessagesStorage.getInstance(haVar.a).putUsersAndChats(Collections.singletonList(user), null, false, true);
                    messagesController.putUser(user, false);
                }
                if (j3 < 0) {
                    chat.stories_unavailable = true;
                    MessagesStorage.getInstance(haVar.a).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                    messagesController.putChat(chat, false);
                }
                if (!z10) {
                }
                break;
            case 1:
                ((ConnectionsManager) obj5).lambda$sendRequestInternal$7((RequestDelegate) obj3, (TLObject) obj4, (TLRPC.TL_error) obj2, (RequestDelegateTimestamp) obj, this.c);
                break;
            case 2:
                bo boVar = (bo) obj5;
                am0 am0Var = (am0) obj;
                ((n70) obj4).n0 = true;
                Activity parentActivity = boVar.getParentActivity();
                long j10 = ((TLRPC.TL_messageEntityFormattedDate) obj3).date;
                long j11 = this.c;
                ci.z6 z6Var = new ci.z6(boVar, (ArrayList) obj2, j11, am0Var, 1);
                pe peVar = new pe(am0Var, i11);
                Pattern pattern = org.telegram.ui.Components.c5.a;
                org.telegram.ui.Components.c5.K(parentActivity, j11, j10, 0, true, z6Var, peVar, new org.telegram.ui.Components.a5(null), null);
                break;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Runnable runnable = (Runnable) obj;
                if (n2Var.getContext() != null) {
                    if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                        TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject2;
                        n2Var.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                        n2Var.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                        new r00(n2Var, dialogFilter, tL_chatlists_exportedInvites.invites).show();
                    } else if (tL_error == null || !"FILTER_ID_INVALID".equals(tL_error.text) || dialogFilter.isDefault()) {
                        org.telegram.messenger.y0.p(R.string.UnknownError, vc.a0(n2Var), null);
                    } else {
                        new r00(n2Var, dialogFilter, null).show();
                    }
                    if (runnable != null) {
                        AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 200 - (System.currentTimeMillis() - this.c)));
                        break;
                    }
                }
                break;
            case 4:
                yh.z3.i0((yh.z3) obj5, (TLObject) obj4, (String) obj3, (TL_stars.InputSavedStarGift) obj2, (TLRPC.TL_error) obj, this.c);
                break;
            case 5:
                ((boolean[]) obj3)[0] = true;
                ((yh.u5) obj5).g(this.c, (TLObject) obj4, (TLRPC.TL_textWithEntities) obj2, (Utilities.Callback2) obj);
                break;
            default:
                ((boolean[]) obj4)[0] = true;
                ((yh.u5) obj5).h((TLRPC.TL_payments_paymentFormStarGift) obj3, (TL_stars.StarGift) obj2, this.c, null, true, (Utilities.Callback2) obj);
                break;
        }
    }

    public /* synthetic */ ga(Object obj, TLObject tLObject, Object obj2, TLObject tLObject2, Object obj3, long j3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = tLObject;
        this.e = obj2;
        this.f = tLObject2;
        this.h = obj3;
        this.c = j3;
    }

    public /* synthetic */ ga(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j3) {
        this.a = 1;
        this.d = connectionsManager;
        this.e = requestDelegate;
        this.b = tLObject;
        this.f = tL_error;
        this.h = requestDelegateTimestamp;
        this.c = j3;
    }

    public /* synthetic */ ga(yh.u5 u5Var, boolean[] zArr, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.a = 5;
        this.d = u5Var;
        this.e = zArr;
        this.c = j3;
        this.b = tLObject;
        this.f = tL_textWithEntities;
        this.h = callback2;
    }

    public /* synthetic */ ga(yh.u5 u5Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, Utilities.Callback2 callback2) {
        this.a = 6;
        this.d = u5Var;
        this.b = zArr;
        this.e = tL_payments_paymentFormStarGift;
        this.f = starGift;
        this.c = j3;
        this.h = callback2;
    }
}
