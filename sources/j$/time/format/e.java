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
    public e(List list, boolean z4) {
        this((f[]) r2.toArray(new f[r2.size()]), z4);
        ArrayList arrayList = (ArrayList) list;
    }

    public e(f[] fVarArr, boolean z4) {
        this.a = fVarArr;
        this.b = z4;
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
    public final boolean j(r rVar, StringBuilder sb) {
        int length = sb.length();
        boolean z4 = this.b;
        if (z4) {
            rVar.c++;
        }
        try {
            for (f fVar : this.a) {
                if (!fVar.j(rVar, sb)) {
                    sb.setLength(length);
                }
            }
        } finally {
            if (z4) {
                rVar.c--;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        f[] fVarArr = this.a;
        if (fVarArr != null) {
            boolean z4 = this.b;
            sb.append(z4 ? "[" : "(");
            for (f fVar : fVarArr) {
                sb.append(fVar);
            }
            sb.append(z4 ? "]" : ")");
        }
        return sb.toString();
    }
}
