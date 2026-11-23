package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class kn implements RequestDelegate {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ kn(Context context, int i7, long j3, String str, long j10, int i10, boolean z10) {
        this.d = i7;
        this.c = j3;
        this.f = j10;
        this.e = i10;
        this.g = z10;
        this.b = context;
        this.h = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                np npVar = (np) this.b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.h;
                long j3 = this.c;
                if (j3 != 0) {
                    npVar.getMessagesStorage().q1(j3);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j10 = this.f;
                    if (i7 > 0) {
                        npVar.Y(j10, 0, this.d, this.e, this.g, inputPeer, 0L);
                    }
                    npVar.T3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    ur messagesStorage = npVar.getMessagesStorage();
                    messagesStorage.a.c(new qp(messagesStorage, j10, 5));
                    break;
                }
                break;
            case 1:
                np npVar2 = (np) this.b;
                org.telegram.ui.vf vfVar = (org.telegram.ui.vf) this.h;
                if (tL_error != null) {
                    g0.g3(new a(vfVar, 26));
                    break;
                } else {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    npVar2.T3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    npVar2.getMessagesStorage().a.c(new un(npVar2, this.c, this.d, this.e, this.f, tL_messages_affectedHistory2, this.g, vfVar));
                    break;
                }
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.c, this.f, this.e, this.g, (Context) this.b, (String) this.h, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ kn(np npVar, long j3, int i7, int i10, long j10, boolean z10, org.telegram.ui.vf vfVar) {
        this.b = npVar;
        this.c = j3;
        this.d = i7;
        this.e = i10;
        this.f = j10;
        this.g = z10;
        this.h = vfVar;
    }

    public /* synthetic */ kn(np npVar, long j3, long j10, int i7, int i10, boolean z10, TLRPC.InputPeer inputPeer) {
        this.b = npVar;
        this.c = j3;
        this.f = j10;
        this.d = i7;
        this.e = i10;
        this.g = z10;
        this.h = inputPeer;
    }
}
