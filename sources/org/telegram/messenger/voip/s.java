package org.telegram.messenger.voip;

import org.telegram.messenger.v10;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;

    public /* synthetic */ s(VoIPService voIPService, int i7) {
        this.a = i7;
        this.b = voIPService;
    }

    @Override // org.telegram.messenger.v10
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
