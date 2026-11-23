package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class kk implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ kk(int i7) {
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
