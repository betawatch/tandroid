package hi;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class t1 {
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();
    public final int[] c = {l6.G6, l6.u8, l6.G8, l6.E8, l6.F8, l6.I5, l6.wj};
    public float d;

    public final int a(int i7) {
        return i0.a.f(this.d, this.a.get(i7), this.b.get(i7));
    }

    public final void b(org.telegram.ui.ActionBar.k kVar, float f10) {
        this.d = f10;
        int i7 = l6.G6;
        kVar.setTitleColor(a(i7));
        kVar.setSubtitleColor(l6.r1(0.45f, a(i7)));
        kVar.E(a(i7), false);
        ImageView imageView = kVar.e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i7), PorterDuff.Mode.SRC_IN));
        }
        kVar.D(a(l6.u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i7, g6 g6Var) {
        int i10;
        int[] iArr = this.c;
        int i11 = 0;
        if (i7 == 0) {
            while (i11 < iArr.length) {
                int i12 = iArr[i11];
                sparseIntArray.put(i12, l6.w0(i12, g6Var));
                i11++;
            }
            return;
        }
        int i13 = i0.a.h(i7) < 0.5d ? -1 : -16777216;
        int o4 = i0.a.o(i13, 60);
        while (i11 < iArr.length) {
            int i14 = iArr[i11];
            if (i14 == l6.G8 || i14 == l6.E8 || i14 == l6.F8 || i14 == (i10 = l6.I5)) {
                sparseIntArray.put(i14, l6.w0(i14, g6Var));
            } else if (i14 == l6.wj) {
                sparseIntArray.put(i14, i0.a.f(0.5f, i7, i13));
            } else if (i14 == l6.u8 || i14 == i10) {
                sparseIntArray.put(i14, o4);
            } else {
                sparseIntArray.put(i14, i13);
            }
            i11++;
        }
    }
}
