package org.telegram.messenger.voip;

import java.util.HashSet;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ HashSet c;
    public final /* synthetic */ String d;

    public /* synthetic */ w(VoIPService voIPService, HashSet hashSet, String str, int i10) {
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
