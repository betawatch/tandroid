package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.p61;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class vk implements ToLongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ vk(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                return ((ot) obj).e;
            case 2:
                return ((ot) obj).e;
            case 3:
                return ((kj) obj).Z0();
            case 4:
                if (((p61) obj).b == null) {
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
