package fi;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fb b;

    public /* synthetic */ wa(fb fbVar, int i7) {
        this.a = i7;
        this.b = fbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fb fbVar = this.b;
                db dbVar = fbVar.M;
                if (dbVar != null) {
                    long j3 = dbVar.a;
                    if (j3 > 0) {
                        fbVar.H = j3;
                        break;
                    }
                }
                break;
            case 1:
                za zaVar = this.b.a;
                if (zaVar != null) {
                    zaVar.V();
                    break;
                }
                break;
            default:
                za zaVar2 = this.b.a;
                if (zaVar2 != null) {
                    zaVar2.r();
                    break;
                }
                break;
        }
    }
}
