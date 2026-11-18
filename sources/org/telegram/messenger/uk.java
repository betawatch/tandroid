package org.telegram.messenger;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
