// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class lg1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p8c b;

    public /* synthetic */ lg1(p8c p8cVar, byte b) {
        this.a = b;
        this.b = p8cVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final p8c p8cVar = this.b;
        switch (b) {
            case 0:
                gl.c3(new mg1(tLObject, p8cVar, tL_error));
                break;
            case 1:
                p8cVar.a(tLObject instanceof TLRPC.TL_channels_channelParticipant ? ((TLRPC.TL_channels_channelParticipant) tLObject).participant : null);
                break;
            case 2:
                final byte b2 = 0;
                gl.c3(new Runnable() { // from class: psa
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z;
                        byte b3 = b2;
                        p8c p8cVar2 = p8cVar;
                        TLObject tLObject2 = tLObject;
                        switch (b3) {
                            case 0:
                                if (!(tLObject2 instanceof TL_account.paidMessagesRevenue)) {
                                    p8cVar2.a(0L);
                                    break;
                                } else {
                                    p8cVar2.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                                    break;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    z = true;
                                    hq6.d0(y6c.t0).L1(tL_messages_stickerSet, true);
                                    if (!hq6.d0(y6c.t0).D0(tL_messages_stickerSet.set.id, true)) {
                                        hq6.d0(y6c.t0).h2(null, tL_messages_stickerSet, 2, null, false, false);
                                    }
                                } else {
                                    z = false;
                                }
                                p8cVar2.a(Boolean.valueOf(z));
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 1;
                gl.c3(new Runnable() { // from class: psa
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z;
                        byte b32 = b3;
                        p8c p8cVar2 = p8cVar;
                        TLObject tLObject2 = tLObject;
                        switch (b32) {
                            case 0:
                                if (!(tLObject2 instanceof TL_account.paidMessagesRevenue)) {
                                    p8cVar2.a(0L);
                                    break;
                                } else {
                                    p8cVar2.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                                    break;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    z = true;
                                    hq6.d0(y6c.t0).L1(tL_messages_stickerSet, true);
                                    if (!hq6.d0(y6c.t0).D0(tL_messages_stickerSet.set.id, true)) {
                                        hq6.d0(y6c.t0).h2(null, tL_messages_stickerSet, 2, null, false, false);
                                    }
                                } else {
                                    z = false;
                                }
                                p8cVar2.a(Boolean.valueOf(z));
                                break;
                        }
                    }
                });
                break;
        }
    }
}
