package org.telegram.messenger.voip;

import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ String f;

    public /* synthetic */ x(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i7) {
        this.a = i7;
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
