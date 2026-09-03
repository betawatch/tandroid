package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd0 b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ lc0(bd0 bd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = bd0Var;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bd0 bd0Var = this.b;
                IMapsProvider.IMapView iMapView = this.c;
                if (bd0Var.H != null && bd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        bd0Var.H.getMapAsync(new mc0(bd0Var, 0));
                        bd0Var.r0 = true;
                        if (bd0Var.s0) {
                            bd0Var.H.onResume();
                            break;
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                }
                break;
            default:
                bd0 bd0Var2 = this.b;
                IMapsProvider.IMapView iMapView2 = this.c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new lc0(bd0Var2, iMapView2, 0));
                break;
        }
    }
}
