package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class nr implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ sr b;
    public final /* synthetic */ bi.d c;

    public /* synthetic */ nr(sr srVar, bi.d dVar, int i10) {
        this.a = i10;
        this.b = srVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final sr srVar = this.b;
                final bi.d dVar = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.or
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                sr srVar2 = srVar;
                                srVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    srVar2.b0 = groupcallstreamrtmpurl.url;
                                    srVar2.c0 = groupcallstreamrtmpurl.key;
                                    srVar2.d0 = new SpannableStringBuilder(srVar2.c0);
                                    srVar2.e0.N(true);
                                    break;
                                }
                                break;
                            default:
                                sr srVar3 = srVar;
                                srVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    srVar3.b0 = groupcallstreamrtmpurl2.url;
                                    srVar3.c0 = groupcallstreamrtmpurl2.key;
                                    srVar3.d0 = new SpannableStringBuilder(srVar3.c0);
                                    srVar3.e0.N(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final sr srVar2 = this.b;
                final bi.d dVar2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.or
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                sr srVar22 = srVar2;
                                srVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    srVar22.b0 = groupcallstreamrtmpurl.url;
                                    srVar22.c0 = groupcallstreamrtmpurl.key;
                                    srVar22.d0 = new SpannableStringBuilder(srVar22.c0);
                                    srVar22.e0.N(true);
                                    break;
                                }
                                break;
                            default:
                                sr srVar3 = srVar2;
                                srVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    srVar3.b0 = groupcallstreamrtmpurl2.url;
                                    srVar3.c0 = groupcallstreamrtmpurl2.key;
                                    srVar3.d0 = new SpannableStringBuilder(srVar3.c0);
                                    srVar3.e0.N(true);
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
