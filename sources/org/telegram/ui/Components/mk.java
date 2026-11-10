package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vk b;
    public final /* synthetic */ org.telegram.messenger.za c;

    public /* synthetic */ mk(vk vkVar, org.telegram.messenger.za zaVar, int i7) {
        this.a = i7;
        this.b = vkVar;
        this.c = zaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.za zaVar = this.c;
                try {
                    ((a8.r7) zaVar).u();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new mk(this.b, zaVar, 1));
                break;
            default:
                vk.R(this.b, this.c);
                break;
        }
    }
}
