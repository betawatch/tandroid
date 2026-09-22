package org.telegram.messenger;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class l5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocaleController b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.a = i10;
        this.b = localeController;
        this.c = str;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$checkForcePatchLangpack$6(this.c, this.d);
                break;
            default:
                this.b.lambda$checkForcePatchLangpack$5(this.c, this.d);
                break;
        }
    }
}
