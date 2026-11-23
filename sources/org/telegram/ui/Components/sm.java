package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class sm implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;
    public final /* synthetic */ int c;

    public /* synthetic */ sm(tn tnVar, int i7, int i10) {
        this.a = i10;
        this.b = tnVar;
        this.c = i7;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.j0(this.c, (sh.c) obj);
                break;
            default:
                tn tnVar = this.b;
                tnVar.getClass();
                tnVar.j0(this.c, new th.e((String) obj));
                break;
        }
    }
}
