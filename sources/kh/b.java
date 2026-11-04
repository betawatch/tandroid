package kh;

import android.graphics.RectF;
import java.util.HashSet;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements n10 {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i3) {
        this.a = i3;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                RectF rectF = e.I;
                break;
            case 1:
                break;
            case 2:
                int i3 = hp.C8;
                break;
            case 3:
                int i10 = hp.C8;
                break;
            case 4:
                int i11 = lr.A2;
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
