package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jk0 b;

    public /* synthetic */ hk0(jk0 jk0Var, int i7) {
        this.a = i7;
        this.b = jk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jk0 jk0Var = this.b;
                jk0Var.getClass();
                org.telegram.messenger.g0.h3(new hk0(jk0Var, 2));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new hk0(this.b, 3));
                break;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
