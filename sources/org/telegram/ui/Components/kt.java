package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kt {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kt(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public final void a(int i10, boolean z4) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((mt) this.b).b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((kt) obj).a(i10, z4);
                }
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
