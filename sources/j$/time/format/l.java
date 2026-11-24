package j$.time.format;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
