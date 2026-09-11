package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class nd implements RequestDelegate {
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

    public /* synthetic */ nd(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.b = messagesController;
        this.c = i10;
        this.d = i11;
        this.e = j3;
        this.f = j10;
        this.g = i12;
        this.h = i13;
        this.i = i14;
        this.j = i15;
        this.k = i16;
        this.l = i17;
        this.m = i18;
        this.n = i19;
        this.o = j11;
        this.p = i20;
        this.q = z10;
        this.r = i21;
        this.s = z11;
        this.t = z12;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                boolean z10 = this.s;
                boolean z11 = this.t;
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
                this.b.lambda$loadMessagesInternal$176(this.e, this.f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.o, i20, this.q, i21, z10, z11, tLObject, tL_error);
                break;
            default:
                boolean z12 = this.s;
                boolean z13 = this.t;
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
                this.b.lambda$loadMessagesInternal$181(i22, i23, this.e, this.f, i24, i25, i26, i27, i28, i29, i30, i31, this.o, i32, this.q, i33, z12, z13, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ nd(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.b = messagesController;
        this.e = j3;
        this.f = j10;
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
        this.o = j11;
        this.p = i20;
        this.q = z10;
        this.r = i21;
        this.s = z11;
        this.t = z12;
    }
}
