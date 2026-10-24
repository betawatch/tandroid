package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rl b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ fl(rl rlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = rlVar;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rl.U(this.b, this.c);
                break;
            default:
                IMapsProvider.IMapView iMapView = this.c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new fl(this.b, iMapView, 0));
                break;
        }
    }
}
