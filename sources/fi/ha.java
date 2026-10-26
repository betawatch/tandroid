package fi;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ha implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ ha(sb sbVar, int i10) {
        this.a = i10;
        this.b = sbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sb sbVar = this.b;
                sbVar.getClass();
                sbVar.f(1.0f, true, new p9(sbVar, 6));
                sbVar.b1.b(true, true);
                break;
            default:
                sb sbVar2 = this.b;
                sbVar2.e(false);
                sbVar2.m2 = null;
                break;
        }
    }
}
