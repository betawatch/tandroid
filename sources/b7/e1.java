package b7;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e1 extends h1 {
    public final int a;
    public final u b;

    public e1(u uVar) {
        uVar.getClass();
        this.b = uVar;
        g0 p10 = uVar.entrySet().p();
        int i10 = 0;
        while (p10.hasNext()) {
            Map.Entry entry = (Map.Entry) p10.next();
            int a2 = ((h1) entry.getKey()).a();
            i10 = i10 < a2 ? a2 : i10;
            int a10 = ((h1) entry.getValue()).a();
            if (i10 < a10) {
                i10 = a10;
            }
        }
        int i11 = i10 + 1;
        this.a = i11;
        if (i11 > 8) {
            throw new y0("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // b7.h1
    public final int a() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compareTo;
        h1 h1Var = (h1) obj;
        int zza = h1Var.zza();
        int c3 = h1.c((byte) -96);
        if (c3 != zza) {
            return c3 - h1Var.zza();
        }
        u uVar = ((e1) h1Var).b;
        u uVar2 = this.b;
        if (uVar2.d.size() != uVar.d.size()) {
            return uVar2.d.size() - uVar.d.size();
        }
        g0 p10 = uVar2.entrySet().p();
        g0 p11 = uVar.entrySet().p();
        do {
            if (!p10.hasNext() && !p11.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) p10.next();
            Map.Entry entry2 = (Map.Entry) p11.next();
            int compareTo2 = ((h1) entry.getKey()).compareTo((h1) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((h1) entry.getValue()).compareTo((h1) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            return this.b.equals(((e1) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(h1.c((byte) -96)), this.b});
    }

    public final String toString() {
        u uVar = this.b;
        if (uVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        g0 p10 = uVar.entrySet().p();
        while (p10.hasNext()) {
            Map.Entry entry = (Map.Entry) p10.next();
            linkedHashMap.put(((h1) entry.getKey()).toString().replace("\n", "\n  "), ((h1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        h7.u uVar2 = new h7.u(3);
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            b.g(sb, linkedHashMap.entrySet().iterator(), uVar2);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // b7.h1
    public final int zza() {
        return h1.c((byte) -96);
    }
}
