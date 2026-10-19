package gi;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class w1 {
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();
    public final int[] c = {h6.G6, h6.u8, h6.G8, h6.E8, h6.F8, h6.I5, h6.Ii};
    public float d;

    public final int a(int i10) {
        return i0.a.f(this.d, this.a.get(i10), this.b.get(i10));
    }

    public final void b(org.telegram.ui.ActionBar.k kVar, float f7) {
        this.d = f7;
        int i10 = h6.G6;
        kVar.setTitleColor(a(i10));
        kVar.setSubtitleColor(h6.m1(0.45f, a(i10)));
        kVar.C(a(i10), false);
        ImageView imageView = kVar.e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i10), PorterDuff.Mode.SRC_IN));
        }
        kVar.B(a(h6.u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i10, d6 d6Var) {
        int i11;
        int[] iArr = this.c;
        int i12 = 0;
        if (i10 == 0) {
            while (i12 < iArr.length) {
                int i13 = iArr[i12];
                sparseIntArray.put(i13, h6.w0(i13, d6Var));
                i12++;
            }
            return;
        }
        int i14 = i0.a.h(i10) < 0.5d ? -1 : -16777216;
        int o10 = i0.a.o(i14, 60);
        while (i12 < iArr.length) {
            int i15 = iArr[i12];
            if (i15 == h6.G8 || i15 == h6.E8 || i15 == h6.F8 || i15 == (i11 = h6.I5)) {
                sparseIntArray.put(i15, h6.w0(i15, d6Var));
            } else if (i15 == h6.Ii) {
                sparseIntArray.put(i15, i0.a.f(0.5f, i10, i14));
            } else if (i15 == h6.u8 || i15 == i11) {
                sparseIntArray.put(i15, o10);
            } else {
                sparseIntArray.put(i15, i14);
            }
            i12++;
        }
    }
}
