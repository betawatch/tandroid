package e5;

import a8.p9;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class j extends b {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i7, String str, String str2) {
        super(2, str, str2);
        this.e = i7;
    }

    @Override // e5.c
    public final boolean b() {
        switch (this.e) {
            case 0:
                if (!super.b() || !p9.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z10 = d5.b.a;
                if (k.b.b()) {
                    return l.a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (p9.a("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
