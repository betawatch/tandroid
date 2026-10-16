package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class il implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tl b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ il(tl tlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = tlVar;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tl.V(this.b, this.c);
                break;
            default:
                IMapsProvider.IMapView iMapView = this.c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new il(this.b, iMapView, 0));
                break;
        }
    }
}
