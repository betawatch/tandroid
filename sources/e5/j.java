package e5;

import a8.q9;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                if (!super.b() || !q9.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z10 = d5.b.a;
                if (k.b.b()) {
                    return l.a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (q9.a("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
