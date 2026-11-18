package gf;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class b extends mf.a {
    public final kf.b a = new kf.b();

    public static boolean i(g gVar, int i7) {
        CharSequence charSequence = gVar.a;
        return gVar.g < 4 && i7 < charSequence.length() && charSequence.charAt(i7) == '>';
    }

    @Override // mf.a
    public final kf.a e() {
        return this.a;
    }

    @Override // mf.a
    public final a h(g gVar) {
        char charAt;
        int i7 = gVar.e;
        if (!i(gVar, i7)) {
            return null;
        }
        int i10 = gVar.c + gVar.g;
        int i11 = i10 + 1;
        CharSequence charSequence = gVar.a;
        int i12 = i7 + 1;
        if (i12 < charSequence.length() && ((charAt = charSequence.charAt(i12)) == '\t' || charAt == ' ')) {
            i11 = i10 + 2;
        }
        return new a(-1, i11, false);
    }
}
