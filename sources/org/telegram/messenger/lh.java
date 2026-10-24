package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class lh implements Utilities.Callback2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lh(Context context, int i10, Utilities.Callback2 callback2) {
        this.c = callback2;
        this.d = context;
        this.b = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.c, (Context) this.d, this.b, (v0.c) obj, (Throwable) obj2);
                break;
            default:
                ((TranslateController) this.c).lambda$pushToSummarize$19(this.b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public /* synthetic */ lh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.c = translateController;
        this.b = i10;
        this.d = callback;
    }
}
