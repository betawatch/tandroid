package o2;

import k7.y;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                if (!super.b() || !y.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z4 = n2.a.a;
                if (k.b.b()) {
                    return l.a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (y.a("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
