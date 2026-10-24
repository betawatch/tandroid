package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
