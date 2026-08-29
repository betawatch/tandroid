package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dc0(Object obj, long j10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.d;
        long j10 = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                rc0 rc0Var = (rc0) obj2;
                TLObject tLObject = (TLObject) obj;
                if (rc0Var.E != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i11 = 0;
                    while (i11 < messages_messages.messages.size()) {
                        if (!(messages_messages.messages.get(i11).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                            messages_messages.messages.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    rc0Var.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    rc0Var.getMessagesController().putUsers(messages_messages.users, false);
                    rc0Var.getMessagesController().putChats(messages_messages.chats, false);
                    rc0Var.getLocationController().locationsCache.k(messages_messages.messages, j10);
                    rc0Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j10));
                    rc0Var.i0(messages_messages.messages);
                    rc0Var.getLocationController().markLiveLoactionsAsRead(rc0Var.a0);
                    if (rc0Var.F0 == null) {
                        zb0 zb0Var = new zb0(rc0Var, 4);
                        rc0Var.F0 = zb0Var;
                        AndroidUtilities.runOnUIThread(zb0Var, 5000L);
                        break;
                    }
                }
                break;
            case 1:
                iv0 iv0Var = (iv0) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                iv0Var.getClass();
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                o2Var.presentFragment(new ProfileActivity(bundle, null));
                iv0Var.c(false);
                break;
            default:
                ((long[]) obj2)[0] = j10;
                ((bg.j3) obj).run();
                break;
        }
    }

    public /* synthetic */ dc0(rc0 rc0Var, TLObject tLObject, long j10) {
        this.a = 0;
        this.c = rc0Var;
        this.d = tLObject;
        this.b = j10;
    }
}
