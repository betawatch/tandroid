package jh;

import android.graphics.RectF;
import java.util.HashSet;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements v10 {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                RectF rectF = e.H;
                break;
            case 1:
                break;
            case 2:
                int i7 = qp.C8;
                break;
            case 3:
                int i10 = qp.C8;
                break;
            case 4:
                int i11 = lr.z2;
                break;
            default:
                Boolean bool = (Boolean) obj;
                HashSet<Long> hashSet = (HashSet) obj2;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.convertToConferenceCall(bool.booleanValue(), hashSet);
                    break;
                }
                break;
        }
    }
}
