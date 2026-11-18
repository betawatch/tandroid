package org.telegram.messenger;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
