package org.telegram.messenger;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class qk implements IntFunction {
    public final /* synthetic */ int a;

    @Override // java.util.function.IntFunction
    public final Object apply(int i3) {
        switch (this.a) {
            case 0:
                return new int[i3][];
            default:
                return String.valueOf(i3);
        }
    }
}
