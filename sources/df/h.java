package df;

import b8.ec;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h extends jf.a {
    public final gf.h a;
    public String b;
    public final StringBuilder c;

    public h(char c2, int i3, int i10) {
        gf.h hVar = new gf.h();
        this.a = hVar;
        this.c = new StringBuilder();
        hVar.g = c2;
        hVar.h = i3;
        hVar.i = i10;
    }

    @Override // jf.a
    public final void a(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // jf.a
    public final void d() {
        String a10 = ff.a.a(this.b.trim());
        gf.h hVar = this.a;
        hVar.j = a10;
        hVar.k = this.c.toString();
    }

    @Override // jf.a
    public final gf.a e() {
        return this.a;
    }

    @Override // jf.a
    public final a h(g gVar) {
        int i3 = gVar.e;
        int i10 = gVar.b;
        CharSequence charSequence = gVar.a;
        int i11 = gVar.g;
        gf.h hVar = this.a;
        if (i11 < 4) {
            char c2 = hVar.g;
            int i12 = hVar.h;
            int b10 = ec.b(c2, i3, charSequence.length(), charSequence) - i3;
            if (b10 >= i12 && ec.c(i3 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new a(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i13 = hVar.i; i13 > 0 && i10 < length && charSequence.charAt(i10) == ' '; i13--) {
            i10++;
        }
        return a.a(i10);
    }
}
