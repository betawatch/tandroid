// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class bzc extends co {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bzc(String str, String str2, byte b) {
        super(str, str2, (byte) 2);
        this.e = b;
    }

    @Override // eo
    public final boolean b() {
        switch (this.e) {
            case 0:
                if (!super.b() || !czc.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z = zyc.a;
                if (czc.b.b()) {
                    return dzc.a.getStatics().isMultiProcessEnabled();
                }
                qyc.c("This method is not supported by the current version of the framework and the current WebView APK");
                return false;
            default:
                if (czc.a("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
