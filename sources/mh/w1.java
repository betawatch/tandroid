package mh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class w1 {
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();
    public final int[] c = {f6.G6, f6.u8, f6.G8, f6.E8, f6.F8, f6.I5, f6.Ii};
    public float d;

    public final int a(int i9) {
        return i0.a.d(this.d, this.a.get(i9), this.b.get(i9));
    }

    public final void b(org.telegram.ui.ActionBar.k kVar, float f10) {
        this.d = f10;
        int i9 = f6.G6;
        kVar.setTitleColor(a(i9));
        kVar.setSubtitleColor(f6.l1(0.45f, a(i9)));
        kVar.C(a(i9), false);
        ImageView imageView = kVar.e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i9), PorterDuff.Mode.SRC_IN));
        }
        kVar.A(a(f6.u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i9, b6 b6Var) {
        int i10;
        int[] iArr = this.c;
        int i11 = 0;
        if (i9 == 0) {
            while (i11 < iArr.length) {
                int i12 = iArr[i11];
                sparseIntArray.put(i12, f6.v0(i12, b6Var));
                i11++;
            }
            return;
        }
        int i13 = i0.a.f(i9) < 0.5d ? -1 : -16777216;
        int k10 = i0.a.k(i13, 60);
        while (i11 < iArr.length) {
            int i14 = iArr[i11];
            if (i14 == f6.G8 || i14 == f6.E8 || i14 == f6.F8 || i14 == (i10 = f6.I5)) {
                sparseIntArray.put(i14, f6.v0(i14, b6Var));
            } else if (i14 == f6.Ii) {
                sparseIntArray.put(i14, i0.a.d(0.5f, i9, i13));
            } else if (i14 == f6.u8 || i14 == i10) {
                sparseIntArray.put(i14, k10);
            } else {
                sparseIntArray.put(i14, i13);
            }
            i11++;
        }
    }
}
