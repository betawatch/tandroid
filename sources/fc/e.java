package fc;

import android.support.v4.media.session.a0;
import b4.n;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e {
    public final dc.d a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ a0 e;

    public e(a0 a0Var, dc.d dVar, int i3, int i10, int i11) {
        this.e = a0Var;
        this.a = dVar;
        this.b = i3;
        this.c = i10;
        this.d = i11;
    }

    public final int a() {
        dc.d dVar = this.a;
        dc.d dVar2 = dc.d.h;
        int i3 = this.d;
        if (dVar != dVar2) {
            return i3;
        }
        n nVar = (n) this.e.c;
        zb.d dVar3 = (zb.d) nVar.c;
        String str = (String) nVar.b;
        int i10 = this.b;
        return str.substring(i10, i3 + i10).getBytes(dVar3.a[this.c].charset()).length;
    }

    public final String toString() {
        n nVar = (n) this.e.c;
        StringBuilder sb2 = new StringBuilder();
        dc.d dVar = this.a;
        sb2.append(dVar);
        sb2.append('(');
        if (dVar == dc.d.n) {
            zb.d dVar2 = (zb.d) nVar.c;
            sb2.append(dVar2.a[this.c].charset().displayName());
        } else {
            String str = (String) nVar.b;
            int i3 = this.d;
            int i10 = this.b;
            String substring = str.substring(i10, i3 + i10);
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
