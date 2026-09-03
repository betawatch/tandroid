package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cd0 b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ mc0(cd0 cd0Var, IMapsProvider.IMapView iMapView, int i10) {
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
                if (cd0Var.H != null && cd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        cd0Var.H.getMapAsync(new nc0(cd0Var, 0));
                        cd0Var.r0 = true;
                        if (cd0Var.s0) {
                            cd0Var.H.onResume();
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
                AndroidUtilities.runOnUIThread(new mc0(cd0Var2, iMapView2, 0));
                break;
        }
    }
}
