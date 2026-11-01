package org.telegram.messenger;

import android.graphics.RectF;
import java.util.HashSet;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class z1 implements k20 {
    public final /* synthetic */ int a;

    public /* synthetic */ z1(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                int i10 = wp.D8;
                break;
            case 2:
                int i11 = wp.D8;
                break;
            case 3:
                int i12 = org.telegram.ui.Components.vr.z2;
                break;
            case 4:
                Boolean bool = (Boolean) obj;
                HashSet<Long> hashSet = (HashSet) obj2;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.convertToConferenceCall(bool.booleanValue(), hashSet);
                    break;
                }
                break;
            default:
                RectF rectF = zg.d.H;
                break;
        }
    }
}
