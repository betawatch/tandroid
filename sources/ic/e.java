package ic;

import ab.q;
import cc.f;
import h6.m;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class e {
    public final gc.e a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ m e;

    public e(m mVar, gc.e eVar, int i7, int i10, int i11) {
        this.e = mVar;
        this.a = eVar;
        this.b = i7;
        this.c = i10;
        this.d = i11;
    }

    public final int a() {
        gc.e eVar = this.a;
        gc.e eVar2 = gc.e.h;
        int i7 = this.d;
        if (eVar != eVar2) {
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
        gc.e eVar = this.a;
        sb2.append(eVar);
        sb2.append('(');
        if (eVar == gc.e.n) {
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
