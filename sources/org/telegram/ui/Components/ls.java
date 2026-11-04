package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ls implements ms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ls(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.ms
    public final void a(int i3, boolean z10) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((os) this.b).b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ms) obj).a(i3, z10);
                }
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
