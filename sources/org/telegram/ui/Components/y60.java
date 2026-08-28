package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y60 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ y60(Context context, ih.j0 j0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, oc ocVar, org.telegram.messenger.video.d dVar, int i9) {
        this.b = context;
        this.e = j0Var;
        this.c = j10;
        this.f = bArr;
        this.g = aVar;
        this.h = ocVar;
        this.i = dVar;
        this.d = i9;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mh.d1((org.telegram.ui.ActionBar.c2) this.e, tLObject, (AccountInstance) this.f, (e70) this.g, this.c, this.b, (org.telegram.ui.ActionBar.o2) this.h, this.d, (TLRPC.Peer) this.i));
                break;
            default:
                ih.j0 j0Var = (ih.j0) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.g;
                oc ocVar = (oc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.i;
                Context context = this.b;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.l21(aVar, ocVar, context, j0Var, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.jh0(aVar, ocVar, this.d, 9), 200L);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.l21(aVar, ocVar, context, j0Var, 0), 200L);
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new gh.b3(tLObject, context, j0Var, this.c, bArr, aVar, ocVar, dVar));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ y60(org.telegram.ui.ActionBar.c2 c2Var, AccountInstance accountInstance, e70 e70Var, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i9, TLRPC.Peer peer) {
        this.e = c2Var;
        this.f = accountInstance;
        this.g = e70Var;
        this.c = j10;
        this.b = context;
        this.h = o2Var;
        this.d = i9;
        this.i = peer;
    }
}
