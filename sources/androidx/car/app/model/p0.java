package androidx.car.app.model;

import androidx.car.app.model.SearchCallbackDelegateImpl;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements androidx.car.app.utils.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchCallbackDelegateImpl.SearchCallbackStub b;
    public final /* synthetic */ String c;

    public /* synthetic */ p0(SearchCallbackDelegateImpl.SearchCallbackStub searchCallbackStub, String str, int i9) {
        this.a = i9;
        this.b = searchCallbackStub;
        this.c = str;
    }

    @Override // androidx.car.app.utils.d
    public final Object a() {
        Object lambda$onSearchSubmitted$1;
        Object lambda$onSearchTextChanged$0;
        switch (this.a) {
            case 0:
                lambda$onSearchSubmitted$1 = this.b.lambda$onSearchSubmitted$1(this.c);
                return lambda$onSearchSubmitted$1;
            default:
                lambda$onSearchTextChanged$0 = this.b.lambda$onSearchTextChanged$0(this.c);
                return lambda$onSearchTextChanged$0;
        }
    }
}
