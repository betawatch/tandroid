package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ sq b;
    public final /* synthetic */ fi.d c;

    public /* synthetic */ oq(sq sqVar, fi.d dVar, int i7) {
        this.a = i7;
        this.b = sqVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final sq sqVar = this.b;
                final fi.d dVar = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.pq
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                sq sqVar2 = sqVar;
                                sqVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    sqVar2.W1 = groupcallstreamrtmpurl.url;
                                    sqVar2.X1 = groupcallstreamrtmpurl.key;
                                    sqVar2.Y1 = new SpannableStringBuilder(sqVar2.X1);
                                    sqVar2.Z1.O(true);
                                    break;
                                }
                                break;
                            default:
                                sq sqVar3 = sqVar;
                                sqVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    sqVar3.W1 = groupcallstreamrtmpurl2.url;
                                    sqVar3.X1 = groupcallstreamrtmpurl2.key;
                                    sqVar3.Y1 = new SpannableStringBuilder(sqVar3.X1);
                                    sqVar3.Z1.O(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final sq sqVar2 = this.b;
                final fi.d dVar2 = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.pq
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                sq sqVar22 = sqVar2;
                                sqVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    sqVar22.W1 = groupcallstreamrtmpurl.url;
                                    sqVar22.X1 = groupcallstreamrtmpurl.key;
                                    sqVar22.Y1 = new SpannableStringBuilder(sqVar22.X1);
                                    sqVar22.Z1.O(true);
                                    break;
                                }
                                break;
                            default:
                                sq sqVar3 = sqVar2;
                                sqVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    sqVar3.W1 = groupcallstreamrtmpurl2.url;
                                    sqVar3.X1 = groupcallstreamrtmpurl2.key;
                                    sqVar3.Y1 = new SpannableStringBuilder(sqVar3.X1);
                                    sqVar3.Z1.O(true);
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
