package hi;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class t1 {
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();
    public final int[] c = {m6.G6, m6.u8, m6.G8, m6.E8, m6.F8, m6.I5, m6.wj};
    public float d;

    public final int a(int i7) {
        return i0.a.f(this.d, this.a.get(i7), this.b.get(i7));
    }

    public final void b(org.telegram.ui.ActionBar.l lVar, float f10) {
        this.d = f10;
        int i7 = m6.G6;
        lVar.setTitleColor(a(i7));
        lVar.setSubtitleColor(m6.r1(0.45f, a(i7)));
        lVar.G(a(i7), false);
        ImageView imageView = lVar.e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i7), PorterDuff.Mode.SRC_IN));
        }
        lVar.E(a(m6.u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i7, h6 h6Var) {
        int i10;
        int[] iArr = this.c;
        int i11 = 0;
        if (i7 == 0) {
            while (i11 < iArr.length) {
                int i12 = iArr[i11];
                sparseIntArray.put(i12, m6.w0(i12, h6Var));
                i11++;
            }
            return;
        }
        int i13 = i0.a.h(i7) < 0.5d ? -1 : -16777216;
        int o4 = i0.a.o(i13, 60);
        while (i11 < iArr.length) {
            int i14 = iArr[i11];
            if (i14 == m6.G8 || i14 == m6.E8 || i14 == m6.F8 || i14 == (i10 = m6.I5)) {
                sparseIntArray.put(i14, m6.w0(i14, h6Var));
            } else if (i14 == m6.wj) {
                sparseIntArray.put(i14, i0.a.f(0.5f, i7, i13));
            } else if (i14 == m6.u8 || i14 == i10) {
                sparseIntArray.put(i14, o4);
            } else {
                sparseIntArray.put(i14, i13);
            }
            i11++;
        }
    }
}
