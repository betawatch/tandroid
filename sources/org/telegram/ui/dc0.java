package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        switch (this.a) {
            case 0:
                rc0 rc0Var = (rc0) this.c;
                TLObject tLObject = (TLObject) this.d;
                long j10 = this.b;
                if (rc0Var.I == null) {
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
                rc0Var.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                rc0Var.getMessagesController().putUsers(messages_messages.users, false);
                rc0Var.getMessagesController().putChats(messages_messages.chats, false);
                rc0Var.getLocationController().locationsCache.k(messages_messages.messages, j10);
                rc0Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j10));
                rc0Var.j0(messages_messages.messages);
                rc0Var.getLocationController().markLiveLoactionsAsRead(rc0Var.e0);
                if (rc0Var.I0 == null) {
                    zb0 zb0Var = new zb0(rc0Var, 4);
                    rc0Var.I0 = zb0Var;
                    AndroidUtilities.runOnUIThread(zb0Var, 5000L);
                    return;
                }
                return;
            case 1:
                zv0 zv0Var = (zv0) this.c;
                long j11 = this.b;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.d;
                zv0Var.getClass();
                Bundle bundle = new Bundle();
                if (j11 > 0) {
                    bundle.putLong("user_id", j11);
                } else {
                    bundle.putLong("chat_id", -j11);
                }
                r2Var.presentFragment(new ProfileActivity(bundle, null));
                zv0Var.c(false);
                return;
            case 2:
                ti.e eVar = (ti.e) this.c;
                ti.d dVar = (ti.d) this.d;
                long j12 = this.b;
                if (((ti.d) eVar.c) != dVar) {
                    return;
                }
                ti.b bVar = (ti.b) eVar.e;
                if (bVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    eVar.e = null;
                }
                synchronized (ti.j.y) {
                    try {
                        ti.j jVar = ti.j.A;
                        if (jVar != null) {
                            jVar.o();
                            ti.j.A = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                eVar.c = null;
                dVar.c.run(j12);
                eVar.r();
                return;
            case 3:
                dc.e eVar2 = (dc.e) this.c;
                long j13 = this.b;
                Exception exc = (Exception) this.d;
                ui.o oVar = (ui.o) eVar2.c;
                if (j13 != oVar.p) {
                    return;
                }
                oVar.o = null;
                ui.m mVar = oVar.n;
                if (mVar != ui.m.s && mVar != ui.m.r) {
                    oVar.g(exc);
                    return;
                }
                oVar.h.a("capture error after session end", exc);
                oVar.c();
                oVar.s();
                return;
            default:
                zh.p1 p1Var = (zh.p1) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                long j14 = this.b;
                p1Var.getClass();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                p1Var.dismiss();
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

    public /* synthetic */ dc0(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }
}
