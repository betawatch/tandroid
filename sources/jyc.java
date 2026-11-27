// default package

import org.telegram.tgnet.RequestTimeDelegate;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
