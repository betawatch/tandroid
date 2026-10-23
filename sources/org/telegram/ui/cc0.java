package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sc0 b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ cc0(sc0 sc0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = sc0Var;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sc0 sc0Var = this.b;
                IMapsProvider.IMapView iMapView = this.c;
                if (sc0Var.K != null && sc0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        sc0Var.K.getMapAsync(new dc0(sc0Var, 0));
                        sc0Var.u0 = true;
                        if (sc0Var.v0) {
                            sc0Var.K.onResume();
                            break;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            default:
                sc0 sc0Var2 = this.b;
                IMapsProvider.IMapView iMapView2 = this.c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new cc0(sc0Var2, iMapView2, 0));
                break;
        }
    }
}
