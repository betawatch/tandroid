package ke;

import k7.v;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f extends pe.a {
    public final ne.h a;
    public String b;
    public final StringBuilder c;

    public f(char c3, int i10, int i11) {
        ne.h hVar = new ne.h();
        this.a = hVar;
        this.c = new StringBuilder();
        hVar.g = c3;
        hVar.h = i10;
        hVar.i = i11;
    }

    @Override // pe.a
    public final void a(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        StringBuilder sb = this.c;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override // pe.a
    public final void d() {
        String a2 = me.a.a(this.b.trim());
        ne.h hVar = this.a;
        hVar.j = a2;
        hVar.k = this.c.toString();
    }

    @Override // pe.a
    public final ne.a e() {
        return this.a;
    }

    @Override // pe.a
    public final j4.h h(e eVar) {
        int i10 = eVar.e;
        int i11 = eVar.b;
        CharSequence charSequence = eVar.a;
        int i12 = eVar.g;
        ne.h hVar = this.a;
        if (i12 < 4) {
            char c3 = hVar.g;
            int i13 = hVar.h;
            int b10 = v.b(c3, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && v.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new j4.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return j4.h.a(i11);
    }
}
