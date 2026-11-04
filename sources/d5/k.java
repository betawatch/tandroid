package d5;

import b8.p9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k extends b {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i3, String str, String str2) {
        super(2, str, str2);
        this.e = i3;
    }

    @Override // d5.c
    public final boolean b() {
        switch (this.e) {
            case 0:
                if (!super.b() || !p9.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z10 = c5.a.a;
                if (l.b.b()) {
                    return m.a.getStatics().isMultiProcessEnabled();
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
