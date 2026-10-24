package af;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
