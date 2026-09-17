package org.telegram.messenger.voip;

import java.util.ArrayList;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ String f;

    public /* synthetic */ y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.a = i10;
        this.b = voIPService;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$startConferenceGroupCall$47(this.c, this.d, this.e, this.f);
                break;
            default:
                this.b.lambda$startConferenceGroupCall$39(this.c, this.d, this.e, this.f);
                break;
        }
    }
}
