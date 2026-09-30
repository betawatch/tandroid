package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ il b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ xk(il ilVar, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = ilVar;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                il.S(this.b, this.c);
                break;
            default:
                IMapsProvider.IMapView iMapView = this.c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new xk(this.b, iMapView, 0));
                break;
        }
    }
}
