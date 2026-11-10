package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ i(k kVar, int i7) {
        this.a = i7;
        this.b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                kVar.x = false;
                kVar.c();
                break;
            default:
                this.b.a.setVisibility(4);
                break;
        }
    }
}
