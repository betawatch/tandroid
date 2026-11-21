package hi;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class y9 implements m2 {
    public final /* synthetic */ sa a;

    public y9(sa saVar) {
        this.a = saVar;
    }

    @Override // hi.m2
    public final void setInvert(float f10) {
        sa saVar = this.a;
        org.telegram.messenger.g0.n3(saVar.n, f10 > 0.5f);
        org.telegram.messenger.g0.q3(saVar.n, f10 > 0.5f);
    }

    @Override // hi.m2
    public final void invalidate() {
    }
}
