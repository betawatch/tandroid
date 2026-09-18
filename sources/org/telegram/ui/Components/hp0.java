package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class hp0 implements rb {
    public final /* synthetic */ qc a;
    public final /* synthetic */ ef b;

    public hp0(ef efVar, qc qcVar) {
        this.b = efVar;
        this.a = qcVar;
    }

    @Override // org.telegram.ui.Components.rb
    public final void c() {
        this.b.G.remove(this.a);
    }

    @Override // org.telegram.ui.Components.rb
    public final void d() {
        this.b.G.add(this.a);
    }

    @Override // org.telegram.ui.Components.rb
    public final /* synthetic */ void a(qc qcVar) {
    }

    @Override // org.telegram.ui.Components.rb
    public final /* synthetic */ void b() {
    }
}
