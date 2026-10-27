package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class r5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocaleController b;
    public final /* synthetic */ int c;

    public /* synthetic */ r5(LocaleController localeController, int i10, int i11) {
        this.a = i11;
        this.b = localeController;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$applyLanguage$8(this.c);
                break;
            case 1:
                this.b.lambda$checkPatchLangpack$4(this.c);
                break;
            case 2:
                this.b.lambda$checkUpdateForCurrentRemoteLocale$2(this.c);
                break;
            default:
                this.b.lambda$checkUpdateForCurrentRemoteLocale$3(this.c);
                break;
        }
    }
}
