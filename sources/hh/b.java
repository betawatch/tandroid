package hh;

import android.graphics.RectF;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.is;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Utilities.Callback2 {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                RectF rectF = e.H;
                break;
            case 1:
                int i10 = is.G0;
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
