package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n30 b;

    public /* synthetic */ m30(n30 n30Var, int i7) {
        this.a = i7;
        this.b = n30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n30 n30Var = this.b;
                l00 l00Var = n30Var.b;
                if (l00Var != null) {
                    l00Var.setVisibility(0);
                }
                org.telegram.messenger.g0.i3(new m30(n30Var, 2), 16L);
                break;
            case 1:
                l00 l00Var2 = this.b.b;
                if (l00Var2 != null) {
                    l00Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
