package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qm implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;
    public final /* synthetic */ int c;

    public /* synthetic */ qm(rn rnVar, int i7, int i10) {
        this.a = i10;
        this.b = rnVar;
        this.c = i7;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.j0(this.c, (sh.d) obj);
                break;
            default:
                rn rnVar = this.b;
                rnVar.getClass();
                rnVar.j0(this.c, new th.e((String) obj));
                break;
        }
    }
}
