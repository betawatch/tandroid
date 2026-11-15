package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class wq implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ar b;
    public final /* synthetic */ hi.d c;

    public /* synthetic */ wq(ar arVar, hi.d dVar, int i7) {
        this.a = i7;
        this.b = arVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final ar arVar = this.b;
                final hi.d dVar = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.xq
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                ar arVar2 = arVar;
                                arVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    arVar2.X1 = groupcallstreamrtmpurl.url;
                                    arVar2.Y1 = groupcallstreamrtmpurl.key;
                                    arVar2.Z1 = new SpannableStringBuilder(arVar2.Y1);
                                    arVar2.a2.O(true);
                                    break;
                                }
                                break;
                            default:
                                ar arVar3 = arVar;
                                arVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    arVar3.X1 = groupcallstreamrtmpurl2.url;
                                    arVar3.Y1 = groupcallstreamrtmpurl2.key;
                                    arVar3.Z1 = new SpannableStringBuilder(arVar3.Y1);
                                    arVar3.a2.O(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final ar arVar2 = this.b;
                final hi.d dVar2 = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.xq
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ar arVar22 = arVar2;
                                arVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    arVar22.X1 = groupcallstreamrtmpurl.url;
                                    arVar22.Y1 = groupcallstreamrtmpurl.key;
                                    arVar22.Z1 = new SpannableStringBuilder(arVar22.Y1);
                                    arVar22.a2.O(true);
                                    break;
                                }
                                break;
                            default:
                                ar arVar3 = arVar2;
                                arVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    arVar3.X1 = groupcallstreamrtmpurl2.url;
                                    arVar3.Y1 = groupcallstreamrtmpurl2.key;
                                    arVar3.Z1 = new SpannableStringBuilder(arVar3.Y1);
                                    arVar3.a2.O(true);
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
