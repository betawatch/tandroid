package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hl b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ wk(hl hlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = hlVar;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hl.S(this.b, this.c);
                break;
            default:
                IMapsProvider.IMapView iMapView = this.c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new wk(this.b, iMapView, 0));
                break;
        }
    }
}
