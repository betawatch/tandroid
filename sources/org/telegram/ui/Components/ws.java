package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ws implements xs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ws(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.xs
    public final void a(int i10, boolean z10) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((zs) this.b).b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((xs) obj).a(i10, z10);
                }
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
