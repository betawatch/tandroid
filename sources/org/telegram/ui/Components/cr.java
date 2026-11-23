package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class cr implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ gr b;
    public final /* synthetic */ hi.e c;

    public /* synthetic */ cr(gr grVar, hi.e eVar, int i7) {
        this.a = i7;
        this.b = grVar;
        this.c = eVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final gr grVar = this.b;
                final hi.e eVar = this.c;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.Components.dr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                gr grVar2 = grVar;
                                grVar2.getClass();
                                eVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    grVar2.X1 = groupcallstreamrtmpurl.url;
                                    grVar2.Y1 = groupcallstreamrtmpurl.key;
                                    grVar2.Z1 = new SpannableStringBuilder(grVar2.Y1);
                                    grVar2.a2.O(true);
                                    break;
                                }
                                break;
                            default:
                                gr grVar3 = grVar;
                                grVar3.getClass();
                                eVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    grVar3.X1 = groupcallstreamrtmpurl2.url;
                                    grVar3.Y1 = groupcallstreamrtmpurl2.key;
                                    grVar3.Z1 = new SpannableStringBuilder(grVar3.Y1);
                                    grVar3.a2.O(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final gr grVar2 = this.b;
                final hi.e eVar2 = this.c;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.Components.dr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                gr grVar22 = grVar2;
                                grVar22.getClass();
                                eVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    grVar22.X1 = groupcallstreamrtmpurl.url;
                                    grVar22.Y1 = groupcallstreamrtmpurl.key;
                                    grVar22.Z1 = new SpannableStringBuilder(grVar22.Y1);
                                    grVar22.a2.O(true);
                                    break;
                                }
                                break;
                            default:
                                gr grVar3 = grVar2;
                                grVar3.getClass();
                                eVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    grVar3.X1 = groupcallstreamrtmpurl2.url;
                                    grVar3.Y1 = groupcallstreamrtmpurl2.key;
                                    grVar3.Z1 = new SpannableStringBuilder(grVar3.Y1);
                                    grVar3.a2.O(true);
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
