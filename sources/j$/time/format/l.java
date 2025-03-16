package j$.time.format;

/* loaded from: classes2.dex */
final class l implements f {
    private final String a;

    l(String str) {
        this.a = str;
    }

    @Override // j$.time.format.f
    public final boolean a(r rVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    public final String toString() {
        return "'" + this.a.replace("'", "''") + "'";
    }
}
