package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ur implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ zr b;
    public final /* synthetic */ fi.d c;

    public /* synthetic */ ur(zr zrVar, fi.d dVar, int i10) {
        this.a = i10;
        this.b = zrVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final zr zrVar = this.b;
                final fi.d dVar = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.vr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                zr zrVar2 = zrVar;
                                zrVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    zrVar2.b0 = groupcallstreamrtmpurl.url;
                                    zrVar2.c0 = groupcallstreamrtmpurl.key;
                                    zrVar2.d0 = new SpannableStringBuilder(zrVar2.c0);
                                    zrVar2.e0.O(true);
                                    break;
                                }
                                break;
                            default:
                                zr zrVar3 = zrVar;
                                zrVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    zrVar3.b0 = groupcallstreamrtmpurl2.url;
                                    zrVar3.c0 = groupcallstreamrtmpurl2.key;
                                    zrVar3.d0 = new SpannableStringBuilder(zrVar3.c0);
                                    zrVar3.e0.O(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final zr zrVar2 = this.b;
                final fi.d dVar2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.vr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                zr zrVar22 = zrVar2;
                                zrVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    zrVar22.b0 = groupcallstreamrtmpurl.url;
                                    zrVar22.c0 = groupcallstreamrtmpurl.key;
                                    zrVar22.d0 = new SpannableStringBuilder(zrVar22.c0);
                                    zrVar22.e0.O(true);
                                    break;
                                }
                                break;
                            default:
                                zr zrVar3 = zrVar2;
                                zrVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    zrVar3.b0 = groupcallstreamrtmpurl2.url;
                                    zrVar3.c0 = groupcallstreamrtmpurl2.key;
                                    zrVar3.d0 = new SpannableStringBuilder(zrVar3.c0);
                                    zrVar3.e0.O(true);
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
