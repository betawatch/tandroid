package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ zz b;

    public /* synthetic */ nz(zz zzVar, int i10) {
        this.a = i10;
        this.b = zzVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final zz zzVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                zz zzVar2 = zzVar;
                                zzVar2.C = 0;
                                if (tL_error == null) {
                                    l.d.v(R.string.FilterInviteNameEdited, org.telegram.ui.Components.qc.a0(zzVar2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                zz.U(zzVar, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final zz zzVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                zz zzVar22 = zzVar2;
                                zzVar22.C = 0;
                                if (tL_error == null) {
                                    l.d.v(R.string.FilterInviteNameEdited, org.telegram.ui.Components.qc.a0(zzVar22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                zz.U(zzVar2, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
