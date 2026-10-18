package ci;

import android.view.ScaleGestureDetector;
import java.util.ArrayList;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class j1 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ScaleGestureDetector.OnScaleGestureListener c;

    public /* synthetic */ j1(ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = onScaleGestureListener;
        this.b = arrayList;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = hVar.k;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, null);
                }
                ArrayList arrayList2 = this.b;
                arrayList2.add((o1.k) hVar);
                if (arrayList2.size() == 2) {
                    ((k1) this.c).a();
                    break;
                }
                break;
            case 1:
                ArrayList arrayList3 = hVar.k;
                int indexOf2 = arrayList3.indexOf(this);
                if (indexOf2 >= 0) {
                    arrayList3.set(indexOf2, null);
                }
                ArrayList arrayList4 = this.b;
                arrayList4.add((o1.k) hVar);
                if (arrayList4.size() == 2) {
                    ((mg.b) this.c).b();
                    break;
                }
                break;
            default:
                ArrayList arrayList5 = hVar.k;
                int indexOf3 = arrayList5.indexOf(this);
                if (indexOf3 >= 0) {
                    arrayList5.set(indexOf3, null);
                }
                ArrayList arrayList6 = this.b;
                arrayList6.add((o1.k) hVar);
                if (arrayList6.size() == 2) {
                    ((mg.b) this.c).b();
                    break;
                }
                break;
        }
    }
}
