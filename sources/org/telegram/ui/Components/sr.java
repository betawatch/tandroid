package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ xr b;
    public final /* synthetic */ ei.d c;

    public /* synthetic */ sr(xr xrVar, ei.d dVar, int i10) {
        this.a = i10;
        this.b = xrVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final xr xrVar = this.b;
                final ei.d dVar = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.tr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                xr xrVar2 = xrVar;
                                xrVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    xrVar2.b0 = groupcallstreamrtmpurl.url;
                                    xrVar2.c0 = groupcallstreamrtmpurl.key;
                                    xrVar2.d0 = new SpannableStringBuilder(xrVar2.c0);
                                    xrVar2.e0.N(true);
                                    break;
                                }
                                break;
                            default:
                                xr xrVar3 = xrVar;
                                xrVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    xrVar3.b0 = groupcallstreamrtmpurl2.url;
                                    xrVar3.c0 = groupcallstreamrtmpurl2.key;
                                    xrVar3.d0 = new SpannableStringBuilder(xrVar3.c0);
                                    xrVar3.e0.N(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final xr xrVar2 = this.b;
                final ei.d dVar2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.tr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                xr xrVar22 = xrVar2;
                                xrVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    xrVar22.b0 = groupcallstreamrtmpurl.url;
                                    xrVar22.c0 = groupcallstreamrtmpurl.key;
                                    xrVar22.d0 = new SpannableStringBuilder(xrVar22.c0);
                                    xrVar22.e0.N(true);
                                    break;
                                }
                                break;
                            default:
                                xr xrVar3 = xrVar2;
                                xrVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    xrVar3.b0 = groupcallstreamrtmpurl2.url;
                                    xrVar3.c0 = groupcallstreamrtmpurl2.key;
                                    xrVar3.d0 = new SpannableStringBuilder(xrVar3.c0);
                                    xrVar3.e0.N(true);
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
