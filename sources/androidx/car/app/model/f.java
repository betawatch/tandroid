package androidx.car.app.model;

import android.os.Binder;
import androidx.car.app.model.AlertCallbackDelegateImpl;
import androidx.car.app.model.OnClickDelegateImpl;
import androidx.car.app.model.OnContentRefreshDelegateImpl;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements androidx.car.app.utils.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Binder b;

    public /* synthetic */ f(Binder binder, int i10) {
        this.a = i10;
        this.b = binder;
    }

    @Override // androidx.car.app.utils.c
    public final Object a() {
        Object lambda$onAlertDismissed$1;
        Object lambda$onClick$0;
        Object lambda$onContentRefreshRequested$0;
        switch (this.a) {
            case 0:
                lambda$onAlertDismissed$1 = ((AlertCallbackDelegateImpl.AlertCallbackStub) this.b).lambda$onAlertDismissed$1();
                return lambda$onAlertDismissed$1;
            case 1:
                lambda$onClick$0 = ((OnClickDelegateImpl.OnClickListenerStub) this.b).lambda$onClick$0();
                return lambda$onClick$0;
            default:
                lambda$onContentRefreshRequested$0 = ((OnContentRefreshDelegateImpl.OnContentRefreshListenerStub) this.b).lambda$onContentRefreshRequested$0();
                return lambda$onContentRefreshRequested$0;
        }
    }
}
