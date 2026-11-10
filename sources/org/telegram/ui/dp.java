package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ long c;

    public /* synthetic */ dp(mp mpVar, long j3, int i7) {
        this.a = i7;
        this.b = mpVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                mp mpVar = this.b;
                mpVar.n = j3;
                mpVar.r = true;
                mpVar.s0();
                break;
            default:
                mp.e0(this.b, this.c);
                break;
        }
    }
}
