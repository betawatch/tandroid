package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ok implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ al b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ ok(al alVar, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = alVar;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                al.S(this.b, this.c);
                break;
            default:
                IMapsProvider.IMapView iMapView = this.c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new ok(this.b, iMapView, 0));
                break;
        }
    }
}
