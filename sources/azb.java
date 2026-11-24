// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
