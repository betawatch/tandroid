package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ q(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i7) {
        this.a = i7;
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
