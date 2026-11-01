package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class rk implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ rk(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new HashSet();
            default:
                return new ArrayList();
        }
    }
}
