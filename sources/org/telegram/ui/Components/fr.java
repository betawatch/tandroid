package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ jr b;
    public final /* synthetic */ ph.d c;

    public /* synthetic */ fr(jr jrVar, ph.d dVar, int i10) {
        this.a = i10;
        this.b = jrVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final jr jrVar = this.b;
                final ph.d dVar = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.gr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                jr jrVar2 = jrVar;
                                jrVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    jrVar2.Y = groupcallstreamrtmpurl.url;
                                    jrVar2.Z = groupcallstreamrtmpurl.key;
                                    jrVar2.a0 = new SpannableStringBuilder(jrVar2.Z);
                                    jrVar2.b0.N(true);
                                    break;
                                }
                                break;
                            default:
                                jr jrVar3 = jrVar;
                                jrVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    jrVar3.Y = groupcallstreamrtmpurl2.url;
                                    jrVar3.Z = groupcallstreamrtmpurl2.key;
                                    jrVar3.a0 = new SpannableStringBuilder(jrVar3.Z);
                                    jrVar3.b0.N(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final jr jrVar2 = this.b;
                final ph.d dVar2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.gr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                jr jrVar22 = jrVar2;
                                jrVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    jrVar22.Y = groupcallstreamrtmpurl.url;
                                    jrVar22.Z = groupcallstreamrtmpurl.key;
                                    jrVar22.a0 = new SpannableStringBuilder(jrVar22.Z);
                                    jrVar22.b0.N(true);
                                    break;
                                }
                                break;
                            default:
                                jr jrVar3 = jrVar2;
                                jrVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    jrVar3.Y = groupcallstreamrtmpurl2.url;
                                    jrVar3.Z = groupcallstreamrtmpurl2.key;
                                    jrVar3.a0 = new SpannableStringBuilder(jrVar3.Z);
                                    jrVar3.b0.N(true);
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
