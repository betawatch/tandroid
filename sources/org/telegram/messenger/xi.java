package org.telegram.messenger;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class xi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ AccountInstance c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int h;
    public final /* synthetic */ int n;
    public final /* synthetic */ long r;

    public /* synthetic */ xi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
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
