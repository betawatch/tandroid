package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ts0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ eq0(ts0 ts0Var, int i10, int i11) {
        this.a = i11;
        this.b = ts0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h.scrollBy(0, this.c);
                break;
            case 1:
                this.b.h.scrollBy(0, this.c);
                break;
            default:
                this.b.h.scrollBy(0, this.c);
                break;
        }
    }
}
