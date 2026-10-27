package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionsActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ g71(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.a = i10;
        this.b = sessionsActivity;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.l0(this.c);
                break;
            default:
                this.b.l0(this.c);
                break;
        }
    }
}
