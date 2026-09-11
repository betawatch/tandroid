package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class h5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocaleController b;
    public final /* synthetic */ LocaleController.LocaleInfo c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Runnable f;

    public /* synthetic */ h5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
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
