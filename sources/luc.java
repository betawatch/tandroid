// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class luc extends bo {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ luc(String str, String str2, byte b) {
        super(str, str2, (byte) 2);
        this.e = b;
    }

    @Override // co
    public final boolean b() {
        switch (this.e) {
            case 0:
                if (!super.b() || !muc.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z = juc.a;
                if (muc.b.b()) {
                    return nuc.a.getStatics().isMultiProcessEnabled();
                }
                fyb.i("This method is not supported by the current version of the framework and the current WebView APK");
                return false;
            default:
                if (muc.a("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
