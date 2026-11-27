// default package

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class mlc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ mlc(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, byte b) {
        this.a = b;
        this.b = tLObject;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$51(this.b, this.c, this.d, this.e);
                break;
            default:
                VoIPService.lambda$startConferenceGroupCall$43(this.b, this.c, this.d, this.e);
                break;
        }
    }
}
