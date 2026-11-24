// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ob1 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j7b b;

    public /* synthetic */ ob1(j7b j7bVar, byte b) {
        this.a = b;
        this.b = j7bVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        j7b j7bVar = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                j7bVar.setPeriod(num.intValue());
                p8c p8cVar = j7bVar.B1;
                if (p8cVar != null) {
                    p8cVar.a(num);
                    break;
                }
                break;
            default:
                p8c p8cVar2 = j7bVar.C1;
                if (p8cVar2 != null) {
                    p8cVar2.a(num);
                    break;
                }
                break;
        }
    }
}
