package lh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class za implements q2 {
    public final /* synthetic */ sb a;

    public za(sb sbVar) {
        this.a = sbVar;
    }

    @Override // lh.q2
    public final void setInvert(float f10) {
        sb sbVar = this.a;
        AndroidUtilities.setLightNavigationBar(sbVar.n, f10 > 0.5f);
        AndroidUtilities.setLightStatusBar(sbVar.n, f10 > 0.5f);
    }

    @Override // lh.q2
    public final void invalidate() {
    }
}
