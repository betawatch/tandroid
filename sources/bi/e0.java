package bi;

import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ e0(n0 n0Var, int i7) {
        this.a = i7;
        this.b = n0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final n0 n0Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                n0 n0Var2 = n0Var;
                                n0Var2.getClass();
                                n0Var2.j = new ArrayList();
                                n0Var2.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        n0Var2.j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    qp.s1(n0Var2.a).Y3(n0Var2.j, false);
                                    break;
                                }
                                break;
                            default:
                                n0 n0Var3 = n0Var;
                                int i11 = n0Var3.a;
                                n0Var3.l = new ArrayList();
                                n0Var3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    qp.s1(i11).S3(messages_chats.chats, false);
                                    n0Var3.l.addAll(messages_chats.chats);
                                }
                                qs.f(i11).k(qs.M3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final n0 n0Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                n0 n0Var22 = n0Var2;
                                n0Var22.getClass();
                                n0Var22.j = new ArrayList();
                                n0Var22.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i102 = 0; i102 < vector.objects.size(); i102++) {
                                        n0Var22.j.add((TLRPC.User) vector.objects.get(i102));
                                    }
                                    qp.s1(n0Var22.a).Y3(n0Var22.j, false);
                                    break;
                                }
                                break;
                            default:
                                n0 n0Var3 = n0Var2;
                                int i11 = n0Var3.a;
                                n0Var3.l = new ArrayList();
                                n0Var3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    qp.s1(i11).S3(messages_chats.chats, false);
                                    n0Var3.l.addAll(messages_chats.chats);
                                }
                                qs.f(i11).k(qs.M3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
