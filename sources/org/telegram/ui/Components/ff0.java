package org.telegram.ui.Components;

import android.view.ScaleGestureDetector;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ff0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ScaleGestureDetector.OnScaleGestureListener c;

    public /* synthetic */ ff0(ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = onScaleGestureListener;
        this.b = arrayList;
    }

    @Override // o1.f
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = jVar.k;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, null);
                }
                ArrayList arrayList2 = this.b;
                arrayList2.add(jVar);
                if (arrayList2.size() == 2) {
                    ((eg.b) this.c).b();
                    break;
                }
                break;
            case 1:
                ArrayList arrayList3 = jVar.k;
                int indexOf2 = arrayList3.indexOf(this);
                if (indexOf2 >= 0) {
                    arrayList3.set(indexOf2, null);
                }
                ArrayList arrayList4 = this.b;
                arrayList4.add(jVar);
                if (arrayList4.size() == 2) {
                    ((eg.b) this.c).b();
                    break;
                }
                break;
            default:
                ArrayList arrayList5 = jVar.k;
                int indexOf3 = arrayList5.indexOf(this);
                if (indexOf3 >= 0) {
                    arrayList5.set(indexOf3, null);
                }
                ArrayList arrayList6 = this.b;
                arrayList6.add(jVar);
                if (arrayList6.size() == 2) {
                    ((th.t0) this.c).a();
                    break;
                }
                break;
        }
    }
}
