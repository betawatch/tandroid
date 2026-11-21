package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class u4 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Collator b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u4(Object obj, Collator collator, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = collator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                i5 i5Var = (i5) this.c;
                TLRPC.User c22 = i5Var.getMessagesController().c2(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                TLRPC.User c23 = i5Var.getMessagesController().c2(Long.valueOf(((TLRPC.TL_contact) obj2).user_id));
                return this.b.compare(o10.k(c22, true), o10.k(c23, true));
            default:
                a0.h hVar = (a0.h) this.c;
                TLRPC.User user = (TLRPC.User) hVar.f(((TLRPC.TL_contact) obj).user_id);
                TLRPC.User user2 = (TLRPC.User) hVar.f(((TLRPC.TL_contact) obj2).user_id);
                return this.b.compare(o10.k(user, true), o10.k(user2, true));
        }
    }
}
