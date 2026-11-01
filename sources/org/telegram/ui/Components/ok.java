package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ok implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bl b;
    public final /* synthetic */ org.telegram.messenger.ab c;

    public /* synthetic */ ok(bl blVar, org.telegram.messenger.ab abVar, int i10) {
        this.a = i10;
        this.b = blVar;
        this.c = abVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bl.U(this.b, this.c);
                break;
            default:
                org.telegram.messenger.ab abVar = this.c;
                try {
                    ((bh.d) abVar).z();
                } catch (Exception unused) {
                }
                org.telegram.messenger.i0.g3(new ok(this.b, abVar, 0));
                break;
        }
    }
}
