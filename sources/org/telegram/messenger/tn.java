package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class tn implements RequestDelegate {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ tn(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
        this.d = i10;
        this.c = j10;
        this.f = j11;
        this.e = i11;
        this.g = z10;
        this.b = context;
        this.h = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                vp vpVar = (vp) this.b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.h;
                long j10 = this.c;
                if (j10 != 0) {
                    vpVar.getMessagesStorage().q1(j10);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i10 = tL_messages_affectedHistory.offset;
                    long j11 = this.f;
                    if (i10 > 0) {
                        vpVar.Y(j11, 0, this.d, this.e, this.g, inputPeer, 0L);
                    }
                    vpVar.J3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    hs messagesStorage = vpVar.getMessagesStorage();
                    messagesStorage.a.c(new cq(messagesStorage, j11, 5));
                    break;
                }
                break;
            case 1:
                vp vpVar2 = (vp) this.b;
                org.telegram.ui.lg lgVar = (org.telegram.ui.lg) this.h;
                if (tL_error != null) {
                    i0.g3(new a(lgVar, 26));
                    break;
                } else {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    vpVar2.J3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    vpVar2.getMessagesStorage().a.c(new bo(vpVar2, this.c, this.d, this.e, this.f, tL_messages_affectedHistory2, this.g, lgVar));
                    break;
                }
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.c, this.f, this.e, this.g, (Context) this.b, (String) this.h, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ tn(vp vpVar, long j10, int i10, int i11, long j11, boolean z10, org.telegram.ui.lg lgVar) {
        this.b = vpVar;
        this.c = j10;
        this.d = i10;
        this.e = i11;
        this.f = j11;
        this.g = z10;
        this.h = lgVar;
    }

    public /* synthetic */ tn(vp vpVar, long j10, long j11, int i10, int i11, boolean z10, TLRPC.InputPeer inputPeer) {
        this.b = vpVar;
        this.c = j10;
        this.f = j11;
        this.d = i10;
        this.e = i11;
        this.g = z10;
        this.h = inputPeer;
    }
}
