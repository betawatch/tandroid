package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class h2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h2(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ((FactCheckController) this.b).lambda$getFactCheck$0((FactCheckController.Key) this.c, (MessageObject) this.d, (TLRPC.TL_factCheck) obj);
                break;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$2((ChannelBoostsController.CanApplyBoost) this.b, (TL_stories.TL_premium_boostsStatus) this.c, (d5.d) this.d, (TL_stories.TL_premium_myBoosts) obj);
                break;
            case 2:
                ((FileRefController) this.b).lambda$requestReferenceFromServer$1((String) this.c, (String) this.d, (jh.a6) obj);
                break;
            case 3:
                MediaDataController.lambda$setPlaceholderImage$31((String) this.b, (org.telegram.ui.Components.n9) this.c, (String) this.d, (TLRPC.TL_messages_stickerSet) obj);
                break;
            case 4:
                MediaDataController.lambda$fillWithAnimatedEmoji$226((boolean[]) this.b, (ArrayList[]) this.c, (Runnable) this.d, (ArrayList) obj);
                break;
            default:
                MessagesController.lambda$openApp$499((boolean[]) this.b, (TL_bots.BotInfo[]) this.c, (Runnable) this.d, (TLRPC.UserFull) obj);
                break;
        }
    }
}
