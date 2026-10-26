package hi;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class d2 {
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();
    public final int[] c = {y6.G6, y6.u8, y6.G8, y6.E8, y6.F8, y6.I5, y6.Ii};
    public float d;

    public final int a(int i10) {
        return i0.a.f(this.d, this.a.get(i10), this.b.get(i10));
    }

    public final void b(org.telegram.ui.ActionBar.k kVar, float f7) {
        this.d = f7;
        int i10 = y6.G6;
        kVar.setTitleColor(a(i10));
        kVar.setSubtitleColor(y6.o1(0.45f, a(i10)));
        kVar.y(a(i10), false);
        ImageView imageView = kVar.e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i10), PorterDuff.Mode.SRC_IN));
        }
        kVar.x(a(y6.u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i10, u6 u6Var) {
        int i11;
        int[] iArr = this.c;
        int i12 = 0;
        if (i10 == 0) {
            while (i12 < iArr.length) {
                int i13 = iArr[i12];
                sparseIntArray.put(i13, y6.w0(i13, u6Var));
                i12++;
            }
            return;
        }
        int i14 = i0.a.h(i10) < 0.5d ? -1 : -16777216;
        int o10 = i0.a.o(i14, 60);
        while (i12 < iArr.length) {
            int i15 = iArr[i12];
            if (i15 == y6.G8 || i15 == y6.E8 || i15 == y6.F8 || i15 == (i11 = y6.I5)) {
                sparseIntArray.put(i15, y6.w0(i15, u6Var));
            } else if (i15 == y6.Ii) {
                sparseIntArray.put(i15, i0.a.f(0.5f, i10, i14));
            } else if (i15 == y6.u8 || i15 == i11) {
                sparseIntArray.put(i15, o10);
            } else {
                sparseIntArray.put(i15, i14);
            }
            i12++;
        }
    }
}
