package org.telegram.messenger;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class cl implements IntFunction {
    public final /* synthetic */ int a;

    @Override // java.util.function.IntFunction
    public final Object apply(int i10) {
        switch (this.a) {
            case 0:
                return new int[i10][];
            default:
                return String.valueOf(i10);
        }
    }
}
