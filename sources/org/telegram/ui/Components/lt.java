package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lt implements mt {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lt(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.mt
    public final void a(int i10, boolean z10) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((ot) this.b).b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((mt) obj).a(i10, z10);
                }
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
