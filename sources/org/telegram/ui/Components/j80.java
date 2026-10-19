package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class j80 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ j80(Context context, ci.k0 k0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, xc xcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.b = context;
        this.e = k0Var;
        this.c = j10;
        this.f = bArr;
        this.g = aVar;
        this.h = xcVar;
        this.i = dVar;
        this.d = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gi.d1((org.telegram.ui.ActionBar.b2) this.e, tLObject, (AccountInstance) this.f, (p80) this.g, this.c, this.b, (org.telegram.ui.ActionBar.n2) this.h, this.d, (TLRPC.Peer) this.i));
                break;
            default:
                ci.k0 k0Var = (ci.k0) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.g;
                xc xcVar = (xc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.i;
                Context context = this.b;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.d21(aVar, xcVar, context, k0Var, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            AndroidUtilities.runOnUIThread(new x31(aVar, xcVar, this.d, 14), 200L);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.d21(aVar, xcVar, context, k0Var, 0), 200L);
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new ai.q4(tLObject, context, k0Var, this.c, bArr, aVar, xcVar, dVar));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j80(org.telegram.ui.ActionBar.b2 b2Var, AccountInstance accountInstance, p80 p80Var, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.e = b2Var;
        this.f = accountInstance;
        this.g = p80Var;
        this.c = j10;
        this.b = context;
        this.h = n2Var;
        this.d = i10;
        this.i = peer;
    }
}
