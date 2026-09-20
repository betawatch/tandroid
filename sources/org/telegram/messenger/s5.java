package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class s5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationController b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = locationController;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadSharingLocations$14(this.c);
                break;
            default:
                this.b.lambda$loadSharingLocations$15(this.c);
                break;
        }
    }
}
