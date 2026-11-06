package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionsActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ p21(SessionsActivity sessionsActivity, boolean z9, int i7) {
        this.a = i7;
        this.b = sessionsActivity;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p0(this.c);
                break;
            default:
                this.b.p0(this.c);
                break;
        }
    }
}
