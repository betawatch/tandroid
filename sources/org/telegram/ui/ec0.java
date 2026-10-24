package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ec0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ec0(Object obj, long j10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sc0 sc0Var = (sc0) this.c;
                TLObject tLObject = (TLObject) this.d;
                long j10 = this.b;
                if (sc0Var.I == null) {
                    return;
                }
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                int i10 = 0;
                while (i10 < messages_messages.messages.size()) {
                    if (!(messages_messages.messages.get(i10).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                        messages_messages.messages.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                sc0Var.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                sc0Var.getMessagesController().putUsers(messages_messages.users, false);
                sc0Var.getMessagesController().putChats(messages_messages.chats, false);
                sc0Var.getLocationController().locationsCache.k(messages_messages.messages, j10);
                sc0Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j10));
                sc0Var.i0(messages_messages.messages);
                sc0Var.getLocationController().markLiveLoactionsAsRead(sc0Var.e0);
                if (sc0Var.J0 == null) {
                    bc0 bc0Var = new bc0(sc0Var, 4);
                    sc0Var.J0 = bc0Var;
                    AndroidUtilities.runOnUIThread(bc0Var, 5000L);
                    return;
                }
                return;
            case 1:
                uv0 uv0Var = (uv0) this.c;
                long j11 = this.b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                uv0Var.getClass();
                Bundle bundle = new Bundle();
                if (j11 > 0) {
                    bundle.putLong("user_id", j11);
                } else {
                    bundle.putLong("chat_id", -j11);
                }
                o2Var.presentFragment(new ProfileActivity(bundle, null));
                uv0Var.c(false);
                return;
            case 2:
                qi.e eVar = (qi.e) this.c;
                qi.d dVar = (qi.d) this.d;
                long j12 = this.b;
                if (((qi.d) eVar.b) != dVar) {
                    return;
                }
                qi.b bVar = (qi.b) eVar.d;
                if (bVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    eVar.d = null;
                }
                synchronized (qi.i.y) {
                    try {
                        qi.i iVar = qi.i.A;
                        if (iVar != null) {
                            iVar.o();
                            qi.i.A = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                eVar.b = null;
                dVar.c.run(j12);
                eVar.D();
                return;
            case 3:
                cc.e eVar2 = (cc.e) this.c;
                long j13 = this.b;
                Exception exc = (Exception) this.d;
                ri.o oVar = (ri.o) eVar2.c;
                if (j13 != oVar.p) {
                    return;
                }
                oVar.o = null;
                ri.m mVar = oVar.n;
                if (mVar != ri.m.s && mVar != ri.m.r) {
                    oVar.g(exc);
                    return;
                }
                oVar.h.a("capture error after session end", exc);
                oVar.c();
                oVar.s();
                return;
            default:
                yh.o1 o1Var = (yh.o1) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                long j14 = this.b;
                o1Var.getClass();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                o1Var.dismiss();
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", j14);
                bundle2.putBoolean("open_gifts", true);
                U.presentFragment(new ProfileActivity(bundle2, null));
                return;
        }
    }

    public /* synthetic */ ec0(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }
}
