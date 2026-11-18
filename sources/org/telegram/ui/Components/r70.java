package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class r70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t70 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r70(t70 t70Var, boolean z10, int i7) {
        this.a = i7;
        this.b = t70Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new r70(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
