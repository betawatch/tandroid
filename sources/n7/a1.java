package n7;

import com.google.android.gms.internal.cast.b5;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class a1 extends d1 {
    public final int a;
    public final r b;

    public a1(r rVar) {
        rVar.getClass();
        this.b = rVar;
        d0 p5 = rVar.entrySet().p();
        int i10 = 0;
        while (p5.hasNext()) {
            Map.Entry entry = (Map.Entry) p5.next();
            int a2 = ((d1) entry.getKey()).a();
            i10 = i10 < a2 ? a2 : i10;
            int a10 = ((d1) entry.getValue()).a();
            if (i10 < a10) {
                i10 = a10;
            }
        }
        int i11 = i10 + 1;
        this.a = i11;
        if (i11 > 8) {
            throw new b5("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // n7.d1
    public final int a() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compareTo;
        d1 d1Var = (d1) obj;
        int zza = d1Var.zza();
        int c10 = d1.c((byte) -96);
        if (c10 != zza) {
            return c10 - d1Var.zza();
        }
        r rVar = ((a1) d1Var).b;
        r rVar2 = this.b;
        if (rVar2.d.size() != rVar.d.size()) {
            return rVar2.d.size() - rVar.d.size();
        }
        d0 p5 = rVar2.entrySet().p();
        d0 p10 = rVar.entrySet().p();
        do {
            if (!p5.hasNext() && !p10.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) p5.next();
            Map.Entry entry2 = (Map.Entry) p10.next();
            int compareTo2 = ((d1) entry.getKey()).compareTo((d1) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((d1) entry.getValue()).compareTo((d1) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            return this.b.equals(((a1) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d1.c((byte) -96)), this.b});
    }

    public final String toString() {
        r rVar = this.b;
        if (rVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d0 p5 = rVar.entrySet().p();
        while (p5.hasNext()) {
            Map.Entry entry = (Map.Entry) p5.next();
            linkedHashMap.put(((d1) entry.getKey()).toString().replace("\n", "\n  "), ((d1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        ob.a aVar = new ob.a(14);
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            a.g(sb2, linkedHashMap.entrySet().iterator(), aVar);
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // n7.d1
    public final int zza() {
        return d1.c((byte) -96);
    }
}
