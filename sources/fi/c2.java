package fi;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class c2 {
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();
    public final int[] c = {j6.G6, j6.u8, j6.G8, j6.E8, j6.F8, j6.I5, j6.Ii};
    public float d;

    public final int a(int i10) {
        return i0.a.d(this.d, this.a.get(i10), this.b.get(i10));
    }

    public final void b(org.telegram.ui.ActionBar.k kVar, float f7) {
        this.d = f7;
        int i10 = j6.G6;
        kVar.setTitleColor(a(i10));
        kVar.setSubtitleColor(j6.l1(0.45f, a(i10)));
        kVar.C(a(i10), false);
        ImageView imageView = kVar.e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i10), PorterDuff.Mode.SRC_IN));
        }
        kVar.B(a(j6.u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i10, f6 f6Var) {
        int i11;
        int[] iArr = this.c;
        int i12 = 0;
        if (i10 == 0) {
            while (i12 < iArr.length) {
                int i13 = iArr[i12];
                sparseIntArray.put(i13, j6.v0(i13, f6Var));
                i12++;
            }
            return;
        }
        int i14 = i0.a.f(i10) < 0.5d ? -1 : -16777216;
        int k10 = i0.a.k(i14, 60);
        while (i12 < iArr.length) {
            int i15 = iArr[i12];
            if (i15 == j6.G8 || i15 == j6.E8 || i15 == j6.F8 || i15 == (i11 = j6.I5)) {
                sparseIntArray.put(i15, j6.v0(i15, f6Var));
            } else if (i15 == j6.Ii) {
                sparseIntArray.put(i15, i0.a.d(0.5f, i10, i14));
            } else if (i15 == j6.u8 || i15 == i11) {
                sparseIntArray.put(i15, k10);
            } else {
                sparseIntArray.put(i15, i14);
            }
            i12++;
        }
    }
}
