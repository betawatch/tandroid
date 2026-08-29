package jh;

import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
        this.e = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ih.h1((b0) this.c, (org.telegram.ui.ActionBar.c2) this.d, tLObject, this.b, (Utilities.Callback) this.e));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new n2((h5) this.c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.e, tL_error, this.b));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ih.h1((s7) this.c, tLObject, (MessageObject) this.d, this.b, (Runnable) this.e, 2));
                break;
            case 3:
                ((MessagesController) this.c).lambda$deleteSavedDialog$143(this.b, (int[]) this.d, (TLRPC.InputPeer) this.e, tLObject, tL_error);
                break;
            case 4:
                ((MessagesController) this.c).lambda$getSavedReactionTags$486(this.b, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, tLObject, tL_error);
                break;
            case 5:
                ((MessagesController) this.c).lambda$addUsersToChannel$274((org.telegram.ui.ActionBar.o2) this.d, (TLRPC.TL_channels_inviteToChannel) this.e, this.b, tLObject, tL_error);
                break;
            case 6:
                ((TopicsController) this.c).lambda$pinTopic$20((org.telegram.ui.ActionBar.o2) this.d, this.b, (ArrayList) this.e, tLObject, tL_error);
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new ih.h1((org.telegram.ui.ActionBar.c2) this.d, tLObject, this.b, (AccountInstance) this.c, (MessagesStorage.BooleanCallback) this.e, 13));
                break;
            default:
                AndroidUtilities.runOnUIThread(new n2((org.telegram.ui.ActionBar.o2) this.c, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.e, this.b));
                break;
        }
    }

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j10;
    }

    public /* synthetic */ v(MessagesController messagesController, long j10, Object obj, TLObject tLObject, int i10) {
        this.a = i10;
        this.c = messagesController;
        this.b = j10;
        this.d = obj;
        this.e = tLObject;
    }

    public /* synthetic */ v(org.telegram.ui.ActionBar.c2 c2Var, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        this.a = 7;
        this.d = c2Var;
        this.b = j10;
        this.c = accountInstance;
        this.e = booleanCallback;
    }
}
