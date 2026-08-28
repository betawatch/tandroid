package org.telegram.ui.Components;

import android.graphics.RectF;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr implements Utilities.Callback2 {
    public final /* synthetic */ int a;

    public /* synthetic */ qr(int i9) {
        this.a = i9;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int i9 = wr.C0;
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                HashSet<Long> hashSet = (HashSet) obj2;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.convertToConferenceCall(bool.booleanValue(), hashSet);
                    break;
                }
                break;
            default:
                RectF rectF = pg.d.D;
                break;
        }
    }
}
