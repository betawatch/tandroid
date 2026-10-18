package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ nz b;

    public /* synthetic */ bz(nz nzVar, int i10) {
        this.a = i10;
        this.b = nzVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final nz nzVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.az
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                nz nzVar2 = nzVar;
                                nzVar2.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.g0.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.xc.a0(nzVar2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                nz.U(nzVar, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final nz nzVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.az
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                nz nzVar22 = nzVar2;
                                nzVar22.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.g0.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.xc.a0(nzVar22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                nz.U(nzVar2, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
