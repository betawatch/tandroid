package df;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends jf.a {
    public final gf.b a = new gf.b();

    public static boolean i(g gVar, int i3) {
        CharSequence charSequence = gVar.a;
        return gVar.g < 4 && i3 < charSequence.length() && charSequence.charAt(i3) == '>';
    }

    @Override // jf.a
    public final gf.a e() {
        return this.a;
    }

    @Override // jf.a
    public final a h(g gVar) {
        char charAt;
        int i3 = gVar.e;
        if (!i(gVar, i3)) {
            return null;
        }
        int i10 = gVar.c + gVar.g;
        int i11 = i10 + 1;
        CharSequence charSequence = gVar.a;
        int i12 = i3 + 1;
        if (i12 < charSequence.length() && ((charAt = charSequence.charAt(i12)) == '\t' || charAt == ' ')) {
            i11 = i10 + 2;
        }
        return new a(-1, i11, false);
    }
}
