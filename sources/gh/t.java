package gh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0 b;

    public /* synthetic */ t(c0 c0Var, int i9) {
        this.a = i9;
        this.b = c0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i9 = 0;
                final c0 c0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                c0 c0Var2 = c0Var;
                                c0Var2.getClass();
                                c0Var2.j = new ArrayList();
                                c0Var2.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        c0Var2.j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    MessagesController.getInstance(c0Var2.a).putUsers(c0Var2.j, false);
                                    break;
                                }
                                break;
                            default:
                                c0 c0Var3 = c0Var;
                                int i11 = c0Var3.a;
                                c0Var3.l = new ArrayList();
                                c0Var3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i11).putChats(messages_chats.chats, false);
                                    c0Var3.l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final c0 c0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                c0 c0Var22 = c0Var2;
                                c0Var22.getClass();
                                c0Var22.j = new ArrayList();
                                c0Var22.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i102 = 0; i102 < vector.objects.size(); i102++) {
                                        c0Var22.j.add((TLRPC.User) vector.objects.get(i102));
                                    }
                                    MessagesController.getInstance(c0Var22.a).putUsers(c0Var22.j, false);
                                    break;
                                }
                                break;
                            default:
                                c0 c0Var3 = c0Var2;
                                int i11 = c0Var3.a;
                                c0Var3.l = new ArrayList();
                                c0Var3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i11).putChats(messages_chats.chats, false);
                                    c0Var3.l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
