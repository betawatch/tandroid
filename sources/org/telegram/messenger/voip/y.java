package org.telegram.messenger.voip;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;

    public /* synthetic */ y(MessagesController messagesController, HashMap hashMap, String str, a0.h hVar, long j10, int i9) {
        this.a = 2;
        this.b = messagesController;
        this.d = hashMap;
        this.g = str;
        this.e = hVar;
        this.c = j10;
        this.f = i9;
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
                ((MessagesController) this.b).lambda$reloadWebPages$187((HashMap) this.d, this.g, (a0.h) this.e, this.c, this.f, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ y(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i9, String str, int i10) {
        this.a = i10;
        this.b = voIPService;
        this.c = j10;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f = i9;
        this.g = str;
    }
}
