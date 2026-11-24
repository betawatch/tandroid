// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lra implements i8c {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ i8c c;
    public final /* synthetic */ p8c d;

    public /* synthetic */ lra(p8c p8cVar, boolean[] zArr, i8c i8cVar) {
        this.d = p8cVar;
        this.b = zArr;
        this.c = i8cVar;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        p8c p8cVar = this.d;
        i8c i8cVar = this.c;
        boolean[] zArr = this.b;
        Long l = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (b) {
            case 0:
                if (p8cVar != null) {
                    p8cVar.a(Boolean.TRUE);
                }
                zArr[0] = true;
                i8cVar.a(bool.booleanValue() ? "paid" : "failed", l);
                break;
            default:
                zArr[0] = true;
                i8cVar.a(bool.booleanValue() ? "paid" : "failed", l);
                if (p8cVar != null) {
                    p8cVar.a(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ lra(boolean[] zArr, i8c i8cVar, p8c p8cVar) {
        this.b = zArr;
        this.c = i8cVar;
        this.d = p8cVar;
    }
}
