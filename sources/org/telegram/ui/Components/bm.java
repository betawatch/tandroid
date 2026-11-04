package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bm implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ int c;

    public /* synthetic */ bm(an anVar, int i3, int i10) {
        this.a = i10;
        this.b = anVar;
        this.c = i3;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.j0(this.c, (th.c) obj);
                break;
            default:
                an anVar = this.b;
                anVar.getClass();
                anVar.j0(this.c, new uh.e((String) obj));
                break;
        }
    }
}
