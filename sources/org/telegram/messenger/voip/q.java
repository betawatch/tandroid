package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ q(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i9) {
        this.a = i9;
        this.b = tLObject;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.b, this.c, this.d, this.e);
                break;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.b, this.c, this.d, this.e);
                break;
        }
    }
}
