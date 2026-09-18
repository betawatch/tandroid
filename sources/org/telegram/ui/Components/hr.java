package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ mr b;
    public final /* synthetic */ ci.d c;

    public /* synthetic */ hr(mr mrVar, ci.d dVar, int i10) {
        this.a = i10;
        this.b = mrVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final mr mrVar = this.b;
                final ci.d dVar = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ir
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                mr mrVar2 = mrVar;
                                mrVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    mrVar2.b0 = groupcallstreamrtmpurl.url;
                                    mrVar2.c0 = groupcallstreamrtmpurl.key;
                                    mrVar2.d0 = new SpannableStringBuilder(mrVar2.c0);
                                    mrVar2.e0.N(true);
                                    break;
                                }
                                break;
                            default:
                                mr mrVar3 = mrVar;
                                mrVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    mrVar3.b0 = groupcallstreamrtmpurl2.url;
                                    mrVar3.c0 = groupcallstreamrtmpurl2.key;
                                    mrVar3.d0 = new SpannableStringBuilder(mrVar3.c0);
                                    mrVar3.e0.N(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final mr mrVar2 = this.b;
                final ci.d dVar2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ir
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                mr mrVar22 = mrVar2;
                                mrVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    mrVar22.b0 = groupcallstreamrtmpurl.url;
                                    mrVar22.c0 = groupcallstreamrtmpurl.key;
                                    mrVar22.d0 = new SpannableStringBuilder(mrVar22.c0);
                                    mrVar22.e0.N(true);
                                    break;
                                }
                                break;
                            default:
                                mr mrVar3 = mrVar2;
                                mrVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    mrVar3.b0 = groupcallstreamrtmpurl2.url;
                                    mrVar3.c0 = groupcallstreamrtmpurl2.key;
                                    mrVar3.d0 = new SpannableStringBuilder(mrVar3.c0);
                                    mrVar3.e0.N(true);
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
