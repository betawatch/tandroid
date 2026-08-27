package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vq implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ar b;
    public final /* synthetic */ lh.d c;

    public /* synthetic */ vq(ar arVar, lh.d dVar, int i10) {
        this.a = i10;
        this.b = arVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final ar arVar = this.b;
                final lh.d dVar = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.wq
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ar arVar2 = arVar;
                                arVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    arVar2.X = groupcallstreamrtmpurl.url;
                                    arVar2.Y = groupcallstreamrtmpurl.key;
                                    arVar2.Z = new SpannableStringBuilder(arVar2.Y);
                                    arVar2.a0.N(true);
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
                                    arVar3.X = groupcallstreamrtmpurl2.url;
                                    arVar3.Y = groupcallstreamrtmpurl2.key;
                                    arVar3.Z = new SpannableStringBuilder(arVar3.Y);
                                    arVar3.a0.N(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final ar arVar2 = this.b;
                final lh.d dVar2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.wq
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ar arVar22 = arVar2;
                                arVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    arVar22.X = groupcallstreamrtmpurl.url;
                                    arVar22.Y = groupcallstreamrtmpurl.key;
                                    arVar22.Z = new SpannableStringBuilder(arVar22.Y);
                                    arVar22.a0.N(true);
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
                                    arVar3.X = groupcallstreamrtmpurl2.url;
                                    arVar3.Y = groupcallstreamrtmpurl2.key;
                                    arVar3.Z = new SpannableStringBuilder(arVar3.Y);
                                    arVar3.a0.N(true);
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
