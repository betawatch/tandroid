package n7;

import com.google.android.gms.internal.cast.b5;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class z0 extends c1 {
    public final int a;
    public final r b;

    public z0(r rVar) {
        rVar.getClass();
        this.b = rVar;
        d0 p5 = rVar.entrySet().p();
        int i10 = 0;
        while (p5.hasNext()) {
            Map.Entry entry = (Map.Entry) p5.next();
            int a2 = ((c1) entry.getKey()).a();
            i10 = i10 < a2 ? a2 : i10;
            int a10 = ((c1) entry.getValue()).a();
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

    @Override // n7.c1
    public final int a() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compareTo;
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c10 = c1.c((byte) -96);
        if (c10 != zza) {
            return c10 - c1Var.zza();
        }
        r rVar = ((z0) c1Var).b;
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
            int compareTo2 = ((c1) entry.getKey()).compareTo((c1) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((c1) entry.getValue()).compareTo((c1) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z0.class == obj.getClass()) {
            return this.b.equals(((z0) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) -96)), this.b});
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
            linkedHashMap.put(((c1) entry.getKey()).toString().replace("\n", "\n  "), ((c1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        na.d dVar = new na.d(14);
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            a.g(sb2, linkedHashMap.entrySet().iterator(), dVar);
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // n7.c1
    public final int zza() {
        return c1.c((byte) -96);
    }
}
