package j$.time.format;

/* loaded from: classes2.dex */
final class d implements f {
    private final char a;

    d(char c) {
        this.a = c;
    }

    @Override // j$.time.format.f
    public final boolean a(r rVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    public final String toString() {
        char c = this.a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
