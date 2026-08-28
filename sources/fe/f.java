package fe;

import f7.e8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends ke.a {
    public final ie.h a;
    public String b;
    public final StringBuilder c;

    public f(char c10, int i9, int i10) {
        ie.h hVar = new ie.h();
        this.a = hVar;
        this.c = new StringBuilder();
        hVar.g = c10;
        hVar.h = i9;
        hVar.i = i10;
    }

    @Override // ke.a
    public final void a(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // ke.a
    public final void d() {
        String a2 = he.a.a(this.b.trim());
        ie.h hVar = this.a;
        hVar.j = a2;
        hVar.k = this.c.toString();
    }

    @Override // ke.a
    public final ie.a e() {
        return this.a;
    }

    @Override // ke.a
    public final e4.h h(e eVar) {
        int i9 = eVar.e;
        int i10 = eVar.b;
        CharSequence charSequence = eVar.a;
        int i11 = eVar.g;
        ie.h hVar = this.a;
        if (i11 < 4) {
            char c10 = hVar.g;
            int i12 = hVar.h;
            int b10 = e8.b(c10, charSequence, i9, charSequence.length()) - i9;
            if (b10 >= i12 && e8.c(i9 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new e4.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i13 = hVar.i; i13 > 0 && i10 < length && charSequence.charAt(i10) == ' '; i13--) {
            i10++;
        }
        return e4.h.a(i10);
    }
}
