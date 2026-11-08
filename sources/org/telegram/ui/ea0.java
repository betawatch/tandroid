package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ea0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ea0(Object obj, long j3, Object obj2, int i7) {
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
                pa0 pa0Var = (pa0) this.c;
                TLObject tLObject = (TLObject) this.d;
                long j3 = this.b;
                if (pa0Var.E == null) {
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
                pa0Var.getLocationController().c.k(messages_messages.messages, j3);
                pa0Var.getNotificationCenter().k(org.telegram.messenger.qs.F4, Long.valueOf(j3));
                pa0Var.p0(messages_messages.messages);
                pa0Var.getLocationController().j(pa0Var.l0);
                if (pa0Var.K0 == null) {
                    x90 x90Var = new x90(pa0Var, i7);
                    pa0Var.K0 = x90Var;
                    org.telegram.messenger.g0.i3(x90Var, 5000L);
                    return;
                }
                return;
            case 1:
                zr0 zr0Var = (zr0) this.c;
                long j10 = this.b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.d;
                zr0Var.getClass();
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                f2Var.presentFragment(new ProfileActivity(bundle, null));
                zr0Var.c(false);
                return;
            case 2:
                ui.e eVar = (ui.e) this.c;
                ui.d dVar = (ui.d) this.d;
                long j11 = this.b;
                if (((ui.d) eVar.c) != dVar) {
                    return;
                }
                ui.b bVar = (ui.b) eVar.e;
                if (bVar != null) {
                    org.telegram.messenger.g0.r(bVar);
                    eVar.e = null;
                }
                synchronized (ui.i.y) {
                    try {
                        ui.i iVar = ui.i.A;
                        if (iVar != null) {
                            iVar.q();
                            ui.i.A = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                eVar.c = null;
                dVar.c.run(j11);
                eVar.S();
                return;
            case 3:
                ac.e eVar2 = (ac.e) this.c;
                long j12 = this.b;
                Exception exc = (Exception) this.d;
                vi.h hVar = (vi.h) eVar2.c;
                if (j12 != hVar.o) {
                    return;
                }
                hVar.n = null;
                int i11 = hVar.G;
                if (i11 != 10 && i11 != 9) {
                    hVar.g(exc);
                    return;
                }
                hVar.h.a("capture error after session end", exc);
                hVar.c();
                hVar.t();
                return;
            default:
                zh.g1 g1Var = (zh.g1) this.c;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.d;
                long j13 = this.b;
                g1Var.getClass();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                g1Var.dismiss();
                if (c20Var != null) {
                    c20Var.a(Boolean.FALSE);
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", j13);
                bundle2.putBoolean("open_gifts", true);
                T.presentFragment(new ProfileActivity(bundle2, null));
                return;
        }
    }

    public /* synthetic */ ea0(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }
}
