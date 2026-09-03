package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ a00 b;

    public /* synthetic */ oz(a00 a00Var, int i10) {
        this.a = i10;
        this.b = a00Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final a00 a00Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.nz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                a00 a00Var2 = a00Var;
                                a00Var2.C = 0;
                                if (tL_error == null) {
                                    kf.k0.v(R.string.FilterInviteNameEdited, org.telegram.ui.Components.qc.a0(a00Var2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                a00.U(a00Var, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final a00 a00Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.nz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                a00 a00Var22 = a00Var2;
                                a00Var22.C = 0;
                                if (tL_error == null) {
                                    kf.k0.v(R.string.FilterInviteNameEdited, org.telegram.ui.Components.qc.a0(a00Var22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                a00.U(a00Var2, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
