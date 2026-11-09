package androidx.car.app.model;

import androidx.car.app.model.SearchCallbackDelegateImpl;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements androidx.car.app.utils.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchCallbackDelegateImpl.SearchCallbackStub b;
    public final /* synthetic */ String c;

    public /* synthetic */ p0(SearchCallbackDelegateImpl.SearchCallbackStub searchCallbackStub, String str, int i7) {
        this.a = i7;
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
