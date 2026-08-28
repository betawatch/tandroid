package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ys {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ys(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    public final void a(int i9, boolean z10) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((at) this.b).b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ys) obj).a(i9, z10);
                }
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
