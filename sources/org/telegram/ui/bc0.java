package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bc0(Object obj, long j10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pc0 pc0Var = (pc0) this.c;
                TLObject tLObject = (TLObject) this.d;
                long j10 = this.b;
                if (pc0Var.I == null) {
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
                pc0Var.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                pc0Var.getMessagesController().putUsers(messages_messages.users, false);
                pc0Var.getMessagesController().putChats(messages_messages.chats, false);
                pc0Var.getLocationController().locationsCache.k(messages_messages.messages, j10);
                pc0Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j10));
                pc0Var.j0(messages_messages.messages);
                pc0Var.getLocationController().markLiveLoactionsAsRead(pc0Var.e0);
                if (pc0Var.I0 == null) {
                    xb0 xb0Var = new xb0(pc0Var, 4);
                    pc0Var.I0 = xb0Var;
                    AndroidUtilities.runOnUIThread(xb0Var, 5000L);
                    return;
                }
                return;
            case 1:
                xv0 xv0Var = (xv0) this.c;
                long j11 = this.b;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.d;
                xv0Var.getClass();
                Bundle bundle = new Bundle();
                if (j11 > 0) {
                    bundle.putLong("user_id", j11);
                } else {
                    bundle.putLong("chat_id", -j11);
                }
                r2Var.presentFragment(new ProfileActivity(bundle, null));
                xv0Var.c(false);
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

    public /* synthetic */ bc0(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }
}
