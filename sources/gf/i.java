package gf;

import c8.x0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class i extends mf.a {
    public final kf.h a;
    public String b;
    public final StringBuilder c;

    public i(char c10, int i7, int i10) {
        kf.h hVar = new kf.h();
        this.a = hVar;
        this.c = new StringBuilder();
        hVar.g = c10;
        hVar.h = i7;
        hVar.i = i10;
    }

    @Override // mf.a
    public final void a(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // mf.a
    public final void d() {
        String a10 = jf.a.a(this.b.trim());
        kf.h hVar = this.a;
        hVar.j = a10;
        hVar.k = this.c.toString();
    }

    @Override // mf.a
    public final kf.a e() {
        return this.a;
    }

    @Override // mf.a
    public final a h(h hVar) {
        int i7 = hVar.e;
        int i10 = hVar.b;
        CharSequence charSequence = hVar.a;
        int i11 = hVar.g;
        kf.h hVar2 = this.a;
        if (i11 < 4) {
            char c10 = hVar2.g;
            int i12 = hVar2.h;
            int b10 = x0.b(c10, i7, charSequence.length(), charSequence) - i7;
            if (b10 >= i12 && x0.c(i7 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new a(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i13 = hVar2.i; i13 > 0 && i10 < length && charSequence.charAt(i10) == ' '; i13--) {
            i10++;
        }
        return a.a(i10);
    }
}
