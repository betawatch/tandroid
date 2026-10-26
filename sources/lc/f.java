package lc;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class f {
    public final jc.e a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ k6.c e;

    public f(k6.c cVar, jc.e eVar, int i10, int i11, int i12) {
        this.e = cVar;
        this.a = eVar;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public final int a() {
        jc.e eVar = this.a;
        jc.e eVar2 = jc.e.h;
        int i10 = this.d;
        if (eVar != eVar2) {
            return i10;
        }
        c2.b bVar = (c2.b) this.e.d;
        fc.d dVar = (fc.d) bVar.c;
        String str = (String) bVar.b;
        int i11 = this.b;
        return str.substring(i11, i10 + i11).getBytes(dVar.a[this.c].charset()).length;
    }

    public final String toString() {
        c2.b bVar = (c2.b) this.e.d;
        StringBuilder sb2 = new StringBuilder();
        jc.e eVar = this.a;
        sb2.append(eVar);
        sb2.append('(');
        if (eVar == jc.e.n) {
            fc.d dVar = (fc.d) bVar.c;
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
