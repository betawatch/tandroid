package n7;

import com.google.android.gms.internal.cast.z4;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class a1 extends d1 {
    public final int a;
    public final s b;

    public a1(s sVar) {
        sVar.getClass();
        this.b = sVar;
        e0 o10 = sVar.entrySet().o();
        int i10 = 0;
        while (o10.hasNext()) {
            Map.Entry entry = (Map.Entry) o10.next();
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
            throw new z4("Exceeded cutoff limit for max depth of cbor value");
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
        s sVar = ((a1) d1Var).b;
        s sVar2 = this.b;
        if (sVar2.d.size() != sVar.d.size()) {
            return sVar2.d.size() - sVar.d.size();
        }
        e0 o10 = sVar2.entrySet().o();
        e0 o11 = sVar.entrySet().o();
        do {
            if (!o10.hasNext() && !o11.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) o10.next();
            Map.Entry entry2 = (Map.Entry) o11.next();
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
        s sVar = this.b;
        if (sVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e0 o10 = sVar.entrySet().o();
        while (o10.hasNext()) {
            Map.Entry entry = (Map.Entry) o10.next();
            linkedHashMap.put(((d1) entry.getKey()).toString().replace("\n", "\n  "), ((d1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        sb.a aVar = new sb.a(14);
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            a.g(sb2, linkedHashMap.entrySet().iterator(), aVar);
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // n7.d1
    public final int zza() {
        return d1.c((byte) -96);
    }
}
