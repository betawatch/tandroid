package cc;

import android.support.v4.media.session.a0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e {
    public final ac.f a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ a0 e;

    public e(a0 a0Var, ac.f fVar, int i10, int i11, int i12) {
        this.e = a0Var;
        this.a = fVar;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public final int a() {
        ac.f fVar = this.a;
        ac.f fVar2 = ac.f.h;
        int i10 = this.d;
        if (fVar != fVar2) {
            return i10;
        }
        ac.a aVar = (ac.a) this.e.c;
        wb.d dVar = (wb.d) aVar.c;
        String str = (String) aVar.b;
        int i11 = this.b;
        return str.substring(i11, i10 + i11).getBytes(dVar.a[this.c].charset()).length;
    }

    public final String toString() {
        ac.a aVar = (ac.a) this.e.c;
        StringBuilder sb2 = new StringBuilder();
        ac.f fVar = this.a;
        sb2.append(fVar);
        sb2.append('(');
        if (fVar == ac.f.n) {
            wb.d dVar = (wb.d) aVar.c;
            sb2.append(dVar.a[this.c].charset().displayName());
        } else {
            String str = (String) aVar.b;
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
