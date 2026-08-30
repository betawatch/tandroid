package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class sd implements RequestDelegate {
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

    public /* synthetic */ sd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.a = 1;
        this.b = messagesController;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = i13;
        this.g = i14;
        this.h = j10;
        this.i = j11;
        this.j = i15;
        this.k = i16;
        this.l = i17;
        this.m = i18;
        this.n = i19;
        this.o = j12;
        this.p = i20;
        this.q = z4;
        this.r = i21;
        this.s = z10;
        this.t = z11;
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

    public /* synthetic */ sd(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11, TLObject tLObject, int i22) {
        this.a = i22;
        this.b = messagesController;
        this.h = j10;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.i = j11;
        this.f = i13;
        this.g = i14;
        this.j = i15;
        this.k = i16;
        this.l = i17;
        this.m = i18;
        this.n = i19;
        this.o = j12;
        this.p = i20;
        this.q = z4;
        this.r = i21;
        this.s = z10;
        this.t = z11;
        this.u = tLObject;
    }
}
