package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;
    public final /* synthetic */ String c;

    public /* synthetic */ d1(t tVar, String str, int i7) {
        this.a = i7;
        this.b = tVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
