package kc;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class f {
    public final ic.e a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ androidx.biometric.e e;

    public f(androidx.biometric.e eVar, ic.e eVar2, int i10, int i11, int i12) {
        this.e = eVar;
        this.a = eVar2;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public final int a() {
        ic.e eVar = this.a;
        ic.e eVar2 = ic.e.h;
        int i10 = this.d;
        if (eVar != eVar2) {
            return i10;
        }
        c2.b bVar = (c2.b) this.e.d;
        ec.d dVar = (ec.d) bVar.c;
        String str = (String) bVar.b;
        int i11 = this.b;
        return str.substring(i11, i10 + i11).getBytes(dVar.a[this.c].charset()).length;
    }

    public final String toString() {
        c2.b bVar = (c2.b) this.e.d;
        StringBuilder sb2 = new StringBuilder();
        ic.e eVar = this.a;
        sb2.append(eVar);
        sb2.append('(');
        if (eVar == ic.e.n) {
            ec.d dVar = (ec.d) bVar.c;
            sb2.append(dVar.a[this.c].charset().displayName());
        } else {
            String str = (String) bVar.b;
            int i10 = this.d;
            int i11 = this.b;
            String substring = str.substring(i11, i10 + i11);
            StringBuilder sb3 = new StringBuilder();
            for (int i12 = 0; i12 < substring.length(); i12++) {
                if (substring.charAt(i12) < ' ' || substring.charAt(i12) > '~') {
                    sb3.append('.');
                } else {
                    sb3.append(substring.charAt(i12));
                }
            }
            sb2.append(sb3.toString());
        }
        sb2.append(')');
        return sb2.toString();
    }
}
