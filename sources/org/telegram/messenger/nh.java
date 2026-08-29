package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class nh implements Utilities.Callback2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nh(Context context, int i10, Utilities.Callback2 callback2) {
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

    public /* synthetic */ nh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.c = translateController;
        this.b = i10;
        this.d = callback;
    }
}
