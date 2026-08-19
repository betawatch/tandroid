package j$.time.format;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class e implements f {
    public final f[] a;
    public final boolean b;

    public e(ArrayList arrayList, boolean z) {
        this((f[]) arrayList.toArray(new f[arrayList.size()]), z);
    }

    public e(f[] fVarArr, boolean z) {
        this.a = fVarArr;
        this.b = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r2 != false) goto L11;
     */
    @Override // j$.time.format.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(r rVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            rVar.c++;
        }
        try {
            for (f fVar : this.a) {
                if (!fVar.l(rVar, sb)) {
                    sb.setLength(length);
                }
            }
        } finally {
            if (z) {
                rVar.c--;
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
