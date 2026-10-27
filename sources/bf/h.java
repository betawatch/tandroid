package bf;

import a8.tb;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class h extends gf.a {
    public final ef.h a;
    public String b;
    public final StringBuilder c;

    public h(char c10, int i10, int i11) {
        ef.h hVar = new ef.h();
        this.a = hVar;
        this.c = new StringBuilder();
        hVar.g = c10;
        hVar.h = i10;
        hVar.i = i11;
    }

    @Override // gf.a
    public final void a(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // gf.a
    public final void d() {
        String a2 = df.a.a(this.b.trim());
        ef.h hVar = this.a;
        hVar.j = a2;
        hVar.k = this.c.toString();
    }

    @Override // gf.a
    public final ef.a e() {
        return this.a;
    }

    @Override // gf.a
    public final a h(g gVar) {
        int i10 = gVar.e;
        int i11 = gVar.b;
        CharSequence charSequence = gVar.a;
        int i12 = gVar.g;
        ef.h hVar = this.a;
        if (i12 < 4) {
            char c10 = hVar.g;
            int i13 = hVar.h;
            int b10 = tb.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && tb.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new a(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return a.a(i11);
    }
}
