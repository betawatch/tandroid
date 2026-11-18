package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class dr implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hr b;
    public final /* synthetic */ hi.d c;

    public /* synthetic */ dr(hr hrVar, hi.d dVar, int i7) {
        this.a = i7;
        this.b = hrVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final hr hrVar = this.b;
                final hi.d dVar = this.c;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.Components.er
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                hr hrVar2 = hrVar;
                                hrVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    hrVar2.X1 = groupcallstreamrtmpurl.url;
                                    hrVar2.Y1 = groupcallstreamrtmpurl.key;
                                    hrVar2.Z1 = new SpannableStringBuilder(hrVar2.Y1);
                                    hrVar2.a2.O(true);
                                    break;
                                }
                                break;
                            default:
                                hr hrVar3 = hrVar;
                                hrVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    hrVar3.X1 = groupcallstreamrtmpurl2.url;
                                    hrVar3.Y1 = groupcallstreamrtmpurl2.key;
                                    hrVar3.Z1 = new SpannableStringBuilder(hrVar3.Y1);
                                    hrVar3.a2.O(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final hr hrVar2 = this.b;
                final hi.d dVar2 = this.c;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.Components.er
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                hr hrVar22 = hrVar2;
                                hrVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    hrVar22.X1 = groupcallstreamrtmpurl.url;
                                    hrVar22.Y1 = groupcallstreamrtmpurl.key;
                                    hrVar22.Z1 = new SpannableStringBuilder(hrVar22.Y1);
                                    hrVar22.a2.O(true);
                                    break;
                                }
                                break;
                            default:
                                hr hrVar3 = hrVar2;
                                hrVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    hrVar3.X1 = groupcallstreamrtmpurl2.url;
                                    hrVar3.Y1 = groupcallstreamrtmpurl2.key;
                                    hrVar3.Z1 = new SpannableStringBuilder(hrVar3.Y1);
                                    hrVar3.a2.O(true);
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
