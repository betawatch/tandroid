package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class jd implements RequestDelegate {
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

    public /* synthetic */ jd(MessagesController messagesController, int i9, int i10, long j10, long j11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j12, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.b = messagesController;
        this.c = i9;
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
        switch (this.a) {
            case 0:
                boolean z10 = this.s;
                boolean z11 = this.t;
                int i9 = this.c;
                int i10 = this.d;
                int i11 = this.g;
                int i12 = this.h;
                int i13 = this.i;
                int i14 = this.j;
                int i15 = this.k;
                int i16 = this.l;
                int i17 = this.m;
                int i18 = this.n;
                int i19 = this.p;
                int i20 = this.r;
                this.b.lambda$loadMessagesInternal$176(this.e, this.f, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, this.o, i19, this.q, i20, z10, z11, tLObject, tL_error);
                break;
            default:
                boolean z12 = this.s;
                boolean z13 = this.t;
                int i21 = this.c;
                int i22 = this.d;
                int i23 = this.g;
                int i24 = this.h;
                int i25 = this.i;
                int i26 = this.j;
                int i27 = this.k;
                int i28 = this.l;
                int i29 = this.m;
                int i30 = this.n;
                int i31 = this.p;
                int i32 = this.r;
                this.b.lambda$loadMessagesInternal$181(i21, i22, this.e, this.f, i23, i24, i25, i26, i27, i28, i29, i30, this.o, i31, this.q, i32, z12, z13, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ jd(MessagesController messagesController, long j10, long j11, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j12, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.b = messagesController;
        this.e = j10;
        this.f = j11;
        this.c = i9;
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
