package org.telegram.messenger;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class vk implements IntFunction {
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
