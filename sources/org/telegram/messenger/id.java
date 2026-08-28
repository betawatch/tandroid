package org.telegram.messenger;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class id implements IntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ id(int i9) {
        this.a = i9;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i9) {
        int[][] lambda$new$16;
        switch (this.a) {
            case 0:
                return String.valueOf(i9);
            default:
                lambda$new$16 = MessagesController.lambda$new$16(i9);
                return lambda$new$16;
        }
    }
}
