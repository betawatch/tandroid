// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class du0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ku0 b;

    public /* synthetic */ du0(ku0 ku0Var, byte b) {
        this.a = b;
        this.b = ku0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final ku0 ku0Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 1;
                gm.c3(new Runnable() { // from class: cu0
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        ku0 ku0Var2 = ku0Var;
                        switch (b3) {
                            case 0:
                                ku0Var2.j = new ArrayList();
                                ku0Var2.i = false;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i = 0; i < vector.objects.size(); i++) {
                                        ku0Var2.j.add((TLRPC.User) vector.objects.get(i));
                                    }
                                    oc7.r1(ku0Var2.a).d4(ku0Var2.j, false);
                                    break;
                                }
                                break;
                            default:
                                int i2 = ku0Var2.a;
                                ku0Var2.l = new ArrayList();
                                ku0Var2.k = false;
                                if (tLObject2 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                                    oc7.r1(i2).X3(messages_chats.chats, false);
                                    ku0Var2.l.addAll(messages_chats.chats);
                                }
                                nm7.f(i2).k(nm7.P3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                gm.c3(new Runnable() { // from class: cu0
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        ku0 ku0Var2 = ku0Var;
                        switch (b32) {
                            case 0:
                                ku0Var2.j = new ArrayList();
                                ku0Var2.i = false;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i = 0; i < vector.objects.size(); i++) {
                                        ku0Var2.j.add((TLRPC.User) vector.objects.get(i));
                                    }
                                    oc7.r1(ku0Var2.a).d4(ku0Var2.j, false);
                                    break;
                                }
                                break;
                            default:
                                int i2 = ku0Var2.a;
                                ku0Var2.l = new ArrayList();
                                ku0Var2.k = false;
                                if (tLObject2 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                                    oc7.r1(i2).X3(messages_chats.chats, false);
                                    ku0Var2.l.addAll(messages_chats.chats);
                                }
                                nm7.f(i2).k(nm7.P3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
