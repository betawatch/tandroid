package org.telegram.ui.Components;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class gp0 implements rb {
    public final /* synthetic */ qc a;
    public final /* synthetic */ ff b;

    public gp0(ff ffVar, qc qcVar) {
        this.b = ffVar;
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
