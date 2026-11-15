package jh;

import android.graphics.RectF;
import java.util.HashSet;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements s10 {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                RectF rectF = e.I;
                break;
            case 1:
                break;
            case 2:
                int i7 = np.D8;
                break;
            case 3:
                int i10 = np.D8;
                break;
            case 4:
                int i11 = rr.D2;
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
