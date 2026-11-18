package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                if (((z41) obj).b == null) {
                    return 0L;
                }
                return r3.k.date;
            case 5:
                return ((org.telegram.ui.Wallet.q8) obj).I;
            default:
                return ((org.telegram.ui.Wallet.q8) obj).J;
        }
    }
}
