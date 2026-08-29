package nh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class na implements o2 {
    public final /* synthetic */ gb a;

    public na(gb gbVar) {
        this.a = gbVar;
    }

    @Override // nh.o2
    public final void setInvert(float f9) {
        gb gbVar = this.a;
        AndroidUtilities.setLightNavigationBar(gbVar.n, f9 > 0.5f);
        AndroidUtilities.setLightStatusBar(gbVar.n, f9 > 0.5f);
    }

    @Override // nh.o2
    public final void invalidate() {
    }
}
