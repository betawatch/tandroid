package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
