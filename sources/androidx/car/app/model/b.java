package androidx.car.app.model;

import android.os.Binder;
import androidx.car.app.model.AlertCallbackDelegateImpl;
import androidx.car.app.model.OnSelectedDelegateImpl;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements s89 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Binder c;

    public /* synthetic */ b(Binder binder, int i, byte b) {
        this.a = b;
        this.c = binder;
        this.b = i;
    }

    @Override // s89
    public final Object a() {
        Object lambda$onAlertCancelled$0;
        Object lambda$onSelected$0;
        byte b = this.a;
        int i = this.b;
        Binder binder = this.c;
        switch (b) {
            case 0:
                lambda$onAlertCancelled$0 = ((AlertCallbackDelegateImpl.AlertCallbackStub) binder).lambda$onAlertCancelled$0(i);
                return lambda$onAlertCancelled$0;
            default:
                lambda$onSelected$0 = ((OnSelectedDelegateImpl.OnSelectedListenerStub) binder).lambda$onSelected$0(i);
                return lambda$onSelected$0;
        }
    }
}
