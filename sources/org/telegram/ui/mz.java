package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ yz b;

    public /* synthetic */ mz(yz yzVar, int i10) {
        this.a = i10;
        this.b = yzVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final yz yzVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.lz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                yz yzVar2 = yzVar;
                                yzVar2.C = 0;
                                if (tL_error == null) {
                                    kh.a2.v(R.string.FilterInviteNameEdited, org.telegram.ui.Components.qc.a0(yzVar2), R.raw.contact_check, 36);
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
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.lz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                yz yzVar22 = yzVar2;
                                yzVar22.C = 0;
                                if (tL_error == null) {
                                    kh.a2.v(R.string.FilterInviteNameEdited, org.telegram.ui.Components.qc.a0(yzVar22), R.raw.contact_check, 36);
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
