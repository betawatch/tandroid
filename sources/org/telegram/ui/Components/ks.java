package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ks implements ls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ks(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.ls
    public final void a(int i7, boolean z9) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((ns) this.b).b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ls) obj).a(i7, z9);
                }
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
