package org.telegram.messenger.voip;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;

    public /* synthetic */ a0(MessagesController messagesController, HashMap hashMap, String str, a0.i iVar, long j3, int i10) {
        this.a = 2;
        this.b = messagesController;
        this.d = hashMap;
        this.g = str;
        this.e = iVar;
        this.c = j3;
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
                ((MessagesController) this.b).lambda$reloadWebPages$187((HashMap) this.d, this.g, (a0.i) this.e, this.c, this.f, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ a0(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.a = i11;
        this.b = voIPService;
        this.c = j3;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f = i10;
        this.g = str;
    }
}
