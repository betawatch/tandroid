package org.telegram.ui.Components;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class qp0 implements rb {
    public final /* synthetic */ qc a;
    public final /* synthetic */ ef b;

    public qp0(ef efVar, qc qcVar) {
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
