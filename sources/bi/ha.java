package bi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
