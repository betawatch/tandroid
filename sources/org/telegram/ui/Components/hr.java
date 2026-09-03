package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr b;
    public final /* synthetic */ qh.d c;

    public /* synthetic */ hr(lr lrVar, qh.d dVar, int i10) {
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
                final qh.d dVar = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ir
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
                                    lrVar2.Y = groupcallstreamrtmpurl.url;
                                    lrVar2.Z = groupcallstreamrtmpurl.key;
                                    lrVar2.a0 = new SpannableStringBuilder(lrVar2.Z);
                                    lrVar2.b0.N(true);
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
                                    lrVar3.Y = groupcallstreamrtmpurl2.url;
                                    lrVar3.Z = groupcallstreamrtmpurl2.key;
                                    lrVar3.a0 = new SpannableStringBuilder(lrVar3.Z);
                                    lrVar3.b0.N(true);
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
                final qh.d dVar2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ir
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
                                    lrVar22.Y = groupcallstreamrtmpurl.url;
                                    lrVar22.Z = groupcallstreamrtmpurl.key;
                                    lrVar22.a0 = new SpannableStringBuilder(lrVar22.Z);
                                    lrVar22.b0.N(true);
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
                                    lrVar3.Y = groupcallstreamrtmpurl2.url;
                                    lrVar3.Z = groupcallstreamrtmpurl2.key;
                                    lrVar3.a0 = new SpannableStringBuilder(lrVar3.Z);
                                    lrVar3.b0.N(true);
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
