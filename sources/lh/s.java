package lh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ s(b0 b0Var, int i10) {
        this.a = i10;
        this.b = b0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final b0 b0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: lh.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                b0 b0Var2 = b0Var;
                                b0Var2.getClass();
                                b0Var2.j = new ArrayList();
                                b0Var2.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                                        b0Var2.j.add((TLRPC.User) vector.objects.get(i11));
                                    }
                                    MessagesController.getInstance(b0Var2.a).putUsers(b0Var2.j, false);
                                    break;
                                }
                                break;
                            default:
                                b0 b0Var3 = b0Var;
                                int i12 = b0Var3.a;
                                b0Var3.l = new ArrayList();
                                b0Var3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i12).putChats(messages_chats.chats, false);
                                    b0Var3.l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final b0 b0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: lh.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                b0 b0Var22 = b0Var2;
                                b0Var22.getClass();
                                b0Var22.j = new ArrayList();
                                b0Var22.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i112 = 0; i112 < vector.objects.size(); i112++) {
                                        b0Var22.j.add((TLRPC.User) vector.objects.get(i112));
                                    }
                                    MessagesController.getInstance(b0Var22.a).putUsers(b0Var22.j, false);
                                    break;
                                }
                                break;
                            default:
                                b0 b0Var3 = b0Var2;
                                int i12 = b0Var3.a;
                                b0Var3.l = new ArrayList();
                                b0Var3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i12).putChats(messages_chats.chats, false);
                                    b0Var3.l.addAll(messages_chats.chats);
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
