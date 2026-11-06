package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ls implements ms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ls(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.ms
    public final void a(int i7, boolean z9) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((os) this.b).b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ms) obj).a(i7, z9);
                }
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
