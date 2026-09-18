package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ix0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ ix0(TLObject tLObject, Utilities.Callback callback, int i10) {
        this.a = i10;
        this.b = tLObject;
        this.c = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                TLObject tLObject = this.b;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (!MediaDataController.getInstance(UserConfig.selectedAccount).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.c.run(Boolean.valueOf(z10));
                break;
            default:
                TLObject tLObject2 = this.b;
                boolean z11 = tLObject2 instanceof TL_account.paidMessagesRevenue;
                Utilities.Callback callback = this.c;
                if (!z11) {
                    callback.run(0L);
                    break;
                } else {
                    callback.run(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                    break;
                }
        }
    }
}
