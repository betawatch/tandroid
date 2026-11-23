package org.telegram.messenger.voip;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ long c;
    public final /* synthetic */ HashSet d;
    public final /* synthetic */ AtomicInteger e;
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;

    public /* synthetic */ y(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, String str, int i10) {
        this.a = i10;
        this.b = voIPService;
        this.c = j3;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f = i7;
        this.g = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$startConferenceGroupCall$51(this.c, this.d, this.e, this.f, this.g, tLObject, tL_error);
                break;
            default:
                this.b.lambda$startConferenceGroupCall$43(this.c, this.d, this.e, this.f, this.g, tLObject, tL_error);
                break;
        }
    }
}
