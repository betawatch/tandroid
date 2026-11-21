package hi;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ta implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb b;

    public /* synthetic */ ta(cb cbVar, int i7) {
        this.a = i7;
        this.b = cbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cb cbVar = this.b;
                ab abVar = cbVar.N;
                if (abVar != null) {
                    long j3 = abVar.a;
                    if (j3 > 0) {
                        cbVar.I = j3;
                        break;
                    }
                }
                break;
            case 1:
                wa waVar = this.b.a;
                if (waVar != null) {
                    waVar.N1();
                    break;
                }
                break;
            default:
                wa waVar2 = this.b.a;
                if (waVar2 != null) {
                    waVar2.f0();
                    break;
                }
                break;
        }
    }
}
