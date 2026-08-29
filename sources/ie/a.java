package ie;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a extends ne.a {
    public final le.b a = new le.b();

    public static boolean i(e eVar, int i10) {
        CharSequence charSequence = eVar.a;
        return eVar.g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>';
    }

    @Override // ne.a
    public final le.a e() {
        return this.a;
    }

    @Override // ne.a
    public final g4.h h(e eVar) {
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
        return new g4.h(-1, i12, false);
    }
}
