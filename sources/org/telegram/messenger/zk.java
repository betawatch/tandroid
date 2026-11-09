package org.telegram.messenger;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class zk implements IntFunction {
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
