package mi;

import android.graphics.RectF;
import hg.c;
import java.util.ArrayList;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class a {
    public final ArrayList a = new ArrayList();
    public int b;

    public final RectF a(float f7, float f10, float f11, float f12) {
        RectF rectF;
        int i10 = this.b;
        ArrayList arrayList = this.a;
        if (i10 < arrayList.size()) {
            rectF = (RectF) arrayList.get(this.b);
            rectF.set(f7, f10, f11, f12);
        } else {
            rectF = new RectF(f7, f10, f11, f12);
            arrayList.add(rectF);
        }
        this.b++;
        return rectF;
    }

    public final RectF b(int i10) {
        if (i10 >= 0 && i10 < this.b) {
            return (RectF) this.a.get(i10);
        }
        StringBuilder j3 = c.j(i10, "index=", ", size=");
        j3.append(this.b);
        throw new IndexOutOfBoundsException(j3.toString());
    }

    public final void c(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.b)) {
            StringBuilder j3 = c.j(i10, "index=", ", size=");
            j3.append(this.b);
            throw new IndexOutOfBoundsException(j3.toString());
        }
        int i12 = i11 - 1;
        ArrayList arrayList = this.a;
        RectF rectF = (RectF) arrayList.get(i10);
        if (i10 != i12) {
            arrayList.set(i10, (RectF) arrayList.get(i12));
            arrayList.set(i12, rectF);
        }
        this.b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.b != aVar.b) {
            return false;
        }
        for (int i10 = 0; i10 < this.b; i10++) {
            if (!((RectF) this.a.get(i10)).equals(aVar.a.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.b; i11++) {
            i10 = (i10 * 31) + ((RectF) this.a.get(i11)).hashCode();
        }
        return i10;
    }
}
