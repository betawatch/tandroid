package gh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p7 {
    public final long a;
    public final int b;

    public p7(long j10, int i9) {
        this.a = j10;
        this.b = i9;
    }

    public static p7 a(int i9, long j10) {
        return new p7(j10, i9);
    }

    public static p7 b(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        return (message == null || !(message.isThreadMessage || messageObject.isForwardedChannelPost()) || messageObject.messageOwner.fwd_from == null) ? new p7(messageObject.getDialogId(), messageObject.getId()) : new p7(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p7) {
            p7 p7Var = (p7) obj;
            if (p7Var.a == this.a && p7Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
