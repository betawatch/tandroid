package ie;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends ne.a {
    public final le.h a;
    public String b;
    public final StringBuilder c;

    public f(char c3, int i10, int i11) {
        le.h hVar = new le.h();
        this.a = hVar;
        this.c = new StringBuilder();
        hVar.g = c3;
        hVar.h = i10;
        hVar.i = i11;
    }

    @Override // ne.a
    public final void a(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // ne.a
    public final void d() {
        String a2 = ke.a.a(this.b.trim());
        le.h hVar = this.a;
        hVar.j = a2;
        hVar.k = this.c.toString();
    }

    @Override // ne.a
    public final le.a e() {
        return this.a;
    }

    @Override // ne.a
    public final g4.h h(e eVar) {
        int i10 = eVar.e;
        int i11 = eVar.b;
        CharSequence charSequence = eVar.a;
        int i12 = eVar.g;
        le.h hVar = this.a;
        if (i12 < 4) {
            char c3 = hVar.g;
            int i13 = hVar.h;
            int b10 = i7.k.b(c3, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && i7.k.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new g4.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return g4.h.a(i11);
    }
}
