package j3;

import android.net.Uri;
import h7.n8;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c1 {
    public final Uri a;
    public final String b;
    public final List c;
    public final String d;
    public final q8.z e;
    public final Object f;

    public c1(Uri uri, String str, n8 n8Var, List list, String str2, q8.z zVar, Object obj) {
        this.a = uri;
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = zVar;
        q8.x xVar = q8.z.b;
        q8.l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < zVar.size()) {
            ((e1) zVar.get(i10)).getClass();
            e1 e1Var = new e1();
            int i12 = i11 + 1;
            if (objArr.length < i12) {
                objArr = Arrays.copyOf(objArr, q8.w.d(objArr.length, i12));
            }
            objArr[i11] = e1Var;
            i10++;
            i11 = i12;
        }
        q8.z.s(i11, objArr);
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.a.equals(c1Var.a) && f5.d0.a(this.b, c1Var.b) && f5.d0.a(null, null) && this.c.equals(c1Var.c) && f5.d0.a(this.d, c1Var.d) && this.e.equals(c1Var.e) && f5.d0.a(this.f, c1Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 31;
        String str2 = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Object obj = this.f;
        return hashCode3 + (obj != null ? obj.hashCode() : 0);
    }
}
