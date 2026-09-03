package b7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class z0 extends h1 {
    public final o a;
    public final int b;

    public z0(a0 a0Var) {
        a0Var.getClass();
        this.a = a0Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            o oVar = this.a;
            if (i10 >= oVar.size()) {
                break;
            }
            int a2 = ((h1) oVar.get(i10)).a();
            if (i11 < a2) {
                i11 = a2;
            }
            i10++;
        }
        int i12 = i11 + 1;
        this.b = i12;
        if (i12 > 8) {
            throw new y0("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // b7.h1
    public final int a() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        h1 h1Var = (h1) obj;
        int zza = h1Var.zza();
        int c3 = h1.c(Byte.MIN_VALUE);
        if (c3 != zza) {
            return c3 - h1Var.zza();
        }
        o oVar = ((z0) h1Var).a;
        o oVar2 = this.a;
        if (oVar2.size() != oVar.size()) {
            return oVar2.size() - oVar.size();
        }
        for (int i10 = 0; i10 < oVar2.size(); i10++) {
            int compareTo = ((h1) oVar2.get(i10)).compareTo((h1) oVar.get(i10));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z0.class == obj.getClass()) {
            return this.a.equals(((z0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(h1.c(Byte.MIN_VALUE)), this.a});
    }

    public final String toString() {
        o oVar = this.a;
        if (oVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = oVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((h1) oVar.get(i10)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb.append(db.a.W3(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ",\n  ");
                    sb.append(db.a.W3(it.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // b7.h1
    public final int zza() {
        return h1.c(Byte.MIN_VALUE);
    }
}
