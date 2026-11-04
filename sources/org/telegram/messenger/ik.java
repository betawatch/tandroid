package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.o41;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ik implements ToLongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ ik(int i3) {
        this.a = i3;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                return ((ts) obj).e;
            case 2:
                return ((ts) obj).e;
            case 3:
                return ((zi) obj).Z0();
            case 4:
                if (((o41) obj).b == null) {
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
