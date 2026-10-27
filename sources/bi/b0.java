package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ b0(m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final m0 m0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                m0 m0Var2 = m0Var;
                                m0Var2.getClass();
                                m0Var2.j = new ArrayList();
                                m0Var2.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                                        m0Var2.j.add((TLRPC.User) vector.objects.get(i11));
                                    }
                                    MessagesController.getInstance(m0Var2.a).putUsers(m0Var2.j, false);
                                    break;
                                }
                                break;
                            default:
                                m0 m0Var3 = m0Var;
                                int i12 = m0Var3.a;
                                m0Var3.l = new ArrayList();
                                m0Var3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i12).putChats(messages_chats.chats, false);
                                    m0Var3.l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final m0 m0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                m0 m0Var22 = m0Var2;
                                m0Var22.getClass();
                                m0Var22.j = new ArrayList();
                                m0Var22.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i112 = 0; i112 < vector.objects.size(); i112++) {
                                        m0Var22.j.add((TLRPC.User) vector.objects.get(i112));
                                    }
                                    MessagesController.getInstance(m0Var22.a).putUsers(m0Var22.j, false);
                                    break;
                                }
                                break;
                            default:
                                m0 m0Var3 = m0Var2;
                                int i12 = m0Var3.a;
                                m0Var3.l = new ArrayList();
                                m0Var3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i12).putChats(messages_chats.chats, false);
                                    m0Var3.l.addAll(messages_chats.chats);
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
