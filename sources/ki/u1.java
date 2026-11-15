package ki;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class u1 {
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();
    public final int[] c = {j6.G6, j6.u8, j6.G8, j6.E8, j6.F8, j6.I5, j6.zj};
    public float d;

    public final int a(int i7) {
        return i0.a.f(this.d, this.a.get(i7), this.b.get(i7));
    }

    public final void b(org.telegram.ui.ActionBar.k kVar, float f10) {
        this.d = f10;
        int i7 = j6.G6;
        kVar.setTitleColor(a(i7));
        kVar.setSubtitleColor(j6.r1(0.45f, a(i7)));
        kVar.H(a(i7), false);
        ImageView imageView = kVar.e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i7), PorterDuff.Mode.SRC_IN));
        }
        kVar.F(a(j6.u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i7, e6 e6Var) {
        int i10;
        int[] iArr = this.c;
        int i11 = 0;
        if (i7 == 0) {
            while (i11 < iArr.length) {
                int i12 = iArr[i11];
                sparseIntArray.put(i12, j6.w0(i12, e6Var));
                i11++;
            }
            return;
        }
        int i13 = i0.a.h(i7) < 0.5d ? -1 : -16777216;
        int o4 = i0.a.o(i13, 60);
        while (i11 < iArr.length) {
            int i14 = iArr[i11];
            if (i14 == j6.G8 || i14 == j6.E8 || i14 == j6.F8 || i14 == (i10 = j6.I5)) {
                sparseIntArray.put(i14, j6.w0(i14, e6Var));
            } else if (i14 == j6.zj) {
                sparseIntArray.put(i14, i0.a.f(0.5f, i7, i13));
            } else if (i14 == j6.u8 || i14 == i10) {
                sparseIntArray.put(i14, o4);
            } else {
                sparseIntArray.put(i14, i13);
            }
            i11++;
        }
    }
}
