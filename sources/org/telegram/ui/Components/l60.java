package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l60 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ l60(Context context, di.i0 i0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, hc hcVar, org.telegram.messenger.video.d dVar, int i7) {
        this.b = context;
        this.e = i0Var;
        this.c = j3;
        this.f = bArr;
        this.g = aVar;
        this.h = hcVar;
        this.i = dVar;
        this.d = i7;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new hi.a1((org.telegram.ui.ActionBar.u1) this.e, tLObject, (org.telegram.messenger.c) this.f, (r60) this.g, this.c, this.b, (org.telegram.ui.ActionBar.f2) this.h, this.d, (TLRPC.Peer) this.i));
                break;
            default:
                di.i0 i0Var = (di.i0) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.g;
                hc hcVar = (hc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.i;
                Context context = this.b;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.fy0(aVar, hcVar, context, i0Var, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            org.telegram.messenger.g0.i3(new org.telegram.ui.d10(aVar, hcVar, this.d, 11), 200L);
                            break;
                        }
                    } else {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.fy0(aVar, hcVar, context, i0Var, 0), 200L);
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.h3(new bi.m4(tLObject, context, i0Var, this.c, bArr, aVar, hcVar, dVar));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l60(org.telegram.ui.ActionBar.u1 u1Var, org.telegram.messenger.c cVar, r60 r60Var, long j3, Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.Peer peer) {
        this.e = u1Var;
        this.f = cVar;
        this.g = r60Var;
        this.c = j3;
        this.b = context;
        this.h = f2Var;
        this.d = i7;
        this.i = peer;
    }
}
