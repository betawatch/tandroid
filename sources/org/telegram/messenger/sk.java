package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.a51;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                if (((a51) obj).b == null) {
                    return 0L;
                }
                return r3.k.date;
            case 5:
                return ((org.telegram.ui.Wallet.z7) obj).I;
            default:
                return ((org.telegram.ui.Wallet.z7) obj).J;
        }
    }
}
