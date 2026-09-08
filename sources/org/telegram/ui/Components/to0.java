package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class to0 implements rb {
    public final /* synthetic */ qc a;
    public final /* synthetic */ ff b;

    public to0(ff ffVar, qc qcVar) {
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
