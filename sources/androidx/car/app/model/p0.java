package androidx.car.app.model;

import androidx.car.app.model.SearchCallbackDelegateImpl;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements androidx.car.app.utils.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchCallbackDelegateImpl.SearchCallbackStub b;
    public final /* synthetic */ String c;

    public /* synthetic */ p0(SearchCallbackDelegateImpl.SearchCallbackStub searchCallbackStub, String str, int i10) {
        this.a = i10;
        this.b = searchCallbackStub;
        this.c = str;
    }

    @Override // androidx.car.app.utils.b
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
