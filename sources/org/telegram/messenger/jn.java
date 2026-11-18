package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class jn implements RequestDelegate {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ jn(Context context, int i7, long j3, String str, long j10, int i10, boolean z10) {
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
                mp mpVar = (mp) this.b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.h;
                long j3 = this.c;
                if (j3 != 0) {
                    mpVar.getMessagesStorage().q1(j3);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j10 = this.f;
                    if (i7 > 0) {
                        mpVar.Y(j10, 0, this.d, this.e, this.g, inputPeer, 0L);
                    }
                    mpVar.T3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    tr messagesStorage = mpVar.getMessagesStorage();
                    messagesStorage.a.c(new pp(messagesStorage, j10, 5));
                    break;
                }
                break;
            case 1:
                mp mpVar2 = (mp) this.b;
                org.telegram.ui.vf vfVar = (org.telegram.ui.vf) this.h;
                if (tL_error != null) {
                    g0.g3(new a(vfVar, 26));
                    break;
                } else {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    mpVar2.T3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    mpVar2.getMessagesStorage().a.c(new tn(mpVar2, this.c, this.d, this.e, this.f, tL_messages_affectedHistory2, this.g, vfVar));
                    break;
                }
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.c, this.f, this.e, this.g, (Context) this.b, (String) this.h, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ jn(mp mpVar, long j3, int i7, int i10, long j10, boolean z10, org.telegram.ui.vf vfVar) {
        this.b = mpVar;
        this.c = j3;
        this.d = i7;
        this.e = i10;
        this.f = j10;
        this.g = z10;
        this.h = vfVar;
    }

    public /* synthetic */ jn(mp mpVar, long j3, long j10, int i7, int i10, boolean z10, TLRPC.InputPeer inputPeer) {
        this.b = mpVar;
        this.c = j3;
        this.f = j10;
        this.d = i7;
        this.e = i10;
        this.g = z10;
        this.h = inputPeer;
    }
}
