package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class kd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
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
    public final /* synthetic */ TLObject u;

    public /* synthetic */ kd(MessagesController messagesController, int i9, int i10, int i11, int i12, int i13, long j10, long j11, int i14, int i15, int i16, int i17, int i18, long j12, int i19, boolean z10, int i20, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.a = 1;
        this.b = messagesController;
        this.c = i9;
        this.d = i10;
        this.e = i11;
        this.f = i12;
        this.g = i13;
        this.h = j10;
        this.i = j11;
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
        this.u = tL_messages_getReplies;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$loadMessagesInternal$178(this.h, this.c, this.d, this.e, this.i, this.f, this.g, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, (TLRPC.TL_messages_getSavedHistory) this.u, tLObject, tL_error);
                break;
            case 1:
                this.b.lambda$loadMessagesInternal$180(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, (TLRPC.TL_messages_getReplies) this.u, tLObject, tL_error);
                break;
            default:
                this.b.lambda$loadMessagesInternal$185(this.h, this.c, this.d, this.e, this.i, this.f, this.g, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, (TLRPC.TL_messages_getHistory) this.u, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ kd(MessagesController messagesController, long j10, int i9, int i10, int i11, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j12, int i19, boolean z10, int i20, boolean z11, boolean z12, TLObject tLObject, int i21) {
        this.a = i21;
        this.b = messagesController;
        this.h = j10;
        this.c = i9;
        this.d = i10;
        this.e = i11;
        this.i = j11;
        this.f = i12;
        this.g = i13;
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
        this.u = tLObject;
    }
}
