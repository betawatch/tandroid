package org.telegram.messenger;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class fe implements IntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ fe(int i10) {
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
