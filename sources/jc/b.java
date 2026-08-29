package jc;

import g4.h;
import i7.k;
import ie.e;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b extends ne.a {
    public final a a = new a();
    public final StringBuilder b = new StringBuilder();
    public final int c;

    public b(int i10) {
        this.c = i10;
    }

    @Override // ne.a
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // ne.a
    public final void d() {
        this.a.g = this.b.toString();
    }

    @Override // ne.a
    public final le.a e() {
        return this.a;
    }

    @Override // ne.a
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
            if (i10 == i13 && k.b(' ', charSequence, i11 + i13, length) == length) {
                return new h(-1, -1, true);
            }
        }
        return h.a(eVar.b);
    }
}
