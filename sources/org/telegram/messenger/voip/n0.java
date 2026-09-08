package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ int c;

    public /* synthetic */ n0(VoIPService voIPService, int i10, int i11) {
        this.a = i11;
        this.b = voIPService;
        this.c = i10;
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public void onStateUpdated(int i10, boolean z10) {
        this.b.lambda$createGroupInstance$80(this.c, i10, z10);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.RequestCurrentTimeCallback
    public void run(long j3) {
        this.b.lambda$createGroupInstance$79(this.c, j3);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.RequestBroadcastPartCallback
    public void run(long j3, long j10, int i10, int i11) {
        switch (this.a) {
            case 2:
                this.b.lambda$createGroupInstance$75(this.c, j3, j10, i10, i11);
                break;
            default:
                this.b.lambda$createGroupInstance$77(this.c, j3, j10, i10, i11);
                break;
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.VideoSourcesCallback
    public void run(long j3, int[] iArr) {
        this.b.lambda$createGroupInstance$70(this.c, j3, iArr);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.b.lambda$createGroupInstance$68(this.c, iArr, fArr, zArr);
    }
}
