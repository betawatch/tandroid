package org.telegram.messenger;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
