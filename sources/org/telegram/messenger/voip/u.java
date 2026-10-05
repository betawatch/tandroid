package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;

    public /* synthetic */ u(VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = voIPService;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
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
