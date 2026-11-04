package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g60 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ g60(Context context, ei.k0 k0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, fc fcVar, org.telegram.messenger.video.d dVar, int i3) {
        this.b = context;
        this.e = k0Var;
        this.c = j10;
        this.f = bArr;
        this.g = aVar;
        this.h = fcVar;
        this.i = dVar;
        this.d = i3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new ii.b1((org.telegram.ui.ActionBar.s1) this.e, tLObject, (org.telegram.messenger.c) this.f, (m60) this.g, this.c, this.b, (org.telegram.ui.ActionBar.d2) this.h, this.d, (TLRPC.Peer) this.i));
                break;
            default:
                ei.k0 k0Var = (ei.k0) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.g;
                fc fcVar = (fc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.i;
                Context context = this.b;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.wx0(aVar, fcVar, context, k0Var, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            org.telegram.messenger.g0.i3(new org.telegram.ui.rw(aVar, fcVar, this.d, 12), 200L);
                            break;
                        }
                    } else {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.wx0(aVar, fcVar, context, k0Var, 0), 200L);
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.h3(new ci.w3(tLObject, context, k0Var, this.c, bArr, aVar, fcVar, dVar));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g60(org.telegram.ui.ActionBar.s1 s1Var, org.telegram.messenger.c cVar, m60 m60Var, long j10, Context context, org.telegram.ui.ActionBar.d2 d2Var, int i3, TLRPC.Peer peer) {
        this.e = s1Var;
        this.f = cVar;
        this.g = m60Var;
        this.c = j10;
        this.b = context;
        this.h = d2Var;
        this.d = i3;
        this.i = peer;
    }
}
