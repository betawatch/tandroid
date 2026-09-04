package org.telegram.ui.Components;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
