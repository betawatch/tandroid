package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc0 b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ dc0(tc0 tc0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = tc0Var;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tc0 tc0Var = this.b;
                IMapsProvider.IMapView iMapView = this.c;
                if (tc0Var.G != null && tc0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        tc0Var.G.getMapAsync(new ec0(tc0Var, 0));
                        tc0Var.q0 = true;
                        if (tc0Var.r0) {
                            tc0Var.G.onResume();
                            break;
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                }
                break;
            default:
                tc0 tc0Var2 = this.b;
                IMapsProvider.IMapView iMapView2 = this.c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new dc0(tc0Var2, iMapView2, 0));
                break;
        }
    }
}
