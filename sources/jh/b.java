package jh;

import android.graphics.RectF;
import java.util.HashSet;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                int i11 = kr.C2;
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
