package lh;

import android.view.ScaleGestureDetector;
import java.util.ArrayList;
import org.telegram.ui.Components.yf0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class e1 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ScaleGestureDetector.OnScaleGestureListener c;

    public /* synthetic */ e1(ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = onScaleGestureListener;
        this.b = arrayList;
    }

    @Override // o1.g
    public final void a(o1.i iVar, boolean z10, float f9, float f10) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = iVar.k;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, null);
                }
                ArrayList arrayList2 = this.b;
                arrayList2.add((o1.k) iVar);
                if (arrayList2.size() == 2) {
                    ((f1) this.c).a();
                    break;
                }
                break;
            case 1:
                ArrayList arrayList3 = iVar.k;
                int indexOf2 = arrayList3.indexOf(this);
                if (indexOf2 >= 0) {
                    arrayList3.set(indexOf2, null);
                }
                ArrayList arrayList4 = this.b;
                arrayList4.add((o1.k) iVar);
                if (arrayList4.size() == 2) {
                    ((yf0) this.c).b();
                    break;
                }
                break;
            default:
                ArrayList arrayList5 = iVar.k;
                int indexOf3 = arrayList5.indexOf(this);
                if (indexOf3 >= 0) {
                    arrayList5.set(indexOf3, null);
                }
                ArrayList arrayList6 = this.b;
                arrayList6.add((o1.k) iVar);
                if (arrayList6.size() == 2) {
                    ((yf0) this.c).b();
                    break;
                }
                break;
        }
    }
}
