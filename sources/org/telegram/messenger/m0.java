package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;

    public /* synthetic */ m0(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                BotForumHelper.lambda$stopStreaming$2((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                MessagesController.lambda$revertWelcomeEphemeralMessage$125((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                MessagesController.lambda$toggleCommunityCollapsedInDialogs$253((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                MessagesController.lambda$deleteEphemeralMessage$126((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            case 4:
                MessagesController.lambda$deleteEphemeralMessage$127((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                MessagesController.lambda$deleteAllReactionsFrom$130((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
