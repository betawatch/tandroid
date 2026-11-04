package ei;

import android.view.ScaleGestureDetector;
import java.util.ArrayList;
import org.telegram.ui.Components.ee0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h1 implements q1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ScaleGestureDetector.OnScaleGestureListener c;

    public /* synthetic */ h1(ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, ArrayList arrayList, int i3) {
        this.a = i3;
        this.c = onScaleGestureListener;
        this.b = arrayList;
    }

    @Override // q1.c
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = gVar.k;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, null);
                }
                ArrayList arrayList2 = this.b;
                arrayList2.add(gVar);
                if (arrayList2.size() == 2) {
                    ((i1) this.c).a();
                    break;
                }
                break;
            case 1:
                ArrayList arrayList3 = gVar.k;
                int indexOf2 = arrayList3.indexOf(this);
                if (indexOf2 >= 0) {
                    arrayList3.set(indexOf2, null);
                }
                ArrayList arrayList4 = this.b;
                arrayList4.add(gVar);
                if (arrayList4.size() == 2) {
                    ((ee0) this.c).b();
                    break;
                }
                break;
            default:
                ArrayList arrayList5 = gVar.k;
                int indexOf3 = arrayList5.indexOf(this);
                if (indexOf3 >= 0) {
                    arrayList5.set(indexOf3, null);
                }
                ArrayList arrayList6 = this.b;
                arrayList6.add(gVar);
                if (arrayList6.size() == 2) {
                    ((ee0) this.c).b();
                    break;
                }
                break;
        }
    }
}
