package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.z41;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                if (((z41) obj).b == null) {
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
