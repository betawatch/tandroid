package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.w41;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class qk implements ToLongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ qk(int i7) {
        this.a = i7;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                return ((zs) obj).e;
            case 2:
                return ((zs) obj).e;
            case 3:
                return ((gj) obj).Z0();
            case 4:
                if (((w41) obj).b == null) {
                    return 0L;
                }
                return r3.k.date;
            case 5:
                return ((org.telegram.ui.Wallet.b8) obj).I;
            default:
                return ((org.telegram.ui.Wallet.b8) obj).J;
        }
    }
}
