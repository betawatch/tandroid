package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad0 b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ kc0(ad0 ad0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = ad0Var;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ad0 ad0Var = this.b;
                IMapsProvider.IMapView iMapView = this.c;
                if (ad0Var.H != null && ad0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        ad0Var.H.getMapAsync(new lc0(ad0Var, 0));
                        ad0Var.r0 = true;
                        if (ad0Var.s0) {
                            ad0Var.H.onResume();
                            break;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            default:
                ad0 ad0Var2 = this.b;
                IMapsProvider.IMapView iMapView2 = this.c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new kc0(ad0Var2, iMapView2, 0));
                break;
        }
    }
}
