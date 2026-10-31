package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zq implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ cr b;
    public final /* synthetic */ vh.d c;

    public /* synthetic */ zq(cr crVar, vh.d dVar, int i10) {
        this.a = i10;
        this.b = crVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final cr crVar = this.b;
                final vh.d dVar = this.c;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.Components.ar
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                cr crVar2 = crVar;
                                crVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    crVar2.T1 = groupcallstreamrtmpurl.url;
                                    crVar2.U1 = groupcallstreamrtmpurl.key;
                                    crVar2.V1 = new SpannableStringBuilder(crVar2.U1);
                                    crVar2.W1.O(true);
                                    break;
                                }
                                break;
                            default:
                                cr crVar3 = crVar;
                                crVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    crVar3.T1 = groupcallstreamrtmpurl2.url;
                                    crVar3.U1 = groupcallstreamrtmpurl2.key;
                                    crVar3.V1 = new SpannableStringBuilder(crVar3.U1);
                                    crVar3.W1.O(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final cr crVar2 = this.b;
                final vh.d dVar2 = this.c;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.Components.ar
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                cr crVar22 = crVar2;
                                crVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    crVar22.T1 = groupcallstreamrtmpurl.url;
                                    crVar22.U1 = groupcallstreamrtmpurl.key;
                                    crVar22.V1 = new SpannableStringBuilder(crVar22.U1);
                                    crVar22.W1.O(true);
                                    break;
                                }
                                break;
                            default:
                                cr crVar3 = crVar2;
                                crVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    crVar3.T1 = groupcallstreamrtmpurl2.url;
                                    crVar3.U1 = groupcallstreamrtmpurl2.key;
                                    crVar3.V1 = new SpannableStringBuilder(crVar3.U1);
                                    crVar3.W1.O(true);
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
