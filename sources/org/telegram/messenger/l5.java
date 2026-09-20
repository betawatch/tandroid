package org.telegram.messenger;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
