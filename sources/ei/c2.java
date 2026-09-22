package ei;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class c2 {
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();
    public final int[] c = {i6.G6, i6.u8, i6.G8, i6.E8, i6.F8, i6.I5, i6.Ii};
    public float d;

    public final int a(int i10) {
        return i0.a.d(this.d, this.a.get(i10), this.b.get(i10));
    }

    public final void b(org.telegram.ui.ActionBar.k kVar, float f7) {
        this.d = f7;
        int i10 = i6.G6;
        kVar.setTitleColor(a(i10));
        kVar.setSubtitleColor(i6.l1(0.45f, a(i10)));
        kVar.B(a(i10), false);
        ImageView imageView = kVar.e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i10), PorterDuff.Mode.SRC_IN));
        }
        kVar.A(a(i6.u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i10, e6 e6Var) {
        int i11;
        int[] iArr = this.c;
        int i12 = 0;
        if (i10 == 0) {
            while (i12 < iArr.length) {
                int i13 = iArr[i12];
                sparseIntArray.put(i13, i6.v0(i13, e6Var));
                i12++;
            }
            return;
        }
        int i14 = i0.a.f(i10) < 0.5d ? -1 : -16777216;
        int k10 = i0.a.k(i14, 60);
        while (i12 < iArr.length) {
            int i15 = iArr[i12];
            if (i15 == i6.G8 || i15 == i6.E8 || i15 == i6.F8 || i15 == (i11 = i6.I5)) {
                sparseIntArray.put(i15, i6.v0(i15, e6Var));
            } else if (i15 == i6.Ii) {
                sparseIntArray.put(i15, i0.a.d(0.5f, i10, i14));
            } else if (i15 == i6.u8 || i15 == i11) {
                sparseIntArray.put(i15, k10);
            } else {
                sparseIntArray.put(i15, i14);
            }
            i12++;
        }
    }
}
