package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vr implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ as b;
    public final /* synthetic */ di.d c;

    public /* synthetic */ vr(as asVar, di.d dVar, int i10) {
        this.a = i10;
        this.b = asVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final as asVar = this.b;
                final di.d dVar = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.wr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                as asVar2 = asVar;
                                asVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    asVar2.b0 = groupcallstreamrtmpurl.url;
                                    asVar2.c0 = groupcallstreamrtmpurl.key;
                                    asVar2.d0 = new SpannableStringBuilder(asVar2.c0);
                                    asVar2.e0.N(true);
                                    break;
                                }
                                break;
                            default:
                                as asVar3 = asVar;
                                asVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    asVar3.b0 = groupcallstreamrtmpurl2.url;
                                    asVar3.c0 = groupcallstreamrtmpurl2.key;
                                    asVar3.d0 = new SpannableStringBuilder(asVar3.c0);
                                    asVar3.e0.N(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final as asVar2 = this.b;
                final di.d dVar2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.wr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                as asVar22 = asVar2;
                                asVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    asVar22.b0 = groupcallstreamrtmpurl.url;
                                    asVar22.c0 = groupcallstreamrtmpurl.key;
                                    asVar22.d0 = new SpannableStringBuilder(asVar22.c0);
                                    asVar22.e0.N(true);
                                    break;
                                }
                                break;
                            default:
                                as asVar3 = asVar2;
                                asVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    asVar3.b0 = groupcallstreamrtmpurl2.url;
                                    asVar3.c0 = groupcallstreamrtmpurl2.key;
                                    asVar3.d0 = new SpannableStringBuilder(asVar3.c0);
                                    asVar3.e0.N(true);
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
