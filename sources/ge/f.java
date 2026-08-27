package ge;

import g7.j8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f extends le.a {
    public final je.h a;
    public String b;
    public final StringBuilder c;

    public f(char c10, int i10, int i11) {
        je.h hVar = new je.h();
        this.a = hVar;
        this.c = new StringBuilder();
        hVar.g = c10;
        hVar.h = i10;
        hVar.i = i11;
    }

    @Override // le.a
    public final void a(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // le.a
    public final void d() {
        String a2 = ie.a.a(this.b.trim());
        je.h hVar = this.a;
        hVar.j = a2;
        hVar.k = this.c.toString();
    }

    @Override // le.a
    public final je.a e() {
        return this.a;
    }

    @Override // le.a
    public final e4.h h(e eVar) {
        int i10 = eVar.e;
        int i11 = eVar.b;
        CharSequence charSequence = eVar.a;
        int i12 = eVar.g;
        je.h hVar = this.a;
        if (i12 < 4) {
            char c10 = hVar.g;
            int i13 = hVar.h;
            int b10 = j8.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && j8.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new e4.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return e4.h.a(i11);
    }
}
