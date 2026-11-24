// default package

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class khc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ String f;

    public /* synthetic */ khc(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.f;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.d;
        ArrayList arrayList3 = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$startConferenceGroupCall$50(arrayList3, arrayList2, arrayList, str);
                break;
            default:
                voIPService.lambda$startConferenceGroupCall$42(arrayList3, arrayList2, arrayList, str);
                break;
        }
    }
}
