package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class ti implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ AccountInstance c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int h;
    public final /* synthetic */ int n;
    public final /* synthetic */ long r;

    public /* synthetic */ ti(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i10, int i11, long j12, int i12) {
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
                SendMessagesHelper.lambda$prepareSendingText$129(this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r);
                break;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r);
                break;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r);
                break;
        }
    }
}
