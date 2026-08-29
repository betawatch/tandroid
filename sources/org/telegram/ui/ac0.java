package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                if (rc0Var.G != null && rc0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        rc0Var.G.getMapAsync(new bc0(rc0Var, 0));
                        rc0Var.q0 = true;
                        if (rc0Var.r0) {
                            rc0Var.G.onResume();
                            break;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
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
