package o2;

import i7.d0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j extends b {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i10, String str, String str2) {
        super(2, str, str2);
        this.e = i10;
    }

    @Override // o2.c
    public final boolean b() {
        switch (this.e) {
            case 0:
                if (!super.b() || !d0.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z10 = n2.c.a;
                if (k.b.b()) {
                    return l.a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (d0.a("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
