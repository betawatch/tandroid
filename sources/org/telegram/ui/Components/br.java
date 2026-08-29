package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class br implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ fr b;
    public final /* synthetic */ nh.d c;

    public /* synthetic */ br(fr frVar, nh.d dVar, int i10) {
        this.a = i10;
        this.b = frVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final fr frVar = this.b;
                final nh.d dVar = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.cr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                fr frVar2 = frVar;
                                frVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    frVar2.X = groupcallstreamrtmpurl.url;
                                    frVar2.Y = groupcallstreamrtmpurl.key;
                                    frVar2.Z = new SpannableStringBuilder(frVar2.Y);
                                    frVar2.a0.N(true);
                                    break;
                                }
                                break;
                            default:
                                fr frVar3 = frVar;
                                frVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    frVar3.X = groupcallstreamrtmpurl2.url;
                                    frVar3.Y = groupcallstreamrtmpurl2.key;
                                    frVar3.Z = new SpannableStringBuilder(frVar3.Y);
                                    frVar3.a0.N(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final fr frVar2 = this.b;
                final nh.d dVar2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.cr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                fr frVar22 = frVar2;
                                frVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    frVar22.X = groupcallstreamrtmpurl.url;
                                    frVar22.Y = groupcallstreamrtmpurl.key;
                                    frVar22.Z = new SpannableStringBuilder(frVar22.Y);
                                    frVar22.a0.N(true);
                                    break;
                                }
                                break;
                            default:
                                fr frVar3 = frVar2;
                                frVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    frVar3.X = groupcallstreamrtmpurl2.url;
                                    frVar3.Y = groupcallstreamrtmpurl2.key;
                                    frVar3.Z = new SpannableStringBuilder(frVar3.Y);
                                    frVar3.a0.N(true);
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
