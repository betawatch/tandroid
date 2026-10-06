package org.telegram.messenger;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
