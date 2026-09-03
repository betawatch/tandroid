package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class er implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ir b;
    public final /* synthetic */ ph.d c;

    public /* synthetic */ er(ir irVar, ph.d dVar, int i10) {
        this.a = i10;
        this.b = irVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final ir irVar = this.b;
                final ph.d dVar = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.fr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ir irVar2 = irVar;
                                irVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    irVar2.Y = groupcallstreamrtmpurl.url;
                                    irVar2.Z = groupcallstreamrtmpurl.key;
                                    irVar2.a0 = new SpannableStringBuilder(irVar2.Z);
                                    irVar2.b0.N(true);
                                    break;
                                }
                                break;
                            default:
                                ir irVar3 = irVar;
                                irVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    irVar3.Y = groupcallstreamrtmpurl2.url;
                                    irVar3.Z = groupcallstreamrtmpurl2.key;
                                    irVar3.a0 = new SpannableStringBuilder(irVar3.Z);
                                    irVar3.b0.N(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final ir irVar2 = this.b;
                final ph.d dVar2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.fr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ir irVar22 = irVar2;
                                irVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    irVar22.Y = groupcallstreamrtmpurl.url;
                                    irVar22.Z = groupcallstreamrtmpurl.key;
                                    irVar22.a0 = new SpannableStringBuilder(irVar22.Z);
                                    irVar22.b0.N(true);
                                    break;
                                }
                                break;
                            default:
                                ir irVar3 = irVar2;
                                irVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    irVar3.Y = groupcallstreamrtmpurl2.url;
                                    irVar3.Z = groupcallstreamrtmpurl2.key;
                                    irVar3.a0 = new SpannableStringBuilder(irVar3.Z);
                                    irVar3.b0.N(true);
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
