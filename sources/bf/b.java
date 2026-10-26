package bf;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
