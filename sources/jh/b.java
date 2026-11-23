package jh;

import android.graphics.RectF;
import java.util.HashSet;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.as;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements r10 {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                RectF rectF = e.I;
                break;
            case 1:
                break;
            case 2:
                int i7 = np.I8;
                break;
            case 3:
                int i10 = np.I8;
                break;
            case 4:
                int i11 = as.D2;
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
