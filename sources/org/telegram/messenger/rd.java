package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class rd implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MessagesController b;
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

    public /* synthetic */ rd(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11) {
        this.b = messagesController;
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
        this.q = z4;
        this.r = i21;
        this.s = z10;
        this.t = z11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                boolean z4 = this.s;
                boolean z10 = this.t;
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
                int i20 = this.p;
                int i21 = this.r;
                this.b.lambda$loadMessagesInternal$176(this.e, this.f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.o, i20, this.q, i21, z4, z10, tLObject, tL_error);
                break;
            default:
                boolean z11 = this.s;
                boolean z12 = this.t;
                int i22 = this.c;
                int i23 = this.d;
                int i24 = this.g;
                int i25 = this.h;
                int i26 = this.i;
                int i27 = this.j;
                int i28 = this.k;
                int i29 = this.l;
                int i30 = this.m;
                int i31 = this.n;
                int i32 = this.p;
                int i33 = this.r;
                this.b.lambda$loadMessagesInternal$181(i22, i23, this.e, this.f, i24, i25, i26, i27, i28, i29, i30, i31, this.o, i32, this.q, i33, z11, z12, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ rd(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11) {
        this.b = messagesController;
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
        this.q = z4;
        this.r = i21;
        this.s = z10;
        this.t = z11;
    }
}
