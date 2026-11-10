package ic;

import ab.q;
import cc.f;
import h6.m;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class e {
    public final gc.d a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ m e;

    public e(m mVar, gc.d dVar, int i7, int i10, int i11) {
        this.e = mVar;
        this.a = dVar;
        this.b = i7;
        this.c = i10;
        this.d = i11;
    }

    public final int a() {
        gc.d dVar = this.a;
        gc.d dVar2 = gc.d.h;
        int i7 = this.d;
        if (dVar != dVar2) {
            return i7;
        }
        q qVar = (q) this.e.d;
        f fVar = (f) qVar.c;
        String str = (String) qVar.b;
        int i10 = this.b;
        return str.substring(i10, i7 + i10).getBytes(fVar.a[this.c].charset()).length;
    }

    public final String toString() {
        q qVar = (q) this.e.d;
        StringBuilder sb2 = new StringBuilder();
        gc.d dVar = this.a;
        sb2.append(dVar);
        sb2.append('(');
        if (dVar == gc.d.n) {
            f fVar = (f) qVar.c;
            sb2.append(fVar.a[this.c].charset().displayName());
        } else {
            String str = (String) qVar.b;
            int i7 = this.d;
            int i10 = this.b;
            String substring = str.substring(i10, i7 + i10);
            StringBuilder sb3 = new StringBuilder();
            for (int i11 = 0; i11 < substring.length(); i11++) {
                if (substring.charAt(i11) < ' ' || substring.charAt(i11) > '~') {
                    sb3.append('.');
                } else {
                    sb3.append(substring.charAt(i11));
                }
            }
            sb2.append(sb3.toString());
        }
        sb2.append(')');
        return sb2.toString();
    }
}
