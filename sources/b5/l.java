package b5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class l extends b {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10, String str, String str2) {
        super(2, str, str2);
        this.e = i10;
    }

    @Override // b5.c
    public final boolean b() {
        switch (this.e) {
            case 0:
                if (!super.b() || !com.google.android.gms.internal.cast.o.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z10 = a5.c.a;
                if (m.b.b()) {
                    return n.a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (com.google.android.gms.internal.cast.o.a("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
