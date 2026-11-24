// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class iv0 {
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();
    public final int[] c = {bkb.F6, bkb.t8, bkb.F8, bkb.D8, bkb.E8, bkb.H5, bkb.yj};
    public float d;

    public final int a(int i) {
        return bm2.f(this.d, this.a.get(i), this.b.get(i));
    }

    public final void b(a aVar, float f) {
        this.d = f;
        int i = bkb.F6;
        aVar.setTitleColor(a(i));
        aVar.setSubtitleColor(bkb.p1(0.45f, a(i)));
        aVar.H(a(i), false);
        ImageView imageView = aVar.e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i), PorterDuff.Mode.SRC_IN));
        }
        aVar.G(a(bkb.t8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i, wjb wjbVar) {
        int i2;
        int[] iArr = this.c;
        int i3 = 0;
        if (i == 0) {
            while (i3 < iArr.length) {
                int i4 = iArr[i3];
                sparseIntArray.put(i4, bkb.v0(i4, wjbVar));
                i3++;
            }
            return;
        }
        int i5 = bm2.h(i) < 0.5d ? -1 : -16777216;
        int o = bm2.o(i5, 60);
        while (i3 < iArr.length) {
            int i6 = iArr[i3];
            if (i6 == bkb.F8 || i6 == bkb.D8 || i6 == bkb.E8 || i6 == (i2 = bkb.H5)) {
                sparseIntArray.put(i6, bkb.v0(i6, wjbVar));
            } else if (i6 == bkb.yj) {
                sparseIntArray.put(i6, bm2.f(0.5f, i, i5));
            } else if (i6 == bkb.t8 || i6 == i2) {
                sparseIntArray.put(i6, o);
            } else {
                sparseIntArray.put(i6, i5);
            }
            i3++;
        }
    }
}
