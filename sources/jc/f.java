package jc;

import com.google.firebase.messaging.m;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class f {
    public final hc.f a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ aa.a e;

    public f(aa.a aVar, hc.f fVar, int i10, int i11, int i12) {
        this.e = aVar;
        this.a = fVar;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public final int a() {
        hc.f fVar = this.a;
        hc.f fVar2 = hc.f.h;
        int i10 = this.d;
        if (fVar != fVar2) {
            return i10;
        }
        m mVar = (m) this.e.d;
        dc.e eVar = (dc.e) mVar.c;
        String str = (String) mVar.b;
        int i11 = this.b;
        return str.substring(i11, i10 + i11).getBytes(eVar.a[this.c].charset()).length;
    }

    public final String toString() {
        m mVar = (m) this.e.d;
        StringBuilder sb2 = new StringBuilder();
        hc.f fVar = this.a;
        sb2.append(fVar);
        sb2.append('(');
        if (fVar == hc.f.n) {
            dc.e eVar = (dc.e) mVar.c;
            sb2.append(eVar.a[this.c].charset().displayName());
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
