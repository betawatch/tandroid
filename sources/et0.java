// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class et0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kt0 b;

    public /* synthetic */ et0(kt0 kt0Var, byte b) {
        this.a = b;
        this.b = kt0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final kt0 kt0Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 1;
                hl.c3(new Runnable() { // from class: ct0
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        kt0 kt0Var2 = kt0Var;
                        switch (b3) {
                            case 0:
                                kt0Var2.j = new ArrayList();
                                kt0Var2.i = false;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i = 0; i < vector.objects.size(); i++) {
                                        kt0Var2.j.add((TLRPC.User) vector.objects.get(i));
                                    }
                                    uc7.s1(kt0Var2.a).j4(kt0Var2.j, false);
                                    break;
                                }
                                break;
                            default:
                                int i2 = kt0Var2.a;
                                kt0Var2.l = new ArrayList();
                                kt0Var2.k = false;
                                if (tLObject2 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                                    uc7.s1(i2).c4(messages_chats.chats, false);
                                    kt0Var2.l.addAll(messages_chats.chats);
                                }
                                jn7.f(i2).k(jn7.P3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                hl.c3(new Runnable() { // from class: ct0
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        kt0 kt0Var2 = kt0Var;
                        switch (b32) {
                            case 0:
                                kt0Var2.j = new ArrayList();
                                kt0Var2.i = false;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i = 0; i < vector.objects.size(); i++) {
                                        kt0Var2.j.add((TLRPC.User) vector.objects.get(i));
                                    }
                                    uc7.s1(kt0Var2.a).j4(kt0Var2.j, false);
                                    break;
                                }
                                break;
                            default:
                                int i2 = kt0Var2.a;
                                kt0Var2.l = new ArrayList();
                                kt0Var2.k = false;
                                if (tLObject2 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                                    uc7.s1(i2).c4(messages_chats.chats, false);
                                    kt0Var2.l.addAll(messages_chats.chats);
                                }
                                jn7.f(i2).k(jn7.P3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
