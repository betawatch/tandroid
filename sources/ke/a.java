package ke;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a extends pe.a {
    public final ne.b a = new ne.b();

    public static boolean i(e eVar, int i10) {
        CharSequence charSequence = eVar.a;
        return eVar.g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>';
    }

    @Override // pe.a
    public final ne.a e() {
        return this.a;
    }

    @Override // pe.a
    public final j4.h h(e eVar) {
        char charAt;
        int i10 = eVar.e;
        if (!i(eVar, i10)) {
            return null;
        }
        int i11 = eVar.c + eVar.g;
        int i12 = i11 + 1;
        CharSequence charSequence = eVar.a;
        int i13 = i10 + 1;
        if (i13 < charSequence.length() && ((charAt = charSequence.charAt(i13)) == '\t' || charAt == ' ')) {
            i12 = i11 + 2;
        }
        return new j4.h(-1, i12, false);
    }
}
