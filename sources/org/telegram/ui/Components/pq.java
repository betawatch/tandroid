package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pq implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ tq b;
    public final /* synthetic */ gi.d c;

    public /* synthetic */ pq(tq tqVar, gi.d dVar, int i3) {
        this.a = i3;
        this.b = tqVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i3 = 0;
                final tq tqVar = this.b;
                final gi.d dVar = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.qq
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                tq tqVar2 = tqVar;
                                tqVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    tqVar2.U1 = groupcallstreamrtmpurl.url;
                                    tqVar2.V1 = groupcallstreamrtmpurl.key;
                                    tqVar2.W1 = new SpannableStringBuilder(tqVar2.V1);
                                    tqVar2.X1.O(true);
                                    break;
                                }
                                break;
                            default:
                                tq tqVar3 = tqVar;
                                tqVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    tqVar3.U1 = groupcallstreamrtmpurl2.url;
                                    tqVar3.V1 = groupcallstreamrtmpurl2.key;
                                    tqVar3.W1 = new SpannableStringBuilder(tqVar3.V1);
                                    tqVar3.X1.O(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final tq tqVar2 = this.b;
                final gi.d dVar2 = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.qq
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                tq tqVar22 = tqVar2;
                                tqVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    tqVar22.U1 = groupcallstreamrtmpurl.url;
                                    tqVar22.V1 = groupcallstreamrtmpurl.key;
                                    tqVar22.W1 = new SpannableStringBuilder(tqVar22.V1);
                                    tqVar22.X1.O(true);
                                    break;
                                }
                                break;
                            default:
                                tq tqVar3 = tqVar2;
                                tqVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    tqVar3.U1 = groupcallstreamrtmpurl2.url;
                                    tqVar3.V1 = groupcallstreamrtmpurl2.key;
                                    tqVar3.W1 = new SpannableStringBuilder(tqVar3.V1);
                                    tqVar3.X1.O(true);
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
