package ic;

import e4.h;
import g7.j8;
import ge.e;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b extends le.a {
    public final a a = new a();
    public final StringBuilder b = new StringBuilder();
    public final int c;

    public b(int i10) {
        this.c = i10;
    }

    @Override // le.a
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // le.a
    public final void d() {
        this.a.g = this.b.toString();
    }

    @Override // le.a
    public final je.a e() {
        return this.a;
    }

    @Override // le.a
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
            if (i10 == i13 && j8.b(' ', charSequence, i11 + i13, length) == length) {
                return new h(-1, -1, true);
            }
        }
        return h.a(eVar.b);
    }
}
