package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ a0(k0 k0Var, int i10) {
        this.a = i10;
        this.b = k0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final k0 k0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                k0 k0Var2 = k0Var;
                                k0Var2.getClass();
                                k0Var2.j = new ArrayList();
                                k0Var2.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                                        k0Var2.j.add((TLRPC.User) vector.objects.get(i11));
                                    }
                                    MessagesController.getInstance(k0Var2.a).putUsers(k0Var2.j, false);
                                    break;
                                }
                                break;
                            default:
                                k0 k0Var3 = k0Var;
                                int i12 = k0Var3.a;
                                k0Var3.l = new ArrayList();
                                k0Var3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i12).putChats(messages_chats.chats, false);
                                    k0Var3.l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final k0 k0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                k0 k0Var22 = k0Var2;
                                k0Var22.getClass();
                                k0Var22.j = new ArrayList();
                                k0Var22.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i112 = 0; i112 < vector.objects.size(); i112++) {
                                        k0Var22.j.add((TLRPC.User) vector.objects.get(i112));
                                    }
                                    MessagesController.getInstance(k0Var22.a).putUsers(k0Var22.j, false);
                                    break;
                                }
                                break;
                            default:
                                k0 k0Var3 = k0Var2;
                                int i12 = k0Var3.a;
                                k0Var3.l = new ArrayList();
                                k0Var3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i12).putChats(messages_chats.chats, false);
                                    k0Var3.l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
