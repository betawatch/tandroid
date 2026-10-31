package li;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class c {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4.l b;

    public /* synthetic */ c(a4.l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    public void a(Exception exc) {
        switch (this.a) {
            case 0:
                a4.l lVar = this.b;
                ((x0) lVar.b).i.post(new n0(lVar, exc, 1));
                break;
            default:
                a4.l lVar2 = this.b;
                ((x0) lVar2.b).i.post(new n0(lVar2, exc, 0));
                break;
        }
    }
}
