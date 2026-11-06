package e5;

import a8.n9;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                if (!super.b() || !n9.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z9 = d5.b.a;
                if (k.b.b()) {
                    return l.a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (n9.a("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
