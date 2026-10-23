package gi;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class w1 {
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();
    public final int[] c = {k6.G6, k6.u8, k6.G8, k6.E8, k6.F8, k6.I5, k6.Ii};
    public float d;

    public final int a(int i10) {
        return i0.a.f(this.d, this.a.get(i10), this.b.get(i10));
    }

    public final void b(org.telegram.ui.ActionBar.k kVar, float f7) {
        this.d = f7;
        int i10 = k6.G6;
        kVar.setTitleColor(a(i10));
        kVar.setSubtitleColor(k6.o1(0.45f, a(i10)));
        kVar.B(a(i10), false);
        ImageView imageView = kVar.e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i10), PorterDuff.Mode.SRC_IN));
        }
        kVar.A(a(k6.u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i10, g6 g6Var) {
        int i11;
        int[] iArr = this.c;
        int i12 = 0;
        if (i10 == 0) {
            while (i12 < iArr.length) {
                int i13 = iArr[i12];
                sparseIntArray.put(i13, k6.w0(i13, g6Var));
                i12++;
            }
            return;
        }
        int i14 = i0.a.h(i10) < 0.5d ? -1 : -16777216;
        int o10 = i0.a.o(i14, 60);
        while (i12 < iArr.length) {
            int i15 = iArr[i12];
            if (i15 == k6.G8 || i15 == k6.E8 || i15 == k6.F8 || i15 == (i11 = k6.I5)) {
                sparseIntArray.put(i15, k6.w0(i15, g6Var));
            } else if (i15 == k6.Ii) {
                sparseIntArray.put(i15, i0.a.f(0.5f, i10, i14));
            } else if (i15 == k6.u8 || i15 == i11) {
                sparseIntArray.put(i15, o10);
            } else {
                sparseIntArray.put(i15, i14);
            }
            i12++;
        }
    }
}
