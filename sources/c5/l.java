package c5;

import a8.v1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
