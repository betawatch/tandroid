package org.telegram.messenger;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class uk implements IntFunction {
    public final /* synthetic */ int a;

    @Override // java.util.function.IntFunction
    public final Object apply(int i7) {
        switch (this.a) {
            case 0:
                return new int[i7][];
            default:
                return String.valueOf(i7);
        }
    }
}
