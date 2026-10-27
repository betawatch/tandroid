package bi;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class v9 {
    public final long a;
    public final int b;

    public v9(long j10, int i10) {
        this.a = j10;
        this.b = i10;
    }

    public static v9 a(int i10, long j10) {
        return new v9(j10, i10);
    }

    public static v9 b(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        return (message == null || !(message.isThreadMessage || messageObject.isForwardedChannelPost()) || messageObject.messageOwner.fwd_from == null) ? new v9(messageObject.getDialogId(), messageObject.getId()) : new v9(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v9) {
            v9 v9Var = (v9) obj;
            if (v9Var.a == this.a && v9Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
