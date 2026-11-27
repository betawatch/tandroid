package j$.time.format;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class e implements f {
    public final f[] a;
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(List list, boolean z) {
        this((f[]) r2.toArray(new f[r2.size()]), z);
        ArrayList arrayList = (ArrayList) list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r8.setLength(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r2 == false) goto L15;
     */
    @Override // j$.time.format.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(r rVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            rVar.c++;
        }
        try {
            f[] fVarArr = this.a;
            int length2 = fVarArr.length;
            int i = 0;
            while (true) {
                if (i < length2) {
                    if (!fVarArr[i].j(rVar, sb)) {
                        break;
                    }
                    i++;
                }
            }
            return true;
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

    public e(f[] fVarArr, boolean z) {
        this.a = fVarArr;
        this.b = z;
    }
}
