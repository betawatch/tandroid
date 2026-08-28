package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;

    public /* synthetic */ k0(int i9) {
        this.a = i9;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                BotForumHelper.lambda$stopStreaming$2((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                MessagesController.lambda$revertWelcomeEphemeralMessage$126((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                MessagesController.lambda$toggleCommunityCollapsedInDialogs$254((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                MessagesController.lambda$deleteEphemeralMessage$127((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            case 4:
                MessagesController.lambda$deleteEphemeralMessage$128((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                MessagesController.lambda$deleteAllReactionsFrom$131((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
