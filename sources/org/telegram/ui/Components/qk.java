package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bl b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ qk(bl blVar, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = blVar;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bl.S(this.b, this.c);
                break;
            default:
                IMapsProvider.IMapView iMapView = this.c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new qk(this.b, iMapView, 0));
                break;
        }
    }
}
