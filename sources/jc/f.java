package jc;

import com.google.firebase.messaging.m;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class f {
    public final hc.e a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ aa.a e;

    public f(aa.a aVar, hc.e eVar, int i10, int i11, int i12) {
        this.e = aVar;
        this.a = eVar;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public final int a() {
        hc.e eVar = this.a;
        hc.e eVar2 = hc.e.h;
        int i10 = this.d;
        if (eVar != eVar2) {
            return i10;
        }
        m mVar = (m) this.e.d;
        dc.e eVar3 = (dc.e) mVar.c;
        String str = (String) mVar.b;
        int i11 = this.b;
        return str.substring(i11, i10 + i11).getBytes(eVar3.a[this.c].charset()).length;
    }

    public final String toString() {
        m mVar = (m) this.e.d;
        StringBuilder sb2 = new StringBuilder();
        hc.e eVar = this.a;
        sb2.append(eVar);
        sb2.append('(');
        if (eVar == hc.e.n) {
            dc.e eVar2 = (dc.e) mVar.c;
            sb2.append(eVar2.a[this.c].charset().displayName());
        } else {
            String str = (String) mVar.b;
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
