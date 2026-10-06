package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr b;
    public final /* synthetic */ ci.d c;

    public /* synthetic */ kr(pr prVar, ci.d dVar, int i10) {
        this.a = i10;
        this.b = prVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final pr prVar = this.b;
                final ci.d dVar = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.lr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                pr prVar2 = prVar;
                                prVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    prVar2.b0 = groupcallstreamrtmpurl.url;
                                    prVar2.c0 = groupcallstreamrtmpurl.key;
                                    prVar2.d0 = new SpannableStringBuilder(prVar2.c0);
                                    prVar2.e0.N(true);
                                    break;
                                }
                                break;
                            default:
                                pr prVar3 = prVar;
                                prVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    prVar3.b0 = groupcallstreamrtmpurl2.url;
                                    prVar3.c0 = groupcallstreamrtmpurl2.key;
                                    prVar3.d0 = new SpannableStringBuilder(prVar3.c0);
                                    prVar3.e0.N(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final pr prVar2 = this.b;
                final ci.d dVar2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.lr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                pr prVar22 = prVar2;
                                prVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    prVar22.b0 = groupcallstreamrtmpurl.url;
                                    prVar22.c0 = groupcallstreamrtmpurl.key;
                                    prVar22.d0 = new SpannableStringBuilder(prVar22.c0);
                                    prVar22.e0.N(true);
                                    break;
                                }
                                break;
                            default:
                                pr prVar3 = prVar2;
                                prVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    prVar3.b0 = groupcallstreamrtmpurl2.url;
                                    prVar3.c0 = groupcallstreamrtmpurl2.key;
                                    prVar3.d0 = new SpannableStringBuilder(prVar3.c0);
                                    prVar3.e0.N(true);
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
