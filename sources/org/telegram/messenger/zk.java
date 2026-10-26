package org.telegram.messenger;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class zk implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TranslateController b;
    public final /* synthetic */ Utilities.Callback4 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;

    public /* synthetic */ zk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, int i11) {
        this.a = i11;
        this.b = translateController;
        this.c = callback4;
        this.d = z10;
        this.e = i10;
        this.f = str;
        this.g = j10;
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
