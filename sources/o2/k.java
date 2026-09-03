package o2;

import k7.x;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class k extends b {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, String str, String str2) {
        super(2, str, str2);
        this.e = i10;
    }

    @Override // o2.c
    public final boolean b() {
        switch (this.e) {
            case 0:
                if (!super.b() || !x.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z4 = n2.b.a;
                if (l.b.b()) {
                    return m.a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (x.a("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
