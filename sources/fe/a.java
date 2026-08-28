package fe;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends ke.a {
    public final ie.b a = new ie.b();

    public static boolean i(e eVar, int i9) {
        CharSequence charSequence = eVar.a;
        return eVar.g < 4 && i9 < charSequence.length() && charSequence.charAt(i9) == '>';
    }

    @Override // ke.a
    public final ie.a e() {
        return this.a;
    }

    @Override // ke.a
    public final e4.h h(e eVar) {
        char charAt;
        int i9 = eVar.e;
        if (!i(eVar, i9)) {
            return null;
        }
        int i10 = eVar.c + eVar.g;
        int i11 = i10 + 1;
        CharSequence charSequence = eVar.a;
        int i12 = i9 + 1;
        if (i12 < charSequence.length() && ((charAt = charSequence.charAt(i12)) == '\t' || charAt == ' ')) {
            i11 = i10 + 2;
        }
        return new e4.h(-1, i11, false);
    }
}
