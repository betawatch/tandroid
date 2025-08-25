package j$.time.format;

import java.util.ArrayList;

/* loaded from: classes2.dex */
final class e implements f {
    private final f[] a;
    private final boolean b;

    e(ArrayList arrayList, boolean z) {
        this((f[]) arrayList.toArray(new f[arrayList.size()]), z);
    }

    e(f[] fVarArr, boolean z) {
        this.a = fVarArr;
        this.b = z;
    }

    public final e a() {
        return !this.b ? this : new e(this.a, false);
    }

    @Override // j$.time.format.f
    public final boolean i(r rVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            rVar.g();
        }
        try {
            for (f fVar : this.a) {
                if (!fVar.i(rVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (z) {
                rVar.a();
            }
            return true;
        } finally {
            if (z) {
                rVar.a();
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        f[] fVarArr = this.a;
        if (fVarArr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : "(");
            for (f fVar : fVarArr) {
                sb.append(fVar);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }
}
