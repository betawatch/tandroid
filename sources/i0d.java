// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class i0d {
    public final ArrayList a = new ArrayList();

    public final synchronized boolean a(int i, int i2, boolean z) {
        int i3 = 0;
        while (true) {
            if (i3 >= this.a.size()) {
                break;
            }
            int[] iArr = (int[]) this.a.get(i3);
            if (iArr[0] != i) {
                i3++;
            } else {
                if (iArr[1] == i2 && iArr[2] == z && i3 == 0) {
                    return false;
                }
                this.a.remove(i3);
            }
        }
        this.a.add(0, new int[]{i, i2, z ? 1 : 0});
        while (this.a.size() > 4) {
            ArrayList arrayList = this.a;
            arrayList.remove(arrayList.size() - 1);
        }
        return true;
    }
}
