package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ir implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ nr b;
    public final /* synthetic */ ci.d c;

    public /* synthetic */ ir(nr nrVar, ci.d dVar, int i10) {
        this.a = i10;
        this.b = nrVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final nr nrVar = this.b;
                final ci.d dVar = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.jr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                nr nrVar2 = nrVar;
                                nrVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    nrVar2.b0 = groupcallstreamrtmpurl.url;
                                    nrVar2.c0 = groupcallstreamrtmpurl.key;
                                    nrVar2.d0 = new SpannableStringBuilder(nrVar2.c0);
                                    nrVar2.e0.N(true);
                                    break;
                                }
                                break;
                            default:
                                nr nrVar3 = nrVar;
                                nrVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    nrVar3.b0 = groupcallstreamrtmpurl2.url;
                                    nrVar3.c0 = groupcallstreamrtmpurl2.key;
                                    nrVar3.d0 = new SpannableStringBuilder(nrVar3.c0);
                                    nrVar3.e0.N(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final nr nrVar2 = this.b;
                final ci.d dVar2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.jr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                nr nrVar22 = nrVar2;
                                nrVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    nrVar22.b0 = groupcallstreamrtmpurl.url;
                                    nrVar22.c0 = groupcallstreamrtmpurl.key;
                                    nrVar22.d0 = new SpannableStringBuilder(nrVar22.c0);
                                    nrVar22.e0.N(true);
                                    break;
                                }
                                break;
                            default:
                                nr nrVar3 = nrVar2;
                                nrVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    nrVar3.b0 = groupcallstreamrtmpurl2.url;
                                    nrVar3.c0 = groupcallstreamrtmpurl2.key;
                                    nrVar3.d0 = new SpannableStringBuilder(nrVar3.c0);
                                    nrVar3.e0.N(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
