package fi;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class ya implements p2 {
    public final /* synthetic */ sb a;

    public ya(sb sbVar) {
        this.a = sbVar;
    }

    @Override // fi.p2
    public final void setInvert(float f7) {
        sb sbVar = this.a;
        AndroidUtilities.setLightNavigationBar(sbVar.n, f7 > 0.5f);
        AndroidUtilities.setLightStatusBar(sbVar.n, f7 > 0.5f);
    }

    @Override // fi.p2
    public final void invalidate() {
    }
}
