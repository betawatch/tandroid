package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class qk implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ qk(int i10) {
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
