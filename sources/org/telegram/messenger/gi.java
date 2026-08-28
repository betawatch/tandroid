package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class gi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ AccountInstance c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int h;
    public final /* synthetic */ int n;
    public final /* synthetic */ long r;

    public /* synthetic */ gi(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i9, int i10, long j12, int i11) {
        this.a = i11;
        this.b = charSequence;
        this.c = accountInstance;
        this.d = j10;
        this.e = j11;
        this.f = z10;
        this.h = i9;
        this.n = i10;
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
