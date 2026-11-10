package fi;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
