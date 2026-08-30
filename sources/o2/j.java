package o2;

import k7.x;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                if (!super.b() || !x.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z4 = n2.c.a;
                if (k.b.b()) {
                    return l.a.getStatics().isMultiProcessEnabled();
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
