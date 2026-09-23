package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class oc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd0 b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ oc0(dd0 dd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = dd0Var;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dd0 dd0Var = this.b;
                IMapsProvider.IMapView iMapView = this.c;
                if (dd0Var.K != null && dd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        dd0Var.K.getMapAsync(new pc0(dd0Var, 0));
                        dd0Var.u0 = true;
                        if (dd0Var.v0) {
                            dd0Var.K.onResume();
                            break;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            default:
                dd0 dd0Var2 = this.b;
                IMapsProvider.IMapView iMapView2 = this.c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new oc0(dd0Var2, iMapView2, 0));
                break;
        }
    }
}
