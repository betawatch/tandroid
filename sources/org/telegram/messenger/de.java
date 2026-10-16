package org.telegram.messenger;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class de implements IntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ de(int i10) {
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
