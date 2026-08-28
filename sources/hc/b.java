package hc;

import e4.h;
import f7.e8;
import fe.e;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends ke.a {
    public final a a = new a();
    public final StringBuilder b = new StringBuilder();
    public final int c;

    public b(int i9) {
        this.c = i9;
    }

    @Override // ke.a
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // ke.a
    public final void d() {
        this.a.g = this.b.toString();
    }

    @Override // ke.a
    public final ie.a e() {
        return this.a;
    }

    @Override // ke.a
    public final h h(e eVar) {
        int i9;
        int i10 = eVar.e;
        CharSequence charSequence = eVar.a;
        int length = charSequence.length();
        if (eVar.g < 4) {
            int i11 = i10;
            while (true) {
                if (i11 >= length) {
                    i9 = length - i10;
                    break;
                }
                if ('$' != charSequence.charAt(i11)) {
                    i9 = i11 - i10;
                    break;
                }
                i11++;
            }
            int i12 = this.c;
            if (i9 == i12 && e8.b(' ', charSequence, i10 + i12, length) == length) {
                return new h(-1, -1, true);
            }
        }
        return h.a(eVar.b);
    }
}
