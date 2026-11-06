package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class ok implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ ok(int i7) {
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
