package bd;

import af.h;
import v7.f5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class b extends ff.a {
    public final a a = new a();
    public final StringBuilder b = new StringBuilder();
    public final int c;

    public b(int i10) {
        this.c = i10;
    }

    @Override // ff.a
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // ff.a
    public final void d() {
        this.a.g = this.b.toString();
    }

    @Override // ff.a
    public final df.a e() {
        return this.a;
    }

    @Override // ff.a
    public final af.a h(h hVar) {
        int i10;
        int i11 = hVar.e;
        CharSequence charSequence = hVar.a;
        int length = charSequence.length();
        if (hVar.g < 4) {
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
            if (i10 == i13 && f5.b(' ', charSequence, i11 + i13, length) == length) {
                return new af.a(-1, -1, true);
            }
        }
        return af.a.a(hVar.b);
    }
}
