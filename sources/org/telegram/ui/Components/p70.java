package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class p70 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ p70(Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, xc xcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.b = context;
        this.e = a1Var;
        this.c = j3;
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
                AndroidUtilities.runOnUIThread(new ei.g1((org.telegram.ui.ActionBar.b2) this.e, tLObject, (AccountInstance) this.f, (v70) this.g, this.c, this.b, (org.telegram.ui.ActionBar.n2) this.h, this.d, (TLRPC.Peer) this.i));
                break;
            default:
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.g;
                xc xcVar = (xc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.i;
                Context context = this.b;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.j31(aVar, xcVar, context, a1Var, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.yl0(aVar, xcVar, this.d, 8), 200L);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.j31(aVar, xcVar, context, a1Var, 0), 200L);
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.bw(tLObject, context, a1Var, this.c, bArr, aVar, xcVar, dVar));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p70(org.telegram.ui.ActionBar.b2 b2Var, AccountInstance accountInstance, v70 v70Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.e = b2Var;
        this.f = accountInstance;
        this.g = v70Var;
        this.c = j3;
        this.b = context;
        this.h = n2Var;
        this.d = i10;
        this.i = peer;
    }
}
