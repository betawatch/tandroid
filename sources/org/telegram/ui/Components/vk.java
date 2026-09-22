package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class vk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gl b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ vk(gl glVar, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = glVar;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gl.S(this.b, this.c);
                break;
            default:
                IMapsProvider.IMapView iMapView = this.c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new vk(this.b, iMapView, 0));
                break;
        }
    }
}
