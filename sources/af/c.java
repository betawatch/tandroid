package af;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class c extends ff.a {
    public final df.b a = new df.b();

    public static boolean i(h hVar, int i10) {
        CharSequence charSequence = hVar.a;
        return hVar.g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>';
    }

    @Override // ff.a
    public final df.a e() {
        return this.a;
    }

    @Override // ff.a
    public final a h(h hVar) {
        char charAt;
        int i10 = hVar.e;
        if (!i(hVar, i10)) {
            return null;
        }
        int i11 = hVar.c + hVar.g;
        int i12 = i11 + 1;
        CharSequence charSequence = hVar.a;
        int i13 = i10 + 1;
        if (i13 < charSequence.length() && ((charAt = charSequence.charAt(i13)) == '\t' || charAt == ' ')) {
            i12 = i11 + 2;
        }
        return new a(-1, i12, false);
    }
}
