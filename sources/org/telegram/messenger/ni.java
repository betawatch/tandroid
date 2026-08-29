package org.telegram.messenger;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class ni implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ AccountInstance c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int h;
    public final /* synthetic */ int n;
    public final /* synthetic */ long r;

    public /* synthetic */ ni(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i10, int i11, long j12, int i12) {
        this.a = i12;
        this.b = charSequence;
        this.c = accountInstance;
        this.d = j10;
        this.e = j11;
        this.f = z10;
        this.h = i10;
        this.n = i11;
        this.r = j12;
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
