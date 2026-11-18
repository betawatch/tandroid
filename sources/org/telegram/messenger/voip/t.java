package org.telegram.messenger.voip;

import org.telegram.messenger.q10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;

    public /* synthetic */ t(VoIPService voIPService, int i7) {
        this.a = i7;
        this.b = voIPService;
    }

    @Override // org.telegram.messenger.q10
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
