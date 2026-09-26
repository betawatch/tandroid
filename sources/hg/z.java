package hg;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ z(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final a0 a0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hg.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        a0 a0Var2 = a0Var;
                        switch (i11) {
                            case 0:
                                int i12 = a0Var2.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    a0Var2.b.add(tL_businessChatLink);
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinkCreated, tL_businessChatLink);
                                    a0Var2.f();
                                    break;
                                }
                                break;
                            default:
                                ArrayList arrayList = a0Var2.b;
                                int i13 = a0Var2.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    MessagesController.getInstance(i13).putUsers(businesschatlinks.users, false);
                                    MessagesController.getInstance(i13).putChats(businesschatlinks.chats, false);
                                    MessagesStorage.getInstance(i13).putUsersAndChats(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    a0Var2.f();
                                } else {
                                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                                }
                                a0Var2.c = false;
                                a0Var2.d = true;
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final a0 a0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hg.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        a0 a0Var22 = a0Var2;
                        switch (i112) {
                            case 0:
                                int i12 = a0Var22.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    a0Var22.b.add(tL_businessChatLink);
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinkCreated, tL_businessChatLink);
                                    a0Var22.f();
                                    break;
                                }
                                break;
                            default:
                                ArrayList arrayList = a0Var22.b;
                                int i13 = a0Var22.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    MessagesController.getInstance(i13).putUsers(businesschatlinks.users, false);
                                    MessagesController.getInstance(i13).putChats(businesschatlinks.chats, false);
                                    MessagesStorage.getInstance(i13).putUsersAndChats(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    a0Var22.f();
                                } else {
                                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                                }
                                a0Var22.c = false;
                                a0Var22.d = true;
                                break;
                        }
                    }
                });
                break;
        }
    }
}
