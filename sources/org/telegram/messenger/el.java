package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class el implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ vp b;
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

    public /* synthetic */ el(vp vpVar, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.b = vpVar;
        this.c = i10;
        this.d = i11;
        this.e = j10;
        this.f = j11;
        this.g = i12;
        this.h = i13;
        this.i = i14;
        this.j = i15;
        this.k = i16;
        this.l = i17;
        this.m = i18;
        this.n = i19;
        this.o = j12;
        this.p = i20;
        this.q = z10;
        this.r = i21;
        this.s = z11;
        this.t = z12;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        switch (this.a) {
            case 0:
                vp vpVar = this.b;
                vpVar.getClass();
                long j10 = this.e;
                long j11 = this.f;
                int i11 = this.c;
                int i12 = this.d;
                int i13 = this.g;
                int i14 = this.h;
                int i15 = this.i;
                int i16 = this.j;
                int i17 = this.k;
                int i18 = this.l;
                int i19 = this.m;
                int i20 = this.n;
                long j12 = this.o;
                int i21 = this.p;
                boolean z10 = this.q;
                int i22 = this.r;
                boolean z11 = this.s;
                boolean z12 = this.t;
                if (tLObject == null) {
                    if (tL_error != null && "SHORTCUT_INVALID".equals(tL_error.text)) {
                        vpVar.H3(new TLRPC.TL_messages_messages(), 0, j10, j11, i11, i12, i13, false, i14, i15, i16, i17, i18, i19, false, i20, j12, i21, z10, i22, z11, z12, null);
                        break;
                    }
                } else {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages instanceof TLRPC.TL_messages_messagesNotModified)) {
                        vpVar.H3(messages_messages, messages_messages.messages.size(), j10, j11, i11, i12, i13, false, i14, i15, i16, i17, i18, i19, false, i20, j12, i21, z10, i22, z11, z12, null);
                        break;
                    }
                }
                break;
            default:
                vp vpVar2 = this.b;
                vpVar2.getClass();
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages2 instanceof TLRPC.TL_messages_messagesNotModified)) {
                        int i23 = this.d;
                        if (i23 == 0 || messages_messages2.messages.isEmpty()) {
                            i10 = this.c;
                        } else {
                            i10 = ((TLRPC.Message) i0.a.g(1, messages_messages2.messages)).id;
                            int size = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    TLRPC.Message message = messages_messages2.messages.get(size);
                                    if (message.date > i23) {
                                        i10 = message.id;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        vpVar2.H3(messages_messages2, messages_messages2.messages.size(), this.e, this.f, this.g, i10, i23, false, this.h, this.i, this.j, this.k, this.l, this.m, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ el(vp vpVar, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.b = vpVar;
        this.e = j10;
        this.f = j11;
        this.c = i10;
        this.d = i11;
        this.g = i12;
        this.h = i13;
        this.i = i14;
        this.j = i15;
        this.k = i16;
        this.l = i17;
        this.m = i18;
        this.n = i19;
        this.o = j12;
        this.p = i20;
        this.q = z10;
        this.r = i21;
        this.s = z11;
        this.t = z12;
    }
}
