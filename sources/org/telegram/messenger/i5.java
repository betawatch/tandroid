package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final /* synthetic */ class i5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocaleController b;
    public final /* synthetic */ LocaleController.LocaleInfo c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Runnable f;

    public /* synthetic */ i5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.a = i11;
        this.b = localeController;
        this.c = localeInfo;
        this.d = tLObject;
        this.e = i10;
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$applyRemoteLanguage$16(this.c, this.d, this.e, this.f);
                break;
            case 1:
                this.b.lambda$applyRemoteLanguage$20(this.c, this.d, this.e, this.f);
                break;
            case 2:
                this.b.lambda$applyRemoteLanguage$18(this.c, this.d, this.e, this.f);
                break;
            default:
                this.b.lambda$applyRemoteLanguage$14(this.c, this.d, this.e, this.f);
                break;
        }
    }
}
