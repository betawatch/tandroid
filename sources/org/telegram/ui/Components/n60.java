package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class n60 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ n60(Context context, fi.i0 i0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, cc ccVar, org.telegram.messenger.video.d dVar, int i7) {
        this.b = context;
        this.e = i0Var;
        this.c = j3;
        this.f = bArr;
        this.g = aVar;
        this.h = ccVar;
        this.i = dVar;
        this.d = i7;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new ki.b1((org.telegram.ui.ActionBar.t1) this.e, tLObject, (org.telegram.messenger.c) this.f, (t60) this.g, this.c, this.b, (org.telegram.ui.ActionBar.e2) this.h, this.d, (TLRPC.Peer) this.i));
                break;
            default:
                fi.i0 i0Var = (fi.i0) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.g;
                cc ccVar = (cc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.i;
                Context context = this.b;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.dy0(aVar, ccVar, context, i0Var, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            org.telegram.messenger.g0.i3(new u11(aVar, ccVar, this.d, 14), 200L);
                            break;
                        }
                    } else {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.dy0(aVar, ccVar, context, i0Var, 0), 200L);
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.h3(new di.n3(tLObject, context, i0Var, this.c, bArr, aVar, ccVar, dVar));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n60(org.telegram.ui.ActionBar.t1 t1Var, org.telegram.messenger.c cVar, t60 t60Var, long j3, Context context, org.telegram.ui.ActionBar.e2 e2Var, int i7, TLRPC.Peer peer) {
        this.e = t1Var;
        this.f = cVar;
        this.g = t60Var;
        this.c = j3;
        this.b = context;
        this.h = e2Var;
        this.d = i7;
        this.i = peer;
    }
}
