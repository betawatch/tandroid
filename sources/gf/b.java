package gf;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b extends mf.a {
    public final kf.b a = new kf.b();

    public static boolean i(h hVar, int i7) {
        CharSequence charSequence = hVar.a;
        return hVar.g < 4 && i7 < charSequence.length() && charSequence.charAt(i7) == '>';
    }

    @Override // mf.a
    public final kf.a e() {
        return this.a;
    }

    @Override // mf.a
    public final a h(h hVar) {
        char charAt;
        int i7 = hVar.e;
        if (!i(hVar, i7)) {
            return null;
        }
        int i10 = hVar.c + hVar.g;
        int i11 = i10 + 1;
        CharSequence charSequence = hVar.a;
        int i12 = i7 + 1;
        if (i12 < charSequence.length() && ((charAt = charSequence.charAt(i12)) == '\t' || charAt == ' ')) {
            i11 = i10 + 2;
        }
        return new a(-1, i11, false);
    }
}
