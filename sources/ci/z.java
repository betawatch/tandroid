package ci;

import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ z(i0 i0Var, int i3) {
        this.a = i3;
        this.b = i0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i3 = 1;
                final i0 i0Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                i0 i0Var2 = i0Var;
                                i0Var2.getClass();
                                i0Var2.j = new ArrayList();
                                i0Var2.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        i0Var2.j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    hp.s1(i0Var2.a).Y3(i0Var2.j, false);
                                    break;
                                }
                                break;
                            default:
                                i0 i0Var3 = i0Var;
                                int i11 = i0Var3.a;
                                i0Var3.l = new ArrayList();
                                i0Var3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    hp.s1(i11).S3(messages_chats.chats, false);
                                    i0Var3.l.addAll(messages_chats.chats);
                                }
                                hs.f(i11).k(hs.M3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final i0 i0Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                i0 i0Var22 = i0Var2;
                                i0Var22.getClass();
                                i0Var22.j = new ArrayList();
                                i0Var22.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i102 = 0; i102 < vector.objects.size(); i102++) {
                                        i0Var22.j.add((TLRPC.User) vector.objects.get(i102));
                                    }
                                    hp.s1(i0Var22.a).Y3(i0Var22.j, false);
                                    break;
                                }
                                break;
                            default:
                                i0 i0Var3 = i0Var2;
                                int i11 = i0Var3.a;
                                i0Var3.l = new ArrayList();
                                i0Var3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    hp.s1(i11).S3(messages_chats.chats, false);
                                    i0Var3.l.addAll(messages_chats.chats);
                                }
                                hs.f(i11).k(hs.M3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
