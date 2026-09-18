package org.telegram.messenger;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class pi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ AccountInstance c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int h;
    public final /* synthetic */ int n;
    public final /* synthetic */ long r;

    public /* synthetic */ pi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.a = i12;
        this.b = charSequence;
        this.c = accountInstance;
        this.d = j3;
        this.e = j10;
        this.f = z10;
        this.h = i10;
        this.n = i11;
        this.r = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r);
                break;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r);
                break;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r);
                break;
        }
    }
}
