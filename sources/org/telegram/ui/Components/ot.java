package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ot implements pt {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ot(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.pt
    public final void a(int i10, boolean z10) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((rt) this.b).b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((pt) obj).a(i10, z10);
                }
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
