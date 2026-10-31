package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.r61;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class uk implements ToLongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ uk(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                return ((nt) obj).e;
            case 2:
                return ((nt) obj).e;
            case 3:
                return ((jj) obj).Z0();
            case 4:
                if (((r61) obj).b == null) {
                    return 0L;
                }
                return r3.k.date;
            case 5:
                return ((org.telegram.ui.Wallet.g8) obj).I;
            default:
                return ((org.telegram.ui.Wallet.g8) obj).J;
        }
    }
}
