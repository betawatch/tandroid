package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ys implements zs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ys(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.zs
    public final void a(int i7, boolean z10) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((bt) this.b).b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((zs) obj).a(i7, z10);
                }
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
