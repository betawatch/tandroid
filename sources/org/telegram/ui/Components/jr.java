package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class jr implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ or b;
    public final /* synthetic */ ci.d c;

    public /* synthetic */ jr(or orVar, ci.d dVar, int i10) {
        this.a = i10;
        this.b = orVar;
        this.c = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final or orVar = this.b;
                final ci.d dVar = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.kr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                or orVar2 = orVar;
                                orVar2.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    orVar2.b0 = groupcallstreamrtmpurl.url;
                                    orVar2.c0 = groupcallstreamrtmpurl.key;
                                    orVar2.d0 = new SpannableStringBuilder(orVar2.c0);
                                    orVar2.e0.N(true);
                                    break;
                                }
                                break;
                            default:
                                or orVar3 = orVar;
                                orVar3.getClass();
                                dVar.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    orVar3.b0 = groupcallstreamrtmpurl2.url;
                                    orVar3.c0 = groupcallstreamrtmpurl2.key;
                                    orVar3.d0 = new SpannableStringBuilder(orVar3.c0);
                                    orVar3.e0.N(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final or orVar2 = this.b;
                final ci.d dVar2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.kr
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                or orVar22 = orVar2;
                                orVar22.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    orVar22.b0 = groupcallstreamrtmpurl.url;
                                    orVar22.c0 = groupcallstreamrtmpurl.key;
                                    orVar22.d0 = new SpannableStringBuilder(orVar22.c0);
                                    orVar22.e0.N(true);
                                    break;
                                }
                                break;
                            default:
                                or orVar3 = orVar2;
                                orVar3.getClass();
                                dVar2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    orVar3.b0 = groupcallstreamrtmpurl2.url;
                                    orVar3.c0 = groupcallstreamrtmpurl2.key;
                                    orVar3.d0 = new SpannableStringBuilder(orVar3.c0);
                                    orVar3.e0.N(true);
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
