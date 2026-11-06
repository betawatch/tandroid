package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class t4 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Collator b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t4(Object obj, Collator collator, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = collator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                g5 g5Var = (g5) this.c;
                TLRPC.User a22 = g5Var.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                TLRPC.User a23 = g5Var.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) obj2).user_id));
                return this.b.compare(t10.j(a22, true), t10.j(a23, true));
            default:
                a0.h hVar = (a0.h) this.c;
                TLRPC.User user = (TLRPC.User) hVar.f(((TLRPC.TL_contact) obj).user_id);
                TLRPC.User user2 = (TLRPC.User) hVar.f(((TLRPC.TL_contact) obj2).user_id);
                return this.b.compare(t10.j(user, true), t10.j(user2, true));
        }
    }
}
