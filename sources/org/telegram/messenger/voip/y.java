package org.telegram.messenger.voip;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ob;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;

    public /* synthetic */ y(np npVar, HashMap hashMap, String str, a0.h hVar, long j3, int i7) {
        this.a = 2;
        this.b = npVar;
        this.d = hashMap;
        this.g = str;
        this.e = hVar;
        this.c = j3;
        this.f = i7;
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
                org.telegram.messenger.g0.h3(new ob((np) this.b, (HashMap) this.d, this.g, tLObject, (a0.h) this.e, this.c, this.f));
                break;
        }
    }

    public /* synthetic */ y(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, String str, int i10) {
        this.a = i10;
        this.b = voIPService;
        this.c = j3;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f = i7;
        this.g = str;
    }
}
