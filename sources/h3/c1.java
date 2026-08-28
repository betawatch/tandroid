package h3;

import android.net.Uri;
import f7.u7;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c1 {
    public final Uri a;
    public final String b;
    public final List c;
    public final String d;
    public final o8.z e;
    public final Object f;

    public c1(Uri uri, String str, u7 u7Var, List list, String str2, o8.z zVar, Object obj) {
        this.a = uri;
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = zVar;
        o8.x xVar = o8.z.b;
        o8.l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i9 = 0;
        int i10 = 0;
        while (i9 < zVar.size()) {
            ((e1) zVar.get(i9)).getClass();
            e1 e1Var = new e1();
            int i11 = i10 + 1;
            if (objArr.length < i11) {
                objArr = Arrays.copyOf(objArr, o8.w.d(objArr.length, i11));
            }
            objArr[i10] = e1Var;
            i9++;
            i10 = i11;
        }
        o8.z.s(i10, objArr);
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
        return this.a.equals(c1Var.a) && d5.f0.a(this.b, c1Var.b) && d5.f0.a(null, null) && this.c.equals(c1Var.c) && d5.f0.a(this.d, c1Var.d) && this.e.equals(c1Var.e) && d5.f0.a(this.f, c1Var.f);
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
