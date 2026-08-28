package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xq implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ cr b;
    public final /* synthetic */ kh.d c;

    public /* synthetic */ xq(cr crVar, kh.d dVar, int i9) {
        this.a = i9;
        this.b = crVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i9 = 0;
                final cr crVar = this.b;
                final kh.d dVar = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.yq
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                cr crVar2 = crVar;
                                crVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    crVar2.X = groupcallstreamrtmpurl.url;
                                    crVar2.Y = groupcallstreamrtmpurl.key;
                                    crVar2.Z = new SpannableStringBuilder(crVar2.Y);
                                    crVar2.a0.N(true);
                                    break;
                                }
                                break;
                            default:
                                cr crVar3 = crVar;
                                crVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    crVar3.X = groupcallstreamrtmpurl2.url;
                                    crVar3.Y = groupcallstreamrtmpurl2.key;
                                    crVar3.Z = new SpannableStringBuilder(crVar3.Y);
                                    crVar3.a0.N(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final cr crVar2 = this.b;
                final kh.d dVar2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.yq
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                cr crVar22 = crVar2;
                                crVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    crVar22.X = groupcallstreamrtmpurl.url;
                                    crVar22.Y = groupcallstreamrtmpurl.key;
                                    crVar22.Z = new SpannableStringBuilder(crVar22.Y);
                                    crVar22.a0.N(true);
                                    break;
                                }
                                break;
                            default:
                                cr crVar3 = crVar2;
                                crVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    crVar3.X = groupcallstreamrtmpurl2.url;
                                    crVar3.Y = groupcallstreamrtmpurl2.key;
                                    crVar3.Z = new SpannableStringBuilder(crVar3.Y);
                                    crVar3.a0.N(true);
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
