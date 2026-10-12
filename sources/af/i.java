package af;

import v7.f5;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class i extends ff.a {
    public final df.h a;
    public String b;
    public final StringBuilder c;

    public i(char c10, int i10, int i11) {
        df.h hVar = new df.h();
        this.a = hVar;
        this.c = new StringBuilder();
        hVar.g = c10;
        hVar.h = i10;
        hVar.i = i11;
    }

    @Override // ff.a
    public final void a(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // ff.a
    public final void d() {
        String a2 = cf.a.a(this.b.trim());
        df.h hVar = this.a;
        hVar.j = a2;
        hVar.k = this.c.toString();
    }

    @Override // ff.a
    public final df.a e() {
        return this.a;
    }

    @Override // ff.a
    public final a h(h hVar) {
        int i10 = hVar.e;
        int i11 = hVar.b;
        CharSequence charSequence = hVar.a;
        int i12 = hVar.g;
        df.h hVar2 = this.a;
        if (i12 < 4) {
            char c10 = hVar2.g;
            int i13 = hVar2.h;
            int b10 = f5.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && f5.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new a(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar2.i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return a.a(i11);
    }
}
