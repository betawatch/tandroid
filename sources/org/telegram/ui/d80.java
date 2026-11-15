package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class d80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d80(Object obj, long j3, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 0;
        switch (this.a) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                long j3 = this.b;
                w70 w70Var = (w70) this.d;
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new tp(launchActivity, org.telegram.messenger.vr.a0(launchActivity.P).j0(j3), w70Var, 19));
                return;
            case 1:
                pa0 pa0Var = (pa0) this.c;
                TLObject tLObject = (TLObject) this.d;
                long j10 = this.b;
                if (pa0Var.F == null) {
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
                pa0Var.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                pa0Var.getMessagesController().Y3(messages_messages.users, false);
                pa0Var.getMessagesController().S3(messages_messages.chats, false);
                pa0Var.getLocationController().c.k(messages_messages.messages, j10);
                pa0Var.getNotificationCenter().k(org.telegram.messenger.ns.F4, Long.valueOf(j10));
                pa0Var.p0(messages_messages.messages);
                pa0Var.getLocationController().j(pa0Var.m0);
                if (pa0Var.L0 == null) {
                    y90 y90Var = new y90(pa0Var, i7);
                    pa0Var.L0 = y90Var;
                    org.telegram.messenger.g0.i3(y90Var, 5000L);
                    return;
                }
                return;
            case 2:
                xr0 xr0Var = (xr0) this.c;
                long j11 = this.b;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d;
                xr0Var.getClass();
                Bundle bundle = new Bundle();
                if (j11 > 0) {
                    bundle.putLong("user_id", j11);
                } else {
                    bundle.putLong("chat_id", -j11);
                }
                e2Var.presentFragment(new ProfileActivity(bundle, null));
                xr0Var.c(false);
                return;
            case 3:
                xi.e eVar = (xi.e) this.c;
                xi.d dVar = (xi.d) this.d;
                long j12 = this.b;
                if (((xi.d) eVar.b) != dVar) {
                    return;
                }
                xi.b bVar = (xi.b) eVar.d;
                if (bVar != null) {
                    org.telegram.messenger.g0.r(bVar);
                    eVar.d = null;
                }
                synchronized (xi.i.y) {
                    try {
                        xi.i iVar = xi.i.A;
                        if (iVar != null) {
                            iVar.q();
                            xi.i.A = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                eVar.b = null;
                dVar.c.run(j12);
                eVar.G();
                return;
            default:
                ac.e eVar2 = (ac.e) this.c;
                long j13 = this.b;
                Exception exc = (Exception) this.d;
                yi.j jVar = (yi.j) eVar2.c;
                if (j13 != jVar.o) {
                    return;
                }
                jVar.n = null;
                int i11 = jVar.G;
                if (i11 != 10 && i11 != 9) {
                    jVar.g(exc);
                    return;
                }
                jVar.h.a("capture error after session end", exc);
                jVar.c();
                jVar.t();
                return;
        }
    }

    public /* synthetic */ d80(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }
}
