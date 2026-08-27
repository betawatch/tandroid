package j$.time.format;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class e implements f {
    public final f[] a;
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(List list, boolean z10) {
        this((f[]) r2.toArray(new f[r2.size()]), z10);
        ArrayList arrayList = (ArrayList) list;
    }

    public e(f[] fVarArr, boolean z10) {
        this.a = fVarArr;
        this.b = z10;
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
    public final boolean j(r rVar, StringBuilder sb2) {
        int length = sb2.length();
        boolean z10 = this.b;
        if (z10) {
            rVar.c++;
        }
        try {
            for (f fVar : this.a) {
                if (!fVar.j(rVar, sb2)) {
                    sb2.setLength(length);
                }
            }
        } finally {
            if (z10) {
                rVar.c--;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        f[] fVarArr = this.a;
        if (fVarArr != null) {
            boolean z10 = this.b;
            sb2.append(z10 ? "[" : "(");
            for (f fVar : fVarArr) {
                sb2.append(fVar);
            }
            sb2.append(z10 ? "]" : ")");
        }
        return sb2.toString();
    }
}
