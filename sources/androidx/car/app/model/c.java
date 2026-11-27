package androidx.car.app.model;

import android.os.Binder;
import androidx.car.app.model.InputCallbackDelegateImpl;
import androidx.car.app.model.TabCallbackDelegateImpl;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements da9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Binder b;
    public final /* synthetic */ String c;

    public /* synthetic */ c(Binder binder, String str, byte b) {
        this.a = b;
        this.b = binder;
        this.c = str;
    }

    @Override // da9
    public final Object a() {
        Object lambda$onInputTextChanged$1;
        Object lambda$onInputSubmitted$0;
        Object lambda$onTabSelected$0;
        byte b = this.a;
        String str = this.c;
        Binder binder = this.b;
        switch (b) {
            case 0:
                lambda$onInputTextChanged$1 = ((InputCallbackDelegateImpl.OnInputCallbackStub) binder).lambda$onInputTextChanged$1(str);
                return lambda$onInputTextChanged$1;
            case 1:
                lambda$onInputSubmitted$0 = ((InputCallbackDelegateImpl.OnInputCallbackStub) binder).lambda$onInputSubmitted$0(str);
                return lambda$onInputSubmitted$0;
            default:
                lambda$onTabSelected$0 = ((TabCallbackDelegateImpl.TabCallbackStub) binder).lambda$onTabSelected$0(str);
                return lambda$onTabSelected$0;
        }
    }
}
