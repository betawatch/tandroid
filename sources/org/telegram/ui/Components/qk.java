package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cl b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ qk(cl clVar, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = clVar;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cl.S(this.b, this.c);
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
