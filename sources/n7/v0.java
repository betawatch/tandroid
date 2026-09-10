package n7;

import com.google.android.gms.internal.cast.b5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class v0 extends e1 {
    public final n a;
    public final int b;

    public v0(y yVar) {
        yVar.getClass();
        this.a = yVar;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            n nVar = this.a;
            if (i10 >= nVar.size()) {
                break;
            }
            int a2 = ((e1) nVar.get(i10)).a();
            if (i11 < a2) {
                i11 = a2;
            }
            i10++;
        }
        int i12 = i11 + 1;
        this.b = i12;
        if (i12 > 8) {
            throw new b5("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // n7.e1
    public final int a() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        int zza = e1Var.zza();
        int c10 = e1.c(Byte.MIN_VALUE);
        if (c10 != zza) {
            return c10 - e1Var.zza();
        }
        n nVar = ((v0) e1Var).a;
        n nVar2 = this.a;
        if (nVar2.size() != nVar.size()) {
            return nVar2.size() - nVar.size();
        }
        for (int i10 = 0; i10 < nVar2.size(); i10++) {
            int compareTo = ((e1) nVar2.get(i10)).compareTo((e1) nVar.get(i10));
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
        if (obj != null && v0.class == obj.getClass()) {
            return this.a.equals(((v0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(e1.c(Byte.MIN_VALUE)), this.a});
    }

    public final String toString() {
        n nVar = this.a;
        if (nVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = nVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((e1) nVar.get(i10)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb2 = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb2.append(na.d.I3(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ",\n  ");
                    sb2.append(na.d.I3(it.next()));
                }
            }
            sb2.append("\n]");
            return sb2.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // n7.e1
    public final int zza() {
        return e1.c(Byte.MIN_VALUE);
    }
}
