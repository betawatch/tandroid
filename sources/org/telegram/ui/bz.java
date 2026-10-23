package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz b;

    public /* synthetic */ bz(oz ozVar, int i10) {
        this.a = i10;
        this.b = ozVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final oz ozVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.az
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                oz ozVar2 = ozVar;
                                ozVar2.G = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.v0.p(R.string.FilterInviteNameEdited, org.telegram.ui.Components.xc.a0(ozVar2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                oz.U(ozVar, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final oz ozVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.az
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                oz ozVar22 = ozVar2;
                                ozVar22.G = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.v0.p(R.string.FilterInviteNameEdited, org.telegram.ui.Components.xc.a0(ozVar22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                oz.U(ozVar2, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
