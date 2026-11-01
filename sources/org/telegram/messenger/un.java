package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class un implements RequestDelegate {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ un(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
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
                wp wpVar = (wp) this.b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.h;
                long j10 = this.c;
                if (j10 != 0) {
                    wpVar.getMessagesStorage().q1(j10);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i10 = tL_messages_affectedHistory.offset;
                    long j11 = this.f;
                    if (i10 > 0) {
                        wpVar.Y(j11, 0, this.d, this.e, this.g, inputPeer, 0L);
                    }
                    wpVar.J3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    is messagesStorage = wpVar.getMessagesStorage();
                    messagesStorage.a.c(new dq(messagesStorage, j11, 5));
                    break;
                }
                break;
            case 1:
                wp wpVar2 = (wp) this.b;
                org.telegram.ui.ng ngVar = (org.telegram.ui.ng) this.h;
                if (tL_error != null) {
                    i0.g3(new a(ngVar, 26));
                    break;
                } else {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    wpVar2.J3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    wpVar2.getMessagesStorage().a.c(new co(wpVar2, this.c, this.d, this.e, this.f, tL_messages_affectedHistory2, this.g, ngVar));
                    break;
                }
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.c, this.f, this.e, this.g, (Context) this.b, (String) this.h, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ un(wp wpVar, long j10, int i10, int i11, long j11, boolean z10, org.telegram.ui.ng ngVar) {
        this.b = wpVar;
        this.c = j10;
        this.d = i10;
        this.e = i11;
        this.f = j11;
        this.g = z10;
        this.h = ngVar;
    }

    public /* synthetic */ un(wp wpVar, long j10, long j11, int i10, int i11, boolean z10, TLRPC.InputPeer inputPeer) {
        this.b = wpVar;
        this.c = j10;
        this.f = j11;
        this.d = i10;
        this.e = i11;
        this.g = z10;
        this.h = inputPeer;
    }
}
