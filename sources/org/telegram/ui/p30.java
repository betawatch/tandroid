package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q30 b;

    public /* synthetic */ p30(q30 q30Var, int i7) {
        this.a = i7;
        this.b = q30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q30 q30Var = this.b;
                o00 o00Var = q30Var.b;
                if (o00Var != null) {
                    o00Var.setVisibility(0);
                }
                org.telegram.messenger.g0.i3(new p30(q30Var, 2), 16L);
                break;
            case 1:
                o00 o00Var2 = this.b.b;
                if (o00Var2 != null) {
                    o00Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
