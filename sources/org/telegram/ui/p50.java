package org.telegram.ui;

import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p50 implements Comparator {
    public static String a(TLObject tLObject) {
        if (!(tLObject instanceof TLRPC.User)) {
            return tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "";
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        return org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return a((TLObject) obj).compareTo(a((TLObject) obj2));
    }
}
