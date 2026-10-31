package org.telegram.messenger.voip;

import org.telegram.messenger.j20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;

    public /* synthetic */ v(VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = voIPService;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.a) {
            case 0:
                this.b.lambda$switchToSpeaker$91(bool, bool2);
                break;
            default:
                this.b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                break;
        }
    }
}
