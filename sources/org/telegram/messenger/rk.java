package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class rk implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ hp b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ long o;
    public final /* synthetic */ int p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ int r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;

    public /* synthetic */ rk(hp hpVar, int i3, int i10, long j10, long j11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j12, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.b = hpVar;
        this.c = i3;
        this.d = i10;
        this.e = j10;
        this.f = j11;
        this.g = i11;
        this.h = i12;
        this.i = i13;
        this.j = i14;
        this.k = i15;
        this.l = i16;
        this.m = i17;
        this.n = i18;
        this.o = j12;
        this.p = i19;
        this.q = z10;
        this.r = i20;
        this.s = z11;
        this.t = z12;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3;
        switch (this.a) {
            case 0:
                hp hpVar = this.b;
                hpVar.getClass();
                long j10 = this.e;
                long j11 = this.f;
                int i10 = this.c;
                int i11 = this.d;
                int i12 = this.g;
                int i13 = this.h;
                int i14 = this.i;
                int i15 = this.j;
                int i16 = this.k;
                int i17 = this.l;
                int i18 = this.m;
                int i19 = this.n;
                long j12 = this.o;
                int i20 = this.p;
                boolean z10 = this.q;
                int i21 = this.r;
                boolean z11 = this.s;
                boolean z12 = this.t;
                if (tLObject == null) {
                    if (tL_error != null && "SHORTCUT_INVALID".equals(tL_error.text)) {
                        hpVar.K3(new TLRPC.TL_messages_messages(), 0, j10, j11, i10, i11, i12, false, i13, i14, i15, i16, i17, i18, false, i19, j12, i20, z10, i21, z11, z12, null);
                        break;
                    }
                } else {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages instanceof TLRPC.TL_messages_messagesNotModified)) {
                        hpVar.K3(messages_messages, messages_messages.messages.size(), j10, j11, i10, i11, i12, false, i13, i14, i15, i16, i17, i18, false, i19, j12, i20, z10, i21, z11, z12, null);
                        break;
                    }
                }
                break;
            default:
                hp hpVar2 = this.b;
                hpVar2.getClass();
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages2 instanceof TLRPC.TL_messages_messagesNotModified)) {
                        int i22 = this.d;
                        if (i22 == 0 || messages_messages2.messages.isEmpty()) {
                            i3 = this.c;
                        } else {
                            i3 = ((TLRPC.Message) k2.p1.h(1, messages_messages2.messages)).id;
                            int size = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    TLRPC.Message message = messages_messages2.messages.get(size);
                                    if (message.date > i22) {
                                        i3 = message.id;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        hpVar2.K3(messages_messages2, messages_messages2.messages.size(), this.e, this.f, this.g, i3, i22, false, this.h, this.i, this.j, this.k, this.l, this.m, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ rk(hp hpVar, long j10, long j11, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j12, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.b = hpVar;
        this.e = j10;
        this.f = j11;
        this.c = i3;
        this.d = i10;
        this.g = i11;
        this.h = i12;
        this.i = i13;
        this.j = i14;
        this.k = i15;
        this.l = i16;
        this.m = i17;
        this.n = i18;
        this.o = j12;
        this.p = i19;
        this.q = z10;
        this.r = i20;
        this.s = z11;
        this.t = z12;
    }
}
