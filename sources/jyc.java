// default package

import org.telegram.tgnet.RequestTimeDelegate;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class jyc implements RequestTimeDelegate {
    public final /* synthetic */ lyc a;
    public final /* synthetic */ kyc b;

    public /* synthetic */ jyc(lyc lycVar, kyc kycVar) {
        this.a = lycVar;
        this.b = kycVar;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public final void run(long j) {
        hl.c3(new j5b((Object) this.a, (Object) this.b, j, (byte) 15));
    }
}
