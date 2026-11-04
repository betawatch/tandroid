package org.telegram.messenger.voip;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.ib;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ cs b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;

    public /* synthetic */ w(hp hpVar, HashMap hashMap, String str, a0.h hVar, long j10, int i3) {
        this.a = 2;
        this.b = hpVar;
        this.d = hashMap;
        this.g = str;
        this.e = hVar;
        this.c = j10;
        this.f = i3;
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
                org.telegram.messenger.g0.h3(new ib((hp) this.b, (HashMap) this.d, this.g, tLObject, (a0.h) this.e, this.c, this.f));
                break;
        }
    }

    public /* synthetic */ w(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i3, String str, int i10) {
        this.a = i10;
        this.b = voIPService;
        this.c = j10;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f = i3;
        this.g = str;
    }
}
