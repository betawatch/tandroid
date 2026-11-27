package androidx.car.app.model;

import androidx.car.app.model.SearchCallbackDelegateImpl;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements da9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SearchCallbackDelegateImpl.SearchCallbackStub b;
    public final /* synthetic */ String c;

    public /* synthetic */ f(SearchCallbackDelegateImpl.SearchCallbackStub searchCallbackStub, String str, byte b) {
        this.a = b;
        this.b = searchCallbackStub;
        this.c = str;
    }

    @Override // da9
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
