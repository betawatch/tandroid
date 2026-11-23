package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ jr b;
    public final /* synthetic */ hi.e c;

    public /* synthetic */ fr(jr jrVar, hi.e eVar, int i7) {
        this.a = i7;
        this.b = jrVar;
        this.c = eVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final jr jrVar = this.b;
                final hi.e eVar = this.c;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.Components.gr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                jr jrVar2 = jrVar;
                                jrVar2.getClass();
                                eVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    jrVar2.X1 = groupcallstreamrtmpurl.url;
                                    jrVar2.Y1 = groupcallstreamrtmpurl.key;
                                    jrVar2.Z1 = new SpannableStringBuilder(jrVar2.Y1);
                                    jrVar2.a2.O(true);
                                    break;
                                }
                                break;
                            default:
                                jr jrVar3 = jrVar;
                                jrVar3.getClass();
                                eVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    jrVar3.X1 = groupcallstreamrtmpurl2.url;
                                    jrVar3.Y1 = groupcallstreamrtmpurl2.key;
                                    jrVar3.Z1 = new SpannableStringBuilder(jrVar3.Y1);
                                    jrVar3.a2.O(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final jr jrVar2 = this.b;
                final hi.e eVar2 = this.c;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.Components.gr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                jr jrVar22 = jrVar2;
                                jrVar22.getClass();
                                eVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    jrVar22.X1 = groupcallstreamrtmpurl.url;
                                    jrVar22.Y1 = groupcallstreamrtmpurl.key;
                                    jrVar22.Z1 = new SpannableStringBuilder(jrVar22.Y1);
                                    jrVar22.a2.O(true);
                                    break;
                                }
                                break;
                            default:
                                jr jrVar3 = jrVar2;
                                jrVar3.getClass();
                                eVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    jrVar3.X1 = groupcallstreamrtmpurl2.url;
                                    jrVar3.Y1 = groupcallstreamrtmpurl2.key;
                                    jrVar3.Z1 = new SpannableStringBuilder(jrVar3.Y1);
                                    jrVar3.a2.O(true);
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
