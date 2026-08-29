package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ nz b;

    public /* synthetic */ cz(nz nzVar, int i10) {
        this.a = i10;
        this.b = nzVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final nz nzVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.bz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                nz nzVar2 = nzVar;
                                nzVar2.B = 0;
                                if (tL_error == null) {
                                    j7.l1.v(R.string.FilterInviteNameEdited, org.telegram.ui.Components.tc.a0(nzVar2), R.raw.contact_check, 36);
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
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.bz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                nz nzVar22 = nzVar2;
                                nzVar22.B = 0;
                                if (tL_error == null) {
                                    j7.l1.v(R.string.FilterInviteNameEdited, org.telegram.ui.Components.tc.a0(nzVar22), R.raw.contact_check, 36);
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
