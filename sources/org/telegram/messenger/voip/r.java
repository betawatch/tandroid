package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;

    public /* synthetic */ r(VoIPService voIPService, int i10) {
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
