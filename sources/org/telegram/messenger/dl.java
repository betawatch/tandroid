package org.telegram.messenger;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class dl implements IntFunction {
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
