package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class nk implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ nk(int i7) {
        this.a = i7;
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
