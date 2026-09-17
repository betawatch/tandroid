package org.telegram.messenger.voip;

import java.util.HashSet;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ HashSet c;
    public final /* synthetic */ String d;

    public /* synthetic */ x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.a = i10;
        this.b = voIPService;
        this.c = hashSet;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$startConferenceGroupCall$42(this.c, this.d);
                break;
            default:
                this.b.lambda$startConferenceGroupCall$50(this.c, this.d);
                break;
        }
    }
}
