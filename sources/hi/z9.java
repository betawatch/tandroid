package hi;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
