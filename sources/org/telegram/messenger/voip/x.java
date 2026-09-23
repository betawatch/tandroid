package org.telegram.messenger.voip;

import java.util.HashSet;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
