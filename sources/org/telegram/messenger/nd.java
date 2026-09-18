package org.telegram.messenger;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class nd implements IntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ nd(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i10) {
        int[][] lambda$new$16;
        switch (this.a) {
            case 0:
                return String.valueOf(i10);
            default:
                lambda$new$16 = MessagesController.lambda$new$16(i10);
                return lambda$new$16;
        }
    }
}
