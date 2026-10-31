package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class km implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;
    public final /* synthetic */ int c;

    public /* synthetic */ km(jn jnVar, int i10, int i11) {
        this.a = i11;
        this.b = jnVar;
        this.c = i10;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.h0(this.c, (ih.f) obj);
                break;
            default:
                jn jnVar = this.b;
                jnVar.getClass();
                jnVar.h0(this.c, new jh.e((String) obj));
                break;
        }
    }
}
