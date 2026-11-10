package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.v10 b;
    public final /* synthetic */ String c;

    public /* synthetic */ z11(String str, int i7, org.telegram.messenger.v10 v10Var) {
        this.a = i7;
        this.b = v10Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.v10 v10Var = this.b;
                if (v10Var != null) {
                    v10Var.a(this.c, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                this.b.a(null, this.c);
                break;
            default:
                this.b.a(null, this.c);
                break;
        }
    }
}
