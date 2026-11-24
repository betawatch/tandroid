// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class azb implements zw5, yw5 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ i8c c;

    public /* synthetic */ azb(i8c i8cVar, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i8cVar;
    }

    @Override // zw5
    public final void a(String str) {
        rzb.D0(this.a, str, this.b, this.c);
    }

    @Override // yw5
    public final void n(Exception exc) {
        rzb.D0(this.a, "en", this.b, this.c);
    }
}
