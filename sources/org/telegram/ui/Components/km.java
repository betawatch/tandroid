package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class km implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;
    public final /* synthetic */ int c;

    public /* synthetic */ km(jn jnVar, int i10, int i11) {
        this.a = i11;
        this.b = jnVar;
        this.c = i10;
    }

    @Override // org.telegram.messenger.r20
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
