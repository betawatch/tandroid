// default package

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class nq0 implements jac {
    public final /* synthetic */ byte a;

    public /* synthetic */ nq0(byte b) {
        this.a = b;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList m = b3c.m();
                int size = m.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = m.get(i);
                    i++;
                    int i2 = hs0.b;
                    c6c K = c6c.K(hs0.class);
                    K.H = (u2c) obj3;
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

    public /* synthetic */ nq0(Object obj, byte b) {
        this.a = b;
    }
}
