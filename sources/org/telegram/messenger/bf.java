package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class bf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ df b;
    public final /* synthetic */ int c;

    public /* synthetic */ bf(df dfVar, int i10, int i11) {
        this.a = i11;
        this.b = dfVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                df dfVar = this.b;
                try {
                    dfVar.b.o(this.c);
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                df dfVar2 = this.b;
                try {
                    dfVar2.b.o(this.c);
                    break;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            case 2:
                df dfVar3 = this.b;
                try {
                    dfVar3.b.o(this.c);
                    break;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
            default:
                df dfVar4 = this.b;
                try {
                    dfVar4.b.o(this.c);
                    break;
                } catch (Exception e11) {
                    f8.g(e11, true);
                }
        }
    }
}
