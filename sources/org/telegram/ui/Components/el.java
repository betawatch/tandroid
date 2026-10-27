package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class el implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sl b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ el(sl slVar, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = slVar;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sl.U(this.b, this.c);
                break;
            default:
                IMapsProvider.IMapView iMapView = this.c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new el(this.b, iMapView, 0));
                break;
        }
    }
}
