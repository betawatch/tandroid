package ih;

import android.view.ScaleGestureDetector;
import java.util.ArrayList;
import org.telegram.ui.Components.mf0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class g1 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ScaleGestureDetector.OnScaleGestureListener c;

    public /* synthetic */ g1(ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, ArrayList arrayList, int i9) {
        this.a = i9;
        this.c = onScaleGestureListener;
        this.b = arrayList;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = hVar.k;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, null);
                }
                ArrayList arrayList2 = this.b;
                arrayList2.add((o1.j) hVar);
                if (arrayList2.size() == 2) {
                    ((h1) this.c).a();
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
                arrayList4.add((o1.j) hVar);
                if (arrayList4.size() == 2) {
                    ((mf0) this.c).b();
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
                arrayList6.add((o1.j) hVar);
                if (arrayList6.size() == 2) {
                    ((mf0) this.c).b();
                    break;
                }
                break;
        }
    }
}
