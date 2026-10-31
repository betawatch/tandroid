package kg;

import ag.g3;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.w3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ z(q0 q0Var, int i10) {
        this.a = i10;
        this.b = q0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        q0 q0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.g3(new k2.u(4, q0Var, tLObject));
                break;
            case 1:
                if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                    q0Var.getClass();
                    break;
                } else {
                    org.telegram.messenger.i0.g3(q0Var.z2);
                    break;
                }
            default:
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList = new ArrayList();
                    int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
                    int i11 = 0;
                    while (true) {
                        q0 q0Var2 = this.b;
                        if (i11 >= min) {
                            org.telegram.messenger.i0.g3(new g3(q0Var2, arrayList, min, tL_messages_inactiveChats, 3));
                            break;
                        } else {
                            TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i11);
                            int currentTime = (ConnectionsManager.getInstance(q0Var2.a).getCurrentTime() - tL_messages_inactiveChats.dates.get(i11).intValue()) / 86400;
                            String G = currentTime < 30 ? cd.G(currentTime, "Days", new Object[0]) : currentTime < 365 ? cd.G(currentTime / 30, "Months", new Object[0]) : cd.G(currentTime / 365, "Years", new Object[0]);
                            if (w3.n0(chat)) {
                                arrayList.add(cd.a0("InactiveChatSignature", null, 2131749220, cd.G(chat.participants_count, "Members", new Object[0]), G));
                            } else if (w3.T(chat)) {
                                arrayList.add(cd.a0("InactiveChannelSignature", null, 2131749221, G));
                            } else {
                                arrayList.add(cd.a0("InactiveChatSignature", null, 2131749220, cd.G(chat.participants_count, "Members", new Object[0]), G));
                            }
                            i11++;
                        }
                    }
                }
                break;
        }
    }
}
