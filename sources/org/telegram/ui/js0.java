package org.telegram.ui;

import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class js0 implements org.telegram.ui.ActionBar.c2, Utilities.Callback2Return, org.telegram.ui.Components.dw0, OnFailureListener, q3.g, q9.e, pa.a, q9.d, androidx.car.app.utils.d {
    public final /* synthetic */ int a;

    public /* synthetic */ js0(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration c(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // q9.d
    public Object P1(bi.u6 u6Var) {
        qa.d lambda$getComponents$0;
        switch (this.a) {
            case 16:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(u6Var);
                return lambda$getComponents$0;
            case 24:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 25:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 26:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            default:
                q9.n nVar = ExecutorsRegistrar.a;
                return r9.j.a;
        }
    }

    @Override // q9.e
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // q3.g
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // androidx.car.app.utils.d
    public void call() {
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                d2Var.dismiss();
                break;
            case 2:
                d2Var.dismiss();
                break;
            case 3:
                d2Var.dismiss();
                break;
            case 5:
                d2Var.dismiss();
                break;
            case 6:
                d2Var.dismiss();
                break;
            case 7:
                d2Var.dismiss();
                break;
            case 8:
                d2Var.dismiss();
                break;
            case 17:
                d2Var.dismiss();
                break;
            default:
                d2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.dw0
    public void h(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i10 = pg.n2.r0;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return ((Integer) obj).intValue() == 0 ? xh.z7.X0(false, LocaleController.formatPluralStringComma("Stars", ((Integer) obj2).intValue()), 0.66f, null) : LocaleController.formatNumber(r4.intValue(), ',');
    }

    public /* synthetic */ js0(r.a aVar, int i10, w.b bVar) {
        this.a = 19;
    }

    @Override // pa.a
    public void j(pa.b bVar) {
    }

    @Override // org.telegram.ui.Components.dw0
    public /* synthetic */ void l() {
    }
}
