package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public abstract class a {
    public final DataHolder a;
    public final int b;
    public final int c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.n) {
            z10 = true;
        }
        l.k(z10);
        this.b = i10;
        this.c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.b), Integer.valueOf(this.b)) && l.l(Integer.valueOf(aVar.c), Integer.valueOf(this.c)) && aVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }
}
