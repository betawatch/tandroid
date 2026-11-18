package hi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class z9 implements n2 {
    public final /* synthetic */ ta a;

    public z9(ta taVar) {
        this.a = taVar;
    }

    @Override // hi.n2
    public final void setInvert(float f10) {
        ta taVar = this.a;
        org.telegram.messenger.g0.n3(taVar.n, f10 > 0.5f);
        org.telegram.messenger.g0.q3(taVar.n, f10 > 0.5f);
    }

    @Override // hi.n2
    public final void invalidate() {
    }
}
