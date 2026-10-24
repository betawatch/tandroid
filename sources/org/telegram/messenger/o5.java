package org.telegram.messenger;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class o5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocaleController b;
    public final /* synthetic */ int c;

    public /* synthetic */ o5(LocaleController localeController, int i10, int i11) {
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
