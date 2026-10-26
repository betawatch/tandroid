package cd;

import a8.tb;
import bf.g;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b extends gf.a {
    public final a a = new a();
    public final StringBuilder b = new StringBuilder();
    public final int c;

    public b(int i10) {
        this.c = i10;
    }

    @Override // gf.a
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // gf.a
    public final void d() {
        this.a.g = this.b.toString();
    }

    @Override // gf.a
    public final ef.a e() {
        return this.a;
    }

    @Override // gf.a
    public final bf.a h(g gVar) {
        int i10;
        int i11 = gVar.e;
        CharSequence charSequence = gVar.a;
        int length = charSequence.length();
        if (gVar.g < 4) {
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
            if (i10 == i13 && tb.b(' ', charSequence, i11 + i13, length) == length) {
                return new bf.a(-1, -1, true);
            }
        }
        return bf.a.a(gVar.b);
    }
}
