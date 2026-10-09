package ad;

import q3.h;
import v7.i0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class c extends ef.a {
    public final a a = new a();
    public final StringBuilder b = new StringBuilder();
    public final int c;

    public c(int i10) {
        this.c = i10;
    }

    @Override // ef.a
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // ef.a
    public final void d() {
        this.a.g = this.b.toString();
    }

    @Override // ef.a
    public final cf.a e() {
        return this.a;
    }

    @Override // ef.a
    public final h h(ze.d dVar) {
        int i10;
        int i11 = dVar.e;
        CharSequence charSequence = dVar.a;
        int length = charSequence.length();
        if (dVar.g < 4) {
            int i12 = i11;
            while (true) {
                if (i12 >= length) {
                    i10 = length - i11;
                    break;
                }
                if ('$' != charSequence.charAt(i12)) {
                    i10 = i12 - i11;
                    break;
                }
                i12++;
            }
            int i13 = this.c;
            if (i10 == i13 && i0.b(' ', charSequence, i11 + i13, length) == length) {
                return new h(-1, -1, true);
            }
        }
        return h.a(dVar.b);
    }
}
