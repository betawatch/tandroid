package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xr implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds b;
    public final /* synthetic */ ci.d c;

    public /* synthetic */ xr(ds dsVar, ci.d dVar, int i10) {
        this.a = i10;
        this.b = dsVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final ds dsVar = this.b;
                final ci.d dVar = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.yr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ds dsVar2 = dsVar;
                                dsVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    dsVar2.b0 = groupcallstreamrtmpurl.url;
                                    dsVar2.c0 = groupcallstreamrtmpurl.key;
                                    dsVar2.d0 = new SpannableStringBuilder(dsVar2.c0);
                                    dsVar2.e0.N(true);
                                    break;
                                }
                                break;
                            default:
                                ds dsVar3 = dsVar;
                                dsVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    dsVar3.b0 = groupcallstreamrtmpurl2.url;
                                    dsVar3.c0 = groupcallstreamrtmpurl2.key;
                                    dsVar3.d0 = new SpannableStringBuilder(dsVar3.c0);
                                    dsVar3.e0.N(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final ds dsVar2 = this.b;
                final ci.d dVar2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.yr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ds dsVar22 = dsVar2;
                                dsVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    dsVar22.b0 = groupcallstreamrtmpurl.url;
                                    dsVar22.c0 = groupcallstreamrtmpurl.key;
                                    dsVar22.d0 = new SpannableStringBuilder(dsVar22.c0);
                                    dsVar22.e0.N(true);
                                    break;
                                }
                                break;
                            default:
                                ds dsVar3 = dsVar2;
                                dsVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    dsVar3.b0 = groupcallstreamrtmpurl2.url;
                                    dsVar3.c0 = groupcallstreamrtmpurl2.key;
                                    dsVar3.d0 = new SpannableStringBuilder(dsVar3.c0);
                                    dsVar3.e0.N(true);
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
