package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cd0 b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ nc0(cd0 cd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = cd0Var;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cd0 cd0Var = this.b;
                IMapsProvider.IMapView iMapView = this.c;
                if (cd0Var.K != null && cd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        cd0Var.K.getMapAsync(new oc0(cd0Var, 0));
                        cd0Var.u0 = true;
                        if (cd0Var.v0) {
                            cd0Var.K.onResume();
                            break;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            default:
                cd0 cd0Var2 = this.b;
                IMapsProvider.IMapView iMapView2 = this.c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new nc0(cd0Var2, iMapView2, 0));
                break;
        }
    }
}
