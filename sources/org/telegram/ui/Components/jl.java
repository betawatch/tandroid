package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class jl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ul b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ jl(ul ulVar, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = ulVar;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ul.V(this.b, this.c);
                break;
            default:
                IMapsProvider.IMapView iMapView = this.c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new jl(this.b, iMapView, 0));
                break;
        }
    }
}
