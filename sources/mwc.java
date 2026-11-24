// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mwc extends cp {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mwc(String str, String str2, byte b) {
        super(str, str2, (byte) 2);
        this.e = b;
    }

    @Override // dp
    public final boolean b() {
        switch (this.e) {
            case 0:
                if (!super.b() || !nwc.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z = kwc.a;
                if (nwc.b.b()) {
                    return owc.a.getStatics().isMultiProcessEnabled();
                }
                rjb.j("This method is not supported by the current version of the framework and the current WebView APK");
                return false;
            default:
                if (nwc.a("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
