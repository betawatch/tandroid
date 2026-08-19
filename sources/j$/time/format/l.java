package j$.time.format;

/* loaded from: classes2.dex */
public final class l implements f {
    public final String a;

    public l(String str) {
        this.a = str;
    }

    @Override // j$.time.format.f
    public final boolean l(r rVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    public final String toString() {
        return "'" + this.a.replace("'", "''") + "'";
    }
}
