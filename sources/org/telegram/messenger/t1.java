package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class t1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((ContactsController) this.b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.c, tLObject, tL_error);
                break;
            case 1:
                ((ContactsController) this.b).lambda$deleteAllContacts$9((Runnable) this.c, tLObject, tL_error);
                break;
            case 2:
                ((ContactsController) this.b).lambda$addContact$52((TLRPC.User) this.c, tLObject, tL_error);
                break;
            case 3:
                ((MediaDataController) this.b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.c, tLObject, tL_error);
                break;
            case 4:
                ((MediaDataController) this.b).lambda$saveToRingtones$204((TLRPC.Document) this.c, tLObject, tL_error);
                break;
            case 5:
                ((MediaDataController) this.b).lambda$loadAttachMenuBots$4((Runnable) this.c, tLObject, tL_error);
                break;
            case 6:
                ((MessagesController) this.b).lambda$requestIsUserContactBlocked$495((ArrayList) this.c, tLObject, tL_error);
                break;
            case 7:
                ((MessagesController) this.b).lambda$changeChatTitle$317((Runnable) this.c, tLObject, tL_error);
                break;
            case 8:
                ((SavedMessagesController) this.b).lambda$loadDialogs$3((ArrayList) this.c, tLObject, tL_error);
                break;
            case 9:
                ((SendMessagesHelper) this.b).lambda$sendReaction$35((Runnable) this.c, tLObject, tL_error);
                break;
            case 10:
                ((SendMessagesHelper) this.b).lambda$performSendDelayedMessage$50((SendMessagesHelper.DelayedMessage) this.c, tLObject, tL_error);
                break;
            default:
                ((UserNameResolver) this.b).lambda$resolve$1((String) this.c, tLObject, tL_error);
                break;
        }
    }
}
