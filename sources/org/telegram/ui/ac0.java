package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ac0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc0 b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ ac0(rc0 rc0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = rc0Var;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rc0 rc0Var = this.b;
                IMapsProvider.IMapView iMapView = this.c;
                if (rc0Var.K != null && rc0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        rc0Var.K.getMapAsync(new cc0(rc0Var, 0));
                        rc0Var.t0 = true;
                        if (rc0Var.u0) {
                            rc0Var.K.onResume();
                            break;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            default:
                rc0 rc0Var2 = this.b;
                IMapsProvider.IMapView iMapView2 = this.c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new ac0(rc0Var2, iMapView2, 0));
                break;
        }
    }
}
