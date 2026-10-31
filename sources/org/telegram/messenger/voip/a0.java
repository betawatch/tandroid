package org.telegram.messenger.voip;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.qb;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ us b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;

    public /* synthetic */ a0(vp vpVar, HashMap hashMap, String str, a0.h hVar, long j10, int i10) {
        this.a = 2;
        this.b = vpVar;
        this.d = hashMap;
        this.g = str;
        this.e = hVar;
        this.c = j10;
        this.f = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$51(this.c, (HashSet) this.d, (AtomicInteger) this.e, this.f, this.g, tLObject, tL_error);
                break;
            case 1:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$43(this.c, (HashSet) this.d, (AtomicInteger) this.e, this.f, this.g, tLObject, tL_error);
                break;
            default:
                org.telegram.messenger.i0.g3(new qb((vp) this.b, (HashMap) this.d, this.g, tLObject, (a0.h) this.e, this.c, this.f));
                break;
        }
    }

    public /* synthetic */ a0(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.a = i11;
        this.b = voIPService;
        this.c = j10;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f = i10;
        this.g = str;
    }
}
