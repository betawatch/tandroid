package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jl b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ yk(jl jlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = jlVar;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jl.Q(this.b, this.c);
                break;
            default:
                IMapsProvider.IMapView iMapView = this.c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new yk(this.b, iMapView, 0));
                break;
        }
    }
}
