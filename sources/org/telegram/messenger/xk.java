package org.telegram.messenger;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class xk implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TranslateController b;
    public final /* synthetic */ Utilities.Callback4 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;

    public /* synthetic */ xk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.a = i11;
        this.b = translateController;
        this.c = callback4;
        this.d = z10;
        this.e = i10;
        this.f = str;
        this.g = j3;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                this.b.lambda$pushToTranslate$21(this.c, this.d, this.e, this.f, this.g, (String) obj, (Boolean) obj2);
                break;
            default:
                this.b.lambda$pushToTranslate$20(this.c, this.d, this.e, this.f, this.g, (String) obj, (Boolean) obj2);
                break;
        }
    }
}
