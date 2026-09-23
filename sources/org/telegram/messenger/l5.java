package org.telegram.messenger;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
