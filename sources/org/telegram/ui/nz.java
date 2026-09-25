package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ yz b;

    public /* synthetic */ nz(yz yzVar, int i10) {
        this.a = i10;
        this.b = yzVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final yz yzVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                yz yzVar2 = yzVar;
                                yzVar2.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.f0.p(R.string.FilterInviteNameEdited, org.telegram.ui.Components.xc.a0(yzVar2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                yz.U(yzVar, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final yz yzVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                yz yzVar22 = yzVar2;
                                yzVar22.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.f0.p(R.string.FilterInviteNameEdited, org.telegram.ui.Components.xc.a0(yzVar22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                yz.U(yzVar2, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
