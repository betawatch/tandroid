package ge;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a extends le.a {
    public final je.b a = new je.b();

    public static boolean i(e eVar, int i10) {
        CharSequence charSequence = eVar.a;
        return eVar.g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>';
    }

    @Override // le.a
    public final je.a e() {
        return this.a;
    }

    @Override // le.a
    public final e4.h h(e eVar) {
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
        return new e4.h(-1, i12, false);
    }
}
