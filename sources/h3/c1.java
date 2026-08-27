package h3;

import android.net.Uri;
import g7.p7;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c1 {
    public final Uri a;
    public final List b;
    public final p8.z c;

    public c1(Uri uri, p7 p7Var, List list, p8.z zVar) {
        this.a = uri;
        this.b = list;
        this.c = zVar;
        p8.x xVar = p8.z.b;
        p8.l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < zVar.size()) {
            ((e1) zVar.get(i10)).getClass();
            e1 e1Var = new e1();
            int i12 = i11 + 1;
            if (objArr.length < i12) {
                objArr = Arrays.copyOf(objArr, p8.w.d(objArr.length, i12));
            }
            objArr[i11] = e1Var;
            i10++;
            i11 = i12;
        }
        p8.z.s(i11, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        if (!this.a.equals(c1Var.a)) {
            return false;
        }
        int i10 = d5.g0.a;
        return d5.g0.a(null, null) && this.b.equals(c1Var.b) && this.c.equals(c1Var.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 923521)) * 961)) * 31;
    }
}
