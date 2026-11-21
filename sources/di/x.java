package di;

import java.util.ArrayList;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ x(e0 e0Var, int i7) {
        this.a = i7;
        this.b = e0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final e0 e0Var = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: di.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                e0 e0Var2 = e0Var;
                                e0Var2.getClass();
                                e0Var2.j = new ArrayList();
                                e0Var2.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        e0Var2.j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    mp.u1(e0Var2.a).f4(e0Var2.j, false);
                                    break;
                                }
                                break;
                            default:
                                e0 e0Var3 = e0Var;
                                int i11 = e0Var3.a;
                                e0Var3.l = new ArrayList();
                                e0Var3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    mp.u1(i11).Z3(messages_chats.chats, false);
                                    e0Var3.l.addAll(messages_chats.chats);
                                }
                                ks.f(i11).k(ks.P3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final e0 e0Var2 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: di.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                e0 e0Var22 = e0Var2;
                                e0Var22.getClass();
                                e0Var22.j = new ArrayList();
                                e0Var22.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i102 = 0; i102 < vector.objects.size(); i102++) {
                                        e0Var22.j.add((TLRPC.User) vector.objects.get(i102));
                                    }
                                    mp.u1(e0Var22.a).f4(e0Var22.j, false);
                                    break;
                                }
                                break;
                            default:
                                e0 e0Var3 = e0Var2;
                                int i11 = e0Var3.a;
                                e0Var3.l = new ArrayList();
                                e0Var3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    mp.u1(i11).Z3(messages_chats.chats, false);
                                    e0Var3.l.addAll(messages_chats.chats);
                                }
                                ks.f(i11).k(ks.P3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
