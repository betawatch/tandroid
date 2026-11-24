package androidx.car.app.model;

import androidx.car.app.model.SearchCallbackDelegateImpl;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements s89 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SearchCallbackDelegateImpl.SearchCallbackStub b;
    public final /* synthetic */ String c;

    public /* synthetic */ f(SearchCallbackDelegateImpl.SearchCallbackStub searchCallbackStub, String str, byte b) {
        this.a = b;
        this.b = searchCallbackStub;
        this.c = str;
    }

    @Override // s89
    public final Object a() {
        Object lambda$onSearchSubmitted$1;
        Object lambda$onSearchTextChanged$0;
        byte b = this.a;
        String str = this.c;
        SearchCallbackDelegateImpl.SearchCallbackStub searchCallbackStub = this.b;
        switch (b) {
            case 0:
                lambda$onSearchSubmitted$1 = searchCallbackStub.lambda$onSearchSubmitted$1(str);
                return lambda$onSearchSubmitted$1;
            default:
                lambda$onSearchTextChanged$0 = searchCallbackStub.lambda$onSearchTextChanged$0(str);
                return lambda$onSearchTextChanged$0;
        }
    }
}
