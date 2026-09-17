package bi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ha implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ja b;

    public /* synthetic */ ha(ja jaVar, int i10) {
        this.a = i10;
        this.b = jaVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ja.c(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
            default:
                ja.b(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
        }
    }
}
