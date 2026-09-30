package androidx.car.app.model;

import android.os.Binder;
import androidx.car.app.model.InputCallbackDelegateImpl;
import androidx.car.app.model.TabCallbackDelegateImpl;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements androidx.car.app.utils.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Binder b;
    public final /* synthetic */ String c;

    public /* synthetic */ p(Binder binder, String str, int i10) {
        this.a = i10;
        this.b = binder;
        this.c = str;
    }

    @Override // androidx.car.app.utils.a
    public final Object a() {
        Object lambda$onInputTextChanged$1;
        Object lambda$onInputSubmitted$0;
        Object lambda$onTabSelected$0;
        switch (this.a) {
            case 0:
                lambda$onInputTextChanged$1 = ((InputCallbackDelegateImpl.OnInputCallbackStub) this.b).lambda$onInputTextChanged$1(this.c);
                return lambda$onInputTextChanged$1;
            case 1:
                lambda$onInputSubmitted$0 = ((InputCallbackDelegateImpl.OnInputCallbackStub) this.b).lambda$onInputSubmitted$0(this.c);
                return lambda$onInputSubmitted$0;
            default:
                lambda$onTabSelected$0 = ((TabCallbackDelegateImpl.TabCallbackStub) this.b).lambda$onTabSelected$0(this.c);
                return lambda$onTabSelected$0;
        }
    }
}
