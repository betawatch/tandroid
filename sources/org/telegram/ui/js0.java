package org.telegram.ui;

import android.graphics.Typeface;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class js0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback2Return, org.telegram.ui.Components.sv0, pg.h0, q3.g, q9.e, pa.a, q9.d, OnFailureListener, androidx.car.app.utils.b {
    public final /* synthetic */ int a;

    public /* synthetic */ js0(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration d(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info e(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // q9.d
    public Object G(cf.c cVar) {
        qa.d lambda$getComponents$0;
        switch (this.a) {
            case 22:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(cVar);
                return lambda$getComponents$0;
            default:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
        }
    }

    @Override // pg.h0
    public Typeface a() {
        switch (this.a) {
            case 13:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM);
            case 14:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC);
            case 15:
                return Typeface.create("serif", 1);
            case 16:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 17:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            default:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD);
        }
    }

    @Override // q9.e
    public List b(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // q3.g
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // androidx.car.app.utils.b
    public void call() {
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                b2Var.dismiss();
                break;
            case 1:
                b2Var.dismiss();
                break;
            case 2:
            case 5:
            default:
                b2Var.dismiss();
                break;
            case 3:
                b2Var.dismiss();
                break;
            case 4:
                b2Var.dismiss();
                break;
            case 6:
                b2Var.dismiss();
                break;
            case 7:
                b2Var.dismiss();
                break;
            case 8:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.sv0
    public void g(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i10 = qg.p2.r0;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return ((Integer) obj).intValue() == 0 ? yh.x7.X0(false, LocaleController.formatPluralStringComma("Stars", ((Integer) obj2).intValue()), 0.66f, null) : LocaleController.formatNumber(r4.intValue(), ',');
    }

    public /* synthetic */ js0(r.a aVar, int i10, w.b bVar) {
        this.a = 24;
    }

    @Override // pa.a
    public void j(pa.b bVar) {
    }

    @Override // org.telegram.ui.Components.sv0
    public /* synthetic */ void l() {
    }
}
