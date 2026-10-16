package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m80 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ m80(Context context, bi.s0 s0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, zc zcVar, org.telegram.messenger.video.d dVar, int i10) {
        this.b = context;
        this.e = s0Var;
        this.c = j10;
        this.f = bArr;
        this.g = aVar;
        this.h = zcVar;
        this.i = dVar;
        this.d = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fi.f1((org.telegram.ui.ActionBar.a2) this.e, tLObject, (AccountInstance) this.f, (t80) this.g, this.c, this.b, (org.telegram.ui.ActionBar.m2) this.h, this.d, (TLRPC.Peer) this.i));
                break;
            default:
                bi.s0 s0Var = (bi.s0) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.g;
                zc zcVar = (zc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.i;
                Context context = this.b;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.x31(aVar, zcVar, context, s0Var, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.c90(aVar, zcVar, this.d, 10), 200L);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.x31(aVar, zcVar, context, s0Var, 0), 200L);
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.iw(tLObject, context, s0Var, this.c, bArr, aVar, zcVar, dVar));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m80(org.telegram.ui.ActionBar.a2 a2Var, AccountInstance accountInstance, t80 t80Var, long j10, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer) {
        this.e = a2Var;
        this.f = accountInstance;
        this.g = t80Var;
        this.c = j10;
        this.b = context;
        this.h = m2Var;
        this.d = i10;
        this.i = peer;
    }
}
