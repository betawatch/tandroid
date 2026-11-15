package gf;

import c8.y0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class h extends mf.a {
    public final kf.h a;
    public String b;
    public final StringBuilder c;

    public h(char c10, int i7, int i10) {
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
    public final a h(g gVar) {
        int i7 = gVar.e;
        int i10 = gVar.b;
        CharSequence charSequence = gVar.a;
        int i11 = gVar.g;
        kf.h hVar = this.a;
        if (i11 < 4) {
            char c10 = hVar.g;
            int i12 = hVar.h;
            int b10 = y0.b(c10, i7, charSequence.length(), charSequence) - i7;
            if (b10 >= i12 && y0.c(i7 + b10, charSequence.length(), charSequence) == charSequence.length()) {
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
