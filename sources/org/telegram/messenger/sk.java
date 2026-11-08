package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.z41;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
                return ((org.telegram.ui.Wallet.a8) obj).I;
            default:
                return ((org.telegram.ui.Wallet.a8) obj).J;
        }
    }
}
