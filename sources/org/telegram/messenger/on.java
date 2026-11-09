package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class on implements RequestDelegate {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ on(Context context, int i7, long j3, String str, long j10, int i10, boolean z9) {
        this.d = i7;
        this.c = j3;
        this.f = j10;
        this.e = i10;
        this.g = z9;
        this.b = context;
        this.h = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                qp qpVar = (qp) this.b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.h;
                long j3 = this.c;
                if (j3 != 0) {
                    qpVar.getMessagesStorage().q1(j3);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j10 = this.f;
                    if (i7 > 0) {
                        qpVar.Y(j10, 0, this.d, this.e, this.g, inputPeer, 0L);
                    }
                    qpVar.M3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    yr messagesStorage = qpVar.getMessagesStorage();
                    messagesStorage.a.c(new xp(messagesStorage, j10, 5));
                    break;
                }
                break;
            case 1:
                qp qpVar2 = (qp) this.b;
                org.telegram.ui.xf xfVar = (org.telegram.ui.xf) this.h;
                if (tL_error != null) {
                    g0.h3(new a(xfVar, 26));
                    break;
                } else {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    qpVar2.M3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    qpVar2.getMessagesStorage().a.c(new xn(qpVar2, this.c, this.d, this.e, this.f, tL_messages_affectedHistory2, this.g, xfVar));
                    break;
                }
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.c, this.f, this.e, this.g, (Context) this.b, (String) this.h, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ on(qp qpVar, long j3, int i7, int i10, long j10, boolean z9, org.telegram.ui.xf xfVar) {
        this.b = qpVar;
        this.c = j3;
        this.d = i7;
        this.e = i10;
        this.f = j10;
        this.g = z9;
        this.h = xfVar;
    }

    public /* synthetic */ on(qp qpVar, long j3, long j10, int i7, int i10, boolean z9, TLRPC.InputPeer inputPeer) {
        this.b = qpVar;
        this.c = j3;
        this.f = j10;
        this.d = i7;
        this.e = i10;
        this.g = z9;
        this.h = inputPeer;
    }
}
