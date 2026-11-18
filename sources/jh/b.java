package jh;

import android.graphics.RectF;
import java.util.HashSet;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.yr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements q10 {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                RectF rectF = e.I;
                break;
            case 1:
                break;
            case 2:
                int i7 = mp.I8;
                break;
            case 3:
                int i10 = mp.I8;
                break;
            case 4:
                int i11 = yr.D2;
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
