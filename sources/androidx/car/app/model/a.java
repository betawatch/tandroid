package androidx.car.app.model;

import android.os.Binder;
import androidx.car.app.model.AlertCallbackDelegateImpl;
import androidx.car.app.model.OnClickDelegateImpl;
import androidx.car.app.model.OnContentRefreshDelegateImpl;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements s89 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Binder b;

    public /* synthetic */ a(Binder binder, byte b) {
        this.a = b;
        this.b = binder;
    }

    @Override // s89
    public final Object a() {
        Object lambda$onAlertDismissed$1;
        Object lambda$onClick$0;
        Object lambda$onContentRefreshRequested$0;
        byte b = this.a;
        Binder binder = this.b;
        switch (b) {
            case 0:
                lambda$onAlertDismissed$1 = ((AlertCallbackDelegateImpl.AlertCallbackStub) binder).lambda$onAlertDismissed$1();
                return lambda$onAlertDismissed$1;
            case 1:
                lambda$onClick$0 = ((OnClickDelegateImpl.OnClickListenerStub) binder).lambda$onClick$0();
                return lambda$onClick$0;
            default:
                lambda$onContentRefreshRequested$0 = ((OnContentRefreshDelegateImpl.OnContentRefreshListenerStub) binder).lambda$onContentRefreshRequested$0();
                return lambda$onContentRefreshRequested$0;
        }
    }
}
