package fi;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ z9(sb sbVar, boolean z10, int i10) {
        this.a = i10;
        this.b = sbVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e(this.c);
                break;
            case 1:
                sb sbVar = this.b;
                if (!this.c) {
                    sbVar.J0.b(false, false);
                    break;
                } else {
                    sbVar.getClass();
                    break;
                }
            default:
                sb sbVar2 = this.b;
                sbVar2.R = null;
                sbVar2.e = false;
                sbVar2.p(this.c);
                break;
        }
    }
}
