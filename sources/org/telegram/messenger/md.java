package org.telegram.messenger;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class md implements IntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ md(int i10) {
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
