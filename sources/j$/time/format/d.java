package j$.time.format;

/* loaded from: classes2.dex */
public final class d implements f {
    public final char a;

    public d(char c3) {
        this.a = c3;
    }

    @Override // j$.time.format.f
    public final boolean j(r rVar, StringBuilder sb2) {
        sb2.append(this.a);
        return true;
    }

    public final String toString() {
        char c3 = this.a;
        if (c3 == '\'') {
            return "''";
        }
        return "'" + c3 + "'";
    }
}
