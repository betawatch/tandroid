package bf;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b extends gf.a {
    public final ef.b a = new ef.b();

    public static boolean i(g gVar, int i10) {
        CharSequence charSequence = gVar.a;
        return gVar.g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>';
    }

    @Override // gf.a
    public final ef.a e() {
        return this.a;
    }

    @Override // gf.a
    public final a h(g gVar) {
        char charAt;
        int i10 = gVar.e;
        if (!i(gVar, i10)) {
            return null;
        }
        int i11 = gVar.c + gVar.g;
        int i12 = i11 + 1;
        CharSequence charSequence = gVar.a;
        int i13 = i10 + 1;
        if (i13 < charSequence.length() && ((charAt = charSequence.charAt(i13)) == '\t' || charAt == ' ')) {
            i12 = i11 + 2;
        }
        return new a(-1, i12, false);
    }
}
