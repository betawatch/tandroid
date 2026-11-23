package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.y41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class ok implements ToLongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ ok(int i7) {
        this.a = i7;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                return ((ws) obj).e;
            case 2:
                return ((ws) obj).e;
            case 3:
                return ((fj) obj).Z0();
            case 4:
                if (((y41) obj).b == null) {
                    return 0L;
                }
                return r3.k.date;
            case 5:
                return ((org.telegram.ui.Wallet.r8) obj).I;
            default:
                return ((org.telegram.ui.Wallet.r8) obj).J;
        }
    }
}
