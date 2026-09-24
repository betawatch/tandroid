package androidx.car.app.model;

import androidx.car.app.model.SearchCallbackDelegateImpl;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements androidx.car.app.utils.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchCallbackDelegateImpl.SearchCallbackStub b;
    public final /* synthetic */ String c;

    public /* synthetic */ p0(SearchCallbackDelegateImpl.SearchCallbackStub searchCallbackStub, String str, int i10) {
        this.a = i10;
        this.b = searchCallbackStub;
        this.c = str;
    }

    @Override // androidx.car.app.utils.a
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
