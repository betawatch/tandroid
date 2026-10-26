package c5;

import a8.v1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class l extends b {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10, String str, String str2) {
        super(2, str, str2);
        this.e = i10;
    }

    @Override // c5.c
    public final boolean b() {
        switch (this.e) {
            case 0:
                if (!super.b() || !v1.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z10 = b5.a.a;
                if (m.b.b()) {
                    return n.a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (v1.a("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
