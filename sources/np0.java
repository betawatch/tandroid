// default package

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class np0 implements i8c {
    public final /* synthetic */ byte a;

    public /* synthetic */ np0(byte b) {
        this.a = b;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList m = b1c.m();
                int size = m.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = m.get(i);
                    i++;
                    int i2 = hr0.b;
                    c4c K = c4c.K(hr0.class);
                    K.H = (u0c) obj3;
                    arrayList.add(K);
                }
                break;
            case 2:
                break;
            case 3:
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

    public /* synthetic */ np0(Object obj, byte b) {
        this.a = b;
    }
}
