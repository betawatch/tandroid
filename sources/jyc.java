// default package

import org.telegram.tgnet.RequestTimeDelegate;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
        hl.c3(new z5b(this.a, this.b, j, (byte) 14));
    }
}
