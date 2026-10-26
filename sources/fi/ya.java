package fi;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
