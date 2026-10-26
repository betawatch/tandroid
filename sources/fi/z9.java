package fi;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
