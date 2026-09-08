package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class gr implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr b;
    public final /* synthetic */ di.d c;

    public /* synthetic */ gr(lr lrVar, di.d dVar, int i10) {
        this.a = i10;
        this.b = lrVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final lr lrVar = this.b;
                final di.d dVar = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.hr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                lr lrVar2 = lrVar;
                                lrVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    lrVar2.b0 = groupcallstreamrtmpurl.url;
                                    lrVar2.c0 = groupcallstreamrtmpurl.key;
                                    lrVar2.d0 = new SpannableStringBuilder(lrVar2.c0);
                                    lrVar2.e0.N(true);
                                    break;
                                }
                                break;
                            default:
                                lr lrVar3 = lrVar;
                                lrVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    lrVar3.b0 = groupcallstreamrtmpurl2.url;
                                    lrVar3.c0 = groupcallstreamrtmpurl2.key;
                                    lrVar3.d0 = new SpannableStringBuilder(lrVar3.c0);
                                    lrVar3.e0.N(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final lr lrVar2 = this.b;
                final di.d dVar2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.hr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                lr lrVar22 = lrVar2;
                                lrVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    lrVar22.b0 = groupcallstreamrtmpurl.url;
                                    lrVar22.c0 = groupcallstreamrtmpurl.key;
                                    lrVar22.d0 = new SpannableStringBuilder(lrVar22.c0);
                                    lrVar22.e0.N(true);
                                    break;
                                }
                                break;
                            default:
                                lr lrVar3 = lrVar2;
                                lrVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    lrVar3.b0 = groupcallstreamrtmpurl2.url;
                                    lrVar3.c0 = groupcallstreamrtmpurl2.key;
                                    lrVar3.d0 = new SpannableStringBuilder(lrVar3.c0);
                                    lrVar3.e0.N(true);
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
