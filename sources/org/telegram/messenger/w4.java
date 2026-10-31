package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class w4 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Collator b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w4(Object obj, Collator collator, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = collator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                i5 i5Var = (i5) this.c;
                TLRPC.User Z1 = i5Var.getMessagesController().Z1(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                TLRPC.User Z12 = i5Var.getMessagesController().Z1(Long.valueOf(((TLRPC.TL_contact) obj2).user_id));
                return this.b.compare(h20.j(Z1, true), h20.j(Z12, true));
            default:
                a0.h hVar = (a0.h) this.c;
                TLRPC.User user = (TLRPC.User) hVar.f(((TLRPC.TL_contact) obj).user_id);
                TLRPC.User user2 = (TLRPC.User) hVar.f(((TLRPC.TL_contact) obj2).user_id);
                return this.b.compare(h20.j(user, true), h20.j(user2, true));
        }
    }
}
