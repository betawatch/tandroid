package j$.time.format;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class l implements f {
    public final String a;

    public l(String str) {
        this.a = str;
    }

    @Override // j$.time.format.f
    public final boolean j(r rVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    public final String toString() {
        return "'" + this.a.replace("'", "''") + "'";
    }
}
