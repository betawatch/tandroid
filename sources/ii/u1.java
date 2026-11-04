package ii;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u1 {
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();
    public final int[] c = {k6.G6, k6.u8, k6.G8, k6.E8, k6.F8, k6.I5, k6.wj};
    public float d;

    public final int a(int i3) {
        return i0.a.f(this.d, this.a.get(i3), this.b.get(i3));
    }

    public final void b(org.telegram.ui.ActionBar.k kVar, float f10) {
        this.d = f10;
        int i3 = k6.G6;
        kVar.setTitleColor(a(i3));
        kVar.setSubtitleColor(k6.r1(0.45f, a(i3)));
        kVar.D(a(i3), false);
        ImageView imageView = kVar.e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i3), PorterDuff.Mode.SRC_IN));
        }
        kVar.C(a(k6.u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i3, e6 e6Var) {
        int i10;
        int[] iArr = this.c;
        int i11 = 0;
        if (i3 == 0) {
            while (i11 < iArr.length) {
                int i12 = iArr[i11];
                sparseIntArray.put(i12, k6.w0(i12, e6Var));
                i11++;
            }
            return;
        }
        int i13 = i0.a.h(i3) < 0.5d ? -1 : -16777216;
        int o10 = i0.a.o(i13, 60);
        while (i11 < iArr.length) {
            int i14 = iArr[i11];
            if (i14 == k6.G8 || i14 == k6.E8 || i14 == k6.F8 || i14 == (i10 = k6.I5)) {
                sparseIntArray.put(i14, k6.w0(i14, e6Var));
            } else if (i14 == k6.wj) {
                sparseIntArray.put(i14, i0.a.f(0.5f, i3, i13));
            } else if (i14 == k6.u8 || i14 == i10) {
                sparseIntArray.put(i14, o10);
            } else {
                sparseIntArray.put(i14, i13);
            }
            i11++;
        }
    }
}
