package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionsActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c71(SessionsActivity sessionsActivity, boolean z10, int i9) {
        this.a = i9;
        this.b = sessionsActivity;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.j0(this.c);
                break;
            default:
                this.b.j0(this.c);
                break;
        }
    }
}
