package kc;

import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements Map.Entry, Cloneable {
    public String a;
    public String b;
    public c c;

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            String str = aVar.a;
            String str2 = this.a;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.b;
            String str4 = aVar.b;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        c cVar = this.c;
        String str3 = this.a;
        int i9 = cVar.i(str3);
        String str4 = "";
        if (i9 != -1 && (str = cVar.c[i9]) != null) {
            str4 = str;
        }
        int i10 = cVar.i(str3);
        if (i10 != -1) {
            cVar.c[i10] = str2;
        }
        this.b = str2;
        return str4;
    }
}
