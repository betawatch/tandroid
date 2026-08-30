package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ht {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ht(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public final void a(int i10, boolean z4) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((kt) this.b).b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((ht) obj).a(i10, z4);
                }
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
