package lc;

import j4.h;
import k7.v;
import ke.e;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b extends pe.a {
    public final a a = new a();
    public final StringBuilder b = new StringBuilder();
    public final int c;

    public b(int i10) {
        this.c = i10;
    }

    @Override // pe.a
    public final void a(CharSequence charSequence) {
        StringBuilder sb = this.b;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override // pe.a
    public final void d() {
        this.a.g = this.b.toString();
    }

    @Override // pe.a
    public final ne.a e() {
        return this.a;
    }

    @Override // pe.a
    public final h h(e eVar) {
        int i10;
        int i11 = eVar.e;
        CharSequence charSequence = eVar.a;
        int length = charSequence.length();
        if (eVar.g < 4) {
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
            if (i10 == i13 && v.b(' ', charSequence, i11 + i13, length) == length) {
                return new h(-1, -1, true);
            }
        }
        return h.a(eVar.b);
    }
}
