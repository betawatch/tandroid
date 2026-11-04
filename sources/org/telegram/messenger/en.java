package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class en implements RequestDelegate {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ en(Context context, int i3, long j10, String str, long j11, int i10, boolean z10) {
        this.d = i3;
        this.c = j10;
        this.f = j11;
        this.e = i10;
        this.g = z10;
        this.b = context;
        this.h = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                hp hpVar = (hp) this.b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.h;
                long j10 = this.c;
                if (j10 != 0) {
                    hpVar.getMessagesStorage().q1(j10);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i3 = tL_messages_affectedHistory.offset;
                    long j11 = this.f;
                    if (i3 > 0) {
                        hpVar.Y(j11, 0, this.d, this.e, this.g, inputPeer, 0L);
                    }
                    hpVar.M3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    qr messagesStorage = hpVar.getMessagesStorage();
                    messagesStorage.a.c(new op(messagesStorage, j11, 5));
                    break;
                }
                break;
            case 1:
                hp hpVar2 = (hp) this.b;
                org.telegram.ui.tf tfVar = (org.telegram.ui.tf) this.h;
                if (tL_error != null) {
                    g0.h3(new a(tfVar, 25));
                    break;
                } else {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    hpVar2.M3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    hpVar2.getMessagesStorage().a.c(new nn(hpVar2, this.c, this.d, this.e, this.f, tL_messages_affectedHistory2, this.g, tfVar));
                    break;
                }
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.c, this.f, this.e, this.g, (Context) this.b, (String) this.h, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ en(hp hpVar, long j10, int i3, int i10, long j11, boolean z10, org.telegram.ui.tf tfVar) {
        this.b = hpVar;
        this.c = j10;
        this.d = i3;
        this.e = i10;
        this.f = j11;
        this.g = z10;
        this.h = tfVar;
    }

    public /* synthetic */ en(hp hpVar, long j10, long j11, int i3, int i10, boolean z10, TLRPC.InputPeer inputPeer) {
        this.b = hpVar;
        this.c = j10;
        this.f = j11;
        this.d = i3;
        this.e = i10;
        this.g = z10;
        this.h = inputPeer;
    }
}
