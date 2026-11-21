package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class at implements bt {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ at(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.bt
    public final void a(int i7, boolean z10) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((dt) this.b).b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((bt) obj).a(i7, z10);
                }
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
