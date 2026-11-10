package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jz b;

    public /* synthetic */ oy(jz jzVar, int i7) {
        this.a = i7;
        this.b = jzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jz.a0(this.b);
                break;
            default:
                jz.b0(this.b);
                break;
        }
    }
}
