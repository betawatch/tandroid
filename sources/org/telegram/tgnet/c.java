package org.telegram.tgnet;

import android.app.Activity;
import android.view.View;
import bi.a8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a2;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.eo;
import org.telegram.ui.se;
import org.telegram.ui.t00;
import org.telegram.ui.ya0;
import xh.v5;
import xh.x3;
import zh.a6;
import zh.x5;
import zh.z5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ c(Object obj, Object obj2, long j3, TLObject tLObject, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
        this.e = tLObject;
        this.f = obj3;
        this.h = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        TLRPC.Chat chat;
        TLRPC.User user;
        int i10 = this.a;
        TLObject tLObject = this.e;
        int i11 = 1;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                ((ConnectionsManager) obj4).lambda$sendRequestInternal$7((RequestDelegate) obj3, this.e, (TLRPC.TL_error) obj2, (RequestDelegateTimestamp) obj, this.b);
                break;
            case 1:
                eo eoVar = (eo) obj4;
                km0 km0Var = (km0) obj;
                ((w70) obj3).n0 = true;
                Activity parentActivity = eoVar.getParentActivity();
                long j3 = ((TLRPC.TL_messageEntityFormattedDate) tLObject).date;
                long j10 = this.b;
                a8 a8Var = new a8(eoVar, (ArrayList) obj2, j10, km0Var, 1);
                se seVar = new se(km0Var, i11);
                Pattern pattern = d5.a;
                d5.K(parentActivity, j10, j3, 0, true, a8Var, seVar, new b5(null), null);
                break;
            case 2:
                p2 p2Var = (p2) obj4;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Runnable runnable = (Runnable) obj;
                if (p2Var.getContext() != null) {
                    if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                        TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                        p2Var.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                        p2Var.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                        new t00(p2Var, dialogFilter, tL_chatlists_exportedInvites.invites).show();
                    } else if (tL_error == null || !"FILTER_ID_INVALID".equals(tL_error.text) || dialogFilter.isDefault()) {
                        a2.p(R.string.UnknownError, wc.a0(p2Var), null);
                    } else {
                        new t00(p2Var, dialogFilter, null).show();
                    }
                    if (runnable != null) {
                        AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 200 - (System.currentTimeMillis() - this.b)));
                        break;
                    }
                }
                break;
            case 3:
                x3.i0((x3) obj4, this.e, (String) obj3, (TL_stars.InputSavedStarGift) obj, (TLRPC.TL_error) obj2, this.b);
                break;
            case 4:
                ((boolean[]) obj3)[0] = true;
                ((v5) obj4).g(this.b, this.e, (TLRPC.TL_textWithEntities) obj2, (Utilities.Callback2) obj);
                break;
            case 5:
                ((boolean[]) obj3)[0] = true;
                ((v5) obj4).h((TLRPC.TL_payments_paymentFormStarGift) tLObject, (TL_stars.StarGift) obj2, this.b, null, true, (Utilities.Callback2) obj);
                break;
            default:
                z5 z5Var = (z5) obj4;
                View view = (View) obj3;
                x5 x5Var = (x5) obj2;
                MessagesController messagesController = (MessagesController) obj;
                long j11 = this.b;
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    MessagesController.getInstance(z5Var.a).putUsers(tL_stories_peerStories.users, false);
                    MessagesController.getInstance(z5Var.a).putChats(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    if (!peerStories.stories.isEmpty()) {
                        MessagesController.getInstance(z5Var.a).getStoriesController().a0(j11, peerStories);
                        a6.n(peerStories, new ya0(z5Var, view, j11, x5Var, 13));
                        z10 = false;
                        if (j11 > 0 && (user = messagesController.getUser(Long.valueOf(j11))) != null) {
                            user.stories_unavailable = true;
                            MessagesStorage.getInstance(z5Var.a).putUsersAndChats(Collections.singletonList(user), null, false, true);
                            messagesController.putUser(user, false);
                        }
                        if (j11 < 0 && (chat = messagesController.getChat(Long.valueOf(-j11))) != null) {
                            chat.stories_unavailable = true;
                            MessagesStorage.getInstance(z5Var.a).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                            messagesController.putChat(chat, false);
                        }
                        if (!z10) {
                            view.invalidate();
                            MessagesController.getInstance(z5Var.a).getStoriesController().e0(j11, false);
                            break;
                        }
                    }
                }
                z10 = true;
                if (j11 > 0) {
                    user.stories_unavailable = true;
                    MessagesStorage.getInstance(z5Var.a).putUsersAndChats(Collections.singletonList(user), null, false, true);
                    messagesController.putUser(user, false);
                }
                if (j11 < 0) {
                    chat.stories_unavailable = true;
                    MessagesStorage.getInstance(z5Var.a).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                    messagesController.putChat(chat, false);
                }
                if (!z10) {
                }
                break;
        }
    }

    public /* synthetic */ c(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j3) {
        this.a = 0;
        this.c = connectionsManager;
        this.d = requestDelegate;
        this.e = tLObject;
        this.f = tL_error;
        this.h = requestDelegateTimestamp;
        this.b = j3;
    }

    public /* synthetic */ c(p2 p2Var, TLObject tLObject, MessagesController.DialogFilter dialogFilter, TLRPC.TL_error tL_error, Runnable runnable, long j3) {
        this.a = 2;
        this.c = p2Var;
        this.e = tLObject;
        this.d = dialogFilter;
        this.f = tL_error;
        this.h = runnable;
        this.b = j3;
    }

    public /* synthetic */ c(x3 x3Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j3) {
        this.a = 3;
        this.c = x3Var;
        this.e = tLObject;
        this.d = str;
        this.h = inputSavedStarGift;
        this.f = tL_error;
        this.b = j3;
    }

    public /* synthetic */ c(v5 v5Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, Utilities.Callback2 callback2) {
        this.a = 5;
        this.c = v5Var;
        this.d = zArr;
        this.e = tL_payments_paymentFormStarGift;
        this.f = starGift;
        this.b = j3;
        this.h = callback2;
    }

    public /* synthetic */ c(z5 z5Var, TLObject tLObject, long j3, View view, x5 x5Var, MessagesController messagesController) {
        this.a = 6;
        this.c = z5Var;
        this.e = tLObject;
        this.b = j3;
        this.d = view;
        this.f = x5Var;
        this.h = messagesController;
    }
}
