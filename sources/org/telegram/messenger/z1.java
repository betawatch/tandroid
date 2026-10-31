package org.telegram.messenger;

import android.graphics.RectF;
import java.util.HashSet;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class z1 implements j20 {
    public final /* synthetic */ int a;

    public /* synthetic */ z1(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                int i10 = vp.D8;
                break;
            case 2:
                int i11 = vp.D8;
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
