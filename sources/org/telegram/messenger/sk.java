package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.b51;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class sk implements ToLongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ sk(int i7) {
        this.a = i7;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                return ((ct) obj).e;
            case 2:
                return ((ct) obj).e;
            case 3:
                return ((ij) obj).Z0();
            case 4:
                if (((b51) obj).b == null) {
                    return 0L;
                }
                return r3.k.date;
            case 5:
                return ((org.telegram.ui.Wallet.c8) obj).I;
            default:
                return ((org.telegram.ui.Wallet.c8) obj).J;
        }
    }
}
