package androidx.car.app.model;

import androidx.car.app.model.SearchCallbackDelegateImpl;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements q69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SearchCallbackDelegateImpl.SearchCallbackStub b;
    public final /* synthetic */ String c;

    public /* synthetic */ f(SearchCallbackDelegateImpl.SearchCallbackStub searchCallbackStub, String str, byte b) {
        this.a = b;
        this.b = searchCallbackStub;
        this.c = str;
    }

    @Override // q69
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
