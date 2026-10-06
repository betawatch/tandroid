package org.telegram.messenger;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
