package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
